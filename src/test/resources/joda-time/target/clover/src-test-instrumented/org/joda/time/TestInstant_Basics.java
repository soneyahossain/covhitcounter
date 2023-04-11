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
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Basics {static class __CLR4_4_1pfypfylgchoruf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,33446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1pfypfylgchoruf.R.inc(32974);
        __CLR4_4_1pfypfylgchoruf.R.inc(32975);TestInstant_Basics TB = new TestInstant_Basics();
        __CLR4_4_1pfypfylgchoruf.R.inc(32976);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32977);TB.testTest();
        __CLR4_4_1pfypfylgchoruf.R.inc(32978);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32979);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32980);TB.testGet_DateTimeFieldType();
        __CLR4_4_1pfypfylgchoruf.R.inc(32981);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32982);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32983);TB.testGet_DateTimeField();
        __CLR4_4_1pfypfylgchoruf.R.inc(32984);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32985);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32986);TB.testGetMethods();
        __CLR4_4_1pfypfylgchoruf.R.inc(32987);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32988);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32989);TB.testEqualsHashCode();
        __CLR4_4_1pfypfylgchoruf.R.inc(32990);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32991);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32992);TB.testCompareTo();
        __CLR4_4_1pfypfylgchoruf.R.inc(32993);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32994);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32995);TB.testIsEqual_long();
        __CLR4_4_1pfypfylgchoruf.R.inc(32996);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(32997);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(32998);TB.testIsEqualNow();
        __CLR4_4_1pfypfylgchoruf.R.inc(32999);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33000);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33001);TB.testIsEqual_RI();
        __CLR4_4_1pfypfylgchoruf.R.inc(33002);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33003);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33004);TB.testIsBefore_long();
        __CLR4_4_1pfypfylgchoruf.R.inc(33005);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33006);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33007);TB.testIsBeforeNow();
        __CLR4_4_1pfypfylgchoruf.R.inc(33008);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33009);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33010);TB.testIsBefore_RI();
        __CLR4_4_1pfypfylgchoruf.R.inc(33011);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33012);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33013);TB.testIsAfter_long();
        __CLR4_4_1pfypfylgchoruf.R.inc(33014);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33015);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33016);TB.testIsAfterNow();
        __CLR4_4_1pfypfylgchoruf.R.inc(33017);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33018);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33019);TB.testIsAfter_RI();
        __CLR4_4_1pfypfylgchoruf.R.inc(33020);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33021);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33022);TB.testSerialization();
        __CLR4_4_1pfypfylgchoruf.R.inc(33023);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33024);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33025);TB.testToString();
        __CLR4_4_1pfypfylgchoruf.R.inc(33026);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33027);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33028);TB.testToInstant();
        __CLR4_4_1pfypfylgchoruf.R.inc(33029);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33030);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33031);TB.testToDateTime();
        __CLR4_4_1pfypfylgchoruf.R.inc(33032);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33033);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33034);TB.testToDateTimeISO();
        __CLR4_4_1pfypfylgchoruf.R.inc(33035);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33036);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33037);TB.testToDateTime_DateTimeZone();
        __CLR4_4_1pfypfylgchoruf.R.inc(33038);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33039);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33040);TB.testToDateTime_Chronology();
        __CLR4_4_1pfypfylgchoruf.R.inc(33041);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33042);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33043);TB.testToMutableDateTime();
        __CLR4_4_1pfypfylgchoruf.R.inc(33044);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33045);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33046);TB.testToMutableDateTimeISO();
        __CLR4_4_1pfypfylgchoruf.R.inc(33047);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33048);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33049);TB.testToMutableDateTime_DateTimeZone();
        __CLR4_4_1pfypfylgchoruf.R.inc(33050);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33051);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33052);TB.testToMutableDateTime_Chronology();
        __CLR4_4_1pfypfylgchoruf.R.inc(33053);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33054);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33055);TB.testToDate();
        __CLR4_4_1pfypfylgchoruf.R.inc(33056);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33057);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33058);TB.testWithMillis_long();
        __CLR4_4_1pfypfylgchoruf.R.inc(33059);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33060);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33061);TB.testWithDurationAdded_long_int();
        __CLR4_4_1pfypfylgchoruf.R.inc(33062);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33063);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33064);TB.testWithDurationAdded_RD_int();
        __CLR4_4_1pfypfylgchoruf.R.inc(33065);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33066);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33067);TB.testPlus_long();
        __CLR4_4_1pfypfylgchoruf.R.inc(33068);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33069);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33070);TB.testPlus_RD();
        __CLR4_4_1pfypfylgchoruf.R.inc(33071);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33072);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33073);TB.testMinus_long();
        __CLR4_4_1pfypfylgchoruf.R.inc(33074);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33075);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33076);TB.testMinus_RD();
        __CLR4_4_1pfypfylgchoruf.R.inc(33077);TB.tearDown();
        __CLR4_4_1pfypfylgchoruf.R.inc(33078);TB.setUp();
        __CLR4_4_1pfypfylgchoruf.R.inc(33079);TB.testImmutable();
        __CLR4_4_1pfypfylgchoruf.R.inc(33080);TB.tearDown();

    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestInstant_Basics.class);
    }

    public TestInstant_Basics(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1pfypfylgchoruf.R.inc(33081);
        __CLR4_4_1pfypfylgchoruf.R.inc(33082);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1pfypfylgchoruf.R.inc(33083);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1pfypfylgchoruf.R.inc(33084);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1pfypfylgchoruf.R.inc(33085);originalLocale = Locale.getDefault();
        __CLR4_4_1pfypfylgchoruf.R.inc(33086);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1pfypfylgchoruf.R.inc(33087);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1pfypfylgchoruf.R.inc(33088);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1pfypfylgchoruf.R.inc(33089);
        __CLR4_4_1pfypfylgchoruf.R.inc(33090);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1pfypfylgchoruf.R.inc(33091);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1pfypfylgchoruf.R.inc(33092);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1pfypfylgchoruf.R.inc(33093);Locale.setDefault(originalLocale);
        __CLR4_4_1pfypfylgchoruf.R.inc(33094);originalDateTimeZone = null;
        __CLR4_4_1pfypfylgchoruf.R.inc(33095);originalTimeZone = null;
        __CLR4_4_1pfypfylgchoruf.R.inc(33096);originalLocale = null;
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjpjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjpjd(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33097);
        __CLR4_4_1pfypfylgchoruf.R.inc(33098);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1pfypfylgchoruf.R.inc(33099);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1pfypfylgchoruf.R.inc(33100);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vpjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vpjh(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33101);
        __CLR4_4_1pfypfylgchoruf.R.inc(33102);Instant test = new Instant();  // 2002-06-09
        __CLR4_4_1pfypfylgchoruf.R.inc(33103);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33104);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33105);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33106);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33107);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33108);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33109);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33110);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33111);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33112);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33113);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33114);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33115);assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday()));  // UTC zone
        __CLR4_4_1pfypfylgchoruf.R.inc(33116);assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay()));  // UTC zone
        __CLR4_4_1pfypfylgchoruf.R.inc(33117);assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday()));  // UTC zone
        __CLR4_4_1pfypfylgchoruf.R.inc(33118);assertEquals(0, test.get(DateTimeFieldType.hourOfDay()));  // UTC zone
        __CLR4_4_1pfypfylgchoruf.R.inc(33119);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33120);assertEquals(0, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33121);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33122);assertEquals(0, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33123);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33124);assertEquals(0, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33125);try {
            __CLR4_4_1pfypfylgchoruf.R.inc(33126);test.get((DateTimeFieldType) null);
            __CLR4_4_1pfypfylgchoruf.R.inc(33127);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testGet_DateTimeField() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkrpk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkrpk8(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33128);
        __CLR4_4_1pfypfylgchoruf.R.inc(33129);Instant test = new Instant();  // 2002-06-09
        __CLR4_4_1pfypfylgchoruf.R.inc(33130);assertEquals(1, test.get(ISOChronology.getInstance().era()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33131);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33132);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33133);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33134);assertEquals(2002, test.get(ISOChronology.getInstance().year()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33135);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33136);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33137);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33138);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33139);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33140);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33141);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33142);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33143);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33144);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33145);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33146);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33147);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33148);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33149);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33150);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33151);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33152);try {
            __CLR4_4_1pfypfylgchoruf.R.inc(33153);test.get((DateTimeField) null);
            __CLR4_4_1pfypfylgchoruf.R.inc(33154);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testGetMethods() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzpkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzpkz(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33155);
        __CLR4_4_1pfypfylgchoruf.R.inc(33156);Instant test = new Instant();

        __CLR4_4_1pfypfylgchoruf.R.inc(33157);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        __CLR4_4_1pfypfylgchoruf.R.inc(33158);assertEquals(DateTimeZone.UTC, test.getZone());
        __CLR4_4_1pfypfylgchoruf.R.inc(33159);assertEquals(TEST_TIME_NOW, test.getMillis());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77pl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77pl4(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33160);
        __CLR4_4_1pfypfylgchoruf.R.inc(33161);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33162);Instant test2 = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33163);assertEquals(true, test1.equals(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33164);assertEquals(true, test2.equals(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33165);assertEquals(true, test1.equals(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33166);assertEquals(true, test2.equals(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33167);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1pfypfylgchoruf.R.inc(33168);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1pfypfylgchoruf.R.inc(33169);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1pfypfylgchoruf.R.inc(33170);Instant test3 = new Instant(TEST_TIME2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33171);assertEquals(false, test1.equals(test3));
        __CLR4_4_1pfypfylgchoruf.R.inc(33172);assertEquals(false, test2.equals(test3));
        __CLR4_4_1pfypfylgchoruf.R.inc(33173);assertEquals(false, test3.equals(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33174);assertEquals(false, test3.equals(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33175);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1pfypfylgchoruf.R.inc(33176);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1pfypfylgchoruf.R.inc(33177);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1pfypfylgchoruf.R.inc(33178);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33179);assertEquals(false, test1.equals(new DateTime(TEST_TIME1)));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1pfypfylgchoruf.R.inc(33180);
            __CLR4_4_1pfypfylgchoruf.R.inc(33181);return null;
        }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1pfypfylgchoruf.R.inc(33182);
            __CLR4_4_1pfypfylgchoruf.R.inc(33183);return TEST_TIME1;
        }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1pfypfylgchoruf.R.inc(33184);
            __CLR4_4_1pfypfylgchoruf.R.inc(33185);return ISOChronology.getInstanceUTC();
        }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}
    }

    @Test
    public void testCompareTo() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvplu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvplu(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33186);
        __CLR4_4_1pfypfylgchoruf.R.inc(33187);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33188);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33189);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1pfypfylgchoruf.R.inc(33190);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33191);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33192);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1pfypfylgchoruf.R.inc(33193);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33194);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33195);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1pfypfylgchoruf.R.inc(33196);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1pfypfylgchoruf.R.inc(33197);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1pfypfylgchoruf.R.inc(33198);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33199);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1pfypfylgchoruf.R.inc(33200);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33201);assertEquals(0, test1.compareTo(new MockInstant()));

        __CLR4_4_1pfypfylgchoruf.R.inc(33202);try {
            __CLR4_4_1pfypfylgchoruf.R.inc(33203);test1.compareTo(null);
            __CLR4_4_1pfypfylgchoruf.R.inc(33204);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_long() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2rxu2pmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2rxu2pmd(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33205);
        __CLR4_4_1pfypfylgchoruf.R.inc(33206);assertEquals(false, new Instant(TEST_TIME1).isEqual(TEST_TIME2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33207);assertEquals(true, new Instant(TEST_TIME1).isEqual(TEST_TIME1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33208);assertEquals(false, new Instant(TEST_TIME2).isEqual(TEST_TIME1));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testIsEqualNow() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17sfjzvpmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqualNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17sfjzvpmh(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33209);
        __CLR4_4_1pfypfylgchoruf.R.inc(33210);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow());
        __CLR4_4_1pfypfylgchoruf.R.inc(33211);assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow());
        __CLR4_4_1pfypfylgchoruf.R.inc(33212);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testIsEqual_RI() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1wuudpml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsEqual_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1wuudpml(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33213);
        __CLR4_4_1pfypfylgchoruf.R.inc(33214);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33215);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33216);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1pfypfylgchoruf.R.inc(33217);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33218);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33219);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1pfypfylgchoruf.R.inc(33220);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33221);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33222);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1pfypfylgchoruf.R.inc(33223);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1pfypfylgchoruf.R.inc(33224);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1pfypfylgchoruf.R.inc(33225);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33226);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1pfypfylgchoruf.R.inc(33227);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33228);assertEquals(true, test1.isEqual(new MockInstant()));

        __CLR4_4_1pfypfylgchoruf.R.inc(33229);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null));
        __CLR4_4_1pfypfylgchoruf.R.inc(33230);assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null));
        __CLR4_4_1pfypfylgchoruf.R.inc(33231);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_long() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ie6mpzpn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBefore_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ie6mpzpn4(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33232);
        __CLR4_4_1pfypfylgchoruf.R.inc(33233);assertEquals(true, new Instant(TEST_TIME1).isBefore(TEST_TIME2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33234);assertEquals(false, new Instant(TEST_TIME1).isBefore(TEST_TIME1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33235);assertEquals(false, new Instant(TEST_TIME2).isBefore(TEST_TIME1));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testIsBeforeNow() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nh1we6pn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBeforeNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nh1we6pn8(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33236);
        __CLR4_4_1pfypfylgchoruf.R.inc(33237);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow());
        __CLR4_4_1pfypfylgchoruf.R.inc(33238);assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow());
        __CLR4_4_1pfypfylgchoruf.R.inc(33239);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testIsBefore_RI() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mphjypnc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsBefore_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mphjypnc(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33240);
        __CLR4_4_1pfypfylgchoruf.R.inc(33241);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33242);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33243);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1pfypfylgchoruf.R.inc(33244);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33245);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33246);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1pfypfylgchoruf.R.inc(33247);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33248);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33249);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1pfypfylgchoruf.R.inc(33250);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1pfypfylgchoruf.R.inc(33251);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1pfypfylgchoruf.R.inc(33252);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33253);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1pfypfylgchoruf.R.inc(33254);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33255);assertEquals(false, test1.isBefore(new MockInstant()));

        __CLR4_4_1pfypfylgchoruf.R.inc(33256);assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBefore(null));
        __CLR4_4_1pfypfylgchoruf.R.inc(33257);assertEquals(false, new Instant(TEST_TIME_NOW).isBefore(null));
        __CLR4_4_1pfypfylgchoruf.R.inc(33258);assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBefore(null));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_long() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ehltpapnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsAfter_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ehltpapnv(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33259);
        __CLR4_4_1pfypfylgchoruf.R.inc(33260);assertEquals(false, new Instant(TEST_TIME1).isAfter(TEST_TIME2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33261);assertEquals(false, new Instant(TEST_TIME1).isAfter(TEST_TIME1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33262);assertEquals(true, new Instant(TEST_TIME2).isAfter(TEST_TIME1));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testIsAfterNow() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bglzxpnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsAfterNow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bglzxpnz(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33263);
        __CLR4_4_1pfypfylgchoruf.R.inc(33264);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isAfterNow());
        __CLR4_4_1pfypfylgchoruf.R.inc(33265);assertEquals(false, new Instant(TEST_TIME_NOW).isAfterNow());
        __CLR4_4_1pfypfylgchoruf.R.inc(33266);assertEquals(true, new Instant(TEST_TIME_NOW + 1).isAfterNow());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testIsAfter_RI() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5t0u5po3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testIsAfter_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5t0u5po3(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33267);
        __CLR4_4_1pfypfylgchoruf.R.inc(33268);Instant test1 = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33269);Instant test1a = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33270);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1pfypfylgchoruf.R.inc(33271);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33272);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33273);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1pfypfylgchoruf.R.inc(33274);Instant test2 = new Instant(TEST_TIME2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33275);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1pfypfylgchoruf.R.inc(33276);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1pfypfylgchoruf.R.inc(33277);DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1pfypfylgchoruf.R.inc(33278);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1pfypfylgchoruf.R.inc(33279);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1pfypfylgchoruf.R.inc(33280);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1pfypfylgchoruf.R.inc(33281);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1pfypfylgchoruf.R.inc(33282);assertEquals(false, test1.isAfter(new MockInstant()));

        __CLR4_4_1pfypfylgchoruf.R.inc(33283);assertEquals(true, new Instant(TEST_TIME_NOW + 1).isAfter(null));
        __CLR4_4_1pfypfylgchoruf.R.inc(33284);assertEquals(false, new Instant(TEST_TIME_NOW).isAfter(null));
        __CLR4_4_1pfypfylgchoruf.R.inc(33285);assertEquals(false, new Instant(TEST_TIME_NOW - 1).isAfter(null));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9pom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9pom() throws Exception{try{__CLR4_4_1pfypfylgchoruf.R.inc(33286);
        __CLR4_4_1pfypfylgchoruf.R.inc(33287);Instant test = new Instant(TEST_TIME_NOW);

        __CLR4_4_1pfypfylgchoruf.R.inc(33288);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1pfypfylgchoruf.R.inc(33289);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1pfypfylgchoruf.R.inc(33290);oos.writeObject(test);
        __CLR4_4_1pfypfylgchoruf.R.inc(33291);oos.close();
        __CLR4_4_1pfypfylgchoruf.R.inc(33292);byte[] bytes = baos.toByteArray();

        __CLR4_4_1pfypfylgchoruf.R.inc(33293);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1pfypfylgchoruf.R.inc(33294);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1pfypfylgchoruf.R.inc(33295);Instant result = (Instant) ois.readObject();
        __CLR4_4_1pfypfylgchoruf.R.inc(33296);ois.close();

        __CLR4_4_1pfypfylgchoruf.R.inc(33297);assertEquals(test, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidpoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidpoy(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33298);
        __CLR4_4_1pfypfylgchoruf.R.inc(33299);Instant test = new Instant(TEST_TIME_NOW);
        __CLR4_4_1pfypfylgchoruf.R.inc(33300);assertEquals("2002-06-09T00:00:00.000Z", test.toString());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInstant() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7pp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7pp1(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33301);
        __CLR4_4_1pfypfylgchoruf.R.inc(33302);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33303);Instant result = test.toInstant();
        __CLR4_4_1pfypfylgchoruf.R.inc(33304);assertSame(test, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToDateTime() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovpp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovpp5(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33305);
        __CLR4_4_1pfypfylgchoruf.R.inc(33306);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33307);DateTime result = test.toDateTime();
        __CLR4_4_1pfypfylgchoruf.R.inc(33308);assertEquals(TEST_TIME1, result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33309);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToDateTimeISO() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgppa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgppa(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33310);
        __CLR4_4_1pfypfylgchoruf.R.inc(33311);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33312);DateTime result = test.toDateTimeISO();
        __CLR4_4_1pfypfylgchoruf.R.inc(33313);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1pfypfylgchoruf.R.inc(33314);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1pfypfylgchoruf.R.inc(33315);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33316);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToDateTime_DateTimeZone() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynetpph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynetpph(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33317);
        __CLR4_4_1pfypfylgchoruf.R.inc(33318);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33319);DateTime result = test.toDateTime(LONDON);
        __CLR4_4_1pfypfylgchoruf.R.inc(33320);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33321);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33322);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33323);result = test.toDateTime(PARIS);
        __CLR4_4_1pfypfylgchoruf.R.inc(33324);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33325);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33326);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33327);result = test.toDateTime((DateTimeZone) null);
        __CLR4_4_1pfypfylgchoruf.R.inc(33328);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33329);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToDateTime_Chronology() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjeppu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjeppu(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33330);
        __CLR4_4_1pfypfylgchoruf.R.inc(33331);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33332);DateTime result = test.toDateTime(ISOChronology.getInstance());
        __CLR4_4_1pfypfylgchoruf.R.inc(33333);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33334);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33335);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33336);result = test.toDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1pfypfylgchoruf.R.inc(33337);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33338);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33339);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33340);result = test.toDateTime((Chronology) null);
        __CLR4_4_1pfypfylgchoruf.R.inc(33341);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3pq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3pq6(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33342);
        __CLR4_4_1pfypfylgchoruf.R.inc(33343);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33344);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1pfypfylgchoruf.R.inc(33345);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33346);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToMutableDateTimeISO() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4pqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4pqb(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33347);
        __CLR4_4_1pfypfylgchoruf.R.inc(33348);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33349);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1pfypfylgchoruf.R.inc(33350);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1pfypfylgchoruf.R.inc(33351);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1pfypfylgchoruf.R.inc(33352);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33353);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321pqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321pqi(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33354);
        __CLR4_4_1pfypfylgchoruf.R.inc(33355);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33356);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1pfypfylgchoruf.R.inc(33357);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33358);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33359);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33360);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1pfypfylgchoruf.R.inc(33361);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33362);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33363);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33364);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1pfypfylgchoruf.R.inc(33365);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33366);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_Chronology() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2pqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2pqv(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33367);
        __CLR4_4_1pfypfylgchoruf.R.inc(33368);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33369);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
        __CLR4_4_1pfypfylgchoruf.R.inc(33370);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33371);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33372);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33373);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1pfypfylgchoruf.R.inc(33374);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33375);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33376);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33377);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1pfypfylgchoruf.R.inc(33378);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33379);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testToDate() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgypr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgypr8(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33380);
        __CLR4_4_1pfypfylgchoruf.R.inc(33381);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33382);Date result = test.toDate();
        __CLR4_4_1pfypfylgchoruf.R.inc(33383);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithMillis_long() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9ypzwprc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithMillis_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9ypzwprc(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33384);
        __CLR4_4_1pfypfylgchoruf.R.inc(33385);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33386);Instant result = test.withMillis(TEST_TIME2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33387);assertEquals(TEST_TIME2, result.getMillis());
        __CLR4_4_1pfypfylgchoruf.R.inc(33388);assertEquals(test.getChronology(), result.getChronology());

        __CLR4_4_1pfypfylgchoruf.R.inc(33389);test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33390);result = test.withMillis(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33391);assertSame(test, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_long_int() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q11w3iprk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_long_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q11w3iprk(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33392);
        __CLR4_4_1pfypfylgchoruf.R.inc(33393);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33394);Instant result = test.withDurationAdded(123456789L, 1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33395);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33396);assertEquals(expected, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33397);result = test.withDurationAdded(123456789L, 0);
        __CLR4_4_1pfypfylgchoruf.R.inc(33398);assertSame(test, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33399);result = test.withDurationAdded(123456789L, 2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33400);expected = new Instant(TEST_TIME1 + (2L * 123456789L));
        __CLR4_4_1pfypfylgchoruf.R.inc(33401);assertEquals(expected, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33402);result = test.withDurationAdded(123456789L, -3);
        __CLR4_4_1pfypfylgchoruf.R.inc(33403);expected = new Instant(TEST_TIME1 - (3L * 123456789L));
        __CLR4_4_1pfypfylgchoruf.R.inc(33404);assertEquals(expected, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithDurationAdded_RD_int() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcnxxoprx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testWithDurationAdded_RD_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcnxxoprx(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33405);
        __CLR4_4_1pfypfylgchoruf.R.inc(33406);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33407);Instant result = test.withDurationAdded(new Duration(123456789L), 1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33408);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33409);assertEquals(expected, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33410);result = test.withDurationAdded(null, 1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33411);assertSame(test, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33412);result = test.withDurationAdded(new Duration(123456789L), 0);
        __CLR4_4_1pfypfylgchoruf.R.inc(33413);assertSame(test, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33414);result = test.withDurationAdded(new Duration(123456789L), 2);
        __CLR4_4_1pfypfylgchoruf.R.inc(33415);expected = new Instant(TEST_TIME1 + (2L * 123456789L));
        __CLR4_4_1pfypfylgchoruf.R.inc(33416);assertEquals(expected, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33417);result = test.withDurationAdded(new Duration(123456789L), -3);
        __CLR4_4_1pfypfylgchoruf.R.inc(33418);expected = new Instant(TEST_TIME1 - (3L * 123456789L));
        __CLR4_4_1pfypfylgchoruf.R.inc(33419);assertEquals(expected, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    @Test
    public void testPlus_long() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dfcompsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dfcompsc(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33420);
        __CLR4_4_1pfypfylgchoruf.R.inc(33421);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33422);Instant result = test.plus(123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33423);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33424);assertEquals(expected, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testPlus_RD() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_121wcz0psh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testPlus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_121wcz0psh(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33425);
        __CLR4_4_1pfypfylgchoruf.R.inc(33426);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33427);Instant result = test.plus(new Duration(123456789L));
        __CLR4_4_1pfypfylgchoruf.R.inc(33428);Instant expected = new Instant(TEST_TIME1 + 123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33429);assertEquals(expected, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33430);result = test.plus((ReadableDuration) null);
        __CLR4_4_1pfypfylgchoruf.R.inc(33431);assertSame(test, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------    
    @Test
    public void testMinus_long() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gse7d0pso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gse7d0pso(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33432);
        __CLR4_4_1pfypfylgchoruf.R.inc(33433);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33434);Instant result = test.minus(123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33435);Instant expected = new Instant(TEST_TIME1 - 123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33436);assertEquals(expected, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    @Test
    public void testMinus_RD() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyrr3upst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testMinus_RD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyrr3upst(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33437);
        __CLR4_4_1pfypfylgchoruf.R.inc(33438);Instant test = new Instant(TEST_TIME1);
        __CLR4_4_1pfypfylgchoruf.R.inc(33439);Instant result = test.minus(new Duration(123456789L));
        __CLR4_4_1pfypfylgchoruf.R.inc(33440);Instant expected = new Instant(TEST_TIME1 - 123456789L);
        __CLR4_4_1pfypfylgchoruf.R.inc(33441);assertEquals(expected, result);

        __CLR4_4_1pfypfylgchoruf.R.inc(33442);result = test.minus((ReadableDuration) null);
        __CLR4_4_1pfypfylgchoruf.R.inc(33443);assertSame(test, result);
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testImmutable() {__CLR4_4_1pfypfylgchoruf.R.globalSliceStart(getClass().getName(),33444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1origfdpt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pfypfylgchoruf.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pfypfylgchoruf.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInstant_Basics.testImmutable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),33444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1origfdpt0(){try{__CLR4_4_1pfypfylgchoruf.R.inc(33444);
        __CLR4_4_1pfypfylgchoruf.R.inc(33445);assertTrue(Modifier.isFinal(Instant.class.getModifiers()));
    }finally{__CLR4_4_1pfypfylgchoruf.R.flushNeeded();}}

}
