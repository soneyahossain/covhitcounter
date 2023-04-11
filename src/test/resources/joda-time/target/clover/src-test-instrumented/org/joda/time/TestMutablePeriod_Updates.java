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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates {static class __CLR4_4_111ob11oblgchosc4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,49973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
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

    public static void main(String[] args) throws Exception {try{__CLR4_4_111ob11oblgchosc4.R.inc(48827);
        __CLR4_4_111ob11oblgchosc4.R.inc(48828);TestMutablePeriod_Updates TB = new TestMutablePeriod_Updates();
        __CLR4_4_111ob11oblgchosc4.R.inc(48829);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48830);TB.testTest();
        __CLR4_4_111ob11oblgchosc4.R.inc(48831);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48832);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48833);TB.testClear();
        __CLR4_4_111ob11oblgchosc4.R.inc(48834);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48835);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48836);TB.testAddYears();
        __CLR4_4_111ob11oblgchosc4.R.inc(48837);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48838);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48839);TB.testAddMonths();
        __CLR4_4_111ob11oblgchosc4.R.inc(48840);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48841);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48842);TB.testAddWeeks();
        __CLR4_4_111ob11oblgchosc4.R.inc(48843);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48844);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48845);TB.testAddDays();
        __CLR4_4_111ob11oblgchosc4.R.inc(48846);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48847);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48848);TB.testAddHours();
        __CLR4_4_111ob11oblgchosc4.R.inc(48849);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48850);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48851);TB.testAddMinutes();
        __CLR4_4_111ob11oblgchosc4.R.inc(48852);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48853);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48854);TB.testAddSeconds();
        __CLR4_4_111ob11oblgchosc4.R.inc(48855);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48856);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48857);TB.testAddMillis();
        __CLR4_4_111ob11oblgchosc4.R.inc(48858);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48859);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48860);TB.testSetYears();
        __CLR4_4_111ob11oblgchosc4.R.inc(48861);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48862);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48863);TB.testSetMonths();
        __CLR4_4_111ob11oblgchosc4.R.inc(48864);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48865);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48866);TB.testSetWeeks();
        __CLR4_4_111ob11oblgchosc4.R.inc(48867);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48868);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48869);TB.testSetDays();
        __CLR4_4_111ob11oblgchosc4.R.inc(48870);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48871);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48872);TB.testSetHours();
        __CLR4_4_111ob11oblgchosc4.R.inc(48873);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48874);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48875);TB.testSetMinutes();
        __CLR4_4_111ob11oblgchosc4.R.inc(48876);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48877);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48878);TB.testSetSeconds();
        __CLR4_4_111ob11oblgchosc4.R.inc(48879);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48880);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48881);TB.testSetMillis();
        __CLR4_4_111ob11oblgchosc4.R.inc(48882);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48883);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48884);TB.testSet_Field();
        __CLR4_4_111ob11oblgchosc4.R.inc(48885);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48886);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48887);TB.testAdd_Field();
        __CLR4_4_111ob11oblgchosc4.R.inc(48888);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48889);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48890);TB.testSetPeriod_8ints1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48891);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48892);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48893);TB.testSetPeriod_8ints2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48894);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48895);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48896);TB.testSetPeriod_8ints3();
        __CLR4_4_111ob11oblgchosc4.R.inc(48897);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48898);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48899);TB.testSetPeriod_8ints4();
        __CLR4_4_111ob11oblgchosc4.R.inc(48900);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48901);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48902);TB.testSetPeriod_RP1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48903);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48904);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48905);TB.testSetPeriod_RP2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48906);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48907);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48908);TB.testSetPeriod_RP3();
        __CLR4_4_111ob11oblgchosc4.R.inc(48909);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48910);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48911);TB.testSetPeriod_RP4();
        __CLR4_4_111ob11oblgchosc4.R.inc(48912);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48913);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48914);TB.testSetPeriod_RP5();
        __CLR4_4_111ob11oblgchosc4.R.inc(48915);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48916);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48917);TB.testSetPeriod_long_long1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48918);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48919);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48920);TB.testSetPeriod_long_long2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48921);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48922);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48923);TB.testSetPeriod_long_long3();
        __CLR4_4_111ob11oblgchosc4.R.inc(48924);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48925);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48926);TB.testSetPeriod_long_long_NoYears();
        __CLR4_4_111ob11oblgchosc4.R.inc(48927);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48928);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48929);TB.testSetPeriod_long_long_NoMonths();
        __CLR4_4_111ob11oblgchosc4.R.inc(48930);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48931);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48932);TB.testSetPeriod_long_long_NoWeeks();
        __CLR4_4_111ob11oblgchosc4.R.inc(48933);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48934);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48935);TB.testSetPeriod_long_long_NoDays();
        __CLR4_4_111ob11oblgchosc4.R.inc(48936);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48937);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48938);TB.testSetPeriod_long_long_NoHours();
        __CLR4_4_111ob11oblgchosc4.R.inc(48939);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48940);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48941);TB.testSetPeriod_long_long_NoMinutes();
        __CLR4_4_111ob11oblgchosc4.R.inc(48942);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48943);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48944);TB.testSetPeriod_long_long_NoSeconds();
        __CLR4_4_111ob11oblgchosc4.R.inc(48945);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48946);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48947);TB.testSetPeriod_long_long_NoMillis();
        __CLR4_4_111ob11oblgchosc4.R.inc(48948);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48949);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48950);TB.testSetPeriod_RI_RI1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48951);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48952);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48953);TB.testSetPeriod_RI_RI2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48954);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48955);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48956);TB.testSetPeriod_RI_RI3();
        __CLR4_4_111ob11oblgchosc4.R.inc(48957);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48958);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48959);TB.testSetPeriod_RInterval1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48960);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48961);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48962);TB.testSetPeriod_RInterval2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48963);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48964);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48965);TB.testSetPeriod_long1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48966);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48967);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48968);TB.testSetPeriod_long2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48969);TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long3(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long4(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoYears(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoMonths(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoWeeks(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoDays(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoHours(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoMinutes(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoSeconds(); TB.tearDown();
//    TB.setUp(); TB.testSetPeriod_long_NoMillis(); TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48970);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48971);TB.testSetPeriod_RD1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48972);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48973);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48974);TB.testSetPeriod_RD2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48975);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48976);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48977);TB.testSetPeriod_RD3();
        __CLR4_4_111ob11oblgchosc4.R.inc(48978);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48979);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48980);TB.testAdd_8ints1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48981);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48982);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48983);TB.testAdd_8ints2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48984);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48985);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48986);TB.testAdd_long1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48987);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48988);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48989);TB.testAdd_long2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48990);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48991);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48992);TB.testAdd_long3();
        __CLR4_4_111ob11oblgchosc4.R.inc(48993);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48994);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48995);TB.testAdd_long_Chronology1();
        __CLR4_4_111ob11oblgchosc4.R.inc(48996);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(48997);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(48998);TB.testAdd_long_Chronology2();
        __CLR4_4_111ob11oblgchosc4.R.inc(48999);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49000);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49001);TB.testAdd_long_Chronology3();
        __CLR4_4_111ob11oblgchosc4.R.inc(49002);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49003);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49004);TB.testAdd_RD1();
        __CLR4_4_111ob11oblgchosc4.R.inc(49005);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49006);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49007);TB.testAdd_RD2();
        __CLR4_4_111ob11oblgchosc4.R.inc(49008);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49009);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49010);TB.testAdd_RD3();
        __CLR4_4_111ob11oblgchosc4.R.inc(49011);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49012);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49013);TB.testAdd_RP1();
        __CLR4_4_111ob11oblgchosc4.R.inc(49014);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49015);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49016);TB.testAdd_RP2();
        __CLR4_4_111ob11oblgchosc4.R.inc(49017);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49018);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49019);TB.testAdd_RP3();
        __CLR4_4_111ob11oblgchosc4.R.inc(49020);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49021);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49022);TB.testAdd_RP4();
        __CLR4_4_111ob11oblgchosc4.R.inc(49023);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49024);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49025);TB.testAdd_RP5();
        __CLR4_4_111ob11oblgchosc4.R.inc(49026);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49027);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49028);TB.testAdd_RP6();
        __CLR4_4_111ob11oblgchosc4.R.inc(49029);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49030);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49031);TB.testAdd_RInterval1();
        __CLR4_4_111ob11oblgchosc4.R.inc(49032);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49033);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49034);TB.testAdd_RInterval2();
        __CLR4_4_111ob11oblgchosc4.R.inc(49035);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49036);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49037);TB.testAdd_RInterval3();
        __CLR4_4_111ob11oblgchosc4.R.inc(49038);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49039);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49040);TB.testAdd_RInterval4();
        __CLR4_4_111ob11oblgchosc4.R.inc(49041);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49042);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49043);TB.testAdd_RInterval5();
        __CLR4_4_111ob11oblgchosc4.R.inc(49044);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49045);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49046);TB.testMergePeriod_RP1();
        __CLR4_4_111ob11oblgchosc4.R.inc(49047);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49048);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49049);TB.testMergePeriod_RP2();
        __CLR4_4_111ob11oblgchosc4.R.inc(49050);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49051);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49052);TB.testMergePeriod_RP3();
        __CLR4_4_111ob11oblgchosc4.R.inc(49053);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49054);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49055);TB.testMergePeriod_RP4();
        __CLR4_4_111ob11oblgchosc4.R.inc(49056);TB.tearDown();
        __CLR4_4_111ob11oblgchosc4.R.inc(49057);TB.setUp();
        __CLR4_4_111ob11oblgchosc4.R.inc(49058);TB.testMergePeriod_RP5();
        __CLR4_4_111ob11oblgchosc4.R.inc(49059);TB.tearDown();

    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestMutablePeriod_Updates.class);
    }

    public TestMutablePeriod_Updates(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_111ob11oblgchosc4.R.inc(49060);
        __CLR4_4_111ob11oblgchosc4.R.inc(49061);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_111ob11oblgchosc4.R.inc(49062);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_111ob11oblgchosc4.R.inc(49063);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_111ob11oblgchosc4.R.inc(49064);originalLocale = Locale.getDefault();
        __CLR4_4_111ob11oblgchosc4.R.inc(49065);DateTimeZone.setDefault(LONDON);
        __CLR4_4_111ob11oblgchosc4.R.inc(49066);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_111ob11oblgchosc4.R.inc(49067);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_111ob11oblgchosc4.R.inc(49068);
        __CLR4_4_111ob11oblgchosc4.R.inc(49069);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_111ob11oblgchosc4.R.inc(49070);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_111ob11oblgchosc4.R.inc(49071);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_111ob11oblgchosc4.R.inc(49072);Locale.setDefault(originalLocale);
        __CLR4_4_111ob11oblgchosc4.R.inc(49073);originalDateTimeZone = null;
        __CLR4_4_111ob11oblgchosc4.R.inc(49074);originalTimeZone = null;
        __CLR4_4_111ob11oblgchosc4.R.inc(49075);originalLocale = null;
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqj11v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqj11v8(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49076);
        __CLR4_4_111ob11oblgchosc4.R.inc(49077);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_111ob11oblgchosc4.R.inc(49078);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_111ob11oblgchosc4.R.inc(49079);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClear() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlyl6q11vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlyl6q11vc(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49080);
        __CLR4_4_111ob11oblgchosc4.R.inc(49081);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49082);test.clear();
        __CLR4_4_111ob11oblgchosc4.R.inc(49083);assertEquals(new MutablePeriod(), test);

        __CLR4_4_111ob11oblgchosc4.R.inc(49084);test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49085);test.clear();
        __CLR4_4_111ob11oblgchosc4.R.inc(49086);assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test);
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddYears() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pigqmm11vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pigqmm11vj(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49087);
        __CLR4_4_111ob11oblgchosc4.R.inc(49088);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49089);test.addYears(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49090);assertEquals(11, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49091);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49092);test.addYears(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49093);assertEquals(-9, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49094);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49095);test.addYears(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49096);assertEquals(1, test.getYears());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMonths() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n5eqa111vt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n5eqa111vt(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49097);
        __CLR4_4_111ob11oblgchosc4.R.inc(49098);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49099);test.addMonths(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49100);assertEquals(12, test.getMonths());

        __CLR4_4_111ob11oblgchosc4.R.inc(49101);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49102);test.addMonths(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49103);assertEquals(-8, test.getMonths());

        __CLR4_4_111ob11oblgchosc4.R.inc(49104);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49105);test.addMonths(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49106);assertEquals(2, test.getMonths());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddWeeks() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15be28n11w3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15be28n11w3(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49107);
        __CLR4_4_111ob11oblgchosc4.R.inc(49108);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49109);test.addWeeks(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49110);assertEquals(13, test.getWeeks());

        __CLR4_4_111ob11oblgchosc4.R.inc(49111);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49112);test.addWeeks(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49113);assertEquals(-7, test.getWeeks());

        __CLR4_4_111ob11oblgchosc4.R.inc(49114);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49115);test.addWeeks(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49116);assertEquals(3, test.getWeeks());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddDays() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq0g1911wd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq0g1911wd(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49117);
        __CLR4_4_111ob11oblgchosc4.R.inc(49118);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49119);test.addDays(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49120);assertEquals(14, test.getDays());

        __CLR4_4_111ob11oblgchosc4.R.inc(49121);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49122);test.addDays(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49123);assertEquals(-6, test.getDays());

        __CLR4_4_111ob11oblgchosc4.R.inc(49124);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49125);test.addDays(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49126);assertEquals(4, test.getDays());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddHours() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v9jld311wn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v9jld311wn(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49127);
        __CLR4_4_111ob11oblgchosc4.R.inc(49128);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49129);test.addHours(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49130);assertEquals(15, test.getHours());

        __CLR4_4_111ob11oblgchosc4.R.inc(49131);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49132);test.addHours(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49133);assertEquals(-5, test.getHours());

        __CLR4_4_111ob11oblgchosc4.R.inc(49134);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49135);test.addHours(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49136);assertEquals(5, test.getHours());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMinutes() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pu9rbd11wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pu9rbd11wx(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49137);
        __CLR4_4_111ob11oblgchosc4.R.inc(49138);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49139);test.addMinutes(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49140);assertEquals(16, test.getMinutes());

        __CLR4_4_111ob11oblgchosc4.R.inc(49141);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49142);test.addMinutes(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49143);assertEquals(-4, test.getMinutes());

        __CLR4_4_111ob11oblgchosc4.R.inc(49144);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49145);test.addMinutes(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49146);assertEquals(6, test.getMinutes());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddSeconds() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dg3my111x7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dg3my111x7(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49147);
        __CLR4_4_111ob11oblgchosc4.R.inc(49148);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49149);test.addSeconds(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49150);assertEquals(17, test.getSeconds());

        __CLR4_4_111ob11oblgchosc4.R.inc(49151);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49152);test.addSeconds(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49153);assertEquals(-3, test.getSeconds());

        __CLR4_4_111ob11oblgchosc4.R.inc(49154);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49155);test.addSeconds(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49156);assertEquals(7, test.getSeconds());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMillis() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2qm4c11xh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAddMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2qm4c11xh(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49157);
        __CLR4_4_111ob11oblgchosc4.R.inc(49158);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49159);test.addMillis(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49160);assertEquals(18, test.getMillis());

        __CLR4_4_111ob11oblgchosc4.R.inc(49161);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49162);test.addMillis(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49163);assertEquals(-2, test.getMillis());

        __CLR4_4_111ob11oblgchosc4.R.inc(49164);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49165);test.addMillis(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49166);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetYears() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diokb111xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diokb111xr(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49167);
        __CLR4_4_111ob11oblgchosc4.R.inc(49168);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49169);test.setYears(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49170);assertEquals(10, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49171);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49172);test.setYears(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49173);assertEquals(-10, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49174);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49175);test.setYears(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49176);assertEquals(0, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49177);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49178);test.setYears(1);
        __CLR4_4_111ob11oblgchosc4.R.inc(49179);assertEquals(1, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49180);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49181);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49182);test.setYears(1);
            __CLR4_4_111ob11oblgchosc4.R.inc(49183);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMonths() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16hpk6i11y8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16hpk6i11y8(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49184);
        __CLR4_4_111ob11oblgchosc4.R.inc(49185);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49186);test.setMonths(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49187);assertEquals(10, test.getMonths());

        __CLR4_4_111ob11oblgchosc4.R.inc(49188);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49189);test.setMonths(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49190);assertEquals(-10, test.getMonths());

        __CLR4_4_111ob11oblgchosc4.R.inc(49191);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49192);test.setMonths(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49193);assertEquals(0, test.getMonths());

        __CLR4_4_111ob11oblgchosc4.R.inc(49194);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49195);test.setMonths(2);
        __CLR4_4_111ob11oblgchosc4.R.inc(49196);assertEquals(2, test.getMonths());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetWeeks() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oe42y11yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oe42y11yl(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49197);
        __CLR4_4_111ob11oblgchosc4.R.inc(49198);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49199);test.setWeeks(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49200);assertEquals(10, test.getWeeks());

        __CLR4_4_111ob11oblgchosc4.R.inc(49201);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49202);test.setWeeks(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49203);assertEquals(-10, test.getWeeks());

        __CLR4_4_111ob11oblgchosc4.R.inc(49204);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49205);test.setWeeks(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49206);assertEquals(0, test.getWeeks());

        __CLR4_4_111ob11oblgchosc4.R.inc(49207);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49208);test.setWeeks(3);
        __CLR4_4_111ob11oblgchosc4.R.inc(49209);assertEquals(3, test.getWeeks());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetDays() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kshbm11yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kshbm11yy(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49210);
        __CLR4_4_111ob11oblgchosc4.R.inc(49211);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49212);test.setDays(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49213);assertEquals(10, test.getDays());

        __CLR4_4_111ob11oblgchosc4.R.inc(49214);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49215);test.setDays(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49216);assertEquals(-10, test.getDays());

        __CLR4_4_111ob11oblgchosc4.R.inc(49217);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49218);test.setDays(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49219);assertEquals(0, test.getDays());

        __CLR4_4_111ob11oblgchosc4.R.inc(49220);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49221);test.setDays(4);
        __CLR4_4_111ob11oblgchosc4.R.inc(49222);assertEquals(4, test.getDays());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetHours() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9rf1i11zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9rf1i11zb(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49223);
        __CLR4_4_111ob11oblgchosc4.R.inc(49224);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49225);test.setHours(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49226);assertEquals(10, test.getHours());

        __CLR4_4_111ob11oblgchosc4.R.inc(49227);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49228);test.setHours(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49229);assertEquals(-10, test.getHours());

        __CLR4_4_111ob11oblgchosc4.R.inc(49230);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49231);test.setHours(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49232);assertEquals(0, test.getHours());

        __CLR4_4_111ob11oblgchosc4.R.inc(49233);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49234);test.setHours(5);
        __CLR4_4_111ob11oblgchosc4.R.inc(49235);assertEquals(5, test.getHours());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMinutes() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzyfg611zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzyfg611zo(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49236);
        __CLR4_4_111ob11oblgchosc4.R.inc(49237);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49238);test.setMinutes(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49239);assertEquals(10, test.getMinutes());

        __CLR4_4_111ob11oblgchosc4.R.inc(49240);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49241);test.setMinutes(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49242);assertEquals(-10, test.getMinutes());

        __CLR4_4_111ob11oblgchosc4.R.inc(49243);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49244);test.setMinutes(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49245);assertEquals(0, test.getMinutes());

        __CLR4_4_111ob11oblgchosc4.R.inc(49246);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49247);test.setMinutes(6);
        __CLR4_4_111ob11oblgchosc4.R.inc(49248);assertEquals(6, test.getMinutes());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetSeconds() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wmzi5m1201();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wmzi5m1201(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49249);
        __CLR4_4_111ob11oblgchosc4.R.inc(49250);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49251);test.setSeconds(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49252);assertEquals(10, test.getSeconds());

        __CLR4_4_111ob11oblgchosc4.R.inc(49253);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49254);test.setSeconds(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49255);assertEquals(-10, test.getSeconds());

        __CLR4_4_111ob11oblgchosc4.R.inc(49256);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49257);test.setSeconds(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49258);assertEquals(0, test.getSeconds());

        __CLR4_4_111ob11oblgchosc4.R.inc(49259);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49260);test.setSeconds(7);
        __CLR4_4_111ob11oblgchosc4.R.inc(49261);assertEquals(7, test.getSeconds());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetMillis() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16kyjz7120e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16kyjz7120e(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49262);
        __CLR4_4_111ob11oblgchosc4.R.inc(49263);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49264);test.setMillis(10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49265);assertEquals(10, test.getMillis());

        __CLR4_4_111ob11oblgchosc4.R.inc(49266);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49267);test.setMillis(-10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49268);assertEquals(-10, test.getMillis());

        __CLR4_4_111ob11oblgchosc4.R.inc(49269);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49270);test.setMillis(0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49271);assertEquals(0, test.getMillis());

        __CLR4_4_111ob11oblgchosc4.R.inc(49272);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49273);test.setMillis(8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49274);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSet_Field() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133r8s2120r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSet_Field",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133r8s2120r(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49275);
        __CLR4_4_111ob11oblgchosc4.R.inc(49276);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49277);test.set(DurationFieldType.years(), 10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49278);assertEquals(10, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49279);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49280);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49281);test.set(null, 10);
            __CLR4_4_111ob11oblgchosc4.R.inc(49282);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_Field() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrgevl120z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_Field",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrgevl120z(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49283);
        __CLR4_4_111ob11oblgchosc4.R.inc(49284);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49285);test.add(DurationFieldType.years(), 10);
        __CLR4_4_111ob11oblgchosc4.R.inc(49286);assertEquals(11, test.getYears());

        __CLR4_4_111ob11oblgchosc4.R.inc(49287);test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49288);test.add(DurationFieldType.years(), 0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49289);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49290);assertEquals(1, test.getMillis());

        __CLR4_4_111ob11oblgchosc4.R.inc(49291);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49292);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49293);test.add(null, 0);
            __CLR4_4_111ob11oblgchosc4.R.inc(49294);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_111ob11oblgchosc4.R.inc(49295);test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49296);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49297);test.add(null, 10);
            __CLR4_4_111ob11oblgchosc4.R.inc(49298);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_8ints1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175y17u121f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175y17u121f(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49299);
        __CLR4_4_111ob11oblgchosc4.R.inc(49300);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49301);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
        __CLR4_4_111ob11oblgchosc4.R.inc(49302);assertEquals(11, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49303);assertEquals(12, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49304);assertEquals(13, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49305);assertEquals(14, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49306);assertEquals(15, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49307);assertEquals(16, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49308);assertEquals(17, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49309);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_8ints2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aey00b121q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aey00b121q(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49310);
        __CLR4_4_111ob11oblgchosc4.R.inc(49311);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49312);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49313);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
            __CLR4_4_111ob11oblgchosc4.R.inc(49314);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_111ob11oblgchosc4.R.inc(49315);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49316);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49317);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49318);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49319);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49320);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49321);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49322);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_8ints3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dnxyss1223();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dnxyss1223(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49323);
        __CLR4_4_111ob11oblgchosc4.R.inc(49324);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49325);test.setPeriod(0, 0, 0, 0, 0, 0, 0, 18);
        __CLR4_4_111ob11oblgchosc4.R.inc(49326);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49327);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49328);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49329);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49330);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49331);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49332);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49333);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_8ints4() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gwxxl9122e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_8ints4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49334,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gwxxl9122e(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49334);
        __CLR4_4_111ob11oblgchosc4.R.inc(49335);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49336);test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18);
        __CLR4_4_111ob11oblgchosc4.R.inc(49337);assertEquals(11, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49338);assertEquals(12, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49339);assertEquals(13, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49340);assertEquals(14, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49341);assertEquals(15, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49342);assertEquals(16, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49343);assertEquals(17, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49344);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_RP1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_188fiwc122p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_188fiwc122p(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49345);
        __CLR4_4_111ob11oblgchosc4.R.inc(49346);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49347);test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        __CLR4_4_111ob11oblgchosc4.R.inc(49348);assertEquals(11, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49349);assertEquals(12, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49350);assertEquals(13, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49351);assertEquals(14, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49352);assertEquals(15, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49353);assertEquals(16, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49354);assertEquals(17, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49355);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RP2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhfhot1230();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhfhot1230(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49356);
        __CLR4_4_111ob11oblgchosc4.R.inc(49357);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49358);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49359);test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
            __CLR4_4_111ob11oblgchosc4.R.inc(49360);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_111ob11oblgchosc4.R.inc(49361);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49362);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49363);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49364);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49365);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49366);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49367);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49368);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RP3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eqfgha123d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eqfgha123d(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49369);
        __CLR4_4_111ob11oblgchosc4.R.inc(49370);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49371);test.setPeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18));
        __CLR4_4_111ob11oblgchosc4.R.inc(49372);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49373);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49374);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49375);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49376);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49377);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49378);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49379);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RP4() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzff9r123o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzff9r123o(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49380);
        __CLR4_4_111ob11oblgchosc4.R.inc(49381);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49382);test.setPeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        __CLR4_4_111ob11oblgchosc4.R.inc(49383);assertEquals(11, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49384);assertEquals(12, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49385);assertEquals(13, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49386);assertEquals(14, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49387);assertEquals(15, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49388);assertEquals(16, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49389);assertEquals(17, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49390);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RP5() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8fe28123z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8fe28123z(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49391);
        __CLR4_4_111ob11oblgchosc4.R.inc(49392);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49393);test.setPeriod((ReadablePeriod) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49394);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49395);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49396);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49397);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49398);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49399);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49400);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49401);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_long_long1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4xs4n124a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4xs4n124a(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49402);
        __CLR4_4_111ob11oblgchosc4.R.inc(49403);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49404);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49405);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49406);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49407);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49408);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49409);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49410);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49411);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49412);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49413);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49414);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdxqx4124n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdxqx4124n(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49415);
        __CLR4_4_111ob11oblgchosc4.R.inc(49416);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49417);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49418);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49419);test.setPeriod(dt2.getMillis(), dt1.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49420);assertEquals(-1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49421);assertEquals(-1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49422);assertEquals(-1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49423);assertEquals(-1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49424);assertEquals(-1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49425);assertEquals(-1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49426);assertEquals(-1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49427);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umxppl1250();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umxppl1250(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49428);
        __CLR4_4_111ob11oblgchosc4.R.inc(49429);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49430);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49431);test.setPeriod(dt1.getMillis(), dt1.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49432);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49433);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49434);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49435);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49436);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49437);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49438);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49439);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoYears() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppetn2125c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoYears",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppetn2125c(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49440);
        __CLR4_4_111ob11oblgchosc4.R.inc(49441);MutablePeriod test = new MutablePeriod(PeriodType.standard().withYearsRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49442);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49443);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49444);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49445);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49446);assertEquals(13, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49447);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49448);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49449);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49450);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49451);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49452);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoMonths() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4rbnt125p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMonths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4rbnt125p(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49453);
        __CLR4_4_111ob11oblgchosc4.R.inc(49454);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMonthsRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49455);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49456);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49457);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49458);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49459);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49460);assertEquals(5, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49461);assertEquals(3, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49462);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49463);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49464);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49465);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoWeeks() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ic5931262();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoWeeks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ic5931262(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49466);
        __CLR4_4_111ob11oblgchosc4.R.inc(49467);MutablePeriod test = new MutablePeriod(PeriodType.standard().withWeeksRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49468);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49469);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49470);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49471);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49472);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49473);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49474);assertEquals(8, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49475);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49476);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49477);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49478);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoDays() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq8igd126f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoDays",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq8igd126f(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49479);
        __CLR4_4_111ob11oblgchosc4.R.inc(49480);MutablePeriod test = new MutablePeriod(PeriodType.standard().withDaysRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49481);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49482);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49483);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49484);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49485);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49486);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49487);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49488);assertEquals(25, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49489);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49490);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49491);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoHours() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vghodj126s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoHours",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vghodj126s(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49492);
        __CLR4_4_111ob11oblgchosc4.R.inc(49493);MutablePeriod test = new MutablePeriod(PeriodType.standard().withHoursRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49494);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49495);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49496);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49497);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49498);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49499);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49500);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49501);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49502);assertEquals(61, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49503);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49504);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoMinutes() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hjcjlj1275();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMinutes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hjcjlj1275(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49505);
        __CLR4_4_111ob11oblgchosc4.R.inc(49506);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49507);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49508);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49509);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49510);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49511);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49512);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49513);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49514);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49515);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49516);assertEquals(61, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49517);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoSeconds() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txinyv127i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoSeconds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txinyv127i(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49518);
        __CLR4_4_111ob11oblgchosc4.R.inc(49519);MutablePeriod test = new MutablePeriod(PeriodType.standard().withSecondsRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49520);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49521);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49522);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49523);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49524);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49525);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49526);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49527);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49528);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49529);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49530);assertEquals(1001, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long_long_NoMillis() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g237i4127v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long_long_NoMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g237i4127v(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49531);
        __CLR4_4_111ob11oblgchosc4.R.inc(49532);MutablePeriod test = new MutablePeriod(PeriodType.standard().withMillisRemoved());
        __CLR4_4_111ob11oblgchosc4.R.inc(49533);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49534);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49535);test.setPeriod(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49536);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49537);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49538);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49539);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49540);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49541);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49542);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49543);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_RI_RI1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2e9151288();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2e9151288(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49544);
        __CLR4_4_111ob11oblgchosc4.R.inc(49545);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49546);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49547);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49548);test.setPeriod(dt1, dt2);
        __CLR4_4_111ob11oblgchosc4.R.inc(49549);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49550);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49551);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49552);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49553);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49554);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49555);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49556);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RI_RI2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mtea8o128l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mtea8o128l(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49557);
        __CLR4_4_111ob11oblgchosc4.R.inc(49558);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49559);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49560);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49561);test.setPeriod(dt2, dt1);
        __CLR4_4_111ob11oblgchosc4.R.inc(49562);assertEquals(-1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49563);assertEquals(-1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49564);assertEquals(-1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49565);assertEquals(-1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49566);assertEquals(-1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49567);assertEquals(-1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49568);assertEquals(-1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49569);assertEquals(-1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RI_RI3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkebg7128y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkebg7128y(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49570);
        __CLR4_4_111ob11oblgchosc4.R.inc(49571);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49572);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49573);test.setPeriod(dt1, dt1);
        __CLR4_4_111ob11oblgchosc4.R.inc(49574);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49575);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49576);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49577);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49578);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49579);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49580);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49581);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_RInterval1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymuhip129a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymuhip129a(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49582);
        __CLR4_4_111ob11oblgchosc4.R.inc(49583);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49584);DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19);
        __CLR4_4_111ob11oblgchosc4.R.inc(49585);DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20);
        __CLR4_4_111ob11oblgchosc4.R.inc(49586);test.setPeriod(new Interval(dt1, dt2));
        __CLR4_4_111ob11oblgchosc4.R.inc(49587);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49588);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49589);assertEquals(1, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49590);assertEquals(1, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49591);assertEquals(1, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49592);assertEquals(1, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49593);assertEquals(1, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49594);assertEquals(1, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RInterval2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vduiq8129n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RInterval2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vduiq8129n(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49595);
        __CLR4_4_111ob11oblgchosc4.R.inc(49596);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49597);test.setPeriod((ReadableInterval) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49598);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49599);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49600);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49601);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49602);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49603);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49604);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49605);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_long1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1axx5bi129y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1axx5bi129y(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49606);
        __CLR4_4_111ob11oblgchosc4.R.inc(49607);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49608);test.setPeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49609);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49610);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49611);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49612);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49613);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49614);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49615);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49616);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_long2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6x43z12a9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6x43z12a9(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49617);
        __CLR4_4_111ob11oblgchosc4.R.inc(49618);MutablePeriod test = new MutablePeriod();
        __CLR4_4_111ob11oblgchosc4.R.inc(49619);test.setPeriod(
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
        // only time fields are precise
        __CLR4_4_111ob11oblgchosc4.R.inc(49620);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_111ob11oblgchosc4.R.inc(49621);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49622);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49623);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49624);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49625);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49626);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49627);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

//    @Test public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    @Test public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    @Test public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    @Test
    public void testSetPeriod_RD1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16roy9k12ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16roy9k12ak(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49628);
        __CLR4_4_111ob11oblgchosc4.R.inc(49629);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49630);test.setPeriod(new Duration(100L));
        __CLR4_4_111ob11oblgchosc4.R.inc(49631);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49632);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49633);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49634);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49635);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49636);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49637);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49638);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RD2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0ox2112av();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0ox2112av(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49639);
        __CLR4_4_111ob11oblgchosc4.R.inc(49640);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49641);long length =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_111ob11oblgchosc4.R.inc(49642);test.setPeriod(new Duration(length));
        // only time fields are precise
        __CLR4_4_111ob11oblgchosc4.R.inc(49643);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_111ob11oblgchosc4.R.inc(49644);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49645);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49646);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49647);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49648);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49649);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49650);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testSetPeriod_RD3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9ovui12b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testSetPeriod_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9ovui12b7(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49651);
        __CLR4_4_111ob11oblgchosc4.R.inc(49652);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49653);test.setPeriod((ReadableDuration) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49654);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49655);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49656);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49657);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49658);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49659);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49660);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49661);assertEquals(0, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_8ints1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1ragk12bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1ragk12bi(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49662);
        __CLR4_4_111ob11oblgchosc4.R.inc(49663);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49664);test.add(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49665);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49666);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49667);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49668);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49669);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49670);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49671);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49672);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_8ints2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esrbo312bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_8ints2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49673,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esrbo312bt(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49673);
        __CLR4_4_111ob11oblgchosc4.R.inc(49674);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49675);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49676);test.add(1, 2, 3, 4, 5, 6, 7, 8);
            __CLR4_4_111ob11oblgchosc4.R.inc(49677);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_111ob11oblgchosc4.R.inc(49678);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49679);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49680);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49681);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49682);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49683);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49684);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49685);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_long1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x1ijik12c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x1ijik12c6(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49686);
        __CLR4_4_111ob11oblgchosc4.R.inc(49687);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49688);test.add(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49689);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49690);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49691);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49692);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49693);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49694);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49695);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49696);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_long2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqljo312ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqljo312ch(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49697);
        __CLR4_4_111ob11oblgchosc4.R.inc(49698);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_111ob11oblgchosc4.R.inc(49699);long ms =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_111ob11oblgchosc4.R.inc(49700);test.add(ms);
        // only time fields are precise
        __CLR4_4_111ob11oblgchosc4.R.inc(49701);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450
        __CLR4_4_111ob11oblgchosc4.R.inc(49702);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49703);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49704);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49705);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49706);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49707);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49708);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_long3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhlkvm12ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhlkvm12ct(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49709);
        __CLR4_4_111ob11oblgchosc4.R.inc(49710);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49711);test.add(2100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49712);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49713);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49714);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49715);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49716);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49717);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49718);assertEquals(9, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49719);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_long_Chronology1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184h71v12d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184h71v12d4(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49720);
        __CLR4_4_111ob11oblgchosc4.R.inc(49721);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49722);test.add(100L, ISOChronology.getInstance());
        __CLR4_4_111ob11oblgchosc4.R.inc(49723);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49724);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49725);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49726);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49727);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49728);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49729);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49730);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_long_Chronology2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vh89e12df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vh89e12df(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49731);
        __CLR4_4_111ob11oblgchosc4.R.inc(49732);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_111ob11oblgchosc4.R.inc(49733);long ms =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_111ob11oblgchosc4.R.inc(49734);test.add(ms, ISOChronology.getInstance());
        // only time fields are precise
        __CLR4_4_111ob11oblgchosc4.R.inc(49735);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450 days
        __CLR4_4_111ob11oblgchosc4.R.inc(49736);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49737);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49738);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49739);assertEquals((450 * 24) + 5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49740);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49741);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49742);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_long_Chronology3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mh9gx12dr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_long_Chronology3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mh9gx12dr(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49743);
        __CLR4_4_111ob11oblgchosc4.R.inc(49744);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_111ob11oblgchosc4.R.inc(49745);long ms =
                (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_111ob11oblgchosc4.R.inc(49746);test.add(ms, ISOChronology.getInstanceUTC());
        // UTC, so weeks and day also precise
        __CLR4_4_111ob11oblgchosc4.R.inc(49747);assertEquals(0, test.getYears());  // (4 + (3 * 7) + (2 * 30) + 365) == 450 days
        __CLR4_4_111ob11oblgchosc4.R.inc(49748);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49749);assertEquals(64, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49750);assertEquals(2, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49751);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49752);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49753);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49754);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RD1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owfs4612e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owfs4612e3(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49755);
        __CLR4_4_111ob11oblgchosc4.R.inc(49756);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49757);test.add(new Duration(100L));
        __CLR4_4_111ob11oblgchosc4.R.inc(49758);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49759);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49760);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49761);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49762);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49763);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49764);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49765);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RD2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s5fqwn12ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49766,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s5fqwn12ee(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49766);
        __CLR4_4_111ob11oblgchosc4.R.inc(49767);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49768);long ms =
                (4L + (3L * 7L)) * DateTimeConstants.MILLIS_PER_DAY +
                        5L * DateTimeConstants.MILLIS_PER_HOUR +
                        6L * DateTimeConstants.MILLIS_PER_MINUTE +
                        7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
        __CLR4_4_111ob11oblgchosc4.R.inc(49769);test.add(new Duration(ms));
        __CLR4_4_111ob11oblgchosc4.R.inc(49770);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49771);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49772);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49773);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49774);assertEquals((4 + (3 * 7)) * 24 + 5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49775);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49776);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49777);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RD3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vefpp412eq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vefpp412eq(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49778);
        __CLR4_4_111ob11oblgchosc4.R.inc(49779);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49780);test.add((ReadableDuration) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49781);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49782);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49783);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49784);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49785);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49786);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49787);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49788);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RP1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd6cqy12f1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd6cqy12f1(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49789);
        __CLR4_4_111ob11oblgchosc4.R.inc(49790);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49791);test.add(new Period(100L));
        __CLR4_4_111ob11oblgchosc4.R.inc(49792);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49793);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49794);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49795);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49796);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49797);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49798);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49799);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RP2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tm6bjf12fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tm6bjf12fc(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49800);
        __CLR4_4_111ob11oblgchosc4.R.inc(49801);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());  // All type
        __CLR4_4_111ob11oblgchosc4.R.inc(49802);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 0, PeriodType.standard().withMillisRemoved()));
        // add field value, ignore different types
        __CLR4_4_111ob11oblgchosc4.R.inc(49803);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49804);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49805);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49806);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49807);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49808);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49809);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49810);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RP3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wv6abw12fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wv6abw12fn(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49811);
        __CLR4_4_111ob11oblgchosc4.R.inc(49812);MutablePeriod test = new MutablePeriod(100L, PeriodType.standard());
        __CLR4_4_111ob11oblgchosc4.R.inc(49813);test.add(new Period(0L));
        __CLR4_4_111ob11oblgchosc4.R.inc(49814);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49815);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49816);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49817);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49818);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49819);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49820);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49821);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RP4() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywxsur12fy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywxsur12fy(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49822);
        __CLR4_4_111ob11oblgchosc4.R.inc(49823);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49824);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49825);test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8));  // cannot set weeks
            __CLR4_4_111ob11oblgchosc4.R.inc(49826);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_111ob11oblgchosc4.R.inc(49827);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49828);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49829);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49830);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49831);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49832);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49833);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49834);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RP5() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnxu2a12gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnxu2a12gb(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49835);
        __CLR4_4_111ob11oblgchosc4.R.inc(49836);MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49837);test.add(new Period(1, 2, 0, 4, 5, 6, 7, 8));  // can set weeks as zero
        __CLR4_4_111ob11oblgchosc4.R.inc(49838);assertEquals(2, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49839);assertEquals(4, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49840);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49841);assertEquals(8, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49842);assertEquals(10, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49843);assertEquals(12, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49844);assertEquals(14, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49845);assertEquals(16, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RP6() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sexv9t12gm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sexv9t12gm(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49846);
        __CLR4_4_111ob11oblgchosc4.R.inc(49847);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49848);test.add((ReadablePeriod) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49849);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49850);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49851);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49852);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49853);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49854);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49855);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49856);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAdd_RInterval1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rshu2912gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rshu2912gx(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49857);
        __CLR4_4_111ob11oblgchosc4.R.inc(49858);MutablePeriod test = new MutablePeriod(100L);
        __CLR4_4_111ob11oblgchosc4.R.inc(49859);test.add(new Interval(100L, 200L));
        __CLR4_4_111ob11oblgchosc4.R.inc(49860);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49861);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49862);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49863);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49864);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49865);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49866);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49867);assertEquals(200, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RInterval2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1hsuq12h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1hsuq12h8(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49868);
        __CLR4_4_111ob11oblgchosc4.R.inc(49869);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49870);DateTime dt2 = new DateTime(2005, 12, 18, 0, 0, 0, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49871);MutablePeriod test = new MutablePeriod(100L);  // All type
        __CLR4_4_111ob11oblgchosc4.R.inc(49872);test.add(new Interval(dt1, dt2));
        __CLR4_4_111ob11oblgchosc4.R.inc(49873);assertEquals(1, test.getYears());  // add field value from interval
        __CLR4_4_111ob11oblgchosc4.R.inc(49874);assertEquals(6, test.getMonths());  // add field value from interval
        __CLR4_4_111ob11oblgchosc4.R.inc(49875);assertEquals(1, test.getWeeks());  // add field value from interval
        __CLR4_4_111ob11oblgchosc4.R.inc(49876);assertEquals(2, test.getDays());  // add field value from interval
        __CLR4_4_111ob11oblgchosc4.R.inc(49877);assertEquals(0, test.getHours());  // time zone OK
        __CLR4_4_111ob11oblgchosc4.R.inc(49878);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49879);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49880);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RInterval3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yahrn712hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yahrn712hl(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49881);
        __CLR4_4_111ob11oblgchosc4.R.inc(49882);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49883);test.add(new Interval(0L, 0L));
        __CLR4_4_111ob11oblgchosc4.R.inc(49884);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49885);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49886);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49887);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49888);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49889);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49890);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49891);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RInterval4() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhmbjg12hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhmbjg12hw(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49892);
        __CLR4_4_111ob11oblgchosc4.R.inc(49893);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_111ob11oblgchosc4.R.inc(49894);DateTime dt2 = new DateTime(2005, 7, 17, 0, 0, 0, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49895);MutablePeriod test = new MutablePeriod(100L, PeriodType.yearMonthDayTime());
        __CLR4_4_111ob11oblgchosc4.R.inc(49896);test.add(new Interval(dt1, dt2));
        __CLR4_4_111ob11oblgchosc4.R.inc(49897);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49898);assertEquals(1, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49899);assertEquals(0, test.getWeeks());  // no weeks
        __CLR4_4_111ob11oblgchosc4.R.inc(49900);assertEquals(8, test.getDays());  // week added to days
        __CLR4_4_111ob11oblgchosc4.R.inc(49901);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49902);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49903);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49904);assertEquals(108, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testAdd_RInterval5() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8mcqz12i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testAdd_RInterval5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8mcqz12i9(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49905);
        __CLR4_4_111ob11oblgchosc4.R.inc(49906);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49907);test.add((ReadableInterval) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49908);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49909);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49910);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49911);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49912);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49913);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49914);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49915);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMergePeriod_RP1() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tminpa12ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tminpa12ik(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49916);
        __CLR4_4_111ob11oblgchosc4.R.inc(49917);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49918);test.mergePeriod(new MutablePeriod(0, 0, 0, 14, 15, 16, 17, 18, PeriodType.dayTime()));
        __CLR4_4_111ob11oblgchosc4.R.inc(49919);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49920);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49921);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49922);assertEquals(14, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49923);assertEquals(15, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49924);assertEquals(16, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49925);assertEquals(17, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49926);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testMergePeriod_RP2() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdiowt12iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdiowt12iv(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49927);
        __CLR4_4_111ob11oblgchosc4.R.inc(49928);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49929);try {
            __CLR4_4_111ob11oblgchosc4.R.inc(49930);test.mergePeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
            __CLR4_4_111ob11oblgchosc4.R.inc(49931);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_111ob11oblgchosc4.R.inc(49932);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49933);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49934);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49935);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49936);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49937);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49938);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49939);assertEquals(100, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testMergePeriod_RP3() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4iq4c12j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4iq4c12j8(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49940);
        __CLR4_4_111ob11oblgchosc4.R.inc(49941);MutablePeriod test = new MutablePeriod(100L, PeriodType.millis());
        __CLR4_4_111ob11oblgchosc4.R.inc(49942);test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18));
        __CLR4_4_111ob11oblgchosc4.R.inc(49943);assertEquals(0, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49944);assertEquals(0, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49945);assertEquals(0, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49946);assertEquals(0, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49947);assertEquals(0, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49948);assertEquals(0, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49949);assertEquals(0, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49950);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testMergePeriod_RP4() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jvirbv12jj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jvirbv12jj(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49951);
        __CLR4_4_111ob11oblgchosc4.R.inc(49952);MutablePeriod test = new MutablePeriod(0, 0, 0, 0, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49953);test.mergePeriod(new MutablePeriod(11, 12, 13, 14, 15, 16, 17, 18));
        __CLR4_4_111ob11oblgchosc4.R.inc(49954);assertEquals(11, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49955);assertEquals(12, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49956);assertEquals(13, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49957);assertEquals(14, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49958);assertEquals(15, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49959);assertEquals(16, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49960);assertEquals(17, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49961);assertEquals(18, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

    @Test
    public void testMergePeriod_RP5() {__CLR4_4_111ob11oblgchosc4.R.globalSliceStart(getClass().getName(),49962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmisje12ju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_111ob11oblgchosc4.R.rethrow($CLV_t2$);}finally{__CLR4_4_111ob11oblgchosc4.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestMutablePeriod_Updates.testMergePeriod_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),49962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmisje12ju(){try{__CLR4_4_111ob11oblgchosc4.R.inc(49962);
        __CLR4_4_111ob11oblgchosc4.R.inc(49963);MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_111ob11oblgchosc4.R.inc(49964);test.mergePeriod((ReadablePeriod) null);
        __CLR4_4_111ob11oblgchosc4.R.inc(49965);assertEquals(1, test.getYears());
        __CLR4_4_111ob11oblgchosc4.R.inc(49966);assertEquals(2, test.getMonths());
        __CLR4_4_111ob11oblgchosc4.R.inc(49967);assertEquals(3, test.getWeeks());
        __CLR4_4_111ob11oblgchosc4.R.inc(49968);assertEquals(4, test.getDays());
        __CLR4_4_111ob11oblgchosc4.R.inc(49969);assertEquals(5, test.getHours());
        __CLR4_4_111ob11oblgchosc4.R.inc(49970);assertEquals(6, test.getMinutes());
        __CLR4_4_111ob11oblgchosc4.R.inc(49971);assertEquals(7, test.getSeconds());
        __CLR4_4_111ob11oblgchosc4.R.inc(49972);assertEquals(8, test.getMillis());
    }finally{__CLR4_4_111ob11oblgchosc4.R.flushNeeded();}}

}
