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
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Constructors {static class __CLR4_4_1108b108blgchosa1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,47526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1108b108blgchosa1.R.inc(46955);
        __CLR4_4_1108b108blgchosa1.R.inc(46956);TestMutableInterval_Constructors TB = new TestMutableInterval_Constructors();
        __CLR4_4_1108b108blgchosa1.R.inc(46957);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46958);TB.testTest();
        __CLR4_4_1108b108blgchosa1.R.inc(46959);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46960);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46961);TB.testParse_noFormatter();
        __CLR4_4_1108b108blgchosa1.R.inc(46962);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46963);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46964);TB.testConstructor();
        __CLR4_4_1108b108blgchosa1.R.inc(46965);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46966);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46967);TB.testConstructor_long_long1();
        __CLR4_4_1108b108blgchosa1.R.inc(46968);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46969);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46970);TB.testConstructor_long_long2();
        __CLR4_4_1108b108blgchosa1.R.inc(46971);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46972);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46973);TB.testConstructor_long_long3();
        __CLR4_4_1108b108blgchosa1.R.inc(46974);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46975);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46976);TB.testConstructor_long_long_Chronology1();
        __CLR4_4_1108b108blgchosa1.R.inc(46977);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46978);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46979);TB.testConstructor_long_long_Chronology2();
        __CLR4_4_1108b108blgchosa1.R.inc(46980);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46981);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46982);TB.testConstructor_RI_RI1();
        __CLR4_4_1108b108blgchosa1.R.inc(46983);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46984);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46985);TB.testConstructor_RI_RI2();
        __CLR4_4_1108b108blgchosa1.R.inc(46986);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46987);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46988);TB.testConstructor_RI_RI3();
        __CLR4_4_1108b108blgchosa1.R.inc(46989);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46990);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46991);TB.testConstructor_RI_RI4();
        __CLR4_4_1108b108blgchosa1.R.inc(46992);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46993);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46994);TB.testConstructor_RI_RI5();
        __CLR4_4_1108b108blgchosa1.R.inc(46995);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46996);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(46997);TB.testConstructor_RI_RI6();
        __CLR4_4_1108b108blgchosa1.R.inc(46998);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(46999);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47000);TB.testConstructor_RI_RI7();
        __CLR4_4_1108b108blgchosa1.R.inc(47001);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47002);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47003);TB.testConstructor_RI_RI8();
        __CLR4_4_1108b108blgchosa1.R.inc(47004);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47005);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47006);TB.testConstructor_RI_RI9();
        __CLR4_4_1108b108blgchosa1.R.inc(47007);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47008);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47009);TB.testConstructor_RI_RP1();
        __CLR4_4_1108b108blgchosa1.R.inc(47010);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47011);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47012);TB.testConstructor_RI_RP2();
        __CLR4_4_1108b108blgchosa1.R.inc(47013);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47014);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47015);TB.testConstructor_RI_RP3();
        __CLR4_4_1108b108blgchosa1.R.inc(47016);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47017);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47018);TB.testConstructor_RI_RP4();
        __CLR4_4_1108b108blgchosa1.R.inc(47019);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47020);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47021);TB.testConstructor_RI_RP5();
        __CLR4_4_1108b108blgchosa1.R.inc(47022);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47023);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47024);TB.testConstructor_RI_RP6();
        __CLR4_4_1108b108blgchosa1.R.inc(47025);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47026);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47027);TB.testConstructor_RI_RP7();
        __CLR4_4_1108b108blgchosa1.R.inc(47028);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47029);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47030);TB.testConstructor_RI_RP8();
        __CLR4_4_1108b108blgchosa1.R.inc(47031);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47032);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47033);TB.testConstructor_RP_RI1();
        __CLR4_4_1108b108blgchosa1.R.inc(47034);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47035);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47036);TB.testConstructor_RP_RI2();
        __CLR4_4_1108b108blgchosa1.R.inc(47037);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47038);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47039);TB.testConstructor_RP_RI3();
        __CLR4_4_1108b108blgchosa1.R.inc(47040);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47041);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47042);TB.testConstructor_RP_RI4();
        __CLR4_4_1108b108blgchosa1.R.inc(47043);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47044);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47045);TB.testConstructor_RP_RI5();
        __CLR4_4_1108b108blgchosa1.R.inc(47046);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47047);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47048);TB.testConstructor_RP_RI6();
        __CLR4_4_1108b108blgchosa1.R.inc(47049);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47050);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47051);TB.testConstructor_RP_RI7();
        __CLR4_4_1108b108blgchosa1.R.inc(47052);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47053);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47054);TB.testConstructor_RP_RI8();
        __CLR4_4_1108b108blgchosa1.R.inc(47055);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47056);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47057);TB.testConstructor_RI_RD1();
        __CLR4_4_1108b108blgchosa1.R.inc(47058);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47059);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47060);TB.testConstructor_RI_RD2();
        __CLR4_4_1108b108blgchosa1.R.inc(47061);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47062);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47063);TB.testConstructor_RI_RD3();
        __CLR4_4_1108b108blgchosa1.R.inc(47064);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47065);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47066);TB.testConstructor_RI_RD4();
        __CLR4_4_1108b108blgchosa1.R.inc(47067);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47068);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47069);TB.testConstructor_RI_RD5();
        __CLR4_4_1108b108blgchosa1.R.inc(47070);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47071);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47072);TB.testConstructor_RD_RI1();
        __CLR4_4_1108b108blgchosa1.R.inc(47073);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47074);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47075);TB.testConstructor_RD_RI2();
        __CLR4_4_1108b108blgchosa1.R.inc(47076);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47077);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47078);TB.testConstructor_RD_RI3();
        __CLR4_4_1108b108blgchosa1.R.inc(47079);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47080);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47081);TB.testConstructor_RD_RI4();
        __CLR4_4_1108b108blgchosa1.R.inc(47082);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47083);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47084);TB.testConstructor_RD_RI5();
        __CLR4_4_1108b108blgchosa1.R.inc(47085);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47086);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47087);TB.testConstructor_Object1();
        __CLR4_4_1108b108blgchosa1.R.inc(47088);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47089);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47090);TB.testConstructor_Object2();
        __CLR4_4_1108b108blgchosa1.R.inc(47091);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47092);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47093);TB.testConstructor_Object3();
        __CLR4_4_1108b108blgchosa1.R.inc(47094);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47095);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47096);TB.testConstructor_Object4();
        __CLR4_4_1108b108blgchosa1.R.inc(47097);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47098);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47099);TB.testConstructor_Object5();
        __CLR4_4_1108b108blgchosa1.R.inc(47100);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47101);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47102);TB.testConstructor_Object6();
        __CLR4_4_1108b108blgchosa1.R.inc(47103);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47104);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47105);TB.testConstructor_Object_Chronology1();
        __CLR4_4_1108b108blgchosa1.R.inc(47106);TB.tearDown();
        __CLR4_4_1108b108blgchosa1.R.inc(47107);TB.setUp();
        __CLR4_4_1108b108blgchosa1.R.inc(47108);TB.testConstructor_Object_Chronology2();
        __CLR4_4_1108b108blgchosa1.R.inc(47109);TB.tearDown();
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableInterval_Constructors.class);
    }

    public TestMutableInterval_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1108b108blgchosa1.R.inc(47110);
        __CLR4_4_1108b108blgchosa1.R.inc(47111);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47112);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1108b108blgchosa1.R.inc(47113);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1108b108blgchosa1.R.inc(47114);originalLocale = Locale.getDefault();
        __CLR4_4_1108b108blgchosa1.R.inc(47115);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1108b108blgchosa1.R.inc(47116);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1108b108blgchosa1.R.inc(47117);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1108b108blgchosa1.R.inc(47118);
        __CLR4_4_1108b108blgchosa1.R.inc(47119);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1108b108blgchosa1.R.inc(47120);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1108b108blgchosa1.R.inc(47121);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1108b108blgchosa1.R.inc(47122);Locale.setDefault(originalLocale);
        __CLR4_4_1108b108blgchosa1.R.inc(47123);originalDateTimeZone = null;
        __CLR4_4_1108b108blgchosa1.R.inc(47124);originalTimeZone = null;
        __CLR4_4_1108b108blgchosa1.R.inc(47125);originalLocale = null;
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj10d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj10d2(){try{__CLR4_4_1108b108blgchosa1.R.inc(47126);
        __CLR4_4_1108b108blgchosa1.R.inc(47127);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1108b108blgchosa1.R.inc(47128);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1108b108blgchosa1.R.inc(47129);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2oqvi10d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testParse_noFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2oqvi10d6() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47130);
        __CLR4_4_1108b108blgchosa1.R.inc(47131);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1108b108blgchosa1.R.inc(47132);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1108b108blgchosa1.R.inc(47133);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/2010-07-01T14:30"));
        __CLR4_4_1108b108blgchosa1.R.inc(47134);assertEquals(new MutableInterval(start, end), MutableInterval.parse("2010-06-30T12:30/P1DT2H"));
        __CLR4_4_1108b108blgchosa1.R.inc(47135);assertEquals(new MutableInterval(start, end), MutableInterval.parse("P1DT2H/2010-07-01T14:30"));
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h10dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h10dc() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47136);
        __CLR4_4_1108b108blgchosa1.R.inc(47137);MutableInterval test = new MutableInterval();
        __CLR4_4_1108b108blgchosa1.R.inc(47138);assertEquals(0L, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47139);assertEquals(0L, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf410dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf410dg() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47140);
        __CLR4_4_1108b108blgchosa1.R.inc(47141);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47142);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47143);MutableInterval test = new MutableInterval(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47144);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47145);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47146);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmn10dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmn10dn() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47147);
        __CLR4_4_1108b108blgchosa1.R.inc(47148);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47149);MutableInterval test = new MutableInterval(dt1.getMillis(), dt1.getMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47150);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47151);assertEquals(dt1.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47152);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zkm5u10dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zkm5u10dt() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47153);
        __CLR4_4_1108b108blgchosa1.R.inc(47154);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47155);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47156);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47157);new MutableInterval(dt1.getMillis(), dt2.getMillis());
            __CLR4_4_1108b108blgchosa1.R.inc(47158);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_Chronology1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16cacp10dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16cacp10dz() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47159);
        __CLR4_4_1108b108blgchosa1.R.inc(47160);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47161);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47162);MutableInterval test = new MutableInterval(dt1.getMillis(), dt2.getMillis(), GJChronology.getInstance());
        __CLR4_4_1108b108blgchosa1.R.inc(47163);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47164);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47165);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_Chronology2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13fc95610e6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_long_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13fc95610e6() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47166);
        __CLR4_4_1108b108blgchosa1.R.inc(47167);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47168);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47169);MutableInterval test = new MutableInterval(dt1.getMillis(), dt2.getMillis(), null);
        __CLR4_4_1108b108blgchosa1.R.inc(47170);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47171);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47172);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qods10ed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qods10ed() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47173);
        __CLR4_4_1108b108blgchosa1.R.inc(47174);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47175);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47176);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1108b108blgchosa1.R.inc(47177);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47178);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplb10ej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplb10ej() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47179);
        __CLR4_4_1108b108blgchosa1.R.inc(47180);Instant dt1 = new Instant(new DateTime(2004, 6, 9, 0, 0, 0, 0));
        __CLR4_4_1108b108blgchosa1.R.inc(47181);Instant dt2 = new Instant(new DateTime(2005, 7, 10, 1, 1, 1, 1));
        __CLR4_4_1108b108blgchosa1.R.inc(47182);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1108b108blgchosa1.R.inc(47183);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47184);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsu10ep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsu10ep() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47185);
        __CLR4_4_1108b108blgchosa1.R.inc(47186);MutableInterval test = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47187);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47188);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0d10et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0d10et() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47189);
        __CLR4_4_1108b108blgchosa1.R.inc(47190);DateTime dt1 = new DateTime(2000, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47191);MutableInterval test = new MutableInterval(dt1, (ReadableInstant) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47192);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47193);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7w10ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7w10ey() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47194);
        __CLR4_4_1108b108blgchosa1.R.inc(47195);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47196);MutableInterval test = new MutableInterval((ReadableInstant) null, dt2);
        __CLR4_4_1108b108blgchosa1.R.inc(47197);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47198);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI6() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yquff10f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yquff10f3() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47199);
        __CLR4_4_1108b108blgchosa1.R.inc(47200);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47201);MutableInterval test = new MutableInterval(dt1, dt1);
        __CLR4_4_1108b108blgchosa1.R.inc(47202);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47203);assertEquals(dt1.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI7() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pqvmy10f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pqvmy10f8() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47204);
        __CLR4_4_1108b108blgchosa1.R.inc(47205);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47206);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47207);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47208);new MutableInterval(dt1, dt2);
            __CLR4_4_1108b108blgchosa1.R.inc(47209);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI8() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqwuh10fe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqwuh10fe() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47210);
        __CLR4_4_1108b108blgchosa1.R.inc(47211);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, GJChronology.getInstance());
        __CLR4_4_1108b108blgchosa1.R.inc(47212);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47213);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1108b108blgchosa1.R.inc(47214);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47215);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47216);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI9() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12s91y010fl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RI9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12s91y010fl() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47217);
        __CLR4_4_1108b108blgchosa1.R.inc(47218);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47219);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, GJChronology.getInstance());
        __CLR4_4_1108b108blgchosa1.R.inc(47220);MutableInterval test = new MutableInterval(dt1, dt2);
        __CLR4_4_1108b108blgchosa1.R.inc(47221);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47222);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47223);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RP1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2iif10fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2iif10fs() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47224);
        __CLR4_4_1108b108blgchosa1.R.inc(47225);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47226);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47227);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47228);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1108b108blgchosa1.R.inc(47229);result = ISOChronology.getInstance().hours().add(result, 1);

        __CLR4_4_1108b108blgchosa1.R.inc(47230);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47231);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47232);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p12jpy10g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p12jpy10g1() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47233);
        __CLR4_4_1108b108blgchosa1.R.inc(47234);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1108b108blgchosa1.R.inc(47235);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47236);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47237);result = ISOChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1108b108blgchosa1.R.inc(47238);result = ISOChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1108b108blgchosa1.R.inc(47239);result = ISOChronology.getInstanceUTC().hours().add(result, 1);

        __CLR4_4_1108b108blgchosa1.R.inc(47240);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47241);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47242);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls2kxh10gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls2kxh10gb() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47243);
        __CLR4_4_1108b108blgchosa1.R.inc(47244);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC());
        __CLR4_4_1108b108blgchosa1.R.inc(47245);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1108b108blgchosa1.R.inc(47246);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47247);result = ISOChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1108b108blgchosa1.R.inc(47248);result = ISOChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1108b108blgchosa1.R.inc(47249);result = ISOChronology.getInstanceUTC().hours().add(result, 1);

        __CLR4_4_1108b108blgchosa1.R.inc(47250);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47251);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47252);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP4() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij2m5010gl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij2m5010gl() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47253);
        __CLR4_4_1108b108blgchosa1.R.inc(47254);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47255);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1108b108blgchosa1.R.inc(47256);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47257);result = ISOChronology.getInstance().hours().add(result, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47258);result = ISOChronology.getInstance().millis().add(result, 23);

        __CLR4_4_1108b108blgchosa1.R.inc(47259);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47260);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47261);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP5() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa2ncj10gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa2ncj10gu() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47262);
        __CLR4_4_1108b108blgchosa1.R.inc(47263);MutableInterval test = new MutableInterval((ReadableInstant) null, (ReadablePeriod) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47264);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47265);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP6() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c12ok210gy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c12ok210gy() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47266);
        __CLR4_4_1108b108blgchosa1.R.inc(47267);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47268);MutableInterval test = new MutableInterval(dt, (ReadablePeriod) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47269);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47270);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP7() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s2prl10h3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s2prl10h3() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47271);
        __CLR4_4_1108b108blgchosa1.R.inc(47272);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47273);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47274);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1108b108blgchosa1.R.inc(47275);result = ISOChronology.getInstance().hourOfDay().add(result, 1);

        __CLR4_4_1108b108blgchosa1.R.inc(47276);MutableInterval test = new MutableInterval((ReadableInstant) null, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47277);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47278);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP8() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j2qz410hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j2qz410hb() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47279);
        __CLR4_4_1108b108blgchosa1.R.inc(47280);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47281);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1108b108blgchosa1.R.inc(47282);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47283);new MutableInterval(dt, dur);
            __CLR4_4_1108b108blgchosa1.R.inc(47284);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RP_RI1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb8gc710hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb8gc710hh() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47285);
        __CLR4_4_1108b108blgchosa1.R.inc(47286);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47287);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47288);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47289);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1108b108blgchosa1.R.inc(47290);result = ISOChronology.getInstance().hours().add(result, -1);

        __CLR4_4_1108b108blgchosa1.R.inc(47291);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47292);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47293);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgvmug10hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgvmug10hq() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47294);
        __CLR4_4_1108b108blgchosa1.R.inc(47295);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1108b108blgchosa1.R.inc(47296);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47297);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47298);result = ISOChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1108b108blgchosa1.R.inc(47299);result = ISOChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1108b108blgchosa1.R.inc(47300);result = ISOChronology.getInstanceUTC().hours().add(result, -1);

        __CLR4_4_1108b108blgchosa1.R.inc(47301);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47302);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47303);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7vo1z10i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7vo1z10i0() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47304);
        __CLR4_4_1108b108blgchosa1.R.inc(47305);DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC());
        __CLR4_4_1108b108blgchosa1.R.inc(47306);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1108b108blgchosa1.R.inc(47307);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47308);result = ISOChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1108b108blgchosa1.R.inc(47309);result = ISOChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1108b108blgchosa1.R.inc(47310);result = ISOChronology.getInstanceUTC().hours().add(result, -1);

        __CLR4_4_1108b108blgchosa1.R.inc(47311);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47312);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47313);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI4() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyvp9i10ia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyvp9i10ia() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47314);
        __CLR4_4_1108b108blgchosa1.R.inc(47315);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47316);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1108b108blgchosa1.R.inc(47317);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47318);result = ISOChronology.getInstance().hours().add(result, -1);
        __CLR4_4_1108b108blgchosa1.R.inc(47319);result = ISOChronology.getInstance().millis().add(result, -23);

        __CLR4_4_1108b108blgchosa1.R.inc(47320);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47321);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47322);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI5() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpvqh110ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpvqh110ij() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47323);
        __CLR4_4_1108b108blgchosa1.R.inc(47324);MutableInterval test = new MutableInterval((ReadablePeriod) null, (ReadableInstant) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47325);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47326);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI6() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgvrok10in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgvrok10in() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47327);
        __CLR4_4_1108b108blgchosa1.R.inc(47328);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47329);MutableInterval test = new MutableInterval((ReadablePeriod) null, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47330);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47331);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI7() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vsw310is();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vsw310is() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47332);
        __CLR4_4_1108b108blgchosa1.R.inc(47333);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47334);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47335);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1108b108blgchosa1.R.inc(47336);result = ISOChronology.getInstance().hourOfDay().add(result, -1);

        __CLR4_4_1108b108blgchosa1.R.inc(47337);MutableInterval test = new MutableInterval(dur, (ReadableInstant) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47338);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47339);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI8() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyvu3m10j0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RP_RI8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyvu3m10j0() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47340);
        __CLR4_4_1108b108blgchosa1.R.inc(47341);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47342);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1108b108blgchosa1.R.inc(47343);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47344);new MutableInterval(dur, dt);
            __CLR4_4_1108b108blgchosa1.R.inc(47345);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt35710j6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt35710j6() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47346);
        __CLR4_4_1108b108blgchosa1.R.inc(47347);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47348);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1108b108blgchosa1.R.inc(47349);result = ISOChronology.getInstance().hours().add(result, 1);

        __CLR4_4_1108b108blgchosa1.R.inc(47350);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47351);Duration dur = new Duration(result - TEST_TIME_NOW);

        __CLR4_4_1108b108blgchosa1.R.inc(47352);MutableInterval test = new MutableInterval(dt, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47353);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47354);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cq10jf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cq10jf() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47355);
        __CLR4_4_1108b108blgchosa1.R.inc(47356);MutableInterval test = new MutableInterval((ReadableInstant) null, (ReadableDuration) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47357);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47358);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8t5k910jj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8t5k910jj() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47359);
        __CLR4_4_1108b108blgchosa1.R.inc(47360);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47361);MutableInterval test = new MutableInterval(dt, (ReadableDuration) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47362);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47363);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD4() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzt6rs10jo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzt6rs10jo() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47364);
        __CLR4_4_1108b108blgchosa1.R.inc(47365);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47366);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1108b108blgchosa1.R.inc(47367);result = ISOChronology.getInstance().hourOfDay().add(result, 1);

        __CLR4_4_1108b108blgchosa1.R.inc(47368);Duration dur = new Duration(result - TEST_TIME_NOW);

        __CLR4_4_1108b108blgchosa1.R.inc(47369);MutableInterval test = new MutableInterval((ReadableInstant) null, dur);
        __CLR4_4_1108b108blgchosa1.R.inc(47370);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47371);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD5() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqt7zb10jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RI_RD5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqt7zb10jw() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47372);
        __CLR4_4_1108b108blgchosa1.R.inc(47373);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47374);Duration dur = new Duration(-1);
        __CLR4_4_1108b108blgchosa1.R.inc(47375);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47376);new MutableInterval(dt, dur);
            __CLR4_4_1108b108blgchosa1.R.inc(47377);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RD_RI1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160dzxn10k2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160dzxn10k2() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47378);
        __CLR4_4_1108b108blgchosa1.R.inc(47379);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47380);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1108b108blgchosa1.R.inc(47381);result = ISOChronology.getInstance().hours().add(result, -1);

        __CLR4_4_1108b108blgchosa1.R.inc(47382);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47383);Duration dur = new Duration(TEST_TIME_NOW - result);

        __CLR4_4_1108b108blgchosa1.R.inc(47384);MutableInterval test = new MutableInterval(dur, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47385);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47386);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dyq410kb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dyq410kb() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47387);
        __CLR4_4_1108b108blgchosa1.R.inc(47388);MutableInterval test = new MutableInterval((ReadableDuration) null, (ReadableInstant) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47389);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47390);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cidxil10kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cidxil10kf() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47391);
        __CLR4_4_1108b108blgchosa1.R.inc(47392);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47393);MutableInterval test = new MutableInterval((ReadableDuration) null, dt);
        __CLR4_4_1108b108blgchosa1.R.inc(47394);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47395);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI4() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frdwb210kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frdwb210kk() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47396);
        __CLR4_4_1108b108blgchosa1.R.inc(47397);long result = TEST_TIME_NOW;
        __CLR4_4_1108b108blgchosa1.R.inc(47398);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1108b108blgchosa1.R.inc(47399);result = ISOChronology.getInstance().hourOfDay().add(result, -1);

        __CLR4_4_1108b108blgchosa1.R.inc(47400);Duration dur = new Duration(TEST_TIME_NOW - result);

        __CLR4_4_1108b108blgchosa1.R.inc(47401);MutableInterval test = new MutableInterval(dur, (ReadableInstant) null);
        __CLR4_4_1108b108blgchosa1.R.inc(47402);assertEquals(result, test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47403);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI5() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0dv3j10ks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_RD_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0dv3j10ks() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47404);
        __CLR4_4_1108b108blgchosa1.R.inc(47405);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1108b108blgchosa1.R.inc(47406);Duration dur = new Duration(-1);
        __CLR4_4_1108b108blgchosa1.R.inc(47407);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47408);new MutableInterval(dur, dt);
            __CLR4_4_1108b108blgchosa1.R.inc(47409);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcy10ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcy10ky() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47410);
        __CLR4_4_1108b108blgchosa1.R.inc(47411);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47412);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47413);MutableInterval test = new MutableInterval(dt1.toString() + '/' + dt2.toString());
        __CLR4_4_1108b108blgchosa1.R.inc(47414);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47415);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5f10l4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5f10l4() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47416);
        __CLR4_4_1108b108blgchosa1.R.inc(47417);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47418);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47419);MutableInterval base = new MutableInterval(dt1, dt2);

        __CLR4_4_1108b108blgchosa1.R.inc(47420);MutableInterval test = new MutableInterval(base);
        __CLR4_4_1108b108blgchosa1.R.inc(47421);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47422);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_Object3() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxw10lb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxw10lb() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47423);
        __CLR4_4_1108b108blgchosa1.R.inc(47424);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47425);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47426);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1108b108blgchosa1.R.inc(47427);MutableInterval test = new MutableInterval(base);
        __CLR4_4_1108b108blgchosa1.R.inc(47428);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47429);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_Object4() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqd10li();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqd10li() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47430);
        __CLR4_4_1108b108blgchosa1.R.inc(47431);MockInterval base = new MockInterval();
        __CLR4_4_1108b108blgchosa1.R.inc(47432);MutableInterval test = new MutableInterval(base);
        __CLR4_4_1108b108blgchosa1.R.inc(47433);assertEquals(base.getStartMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47434);assertEquals(base.getEndMillis(), test.getEndMillis());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_Object5() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moqsiu10ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moqsiu10ln() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47435);
        __CLR4_4_1108b108blgchosa1.R.inc(47436);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter("");
        __CLR4_4_1108b108blgchosa1.R.inc(47437);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1108b108blgchosa1.R.inc(47438);
                __CLR4_4_1108b108blgchosa1.R.inc(47439);return false;
            }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1108b108blgchosa1.R.inc(47440);
                __CLR4_4_1108b108blgchosa1.R.inc(47441);interval.setChronology(chrono);
                __CLR4_4_1108b108blgchosa1.R.inc(47442);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

            public Class<?> getSupportedType() {try{__CLR4_4_1108b108blgchosa1.R.inc(47443);
                __CLR4_4_1108b108blgchosa1.R.inc(47444);return String.class;
            }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}
        };
        __CLR4_4_1108b108blgchosa1.R.inc(47445);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47446);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1108b108blgchosa1.R.inc(47447);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1108b108blgchosa1.R.inc(47448);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
            __CLR4_4_1108b108blgchosa1.R.inc(47449);MutableInterval test = new MutableInterval(dt1.toString() + '/' + dt2.toString());
            __CLR4_4_1108b108blgchosa1.R.inc(47450);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1108b108blgchosa1.R.inc(47451);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1108b108blgchosa1.R.inc(47452);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_Object6() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqrbb10m5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqrbb10m5() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47453);
        __CLR4_4_1108b108blgchosa1.R.inc(47454);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new MutableInterval(0L, 0L));
        __CLR4_4_1108b108blgchosa1.R.inc(47455);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1108b108blgchosa1.R.inc(47456);
                __CLR4_4_1108b108blgchosa1.R.inc(47457);return false;
            }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1108b108blgchosa1.R.inc(47458);
                __CLR4_4_1108b108blgchosa1.R.inc(47459);interval.setChronology(chrono);
                __CLR4_4_1108b108blgchosa1.R.inc(47460);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

            public Class<?> getSupportedType() {try{__CLR4_4_1108b108blgchosa1.R.inc(47461);
                __CLR4_4_1108b108blgchosa1.R.inc(47462);return ReadableInterval.class;
            }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}
        };
        __CLR4_4_1108b108blgchosa1.R.inc(47463);try {
            __CLR4_4_1108b108blgchosa1.R.inc(47464);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1108b108blgchosa1.R.inc(47465);Interval base = new Interval(-1000L, 1000L);
            __CLR4_4_1108b108blgchosa1.R.inc(47466);MutableInterval test = new MutableInterval(base);
            __CLR4_4_1108b108blgchosa1.R.inc(47467);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1108b108blgchosa1.R.inc(47468);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1108b108blgchosa1.R.inc(47469);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1108b108blgchosa1.R.inc(47470);
            __CLR4_4_1108b108blgchosa1.R.inc(47471);return ISOChronology.getInstance();
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public long getStartMillis() {try{__CLR4_4_1108b108blgchosa1.R.inc(47472);
            __CLR4_4_1108b108blgchosa1.R.inc(47473);return 1234L;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public DateTime getStart() {try{__CLR4_4_1108b108blgchosa1.R.inc(47474);
            __CLR4_4_1108b108blgchosa1.R.inc(47475);return new DateTime(1234L);
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public long getEndMillis() {try{__CLR4_4_1108b108blgchosa1.R.inc(47476);
            __CLR4_4_1108b108blgchosa1.R.inc(47477);return 5678L;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public DateTime getEnd() {try{__CLR4_4_1108b108blgchosa1.R.inc(47478);
            __CLR4_4_1108b108blgchosa1.R.inc(47479);return new DateTime(5678L);
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public long toDurationMillis() {try{__CLR4_4_1108b108blgchosa1.R.inc(47480);
            __CLR4_4_1108b108blgchosa1.R.inc(47481);return (5678L - 1234L);
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public Duration toDuration() {try{__CLR4_4_1108b108blgchosa1.R.inc(47482);
            __CLR4_4_1108b108blgchosa1.R.inc(47483);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean contains(long millisInstant) {try{__CLR4_4_1108b108blgchosa1.R.inc(47484);
            __CLR4_4_1108b108blgchosa1.R.inc(47485);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean containsNow() {try{__CLR4_4_1108b108blgchosa1.R.inc(47486);
            __CLR4_4_1108b108blgchosa1.R.inc(47487);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1108b108blgchosa1.R.inc(47488);
            __CLR4_4_1108b108blgchosa1.R.inc(47489);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1108b108blgchosa1.R.inc(47490);
            __CLR4_4_1108b108blgchosa1.R.inc(47491);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1108b108blgchosa1.R.inc(47492);
            __CLR4_4_1108b108blgchosa1.R.inc(47493);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1108b108blgchosa1.R.inc(47494);
            __CLR4_4_1108b108blgchosa1.R.inc(47495);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1108b108blgchosa1.R.inc(47496);
            __CLR4_4_1108b108blgchosa1.R.inc(47497);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1108b108blgchosa1.R.inc(47498);
            __CLR4_4_1108b108blgchosa1.R.inc(47499);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1108b108blgchosa1.R.inc(47500);
            __CLR4_4_1108b108blgchosa1.R.inc(47501);return false;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public Interval toInterval() {try{__CLR4_4_1108b108blgchosa1.R.inc(47502);
            __CLR4_4_1108b108blgchosa1.R.inc(47503);return null;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public MutableInterval toMutableInterval() {try{__CLR4_4_1108b108blgchosa1.R.inc(47504);
            __CLR4_4_1108b108blgchosa1.R.inc(47505);return null;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public Period toPeriod() {try{__CLR4_4_1108b108blgchosa1.R.inc(47506);
            __CLR4_4_1108b108blgchosa1.R.inc(47507);return null;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

        public Period toPeriod(PeriodType type) {try{__CLR4_4_1108b108blgchosa1.R.inc(47508);
            __CLR4_4_1108b108blgchosa1.R.inc(47509);return null;
        }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object_Chronology1() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmfign10nq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmfign10nq() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47510);
        __CLR4_4_1108b108blgchosa1.R.inc(47511);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47512);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47513);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1108b108blgchosa1.R.inc(47514);MutableInterval test = new MutableInterval(base, BuddhistChronology.getInstance());
        __CLR4_4_1108b108blgchosa1.R.inc(47515);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47516);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47517);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_Chronology2() throws Throwable {__CLR4_4_1108b108blgchosa1.R.globalSliceStart(getClass().getName(),47518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svfh9410ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1108b108blgchosa1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1108b108blgchosa1.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableInterval_Constructors.testConstructor_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),47518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svfh9410ny() throws Throwable{try{__CLR4_4_1108b108blgchosa1.R.inc(47518);
        __CLR4_4_1108b108blgchosa1.R.inc(47519);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1108b108blgchosa1.R.inc(47520);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1108b108blgchosa1.R.inc(47521);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1108b108blgchosa1.R.inc(47522);MutableInterval test = new MutableInterval(base, null);
        __CLR4_4_1108b108blgchosa1.R.inc(47523);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47524);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1108b108blgchosa1.R.inc(47525);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1108b108blgchosa1.R.flushNeeded();}}

}
