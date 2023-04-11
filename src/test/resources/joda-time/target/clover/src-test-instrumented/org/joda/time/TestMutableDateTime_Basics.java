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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Basics {static class __CLR4_4_1y62y62lgchos72{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,44892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_1y62y62lgchos72.R.inc(44282);
        __CLR4_4_1y62y62lgchos72.R.inc(44283);TestMutableDateTime_Basics TB = new TestMutableDateTime_Basics();
        __CLR4_4_1y62y62lgchos72.R.inc(44284);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44285);TB.testTest();
        __CLR4_4_1y62y62lgchos72.R.inc(44286);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44287);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44288);TB.testGet_DateTimeField();
        __CLR4_4_1y62y62lgchos72.R.inc(44289);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44290);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44291);TB.testGet_DateTimeFieldType();
        __CLR4_4_1y62y62lgchos72.R.inc(44292);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44293);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44294);TB.testGetMethods();
        __CLR4_4_1y62y62lgchos72.R.inc(44295);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44296);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44297);TB.testEqualsHashCode();
        __CLR4_4_1y62y62lgchos72.R.inc(44298);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44299);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44300);TB.testCompareTo();
        __CLR4_4_1y62y62lgchos72.R.inc(44301);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44302);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44303);TB.testIsEqual();
        __CLR4_4_1y62y62lgchos72.R.inc(44304);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44305);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44306);TB.testIsBefore();
        __CLR4_4_1y62y62lgchos72.R.inc(44307);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44308);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44309);TB.testIsAfter();
        __CLR4_4_1y62y62lgchos72.R.inc(44310);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44311);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44312);TB.testSerialization();
        __CLR4_4_1y62y62lgchos72.R.inc(44313);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44314);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44315);TB.testToString();
        __CLR4_4_1y62y62lgchos72.R.inc(44316);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44317);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44318);TB.testToString_String();
        __CLR4_4_1y62y62lgchos72.R.inc(44319);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44320);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44321);TB.testToString_String_String();
        __CLR4_4_1y62y62lgchos72.R.inc(44322);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44323);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44324);TB.testToString_DTFormatter();
        __CLR4_4_1y62y62lgchos72.R.inc(44325);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44326);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44327);TB.testToInstant();
        __CLR4_4_1y62y62lgchos72.R.inc(44328);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44329);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44330);TB.testToDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44331);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44332);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44333);TB.testToDateTimeISO();
        __CLR4_4_1y62y62lgchos72.R.inc(44334);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44335);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44336);TB.testToDateTime_DateTimeZone();
        __CLR4_4_1y62y62lgchos72.R.inc(44337);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44338);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44339);TB.testToDateTime_Chronology();
        __CLR4_4_1y62y62lgchos72.R.inc(44340);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44341);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44342);TB.testToMutableDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44343);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44344);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44345);TB.testToMutableDateTimeISO();
        __CLR4_4_1y62y62lgchos72.R.inc(44346);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44347);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44348);TB.testToMutableDateTime_DateTimeZone();
        __CLR4_4_1y62y62lgchos72.R.inc(44349);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44350);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44351);TB.testToMutableDateTime_Chronology();
        __CLR4_4_1y62y62lgchos72.R.inc(44352);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44353);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44354);TB.testToDate();
        __CLR4_4_1y62y62lgchos72.R.inc(44355);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44356);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44357);TB.testToCalendar_Locale();
        __CLR4_4_1y62y62lgchos72.R.inc(44358);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44359);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44360);TB.testToGregorianCalendar();
        __CLR4_4_1y62y62lgchos72.R.inc(44361);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44362);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44363);TB.testClone();
        __CLR4_4_1y62y62lgchos72.R.inc(44364);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44365);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44366);TB.testCopy();
        __CLR4_4_1y62y62lgchos72.R.inc(44367);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44368);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44369);TB.testRounding1();
        __CLR4_4_1y62y62lgchos72.R.inc(44370);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44371);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44372);TB.testRounding2();
        __CLR4_4_1y62y62lgchos72.R.inc(44373);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44374);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44375);TB.testRounding3();
        __CLR4_4_1y62y62lgchos72.R.inc(44376);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44377);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44378);TB.testRounding4();
        __CLR4_4_1y62y62lgchos72.R.inc(44379);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44380);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44381);TB.testRounding5();
        __CLR4_4_1y62y62lgchos72.R.inc(44382);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44383);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44384);TB.testRounding6();
        __CLR4_4_1y62y62lgchos72.R.inc(44385);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44386);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44387);TB.testRounding7();
        __CLR4_4_1y62y62lgchos72.R.inc(44388);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44389);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44390);TB.testRounding8();
        __CLR4_4_1y62y62lgchos72.R.inc(44391);TB.tearDown();
        __CLR4_4_1y62y62lgchos72.R.inc(44392);TB.setUp();
        __CLR4_4_1y62y62lgchos72.R.inc(44393);TB.testProperty();
        __CLR4_4_1y62y62lgchos72.R.inc(44394);TB.tearDown();

    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Basics.class);
    }

    public TestMutableDateTime_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1y62y62lgchos72.R.inc(44395);
        __CLR4_4_1y62y62lgchos72.R.inc(44396);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1y62y62lgchos72.R.inc(44397);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1y62y62lgchos72.R.inc(44398);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1y62y62lgchos72.R.inc(44399);originalLocale = Locale.getDefault();
        __CLR4_4_1y62y62lgchos72.R.inc(44400);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1y62y62lgchos72.R.inc(44401);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1y62y62lgchos72.R.inc(44402);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1y62y62lgchos72.R.inc(44403);
        __CLR4_4_1y62y62lgchos72.R.inc(44404);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1y62y62lgchos72.R.inc(44405);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1y62y62lgchos72.R.inc(44406);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1y62y62lgchos72.R.inc(44407);Locale.setDefault(originalLocale);
        __CLR4_4_1y62y62lgchos72.R.inc(44408);originalDateTimeZone = null;
        __CLR4_4_1y62y62lgchos72.R.inc(44409);originalTimeZone = null;
        __CLR4_4_1y62y62lgchos72.R.inc(44410);originalLocale = null;
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjy9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjy9n(){try{__CLR4_4_1y62y62lgchos72.R.inc(44411);
        __CLR4_4_1y62y62lgchos72.R.inc(44412);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44413);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44414);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet_DateTimeField() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zggkkry9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGet_DateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zggkkry9r(){try{__CLR4_4_1y62y62lgchos72.R.inc(44415);
        __CLR4_4_1y62y62lgchos72.R.inc(44416);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44417);assertEquals(1, test.get(ISOChronology.getInstance().era()));
        __CLR4_4_1y62y62lgchos72.R.inc(44418);assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra()));
        __CLR4_4_1y62y62lgchos72.R.inc(44419);assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury()));
        __CLR4_4_1y62y62lgchos72.R.inc(44420);assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra()));
        __CLR4_4_1y62y62lgchos72.R.inc(44421);assertEquals(2002, test.get(ISOChronology.getInstance().year()));
        __CLR4_4_1y62y62lgchos72.R.inc(44422);assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44423);assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth()));
        __CLR4_4_1y62y62lgchos72.R.inc(44424);assertEquals(2002, test.get(ISOChronology.getInstance().weekyear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44425);assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44426);assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek()));
        __CLR4_4_1y62y62lgchos72.R.inc(44427);assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44428);assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44429);assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday()));
        __CLR4_4_1y62y62lgchos72.R.inc(44430);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44431);assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday()));
        __CLR4_4_1y62y62lgchos72.R.inc(44432);assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44433);assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour()));
        __CLR4_4_1y62y62lgchos72.R.inc(44434);assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44435);assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute()));
        __CLR4_4_1y62y62lgchos72.R.inc(44436);assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44437);assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond()));
        __CLR4_4_1y62y62lgchos72.R.inc(44438);assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44439);try {
            __CLR4_4_1y62y62lgchos72.R.inc(44440);test.get((DateTimeField) null);
            __CLR4_4_1y62y62lgchos72.R.inc(44441);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testGet_DateTimeFieldType() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyir3vyai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGet_DateTimeFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyir3vyai(){try{__CLR4_4_1y62y62lgchos72.R.inc(44442);
        __CLR4_4_1y62y62lgchos72.R.inc(44443);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44444);assertEquals(1, test.get(DateTimeFieldType.era()));
        __CLR4_4_1y62y62lgchos72.R.inc(44445);assertEquals(20, test.get(DateTimeFieldType.centuryOfEra()));
        __CLR4_4_1y62y62lgchos72.R.inc(44446);assertEquals(2, test.get(DateTimeFieldType.yearOfCentury()));
        __CLR4_4_1y62y62lgchos72.R.inc(44447);assertEquals(2002, test.get(DateTimeFieldType.yearOfEra()));
        __CLR4_4_1y62y62lgchos72.R.inc(44448);assertEquals(2002, test.get(DateTimeFieldType.year()));
        __CLR4_4_1y62y62lgchos72.R.inc(44449);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44450);assertEquals(9, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1y62y62lgchos72.R.inc(44451);assertEquals(2002, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44452);assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44453);assertEquals(7, test.get(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1y62y62lgchos72.R.inc(44454);assertEquals(160, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1y62y62lgchos72.R.inc(44455);assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44456);assertEquals(1, test.get(DateTimeFieldType.hourOfHalfday()));
        __CLR4_4_1y62y62lgchos72.R.inc(44457);assertEquals(1, test.get(DateTimeFieldType.clockhourOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44458);assertEquals(1, test.get(DateTimeFieldType.clockhourOfHalfday()));
        __CLR4_4_1y62y62lgchos72.R.inc(44459);assertEquals(1, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44460);assertEquals(0, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_1y62y62lgchos72.R.inc(44461);assertEquals(60, test.get(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44462);assertEquals(0, test.get(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1y62y62lgchos72.R.inc(44463);assertEquals(60 * 60, test.get(DateTimeFieldType.secondOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44464);assertEquals(0, test.get(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1y62y62lgchos72.R.inc(44465);assertEquals(60 * 60 * 1000, test.get(DateTimeFieldType.millisOfDay()));
        __CLR4_4_1y62y62lgchos72.R.inc(44466);try {
            __CLR4_4_1y62y62lgchos72.R.inc(44467);test.get((DateTimeFieldType) null);
            __CLR4_4_1y62y62lgchos72.R.inc(44468);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testGetMethods() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sjdmzyb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testGetMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sjdmzyb9(){try{__CLR4_4_1y62y62lgchos72.R.inc(44469);
        __CLR4_4_1y62y62lgchos72.R.inc(44470);MutableDateTime test = new MutableDateTime();

        __CLR4_4_1y62y62lgchos72.R.inc(44471);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1y62y62lgchos72.R.inc(44472);assertEquals(LONDON, test.getZone());
        __CLR4_4_1y62y62lgchos72.R.inc(44473);assertEquals(TEST_TIME_NOW, test.getMillis());

        __CLR4_4_1y62y62lgchos72.R.inc(44474);assertEquals(1, test.getEra());
        __CLR4_4_1y62y62lgchos72.R.inc(44475);assertEquals(20, test.getCenturyOfEra());
        __CLR4_4_1y62y62lgchos72.R.inc(44476);assertEquals(2, test.getYearOfCentury());
        __CLR4_4_1y62y62lgchos72.R.inc(44477);assertEquals(2002, test.getYearOfEra());
        __CLR4_4_1y62y62lgchos72.R.inc(44478);assertEquals(2002, test.getYear());
        __CLR4_4_1y62y62lgchos72.R.inc(44479);assertEquals(6, test.getMonthOfYear());
        __CLR4_4_1y62y62lgchos72.R.inc(44480);assertEquals(9, test.getDayOfMonth());
        __CLR4_4_1y62y62lgchos72.R.inc(44481);assertEquals(2002, test.getWeekyear());
        __CLR4_4_1y62y62lgchos72.R.inc(44482);assertEquals(23, test.getWeekOfWeekyear());
        __CLR4_4_1y62y62lgchos72.R.inc(44483);assertEquals(7, test.getDayOfWeek());
        __CLR4_4_1y62y62lgchos72.R.inc(44484);assertEquals(160, test.getDayOfYear());
        __CLR4_4_1y62y62lgchos72.R.inc(44485);assertEquals(1, test.getHourOfDay());
        __CLR4_4_1y62y62lgchos72.R.inc(44486);assertEquals(0, test.getMinuteOfHour());
        __CLR4_4_1y62y62lgchos72.R.inc(44487);assertEquals(60, test.getMinuteOfDay());
        __CLR4_4_1y62y62lgchos72.R.inc(44488);assertEquals(0, test.getSecondOfMinute());
        __CLR4_4_1y62y62lgchos72.R.inc(44489);assertEquals(60 * 60, test.getSecondOfDay());
        __CLR4_4_1y62y62lgchos72.R.inc(44490);assertEquals(0, test.getMillisOfSecond());
        __CLR4_4_1y62y62lgchos72.R.inc(44491);assertEquals(60 * 60 * 1000, test.getMillisOfDay());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testEqualsHashCode() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77ybw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77ybw(){try{__CLR4_4_1y62y62lgchos72.R.inc(44492);
        __CLR4_4_1y62y62lgchos72.R.inc(44493);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44494);MutableDateTime test2 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44495);assertEquals(true, test1.equals(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44496);assertEquals(true, test2.equals(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44497);assertEquals(true, test1.equals(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44498);assertEquals(true, test2.equals(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44499);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_1y62y62lgchos72.R.inc(44500);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_1y62y62lgchos72.R.inc(44501);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_1y62y62lgchos72.R.inc(44502);MutableDateTime test3 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44503);assertEquals(false, test1.equals(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44504);assertEquals(false, test2.equals(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44505);assertEquals(false, test3.equals(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44506);assertEquals(false, test3.equals(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44507);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_1y62y62lgchos72.R.inc(44508);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_1y62y62lgchos72.R.inc(44509);DateTime test4 = new DateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44510);assertEquals(true, test4.equals(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44511);assertEquals(true, test3.equals(test4));
        __CLR4_4_1y62y62lgchos72.R.inc(44512);assertEquals(false, test4.equals(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44513);assertEquals(false, test1.equals(test4));
        __CLR4_4_1y62y62lgchos72.R.inc(44514);assertEquals(true, test3.hashCode() == test4.hashCode());
        __CLR4_4_1y62y62lgchos72.R.inc(44515);assertEquals(false, test1.hashCode() == test4.hashCode());

        __CLR4_4_1y62y62lgchos72.R.inc(44516);MutableDateTime test5 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44517);test5.setRounding(ISOChronology.getInstance().millisOfSecond());
        __CLR4_4_1y62y62lgchos72.R.inc(44518);assertEquals(true, test5.equals(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44519);assertEquals(true, test5.equals(test4));
        __CLR4_4_1y62y62lgchos72.R.inc(44520);assertEquals(true, test3.equals(test5));
        __CLR4_4_1y62y62lgchos72.R.inc(44521);assertEquals(true, test4.equals(test5));
        __CLR4_4_1y62y62lgchos72.R.inc(44522);assertEquals(true, test3.hashCode() == test5.hashCode());
        __CLR4_4_1y62y62lgchos72.R.inc(44523);assertEquals(true, test4.hashCode() == test5.hashCode());

        __CLR4_4_1y62y62lgchos72.R.inc(44524);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_1y62y62lgchos72.R.inc(44525);assertEquals(true, test1.equals(new MockInstant()));
        __CLR4_4_1y62y62lgchos72.R.inc(44526);assertEquals(false, test1.equals(new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance())));
        __CLR4_4_1y62y62lgchos72.R.inc(44527);assertEquals(true, new MutableDateTime(TEST_TIME1, new MockEqualsChronology()).equals(new MutableDateTime(TEST_TIME1, new MockEqualsChronology())));
        __CLR4_4_1y62y62lgchos72.R.inc(44528);assertEquals(false, new MutableDateTime(TEST_TIME1, new MockEqualsChronology()).equals(new MutableDateTime(TEST_TIME1, ISOChronology.getInstance())));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    class MockInstant extends AbstractInstant {
        public String toString() {try{__CLR4_4_1y62y62lgchos72.R.inc(44529);
            __CLR4_4_1y62y62lgchos72.R.inc(44530);return null;
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1y62y62lgchos72.R.inc(44531);
            __CLR4_4_1y62y62lgchos72.R.inc(44532);return TEST_TIME1;
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1y62y62lgchos72.R.inc(44533);
            __CLR4_4_1y62y62lgchos72.R.inc(44534);return ISOChronology.getInstance();
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;

        public boolean equals(Object obj) {try{__CLR4_4_1y62y62lgchos72.R.inc(44535);
            __CLR4_4_1y62y62lgchos72.R.inc(44536);return obj instanceof MockEqualsChronology;
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

        public DateTimeZone getZone() {try{__CLR4_4_1y62y62lgchos72.R.inc(44537);
            __CLR4_4_1y62y62lgchos72.R.inc(44538);return null;
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

        public Chronology withUTC() {try{__CLR4_4_1y62y62lgchos72.R.inc(44539);
            __CLR4_4_1y62y62lgchos72.R.inc(44540);return this;
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

        public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1y62y62lgchos72.R.inc(44541);
            __CLR4_4_1y62y62lgchos72.R.inc(44542);return this;
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1y62y62lgchos72.R.inc(44543);
            __CLR4_4_1y62y62lgchos72.R.inc(44544);return "";
        }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}
    }

    @Test
    public void testCompareTo() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvydd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvydd(){try{__CLR4_4_1y62y62lgchos72.R.inc(44545);
        __CLR4_4_1y62y62lgchos72.R.inc(44546);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44547);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44548);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_1y62y62lgchos72.R.inc(44549);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44550);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44551);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_1y62y62lgchos72.R.inc(44552);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44553);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44554);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_1y62y62lgchos72.R.inc(44555);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44556);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44557);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44558);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_1y62y62lgchos72.R.inc(44559);assertEquals(+1, test2.compareTo(new MockInstant()));
        __CLR4_4_1y62y62lgchos72.R.inc(44560);assertEquals(0, test1.compareTo(new MockInstant()));

        __CLR4_4_1y62y62lgchos72.R.inc(44561);try {
            __CLR4_4_1y62y62lgchos72.R.inc(44562);test1.compareTo(null);
            __CLR4_4_1y62y62lgchos72.R.inc(44563);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testIsEqual() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s9e1z3ydw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testIsEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s9e1z3ydw(){try{__CLR4_4_1y62y62lgchos72.R.inc(44564);
        __CLR4_4_1y62y62lgchos72.R.inc(44565);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44566);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44567);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_1y62y62lgchos72.R.inc(44568);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44569);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44570);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_1y62y62lgchos72.R.inc(44571);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44572);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44573);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_1y62y62lgchos72.R.inc(44574);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44575);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44576);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44577);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_1y62y62lgchos72.R.inc(44578);assertEquals(false, test2.isEqual(new MockInstant()));
        __CLR4_4_1y62y62lgchos72.R.inc(44579);assertEquals(true, test1.isEqual(new MockInstant()));

        __CLR4_4_1y62y62lgchos72.R.inc(44580);assertEquals(false, new MutableDateTime(TEST_TIME_NOW + 1).isEqual(null));
        __CLR4_4_1y62y62lgchos72.R.inc(44581);assertEquals(true, new MutableDateTime(TEST_TIME_NOW).isEqual(null));
        __CLR4_4_1y62y62lgchos72.R.inc(44582);assertEquals(false, new MutableDateTime(TEST_TIME_NOW - 1).isEqual(null));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testIsBefore() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rmvj2yef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testIsBefore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rmvj2yef(){try{__CLR4_4_1y62y62lgchos72.R.inc(44583);
        __CLR4_4_1y62y62lgchos72.R.inc(44584);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44585);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44586);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_1y62y62lgchos72.R.inc(44587);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44588);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44589);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_1y62y62lgchos72.R.inc(44590);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44591);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44592);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_1y62y62lgchos72.R.inc(44593);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44594);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44595);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44596);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_1y62y62lgchos72.R.inc(44597);assertEquals(false, test2.isBefore(new MockInstant()));
        __CLR4_4_1y62y62lgchos72.R.inc(44598);assertEquals(false, test1.isBefore(new MockInstant()));

        __CLR4_4_1y62y62lgchos72.R.inc(44599);assertEquals(false, new MutableDateTime(TEST_TIME_NOW + 1).isBefore(null));
        __CLR4_4_1y62y62lgchos72.R.inc(44600);assertEquals(false, new MutableDateTime(TEST_TIME_NOW).isBefore(null));
        __CLR4_4_1y62y62lgchos72.R.inc(44601);assertEquals(true, new MutableDateTime(TEST_TIME_NOW - 1).isBefore(null));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testIsAfter() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1icnyey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testIsAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1icnyey(){try{__CLR4_4_1y62y62lgchos72.R.inc(44602);
        __CLR4_4_1y62y62lgchos72.R.inc(44603);MutableDateTime test1 = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44604);MutableDateTime test1a = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44605);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_1y62y62lgchos72.R.inc(44606);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44607);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44608);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_1y62y62lgchos72.R.inc(44609);MutableDateTime test2 = new MutableDateTime(TEST_TIME2);
        __CLR4_4_1y62y62lgchos72.R.inc(44610);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_1y62y62lgchos72.R.inc(44611);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_1y62y62lgchos72.R.inc(44612);MutableDateTime test3 = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44613);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_1y62y62lgchos72.R.inc(44614);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_1y62y62lgchos72.R.inc(44615);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_1y62y62lgchos72.R.inc(44616);assertEquals(true, test2.isAfter(new MockInstant()));
        __CLR4_4_1y62y62lgchos72.R.inc(44617);assertEquals(false, test1.isAfter(new MockInstant()));

        __CLR4_4_1y62y62lgchos72.R.inc(44618);assertEquals(true, new MutableDateTime(TEST_TIME_NOW + 1).isAfter(null));
        __CLR4_4_1y62y62lgchos72.R.inc(44619);assertEquals(false, new MutableDateTime(TEST_TIME_NOW).isAfter(null));
        __CLR4_4_1y62y62lgchos72.R.inc(44620);assertEquals(false, new MutableDateTime(TEST_TIME_NOW - 1).isAfter(null));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9yfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9yfh() throws Exception{try{__CLR4_4_1y62y62lgchos72.R.inc(44621);
        __CLR4_4_1y62y62lgchos72.R.inc(44622);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);

        __CLR4_4_1y62y62lgchos72.R.inc(44623);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1y62y62lgchos72.R.inc(44624);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1y62y62lgchos72.R.inc(44625);oos.writeObject(test);
        __CLR4_4_1y62y62lgchos72.R.inc(44626);oos.close();
        __CLR4_4_1y62y62lgchos72.R.inc(44627);byte[] bytes = baos.toByteArray();

        __CLR4_4_1y62y62lgchos72.R.inc(44628);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1y62y62lgchos72.R.inc(44629);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1y62y62lgchos72.R.inc(44630);MutableDateTime result = (MutableDateTime) ois.readObject();
        __CLR4_4_1y62y62lgchos72.R.inc(44631);ois.close();

        __CLR4_4_1y62y62lgchos72.R.inc(44632);assertEquals(test, result);
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidyft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidyft(){try{__CLR4_4_1y62y62lgchos72.R.inc(44633);
        __CLR4_4_1y62y62lgchos72.R.inc(44634);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1y62y62lgchos72.R.inc(44635);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString());

        __CLR4_4_1y62y62lgchos72.R.inc(44636);test = new MutableDateTime(TEST_TIME_NOW, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44637);assertEquals("2002-06-09T02:00:00.000+02:00", test.toString());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToString_String() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2xyfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2xyfy(){try{__CLR4_4_1y62y62lgchos72.R.inc(44638);
        __CLR4_4_1y62y62lgchos72.R.inc(44639);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1y62y62lgchos72.R.inc(44640);assertEquals("2002 01", test.toString("yyyy HH"));
        __CLR4_4_1y62y62lgchos72.R.inc(44641);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((String) null));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToString_String_String() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne197yg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_String_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne197yg2(){try{__CLR4_4_1y62y62lgchos72.R.inc(44642);
        __CLR4_4_1y62y62lgchos72.R.inc(44643);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1y62y62lgchos72.R.inc(44644);assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH));
        __CLR4_4_1y62y62lgchos72.R.inc(44645);assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH));
        __CLR4_4_1y62y62lgchos72.R.inc(44646);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH));
        __CLR4_4_1y62y62lgchos72.R.inc(44647);assertEquals("Sun 9/6", test.toString("EEE d/M", null));
        __CLR4_4_1y62y62lgchos72.R.inc(44648);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToString_DTFormatter() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkpsyg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkpsyg9(){try{__CLR4_4_1y62y62lgchos72.R.inc(44649);
        __CLR4_4_1y62y62lgchos72.R.inc(44650);MutableDateTime test = new MutableDateTime(TEST_TIME_NOW);
        __CLR4_4_1y62y62lgchos72.R.inc(44651);assertEquals("2002 01", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_1y62y62lgchos72.R.inc(44652);assertEquals("2002-06-09T01:00:00.000+01:00", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToInstant() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yip9h7ygd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yip9h7ygd(){try{__CLR4_4_1y62y62lgchos72.R.inc(44653);
        __CLR4_4_1y62y62lgchos72.R.inc(44654);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44655);Instant result = test.toInstant();
        __CLR4_4_1y62y62lgchos72.R.inc(44656);assertEquals(TEST_TIME1, result.getMillis());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToDateTime() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmtfovygh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmtfovygh(){try{__CLR4_4_1y62y62lgchos72.R.inc(44657);
        __CLR4_4_1y62y62lgchos72.R.inc(44658);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44659);DateTime result = test.toDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44660);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44661);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToDateTimeISO() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udmnxgygm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udmnxgygm(){try{__CLR4_4_1y62y62lgchos72.R.inc(44662);
        __CLR4_4_1y62y62lgchos72.R.inc(44663);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44664);DateTime result = test.toDateTimeISO();
        __CLR4_4_1y62y62lgchos72.R.inc(44665);assertSame(DateTime.class, result.getClass());
        __CLR4_4_1y62y62lgchos72.R.inc(44666);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1y62y62lgchos72.R.inc(44667);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44668);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToDateTime_DateTimeZone() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hynetygt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hynetygt(){try{__CLR4_4_1y62y62lgchos72.R.inc(44669);
        __CLR4_4_1y62y62lgchos72.R.inc(44670);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44671);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1y62y62lgchos72.R.inc(44672);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44673);assertEquals(test.getChronology(), result.getChronology());
        __CLR4_4_1y62y62lgchos72.R.inc(44674);assertEquals(LONDON, result.getZone());

        __CLR4_4_1y62y62lgchos72.R.inc(44675);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44676);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44677);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44678);assertEquals(PARIS, result.getZone());

        __CLR4_4_1y62y62lgchos72.R.inc(44679);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44680);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44681);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44682);assertEquals(GregorianChronology.getInstance(LONDON), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44683);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44684);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44685);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44686);assertEquals(LONDON, result.getZone());

        __CLR4_4_1y62y62lgchos72.R.inc(44687);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44688);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44689);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44690);assertEquals(LONDON, result.getZone());
        __CLR4_4_1y62y62lgchos72.R.inc(44691);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToDateTime_Chronology() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqjjeyhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqjjeyhg(){try{__CLR4_4_1y62y62lgchos72.R.inc(44692);
        __CLR4_4_1y62y62lgchos72.R.inc(44693);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44694);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
        __CLR4_4_1y62y62lgchos72.R.inc(44695);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44696);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44697);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44698);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44699);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44700);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44701);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44702);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44703);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44704);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44705);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44706);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44707);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44708);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c071a3yhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c071a3yhx(){try{__CLR4_4_1y62y62lgchos72.R.inc(44709);
        __CLR4_4_1y62y62lgchos72.R.inc(44710);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44711);MutableDateTime result = test.toMutableDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44712);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44713);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44714);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToMutableDateTimeISO() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7exd4yi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTimeISO",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7exd4yi3(){try{__CLR4_4_1y62y62lgchos72.R.inc(44715);
        __CLR4_4_1y62y62lgchos72.R.inc(44716);MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44717);MutableDateTime result = test.toMutableDateTimeISO();
        __CLR4_4_1y62y62lgchos72.R.inc(44718);assertSame(MutableDateTime.class, result.getClass());
        __CLR4_4_1y62y62lgchos72.R.inc(44719);assertSame(ISOChronology.class, result.getChronology().getClass());
        __CLR4_4_1y62y62lgchos72.R.inc(44720);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44721);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());
        __CLR4_4_1y62y62lgchos72.R.inc(44722);assertNotSame(test, result);
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_DateTimeZone() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0i321yib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTime_DateTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0i321yib(){try{__CLR4_4_1y62y62lgchos72.R.inc(44723);
        __CLR4_4_1y62y62lgchos72.R.inc(44724);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44725);MutableDateTime result = test.toMutableDateTime(LONDON);
        __CLR4_4_1y62y62lgchos72.R.inc(44726);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44727);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44728);assertEquals(ISOChronology.getInstance(LONDON), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44729);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44730);result = test.toMutableDateTime(PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44731);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44732);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44733);assertEquals(ISOChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44734);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44735);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44736);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44737);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44738);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44739);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44740);result = test.toMutableDateTime((DateTimeZone) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44741);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44742);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44743);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToMutableDateTime_Chronology() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi6xe2yiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToMutableDateTime_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi6xe2yiw(){try{__CLR4_4_1y62y62lgchos72.R.inc(44744);
        __CLR4_4_1y62y62lgchos72.R.inc(44745);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44746);MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance());
        __CLR4_4_1y62y62lgchos72.R.inc(44747);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44748);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44749);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44750);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44751);result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44752);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44753);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44754);assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44755);test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS));
        __CLR4_4_1y62y62lgchos72.R.inc(44756);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44757);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44758);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44759);assertEquals(ISOChronology.getInstance(), result.getChronology());

        __CLR4_4_1y62y62lgchos72.R.inc(44760);test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44761);result = test.toMutableDateTime((Chronology) null);
        __CLR4_4_1y62y62lgchos72.R.inc(44762);assertTrue(test != result);
        __CLR4_4_1y62y62lgchos72.R.inc(44763);assertEquals(test.getMillis(), result.getMillis());
        __CLR4_4_1y62y62lgchos72.R.inc(44764);assertEquals(ISOChronology.getInstance(), result.getChronology());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToDate() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvdkgyyjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvdkgyyjh(){try{__CLR4_4_1y62y62lgchos72.R.inc(44765);
        __CLR4_4_1y62y62lgchos72.R.inc(44766);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44767);Date result = test.toDate();
        __CLR4_4_1y62y62lgchos72.R.inc(44768);assertEquals(test.getMillis(), result.getTime());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToCalendar_Locale() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ez8ojvyjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToCalendar_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ez8ojvyjl(){try{__CLR4_4_1y62y62lgchos72.R.inc(44769);
        __CLR4_4_1y62y62lgchos72.R.inc(44770);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44771);Calendar result = test.toCalendar(null);
        __CLR4_4_1y62y62lgchos72.R.inc(44772);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1y62y62lgchos72.R.inc(44773);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1y62y62lgchos72.R.inc(44774);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44775);result = test.toCalendar(null);
        __CLR4_4_1y62y62lgchos72.R.inc(44776);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1y62y62lgchos72.R.inc(44777);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());

        __CLR4_4_1y62y62lgchos72.R.inc(44778);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44779);result = test.toCalendar(Locale.UK);
        __CLR4_4_1y62y62lgchos72.R.inc(44780);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1y62y62lgchos72.R.inc(44781);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testToGregorianCalendar() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zoxa6yjy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testToGregorianCalendar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zoxa6yjy(){try{__CLR4_4_1y62y62lgchos72.R.inc(44782);
        __CLR4_4_1y62y62lgchos72.R.inc(44783);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44784);GregorianCalendar result = test.toGregorianCalendar();
        __CLR4_4_1y62y62lgchos72.R.inc(44785);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1y62y62lgchos72.R.inc(44786);assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone());

        __CLR4_4_1y62y62lgchos72.R.inc(44787);test = new MutableDateTime(TEST_TIME1, PARIS);
        __CLR4_4_1y62y62lgchos72.R.inc(44788);result = test.toGregorianCalendar();
        __CLR4_4_1y62y62lgchos72.R.inc(44789);assertEquals(test.getMillis(), result.getTime().getTime());
        __CLR4_4_1y62y62lgchos72.R.inc(44790);assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testClone() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejyyk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejyyk7(){try{__CLR4_4_1y62y62lgchos72.R.inc(44791);
        __CLR4_4_1y62y62lgchos72.R.inc(44792);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44793);MutableDateTime result = (MutableDateTime) test.clone();
        __CLR4_4_1y62y62lgchos72.R.inc(44794);assertEquals(true, test.equals(result));
        __CLR4_4_1y62y62lgchos72.R.inc(44795);assertEquals(true, test != result);
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6aykc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44796,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6aykc(){try{__CLR4_4_1y62y62lgchos72.R.inc(44796);
        __CLR4_4_1y62y62lgchos72.R.inc(44797);MutableDateTime test = new MutableDateTime(TEST_TIME1);
        __CLR4_4_1y62y62lgchos72.R.inc(44798);MutableDateTime result = test.copy();
        __CLR4_4_1y62y62lgchos72.R.inc(44799);assertEquals(true, test.equals(result));
        __CLR4_4_1y62y62lgchos72.R.inc(44800);assertEquals(true, test != result);
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding1() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oukln6ykh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oukln6ykh(){try{__CLR4_4_1y62y62lgchos72.R.inc(44801);
        __CLR4_4_1y62y62lgchos72.R.inc(44802);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44803);test.setRounding(ISOChronology.getInstance().hourOfDay());
        __CLR4_4_1y62y62lgchos72.R.inc(44804);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44805);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44806);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding2() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3kkfnykn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3kkfnykn(){try{__CLR4_4_1y62y62lgchos72.R.inc(44807);
        __CLR4_4_1y62y62lgchos72.R.inc(44808);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44809);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING);
        __CLR4_4_1y62y62lgchos72.R.inc(44810);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44811);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44812);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding3() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vckj84ykt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vckj84ykt(){try{__CLR4_4_1y62y62lgchos72.R.inc(44813);
        __CLR4_4_1y62y62lgchos72.R.inc(44814);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44815);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING);
        __CLR4_4_1y62y62lgchos72.R.inc(44816);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44817);assertEquals(MutableDateTime.ROUND_HALF_CEILING, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44818);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44819);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        __CLR4_4_1y62y62lgchos72.R.inc(44820);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_CEILING);
        __CLR4_4_1y62y62lgchos72.R.inc(44821);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding4() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylki0lyl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylki0lyl2(){try{__CLR4_4_1y62y62lgchos72.R.inc(44822);
        __CLR4_4_1y62y62lgchos72.R.inc(44823);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44824);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR);
        __CLR4_4_1y62y62lgchos72.R.inc(44825);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44826);assertEquals(MutableDateTime.ROUND_HALF_FLOOR, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44827);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44828);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        __CLR4_4_1y62y62lgchos72.R.inc(44829);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_FLOOR);
        __CLR4_4_1y62y62lgchos72.R.inc(44830);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding5() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x6jl62ylb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x6jl62ylb(){try{__CLR4_4_1y62y62lgchos72.R.inc(44831);
        __CLR4_4_1y62y62lgchos72.R.inc(44832);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44833);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
        __CLR4_4_1y62y62lgchos72.R.inc(44834);assertEquals("2002-06-09T05:00:00.000+01:00", test.toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44835);assertEquals(MutableDateTime.ROUND_HALF_EVEN, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44836);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44837);test = new MutableDateTime(2002, 6, 9, 5, 30, 0, 0);
        __CLR4_4_1y62y62lgchos72.R.inc(44838);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
        __CLR4_4_1y62y62lgchos72.R.inc(44839);assertEquals("2002-06-09T06:00:00.000+01:00", test.toString());

        __CLR4_4_1y62y62lgchos72.R.inc(44840);test = new MutableDateTime(2002, 6, 9, 4, 30, 0, 0);
        __CLR4_4_1y62y62lgchos72.R.inc(44841);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_HALF_EVEN);
        __CLR4_4_1y62y62lgchos72.R.inc(44842);assertEquals("2002-06-09T04:00:00.000+01:00", test.toString());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding6() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txjmdlyln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txjmdlyln(){try{__CLR4_4_1y62y62lgchos72.R.inc(44843);
        __CLR4_4_1y62y62lgchos72.R.inc(44844);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44845);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE);
        __CLR4_4_1y62y62lgchos72.R.inc(44846);assertEquals("2002-06-09T05:06:07.008+01:00", test.toString());
        __CLR4_4_1y62y62lgchos72.R.inc(44847);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44848);assertEquals(null, test.getRoundingField());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding7() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qojnl4ylt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qojnl4ylt(){try{__CLR4_4_1y62y62lgchos72.R.inc(44849);
        __CLR4_4_1y62y62lgchos72.R.inc(44850);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44851);try {
            __CLR4_4_1y62y62lgchos72.R.inc(44852);test.setRounding(ISOChronology.getInstance().hourOfDay(), -1);
            __CLR4_4_1y62y62lgchos72.R.inc(44853);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    @Test
    public void testRounding8() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfjosnyly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testRounding8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfjosnyly(){try{__CLR4_4_1y62y62lgchos72.R.inc(44854);
        __CLR4_4_1y62y62lgchos72.R.inc(44855);MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8);
        __CLR4_4_1y62y62lgchos72.R.inc(44856);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44857);assertEquals(null, test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44858);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_CEILING);
        __CLR4_4_1y62y62lgchos72.R.inc(44859);assertEquals(MutableDateTime.ROUND_CEILING, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44860);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44861);test.setRounding(ISOChronology.getInstance().hourOfDay(), MutableDateTime.ROUND_NONE);
        __CLR4_4_1y62y62lgchos72.R.inc(44862);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44863);assertEquals(null, test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44864);test.setRounding(null, -1);
        __CLR4_4_1y62y62lgchos72.R.inc(44865);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44866);assertEquals(null, test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44867);test.setRounding(ISOChronology.getInstance().hourOfDay());
        __CLR4_4_1y62y62lgchos72.R.inc(44868);assertEquals(MutableDateTime.ROUND_FLOOR, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44869);assertEquals(ISOChronology.getInstance().hourOfDay(), test.getRoundingField());

        __CLR4_4_1y62y62lgchos72.R.inc(44870);test.setRounding(null);
        __CLR4_4_1y62y62lgchos72.R.inc(44871);assertEquals(MutableDateTime.ROUND_NONE, test.getRoundingMode());
        __CLR4_4_1y62y62lgchos72.R.inc(44872);assertEquals(null, test.getRoundingField());
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_1y62y62lgchos72.R.globalSliceStart(getClass().getName(),44873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoiymh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1y62y62lgchos72.R.rethrow($CLV_t2$);}finally{__CLR4_4_1y62y62lgchos72.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutableDateTime_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),44873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoiymh(){try{__CLR4_4_1y62y62lgchos72.R.inc(44873);
        __CLR4_4_1y62y62lgchos72.R.inc(44874);MutableDateTime test = new MutableDateTime();
        __CLR4_4_1y62y62lgchos72.R.inc(44875);assertEquals(test.year(), test.property(DateTimeFieldType.year()));
        __CLR4_4_1y62y62lgchos72.R.inc(44876);assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek()));
        __CLR4_4_1y62y62lgchos72.R.inc(44877);assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_1y62y62lgchos72.R.inc(44878);assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_1y62y62lgchos72.R.inc(44879);DateTimeFieldType bad = new DateTimeFieldType("bad") {
            private static final long serialVersionUID = 1L;

            public DurationFieldType getDurationType() {try{__CLR4_4_1y62y62lgchos72.R.inc(44880);
                __CLR4_4_1y62y62lgchos72.R.inc(44881);return DurationFieldType.weeks();
            }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

            public DurationFieldType getRangeDurationType() {try{__CLR4_4_1y62y62lgchos72.R.inc(44882);
                __CLR4_4_1y62y62lgchos72.R.inc(44883);return null;
            }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

            public DateTimeField getField(Chronology chronology) {try{__CLR4_4_1y62y62lgchos72.R.inc(44884);
                __CLR4_4_1y62y62lgchos72.R.inc(44885);return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType()));
            }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}
        };
        __CLR4_4_1y62y62lgchos72.R.inc(44886);try {
            __CLR4_4_1y62y62lgchos72.R.inc(44887);test.property(bad);
            __CLR4_4_1y62y62lgchos72.R.inc(44888);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1y62y62lgchos72.R.inc(44889);try {
            __CLR4_4_1y62y62lgchos72.R.inc(44890);test.property(null);
            __CLR4_4_1y62y62lgchos72.R.inc(44891);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1y62y62lgchos72.R.flushNeeded();}}

}
