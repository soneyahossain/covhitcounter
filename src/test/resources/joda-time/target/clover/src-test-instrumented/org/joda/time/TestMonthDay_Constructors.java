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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Constuctors}
 */
public class TestMonthDay_Constructors {static class __CLR4_4_1x96x96lgchos5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,43379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

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

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1x96x96lgchos5i.R.inc(43098);
        __CLR4_4_1x96x96lgchos5i.R.inc(43099);TestMonthDay_Constructors TB = new TestMonthDay_Constructors();
        __CLR4_4_1x96x96lgchos5i.R.inc(43100);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43101);TB.testParse_noFormatter();
        __CLR4_4_1x96x96lgchos5i.R.inc(43102);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43103);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43104);TB.testParse_formatter();
        __CLR4_4_1x96x96lgchos5i.R.inc(43105);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43106);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43107);TB.testFactory_FromCalendarFields();
        __CLR4_4_1x96x96lgchos5i.R.inc(43108);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43109);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43110);TB.testFactory_FromDateFields();
        __CLR4_4_1x96x96lgchos5i.R.inc(43111);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43112);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43113);TB.testConstructor();
        __CLR4_4_1x96x96lgchos5i.R.inc(43114);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43115);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43116);TB.testConstructor_DateTimeZone();
        __CLR4_4_1x96x96lgchos5i.R.inc(43117);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43118);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43119);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1x96x96lgchos5i.R.inc(43120);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43121);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43122);TB.testConstructor_Chronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43123);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43124);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43125);TB.testConstructor_nullChronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43126);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43127);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43128);TB.testConstructor_long1();
        __CLR4_4_1x96x96lgchos5i.R.inc(43129);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43130);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43131);TB.testConstructor_long2();
        __CLR4_4_1x96x96lgchos5i.R.inc(43132);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43133);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43134);TB.testConstructor_long1_Chronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43135);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43136);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43137);TB.testConstructor_long2_Chronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43138);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43139);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43140);TB.testConstructor_long_nullChronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43141);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43142);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43143);TB.testConstructor_Object();
        __CLR4_4_1x96x96lgchos5i.R.inc(43144);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43145);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43146);TB.testConstructor_nullObject();
        __CLR4_4_1x96x96lgchos5i.R.inc(43147);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43148);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43149);TB.testConstructor_ObjectString1();
        __CLR4_4_1x96x96lgchos5i.R.inc(43150);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43151);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43152);TB.testConstructor_ObjectString5();
        __CLR4_4_1x96x96lgchos5i.R.inc(43153);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43154);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43155);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_1x96x96lgchos5i.R.inc(43156);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43157);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43158);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_1x96x96lgchos5i.R.inc(43159);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43160);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43161);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_1x96x96lgchos5i.R.inc(43162);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43163);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43164);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_1x96x96lgchos5i.R.inc(43165);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43166);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43167);TB.testConstructor_Object_Chronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43168);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43169);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43170);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43171);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43172);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43173);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43174);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43175);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43176);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43177);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43178);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43179);TB.testConstructor_int_int();
        __CLR4_4_1x96x96lgchos5i.R.inc(43180);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43181);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43182);TB.testConstructor_int_int_Chronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43183);TB.tearDown();
        __CLR4_4_1x96x96lgchos5i.R.inc(43184);TB.setUp();
        __CLR4_4_1x96x96lgchos5i.R.inc(43185);TB.testConstructor_int_int_nullChronology();
        __CLR4_4_1x96x96lgchos5i.R.inc(43186);TB.tearDown();

    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestMonthDay_Constructors.class);
    }

    public TestMonthDay_Constructors(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1x96x96lgchos5i.R.inc(43187);
        __CLR4_4_1x96x96lgchos5i.R.inc(43188);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1x96x96lgchos5i.R.inc(43189);zone = DateTimeZone.getDefault();
        __CLR4_4_1x96x96lgchos5i.R.inc(43190);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1x96x96lgchos5i.R.inc(43191);
        __CLR4_4_1x96x96lgchos5i.R.inc(43192);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1x96x96lgchos5i.R.inc(43193);DateTimeZone.setDefault(zone);
        __CLR4_4_1x96x96lgchos5i.R.inc(43194);zone = null;
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvixbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvixbv() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43195);
        __CLR4_4_1x96x96lgchos5i.R.inc(43196);assertEquals(new MonthDay(6, 30), MonthDay.parse("--06-30"));
        __CLR4_4_1x96x96lgchos5i.R.inc(43197);assertEquals(new MonthDay(2, 29), MonthDay.parse("--02-29"));
        __CLR4_4_1x96x96lgchos5i.R.inc(43198);assertEquals(new MonthDay(6, 30), MonthDay.parse("2010-06-30"));
        __CLR4_4_1x96x96lgchos5i.R.inc(43199);assertEquals(new MonthDay(1, 2), MonthDay.parse("2010-002"));
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxxc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxxc0() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43200);
        __CLR4_4_1x96x96lgchos5i.R.inc(43201);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1x96x96lgchos5i.R.inc(43202);assertEquals(new MonthDay(6, 30), MonthDay.parse("2010--30 06", f));
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb3xc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb3xc3() throws Exception{try{__CLR4_4_1x96x96lgchos5i.R.inc(43203);
        __CLR4_4_1x96x96lgchos5i.R.inc(43204);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1x96x96lgchos5i.R.inc(43205);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1x96x96lgchos5i.R.inc(43206);MonthDay expected = new MonthDay(2, 3);
        __CLR4_4_1x96x96lgchos5i.R.inc(43207);assertEquals(expected, MonthDay.fromCalendarFields(cal));
        __CLR4_4_1x96x96lgchos5i.R.inc(43208);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43209);MonthDay.fromCalendarFields(null);
            __CLR4_4_1x96x96lgchos5i.R.inc(43210);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromDateFields() throws Exception {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u5j27xcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testFactory_FromDateFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u5j27xcb() throws Exception{try{__CLR4_4_1x96x96lgchos5i.R.inc(43211);
        __CLR4_4_1x96x96lgchos5i.R.inc(43212);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1x96x96lgchos5i.R.inc(43213);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1x96x96lgchos5i.R.inc(43214);MonthDay expected = new MonthDay(2, 3);
        __CLR4_4_1x96x96lgchos5i.R.inc(43215);assertEquals(expected, MonthDay.fromDateFields(cal.getTime()));
        __CLR4_4_1x96x96lgchos5i.R.inc(43216);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43217);MonthDay.fromDateFields(null);
            __CLR4_4_1x96x96lgchos5i.R.inc(43218);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hxcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hxcj() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43219);
        __CLR4_4_1x96x96lgchos5i.R.inc(43220);MonthDay test = new MonthDay();
        __CLR4_4_1x96x96lgchos5i.R.inc(43221);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43222);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43223);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1x96x96lgchos5i.R.inc(43224);assertEquals(test, MonthDay.now());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5xcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5xcp() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43225);
        __CLR4_4_1x96x96lgchos5i.R.inc(43226);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_1x96x96lgchos5i.R.inc(43227);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1x96x96lgchos5i.R.inc(43228);MonthDay test = new MonthDay(LONDON);
        __CLR4_4_1x96x96lgchos5i.R.inc(43229);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43230);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43231);assertEquals(30, test.getDayOfMonth());
        __CLR4_4_1x96x96lgchos5i.R.inc(43232);assertEquals(test, MonthDay.now(LONDON));

        __CLR4_4_1x96x96lgchos5i.R.inc(43233);test = new MonthDay(PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43234);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43235);assertEquals(7, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43236);assertEquals(1, test.getDayOfMonth());
        __CLR4_4_1x96x96lgchos5i.R.inc(43237);assertEquals(test, MonthDay.now(PARIS));
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1roxd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1roxd2() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43238);
        __CLR4_4_1x96x96lgchos5i.R.inc(43239);DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON);
        __CLR4_4_1x96x96lgchos5i.R.inc(43240);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1x96x96lgchos5i.R.inc(43241);MonthDay test = new MonthDay((DateTimeZone) null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43242);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43243);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43244);assertEquals(30, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tixd9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tixd9() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43245);
        __CLR4_4_1x96x96lgchos5i.R.inc(43246);MonthDay test = new MonthDay(GREGORIAN_PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43247);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43248);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43249);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1x96x96lgchos5i.R.inc(43250);assertEquals(test, MonthDay.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6rxdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6rxdf() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43251);
        __CLR4_4_1x96x96lgchos5i.R.inc(43252);MonthDay test = new MonthDay((Chronology) null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43253);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43254);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43255);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13crxdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13crxdk() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43256);
        __CLR4_4_1x96x96lgchos5i.R.inc(43257);MonthDay test = new MonthDay(TEST_TIME1);
        __CLR4_4_1x96x96lgchos5i.R.inc(43258);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43259);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43260);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kaxdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kaxdp() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43261);
        __CLR4_4_1x96x96lgchos5i.R.inc(43262);MonthDay test = new MonthDay(TEST_TIME2);
        __CLR4_4_1x96x96lgchos5i.R.inc(43263);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43264);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43265);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5sxdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5sxdu() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43266);
        __CLR4_4_1x96x96lgchos5i.R.inc(43267);MonthDay test = new MonthDay(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43268);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43269);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43270);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhxdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhxdz() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43271);
        __CLR4_4_1x96x96lgchos5i.R.inc(43272);MonthDay test = new MonthDay(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43273);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43274);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43275);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuxe4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuxe4() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43276);
        __CLR4_4_1x96x96lgchos5i.R.inc(43277);MonthDay test = new MonthDay(TEST_TIME1, null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43278);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43279);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43280);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eplcebxe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eplcebxe9() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43281);
        __CLR4_4_1x96x96lgchos5i.R.inc(43282);Date date = new Date(TEST_TIME1);
        __CLR4_4_1x96x96lgchos5i.R.inc(43283);MonthDay test = new MonthDay(date);
        __CLR4_4_1x96x96lgchos5i.R.inc(43284);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43285);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43286);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59ukxef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59ukxef() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43287);
        __CLR4_4_1x96x96lgchos5i.R.inc(43288);MonthDay test = new MonthDay((Object) null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43289);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43290);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43291);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5dxek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5dxek() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43292);
        __CLR4_4_1x96x96lgchos5i.R.inc(43293);MonthDay test = new MonthDay("1972-12");
        __CLR4_4_1x96x96lgchos5i.R.inc(43294);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43295);assertEquals(12, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43296);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b9xep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b9xep() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43297);
        __CLR4_4_1x96x96lgchos5i.R.inc(43298);MonthDay test = new MonthDay("10");
        __CLR4_4_1x96x96lgchos5i.R.inc(43299);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43300);assertEquals(1, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43301);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daulexeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daulexeu() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43302);
        __CLR4_4_1x96x96lgchos5i.R.inc(43303);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43304);new MonthDay("T10:20:30.040");
            __CLR4_4_1x96x96lgchos5i.R.inc(43305);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473xey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473xey() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43306);
        __CLR4_4_1x96x96lgchos5i.R.inc(43307);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43308);new MonthDay("T10:20:30.040+14:00");
            __CLR4_4_1x96x96lgchos5i.R.inc(43309);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkxf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkxf2() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43310);
        __CLR4_4_1x96x96lgchos5i.R.inc(43311);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43312);new MonthDay("10:20:30.040");
            __CLR4_4_1x96x96lgchos5i.R.inc(43313);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1xf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1xf6() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43314);
        __CLR4_4_1x96x96lgchos5i.R.inc(43315);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43316);new MonthDay("10:20:30.040+14:00");
            __CLR4_4_1x96x96lgchos5i.R.inc(43317);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4xfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4xfa() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43318);
        __CLR4_4_1x96x96lgchos5i.R.inc(43319);Date date = new Date(TEST_TIME1);
        __CLR4_4_1x96x96lgchos5i.R.inc(43320);MonthDay test = new MonthDay(date, GREGORIAN_PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43321);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43322);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43323);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynxfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynxfg() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43324);
        __CLR4_4_1x96x96lgchos5i.R.inc(43325);MonthDay test = new MonthDay((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43326);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43327);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43328);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzxfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzxfl() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43329);
        __CLR4_4_1x96x96lgchos5i.R.inc(43330);Date date = new Date(TEST_TIME1);
        __CLR4_4_1x96x96lgchos5i.R.inc(43331);MonthDay test = new MonthDay(date, null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43332);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43333);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43334);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0xfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0xfr() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43335);
        __CLR4_4_1x96x96lgchos5i.R.inc(43336);MonthDay test = new MonthDay((Object) null, null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43337);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43338);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43339);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int)
     */
    @Test
    public void testConstructor_int_int() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxbxfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxbxfw() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43340);
        __CLR4_4_1x96x96lgchos5i.R.inc(43341);MonthDay test = new MonthDay(6, 30);
        __CLR4_4_1x96x96lgchos5i.R.inc(43342);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43343);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43344);assertEquals(30, test.getDayOfMonth());
        __CLR4_4_1x96x96lgchos5i.R.inc(43345);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43346);new MonthDay(Integer.MIN_VALUE, 6);
            __CLR4_4_1x96x96lgchos5i.R.inc(43347);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1x96x96lgchos5i.R.inc(43348);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43349);new MonthDay(Integer.MAX_VALUE, 6);
            __CLR4_4_1x96x96lgchos5i.R.inc(43350);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1x96x96lgchos5i.R.inc(43351);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43352);new MonthDay(1970, 0);
            __CLR4_4_1x96x96lgchos5i.R.inc(43353);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1x96x96lgchos5i.R.inc(43354);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43355);new MonthDay(1970, 13);
            __CLR4_4_1x96x96lgchos5i.R.inc(43356);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_Chronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8f3exgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8f3exgd() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43357);
        __CLR4_4_1x96x96lgchos5i.R.inc(43358);MonthDay test = new MonthDay(6, 30, GREGORIAN_PARIS);
        __CLR4_4_1x96x96lgchos5i.R.inc(43359);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43360);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43361);assertEquals(30, test.getDayOfMonth());
        __CLR4_4_1x96x96lgchos5i.R.inc(43362);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43363);new MonthDay(Integer.MIN_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_1x96x96lgchos5i.R.inc(43364);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1x96x96lgchos5i.R.inc(43365);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43366);new MonthDay(Integer.MAX_VALUE, 6, GREGORIAN_PARIS);
            __CLR4_4_1x96x96lgchos5i.R.inc(43367);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1x96x96lgchos5i.R.inc(43368);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43369);new MonthDay(1970, 0, GREGORIAN_PARIS);
            __CLR4_4_1x96x96lgchos5i.R.inc(43370);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1x96x96lgchos5i.R.inc(43371);try {
            __CLR4_4_1x96x96lgchos5i.R.inc(43372);new MonthDay(1970, 13, GREGORIAN_PARIS);
            __CLR4_4_1x96x96lgchos5i.R.inc(43373);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

    /**
     * Test constructor (int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_nullChronology() throws Throwable {__CLR4_4_1x96x96lgchos5i.R.globalSliceStart(getClass().getName(),43374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b34hdvxgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1x96x96lgchos5i.R.rethrow($CLV_t2$);}finally{__CLR4_4_1x96x96lgchos5i.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMonthDay_Constructors.testConstructor_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),43374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b34hdvxgu() throws Throwable{try{__CLR4_4_1x96x96lgchos5i.R.inc(43374);
        __CLR4_4_1x96x96lgchos5i.R.inc(43375);MonthDay test = new MonthDay(6, 30, null);
        __CLR4_4_1x96x96lgchos5i.R.inc(43376);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1x96x96lgchos5i.R.inc(43377);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1x96x96lgchos5i.R.inc(43378);assertEquals(30, test.getDayOfMonth());
    }finally{__CLR4_4_1x96x96lgchos5i.R.flushNeeded();}}

}
