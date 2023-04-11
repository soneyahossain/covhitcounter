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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * This class is a Junit unit test for serialization.
 *
 * @author Stephen Colebourne
 */
public class TestSerialization {static class __CLR4_4_116fh16fhlgchosgf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,55220,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

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

//    private static class MockDelegatedDurationField extends DelegatedDurationField implements Serializable {
//        private static final long serialVersionUID = 1878496002811998493L;        
//        public MockDelegatedDurationField() {
//            super(MillisDurationField.INSTANCE);
//        }
//    }

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_116fh16fhlgchosgf.R.inc(54989);
        __CLR4_4_116fh16fhlgchosgf.R.inc(54990);TestSerialization TB = new TestSerialization();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54991);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54992);TB.testTest();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54993);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54994);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54995);TB.testSerializedInstant();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54996);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54997);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54998);TB.testSerializedDateTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(54999);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55000);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55001);TB.testSerializedDateTimeProperty();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55002);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55003);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55004);TB.testSerializedMutableDateTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55005);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55006);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55007);TB.testSerializedMutableDateTimeProperty();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55008);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55009);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55010);TB.testSerializedDateMidnight();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55011);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55012);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55013);TB.testSerializedDateMidnightProperty();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55014);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55015);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55016);TB.testSerializedLocalDate();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55017);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55018);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55019);TB.testSerializedLocalDateBuddhist();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55020);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55021);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55022);TB.testSerializedLocalTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55023);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55024);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55025);TB.testSerializedLocalDateTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55026);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55027);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55028);TB.testSerializedYearMonthDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55029);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55030);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55031);TB.testSerializedTimeOfDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55032);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55033);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55034);TB.testSerializedDateTimeZoneUTC();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55035);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55036);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55037);TB.testSerializedDateTimeZone();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55038);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55039);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55040);TB.testDuration();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55041);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55042);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55043);TB.testSerializedCopticChronology();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55044);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55045);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55046);TB.testSerializedISOChronology();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55047);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55048);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55049);TB.testSerializedGJChronology();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55050);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55051);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55052);TB.testSerializedGJChronologyChangedInternals();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55053);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55054);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55055);TB.testSerializedGregorianChronology();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55056);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55057);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55058);TB.testSerializedJulianChronology();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55059);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55060);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55061);TB.testSerializedBuddhistChronology();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55062);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55063);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55064);TB.testSerializedPeriodType();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55065);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55066);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55067);TB.testSerializedDateTimeFieldType();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55068);TB.tearDown();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55069);TB.setUp();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55070);TB.testSerializedUnsupportedDateTimeField();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55071);TB.tearDown();

    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestSerialization.class);
    }

    public TestSerialization(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_116fh16fhlgchosgf.R.inc(55072);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55073);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55074);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55075);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55076);originalLocale = Locale.getDefault();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55077);DateTimeZone.setDefault(LONDON);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55078);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_116fh16fhlgchosgf.R.inc(55079);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_116fh16fhlgchosgf.R.inc(55080);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55081);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55082);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55083);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55084);Locale.setDefault(originalLocale);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55085);originalDateTimeZone = null;
        __CLR4_4_116fh16fhlgchosgf.R.inc(55086);originalTimeZone = null;
        __CLR4_4_116fh16fhlgchosgf.R.inc(55087);originalLocale = null;
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj16i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj16i8(){try{__CLR4_4_116fh16fhlgchosgf.R.inc(55088);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55089);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_116fh16fhlgchosgf.R.inc(55090);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_116fh16fhlgchosgf.R.inc(55091);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerializedInstant() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzeqj216ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzeqj216ic() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55092);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55093);Instant test = new Instant();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55094);loadAndCompare(test, "Instant", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55095);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedDateTime() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124l36w16ig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124l36w16ig() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55096);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55097);DateTime test = new DateTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55098);loadAndCompare(test, "DateTime", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55099);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedDateTimeProperty() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1iyul16ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1iyul16ik() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55100);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55101);DateTime.Property test = new DateTime().hourOfDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55102);loadAndCompare(test, "DateTimeProperty", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55103);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedMutableDateTime() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogpxyq16io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogpxyq16io() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55104);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55105);MutableDateTime test = new MutableDateTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55106);loadAndCompare(test, "MutableDateTime", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55107);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedMutableDateTimeProperty() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uk9nk716is();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedMutableDateTimeProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uk9nk716is() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55108);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55109);MutableDateTime.Property test = new MutableDateTime().hourOfDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55110);loadAndCompare(test, "MutableDateTimeProperty", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55111);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testSerializedDateMidnight() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrer0b16iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrer0b16iw() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55112);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55113);DateMidnight test = new DateMidnight();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55114);loadAndCompare(test, "DateMidnight", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55115);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testSerializedDateMidnightProperty() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2igeo16j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateMidnightProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2igeo16j0() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55116);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55117);DateMidnight.Property test = new DateMidnight().monthOfYear();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55118);loadAndCompare(test, "DateMidnightProperty", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55119);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedLocalDate() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gax20m16j4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gax20m16j4() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55120);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55121);LocalDate test = new LocalDate();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55122);loadAndCompare(test, "LocalDate", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55123);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedLocalDateBuddhist() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nj2yn16j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateBuddhist",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nj2yn16j8() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55124);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55125);LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
        __CLR4_4_116fh16fhlgchosgf.R.inc(55126);loadAndCompare(test, "LocalDateBuddhist", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55127);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedLocalTime() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lpkhfb16jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lpkhfb16jc() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55128);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55129);LocalTime test = new LocalTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55130);loadAndCompare(test, "LocalTime", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55131);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedLocalDateTime() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoos4716jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoos4716jg() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55132);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55133);LocalDateTime test = new LocalDateTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55134);loadAndCompare(test, "LocalDateTime", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55135);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testSerializedYearMonthDay() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5u9hy16jk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5u9hy16jk() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55136);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55137);YearMonthDay test = new YearMonthDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55138);loadAndCompare(test, "YearMonthDay", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55139);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testSerializedTimeOfDay() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13i2and16jo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedTimeOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13i2and16jo() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55140);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55141);TimeOfDay test = new TimeOfDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55142);loadAndCompare(test, "TimeOfDay", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55143);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedDateTimeZoneUTC() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14y8w0e16js();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeZoneUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14y8w0e16js() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55144);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55145);DateTimeZone test = DateTimeZone.UTC;
        __CLR4_4_116fh16fhlgchosgf.R.inc(55146);loadAndCompare(test, "DateTimeZoneUTC", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55147);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedDateTimeZone() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qp0lgc16jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qp0lgc16jw() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55148);
        // have to re-get the zone, as TestDateTimeZone may have
        // changed the cache, or a SoftReference may have got cleared
        __CLR4_4_116fh16fhlgchosgf.R.inc(55149);DateTimeZone test = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_116fh16fhlgchosgf.R.inc(55150);loadAndCompare(test, "DateTimeZone", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55151);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testDuration() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gv0z0316k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testDuration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gv0z0316k0() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55152);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55153);Duration test = Duration.millis(12345);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55154);loadAndCompare(test, "Duration", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55155);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedCopticChronology() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kwap7j16k4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedCopticChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kwap7j16k4() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55156);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55157);CopticChronology test = CopticChronology.getInstance(LONDON);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55158);loadAndCompare(test, "CopticChronology", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55159);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedISOChronology() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111f82616k8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedISOChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111f82616k8() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55160);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55161);ISOChronology test = ISOChronology.getInstance(PARIS);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55162);loadAndCompare(test, "ISOChronology", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55163);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedGJChronology() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oq0rns16kc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oq0rns16kc() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55164);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55165);GJChronology test = GJChronology.getInstance(TOKYO);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55166);loadAndCompare(test, "GJChronology", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55167);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedGJChronologyChangedInternals() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ask92216kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGJChronologyChangedInternals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ask92216kg() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55168);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55169);GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55170);loadAndCompare(test, "GJChronologyChangedInternals", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55171);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedGregorianChronology() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180268f16kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedGregorianChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180268f16kk() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55172);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55173);GregorianChronology test = GregorianChronology.getInstance(PARIS);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55174);loadAndCompare(test, "GregorianChronology", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55175);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedJulianChronology() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1awloyy16ko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedJulianChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1awloyy16ko() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55176);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55177);JulianChronology test = JulianChronology.getInstance(PARIS);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55178);loadAndCompare(test, "JulianChronology", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55179);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedBuddhistChronology() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2ojoq16ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedBuddhistChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2ojoq16ks() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55180);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55181);BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55182);loadAndCompare(test, "BuddhistChronology", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55183);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedPeriodType() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2n5yg16kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2n5yg16kw() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55184);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55185);PeriodType test = PeriodType.dayTime();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55186);loadAndCompare(test, "PeriodType", false);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55187);inlineCompare(test, false);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedDateTimeFieldType() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjull616l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedDateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjull616l0() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55188);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55189);DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55190);loadAndCompare(test, "DateTimeFieldType", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55191);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    @Test
    public void testSerializedUnsupportedDateTimeField() throws Exception {__CLR4_4_116fh16fhlgchosgf.R.globalSliceStart(getClass().getName(),55192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llqh3b16l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_116fh16fhlgchosgf.R.rethrow($CLV_t2$);}finally{__CLR4_4_116fh16fhlgchosgf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestSerialization.testSerializedUnsupportedDateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llqh3b16l4() throws Exception{try{__CLR4_4_116fh16fhlgchosgf.R.inc(55192);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55193);UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
                DateTimeFieldType.year(),
                UnsupportedDurationField.getInstance(DurationFieldType.years()));
        __CLR4_4_116fh16fhlgchosgf.R.inc(55194);loadAndCompare(test, "UnsupportedDateTimeField", true);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55195);inlineCompare(test, true);
    }finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    private void loadAndCompare(Serializable test, String filename, boolean same) throws Exception {try{__CLR4_4_116fh16fhlgchosgf.R.inc(55196);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55197);FileInputStream fis = new FileInputStream("src/test/resources/" + filename + ".dat");
        __CLR4_4_116fh16fhlgchosgf.R.inc(55198);ObjectInputStream ois = new ObjectInputStream(fis);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55199);Object obj = ois.readObject();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55200);ois.close();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55201);if ((((same)&&(__CLR4_4_116fh16fhlgchosgf.R.iget(55202)!=0|true))||(__CLR4_4_116fh16fhlgchosgf.R.iget(55203)==0&false))) {{
            __CLR4_4_116fh16fhlgchosgf.R.inc(55204);assertSame(test, obj);
        } }else {{
            __CLR4_4_116fh16fhlgchosgf.R.inc(55205);assertEquals(test, obj);
        }
//        try {
//            fis = new FileInputStream("src/test/resources/" + filename + "2.dat");
//            ois = new ObjectInputStream(fis);
//            obj = ois.readObject();
//            ois.close();
//            if (same) {
//                assertSame(test, obj);
//            } else {
//                assertEquals(test, obj);
//            }
//        } catch (FileNotFoundException ex) {
//            // ignore
//        }
    }}finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

    public void inlineCompare(Serializable test, boolean same) throws Exception {try{__CLR4_4_116fh16fhlgchosgf.R.inc(55206);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55207);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55208);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55209);oos.writeObject(test);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55210);oos.close();

        __CLR4_4_116fh16fhlgchosgf.R.inc(55211);ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        __CLR4_4_116fh16fhlgchosgf.R.inc(55212);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_116fh16fhlgchosgf.R.inc(55213);Object obj = ois.readObject();
        __CLR4_4_116fh16fhlgchosgf.R.inc(55214);ois.close();

        __CLR4_4_116fh16fhlgchosgf.R.inc(55215);if ((((same)&&(__CLR4_4_116fh16fhlgchosgf.R.iget(55216)!=0|true))||(__CLR4_4_116fh16fhlgchosgf.R.iget(55217)==0&false))) {{
            __CLR4_4_116fh16fhlgchosgf.R.inc(55218);assertSame(test, obj);
        } }else {{
            __CLR4_4_116fh16fhlgchosgf.R.inc(55219);assertEquals(test, obj);
        }
    }}finally{__CLR4_4_116fh16fhlgchosgf.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    @Test public void testStoreSerializedInstant() throws Exception {
//        Instant test = new Instant();
//        store(test, "Instant.dat");
//    }
//
//    @Test public void testStoreSerializedDateTime() throws Exception {
//        DateTime test = new DateTime();
//        store(test, "DateTime.dat");
//    }
//
//    @Test public void testStoreSerializedMutableDateTime() throws Exception {
//        MutableDateTime test = new MutableDateTime();
//        store(test, "MutableDateTime.dat");
//    }
//
//    @Test public void testStoreSerializedDateMidnight() throws Exception {
//        DateMidnight test = new DateMidnight();
//        store(test, "DateMidnight.dat");
//    }
//
//    @Test public void testStoreSerializedLocalDate() throws Exception {
//        LocalDate test = new LocalDate();
//        store(test, "LocalDate.dat");
//    }
//
//    @Test public void testStoreSerializedLocalDateBuddhist() throws Exception {
//        LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC());
//        store(test, "LocalDateBuddhist.dat");
//    }
//
//    @Test public void testStoreSerializedLocalTime() throws Exception {
//        LocalTime test = new LocalTime();
//        store(test, "LocalTime.dat");
//    }
//
//    @Test public void testStoreSerializedLocalDateTime() throws Exception {
//        LocalDateTime test = new LocalDateTime();
//        store(test, "LocalDateTime.dat");
//    }
//
//    @Test public void testStoreSerializedYearMonthDay() throws Exception {
//        YearMonthDay test = new YearMonthDay();
//        store(test, "YearMonthDay.dat");
//    }
//
//    @Test public void testStoreSerializedYearMonthDayProperty() throws Exception {
//        YearMonthDay.Property test = new YearMonthDay().monthOfYear();
//        store(test, "YearMonthDayProperty.dat");
//    }
//
//    @Test public void testStoreSerializedTimeOfDay() throws Exception {
//        TimeOfDay test = new TimeOfDay();
//        store(test, "TimeOfDay.dat");
//    }
//
//    @Test public void testStoreSerializedTimeOfDayProperty() throws Exception {
//        TimeOfDay.Property test = new TimeOfDay().hourOfDay();
//        store(test, "TimeOfDayProperty.dat");
//    }
//
//    @Test public void testStoreSerializedDateTimeZoneUTC() throws Exception {
//        DateTimeZone test = DateTimeZone.UTC;
//        store(test, "DateTimeZoneUTC.dat");
//    }
//
//    @Test public void testStoreSerializedDateTimeZone() throws Exception {
//        DateTimeZone test = PARIS;
//        store(test, "DateTimeZone.dat");
//    }
//
//    @Test public void testStoreSerializedCopticChronology() throws Exception {
//        CopticChronology test = CopticChronology.getInstance(LONDON);
//        store(test, "CopticChronology.dat");
//    }
//
//    @Test public void testStoreSerializedISOChronology() throws Exception {
//        ISOChronology test = ISOChronology.getInstance(PARIS);
//        store(test, "ISOChronology.dat");
//    }
//
//    @Test public void testStoreSerializedGJChronology() throws Exception {
//        GJChronology test = GJChronology.getInstance(TOKYO);
//        store(test, "GJChronology.dat");
//    }
//
//    // Format changed in v1.2 - min days in first week not deserialized in v1.0/1.1
//    @Test public void testStoreSerializedGJChronologyChangedInternals() throws Exception {
//        GJChronology test = GJChronology.getInstance(PARIS, 123L, 2);
//        store(test, "GJChronologyChangedInternals.dat");
//    }
//
//    @Test public void testStoreSerializedGregorianChronology() throws Exception {
//        GregorianChronology test = GregorianChronology.getInstance(PARIS);
//        store(test, "GregorianChronology.dat");
//    }
//
//    @Test public void testStoreSerializedJulianChronology() throws Exception {
//        JulianChronology test = JulianChronology.getInstance(PARIS);
//        store(test, "JulianChronology.dat");
//    }
//
//    @Test public void testStoreSerializedBuddhistChronology() throws Exception {
//        BuddhistChronology test = BuddhistChronology.getInstance(PARIS);
//        store(test, "BuddhistChronology.dat");
//    }
//
//    @Test public void testStoreSerializedPeriodType() throws Exception {
//        PeriodType test = PeriodType.dayTime();
//        store(test, "PeriodType.dat");
//    }
//
//    @Test public void testStoreSerializedDateTimeFieldType() throws Exception {
//        DateTimeFieldType test = DateTimeFieldType.clockhourOfDay();
//        store(test, "DateTimeFieldType.dat");
//    }
//
//    @Test public void testStoreSerializedUnsupportedDateTimeField() throws Exception {
//        UnsupportedDateTimeField test = UnsupportedDateTimeField.getInstance(
//                DateTimeFieldType.year(),
//                UnsupportedDurationField.getInstance(DurationFieldType.years()));
//        store(test, "UnsupportedDateTimeField.dat");
//    }
//
//    @Test public void testStoreSerializedDurationFieldType() throws Exception {
//        DurationFieldType test = DurationFieldType.MINUTES_TYPE;
//        store(test, "DurationFieldType.dat");
//    }
//
//    @Test public void testStoreSerializedMillisDurationField() throws Exception {
//        MillisDurationField test = (MillisDurationField) MillisDurationField.INSTANCE;
//        store(test, "MillisDurationField.dat");
//    }
//
//    @Test public void testStoreSerializedDelegatedDurationField() throws Exception {
//        DelegatedDurationField test = new MockDelegatedDurationField();
//        store(test, "DelegatedDurationField.dat");
//    }
//
//    @Test public void testStoreSerializedUnsupportedDurationField() throws Exception {
//        UnsupportedDurationField test = UnsupportedDurationField.getInstance(DurationFieldType.eras());
//        store(test, "UnsupportedDurationField.dat");
//    }
//
    // format changed (properly defined) in v1.1
//    @Test public void testStoreSerializedDateTimeProperty() throws Exception {
//        DateTime.Property test = new DateTime().hourOfDay();
//        store(test, "DateTimeProperty.dat");
//    }
//
//    @Test public void testStoreSerializedMutableDateTimeProperty() throws Exception {
//        MutableDateTime.Property test = new MutableDateTime().hourOfDay();
//        store(test, "MutableDateTimeProperty.dat");
//    }
//
//    @Test public void testStoreSerializedDateMidnightProperty() throws Exception {
//        DateMidnight.Property test = new DateMidnight().monthOfYear();
//        store(test, "DateMidnightProperty.dat");
//    }
//
//    @Test public void testStoreSerializedDateMidnightProperty() throws Exception {
//        Duration test = Duration.millis(12345);
//        store(test, "Duration.dat");
//    }

//    private void store(Serializable test, String filename) throws Exception {
//        FileOutputStream fos = new FileOutputStream("src/test/resources/" + filename);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        try {
//            oos.writeObject(test);
//        } finally {
//            oos.close();
//        }
//        oos.close();
//    }

}
