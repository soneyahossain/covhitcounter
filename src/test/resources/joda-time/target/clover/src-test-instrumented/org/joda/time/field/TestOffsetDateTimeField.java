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
public class TestOffsetDateTimeField {static class __CLR4_4_11gbb1gbblgchossk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,68276,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11gbb1gbblgchossk.R.inc(67799);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67800);TestOffsetDateTimeField TB = new TestOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67801);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67802);TB.test_constructor1();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67803);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67804);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67805);TB.test_constructor2();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67806);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67807);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67808);TB.test_getType();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67809);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67810);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67811);TB.test_getName();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67812);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67813);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67814);TB.test_toString();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67815);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67816);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67817);TB.test_isSupported();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67818);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67819);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67820);TB.test_isLenient();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67821);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67822);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67823);TB.test_getOffset();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67824);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67825);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67826);TB.test_get();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67827);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67828);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67829);TB.test_getAsText_long_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67830);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67831);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67832);TB.test_getAsText_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67833);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67834);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67835);TB.test_getAsText_RP_int_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67836);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67837);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67838);TB.test_getAsText_RP_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67839);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67840);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67841);TB.test_getAsText_int_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67842);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67843);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67844);TB.test_getAsShortText_long_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67845);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67846);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67847);TB.test_getAsShortText_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67848);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67849);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67850);TB.test_getAsShortText_RP_int_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67851);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67852);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67853);TB.test_getAsShortText_RP_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67854);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67855);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67856);TB.test_getAsShortText_int_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67857);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67858);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67859);TB.test_add_long_int();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67860);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67861);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67862);TB.test_add_long_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67863);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67864);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67865);TB.test_add_RP_int_intarray_int();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67866);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67867);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67868);TB.test_addWrapField_long_int();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67869);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67870);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67871);TB.test_addWrapField_RP_int_intarray_int();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67872);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67873);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67874);TB.test_getDifference_long_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67875);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67876);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67877);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67878);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67879);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67880);TB.test_set_long_int();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67881);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67882);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67883);TB.test_set_RP_int_intarray_int();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67884);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67885);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67886);TB.test_set_long_String_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67887);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67888);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67889);TB.test_set_long_String();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67890);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67891);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67892);TB.test_set_RP_int_intarray_String_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67893);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67894);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67895);TB.test_convertText();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67896);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67897);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67898);TB.test_isLeap_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67899);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67900);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67901);TB.test_getLeapAmount_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67902);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67903);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67904);TB.test_getLeapDurationField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67905);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67906);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67907);TB.test_getMinimumValue();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67908);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67909);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67910);TB.test_getMinimumValue_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67911);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67912);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67913);TB.test_getMinimumValue_RP();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67914);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67915);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67916);TB.test_getMinimumValue_RP_intarray();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67917);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67918);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67919);TB.test_getMaximumValue();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67920);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67921);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67922);TB.test_getMaximumValue_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67923);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67924);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67925);TB.test_getMaximumValue_RP();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67926);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67927);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67928);TB.test_getMaximumValue_RP_intarray();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67929);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67930);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67931);TB.test_getMaximumTextLength_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67932);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67933);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67934);TB.test_getMaximumShortTextLength_Locale();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67935);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67936);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67937);TB.test_roundFloor_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67938);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67939);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67940);TB.test_roundCeiling_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67941);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67942);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67943);TB.test_roundHalfFloor_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67944);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67945);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67946);TB.test_roundHalfCeiling_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67947);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67948);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67949);TB.test_roundHalfEven_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67950);TB.tearDown();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67951);TB.setUp();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67952);TB.test_remainder_long();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67953);TB.tearDown();

    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestOffsetDateTimeField.class);
    }

    public TestOffsetDateTimeField(String name) {
        super(name);
    }
*/

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11gbb1gbblgchossk.R.inc(67954);
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11gbb1gbblgchossk.R.inc(67955);
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_constructor1() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgdulx1gfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgdulx1gfo(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67956);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67957);OffsetDateTimeField field = new OffsetDateTimeField(
                ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_11gbb1gbblgchossk.R.inc(67958);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
        __CLR4_4_11gbb1gbblgchossk.R.inc(67959);assertEquals(3, field.getOffset());

        __CLR4_4_11gbb1gbblgchossk.R.inc(67960);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(67961);field = new OffsetDateTimeField(null, 3);
            __CLR4_4_11gbb1gbblgchossk.R.inc(67962);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11gbb1gbblgchossk.R.inc(67963);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(67964);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), 0);
            __CLR4_4_11gbb1gbblgchossk.R.inc(67965);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11gbb1gbblgchossk.R.inc(67966);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(67967);field = new OffsetDateTimeField(UnsupportedDateTimeField.getInstance(
                    DateTimeFieldType.secondOfMinute(), UnsupportedDurationField.getInstance(DurationFieldType.seconds())), 0);
            __CLR4_4_11gbb1gbblgchossk.R.inc(67968);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_constructor2() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7dvtg1gg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_constructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7dvtg1gg1(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67969);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67970);OffsetDateTimeField field = new OffsetDateTimeField(
                ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 3
        );
        __CLR4_4_11gbb1gbblgchossk.R.inc(67971);assertEquals(DateTimeFieldType.secondOfDay(), field.getType());
        __CLR4_4_11gbb1gbblgchossk.R.inc(67972);assertEquals(3, field.getOffset());

        __CLR4_4_11gbb1gbblgchossk.R.inc(67973);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(67974);field = new OffsetDateTimeField(null, DateTimeFieldType.secondOfDay(), 3);
            __CLR4_4_11gbb1gbblgchossk.R.inc(67975);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11gbb1gbblgchossk.R.inc(67976);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(67977);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), null, 3);
            __CLR4_4_11gbb1gbblgchossk.R.inc(67978);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11gbb1gbblgchossk.R.inc(67979);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(67980);field = new OffsetDateTimeField(ISOChronology.getInstance().secondOfMinute(), DateTimeFieldType.secondOfDay(), 0);
            __CLR4_4_11gbb1gbblgchossk.R.inc(67981);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getType() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1gge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1gge(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67982);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67983);OffsetDateTimeField field = new OffsetDateTimeField(
                ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_11gbb1gbblgchossk.R.inc(67984);assertEquals(DateTimeFieldType.secondOfMinute(), field.getType());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51ggh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51ggh(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67985);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67986);OffsetDateTimeField field = new OffsetDateTimeField(
                ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_11gbb1gbblgchossk.R.inc(67987);assertEquals("secondOfMinute", field.getName());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01ggk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01ggk(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67988);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67989);OffsetDateTimeField field = new OffsetDateTimeField(
                ISOChronology.getInstance().secondOfMinute(), 3
        );
        __CLR4_4_11gbb1gbblgchossk.R.inc(67990);assertEquals("DateTimeField[secondOfMinute]", field.toString());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1ggn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1ggn(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67991);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67992);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67993);assertEquals(true, field.isSupported());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_isLenient() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljx0zd1ggq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljx0zd1ggq(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67994);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67995);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(67996);assertEquals(false, field.isLenient());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getOffset() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),67997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3bual1ggt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3bual1ggt(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(67997);
        __CLR4_4_11gbb1gbblgchossk.R.inc(67998);OffsetDateTimeField field = new OffsetDateTimeField(
                ISOChronology.getInstance().secondOfMinute(), 5
        );
        __CLR4_4_11gbb1gbblgchossk.R.inc(67999);assertEquals(5, field.getOffset());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_get() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17oeyeo1ggw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17oeyeo1ggw(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68000);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68001);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68002);assertEquals(0 + 3, field.get(0));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68003);assertEquals(6 + 3, field.get(6000));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsText_long_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdirgz1gh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdirgz1gh0(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68004);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68005);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68006);assertEquals("32", field.getAsText(1000L * 29, Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68007);assertEquals("32", field.getAsText(1000L * 29, null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsText_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3zd21gh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3zd21gh4(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68008);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68009);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68010);assertEquals("32", field.getAsText(1000L * 29));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_int_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuft1h1gh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuft1h1gh7(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68011);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68012);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68013);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68014);assertEquals("20", field.getAsText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsText_RP_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1ywid1ghb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1ywid1ghb(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68015);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68016);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68017);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68018);assertEquals("40", field.getAsText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsText_int_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd8ltk1ghf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd8ltk1ghf(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68019);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68020);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68021);assertEquals("80", field.getAsText(80, Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68022);assertEquals("80", field.getAsText(80, null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getAsShortText_long_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loiikt1ghj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loiikt1ghj(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68023);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68024);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68025);assertEquals("32", field.getAsShortText(1000L * 29, Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68026);assertEquals("32", field.getAsShortText(1000L * 29, null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121lqfg1ghn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121lqfg1ghn(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68027);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68028);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68029);assertEquals("32", field.getAsShortText(1000L * 29));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_int_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qtetb1ghq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_RP_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qtetb1ghq(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68030);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68031);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68032);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68033);assertEquals("20", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), 20, null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_RP_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxyb9r1ghu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_RP_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxyb9r1ghu(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68034);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68035);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68036);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68037);assertEquals("40", field.getAsShortText(new TimeOfDay(12, 30, 40, 50), null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getAsShortText_int_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ntvlq1ghy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getAsShortText_int_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ntvlq1ghy(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68038);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68039);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68040);assertEquals("80", field.getAsShortText(80, Locale.ENGLISH));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68041);assertEquals("80", field.getAsShortText(80, null));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1gi2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1gi2(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68042);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68043);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68044);assertEquals(1001, field.add(1L, 1));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1gi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1gi5(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68045);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68046);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68047);assertEquals(1001, field.add(1L, 1L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_add_RP_int_intarray_int() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e06spl1gi8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_add_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e06spl1gi8(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68048);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68049);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68050);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68051);OffsetDateTimeField field = new MockStandardDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68052);int[] result = field.add(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68053);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68054);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68055);expected = new int[]{10, 20, 31, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68056);result = field.add(new TimeOfDay(), 2, values, 1);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68057);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68058);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68059);expected = new int[]{10, 20, 62, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68060);result = field.add(new TimeOfDay(), 2, values, 32);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68061);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68062);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68063);expected = new int[]{10, 21, 3, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68064);result = field.add(new TimeOfDay(), 2, values, 33);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68065);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68066);values = new int[]{23, 59, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68067);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68068);field.add(new TimeOfDay(), 2, values, 33);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68069);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11gbb1gbblgchossk.R.inc(68070);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68071);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68072);result = field.add(new TimeOfDay(), 2, values, -1);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68073);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68074);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68075);expected = new int[]{10, 19, 59, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68076);result = field.add(new TimeOfDay(), 2, values, -31);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68077);assertEquals(true, Arrays.equals(expected, result));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68078);values = new int[]{0, 0, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68079);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68080);field.add(new TimeOfDay(), 2, values, -31);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68081);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_addWrapField_long_int() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdicdy1gj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdicdy1gj6(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68082);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68083);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68084);assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68085);assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68086);assertEquals(0L, field.addWrapField(1000L * 29, 31));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_addWrapField_RP_int_intarray_int() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdx7z1gjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_addWrapField_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdx7z1gjb(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68087);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68088);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68089);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68090);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68091);int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68092);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68093);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68094);expected = new int[]{10, 20, 59, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68095);result = field.addWrapField(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68096);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68097);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68098);expected = new int[]{10, 20, 3, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68099);result = field.addWrapField(new TimeOfDay(), 2, values, 33);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68100);assertEquals(true, Arrays.equals(result, expected));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fh4q51gjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getDifference_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fh4q51gjp(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68101);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68102);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68103);assertEquals(-21, field.getDifference(20000L, 41000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571gjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571gjs(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68104);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68105);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68106);assertEquals(-21L, field.getDifferenceAsLong(20000L, 41000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_set_long_int() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rinawz1gjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rinawz1gjv(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68107);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68108);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68109);assertEquals(3120L, field.set(2120L, 6));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68110);assertEquals(26120L, field.set(120L, 29));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68111);assertEquals(57120L, field.set(2120L, 60));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_int() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c085k1gk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_RP_int_intarray_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c085k1gk0(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68112);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68113);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68114);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68115);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68116);int[] result = field.set(new TimeOfDay(), 2, values, 30);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68117);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68118);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68119);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68120);result = field.set(new TimeOfDay(), 2, values, 29);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68121);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68122);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68123);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68124);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68125);field.set(new TimeOfDay(), 2, values, 63);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68126);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gbb1gbblgchossk.R.inc(68127);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68128);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68129);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68130);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68131);field.set(new TimeOfDay(), 2, values, 2);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68132);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gbb1gbblgchossk.R.inc(68133);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_set_long_String_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1481lrq1gkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_long_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1481lrq1gkm(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68134);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68135);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68136);assertEquals(3050L, field.set(50L, "6", null));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68137);assertEquals(26050L, field.set(50L, "29", Locale.ENGLISH));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_set_long_String() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o1z691gkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_long_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o1z691gkq(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68138);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68139);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68140);assertEquals(3050L, field.set(50L, "6"));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68141);assertEquals(26050L, field.set(50L, "29"));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_set_RP_int_intarray_String_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j885c11gku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_set_RP_int_intarray_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j885c11gku(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68142);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68143);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68144);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68145);int[] expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68146);int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68147);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68148);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68149);expected = new int[]{10, 20, 29, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68150);result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68151);assertEquals(true, Arrays.equals(result, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68152);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68153);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68154);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68155);field.set(new TimeOfDay(), 2, values, "63", null);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68156);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gbb1gbblgchossk.R.inc(68157);assertEquals(true, Arrays.equals(values, expected));

        __CLR4_4_11gbb1gbblgchossk.R.inc(68158);values = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68159);expected = new int[]{10, 20, 30, 40};
        __CLR4_4_11gbb1gbblgchossk.R.inc(68160);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68161);field.set(new TimeOfDay(), 2, values, "2", null);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68162);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gbb1gbblgchossk.R.inc(68163);assertEquals(true, Arrays.equals(values, expected));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_convertText() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qj2ptm1glg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_convertText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qj2ptm1glg(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68164);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68165);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68166);assertEquals(0, field.convertText("0", null));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68167);assertEquals(29, field.convertText("29", null));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68168);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68169);field.convertText("2A", null);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68170);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11gbb1gbblgchossk.R.inc(68171);try {
            __CLR4_4_11gbb1gbblgchossk.R.inc(68172);field.convertText(null, null);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68173);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    @Test
    public void test_isLeap_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yu5r3x1glq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_isLeap_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yu5r3x1glq(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68174);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68175);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68176);assertEquals(false, field.isLeap(0L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getLeapAmount_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4dic91glt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapAmount_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4dic91glt(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68177);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68178);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68179);assertEquals(0, field.getLeapAmount(0L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getLeapDurationField() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1geo41glw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getLeapDurationField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1geo41glw(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68180);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68181);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68182);assertEquals(null, field.getLeapDurationField());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMinimumValue() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f1f2p91glz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68183,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f1f2p91glz(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68183);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68184);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68185);assertEquals(3, field.getMinimumValue());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16iyk61gm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16iyk61gm2(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68186);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68187);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68188);assertEquals(3, field.getMinimumValue(0L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13tfeiw1gm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13tfeiw1gm5(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68189);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68190);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68191);assertEquals(3, field.getMinimumValue(new TimeOfDay()));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMinimumValue_RP_intarray() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz5kov1gm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMinimumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz5kov1gm8(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68192);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68193);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68194);assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzocf1gmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzocf1gmb(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68195);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68196);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68197);assertEquals(62, field.getMaximumValue());
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kk6lzc1gme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kk6lzc1gme(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68198);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68199);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68200);assertEquals(62, field.getMaximumValue(0L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pndze1gmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pndze1gmh(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68201);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68202);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68203);assertEquals(62, field.getMaximumValue(new TimeOfDay()));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMaximumValue_RP_intarray() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19v2tg31gmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumValue_RP_intarray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19v2tg31gmk(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68204);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68205);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68206);assertEquals(62, field.getMaximumValue(new TimeOfDay(), new int[4]));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMaximumTextLength_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1th5m161gmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1th5m161gmn(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68207);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68208);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68209);assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_getMaximumShortTextLength_Locale() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyw4ns1gmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_getMaximumShortTextLength_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyw4ns1gmq(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68210);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68211);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68212);assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //------------------------------------------------------------------------
    @Test
    public void test_roundFloor_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rvn2v1gmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rvn2v1gmt(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68213);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68214);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68215);assertEquals(-2000L, field.roundFloor(-1001L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68216);assertEquals(-1000L, field.roundFloor(-1000L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68217);assertEquals(-1000L, field.roundFloor(-999L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68218);assertEquals(-1000L, field.roundFloor(-1L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68219);assertEquals(0L, field.roundFloor(0L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68220);assertEquals(0L, field.roundFloor(1L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68221);assertEquals(0L, field.roundFloor(499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68222);assertEquals(0L, field.roundFloor(500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68223);assertEquals(0L, field.roundFloor(501L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68224);assertEquals(1000L, field.roundFloor(1000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_roundCeiling_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t61ifu1gn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t61ifu1gn5(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68225);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68226);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68227);assertEquals(-1000L, field.roundCeiling(-1001L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68228);assertEquals(-1000L, field.roundCeiling(-1000L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68229);assertEquals(0L, field.roundCeiling(-999L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68230);assertEquals(0L, field.roundCeiling(-1L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68231);assertEquals(0L, field.roundCeiling(0L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68232);assertEquals(1000L, field.roundCeiling(1L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68233);assertEquals(1000L, field.roundCeiling(499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68234);assertEquals(1000L, field.roundCeiling(500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68235);assertEquals(1000L, field.roundCeiling(501L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68236);assertEquals(1000L, field.roundCeiling(1000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_roundHalfFloor_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3wvqu1gnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfFloor_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3wvqu1gnh(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68237);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68238);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68239);assertEquals(0L, field.roundHalfFloor(0L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68240);assertEquals(0L, field.roundHalfFloor(499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68241);assertEquals(0L, field.roundHalfFloor(500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68242);assertEquals(1000L, field.roundHalfFloor(501L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68243);assertEquals(1000L, field.roundHalfFloor(1000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_roundHalfCeiling_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182e0k91gno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfCeiling_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182e0k91gno(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68244);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68245);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68246);assertEquals(0L, field.roundHalfCeiling(0L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68247);assertEquals(0L, field.roundHalfCeiling(499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68248);assertEquals(1000L, field.roundHalfCeiling(500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68249);assertEquals(1000L, field.roundHalfCeiling(501L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68250);assertEquals(1000L, field.roundHalfCeiling(1000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_roundHalfEven_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd20a41gnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_roundHalfEven_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd20a41gnv(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68251);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68252);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68253);assertEquals(0L, field.roundHalfEven(0L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68254);assertEquals(0L, field.roundHalfEven(499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68255);assertEquals(0L, field.roundHalfEven(500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68256);assertEquals(1000L, field.roundHalfEven(501L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68257);assertEquals(1000L, field.roundHalfEven(1000L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68258);assertEquals(1000L, field.roundHalfEven(1499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68259);assertEquals(2000L, field.roundHalfEven(1500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68260);assertEquals(2000L, field.roundHalfEven(1501L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    @Test
    public void test_remainder_long() {__CLR4_4_11gbb1gbblgchossk.R.globalSliceStart(getClass().getName(),68261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6jwja1go5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gbb1gbblgchossk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gbb1gbblgchossk.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestOffsetDateTimeField.test_remainder_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6jwja1go5(){try{__CLR4_4_11gbb1gbblgchossk.R.inc(68261);
        __CLR4_4_11gbb1gbblgchossk.R.inc(68262);OffsetDateTimeField field = new MockOffsetDateTimeField();
        __CLR4_4_11gbb1gbblgchossk.R.inc(68263);assertEquals(0L, field.remainder(0L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68264);assertEquals(499L, field.remainder(499L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68265);assertEquals(500L, field.remainder(500L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68266);assertEquals(501L, field.remainder(501L));
        __CLR4_4_11gbb1gbblgchossk.R.inc(68267);assertEquals(0L, field.remainder(1000L));
    }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockOffsetDateTimeField extends OffsetDateTimeField {
        protected MockOffsetDateTimeField() {
            super(ISOChronology.getInstance().secondOfMinute(), 3);__CLR4_4_11gbb1gbblgchossk.R.inc(68269);try{__CLR4_4_11gbb1gbblgchossk.R.inc(68268);
        }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}
    }

    static class MockStandardDateTimeField extends MockOffsetDateTimeField {
        protected MockStandardDateTimeField() {
            super();__CLR4_4_11gbb1gbblgchossk.R.inc(68271);try{__CLR4_4_11gbb1gbblgchossk.R.inc(68270);
        }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_11gbb1gbblgchossk.R.inc(68272);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68273);return ISOChronology.getInstanceUTC().seconds();
        }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_11gbb1gbblgchossk.R.inc(68274);
            __CLR4_4_11gbb1gbblgchossk.R.inc(68275);return ISOChronology.getInstanceUTC().minutes();
        }finally{__CLR4_4_11gbb1gbblgchossk.R.flushNeeded();}}
    }

}
