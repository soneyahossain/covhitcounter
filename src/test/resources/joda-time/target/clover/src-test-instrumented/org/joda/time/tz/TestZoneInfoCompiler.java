/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2017 Stephen Colebourne
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
package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for class {@link ZoneInfoCompiler}.
 *
 * @date 2017-07-31
 * @see ZoneInfoCompiler
 **/
public class TestZoneInfoCompiler {static class __CLR4_4_11nxx1nxxlgchot38{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77731,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//extends TestCase {


    public static void main(String[] args) throws Exception {try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77685);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77686);TestZoneInfoCompiler TB = new TestZoneInfoCompiler();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77687);TB.testParseDataFileWithTrue();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77688);TB.testParseDataFileWithFalse();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77689);TB.testTestOne();

        __CLR4_4_11nxx1nxxlgchot38.R.inc(77690);TB.testTestTwo();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77691);TB.testParseZoneCharFive();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77692);TB.testParseYearAndParseYearReturningPositiveAndParseYearWithNegative();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77693);TB.testParseYearAndParseYearReturningNegativeOne();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77694);TB.testParseYearAndParseYearReturningNegativeTwo();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77695);TB.testWriteZoneInfoMapThrowsIllegalArgumentException();
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testParseDataFileWithTrue() throws IOException {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19alt7m1ny8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testParseDataFileWithTrue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19alt7m1ny8() throws IOException{try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77696);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77697);ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77698);StringReader stringReader = new StringReader(" I  ;>- ");
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77699);BufferedReader bufferedReader = new BufferedReader(stringReader, 2014);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77700);zoneInfoCompiler.parseDataFile(bufferedReader, true);
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testParseDataFileWithFalse() throws IOException {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m35s4d1nyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testParseDataFileWithFalse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m35s4d1nyd() throws IOException{try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77701);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77702);ZoneInfoCompiler zoneInfoCompiler = new ZoneInfoCompiler();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77703);StringReader stringReader = new StringReader("XYC5w.9eA}*U#A;mu");
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77704);BufferedReader bufferedReader = new BufferedReader(stringReader);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77705);zoneInfoCompiler.parseDataFile(bufferedReader, false);
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testTestOne() {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi66bt1nyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testTestOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi66bt1nyi(){try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77706);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77707);DateTimeZone dateTimeZone = DateTimeZone.forOffsetMillis(8);

        __CLR4_4_11nxx1nxxlgchot38.R.inc(77708);assertTrue(ZoneInfoCompiler.test("+02:15", dateTimeZone));
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testTestTwo() {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ucxr2p1nyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testTestTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ucxr2p1nyl(){try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77709);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77710);DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77711);DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone("7M6 _n'63", true);

        __CLR4_4_11nxx1nxxlgchot38.R.inc(77712);assertTrue(ZoneInfoCompiler.test("7M6 _n'63", dateTimeZone));
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testParseZoneCharFive() {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn8vwk1nyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testParseZoneCharFive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn8vwk1nyp(){try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77713);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77714);assertEquals('s', ZoneInfoCompiler.parseZoneChar('s'));
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testParseYearAndParseYearReturningPositiveAndParseYearWithNegative() {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m32fzj1nyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testParseYearAndParseYearReturningPositiveAndParseYearWithNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m32fzj1nyr(){try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77715);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77716);assertEquals(Integer.MAX_VALUE, ZoneInfoCompiler.parseYear("maximum", (-2512)));
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testParseYearAndParseYearReturningNegativeOne() {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sntkfx1nyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testParseYearAndParseYearReturningNegativeOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sntkfx1nyt(){try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77717);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77718);assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("min", (-1881443201)));
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testParseYearAndParseYearReturningNegativeTwo() {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xttp0j1nyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testParseYearAndParseYearReturningNegativeTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xttp0j1nyv(){try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77719);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77720);assertEquals(Integer.MIN_VALUE, ZoneInfoCompiler.parseYear("minimum", (-1971487955)));
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

    @Test
    public void testWriteZoneInfoMapThrowsIllegalArgumentException() throws IOException {__CLR4_4_11nxx1nxxlgchot38.R.globalSliceStart(getClass().getName(),77721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0i1sr1nyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxx1nxxlgchot38.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxx1nxxlgchot38.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestZoneInfoCompiler.testWriteZoneInfoMapThrowsIllegalArgumentException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0i1sr1nyx() throws IOException{try{__CLR4_4_11nxx1nxxlgchot38.R.inc(77721);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77722);Map<String, MockZone> hashMap = new HashMap<String, MockZone>();
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77723);MockZone mockZone = new MockZone(0L, 3022, 90);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77724);hashMap.put("     - ", mockZone);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77725);Map<String, DateTimeZone> hashMapTwo = new HashMap<String, DateTimeZone>(hashMap);
        __CLR4_4_11nxx1nxxlgchot38.R.inc(77726);hashMapTwo.put("H)m^v1(", mockZone);

        __CLR4_4_11nxx1nxxlgchot38.R.inc(77727);try {
            __CLR4_4_11nxx1nxxlgchot38.R.inc(77728);ZoneInfoCompiler.writeZoneInfoMap(null, hashMapTwo);
            __CLR4_4_11nxx1nxxlgchot38.R.inc(77729);fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            __CLR4_4_11nxx1nxxlgchot38.R.inc(77730);assertEquals(ZoneInfoCompiler.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }finally{__CLR4_4_11nxx1nxxlgchot38.R.flushNeeded();}}

}
