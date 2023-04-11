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

import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Constructors {static class __CLR4_4_1pt2pt2lgchorun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,33574,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // 1970-06-09
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 1970-04-05
    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 1971-05-06
    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1pt2pt2lgchorun.R.inc(33446);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33447);TestInstant_Constructors TB = new TestInstant_Constructors();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33448);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33449);TB.test_epoch();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33450);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33451);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33452);TB.test_now();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33453);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33454);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33455);TB.test_ofEpochMilli();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33456);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33457);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33458);TB.test_ofEpochSecond();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33459);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33460);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33461);TB.test_ofEpochSecond_zero();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33462);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33463);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33464);TB.test_ofEpochSecond_overflow();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33465);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33466);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33467);TB.test_ofEpochSecond_underflow();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33468);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33469);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33470);TB.testParse_noFormatter();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33471);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33472);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33473);TB.testParse_formatter();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33474);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33475);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33476);TB.testConstructor();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33477);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33478);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33479);TB.testConstructor_long1();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33480);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33481);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33482);TB.testConstructor_long2();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33483);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33484);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33485);TB.testConstructor_Object();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33486);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33487);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33488);TB.testConstructor_invalidObject();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33489);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33490);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33491);TB.testConstructor_nullObject();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33492);TB.tearDown();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33493);TB.setUp();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33494);TB.testConstructor_badconverterObject();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33495);TB.tearDown();


    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestInstant_Constructors.class);
    }

    public TestInstant_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1pt2pt2lgchorun.R.inc(33496);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33497);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33498);zone = DateTimeZone.getDefault();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33499);locale = Locale.getDefault();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33500);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33501);java.util.TimeZone.setDefault(LONDON.toTimeZone());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33502);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1pt2pt2lgchorun.R.inc(33503);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33504);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33505);DateTimeZone.setDefault(zone);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33506);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33507);Locale.setDefault(locale);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33508);zone = null;
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test EPOCH
     */
    @Test
    public void test_epoch() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12fvskjput();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_epoch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12fvskjput() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33509);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33510);Instant test = Instant.EPOCH;
        __CLR4_4_1pt2pt2lgchorun.R.inc(33511);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33512);assertEquals(0L, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    /**
     * Test now()
     */
    @Test
    public void test_now() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qxg0pux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_now",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qxg0pux() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33513);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33514);Instant test = Instant.now();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33515);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33516);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test ofEpochMilli() and ofEpochSecond()
     */
    @Test
    public void test_ofEpochMilli() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwce29pv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_ofEpochMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwce29pv1() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33517);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33518);Instant test = Instant.ofEpochMilli(TEST_TIME1);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33519);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33520);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    @Test
    public void test_ofEpochSecond() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obfwhspv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_ofEpochSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obfwhspv5() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33521);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33522);Instant test = Instant.ofEpochSecond(TEST_TIME1 / 1000);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33523);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33524);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    @Test
    public void test_ofEpochSecond_zero() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145wot1pv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_ofEpochSecond_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145wot1pv9() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33525);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33526);Instant test = Instant.ofEpochSecond(0);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33527);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    @Test
    public void test_ofEpochSecond_overflow() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgaxf3pvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_ofEpochSecond_overflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgaxf3pvc() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33528);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33529);try {
            __CLR4_4_1pt2pt2lgchorun.R.inc(33530);Instant.ofEpochSecond(Long.MAX_VALUE);
            __CLR4_4_1pt2pt2lgchorun.R.inc(33531);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    @Test
    public void test_ofEpochSecond_underflow() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l5j0yvpvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.test_ofEpochSecond_underflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l5j0yvpvg() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33532);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33533);try {
            __CLR4_4_1pt2pt2lgchorun.R.inc(33534);Instant.ofEpochSecond(Long.MIN_VALUE);
            __CLR4_4_1pt2pt2lgchorun.R.inc(33535);fail();
        } catch (ArithmeticException ex) {
        }
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvipvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvipvk() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33536);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33537);assertEquals(new DateTime(2010, 6, 30, 0, 20, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-06-30T01:20+02:00"));
        __CLR4_4_1pt2pt2lgchorun.R.inc(33538);assertEquals(new DateTime(2010, 1, 2, 14, 50, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-002T14:50"));
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxpvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxpvn() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33539);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33540);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1pt2pt2lgchorun.R.inc(33541);assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)).toInstant(), Instant.parse("2010--30 06 13", f));
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hpvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hpvq() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33542);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33543);Instant test = new Instant();
        __CLR4_4_1pt2pt2lgchorun.R.inc(33544);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33545);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crpvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crpvu() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33546);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33547);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33548);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33549);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kapvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kapvy() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33550);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33551);Instant test = new Instant(TEST_TIME2);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33552);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33553);assertEquals(TEST_TIME2, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebpw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebpw2() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33554);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33555);Date date = new Date(TEST_TIME1);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33556);Instant test = new Instant(date);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33557);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33558);assertEquals(TEST_TIME1, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_invalidObject() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7unaypw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_invalidObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7unaypw7() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33559);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33560);try {
            __CLR4_4_1pt2pt2lgchorun.R.inc(33561);new Instant(new Object());
            __CLR4_4_1pt2pt2lgchorun.R.inc(33562);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukpwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukpwb() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33563);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33564);Instant test = new Instant((Object) null);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33565);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pt2pt2lgchorun.R.inc(33566);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_badconverterObject() throws Throwable {__CLR4_4_1pt2pt2lgchorun.R.globalSliceStart(getClass().getName(),33567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opptygpwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pt2pt2lgchorun.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pt2pt2lgchorun.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Constructors.testConstructor_badconverterObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opptygpwf() throws Throwable{try{__CLR4_4_1pt2pt2lgchorun.R.inc(33567);
        __CLR4_4_1pt2pt2lgchorun.R.inc(33568);try {
            __CLR4_4_1pt2pt2lgchorun.R.inc(33569);ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            __CLR4_4_1pt2pt2lgchorun.R.inc(33570);Instant test = new Instant(new Integer(0));
            __CLR4_4_1pt2pt2lgchorun.R.inc(33571);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
            __CLR4_4_1pt2pt2lgchorun.R.inc(33572);assertEquals(0L, test.getMillis());
        } finally {
            __CLR4_4_1pt2pt2lgchorun.R.inc(33573);ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }finally{__CLR4_4_1pt2pt2lgchorun.R.flushNeeded();}}

}
