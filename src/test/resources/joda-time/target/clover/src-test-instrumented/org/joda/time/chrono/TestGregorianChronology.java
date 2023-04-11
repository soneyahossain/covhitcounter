/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
/*
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology {static class __CLR4_4_11bxf1bxflgchosmw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,62376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;// extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62115);
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62116);TestGregorianChronology TB = new TestGregorianChronology();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62117);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62118);TB.testFactoryUTC();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62119);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62120);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62121);TB.testFactory();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62122);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62123);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62124);TB.testFactory_Zone();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62125);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62126);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62127);TB.testFactory_Zone_int();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62128);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62129);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62130);TB.testEquality();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62131);TB.tearDown();

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62132);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62133);TB.testWithUTC();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62134);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62135);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62136);TB.testFactory();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62137);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62138);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62139);TB.testToString();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62140);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62141);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62142);TB.testDurationFields();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62143);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62144);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62145);TB.testDateFields();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62146);TB.tearDown();

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62147);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62148);TB.testTimeFields();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62149);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62150);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62151);TB.testMaximumValue();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62152);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62153);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62154);TB.testLeap_28feb();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62155);TB.tearDown();


        __CLR4_4_11bxf1bxflgchosmw.R.inc(62156);TB.setUp();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62157);TB.testLeap_29feb();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62158);TB.tearDown();


    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestGregorianChronology.class);
    }

    public TestGregorianChronology(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62159);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62160);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62161);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62162);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62163);originalLocale = Locale.getDefault();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62164);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62165);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62166);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62167);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62168);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62169);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62170);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62171);Locale.setDefault(originalLocale);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62172);originalDateTimeZone = null;
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62173);originalTimeZone = null;
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62174);originalLocale = null;
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactoryUTC() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19knvhv1bz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactoryUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19knvhv1bz3(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62175);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62176);assertEquals(DateTimeZone.UTC, GregorianChronology.getInstanceUTC().getZone());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62177);assertSame(GregorianChronology.class, GregorianChronology.getInstanceUTC().getClass());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testFactory() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116tztt1bz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116tztt1bz6(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62178);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62179);assertEquals(LONDON, GregorianChronology.getInstance().getZone());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62180);assertSame(GregorianChronology.class, GregorianChronology.getInstance().getClass());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testFactory_Zone() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy5ime1bz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy5ime1bz9(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62181);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62182);assertEquals(TOKYO, GregorianChronology.getInstance(TOKYO).getZone());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62183);assertEquals(PARIS, GregorianChronology.getInstance(PARIS).getZone());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62184);assertEquals(LONDON, GregorianChronology.getInstance(null).getZone());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62185);assertSame(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testFactory_Zone_int() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvgr121bze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testFactory_Zone_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvgr121bze(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62186);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62187);GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62188);assertEquals(TOKYO, chrono.getZone());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62189);assertEquals(2, chrono.getMinimumDaysInFirstWeek());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62190);try {
            __CLR4_4_11bxf1bxflgchosmw.R.inc(62191);GregorianChronology.getInstance(TOKYO, 0);
            __CLR4_4_11bxf1bxflgchosmw.R.inc(62192);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62193);try {
            __CLR4_4_11bxf1bxflgchosmw.R.inc(62194);GregorianChronology.getInstance(TOKYO, 8);
            __CLR4_4_11bxf1bxflgchosmw.R.inc(62195);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquality() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12agdql1bzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testEquality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12agdql1bzo(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62196);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62197);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62198);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62199);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62200);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62201);assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON));
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testWithUTC() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19orv831bzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithUTC",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19orv831bzu(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62202);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62203);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(LONDON).withUTC());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62204);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance(TOKYO).withUTC());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62205);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC().withUTC());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62206);assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstance().withUTC());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testWithZone() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1me3iet1bzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testWithZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1me3iet1bzz(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62207);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62208);assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62209);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62210);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62211);assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62212);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62213);assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS));
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1c06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1c06(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62214);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62215);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62216);assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62217);assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62218);assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62219);assertEquals("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}


    //-----------------------------------------------------------------------
    @Test
    public void testDurationFields() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnkzye1c0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testDurationFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnkzye1c0c(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62220);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62221);final GregorianChronology greg = GregorianChronology.getInstance();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62222);assertEquals("eras", greg.eras().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62223);assertEquals("centuries", greg.centuries().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62224);assertEquals("years", greg.years().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62225);assertEquals("weekyears", greg.weekyears().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62226);assertEquals("months", greg.months().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62227);assertEquals("weeks", greg.weeks().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62228);assertEquals("days", greg.days().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62229);assertEquals("halfdays", greg.halfdays().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62230);assertEquals("hours", greg.hours().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62231);assertEquals("minutes", greg.minutes().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62232);assertEquals("seconds", greg.seconds().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62233);assertEquals("millis", greg.millis().getName());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62234);assertEquals(false, greg.eras().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62235);assertEquals(true, greg.centuries().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62236);assertEquals(true, greg.years().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62237);assertEquals(true, greg.weekyears().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62238);assertEquals(true, greg.months().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62239);assertEquals(true, greg.weeks().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62240);assertEquals(true, greg.days().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62241);assertEquals(true, greg.halfdays().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62242);assertEquals(true, greg.hours().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62243);assertEquals(true, greg.minutes().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62244);assertEquals(true, greg.seconds().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62245);assertEquals(true, greg.millis().isSupported());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62246);assertEquals(false, greg.centuries().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62247);assertEquals(false, greg.years().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62248);assertEquals(false, greg.weekyears().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62249);assertEquals(false, greg.months().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62250);assertEquals(false, greg.weeks().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62251);assertEquals(false, greg.days().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62252);assertEquals(false, greg.halfdays().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62253);assertEquals(true, greg.hours().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62254);assertEquals(true, greg.minutes().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62255);assertEquals(true, greg.seconds().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62256);assertEquals(true, greg.millis().isPrecise());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62257);final GregorianChronology gregUTC = GregorianChronology.getInstanceUTC();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62258);assertEquals(false, gregUTC.centuries().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62259);assertEquals(false, gregUTC.years().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62260);assertEquals(false, gregUTC.weekyears().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62261);assertEquals(false, gregUTC.months().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62262);assertEquals(true, gregUTC.weeks().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62263);assertEquals(true, gregUTC.days().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62264);assertEquals(true, gregUTC.halfdays().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62265);assertEquals(true, gregUTC.hours().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62266);assertEquals(true, gregUTC.minutes().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62267);assertEquals(true, gregUTC.seconds().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62268);assertEquals(true, gregUTC.millis().isPrecise());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62269);final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT");
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62270);final GregorianChronology gregGMT = GregorianChronology.getInstance(gmt);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62271);assertEquals(false, gregGMT.centuries().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62272);assertEquals(false, gregGMT.years().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62273);assertEquals(false, gregGMT.weekyears().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62274);assertEquals(false, gregGMT.months().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62275);assertEquals(true, gregGMT.weeks().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62276);assertEquals(true, gregGMT.days().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62277);assertEquals(true, gregGMT.halfdays().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62278);assertEquals(true, gregGMT.hours().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62279);assertEquals(true, gregGMT.minutes().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62280);assertEquals(true, gregGMT.seconds().isPrecise());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62281);assertEquals(true, gregGMT.millis().isPrecise());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testDateFields() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gkspeo1c22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gkspeo1c22(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62282);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62283);final GregorianChronology greg = GregorianChronology.getInstance();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62284);assertEquals("era", greg.era().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62285);assertEquals("centuryOfEra", greg.centuryOfEra().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62286);assertEquals("yearOfCentury", greg.yearOfCentury().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62287);assertEquals("yearOfEra", greg.yearOfEra().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62288);assertEquals("year", greg.year().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62289);assertEquals("monthOfYear", greg.monthOfYear().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62290);assertEquals("weekyearOfCentury", greg.weekyearOfCentury().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62291);assertEquals("weekyear", greg.weekyear().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62292);assertEquals("weekOfWeekyear", greg.weekOfWeekyear().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62293);assertEquals("dayOfYear", greg.dayOfYear().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62294);assertEquals("dayOfMonth", greg.dayOfMonth().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62295);assertEquals("dayOfWeek", greg.dayOfWeek().getName());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62296);assertEquals(true, greg.era().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62297);assertEquals(true, greg.centuryOfEra().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62298);assertEquals(true, greg.yearOfCentury().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62299);assertEquals(true, greg.yearOfEra().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62300);assertEquals(true, greg.year().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62301);assertEquals(true, greg.monthOfYear().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62302);assertEquals(true, greg.weekyearOfCentury().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62303);assertEquals(true, greg.weekyear().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62304);assertEquals(true, greg.weekOfWeekyear().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62305);assertEquals(true, greg.dayOfYear().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62306);assertEquals(true, greg.dayOfMonth().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62307);assertEquals(true, greg.dayOfWeek().isSupported());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62308);assertEquals(greg.eras(), greg.era().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62309);assertEquals(greg.centuries(), greg.centuryOfEra().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62310);assertEquals(greg.years(), greg.yearOfCentury().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62311);assertEquals(greg.years(), greg.yearOfEra().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62312);assertEquals(greg.years(), greg.year().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62313);assertEquals(greg.months(), greg.monthOfYear().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62314);assertEquals(greg.weekyears(), greg.weekyearOfCentury().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62315);assertEquals(greg.weekyears(), greg.weekyear().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62316);assertEquals(greg.weeks(), greg.weekOfWeekyear().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62317);assertEquals(greg.days(), greg.dayOfYear().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62318);assertEquals(greg.days(), greg.dayOfMonth().getDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62319);assertEquals(greg.days(), greg.dayOfWeek().getDurationField());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62320);assertEquals(null, greg.era().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62321);assertEquals(greg.eras(), greg.centuryOfEra().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62322);assertEquals(greg.centuries(), greg.yearOfCentury().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62323);assertEquals(greg.eras(), greg.yearOfEra().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62324);assertEquals(null, greg.year().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62325);assertEquals(greg.years(), greg.monthOfYear().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62326);assertEquals(greg.centuries(), greg.weekyearOfCentury().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62327);assertEquals(null, greg.weekyear().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62328);assertEquals(greg.weekyears(), greg.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62329);assertEquals(greg.years(), greg.dayOfYear().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62330);assertEquals(greg.months(), greg.dayOfMonth().getRangeDurationField());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62331);assertEquals(greg.weeks(), greg.dayOfWeek().getRangeDurationField());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testTimeFields() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r11up1c3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testTimeFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r11up1c3g(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62332);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62333);final GregorianChronology greg = GregorianChronology.getInstance();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62334);assertEquals("halfdayOfDay", greg.halfdayOfDay().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62335);assertEquals("clockhourOfHalfday", greg.clockhourOfHalfday().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62336);assertEquals("hourOfHalfday", greg.hourOfHalfday().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62337);assertEquals("clockhourOfDay", greg.clockhourOfDay().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62338);assertEquals("hourOfDay", greg.hourOfDay().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62339);assertEquals("minuteOfDay", greg.minuteOfDay().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62340);assertEquals("minuteOfHour", greg.minuteOfHour().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62341);assertEquals("secondOfDay", greg.secondOfDay().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62342);assertEquals("secondOfMinute", greg.secondOfMinute().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62343);assertEquals("millisOfDay", greg.millisOfDay().getName());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62344);assertEquals("millisOfSecond", greg.millisOfSecond().getName());

        __CLR4_4_11bxf1bxflgchosmw.R.inc(62345);assertEquals(true, greg.halfdayOfDay().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62346);assertEquals(true, greg.clockhourOfHalfday().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62347);assertEquals(true, greg.hourOfHalfday().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62348);assertEquals(true, greg.clockhourOfDay().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62349);assertEquals(true, greg.hourOfDay().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62350);assertEquals(true, greg.minuteOfDay().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62351);assertEquals(true, greg.minuteOfHour().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62352);assertEquals(true, greg.secondOfDay().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62353);assertEquals(true, greg.secondOfMinute().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62354);assertEquals(true, greg.millisOfDay().isSupported());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62355);assertEquals(true, greg.millisOfSecond().isSupported());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testMaximumValue() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qnw3be1c44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testMaximumValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qnw3be1c44(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62356);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62357);YearMonthDay ymd1 = new YearMonthDay(1999, DateTimeConstants.FEBRUARY, 1);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62358);DateMidnight dm1 = new DateMidnight(1999, DateTimeConstants.FEBRUARY, 1);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62359);Chronology chrono = GregorianChronology.getInstance();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62360);assertEquals(28, chrono.dayOfMonth().getMaximumValue(ymd1));
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62361);assertEquals(28, chrono.dayOfMonth().getMaximumValue(dm1.getMillis()));
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testLeap_28feb() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149q6ov1c4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testLeap_28feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149q6ov1c4a(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62362);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62363);Chronology chrono = GregorianChronology.getInstance();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62364);DateTime dt = new DateTime(2012, 2, 28, 0, 0, chrono);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62365);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62366);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62367);assertEquals(false, dt.dayOfMonth().isLeap());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62368);assertEquals(false, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

    @Test
    public void testLeap_29feb() {__CLR4_4_11bxf1bxflgchosmw.R.globalSliceStart(getClass().getName(),62369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194etwe1c4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bxf1bxflgchosmw.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bxf1bxflgchosmw.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.TestGregorianChronology.testLeap_29feb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194etwe1c4h(){try{__CLR4_4_11bxf1bxflgchosmw.R.inc(62369);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62370);Chronology chrono = GregorianChronology.getInstance();
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62371);DateTime dt = new DateTime(2012, 2, 29, 0, 0, chrono);
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62372);assertEquals(true, dt.year().isLeap());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62373);assertEquals(true, dt.monthOfYear().isLeap());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62374);assertEquals(true, dt.dayOfMonth().isLeap());
        __CLR4_4_11bxf1bxflgchosmw.R.inc(62375);assertEquals(true, dt.dayOfYear().isLeap());
    }finally{__CLR4_4_11bxf1bxflgchosmw.R.flushNeeded();}}

}
