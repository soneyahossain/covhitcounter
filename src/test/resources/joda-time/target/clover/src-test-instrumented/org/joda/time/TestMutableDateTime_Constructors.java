/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Constructors {static class __CLR4_4_1yn0yn0lgchos7h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,45280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365;

    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1yn0yn0lgchos7h.R.inc(44892);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44893);TestMutableDateTime_Constructors TB = new TestMutableDateTime_Constructors();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44894);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44895);TB.testTest();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44896);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44897);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44898);TB.test_now();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44899);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44900);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44901);TB.test_now_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44902);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44903);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44904);TB.test_now_nullDateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44905);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44906);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44907);TB.test_now_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44908);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44909);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44910);TB.test_now_nullChronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44911);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44912);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44913);TB.testParse_noFormatter();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44914);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44915);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44916);TB.testParse_formatter();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44917);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44918);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44919);TB.testConstructor();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44920);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44921);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44922);TB.testConstructor_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44923);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44924);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44925);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44926);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44927);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44928);TB.testConstructor_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44929);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44930);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44931);TB.testConstructor_nullChronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44932);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44933);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44934);TB.testConstructor_long1();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44935);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44936);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44937);TB.testConstructor_long2();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44938);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44939);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44940);TB.testConstructor_long1_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44941);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44942);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44943);TB.testConstructor_long2_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44944);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44945);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44946);TB.testConstructor_long_nullDateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44947);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44948);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44949);TB.testConstructor_long1_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44950);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44951);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44952);TB.testConstructor_long2_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44953);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44954);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44955);TB.testConstructor_long_nullChronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44956);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44957);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44958);TB.testConstructor_Object();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44959);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44960);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44961);TB.testConstructor_invalidObject();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44962);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44963);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44964);TB.testConstructor_nullObject();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44965);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44966);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44967);TB.testConstructor_badconverterObject();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44968);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44969);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44970);TB.testConstructor_Object_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44971);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44972);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44973);TB.testConstructor_invalidObject_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44974);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44975);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44976);TB.testConstructor_nullObject_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44977);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44978);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44979);TB.testConstructor_Object_nullDateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44980);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44981);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44982);TB.testConstructor_nullObject_nullDateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44983);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44984);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44985);TB.testConstructor_badconverterObject_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44986);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44987);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44988);TB.testConstructor_Object_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44989);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44990);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44991);TB.testConstructor_invalidObject_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44992);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44993);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44994);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44995);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44996);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44997);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44998);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(44999);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45000);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45001);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45002);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45003);TB.testConstructor_badconverterObject_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45004);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45005);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45006);TB.testConstructor_int_int_int_int_int_int_int();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45007);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45008);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45009);TB.testConstructor_int_int_int_int_int_int_int_DateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45010);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45011);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45012);TB.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45013);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45014);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45015);TB.testConstructor_int_int_int_int_int_int_int_Chronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45016);TB.tearDown();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45017);TB.setUp();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45018);TB.testConstructor_int_int_int_int_int_int_int_nullChronology();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45019);TB.tearDown();

    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Constructors.class);
    }

    public TestMutableDateTime_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45020);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45021);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45022);zone = DateTimeZone.getDefault();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45023);locale = Locale.getDefault();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45024);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45025);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45026);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45027);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45028);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45029);DateTimeZone.setDefault(zone);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45030);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45031);Locale.setDefault(locale);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45032);zone = null;
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjyqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjyqx(){try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45033);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45034);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45035);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45036);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test now ()
     */
    @Test
    public void test_now() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0yr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0yr1() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45037);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45038);MutableDateTime test = MutableDateTime.now();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45039);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45040);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone)
     */
    @Test
    public void test_now_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbptoyr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbptoyr5() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45041);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45042);MutableDateTime test = MutableDateTime.now(PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45043);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45044);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone=null)
     */
    @Test
    public void test_now_nullDateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odm0k5yr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odm0k5yr9() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45045);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45046);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45047);MutableDateTime.now((DateTimeZone) null);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45048);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test now (Chronology)
     */
    @Test
    public void test_now_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ve3yrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ve3yrd() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45049);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45050);MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45051);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45052);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test now (Chronology=null)
     */
    @Test
    public void test_now_nullChronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4g1wyrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.test_now_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4g1wyrh() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45053);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45054);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45055);MutableDateTime.now((Chronology) null);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45056);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviyrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviyrl() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45057);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45058);assertEquals(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00"));
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45059);assertEquals(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50"));
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxyro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxyro() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45060);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45061);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45062);assertEquals(new MutableDateTime(2010, 6, 30, 13, 0, 0, 0, ISOChronology.getInstance(PARIS)), MutableDateTime.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hyrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hyrr() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45063);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45064);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45065);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45066);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5yrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5yrv() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45067);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45068);MutableDateTime test = new MutableDateTime(PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45069);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45070);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1royrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45071,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1royrz() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45071);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45072);MutableDateTime test = new MutableDateTime((DateTimeZone) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45073);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45074);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tiys3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tiys3() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45075);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45076);MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45077);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45078);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rys7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rys7() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45079);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45080);MutableDateTime test = new MutableDateTime((Chronology) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45081);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45082);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crysb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crysb() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45083);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45084);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45085);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45086);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaysf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaysf() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45087);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45088);MutableDateTime test = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45089);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45090);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9ysj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9ysj() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45091);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45092);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45093);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45094);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qysn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qysn() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45095);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45096);MutableDateTime test = new MutableDateTime(TEST_TIME2, PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45097);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45098);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    @Test
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9ysr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9ysr() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45099);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45100);MutableDateTime test = new MutableDateTime(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45101);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45102);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sysv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sysv() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45103);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45104);MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45105);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45106);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhysz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhysz() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45107);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45108);MutableDateTime test = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45109);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45110);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuyt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuyt3() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45111);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45112);MutableDateTime test = new MutableDateTime(TEST_TIME1, (Chronology) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45113);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45114);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebyt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebyt7() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45115);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45116);Date date = new Date(TEST_TIME1);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45117);MutableDateTime test = new MutableDateTime(date);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45118);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45119);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unayytc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unayytc() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45120);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45121);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45122);new MutableDateTime(new Object());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45123);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukytg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukytg() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45124);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45125);MutableDateTime test = new MutableDateTime((Object) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45126);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45127);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygytk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygytk() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45128);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45129);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45130);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45131);MutableDateTime test = new MutableDateTime(new Integer(0));
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45132);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45133);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45134);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrytr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrytr() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45135);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45136);Date date = new Date(TEST_TIME1);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45137);MutableDateTime test = new MutableDateTime(date, PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45138);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45139);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_invalidObject_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1un7r02ytw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_invalidObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1un7r02ytw() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45140);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45141);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45142);new MutableDateTime(new Object(), PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45143);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    @Test
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgyu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgyu0() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45144);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45145);MutableDateTime test = new MutableDateTime((Object) null, PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45146);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45147);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    @Test
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6yu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6yu4() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45148);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45149);Date date = new Date(TEST_TIME1);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45150);MutableDateTime test = new MutableDateTime(date, (DateTimeZone) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45151);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45152);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5yu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5yu9() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45153);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45154);MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45155);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45156);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp24vwyud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp24vwyud() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45157);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45158);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45159);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45160);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45161);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45162);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45163);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4yuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4yuk() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45164);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45165);Date date = new Date(TEST_TIME1);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45166);MutableDateTime test = new MutableDateTime(date, GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45167);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45168);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_invalidObject_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl36oxyup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_invalidObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl36oxyup() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45169);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45170);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45171);new MutableDateTime(new Object(), GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45172);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynyut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynyut() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45173);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45174);MutableDateTime test = new MutableDateTime((Object) null, GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45175);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45176);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzyux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzyux() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45177);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45178);Date date = new Date(TEST_TIME1);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45179);MutableDateTime test = new MutableDateTime(date, (Chronology) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45180);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45181);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0yv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0yv2() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45182);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45183);MutableDateTime test = new MutableDateTime((Object) null, (Chronology) null);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45184);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45185);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_badconverterObject_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyoqybyv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_badconverterObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyoqybyv6() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45186);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45187);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45188);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45189);MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45190);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45191);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45192);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int, int)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofcjttyvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofcjttyvd() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45193);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45194);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0);  // +01:00
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45195);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45196);assertEquals(LONDON, test.getZone());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45197);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45198);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45199);new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45200);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45201);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45202);new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45203);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45204);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45205);new MutableDateTime(2002, 0, 9, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45206);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45207);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45208);new MutableDateTime(2002, 13, 9, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45209);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45210);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45211);new MutableDateTime(2002, 6, 0, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45212);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45213);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45214);new MutableDateTime(2002, 6, 31, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45215);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45216);new MutableDateTime(2002, 7, 31, 0, 0, 0, 0);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45217);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45218);new MutableDateTime(2002, 7, 32, 0, 0, 0, 0);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45219);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1eacryw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1eacryw4() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45220);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45221);MutableDateTime test = new MutableDateTime(2002, 6, 9, 2, 0, 0, 0, PARIS);  // +02:00
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45222);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45223);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45224);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45225);new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45226);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45227);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45228);new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45229);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45230);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45231);new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45232);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45233);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45234);new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45235);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45236);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45237);new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45238);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45239);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45240);new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45241);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45242);new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, PARIS);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45243);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45244);new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, PARIS);
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45245);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ent58cywu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ent58cywu() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45246);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45247);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (DateTimeZone) null);  // +01:00
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45248);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45249);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jndkreywy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jndkreywy() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45250);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45251);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, GregorianChronology.getInstance());  // +01:00
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45252);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45253);assertEquals(TEST_TIME_NOW, test.getMillis());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45254);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45255);new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45256);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45257);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45258);new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45259);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45260);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45261);new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45262);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45263);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45264);new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45265);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45266);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45267);new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45268);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45269);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45270);new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45271);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45272);new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, GregorianChronology.getInstance());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45273);try {
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45274);new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, GregorianChronology.getInstance());
            __CLR4_4_1yn0yn0lgchos7h.R.inc(45275);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1yn0yn0lgchos7h.R.globalSliceStart(getClass().getName(),45276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbepkjyxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yn0yn0lgchos7h.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yn0yn0lgchos7h.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Constructors.testConstructor_int_int_int_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),45276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbepkjyxo() throws Throwable{try{__CLR4_4_1yn0yn0lgchos7h.R.inc(45276);
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45277);MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (Chronology) null);  // +01:00
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45278);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1yn0yn0lgchos7h.R.inc(45279);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1yn0yn0lgchos7h.R.flushNeeded();}}

}
