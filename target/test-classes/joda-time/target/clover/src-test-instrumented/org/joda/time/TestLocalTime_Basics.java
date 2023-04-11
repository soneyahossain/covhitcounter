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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics {static class __CLR4_4_1urturtlgchos2r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,40542,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
            1L * DateTimeConstants.MILLIS_PER_DAY
                    + 5L * DateTimeConstants.MILLIS_PER_HOUR
                    + 6L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 7L * DateTimeConstants.MILLIS_PER_SECOND
                    + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1urturtlgchos2r.R.inc(39881);
        __CLR4_4_1urturtlgchos2r.R.inc(39882);TestLocalTime_Basics TB = new TestLocalTime_Basics();
        __CLR4_4_1urturtlgchos2r.R.inc(39883);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39884);TB.testGet_DateTimeFieldType();
        __CLR4_4_1urturtlgchos2r.R.inc(39885);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39886);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39887);TB.testSize();
        __CLR4_4_1urturtlgchos2r.R.inc(39888);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39889);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39890);TB.testGetFieldType_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39891);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39892);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39893);TB.testGetFieldTypes();
        __CLR4_4_1urturtlgchos2r.R.inc(39894);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39895);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39896);TB.testGetField_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39897);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39898);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39899);TB.testGetFields();
        __CLR4_4_1urturtlgchos2r.R.inc(39900);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39901);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39902);TB.testGetValue_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39903);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39904);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39905);TB.testGetValues();
        __CLR4_4_1urturtlgchos2r.R.inc(39906);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39907);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39908);TB.testIsSupported_DateTimeFieldType();
        __CLR4_4_1urturtlgchos2r.R.inc(39909);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39910);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39911);TB.testIsSupported_DurationFieldType();
        __CLR4_4_1urturtlgchos2r.R.inc(39912);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39913);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39914);TB.testEqualsHashCode();
        __CLR4_4_1urturtlgchos2r.R.inc(39915);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39916);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39917);TB.testCompareTo();
        __CLR4_4_1urturtlgchos2r.R.inc(39918);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39919);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39920);TB.testIsEqual_LocalTime();
        __CLR4_4_1urturtlgchos2r.R.inc(39921);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39922);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39923);TB.testIsBefore_LocalTime();
        __CLR4_4_1urturtlgchos2r.R.inc(39924);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39925);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39926);TB.testIsAfter_LocalTime();
        __CLR4_4_1urturtlgchos2r.R.inc(39927);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39928);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39929);TB.testWithField_DateTimeFieldType_int_1();
        __CLR4_4_1urturtlgchos2r.R.inc(39930);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39931);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39932);TB.testWithField_DateTimeFieldType_int_2();
        __CLR4_4_1urturtlgchos2r.R.inc(39933);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39934);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39935);TB.testWithField_DateTimeFieldType_int_3();
        __CLR4_4_1urturtlgchos2r.R.inc(39936);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39937);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39938);TB.testWithField_DateTimeFieldType_int_4();
        __CLR4_4_1urturtlgchos2r.R.inc(39939);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39940);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39941);TB.testWithFieldAdded_DurationFieldType_int_1();
        __CLR4_4_1urturtlgchos2r.R.inc(39942);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39943);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39944);TB.testWithFieldAdded_DurationFieldType_int_2();
        __CLR4_4_1urturtlgchos2r.R.inc(39945);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39946);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39947);TB.testWithFieldAdded_DurationFieldType_int_3();
        __CLR4_4_1urturtlgchos2r.R.inc(39948);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39949);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39950);TB.testWithFieldAdded_DurationFieldType_int_4();
        __CLR4_4_1urturtlgchos2r.R.inc(39951);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39952);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39953);TB.testWithFieldAdded_DurationFieldType_int_5();
        __CLR4_4_1urturtlgchos2r.R.inc(39954);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39955);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39956);TB.testWithFieldAdded_DurationFieldType_int_6();
        __CLR4_4_1urturtlgchos2r.R.inc(39957);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39958);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39959);TB.testWithFieldAdded_DurationFieldType_int_7();
        __CLR4_4_1urturtlgchos2r.R.inc(39960);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39961);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39962);TB.testWithFieldAdded_DurationFieldType_int_8();
        __CLR4_4_1urturtlgchos2r.R.inc(39963);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39964);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39965);TB.testPlus_RP();
        __CLR4_4_1urturtlgchos2r.R.inc(39966);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39967);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39968);TB.testPlusHours_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39969);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39970);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39971);TB.testPlusMinutes_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39972);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39973);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39974);TB.testPlusSeconds_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39975);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39976);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39977);TB.testPlusMillis_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39978);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39979);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39980);TB.testMinus_RP();
        __CLR4_4_1urturtlgchos2r.R.inc(39981);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39982);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39983);TB.testMinusHours_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39984);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39985);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39986);TB.testMinusMinutes_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39987);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39988);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39989);TB.testMinusSeconds_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39990);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39991);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39992);TB.testMinusMillis_int();
        __CLR4_4_1urturtlgchos2r.R.inc(39993);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39994);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39995);TB.testGetters();
        __CLR4_4_1urturtlgchos2r.R.inc(39996);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(39997);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(39998);TB.testWithers();
        __CLR4_4_1urturtlgchos2r.R.inc(39999);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40000);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40001);TB.testToDateTimeTodayDefaultZone();
        __CLR4_4_1urturtlgchos2r.R.inc(40002);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40003);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40004);TB.testToDateTimeToday_Zone();
        __CLR4_4_1urturtlgchos2r.R.inc(40005);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40006);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40007);TB.testToDateTimeToday_nullZone();
        __CLR4_4_1urturtlgchos2r.R.inc(40008);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40009);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40010);TB.testToDateTime_RI();
        __CLR4_4_1urturtlgchos2r.R.inc(40011);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40012);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40013);TB.testToDateTime_nullRI();
        __CLR4_4_1urturtlgchos2r.R.inc(40014);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40015);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40016);TB.testProperty();
        __CLR4_4_1urturtlgchos2r.R.inc(40017);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40018);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40019);TB.testSerialization();
        __CLR4_4_1urturtlgchos2r.R.inc(40020);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40021);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40022);TB.testToString();
        __CLR4_4_1urturtlgchos2r.R.inc(40023);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40024);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40025);TB.testToString_String();
        __CLR4_4_1urturtlgchos2r.R.inc(40026);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40027);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40028);TB.testToString_String_Locale();
        __CLR4_4_1urturtlgchos2r.R.inc(40029);TB.tearDown();
        __CLR4_4_1urturtlgchos2r.R.inc(40030);TB.setUp();
        __CLR4_4_1urturtlgchos2r.R.inc(40031);TB.testToString_DTFormatter();
        __CLR4_4_1urturtlgchos2r.R.inc(40032);TB.tearDown();

    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestLocalTime_Basics.class);
    }

    public TestLocalTime_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1urturtlgchos2r.R.inc(40033);
        __CLR4_4_1urturtlgchos2r.R.inc(40034);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1urturtlgchos2r.R.inc(40035);zone = DateTimeZone.getDefault();
        __CLR4_4_1urturtlgchos2r.R.inc(40036);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1urturtlgchos2r.R.inc(40037);
        __CLR4_4_1urturtlgchos2r.R.inc(40038);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1urturtlgchos2r.R.inc(40039);DateTimeZone.setDefault(zone);
        __CLR4_4_1urturtlgchos2r.R.inc(40040);zone = null;
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vuw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vuw9(){try{__CLR4_4_1urturtlgchos2r.R.inc(40041);
        __CLR4_4_1urturtlgchos2r.R.inc(40042);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40043);assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40044);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1urturtlgchos2r.R.inc(40045);assertEquals(30, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1urturtlgchos2r.R.inc(40046);assertEquals(40, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1urturtlgchos2r.R.inc(40047);assertEquals(TEST_TIME_NOW / 60000, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40048);assertEquals(TEST_TIME_NOW / 1000, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40049);assertEquals(TEST_TIME_NOW, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40050);assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40051);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40052);test = new LocalTime(12, 30);
        __CLR4_4_1urturtlgchos2r.R.inc(40053);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40054);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40055);assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40056);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40057);test = new LocalTime(14, 30);
        __CLR4_4_1urturtlgchos2r.R.inc(40058);assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40059);assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40060);assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40061);assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40062);test = new LocalTime(0, 30);
        __CLR4_4_1urturtlgchos2r.R.inc(40063);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40064);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40065);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40066);assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40067);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40068);test.get(null);
            __CLR4_4_1urturtlgchos2r.R.inc(40069);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1urturtlgchos2r.R.inc(40070);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40071);test.get(DateTimeFieldType.dayOfMonth());
            __CLR4_4_1urturtlgchos2r.R.inc(40072);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx122ux5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx122ux5(){try{__CLR4_4_1urturtlgchos2r.R.inc(40073);
        __CLR4_4_1urturtlgchos2r.R.inc(40074);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40075);assertEquals(4, test.size());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testGetFieldType_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v547gnux8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetFieldType_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v547gnux8(){try{__CLR4_4_1urturtlgchos2r.R.inc(40076);
        __CLR4_4_1urturtlgchos2r.R.inc(40077);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40078);assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        __CLR4_4_1urturtlgchos2r.R.inc(40079);assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        __CLR4_4_1urturtlgchos2r.R.inc(40080);assertSame(DateTimeFieldType.secondOfMinute(), test.getFieldType(2));
        __CLR4_4_1urturtlgchos2r.R.inc(40081);assertSame(DateTimeFieldType.millisOfSecond(), test.getFieldType(3));
        __CLR4_4_1urturtlgchos2r.R.inc(40082);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40083);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1urturtlgchos2r.R.inc(40084);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40085);test.getFieldType(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuuxi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuuxi(){try{__CLR4_4_1urturtlgchos2r.R.inc(40086);
        __CLR4_4_1urturtlgchos2r.R.inc(40087);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40088);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_1urturtlgchos2r.R.inc(40089);assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        __CLR4_4_1urturtlgchos2r.R.inc(40090);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        __CLR4_4_1urturtlgchos2r.R.inc(40091);assertSame(DateTimeFieldType.secondOfMinute(), fields[2]);
        __CLR4_4_1urturtlgchos2r.R.inc(40092);assertSame(DateTimeFieldType.millisOfSecond(), fields[3]);
        __CLR4_4_1urturtlgchos2r.R.inc(40093);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testGetField_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esjyjxuxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetField_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esjyjxuxq(){try{__CLR4_4_1urturtlgchos2r.R.inc(40094);
        __CLR4_4_1urturtlgchos2r.R.inc(40095);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1urturtlgchos2r.R.inc(40096);assertSame(COPTIC_UTC.hourOfDay(), test.getField(0));
        __CLR4_4_1urturtlgchos2r.R.inc(40097);assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1));
        __CLR4_4_1urturtlgchos2r.R.inc(40098);assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2));
        __CLR4_4_1urturtlgchos2r.R.inc(40099);assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3));
        __CLR4_4_1urturtlgchos2r.R.inc(40100);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40101);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1urturtlgchos2r.R.inc(40102);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40103);test.getField(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeasuy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeasuy0(){try{__CLR4_4_1urturtlgchos2r.R.inc(40104);
        __CLR4_4_1urturtlgchos2r.R.inc(40105);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1urturtlgchos2r.R.inc(40106);DateTimeField[] fields = test.getFields();
        __CLR4_4_1urturtlgchos2r.R.inc(40107);assertSame(COPTIC_UTC.hourOfDay(), fields[0]);
        __CLR4_4_1urturtlgchos2r.R.inc(40108);assertSame(COPTIC_UTC.minuteOfHour(), fields[1]);
        __CLR4_4_1urturtlgchos2r.R.inc(40109);assertSame(COPTIC_UTC.secondOfMinute(), fields[2]);
        __CLR4_4_1urturtlgchos2r.R.inc(40110);assertSame(COPTIC_UTC.millisOfSecond(), fields[3]);
        __CLR4_4_1urturtlgchos2r.R.inc(40111);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testGetValue_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmp610uy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValue_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmp610uy8(){try{__CLR4_4_1urturtlgchos2r.R.inc(40112);
        __CLR4_4_1urturtlgchos2r.R.inc(40113);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1urturtlgchos2r.R.inc(40114);assertEquals(10, test.getValue(0));
        __CLR4_4_1urturtlgchos2r.R.inc(40115);assertEquals(20, test.getValue(1));
        __CLR4_4_1urturtlgchos2r.R.inc(40116);assertEquals(30, test.getValue(2));
        __CLR4_4_1urturtlgchos2r.R.inc(40117);assertEquals(40, test.getValue(3));
        __CLR4_4_1urturtlgchos2r.R.inc(40118);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40119);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1urturtlgchos2r.R.inc(40120);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40121);test.getValue(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gdueluyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gdueluyi(){try{__CLR4_4_1urturtlgchos2r.R.inc(40122);
        __CLR4_4_1urturtlgchos2r.R.inc(40123);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1urturtlgchos2r.R.inc(40124);int[] values = test.getValues();
        __CLR4_4_1urturtlgchos2r.R.inc(40125);assertEquals(10, values[0]);
        __CLR4_4_1urturtlgchos2r.R.inc(40126);assertEquals(20, values[1]);
        __CLR4_4_1urturtlgchos2r.R.inc(40127);assertEquals(30, values[2]);
        __CLR4_4_1urturtlgchos2r.R.inc(40128);assertEquals(40, values[3]);
        __CLR4_4_1urturtlgchos2r.R.inc(40129);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testIsSupported_DateTimeFieldType() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyuedvuyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyuedvuyq(){try{__CLR4_4_1urturtlgchos2r.R.inc(40130);
        __CLR4_4_1urturtlgchos2r.R.inc(40131);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40132);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40133);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1urturtlgchos2r.R.inc(40134);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1urturtlgchos2r.R.inc(40135);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1urturtlgchos2r.R.inc(40136);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40137);assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40138);assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));

        __CLR4_4_1urturtlgchos2r.R.inc(40139);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40140);assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40141);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1urturtlgchos2r.R.inc(40142);assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay()));

        __CLR4_4_1urturtlgchos2r.R.inc(40143);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1urturtlgchos2r.R.inc(40144);assertEquals(false, test.isSupported((DateTimeFieldType) null));

        __CLR4_4_1urturtlgchos2r.R.inc(40145);DateTimeFieldType d = new DateTimeFieldType("hours") {
            private static final long serialVersionUID = 1L;

            public DurationFieldType getDurationType() {try{__CLR4_4_1urturtlgchos2r.R.inc(40146);
                __CLR4_4_1urturtlgchos2r.R.inc(40147);return DurationFieldType.hours();
            }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1urturtlgchos2r.R.inc(40148);
                __CLR4_4_1urturtlgchos2r.R.inc(40149);return null;
            }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1urturtlgchos2r.R.inc(40150);
                __CLR4_4_1urturtlgchos2r.R.inc(40151);return chronology.hourOfDay();
            }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}
        };
        __CLR4_4_1urturtlgchos2r.R.inc(40152);assertEquals(false, test.isSupported(d));

        __CLR4_4_1urturtlgchos2r.R.inc(40153);d = new DateTimeFieldType("hourOfYear") {
            private static final long serialVersionUID = 1L;

            public DurationFieldType getDurationType() {try{__CLR4_4_1urturtlgchos2r.R.inc(40154);
                __CLR4_4_1urturtlgchos2r.R.inc(40155);return DurationFieldType.hours();
            }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1urturtlgchos2r.R.inc(40156);
                __CLR4_4_1urturtlgchos2r.R.inc(40157);return DurationFieldType.years();
            }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1urturtlgchos2r.R.inc(40158);
                __CLR4_4_1urturtlgchos2r.R.inc(40159);return chronology.hourOfDay();
            }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}
        };
        __CLR4_4_1urturtlgchos2r.R.inc(40160);assertEquals(false, test.isSupported(d));
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testIsSupported_DurationFieldType() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3fm3euzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsSupported_DurationFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3fm3euzl(){try{__CLR4_4_1urturtlgchos2r.R.inc(40161);
        __CLR4_4_1urturtlgchos2r.R.inc(40162);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40163);assertEquals(true, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1urturtlgchos2r.R.inc(40164);assertEquals(true, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1urturtlgchos2r.R.inc(40165);assertEquals(true, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1urturtlgchos2r.R.inc(40166);assertEquals(true, test.isSupported(DurationFieldType.millis()));
        __CLR4_4_1urturtlgchos2r.R.inc(40167);assertEquals(true, test.isSupported(DurationFieldType.halfdays()));

        __CLR4_4_1urturtlgchos2r.R.inc(40168);assertEquals(false, test.isSupported(DurationFieldType.days()));
        __CLR4_4_1urturtlgchos2r.R.inc(40169);assertEquals(false, test.isSupported((DurationFieldType) null));
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testEqualsHashCode() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77uzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77uzu(){try{__CLR4_4_1urturtlgchos2r.R.inc(40170);
        __CLR4_4_1urturtlgchos2r.R.inc(40171);LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1urturtlgchos2r.R.inc(40172);LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1urturtlgchos2r.R.inc(40173);assertEquals(true, test1.equals(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40174);assertEquals(true, test2.equals(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40175);assertEquals(true, test1.equals(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40176);assertEquals(true, test2.equals(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40177);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1urturtlgchos2r.R.inc(40178);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1urturtlgchos2r.R.inc(40179);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1urturtlgchos2r.R.inc(40180);LocalTime test3 = new LocalTime(15, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40181);assertEquals(false, test1.equals(test3));
        __CLR4_4_1urturtlgchos2r.R.inc(40182);assertEquals(false, test2.equals(test3));
        __CLR4_4_1urturtlgchos2r.R.inc(40183);assertEquals(false, test3.equals(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40184);assertEquals(false, test3.equals(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40185);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1urturtlgchos2r.R.inc(40186);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1urturtlgchos2r.R.inc(40187);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1urturtlgchos2r.R.inc(40188);assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC)));
        __CLR4_4_1urturtlgchos2r.R.inc(40189);assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode());
        __CLR4_4_1urturtlgchos2r.R.inc(40190);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1urturtlgchos2r.R.inc(40191);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    class MockInstant extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_1urturtlgchos2r.R.inc(40192);
            __CLR4_4_1urturtlgchos2r.R.inc(40193);return COPTIC_UTC;
        }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

        public DateTimeField[] getFields() {try{__CLR4_4_1urturtlgchos2r.R.inc(40194);
            __CLR4_4_1urturtlgchos2r.R.inc(40195);return new DateTimeField[]{
                    COPTIC_UTC.hourOfDay(),
                    COPTIC_UTC.minuteOfHour(),
                    COPTIC_UTC.secondOfMinute(),
                    COPTIC_UTC.millisOfSecond(),
            };
        }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

        public int[] getValues() {try{__CLR4_4_1urturtlgchos2r.R.inc(40196);
            __CLR4_4_1urturtlgchos2r.R.inc(40197);return new int[]{10, 20, 30, 40};
        }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvv0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvv0m(){try{__CLR4_4_1urturtlgchos2r.R.inc(40198);
        __CLR4_4_1urturtlgchos2r.R.inc(40199);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40200);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40201);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1urturtlgchos2r.R.inc(40202);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40203);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40204);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1urturtlgchos2r.R.inc(40205);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40206);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40207);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1urturtlgchos2r.R.inc(40208);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1urturtlgchos2r.R.inc(40209);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1urturtlgchos2r.R.inc(40210);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40211);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1urturtlgchos2r.R.inc(40212);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_1urturtlgchos2r.R.inc(40213);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_1urturtlgchos2r.R.inc(40214);Partial p = new Partial(types, values);
        __CLR4_4_1urturtlgchos2r.R.inc(40215);assertEquals(0, test1.compareTo(p));
        __CLR4_4_1urturtlgchos2r.R.inc(40216);assertEquals(0, test1.compareTo(new TimeOfDay(10, 20, 30, 40)));
        __CLR4_4_1urturtlgchos2r.R.inc(40217);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40218);test1.compareTo(null);
            __CLR4_4_1urturtlgchos2r.R.inc(40219);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_LocalTime() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3fpugv18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsEqual_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3fpugv18(){try{__CLR4_4_1urturtlgchos2r.R.inc(40220);
        __CLR4_4_1urturtlgchos2r.R.inc(40221);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40222);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40223);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1urturtlgchos2r.R.inc(40224);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40225);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40226);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1urturtlgchos2r.R.inc(40227);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40228);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40229);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1urturtlgchos2r.R.inc(40230);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1urturtlgchos2r.R.inc(40231);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1urturtlgchos2r.R.inc(40232);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40233);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1urturtlgchos2r.R.inc(40234);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40235);new LocalTime(10, 20, 35, 40).isEqual(null);
            __CLR4_4_1urturtlgchos2r.R.inc(40236);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_LocalTime() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1emnc1xv1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsBefore_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1emnc1xv1p(){try{__CLR4_4_1urturtlgchos2r.R.inc(40237);
        __CLR4_4_1urturtlgchos2r.R.inc(40238);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40239);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40240);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1urturtlgchos2r.R.inc(40241);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40242);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40243);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1urturtlgchos2r.R.inc(40244);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40245);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40246);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1urturtlgchos2r.R.inc(40247);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1urturtlgchos2r.R.inc(40248);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1urturtlgchos2r.R.inc(40249);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40250);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1urturtlgchos2r.R.inc(40251);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40252);new LocalTime(10, 20, 35, 40).isBefore(null);
            __CLR4_4_1urturtlgchos2r.R.inc(40253);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_LocalTime() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywb8e8v26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testIsAfter_LocalTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywb8e8v26(){try{__CLR4_4_1urturtlgchos2r.R.inc(40254);
        __CLR4_4_1urturtlgchos2r.R.inc(40255);LocalTime test1 = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40256);LocalTime test1a = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40257);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1urturtlgchos2r.R.inc(40258);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40259);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40260);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1urturtlgchos2r.R.inc(40261);LocalTime test2 = new LocalTime(10, 20, 35, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40262);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1urturtlgchos2r.R.inc(40263);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1urturtlgchos2r.R.inc(40264);LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC());
        __CLR4_4_1urturtlgchos2r.R.inc(40265);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1urturtlgchos2r.R.inc(40266);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1urturtlgchos2r.R.inc(40267);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1urturtlgchos2r.R.inc(40268);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40269);new LocalTime(10, 20, 35, 40).isAfter(null);
            __CLR4_4_1urturtlgchos2r.R.inc(40270);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField_DateTimeFieldType_int_1() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apbcyjv2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apbcyjv2n(){try{__CLR4_4_1urturtlgchos2r.R.inc(40271);
        __CLR4_4_1urturtlgchos2r.R.inc(40272);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40273);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15);

        __CLR4_4_1urturtlgchos2r.R.inc(40274);assertEquals(new LocalTime(10, 20, 30, 40), test);
        __CLR4_4_1urturtlgchos2r.R.inc(40275);assertEquals(new LocalTime(15, 20, 30, 40), result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_2() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gbe62v2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gbe62v2s(){try{__CLR4_4_1urturtlgchos2r.R.inc(40276);
        __CLR4_4_1urturtlgchos2r.R.inc(40277);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40278);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40279);test.withField(null, 6);
            __CLR4_4_1urturtlgchos2r.R.inc(40280);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_3() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_147bfdlv2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_147bfdlv2x(){try{__CLR4_4_1urturtlgchos2r.R.inc(40281);
        __CLR4_4_1urturtlgchos2r.R.inc(40282);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40283);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40284);test.withField(DateTimeFieldType.dayOfMonth(), 6);
            __CLR4_4_1urturtlgchos2r.R.inc(40285);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithField_DateTimeFieldType_int_4() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybgl4v32();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithField_DateTimeFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybgl4v32(){try{__CLR4_4_1urturtlgchos2r.R.inc(40286);
        __CLR4_4_1urturtlgchos2r.R.inc(40287);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40288);LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_1urturtlgchos2r.R.inc(40289);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded_DurationFieldType_int_1() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp4lfcv36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp4lfcv36(){try{__CLR4_4_1urturtlgchos2r.R.inc(40290);
        __CLR4_4_1urturtlgchos2r.R.inc(40291);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40292);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6);

        __CLR4_4_1urturtlgchos2r.R.inc(40293);assertEquals(new LocalTime(10, 20, 30, 40), test);
        __CLR4_4_1urturtlgchos2r.R.inc(40294);assertEquals(new LocalTime(16, 20, 30, 40), result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_2() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19g4mmvv3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19g4mmvv3b(){try{__CLR4_4_1urturtlgchos2r.R.inc(40295);
        __CLR4_4_1urturtlgchos2r.R.inc(40296);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40297);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40298);test.withFieldAdded(null, 0);
            __CLR4_4_1urturtlgchos2r.R.inc(40299);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_3() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1674nuev3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1674nuev3g(){try{__CLR4_4_1urturtlgchos2r.R.inc(40300);
        __CLR4_4_1urturtlgchos2r.R.inc(40301);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40302);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40303);test.withFieldAdded(null, 6);
            __CLR4_4_1urturtlgchos2r.R.inc(40304);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_4() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12y4p1xv3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12y4p1xv3l(){try{__CLR4_4_1urturtlgchos2r.R.inc(40305);
        __CLR4_4_1urturtlgchos2r.R.inc(40306);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40307);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0);
        __CLR4_4_1urturtlgchos2r.R.inc(40308);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_5() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av9qkv3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av9qkv3p(){try{__CLR4_4_1urturtlgchos2r.R.inc(40309);
        __CLR4_4_1urturtlgchos2r.R.inc(40310);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40311);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40312);test.withFieldAdded(DurationFieldType.days(), 6);
            __CLR4_4_1urturtlgchos2r.R.inc(40313);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_6() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jv8j1v3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jv8j1v3u(){try{__CLR4_4_1urturtlgchos2r.R.inc(40314);
        __CLR4_4_1urturtlgchos2r.R.inc(40315);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40316);LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 16);

        __CLR4_4_1urturtlgchos2r.R.inc(40317);assertEquals(new LocalTime(10, 20, 30, 40), test);
        __CLR4_4_1urturtlgchos2r.R.inc(40318);assertEquals(new LocalTime(2, 20, 30, 40), result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_7() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16sv7biv3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16sv7biv3z(){try{__CLR4_4_1urturtlgchos2r.R.inc(40319);
        __CLR4_4_1urturtlgchos2r.R.inc(40320);LocalTime test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1urturtlgchos2r.R.inc(40321);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), 1);
        __CLR4_4_1urturtlgchos2r.R.inc(40322);assertEquals(new LocalTime(0, 0, 0, 0), result);

        __CLR4_4_1urturtlgchos2r.R.inc(40323);test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1urturtlgchos2r.R.inc(40324);result = test.withFieldAdded(DurationFieldType.seconds(), 1);
        __CLR4_4_1urturtlgchos2r.R.inc(40325);assertEquals(new LocalTime(0, 0, 0, 999), result);

        __CLR4_4_1urturtlgchos2r.R.inc(40326);test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1urturtlgchos2r.R.inc(40327);result = test.withFieldAdded(DurationFieldType.minutes(), 1);
        __CLR4_4_1urturtlgchos2r.R.inc(40328);assertEquals(new LocalTime(0, 0, 59, 999), result);

        __CLR4_4_1urturtlgchos2r.R.inc(40329);test = new LocalTime(23, 59, 59, 999);
        __CLR4_4_1urturtlgchos2r.R.inc(40330);result = test.withFieldAdded(DurationFieldType.hours(), 1);
        __CLR4_4_1urturtlgchos2r.R.inc(40331);assertEquals(new LocalTime(0, 59, 59, 999), result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_DurationFieldType_int_8() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1v63zv4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithFieldAdded_DurationFieldType_int_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1v63zv4c(){try{__CLR4_4_1urturtlgchos2r.R.inc(40332);
        __CLR4_4_1urturtlgchos2r.R.inc(40333);LocalTime test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1urturtlgchos2r.R.inc(40334);LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1);
        __CLR4_4_1urturtlgchos2r.R.inc(40335);assertEquals(new LocalTime(23, 59, 59, 999), result);

        __CLR4_4_1urturtlgchos2r.R.inc(40336);test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1urturtlgchos2r.R.inc(40337);result = test.withFieldAdded(DurationFieldType.seconds(), -1);
        __CLR4_4_1urturtlgchos2r.R.inc(40338);assertEquals(new LocalTime(23, 59, 59, 0), result);

        __CLR4_4_1urturtlgchos2r.R.inc(40339);test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1urturtlgchos2r.R.inc(40340);result = test.withFieldAdded(DurationFieldType.minutes(), -1);
        __CLR4_4_1urturtlgchos2r.R.inc(40341);assertEquals(new LocalTime(23, 59, 0, 0), result);

        __CLR4_4_1urturtlgchos2r.R.inc(40342);test = new LocalTime(0, 0, 0, 0);
        __CLR4_4_1urturtlgchos2r.R.inc(40343);result = test.withFieldAdded(DurationFieldType.hours(), -1);
        __CLR4_4_1urturtlgchos2r.R.inc(40344);assertEquals(new LocalTime(23, 0, 0, 0), result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83igv4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83igv4p(){try{__CLR4_4_1urturtlgchos2r.R.inc(40345);
        __CLR4_4_1urturtlgchos2r.R.inc(40346);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40347);LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_1urturtlgchos2r.R.inc(40348);LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40349);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40350);result = test.plus((ReadablePeriod) null);
        __CLR4_4_1urturtlgchos2r.R.inc(40351);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testPlusHours_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s87b5yv4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s87b5yv4w(){try{__CLR4_4_1urturtlgchos2r.R.inc(40352);
        __CLR4_4_1urturtlgchos2r.R.inc(40353);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40354);LocalTime result = test.plusHours(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40355);LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40356);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40357);result = test.plusHours(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40358);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testPlusMinutes_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0mjquv53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0mjquv53(){try{__CLR4_4_1urturtlgchos2r.R.inc(40359);
        __CLR4_4_1urturtlgchos2r.R.inc(40360);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40361);LocalTime result = test.plusMinutes(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40362);LocalTime expected = new LocalTime(1, 3, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40363);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40364);result = test.plusMinutes(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40365);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testPlusSeconds_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xx4lrev5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xx4lrev5a(){try{__CLR4_4_1urturtlgchos2r.R.inc(40366);
        __CLR4_4_1urturtlgchos2r.R.inc(40367);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40368);LocalTime result = test.plusSeconds(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40369);LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40370);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40371);result = test.plusSeconds(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40372);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testPlusMillis_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blt447v5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testPlusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blt447v5h(){try{__CLR4_4_1urturtlgchos2r.R.inc(40373);
        __CLR4_4_1urturtlgchos2r.R.inc(40374);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40375);LocalTime result = test.plusMillis(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40376);LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40377);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40378);result = test.plusMillis(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40379);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdmv5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdmv5o(){try{__CLR4_4_1urturtlgchos2r.R.inc(40380);
        __CLR4_4_1urturtlgchos2r.R.inc(40381);LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40382);LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_1urturtlgchos2r.R.inc(40383);LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40384);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40385);result = test.minus((ReadablePeriod) null);
        __CLR4_4_1urturtlgchos2r.R.inc(40386);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testMinusHours_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svmid4v5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svmid4v5v(){try{__CLR4_4_1urturtlgchos2r.R.inc(40387);
        __CLR4_4_1urturtlgchos2r.R.inc(40388);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40389);LocalTime result = test.minusHours(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40390);LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40391);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40392);result = test.minusHours(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40393);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testMinusMinutes_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zd8a0v62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMinutes_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zd8a0v62(){try{__CLR4_4_1urturtlgchos2r.R.inc(40394);
        __CLR4_4_1urturtlgchos2r.R.inc(40395);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40396);LocalTime result = test.minusMinutes(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40397);LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40398);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40399);result = test.minusMinutes(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40400);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testMinusSeconds_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2q4qwv69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusSeconds_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2q4qwv69(){try{__CLR4_4_1urturtlgchos2r.R.inc(40401);
        __CLR4_4_1urturtlgchos2r.R.inc(40402);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40403);LocalTime result = test.minusSeconds(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40404);LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40405);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40406);result = test.minusSeconds(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40407);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testMinusMillis_int() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrwbadv6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testMinusMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrwbadv6g(){try{__CLR4_4_1urturtlgchos2r.R.inc(40408);
        __CLR4_4_1urturtlgchos2r.R.inc(40409);LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40410);LocalTime result = test.minusMillis(1);
        __CLR4_4_1urturtlgchos2r.R.inc(40411);LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40412);assertEquals(expected, result);

        __CLR4_4_1urturtlgchos2r.R.inc(40413);result = test.minusMillis(0);
        __CLR4_4_1urturtlgchos2r.R.inc(40414);assertSame(test, result);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetters() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv7v6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv7v6n(){try{__CLR4_4_1urturtlgchos2r.R.inc(40415);
        __CLR4_4_1urturtlgchos2r.R.inc(40416);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40417);assertEquals(10, test.getHourOfDay());
        __CLR4_4_1urturtlgchos2r.R.inc(40418);assertEquals(20, test.getMinuteOfHour());
        __CLR4_4_1urturtlgchos2r.R.inc(40419);assertEquals(30, test.getSecondOfMinute());
        __CLR4_4_1urturtlgchos2r.R.inc(40420);assertEquals(40, test.getMillisOfSecond());
        __CLR4_4_1urturtlgchos2r.R.inc(40421);assertEquals(TEST_TIME_NOW, test.getMillisOfDay());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzpv6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzpv6u(){try{__CLR4_4_1urturtlgchos2r.R.inc(40422);
        __CLR4_4_1urturtlgchos2r.R.inc(40423);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40424);check(test.withHourOfDay(6), 6, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40425);check(test.withMinuteOfHour(6), 10, 6, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40426);check(test.withSecondOfMinute(6), 10, 20, 6, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40427);check(test.withMillisOfSecond(6), 10, 20, 30, 6);
        __CLR4_4_1urturtlgchos2r.R.inc(40428);check(test.withMillisOfDay(61234), 0, 1, 1, 234);
        __CLR4_4_1urturtlgchos2r.R.inc(40429);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40430);test.withHourOfDay(-1);
            __CLR4_4_1urturtlgchos2r.R.inc(40431);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1urturtlgchos2r.R.inc(40432);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40433);test.withHourOfDay(24);
            __CLR4_4_1urturtlgchos2r.R.inc(40434);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeTodayDefaultZone() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izxxk5v77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeTodayDefaultZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izxxk5v77(){try{__CLR4_4_1urturtlgchos2r.R.inc(40435);
        __CLR4_4_1urturtlgchos2r.R.inc(40436);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1urturtlgchos2r.R.inc(40437);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1urturtlgchos2r.R.inc(40438);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1urturtlgchos2r.R.inc(40439);DateTime test = base.toDateTimeToday();
        __CLR4_4_1urturtlgchos2r.R.inc(40440);check(base, 10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40441);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40442);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1urturtlgchos2r.R.inc(40443);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1urturtlgchos2r.R.inc(40444);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1urturtlgchos2r.R.inc(40445);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1urturtlgchos2r.R.inc(40446);assertEquals(expected, test);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTimeToday_Zone() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1junxpjv7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1junxpjv7j(){try{__CLR4_4_1urturtlgchos2r.R.inc(40447);
        __CLR4_4_1urturtlgchos2r.R.inc(40448);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1urturtlgchos2r.R.inc(40449);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1urturtlgchos2r.R.inc(40450);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1urturtlgchos2r.R.inc(40451);DateTime test = base.toDateTimeToday(TOKYO);
        __CLR4_4_1urturtlgchos2r.R.inc(40452);check(base, 10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40453);DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO);
        __CLR4_4_1urturtlgchos2r.R.inc(40454);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1urturtlgchos2r.R.inc(40455);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1urturtlgchos2r.R.inc(40456);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1urturtlgchos2r.R.inc(40457);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1urturtlgchos2r.R.inc(40458);assertEquals(expected, test);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testToDateTimeToday_nullZone() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjvd1cv7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTimeToday_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjvd1cv7v(){try{__CLR4_4_1urturtlgchos2r.R.inc(40459);
        __CLR4_4_1urturtlgchos2r.R.inc(40460);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_1urturtlgchos2r.R.inc(40461);DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9);
        __CLR4_4_1urturtlgchos2r.R.inc(40462);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_1urturtlgchos2r.R.inc(40463);DateTime test = base.toDateTimeToday((DateTimeZone) null);
        __CLR4_4_1urturtlgchos2r.R.inc(40464);check(base, 10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40465);DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON);
        __CLR4_4_1urturtlgchos2r.R.inc(40466);expected = expected.hourOfDay().setCopy(10);
        __CLR4_4_1urturtlgchos2r.R.inc(40467);expected = expected.minuteOfHour().setCopy(20);
        __CLR4_4_1urturtlgchos2r.R.inc(40468);expected = expected.secondOfMinute().setCopy(30);
        __CLR4_4_1urturtlgchos2r.R.inc(40469);expected = expected.millisOfSecond().setCopy(40);
        __CLR4_4_1urturtlgchos2r.R.inc(40470);assertEquals(expected, test);
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmdv87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmdv87(){try{__CLR4_4_1urturtlgchos2r.R.inc(40471);
        __CLR4_4_1urturtlgchos2r.R.inc(40472);LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);
        __CLR4_4_1urturtlgchos2r.R.inc(40473);DateTime dt = new DateTime(0L); // LONDON zone
        __CLR4_4_1urturtlgchos2r.R.inc(40474);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());

        __CLR4_4_1urturtlgchos2r.R.inc(40475);DateTime test = base.toDateTime(dt);
        __CLR4_4_1urturtlgchos2r.R.inc(40476);check(base, 10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40477);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        __CLR4_4_1urturtlgchos2r.R.inc(40478);assertEquals("1970-01-01T10:20:30.040+01:00", test.toString());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4v8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4v8f(){try{__CLR4_4_1urturtlgchos2r.R.inc(40479);
        __CLR4_4_1urturtlgchos2r.R.inc(40480);LocalTime base = new LocalTime(1, 2, 3, 4);
        __CLR4_4_1urturtlgchos2r.R.inc(40481);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);

        __CLR4_4_1urturtlgchos2r.R.inc(40482);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_1urturtlgchos2r.R.inc(40483);check(base, 1, 2, 3, 4);
        __CLR4_4_1urturtlgchos2r.R.inc(40484);assertEquals("1970-01-02T01:02:03.004+01:00", test.toString());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiv8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiv8l(){try{__CLR4_4_1urturtlgchos2r.R.inc(40485);
        __CLR4_4_1urturtlgchos2r.R.inc(40486);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40487);assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1urturtlgchos2r.R.inc(40488);assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1urturtlgchos2r.R.inc(40489);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1urturtlgchos2r.R.inc(40490);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1urturtlgchos2r.R.inc(40491);assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay()));

        __CLR4_4_1urturtlgchos2r.R.inc(40492);assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime());
        __CLR4_4_1urturtlgchos2r.R.inc(40493);assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime());
        __CLR4_4_1urturtlgchos2r.R.inc(40494);assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime());
        __CLR4_4_1urturtlgchos2r.R.inc(40495);assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime());
        __CLR4_4_1urturtlgchos2r.R.inc(40496);assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime());
        __CLR4_4_1urturtlgchos2r.R.inc(40497);assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime());
        __CLR4_4_1urturtlgchos2r.R.inc(40498);assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime());

        __CLR4_4_1urturtlgchos2r.R.inc(40499);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40500);test.property(DateTimeFieldType.dayOfWeek());
            __CLR4_4_1urturtlgchos2r.R.inc(40501);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1urturtlgchos2r.R.inc(40502);try {
            __CLR4_4_1urturtlgchos2r.R.inc(40503);test.property(null);
            __CLR4_4_1urturtlgchos2r.R.inc(40504);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9v95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9v95() throws Exception{try{__CLR4_4_1urturtlgchos2r.R.inc(40505);
        __CLR4_4_1urturtlgchos2r.R.inc(40506);LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS);

        __CLR4_4_1urturtlgchos2r.R.inc(40507);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1urturtlgchos2r.R.inc(40508);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1urturtlgchos2r.R.inc(40509);oos.writeObject(test);
        __CLR4_4_1urturtlgchos2r.R.inc(40510);oos.close();
        __CLR4_4_1urturtlgchos2r.R.inc(40511);byte[] bytes = baos.toByteArray();

        __CLR4_4_1urturtlgchos2r.R.inc(40512);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1urturtlgchos2r.R.inc(40513);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1urturtlgchos2r.R.inc(40514);LocalTime result = (LocalTime) ois.readObject();
        __CLR4_4_1urturtlgchos2r.R.inc(40515);ois.close();

        __CLR4_4_1urturtlgchos2r.R.inc(40516);assertEquals(test, result);
        __CLR4_4_1urturtlgchos2r.R.inc(40517);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_1urturtlgchos2r.R.inc(40518);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_1urturtlgchos2r.R.inc(40519);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidv9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidv9k(){try{__CLR4_4_1urturtlgchos2r.R.inc(40520);
        __CLR4_4_1urturtlgchos2r.R.inc(40521);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40522);assertEquals("10:20:30.040", test.toString());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xv9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xv9n(){try{__CLR4_4_1urturtlgchos2r.R.inc(40523);
        __CLR4_4_1urturtlgchos2r.R.inc(40524);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40525);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        __CLR4_4_1urturtlgchos2r.R.inc(40526);assertEquals("10:20:30.040", test.toString((String) null));
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64uv9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64uv9r(){try{__CLR4_4_1urturtlgchos2r.R.inc(40527);
        __CLR4_4_1urturtlgchos2r.R.inc(40528);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40529);assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        __CLR4_4_1urturtlgchos2r.R.inc(40530);assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1urturtlgchos2r.R.inc(40531);assertEquals("10 20", test.toString("H m", null));
        __CLR4_4_1urturtlgchos2r.R.inc(40532);assertEquals("10:20:30.040", test.toString(null, null));
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_1urturtlgchos2r.R.globalSliceStart(getClass().getName(),40533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsv9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1urturtlgchos2r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1urturtlgchos2r.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsv9x(){try{__CLR4_4_1urturtlgchos2r.R.inc(40533);
        __CLR4_4_1urturtlgchos2r.R.inc(40534);LocalTime test = new LocalTime(10, 20, 30, 40);
        __CLR4_4_1urturtlgchos2r.R.inc(40535);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1urturtlgchos2r.R.inc(40536);assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {try{__CLR4_4_1urturtlgchos2r.R.inc(40537);
        __CLR4_4_1urturtlgchos2r.R.inc(40538);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1urturtlgchos2r.R.inc(40539);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1urturtlgchos2r.R.inc(40540);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1urturtlgchos2r.R.inc(40541);assertEquals(milli, test.getMillisOfSecond());
    }finally{__CLR4_4_1urturtlgchos2r.R.flushNeeded();}}
}
