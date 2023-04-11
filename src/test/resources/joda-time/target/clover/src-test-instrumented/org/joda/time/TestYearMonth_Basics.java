/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics {static class __CLR4_4_119hh19hhlgchosk9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,59481,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    //    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    //    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_119hh19hhlgchosk9.R.inc(58949);
        __CLR4_4_119hh19hhlgchosk9.R.inc(58950);TestYearMonth_Basics TB = new TestYearMonth_Basics();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58951);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58952);TB.testGet();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58953);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58954);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58955);TB.testSize();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58956);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58957);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58958);TB.testGetFieldType();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58959);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58960);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58961);TB.testGetFieldTypes();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58962);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58963);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58964);TB.testGetField();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58965);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58966);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58967);TB.testGetFields();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58968);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58969);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58970);TB.testGetValue();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58971);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58972);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58973);TB.testGetValues();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58974);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58975);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58976);TB.testIsSupported();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58977);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58978);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58979);TB.testEqualsHashCode();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58980);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58981);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58982);TB.testCompareTo();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58983);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58984);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58985);TB.testIsEqual_YM();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58986);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58987);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58988);TB.testIsBefore_YM();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58989);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58990);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58991);TB.testIsAfter_YM();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58992);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58993);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58994);TB.testWithChronologyRetainFields_Chrono();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58995);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58996);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58997);TB.testWithChronologyRetainFields_sameChrono();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58998);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(58999);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59000);TB.testWithChronologyRetainFields_nullChrono();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59001);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59002);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59003);TB.testWithChronologyRetainFields_invalidInNewChrono();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59004);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59005);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59006);TB.testWithField();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59007);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59008);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59009);TB.testWithField_nullField();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59010);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59011);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59012);TB.testWithField_unknownField();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59013);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59014);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59015);TB.testWithField_same();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59016);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59017);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59018);TB.testWithFieldAdded();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59019);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59020);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59021);TB.testWithFieldAdded_nullField_zero();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59022);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59023);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59024);TB.testWithFieldAdded_nullField_nonZero();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59025);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59026);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59027);TB.testWithFieldAdded_zero();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59028);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59029);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59030);TB.testWithFieldAdded_unknownField();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59031);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59032);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59033);TB.testPlus_RP();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59034);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59035);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59036);TB.testPlusYears_int();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59037);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59038);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59039);TB.testPlusMonths_int();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59040);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59041);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59042);TB.testMinus_RP();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59043);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59044);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59045);TB.testMinusYears_int();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59046);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59047);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59048);TB.testMinusMonths_int();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59049);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59050);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59051);TB.testToLocalDate();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59052);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59053);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59054);TB.testToDateTime_RI();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59055);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59056);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59057);TB.testToDateTime_nullRI();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59058);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59059);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59060);TB.testToInterval();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59061);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59062);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59063);TB.testToInterval_Zone();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59064);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59065);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59066);TB.testToInterval_nullZone();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59067);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59068);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59069);TB.testWithers();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59070);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59071);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59072);TB.testProperty();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59073);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59074);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59075);TB.testSerialization();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59076);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59077);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59078);TB.testToString();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59079);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59080);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59081);TB.testToString_String();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59082);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59083);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59084);TB.testToString_String_Locale();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59085);TB.tearDown();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59086);TB.setUp();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59087);TB.testToString_DTFormatter();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59088);TB.tearDown();

    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Basics.class);
    }

    public TestYearMonth_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_119hh19hhlgchosk9.R.inc(59089);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59090);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59091);zone = DateTimeZone.getDefault();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59092);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_119hh19hhlgchosk9.R.inc(59093);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59094);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59095);DateTimeZone.setDefault(zone);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59096);zone = null;
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v19ll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v19ll(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59097);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59098);YearMonth test = new YearMonth();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59099);assertEquals(1970, test.get(DateTimeFieldType.year()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59100);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59101);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59102);test.get(null);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59103);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59104);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59105);test.get(DateTimeFieldType.dayOfMonth());
            __CLR4_4_119hh19hhlgchosk9.R.inc(59106);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx12219lv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx12219lv(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59107);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59108);YearMonth test = new YearMonth();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59109);assertEquals(2, test.size());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv19ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv19ly(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59110);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59111);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59112);assertSame(DateTimeFieldType.year(), test.getFieldType(0));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59113);assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59114);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59115);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59116);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59117);test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvu19m6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvu19m6(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59118);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59119);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59120);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59121);assertEquals(2, fields.length);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59122);assertSame(DateTimeFieldType.year(), fields[0]);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59123);assertSame(DateTimeFieldType.monthOfYear(), fields[1]);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59124);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n19md();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n19md(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59125);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59126);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59127);assertSame(COPTIC_UTC.year(), test.getField(0));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59128);assertSame(COPTIC_UTC.monthOfYear(), test.getField(1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59129);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59130);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59131);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59132);test.getField(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeas19ml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeas19ml(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59133);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59134);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59135);DateTimeField[] fields = test.getFields();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59136);assertEquals(2, fields.length);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59137);assertSame(COPTIC_UTC.year(), fields[0]);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59138);assertSame(COPTIC_UTC.monthOfYear(), fields[1]);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59139);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testGetValue() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmk19ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmk19ms(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59140);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59141);YearMonth test = new YearMonth();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59142);assertEquals(1970, test.getValue(0));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59143);assertEquals(6, test.getValue(1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59144);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59145);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59146);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59147);test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel19n0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel19n0(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59148);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59149);YearMonth test = new YearMonth();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59150);int[] values = test.getValues();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59151);assertEquals(2, values.length);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59152);assertEquals(1970, values[0]);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59153);assertEquals(6, values[1]);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59154);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n19n7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n19n7(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59155);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59156);YearMonth test = new YearMonth(COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59157);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59158);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59159);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59160);assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7719nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7719nd(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59161);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59162);YearMonth test1 = new YearMonth(1970, 6, COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59163);YearMonth test2 = new YearMonth(1970, 6, COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59164);assertEquals(true, test1.equals(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59165);assertEquals(true, test2.equals(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59166);assertEquals(true, test1.equals(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59167);assertEquals(true, test2.equals(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59168);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59169);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59170);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_119hh19hhlgchosk9.R.inc(59171);YearMonth test3 = new YearMonth(1971, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59172);assertEquals(false, test1.equals(test3));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59173);assertEquals(false, test2.equals(test3));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59174);assertEquals(false, test3.equals(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59175);assertEquals(false, test3.equals(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59176);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59177);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_119hh19hhlgchosk9.R.inc(59178);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59179);assertEquals(true, test1.equals(new MockYM()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59180);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    class MockYM extends MockPartial {
        public Chronology getChronology() {try{__CLR4_4_119hh19hhlgchosk9.R.inc(59181);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59182);return COPTIC_UTC;
        }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

        public DateTimeField[] getFields() {try{__CLR4_4_119hh19hhlgchosk9.R.inc(59183);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59184);return new DateTimeField[]{
                    COPTIC_UTC.year(),
                    COPTIC_UTC.monthOfYear(),
            };
        }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

        public int[] getValues() {try{__CLR4_4_119hh19hhlgchosk9.R.inc(59185);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59186);return new int[]{1970, 6};
        }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testCompareTo() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv19o3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59187,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv19o3(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59187);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59188);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59189);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59190);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59191);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59192);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59193);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59194);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59195);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59196);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59197);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59198);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59199);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59200);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59201);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_119hh19hhlgchosk9.R.inc(59202);int[] values = new int[]{2005, 6};
        __CLR4_4_119hh19hhlgchosk9.R.inc(59203);Partial p = new Partial(types, values);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59204);assertEquals(0, test1.compareTo(p));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59205);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59206);test1.compareTo(null);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59207);fail();
        } catch (NullPointerException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59208);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59209);test1.compareTo(new LocalTime());
            __CLR4_4_119hh19hhlgchosk9.R.inc(59210);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59211);Partial partial = new Partial()
                .with(DateTimeFieldType.centuryOfEra(), 1)
                .with(DateTimeFieldType.halfdayOfDay(), 0)
                .with(DateTimeFieldType.dayOfMonth(), 9);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59212);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59213);new YearMonth(1970, 6).compareTo(partial);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59214);fail();
        } catch (ClassCastException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_YM() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzkvvm19ov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsEqual_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzkvvm19ov(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59215);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59216);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59217);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59218);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59219);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59220);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59221);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59222);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59223);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59224);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59225);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59226);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59227);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59228);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59229);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59230);new YearMonth(2005, 7).isEqual(null);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59231);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_YM() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ayjhb19pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsBefore_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ayjhb19pc(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59232);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59233);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59234);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59235);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59236);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59237);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59238);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59239);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59240);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59241);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59242);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59243);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59244);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59245);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59246);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59247);new YearMonth(2005, 7).isBefore(null);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59248);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_YM() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v3h1ve19pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testIsAfter_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v3h1ve19pt(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59249);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59250);YearMonth test1 = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59251);YearMonth test1a = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59252);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59253);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59254);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59255);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59256);YearMonth test2 = new YearMonth(2005, 7);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59257);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59258);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59259);YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59260);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59261);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59262);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_119hh19hhlgchosk9.R.inc(59263);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59264);new YearMonth(2005, 7).isAfter(null);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59265);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerp19qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerp19qa(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59266);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59267);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59268);YearMonth test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59269);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59270);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59271);check(test, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59272);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdb19qh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdb19qh(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59273);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59274);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59275);YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59276);assertSame(base, test);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9a19ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9a19ql(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59277);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59278);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59279);YearMonth test = base.withChronologyRetainFields(null);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59280);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59281);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59282);check(test, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59283);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_invalidInNewChrono() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a802bj19qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithChronologyRetainFields_invalidInNewChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a802bj19qs(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59284);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59285);YearMonth base = new YearMonth(2005, 13, COPTIC_UTC);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59286);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59287);base.withChronologyRetainFields(ISO_UTC);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59288);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrat1z19qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrat1z19qx(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59289);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59290);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59291);YearMonth result = test.withField(DateTimeFieldType.year(), 2006);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59292);assertEquals(new YearMonth(2004, 6), test);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59293);assertEquals(new YearMonth(2006, 6), result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithField_nullField() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjqkwz19r2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_nullField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjqkwz19r2(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59294);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59295);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59296);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59297);test.withField(null, 6);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59298);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithField_unknownField() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6l5bo19r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6l5bo19r7(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59299);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59300);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59301);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59302);test.withField(DateTimeFieldType.hourOfDay(), 6);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59303);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithField_same() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fa39m19rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithField_same",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fa39m19rc(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59304);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59305);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59306);YearMonth result = test.withField(DateTimeFieldType.year(), 2004);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59307);assertEquals(new YearMonth(2004, 6), test);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59308);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15nlb9h19rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15nlb9h19rh(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59309);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59310);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59311);YearMonth result = test.withFieldAdded(DurationFieldType.years(), 6);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59312);assertEquals(new YearMonth(2004, 6), test);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59313);assertEquals(new YearMonth(2010, 6), result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_nullField_zero() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynb18c19rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_nullField_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynb18c19rm(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59314);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59315);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59316);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59317);test.withFieldAdded(null, 0);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59318);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_nullField_nonZero() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cciwz519rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_nullField_nonZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cciwz519rr(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59319);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59320);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59321);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59322);test.withFieldAdded(null, 6);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59323);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_zero() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h793dc19rw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_zero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h793dc19rw(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59324);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59325);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59326);YearMonth result = test.withFieldAdded(DurationFieldType.years(), 0);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59327);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded_unknownField() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vo8btk19s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithFieldAdded_unknownField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vo8btk19s0(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59328);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59329);YearMonth test = new YearMonth(2004, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59330);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59331);test.withFieldAdded(DurationFieldType.hours(), 6);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59332);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ig19s5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ig19s5(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59333);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59334);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59335);YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59336);YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59337);assertEquals(expected, result);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59338);result = test.plus((ReadablePeriod) null);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59339);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testPlusYears_int() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx5kpt19sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx5kpt19sc(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59340);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59341);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59342);YearMonth result = test.plusYears(1);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59343);YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59344);assertEquals(expected, result);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59345);result = test.plusYears(0);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59346);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testPlusMonths_int() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170gxai19sj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testPlusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170gxai19sj(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59347);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59348);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59349);YearMonth result = test.plusMonths(1);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59350);YearMonth expected = new YearMonth(2002, 6, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59351);assertEquals(expected, result);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59352);result = test.plusMonths(0);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59353);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdm19sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdm19sq(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59354);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59355);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59356);YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59357);YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59358);assertEquals(expected, result);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59359);result = test.minus((ReadablePeriod) null);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59360);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testMinusYears_int() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9qdin19sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusYears_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9qdin19sx(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59361);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59362);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59363);YearMonth result = test.minusYears(1);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59364);YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59365);assertEquals(expected, result);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59366);result = test.minusYears(0);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59367);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testMinusMonths_int() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6k4go19t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testMinusMonths_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6k4go19t4(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59368);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59369);YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59370);YearMonth result = test.minusMonths(1);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59371);YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59372);assertEquals(expected, result);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59373);result = test.minusMonths(0);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59374);assertSame(test, result);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToLocalDate() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1orir19tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToLocalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1orir19tb(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59375);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59376);YearMonth base = new YearMonth(2005, 6, COPTIC_UTC);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59377);LocalDate test = base.toLocalDate(9);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59378);assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59379);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59380);base.toLocalDate(0);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59381);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmd19ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmd19ti(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59382);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59383);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59384);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59385);DateTime test = base.toDateTime(dt);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59386);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59387);DateTime expected = dt;
        __CLR4_4_119hh19hhlgchosk9.R.inc(59388);expected = expected.year().setCopy(2005);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59389);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59390);assertEquals(expected, test);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns419tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns419tr(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59391);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59392);YearMonth base = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59393);DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59394);DateTimeUtils.setCurrentMillisFixed(dt.getMillis());

        __CLR4_4_119hh19hhlgchosk9.R.inc(59395);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59396);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59397);DateTime expected = dt;
        __CLR4_4_119hh19hhlgchosk9.R.inc(59398);expected = expected.year().setCopy(2005);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59399);expected = expected.monthOfYear().setCopy(6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59400);assertEquals(expected, test);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj50gp19u1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj50gp19u1(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59401);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59402);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_119hh19hhlgchosk9.R.inc(59403);Interval test = base.toInterval();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59404);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59405);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59406);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59407);Interval expected = new Interval(start, end);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59408);assertEquals(expected, test);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInterval_Zone() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpa0zk19u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpa0zk19u9(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59409);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59410);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_119hh19hhlgchosk9.R.inc(59411);Interval test = base.toInterval(TOKYO);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59412);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59413);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_TOKYO);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59414);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_TOKYO);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59415);Interval expected = new Interval(start, end);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59416);assertEquals(expected, test);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    @Test
    public void testToInterval_nullZone() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19hp1i119uh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToInterval_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19hp1i119uh(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59417);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59418);YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); // PARIS irrelevant
        __CLR4_4_119hh19hhlgchosk9.R.inc(59419);Interval test = base.toInterval(null);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59420);check(base, 2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59421);DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59422);DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59423);Interval expected = new Interval(start, end);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59424);assertEquals(expected, test);
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithers() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn9jzp19up();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testWithers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn9jzp19up(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59425);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59426);YearMonth test = new YearMonth(1970, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59427);check(test.withYear(2000), 2000, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59428);check(test.withMonthOfYear(2), 1970, 2);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59429);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59430);test.withMonthOfYear(0);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59431);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59432);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59433);test.withMonthOfYear(13);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59434);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi19uz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi19uz(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59435);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59436);YearMonth test = new YearMonth(2005, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59437);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59438);assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59439);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59440);test.property(DateTimeFieldType.millisOfDay());
            __CLR4_4_119hh19hhlgchosk9.R.inc(59441);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_119hh19hhlgchosk9.R.inc(59442);try {
            __CLR4_4_119hh19hhlgchosk9.R.inc(59443);test.property(null);
            __CLR4_4_119hh19hhlgchosk9.R.inc(59444);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on919v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on919v9() throws Exception{try{__CLR4_4_119hh19hhlgchosk9.R.inc(59445);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59446);YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS);

        __CLR4_4_119hh19hhlgchosk9.R.inc(59447);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59448);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59449);oos.writeObject(test);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59450);oos.close();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59451);byte[] bytes = baos.toByteArray();

        __CLR4_4_119hh19hhlgchosk9.R.inc(59452);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59453);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59454);YearMonth result = (YearMonth) ois.readObject();
        __CLR4_4_119hh19hhlgchosk9.R.inc(59455);ois.close();

        __CLR4_4_119hh19hhlgchosk9.R.inc(59456);assertEquals(test, result);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59457);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59458);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59459);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid19vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid19vo(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59460);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59461);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59462);assertEquals("2002-06", test.toString());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x19vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x19vr(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59463);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59464);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59465);assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH"));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59466);assertEquals("2002-06", test.toString((String) null));
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u19vv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u19vv(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59467);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59468);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59469);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59470);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59471);assertEquals("2002-06", test.toString(null, Locale.ENGLISH));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59472);assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59473);assertEquals("2002-06", test.toString(null, null));
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_119hh19hhlgchosk9.R.globalSliceStart(getClass().getName(),59474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps19w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_119hh19hhlgchosk9.R.rethrow($CLV_t2$);}finally{__CLR4_4_119hh19hhlgchosk9.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps19w2(){try{__CLR4_4_119hh19hhlgchosk9.R.inc(59474);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59475);YearMonth test = new YearMonth(2002, 6);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59476);assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_119hh19hhlgchosk9.R.inc(59477);assertEquals("2002-06", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_119hh19hhlgchosk9.R.inc(59478);
        __CLR4_4_119hh19hhlgchosk9.R.inc(59479);assertEquals(year, test.getYear());
        __CLR4_4_119hh19hhlgchosk9.R.inc(59480);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_119hh19hhlgchosk9.R.flushNeeded();}}
}
