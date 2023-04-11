/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationField.
 *
 * @author Stephen Colebourne
 */
public class TestScaledDurationField {static class __CLR4_4_11ho91ho9lgchosty{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,69790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;

    private ScaledDurationField iField;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11ho91ho9lgchosty.R.inc(69561);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69562);TestScaledDurationField TB = new TestScaledDurationField();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69563);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69564);TB.test_constructor();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69565);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69566);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69567);TB.test_getScalar();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69568);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69569);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69570);TB.test_getType();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69571);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69572);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69573);TB.test_getName();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69574);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69575);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69576);TB.test_isSupported();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69577);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69578);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69579);TB.test_isPrecise();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69580);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69581);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69582);TB.test_getUnitMillis();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69583);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69584);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69585);TB.test_toString();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69586);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69587);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69588);TB.test_getValue_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69589);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69590);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69591);TB.test_getValueAsLong_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69592);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69593);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69594);TB.test_getValue_long_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69595);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69596);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69597);TB.test_getValueAsLong_long_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69598);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69599);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69600);TB.test_getMillis_int();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69601);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69602);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69603);TB.test_getMillis_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69604);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69605);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69606);TB.test_getMillis_int_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69607);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69608);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69609);TB.test_getMillis_long_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69610);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69611);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69612);TB.test_add_long_int();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69613);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69614);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69615);TB.test_add_long_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69616);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69617);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69618);TB.test_getDifference_long_int();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69619);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69620);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69621);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69622);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69623);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69624);TB.test_equals();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69625);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69626);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69627);TB.test_hashCode();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69628);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69629);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69630);TB.test_compareTo();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69631);TB.tearDown();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69632);TB.setUp();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69633);TB.testSerialization();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69634);TB.tearDown();

    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestScaledDurationField.class);
    }

    public TestScaledDurationField(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11ho91ho9lgchosty.R.inc(69635);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69636);DurationField base = MillisDurationField.INSTANCE;
        __CLR4_4_11ho91ho9lgchosty.R.inc(69637);iField = new ScaledDurationField(base, DurationFieldType.minutes(), 90);
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11ho91ho9lgchosty.R.inc(69638);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69639);iField = null;
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_constructor() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g1hqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g1hqg(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69640);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69641);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69642);new ScaledDurationField(null, DurationFieldType.minutes(), 10);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69643);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ho91ho9lgchosty.R.inc(69644);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69645);new ScaledDurationField(MillisDurationField.INSTANCE, null, 10);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69646);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ho91ho9lgchosty.R.inc(69647);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69648);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 0);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69649);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ho91ho9lgchosty.R.inc(69650);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69651);new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 1);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69652);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getScalar() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19j0jks1hqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getScalar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19j0jks1hqt(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69653);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69654);assertEquals(90, iField.getScalar());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getType() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1hqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1hqv(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69655);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69656);assertEquals(DurationFieldType.minutes(), iField.getType());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51hqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51hqx(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69657);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69658);assertEquals("minutes", iField.getName());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1hqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1hqz(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69659);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69660);assertEquals(true, iField.isSupported());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_isPrecise() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u71yjv1hr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_isPrecise",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u71yjv1hr1(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69661);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69662);assertEquals(true, iField.isPrecise());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getUnitMillis() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148duee1hr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getUnitMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148duee1hr3(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69663);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69664);assertEquals(90, iField.getUnitMillis());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01hr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01hr5(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69665);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69666);assertEquals("DurationField[minutes]", iField.toString());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getValue_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8q16i1hr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8q16i1hr7(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69667);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69668);assertEquals(0, iField.getValue(0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69669);assertEquals(12345678 / 90, iField.getValue(12345678L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69670);assertEquals(-1234 / 90, iField.getValue(-1234L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69671);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69672);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69673);iField.getValue(LONG_INTEGER_MAX + 1L);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69674);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getValueAsLong_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi2whg1hrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi2whg1hrf(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69675);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69676);assertEquals(0L, iField.getValueAsLong(0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69677);assertEquals(12345678L / 90, iField.getValueAsLong(12345678L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69678);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69679);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L));
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getValue_long_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8wtf31hrk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValue_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8wtf31hrk(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69680);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69681);assertEquals(0, iField.getValue(0L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69682);assertEquals(12345678 / 90, iField.getValue(12345678L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69683);assertEquals(-1234 / 90, iField.getValue(-1234L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69684);assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69685);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69686);iField.getValue(LONG_INTEGER_MAX + 1L, 567L);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69687);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getValueAsLong_long_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8t4kj1hrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getValueAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8t4kj1hrs(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69688);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69689);assertEquals(0L, iField.getValueAsLong(0L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69690);assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69691);assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69692);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L));
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMillis_int() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xyqi1hrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xyqi1hrx(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69693);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69694);assertEquals(0, iField.getMillis(0));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69695);assertEquals(1234L * 90L, iField.getMillis(1234));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69696);assertEquals(-1234L * 90L, iField.getMillis(-1234));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69697);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX));
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getMillis_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwor11hs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwor11hs2(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69698);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69699);assertEquals(0L, iField.getMillis(0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69700);assertEquals(1234L * 90L, iField.getMillis(1234L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69701);assertEquals(-1234L * 90L, iField.getMillis(-1234L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69702);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69703);iField.getMillis(LONG_MAX);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69704);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getMillis_int_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hp1zp91hs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_int_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hp1zp91hs9(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69705);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69706);assertEquals(0L, iField.getMillis(0, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69707);assertEquals(1234L * 90L, iField.getMillis(1234, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69708);assertEquals(-1234L * 90L, iField.getMillis(-1234, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69709);assertEquals(LONG_INTEGER_MAX * 90L, iField.getMillis(INTEGER_MAX, 567L));
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getMillis_long_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nakswm1hse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getMillis_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nakswm1hse(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69710);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69711);assertEquals(0L, iField.getMillis(0L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69712);assertEquals(1234L * 90L, iField.getMillis(1234L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69713);assertEquals(-1234L * 90L, iField.getMillis(-1234L, 567L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69714);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69715);iField.getMillis(LONG_MAX, 567L);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69716);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1hsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1hsl(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69717);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69718);assertEquals(567L, iField.add(567L, 0));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69719);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69720);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69721);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69722);iField.add(LONG_MAX, 1);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69723);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1hss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1hss(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69724);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69725);assertEquals(567L, iField.add(567L, 0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69726);assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69727);assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69728);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69729);iField.add(LONG_MAX, 1L);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69730);fail();
        } catch (ArithmeticException ex) {
        }
        __CLR4_4_11ho91ho9lgchosty.R.inc(69731);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69732);iField.add(1L, LONG_MAX);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69733);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_int() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5edd81ht2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifference_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5edd81ht2(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69734);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69735);assertEquals(0, iField.getDifference(1L, 0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69736);assertEquals(567, iField.getDifference(567L * 90L, 0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69737);assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69738);assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69739);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69740);iField.getDifference(LONG_MAX, -1L);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69741);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571hta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571hta(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69742);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69743);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69744);assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69745);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69746);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69747);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69748);iField.getDifferenceAsLong(LONG_MAX, -1L);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69749);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_equals() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vrzfx1hti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_equals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vrzfx1hti(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69750);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69751);assertEquals(true, iField.equals(iField));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69752);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes()));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69753);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69754);assertEquals(false, iField.equals(dummy));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69755);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69756);assertEquals(true, iField.equals(dummy));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69757);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69758);assertEquals(false, iField.equals(dummy));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69759);assertEquals(false, iField.equals(""));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69760);assertEquals(false, iField.equals(null));
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    @Test
    public void test_hashCode() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4dyzz1htt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_hashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4dyzz1htt(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69761);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69762);assertEquals(iField.hashCode(), iField.hashCode());
        __CLR4_4_11ho91ho9lgchosty.R.inc(69763);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode());
        __CLR4_4_11ho91ho9lgchosty.R.inc(69764);DurationField dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 2);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69765);assertEquals(false, iField.hashCode() == dummy.hashCode());
        __CLR4_4_11ho91ho9lgchosty.R.inc(69766);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.minutes(), 90);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69767);assertEquals(true, iField.hashCode() == dummy.hashCode());
        __CLR4_4_11ho91ho9lgchosty.R.inc(69768);dummy = new ScaledDurationField(MillisDurationField.INSTANCE, DurationFieldType.millis(), 90);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69769);assertEquals(false, iField.hashCode() == dummy.hashCode());
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_compareTo() {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s61q2u1hu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.test_compareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s61q2u1hu2(){try{__CLR4_4_11ho91ho9lgchosty.R.inc(69770);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69771);assertEquals(0, iField.compareTo(iField));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69772);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes()));
        __CLR4_4_11ho91ho9lgchosty.R.inc(69773);DurationField dummy = new PreciseDurationField(DurationFieldType.minutes(), 0);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69774);assertEquals(1, iField.compareTo(dummy));
//        try {
//            iField.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_11ho91ho9lgchosty.R.inc(69775);try {
            __CLR4_4_11ho91ho9lgchosty.R.inc(69776);iField.compareTo(null);
            __CLR4_4_11ho91ho9lgchosty.R.inc(69777);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_11ho91ho9lgchosty.R.globalSliceStart(getClass().getName(),69778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91hua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ho91ho9lgchosty.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ho91ho9lgchosty.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestScaledDurationField.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91hua() throws Exception{try{__CLR4_4_11ho91ho9lgchosty.R.inc(69778);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69779);DurationField test = iField;

        __CLR4_4_11ho91ho9lgchosty.R.inc(69780);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69781);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69782);oos.writeObject(test);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69783);oos.close();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69784);byte[] bytes = baos.toByteArray();

        __CLR4_4_11ho91ho9lgchosty.R.inc(69785);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69786);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_11ho91ho9lgchosty.R.inc(69787);DurationField result = (DurationField) ois.readObject();
        __CLR4_4_11ho91ho9lgchosty.R.inc(69788);ois.close();

        __CLR4_4_11ho91ho9lgchosty.R.inc(69789);assertEquals(test, result);
    }finally{__CLR4_4_11ho91ho9lgchosty.R.flushNeeded();}}

}
