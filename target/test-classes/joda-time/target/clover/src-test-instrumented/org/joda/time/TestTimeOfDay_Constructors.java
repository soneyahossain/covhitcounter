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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Constructors {static class __CLR4_4_1177l177llgchoshl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,56581,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final int OFFSET = 1;

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;

    private long TEST_TIME1 =
            1L * DateTimeConstants.MILLIS_PER_HOUR
                    + 2L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 3L * DateTimeConstants.MILLIS_PER_SECOND
                    + 4L;

    private long TEST_TIME2 =
            1L * DateTimeConstants.MILLIS_PER_DAY
                    + 5L * DateTimeConstants.MILLIS_PER_HOUR
                    + 6L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 7L * DateTimeConstants.MILLIS_PER_SECOND
                    + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1177l177llgchoshl.R.inc(56001);
        __CLR4_4_1177l177llgchoshl.R.inc(56002);TestTimeOfDay_Constructors TB = new TestTimeOfDay_Constructors();
        __CLR4_4_1177l177llgchoshl.R.inc(56003);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56004);TB.testConstantMidnight();
        __CLR4_4_1177l177llgchoshl.R.inc(56005);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56006);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56007);TB.testFactory_FromCalendarFields();
        __CLR4_4_1177l177llgchoshl.R.inc(56008);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56009);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56010);TB.testFactory_FromDateFields_after1970();
        __CLR4_4_1177l177llgchoshl.R.inc(56011);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56012);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56013);TB.testFactory_FromDateFields_before1970();
        __CLR4_4_1177l177llgchoshl.R.inc(56014);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56015);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56016);TB.testFactory_FromDateFields_null();
        __CLR4_4_1177l177llgchoshl.R.inc(56017);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56018);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56019);TB.testFactoryMillisOfDay_long1();
        __CLR4_4_1177l177llgchoshl.R.inc(56020);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56021);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56022);TB.testFactoryMillisOfDay_long1_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56023);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56024);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56025);TB.testFactoryMillisOfDay_long_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56026);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56027);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56028);TB.testConstructor();
        __CLR4_4_1177l177llgchoshl.R.inc(56029);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56030);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56031);TB.testConstructor_DateTimeZone();
        __CLR4_4_1177l177llgchoshl.R.inc(56032);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56033);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56034);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1177l177llgchoshl.R.inc(56035);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56036);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56037);TB.testConstructor_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56038);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56039);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56040);TB.testConstructor_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56041);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56042);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56043);TB.testConstructor_long1();
        __CLR4_4_1177l177llgchoshl.R.inc(56044);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56045);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56046);TB.testConstructor_long2();
        __CLR4_4_1177l177llgchoshl.R.inc(56047);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56048);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56049);TB.testConstructor_long1_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56050);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56051);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56052);TB.testConstructor_long2_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56053);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56054);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56055);TB.testConstructor_long_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56056);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56057);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56058);TB.testConstructor_Object1();
        __CLR4_4_1177l177llgchoshl.R.inc(56059);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56060);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56061);TB.testConstructor_Object2();
        __CLR4_4_1177l177llgchoshl.R.inc(56062);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56063);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56064);TB.testConstructor_nullObject();
        __CLR4_4_1177l177llgchoshl.R.inc(56065);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56066);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56067);TB.testConstructor_todObject();
        __CLR4_4_1177l177llgchoshl.R.inc(56068);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56069);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56070);TB.testConstructor_ObjectString1();
        __CLR4_4_1177l177llgchoshl.R.inc(56071);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56072);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56073);TB.testConstructor_ObjectString2();
        __CLR4_4_1177l177llgchoshl.R.inc(56074);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56075);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56076);TB.testConstructor_ObjectString3();
        __CLR4_4_1177l177llgchoshl.R.inc(56077);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56078);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56079);TB.testConstructor_ObjectString4();
        __CLR4_4_1177l177llgchoshl.R.inc(56080);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56081);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56082);TB.testConstructor_ObjectString5();
        __CLR4_4_1177l177llgchoshl.R.inc(56083);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56084);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56085);TB.testConstructor_ObjectString6();
        __CLR4_4_1177l177llgchoshl.R.inc(56086);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56087);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56088);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_1177l177llgchoshl.R.inc(56089);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56090);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56091);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_1177l177llgchoshl.R.inc(56092);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56093);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56094);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_1177l177llgchoshl.R.inc(56095);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56096);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56097);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_1177l177llgchoshl.R.inc(56098);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56099);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56100);TB.testConstructor_Object_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56101);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56102);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56103);TB.testConstructor2_Object_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56104);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56105);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56106);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56107);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56108);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56109);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56110);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56111);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56112);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56113);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56114);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56115);TB.testConstructor_int_int();
        __CLR4_4_1177l177llgchoshl.R.inc(56116);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56117);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56118);TB.testConstructor_int_int_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56119);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56120);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56121);TB.testConstructor_int_int_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56122);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56123);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56124);TB.testConstructor_int_int_int();
        __CLR4_4_1177l177llgchoshl.R.inc(56125);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56126);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56127);TB.testConstructor_int_int_int_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56128);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56129);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56130);TB.testConstructor_int_int_int_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56131);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56132);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56133);TB.testConstructor_int_int_int_int();
        __CLR4_4_1177l177llgchoshl.R.inc(56134);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56135);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56136);TB.testConstructor_int_int_int_int_Chronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56137);TB.tearDown();
        __CLR4_4_1177l177llgchoshl.R.inc(56138);TB.setUp();
        __CLR4_4_1177l177llgchoshl.R.inc(56139);TB.testConstructor_int_int_int_int_nullChronology();
        __CLR4_4_1177l177llgchoshl.R.inc(56140);TB.tearDown();

    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Constructors.class);
    }

    public TestTimeOfDay_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1177l177llgchoshl.R.inc(56141);
        __CLR4_4_1177l177llgchoshl.R.inc(56142);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1177l177llgchoshl.R.inc(56143);zone = DateTimeZone.getDefault();
        __CLR4_4_1177l177llgchoshl.R.inc(56144);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1177l177llgchoshl.R.inc(56145);java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1177l177llgchoshl.R.inc(56146);
        __CLR4_4_1177l177llgchoshl.R.inc(56147);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1177l177llgchoshl.R.inc(56148);DateTimeZone.setDefault(zone);
        __CLR4_4_1177l177llgchoshl.R.inc(56149);java.util.TimeZone.setDefault(zone.toTimeZone());
        __CLR4_4_1177l177llgchoshl.R.inc(56150);zone = null;
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstantMidnight() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ix4j17br();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstantMidnight",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ix4j17br() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56151);
        __CLR4_4_1177l177llgchoshl.R.inc(56152);TimeOfDay test = TimeOfDay.MIDNIGHT;
        __CLR4_4_1177l177llgchoshl.R.inc(56153);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56154);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56155);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56156);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56157);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromCalendarFields() throws Exception {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxckb317by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxckb317by() throws Exception{try{__CLR4_4_1177l177llgchoshl.R.inc(56158);
        __CLR4_4_1177l177llgchoshl.R.inc(56159);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1177l177llgchoshl.R.inc(56160);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1177l177llgchoshl.R.inc(56161);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
        __CLR4_4_1177l177llgchoshl.R.inc(56162);assertEquals(expected, TimeOfDay.fromCalendarFields(cal));
        __CLR4_4_1177l177llgchoshl.R.inc(56163);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56164);TimeOfDay.fromCalendarFields(null);
            __CLR4_4_1177l177llgchoshl.R.inc(56165);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_FromDateFields_after1970() throws Exception {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9oalf17c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9oalf17c6() throws Exception{try{__CLR4_4_1177l177llgchoshl.R.inc(56166);
        __CLR4_4_1177l177llgchoshl.R.inc(56167);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1177l177llgchoshl.R.inc(56168);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1177l177llgchoshl.R.inc(56169);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
        __CLR4_4_1177l177llgchoshl.R.inc(56170);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testFactory_FromDateFields_before1970() throws Exception {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn26q617cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn26q617cb() throws Exception{try{__CLR4_4_1177l177llgchoshl.R.inc(56171);
        __CLR4_4_1177l177llgchoshl.R.inc(56172);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1177l177llgchoshl.R.inc(56173);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1177l177llgchoshl.R.inc(56174);TimeOfDay expected = new TimeOfDay(4, 5, 6, 7);
        __CLR4_4_1177l177llgchoshl.R.inc(56175);assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testFactory_FromDateFields_null() throws Exception {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y25f1x17cg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactory_FromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y25f1x17cg() throws Exception{try{__CLR4_4_1177l177llgchoshl.R.inc(56176);
        __CLR4_4_1177l177llgchoshl.R.inc(56177);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56178);TimeOfDay.fromDateFields(null);
            __CLR4_4_1177l177llgchoshl.R.inc(56179);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test factory (long)
     */
    @Test
    public void testFactoryMillisOfDay_long1() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddptks17ck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddptks17ck() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56180);
        __CLR4_4_1177l177llgchoshl.R.inc(56181);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1);
        __CLR4_4_1177l177llgchoshl.R.inc(56182);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56183);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56184);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56185);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56186);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test factory (long, Chronology)
     */
    @Test
    public void testFactoryMillisOfDay_long1_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh1w6917cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh1w6917cr() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56187);
        __CLR4_4_1177l177llgchoshl.R.inc(56188);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56189);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56190);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56191);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56192);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56193);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test factory (long, Chronology=null)
     */
    @Test
    public void testFactoryMillisOfDay_long_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nd19g117cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testFactoryMillisOfDay_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nd19g117cy() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56194);
        __CLR4_4_1177l177llgchoshl.R.inc(56195);TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56196);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56197);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56198);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56199);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56200);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h17d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h17d5() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56201);
        __CLR4_4_1177l177llgchoshl.R.inc(56202);TimeOfDay test = new TimeOfDay();
        __CLR4_4_1177l177llgchoshl.R.inc(56203);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56204);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56205);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56206);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56207);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone)
     */
    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k517dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k517dc() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56208);
        __CLR4_4_1177l177llgchoshl.R.inc(56209);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_1177l177llgchoshl.R.inc(56210);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1177l177llgchoshl.R.inc(56211);TimeOfDay test = new TimeOfDay(LONDON);
        __CLR4_4_1177l177llgchoshl.R.inc(56212);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56213);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56214);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56215);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56216);assertEquals(40, test.getMillisOfSecond());

        __CLR4_4_1177l177llgchoshl.R.inc(56217);test = new TimeOfDay(PARIS);
        __CLR4_4_1177l177llgchoshl.R.inc(56218);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56219);assertEquals(0, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56220);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56221);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56222);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (DateTimeZone=null)
     */
    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1ro17dr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1ro17dr() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56223);
        __CLR4_4_1177l177llgchoshl.R.inc(56224);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON);
        __CLR4_4_1177l177llgchoshl.R.inc(56225);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1177l177llgchoshl.R.inc(56226);TimeOfDay test = new TimeOfDay((DateTimeZone) null);
        __CLR4_4_1177l177llgchoshl.R.inc(56227);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56228);assertEquals(23, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56229);assertEquals(59, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56230);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56231);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Chronology)
     */
    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931ti17e0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931ti17e0() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56232);
        __CLR4_4_1177l177llgchoshl.R.inc(56233);TimeOfDay test = new TimeOfDay(JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56234);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56235);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56236);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56237);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56238);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Chronology=null)
     */
    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6r17e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6r17e7() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56239);
        __CLR4_4_1177l177llgchoshl.R.inc(56240);TimeOfDay test = new TimeOfDay((Chronology) null);
        __CLR4_4_1177l177llgchoshl.R.inc(56241);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56242);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56243);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56244);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56245);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cr17ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cr17ee() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56246);
        __CLR4_4_1177l177llgchoshl.R.inc(56247);TimeOfDay test = new TimeOfDay(TEST_TIME1);
        __CLR4_4_1177l177llgchoshl.R.inc(56248);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56249);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56250);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56251);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56252);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914ka17el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914ka17el() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56253);
        __CLR4_4_1177l177llgchoshl.R.inc(56254);TimeOfDay test = new TimeOfDay(TEST_TIME2);
        __CLR4_4_1177l177llgchoshl.R.inc(56255);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56256);assertEquals(5 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56257);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56258);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56259);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5s17es();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5s17es() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56260);
        __CLR4_4_1177l177llgchoshl.R.inc(56261);TimeOfDay test = new TimeOfDay(TEST_TIME1, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56262);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56263);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56264);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56265);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56266);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology)
     */
    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkh17ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkh17ez() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56267);
        __CLR4_4_1177l177llgchoshl.R.inc(56268);TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56269);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56270);assertEquals(5 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56271);assertEquals(6, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56272);assertEquals(7, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56273);assertEquals(8, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (long, Chronology=null)
     */
    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhcku17f6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhcku17f6() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56274);
        __CLR4_4_1177l177llgchoshl.R.inc(56275);TimeOfDay test = new TimeOfDay(TEST_TIME1, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56276);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56277);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56278);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56279);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56280);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcy17fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcy17fd() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56281);
        __CLR4_4_1177l177llgchoshl.R.inc(56282);Date date = new Date(TEST_TIME1);
        __CLR4_4_1177l177llgchoshl.R.inc(56283);TimeOfDay test = new TimeOfDay(date);
        __CLR4_4_1177l177llgchoshl.R.inc(56284);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56285);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56286);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56287);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56288);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5f17fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5f17fl() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56289);
        __CLR4_4_1177l177llgchoshl.R.inc(56290);Calendar cal = new GregorianCalendar();
        __CLR4_4_1177l177llgchoshl.R.inc(56291);cal.setTime(new Date(TEST_TIME1));
        __CLR4_4_1177l177llgchoshl.R.inc(56292);TimeOfDay test = new TimeOfDay(cal);
        __CLR4_4_1177l177llgchoshl.R.inc(56293);assertEquals(GJChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56294);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56295);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56296);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56297);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uk17fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uk17fu() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56298);
        __CLR4_4_1177l177llgchoshl.R.inc(56299);TimeOfDay test = new TimeOfDay((Object) null);
        __CLR4_4_1177l177llgchoshl.R.inc(56300);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56301);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56302);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56303);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56304);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_todObject() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vel417g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_todObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vel417g1() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56305);
        __CLR4_4_1177l177llgchoshl.R.inc(56306);TimeOfDay base = new TimeOfDay(10, 20, 30, 40, CopticChronology.getInstance(PARIS));
        __CLR4_4_1177l177llgchoshl.R.inc(56307);TimeOfDay test = new TimeOfDay(base);
        __CLR4_4_1177l177llgchoshl.R.inc(56308);assertEquals(CopticChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56309);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56310);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56311);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56312);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5d17g9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5d17g9() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56313);
        __CLR4_4_1177l177llgchoshl.R.inc(56314);TimeOfDay test = new TimeOfDay("10:20:30.040");
        __CLR4_4_1177l177llgchoshl.R.inc(56315);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56316);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56317);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56318);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56319);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xu17gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xu17gg() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56320);
        __CLR4_4_1177l177llgchoshl.R.inc(56321);TimeOfDay test = new TimeOfDay("10:20:30.040+04:00");
        __CLR4_4_1177l177llgchoshl.R.inc(56322);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56323);assertEquals(10 + OFFSET - 4, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56324);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56325);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56326);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qb17gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qb17gn() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56327);
        __CLR4_4_1177l177llgchoshl.R.inc(56328);TimeOfDay test = new TimeOfDay("T10:20:30.040");
        __CLR4_4_1177l177llgchoshl.R.inc(56329);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56330);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56331);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56332);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56333);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString4() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b327is17gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b327is17gu() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56334);
        __CLR4_4_1177l177llgchoshl.R.inc(56335);TimeOfDay test = new TimeOfDay("T10:20:30.040+04:00");
        __CLR4_4_1177l177llgchoshl.R.inc(56336);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56337);assertEquals(10 + OFFSET - 4, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56338);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56339);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56340);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString5() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ec26b917h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ec26b917h1() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56341);
        __CLR4_4_1177l177llgchoshl.R.inc(56342);TimeOfDay test = new TimeOfDay("10:20");
        __CLR4_4_1177l177llgchoshl.R.inc(56343);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56344);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56345);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56346);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56347);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString6() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl253q17h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectString6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl253q17h8() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56348);
        __CLR4_4_1177l177llgchoshl.R.inc(56349);TimeOfDay test = new TimeOfDay("10");
        __CLR4_4_1177l177llgchoshl.R.inc(56350);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56351);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56352);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56353);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56354);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11daule17hf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11daule17hf() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56355);
        __CLR4_4_1177l177llgchoshl.R.inc(56356);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56357);new TimeOfDay("1970-04-06");
            __CLR4_4_1177l177llgchoshl.R.inc(56358);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp47317hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp47317hj() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56359);
        __CLR4_4_1177l177llgchoshl.R.inc(56360);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56361);new TimeOfDay("1970-04-06T+14:00");
            __CLR4_4_1177l177llgchoshl.R.inc(56362);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zk17hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zk17hn() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56363);
        __CLR4_4_1177l177llgchoshl.R.inc(56364);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56365);new TimeOfDay("1970-04-06T10:20:30.040");
            __CLR4_4_1177l177llgchoshl.R.inc(56366);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s117hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s117hr() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56367);
        __CLR4_4_1177l177llgchoshl.R.inc(56368);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56369);new TimeOfDay("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1177l177llgchoshl.R.inc(56370);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd417hv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd417hv() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56371);
        __CLR4_4_1177l177llgchoshl.R.inc(56372);Date date = new Date(TEST_TIME1);
        __CLR4_4_1177l177llgchoshl.R.inc(56373);TimeOfDay test = new TimeOfDay(date, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56374);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56375);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56376);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56377);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56378);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology)
     */
    @Test
    public void testConstructor2_Object_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uyju217i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor2_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uyju217i3() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56379);
        __CLR4_4_1177l177llgchoshl.R.inc(56380);TimeOfDay test = new TimeOfDay("T10:20");
        __CLR4_4_1177l177llgchoshl.R.inc(56381);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56382);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56383);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56384);assertEquals(0, test.getMillisOfSecond());

        __CLR4_4_1177l177llgchoshl.R.inc(56385);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56386);new TimeOfDay("T1020");
            __CLR4_4_1177l177llgchoshl.R.inc(56387);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology)
     */
    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uyn17ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uyn17ic() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56388);
        __CLR4_4_1177l177llgchoshl.R.inc(56389);TimeOfDay test = new TimeOfDay((Object) null, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56390);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56391);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56392);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56393);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56394);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object, Chronology=null)
     */
    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijz17ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijz17ij() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56395);
        __CLR4_4_1177l177llgchoshl.R.inc(56396);Date date = new Date(TEST_TIME1);
        __CLR4_4_1177l177llgchoshl.R.inc(56397);TimeOfDay test = new TimeOfDay(date, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56398);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56399);assertEquals(1 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56400);assertEquals(2, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56401);assertEquals(3, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56402);assertEquals(4, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve017ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve017ir() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56403);
        __CLR4_4_1177l177llgchoshl.R.inc(56404);TimeOfDay test = new TimeOfDay((Object) null, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56405);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56406);assertEquals(10 + OFFSET, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56407);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56408);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56409);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor (int, int)
     */
    @Test
    public void testConstructor_int_int() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ioxb17iy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ioxb17iy() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56410);
        __CLR4_4_1177l177llgchoshl.R.inc(56411);TimeOfDay test = new TimeOfDay(10, 20);
        __CLR4_4_1177l177llgchoshl.R.inc(56412);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56413);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56414);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56415);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56416);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1177l177llgchoshl.R.inc(56417);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56418);new TimeOfDay(-1, 20);
            __CLR4_4_1177l177llgchoshl.R.inc(56419);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56420);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56421);new TimeOfDay(24, 20);
            __CLR4_4_1177l177llgchoshl.R.inc(56422);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56423);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56424);new TimeOfDay(10, -1);
            __CLR4_4_1177l177llgchoshl.R.inc(56425);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56426);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56427);new TimeOfDay(10, 60);
            __CLR4_4_1177l177llgchoshl.R.inc(56428);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bb8f3e17jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bb8f3e17jh() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56429);
        __CLR4_4_1177l177llgchoshl.R.inc(56430);TimeOfDay test = new TimeOfDay(10, 20, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56431);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56432);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56433);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56434);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56435);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1177l177llgchoshl.R.inc(56436);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56437);new TimeOfDay(-1, 20, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56438);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56439);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56440);new TimeOfDay(24, 20, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56441);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56442);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56443);new TimeOfDay(10, -1, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56444);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56445);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56446);new TimeOfDay(10, 60, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56447);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b34hdv17k0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b34hdv17k0() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56448);
        __CLR4_4_1177l177llgchoshl.R.inc(56449);TimeOfDay test = new TimeOfDay(10, 20, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56450);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56451);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56452);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56453);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56454);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int)
     */
    @Test
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqn17k7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqn17k7() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56455);
        __CLR4_4_1177l177llgchoshl.R.inc(56456);TimeOfDay test = new TimeOfDay(10, 20, 30);
        __CLR4_4_1177l177llgchoshl.R.inc(56457);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56458);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56459);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56460);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56461);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1177l177llgchoshl.R.inc(56462);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56463);new TimeOfDay(-1, 20, 30);
            __CLR4_4_1177l177llgchoshl.R.inc(56464);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56465);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56466);new TimeOfDay(24, 20, 30);
            __CLR4_4_1177l177llgchoshl.R.inc(56467);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56468);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56469);new TimeOfDay(10, -1, 30);
            __CLR4_4_1177l177llgchoshl.R.inc(56470);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56471);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56472);new TimeOfDay(10, 60, 30);
            __CLR4_4_1177l177llgchoshl.R.inc(56473);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56474);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56475);new TimeOfDay(10, 20, -1);
            __CLR4_4_1177l177llgchoshl.R.inc(56476);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56477);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56478);new TimeOfDay(10, 20, 60);
            __CLR4_4_1177l177llgchoshl.R.inc(56479);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzq17kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzq17kw() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56480);
        __CLR4_4_1177l177llgchoshl.R.inc(56481);TimeOfDay test = new TimeOfDay(10, 20, 30, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56482);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56483);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56484);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56485);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56486);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1177l177llgchoshl.R.inc(56487);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56488);new TimeOfDay(-1, 20, 30, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56489);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56490);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56491);new TimeOfDay(24, 20, 30, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56492);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56493);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56494);new TimeOfDay(10, -1, 30, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56495);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56496);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56497);new TimeOfDay(10, 60, 30, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56498);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56499);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56500);new TimeOfDay(10, 20, -1, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56501);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56502);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56503);new TimeOfDay(10, 20, 60, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56504);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gt17ll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gt17ll() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56505);
        __CLR4_4_1177l177llgchoshl.R.inc(56506);TimeOfDay test = new TimeOfDay(10, 20, 30, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56507);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56508);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56509);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56510);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56511);assertEquals(0, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int)
     */
    @Test
    public void testConstructor_int_int_int_int() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjvai917ls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjvai917ls() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56512);
        __CLR4_4_1177l177llgchoshl.R.inc(56513);TimeOfDay test = new TimeOfDay(10, 20, 30, 40);
        __CLR4_4_1177l177llgchoshl.R.inc(56514);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56515);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56516);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56517);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56518);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1177l177llgchoshl.R.inc(56519);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56520);new TimeOfDay(-1, 20, 30, 40);
            __CLR4_4_1177l177llgchoshl.R.inc(56521);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56522);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56523);new TimeOfDay(24, 20, 30, 40);
            __CLR4_4_1177l177llgchoshl.R.inc(56524);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56525);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56526);new TimeOfDay(10, -1, 30, 40);
            __CLR4_4_1177l177llgchoshl.R.inc(56527);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56528);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56529);new TimeOfDay(10, 60, 30, 40);
            __CLR4_4_1177l177llgchoshl.R.inc(56530);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56531);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56532);new TimeOfDay(10, 20, -1, 40);
            __CLR4_4_1177l177llgchoshl.R.inc(56533);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56534);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56535);new TimeOfDay(10, 20, 60, 40);
            __CLR4_4_1177l177llgchoshl.R.inc(56536);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56537);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56538);new TimeOfDay(10, 20, 30, -1);
            __CLR4_4_1177l177llgchoshl.R.inc(56539);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56540);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56541);new TimeOfDay(10, 20, 30, 1000);
            __CLR4_4_1177l177llgchoshl.R.inc(56542);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, Chronology)
     */
    @Test
    public void testConstructor_int_int_int_int_Chronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152fm4q17mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152fm4q17mn() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56543);
        __CLR4_4_1177l177llgchoshl.R.inc(56544);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, JulianChronology.getInstance());
        __CLR4_4_1177l177llgchoshl.R.inc(56545);assertEquals(JulianChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56546);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56547);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56548);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56549);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1177l177llgchoshl.R.inc(56550);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56551);new TimeOfDay(-1, 20, 30, 40, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56552);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56553);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56554);new TimeOfDay(24, 20, 30, 40, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56555);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56556);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56557);new TimeOfDay(10, -1, 30, 40, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56558);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56559);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56560);new TimeOfDay(10, 60, 30, 40, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56561);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56562);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56563);new TimeOfDay(10, 20, -1, 40, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56564);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56565);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56566);new TimeOfDay(10, 20, 60, 40, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56567);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56568);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56569);new TimeOfDay(10, 20, 30, -1, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56570);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1177l177llgchoshl.R.inc(56571);try {
            __CLR4_4_1177l177llgchoshl.R.inc(56572);new TimeOfDay(10, 20, 30, 1000, JulianChronology.getInstance());
            __CLR4_4_1177l177llgchoshl.R.inc(56573);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

    /**
     * Test constructor (int, int, int, int, Chronology=null)
     */
    @Test
    public void testConstructor_int_int_int_int_nullChronology() throws Throwable {__CLR4_4_1177l177llgchoshl.R.globalSliceStart(getClass().getName(),56574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ah63rx17ni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1177l177llgchoshl.R.rethrow($CLV_t2$);}finally{__CLR4_4_1177l177llgchoshl.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestTimeOfDay_Constructors.testConstructor_int_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ah63rx17ni() throws Throwable{try{__CLR4_4_1177l177llgchoshl.R.inc(56574);
        __CLR4_4_1177l177llgchoshl.R.inc(56575);TimeOfDay test = new TimeOfDay(10, 20, 30, 40, null);
        __CLR4_4_1177l177llgchoshl.R.inc(56576);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1177l177llgchoshl.R.inc(56577);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1177l177llgchoshl.R.inc(56578);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1177l177llgchoshl.R.inc(56579);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1177l177llgchoshl.R.inc(56580);assertEquals(40, test.getMillisOfSecond());
    }finally{__CLR4_4_1177l177llgchoshl.R.flushNeeded();}}

}
