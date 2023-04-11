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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.BasePeriod;

/**
 * This class is a Junit unit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Basics {static class __CLR4_4_110x110x1lgchosai{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,47976,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_110x110x1lgchosai.R.inc(47845);
        __CLR4_4_110x110x1lgchosai.R.inc(47846);TestMutablePeriod_Basics TB = new TestMutablePeriod_Basics();
        __CLR4_4_110x110x1lgchosai.R.inc(47847);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47848);TB.testTest();
        __CLR4_4_110x110x1lgchosai.R.inc(47849);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47850);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47851);TB.testGetPeriodType();
        __CLR4_4_110x110x1lgchosai.R.inc(47852);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47853);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47854);TB.testGetMethods();
        __CLR4_4_110x110x1lgchosai.R.inc(47855);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47856);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47857);TB.testEqualsHashCode();
        __CLR4_4_110x110x1lgchosai.R.inc(47858);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47859);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47860);TB.testSerialization();
        __CLR4_4_110x110x1lgchosai.R.inc(47861);TB.tearDown();
        //    TB.setUp(); TB.testAddTo1(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo2(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo3(); TB.tearDown();
        //    TB.setUp(); TB.testAddTo4(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology1(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology2(); TB.tearDown();
        //    TB.setUp(); TB.testAddToWithChronology3(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI1(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI2(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI3(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI4(); TB.tearDown();
        //    TB.setUp(); TB.testAddToRI5(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI1(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI2(); TB.tearDown();
        //    TB.setUp(); TB.testAddIntoRWI3(); TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47862);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47863);TB.testToString();
        __CLR4_4_110x110x1lgchosai.R.inc(47864);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47865);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47866);TB.testToPeriod();
        __CLR4_4_110x110x1lgchosai.R.inc(47867);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47868);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47869);TB.testToMutablePeriod();
        __CLR4_4_110x110x1lgchosai.R.inc(47870);TB.tearDown();
//    TB.setUp(); TB.testToDurationMillisFrom(); TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47871);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47872);TB.testToDurationFrom();
        __CLR4_4_110x110x1lgchosai.R.inc(47873);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47874);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47875);TB.testCopy();
        __CLR4_4_110x110x1lgchosai.R.inc(47876);TB.tearDown();
        __CLR4_4_110x110x1lgchosai.R.inc(47877);TB.setUp();
        __CLR4_4_110x110x1lgchosai.R.inc(47878);TB.testClone();
        __CLR4_4_110x110x1lgchosai.R.inc(47879);TB.tearDown();

    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestMutablePeriod_Basics.class);
    }

    public TestMutablePeriod_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_110x110x1lgchosai.R.inc(47880);
        __CLR4_4_110x110x1lgchosai.R.inc(47881);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_110x110x1lgchosai.R.inc(47882);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_110x110x1lgchosai.R.inc(47883);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_110x110x1lgchosai.R.inc(47884);originalLocale = Locale.getDefault();
        __CLR4_4_110x110x1lgchosai.R.inc(47885);DateTimeZone.setDefault(LONDON);
        __CLR4_4_110x110x1lgchosai.R.inc(47886);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_110x110x1lgchosai.R.inc(47887);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_110x110x1lgchosai.R.inc(47888);
        __CLR4_4_110x110x1lgchosai.R.inc(47889);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_110x110x1lgchosai.R.inc(47890);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_110x110x1lgchosai.R.inc(47891);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_110x110x1lgchosai.R.inc(47892);Locale.setDefault(originalLocale);
        __CLR4_4_110x110x1lgchosai.R.inc(47893);originalDateTimeZone = null;
        __CLR4_4_110x110x1lgchosai.R.inc(47894);originalTimeZone = null;
        __CLR4_4_110x110x1lgchosai.R.inc(47895);originalLocale = null;
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj10yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj10yg(){try{__CLR4_4_110x110x1lgchosai.R.inc(47896);
        __CLR4_4_110x110x1lgchosai.R.inc(47897);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_110x110x1lgchosai.R.inc(47898);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_110x110x1lgchosai.R.inc(47899);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ivat1i10yk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testGetPeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ivat1i10yk(){try{__CLR4_4_110x110x1lgchosai.R.inc(47900);
        __CLR4_4_110x110x1lgchosai.R.inc(47901);MutablePeriod test = new MutablePeriod();
        __CLR4_4_110x110x1lgchosai.R.inc(47902);assertEquals(PeriodType.standard(), test.getPeriodType());
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    @Test
    public void testGetMethods() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmz10yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmz10yn(){try{__CLR4_4_110x110x1lgchosai.R.inc(47903);
        __CLR4_4_110x110x1lgchosai.R.inc(47904);MutablePeriod test = new MutablePeriod();
        __CLR4_4_110x110x1lgchosai.R.inc(47905);assertEquals(0, test.getYears());
        __CLR4_4_110x110x1lgchosai.R.inc(47906);assertEquals(0, test.getMonths());
        __CLR4_4_110x110x1lgchosai.R.inc(47907);assertEquals(0, test.getDays());
        __CLR4_4_110x110x1lgchosai.R.inc(47908);assertEquals(0, test.getWeeks());
        __CLR4_4_110x110x1lgchosai.R.inc(47909);assertEquals(0, test.getDays());
        __CLR4_4_110x110x1lgchosai.R.inc(47910);assertEquals(0, test.getHours());
        __CLR4_4_110x110x1lgchosai.R.inc(47911);assertEquals(0, test.getMinutes());
        __CLR4_4_110x110x1lgchosai.R.inc(47912);assertEquals(0, test.getSeconds());
        __CLR4_4_110x110x1lgchosai.R.inc(47913);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7710yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7710yy(){try{__CLR4_4_110x110x1lgchosai.R.inc(47914);
        __CLR4_4_110x110x1lgchosai.R.inc(47915);MutablePeriod test1 = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47916);MutablePeriod test2 = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47917);assertEquals(true, test1.equals(test2));
        __CLR4_4_110x110x1lgchosai.R.inc(47918);assertEquals(true, test2.equals(test1));
        __CLR4_4_110x110x1lgchosai.R.inc(47919);assertEquals(true, test1.equals(test1));
        __CLR4_4_110x110x1lgchosai.R.inc(47920);assertEquals(true, test2.equals(test2));
        __CLR4_4_110x110x1lgchosai.R.inc(47921);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_110x110x1lgchosai.R.inc(47922);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_110x110x1lgchosai.R.inc(47923);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_110x110x1lgchosai.R.inc(47924);MutablePeriod test3 = new MutablePeriod(321L);
        __CLR4_4_110x110x1lgchosai.R.inc(47925);assertEquals(false, test1.equals(test3));
        __CLR4_4_110x110x1lgchosai.R.inc(47926);assertEquals(false, test2.equals(test3));
        __CLR4_4_110x110x1lgchosai.R.inc(47927);assertEquals(false, test3.equals(test1));
        __CLR4_4_110x110x1lgchosai.R.inc(47928);assertEquals(false, test3.equals(test2));
        __CLR4_4_110x110x1lgchosai.R.inc(47929);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_110x110x1lgchosai.R.inc(47930);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_110x110x1lgchosai.R.inc(47931);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_110x110x1lgchosai.R.inc(47932);assertEquals(true, test1.equals(new MockMutablePeriod(123L)));
        __CLR4_4_110x110x1lgchosai.R.inc(47933);assertEquals(false, test1.equals(new Period(123L, PeriodType.dayTime())));
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    class MockMutablePeriod extends BasePeriod {
        public MockMutablePeriod(long value) {
            super(value, null, null);__CLR4_4_110x110x1lgchosai.R.inc(47935);try{__CLR4_4_110x110x1lgchosai.R.inc(47934);
        }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on910zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on910zk() throws Exception{try{__CLR4_4_110x110x1lgchosai.R.inc(47936);
        __CLR4_4_110x110x1lgchosai.R.inc(47937);MutablePeriod test = new MutablePeriod(123L);

        __CLR4_4_110x110x1lgchosai.R.inc(47938);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_110x110x1lgchosai.R.inc(47939);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_110x110x1lgchosai.R.inc(47940);oos.writeObject(test);
        __CLR4_4_110x110x1lgchosai.R.inc(47941);oos.close();
        __CLR4_4_110x110x1lgchosai.R.inc(47942);byte[] bytes = baos.toByteArray();

        __CLR4_4_110x110x1lgchosai.R.inc(47943);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_110x110x1lgchosai.R.inc(47944);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_110x110x1lgchosai.R.inc(47945);MutablePeriod result = (MutablePeriod) ois.readObject();
        __CLR4_4_110x110x1lgchosai.R.inc(47946);ois.close();

        __CLR4_4_110x110x1lgchosai.R.inc(47947);assertEquals(test, result);
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    @Test public void testAddTo1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, -2);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo3() {
//        long expected = TEST_TIME_NOW;
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 0);
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddTo4() {
//        long expected = TEST_TIME_NOW + 100L;
//        MutablePeriod test = new MutablePeriod(100L);
//        long added = test.addTo(TEST_TIME_NOW, 1);
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddToWithChronology1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        long added = test.addTo(TEST_TIME_NOW, 1, ISOChronology.getInstance());
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddToWithChronology2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, ISOChronology.getInstanceUTC());  // chrono specified so use it
//        assertEquals(expected, added);
//    }
//    
//    @Test public void testAddToWithChronology3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        long added = test.addTo(TEST_TIME_NOW, -2, null);  // no chrono so use default
//        assertEquals(expected, added);
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddToRI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        DateTime added = test.addTo(new Instant(), 1);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new Instant(), -2);  // Instant has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI3() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstanceUTC().years().add(expected, -2);
//        expected = ISOChronology.getInstanceUTC().months().add(expected, -4);
//        expected = ISOChronology.getInstanceUTC().weeks().add(expected, -6);
//        expected = ISOChronology.getInstanceUTC().days().add(expected, -8);
//        expected = ISOChronology.getInstanceUTC().hours().add(expected, -10);
//        expected = ISOChronology.getInstanceUTC().minutes().add(expected, -12);
//        expected = ISOChronology.getInstanceUTC().seconds().add(expected, -14);
//        expected = ISOChronology.getInstanceUTC().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(ISOChronology.getInstanceUTC()), -2);  // DateTime has UTC time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstanceUTC(), added.getChronology());
//    }
//    
//    @Test public void testAddToRI4() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance(PARIS).years().add(expected, -2);
//        expected = ISOChronology.getInstance(PARIS).months().add(expected, -4);
//        expected = ISOChronology.getInstance(PARIS).weeks().add(expected, -6);
//        expected = ISOChronology.getInstance(PARIS).days().add(expected, -8);
//        expected = ISOChronology.getInstance(PARIS).hours().add(expected, -10);
//        expected = ISOChronology.getInstance(PARIS).minutes().add(expected, -12);
//        expected = ISOChronology.getInstance(PARIS).seconds().add(expected, -14);
//        expected = ISOChronology.getInstance(PARIS).millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(new DateTime(PARIS), -2);  // DateTime has PARIS time zone
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(PARIS), added.getChronology());
//    }
//    
//    @Test public void testAddToRI5() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        DateTime added = test.addTo(null, -2);  // null has no time zone, use default
//        assertEquals(expected, added.getMillis());
//        assertEquals(ISOChronology.getInstance(), added.getChronology());
//    }
//    
//    //-----------------------------------------------------------------------
//    @Test public void testAddIntoRWI1() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, 1);
//        expected = ISOChronology.getInstance().months().add(expected, 2);
//        expected = ISOChronology.getInstance().weeks().add(expected, 3);
//        expected = ISOChronology.getInstance().days().add(expected, 4);
//        expected = ISOChronology.getInstance().hours().add(expected, 5);
//        expected = ISOChronology.getInstance().minutes().add(expected, 6);
//        expected = ISOChronology.getInstance().seconds().add(expected, 7);
//        expected = ISOChronology.getInstance().millis().add(expected, 8);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, 1);
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    @Test public void testAddIntoRWI2() {
//        long expected = TEST_TIME_NOW;
//        expected = ISOChronology.getInstance().years().add(expected, -2);
//        expected = ISOChronology.getInstance().months().add(expected, -4);
//        expected = ISOChronology.getInstance().weeks().add(expected, -6);
//        expected = ISOChronology.getInstance().days().add(expected, -8);
//        expected = ISOChronology.getInstance().hours().add(expected, -10);
//        expected = ISOChronology.getInstance().minutes().add(expected, -12);
//        expected = ISOChronology.getInstance().seconds().add(expected, -14);
//        expected = ISOChronology.getInstance().millis().add(expected, -16);
//        
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
//        MutableDateTime mdt = new MutableDateTime();
//        test.addInto(mdt, -2);  // MutableDateTime has a chronology, use it
//        assertEquals(expected, mdt.getMillis());
//    }
//    
//    @Test public void testAddIntoRWI3() {
//        MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
//        try {
//            test.addInto(null, 1);
//            fail();
//        } catch (IllegalArgumentException ex) {}
//    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid10zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid10zw(){try{__CLR4_4_110x110x1lgchosai.R.inc(47948);
        __CLR4_4_110x110x1lgchosai.R.inc(47949);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_110x110x1lgchosai.R.inc(47950);assertEquals("P1Y2M3W4DT5H6M7.008S", test.toString());

        __CLR4_4_110x110x1lgchosai.R.inc(47951);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0);
        __CLR4_4_110x110x1lgchosai.R.inc(47952);assertEquals("PT0S", test.toString());

        __CLR4_4_110x110x1lgchosai.R.inc(47953);test = new MutablePeriod(12345L);
        __CLR4_4_110x110x1lgchosai.R.inc(47954);assertEquals("PT12.345S", test.toString());
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk171103();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk171103(){try{__CLR4_4_110x110x1lgchosai.R.inc(47955);
        __CLR4_4_110x110x1lgchosai.R.inc(47956);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47957);Period result = test.toPeriod();
        __CLR4_4_110x110x1lgchosai.R.inc(47958);assertEquals(test, result);
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    @Test
    public void testToMutablePeriod() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2j331107();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2j331107(){try{__CLR4_4_110x110x1lgchosai.R.inc(47959);
        __CLR4_4_110x110x1lgchosai.R.inc(47960);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47961);MutablePeriod result = test.toMutablePeriod();
        __CLR4_4_110x110x1lgchosai.R.inc(47962);assertEquals(test, result);
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    //-----------------------------------------------------------------------
//    @Test public void testToDurationMillisFrom() {
//        MutablePeriod test = new MutablePeriod(123L);
//        assertEquals(123L, test.toDurationMillisFrom(0L, null));
//    }

    @Test
    public void testToDurationFrom() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkq832110b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testToDurationFrom",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkq832110b(){try{__CLR4_4_110x110x1lgchosai.R.inc(47963);
        __CLR4_4_110x110x1lgchosai.R.inc(47964);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47965);assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCopy() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a110e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a110e(){try{__CLR4_4_110x110x1lgchosai.R.inc(47966);
        __CLR4_4_110x110x1lgchosai.R.inc(47967);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47968);MutablePeriod copy = test.copy();
        __CLR4_4_110x110x1lgchosai.R.inc(47969);assertEquals(test.getPeriodType(), copy.getPeriodType());
        __CLR4_4_110x110x1lgchosai.R.inc(47970);assertEquals(test, copy);
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClone() {__CLR4_4_110x110x1lgchosai.R.globalSliceStart(getClass().getName(),47971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejy110j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_110x110x1lgchosai.R.rethrow($CLV_t2$);}finally{__CLR4_4_110x110x1lgchosai.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Basics.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejy110j(){try{__CLR4_4_110x110x1lgchosai.R.inc(47971);
        __CLR4_4_110x110x1lgchosai.R.inc(47972);MutablePeriod test = new MutablePeriod(123L);
        __CLR4_4_110x110x1lgchosai.R.inc(47973);MutablePeriod copy = (MutablePeriod) test.clone();
        __CLR4_4_110x110x1lgchosai.R.inc(47974);assertEquals(test.getPeriodType(), copy.getPeriodType());
        __CLR4_4_110x110x1lgchosai.R.inc(47975);assertEquals(test, copy);
    }finally{__CLR4_4_110x110x1lgchosai.R.flushNeeded();}}

}
