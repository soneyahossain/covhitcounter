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

import java.math.RoundingMode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Brian S O'Neill
 */
public class TestFieldUtils {static class __CLR4_4_11g1j1g1jlgchosrz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,67635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    public static void main(String[] args) throws Exception {try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67447);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67448);TestFieldUtils TB = new TestFieldUtils();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67449);TB.testSafeAddInt();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67450);TB.testSafeAddLong();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67451);TB.testSafeSubtractLong();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67452);TB.testSafeMultiplyLongLong();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67453);TB.testSafeMultiplyLongInt();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67454);TB.testSafeDivideLongLong();
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67455);TB.testSafeDivideRoundingModeLong();
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestFieldUtils.class);
    }

    public TestFieldUtils(String name) {
        super(name);
    }

 */

    @Test
    public void testSafeAddInt() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z10t641g1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z10t641g1s(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67456);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67457);assertEquals(0, FieldUtils.safeAdd(0, 0));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67458);assertEquals(5, FieldUtils.safeAdd(2, 3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67459);assertEquals(-1, FieldUtils.safeAdd(2, -3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67460);assertEquals(1, FieldUtils.safeAdd(-2, 3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67461);assertEquals(-5, FieldUtils.safeAdd(-2, -3));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67462);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67463);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67464);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67465);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67466);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67467);FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67468);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67469);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67470);FieldUtils.safeAdd(Integer.MAX_VALUE, 100);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67471);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67472);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67473);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67474);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67475);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67476);FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67477);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67478);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67479);FieldUtils.safeAdd(Integer.MIN_VALUE, -100);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67480);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67481);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67482);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67483);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

    @Test
    public void testSafeAddLong() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqfzet1g2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqfzet1g2k(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67484);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67485);assertEquals(0L, FieldUtils.safeAdd(0L, 0L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67486);assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67487);assertEquals(-1L, FieldUtils.safeAdd(2L, -3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67488);assertEquals(1L, FieldUtils.safeAdd(-2L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67489);assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67490);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67491);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67492);assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67493);assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67494);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67495);FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67496);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67497);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67498);FieldUtils.safeAdd(Long.MAX_VALUE, 100L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67499);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67500);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67501);FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67502);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67503);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67504);FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67505);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67506);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67507);FieldUtils.safeAdd(Long.MIN_VALUE, -100L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67508);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67509);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67510);FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67511);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

    @Test
    public void testSafeSubtractLong() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hu6o6u1g3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeSubtractLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hu6o6u1g3c(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67512);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67513);assertEquals(0L, FieldUtils.safeSubtract(0L, 0L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67514);assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67515);assertEquals(5L, FieldUtils.safeSubtract(2L, -3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67516);assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67517);assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67518);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67519);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67520);assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67521);assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67522);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67523);FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67524);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67525);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67526);FieldUtils.safeSubtract(Long.MIN_VALUE, 100L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67527);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67528);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67529);FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67530);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67531);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67532);FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67533);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67534);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67535);FieldUtils.safeSubtract(Long.MAX_VALUE, -100L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67536);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67537);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67538);FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67539);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongLong() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrl6xq1g44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrl6xq1g44(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67540);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67541);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67542);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67543);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67544);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67545);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67546);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67547);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67548);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67549);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67550);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67551);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67552);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67553);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67554);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67555);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67556);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67557);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67558);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67559);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67560);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67561);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67562);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67563);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67564);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67565);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67566);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSafeMultiplyLongInt() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysa0a11g4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysa0a11g4v(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67567);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67568);assertEquals(0L, FieldUtils.safeMultiply(0L, 0));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67569);assertEquals(1L, FieldUtils.safeMultiply(1L, 1));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67570);assertEquals(3L, FieldUtils.safeMultiply(1L, 3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67571);assertEquals(3L, FieldUtils.safeMultiply(3L, 1));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67572);assertEquals(6L, FieldUtils.safeMultiply(2L, 3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67573);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67574);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67575);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67576);assertEquals(-1L * Integer.MIN_VALUE, FieldUtils.safeMultiply(-1L, Integer.MIN_VALUE));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67577);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67578);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67579);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67580);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67581);FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67582);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67583);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67584);FieldUtils.safeMultiply(Long.MIN_VALUE, 100);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67585);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67586);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67587);FieldUtils.safeMultiply(Long.MIN_VALUE, Integer.MAX_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67588);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67589);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67590);FieldUtils.safeMultiply(Long.MAX_VALUE, Integer.MIN_VALUE);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67591);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSafeDivideLongLong() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bc77yv1g5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideLongLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bc77yv1g5k(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67592);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67593);assertEquals(1L, FieldUtils.safeDivide(1L, 1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67594);assertEquals(1L, FieldUtils.safeDivide(3L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67595);assertEquals(0L, FieldUtils.safeDivide(1L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67596);assertEquals(3L, FieldUtils.safeDivide(3L, 1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67597);assertEquals(1L, FieldUtils.safeDivide(5L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67598);assertEquals(-1L, FieldUtils.safeDivide(5L, -3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67599);assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67600);assertEquals(1L, FieldUtils.safeDivide(-5L, -3L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67601);assertEquals(2L, FieldUtils.safeDivide(6L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67602);assertEquals(-2L, FieldUtils.safeDivide(6L, -3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67603);assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67604);assertEquals(2L, FieldUtils.safeDivide(-6L, -3L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67605);assertEquals(2L, FieldUtils.safeDivide(7L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67606);assertEquals(-2L, FieldUtils.safeDivide(7L, -3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67607);assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67608);assertEquals(2L, FieldUtils.safeDivide(-7L, -3L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67609);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67610);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67611);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67612);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67613);FieldUtils.safeDivide(Long.MIN_VALUE, -1L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67614);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67615);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67616);FieldUtils.safeDivide(1L, 0L);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67617);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSafeDivideRoundingModeLong() {__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceStart(getClass().getName(),67618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbvlri1g6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11g1j1g1jlgchosrz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11g1j1g1jlgchosrz.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideRoundingModeLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),67618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbvlri1g6a(){try{__CLR4_4_11g1j1g1jlgchosrz.R.inc(67618);
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67619);assertEquals(3L, FieldUtils.safeDivide(15L, 5L, RoundingMode.UNNECESSARY));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67620);assertEquals(59L, FieldUtils.safeDivide(179L, 3L, RoundingMode.FLOOR));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67621);assertEquals(60L, FieldUtils.safeDivide(179L, 3L, RoundingMode.CEILING));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67622);assertEquals(60L, FieldUtils.safeDivide(179L, 3L, RoundingMode.HALF_UP));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67623);assertEquals(-60L, FieldUtils.safeDivide(-179L, 3L, RoundingMode.HALF_UP));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67624);assertEquals(60L, FieldUtils.safeDivide(179L, 3L, RoundingMode.HALF_DOWN));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67625);assertEquals(-60L, FieldUtils.safeDivide(-179L, 3L, RoundingMode.HALF_DOWN));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67626);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L, RoundingMode.UNNECESSARY));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67627);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L, RoundingMode.UNNECESSARY));
        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67628);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L, RoundingMode.UNNECESSARY));

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67629);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67630);FieldUtils.safeDivide(Long.MIN_VALUE, -1L, RoundingMode.UNNECESSARY);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67631);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_11g1j1g1jlgchosrz.R.inc(67632);try {
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67633);FieldUtils.safeDivide(1L, 0L, RoundingMode.UNNECESSARY);
            __CLR4_4_11g1j1g1jlgchosrz.R.inc(67634);fail();
        } catch (ArithmeticException e) {
        }

    }finally{__CLR4_4_11g1j1g1jlgchosrz.R.flushNeeded();}}

}
