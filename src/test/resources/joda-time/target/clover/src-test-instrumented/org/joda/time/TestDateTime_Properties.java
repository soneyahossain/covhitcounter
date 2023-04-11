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

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestDateTime_Properties {static class __CLR4_4_1n0bn0blgchorrg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,31054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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

    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1n0bn0blgchorrg.R.inc(29819);
        __CLR4_4_1n0bn0blgchorrg.R.inc(29820);TestDateTime_Properties TB = new TestDateTime_Properties();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29821);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29822);TB.testTest();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29823);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29824);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29825);TB.testPropertyGetEra();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29826);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29827);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29828);TB.testPropertyGetYearOfEra();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29829);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29830);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29831);TB.testPropertyGetCenturyOfEra();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29832);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29833);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29834);TB.testPropertyGetYearOfCentury();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29835);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29836);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29837);TB.testPropertyGetWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29838);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29839);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29840);TB.testPropertyGetYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29841);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29842);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29843);TB.testPropertyLeapYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29844);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29845);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29846);TB.testPropertyAddYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29847);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29848);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29849);TB.testPropertyAddWrapFieldYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29850);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29851);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29852);TB.testPropertySetYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29853);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29854);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29855);TB.testPropertySetTextYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29856);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29857);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29858);TB.testPropertyCompareToYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29859);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29860);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29861);TB.testPropertyCompareToYear2();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29862);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29863);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29864);TB.testPropertyEqualsHashCodeYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29865);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29866);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29867);TB.testPropertyGetMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29868);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29869);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29870);TB.testPropertyLeapMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29871);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29872);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29873);TB.testPropertyAddMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29874);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29875);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29876);TB.testPropertyAddWrapFieldMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29877);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29878);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29879);TB.testPropertySetMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29880);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29881);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29882);TB.testPropertySetTextMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29883);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29884);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29885);TB.testPropertyCompareToMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29886);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29887);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29888);TB.testPropertyGetDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29889);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29890);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29891);TB.testPropertyGetMaxMinValuesDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29892);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29893);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29894);TB.testPropertyAddDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29895);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29896);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29897);TB.testPropertyAddWrapFieldDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29898);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29899);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29900);TB.testPropertySetDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29901);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29902);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29903);TB.testPropertySetTextDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29904);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29905);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29906);TB.testPropertyWithMaximumValueDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29907);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29908);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29909);TB.testPropertyWithMaximumValueMillisOfDayDSTGap();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29910);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29911);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29912);TB.testPropertyWithMinimumValueDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29913);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29914);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29915);TB.testPropertyWithMinimumValueMillisOfDayDSTGap();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29916);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29917);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29918);TB.testPropertyCompareToDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29919);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29920);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29921);TB.testPropertyGetDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29922);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29923);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29924);TB.testPropertyGetMaxMinValuesDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29925);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29926);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29927);TB.testPropertyAddDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29928);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29929);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29930);TB.testPropertyAddWrapFieldDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29931);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29932);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29933);TB.testPropertySetDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29934);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29935);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29936);TB.testPropertySetTextDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29937);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29938);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29939);TB.testPropertyCompareToDayOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29940);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29941);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29942);TB.testPropertyGetWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29943);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29944);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29945);TB.testPropertyGetMaxMinValuesWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29946);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29947);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29948);TB.testPropertyAddWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29949);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29950);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29951);TB.testPropertyAddWrapFieldWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29952);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29953);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29954);TB.testPropertySetWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29955);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29956);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29957);TB.testPropertySetTextWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29958);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29959);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29960);TB.testPropertyCompareToWeekOfWeekyear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29961);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29962);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29963);TB.testPropertyGetDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29964);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29965);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29966);TB.testPropertyAddDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29967);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29968);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29969);TB.testPropertyAddLongDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29970);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29971);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29972);TB.testPropertyAddWrapFieldDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29973);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29974);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29975);TB.testPropertySetDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29976);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29977);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29978);TB.testPropertySetTextDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29979);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29980);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29981);TB.testPropertyCompareToDayOfWeek();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29982);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29983);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29984);TB.testPropertyGetHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29985);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29986);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29987);TB.testPropertyGetDifferenceHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29988);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29989);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29990);TB.testPropertyRoundFloorHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29991);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29992);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29993);TB.testPropertyRoundCeilingHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29994);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29995);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29996);TB.testPropertyRoundHalfFloorHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29997);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29998);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(29999);TB.testPropertyRoundHalfCeilingHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30000);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30001);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30002);TB.testPropertyRoundHalfEvenHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30003);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30004);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30005);TB.testPropertyRemainderHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30006);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30007);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30008);TB.testPropertyGetMinuteOfHour();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30009);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30010);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30011);TB.testPropertyGetMinuteOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30012);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30013);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30014);TB.testPropertyGetSecondOfMinute();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30015);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30016);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30017);TB.testPropertyGetSecondOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30018);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30019);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30020);TB.testPropertyGetMillisOfSecond();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30021);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30022);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30023);TB.testPropertyGetMillisOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30024);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30025);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30026);TB.testPropertyToIntervalYearOfEra();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30027);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30028);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30029);TB.testPropertyToIntervalYearOfCentury();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30030);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30031);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30032);TB.testPropertyToIntervalYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30033);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30034);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30035);TB.testPropertyToIntervalMonthOfYear();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30036);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30037);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30038);TB.testPropertyToIntervalDayOfMonth();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30039);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30040);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30041);TB.testPropertyToIntervalHourOfDay();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30042);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30043);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30044);TB.testPropertyToIntervalMinuteOfHour();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30045);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30046);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30047);TB.testPropertyToIntervalSecondOfMinute();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30048);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30049);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30050);TB.testPropertyToIntervalMillisOfSecond();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30051);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30052);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30053);TB.testPropertyEqualsHashCodeLenient();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30054);TB.tearDown();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30055);TB.setUp();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30056);TB.testPropertyEqualsHashCodeStrict();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30057);TB.tearDown();

    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTime_Properties.class);
    }

    public TestDateTime_Properties(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1n0bn0blgchorrg.R.inc(30058);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30059);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30060);zone = DateTimeZone.getDefault();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30061);locale = Locale.getDefault();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30062);DateTimeZone.setDefault(LONDON);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30063);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1n0bn0blgchorrg.R.inc(30064);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30065);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30066);DateTimeZone.setDefault(zone);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30067);Locale.setDefault(locale);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30068);zone = null;
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjn79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjn79(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30069);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30070);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30071);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30072);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetEra() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gfrqkn7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gfrqkn7d(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30073);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30074);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30075);assertSame(test.getChronology().era(), test.era().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30076);assertEquals("era", test.era().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30077);assertEquals("Property[era]", test.era().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30078);assertSame(test, test.era().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30079);assertEquals(1, test.era().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30080);assertEquals("1", test.era().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30081);assertEquals("AD", test.era().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30082);assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30083);assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30084);assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30085);assertEquals("AD", test.era().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30086);assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30087);assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30088);assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30089);assertEquals(test.getChronology().eras(), test.era().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30090);assertEquals(null, test.era().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30091);assertEquals(2, test.era().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30092);assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30093);assertEquals(2, test.era().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30094);assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYearOfEra() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12tr0dkn7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12tr0dkn7z(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30095);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30096);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30097);assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30098);assertEquals("yearOfEra", test.yearOfEra().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30099);assertEquals("Property[yearOfEra]", test.yearOfEra().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30100);assertSame(test, test.yearOfEra().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30101);assertEquals(2004, test.yearOfEra().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30102);assertEquals("2004", test.yearOfEra().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30103);assertEquals("2004", test.yearOfEra().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30104);assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30105);assertEquals("2004", test.yearOfEra().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30106);assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30107);assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30108);assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30109);assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30110);assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetCenturyOfEra() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nozc5dn8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetCenturyOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nozc5dn8f(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30111);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30112);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30113);assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30114);assertEquals("centuryOfEra", test.centuryOfEra().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30115);assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30116);assertSame(test, test.centuryOfEra().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30117);assertEquals(20, test.centuryOfEra().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30118);assertEquals("20", test.centuryOfEra().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30119);assertEquals("20", test.centuryOfEra().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30120);assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30121);assertEquals("20", test.centuryOfEra().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30122);assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30123);assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30124);assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30125);assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30126);assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYearOfCentury() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6mt7cn8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6mt7cn8v(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30127);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30128);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30129);assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30130);assertEquals("yearOfCentury", test.yearOfCentury().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30131);assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30132);assertSame(test, test.yearOfCentury().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30133);assertEquals(4, test.yearOfCentury().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30134);assertEquals("4", test.yearOfCentury().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30135);assertEquals("4", test.yearOfCentury().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30136);assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30137);assertEquals("4", test.yearOfCentury().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30138);assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30139);assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30140);assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30141);assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30142);assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1izv1ndn9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1izv1ndn9b(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30143);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30144);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30145);assertSame(test.getChronology().weekyear(), test.weekyear().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30146);assertEquals("weekyear", test.weekyear().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30147);assertEquals("Property[weekyear]", test.weekyear().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30148);assertSame(test, test.weekyear().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30149);assertEquals(2004, test.weekyear().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30150);assertEquals("2004", test.weekyear().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30151);assertEquals("2004", test.weekyear().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30152);assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30153);assertEquals("2004", test.weekyear().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30154);assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30155);assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30156);assertEquals(null, test.weekyear().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30157);assertEquals(9, test.weekyear().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30158);assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbn9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbn9r(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30159);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30160);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30161);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30162);assertEquals("year", test.year().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30163);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30164);assertSame(test, test.year().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30165);assertEquals(2004, test.year().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30166);assertEquals("2004", test.year().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30167);assertEquals("2004", test.year().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30168);assertEquals("2004", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30169);assertEquals("2004", test.year().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30170);assertEquals("2004", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30171);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30172);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30173);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30174);assertEquals(9, test.year().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30175);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30176);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30177);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30178);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyLeapYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ty437nab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ty437nab(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30179);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30180);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30181);assertEquals(true, test.year().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30182);assertEquals(1, test.year().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30183);assertEquals(test.getChronology().days(), test.year().getLeapDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30184);test = new DateTime(2003, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30185);assertEquals(false, test.year().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30186);assertEquals(0, test.year().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30187);assertEquals(test.getChronology().days(), test.year().getLeapDurationField());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefynak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefynak(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30188);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30189);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30190);DateTime copy = test.year().addToCopy(9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30191);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30192);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30193);copy = test.year().addToCopy(0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30194);assertEquals("2004-06-09T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30195);copy = test.year().addToCopy(292277023 - 2004);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30196);assertEquals(292277023, copy.getYear());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30197);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30198);test.year().addToCopy(292278993 - 2004 + 1);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30199);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1n0bn0blgchorrg.R.inc(30200);copy = test.year().addToCopy(-2004);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30201);assertEquals(0, copy.getYear());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30202);copy = test.year().addToCopy(-2005);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30203);assertEquals(-1, copy.getYear());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30204);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30205);test.year().addToCopy(-292275054 - 2004 - 1);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30206);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig6nb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig6nb3(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30207);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30208);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30209);DateTime copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30210);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30211);assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30212);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30213);assertEquals(2004, copy.getYear());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30214);copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30215);assertEquals(-292275054, copy.getYear());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30216);copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30217);assertEquals(292278993, copy.getYear());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwxnbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwxnbe(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30218);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30219);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30220);DateTime copy = test.year().setCopy(1960);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30221);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30222);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetTextYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4snbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4snbj(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30223);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30224);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30225);DateTime copy = test.year().setCopy("1960");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30226);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30227);assertEquals("1960-06-09T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7abnbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7abnbo(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30228);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30229);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30230);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30231);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30232);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30233);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30234);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30235);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30236);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testPropertyCompareToYear2() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6ayqrnbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToYear2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6ayqrnbx(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30237);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30238);DateTime test1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30239);YearMonthDay ymd1 = new YearMonthDay(2003, 6, 9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30240);YearMonthDay ymd2 = new YearMonthDay(2004, 6, 9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30241);YearMonthDay ymd3 = new YearMonthDay(2005, 6, 9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30242);assertEquals(true, test1.year().compareTo(ymd1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30243);assertEquals(true, test1.year().compareTo(ymd2) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30244);assertEquals(true, test1.year().compareTo(ymd3) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30245);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30246);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30247);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yslkrnc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yslkrnc8(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30248);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30249);DateTime test1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30250);assertEquals(true, test1.year().equals(test1.year()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30251);assertEquals(true, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0).year()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30252);assertEquals(false, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0).monthOfYear()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30253);assertEquals(false, test1.year().equals(new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()).year()));

        __CLR4_4_1n0bn0blgchorrg.R.inc(30254);assertEquals(true, test1.year().hashCode() == test1.year().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30255);assertEquals(true, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0).year().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30256);assertEquals(false, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0).monthOfYear().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30257);assertEquals(false, test1.year().hashCode() == new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()).year().hashCode());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140q40knci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140q40knci(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30258);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30259);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30260);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30261);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30262);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30263);assertSame(test, test.monthOfYear().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30264);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30265);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30266);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30267);assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30268);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30269);assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30270);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30271);assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30272);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30273);assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30274);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30275);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30276);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30277);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30278);test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30279);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30280);assertEquals("juillet", test.monthOfYear().getField().getAsText(7, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30281);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30282);assertEquals("juil.", test.monthOfYear().getField().getAsShortText(7, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30283);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30284);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30285);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30286);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30287);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30288);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30289);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30290);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyLeapMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u62jn0ndf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyLeapMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u62jn0ndf(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30291);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30292);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30293);assertEquals(false, test.monthOfYear().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30294);assertEquals(0, test.monthOfYear().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30295);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30296);test = new DateTime(2004, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30297);assertEquals(true, test.monthOfYear().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30298);assertEquals(1, test.monthOfYear().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30299);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30300);test = new DateTime(2003, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30301);assertEquals(false, test.monthOfYear().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30302);assertEquals(0, test.monthOfYear().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30303);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30304);test = new DateTime(2003, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30305);assertEquals(false, test.monthOfYear().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30306);assertEquals(0, test.monthOfYear().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30307);assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfd7jndw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfd7jndw(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30308);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30309);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30310);DateTime copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30311);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30312);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30313);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30314);assertEquals("2005-01-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30315);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30316);assertEquals("2004-01-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30317);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30318);assertEquals("2003-12-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30319);test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30320);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30321);assertEquals("2004-01-31T00:00:00.000Z", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30322);assertEquals("2004-02-29T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30323);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30324);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30325);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30326);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30327);test = new DateTime(2003, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30328);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30329);assertEquals("2003-02-28T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phvuslnei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phvuslnei(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30330);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30331);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30332);DateTime copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30333);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30334);assertEquals("2004-10-09T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30335);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30336);assertEquals("2004-02-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30337);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30338);assertEquals("2004-10-09T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30339);test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30340);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30341);assertEquals("2004-01-31T00:00:00.000Z", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30342);assertEquals("2004-02-29T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30343);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30344);assertEquals("2004-03-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30345);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30346);assertEquals("2004-04-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30347);test = new DateTime(2005, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30348);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30349);assertEquals("2005-01-31T00:00:00.000Z", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30350);assertEquals("2005-02-28T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2imu8nf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2imu8nf3(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30351);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30352);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30353);DateTime copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30354);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30355);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30356);test = new DateTime(2004, 1, 31, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30357);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30358);assertEquals("2004-02-29T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30359);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30360);test.monthOfYear().setCopy(13);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30361);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1n0bn0blgchorrg.R.inc(30362);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30363);test.monthOfYear().setCopy(0);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30364);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kzotlfnfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kzotlfnfh(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30365);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30366);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30367);DateTime copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30368);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30369);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30370);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30371);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30372);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30373);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30374);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30375);assertEquals("2004-12-09T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q9bnr6nfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q9bnr6nfs(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30376);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30377);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30378);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30379);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30380);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30381);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30382);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30383);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30384);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1n0bn0blgchorrg.R.inc(30385);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30386);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30387);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30388);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30389);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30390);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30391);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30392);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1198qu5ng9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1198qu5ng9(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30393);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30394);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30395);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30396);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30397);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30398);assertSame(test, test.dayOfMonth().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30399);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30400);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30401);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30402);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30403);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30404);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30405);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30406);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30407);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30408);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30409);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30410);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30411);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30412);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30413);assertEquals(false, test.dayOfMonth().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30414);assertEquals(0, test.dayOfMonth().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30415);assertEquals(null, test.dayOfMonth().getLeapDurationField());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zmdrhngw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zmdrhngw(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30416);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30417);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30418);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30419);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30420);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30421);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30422);test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30423);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30424);test = new DateTime(2004, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30425);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30426);test = new DateTime(2003, 2, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30427);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1ulyqnh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1ulyqnh8(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30428);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30429);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30430);DateTime copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30431);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30432);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30433);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30434);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30435);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30436);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30437);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30438);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30439);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30440);assertEquals("2004-08-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30441);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30442);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30443);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30444);assertEquals("2005-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30445);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30446);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30447);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30448);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30449);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30450);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30451);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30452);assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfyjyinhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfyjyinhx(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30453);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30454);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30455);DateTime copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30456);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30457);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30458);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30459);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30460);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30461);assertEquals("2004-06-27T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30462);test = new DateTime(2004, 7, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30463);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30464);assertEquals("2004-07-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30465);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30466);assertEquals("2004-07-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30467);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30468);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30469);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30470);assertEquals("2004-07-28T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz1n4hnif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz1n4hnif(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30471);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30472);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30473);DateTime copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30474);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30475);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30476);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30477);test.dayOfMonth().setCopy(31);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30478);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1n0bn0blgchorrg.R.inc(30479);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30480);test.dayOfMonth().setCopy(0);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30481);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144rzx8niq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144rzx8niq(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30482);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30483);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30484);DateTime copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30485);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30486);assertEquals("2004-06-12T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9eniv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9eniv(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30487);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30488);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30489);DateTime copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30490);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30491);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueMillisOfDayDSTGap() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgr0snnj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMaximumValueMillisOfDayDSTGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgr0snnj0(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30492);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30493);DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30494);DateTime dt = new DateTime(1926, 4, 17, 18, 0, 0, 0, paris);  // DST gap 23:00 to 00:00
        __CLR4_4_1n0bn0blgchorrg.R.inc(30495);DateTime test = dt.millisOfDay().withMaximumValue();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30496);assertEquals("1926-04-17T22:59:59.999Z", test.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofeknj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofeknj5(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30497);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30498);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30499);DateTime copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30500);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30501);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueMillisOfDayDSTGap() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uctn8nnja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyWithMinimumValueMillisOfDayDSTGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uctn8nnja(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30502);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30503);DateTimeZone gaza = DateTimeZone.forID("Asia/Gaza");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30504);DateTime dt = new DateTime(2001, 4, 20, 18, 0, 0, 0, gaza);  // DST gap 00:00 to 01:00
        __CLR4_4_1n0bn0blgchorrg.R.inc(30505);DateTime test = dt.millisOfDay().withMinimumValue();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30506);assertEquals("2001-04-20T01:00:00.000+03:00", test.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcwl0znjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcwl0znjf(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30507);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30508);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30509);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30510);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30511);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30512);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30513);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30514);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30515);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1n0bn0blgchorrg.R.inc(30516);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30517);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30518);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30519);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30520);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30521);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30522);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30523);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fvk08njw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fvk08njw(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30524);
        // 31+29+31+30+31+9 = 161
        __CLR4_4_1n0bn0blgchorrg.R.inc(30525);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30526);assertSame(test.getChronology().dayOfYear(), test.dayOfYear().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30527);assertEquals("dayOfYear", test.dayOfYear().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30528);assertEquals("Property[dayOfYear]", test.dayOfYear().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30529);assertSame(test, test.dayOfYear().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30530);assertEquals(161, test.dayOfYear().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30531);assertEquals("161", test.dayOfYear().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30532);assertEquals("161", test.dayOfYear().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30533);assertEquals("161", test.dayOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30534);assertEquals("161", test.dayOfYear().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30535);assertEquals("161", test.dayOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30536);assertEquals(test.getChronology().days(), test.dayOfYear().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30537);assertEquals(test.getChronology().years(), test.dayOfYear().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30538);assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30539);assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30540);assertEquals(false, test.dayOfYear().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30541);assertEquals(0, test.dayOfYear().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30542);assertEquals(null, test.dayOfYear().getLeapDurationField());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u51gm0nkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u51gm0nkf(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30543);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30544);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30545);assertEquals(1, test.dayOfYear().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30546);assertEquals(1, test.dayOfYear().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30547);assertEquals(366, test.dayOfYear().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30548);assertEquals(366, test.dayOfYear().getMaximumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30549);test = new DateTime(2002, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30550);assertEquals(365, test.dayOfYear().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30551);assertEquals(366, test.dayOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14adoxpnko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14adoxpnko(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30552);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30553);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30554);DateTime copy = test.dayOfYear().addToCopy(9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30555);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30556);assertEquals("2004-06-18T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30557);copy = test.dayOfYear().addToCopy(21);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30558);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30559);copy = test.dayOfYear().addToCopy(22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30560);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30561);copy = test.dayOfYear().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30562);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30563);copy = test.dayOfYear().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30564);assertEquals("2005-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30565);copy = test.dayOfYear().addToCopy(-8);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30566);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30567);copy = test.dayOfYear().addToCopy(-9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30568);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30569);copy = test.dayOfYear().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30570);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30571);copy = test.dayOfYear().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30572);assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_137fnwhnl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_137fnwhnl9(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30573);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30574);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30575);DateTime copy = test.dayOfYear().addWrapFieldToCopy(21);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30576);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30577);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30578);copy = test.dayOfYear().addWrapFieldToCopy(22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30579);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30580);copy = test.dayOfYear().addWrapFieldToCopy(-12);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30581);assertEquals("2004-05-28T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30582);copy = test.dayOfYear().addWrapFieldToCopy(205);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30583);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30584);copy = test.dayOfYear().addWrapFieldToCopy(206);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30585);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30586);copy = test.dayOfYear().addWrapFieldToCopy(-160);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30587);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30588);copy = test.dayOfYear().addWrapFieldToCopy(-161);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30589);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tizt30nlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tizt30nlq(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30590);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30591);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30592);DateTime copy = test.dayOfYear().setCopy(12);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30593);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30594);assertEquals("2004-01-12T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30595);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30596);test.dayOfYear().setCopy(367);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30597);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1n0bn0blgchorrg.R.inc(30598);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30599);test.dayOfYear().setCopy(0);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30600);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hprj4hnm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hprj4hnm1(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30601);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30602);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30603);DateTime copy = test.dayOfYear().setCopy("12");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30604);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30605);assertEquals("2004-01-12T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDayOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0og4inm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0og4inm6(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30606);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30607);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30608);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30609);assertEquals(true, test1.dayOfYear().compareTo(test2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30610);assertEquals(true, test2.dayOfYear().compareTo(test1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30611);assertEquals(true, test1.dayOfYear().compareTo(test1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30612);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30613);test1.dayOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30614);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1n0bn0blgchorrg.R.inc(30615);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30616);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30617);assertEquals(true, test1.dayOfYear().compareTo(dt2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30618);assertEquals(true, test2.dayOfYear().compareTo(dt1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30619);assertEquals(true, test1.dayOfYear().compareTo(dt1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30620);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30621);test1.dayOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30622);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oty2c2nmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oty2c2nmn(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30623);
        // 2002-01-01 = Thu
        // 2002-12-31 = Thu (+364 days)
        // 2003-12-30 = Thu (+364 days)
        // 2004-01-03 = Mon             W1
        // 2004-01-31 = Mon (+28 days)  W5
        // 2004-02-28 = Mon (+28 days)  W9
        // 2004-03-27 = Mon (+28 days)  W13
        // 2004-04-24 = Mon (+28 days)  W17
        // 2004-05-23 = Mon (+28 days)  W21
        // 2004-06-05 = Mon (+14 days)  W23
        // 2004-06-09 = Fri
        // 2004-12-25 = Mon             W52
        // 2005-01-01 = Mon             W1
        __CLR4_4_1n0bn0blgchorrg.R.inc(30624);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30625);assertSame(test.getChronology().weekOfWeekyear(), test.weekOfWeekyear().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30626);assertEquals("weekOfWeekyear", test.weekOfWeekyear().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30627);assertEquals("Property[weekOfWeekyear]", test.weekOfWeekyear().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30628);assertSame(test, test.weekOfWeekyear().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30629);assertEquals(24, test.weekOfWeekyear().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30630);assertEquals("24", test.weekOfWeekyear().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30631);assertEquals("24", test.weekOfWeekyear().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30632);assertEquals("24", test.weekOfWeekyear().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30633);assertEquals("24", test.weekOfWeekyear().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30634);assertEquals("24", test.weekOfWeekyear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30635);assertEquals(test.getChronology().weeks(), test.weekOfWeekyear().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30636);assertEquals(test.getChronology().weekyears(), test.weekOfWeekyear().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30637);assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30638);assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30639);assertEquals(false, test.weekOfWeekyear().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30640);assertEquals(0, test.weekOfWeekyear().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30641);assertEquals(null, test.weekOfWeekyear().getLeapDurationField());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161bj0inn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMaxMinValuesWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161bj0inn6(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30642);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30643);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30644);assertEquals(1, test.weekOfWeekyear().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30645);assertEquals(1, test.weekOfWeekyear().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30646);assertEquals(53, test.weekOfWeekyear().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30647);assertEquals(53, test.weekOfWeekyear().getMaximumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30648);test = new DateTime(2005, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30649);assertEquals(52, test.weekOfWeekyear().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30650);assertEquals(53, test.weekOfWeekyear().getMaximumValueOverall());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o69karnnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o69karnnf(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30651);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30652);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30653);DateTime copy = test.weekOfWeekyear().addToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30654);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30655);assertEquals("2004-06-14T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30656);copy = test.weekOfWeekyear().addToCopy(29);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30657);assertEquals("2004-12-27T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30658);copy = test.weekOfWeekyear().addToCopy(30);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30659);assertEquals("2005-01-03T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30660);copy = test.weekOfWeekyear().addToCopy(-22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30661);assertEquals("2004-01-05T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30662);copy = test.weekOfWeekyear().addToCopy(-23);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30663);assertEquals("2003-12-29T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11nrj95nns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11nrj95nns(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30664);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30665);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30666);DateTime copy = test.weekOfWeekyear().addWrapFieldToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30667);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30668);assertEquals("2004-06-14T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30669);copy = test.weekOfWeekyear().addWrapFieldToCopy(29);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30670);assertEquals("2004-12-27T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30671);copy = test.weekOfWeekyear().addWrapFieldToCopy(30);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30672);assertEquals("2003-12-29T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30673);copy = test.weekOfWeekyear().addWrapFieldToCopy(-23);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30674);assertEquals("2003-12-29T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iobpweno3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iobpweno3(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30675);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30676);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30677);DateTime copy = test.weekOfWeekyear().setCopy(4);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30678);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30679);assertEquals("2004-01-19T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30680);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30681);test.weekOfWeekyear().setCopy(54);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30682);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1n0bn0blgchorrg.R.inc(30683);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30684);test.weekOfWeekyear().setCopy(0);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30685);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetTextWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swdyyznoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swdyyznoe(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30686);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30687);DateTime test = new DateTime(2004, 6, 7, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30688);DateTime copy = test.weekOfWeekyear().setCopy("4");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30689);assertEquals("2004-06-07T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30690);assertEquals("2004-01-19T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToWeekOfWeekyear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lona6cnoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToWeekOfWeekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lona6cnoj(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30691);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30692);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30693);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30694);assertEquals(true, test1.weekOfWeekyear().compareTo(test2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30695);assertEquals(true, test2.weekOfWeekyear().compareTo(test1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30696);assertEquals(true, test1.weekOfWeekyear().compareTo(test1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30697);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30698);test1.weekOfWeekyear().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30699);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1n0bn0blgchorrg.R.inc(30700);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30701);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30702);assertEquals(true, test1.weekOfWeekyear().compareTo(dt2) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30703);assertEquals(true, test2.weekOfWeekyear().compareTo(dt1) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30704);assertEquals(true, test1.weekOfWeekyear().compareTo(dt1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30705);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30706);test1.weekOfWeekyear().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30707);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ftu28vnp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ftu28vnp0(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30708);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30709);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30710);assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30711);assertEquals("dayOfWeek", test.dayOfWeek().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30712);assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30713);assertSame(test, test.dayOfWeek().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30714);assertEquals(3, test.dayOfWeek().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30715);assertEquals("3", test.dayOfWeek().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30716);assertEquals("Wednesday", test.dayOfWeek().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30717);assertEquals("Wednesday", test.dayOfWeek().getField().getAsText(3, Locale.ENGLISH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30718);assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30719);assertEquals("mercredi", test.dayOfWeek().getField().getAsText(3, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30720);assertEquals("Wed", test.dayOfWeek().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30721);assertEquals("Wed", test.dayOfWeek().getField().getAsShortText(3, Locale.ENGLISH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30722);assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30723);assertEquals("mer.", test.dayOfWeek().getField().getAsShortText(3, Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30724);assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30725);assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30726);assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30727);assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30728);assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30729);assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30730);assertEquals(1, test.dayOfWeek().getMinimumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30731);assertEquals(1, test.dayOfWeek().getMinimumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30732);assertEquals(7, test.dayOfWeek().getMaximumValue());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30733);assertEquals(7, test.dayOfWeek().getMaximumValueOverall());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30734);assertEquals(false, test.dayOfWeek().isLeap());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30735);assertEquals(0, test.dayOfWeek().getLeapAmount());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30736);assertEquals(null, test.dayOfWeek().getLeapDurationField());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1joc76cnpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1joc76cnpt(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30737);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30738);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30739);DateTime copy = test.dayOfWeek().addToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30740);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30741);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30742);copy = test.dayOfWeek().addToCopy(21);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30743);assertEquals("2004-06-30T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30744);copy = test.dayOfWeek().addToCopy(22);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30745);assertEquals("2004-07-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30746);copy = test.dayOfWeek().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30747);assertEquals("2004-12-31T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30748);copy = test.dayOfWeek().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30749);assertEquals("2005-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30750);copy = test.dayOfWeek().addToCopy(-8);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30751);assertEquals("2004-06-01T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30752);copy = test.dayOfWeek().addToCopy(-9);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30753);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30754);copy = test.dayOfWeek().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30755);assertEquals("2004-01-01T00:00:00.000Z", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30756);copy = test.dayOfWeek().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30757);assertEquals("2003-12-31T00:00:00.000Z", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddLongDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166ne0onqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddLongDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166ne0onqe(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30758);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30759);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30760);DateTime copy = test.dayOfWeek().addToCopy(1L);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30761);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30762);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ile654nqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyAddWrapFieldDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ile654nqj(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30763);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30764);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);  // Wed
        __CLR4_4_1n0bn0blgchorrg.R.inc(30765);DateTime copy = test.dayOfWeek().addWrapFieldToCopy(1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30766);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30767);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30768);copy = test.dayOfWeek().addWrapFieldToCopy(5);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30769);assertEquals("2004-06-07T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30770);copy = test.dayOfWeek().addWrapFieldToCopy(-10);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30771);assertEquals("2004-06-13T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30772);test = new DateTime(2004, 6, 2, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30773);copy = test.dayOfWeek().addWrapFieldToCopy(5);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30774);assertEquals("2004-06-02T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30775);assertEquals("2004-05-31T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q45qnhnqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q45qnhnqw(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30776);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30777);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30778);DateTime copy = test.dayOfWeek().setCopy(4);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30779);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30780);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30781);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30782);test.dayOfWeek().setCopy(8);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30783);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1n0bn0blgchorrg.R.inc(30784);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30785);test.dayOfWeek().setCopy(0);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30786);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertySetTextDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bt0vunr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertySetTextDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bt0vunr7(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30787);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30788);DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30789);DateTime copy = test.dayOfWeek().setCopy("4");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30790);assertEquals("2004-06-09T00:00:00.000+01:00", test.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30791);assertEquals("2004-06-10T00:00:00.000+01:00", copy.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30792);copy = test.dayOfWeek().setCopy("Mon");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30793);assertEquals("2004-06-07T00:00:00.000+01:00", copy.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30794);copy = test.dayOfWeek().setCopy("Tuesday");
        __CLR4_4_1n0bn0blgchorrg.R.inc(30795);assertEquals("2004-06-08T00:00:00.000+01:00", copy.toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30796);copy = test.dayOfWeek().setCopy("lundi", Locale.FRENCH);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30797);assertEquals("2004-06-07T00:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDayOfWeek() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13da245nri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyCompareToDayOfWeek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13da245nri(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30798);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30799);DateTime test1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30800);DateTime test2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30801);assertEquals(true, test2.dayOfWeek().compareTo(test1) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30802);assertEquals(true, test1.dayOfWeek().compareTo(test2) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30803);assertEquals(true, test1.dayOfWeek().compareTo(test1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30804);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30805);test1.dayOfWeek().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30806);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1n0bn0blgchorrg.R.inc(30807);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30808);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30809);assertEquals(true, test2.dayOfWeek().compareTo(dt1) < 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30810);assertEquals(true, test1.dayOfWeek().compareTo(dt2) > 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30811);assertEquals(true, test1.dayOfWeek().compareTo(dt1) == 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30812);try {
            __CLR4_4_1n0bn0blgchorrg.R.inc(30813);test1.dayOfWeek().compareTo((ReadableInstant) null);
            __CLR4_4_1n0bn0blgchorrg.R.inc(30814);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5x06xnrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5x06xnrz(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30815);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30816);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30817);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30818);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30819);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30820);assertSame(test, test.hourOfDay().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30821);assertEquals(13, test.hourOfDay().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30822);assertEquals("13", test.hourOfDay().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30823);assertEquals("13", test.hourOfDay().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30824);assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30825);assertEquals("13", test.hourOfDay().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30826);assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30827);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30828);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30829);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30830);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyGetDifferenceHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nvom5gnsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetDifferenceHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nvom5gnsf(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30831);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30832);DateTime test1 = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30833);DateTime test2 = new DateTime(2004, 6, 9, 15, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30834);assertEquals(-2, test1.hourOfDay().getDifference(test2));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30835);assertEquals(2, test2.hourOfDay().getDifference(test1));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30836);assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30837);assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1));

        __CLR4_4_1n0bn0blgchorrg.R.inc(30838);DateTime test = new DateTime(TEST_TIME_NOW + (13L * DateTimeConstants.MILLIS_PER_HOUR));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30839);assertEquals(13, test.hourOfDay().getDifference(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30840);assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyRoundFloorHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs37ctnsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs37ctnsp(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30841);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30842);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30843);DateTime copy = test.hourOfDay().roundFloorCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30844);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyRoundCeilingHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r72lgunst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r72lgunst(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30845);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30846);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30847);DateTime copy = test.hourOfDay().roundCeilingCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30848);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfFloorHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcihmynsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfFloorHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcihmynsx(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30849);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30850);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30851);DateTime copy = test.hourOfDay().roundHalfFloorCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30852);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30853);test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30854);copy = test.hourOfDay().roundHalfFloorCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30855);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30856);test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30857);copy = test.hourOfDay().roundHalfFloorCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30858);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfCeilingHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xftvaznt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfCeilingHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xftvaznt7(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30859);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30860);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30861);DateTime copy = test.hourOfDay().roundHalfCeilingCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30862);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30863);test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30864);copy = test.hourOfDay().roundHalfCeilingCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30865);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30866);test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30867);copy = test.hourOfDay().roundHalfCeilingCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30868);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHalfEvenHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136gyocnth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRoundHalfEvenHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136gyocnth(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30869);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30870);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30871);DateTime copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30872);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30873);test = new DateTime(2004, 6, 9, 14, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30874);copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30875);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30876);test = new DateTime(2004, 6, 9, 13, 30, 0, 1);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30877);copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30878);assertEquals("2004-06-09T14:00:00.000+01:00", copy.toString());

        __CLR4_4_1n0bn0blgchorrg.R.inc(30879);test = new DateTime(2004, 6, 9, 13, 29, 59, 999);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30880);copy = test.hourOfDay().roundHalfEvenCopy();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30881);assertEquals("2004-06-09T13:00:00.000+01:00", copy.toString());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyRemainderHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sd0idyntu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyRemainderHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sd0idyntu(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30882);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30883);DateTime test = new DateTime(2004, 6, 9, 13, 30, 0, 0);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30884);assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinuteOfHour() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jby1vfntx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jby1vfntx(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30885);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30886);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30887);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30888);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30889);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30890);assertSame(test, test.minuteOfHour().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30891);assertEquals(23, test.minuteOfHour().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30892);assertEquals("23", test.minuteOfHour().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30893);assertEquals("23", test.minuteOfHour().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30894);assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30895);assertEquals("23", test.minuteOfHour().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30896);assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30897);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30898);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30899);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30900);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinuteOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5v12vnud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMinuteOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5v12vnud(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30901);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30902);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30903);assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30904);assertEquals("minuteOfDay", test.minuteOfDay().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30905);assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30906);assertSame(test, test.minuteOfDay().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30907);assertEquals(803, test.minuteOfDay().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30908);assertEquals("803", test.minuteOfDay().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30909);assertEquals("803", test.minuteOfDay().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30910);assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30911);assertEquals("803", test.minuteOfDay().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30912);assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30913);assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30914);assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30915);assertEquals(4, test.minuteOfDay().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30916);assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecondOfMinute() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ul2igbnut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ul2igbnut(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30917);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30918);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30919);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30920);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30921);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30922);assertSame(test, test.secondOfMinute().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30923);assertEquals(43, test.secondOfMinute().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30924);assertEquals("43", test.secondOfMinute().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30925);assertEquals("43", test.secondOfMinute().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30926);assertEquals("43", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30927);assertEquals("43", test.secondOfMinute().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30928);assertEquals("43", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30929);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30930);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30931);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30932);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecondOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1srw4fdnv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetSecondOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1srw4fdnv9(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30933);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30934);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30935);assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30936);assertEquals("secondOfDay", test.secondOfDay().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30937);assertEquals("Property[secondOfDay]", test.secondOfDay().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30938);assertSame(test, test.secondOfDay().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30939);assertEquals(48223, test.secondOfDay().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30940);assertEquals("48223", test.secondOfDay().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30941);assertEquals("48223", test.secondOfDay().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30942);assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30943);assertEquals("48223", test.secondOfDay().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30944);assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30945);assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30946);assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30947);assertEquals(5, test.secondOfDay().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30948);assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMillisOfSecond() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je93bbnvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je93bbnvp(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30949);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30950);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30951);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30952);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30953);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30954);assertSame(test, test.millisOfSecond().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30955);assertEquals(53, test.millisOfSecond().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30956);assertEquals("53", test.millisOfSecond().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30957);assertEquals("53", test.millisOfSecond().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30958);assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30959);assertEquals("53", test.millisOfSecond().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30960);assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30961);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30962);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30963);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30964);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMillisOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eihskpnw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyGetMillisOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eihskpnw5(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30965);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30966);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30967);assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30968);assertEquals("millisOfDay", test.millisOfDay().getName());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30969);assertEquals("Property[millisOfDay]", test.millisOfDay().toString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30970);assertSame(test, test.millisOfDay().getDateTime());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30971);assertEquals(48223053, test.millisOfDay().get());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30972);assertEquals("48223053", test.millisOfDay().getAsString());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30973);assertEquals("48223053", test.millisOfDay().getAsText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30974);assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30975);assertEquals("48223053", test.millisOfDay().getAsShortText());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30976);assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30977);assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30978);assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30979);assertEquals(8, test.millisOfDay().getMaximumTextLength(null));
        __CLR4_4_1n0bn0blgchorrg.R.inc(30980);assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyToIntervalYearOfEra() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dof34nwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfEra",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dof34nwl(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30981);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30982);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30983);Interval testInterval = test.yearOfEra().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30984);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30985);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalYearOfCentury() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h9bdk0nwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYearOfCentury",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h9bdk0nwq(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30986);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30987);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30988);Interval testInterval = test.yearOfCentury().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30989);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30990);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1pudnwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1pudnwv(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30991);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30992);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30993);Interval testInterval = test.year().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30994);assertEquals(new DateTime(2004, 1, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(30995);assertEquals(new DateTime(2005, 1, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMonthOfYear() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),30996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mybaycnx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMonthOfYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),30996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mybaycnx0(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(30996);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30997);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(30998);Interval testInterval = test.monthOfYear().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(30999);assertEquals(new DateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31000);assertEquals(new DateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalDayOfMonth() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3xijfnx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3xijfnx5(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31001);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31002);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31003);Interval testInterval = test.dayOfMonth().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31004);assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31005);assertEquals(new DateTime(2004, 6, 10, 0, 0, 0, 0), testInterval.getEnd());

        __CLR4_4_1n0bn0blgchorrg.R.inc(31006);DateTime febTest = new DateTime(2004, 2, 29, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31007);Interval febTestInterval = febTest.dayOfMonth().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31008);assertEquals(new DateTime(2004, 2, 29, 0, 0, 0, 0), febTestInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31009);assertEquals(new DateTime(2004, 3, 1, 0, 0, 0, 0), febTestInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalHourOfDay() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ldcfnlnxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalHourOfDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ldcfnlnxe(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31010);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31011);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31012);Interval testInterval = test.hourOfDay().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31013);assertEquals(new DateTime(2004, 6, 9, 13, 0, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31014);assertEquals(new DateTime(2004, 6, 9, 14, 0, 0, 0), testInterval.getEnd());

        __CLR4_4_1n0bn0blgchorrg.R.inc(31015);DateTime midnightTest = new DateTime(2004, 6, 9, 23, 23, 43, 53, COPTIC_PARIS);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31016);Interval midnightTestInterval = midnightTest.hourOfDay().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31017);assertEquals(new DateTime(2004, 6, 9, 23, 0, 0, 0, COPTIC_PARIS), midnightTestInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31018);assertEquals(new DateTime(2004, 6, 10, 0, 0, 0, 0, COPTIC_PARIS), midnightTestInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMinuteOfHour() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi18fxnxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMinuteOfHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi18fxnxn(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31019);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31020);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31021);Interval testInterval = test.minuteOfHour().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31022);assertEquals(new DateTime(2004, 6, 9, 13, 23, 0, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31023);assertEquals(new DateTime(2004, 6, 9, 13, 24, 0, 0), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalSecondOfMinute() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttf6dpnxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalSecondOfMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttf6dpnxs(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31024);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31025);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31026);Interval testInterval = test.secondOfMinute().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31027);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 0), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31028);assertEquals(new DateTime(2004, 6, 9, 13, 23, 44, 0), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyToIntervalMillisOfSecond() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18rmq67nxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyToIntervalMillisOfSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18rmq67nxx(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31029);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31030);DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31031);Interval testInterval = test.millisOfSecond().toInterval();
        __CLR4_4_1n0bn0blgchorrg.R.inc(31032);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 53), testInterval.getStart());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31033);assertEquals(new DateTime(2004, 6, 9, 13, 23, 43, 54), testInterval.getEnd());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxfny2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxfny2(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31034);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31035);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31036);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31037);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31038);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31039);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31040);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31041);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31042);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31043);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_1n0bn0blgchorrg.R.globalSliceStart(getClass().getName(),31044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icvnyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1n0bn0blgchorrg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1n0bn0blgchorrg.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTime_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),31044,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icvnyc(){try{__CLR4_4_1n0bn0blgchorrg.R.inc(31044);
        __CLR4_4_1n0bn0blgchorrg.R.inc(31045);DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31046);DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31047);assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31048);assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31049);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31050);assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth()));
        __CLR4_4_1n0bn0blgchorrg.R.inc(31051);assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31052);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1n0bn0blgchorrg.R.inc(31053);assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
    }finally{__CLR4_4_1n0bn0blgchorrg.R.flushNeeded();}}

}
