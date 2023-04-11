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
public class TestPreciseDurationField {static class __CLR4_4_11hib1hiblgchostr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,69561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final long LONG_INTEGER_MAX = Integer.MAX_VALUE;
    private static final int INTEGER_MAX = Integer.MAX_VALUE;
    private static final long LONG_MAX = Long.MAX_VALUE;

    private PreciseDurationField iField;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11hib1hiblgchostr.R.inc(69347);
        __CLR4_4_11hib1hiblgchostr.R.inc(69348);TestPreciseDurationField TB = new TestPreciseDurationField();
        __CLR4_4_11hib1hiblgchostr.R.inc(69349);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69350);TB.test_constructor();
        __CLR4_4_11hib1hiblgchostr.R.inc(69351);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69352);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69353);TB.test_getType();
        __CLR4_4_11hib1hiblgchostr.R.inc(69354);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69355);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69356);TB.test_getName();
        __CLR4_4_11hib1hiblgchostr.R.inc(69357);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69358);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69359);TB.test_isSupported();
        __CLR4_4_11hib1hiblgchostr.R.inc(69360);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69361);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69362);TB.test_isPrecise();
        __CLR4_4_11hib1hiblgchostr.R.inc(69363);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69364);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69365);TB.test_getUnitMillis();
        __CLR4_4_11hib1hiblgchostr.R.inc(69366);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69367);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69368);TB.test_toString();
        __CLR4_4_11hib1hiblgchostr.R.inc(69369);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69370);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69371);TB.test_getValue_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69372);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69373);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69374);TB.test_getValueAsLong_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69375);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69376);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69377);TB.test_getValue_long_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69378);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69379);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69380);TB.test_getValueAsLong_long_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69381);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69382);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69383);TB.test_getMillis_int();
        __CLR4_4_11hib1hiblgchostr.R.inc(69384);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69385);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69386);TB.test_getMillis_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69387);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69388);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69389);TB.test_getMillis_int_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69390);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69391);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69392);TB.test_getMillis_long_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69393);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69394);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69395);TB.test_add_long_int();
        __CLR4_4_11hib1hiblgchostr.R.inc(69396);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69397);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69398);TB.test_add_long_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69399);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69400);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69401);TB.test_getDifference_long_int();
        __CLR4_4_11hib1hiblgchostr.R.inc(69402);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69403);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69404);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11hib1hiblgchostr.R.inc(69405);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69406);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69407);TB.test_equals();
        __CLR4_4_11hib1hiblgchostr.R.inc(69408);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69409);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69410);TB.test_hashCode();
        __CLR4_4_11hib1hiblgchostr.R.inc(69411);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69412);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69413);TB.test_compareTo();
        __CLR4_4_11hib1hiblgchostr.R.inc(69414);TB.tearDown();
        __CLR4_4_11hib1hiblgchostr.R.inc(69415);TB.setUp();
        __CLR4_4_11hib1hiblgchostr.R.inc(69416);TB.testSerialization();
        __CLR4_4_11hib1hiblgchostr.R.inc(69417);TB.tearDown();

    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPreciseDurationField.class);
    }

    public TestPreciseDurationField(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11hib1hiblgchostr.R.inc(69418);
        __CLR4_4_11hib1hiblgchostr.R.inc(69419);iField = new PreciseDurationField(DurationFieldType.seconds(), 1000);
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11hib1hiblgchostr.R.inc(69420);
        __CLR4_4_11hib1hiblgchostr.R.inc(69421);iField = null;
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_constructor() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14im07g1hke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_constructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14im07g1hke(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69422);
        __CLR4_4_11hib1hiblgchostr.R.inc(69423);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69424);new PreciseDurationField(null, 10);
            __CLR4_4_11hib1hiblgchostr.R.inc(69425);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getType() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1hki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1hki(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69426);
        __CLR4_4_11hib1hiblgchostr.R.inc(69427);assertEquals(DurationFieldType.seconds(), iField.getType());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51hkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51hkk(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69428);
        __CLR4_4_11hib1hiblgchostr.R.inc(69429);assertEquals("seconds", iField.getName());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1hkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1hkm(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69430);
        __CLR4_4_11hib1hiblgchostr.R.inc(69431);assertEquals(true, iField.isSupported());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_isPrecise() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u71yjv1hko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_isPrecise",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u71yjv1hko(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69432);
        __CLR4_4_11hib1hiblgchostr.R.inc(69433);assertEquals(true, iField.isPrecise());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getUnitMillis() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148duee1hkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getUnitMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148duee1hkq(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69434);
        __CLR4_4_11hib1hiblgchostr.R.inc(69435);assertEquals(1000, iField.getUnitMillis());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01hks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01hks(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69436);
        __CLR4_4_11hib1hiblgchostr.R.inc(69437);assertEquals("DurationField[seconds]", iField.toString());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getValue_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8q16i1hku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8q16i1hku(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69438);
        __CLR4_4_11hib1hiblgchostr.R.inc(69439);assertEquals(0, iField.getValue(0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69440);assertEquals(12345, iField.getValue(12345678L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69441);assertEquals(-1, iField.getValue(-1234L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69442);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69443);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69444);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L);
            __CLR4_4_11hib1hiblgchostr.R.inc(69445);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getValueAsLong_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi2whg1hl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi2whg1hl2(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69446);
        __CLR4_4_11hib1hiblgchostr.R.inc(69447);assertEquals(0L, iField.getValueAsLong(0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69448);assertEquals(12345L, iField.getValueAsLong(12345678L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69449);assertEquals(-1L, iField.getValueAsLong(-1234L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69450);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L));
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getValue_long_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8wtf31hl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValue_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8wtf31hl7(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69451);
        __CLR4_4_11hib1hiblgchostr.R.inc(69452);assertEquals(0, iField.getValue(0L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69453);assertEquals(12345, iField.getValue(12345678L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69454);assertEquals(-1, iField.getValue(-1234L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69455);assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69456);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69457);iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L);
            __CLR4_4_11hib1hiblgchostr.R.inc(69458);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getValueAsLong_long_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8t4kj1hlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getValueAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8t4kj1hlf(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69459);
        __CLR4_4_11hib1hiblgchostr.R.inc(69460);assertEquals(0L, iField.getValueAsLong(0L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69461);assertEquals(12345L, iField.getValueAsLong(12345678L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69462);assertEquals(-1L, iField.getValueAsLong(-1234L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69463);assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L, 567L));
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMillis_int() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xyqi1hlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xyqi1hlk(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69464);
        __CLR4_4_11hib1hiblgchostr.R.inc(69465);assertEquals(0, iField.getMillis(0));
        __CLR4_4_11hib1hiblgchostr.R.inc(69466);assertEquals(1234000L, iField.getMillis(1234));
        __CLR4_4_11hib1hiblgchostr.R.inc(69467);assertEquals(-1234000L, iField.getMillis(-1234));
        __CLR4_4_11hib1hiblgchostr.R.inc(69468);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX));
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getMillis_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwor11hlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwor11hlp(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69469);
        __CLR4_4_11hib1hiblgchostr.R.inc(69470);assertEquals(0L, iField.getMillis(0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69471);assertEquals(1234000L, iField.getMillis(1234L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69472);assertEquals(-1234000L, iField.getMillis(-1234L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69473);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69474);iField.getMillis(LONG_MAX);
            __CLR4_4_11hib1hiblgchostr.R.inc(69475);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getMillis_int_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hp1zp91hlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_int_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hp1zp91hlw(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69476);
        __CLR4_4_11hib1hiblgchostr.R.inc(69477);assertEquals(0L, iField.getMillis(0, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69478);assertEquals(1234000L, iField.getMillis(1234, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69479);assertEquals(-1234000L, iField.getMillis(-1234, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69480);assertEquals(LONG_INTEGER_MAX * 1000L, iField.getMillis(INTEGER_MAX, 567L));
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getMillis_long_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nakswm1hm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getMillis_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69481,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nakswm1hm1(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69481);
        __CLR4_4_11hib1hiblgchostr.R.inc(69482);assertEquals(0L, iField.getMillis(0L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69483);assertEquals(1234000L, iField.getMillis(1234L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69484);assertEquals(-1234000L, iField.getMillis(-1234L, 567L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69485);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69486);iField.getMillis(LONG_MAX, 567L);
            __CLR4_4_11hib1hiblgchostr.R.inc(69487);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1hm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1hm8(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69488);
        __CLR4_4_11hib1hiblgchostr.R.inc(69489);assertEquals(567L, iField.add(567L, 0));
        __CLR4_4_11hib1hiblgchostr.R.inc(69490);assertEquals(567L + 1234000L, iField.add(567L, 1234));
        __CLR4_4_11hib1hiblgchostr.R.inc(69491);assertEquals(567L - 1234000L, iField.add(567L, -1234));
        __CLR4_4_11hib1hiblgchostr.R.inc(69492);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69493);iField.add(LONG_MAX, 1);
            __CLR4_4_11hib1hiblgchostr.R.inc(69494);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1hmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1hmf(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69495);
        __CLR4_4_11hib1hiblgchostr.R.inc(69496);assertEquals(567L, iField.add(567L, 0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69497);assertEquals(567L + 1234000L, iField.add(567L, 1234L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69498);assertEquals(567L - 1234000L, iField.add(567L, -1234L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69499);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69500);iField.add(LONG_MAX, 1L);
            __CLR4_4_11hib1hiblgchostr.R.inc(69501);fail();
        } catch (ArithmeticException ex) {
        }
        __CLR4_4_11hib1hiblgchostr.R.inc(69502);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69503);iField.add(1L, LONG_MAX);
            __CLR4_4_11hib1hiblgchostr.R.inc(69504);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_int() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5edd81hmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifference_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5edd81hmp(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69505);
        __CLR4_4_11hib1hiblgchostr.R.inc(69506);assertEquals(0, iField.getDifference(1L, 0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69507);assertEquals(567, iField.getDifference(567000L, 0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69508);assertEquals(567 - 1234, iField.getDifference(567000L, 1234000L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69509);assertEquals(567 + 1234, iField.getDifference(567000L, -1234000L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69510);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69511);iField.getDifference(LONG_MAX, -1L);
            __CLR4_4_11hib1hiblgchostr.R.inc(69512);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571hmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571hmx(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69513);
        __CLR4_4_11hib1hiblgchostr.R.inc(69514);assertEquals(0L, iField.getDifferenceAsLong(1L, 0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69515);assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69516);assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69517);assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L));
        __CLR4_4_11hib1hiblgchostr.R.inc(69518);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69519);iField.getDifferenceAsLong(LONG_MAX, -1L);
            __CLR4_4_11hib1hiblgchostr.R.inc(69520);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_equals() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vrzfx1hn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_equals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vrzfx1hn5(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69521);
        __CLR4_4_11hib1hiblgchostr.R.inc(69522);assertEquals(true, iField.equals(iField));
        __CLR4_4_11hib1hiblgchostr.R.inc(69523);assertEquals(false, iField.equals(ISOChronology.getInstance().minutes()));
        __CLR4_4_11hib1hiblgchostr.R.inc(69524);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_11hib1hiblgchostr.R.inc(69525);assertEquals(false, iField.equals(dummy));
        __CLR4_4_11hib1hiblgchostr.R.inc(69526);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000);
        __CLR4_4_11hib1hiblgchostr.R.inc(69527);assertEquals(true, iField.equals(dummy));
        __CLR4_4_11hib1hiblgchostr.R.inc(69528);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000);
        __CLR4_4_11hib1hiblgchostr.R.inc(69529);assertEquals(false, iField.equals(dummy));
        __CLR4_4_11hib1hiblgchostr.R.inc(69530);assertEquals(false, iField.equals(""));
        __CLR4_4_11hib1hiblgchostr.R.inc(69531);assertEquals(false, iField.equals(null));
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    @Test
    public void test_hashCode() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4dyzz1hng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_hashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4dyzz1hng(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69532);
        __CLR4_4_11hib1hiblgchostr.R.inc(69533);assertEquals(true, iField.hashCode() == iField.hashCode());
        __CLR4_4_11hib1hiblgchostr.R.inc(69534);assertEquals(false, iField.hashCode() == ISOChronology.getInstance().minutes().hashCode());
        __CLR4_4_11hib1hiblgchostr.R.inc(69535);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_11hib1hiblgchostr.R.inc(69536);assertEquals(false, iField.hashCode() == dummy.hashCode());
        __CLR4_4_11hib1hiblgchostr.R.inc(69537);dummy = new PreciseDurationField(DurationFieldType.seconds(), 1000);
        __CLR4_4_11hib1hiblgchostr.R.inc(69538);assertEquals(true, iField.hashCode() == dummy.hashCode());
        __CLR4_4_11hib1hiblgchostr.R.inc(69539);dummy = new PreciseDurationField(DurationFieldType.millis(), 1000);
        __CLR4_4_11hib1hiblgchostr.R.inc(69540);assertEquals(false, iField.hashCode() == dummy.hashCode());
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_compareTo() {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s61q2u1hnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.test_compareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69541,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s61q2u1hnp(){try{__CLR4_4_11hib1hiblgchostr.R.inc(69541);
        __CLR4_4_11hib1hiblgchostr.R.inc(69542);assertEquals(0, iField.compareTo(iField));
        __CLR4_4_11hib1hiblgchostr.R.inc(69543);assertEquals(-1, iField.compareTo(ISOChronology.getInstance().minutes()));
        __CLR4_4_11hib1hiblgchostr.R.inc(69544);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_11hib1hiblgchostr.R.inc(69545);assertEquals(1, iField.compareTo(dummy));
//        try {
//            iField.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_11hib1hiblgchostr.R.inc(69546);try {
            __CLR4_4_11hib1hiblgchostr.R.inc(69547);iField.compareTo(null);
            __CLR4_4_11hib1hiblgchostr.R.inc(69548);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_11hib1hiblgchostr.R.globalSliceStart(getClass().getName(),69549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91hnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hib1hiblgchostr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hib1hiblgchostr.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestPreciseDurationField.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91hnx() throws Exception{try{__CLR4_4_11hib1hiblgchostr.R.inc(69549);
        __CLR4_4_11hib1hiblgchostr.R.inc(69550);DurationField test = iField;

        __CLR4_4_11hib1hiblgchostr.R.inc(69551);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_11hib1hiblgchostr.R.inc(69552);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_11hib1hiblgchostr.R.inc(69553);oos.writeObject(test);
        __CLR4_4_11hib1hiblgchostr.R.inc(69554);oos.close();
        __CLR4_4_11hib1hiblgchostr.R.inc(69555);byte[] bytes = baos.toByteArray();

        __CLR4_4_11hib1hiblgchostr.R.inc(69556);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_11hib1hiblgchostr.R.inc(69557);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_11hib1hiblgchostr.R.inc(69558);DurationField result = (DurationField) ois.readObject();
        __CLR4_4_11hib1hiblgchostr.R.inc(69559);ois.close();

        __CLR4_4_11hib1hiblgchostr.R.inc(69560);assertEquals(test, result);
    }finally{__CLR4_4_11hib1hiblgchostr.R.flushNeeded();}}

}
