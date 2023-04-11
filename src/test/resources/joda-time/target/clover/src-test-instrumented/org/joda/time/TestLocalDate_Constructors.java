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

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors {static class __CLR4_4_1u06u06lgchos1k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,39434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1u06u06lgchos1k.R.inc(38886);
        __CLR4_4_1u06u06lgchos1k.R.inc(38887);TestLocalDate_Constructors TB = new TestLocalDate_Constructors();
        __CLR4_4_1u06u06lgchos1k.R.inc(38888);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38889);TB.testParse_noFormatter();
        __CLR4_4_1u06u06lgchos1k.R.inc(38890);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38891);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38892);TB.testParse_formatter();
        __CLR4_4_1u06u06lgchos1k.R.inc(38893);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38894);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38895);TB.testFactory_fromCalendarFields();
        __CLR4_4_1u06u06lgchos1k.R.inc(38896);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38897);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38898);TB.testFactory_fromCalendarFields_beforeYearZero1();
        __CLR4_4_1u06u06lgchos1k.R.inc(38899);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38900);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38901);TB.testFactory_fromCalendarFields_beforeYearZero3();
        __CLR4_4_1u06u06lgchos1k.R.inc(38902);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38903);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38904);TB.testFactory_fromCalendarFields_null();
        __CLR4_4_1u06u06lgchos1k.R.inc(38905);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38906);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38907);TB.testFactory_fromDateFields_after1970();
        __CLR4_4_1u06u06lgchos1k.R.inc(38908);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38909);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38910);TB.testFactory_fromDateFields_before1970();
        __CLR4_4_1u06u06lgchos1k.R.inc(38911);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38912);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38913);TB.testFactory_fromDateFields_beforeYearZero1();
        __CLR4_4_1u06u06lgchos1k.R.inc(38914);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38915);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38916);TB.testFactory_fromDateFields_beforeYearZero3();
        __CLR4_4_1u06u06lgchos1k.R.inc(38917);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38918);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38919);TB.testFactory_fromDateFields_null();
        __CLR4_4_1u06u06lgchos1k.R.inc(38920);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38921);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38922);TB.testConstructor();
        __CLR4_4_1u06u06lgchos1k.R.inc(38923);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38924);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38925);TB.testConstructor_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38926);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38927);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38928);TB.testConstructor_nullDateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38929);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38930);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38931);TB.testConstructor_Chronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(38932);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38933);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38934);TB.testConstructor_nullChronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(38935);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38936);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38937);TB.testConstructor_long1();
        __CLR4_4_1u06u06lgchos1k.R.inc(38938);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38939);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38940);TB.testConstructor_long2();
        __CLR4_4_1u06u06lgchos1k.R.inc(38941);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38942);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38943);TB.testConstructor_long1_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38944);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38945);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38946);TB.testConstructor_long2_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38947);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38948);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38949);TB.testConstructor_long3_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38950);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38951);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38952);TB.testConstructor_long4_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38953);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38954);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38955);TB.testConstructor_long_nullDateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(38956);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38957);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38958);TB.testConstructor_long1_Chronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(38959);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38960);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38961);TB.testConstructor_long2_Chronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(38962);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38963);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38964);TB.testConstructor_long_nullChronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(38965);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38966);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38967);TB.testConstructor_Object1();
        __CLR4_4_1u06u06lgchos1k.R.inc(38968);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38969);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38970);TB.testConstructor_nullObject();
        __CLR4_4_1u06u06lgchos1k.R.inc(38971);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38972);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38973);TB.testConstructor_ObjectString1();
        __CLR4_4_1u06u06lgchos1k.R.inc(38974);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38975);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38976);TB.testConstructor_ObjectString2();
        __CLR4_4_1u06u06lgchos1k.R.inc(38977);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38978);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38979);TB.testConstructor_ObjectString3();
        __CLR4_4_1u06u06lgchos1k.R.inc(38980);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38981);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38982);TB.testConstructor_ObjectStringEx1();
        __CLR4_4_1u06u06lgchos1k.R.inc(38983);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38984);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38985);TB.testConstructor_ObjectStringEx2();
        __CLR4_4_1u06u06lgchos1k.R.inc(38986);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38987);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38988);TB.testConstructor_ObjectStringEx3();
        __CLR4_4_1u06u06lgchos1k.R.inc(38989);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38990);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38991);TB.testConstructor_ObjectStringEx4();
        __CLR4_4_1u06u06lgchos1k.R.inc(38992);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38993);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38994);TB.testConstructor_ObjectStringEx5();
        __CLR4_4_1u06u06lgchos1k.R.inc(38995);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38996);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(38997);TB.testConstructor_ObjectStringEx6();
        __CLR4_4_1u06u06lgchos1k.R.inc(38998);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(38999);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39000);TB.testConstructor_ObjectStringEx7();
        __CLR4_4_1u06u06lgchos1k.R.inc(39001);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39002);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39003);TB.testConstructor_ObjectLocalDate();
        __CLR4_4_1u06u06lgchos1k.R.inc(39004);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39005);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39006);TB.testConstructor_ObjectLocalTime();
        __CLR4_4_1u06u06lgchos1k.R.inc(39007);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39008);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39009);TB.testConstructor_ObjectLocalDateTime();
        __CLR4_4_1u06u06lgchos1k.R.inc(39010);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39011);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39012);TB.testConstructor_ObjectYearMonthDay();
        __CLR4_4_1u06u06lgchos1k.R.inc(39013);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39014);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39015);TB.testConstructor_Object_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(39016);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39017);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39018);TB.testConstructor_nullObject_DateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(39019);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39020);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39021);TB.testConstructor_Object_nullDateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(39022);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39023);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39024);TB.testConstructor_nullObject_nullDateTimeZone();
        __CLR4_4_1u06u06lgchos1k.R.inc(39025);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39026);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39027);TB.testConstructor_Object_Chronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39028);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39029);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39030);TB.testConstructor_Object_Chronology_crossChronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39031);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39032);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39033);TB.testConstructor_nullObject_Chronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39034);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39035);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39036);TB.testConstructor_Object_nullChronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39037);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39038);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39039);TB.testConstructor_nullObject_nullChronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39040);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39041);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39042);TB.testConstructor_int_int_int();
        __CLR4_4_1u06u06lgchos1k.R.inc(39043);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39044);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39045);TB.testConstructor_int_int_int_Chronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39046);TB.tearDown();
        __CLR4_4_1u06u06lgchos1k.R.inc(39047);TB.setUp();
        __CLR4_4_1u06u06lgchos1k.R.inc(39048);TB.testConstructor_int_int_int_nullChronology();
        __CLR4_4_1u06u06lgchos1k.R.inc(39049);TB.tearDown();

    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDate_Constructors.class);
    }

    public TestLocalDate_Constructors(String name) {
        super(name);
    }
     */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_1u06u06lgchos1k.R.inc(39050);
        __CLR4_4_1u06u06lgchos1k.R.inc(39051);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1u06u06lgchos1k.R.inc(39052);zone = DateTimeZone.getDefault();
        __CLR4_4_1u06u06lgchos1k.R.inc(39053);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1u06u06lgchos1k.R.inc(39054);
        __CLR4_4_1u06u06lgchos1k.R.inc(39055);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1u06u06lgchos1k.R.inc(39056);DateTimeZone.setDefault(zone);
        __CLR4_4_1u06u06lgchos1k.R.inc(39057);zone = null;
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqviu4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqviu4y() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39058);
        __CLR4_4_1u06u06lgchos1k.R.inc(39059);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010-06-30"));
        __CLR4_4_1u06u06lgchos1k.R.inc(39060);assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002"));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testParse_formatter() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wvtnxu51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testParse_formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wvtnxu51() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39061);
        __CLR4_4_1u06u06lgchos1k.R.inc(39062);DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM").withChronology(ISOChronology.getInstance(PARIS));
        __CLR4_4_1u06u06lgchos1k.R.inc(39063);assertEquals(new LocalDate(2010, 6, 30), LocalDate.parse("2010--30 06", f));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_fromCalendarFields() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8hq5ru54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8hq5ru54() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39064);
        __CLR4_4_1u06u06lgchos1k.R.inc(39065);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39066);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39067);LocalDate expected = new LocalDate(1970, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39068);assertEquals(expected, LocalDate.fromCalendarFields(cal));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromCalendarFields_beforeYearZero1() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146vol9u59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146vol9u59() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39069);
        __CLR4_4_1u06u06lgchos1k.R.inc(39070);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39071);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39072);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39073);LocalDate expected = new LocalDate(0, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39074);assertEquals(expected, LocalDate.fromCalendarFields(cal));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromCalendarFields_beforeYearZero3() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aovm67u5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aovm67u5f() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39075);
        __CLR4_4_1u06u06lgchos1k.R.inc(39076);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39077);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39078);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39079);LocalDate expected = new LocalDate(-2, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39080);assertEquals(expected, LocalDate.fromCalendarFields(cal));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromCalendarFields_null() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcawzfu5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromCalendarFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcawzfu5l() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39081);
        __CLR4_4_1u06u06lgchos1k.R.inc(39082);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39083);LocalDate.fromCalendarFields((Calendar) null);
            __CLR4_4_1u06u06lgchos1k.R.inc(39084);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_fromDateFields_after1970() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vvmm5u5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_after1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vvmm5u5p() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39085);
        __CLR4_4_1u06u06lgchos1k.R.inc(39086);GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39087);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39088);LocalDate expected = new LocalDate(1970, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39089);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_before1970() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuspjmu5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_before1970",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuspjmu5u() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39090);
        __CLR4_4_1u06u06lgchos1k.R.inc(39091);GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39092);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39093);LocalDate expected = new LocalDate(1969, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39094);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_beforeYearZero1() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr9m3xu5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_beforeYearZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr9m3xu5z() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39095);
        __CLR4_4_1u06u06lgchos1k.R.inc(39096);GregorianCalendar cal = new GregorianCalendar(1, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39097);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39098);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39099);LocalDate expected = new LocalDate(0, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39100);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_beforeYearZero3() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yruia9u65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_beforeYearZero3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yruia9u65() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39101);
        __CLR4_4_1u06u06lgchos1k.R.inc(39102);GregorianCalendar cal = new GregorianCalendar(3, 1, 3, 4, 5, 6);
        __CLR4_4_1u06u06lgchos1k.R.inc(39103);cal.set(Calendar.ERA, GregorianCalendar.BC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39104);cal.set(Calendar.MILLISECOND, 7);
        __CLR4_4_1u06u06lgchos1k.R.inc(39105);LocalDate expected = new LocalDate(-2, 2, 3);
        __CLR4_4_1u06u06lgchos1k.R.inc(39106);assertEquals(expected, LocalDate.fromDateFields(cal.getTime()));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testFactory_fromDateFields_null() throws Exception {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qt5qc5u6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testFactory_fromDateFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qt5qc5u6b() throws Exception{try{__CLR4_4_1u06u06lgchos1k.R.inc(39107);
        __CLR4_4_1u06u06lgchos1k.R.inc(39108);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39109);LocalDate.fromDateFields((Date) null);
            __CLR4_4_1u06u06lgchos1k.R.inc(39110);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hu6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hu6f() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39111);
        __CLR4_4_1u06u06lgchos1k.R.inc(39112);LocalDate test = new LocalDate();
        __CLR4_4_1u06u06lgchos1k.R.inc(39113);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39114);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39115);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39116);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39117);assertEquals(test, LocalDate.now());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4m1k5u6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4m1k5u6m() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39118);
        __CLR4_4_1u06u06lgchos1k.R.inc(39119);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_1u06u06lgchos1k.R.inc(39120);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1u06u06lgchos1k.R.inc(39121);LocalDate test = new LocalDate(LONDON);
        __CLR4_4_1u06u06lgchos1k.R.inc(39122);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39123);assertEquals(2005, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39124);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39125);assertEquals(8, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39126);assertEquals(test, LocalDate.now(LONDON));

        __CLR4_4_1u06u06lgchos1k.R.inc(39127);test = new LocalDate(PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39128);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39129);assertEquals(2005, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39130);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39131);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39132);assertEquals(test, LocalDate.now(PARIS));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullDateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17zs1rou71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17zs1rou71() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39133);
        __CLR4_4_1u06u06lgchos1k.R.inc(39134);DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON);
        __CLR4_4_1u06u06lgchos1k.R.inc(39135);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());
        // 23:59 in London is 00:59 the following day in Paris

        __CLR4_4_1u06u06lgchos1k.R.inc(39136);LocalDate test = new LocalDate((DateTimeZone) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39137);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39138);assertEquals(2005, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39139);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39140);assertEquals(8, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_Chronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15931tiu79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15931tiu79() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39141);
        __CLR4_4_1u06u06lgchos1k.R.inc(39142);LocalDate test = new LocalDate(GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39143);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39144);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39145);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39146);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39147);assertEquals(test, LocalDate.now(GREGORIAN_PARIS));
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullChronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15qcb6ru7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15qcb6ru7g() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39148);
        __CLR4_4_1u06u06lgchos1k.R.inc(39149);LocalDate test = new LocalDate((Chronology) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39150);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39151);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39152);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39153);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long1() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wi13cru7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wi13cru7m() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39154);
        __CLR4_4_1u06u06lgchos1k.R.inc(39155);LocalDate test = new LocalDate(TEST_TIME1);
        __CLR4_4_1u06u06lgchos1k.R.inc(39156);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39157);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39158);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39159);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long2() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t914kau7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t914kau7s() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39160);
        __CLR4_4_1u06u06lgchos1k.R.inc(39161);LocalDate test = new LocalDate(TEST_TIME2);
        __CLR4_4_1u06u06lgchos1k.R.inc(39162);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39163);assertEquals(1971, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39164);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39165);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long1_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mej2a9u7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mej2a9u7y() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39166);
        __CLR4_4_1u06u06lgchos1k.R.inc(39167);LocalDate test = new LocalDate(TEST_TIME1, PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39168);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39169);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39170);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39171);assertEquals(6, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39172);assertEquals(TEST_TIME1_ROUNDED, test.getLocalMillis());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long2_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1hd9qu85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long2_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1hd9qu85() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39173);
        __CLR4_4_1u06u06lgchos1k.R.inc(39174);LocalDate test = new LocalDate(TEST_TIME2, PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39175);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39176);assertEquals(1971, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39177);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39178);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long3_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gdqulu8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long3_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gdqulu8b() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39179);
        __CLR4_4_1u06u06lgchos1k.R.inc(39180);DateTime dt = new DateTime(2006, 6, 9, 0, 0, 0, 0, PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39181);DateTime dtUTC = new DateTime(2006, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC);

        __CLR4_4_1u06u06lgchos1k.R.inc(39182);LocalDate test = new LocalDate(dt.getMillis(), PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39183);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39184);assertEquals(2006, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39185);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39186);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39187);assertEquals(dtUTC.getMillis(), test.getLocalMillis());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long4_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4pvkku8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long4_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4pvkku8k() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39188);
        __CLR4_4_1u06u06lgchos1k.R.inc(39189);DateTime dt = new DateTime(2006, 6, 9, 23, 59, 59, 999, PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39190);DateTime dtUTC = new DateTime(2006, 6, 9, 0, 0, 0, 0, DateTimeZone.UTC);

        __CLR4_4_1u06u06lgchos1k.R.inc(39191);LocalDate test = new LocalDate(dt.getMillis(), PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39192);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39193);assertEquals(2006, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39194);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39195);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39196);assertEquals(dtUTC.getMillis(), test.getLocalMillis());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long_nullDateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv35a9u8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv35a9u8t() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39197);
        __CLR4_4_1u06u06lgchos1k.R.inc(39198);LocalDate test = new LocalDate(TEST_TIME1, (DateTimeZone) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39199);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39200);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39201);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39202);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long1_Chronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115wn5su8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long1_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115wn5su8z() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39203);
        __CLR4_4_1u06u06lgchos1k.R.inc(39204);LocalDate test = new LocalDate(TEST_TIME1, GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39205);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39206);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39207);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39208);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long2_Chronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14nqmkhu95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long2_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14nqmkhu95() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39209);
        __CLR4_4_1u06u06lgchos1k.R.inc(39210);LocalDate test = new LocalDate(TEST_TIME2, GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39211);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39212);assertEquals(1971, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39213);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39214);assertEquals(7, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_long_nullChronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnhckuu9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnhckuu9b() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39215);
        __CLR4_4_1u06u06lgchos1k.R.inc(39216);LocalDate test = new LocalDate(TEST_TIME1, (Chronology) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39217);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39218);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39219);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39220);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyu9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyu9h() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39221);
        __CLR4_4_1u06u06lgchos1k.R.inc(39222);Date date = new Date(TEST_TIME1);
        __CLR4_4_1u06u06lgchos1k.R.inc(39223);LocalDate test = new LocalDate(date);
        __CLR4_4_1u06u06lgchos1k.R.inc(39224);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39225);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39226);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39227);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt59uku9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt59uku9o() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39228);
        __CLR4_4_1u06u06lgchos1k.R.inc(39229);LocalDate test = new LocalDate((Object) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39230);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39231);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39232);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39233);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString1() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11c2b5du9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11c2b5du9u() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39234);
        __CLR4_4_1u06u06lgchos1k.R.inc(39235);LocalDate test = new LocalDate("1972-04-06");
        __CLR4_4_1u06u06lgchos1k.R.inc(39236);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39237);assertEquals(1972, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39238);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39239);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString2() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14l29xuua0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14l29xuua0() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39240);
        __CLR4_4_1u06u06lgchos1k.R.inc(39241);LocalDate test = new LocalDate("1972-037");
        __CLR4_4_1u06u06lgchos1k.R.inc(39242);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39243);assertEquals(1972, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39244);assertEquals(2, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39245);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectString3() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17u28qbua6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17u28qbua6() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39246);
        __CLR4_4_1u06u06lgchos1k.R.inc(39247);LocalDate test = new LocalDate("1972-02");
        __CLR4_4_1u06u06lgchos1k.R.inc(39248);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39249);assertEquals(1972, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39250);assertEquals(2, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39251);assertEquals(1, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx1() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dauleuac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dauleuac() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39252);
        __CLR4_4_1u06u06lgchos1k.R.inc(39253);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39254);new LocalDate("1970-04-06T+14:00");
            __CLR4_4_1u06u06lgchos1k.R.inc(39255);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx2() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vp473uag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vp473uag() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39256);
        __CLR4_4_1u06u06lgchos1k.R.inc(39257);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39258);new LocalDate("1970-04-06T10:20:30.040");
            __CLR4_4_1u06u06lgchos1k.R.inc(39259);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx3() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_154p2zkuak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_154p2zkuak() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39260);
        __CLR4_4_1u06u06lgchos1k.R.inc(39261);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39262);new LocalDate("1970-04-06T10:20:30.040+14:00");
            __CLR4_4_1u06u06lgchos1k.R.inc(39263);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx4() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dp1s1uao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dp1s1uao() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39264);
        __CLR4_4_1u06u06lgchos1k.R.inc(39265);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39266);new LocalDate("T10:20:30.040");
            __CLR4_4_1u06u06lgchos1k.R.inc(39267);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx5() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmp0kiuas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmp0kiuas() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39268);
        __CLR4_4_1u06u06lgchos1k.R.inc(39269);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39270);new LocalDate("T10:20:30.040+14:00");
            __CLR4_4_1u06u06lgchos1k.R.inc(39271);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx6() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1evozczuaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1evozczuaw() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39272);
        __CLR4_4_1u06u06lgchos1k.R.inc(39273);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39274);new LocalDate("10:20:30.040");
            __CLR4_4_1u06u06lgchos1k.R.inc(39275);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectStringEx7() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4oy5gub0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectStringEx7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4oy5gub0() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39276);
        __CLR4_4_1u06u06lgchos1k.R.inc(39277);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39278);new LocalDate("10:20:30.040+14:00");
            __CLR4_4_1u06u06lgchos1k.R.inc(39279);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalDate() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drwkayub4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drwkayub4() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39280);
        __CLR4_4_1u06u06lgchos1k.R.inc(39281);LocalDate date = new LocalDate(1970, 4, 6, BUDDHIST_UTC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39282);LocalDate test = new LocalDate(date);
        __CLR4_4_1u06u06lgchos1k.R.inc(39283);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39284);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39285);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39286);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalTime() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d94w9ubb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectLocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d94w9ubb() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39287);
        __CLR4_4_1u06u06lgchos1k.R.inc(39288);LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39289);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39290);new LocalDate(time);
            __CLR4_4_1u06u06lgchos1k.R.inc(39291);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_ObjectLocalDateTime() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kto907ubg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectLocalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kto907ubg() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39292);
        __CLR4_4_1u06u06lgchos1k.R.inc(39293);LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39294);LocalDate test = new LocalDate(dt);
        __CLR4_4_1u06u06lgchos1k.R.inc(39295);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39296);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39297);assertEquals(5, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39298);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_ObjectYearMonthDay() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x7cbiuubn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_ObjectYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x7cbiuubn() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39299);
        __CLR4_4_1u06u06lgchos1k.R.inc(39300);YearMonthDay date = new YearMonthDay(1970, 4, 6, BUDDHIST_UTC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39301);LocalDate test = new LocalDate(date);
        __CLR4_4_1u06u06lgchos1k.R.inc(39302);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39303);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39304);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39305);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pk74vrubu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pk74vrubu() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39306);
        __CLR4_4_1u06u06lgchos1k.R.inc(39307);Date date = new Date(TEST_TIME1);
        __CLR4_4_1u06u06lgchos1k.R.inc(39308);LocalDate test = new LocalDate(date, PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39309);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39310);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39311);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39312);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_DateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxoowguc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxoowguc1() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39313);
        __CLR4_4_1u06u06lgchos1k.R.inc(39314);LocalDate test = new LocalDate((Object) null, PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39315);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39316);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39317);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39318);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_nullDateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151w5y6uc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151w5y6uc7() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39319);
        __CLR4_4_1u06u06lgchos1k.R.inc(39320);Date date = new Date(TEST_TIME1);
        __CLR4_4_1u06u06lgchos1k.R.inc(39321);LocalDate test = new LocalDate(date, (DateTimeZone) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39322);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39323);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39324);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39325);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_nullDateTimeZone() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv60h5uce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullDateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv60h5uce() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39326);
        __CLR4_4_1u06u06lgchos1k.R.inc(39327);LocalDate test = new LocalDate((Object) null, (DateTimeZone) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39328);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39329);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39330);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39331);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_Chronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmnvd4uck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmnvd4uck() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39332);
        __CLR4_4_1u06u06lgchos1k.R.inc(39333);Date date = new Date(TEST_TIME1);
        __CLR4_4_1u06u06lgchos1k.R.inc(39334);LocalDate test = new LocalDate(date, GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39335);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39336);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39337);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39338);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_Chronology_crossChronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vy7vlucr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_Chronology_crossChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vy7vlucr() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39339);
        __CLR4_4_1u06u06lgchos1k.R.inc(39340);LocalDate input = new LocalDate(1970, 4, 6, ISO_UTC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39341);LocalDate test = new LocalDate(input, BUDDHIST_UTC);
        __CLR4_4_1u06u06lgchos1k.R.inc(39342);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39343);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39344);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39345);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_Chronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q0uynucy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q0uynucy() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39346);
        __CLR4_4_1u06u06lgchos1k.R.inc(39347);LocalDate test = new LocalDate((Object) null, GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39348);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39349);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39350);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39351);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_nullChronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yccijzud4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yccijzud4() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39352);
        __CLR4_4_1u06u06lgchos1k.R.inc(39353);Date date = new Date(TEST_TIME1);
        __CLR4_4_1u06u06lgchos1k.R.inc(39354);LocalDate test = new LocalDate(date, (Chronology) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39355);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39356);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39357);assertEquals(4, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39358);assertEquals(6, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_nullObject_nullChronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dtve0udb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_nullObject_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dtve0udb() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39359);
        __CLR4_4_1u06u06lgchos1k.R.inc(39360);LocalDate test = new LocalDate((Object) null, (Chronology) null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39361);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39362);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39363);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39364);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_int_int_int() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bd9uqnudh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_int_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bd9uqnudh() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39365);
        __CLR4_4_1u06u06lgchos1k.R.inc(39366);LocalDate test = new LocalDate(1970, 6, 9);
        __CLR4_4_1u06u06lgchos1k.R.inc(39367);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39368);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39369);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39370);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39371);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39372);new LocalDate(Integer.MIN_VALUE, 6, 9);
            __CLR4_4_1u06u06lgchos1k.R.inc(39373);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39374);assertEquals("Value -2147483648 for year must be in the range [-292275055,292278994]", ex.getMessage());
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39375);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39376);new LocalDate(Integer.MAX_VALUE, 6, 9);
            __CLR4_4_1u06u06lgchos1k.R.inc(39377);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39378);assertEquals("Value 2147483647 for year must be in the range [-292275055,292278994]", ex.getMessage());
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39379);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39380);new LocalDate(1970, 0, 9);
            __CLR4_4_1u06u06lgchos1k.R.inc(39381);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39382);assertEquals("Value 0 for monthOfYear must be in the range [1,12]", ex.getMessage());
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39383);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39384);new LocalDate(1970, 13, 9);
            __CLR4_4_1u06u06lgchos1k.R.inc(39385);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39386);assertEquals("Value 13 for monthOfYear must be in the range [1,12]", ex.getMessage());
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39387);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39388);new LocalDate(1970, 6, 0);
            __CLR4_4_1u06u06lgchos1k.R.inc(39389);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assertEquals("Value 0 for dayOfMonth must be in the range [1,30]: year: 1970 month: 6", ex.getMessage());
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39391);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39392);new LocalDate(1970, 6, 31);
            __CLR4_4_1u06u06lgchos1k.R.inc(39393);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39394);assertEquals("Value 31 for dayOfMonth must be in the range [1,30]: year: 1970 month: 6", ex.getMessage());
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39395);new LocalDate(1970, 7, 31);
        __CLR4_4_1u06u06lgchos1k.R.inc(39396);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39397);new LocalDate(1970, 7, 32);
            __CLR4_4_1u06u06lgchos1k.R.inc(39398);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1u06u06lgchos1k.R.inc(39399);assertEquals("Value 32 for dayOfMonth must be in the range [1,31]: year: 1970 month: 7", ex.getMessage());
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_Chronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o62uzqueg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_int_int_int_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o62uzqueg() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39400);
        __CLR4_4_1u06u06lgchos1k.R.inc(39401);LocalDate test = new LocalDate(1970, 6, 9, GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39402);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39403);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39404);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39405);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1u06u06lgchos1k.R.inc(39406);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39407);new LocalDate(Integer.MIN_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39408);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39409);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39410);new LocalDate(Integer.MAX_VALUE, 6, 9, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39411);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39412);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39413);new LocalDate(1970, 0, 9, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39414);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39415);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39416);new LocalDate(1970, 13, 9, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39417);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39418);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39419);new LocalDate(1970, 6, 0, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39420);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39421);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39422);new LocalDate(1970, 6, 31, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39423);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1u06u06lgchos1k.R.inc(39424);new LocalDate(1970, 7, 31, GREGORIAN_PARIS);
        __CLR4_4_1u06u06lgchos1k.R.inc(39425);try {
            __CLR4_4_1u06u06lgchos1k.R.inc(39426);new LocalDate(1970, 7, 32, GREGORIAN_PARIS);
            __CLR4_4_1u06u06lgchos1k.R.inc(39427);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

    @Test
    public void testConstructor_int_int_int_nullChronology() throws Throwable {__CLR4_4_1u06u06lgchos1k.R.globalSliceStart(getClass().getName(),39428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uph3gtuf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u06u06lgchos1k.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u06u06lgchos1k.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDate_Constructors.testConstructor_int_int_int_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uph3gtuf8() throws Throwable{try{__CLR4_4_1u06u06lgchos1k.R.inc(39428);
        __CLR4_4_1u06u06lgchos1k.R.inc(39429);LocalDate test = new LocalDate(1970, 6, 9, null);
        __CLR4_4_1u06u06lgchos1k.R.inc(39430);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1u06u06lgchos1k.R.inc(39431);assertEquals(1970, test.getYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39432);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1u06u06lgchos1k.R.inc(39433);assertEquals(9, test.getDayOfMonth());
    }finally{__CLR4_4_1u06u06lgchos1k.R.flushNeeded();}}

}
