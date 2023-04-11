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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat {static class __CLR4_4_11k851k85lgchosyl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,73331,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11k851k85lgchosyl.R.inc(72869);
        __CLR4_4_11k851k85lgchosyl.R.inc(72870);TestISODateTimeFormat TB = new TestISODateTimeFormat();

        __CLR4_4_11k851k85lgchosyl.R.inc(72871);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72872);TB.testSubclassableConstructor();
        __CLR4_4_11k851k85lgchosyl.R.inc(72873);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72874);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72875);TB.testFormat_date();
        __CLR4_4_11k851k85lgchosyl.R.inc(72876);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72877);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72878);TB.testFormat_date_partial();
        __CLR4_4_11k851k85lgchosyl.R.inc(72879);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72880);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72881);TB.testFormat_time();
        __CLR4_4_11k851k85lgchosyl.R.inc(72882);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72883);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72884);TB.testFormat_time_partial();
        __CLR4_4_11k851k85lgchosyl.R.inc(72885);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72886);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72887);TB.testFormat_timeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72888);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72889);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72890);TB.testFormat_timeNoMillis_partial();
        __CLR4_4_11k851k85lgchosyl.R.inc(72891);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72892);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72893);TB.testFormat_tTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72894);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72895);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72896);TB.testFormat_tTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72897);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72898);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72899);TB.testFormat_dateTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72900);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72901);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72902);TB.testFormat_dateTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72903);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72904);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72905);TB.testFormat_ordinalDate();
        __CLR4_4_11k851k85lgchosyl.R.inc(72906);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72907);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72908);TB.testFormat_ordinalDateTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72909);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72910);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72911);TB.testFormat_ordinalDateTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72912);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72913);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72914);TB.testFormat_weekDate();
        __CLR4_4_11k851k85lgchosyl.R.inc(72915);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72916);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72917);TB.testFormat_weekDateTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72918);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72919);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72920);TB.testFormat_weekDateTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72921);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72922);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72923);TB.testFormat_basicDate();
        __CLR4_4_11k851k85lgchosyl.R.inc(72924);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72925);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72926);TB.testFormat_basicTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72927);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72928);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72929);TB.testFormat_basicTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72930);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72931);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72932);TB.testFormat_basicTTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72933);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72934);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72935);TB.testFormat_basicTTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72936);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72937);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72938);TB.testFormat_basicDateTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72939);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72940);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72941);TB.testFormat_basicDateTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72942);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72943);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72944);TB.testFormat_basicOrdinalDate();
        __CLR4_4_11k851k85lgchosyl.R.inc(72945);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72946);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72947);TB.testFormat_basicOrdinalDateTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72948);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72949);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72950);TB.testFormat_basicOrdinalDateTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72951);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72952);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72953);TB.testFormat_basicWeekDate();
        __CLR4_4_11k851k85lgchosyl.R.inc(72954);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72955);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72956);TB.testFormat_basicWeekDateTime();
        __CLR4_4_11k851k85lgchosyl.R.inc(72957);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72958);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72959);TB.testFormat_basicWeekDateTimeNoMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72960);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72961);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72962);TB.testFormat_year();
        __CLR4_4_11k851k85lgchosyl.R.inc(72963);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72964);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72965);TB.testFormat_yearMonth();
        __CLR4_4_11k851k85lgchosyl.R.inc(72966);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72967);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72968);TB.testFormat_yearMonthDay();
        __CLR4_4_11k851k85lgchosyl.R.inc(72969);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72970);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72971);TB.testFormat_weekyear();
        __CLR4_4_11k851k85lgchosyl.R.inc(72972);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72973);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72974);TB.testFormat_weekyearWeek();
        __CLR4_4_11k851k85lgchosyl.R.inc(72975);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72976);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72977);TB.testFormat_weekyearWeekDay();
        __CLR4_4_11k851k85lgchosyl.R.inc(72978);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72979);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72980);TB.testFormat_hour();
        __CLR4_4_11k851k85lgchosyl.R.inc(72981);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72982);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72983);TB.testFormat_hourMinute();
        __CLR4_4_11k851k85lgchosyl.R.inc(72984);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72985);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72986);TB.testFormat_hourMinuteSecond();
        __CLR4_4_11k851k85lgchosyl.R.inc(72987);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72988);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72989);TB.testFormat_hourMinuteSecondMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(72990);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72991);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72992);TB.testFormat_hourMinuteSecondFraction();
        __CLR4_4_11k851k85lgchosyl.R.inc(72993);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72994);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72995);TB.testFormat_dateHour();
        __CLR4_4_11k851k85lgchosyl.R.inc(72996);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(72997);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(72998);TB.testFormat_dateHourMinute();
        __CLR4_4_11k851k85lgchosyl.R.inc(72999);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(73000);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(73001);TB.testFormat_dateHourMinuteSecond();
        __CLR4_4_11k851k85lgchosyl.R.inc(73002);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(73003);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(73004);TB.testFormat_dateHourMinuteSecondMillis();
        __CLR4_4_11k851k85lgchosyl.R.inc(73005);TB.tearDown();
        __CLR4_4_11k851k85lgchosyl.R.inc(73006);TB.setUp();
        __CLR4_4_11k851k85lgchosyl.R.inc(73007);TB.testFormat_dateHourMinuteSecondFraction();
        __CLR4_4_11k851k85lgchosyl.R.inc(73008);TB.tearDown();

    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestISODateTimeFormat.class);
    }

    public TestISODateTimeFormat(String name) {
        super(name);
    }
    */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11k851k85lgchosyl.R.inc(73009);
        __CLR4_4_11k851k85lgchosyl.R.inc(73010);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11k851k85lgchosyl.R.inc(73011);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11k851k85lgchosyl.R.inc(73012);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11k851k85lgchosyl.R.inc(73013);originalLocale = Locale.getDefault();
        __CLR4_4_11k851k85lgchosyl.R.inc(73014);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73015);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11k851k85lgchosyl.R.inc(73016);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11k851k85lgchosyl.R.inc(73017);
        __CLR4_4_11k851k85lgchosyl.R.inc(73018);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11k851k85lgchosyl.R.inc(73019);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11k851k85lgchosyl.R.inc(73020);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11k851k85lgchosyl.R.inc(73021);Locale.setDefault(originalLocale);
        __CLR4_4_11k851k85lgchosyl.R.inc(73022);originalDateTimeZone = null;
        __CLR4_4_11k851k85lgchosyl.R.inc(73023);originalTimeZone = null;
        __CLR4_4_11k851k85lgchosyl.R.inc(73024);originalLocale = null;
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSubclassableConstructor() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x1kch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x1kch(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73025);
        __CLR4_4_11k851k85lgchosyl.R.inc(73026);ISODateTimeFormat f = new ISODateTimeFormat() {
            // test constructor is protected
        };
        __CLR4_4_11k851k85lgchosyl.R.inc(73027);assertNotNull(f);
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_date() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioowy31kck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioowy31kck(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73028);
        __CLR4_4_11k851k85lgchosyl.R.inc(73029);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73030);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73031);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73032);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73033);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73034);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_date_partial() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111i2b71kcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_date_partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111i2b71kcr(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73035);
        __CLR4_4_11k851k85lgchosyl.R.inc(73036);Partial dt = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[]{2004, 6, 9});
        __CLR4_4_11k851k85lgchosyl.R.inc(73037);assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_time() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1da1hje1kcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1da1hje1kcu(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73038);
        __CLR4_4_11k851k85lgchosyl.R.inc(73039);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73040);assertEquals("10:20:30.040Z", ISODateTimeFormat.time().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73041);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73042);assertEquals("11:20:30.040+01:00", ISODateTimeFormat.time().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73043);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73044);assertEquals("12:20:30.040+02:00", ISODateTimeFormat.time().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_time_partial() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlxb781kd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_time_partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlxb781kd1(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73045);
        __CLR4_4_11k851k85lgchosyl.R.inc(73046);Partial dt = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[]{10, 20, 30, 40});
        __CLR4_4_11k851k85lgchosyl.R.inc(73047);assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_timeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dc49qn1kd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dc49qn1kd4(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73048);
        __CLR4_4_11k851k85lgchosyl.R.inc(73049);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73050);assertEquals("10:20:30Z", ISODateTimeFormat.timeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73051);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73052);assertEquals("11:20:30+01:00", ISODateTimeFormat.timeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73053);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73054);assertEquals("12:20:30+02:00", ISODateTimeFormat.timeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_timeNoMillis_partial() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126x6q51kdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_timeNoMillis_partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126x6q51kdb(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73055);
        __CLR4_4_11k851k85lgchosyl.R.inc(73056);Partial dt = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[]{10, 20, 30, 40});
        __CLR4_4_11k851k85lgchosyl.R.inc(73057);assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_tTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grnioe1kde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grnioe1kde(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73058);
        __CLR4_4_11k851k85lgchosyl.R.inc(73059);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73060);assertEquals("T10:20:30.040Z", ISODateTimeFormat.tTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73061);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73062);assertEquals("T11:20:30.040+01:00", ISODateTimeFormat.tTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73063);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73064);assertEquals("T12:20:30.040+02:00", ISODateTimeFormat.tTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_tTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qgzaf1kdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_tTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qgzaf1kdl(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73065);
        __CLR4_4_11k851k85lgchosyl.R.inc(73066);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73067);assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73068);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73069);assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73070);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73071);assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_dateTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxdvrs1kds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxdvrs1kds(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73072);
        __CLR4_4_11k851k85lgchosyl.R.inc(73073);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73074);assertEquals("2004-06-09T10:20:30.040Z", ISODateTimeFormat.dateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73075);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73076);assertEquals("2004-06-09T11:20:30.040+01:00", ISODateTimeFormat.dateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73077);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73078);assertEquals("2004-06-09T12:20:30.040+02:00", ISODateTimeFormat.dateTime().print(dt));

//        dt = dt.withZone(LONDON);
//        assertEquals("2004-06-09T11:20:30.040+01:00", ISODateTimeFormat.getInstance(PARIS).dateTime().print(dt));
//        
//        dt = dt.withZone(LONDON);
//        assertEquals("2004-06-09T12:20:30.040+02:00", ISODateTimeFormat.dateTime().print(dt.getMillis(), PARIS));
//        
//        dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, CopticChronology.getInstance());
//        assertEquals("2288-02-19T10:20:30.040Z", ISODateTimeFormat.dateTime().print(dt));
//        
//        dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, CopticChronology.getInstance());
//        assertEquals("2004-06-09T10:20:30.040Z", ISODateTimeFormat.getInstance(CopticChronology.getInstance()).dateTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_dateTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vj1b9d1kdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vj1b9d1kdz(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73079);
        __CLR4_4_11k851k85lgchosyl.R.inc(73080);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73081);assertEquals("2004-06-09T10:20:30Z", ISODateTimeFormat.dateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73082);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73083);assertEquals("2004-06-09T11:20:30+01:00", ISODateTimeFormat.dateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73084);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73085);assertEquals("2004-06-09T12:20:30+02:00", ISODateTimeFormat.dateTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_ordinalDate() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tgq8g1ke6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_ordinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tgq8g1ke6(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73086);
        __CLR4_4_11k851k85lgchosyl.R.inc(73087);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73088);assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73089);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73090);assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73091);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73092);assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_ordinalDateTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7r0d91ked();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_ordinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7r0d91ked(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73093);
        __CLR4_4_11k851k85lgchosyl.R.inc(73094);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73095);assertEquals("2004-161T10:20:30.040Z", ISODateTimeFormat.ordinalDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73096);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73097);assertEquals("2004-161T11:20:30.040+01:00", ISODateTimeFormat.ordinalDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73098);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73099);assertEquals("2004-161T12:20:30.040+02:00", ISODateTimeFormat.ordinalDateTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_ordinalDateTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ahdmbo1kek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_ordinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ahdmbo1kek(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73100);
        __CLR4_4_11k851k85lgchosyl.R.inc(73101);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73102);assertEquals("2004-161T10:20:30Z", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73103);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73104);assertEquals("2004-161T11:20:30+01:00", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73105);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73106);assertEquals("2004-161T12:20:30+02:00", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_weekDate() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb90f1ker();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb90f1ker(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73107);
        __CLR4_4_11k851k85lgchosyl.R.inc(73108);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73109);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73110);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73111);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73112);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73113);assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_weekDateTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163ee6s1key();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163ee6s1key(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73114);
        __CLR4_4_11k851k85lgchosyl.R.inc(73115);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73116);assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73117);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73118);assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73119);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73120);assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_weekDateTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgklzn1kf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgklzn1kf5(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73121);
        __CLR4_4_11k851k85lgchosyl.R.inc(73122);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73123);assertEquals("2004-W24-3T10:20:30Z", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73124);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73125);assertEquals("2004-W24-3T11:20:30+01:00", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73126);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73127);assertEquals("2004-W24-3T12:20:30+02:00", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_basicDate() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9uf4j1kfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9uf4j1kfc(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73128);
        __CLR4_4_11k851k85lgchosyl.R.inc(73129);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73130);assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73131);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73132);assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73133);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73134);assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vohuj81kfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vohuj81kfj(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73135);
        __CLR4_4_11k851k85lgchosyl.R.inc(73136);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73137);assertEquals("102030.040Z", ISODateTimeFormat.basicTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73138);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73139);assertEquals("112030.040+0100", ISODateTimeFormat.basicTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73140);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73141);assertEquals("122030.040+0200", ISODateTimeFormat.basicTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gyuct1kfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gyuct1kfq(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73142);
        __CLR4_4_11k851k85lgchosyl.R.inc(73143);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73144);assertEquals("102030Z", ISODateTimeFormat.basicTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73145);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73146);assertEquals("112030+0100", ISODateTimeFormat.basicTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73147);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73148);assertEquals("122030+0200", ISODateTimeFormat.basicTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicTTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3y6kw1kfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3y6kw1kfx(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73149);
        __CLR4_4_11k851k85lgchosyl.R.inc(73150);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73151);assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73152);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73153);assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73154);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73155);assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicTTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xmzqv1kg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicTTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xmzqv1kg4(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73156);
        __CLR4_4_11k851k85lgchosyl.R.inc(73157);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73158);assertEquals("T102030Z", ISODateTimeFormat.basicTTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73159);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73160);assertEquals("T112030+0100", ISODateTimeFormat.basicTTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73161);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73162);assertEquals("T122030+0200", ISODateTimeFormat.basicTTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicDateTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqbsqi1kgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqbsqi1kgb(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73163);
        __CLR4_4_11k851k85lgchosyl.R.inc(73164);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73165);assertEquals("20040609T102030.040Z", ISODateTimeFormat.basicDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73166);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73167);assertEquals("20040609T112030.040+0100", ISODateTimeFormat.basicDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73168);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73169);assertEquals("20040609T122030.040+0200", ISODateTimeFormat.basicDateTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicDateTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9h0bl1kgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9h0bl1kgi(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73170);
        __CLR4_4_11k851k85lgchosyl.R.inc(73171);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73172);assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73173);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73174);assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73175);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73176);assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicOrdinalDate() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr1ksy1kgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr1ksy1kgp(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73177);
        __CLR4_4_11k851k85lgchosyl.R.inc(73178);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73179);assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73180);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73181);assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73182);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73183);assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicOrdinalDateTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ghk69x1kgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ghk69x1kgw(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73184);
        __CLR4_4_11k851k85lgchosyl.R.inc(73185);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73186);assertEquals("2004161T102030.040Z", ISODateTimeFormat.basicOrdinalDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73187);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73188);assertEquals("2004161T112030.040+0100", ISODateTimeFormat.basicOrdinalDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73189);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73190);assertEquals("2004161T122030.040+0200", ISODateTimeFormat.basicOrdinalDateTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicOrdinalDateTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17shmvy1kh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicOrdinalDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17shmvy1kh3(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73191);
        __CLR4_4_11k851k85lgchosyl.R.inc(73192);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73193);assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73194);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73195);assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73196);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73197);assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicWeekDate() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7qu0v1kha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7qu0v1kha(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73198);
        __CLR4_4_11k851k85lgchosyl.R.inc(73199);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73200);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73201);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73202);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73203);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73204);assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicWeekDateTime() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15rr1721khh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15rr1721khh(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73205);
        __CLR4_4_11k851k85lgchosyl.R.inc(73206);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73207);assertEquals("2004W243T102030.040Z", ISODateTimeFormat.basicWeekDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73208);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73209);assertEquals("2004W243T112030.040+0100", ISODateTimeFormat.basicWeekDateTime().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73210);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73211);assertEquals("2004W243T122030.040+0200", ISODateTimeFormat.basicWeekDateTime().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_basicWeekDateTimeNoMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlotqj1kho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_basicWeekDateTimeNoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlotqj1kho(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73212);
        __CLR4_4_11k851k85lgchosyl.R.inc(73213);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73214);assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73215);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73216);assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73217);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73218);assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_year() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fu0epm1khv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_year",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fu0epm1khv(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73219);
        __CLR4_4_11k851k85lgchosyl.R.inc(73220);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73221);assertEquals("2004", ISODateTimeFormat.year().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73222);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73223);assertEquals("2004", ISODateTimeFormat.year().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73224);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73225);assertEquals("2004", ISODateTimeFormat.year().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_yearMonth() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5yuuk1ki2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5yuuk1ki2(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73226);
        __CLR4_4_11k851k85lgchosyl.R.inc(73227);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73228);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73229);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73230);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73231);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73232);assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_yearMonthDay() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdvnca1ki9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_yearMonthDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdvnca1ki9(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73233);
        __CLR4_4_11k851k85lgchosyl.R.inc(73234);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73235);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73236);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73237);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73238);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73239);assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_weekyear() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcb9im1kig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcb9im1kig(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73240);
        __CLR4_4_11k851k85lgchosyl.R.inc(73241);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73242);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73243);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73244);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73245);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73246);assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_weekyearWeek() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2co3m1kin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2co3m1kin(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73247);
        __CLR4_4_11k851k85lgchosyl.R.inc(73248);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73249);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73250);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73251);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73252);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73253);assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_weekyearWeekDay() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14htcx41kiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_weekyearWeekDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14htcx41kiu(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73254);
        __CLR4_4_11k851k85lgchosyl.R.inc(73255);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73256);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73257);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73258);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73259);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73260);assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_hour() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19588jl1kj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19588jl1kj1(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73261);
        __CLR4_4_11k851k85lgchosyl.R.inc(73262);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73263);assertEquals("10", ISODateTimeFormat.hour().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73264);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73265);assertEquals("11", ISODateTimeFormat.hour().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73266);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73267);assertEquals("12", ISODateTimeFormat.hour().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_hourMinute() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vyuxzf1kj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vyuxzf1kj8(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73268);
        __CLR4_4_11k851k85lgchosyl.R.inc(73269);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73270);assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73271);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73272);assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73273);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73274);assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_hourMinuteSecond() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duc4xj1kjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duc4xj1kjf(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73275);
        __CLR4_4_11k851k85lgchosyl.R.inc(73276);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73277);assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73278);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73279);assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73280);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73281);assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_hourMinuteSecondMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dshmfl1kjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dshmfl1kjm(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73282);
        __CLR4_4_11k851k85lgchosyl.R.inc(73283);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73284);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73285);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73286);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73287);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73288);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_hourMinuteSecondFraction() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1623l631kjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_hourMinuteSecondFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1623l631kjt(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73289);
        __CLR4_4_11k851k85lgchosyl.R.inc(73290);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73291);assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73292);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73293);assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73294);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73295);assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dateHour() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tskmrz1kk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tskmrz1kk0(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73296);
        __CLR4_4_11k851k85lgchosyl.R.inc(73297);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73298);assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73299);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73300);assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73301);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73302);assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_dateHourMinute() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2ia6b1kk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2ia6b1kk7(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73303);
        __CLR4_4_11k851k85lgchosyl.R.inc(73304);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73305);assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73306);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73307);assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73308);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73309);assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_dateHourMinuteSecond() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bm2fx31kke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bm2fx31kke(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73310);
        __CLR4_4_11k851k85lgchosyl.R.inc(73311);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73312);assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73313);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73314);assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73315);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73316);assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_dateHourMinuteSecondMillis() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c2oxp1kkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c2oxp1kkl(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73317);
        __CLR4_4_11k851k85lgchosyl.R.inc(73318);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73319);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73320);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73321);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73322);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73323);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

    @Test
    public void testFormat_dateHourMinuteSecondFraction() {__CLR4_4_11k851k85lgchosyl.R.globalSliceStart(getClass().getName(),73324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ezwlbt1kks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k851k85lgchosyl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k851k85lgchosyl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat.testFormat_dateHourMinuteSecondFraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ezwlbt1kks(){try{__CLR4_4_11k851k85lgchosyl.R.inc(73324);
        __CLR4_4_11k851k85lgchosyl.R.inc(73325);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        __CLR4_4_11k851k85lgchosyl.R.inc(73326);assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73327);dt = dt.withZone(LONDON);
        __CLR4_4_11k851k85lgchosyl.R.inc(73328);assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));

        __CLR4_4_11k851k85lgchosyl.R.inc(73329);dt = dt.withZone(PARIS);
        __CLR4_4_11k851k85lgchosyl.R.inc(73330);assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));
    }finally{__CLR4_4_11k851k85lgchosyl.R.flushNeeded();}}

}
