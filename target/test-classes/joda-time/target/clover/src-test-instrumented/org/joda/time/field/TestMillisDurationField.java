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
 * This class is a Junit unit test for PeriodFormatterBuilder.
 *
 * @author Stephen Colebourne
 */
public class TestMillisDurationField {static class __CLR4_4_11g6r1g6rlgchoss5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,67799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67635);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67636);TestMillisDurationField TB = new TestMillisDurationField();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67637);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67638);TB.test_getType();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67639);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67640);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67641);TB.test_getName();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67642);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67643);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67644);TB.test_isSupported();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67645);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67646);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67647);TB.test_isPrecise();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67648);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67649);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67650);TB.test_getUnitMillis();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67651);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67652);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67653);TB.test_toString();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67654);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67655);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67656);TB.test_getValue_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67657);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67658);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67659);TB.test_getValueAsLong_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67660);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67661);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67662);TB.test_getValue_long_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67663);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67664);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67665);TB.test_getValueAsLong_long_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67666);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67667);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67668);TB.test_getMillis_int();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67669);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67670);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67671);TB.test_getMillis_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67672);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67673);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67674);TB.test_getMillis_int_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67675);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67676);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67677);TB.test_getMillis_long_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67678);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67679);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67680);TB.test_add_long_int();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67681);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67682);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67683);TB.test_add_long_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67684);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67685);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67686);TB.test_getDifference_long_int();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67687);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67688);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67689);TB.test_getDifferenceAsLong_long_long();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67690);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67691);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67692);TB.test_compareTo();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67693);TB.tearDown();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67694);TB.setUp();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67695);TB.testSerialization();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67696);TB.tearDown();

    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMillisDurationField.class);
    }

    public TestMillisDurationField(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67697);
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67698);
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getType() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5v7di1g8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5v7di1g8j(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67699);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67700);assertEquals(DurationFieldType.millis(), MillisDurationField.INSTANCE.getType());
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getName() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5z5k51g8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5z5k51g8l(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67701);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67702);assertEquals("millis", MillisDurationField.INSTANCE.getName());
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_isSupported() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jpwe1g8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jpwe1g8n(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67703);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67704);assertEquals(true, MillisDurationField.INSTANCE.isSupported());
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_isPrecise() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u71yjv1g8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_isPrecise",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u71yjv1g8p(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67705);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67706);assertEquals(true, MillisDurationField.INSTANCE.isPrecise());
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getUnitMillis() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148duee1g8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getUnitMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148duee1g8r(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67707);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67708);assertEquals(1, MillisDurationField.INSTANCE.getUnitMillis());
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_toString() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4d7c01g8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_toString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4d7c01g8t(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67709);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67710);assertEquals("DurationField[millis]", MillisDurationField.INSTANCE.toString());
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getValue_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8q16i1g8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8q16i1g8v(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67711);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67712);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67713);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67714);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67715);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67716);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67717);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getValueAsLong_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gi2whg1g92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gi2whg1g92(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67718);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67719);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67720);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67721);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67722);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L));
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getValue_long_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8wtf31g97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValue_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8wtf31g97(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67723);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67724);assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67725);assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67726);assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67727);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67728);MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67729);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getValueAsLong_long_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8t4kj1g9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getValueAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8t4kj1g9e(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67730);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67731);assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67732);assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67733);assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67734);assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L));
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getMillis_int() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xyqi1g9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xyqi1g9j(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67735);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67736);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67737);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67738);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234));
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getMillis_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1njwor11g9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1njwor11g9n(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67739);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67740);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67741);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67742);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L));
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getMillis_int_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hp1zp91g9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_int_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hp1zp91g9r(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67743);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67744);assertEquals(0, MillisDurationField.INSTANCE.getMillis(0, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67745);assertEquals(1234, MillisDurationField.INSTANCE.getMillis(1234, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67746);assertEquals(-1234, MillisDurationField.INSTANCE.getMillis(-1234, 567L));
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getMillis_long_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nakswm1g9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getMillis_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nakswm1g9v(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67747);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67748);assertEquals(0L, MillisDurationField.INSTANCE.getMillis(0L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67749);assertEquals(1234L, MillisDurationField.INSTANCE.getMillis(1234L, 567L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67750);assertEquals(-1234L, MillisDurationField.INSTANCE.getMillis(-1234L, 567L));
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_add_long_int() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9umwu1g9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9umwu1g9z(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67751);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67752);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67753);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67754);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67755);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67756);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67757);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_add_long_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nn6hgl1ga6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_add_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nn6hgl1ga6(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67758);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67759);assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67760);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67761);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67762);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67763);MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67764);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDifference_long_int() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5edd81gad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifference_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5edd81gad(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67765);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67766);assertEquals(567, MillisDurationField.INSTANCE.getDifference(567L, 0L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67767);assertEquals(567 - 1234, MillisDurationField.INSTANCE.getDifference(567L, 1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67768);assertEquals(567 + 1234, MillisDurationField.INSTANCE.getDifference(567L, -1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67769);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67770);MillisDurationField.INSTANCE.getDifference(Long.MAX_VALUE, 1L);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67771);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    @Test
    public void test_getDifferenceAsLong_long_long() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y1m2571gak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_getDifferenceAsLong_long_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y1m2571gak(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67772);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67773);assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67774);assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67775);assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67776);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67777);MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, -1L);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67778);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_compareTo() {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s61q2u1gar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.test_compareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s61q2u1gar(){try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67779);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67780);assertEquals(0, MillisDurationField.INSTANCE.compareTo(MillisDurationField.INSTANCE));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67781);assertEquals(-1, MillisDurationField.INSTANCE.compareTo(ISOChronology.getInstance().seconds()));
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67782);DurationField dummy = new PreciseDurationField(DurationFieldType.seconds(), 0);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67783);assertEquals(1, MillisDurationField.INSTANCE.compareTo(dummy));
//        try {
//            MillisDurationField.INSTANCE.compareTo("");
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67784);try {
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67785);MillisDurationField.INSTANCE.compareTo(null);
            __CLR4_4_11g6r1g6rlgchoss5.R.inc(67786);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceStart(getClass().getName(),67787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91gaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g6r1g6rlgchoss5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g6r1g6rlgchoss5.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestMillisDurationField.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91gaz() throws Exception{try{__CLR4_4_11g6r1g6rlgchoss5.R.inc(67787);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67788);DurationField test = MillisDurationField.INSTANCE;

        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67789);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67790);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67791);oos.writeObject(test);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67792);oos.close();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67793);byte[] bytes = baos.toByteArray();

        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67794);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67795);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67796);DurationField result = (DurationField) ois.readObject();
        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67797);ois.close();

        __CLR4_4_11g6r1g6rlgchoss5.R.inc(67798);assertSame(test, result);
    }finally{__CLR4_4_11g6r1g6rlgchoss5.R.flushNeeded();}}

}
