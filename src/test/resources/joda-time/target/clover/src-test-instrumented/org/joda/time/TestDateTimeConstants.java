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

/**
 * Test case.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeConstants {static class __CLR4_4_1jjjjjjlgchorjt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,25383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    /**
     * The main method for this test program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25327);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25328);TestDateTimeConstants TB = new TestDateTimeConstants();
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25329);TB.testConstructor();
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25330);TB.testHalfdaysOfDay();
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25331);TB.testDaysOfWeek();
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25332);TB.testMonthsOfYear();
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25333);TB.testEras();
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25334);TB.testMaths();
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

    /**
     * TestSuite is a junit required method.
     */

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeConstants.class);
    }
    public TestDateTimeConstants(String name) {
        super(name);
    }
    */

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_4_1jjjjjjlgchorjt.R.globalSliceStart(getClass().getName(),25335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hjjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjjjjjlgchorjt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjjjjjlgchorjt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hjjr(){try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25335);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25336);DateTimeConstants c = new DateTimeConstants() {
        };
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25337);c.toString();
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

    @Test
    public void testHalfdaysOfDay() {__CLR4_4_1jjjjjjlgchorjt.R.globalSliceStart(getClass().getName(),25338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_181u3gwjju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjjjjjlgchorjt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjjjjjlgchorjt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testHalfdaysOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_181u3gwjju(){try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25338);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25339);assertEquals(0, DateTimeConstants.AM);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25340);assertEquals(1, DateTimeConstants.PM);
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

    @Test
    public void testDaysOfWeek() {__CLR4_4_1jjjjjjlgchorjt.R.globalSliceStart(getClass().getName(),25341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owb339jjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjjjjjlgchorjt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjjjjjlgchorjt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testDaysOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owb339jjx(){try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25341);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25342);assertEquals(1, DateTimeConstants.MONDAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25343);assertEquals(2, DateTimeConstants.TUESDAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25344);assertEquals(3, DateTimeConstants.WEDNESDAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25345);assertEquals(4, DateTimeConstants.THURSDAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25346);assertEquals(5, DateTimeConstants.FRIDAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25347);assertEquals(6, DateTimeConstants.SATURDAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25348);assertEquals(7, DateTimeConstants.SUNDAY);
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

    @Test
    public void testMonthsOfYear() {__CLR4_4_1jjjjjjlgchorjt.R.globalSliceStart(getClass().getName(),25349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fhyu8jk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjjjjjlgchorjt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjjjjjlgchorjt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testMonthsOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fhyu8jk5(){try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25349);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25350);assertEquals(1, DateTimeConstants.JANUARY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25351);assertEquals(2, DateTimeConstants.FEBRUARY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25352);assertEquals(3, DateTimeConstants.MARCH);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25353);assertEquals(4, DateTimeConstants.APRIL);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25354);assertEquals(5, DateTimeConstants.MAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25355);assertEquals(6, DateTimeConstants.JUNE);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25356);assertEquals(7, DateTimeConstants.JULY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25357);assertEquals(8, DateTimeConstants.AUGUST);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25358);assertEquals(9, DateTimeConstants.SEPTEMBER);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25359);assertEquals(10, DateTimeConstants.OCTOBER);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25360);assertEquals(11, DateTimeConstants.NOVEMBER);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25361);assertEquals(12, DateTimeConstants.DECEMBER);
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

    @Test
    public void testEras() {__CLR4_4_1jjjjjjlgchorjt.R.globalSliceStart(getClass().getName(),25362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ofblkjki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjjjjjlgchorjt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjjjjjlgchorjt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testEras",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ofblkjki(){try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25362);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25363);assertEquals(0, DateTimeConstants.BC);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25364);assertEquals(0, DateTimeConstants.BCE);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25365);assertEquals(1, DateTimeConstants.AD);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25366);assertEquals(1, DateTimeConstants.CE);
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

    @Test
    public void testMaths() {__CLR4_4_1jjjjjjlgchorjt.R.globalSliceStart(getClass().getName(),25367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0a0wwjkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jjjjjjlgchorjt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jjjjjjlgchorjt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeConstants.testMaths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0a0wwjkn(){try{__CLR4_4_1jjjjjjlgchorjt.R.inc(25367);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25368);assertEquals(1000, DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25369);assertEquals(60 * 1000, DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25370);assertEquals(60 * 60 * 1000, DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25371);assertEquals(24 * 60 * 60 * 1000, DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25372);assertEquals(7 * 24 * 60 * 60 * 1000, DateTimeConstants.MILLIS_PER_WEEK);

        __CLR4_4_1jjjjjjlgchorjt.R.inc(25373);assertEquals(60, DateTimeConstants.SECONDS_PER_MINUTE);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25374);assertEquals(60 * 60, DateTimeConstants.SECONDS_PER_HOUR);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25375);assertEquals(24 * 60 * 60, DateTimeConstants.SECONDS_PER_DAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25376);assertEquals(7 * 24 * 60 * 60, DateTimeConstants.SECONDS_PER_WEEK);

        __CLR4_4_1jjjjjjlgchorjt.R.inc(25377);assertEquals(60, DateTimeConstants.MINUTES_PER_HOUR);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25378);assertEquals(24 * 60, DateTimeConstants.MINUTES_PER_DAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25379);assertEquals(7 * 24 * 60, DateTimeConstants.MINUTES_PER_WEEK);

        __CLR4_4_1jjjjjjlgchorjt.R.inc(25380);assertEquals(24, DateTimeConstants.HOURS_PER_DAY);
        __CLR4_4_1jjjjjjlgchorjt.R.inc(25381);assertEquals(7 * 24, DateTimeConstants.HOURS_PER_WEEK);

        __CLR4_4_1jjjjjjlgchorjt.R.inc(25382);assertEquals(7, DateTimeConstants.DAYS_PER_WEEK);
    }finally{__CLR4_4_1jjjjjjlgchorjt.R.flushNeeded();}}

}
