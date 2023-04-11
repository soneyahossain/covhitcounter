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

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;

/**
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestChronology {static class __CLR4_4_1hokhoklgchorf1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,23049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1hokhoklgchorf1.R.inc(22916);
        __CLR4_4_1hokhoklgchorf1.R.inc(22917);TestChronology TB = new TestChronology();

        __CLR4_4_1hokhoklgchorf1.R.inc(22918);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22919);TB.testTest();
        __CLR4_4_1hokhoklgchorf1.R.inc(22920);TB.tearDown();
        __CLR4_4_1hokhoklgchorf1.R.inc(22921);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22922);TB.testEqualsHashCode_ISO();
        __CLR4_4_1hokhoklgchorf1.R.inc(22923);TB.tearDown();
        __CLR4_4_1hokhoklgchorf1.R.inc(22924);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22925);TB.testEqualsHashCode_Lenient();
        __CLR4_4_1hokhoklgchorf1.R.inc(22926);TB.tearDown();
        __CLR4_4_1hokhoklgchorf1.R.inc(22927);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22928);TB.testEqualsHashCode_Strict();
        __CLR4_4_1hokhoklgchorf1.R.inc(22929);TB.tearDown();
        __CLR4_4_1hokhoklgchorf1.R.inc(22930);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22931);TB.testEqualsHashCode_Limit();
        __CLR4_4_1hokhoklgchorf1.R.inc(22932);TB.tearDown();
        __CLR4_4_1hokhoklgchorf1.R.inc(22933);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22934);TB.testEqualsHashCode_Zoned();
        __CLR4_4_1hokhoklgchorf1.R.inc(22935);TB.tearDown();
        __CLR4_4_1hokhoklgchorf1.R.inc(22936);TB.setUp();
        __CLR4_4_1hokhoklgchorf1.R.inc(22937);TB.testToString();
        __CLR4_4_1hokhoklgchorf1.R.inc(22938);TB.tearDown();
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestChronology.class);
    }
    public TestChronology(String name) {
        super(name);
    }
 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1hokhoklgchorf1.R.inc(22939);
        __CLR4_4_1hokhoklgchorf1.R.inc(22940);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hokhoklgchorf1.R.inc(22941);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1hokhoklgchorf1.R.inc(22942);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1hokhoklgchorf1.R.inc(22943);originalLocale = Locale.getDefault();
        __CLR4_4_1hokhoklgchorf1.R.inc(22944);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1hokhoklgchorf1.R.inc(22945);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1hokhoklgchorf1.R.inc(22946);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1hokhoklgchorf1.R.inc(22947);
        __CLR4_4_1hokhoklgchorf1.R.inc(22948);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hokhoklgchorf1.R.inc(22949);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1hokhoklgchorf1.R.inc(22950);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1hokhoklgchorf1.R.inc(22951);Locale.setDefault(originalLocale);
        __CLR4_4_1hokhoklgchorf1.R.inc(22952);originalDateTimeZone = null;
        __CLR4_4_1hokhoklgchorf1.R.inc(22953);originalTimeZone = null;
        __CLR4_4_1hokhoklgchorf1.R.inc(22954);originalLocale = null;
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),22955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjhpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjhpn(){try{__CLR4_4_1hokhoklgchorf1.R.inc(22955);
        __CLR4_4_1hokhoklgchorf1.R.inc(22956);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(22957);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(22958);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode_ISO() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),22959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cadh5zhpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_ISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cadh5zhpr(){try{__CLR4_4_1hokhoklgchorf1.R.inc(22959);
        __CLR4_4_1hokhoklgchorf1.R.inc(22960);Chronology chrono1 = ISOChronology.getInstanceUTC();
        __CLR4_4_1hokhoklgchorf1.R.inc(22961);Chronology chrono2 = ISOChronology.getInstanceUTC();
        __CLR4_4_1hokhoklgchorf1.R.inc(22962);Chronology chrono3 = ISOChronology.getInstance();

        __CLR4_4_1hokhoklgchorf1.R.inc(22963);assertEquals(true, chrono1.equals(chrono2));
        __CLR4_4_1hokhoklgchorf1.R.inc(22964);assertEquals(false, chrono1.equals(chrono3));

        __CLR4_4_1hokhoklgchorf1.R.inc(22965);DateTime dt1 = new DateTime(0L, chrono1);
        __CLR4_4_1hokhoklgchorf1.R.inc(22966);DateTime dt2 = new DateTime(0L, chrono2);
        __CLR4_4_1hokhoklgchorf1.R.inc(22967);DateTime dt3 = new DateTime(0L, chrono3);

        __CLR4_4_1hokhoklgchorf1.R.inc(22968);assertEquals(true, dt1.equals(dt2));
        __CLR4_4_1hokhoklgchorf1.R.inc(22969);assertEquals(false, dt1.equals(dt3));

        __CLR4_4_1hokhoklgchorf1.R.inc(22970);assertEquals(true, chrono1.hashCode() == chrono2.hashCode());
        __CLR4_4_1hokhoklgchorf1.R.inc(22971);assertEquals(false, chrono1.hashCode() == chrono3.hashCode());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode_Lenient() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),22972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133r56dhq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_Lenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133r56dhq4(){try{__CLR4_4_1hokhoklgchorf1.R.inc(22972);
        __CLR4_4_1hokhoklgchorf1.R.inc(22973);Chronology chrono1 = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_1hokhoklgchorf1.R.inc(22974);Chronology chrono2 = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_1hokhoklgchorf1.R.inc(22975);Chronology chrono3 = LenientChronology.getInstance(ISOChronology.getInstance());

        __CLR4_4_1hokhoklgchorf1.R.inc(22976);assertEquals(true, chrono1.equals(chrono2));
        __CLR4_4_1hokhoklgchorf1.R.inc(22977);assertEquals(false, chrono1.equals(chrono3));

        __CLR4_4_1hokhoklgchorf1.R.inc(22978);DateTime dt1 = new DateTime(0L, chrono1);
        __CLR4_4_1hokhoklgchorf1.R.inc(22979);DateTime dt2 = new DateTime(0L, chrono2);
        __CLR4_4_1hokhoklgchorf1.R.inc(22980);DateTime dt3 = new DateTime(0L, chrono3);

        __CLR4_4_1hokhoklgchorf1.R.inc(22981);assertEquals(true, dt1.equals(dt2));
        __CLR4_4_1hokhoklgchorf1.R.inc(22982);assertEquals(false, dt1.equals(dt3));

        __CLR4_4_1hokhoklgchorf1.R.inc(22983);assertEquals(true, chrono1.hashCode() == chrono2.hashCode());
        __CLR4_4_1hokhoklgchorf1.R.inc(22984);assertEquals(false, chrono1.hashCode() == chrono3.hashCode());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode_Strict() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),22985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14g7xurhqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_Strict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14g7xurhqh(){try{__CLR4_4_1hokhoklgchorf1.R.inc(22985);
        __CLR4_4_1hokhoklgchorf1.R.inc(22986);Chronology chrono1 = StrictChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_1hokhoklgchorf1.R.inc(22987);Chronology chrono2 = StrictChronology.getInstance(ISOChronology.getInstanceUTC());
        __CLR4_4_1hokhoklgchorf1.R.inc(22988);Chronology chrono3 = StrictChronology.getInstance(ISOChronology.getInstance());

        __CLR4_4_1hokhoklgchorf1.R.inc(22989);assertEquals(true, chrono1.equals(chrono2));
        __CLR4_4_1hokhoklgchorf1.R.inc(22990);assertEquals(false, chrono1.equals(chrono3));

        __CLR4_4_1hokhoklgchorf1.R.inc(22991);DateTime dt1 = new DateTime(0L, chrono1);
        __CLR4_4_1hokhoklgchorf1.R.inc(22992);DateTime dt2 = new DateTime(0L, chrono2);
        __CLR4_4_1hokhoklgchorf1.R.inc(22993);DateTime dt3 = new DateTime(0L, chrono3);

        __CLR4_4_1hokhoklgchorf1.R.inc(22994);assertEquals(true, dt1.equals(dt2));
        __CLR4_4_1hokhoklgchorf1.R.inc(22995);assertEquals(false, dt1.equals(dt3));

        __CLR4_4_1hokhoklgchorf1.R.inc(22996);assertEquals(true, chrono1.hashCode() == chrono2.hashCode());
        __CLR4_4_1hokhoklgchorf1.R.inc(22997);assertEquals(false, chrono1.hashCode() == chrono3.hashCode());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode_Limit() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),22998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1utlovhqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_Limit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1utlovhqu(){try{__CLR4_4_1hokhoklgchorf1.R.inc(22998);
        __CLR4_4_1hokhoklgchorf1.R.inc(22999);DateTime lower = new DateTime(0L);
        __CLR4_4_1hokhoklgchorf1.R.inc(23000);DateTime higherA = new DateTime(1000000L);
        __CLR4_4_1hokhoklgchorf1.R.inc(23001);DateTime higherB = new DateTime(2000000L);

        __CLR4_4_1hokhoklgchorf1.R.inc(23002);Chronology chrono1 = LimitChronology.getInstance(ISOChronology.getInstanceUTC(), lower, higherA);
        __CLR4_4_1hokhoklgchorf1.R.inc(23003);Chronology chrono2A = LimitChronology.getInstance(ISOChronology.getInstanceUTC(), lower, higherA);
        __CLR4_4_1hokhoklgchorf1.R.inc(23004);Chronology chrono2B = LimitChronology.getInstance(ISOChronology.getInstanceUTC(), lower, higherB);
        __CLR4_4_1hokhoklgchorf1.R.inc(23005);Chronology chrono3 = LimitChronology.getInstance(ISOChronology.getInstance(), lower, higherA);

        __CLR4_4_1hokhoklgchorf1.R.inc(23006);assertEquals(true, chrono1.equals(chrono2A));
        __CLR4_4_1hokhoklgchorf1.R.inc(23007);assertEquals(false, chrono1.equals(chrono2B));
        __CLR4_4_1hokhoklgchorf1.R.inc(23008);assertEquals(false, chrono1.equals(chrono3));

        __CLR4_4_1hokhoklgchorf1.R.inc(23009);DateTime dt1 = new DateTime(0L, chrono1);
        __CLR4_4_1hokhoklgchorf1.R.inc(23010);DateTime dt2A = new DateTime(0L, chrono2A);
        __CLR4_4_1hokhoklgchorf1.R.inc(23011);DateTime dt2B = new DateTime(0L, chrono2B);
        __CLR4_4_1hokhoklgchorf1.R.inc(23012);DateTime dt3 = new DateTime(0L, chrono3);

        __CLR4_4_1hokhoklgchorf1.R.inc(23013);assertEquals(true, dt1.equals(dt2A));
        __CLR4_4_1hokhoklgchorf1.R.inc(23014);assertEquals(false, dt1.equals(dt2B));
        __CLR4_4_1hokhoklgchorf1.R.inc(23015);assertEquals(false, dt1.equals(dt3));

        __CLR4_4_1hokhoklgchorf1.R.inc(23016);assertEquals(true, chrono1.hashCode() == chrono2A.hashCode());
        __CLR4_4_1hokhoklgchorf1.R.inc(23017);assertEquals(false, chrono1.hashCode() == chrono2B.hashCode());
        __CLR4_4_1hokhoklgchorf1.R.inc(23018);assertEquals(false, chrono1.hashCode() == chrono3.hashCode());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode_Zoned() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),23019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pze1ashrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testEqualsHashCode_Zoned",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pze1ashrf(){try{__CLR4_4_1hokhoklgchorf1.R.inc(23019);
        __CLR4_4_1hokhoklgchorf1.R.inc(23020);DateTimeZone zoneA = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1hokhoklgchorf1.R.inc(23021);DateTimeZone zoneB = DateTimeZone.forID("Asia/Tokyo");

        __CLR4_4_1hokhoklgchorf1.R.inc(23022);Chronology chrono1 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), zoneA);
        __CLR4_4_1hokhoklgchorf1.R.inc(23023);Chronology chrono2 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), zoneA);
        __CLR4_4_1hokhoklgchorf1.R.inc(23024);Chronology chrono3 = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), zoneB);

        __CLR4_4_1hokhoklgchorf1.R.inc(23025);assertEquals(true, chrono1.equals(chrono2));
        __CLR4_4_1hokhoklgchorf1.R.inc(23026);assertEquals(false, chrono1.equals(chrono3));

        __CLR4_4_1hokhoklgchorf1.R.inc(23027);DateTime dt1 = new DateTime(0L, chrono1);
        __CLR4_4_1hokhoklgchorf1.R.inc(23028);DateTime dt2 = new DateTime(0L, chrono2);
        __CLR4_4_1hokhoklgchorf1.R.inc(23029);DateTime dt3 = new DateTime(0L, chrono3);

        __CLR4_4_1hokhoklgchorf1.R.inc(23030);assertEquals(true, dt1.equals(dt2));
        __CLR4_4_1hokhoklgchorf1.R.inc(23031);assertEquals(false, dt1.equals(dt3));

        __CLR4_4_1hokhoklgchorf1.R.inc(23032);assertEquals(true, chrono1.hashCode() == chrono2.hashCode());
        __CLR4_4_1hokhoklgchorf1.R.inc(23033);assertEquals(false, chrono1.hashCode() == chrono3.hashCode());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1hokhoklgchorf1.R.globalSliceStart(getClass().getName(),23034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidhru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hokhoklgchorf1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hokhoklgchorf1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),23034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidhru(){try{__CLR4_4_1hokhoklgchorf1.R.inc(23034);
        __CLR4_4_1hokhoklgchorf1.R.inc(23035);DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1hokhoklgchorf1.R.inc(23036);ISOChronology isoParis = ISOChronology.getInstance(paris);

        __CLR4_4_1hokhoklgchorf1.R.inc(23037);assertEquals("ISOChronology[Europe/Paris]", isoParis.toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23038);assertEquals("GJChronology[Europe/Paris]", GJChronology.getInstance(paris).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23039);assertEquals("GregorianChronology[Europe/Paris]", GregorianChronology.getInstance(paris).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23040);assertEquals("JulianChronology[Europe/Paris]", JulianChronology.getInstance(paris).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23041);assertEquals("BuddhistChronology[Europe/Paris]", BuddhistChronology.getInstance(paris).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23042);assertEquals("CopticChronology[Europe/Paris]", CopticChronology.getInstance(paris).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23043);assertEquals("EthiopicChronology[Europe/Paris]", EthiopicChronology.getInstance(paris).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23044);assertEquals("IslamicChronology[Europe/Paris]", IslamicChronology.getInstance(paris).toString());

        __CLR4_4_1hokhoklgchorf1.R.inc(23045);assertEquals("LenientChronology[ISOChronology[Europe/Paris]]", LenientChronology.getInstance(isoParis).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23046);assertEquals("StrictChronology[ISOChronology[Europe/Paris]]", StrictChronology.getInstance(isoParis).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23047);assertEquals("LimitChronology[ISOChronology[Europe/Paris], NoLimit, NoLimit]", LimitChronology.getInstance(isoParis, null, null).toString());
        __CLR4_4_1hokhoklgchorf1.R.inc(23048);assertEquals("ZonedChronology[ISOChronology[UTC], Europe/Paris]", ZonedChronology.getInstance(isoParis, paris).toString());
    }finally{__CLR4_4_1hokhoklgchorf1.R.flushNeeded();}}

}
