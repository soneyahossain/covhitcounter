/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2015 Stephen Colebourne
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors {static class __CLR4_4_1qrdqrdlgchorwt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,35365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone OFFSET_04_00 = DateTimeZone.forOffsetHours(4);

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

//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34681);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34682);TestInterval_Constructors TB = new TestInterval_Constructors();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34683);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34684);TB.testParse_noOffsetInString();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34685);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34686);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34687);TB.testParse_offsetInString();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34688);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34689);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34690);TB.testParseWithOffset_noOffsetInString();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34691);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34692);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34693);TB.testParseWithOffset_offsetInString();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34694);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34695);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34696);TB.testParseWithOffset_invalid();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34697);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34698);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34699);TB.testConstructor_long_long1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34700);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34701);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34702);TB.testConstructor_long_long2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34703);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34704);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34705);TB.testConstructor_long_long3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34706);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34707);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34708);TB.testConstructor_long_long_minMax();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34709);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34710);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34711);TB.testConstructor_long_long_min();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34712);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34713);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34714);TB.testConstructor_long_long_max();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34715);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34716);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34717);TB.testConstructor_long_long_Zone();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34718);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34719);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34720);TB.testConstructor_long_long_nullZone();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34721);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34722);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34723);TB.testConstructor_long_long_Chronology();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34724);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34725);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34726);TB.testConstructor_long_long_nullChronology();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34727);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34728);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34729);TB.testConstructor_RI_RI1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34730);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34731);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34732);TB.testConstructor_RI_RI2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34733);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34734);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34735);TB.testConstructor_RI_RI3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34736);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34737);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34738);TB.testConstructor_RI_RI4();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34739);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34740);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34741);TB.testConstructor_RI_RI5();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34742);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34743);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34744);TB.testConstructor_RI_RI6();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34745);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34746);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34747);TB.testConstructor_RI_RI7();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34748);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34749);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34750);TB.testConstructor_RI_RI_chronoStart();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34751);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34752);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34753);TB.testConstructor_RI_RI_chronoEnd();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34754);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34755);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34756);TB.testConstructor_RI_RI_zones();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34757);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34758);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34759);TB.testConstructor_RI_RI_instant();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34760);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34761);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34762);TB.testConstructor_RI_RP1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34763);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34764);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34765);TB.testConstructor_RI_RP2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34766);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34767);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34768);TB.testConstructor_RI_RP3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34769);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34770);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34771);TB.testConstructor_RI_RP4();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34772);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34773);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34774);TB.testConstructor_RI_RP5();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34775);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34776);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34777);TB.testConstructor_RI_RP6();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34778);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34779);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34780);TB.testConstructor_RI_RP7();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34781);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34782);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34783);TB.testConstructor_RI_RP8();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34784);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34785);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34786);TB.testConstructor_RP_RI1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34787);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34788);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34789);TB.testConstructor_RP_RI2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34790);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34791);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34792);TB.testConstructor_RP_RI3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34793);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34794);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34795);TB.testConstructor_RP_RI4();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34796);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34797);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34798);TB.testConstructor_RP_RI5();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34799);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34800);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34801);TB.testConstructor_RP_RI6();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34802);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34803);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34804);TB.testConstructor_RP_RI7();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34805);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34806);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34807);TB.testConstructor_RP_RI8();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34808);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34809);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34810);TB.testConstructor_RI_RD1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34811);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34812);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34813);TB.testConstructor_RI_RD2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34814);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34815);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34816);TB.testConstructor_RI_RD3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34817);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34818);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34819);TB.testConstructor_RI_RD4();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34820);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34821);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34822);TB.testConstructor_RI_RD5();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34823);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34824);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34825);TB.testConstructor_RD_RI1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34826);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34827);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34828);TB.testConstructor_RD_RI2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34829);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34830);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34831);TB.testConstructor_RD_RI3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34832);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34833);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34834);TB.testConstructor_RD_RI4();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34835);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34836);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34837);TB.testConstructor_RD_RI5();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34838);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34839);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34840);TB.testConstructor_Object1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34841);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34842);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34843);TB.testConstructor_Object2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34844);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34845);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34846);TB.testConstructor_Object3();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34847);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34848);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34849);TB.testConstructor_Object4();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34850);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34851);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34852);TB.testConstructor_Object5();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34853);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34854);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34855);TB.testConstructor_Object6();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34856);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34857);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34858);TB.testConstructor_Object_Chronology1();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34859);TB.tearDown();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34860);TB.setUp();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34861);TB.testConstructor_Object_Chronology2();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34862);TB.tearDown();

    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestInterval_Constructors.class);
    }

    public TestInterval_Constructors(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34863);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34864);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34865);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34866);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34867);originalLocale = Locale.getDefault();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34868);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34869);TimeZone.setDefault(PARIS.toTimeZone());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34870);Locale.setDefault(Locale.FRANCE);
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34871);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34872);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34873);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34874);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34875);Locale.setDefault(originalLocale);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34876);originalDateTimeZone = null;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34877);originalTimeZone = null;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34878);originalLocale = null;
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noOffsetInString() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrlij5qwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParse_noOffsetInString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrlij5qwv() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34879);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34880);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34881);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34882);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34883);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34884);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30"));
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testParse_offsetInString() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wz4kmmqx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParse_offsetInString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wz4kmmqx1() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34885);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34886);DateTime start = new DateTime(2010, 6, 30, 10, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34887);DateTime end = new DateTime(2010, 7, 1, 12, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34888);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30+04:00/2010-07-01T14:30+04:00"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34889);assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30+04:00/P1DT2H"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34890);assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30+04:00"));
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testParseWithOffset_noOffsetInString() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgtpkaqx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParseWithOffset_noOffsetInString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgtpkaqx7() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34891);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34892);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34893);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34894);assertEquals(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30/2010-07-01T14:30"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34895);assertEquals(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30/P1DT2H"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34896);assertEquals(new Interval(start, end), Interval.parseWithOffset("P1DT2H/2010-07-01T14:30"));
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testParseWithOffset_offsetInString() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lw1j85qxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParseWithOffset_offsetInString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lw1j85qxd() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34897);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34898);DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(OFFSET_04_00));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34899);DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(OFFSET_04_00));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34900);assertEquals(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30+04:00/2010-07-01T14:30+04:00"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34901);assertEquals(new Interval(start, end), Interval.parseWithOffset("2010-06-30T12:30+04:00/p1DT2H"));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34902);assertEquals(new Interval(start, end), Interval.parseWithOffset("p1DT2H/2010-07-01T14:30+04:00"));
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testParseWithOffset_invalid() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xeupevqxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testParseWithOffset_invalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xeupevqxj() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34903);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34904);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34905);Interval.parseWithOffset("2010-06-30T12:30");
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34906);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34907);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34908);Interval.parseWithOffset("P1D/P1D");
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34909);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ifbf4qxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ifbf4qxq() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34910);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34911);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34912);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34913);Interval test = new Interval(dt1.getMillis(), dt2.getMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34914);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34915);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34916);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129fcmnqxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129fcmnqxx() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34917);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34918);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34919);Interval test = new Interval(dt1.getMillis(), dt1.getMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34920);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34921);assertEquals(dt1.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34922);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zkm5uqy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zkm5uqy3() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34923);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34924);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34925);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34926);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34927);new Interval(dt1.getMillis(), dt2.getMillis());
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34928);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_minMax() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dalnn4qy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_minMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dalnn4qy9() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34929);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34930);Interval test = new Interval(Long.MIN_VALUE, Long.MAX_VALUE);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34931);assertEquals(Long.MIN_VALUE, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34932);assertEquals(Long.MAX_VALUE, test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34933);assertEquals(new DateTime(Long.MIN_VALUE), test.getStart());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34934);assertEquals(new DateTime(Long.MAX_VALUE), test.getEnd());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34935);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34936);assertEquals(test, test.toInterval());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34937);assertEquals("-292275055-05-16T16:56:25.192+00:09:21/292278994-08-17T07:12:55.807Z", test.toString());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34938);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34939);test.toDuration();
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34940);fail();
        } catch (ArithmeticException ex) {
        }
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34941);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34942);test.toDurationMillis();
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34943);fail();
        } catch (ArithmeticException ex) {
        }
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34944);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34945);test.toPeriod();
            __CLR4_4_1qrdqrdlgchorwt.R.inc(34946);fail();
        } catch (RuntimeException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_min() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qy8ckeqyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_min",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qy8ckeqyr() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34947);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34948);Interval test = new Interval(Long.MIN_VALUE, Long.MIN_VALUE + 9);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34949);assertEquals(Long.MIN_VALUE, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34950);assertEquals(Long.MIN_VALUE + 9, test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34951);assertEquals(new DateTime(Long.MIN_VALUE), test.getStart());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34952);assertEquals(new DateTime(Long.MIN_VALUE + 9), test.getEnd());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34953);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34954);assertEquals(test, test.toInterval());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34955);assertEquals("-292275055-05-16T16:56:25.192+00:09:21/-292275055-05-16T16:56:25.201+00:09:21", test.toString());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34956);assertEquals(9, test.toDurationMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34957);assertEquals(new Duration(9), test.toDuration());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34958);assertEquals(new Period(9), test.toPeriod());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_max() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j3rr2kqz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_max",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j3rr2kqz3() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34959);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34960);Interval test = new Interval(Long.MAX_VALUE - 9, Long.MAX_VALUE);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34961);assertEquals(Long.MAX_VALUE - 9, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34962);assertEquals(Long.MAX_VALUE, test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34963);assertEquals(new DateTime(Long.MAX_VALUE - 9), test.getStart());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34964);assertEquals(new DateTime(Long.MAX_VALUE), test.getEnd());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34965);assertEquals(ISOChronology.getInstance(), test.getChronology());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34966);assertEquals(test, test.toInterval());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34967);assertEquals("292278994-08-17T07:12:55.798Z/292278994-08-17T07:12:55.807Z", test.toString());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34968);assertEquals(9, test.toDurationMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34969);assertEquals(new Duration(9), test.toDuration());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_Zone() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lms506qze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34970,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lms506qze() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34970);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34971);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34972);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34973);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), LONDON);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34974);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34975);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34976);assertEquals(ISOChronology.getInstance(LONDON), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_nullZone() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bv70xqzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bv70xqzl() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34977);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34978);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34979);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34980);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34981);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34982);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34983);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_long_long_Chronology() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1simh3qqzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1simh3qqzs() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34984);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34985);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34986);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34987);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), GJChronology.getInstance());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34988);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34989);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34990);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_long_long_nullChronology() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1delt37qzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_long_long_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1delt37qzz() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34991);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34992);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34993);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34994);Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (Chronology) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34995);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34996);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34997);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RI1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),34998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7qodsr06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7qodsr06() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(34998);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(34999);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35000);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35001);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35002);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35003);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyqplbr0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyqplbr0c() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35004);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35005);Instant dt1 = new Instant(new DateTime(2004, 6, 9, 0, 0, 0, 0));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35006);Instant dt2 = new Instant(new DateTime(2005, 7, 10, 1, 1, 1, 1));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35007);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35008);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35009);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpqqsur0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpqqsur0i() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35010);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35011);Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35012);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35013);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI4() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgqs0dr0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgqs0dr0m() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35014);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35015);DateTime dt1 = new DateTime(2000, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35016);Interval test = new Interval(dt1, (ReadableInstant) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35017);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35018);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI5() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7qt7wr0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7qt7wr0r() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35019);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35020);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35021);Interval test = new Interval((ReadableInstant) null, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35022);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35023);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI6() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16yquffr0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16yquffr0w() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35024);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35025);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35026);Interval test = new Interval(dt1, dt1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35027);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35028);assertEquals(dt1.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI7() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pqvmyr11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pqvmyr11() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35029);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35030);DateTime dt1 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35031);DateTime dt2 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35032);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35033);new Interval(dt1, dt2);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35034);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_chronoStart() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19vt4flr17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_chronoStart",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19vt4flr17() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35035);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35036);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, GJChronology.getInstance());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35037);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35038);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35039);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35040);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35041);assertEquals(GJChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_chronoEnd() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdrdpkr1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_chronoEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdrdpkr1e() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35042);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35043);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35044);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, GJChronology.getInstance());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35045);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35046);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35047);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35048);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_zones() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcap5jr1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_zones",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcap5jr1l() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35049);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35050);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, LONDON);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35051);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, PARIS);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35052);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35053);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35054);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35055);assertEquals(ISOChronology.getInstance(LONDON), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RI_instant() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1volvchr1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RI_instant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1volvchr1s() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35056);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35057);Instant dt1 = new Instant(12345678L);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35058);Instant dt2 = new Instant(22345678L);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35059);Interval test = new Interval(dt1, dt2);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35060);assertEquals(12345678L, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35061);assertEquals(22345678L, test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35062);assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RP1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2iifr1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2iifr1z() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35063);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35064);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35065);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35066);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35067);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35068);result = ISOChronology.getInstance().hours().add(result, 1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35069);Interval test = new Interval(dt, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35070);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35071);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p12jpyr28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p12jpyr28() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35072);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35073);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35074);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35075);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35076);result = ISOChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35077);result = ISOChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35078);result = ISOChronology.getInstanceUTC().hours().add(result, 1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35079);Interval test = new Interval(dt, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35080);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35081);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ls2kxhr2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ls2kxhr2i() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35082);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35083);DateTime dt = new DateTime(TEST_TIME_NOW, CopticChronology.getInstanceUTC());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35084);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35085);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35086);result = CopticChronology.getInstanceUTC().months().add(result, 6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35087);result = CopticChronology.getInstanceUTC().days().add(result, 3);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35088);result = CopticChronology.getInstanceUTC().hours().add(result, 1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35089);Interval test = new Interval(dt, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35090);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35091);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP4() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ij2m50r2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ij2m50r2s() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35092);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35093);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35094);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35095);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35096);result = ISOChronology.getInstance().hours().add(result, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35097);result = ISOChronology.getInstance().millis().add(result, 23);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35098);Interval test = new Interval(dt, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35099);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35100);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP5() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa2ncjr31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa2ncjr31() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35101);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35102);Interval test = new Interval((ReadableInstant) null, (ReadablePeriod) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35103);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35104);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP6() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c12ok2r35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c12ok2r35() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35105);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35106);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35107);Interval test = new Interval(dt, (ReadablePeriod) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35108);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35109);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP7() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18s2prlr3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18s2prlr3a() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35110);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35111);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35112);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35113);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35114);result = ISOChronology.getInstance().hourOfDay().add(result, 1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35115);Interval test = new Interval((ReadableInstant) null, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35116);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35117);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RP8() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j2qz4r3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RP8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j2qz4r3i() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35118);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35119);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35120);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35121);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35122);new Interval(dt, dur);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35123);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RP_RI1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zb8gc7r3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zb8gc7r3o() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35124);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35125);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35126);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35127);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35128);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35129);result = ISOChronology.getInstance().hours().add(result, -1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35130);Interval test = new Interval(dur, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35131);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35132);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wgvmugr3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wgvmugr3x() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35133);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35134);Instant dt = new Instant(new DateTime(TEST_TIME_NOW));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35135);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35136);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35137);result = ISOChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35138);result = ISOChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35139);result = ISOChronology.getInstanceUTC().hours().add(result, -1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35140);Interval test = new Interval(dur, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35141);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35142);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7vo1zr47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7vo1zr47() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35143);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35144);DateTime dt = new DateTime(TEST_TIME_NOW, CopticChronology.getInstanceUTC());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35145);Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35146);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35147);result = CopticChronology.getInstanceUTC().months().add(result, -6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35148);result = CopticChronology.getInstanceUTC().days().add(result, -3);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35149);result = CopticChronology.getInstanceUTC().hours().add(result, -1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35150);Interval test = new Interval(dur, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35151);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35152);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI4() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pyvp9ir4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pyvp9ir4h() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35153);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35154);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35155);Period dur = new Period(1 * DateTimeConstants.MILLIS_PER_HOUR + 23L);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35156);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35157);result = ISOChronology.getInstance().hours().add(result, -1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35158);result = ISOChronology.getInstance().millis().add(result, -23);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35159);Interval test = new Interval(dur, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35160);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35161);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI5() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpvqh1r4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpvqh1r4q() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35162);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35163);Interval test = new Interval((ReadablePeriod) null, (ReadableInstant) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35164);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35165);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI6() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jgvrokr4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jgvrokr4u() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35166);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35167);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35168);Interval test = new Interval((ReadablePeriod) null, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35169);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35170);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI7() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vsw3r4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35171,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vsw3r4z() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35171);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35172);Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35173);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35174);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35175);result = ISOChronology.getInstance().hourOfDay().add(result, -1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35176);Interval test = new Interval(dur, (ReadableInstant) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35177);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35178);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RP_RI8() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyvu3mr57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RP_RI8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyvu3mr57() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35179);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35180);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35181);Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35182);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35183);new Interval(dur, dt);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35184);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RI_RD1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqt357r5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqt357r5d() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35185);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35186);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35187);result = ISOChronology.getInstance().months().add(result, 6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35188);result = ISOChronology.getInstance().hours().add(result, 1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35189);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35190);Duration dur = new Duration(result - TEST_TIME_NOW);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35191);Interval test = new Interval(dt, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35192);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35193);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qht4cqr5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qht4cqr5m() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35194);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35195);Interval test = new Interval((ReadableInstant) null, (ReadableDuration) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35196);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35197);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8t5k9r5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8t5k9r5q() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35198);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35199);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35200);Interval test = new Interval(dt, (ReadableDuration) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35201);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35202);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD4() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzt6rsr5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzt6rsr5v() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35203);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35204);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35205);result = ISOChronology.getInstance().monthOfYear().add(result, 6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35206);result = ISOChronology.getInstance().hourOfDay().add(result, 1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35207);Duration dur = new Duration(result - TEST_TIME_NOW);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35208);Interval test = new Interval((ReadableInstant) null, dur);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35209);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35210);assertEquals(result, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RI_RD5() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqt7zbr63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RI_RD5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqt7zbr63() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35211);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35212);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35213);Duration dur = new Duration(-1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35214);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35215);new Interval(dt, dur);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35216);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_RD_RI1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160dzxnr69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160dzxnr69() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35217);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35218);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35219);result = ISOChronology.getInstance().months().add(result, -6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35220);result = ISOChronology.getInstance().hours().add(result, -1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35221);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35222);Duration dur = new Duration(TEST_TIME_NOW - result);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35223);Interval test = new Interval(dur, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35224);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35225);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199dyq4r6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199dyq4r6i() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35226);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35227);Interval test = new Interval((ReadableDuration) null, (ReadableInstant) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35228);assertEquals(TEST_TIME_NOW, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35229);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cidxilr6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cidxilr6m() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35230);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35231);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35232);Interval test = new Interval((ReadableDuration) null, dt);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35233);assertEquals(dt.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35234);assertEquals(dt.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI4() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1frdwb2r6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1frdwb2r6r() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35235);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35236);long result = TEST_TIME_NOW;
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35237);result = ISOChronology.getInstance().monthOfYear().add(result, -6);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35238);result = ISOChronology.getInstance().hourOfDay().add(result, -1);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35239);Duration dur = new Duration(TEST_TIME_NOW - result);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35240);Interval test = new Interval(dur, (ReadableInstant) null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35241);assertEquals(result, test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35242);assertEquals(TEST_TIME_NOW, test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_RD_RI5() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0dv3jr6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_RD_RI5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0dv3jr6z() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35243);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35244);DateTime dt = new DateTime(TEST_TIME_NOW);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35245);Duration dur = new Duration(-1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35246);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35247);new Interval(dur, dt);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35248);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19oqxcyr75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35249,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19oqxcyr75() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35249);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35250);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35251);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35252);Interval test = new Interval(dt1.toString() + '/' + dt2.toString());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35253);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35254);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_Object2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxqw5fr7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxqw5fr7b() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35255);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35256);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35257);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35258);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35259);Interval test = new Interval(base);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35260);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35261);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_Object3() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g6quxwr7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g6quxwr7i() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35262);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35263);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35264);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35265);MutableInterval base = new MutableInterval(dt1, dt2);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35266);Interval test = new Interval(base);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35267);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35268);assertEquals(dt2.getMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_Object4() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfqtqdr7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfqtqdr7p() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35269);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35270);MockInterval base = new MockInterval();
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35271);Interval test = new Interval(base);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35272);assertEquals(base.getStartMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35273);assertEquals(base.getEndMillis(), test.getEndMillis());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_Object5() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1moqsiur7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1moqsiur7u() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35274);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35275);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter("");
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35276);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35277);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35278);return false;
            }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35279);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35280);interval.setChronology(chrono);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35281);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

            public Class<?> getSupportedType() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35282);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35283);return String.class;
            }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}
        };
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35284);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35285);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35286);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35287);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35288);Interval test = new Interval(dt1.toString() + '/' + dt2.toString());
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35289);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35290);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35291);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_Object6() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxqrbbr8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxqrbbr8c() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35292);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35293);IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L));
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35294);IntervalConverter conv = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35295);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35296);return false;
            }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35297);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35298);interval.setChronology(chrono);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35299);interval.setInterval(1234L, 5678L);
            }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

            public Class<?> getSupportedType() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35300);
                __CLR4_4_1qrdqrdlgchorwt.R.inc(35301);return ReadableInterval.class;
            }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}
        };
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35302);try {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35303);ConverterManager.getInstance().addIntervalConverter(conv);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35304);Interval base = new Interval(-1000L, 1000L);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35305);Interval test = new Interval(base);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35306);assertEquals(1234L, test.getStartMillis());
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35307);assertEquals(5678L, test.getEndMillis());
        } finally {
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35308);ConverterManager.getInstance().addIntervalConverter(oldConv);
        }
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35309);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35310);return ISOChronology.getInstance();
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public long getStartMillis() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35311);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35312);return 1234L;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public DateTime getStart() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35313);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35314);return new DateTime(1234L);
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public long getEndMillis() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35315);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35316);return 5678L;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public DateTime getEnd() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35317);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35318);return new DateTime(5678L);
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public long toDurationMillis() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35319);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35320);return (5678L - 1234L);
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public Duration toDuration() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35321);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35322);return new Duration(5678L - 1234L);
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean contains(long millisInstant) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35323);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35324);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean containsNow() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35325);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35326);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean contains(ReadableInstant instant) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35327);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35328);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean contains(ReadableInterval interval) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35329);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35330);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean overlaps(ReadableInterval interval) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35331);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35332);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35333);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35334);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean isBefore(ReadableInterval interval) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35335);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35336);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35337);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35338);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public boolean isAfter(ReadableInterval interval) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35339);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35340);return false;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public Interval toInterval() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35341);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35342);return null;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public MutableInterval toMutableInterval() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35343);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35344);return null;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public Period toPeriod() {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35345);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35346);return null;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

        public Period toPeriod(PeriodType type) {try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35347);
            __CLR4_4_1qrdqrdlgchorwt.R.inc(35348);return null;
        }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_Object_Chronology1() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pmfignr9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pmfignr9x() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35349);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35350);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35351);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35352);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35353);Interval test = new Interval(base, BuddhistChronology.getInstance());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35354);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35355);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35356);assertEquals(BuddhistChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

    @Test
    public void testConstructor_Object_Chronology2() throws Throwable {__CLR4_4_1qrdqrdlgchorwt.R.globalSliceStart(getClass().getName(),35357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svfh94ra5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1qrdqrdlgchorwt.R.rethrow($CLV_t2$);}finally{__CLR4_4_1qrdqrdlgchorwt.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestInterval_Constructors.testConstructor_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svfh94ra5() throws Throwable{try{__CLR4_4_1qrdqrdlgchorwt.R.inc(35357);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35358);DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35359);DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35360);Interval base = new Interval(dt1, dt2);

        __CLR4_4_1qrdqrdlgchorwt.R.inc(35361);Interval test = new Interval(base, null);
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35362);assertEquals(dt1.getMillis(), test.getStartMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35363);assertEquals(dt2.getMillis(), test.getEndMillis());
        __CLR4_4_1qrdqrdlgchorwt.R.inc(35364);assertEquals(ISOChronology.getInstance(), test.getChronology());
    }finally{__CLR4_4_1qrdqrdlgchorwt.R.flushNeeded();}}

}
