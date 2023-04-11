/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * This class is a Junit unit test for EthiopicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestEthiopicChronology {static class __CLR4_4_11b591b59lgchosm7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,61598,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; // extends TestCase {

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ETHIOPIC_UTC = EthiopicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11b591b59lgchosm7.R.inc(61101);

        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11b591b59lgchosm7.R.inc(61102);TestEthiopicChronology TB = new TestEthiopicChronology();


        __CLR4_4_11b591b59lgchosm7.R.inc(61103);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61104);TB.testFactoryUTC();
        __CLR4_4_11b591b59lgchosm7.R.inc(61105);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61106);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61107);TB.testFactory();
        __CLR4_4_11b591b59lgchosm7.R.inc(61108);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61109);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61110);TB.testFactory_Zone();
        __CLR4_4_11b591b59lgchosm7.R.inc(61111);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61112);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61113);TB.testEquality();
        __CLR4_4_11b591b59lgchosm7.R.inc(61114);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61115);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61116);TB.testWithUTC();
        __CLR4_4_11b591b59lgchosm7.R.inc(61117);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61118);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61119);TB.testWithZone();
        __CLR4_4_11b591b59lgchosm7.R.inc(61120);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61121);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61122);TB.testToString();
        __CLR4_4_11b591b59lgchosm7.R.inc(61123);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61124);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61125);TB.testDurationFields();
        __CLR4_4_11b591b59lgchosm7.R.inc(61126);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61127);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61128);TB.testDateFields();
        __CLR4_4_11b591b59lgchosm7.R.inc(61129);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61130);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61131);TB.testTimeFields();
        __CLR4_4_11b591b59lgchosm7.R.inc(61132);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61133);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61134);TB.testEpoch();
        __CLR4_4_11b591b59lgchosm7.R.inc(61135);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61136);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61137);TB.testEra();
        __CLR4_4_11b591b59lgchosm7.R.inc(61138);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61139);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61140);TB.testCalendar();
        __CLR4_4_11b591b59lgchosm7.R.inc(61141);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61142);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61143);TB.testSampleDate();
        __CLR4_4_11b591b59lgchosm7.R.inc(61144);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61145);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61146);TB.testSampleDateWithZone();
        __CLR4_4_11b591b59lgchosm7.R.inc(61147);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61148);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61149);TB.testDurationYear();
        __CLR4_4_11b591b59lgchosm7.R.inc(61150);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61151);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61152);TB.testDurationMonth();
        __CLR4_4_11b591b59lgchosm7.R.inc(61153);TB.tearDown();

        __CLR4_4_11b591b59lgchosm7.R.inc(61154);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61155);TB.testLeap_5_13();
        __CLR4_4_11b591b59lgchosm7.R.inc(61156);TB.tearDown();


        __CLR4_4_11b591b59lgchosm7.R.inc(61157);TB.setUp();
        __CLR4_4_11b591b59lgchosm7.R.inc(61158);TB.testLeap_6_13();
        __CLR4_4_11b591b59lgchosm7.R.inc(61159);TB.tearDown();

    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}


    /*
        public static TestSuite suite() {
            SKIP = 1 * MILLIS_PER_DAY;
            return new TestSuite(TestEthiopicChronology.class);
        }

        public TestEthiopicChronology(String name) {
            super(name);
        }

     */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11b591b59lgchosm7.R.inc(61160);

        __CLR4_4_11b591b59lgchosm7.R.inc(61161);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11b591b59lgchosm7.R.inc(61162);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11b591b59lgchosm7.R.inc(61163);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11b591b59lgchosm7.R.inc(61164);originalLocale = Locale.getDefault();
        __CLR4_4_11b591b59lgchosm7.R.inc(61165);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11b591b59lgchosm7.R.inc(61166);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11b591b59lgchosm7.R.inc(61167);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11b591b59lgchosm7.R.inc(61168);

        __CLR4_4_11b591b59lgchosm7.R.inc(61169);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11b591b59lgchosm7.R.inc(61170);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11b591b59lgchosm7.R.inc(61171);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11b591b59lgchosm7.R.inc(61172);Locale.setDefault(originalLocale);
        __CLR4_4_11b591b59lgchosm7.R.inc(61173);originalDateTimeZone = null;
        __CLR4_4_11b591b59lgchosm7.R.inc(61174);originalTimeZone = null;
        __CLR4_4_11b591b59lgchosm7.R.inc(61175);originalLocale = null;
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1b7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1b7c(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61176);
        __CLR4_4_11b591b59lgchosm7.R.inc(61177);assertEquals(DateTimeZone.UTC, EthiopicChronology.getInstanceUTC().getZone());
        __CLR4_4_11b591b59lgchosm7.R.inc(61178);assertSame(EthiopicChronology.class, EthiopicChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1b7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1b7f(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61179);
        __CLR4_4_11b591b59lgchosm7.R.inc(61180);assertEquals(LONDON, EthiopicChronology.getInstance().getZone());
        __CLR4_4_11b591b59lgchosm7.R.inc(61181);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance().getClass());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1b7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1b7i(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61182);
        __CLR4_4_11b591b59lgchosm7.R.inc(61183);assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11b591b59lgchosm7.R.inc(61184);assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone());
        __CLR4_4_11b591b59lgchosm7.R.inc(61185);assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone());
        __CLR4_4_11b591b59lgchosm7.R.inc(61186);assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1b7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1b7n(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61187);
        __CLR4_4_11b591b59lgchosm7.R.inc(61188);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO));
        __CLR4_4_11b591b59lgchosm7.R.inc(61189);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(LONDON));
        __CLR4_4_11b591b59lgchosm7.R.inc(61190);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(PARIS));
        __CLR4_4_11b591b59lgchosm7.R.inc(61191);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC());
        __CLR4_4_11b591b59lgchosm7.R.inc(61192);assertSame(EthiopicChronology.getInstance(), EthiopicChronology.getInstance(LONDON));
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831b7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831b7t(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61193);
        __CLR4_4_11b591b59lgchosm7.R.inc(61194);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11b591b59lgchosm7.R.inc(61195);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11b591b59lgchosm7.R.inc(61196);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC());
        __CLR4_4_11b591b59lgchosm7.R.inc(61197);assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1b7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1b7y(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61198);
        __CLR4_4_11b591b59lgchosm7.R.inc(61199);assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11b591b59lgchosm7.R.inc(61200);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11b591b59lgchosm7.R.inc(61201);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11b591b59lgchosm7.R.inc(61202);assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11b591b59lgchosm7.R.inc(61203);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS));
        __CLR4_4_11b591b59lgchosm7.R.inc(61204);assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1b85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1b85(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61205);
        __CLR4_4_11b591b59lgchosm7.R.inc(61206);assertEquals("EthiopicChronology[Europe/London]", EthiopicChronology.getInstance(LONDON).toString());
        __CLR4_4_11b591b59lgchosm7.R.inc(61207);assertEquals("EthiopicChronology[Asia/Tokyo]", EthiopicChronology.getInstance(TOKYO).toString());
        __CLR4_4_11b591b59lgchosm7.R.inc(61208);assertEquals("EthiopicChronology[Europe/London]", EthiopicChronology.getInstance().toString());
        __CLR4_4_11b591b59lgchosm7.R.inc(61209);assertEquals("EthiopicChronology[UTC]", EthiopicChronology.getInstanceUTC().toString());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1b8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1b8a(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61210);
        __CLR4_4_11b591b59lgchosm7.R.inc(61211);final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
        __CLR4_4_11b591b59lgchosm7.R.inc(61212);assertEquals("eras", ethiopic.eras().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61213);assertEquals("centuries", ethiopic.centuries().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61214);assertEquals("years", ethiopic.years().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61215);assertEquals("weekyears", ethiopic.weekyears().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61216);assertEquals("months", ethiopic.months().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61217);assertEquals("weeks", ethiopic.weeks().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61218);assertEquals("days", ethiopic.days().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61219);assertEquals("halfdays", ethiopic.halfdays().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61220);assertEquals("hours", ethiopic.hours().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61221);assertEquals("minutes", ethiopic.minutes().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61222);assertEquals("seconds", ethiopic.seconds().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61223);assertEquals("millis", ethiopic.millis().getName());

        __CLR4_4_11b591b59lgchosm7.R.inc(61224);assertEquals(false, ethiopic.eras().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61225);assertEquals(true, ethiopic.centuries().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61226);assertEquals(true, ethiopic.years().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61227);assertEquals(true, ethiopic.weekyears().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61228);assertEquals(true, ethiopic.months().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61229);assertEquals(true, ethiopic.weeks().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61230);assertEquals(true, ethiopic.days().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61231);assertEquals(true, ethiopic.halfdays().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61232);assertEquals(true, ethiopic.hours().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61233);assertEquals(true, ethiopic.minutes().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61234);assertEquals(true, ethiopic.seconds().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61235);assertEquals(true, ethiopic.millis().isSupported());

        __CLR4_4_11b591b59lgchosm7.R.inc(61236);assertEquals(false, ethiopic.centuries().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61237);assertEquals(false, ethiopic.years().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61238);assertEquals(false, ethiopic.weekyears().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61239);assertEquals(false, ethiopic.months().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61240);assertEquals(false, ethiopic.weeks().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61241);assertEquals(false, ethiopic.days().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61242);assertEquals(false, ethiopic.halfdays().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61243);assertEquals(true, ethiopic.hours().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61244);assertEquals(true, ethiopic.minutes().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61245);assertEquals(true, ethiopic.seconds().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61246);assertEquals(true, ethiopic.millis().isPrecise());

        __CLR4_4_11b591b59lgchosm7.R.inc(61247);final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC();
        __CLR4_4_11b591b59lgchosm7.R.inc(61248);assertEquals(false, ethiopicUTC.centuries().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61249);assertEquals(false, ethiopicUTC.years().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61250);assertEquals(false, ethiopicUTC.weekyears().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61251);assertEquals(false, ethiopicUTC.months().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61252);assertEquals(true, ethiopicUTC.weeks().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61253);assertEquals(true, ethiopicUTC.days().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61254);assertEquals(true, ethiopicUTC.halfdays().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61255);assertEquals(true, ethiopicUTC.hours().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61256);assertEquals(true, ethiopicUTC.minutes().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61257);assertEquals(true, ethiopicUTC.seconds().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61258);assertEquals(true, ethiopicUTC.millis().isPrecise());

        __CLR4_4_11b591b59lgchosm7.R.inc(61259);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11b591b59lgchosm7.R.inc(61260);final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt);
        __CLR4_4_11b591b59lgchosm7.R.inc(61261);assertEquals(false, ethiopicGMT.centuries().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61262);assertEquals(false, ethiopicGMT.years().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61263);assertEquals(false, ethiopicGMT.weekyears().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61264);assertEquals(false, ethiopicGMT.months().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61265);assertEquals(true, ethiopicGMT.weeks().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61266);assertEquals(true, ethiopicGMT.days().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61267);assertEquals(true, ethiopicGMT.halfdays().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61268);assertEquals(true, ethiopicGMT.hours().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61269);assertEquals(true, ethiopicGMT.minutes().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61270);assertEquals(true, ethiopicGMT.seconds().isPrecise());
        __CLR4_4_11b591b59lgchosm7.R.inc(61271);assertEquals(true, ethiopicGMT.millis().isPrecise());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testDateFields() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1ba0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1ba0(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61272);
        __CLR4_4_11b591b59lgchosm7.R.inc(61273);final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
        __CLR4_4_11b591b59lgchosm7.R.inc(61274);assertEquals("era", ethiopic.era().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61275);assertEquals("centuryOfEra", ethiopic.centuryOfEra().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61276);assertEquals("yearOfCentury", ethiopic.yearOfCentury().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61277);assertEquals("yearOfEra", ethiopic.yearOfEra().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61278);assertEquals("year", ethiopic.year().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61279);assertEquals("monthOfYear", ethiopic.monthOfYear().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61280);assertEquals("weekyearOfCentury", ethiopic.weekyearOfCentury().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61281);assertEquals("weekyear", ethiopic.weekyear().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61282);assertEquals("weekOfWeekyear", ethiopic.weekOfWeekyear().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61283);assertEquals("dayOfYear", ethiopic.dayOfYear().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61284);assertEquals("dayOfMonth", ethiopic.dayOfMonth().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61285);assertEquals("dayOfWeek", ethiopic.dayOfWeek().getName());

        __CLR4_4_11b591b59lgchosm7.R.inc(61286);assertEquals(true, ethiopic.era().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61287);assertEquals(true, ethiopic.centuryOfEra().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61288);assertEquals(true, ethiopic.yearOfCentury().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61289);assertEquals(true, ethiopic.yearOfEra().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61290);assertEquals(true, ethiopic.year().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61291);assertEquals(true, ethiopic.monthOfYear().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61292);assertEquals(true, ethiopic.weekyearOfCentury().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61293);assertEquals(true, ethiopic.weekyear().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61294);assertEquals(true, ethiopic.weekOfWeekyear().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61295);assertEquals(true, ethiopic.dayOfYear().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61296);assertEquals(true, ethiopic.dayOfMonth().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61297);assertEquals(true, ethiopic.dayOfWeek().isSupported());

        __CLR4_4_11b591b59lgchosm7.R.inc(61298);assertEquals(ethiopic.eras(), ethiopic.era().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61299);assertEquals(ethiopic.centuries(), ethiopic.centuryOfEra().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61300);assertEquals(ethiopic.years(), ethiopic.yearOfCentury().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61301);assertEquals(ethiopic.years(), ethiopic.yearOfEra().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61302);assertEquals(ethiopic.years(), ethiopic.year().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61303);assertEquals(ethiopic.months(), ethiopic.monthOfYear().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61304);assertEquals(ethiopic.weekyears(), ethiopic.weekyearOfCentury().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61305);assertEquals(ethiopic.weekyears(), ethiopic.weekyear().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61306);assertEquals(ethiopic.weeks(), ethiopic.weekOfWeekyear().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61307);assertEquals(ethiopic.days(), ethiopic.dayOfYear().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61308);assertEquals(ethiopic.days(), ethiopic.dayOfMonth().getDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61309);assertEquals(ethiopic.days(), ethiopic.dayOfWeek().getDurationField());

        __CLR4_4_11b591b59lgchosm7.R.inc(61310);assertEquals(null, ethiopic.era().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61311);assertEquals(ethiopic.eras(), ethiopic.centuryOfEra().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61312);assertEquals(ethiopic.centuries(), ethiopic.yearOfCentury().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61313);assertEquals(ethiopic.eras(), ethiopic.yearOfEra().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61314);assertEquals(null, ethiopic.year().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61315);assertEquals(ethiopic.years(), ethiopic.monthOfYear().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61316);assertEquals(ethiopic.centuries(), ethiopic.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61317);assertEquals(null, ethiopic.weekyear().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61318);assertEquals(ethiopic.weekyears(), ethiopic.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61319);assertEquals(ethiopic.years(), ethiopic.dayOfYear().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61320);assertEquals(ethiopic.months(), ethiopic.dayOfMonth().getRangeDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61321);assertEquals(ethiopic.weeks(), ethiopic.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testTimeFields() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1bbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1bbe(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61322);
        __CLR4_4_11b591b59lgchosm7.R.inc(61323);final EthiopicChronology ethiopic = EthiopicChronology.getInstance();
        __CLR4_4_11b591b59lgchosm7.R.inc(61324);assertEquals("halfdayOfDay", ethiopic.halfdayOfDay().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61325);assertEquals("clockhourOfHalfday", ethiopic.clockhourOfHalfday().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61326);assertEquals("hourOfHalfday", ethiopic.hourOfHalfday().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61327);assertEquals("clockhourOfDay", ethiopic.clockhourOfDay().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61328);assertEquals("hourOfDay", ethiopic.hourOfDay().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61329);assertEquals("minuteOfDay", ethiopic.minuteOfDay().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61330);assertEquals("minuteOfHour", ethiopic.minuteOfHour().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61331);assertEquals("secondOfDay", ethiopic.secondOfDay().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61332);assertEquals("secondOfMinute", ethiopic.secondOfMinute().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61333);assertEquals("millisOfDay", ethiopic.millisOfDay().getName());
        __CLR4_4_11b591b59lgchosm7.R.inc(61334);assertEquals("millisOfSecond", ethiopic.millisOfSecond().getName());

        __CLR4_4_11b591b59lgchosm7.R.inc(61335);assertEquals(true, ethiopic.halfdayOfDay().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61336);assertEquals(true, ethiopic.clockhourOfHalfday().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61337);assertEquals(true, ethiopic.hourOfHalfday().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61338);assertEquals(true, ethiopic.clockhourOfDay().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61339);assertEquals(true, ethiopic.hourOfDay().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61340);assertEquals(true, ethiopic.minuteOfDay().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61341);assertEquals(true, ethiopic.minuteOfHour().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61342);assertEquals(true, ethiopic.secondOfDay().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61343);assertEquals(true, ethiopic.secondOfMinute().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61344);assertEquals(true, ethiopic.millisOfDay().isSupported());
        __CLR4_4_11b591b59lgchosm7.R.inc(61345);assertEquals(true, ethiopic.millisOfSecond().isSupported());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEpoch() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p7wci1bc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testEpoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p7wci1bc2(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61346);
        __CLR4_4_11b591b59lgchosm7.R.inc(61347);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61348);assertEquals(new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC), epoch.withChronology(JULIAN_UTC));
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testEra() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13euvzd1bc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13euvzd1bc5(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61349);
        __CLR4_4_11b591b59lgchosm7.R.inc(61350);assertEquals(1, EthiopicChronology.EE);
        __CLR4_4_11b591b59lgchosm7.R.inc(61351);try {
            __CLR4_4_11b591b59lgchosm7.R.inc(61352);new DateTime(-1, 13, 5, 0, 0, 0, 0, ETHIOPIC_UTC);
            __CLR4_4_11b591b59lgchosm7.R.inc(61353);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    @Test
    public void testCalendar() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1odnsqf1bca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1odnsqf1bca(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61354);
        __CLR4_4_11b591b59lgchosm7.R.inc(61355);if ((((TestAll.FAST)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61356)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61357)==0&false))) {{
            __CLR4_4_11b591b59lgchosm7.R.inc(61358);return;
        }
        }__CLR4_4_11b591b59lgchosm7.R.inc(61359);System.out.println("\nTestEthiopicChronology.testCalendar");
        __CLR4_4_11b591b59lgchosm7.R.inc(61360);DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61361);long millis = epoch.getMillis();
        __CLR4_4_11b591b59lgchosm7.R.inc(61362);long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis();
        __CLR4_4_11b591b59lgchosm7.R.inc(61363);DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek();
        __CLR4_4_11b591b59lgchosm7.R.inc(61364);DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear();
        __CLR4_4_11b591b59lgchosm7.R.inc(61365);DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth();
        __CLR4_4_11b591b59lgchosm7.R.inc(61366);DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear();
        __CLR4_4_11b591b59lgchosm7.R.inc(61367);DateTimeField year = ETHIOPIC_UTC.year();
        __CLR4_4_11b591b59lgchosm7.R.inc(61368);DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra();
        __CLR4_4_11b591b59lgchosm7.R.inc(61369);DateTimeField era = ETHIOPIC_UTC.era();
        __CLR4_4_11b591b59lgchosm7.R.inc(61370);int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek();
        __CLR4_4_11b591b59lgchosm7.R.inc(61371);int expectedDOY = 1;
        __CLR4_4_11b591b59lgchosm7.R.inc(61372);int expectedDay = 1;
        __CLR4_4_11b591b59lgchosm7.R.inc(61373);int expectedMonth = 1;
        __CLR4_4_11b591b59lgchosm7.R.inc(61374);int expectedYear = 1;
        __CLR4_4_11b591b59lgchosm7.R.inc(61375);while ((((millis < end)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61376)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61377)==0&false))) {{
            __CLR4_4_11b591b59lgchosm7.R.inc(61378);int dowValue = dayOfWeek.get(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61379);int doyValue = dayOfYear.get(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61380);int dayValue = dayOfMonth.get(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61381);int monthValue = monthOfYear.get(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61382);int yearValue = year.get(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61383);int yearOfEraValue = yearOfEra.get(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61384);int monthLen = dayOfMonth.getMaximumValue(millis);
            __CLR4_4_11b591b59lgchosm7.R.inc(61385);if ((((monthValue < 1 || monthValue > 13)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61386)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61387)==0&false))) {{
                __CLR4_4_11b591b59lgchosm7.R.inc(61388);fail("Bad month: " + millis);
            }

            // test era
            }__CLR4_4_11b591b59lgchosm7.R.inc(61389);assertEquals(1, era.get(millis));
            __CLR4_4_11b591b59lgchosm7.R.inc(61390);assertEquals("EE", era.getAsText(millis));
            __CLR4_4_11b591b59lgchosm7.R.inc(61391);assertEquals("EE", era.getAsShortText(millis));

            // test date
            __CLR4_4_11b591b59lgchosm7.R.inc(61392);assertEquals(expectedYear, yearValue);
            __CLR4_4_11b591b59lgchosm7.R.inc(61393);assertEquals(expectedYear, yearOfEraValue);
            __CLR4_4_11b591b59lgchosm7.R.inc(61394);assertEquals(expectedMonth, monthValue);
            __CLR4_4_11b591b59lgchosm7.R.inc(61395);assertEquals(expectedDay, dayValue);
            __CLR4_4_11b591b59lgchosm7.R.inc(61396);assertEquals(expectedDOW, dowValue);
            __CLR4_4_11b591b59lgchosm7.R.inc(61397);assertEquals(expectedDOY, doyValue);

            // test leap year
            __CLR4_4_11b591b59lgchosm7.R.inc(61398);assertEquals(yearValue % 4 == 3, year.isLeap(millis));

            // test month length
            __CLR4_4_11b591b59lgchosm7.R.inc(61399);if ((((monthValue == 13)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61400)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61401)==0&false))) {{
                __CLR4_4_11b591b59lgchosm7.R.inc(61402);assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis));
                __CLR4_4_11b591b59lgchosm7.R.inc(61403);if ((((yearValue % 4 == 3)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61404)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61405)==0&false))) {{
                    __CLR4_4_11b591b59lgchosm7.R.inc(61406);assertEquals(6, monthLen);
                } }else {{
                    __CLR4_4_11b591b59lgchosm7.R.inc(61407);assertEquals(5, monthLen);
                }
            }} }else {{
                __CLR4_4_11b591b59lgchosm7.R.inc(61408);assertEquals(30, monthLen);
            }

            // recalculate date
            }__CLR4_4_11b591b59lgchosm7.R.inc(61409);expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1;
            __CLR4_4_11b591b59lgchosm7.R.inc(61410);expectedDay++;
            __CLR4_4_11b591b59lgchosm7.R.inc(61411);expectedDOY++;
            __CLR4_4_11b591b59lgchosm7.R.inc(61412);if ((((expectedDay == 31 && expectedMonth < 13)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61413)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61414)==0&false))) {{
                __CLR4_4_11b591b59lgchosm7.R.inc(61415);expectedDay = 1;
                __CLR4_4_11b591b59lgchosm7.R.inc(61416);expectedMonth++;
            } }else {__CLR4_4_11b591b59lgchosm7.R.inc(61417);if ((((expectedMonth == 13)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61418)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61419)==0&false))) {{
                __CLR4_4_11b591b59lgchosm7.R.inc(61420);if ((((expectedYear % 4 == 3 && expectedDay == 7)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61421)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61422)==0&false))) {{
                    __CLR4_4_11b591b59lgchosm7.R.inc(61423);expectedDay = 1;
                    __CLR4_4_11b591b59lgchosm7.R.inc(61424);expectedMonth = 1;
                    __CLR4_4_11b591b59lgchosm7.R.inc(61425);expectedYear++;
                    __CLR4_4_11b591b59lgchosm7.R.inc(61426);expectedDOY = 1;
                } }else {__CLR4_4_11b591b59lgchosm7.R.inc(61427);if ((((expectedYear % 4 != 3 && expectedDay == 6)&&(__CLR4_4_11b591b59lgchosm7.R.iget(61428)!=0|true))||(__CLR4_4_11b591b59lgchosm7.R.iget(61429)==0&false))) {{
                    __CLR4_4_11b591b59lgchosm7.R.inc(61430);expectedDay = 1;
                    __CLR4_4_11b591b59lgchosm7.R.inc(61431);expectedMonth = 1;
                    __CLR4_4_11b591b59lgchosm7.R.inc(61432);expectedYear++;
                    __CLR4_4_11b591b59lgchosm7.R.inc(61433);expectedDOY = 1;
                }
            }}}
            }}__CLR4_4_11b591b59lgchosm7.R.inc(61434);millis += SKIP;
            __CLR4_4_11b591b59lgchosm7.R.inc(61435);break; // SBH:added this line to exit from loop, this was only required to generate a smaller trace
        }
    }}finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testSampleDate() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vytbnz1bek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vytbnz1bek(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61436);
        __CLR4_4_11b591b59lgchosm7.R.inc(61437);DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61438);assertEquals(EthiopicChronology.EE, dt.getEra());
        __CLR4_4_11b591b59lgchosm7.R.inc(61439);assertEquals(20, dt.getCenturyOfEra());  // TODO confirm
        __CLR4_4_11b591b59lgchosm7.R.inc(61440);assertEquals(96, dt.getYearOfCentury());
        __CLR4_4_11b591b59lgchosm7.R.inc(61441);assertEquals(1996, dt.getYearOfEra());

        __CLR4_4_11b591b59lgchosm7.R.inc(61442);assertEquals(1996, dt.getYear());
        __CLR4_4_11b591b59lgchosm7.R.inc(61443);Property fld = dt.year();
        __CLR4_4_11b591b59lgchosm7.R.inc(61444);assertEquals(false, fld.isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61445);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11b591b59lgchosm7.R.inc(61446);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11b591b59lgchosm7.R.inc(61447);assertEquals(new DateTime(1997, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));

        __CLR4_4_11b591b59lgchosm7.R.inc(61448);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_11b591b59lgchosm7.R.inc(61449);fld = dt.monthOfYear();
        __CLR4_4_11b591b59lgchosm7.R.inc(61450);assertEquals(false, fld.isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61451);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11b591b59lgchosm7.R.inc(61452);assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType());
        __CLR4_4_11b591b59lgchosm7.R.inc(61453);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61454);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61455);assertEquals(13, fld.getMaximumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61456);assertEquals(13, fld.getMaximumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61457);assertEquals(new DateTime(1997, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(4));
        __CLR4_4_11b591b59lgchosm7.R.inc(61458);assertEquals(new DateTime(1996, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addWrapFieldToCopy(4));

        __CLR4_4_11b591b59lgchosm7.R.inc(61459);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_11b591b59lgchosm7.R.inc(61460);fld = dt.dayOfMonth();
        __CLR4_4_11b591b59lgchosm7.R.inc(61461);assertEquals(false, fld.isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61462);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11b591b59lgchosm7.R.inc(61463);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61464);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61465);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61466);assertEquals(30, fld.getMaximumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61467);assertEquals(30, fld.getMaximumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61468);assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));

        __CLR4_4_11b591b59lgchosm7.R.inc(61469);assertEquals(DateTimeConstants.WEDNESDAY, dt.getDayOfWeek());
        __CLR4_4_11b591b59lgchosm7.R.inc(61470);fld = dt.dayOfWeek();
        __CLR4_4_11b591b59lgchosm7.R.inc(61471);assertEquals(false, fld.isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61472);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11b591b59lgchosm7.R.inc(61473);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61474);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61475);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61476);assertEquals(7, fld.getMaximumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61477);assertEquals(7, fld.getMaximumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61478);assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));

        __CLR4_4_11b591b59lgchosm7.R.inc(61479);assertEquals(9 * 30 + 2, dt.getDayOfYear());
        __CLR4_4_11b591b59lgchosm7.R.inc(61480);fld = dt.dayOfYear();
        __CLR4_4_11b591b59lgchosm7.R.inc(61481);assertEquals(false, fld.isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61482);assertEquals(0, fld.getLeapAmount());
        __CLR4_4_11b591b59lgchosm7.R.inc(61483);assertEquals(null, fld.getLeapDurationField());
        __CLR4_4_11b591b59lgchosm7.R.inc(61484);assertEquals(1, fld.getMinimumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61485);assertEquals(1, fld.getMinimumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61486);assertEquals(365, fld.getMaximumValue());
        __CLR4_4_11b591b59lgchosm7.R.inc(61487);assertEquals(366, fld.getMaximumValueOverall());
        __CLR4_4_11b591b59lgchosm7.R.inc(61488);assertEquals(new DateTime(1996, 10, 3, 0, 0, 0, 0, ETHIOPIC_UTC), fld.addToCopy(1));

        __CLR4_4_11b591b59lgchosm7.R.inc(61489);assertEquals(0, dt.getHourOfDay());
        __CLR4_4_11b591b59lgchosm7.R.inc(61490);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11b591b59lgchosm7.R.inc(61491);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11b591b59lgchosm7.R.inc(61492);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testSampleDateWithZone() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh4f6l1bg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testSampleDateWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh4f6l1bg5(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61493);
        __CLR4_4_11b591b59lgchosm7.R.inc(61494);DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61495);assertEquals(EthiopicChronology.EE, dt.getEra());
        __CLR4_4_11b591b59lgchosm7.R.inc(61496);assertEquals(1996, dt.getYear());
        __CLR4_4_11b591b59lgchosm7.R.inc(61497);assertEquals(1996, dt.getYearOfEra());
        __CLR4_4_11b591b59lgchosm7.R.inc(61498);assertEquals(10, dt.getMonthOfYear());
        __CLR4_4_11b591b59lgchosm7.R.inc(61499);assertEquals(2, dt.getDayOfMonth());
        __CLR4_4_11b591b59lgchosm7.R.inc(61500);assertEquals(10, dt.getHourOfDay());  // PARIS is UTC+2 in summer (12-2=10)
        __CLR4_4_11b591b59lgchosm7.R.inc(61501);assertEquals(0, dt.getMinuteOfHour());
        __CLR4_4_11b591b59lgchosm7.R.inc(61502);assertEquals(0, dt.getSecondOfMinute());
        __CLR4_4_11b591b59lgchosm7.R.inc(61503);assertEquals(0, dt.getMillisOfSecond());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testDurationYear() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14rec961bgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14rec961bgg(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61504);
        // Leap 1999, NotLeap 1996,97,98
        __CLR4_4_11b591b59lgchosm7.R.inc(61505);DateTime dt96 = new DateTime(1996, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61506);DateTime dt97 = new DateTime(1997, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61507);DateTime dt98 = new DateTime(1998, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61508);DateTime dt99 = new DateTime(1999, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61509);DateTime dt00 = new DateTime(2000, 10, 2, 0, 0, 0, 0, ETHIOPIC_UTC);

        __CLR4_4_11b591b59lgchosm7.R.inc(61510);DurationField fld = dt96.year().getDurationField();
        __CLR4_4_11b591b59lgchosm7.R.inc(61511);assertEquals(ETHIOPIC_UTC.years(), fld);
        __CLR4_4_11b591b59lgchosm7.R.inc(61512);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61513);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61514);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61515);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4, dt96.getMillis()));

        __CLR4_4_11b591b59lgchosm7.R.inc(61516);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1));
        __CLR4_4_11b591b59lgchosm7.R.inc(61517);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2));

        __CLR4_4_11b591b59lgchosm7.R.inc(61518);assertEquals(1L * 365L * MILLIS_PER_DAY, fld.getMillis(1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61519);assertEquals(2L * 365L * MILLIS_PER_DAY, fld.getMillis(2L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61520);assertEquals(3L * 365L * MILLIS_PER_DAY, fld.getMillis(3L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61521);assertEquals((4L * 365L + 1L) * MILLIS_PER_DAY, fld.getMillis(4L, dt96.getMillis()));

        __CLR4_4_11b591b59lgchosm7.R.inc(61522);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getMillis(1L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61523);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 2, fld.getMillis(2L));

        __CLR4_4_11b591b59lgchosm7.R.inc(61524);assertEquals(((4L * 365L + 1L) * MILLIS_PER_DAY) / 4, fld.getUnitMillis());

        __CLR4_4_11b591b59lgchosm7.R.inc(61525);assertEquals(0, fld.getValue(1L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61526);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61527);assertEquals(1, fld.getValue(1L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61528);assertEquals(1, fld.getValue(2L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61529);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61530);assertEquals(2, fld.getValue(2L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61531);assertEquals(2, fld.getValue(3L * 365L * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61532);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61533);assertEquals(3, fld.getValue(3L * 365L * MILLIS_PER_DAY + 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61534);assertEquals(3, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY - 1L, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61535);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY, dt96.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61536);assertEquals(4, fld.getValue((4L * 365L + 1L) * MILLIS_PER_DAY + 1L, dt96.getMillis()));

        __CLR4_4_11b591b59lgchosm7.R.inc(61537);assertEquals(dt97.getMillis(), fld.add(dt96.getMillis(), 1));
        __CLR4_4_11b591b59lgchosm7.R.inc(61538);assertEquals(dt98.getMillis(), fld.add(dt96.getMillis(), 2));
        __CLR4_4_11b591b59lgchosm7.R.inc(61539);assertEquals(dt99.getMillis(), fld.add(dt96.getMillis(), 3));
        __CLR4_4_11b591b59lgchosm7.R.inc(61540);assertEquals(dt00.getMillis(), fld.add(dt96.getMillis(), 4));

        __CLR4_4_11b591b59lgchosm7.R.inc(61541);assertEquals(dt97.getMillis(), fld.add(dt96.getMillis(), 1L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61542);assertEquals(dt98.getMillis(), fld.add(dt96.getMillis(), 2L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61543);assertEquals(dt99.getMillis(), fld.add(dt96.getMillis(), 3L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61544);assertEquals(dt00.getMillis(), fld.add(dt96.getMillis(), 4L));
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testDurationMonth() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19eaj331bhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testDurationMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19eaj331bhl(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61545);
        // Leap 1999, NotLeap 1996,97,98
        __CLR4_4_11b591b59lgchosm7.R.inc(61546);DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61547);DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61548);DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC);
        __CLR4_4_11b591b59lgchosm7.R.inc(61549);DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC);

        __CLR4_4_11b591b59lgchosm7.R.inc(61550);DurationField fld = dt11.monthOfYear().getDurationField();
        __CLR4_4_11b591b59lgchosm7.R.inc(61551);assertEquals(ETHIOPIC_UTC.months(), fld);
        __CLR4_4_11b591b59lgchosm7.R.inc(61552);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61553);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61554);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61555);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis()));

        __CLR4_4_11b591b59lgchosm7.R.inc(61556);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1));
        __CLR4_4_11b591b59lgchosm7.R.inc(61557);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2));
        __CLR4_4_11b591b59lgchosm7.R.inc(61558);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13));

        __CLR4_4_11b591b59lgchosm7.R.inc(61559);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61560);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61561);assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61562);assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis()));

        __CLR4_4_11b591b59lgchosm7.R.inc(61563);assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61564);assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61565);assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L));

        __CLR4_4_11b591b59lgchosm7.R.inc(61566);assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61567);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61568);assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61569);assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61570);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61571);assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61572);assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61573);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61574);assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61575);assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61576);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis()));
        __CLR4_4_11b591b59lgchosm7.R.inc(61577);assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis()));

        __CLR4_4_11b591b59lgchosm7.R.inc(61578);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1));
        __CLR4_4_11b591b59lgchosm7.R.inc(61579);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2));
        __CLR4_4_11b591b59lgchosm7.R.inc(61580);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3));

        __CLR4_4_11b591b59lgchosm7.R.inc(61581);assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61582);assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L));
        __CLR4_4_11b591b59lgchosm7.R.inc(61583);assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L));
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testLeap_5_13() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bkcy941bio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testLeap_5_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bkcy941bio(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61584);
        __CLR4_4_11b591b59lgchosm7.R.inc(61585);Chronology chrono = EthiopicChronology.getInstance();
        __CLR4_4_11b591b59lgchosm7.R.inc(61586);DateTime dt = new DateTime(3, 13, 5, 0, 0, chrono);
        __CLR4_4_11b591b59lgchosm7.R.inc(61587);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61588);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61589);assertEquals(false, dt.dayOfMonth().isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61590);assertEquals(false, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

    @Test
    public void testLeap_6_13() {__CLR4_4_11b591b59lgchosm7.R.globalSliceStart(getClass().getName(),61591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16pob1l1biv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11b591b59lgchosm7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11b591b59lgchosm7.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestEthiopicChronology.testLeap_6_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16pob1l1biv(){try{__CLR4_4_11b591b59lgchosm7.R.inc(61591);
        __CLR4_4_11b591b59lgchosm7.R.inc(61592);Chronology chrono = EthiopicChronology.getInstance();
        __CLR4_4_11b591b59lgchosm7.R.inc(61593);DateTime dt = new DateTime(3, 13, 6, 0, 0, chrono);
        __CLR4_4_11b591b59lgchosm7.R.inc(61594);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61595);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61596);assertEquals(true, dt.dayOfMonth().isLeap());
        __CLR4_4_11b591b59lgchosm7.R.inc(61597);assertEquals(true, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11b591b59lgchosm7.R.flushNeeded();}}

}
