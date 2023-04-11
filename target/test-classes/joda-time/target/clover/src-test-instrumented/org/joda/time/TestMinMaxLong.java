/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2015 Stephen Colebourne
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

import java.util.Locale;

import org.joda.time.chrono.ISOChronology;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for min/max long values.
 *
 * @author Stephen Colebourne
 */
public class TestMinMaxLong {static class __CLR4_4_1wahwahlgchos4f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,42078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final int ACTUAL_MAX_YEAR = 292278994;
    private static final int ACTUAL_MIN_YEAR = -292275055;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1wahwahlgchos4f.R.inc(41849);
        __CLR4_4_1wahwahlgchos4f.R.inc(41850);TestMinMaxLong TB = new TestMinMaxLong();
        __CLR4_4_1wahwahlgchos4f.R.inc(41851);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41852);TB.testDateTime_max();
        __CLR4_4_1wahwahlgchos4f.R.inc(41853);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41854);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41855);TB.testDateTime_max_math();
        __CLR4_4_1wahwahlgchos4f.R.inc(41856);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41857);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41858);TB.testDateTime_max_fields();
        __CLR4_4_1wahwahlgchos4f.R.inc(41859);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41860);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41861);TB.testDateTime_max_fieldsUTC();
        __CLR4_4_1wahwahlgchos4f.R.inc(41862);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41863);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41864);TB.testDateTime_max_fieldsNewYork();
        __CLR4_4_1wahwahlgchos4f.R.inc(41865);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41866);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41867);TB.testDateTime_max_long();
        __CLR4_4_1wahwahlgchos4f.R.inc(41868);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41869);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41870);TB.testPrintParseMax();
        __CLR4_4_1wahwahlgchos4f.R.inc(41871);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41872);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41873);TB.testDateTime_min();
        __CLR4_4_1wahwahlgchos4f.R.inc(41874);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41875);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41876);TB.testDateTime_min_math();
        __CLR4_4_1wahwahlgchos4f.R.inc(41877);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41878);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41879);TB.testDateTime_min_fields();
        __CLR4_4_1wahwahlgchos4f.R.inc(41880);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41881);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41882);TB.testDateTime_min_long();
        __CLR4_4_1wahwahlgchos4f.R.inc(41883);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41884);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41885);TB.testPrintParseMin();
        __CLR4_4_1wahwahlgchos4f.R.inc(41886);TB.tearDown();
        __CLR4_4_1wahwahlgchos4f.R.inc(41887);TB.setUp();
        __CLR4_4_1wahwahlgchos4f.R.inc(41888);TB.testDateTime_aroundZero();
        __CLR4_4_1wahwahlgchos4f.R.inc(41889);TB.tearDown();
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMinMaxLong.class);
    }

    public TestMinMaxLong(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1wahwahlgchos4f.R.inc(41890);
        __CLR4_4_1wahwahlgchos4f.R.inc(41891);zone = DateTimeZone.getDefault();
        __CLR4_4_1wahwahlgchos4f.R.inc(41892);locale = Locale.getDefault();
        __CLR4_4_1wahwahlgchos4f.R.inc(41893);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1wahwahlgchos4f.R.inc(41894);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1wahwahlgchos4f.R.inc(41895);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1wahwahlgchos4f.R.inc(41896);
        __CLR4_4_1wahwahlgchos4f.R.inc(41897);DateTimeZone.setDefault(zone);
        __CLR4_4_1wahwahlgchos4f.R.inc(41898);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1wahwahlgchos4f.R.inc(41899);Locale.setDefault(locale);
        __CLR4_4_1wahwahlgchos4f.R.inc(41900);zone = null;
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDateTime_max() throws Throwable {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),41901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oj2hs7wbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_max",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oj2hs7wbx() throws Throwable{try{__CLR4_4_1wahwahlgchos4f.R.inc(41901);
        // toString adjusts to UTC rather than overflow
        __CLR4_4_1wahwahlgchos4f.R.inc(41902);DateTime dt = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 807, DateTimeZone.UTC);
        __CLR4_4_1wahwahlgchos4f.R.inc(41903);assertEquals(Long.MAX_VALUE, dt.getMillis());
        __CLR4_4_1wahwahlgchos4f.R.inc(41904);assertEquals(ISOChronology.getInstanceUTC(), dt.getChronology());
        __CLR4_4_1wahwahlgchos4f.R.inc(41905);DateTime test = new DateTime(Long.MAX_VALUE);
        __CLR4_4_1wahwahlgchos4f.R.inc(41906);assertEquals(Long.MAX_VALUE, test.getMillis());
        __CLR4_4_1wahwahlgchos4f.R.inc(41907);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_max_math() throws Throwable {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),41908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vixopowc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_max_math",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vixopowc4() throws Throwable{try{__CLR4_4_1wahwahlgchos4f.R.inc(41908);
        __CLR4_4_1wahwahlgchos4f.R.inc(41909);DateTime test = new DateTime(Long.MAX_VALUE);  // always in UTC
        __CLR4_4_1wahwahlgchos4f.R.inc(41910);assertEquals("292278994-08-17T07:12:55.807Z", test.toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41911);assertEquals(new DateTime(Long.MAX_VALUE - 807, DateTimeZone.UTC), test.minus(807));
        __CLR4_4_1wahwahlgchos4f.R.inc(41912);assertEquals("292278994-08-17T07:12:55.000Z", test.minus(807).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41913);assertEquals(new DateTime(Long.MAX_VALUE - 1000, DateTimeZone.UTC), test.minusSeconds(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(41914);assertEquals("292278994-08-17T07:12:54.807Z", test.minusSeconds(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41915);assertEquals(new DateTime(Long.MAX_VALUE - 60000, DateTimeZone.UTC), test.minusMinutes(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(41916);assertEquals("292278994-08-17T07:11:55.807Z", test.minusMinutes(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41917);assertEquals(new DateTime(Long.MAX_VALUE - 3600000, DateTimeZone.UTC), test.minusHours(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(41918);assertEquals("292278994-08-17T06:12:55.807Z", test.minusHours(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41919);assertEquals(new DateTime(Long.MAX_VALUE - 3600000, DateTimeZone.UTC), test.minusHours(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(41920);assertEquals("292278994-08-17T06:12:55.808Z", test.minusHours(1).plusMillis(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41921);assertEquals(new DateTime(Long.MAX_VALUE - (3600000 - 60000), DateTimeZone.UTC), test.minusMinutes(59));
        __CLR4_4_1wahwahlgchos4f.R.inc(41922);assertEquals("292278994-08-17T06:13:55.807Z", test.minusMinutes(59).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41923);assertEquals(new DateTime(Long.MAX_VALUE - (3600000 - 60000) + 1, DateTimeZone.UTC), test.minusMinutes(59).plusMillis(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(41924);assertEquals("292278994-08-17T06:13:55.808Z", test.minusMinutes(59).plusMillis(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41925);assertEquals(new DateTime(Long.MAX_VALUE - 3600000, DateTimeZone.UTC), test.minusMinutes(61).plusMinutes(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(41926);assertEquals("292278994-08-17T06:12:55.807Z", test.minusHours(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(41927);try {
            __CLR4_4_1wahwahlgchos4f.R.inc(41928);test.plusMillis(1);
            __CLR4_4_1wahwahlgchos4f.R.inc(41929);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_max_fields() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),41930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kfharwcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_max_fields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kfharwcq(){try{__CLR4_4_1wahwahlgchos4f.R.inc(41930);
        __CLR4_4_1wahwahlgchos4f.R.inc(41931);assertEquals(ACTUAL_MAX_YEAR, ISOChronology.getInstanceUTC().year().getMaximumValue() + 1);
        // ensure time-zone correct in previous year
        __CLR4_4_1wahwahlgchos4f.R.inc(41932);assertEquals("292278992-06-30T00:00:00.000+01:00", new DateTime(292278992, 6, 30, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41933);assertEquals("292278992-12-31T00:00:00.000Z", new DateTime(292278992, 12, 31, 0, 0).toString());
//        assertEquals("292278993-06-30T00:00:00.000+01:00", new DateTime(292278993, 6, 30, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41934);assertEquals("292278993-12-31T00:00:00.000Z", new DateTime(292278993, 12, 31, 0, 0).toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41935);DateTime a = new DateTime(ACTUAL_MAX_YEAR, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41936);assertEquals("292278994-01-01T00:00:00.000Z", a.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41937);DateTime b = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41938);assertEquals("292278994-08-17T07:00:00.000+01:00", b.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41939);DateTime c = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41940);assertEquals("292278994-08-17T07:12:55.000+01:00", c.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41941);DateTime d = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 806);
        __CLR4_4_1wahwahlgchos4f.R.inc(41942);assertEquals(new DateTime(Long.MAX_VALUE - 1 - 3600000), d);
        __CLR4_4_1wahwahlgchos4f.R.inc(41943);assertEquals("292278994-08-17T07:12:55.806+01:00", d.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41944);DateTime e = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 807);
        __CLR4_4_1wahwahlgchos4f.R.inc(41945);assertEquals(new DateTime(Long.MAX_VALUE), e);
        __CLR4_4_1wahwahlgchos4f.R.inc(41946);assertEquals("292278994-08-17T07:12:55.807Z", e.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41947);DateTime f = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 808);
        __CLR4_4_1wahwahlgchos4f.R.inc(41948);assertEquals(new DateTime(Long.MAX_VALUE), f);
        __CLR4_4_1wahwahlgchos4f.R.inc(41949);assertEquals("292278994-08-17T07:12:55.807Z", f.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41950);DateTime g = new DateTime(ACTUAL_MAX_YEAR, 12, 31, 23, 59, 59, 999);
        __CLR4_4_1wahwahlgchos4f.R.inc(41951);assertEquals(new DateTime(Long.MAX_VALUE), g);
        __CLR4_4_1wahwahlgchos4f.R.inc(41952);assertEquals("292278994-08-17T07:12:55.807Z", g.toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_max_fieldsUTC() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),41953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cpw4bwdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_max_fieldsUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cpw4bwdd(){try{__CLR4_4_1wahwahlgchos4f.R.inc(41953);
        __CLR4_4_1wahwahlgchos4f.R.inc(41954);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1wahwahlgchos4f.R.inc(41955);assertEquals(ACTUAL_MAX_YEAR, ISOChronology.getInstanceUTC().year().getMaximumValue() + 1);
        // ensure time-zone correct in previous year
        __CLR4_4_1wahwahlgchos4f.R.inc(41956);assertEquals("292278992-06-30T00:00:00.000Z", new DateTime(292278992, 6, 30, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41957);assertEquals("292278992-12-31T00:00:00.000Z", new DateTime(292278992, 12, 31, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41958);assertEquals("292278993-06-30T00:00:00.000Z", new DateTime(292278993, 6, 30, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41959);assertEquals("292278993-12-31T00:00:00.000Z", new DateTime(292278993, 12, 31, 0, 0).toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41960);DateTime a = new DateTime(ACTUAL_MAX_YEAR, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41961);assertEquals("292278994-01-01T00:00:00.000Z", a.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41962);DateTime b = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41963);assertEquals("292278994-08-17T07:00:00.000Z", b.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41964);DateTime c = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41965);assertEquals("292278994-08-17T07:12:55.000Z", c.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41966);DateTime d = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 806);
        __CLR4_4_1wahwahlgchos4f.R.inc(41967);assertEquals(new DateTime(Long.MAX_VALUE - 1), d);
        __CLR4_4_1wahwahlgchos4f.R.inc(41968);assertEquals("292278994-08-17T07:12:55.806Z", d.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41969);DateTime e = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 807);
        __CLR4_4_1wahwahlgchos4f.R.inc(41970);assertEquals(new DateTime(Long.MAX_VALUE), e);
        __CLR4_4_1wahwahlgchos4f.R.inc(41971);assertEquals("292278994-08-17T07:12:55.807Z", e.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41972);DateTime f = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 808);
        __CLR4_4_1wahwahlgchos4f.R.inc(41973);assertEquals(new DateTime(Long.MAX_VALUE), f);
        __CLR4_4_1wahwahlgchos4f.R.inc(41974);assertEquals("292278994-08-17T07:12:55.807Z", f.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41975);DateTime g = new DateTime(ACTUAL_MAX_YEAR, 12, 31, 23, 59, 59, 999);
        __CLR4_4_1wahwahlgchos4f.R.inc(41976);assertEquals(new DateTime(Long.MAX_VALUE), g);
        __CLR4_4_1wahwahlgchos4f.R.inc(41977);assertEquals("292278994-08-17T07:12:55.807Z", g.toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_max_fieldsNewYork() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),41978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4myj4we2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_max_fieldsNewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4myj4we2(){try{__CLR4_4_1wahwahlgchos4f.R.inc(41978);
        __CLR4_4_1wahwahlgchos4f.R.inc(41979);DateTimeZone.setDefault(DateTimeZone.forID("America/New_York"));
        __CLR4_4_1wahwahlgchos4f.R.inc(41980);assertEquals(ACTUAL_MAX_YEAR, ISOChronology.getInstanceUTC().year().getMaximumValue() + 1);
        // ensure time-zone correct in previous year
        __CLR4_4_1wahwahlgchos4f.R.inc(41981);assertEquals("292278992-06-30T00:00:00.000-04:00", new DateTime(292278992, 6, 30, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41982);assertEquals("292278992-12-31T00:00:00.000-05:00", new DateTime(292278992, 12, 31, 0, 0).toString());
//        assertEquals("292278993-06-30T00:00:00.000-04:00", new DateTime(292278993, 6, 30, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(41983);assertEquals("292278993-12-31T00:00:00.000-05:00", new DateTime(292278993, 12, 31, 0, 0).toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41984);DateTime a = new DateTime(ACTUAL_MAX_YEAR, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41985);assertEquals("292278994-01-01T00:00:00.000-05:00", a.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41986);DateTime b = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 3, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41987);assertEquals("292278994-08-17T03:00:00.000-04:00", b.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41988);DateTime c = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 3, 12, 55, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(41989);assertEquals("292278994-08-17T03:12:55.000-04:00", c.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(41990);DateTime d = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 3, 12, 55, 806);
        __CLR4_4_1wahwahlgchos4f.R.inc(41991);assertEquals(new DateTime(Long.MAX_VALUE - 1), d);
        __CLR4_4_1wahwahlgchos4f.R.inc(41992);assertEquals("292278994-08-17T03:12:55.806-04:00", d.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41993);DateTime e = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 3, 12, 55, 807);
        __CLR4_4_1wahwahlgchos4f.R.inc(41994);assertEquals(new DateTime(Long.MAX_VALUE), e);
        __CLR4_4_1wahwahlgchos4f.R.inc(41995);assertEquals("292278994-08-17T07:12:55.807Z", e.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41996);DateTime f = new DateTime(ACTUAL_MAX_YEAR, 8, 17, 7, 12, 55, 807);
        __CLR4_4_1wahwahlgchos4f.R.inc(41997);assertEquals(new DateTime(Long.MAX_VALUE), f);
        __CLR4_4_1wahwahlgchos4f.R.inc(41998);assertEquals("292278994-08-17T07:12:55.807Z", f.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(41999);DateTime g = new DateTime(ACTUAL_MAX_YEAR, 12, 31, 23, 59, 59, 999);
        __CLR4_4_1wahwahlgchos4f.R.inc(42000);assertEquals(new DateTime(Long.MAX_VALUE), g);
        __CLR4_4_1wahwahlgchos4f.R.inc(42001);assertEquals("292278994-08-17T07:12:55.807Z", g.toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_max_long() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbi5aoweq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_max_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbi5aoweq(){try{__CLR4_4_1wahwahlgchos4f.R.inc(42002);
        __CLR4_4_1wahwahlgchos4f.R.inc(42003);assertEquals("292278994-08-17T07:12:55.807+01:00", new DateTime(Long.MAX_VALUE - 3600000).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42004);assertEquals("292278994-08-17T06:12:55.808Z", new DateTime(Long.MAX_VALUE - 3599999).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42005);assertEquals("292278994-08-17T07:11:55.807Z", new DateTime(Long.MAX_VALUE - 60000).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42006);assertEquals("292278994-08-17T07:12:55.000Z", new DateTime(Long.MAX_VALUE - 807).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42007);assertEquals("292278994-08-17T07:12:55.806Z", new DateTime(Long.MAX_VALUE - 1).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42008);assertEquals("292278994-08-17T07:12:55.807Z", new DateTime(Long.MAX_VALUE).toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testPrintParseMax() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fg9estwex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testPrintParseMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42009,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fg9estwex(){try{__CLR4_4_1wahwahlgchos4f.R.inc(42009);
        __CLR4_4_1wahwahlgchos4f.R.inc(42010);DateTime test1 = new DateTime(Long.MAX_VALUE);
        __CLR4_4_1wahwahlgchos4f.R.inc(42011);assertEquals(test1, DateTime.parse(test1.toString()));
        __CLR4_4_1wahwahlgchos4f.R.inc(42012);DateTime test2 = new DateTime(Long.valueOf(Long.MAX_VALUE));
        __CLR4_4_1wahwahlgchos4f.R.inc(42013);assertEquals(test2, DateTime.parse(test2.toString()));
        __CLR4_4_1wahwahlgchos4f.R.inc(42014);assertEquals(test2, test1);
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDateTime_min() throws Throwable {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdj3a1wf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_min",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdj3a1wf3() throws Throwable{try{__CLR4_4_1wahwahlgchos4f.R.inc(42015);
        __CLR4_4_1wahwahlgchos4f.R.inc(42016);DateTime dt = new DateTime(-292275054, 1, 1, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(42017);DateTime test = new DateTime(dt.getMillis());
        __CLR4_4_1wahwahlgchos4f.R.inc(42018);assertEquals(dt, test);
        __CLR4_4_1wahwahlgchos4f.R.inc(42019);assertEquals("-292275054-01-01T00:00:00.000-00:01:15", test.toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_min_math() throws Throwable {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rdrf6wf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_min_math",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rdrf6wf8() throws Throwable{try{__CLR4_4_1wahwahlgchos4f.R.inc(42020);
        __CLR4_4_1wahwahlgchos4f.R.inc(42021);DateTime test = new DateTime(Long.MIN_VALUE);  // always in UTC
        __CLR4_4_1wahwahlgchos4f.R.inc(42022);assertEquals("-292275055-05-16T16:47:04.192Z", test.toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(42023);assertEquals(new DateTime(Long.MIN_VALUE + 808, DateTimeZone.UTC), test.plus(808));
        __CLR4_4_1wahwahlgchos4f.R.inc(42024);assertEquals("-292275055-05-16T16:47:05.000Z", test.plus(808).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(42025);assertEquals(new DateTime(Long.MIN_VALUE + 808, DateTimeZone.UTC), test.plusMillis(808));
        __CLR4_4_1wahwahlgchos4f.R.inc(42026);assertEquals("-292275055-05-16T16:47:05.000Z", test.plusMillis(808).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(42027);assertEquals(new DateTime(Long.MIN_VALUE + 1000, DateTimeZone.UTC), test.plusSeconds(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(42028);assertEquals("-292275055-05-16T16:47:05.192Z", test.plusSeconds(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(42029);assertEquals(new DateTime(Long.MIN_VALUE + 60000, DateTimeZone.UTC), test.plusMinutes(1));
        __CLR4_4_1wahwahlgchos4f.R.inc(42030);assertEquals("-292275055-05-16T16:48:04.192Z", test.plusMinutes(1).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(42031);assertEquals(new DateTime(Long.MIN_VALUE + 80000, DateTimeZone.UTC), test.plusSeconds(80));
        __CLR4_4_1wahwahlgchos4f.R.inc(42032);assertEquals("-292275055-05-16T16:48:24.192Z", test.plusSeconds(80).toString());

        __CLR4_4_1wahwahlgchos4f.R.inc(42033);try {
            __CLR4_4_1wahwahlgchos4f.R.inc(42034);test.minusMillis(1);
            __CLR4_4_1wahwahlgchos4f.R.inc(42035);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_min_fields() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zor41wfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_min_fields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zor41wfo(){try{__CLR4_4_1wahwahlgchos4f.R.inc(42036);
        __CLR4_4_1wahwahlgchos4f.R.inc(42037);assertEquals(ACTUAL_MIN_YEAR, ISOChronology.getInstanceUTC().year().getMinimumValue() - 1);
        // ensure previous year
        __CLR4_4_1wahwahlgchos4f.R.inc(42038);assertEquals("-292275053-01-01T00:00:00.000-00:01:15", new DateTime(-292275053, 1, 1, 0, 0).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42039);assertEquals("-292275054-01-01T00:00:00.000-00:01:15", new DateTime(-292275054, 1, 1, 0, 0).toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(42040);DateTime a = new DateTime(ACTUAL_MIN_YEAR, 12, 31, 23, 59, 59, 999);
        __CLR4_4_1wahwahlgchos4f.R.inc(42041);assertEquals("-292275055-12-31T23:59:59.999-00:01:15", a.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(42042);DateTime b = new DateTime(ACTUAL_MIN_YEAR, 5, 17, 0, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(42043);assertEquals("-292275055-05-17T00:00:00.000-00:01:15", b.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(42044);DateTime c = new DateTime(ACTUAL_MIN_YEAR, 5, 16, 17, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(42045);assertEquals("-292275055-05-16T17:00:00.000-00:01:15", c.toString());
        // permitted
        __CLR4_4_1wahwahlgchos4f.R.inc(42046);DateTime d = new DateTime(ACTUAL_MIN_YEAR, 5, 16, 16, 47, 4, 193);
        __CLR4_4_1wahwahlgchos4f.R.inc(42047);assertEquals("-292275055-05-16T16:47:04.193-00:01:15", d.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(42048);DateTime e = new DateTime(ACTUAL_MIN_YEAR, 5, 16, 16, 47, 4, 192);
        __CLR4_4_1wahwahlgchos4f.R.inc(42049);assertEquals(new DateTime(Long.MIN_VALUE), e);
        __CLR4_4_1wahwahlgchos4f.R.inc(42050);assertEquals("-292275055-05-16T16:47:04.192Z", e.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(42051);DateTime f = new DateTime(ACTUAL_MIN_YEAR, 5, 16, 16, 47, 4, 191);
        __CLR4_4_1wahwahlgchos4f.R.inc(42052);assertEquals(new DateTime(Long.MIN_VALUE), f);
        __CLR4_4_1wahwahlgchos4f.R.inc(42053);assertEquals("-292275055-05-16T16:47:04.192Z", f.toString());
        // clamp to max
        __CLR4_4_1wahwahlgchos4f.R.inc(42054);DateTime g = new DateTime(ACTUAL_MIN_YEAR, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1wahwahlgchos4f.R.inc(42055);assertEquals(new DateTime(Long.MIN_VALUE), g);
        __CLR4_4_1wahwahlgchos4f.R.inc(42056);assertEquals("-292275055-05-16T16:47:04.192Z", g.toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_min_long() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ytau6wg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_min_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ytau6wg9(){try{__CLR4_4_1wahwahlgchos4f.R.inc(42057);
        __CLR4_4_1wahwahlgchos4f.R.inc(42058);assertEquals("-292275055-05-16T16:47:04.192-00:01:15", new DateTime(Long.MIN_VALUE + 75000).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42059);assertEquals("-292275055-05-16T16:48:19.191Z", new DateTime(Long.MIN_VALUE + 74999).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42060);assertEquals("-292275055-05-16T16:48:04.192Z", new DateTime(Long.MIN_VALUE + 60000).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42061);assertEquals("-292275055-05-16T16:47:05.192Z", new DateTime(Long.MIN_VALUE + 1000).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42062);assertEquals("-292275055-05-16T16:47:04.193Z", new DateTime(Long.MIN_VALUE + 1).toString());
        __CLR4_4_1wahwahlgchos4f.R.inc(42063);assertEquals("-292275055-05-16T16:47:04.192Z", new DateTime(Long.MIN_VALUE).toString());
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testPrintParseMin() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1naq0anwgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testPrintParseMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1naq0anwgg(){try{__CLR4_4_1wahwahlgchos4f.R.inc(42064);
        __CLR4_4_1wahwahlgchos4f.R.inc(42065);DateTime test1 = new DateTime(Long.MIN_VALUE);
        __CLR4_4_1wahwahlgchos4f.R.inc(42066);assertEquals(test1, DateTime.parse(test1.toString()));
        __CLR4_4_1wahwahlgchos4f.R.inc(42067);DateTime test2 = new DateTime(Long.valueOf(Long.MIN_VALUE));
        __CLR4_4_1wahwahlgchos4f.R.inc(42068);assertEquals(test2, DateTime.parse(test2.toString()));
        __CLR4_4_1wahwahlgchos4f.R.inc(42069);assertEquals(test2, test1);
    }finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

    @Test
    public void testDateTime_aroundZero() {__CLR4_4_1wahwahlgchos4f.R.globalSliceStart(getClass().getName(),42070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jke4iawgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wahwahlgchos4f.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wahwahlgchos4f.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMinMaxLong.testDateTime_aroundZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jke4iawgm(){try{__CLR4_4_1wahwahlgchos4f.R.inc(42070);
        __CLR4_4_1wahwahlgchos4f.R.inc(42071);DateTime base = new DateTime(1970, 1, 1, 1, 2, DateTimeZone.UTC);
        __CLR4_4_1wahwahlgchos4f.R.inc(42072);assertEquals(62 * 60000L, base.getMillis());
        __CLR4_4_1wahwahlgchos4f.R.inc(42073);for (int i = -23; (((i <= 23)&&(__CLR4_4_1wahwahlgchos4f.R.iget(42074)!=0|true))||(__CLR4_4_1wahwahlgchos4f.R.iget(42075)==0&false)); i++) {{
            __CLR4_4_1wahwahlgchos4f.R.inc(42076);DateTime dt = new DateTime(1970, 1, 1, 1, 2, DateTimeZone.forOffsetHours(i));
            __CLR4_4_1wahwahlgchos4f.R.inc(42077);assertEquals(base.getMillis() - i * 3600000L, dt.getMillis());
        }
    }}finally{__CLR4_4_1wahwahlgchos4f.R.flushNeeded();}}

}
