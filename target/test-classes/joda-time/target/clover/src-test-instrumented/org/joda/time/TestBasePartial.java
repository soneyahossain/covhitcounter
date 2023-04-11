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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.BasePartial;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestBasePartial {static class __CLR4_4_1hhchhclgchoref{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,22714,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1hhchhclgchoref.R.inc(22656);
        __CLR4_4_1hhchhclgchoref.R.inc(22657);TestBasePartial TB = new TestBasePartial();
        __CLR4_4_1hhchhclgchoref.R.inc(22658);TB.setUp();
        __CLR4_4_1hhchhclgchoref.R.inc(22659);TB.testSetMethods();
        __CLR4_4_1hhchhclgchoref.R.inc(22660);TB.tearDown();

    }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestBasePartial.class);
    }

    public TestBasePartial(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1hhchhclgchoref.R.inc(22661);
        __CLR4_4_1hhchhclgchoref.R.inc(22662);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hhchhclgchoref.R.inc(22663);zone = DateTimeZone.getDefault();
        __CLR4_4_1hhchhclgchoref.R.inc(22664);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1hhchhclgchoref.R.inc(22665);
        __CLR4_4_1hhchhclgchoref.R.inc(22666);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hhchhclgchoref.R.inc(22667);DateTimeZone.setDefault(zone);
        __CLR4_4_1hhchhclgchoref.R.inc(22668);zone = null;
    }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMethods() throws Throwable {__CLR4_4_1hhchhclgchoref.R.globalSliceStart(getClass().getName(),22669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mqk2ehhhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hhchhclgchoref.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hhchhclgchoref.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBasePartial.testSetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mqk2ehhhp() throws Throwable{try{__CLR4_4_1hhchhclgchoref.R.inc(22669);
        __CLR4_4_1hhchhclgchoref.R.inc(22670);MockPartial mock = new MockPartial();
        __CLR4_4_1hhchhclgchoref.R.inc(22671);assertEquals(1970, mock.getYear());
        __CLR4_4_1hhchhclgchoref.R.inc(22672);assertEquals(1, mock.getMonthOfYear());

        __CLR4_4_1hhchhclgchoref.R.inc(22673);mock.setYear(2004);
        __CLR4_4_1hhchhclgchoref.R.inc(22674);assertEquals(2004, mock.getYear());
        __CLR4_4_1hhchhclgchoref.R.inc(22675);assertEquals(1, mock.getMonthOfYear());

        __CLR4_4_1hhchhclgchoref.R.inc(22676);mock.setMonthOfYear(6);
        __CLR4_4_1hhchhclgchoref.R.inc(22677);assertEquals(2004, mock.getYear());
        __CLR4_4_1hhchhclgchoref.R.inc(22678);assertEquals(6, mock.getMonthOfYear());

        __CLR4_4_1hhchhclgchoref.R.inc(22679);mock.set(2005, 5);
        __CLR4_4_1hhchhclgchoref.R.inc(22680);assertEquals(2005, mock.getYear());
        __CLR4_4_1hhchhclgchoref.R.inc(22681);assertEquals(5, mock.getMonthOfYear());

        __CLR4_4_1hhchhclgchoref.R.inc(22682);try {
            __CLR4_4_1hhchhclgchoref.R.inc(22683);mock.setMonthOfYear(0);
            __CLR4_4_1hhchhclgchoref.R.inc(22684);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1hhchhclgchoref.R.inc(22685);assertEquals(2005, mock.getYear());
        __CLR4_4_1hhchhclgchoref.R.inc(22686);assertEquals(5, mock.getMonthOfYear());

        __CLR4_4_1hhchhclgchoref.R.inc(22687);try {
            __CLR4_4_1hhchhclgchoref.R.inc(22688);mock.setMonthOfYear(13);
            __CLR4_4_1hhchhclgchoref.R.inc(22689);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1hhchhclgchoref.R.inc(22690);assertEquals(2005, mock.getYear());
        __CLR4_4_1hhchhclgchoref.R.inc(22691);assertEquals(5, mock.getMonthOfYear());
    }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

    static class MockPartial extends BasePartial {

        MockPartial() {
            super(new int[]{1970, 1}, null);__CLR4_4_1hhchhclgchoref.R.inc(22693);try{__CLR4_4_1hhchhclgchoref.R.inc(22692);
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1hhchhclgchoref.R.inc(22694);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1hhchhclgchoref.R.inc(22695);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1hhchhclgchoref.R.inc(22696);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1hhchhclgchoref.R.inc(22697);return chrono.year();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1hhchhclgchoref.R.inc(22698);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1hhchhclgchoref.R.inc(22699);return chrono.monthOfYear();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1hhchhclgchoref.R.inc(22700);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1hhchhclgchoref.R.inc(22701);throw new IndexOutOfBoundsException();
            }
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        public int size() {try{__CLR4_4_1hhchhclgchoref.R.inc(22702);
            __CLR4_4_1hhchhclgchoref.R.inc(22703);return 2;
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        public int getYear() {try{__CLR4_4_1hhchhclgchoref.R.inc(22704);
            __CLR4_4_1hhchhclgchoref.R.inc(22705);return getValue(0);
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        public void setYear(int year) {try{__CLR4_4_1hhchhclgchoref.R.inc(22706);
            __CLR4_4_1hhchhclgchoref.R.inc(22707);setValue(0, year);
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        public int getMonthOfYear() {try{__CLR4_4_1hhchhclgchoref.R.inc(22708);
            __CLR4_4_1hhchhclgchoref.R.inc(22709);return getValue(1);
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        public void setMonthOfYear(int month) {try{__CLR4_4_1hhchhclgchoref.R.inc(22710);
            __CLR4_4_1hhchhclgchoref.R.inc(22711);setValue(1, month);
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}

        public void set(int year, int month) {try{__CLR4_4_1hhchhclgchoref.R.inc(22712);
            __CLR4_4_1hhchhclgchoref.R.inc(22713);setValues(new int[]{year, month});
        }finally{__CLR4_4_1hhchhclgchoref.R.flushNeeded();}}
    }
}
