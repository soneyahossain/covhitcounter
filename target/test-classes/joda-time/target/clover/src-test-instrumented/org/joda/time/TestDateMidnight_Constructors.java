/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Constructors {static class __CLR4_4_1if0if0lgchorhc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,24274,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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
            366 + 365 + 365 + 0;

    // 2002-06-09
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME_NOW_PARIS =
            TEST_TIME_NOW_UTC - 2 * DateTimeConstants.MILLIS_PER_HOUR;

    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - 2 * DateTimeConstants.MILLIS_PER_HOUR;

    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    - 2 * DateTimeConstants.MILLIS_PER_HOUR;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1if0if0lgchorhc.R.inc(23868);
        __CLR4_4_1if0if0lgchorhc.R.inc(23869);TestDateMidnight_Constructors TB = new TestDateMidnight_Constructors();
        __CLR4_4_1if0if0lgchorhc.R.inc(23870);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23871);TB.testTest();
        __CLR4_4_1if0if0lgchorhc.R.inc(23872);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23873);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23874);TB.test_now();
        __CLR4_4_1if0if0lgchorhc.R.inc(23875);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23876);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23877);TB.test_now_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23878);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23879);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23880);TB.test_now_nullDateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23881);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23882);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23883);TB.test_now_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23884);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23885);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23886);TB.test_now_nullChronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23887);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23888);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23889);TB.testParse_noFormatter();
        __CLR4_4_1if0if0lgchorhc.R.inc(23890);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23891);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23892);TB.testParse_formatter();
        __CLR4_4_1if0if0lgchorhc.R.inc(23893);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23894);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23895);TB.testConstructor();
        __CLR4_4_1if0if0lgchorhc.R.inc(23896);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23897);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23898);TB.testConstructor_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23899);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23900);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23901);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23902);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23903);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23904);TB.testConstructor_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23905);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23906);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23907);TB.testConstructor_nullChronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23908);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23909);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23910);TB.testConstructor_long1();
        __CLR4_4_1if0if0lgchorhc.R.inc(23911);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23912);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23913);TB.testConstructor_long2();
        __CLR4_4_1if0if0lgchorhc.R.inc(23914);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23915);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23916);TB.testConstructor_long1_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23917);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23918);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23919);TB.testConstructor_long2_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23920);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23921);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23922);TB.testConstructor_long_nullDateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23923);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23924);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23925);TB.testConstructor_long1_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23926);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23927);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23928);TB.testConstructor_long2_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23929);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23930);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23931);TB.testConstructor_long_nullChronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23932);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23933);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23934);TB.testConstructor_Object();
        __CLR4_4_1if0if0lgchorhc.R.inc(23935);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23936);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23937);TB.testConstructor_invalidObject();
        __CLR4_4_1if0if0lgchorhc.R.inc(23938);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23939);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23940);TB.testConstructor_nullObject();
        __CLR4_4_1if0if0lgchorhc.R.inc(23941);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23942);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23943);TB.testConstructor_badconverterObject();
        __CLR4_4_1if0if0lgchorhc.R.inc(23944);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23945);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23946);TB.testConstructor_Object_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23947);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23948);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23949);TB.testConstructor_invalidObject_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23950);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23951);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23952);TB.testConstructor_nullObject_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23953);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23954);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23955);TB.testConstructor_Object_nullDateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23956);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23957);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23958);TB.testConstructor_nullObject_nullDateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23959);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23960);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23961);TB.testConstructor_badconverterObject_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23962);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23963);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23964);TB.testConstructor_Object_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23965);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23966);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23967);TB.testConstructor_invalidObject_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23968);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23969);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23970);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23971);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23972);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23973);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23974);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23975);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23976);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23977);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23978);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23979);TB.testConstructor_badconverterObject_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23980);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23981);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23982);TB.testConstructor_int_int_int();
        __CLR4_4_1if0if0lgchorhc.R.inc(23983);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23984);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23985);TB.testConstructor_int_int_int_DateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23986);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23987);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23988);TB.testConstructor_int_int_int_nullDateTimeZone();
        __CLR4_4_1if0if0lgchorhc.R.inc(23989);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23990);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23991);TB.testConstructor_int_int_int_Chronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23992);TB.tearDown();
        __CLR4_4_1if0if0lgchorhc.R.inc(23993);TB.setUp();
        __CLR4_4_1if0if0lgchorhc.R.inc(23994);TB.testConstructor_int_int_int_nullChronology();
        __CLR4_4_1if0if0lgchorhc.R.inc(23995);TB.tearDown();

    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Constructors.class);
    }

    public TestDateMidnight_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1if0if0lgchorhc.R.inc(23996);
        __CLR4_4_1if0if0lgchorhc.R.inc(23997);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(23998);zone = DateTimeZone.getDefault();
        __CLR4_4_1if0if0lgchorhc.R.inc(23999);locale = Locale.getDefault();
        __CLR4_4_1if0if0lgchorhc.R.inc(24000);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1if0if0lgchorhc.R.inc(24001);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1if0if0lgchorhc.R.inc(24002);
        __CLR4_4_1if0if0lgchorhc.R.inc(24003);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1if0if0lgchorhc.R.inc(24004);DateTimeZone.setDefault(zone);
        __CLR4_4_1if0if0lgchorhc.R.inc(24005);Locale.setDefault(locale);
        __CLR4_4_1if0if0lgchorhc.R.inc(24006);zone = null;
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjiiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjiiv(){try{__CLR4_4_1if0if0lgchorhc.R.inc(24007);
        __CLR4_4_1if0if0lgchorhc.R.inc(24008);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW_UTC).toString());
        __CLR4_4_1if0if0lgchorhc.R.inc(24009);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1_UTC).toString());
        __CLR4_4_1if0if0lgchorhc.R.inc(24010);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2_UTC).toString());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test now ()
     */
    @Test
    public void test_now() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0iiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0iiz() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24011);
        __CLR4_4_1if0if0lgchorhc.R.inc(24012);DateMidnight test = DateMidnight.now();
        __CLR4_4_1if0if0lgchorhc.R.inc(24013);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24014);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24015);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24016);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24017);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone)
     */
    @Test
    public void test_now_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbptoij6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbptoij6() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24018);
        __CLR4_4_1if0if0lgchorhc.R.inc(24019);DateMidnight test = DateMidnight.now(PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24020);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24021);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test now (DateTimeZone=null)
     */
    @Test
    public void test_now_nullDateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odm0k5ija();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odm0k5ija() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24022);
        __CLR4_4_1if0if0lgchorhc.R.inc(24023);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24024);DateMidnight.now((DateTimeZone) null);
            __CLR4_4_1if0if0lgchorhc.R.inc(24025);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test now (Chronology)
     */
    @Test
    public void test_now_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n9ve3ije();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n9ve3ije() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24026);
        __CLR4_4_1if0if0lgchorhc.R.inc(24027);DateMidnight test = DateMidnight.now(GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24028);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24029);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test now (Chronology=null)
     */
    @Test
    public void test_now_nullChronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ge4g1wiji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.test_now_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ge4g1wiji() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24030);
        __CLR4_4_1if0if0lgchorhc.R.inc(24031);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24032);DateMidnight.now((Chronology) null);
            __CLR4_4_1if0if0lgchorhc.R.inc(24033);fail();
        } catch (NullPointerException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviijm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviijm() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24034);
        __CLR4_4_1if0if0lgchorhc.R.inc(24035);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-06-30"));
        __CLR4_4_1if0if0lgchorhc.R.inc(24036);assertEquals(new DateMidnight(2010, 1, 2, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-002"));
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxijp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxijp() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24037);
        __CLR4_4_1if0if0lgchorhc.R.inc(24038);assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM")));
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hijr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hijr() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24039);
        __CLR4_4_1if0if0lgchorhc.R.inc(24040);DateMidnight test = new DateMidnight();
        __CLR4_4_1if0if0lgchorhc.R.inc(24041);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24042);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24043);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24044);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24045);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5ijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5ijy() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24046);
        __CLR4_4_1if0if0lgchorhc.R.inc(24047);DateMidnight test = new DateMidnight(PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24048);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24049);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1roik2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1roik2() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24050);
        __CLR4_4_1if0if0lgchorhc.R.inc(24051);DateMidnight test = new DateMidnight((DateTimeZone) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24052);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24053);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tiik6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tiik6() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24054);
        __CLR4_4_1if0if0lgchorhc.R.inc(24055);DateMidnight test = new DateMidnight(GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24056);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24057);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rika();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rika() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24058);
        __CLR4_4_1if0if0lgchorhc.R.inc(24059);DateMidnight test = new DateMidnight((Chronology) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24060);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24061);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crike();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crike() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24062);
        __CLR4_4_1if0if0lgchorhc.R.inc(24063);DateMidnight test = new DateMidnight(TEST_TIME1_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24064);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24065);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaiki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaiki() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24066);
        __CLR4_4_1if0if0lgchorhc.R.inc(24067);DateMidnight test = new DateMidnight(TEST_TIME2_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24068);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24069);assertEquals(TEST_TIME2_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9ikm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9ikm() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24070);
        __CLR4_4_1if0if0lgchorhc.R.inc(24071);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24072);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24073);assertEquals(TEST_TIME1_PARIS, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone)
     */
    @Test
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qikq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qikq() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24074);
        __CLR4_4_1if0if0lgchorhc.R.inc(24075);DateMidnight test = new DateMidnight(TEST_TIME2_UTC, PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24076);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24077);assertEquals(TEST_TIME2_PARIS, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    @Test
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9iku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9iku() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24078);
        __CLR4_4_1if0if0lgchorhc.R.inc(24079);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (DateTimeZone) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24080);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24081);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5siky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5siky() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24082);
        __CLR4_4_1if0if0lgchorhc.R.inc(24083);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24084);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24085);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhil2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhil2() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24086);
        __CLR4_4_1if0if0lgchorhc.R.inc(24087);DateMidnight test = new DateMidnight(TEST_TIME2_UTC, GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24088);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24089);assertEquals(TEST_TIME2_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuil6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuil6() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24090);
        __CLR4_4_1if0if0lgchorhc.R.inc(24091);DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (Chronology) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24092);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24093);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebila();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebila() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24094);
        __CLR4_4_1if0if0lgchorhc.R.inc(24095);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24096);DateMidnight test = new DateMidnight(date);
        __CLR4_4_1if0if0lgchorhc.R.inc(24097);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24098);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unayilf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unayilf() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24099);
        __CLR4_4_1if0if0lgchorhc.R.inc(24100);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24101);new DateMidnight(new Object());
            __CLR4_4_1if0if0lgchorhc.R.inc(24102);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukilj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukilj() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24103);
        __CLR4_4_1if0if0lgchorhc.R.inc(24104);DateMidnight test = new DateMidnight((Object) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24105);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24106);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygiln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygiln() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24107);
        __CLR4_4_1if0if0lgchorhc.R.inc(24108);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24109);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1if0if0lgchorhc.R.inc(24110);DateMidnight test = new DateMidnight(new Integer(0));
            __CLR4_4_1if0if0lgchorhc.R.inc(24111);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1if0if0lgchorhc.R.inc(24112);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            __CLR4_4_1if0if0lgchorhc.R.inc(24113);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrilu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrilu() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24114);
        __CLR4_4_1if0if0lgchorhc.R.inc(24115);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24116);DateMidnight test = new DateMidnight(date, PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24117);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24118);assertEquals(TEST_TIME1_PARIS, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_invalidObject_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1un7r02ilz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_invalidObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1un7r02ilz() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24119);
        __CLR4_4_1if0if0lgchorhc.R.inc(24120);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24121);new DateMidnight(new Object(), PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24122);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    @Test
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowgim3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowgim3() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24123);
        __CLR4_4_1if0if0lgchorhc.R.inc(24124);DateMidnight test = new DateMidnight((Object) null, PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24125);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24126);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    @Test
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6im7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6im7() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24127);
        __CLR4_4_1if0if0lgchorhc.R.inc(24128);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24129);DateMidnight test = new DateMidnight(date, (DateTimeZone) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24130);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24131);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5imc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5imc() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24132);
        __CLR4_4_1if0if0lgchorhc.R.inc(24133);DateMidnight test = new DateMidnight((Object) null, (DateTimeZone) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24134);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24135);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, DateTimeZone)
     */
    @Test
    public void testConstructor_badconverterObject_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bp24vwimg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bp24vwimg() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24136);
        __CLR4_4_1if0if0lgchorhc.R.inc(24137);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24138);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1if0if0lgchorhc.R.inc(24139);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24140);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1if0if0lgchorhc.R.inc(24141);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            __CLR4_4_1if0if0lgchorhc.R.inc(24142);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4imn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4imn() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24143);
        __CLR4_4_1if0if0lgchorhc.R.inc(24144);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24145);DateMidnight test = new DateMidnight(date, GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24146);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24147);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_invalidObject_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fl36oxims();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_invalidObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fl36oxims() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24148);
        __CLR4_4_1if0if0lgchorhc.R.inc(24149);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24150);new DateMidnight(new Object(), GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24151);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynimw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynimw() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24152);
        __CLR4_4_1if0if0lgchorhc.R.inc(24153);DateMidnight test = new DateMidnight((Object) null, GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24154);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24155);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzin0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzin0() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24156);
        __CLR4_4_1if0if0lgchorhc.R.inc(24157);Date date = new Date(TEST_TIME1_UTC);
        __CLR4_4_1if0if0lgchorhc.R.inc(24158);DateMidnight test = new DateMidnight(date, (Chronology) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24159);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24160);assertEquals(TEST_TIME1_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0in5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0in5() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24161);
        __CLR4_4_1if0if0lgchorhc.R.inc(24162);DateMidnight test = new DateMidnight((Object) null, (Chronology) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24163);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24164);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_badconverterObject_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyoqybin9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_badconverterObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyoqybin9() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24165);
        __CLR4_4_1if0if0lgchorhc.R.inc(24166);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24167);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1if0if0lgchorhc.R.inc(24168);DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24169);assertEquals(ISOChronology.getInstance(), test.getChronology());
            __CLR4_4_1if0if0lgchorhc.R.inc(24170);assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis());
        } finally {
            __CLR4_4_1if0if0lgchorhc.R.inc(24171);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int, int)
     */
    @Test
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqning();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqning() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24172);
        __CLR4_4_1if0if0lgchorhc.R.inc(24173);DateMidnight test = new DateMidnight(2002, 6, 9);
        __CLR4_4_1if0if0lgchorhc.R.inc(24174);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24175);assertEquals(LONDON, test.getZone());
        __CLR4_4_1if0if0lgchorhc.R.inc(24176);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24177);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24178);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24179);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1if0if0lgchorhc.R.inc(24180);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24181);new DateMidnight(Integer.MIN_VALUE, 6, 9);
            __CLR4_4_1if0if0lgchorhc.R.inc(24182);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24183);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24184);new DateMidnight(Integer.MAX_VALUE, 6, 9);
            __CLR4_4_1if0if0lgchorhc.R.inc(24185);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24186);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24187);new DateMidnight(2002, 0, 9);
            __CLR4_4_1if0if0lgchorhc.R.inc(24188);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24189);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24190);new DateMidnight(2002, 13, 9);
            __CLR4_4_1if0if0lgchorhc.R.inc(24191);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24192);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24193);new DateMidnight(2002, 6, 0);
            __CLR4_4_1if0if0lgchorhc.R.inc(24194);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24195);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24196);new DateMidnight(2002, 6, 31);
            __CLR4_4_1if0if0lgchorhc.R.inc(24197);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24198);new DateMidnight(2002, 7, 31);
        __CLR4_4_1if0if0lgchorhc.R.inc(24199);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24200);new DateMidnight(2002, 7, 32);
            __CLR4_4_1if0if0lgchorhc.R.inc(24201);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    @Test
    public void testConstructor_int_int_int_DateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzpqz9ioa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzpqz9ioa() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24202);
        __CLR4_4_1if0if0lgchorhc.R.inc(24203);DateMidnight test = new DateMidnight(2002, 6, 9, PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24204);assertEquals(ISOChronology.getInstance(PARIS), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24205);assertEquals(TEST_TIME_NOW_PARIS, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24206);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24207);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24208);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1if0if0lgchorhc.R.inc(24209);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24210);new DateMidnight(Integer.MIN_VALUE, 6, 9, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24211);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24212);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24213);new DateMidnight(Integer.MAX_VALUE, 6, 9, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24214);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24215);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24216);new DateMidnight(2002, 0, 9, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24217);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24218);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24219);new DateMidnight(2002, 13, 9, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24220);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24221);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24222);new DateMidnight(2002, 6, 0, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24223);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24224);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24225);new DateMidnight(2002, 6, 31, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24226);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24227);new DateMidnight(2002, 7, 31, PARIS);
        __CLR4_4_1if0if0lgchorhc.R.inc(24228);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24229);new DateMidnight(2002, 7, 32, PARIS);
            __CLR4_4_1if0if0lgchorhc.R.inc(24230);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    @Test
    public void testConstructor_int_int_int_nullDateTimeZone() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180awskip3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180awskip3() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24231);
        __CLR4_4_1if0if0lgchorhc.R.inc(24232);DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24233);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24234);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24235);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24236);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24237);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzqipa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzqipa() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24238);
        __CLR4_4_1if0if0lgchorhc.R.inc(24239);DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24240);assertEquals(GregorianChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24241);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24242);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24243);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24244);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1if0if0lgchorhc.R.inc(24245);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24246);new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24247);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24248);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24249);new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24250);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24251);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24252);new DateMidnight(2002, 0, 9, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24253);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24254);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24255);new DateMidnight(2002, 13, 9, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24256);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24257);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24258);new DateMidnight(2002, 6, 0, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24259);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24260);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24261);new DateMidnight(2002, 6, 31, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24262);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1if0if0lgchorhc.R.inc(24263);new DateMidnight(2002, 7, 31, GregorianChronology.getInstance());
        __CLR4_4_1if0if0lgchorhc.R.inc(24264);try {
            __CLR4_4_1if0if0lgchorhc.R.inc(24265);new DateMidnight(2002, 7, 32, GregorianChronology.getInstance());
            __CLR4_4_1if0if0lgchorhc.R.inc(24266);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1if0if0lgchorhc.R.globalSliceStart(getClass().getName(),24267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gtiq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1if0if0lgchorhc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1if0if0lgchorhc.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateMidnight_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gtiq3() throws Throwable{try{__CLR4_4_1if0if0lgchorhc.R.inc(24267);
        __CLR4_4_1if0if0lgchorhc.R.inc(24268);DateMidnight test = new DateMidnight(2002, 6, 9, (Chronology) null);
        __CLR4_4_1if0if0lgchorhc.R.inc(24269);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1if0if0lgchorhc.R.inc(24270);assertEquals(TEST_TIME_NOW_LONDON, test.getMillis());
        __CLR4_4_1if0if0lgchorhc.R.inc(24271);assertEquals(2002, test.getYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24272);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1if0if0lgchorhc.R.inc(24273);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1if0if0lgchorhc.R.flushNeeded();}}

}
