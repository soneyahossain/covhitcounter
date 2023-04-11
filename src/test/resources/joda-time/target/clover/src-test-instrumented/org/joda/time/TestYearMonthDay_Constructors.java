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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Constructors {static class __CLR4_4_118vr18vrlgchosjf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,58499,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_118vr18vrlgchosjf.R.inc(58167);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58168);TestYearMonthDay_Constructors TB = new TestYearMonthDay_Constructors();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58169);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58170);TB.testFactory_FromCalendarFields();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58171);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58172);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58173);TB.testFactory_FromDateFields();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58174);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58175);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58176);TB.testConstructor();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58177);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58178);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58179);TB.testConstructor_DateTimeZone();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58180);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58181);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58182);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58183);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58184);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58185);TB.testConstructor_Chronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58186);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58187);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58188);TB.testConstructor_nullChronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58189);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58190);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58191);TB.testConstructor_long1();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58192);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58193);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58194);TB.testConstructor_long2();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58195);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58196);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58197);TB.testConstructor_long1_Chronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58198);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58199);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58200);TB.testConstructor_long2_Chronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58201);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58202);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58203);TB.testConstructor_long_nullChronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58204);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58205);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58206);TB.testConstructor_Object();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58207);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58208);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58209);TB.testConstructor_nullObject();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58210);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58211);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58212);TB.testConstructor_ObjectString1();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58213);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58214);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58215);TB.testConstructor_ObjectString2();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58216);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58217);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58218);TB.testConstructor_ObjectString3();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58219);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58220);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58221);TB.testConstructor_ObjectString4();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58222);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58223);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58224);TB.testConstructor_ObjectString5();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58225);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58226);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58227);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58228);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58229);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58230);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58231);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58232);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58233);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58234);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58235);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58236);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58237);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58238);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58239);TB.testConstructor_Object_Chronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58240);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58241);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58242);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58243);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58244);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58245);TB.testConstructor_Object_nullChronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58246);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58247);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58248);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58249);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58250);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58251);TB.testConstructor_int_int_int();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58252);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58253);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58254);TB.testConstructor_int_int_int_Chronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58255);TB.tearDown();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58256);TB.setUp();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58257);TB.testConstructor_int_int_int_nullChronology();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58258);TB.tearDown();

    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonthDay_Constructors.class);
    }

    public TestYearMonthDay_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_118vr18vrlgchosjf.R.inc(58259);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58260);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58261);zone = DateTimeZone.getDefault();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58262);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_118vr18vrlgchosjf.R.inc(58263);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58264);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58265);DateTimeZone.setDefault(zone);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58266);zone = null;
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb318yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb318yj() throws Exception{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58267);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58268);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58269);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58270);YearMonthDay expected = new YearMonthDay(1970, 2, 3);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58271);assertEquals(expected, YearMonthDay.fromCalendarFields(cal));
        __CLR4_4_118vr18vrlgchosjf.R.inc(58272);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58273);YearMonthDay.fromCalendarFields(null);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58274);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromDateFields() throws Exception {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u5j2718yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testFactory_FromDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u5j2718yr() throws Exception{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58275);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58276);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58277);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58278);YearMonthDay expected = new YearMonthDay(1970, 2, 3);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58279);assertEquals(expected, YearMonthDay.fromDateFields(cal.getTime()));
        __CLR4_4_118vr18vrlgchosjf.R.inc(58280);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58281);YearMonthDay.fromDateFields(null);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58282);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h18yz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h18yz() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58283);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58284);YearMonthDay test = new YearMonthDay();
        __CLR4_4_118vr18vrlgchosjf.R.inc(58285);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58286);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58287);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58288);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k518z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k518z5() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58289);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58290);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58291);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_118vr18vrlgchosjf.R.inc(58292);YearMonthDay test = new YearMonthDay(LONDON);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58293);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58294);assertEquals(2005, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58295);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58296);assertEquals(8, test.getDayOfMonth());

        __CLR4_4_118vr18vrlgchosjf.R.inc(58297);test = new YearMonthDay(PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58298);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58299);assertEquals(2005, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58300);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58301);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ro18zi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ro18zi() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58302);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58303);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58304);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_118vr18vrlgchosjf.R.inc(58305);YearMonthDay test = new YearMonthDay((DateTimeZone) null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58306);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58307);assertEquals(2005, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58308);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58309);assertEquals(8, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931ti18zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931ti18zq() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58310);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58311);YearMonthDay test = new YearMonthDay(GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58312);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58313);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58314);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58315);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6r18zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6r18zw() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58316);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58317);YearMonthDay test = new YearMonthDay((Chronology) null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58318);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58319);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58320);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58321);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr1902();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr1902() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58322);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58323);YearMonthDay test = new YearMonthDay(TEST_TIME1);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58324);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58325);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58326);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58327);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka1908();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka1908() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58328);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58329);YearMonthDay test = new YearMonthDay(TEST_TIME2);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58330);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58331);assertEquals(1971, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58332);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58333);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5s190e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5s190e() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58334);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58335);YearMonthDay test = new YearMonthDay(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58336);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58337);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58338);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58339);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkh190k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkh190k() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58340);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58341);YearMonthDay test = new YearMonthDay(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58342);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58343);assertEquals(1971, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58344);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58345);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhcku190q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhcku190q() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58346);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58347);YearMonthDay test = new YearMonthDay(TEST_TIME1, null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58348);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58349);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58350);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58351);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplceb190w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplceb190w() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58352);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58353);Date date = new Date(TEST_TIME1);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58354);YearMonthDay test = new YearMonthDay(date);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58355);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58356);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58357);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58358);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uk1913();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uk1913() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58359);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58360);YearMonthDay test = new YearMonthDay((Object) null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58361);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58362);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58363);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58364);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5d1919();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5d1919() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58365);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58366);YearMonthDay test = new YearMonthDay("1972-12-03");
        __CLR4_4_118vr18vrlgchosjf.R.inc(58367);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58368);assertEquals(1972, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58369);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58370);assertEquals(3, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xu191f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xu191f() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58371);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58372);YearMonthDay test = new YearMonthDay("1972-12-03T+14:00");
        __CLR4_4_118vr18vrlgchosjf.R.inc(58373);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58374);assertEquals(1972, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58375);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58376);assertEquals(2, test.getDayOfMonth());  // timezone
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qb191l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qb191l() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58377);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58378);YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040");
        __CLR4_4_118vr18vrlgchosjf.R.inc(58379);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58380);assertEquals(1972, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58381);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58382);assertEquals(3, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327is191r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327is191r() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58383);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58384);YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040+14:00");
        __CLR4_4_118vr18vrlgchosjf.R.inc(58385);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58386);assertEquals(1972, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58387);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58388);assertEquals(2, test.getDayOfMonth());  // timezone
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9191x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9191x() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58389);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58390);YearMonthDay test = new YearMonthDay("10");
        __CLR4_4_118vr18vrlgchosjf.R.inc(58391);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58392);assertEquals(10, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58393);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58394);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daule1923();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daule1923() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58395);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58396);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58397);new YearMonthDay("T10:20:30.040");
            __CLR4_4_118vr18vrlgchosjf.R.inc(58398);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp4731927();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp4731927() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58399);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58400);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58401);new YearMonthDay("T10:20:30.040+14:00");
            __CLR4_4_118vr18vrlgchosjf.R.inc(58402);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zk192b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zk192b() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58403);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58404);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58405);new YearMonthDay("10:20:30.040");
            __CLR4_4_118vr18vrlgchosjf.R.inc(58406);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1192f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1192f() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58407);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58408);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58409);new YearMonthDay("10:20:30.040+14:00");
            __CLR4_4_118vr18vrlgchosjf.R.inc(58410);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4192j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4192j() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58411);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58412);Date date = new Date(TEST_TIME1);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58413);YearMonthDay test = new YearMonthDay(date, GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58414);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58415);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58416);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58417);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyn192q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyn192q() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58418);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58419);YearMonthDay test = new YearMonthDay((Object) null, GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58420);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58421);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58422);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58423);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijz192w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijz192w() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58424);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58425);Date date = new Date(TEST_TIME1);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58426);YearMonthDay test = new YearMonthDay(date, null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58427);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58428);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58429);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58430);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve01933();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve01933() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58431);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58432);YearMonthDay test = new YearMonthDay((Object) null, null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58433);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58434);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58435);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58436);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int, int)
     */
    @Test
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqn1939();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqn1939() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58437);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58438);YearMonthDay test = new YearMonthDay(1970, 6, 9);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58439);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58440);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58441);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58442);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58443);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58444);new YearMonthDay(Integer.MIN_VALUE, 6, 9);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58445);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58446);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58447);new YearMonthDay(Integer.MAX_VALUE, 6, 9);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58448);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58449);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58450);new YearMonthDay(1970, 0, 9);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58451);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58452);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58453);new YearMonthDay(1970, 13, 9);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58454);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58455);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58456);new YearMonthDay(1970, 6, 0);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58457);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58458);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58459);new YearMonthDay(1970, 6, 31);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58460);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58461);new YearMonthDay(1970, 7, 31);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58462);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58463);new YearMonthDay(1970, 7, 32);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58464);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzq1941();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzq1941() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58465);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58466);YearMonthDay test = new YearMonthDay(1970, 6, 9, GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58467);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58468);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58469);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58470);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58471);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58472);new YearMonthDay(Integer.MIN_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58473);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58474);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58475);new YearMonthDay(Integer.MAX_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58476);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58477);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58478);new YearMonthDay(1970, 0, 9, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58479);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58480);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58481);new YearMonthDay(1970, 13, 9, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58482);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58483);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58484);new YearMonthDay(1970, 6, 0, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58485);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58486);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58487);new YearMonthDay(1970, 6, 31, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58488);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_118vr18vrlgchosjf.R.inc(58489);new YearMonthDay(1970, 7, 31, GREGORIAN_PARIS);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58490);try {
            __CLR4_4_118vr18vrlgchosjf.R.inc(58491);new YearMonthDay(1970, 7, 32, GREGORIAN_PARIS);
            __CLR4_4_118vr18vrlgchosjf.R.inc(58492);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_118vr18vrlgchosjf.R.globalSliceStart(getClass().getName(),58493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gt194t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_118vr18vrlgchosjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_118vr18vrlgchosjf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonthDay_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),58493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gt194t() throws Throwable{try{__CLR4_4_118vr18vrlgchosjf.R.inc(58493);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58494);YearMonthDay test = new YearMonthDay(1970, 6, 9, null);
        __CLR4_4_118vr18vrlgchosjf.R.inc(58495);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58496);assertEquals(1970, test.getYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58497);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_118vr18vrlgchosjf.R.inc(58498);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_118vr18vrlgchosjf.R.flushNeeded();}}

}
