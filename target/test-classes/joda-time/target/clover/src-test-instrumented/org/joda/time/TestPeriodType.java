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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType {static class __CLR4_4_113mq13mqlgchosdx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,52114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_113mq13mqlgchosdx.R.inc(51362);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51363);TestPeriodType TB = new TestPeriodType();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51364);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51365);TB.testTest();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51366);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51367);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51368);TB.testStandard();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51369);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51370);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51371);TB.testYearMonthDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51372);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51373);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51374);TB.testYearMonthDay();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51375);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51376);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51377);TB.testYearWeekDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51378);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51379);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51380);TB.testYearWeekDay();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51381);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51382);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51383);TB.testYearDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51384);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51385);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51386);TB.testYearDay();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51387);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51388);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51389);TB.testDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51390);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51391);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51392);TB.testTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51393);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51394);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51395);TB.testYears();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51396);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51397);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51398);TB.testMonths();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51399);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51400);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51401);TB.testWeeks();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51402);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51403);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51404);TB.testDays();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51405);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51406);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51407);TB.testHours();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51408);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51409);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51410);TB.testMinutes();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51411);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51412);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51413);TB.testSeconds();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51414);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51415);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51416);TB.testMillis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51417);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51418);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51419);TB.testForFields1();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51420);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51421);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51422);TB.testForFields2();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51423);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51424);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51425);TB.testForFields3();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51426);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51427);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51428);TB.testForFields4();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51429);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51430);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51431);TB.testForFields5();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51432);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51433);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51434);TB.testForFields6();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51435);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51436);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51437);TB.testForFields7();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51438);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51439);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51440);TB.testMaskYears();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51441);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51442);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51443);TB.testMaskMonths();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51444);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51445);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51446);TB.testMaskWeeks();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51447);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51448);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51449);TB.testMaskDays();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51450);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51451);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51452);TB.testMaskHours();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51453);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51454);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51455);TB.testMaskMinutes();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51456);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51457);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51458);TB.testMaskSeconds();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51459);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51460);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51461);TB.testMaskMillis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51462);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51463);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51464);TB.testMaskHoursMinutesSeconds();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51465);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51466);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51467);TB.testMaskTwice1();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51468);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51469);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51470);TB.testMaskTwice2();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51471);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51472);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51473);TB.testEquals();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51474);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51475);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51476);TB.testHashCode();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51477);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51478);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51479);TB.testIsSupported();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51480);TB.tearDown();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51481);TB.setUp();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51482);TB.testIndexOf();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51483);TB.tearDown();

    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriodType.class);
    }

    public TestPeriodType(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_113mq13mqlgchosdx.R.inc(51484);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51485);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51486);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51487);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51488);originalLocale = Locale.getDefault();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51489);DateTimeZone.setDefault(LONDON);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51490);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51491);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_113mq13mqlgchosdx.R.inc(51492);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51493);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51494);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51495);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51496);Locale.setDefault(originalLocale);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51497);originalDateTimeZone = null;
        __CLR4_4_113mq13mqlgchosdx.R.inc(51498);originalTimeZone = null;
        __CLR4_4_113mq13mqlgchosdx.R.inc(51499);originalLocale = null;
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj13qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj13qk(){try{__CLR4_4_113mq13mqlgchosdx.R.inc(51500);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51501);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51502);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51503);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_113mq13mqlgchosdx.R.inc(51504);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51505);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51506);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51507);oos.writeObject(type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51508);oos.close();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51509);byte[] bytes = baos.toByteArray();

        __CLR4_4_113mq13mqlgchosdx.R.inc(51510);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51511);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51512);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51513);ois.close();

        __CLR4_4_113mq13mqlgchosdx.R.inc(51514);assertEquals(type, result);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    private void assertSameAfterSerialization(PeriodType type) throws Exception {try{__CLR4_4_113mq13mqlgchosdx.R.inc(51515);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51516);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51517);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51518);oos.writeObject(type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51519);oos.close();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51520);byte[] bytes = baos.toByteArray();

        __CLR4_4_113mq13mqlgchosdx.R.inc(51521);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51522);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51523);PeriodType result = (PeriodType) ois.readObject();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51524);ois.close();

        __CLR4_4_113mq13mqlgchosdx.R.inc(51525);assertEquals(type, result);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStandard() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pjsc0m13ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pjsc0m13ra() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51526);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51527);PeriodType type = PeriodType.standard();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51528);assertEquals(8, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51529);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51530);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51531);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51532);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51533);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51534);assertEquals(DurationFieldType.minutes(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51535);assertEquals(DurationFieldType.seconds(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51536);assertEquals(DurationFieldType.millis(), type.getFieldType(7));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51537);assertEquals("Standard", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51538);assertEquals("PeriodType[Standard]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51539);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51540);assertEquals(true, type == PeriodType.standard());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51541);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51542);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51543);assertEquals(true, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51544);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51545);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYearMonthDayTime() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193g4ov13ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193g4ov13ru() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51546);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51547);PeriodType type = PeriodType.yearMonthDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51548);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51549);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51550);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51551);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51552);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51553);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51554);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51555);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51556);assertEquals("YearMonthDayTime", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51557);assertEquals("PeriodType[YearMonthDayTime]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51558);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51559);assertEquals(true, type == PeriodType.yearMonthDayTime());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51560);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51561);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51562);assertEquals(true, type.hashCode() == PeriodType.yearMonthDayTime().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51563);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51564);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYearMonthDay() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrq4ge13sd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrq4ge13sd() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51565);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51566);PeriodType type = PeriodType.yearMonthDay();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51567);assertEquals(3, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51568);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51569);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51570);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51571);assertEquals("YearMonthDay", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51572);assertEquals("PeriodType[YearMonthDay]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51573);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51574);assertEquals(true, type == PeriodType.yearMonthDay());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51575);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51576);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51577);assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51578);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51579);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYearWeekDayTime() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fqhz4d13ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fqhz4d13ss() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51580);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51581);PeriodType type = PeriodType.yearWeekDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51582);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51583);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51584);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51585);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51586);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51587);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51588);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51589);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51590);assertEquals("YearWeekDayTime", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51591);assertEquals("PeriodType[YearWeekDayTime]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51592);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51593);assertEquals(true, type == PeriodType.yearWeekDayTime());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51594);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51595);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51596);assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51597);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51598);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYearWeekDay() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mm5kn413tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mm5kn413tb() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51599);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51600);PeriodType type = PeriodType.yearWeekDay();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51601);assertEquals(3, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51602);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51603);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51604);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51605);assertEquals("YearWeekDay", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51606);assertEquals("PeriodType[YearWeekDay]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51607);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51608);assertEquals(true, type == PeriodType.yearWeekDay());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51609);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51610);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51611);assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51612);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51613);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYearDayTime() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5iogv13tq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5iogv13tq() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51614);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51615);PeriodType type = PeriodType.yearDayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51616);assertEquals(6, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51617);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51618);assertEquals(DurationFieldType.days(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51619);assertEquals(DurationFieldType.hours(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51620);assertEquals(DurationFieldType.minutes(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51621);assertEquals(DurationFieldType.seconds(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51622);assertEquals(DurationFieldType.millis(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51623);assertEquals("YearDayTime", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51624);assertEquals("PeriodType[YearDayTime]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51625);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51626);assertEquals(true, type == PeriodType.yearDayTime());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51627);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51628);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51629);assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51630);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51631);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYearDay() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6ku2413u8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYearDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6ku2413u8() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51632);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51633);PeriodType type = PeriodType.yearDay();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51634);assertEquals(2, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51635);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51636);assertEquals(DurationFieldType.days(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51637);assertEquals("YearDay", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51638);assertEquals("PeriodType[YearDay]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51639);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51640);assertEquals(true, type == PeriodType.yearDay());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51641);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51642);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51643);assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51644);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51645);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDayTime() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwg2da13um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDayTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51646,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwg2da13um() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51646);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51647);PeriodType type = PeriodType.dayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51648);assertEquals(5, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51649);assertEquals(DurationFieldType.days(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51650);assertEquals(DurationFieldType.hours(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51651);assertEquals(DurationFieldType.minutes(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51652);assertEquals(DurationFieldType.seconds(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51653);assertEquals(DurationFieldType.millis(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51654);assertEquals("DayTime", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51655);assertEquals("PeriodType[DayTime]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51656);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51657);assertEquals(true, type == PeriodType.dayTime());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51658);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51659);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51660);assertEquals(true, type.hashCode() == PeriodType.dayTime().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51661);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51662);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTime() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1idzswq13v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1idzswq13v3() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51663);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51664);PeriodType type = PeriodType.time();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51665);assertEquals(4, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51666);assertEquals(DurationFieldType.hours(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51667);assertEquals(DurationFieldType.minutes(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51668);assertEquals(DurationFieldType.seconds(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51669);assertEquals(DurationFieldType.millis(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51670);assertEquals("Time", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51671);assertEquals("PeriodType[Time]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51672);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51673);assertEquals(true, type == PeriodType.time());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51674);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51675);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51676);assertEquals(true, type.hashCode() == PeriodType.time().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51677);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51678);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testYears() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nq13v913vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nq13v913vj() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51679);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51680);PeriodType type = PeriodType.years();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51681);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51682);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51683);assertEquals("Years", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51684);assertEquals("PeriodType[Years]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51685);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51686);assertEquals(true, type == PeriodType.years());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51687);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51688);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51689);assertEquals(true, type.hashCode() == PeriodType.years().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51690);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51691);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMonths() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bildmc13vw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bildmc13vw() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51692);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51693);PeriodType type = PeriodType.months();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51694);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51695);assertEquals(DurationFieldType.months(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51696);assertEquals("Months", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51697);assertEquals("PeriodType[Months]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51698);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51699);assertEquals(true, type == PeriodType.months());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51700);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51701);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51702);assertEquals(true, type.hashCode() == PeriodType.months().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51703);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51704);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWeeks() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r409pw13w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r409pw13w9() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51705);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51706);PeriodType type = PeriodType.weeks();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51707);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51708);assertEquals(DurationFieldType.weeks(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51709);assertEquals("Weeks", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51710);assertEquals("PeriodType[Weeks]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51711);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51712);assertEquals(true, type == PeriodType.weeks());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51713);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51714);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51715);assertEquals(true, type.hashCode() == PeriodType.weeks().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51716);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51717);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDays() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzehn413wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzehn413wm() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51718);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51719);PeriodType type = PeriodType.days();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51720);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51721);assertEquals(DurationFieldType.days(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51722);assertEquals("Days", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51723);assertEquals("PeriodType[Days]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51724);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51725);assertEquals(true, type == PeriodType.days());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51726);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51727);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51728);assertEquals(true, type.hashCode() == PeriodType.days().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51729);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51730);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testHours() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyy94s13wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyy94s13wz() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51731);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51732);PeriodType type = PeriodType.hours();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51733);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51734);assertEquals(DurationFieldType.hours(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51735);assertEquals("Hours", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51736);assertEquals("PeriodType[Hours]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51737);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51738);assertEquals(true, type == PeriodType.hours());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51739);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51740);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51741);assertEquals(true, type.hashCode() == PeriodType.hours().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51742);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51743);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinutes() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1oajw13xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1oajw13xc() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51744);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51745);PeriodType type = PeriodType.minutes();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51746);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51747);assertEquals(DurationFieldType.minutes(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51748);assertEquals("Minutes", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51749);assertEquals("PeriodType[Minutes]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51750);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51751);assertEquals(true, type == PeriodType.minutes());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51752);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51753);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51754);assertEquals(true, type.hashCode() == PeriodType.minutes().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51755);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51756);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSeconds() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mni66k13xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mni66k13xp() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51757);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51758);PeriodType type = PeriodType.seconds();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51759);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51760);assertEquals(DurationFieldType.seconds(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51761);assertEquals("Seconds", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51762);assertEquals("PeriodType[Seconds]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51763);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51764);assertEquals(true, type == PeriodType.seconds());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51765);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51766);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51767);assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51768);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51769);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMillis() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol9hs113y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol9hs113y2() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51770);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51771);PeriodType type = PeriodType.millis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51772);assertEquals(1, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51773);assertEquals(DurationFieldType.millis(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51774);assertEquals("Millis", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51775);assertEquals("PeriodType[Millis]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51776);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51777);assertEquals(true, type == PeriodType.millis());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51778);assertEquals(false, type.equals(PeriodType.standard()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51779);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51780);assertEquals(true, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51781);assertEquals(false, type.hashCode() == PeriodType.standard().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51782);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields1() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9q52013yf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9q52013yf() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51783);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51784);PeriodType type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.years(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51785);assertSame(PeriodType.years(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51786);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.months(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51787);assertSame(PeriodType.months(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51788);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.weeks(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51789);assertSame(PeriodType.weeks(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51790);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.days(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51791);assertSame(PeriodType.days(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51792);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.hours(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51793);assertSame(PeriodType.hours(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51794);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.minutes(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51795);assertSame(PeriodType.minutes(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51796);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.seconds(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51797);assertSame(PeriodType.seconds(), type);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51798);type = PeriodType.forFields(new DurationFieldType[]{
                DurationFieldType.millis(),
        });
        __CLR4_4_113mq13mqlgchosdx.R.inc(51799);assertSame(PeriodType.millis(), type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @Test
    public void testForFields2() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0q69j13yw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0q69j13yw() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51800);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51801);DurationFieldType[] types = new DurationFieldType[]{
                DurationFieldType.years(),
                DurationFieldType.hours(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51802);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51803);assertEquals(2, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51804);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51805);assertEquals(DurationFieldType.hours(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51806);assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51807);assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51808);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51809);assertEquals(true, type == PeriodType.forFields(types));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51810);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51811);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51812);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51813);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51814);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @Test
    public void testForFields3() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrq7h213zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrq7h213zb() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51815);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51816);DurationFieldType[] types = new DurationFieldType[]{
                DurationFieldType.months(),
                DurationFieldType.weeks(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51817);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51818);assertEquals(2, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51819);assertEquals(DurationFieldType.months(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51820);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51821);assertEquals("StandardNoYearsNoDaysNoHoursNoMinutesNoSecondsNoMillis", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51822);assertEquals("PeriodType[StandardNoYearsNoDaysNoHoursNoMinutesNoSecondsNoMillis]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51823);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51824);assertEquals(true, type == PeriodType.forFields(types));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51825);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51826);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51827);assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51828);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51829);assertSameAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @Test
    public void testForFields4() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kiq8ol13zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kiq8ol13zq() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51830);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51831);DurationFieldType[] types = new DurationFieldType[]{
                DurationFieldType.weeks(),
                DurationFieldType.days(),  // adding this makes this test unique, so cache is not pre-populated
                DurationFieldType.months(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51832);DurationFieldType[] types2 = new DurationFieldType[]{
                DurationFieldType.months(),
                DurationFieldType.days(),
                DurationFieldType.weeks(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51833);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51834);PeriodType type2 = PeriodType.forFields(types2);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51835);assertEquals(true, type == type2);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @Test
    public void testForFields5() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9q9w413zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9q9w413zw() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51836);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51837);DurationFieldType[] types = new DurationFieldType[]{
                DurationFieldType.centuries(),
                DurationFieldType.months(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51838);try {
            __CLR4_4_113mq13mqlgchosdx.R.inc(51839);PeriodType.forFields(types);
            __CLR4_4_113mq13mqlgchosdx.R.inc(51840);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_113mq13mqlgchosdx.R.inc(51841);try {
            __CLR4_4_113mq13mqlgchosdx.R.inc(51842);PeriodType.forFields(types);  // repeated for test coverage of cache
            __CLR4_4_113mq13mqlgchosdx.R.inc(51843);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @Test
    public void testForFields6() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e0qb3n1404();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e0qb3n1404() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51844);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51845);DurationFieldType[] types = null;
        __CLR4_4_113mq13mqlgchosdx.R.inc(51846);try {
            __CLR4_4_113mq13mqlgchosdx.R.inc(51847);PeriodType.forFields(types);
            __CLR4_4_113mq13mqlgchosdx.R.inc(51848);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_113mq13mqlgchosdx.R.inc(51849);types = new DurationFieldType[0];
        __CLR4_4_113mq13mqlgchosdx.R.inc(51850);try {
            __CLR4_4_113mq13mqlgchosdx.R.inc(51851);PeriodType.forFields(types);
            __CLR4_4_113mq13mqlgchosdx.R.inc(51852);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_113mq13mqlgchosdx.R.inc(51853);types = new DurationFieldType[]{
                null,
                DurationFieldType.months(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51854);try {
            __CLR4_4_113mq13mqlgchosdx.R.inc(51855);PeriodType.forFields(types);
            __CLR4_4_113mq13mqlgchosdx.R.inc(51856);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_113mq13mqlgchosdx.R.inc(51857);types = new DurationFieldType[]{
                DurationFieldType.months(),
                null,
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51858);try {
            __CLR4_4_113mq13mqlgchosdx.R.inc(51859);PeriodType.forFields(types);
            __CLR4_4_113mq13mqlgchosdx.R.inc(51860);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    // ensure hash key distribution
    @Test
    public void testForFields7() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arqcb6140l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testForFields7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arqcb6140l() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51861);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51862);DurationFieldType[] types = new DurationFieldType[]{
                DurationFieldType.weeks(),
                DurationFieldType.months(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51863);DurationFieldType[] types2 = new DurationFieldType[]{
                DurationFieldType.seconds(),
        };
        __CLR4_4_113mq13mqlgchosdx.R.inc(51864);PeriodType type = PeriodType.forFields(types);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51865);PeriodType type2 = PeriodType.forFields(types2);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51866);assertEquals(false, type == type2);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51867);assertEquals(false, type.equals(type2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51868);assertEquals(false, type.hashCode() == type2.hashCode());
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskYears() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19x580x140t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19x580x140t() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51869);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51870);PeriodType type = PeriodType.standard().withYearsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51871);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51872);assertEquals(DurationFieldType.months(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51873);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51874);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51875);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51876);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51877);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51878);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51879);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51880);assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51881);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51882);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51883);assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51884);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51885);assertEquals("StandardNoYears", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51886);assertEquals("PeriodType[StandardNoYears]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51887);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskMonths() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ttaco141c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ttaco141c() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51888);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51889);PeriodType type = PeriodType.standard().withMonthsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51890);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51891);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51892);assertEquals(DurationFieldType.weeks(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51893);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51894);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51895);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51896);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51897);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51898);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51899);assertEquals(true, type.equals(PeriodType.standard().withMonthsRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51900);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51901);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51902);assertEquals(true, type.hashCode() == PeriodType.standard().withMonthsRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51903);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51904);assertEquals("StandardNoMonths", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51905);assertEquals("PeriodType[StandardNoMonths]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51906);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskWeeks() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u47wew141v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u47wew141v() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51907);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51908);PeriodType type = PeriodType.standard().withWeeksRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51909);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51910);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51911);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51912);assertEquals(DurationFieldType.days(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51913);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51914);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51915);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51916);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51917);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51918);assertEquals(true, type.equals(PeriodType.standard().withWeeksRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51919);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51920);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51921);assertEquals(true, type.hashCode() == PeriodType.standard().withWeeksRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51922);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51923);assertEquals("StandardNoWeeks", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51924);assertEquals("PeriodType[StandardNoWeeks]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51925);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskDays() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsg5s4142e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsg5s4142e() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51926);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51927);PeriodType type = PeriodType.standard().withDaysRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51928);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51929);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51930);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51931);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51932);assertEquals(DurationFieldType.hours(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51933);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51934);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51935);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51936);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51937);assertEquals(true, type.equals(PeriodType.standard().withDaysRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51938);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51939);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51940);assertEquals(true, type.hashCode() == PeriodType.standard().withDaysRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51941);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51942);assertEquals("StandardNoDays", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51943);assertEquals("PeriodType[StandardNoDays]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51944);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskHours() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1462dag142x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1462dag142x() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51945);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51946);PeriodType type = PeriodType.standard().withHoursRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51947);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51948);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51949);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51950);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51951);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51952);assertEquals(DurationFieldType.minutes(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51953);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51954);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51955);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51956);assertEquals(true, type.equals(PeriodType.standard().withHoursRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51957);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51958);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51959);assertEquals(true, type.hashCode() == PeriodType.standard().withHoursRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51960);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51961);assertEquals("StandardNoHours", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51962);assertEquals("PeriodType[StandardNoHours]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51963);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskMinutes() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1haiirs143g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1haiirs143g() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51964);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51965);PeriodType type = PeriodType.standard().withMinutesRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51966);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51967);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51968);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51969);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51970);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51971);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51972);assertEquals(DurationFieldType.seconds(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51973);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51974);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51975);assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51976);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51977);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51978);assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51979);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51980);assertEquals("StandardNoMinutes", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51981);assertEquals("PeriodType[StandardNoMinutes]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51982);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskSeconds() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),51983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1toon54143z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1toon54143z() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(51983);
        __CLR4_4_113mq13mqlgchosdx.R.inc(51984);PeriodType type = PeriodType.standard().withSecondsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(51985);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51986);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51987);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51988);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51989);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51990);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51991);assertEquals(DurationFieldType.minutes(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51992);assertEquals(DurationFieldType.millis(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51993);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51994);assertEquals(true, type.equals(PeriodType.standard().withSecondsRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51995);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(51996);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51997);assertEquals(true, type.hashCode() == PeriodType.standard().withSecondsRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51998);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(51999);assertEquals("StandardNoSeconds", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52000);assertEquals("PeriodType[StandardNoSeconds]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52001);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskMillis() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mwheid144i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mwheid144i() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52002);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52003);PeriodType type = PeriodType.standard().withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52004);assertEquals(7, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52005);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52006);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52007);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52008);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52009);assertEquals(DurationFieldType.hours(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52010);assertEquals(DurationFieldType.minutes(), type.getFieldType(5));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52011);assertEquals(DurationFieldType.seconds(), type.getFieldType(6));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52012);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52013);assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52014);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52015);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52016);assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52017);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52018);assertEquals("StandardNoMillis", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52019);assertEquals("PeriodType[StandardNoMillis]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52020);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskHoursMinutesSeconds() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eb094o1451();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskHoursMinutesSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eb094o1451() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52021);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52022);PeriodType type = PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52023);assertEquals(5, type.size());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52024);assertEquals(DurationFieldType.years(), type.getFieldType(0));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52025);assertEquals(DurationFieldType.months(), type.getFieldType(1));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52026);assertEquals(DurationFieldType.weeks(), type.getFieldType(2));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52027);assertEquals(DurationFieldType.days(), type.getFieldType(3));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52028);assertEquals(DurationFieldType.millis(), type.getFieldType(4));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52029);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52030);assertEquals(true, type.equals(PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52031);assertEquals(false, type.equals(PeriodType.millis()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52032);assertEquals(true, type.hashCode() == type.hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52033);assertEquals(true, type.hashCode() == PeriodType.standard().withHoursRemoved().withMinutesRemoved().withSecondsRemoved().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52034);assertEquals(false, type.hashCode() == PeriodType.millis().hashCode());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52035);assertEquals("StandardNoHoursNoMinutesNoSeconds", type.getName());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52036);assertEquals("PeriodType[StandardNoHoursNoMinutesNoSeconds]", type.toString());
        __CLR4_4_113mq13mqlgchosdx.R.inc(52037);assertEqualsAfterSerialization(type);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskTwice1() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3hlm6145i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3hlm6145i() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52038);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52039);PeriodType type = PeriodType.standard().withYearsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52040);PeriodType type2 = type.withYearsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52041);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52042);type = PeriodType.standard().withMonthsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52043);type2 = type.withMonthsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52044);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52045);type = PeriodType.standard().withWeeksRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52046);type2 = type.withWeeksRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52047);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52048);type = PeriodType.standard().withDaysRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52049);type2 = type.withDaysRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52050);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52051);type = PeriodType.standard().withHoursRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52052);type2 = type.withHoursRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52053);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52054);type = PeriodType.standard().withMinutesRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52055);type2 = type.withMinutesRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52056);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52057);type = PeriodType.standard().withSecondsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52058);type2 = type.withSecondsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52059);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52060);type = PeriodType.standard().withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52061);type2 = type.withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52062);assertEquals(true, type == type2);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMaskTwice2() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kchken1467();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testMaskTwice2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kchken1467() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52063);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52064);PeriodType type = PeriodType.dayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52065);PeriodType type2 = type.withYearsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52066);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52067);type = PeriodType.dayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52068);type2 = type.withMonthsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52069);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52070);type = PeriodType.dayTime();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52071);type2 = type.withWeeksRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52072);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52073);type = PeriodType.millis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52074);type2 = type.withDaysRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52075);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52076);type = PeriodType.millis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52077);type2 = type.withHoursRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52078);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52079);type = PeriodType.millis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52080);type2 = type.withMinutesRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52081);assertEquals(true, type == type2);

        __CLR4_4_113mq13mqlgchosdx.R.inc(52082);type = PeriodType.millis();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52083);type2 = type.withSecondsRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52084);assertEquals(true, type == type2);
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e608146t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e608146t() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52085);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52086);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52087);assertEquals(true, type.equals(type));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52088);assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52089);assertEquals(false, type.equals(null));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52090);assertEquals(false, type.equals(""));
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv8146z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv8146z() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52091);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52092);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52093);assertEquals(type.hashCode(), type.hashCode());
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsSupported() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n1472();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n1472() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52094);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52095);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52096);assertEquals(false, type.isSupported(DurationFieldType.years()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52097);assertEquals(false, type.isSupported(DurationFieldType.months()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52098);assertEquals(false, type.isSupported(DurationFieldType.weeks()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52099);assertEquals(true, type.isSupported(DurationFieldType.days()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52100);assertEquals(true, type.isSupported(DurationFieldType.hours()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52101);assertEquals(true, type.isSupported(DurationFieldType.minutes()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52102);assertEquals(true, type.isSupported(DurationFieldType.seconds()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52103);assertEquals(false, type.isSupported(DurationFieldType.millis()));
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf() throws Exception {__CLR4_4_113mq13mqlgchosdx.R.globalSliceStart(getClass().getName(),52104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1656tvi147c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113mq13mqlgchosdx.R.rethrow($CLV_t2$);}finally{__CLR4_4_113mq13mqlgchosdx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPeriodType.testIndexOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),52104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1656tvi147c() throws Exception{try{__CLR4_4_113mq13mqlgchosdx.R.inc(52104);
        __CLR4_4_113mq13mqlgchosdx.R.inc(52105);PeriodType type = PeriodType.dayTime().withMillisRemoved();
        __CLR4_4_113mq13mqlgchosdx.R.inc(52106);assertEquals(-1, type.indexOf(DurationFieldType.years()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52107);assertEquals(-1, type.indexOf(DurationFieldType.months()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52108);assertEquals(-1, type.indexOf(DurationFieldType.weeks()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52109);assertEquals(0, type.indexOf(DurationFieldType.days()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52110);assertEquals(1, type.indexOf(DurationFieldType.hours()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52111);assertEquals(2, type.indexOf(DurationFieldType.minutes()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52112);assertEquals(3, type.indexOf(DurationFieldType.seconds()));
        __CLR4_4_113mq13mqlgchosdx.R.inc(52113);assertEquals(-1, type.indexOf(DurationFieldType.millis()));
    }finally{__CLR4_4_113mq13mqlgchosdx.R.flushNeeded();}}

}
