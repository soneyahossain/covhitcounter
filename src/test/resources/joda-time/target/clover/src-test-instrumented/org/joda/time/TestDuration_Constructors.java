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

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestDuration_Constructors {static class __CLR4_4_1ovgovglgchortd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,32431,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1ovgovglgchortd.R.inc(32236);
        __CLR4_4_1ovgovglgchortd.R.inc(32237);TestDuration_Constructors TB = new TestDuration_Constructors();
        __CLR4_4_1ovgovglgchortd.R.inc(32238);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32239);TB.testZERO();
        __CLR4_4_1ovgovglgchortd.R.inc(32240);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32241);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32242);TB.testParse_noFormatter();
        __CLR4_4_1ovgovglgchortd.R.inc(32243);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32244);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32245);TB.testFactory_standardDays_long();
        __CLR4_4_1ovgovglgchortd.R.inc(32246);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32247);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32248);TB.testFactory_standardHours_long();
        __CLR4_4_1ovgovglgchortd.R.inc(32249);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32250);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32251);TB.testFactory_standardMinutes_long();
        __CLR4_4_1ovgovglgchortd.R.inc(32252);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32253);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32254);TB.testFactory_standardSeconds_long();
        __CLR4_4_1ovgovglgchortd.R.inc(32255);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32256);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32257);TB.testFactory_millis_long();
        __CLR4_4_1ovgovglgchortd.R.inc(32258);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32259);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32260);TB.testConstructor_long1();
        __CLR4_4_1ovgovglgchortd.R.inc(32261);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32262);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32263);TB.testConstructor_long_long1();
        __CLR4_4_1ovgovglgchortd.R.inc(32264);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32265);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32266);TB.testConstructor_RI_RI1();
        __CLR4_4_1ovgovglgchortd.R.inc(32267);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32268);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32269);TB.testConstructor_RI_RI2();
        __CLR4_4_1ovgovglgchortd.R.inc(32270);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32271);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32272);TB.testConstructor_RI_RI3();
        __CLR4_4_1ovgovglgchortd.R.inc(32273);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32274);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32275);TB.testConstructor_RI_RI4();
        __CLR4_4_1ovgovglgchortd.R.inc(32276);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32277);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32278);TB.testConstructor_Object1();
        __CLR4_4_1ovgovglgchortd.R.inc(32279);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32280);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32281);TB.testConstructor_Object2();
        __CLR4_4_1ovgovglgchortd.R.inc(32282);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32283);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32284);TB.testConstructor_Object3();
        __CLR4_4_1ovgovglgchortd.R.inc(32285);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32286);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32287);TB.testConstructor_Object4();
        __CLR4_4_1ovgovglgchortd.R.inc(32288);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32289);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32290);TB.testConstructor_Object5();
        __CLR4_4_1ovgovglgchortd.R.inc(32291);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32292);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32293);TB.testConstructor_Overflow1();
        __CLR4_4_1ovgovglgchortd.R.inc(32294);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32295);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32296);TB.testConstructor_Overflow2();
        __CLR4_4_1ovgovglgchortd.R.inc(32297);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32298);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32299);TB.testConstructor_Overflow3();
        __CLR4_4_1ovgovglgchortd.R.inc(32300);TB.tearDown();
        __CLR4_4_1ovgovglgchortd.R.inc(32301);TB.setUp();
        __CLR4_4_1ovgovglgchortd.R.inc(32302);TB.testConstructor_Overflow4();
        __CLR4_4_1ovgovglgchortd.R.inc(32303);TB.tearDown();

    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDuration_Constructors.class);
    }

    public TestDuration_Constructors(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1ovgovglgchortd.R.inc(32304);
        __CLR4_4_1ovgovglgchortd.R.inc(32305);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1ovgovglgchortd.R.inc(32306);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1ovgovglgchortd.R.inc(32307);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1ovgovglgchortd.R.inc(32308);originalLocale = Locale.getDefault();
        __CLR4_4_1ovgovglgchortd.R.inc(32309);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1ovgovglgchortd.R.inc(32310);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1ovgovglgchortd.R.inc(32311);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1ovgovglgchortd.R.inc(32312);
        __CLR4_4_1ovgovglgchortd.R.inc(32313);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1ovgovglgchortd.R.inc(32314);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1ovgovglgchortd.R.inc(32315);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1ovgovglgchortd.R.inc(32316);Locale.setDefault(originalLocale);
        __CLR4_4_1ovgovglgchortd.R.inc(32317);originalDateTimeZone = null;
        __CLR4_4_1ovgovglgchortd.R.inc(32318);originalTimeZone = null;
        __CLR4_4_1ovgovglgchortd.R.inc(32319);originalLocale = null;
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testZERO() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14z44vzoxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testZERO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14z44vzoxs() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32320);
        __CLR4_4_1ovgovglgchortd.R.inc(32321);Duration test = Duration.ZERO;
        __CLR4_4_1ovgovglgchortd.R.inc(32322);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvioxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvioxv() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32323);
        __CLR4_4_1ovgovglgchortd.R.inc(32324);assertEquals(new Duration(3200), Duration.parse("PT3.2S"));
        __CLR4_4_1ovgovglgchortd.R.inc(32325);assertEquals(new Duration(6000), Duration.parse("PT6S"));
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_standardDays_long() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypd0jroxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardDays_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypd0jroxy() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32326);
        __CLR4_4_1ovgovglgchortd.R.inc(32327);Duration test = Duration.standardDays(1);
        __CLR4_4_1ovgovglgchortd.R.inc(32328);assertEquals(24L * 60L * 60L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32329);test = Duration.standardDays(2);
        __CLR4_4_1ovgovglgchortd.R.inc(32330);assertEquals(2L * 24L * 60L * 60L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32331);test = Duration.standardDays(0);
        __CLR4_4_1ovgovglgchortd.R.inc(32332);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_standardHours_long() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5kw0noy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardHours_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5kw0noy5() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32333);
        __CLR4_4_1ovgovglgchortd.R.inc(32334);Duration test = Duration.standardHours(1);
        __CLR4_4_1ovgovglgchortd.R.inc(32335);assertEquals(60L * 60L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32336);test = Duration.standardHours(2);
        __CLR4_4_1ovgovglgchortd.R.inc(32337);assertEquals(2L * 60L * 60L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32338);test = Duration.standardHours(0);
        __CLR4_4_1ovgovglgchortd.R.inc(32339);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_standardMinutes_long() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1riuhmhoyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardMinutes_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1riuhmhoyc() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32340);
        __CLR4_4_1ovgovglgchortd.R.inc(32341);Duration test = Duration.standardMinutes(1);
        __CLR4_4_1ovgovglgchortd.R.inc(32342);assertEquals(60L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32343);test = Duration.standardMinutes(2);
        __CLR4_4_1ovgovglgchortd.R.inc(32344);assertEquals(2L * 60L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32345);test = Duration.standardMinutes(0);
        __CLR4_4_1ovgovglgchortd.R.inc(32346);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_standardSeconds_long() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atxzmvoyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_standardSeconds_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atxzmvoyj() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32347);
        __CLR4_4_1ovgovglgchortd.R.inc(32348);Duration test = Duration.standardSeconds(1);
        __CLR4_4_1ovgovglgchortd.R.inc(32349);assertEquals(1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32350);test = Duration.standardSeconds(2);
        __CLR4_4_1ovgovglgchortd.R.inc(32351);assertEquals(2L * 1000L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32352);test = Duration.standardSeconds(0);
        __CLR4_4_1ovgovglgchortd.R.inc(32353);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_millis_long() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdwv2joyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testFactory_millis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdwv2joyq() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32354);
        __CLR4_4_1ovgovglgchortd.R.inc(32355);Duration test = Duration.millis(1);
        __CLR4_4_1ovgovglgchortd.R.inc(32356);assertEquals(1L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32357);test = Duration.millis(2);
        __CLR4_4_1ovgovglgchortd.R.inc(32358);assertEquals(2L, test.getMillis());

        __CLR4_4_1ovgovglgchortd.R.inc(32359);test = Duration.millis(0);
        __CLR4_4_1ovgovglgchortd.R.inc(32360);assertSame(Duration.ZERO, test);
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13croyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13croyx() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32361);
        __CLR4_4_1ovgovglgchortd.R.inc(32362);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1ovgovglgchortd.R.inc(32363);Duration test = new Duration(length);
        __CLR4_4_1ovgovglgchortd.R.inc(32364);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4oz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4oz1() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32365);
        __CLR4_4_1ovgovglgchortd.R.inc(32366);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ovgovglgchortd.R.inc(32367);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1ovgovglgchortd.R.inc(32368);Duration test = new Duration(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1ovgovglgchortd.R.inc(32369);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsoz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsoz6() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32370);
        __CLR4_4_1ovgovglgchortd.R.inc(32371);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ovgovglgchortd.R.inc(32372);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1ovgovglgchortd.R.inc(32373);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1ovgovglgchortd.R.inc(32374);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbozb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbozb() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32375);
        __CLR4_4_1ovgovglgchortd.R.inc(32376);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1ovgovglgchortd.R.inc(32377);DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1ovgovglgchortd.R.inc(32378);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1ovgovglgchortd.R.inc(32379);assertEquals(dt2.getMillis() - TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsuozg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsuozg() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32380);
        __CLR4_4_1ovgovglgchortd.R.inc(32381);DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1);
        __CLR4_4_1ovgovglgchortd.R.inc(32382);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1ovgovglgchortd.R.inc(32383);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1ovgovglgchortd.R.inc(32384);assertEquals(TEST_TIME_NOW - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0dozl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0dozl() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32385);
        __CLR4_4_1ovgovglgchortd.R.inc(32386);DateTime dt1 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1ovgovglgchortd.R.inc(32387);DateTime dt2 = null;  // 2002-06-09T01:00+01:00
        __CLR4_4_1ovgovglgchortd.R.inc(32388);Duration test = new Duration(dt1, dt2);
        __CLR4_4_1ovgovglgchortd.R.inc(32389);assertEquals(0L, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyozq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyozq() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32390);
        __CLR4_4_1ovgovglgchortd.R.inc(32391);Duration test = new Duration("PT72.345S");
        __CLR4_4_1ovgovglgchortd.R.inc(32392);assertEquals(72345, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fozt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fozt() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32393);
        __CLR4_4_1ovgovglgchortd.R.inc(32394);Duration test = new Duration((Object) null);
        __CLR4_4_1ovgovglgchortd.R.inc(32395);assertEquals(0L, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Object3() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwozw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwozw() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32396);
        __CLR4_4_1ovgovglgchortd.R.inc(32397);long length = 4 * DateTimeConstants.MILLIS_PER_DAY +
                5 * DateTimeConstants.MILLIS_PER_HOUR +
                6 * DateTimeConstants.MILLIS_PER_MINUTE +
                7 * DateTimeConstants.MILLIS_PER_SECOND + 8;
        __CLR4_4_1ovgovglgchortd.R.inc(32398);Long base = new Long(length);
        __CLR4_4_1ovgovglgchortd.R.inc(32399);Duration test = new Duration(base);
        __CLR4_4_1ovgovglgchortd.R.inc(32400);assertEquals(length, test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Object4() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqdp01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqdp01() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32401);
        __CLR4_4_1ovgovglgchortd.R.inc(32402);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ovgovglgchortd.R.inc(32403);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1ovgovglgchortd.R.inc(32404);Duration base = new Duration(dt1, dt2);
        __CLR4_4_1ovgovglgchortd.R.inc(32405);Duration test = new Duration(base);
        __CLR4_4_1ovgovglgchortd.R.inc(32406);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Object5() throws Throwable {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moqsiup07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moqsiup07() throws Throwable{try{__CLR4_4_1ovgovglgchortd.R.inc(32407);
        __CLR4_4_1ovgovglgchortd.R.inc(32408);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1ovgovglgchortd.R.inc(32409);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1ovgovglgchortd.R.inc(32410);Interval base = new Interval(dt1, dt2);
        __CLR4_4_1ovgovglgchortd.R.inc(32411);Duration test = new Duration(base);
        __CLR4_4_1ovgovglgchortd.R.inc(32412);assertEquals(dt2.getMillis() - dt1.getMillis(), test.getMillis());
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor overflow
     */
    @Test
    public void testConstructor_Overflow1() {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy4tepp0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Overflow1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy4tepp0d(){try{__CLR4_4_1ovgovglgchortd.R.inc(32413);
        __CLR4_4_1ovgovglgchortd.R.inc(32414);try {
            __CLR4_4_1ovgovglgchortd.R.inc(32415);Duration test = new Duration(-1, Long.MAX_VALUE);
            __CLR4_4_1ovgovglgchortd.R.inc(32416);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Overflow2() {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lp4um8p0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Overflow2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lp4um8p0h(){try{__CLR4_4_1ovgovglgchortd.R.inc(32417);
        __CLR4_4_1ovgovglgchortd.R.inc(32418);try {
            __CLR4_4_1ovgovglgchortd.R.inc(32419);Duration test = new Duration(Long.MIN_VALUE, 1);
            __CLR4_4_1ovgovglgchortd.R.inc(32420);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Overflow3() {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ig4vtrp0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Overflow3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ig4vtrp0l(){try{__CLR4_4_1ovgovglgchortd.R.inc(32421);
        __CLR4_4_1ovgovglgchortd.R.inc(32422);try {
            __CLR4_4_1ovgovglgchortd.R.inc(32423);Instant max = new Instant(Long.MAX_VALUE);
            __CLR4_4_1ovgovglgchortd.R.inc(32424);Duration test = new Duration(new Instant(-1), max);
            __CLR4_4_1ovgovglgchortd.R.inc(32425);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}

    @Test
    public void testConstructor_Overflow4() {__CLR4_4_1ovgovglgchortd.R.globalSliceStart(getClass().getName(),32426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f74x1ap0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ovgovglgchortd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ovgovglgchortd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDuration_Constructors.testConstructor_Overflow4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f74x1ap0q(){try{__CLR4_4_1ovgovglgchortd.R.inc(32426);
        __CLR4_4_1ovgovglgchortd.R.inc(32427);try {
            __CLR4_4_1ovgovglgchortd.R.inc(32428);Instant min = new Instant(Long.MIN_VALUE);
            __CLR4_4_1ovgovglgchortd.R.inc(32429);Duration test = new Duration(min, new Instant(1));
            __CLR4_4_1ovgovglgchortd.R.inc(32430);fail();
        } catch (ArithmeticException ex) {
            // expected
        }
    }finally{__CLR4_4_1ovgovglgchortd.R.flushNeeded();}}
}
