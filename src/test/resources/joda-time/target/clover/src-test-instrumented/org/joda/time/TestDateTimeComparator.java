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
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for the
 * org.joda.time.DateTimeComparator class.
 *
 * @author Guy Allard
 */
public class TestDateTimeComparator {static class __CLR4_4_1j3dj3dlgchorjd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,25327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final Chronology ISO = ISOChronology.getInstance();

    public static void main(String[] args) throws Exception {try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24745);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24746);TestDateTimeComparator TB = new TestDateTimeComparator();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24747);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24748);TB.testClass();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24749);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24750);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24751);TB.testStaticGetInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24752);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24753);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24754);TB.testStaticGetDateOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24755);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24756);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24757);TB.testStaticGetTimeOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24758);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24759);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24760);TB.testStaticGetInstanceLower();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24761);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24762);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24763);TB.testStaticGetInstanceLowerUpper();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24764);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24765);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24766);TB.testNullNowCheckedOnce();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24767);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24768);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24769);TB.testEqualsHashCode();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24770);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24771);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24772);TB.testSerialization1();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24773);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24774);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24775);TB.testSerialization2();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24776);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24777);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24778);TB.testBasicComps1();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24779);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24780);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24781);TB.testBasicComps2();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24782);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24783);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24784);TB.testBasicComps3();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24785);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24786);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24787);TB.testBasicComps4();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24788);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24789);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24790);TB.testBasicComps5();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24791);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24792);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24793);TB.testMillis();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24794);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24795);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24796);TB.testSecond();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24797);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24798);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24799);TB.testMinute();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24800);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24801);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24802);TB.testHour();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24803);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24804);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24805);TB.testDOW();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24806);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24807);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24808);TB.testDOM();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24809);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24810);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24811);TB.testDOY();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24812);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24813);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24814);TB.testWOW();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24815);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24816);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24817);TB.testWOYY();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24818);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24819);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24820);TB.testMonth();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24821);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24822);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24823);TB.testYear();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24824);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24825);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24826);TB.testListBasic();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24827);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24828);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24829);TB.testListMillis();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24830);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24831);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24832);TB.testListSecond();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24833);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24834);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24835);TB.testListMinute();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24836);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24837);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24838);TB.testListHour();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24839);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24840);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24841);TB.testListDOW();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24842);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24843);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24844);TB.testListDOM();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24845);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24846);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24847);TB.testListDOY();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24848);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24849);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24850);TB.testListWOW();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24851);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24852);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24853);TB.testListYOYY();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24854);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24855);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24856);TB.testListMonth();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24857);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24858);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24859);TB.testListYear();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24860);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24861);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24862);TB.testListDate();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24863);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24864);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24865);TB.testListTime();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24866);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24867);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24868);TB.testNullDT();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24869);TB.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24870);TB.setUp();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24871);TB.testInvalidObj();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24872);TB.tearDown();

    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    /*

    public static TestSuite suite() {
        return new TestSuite(TestDateTimeComparator.class);
    }

    public TestDateTimeComparator(String name) {
        super(name);
    }

     */

    /**
     * A reference to a DateTime object.
     */
    DateTime aDateTime = null;
    /**
     * A reference to a DateTime object.
     */
    DateTime bDateTime = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for millis of seconds.
     */
    Comparator cMillis = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for seconds.
     */
    Comparator cSecond = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for minutes.
     */
    Comparator cMinute = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for hours.
     */
    Comparator cHour = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the week.
     */
    Comparator cDayOfWeek = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the month.
     */
    Comparator cDayOfMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for day of the year.
     */
    Comparator cDayOfYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for week of the weekyear.
     */
    Comparator cWeekOfWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year given a week of the year.
     */
    Comparator cWeekyear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for months.
     */
    Comparator cMonth = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for year.
     */
    Comparator cYear = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the date portion of an
     * object.
     */
    Comparator cDate = null;
    /**
     * A reference to a DateTimeComparator object
     * (a Comparator) for the time portion of an
     * object.
     */
    Comparator cTime = null;

    /**
     * Junit <code>setUp()</code> method.
     */
    @Before
    public void setUp() /* throws Exception */ {try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24873);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24874);Chronology chrono = ISOChronology.getInstanceUTC();

        // super.setUp();
        // Obtain comparator's
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24875);cMillis = DateTimeComparator.getInstance(null, DateTimeFieldType.secondOfMinute());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24876);cSecond = DateTimeComparator.getInstance(DateTimeFieldType.secondOfMinute(), DateTimeFieldType.minuteOfHour());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24877);cMinute = DateTimeComparator.getInstance(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24878);cHour = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24879);cDayOfWeek = DateTimeComparator.getInstance(DateTimeFieldType.dayOfWeek(), DateTimeFieldType.weekOfWeekyear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24880);cDayOfMonth = DateTimeComparator.getInstance(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24881);cDayOfYear = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), DateTimeFieldType.year());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24882);cWeekOfWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekOfWeekyear(), DateTimeFieldType.weekyear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24883);cWeekyear = DateTimeComparator.getInstance(DateTimeFieldType.weekyear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24884);cMonth = DateTimeComparator.getInstance(DateTimeFieldType.monthOfYear(), DateTimeFieldType.year());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24885);cYear = DateTimeComparator.getInstance(DateTimeFieldType.year());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24886);cDate = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24887);cTime = DateTimeComparator.getTimeOnlyInstance();
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    /**
     * Junit <code>tearDown()</code> method.
     */
    @After
    public void tearDown() /* throws Exception */ {try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24888);
        // super.tearDown();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24889);aDateTime = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24890);bDateTime = null;
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24891);cMillis = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24892);cSecond = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24893);cMinute = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24894);cHour = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24895);cDayOfWeek = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24896);cDayOfMonth = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24897);cDayOfYear = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24898);cWeekOfWeekyear = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24899);cWeekyear = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24900);cMonth = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24901);cYear = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24902);cDate = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24903);cTime = null;
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClass() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulvj7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulvj7s(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24904);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24905);assertEquals(true, Modifier.isPublic(DateTimeComparator.class.getModifiers()));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24906);assertEquals(false, Modifier.isFinal(DateTimeComparator.class.getModifiers()));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24907);assertEquals(1, DateTimeComparator.class.getDeclaredConstructors().length);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24908);assertEquals(true, Modifier.isProtected(DateTimeComparator.class.getDeclaredConstructors()[0].getModifiers()));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStaticGetInstance() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2xpuj7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2xpuj7x(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24909);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24910);DateTimeComparator c = DateTimeComparator.getInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24911);assertEquals(null, c.getLowerLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24912);assertEquals(null, c.getUpperLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24913);assertEquals("DateTimeComparator[]", c.toString());
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    @Test
    public void testStaticGetDateOnlyInstance() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vhl7d8j82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetDateOnlyInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vhl7d8j82(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24914);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24915);DateTimeComparator c = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24916);assertEquals(DateTimeFieldType.dayOfYear(), c.getLowerLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24917);assertEquals(null, c.getUpperLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24918);assertEquals("DateTimeComparator[dayOfYear-]", c.toString());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24919);assertSame(DateTimeComparator.getDateOnlyInstance(), DateTimeComparator.getDateOnlyInstance());
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    @Test
    public void testStaticGetTimeOnlyInstance() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nssea3j88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetTimeOnlyInstance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nssea3j88(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24920);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24921);DateTimeComparator c = DateTimeComparator.getTimeOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24922);assertEquals(null, c.getLowerLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24923);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24924);assertEquals("DateTimeComparator[-dayOfYear]", c.toString());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24925);assertSame(DateTimeComparator.getTimeOnlyInstance(), DateTimeComparator.getTimeOnlyInstance());
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    @Test
    public void testStaticGetInstanceLower() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rcsn1j8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLower",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rcsn1j8e(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24926);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24927);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24928);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24929);assertEquals(null, c.getUpperLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24930);assertEquals("DateTimeComparator[hourOfDay-]", c.toString());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24931);c = DateTimeComparator.getInstance(null);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24932);assertSame(DateTimeComparator.getInstance(), c);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    @Test
    public void testStaticGetInstanceLowerUpper() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1as60z1j8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testStaticGetInstanceLowerUpper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1as60z1j8l(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24933);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24934);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24935);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24936);assertEquals(DateTimeFieldType.dayOfYear(), c.getUpperLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24937);assertEquals("DateTimeComparator[hourOfDay-dayOfYear]", c.toString());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24938);c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24939);assertEquals(DateTimeFieldType.hourOfDay(), c.getLowerLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24940);assertEquals(DateTimeFieldType.hourOfDay(), c.getUpperLimit());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24941);assertEquals("DateTimeComparator[hourOfDay]", c.toString());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24942);c = DateTimeComparator.getInstance(null, null);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24943);assertSame(DateTimeComparator.getInstance(), c);

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24944);c = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24945);assertSame(DateTimeComparator.getDateOnlyInstance(), c);

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24946);c = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24947);assertSame(DateTimeComparator.getTimeOnlyInstance(), c);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    @Test
    public void testNullNowCheckedOnce() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1berhbij90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testNullNowCheckedOnce",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1berhbij90(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24948);
        // checks a race condition against the system clock, issue #404
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24949);for (int i = 0; (((i < 10000)&&(__CLR4_4_1j3dj3dlgchorjd.R.iget(24950)!=0|true))||(__CLR4_4_1j3dj3dlgchorjd.R.iget(24951)==0&false)); i++) {{
            __CLR4_4_1j3dj3dlgchorjd.R.inc(24952);if ((((DateTimeComparator.getInstance().compare(null, null) != 0)&&(__CLR4_4_1j3dj3dlgchorjd.R.iget(24953)!=0|true))||(__CLR4_4_1j3dj3dlgchorjd.R.iget(24954)==0&false))) {{
                __CLR4_4_1j3dj3dlgchorjd.R.inc(24955);fail("Comparing (null, null) should always return 0");
            }
        }}
    }}finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77j98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77j98(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24956);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24957);DateTimeComparator c1 = DateTimeComparator.getInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24958);assertEquals(true, c1.equals(c1));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24959);assertEquals(false, c1.equals(null));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24960);assertEquals(true, c1.hashCode() == c1.hashCode());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24961);DateTimeComparator c2 = DateTimeComparator.getTimeOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24962);assertEquals(true, c2.equals(c2));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24963);assertEquals(false, c2.equals(c1));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24964);assertEquals(false, c1.equals(c2));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24965);assertEquals(false, c2.equals(null));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24966);assertEquals(false, c1.hashCode() == c2.hashCode());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24967);DateTimeComparator c3 = DateTimeComparator.getTimeOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24968);assertEquals(true, c3.equals(c3));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24969);assertEquals(false, c3.equals(c1));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24970);assertEquals(true, c3.equals(c2));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24971);assertEquals(false, c1.equals(c3));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24972);assertEquals(true, c2.equals(c3));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24973);assertEquals(false, c1.hashCode() == c3.hashCode());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24974);assertEquals(true, c2.hashCode() == c3.hashCode());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24975);DateTimeComparator c4 = DateTimeComparator.getDateOnlyInstance();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24976);assertEquals(false, c4.hashCode() == c3.hashCode());
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization1() throws Exception {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfkbx6j9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24977,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfkbx6j9t() throws Exception{try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24977);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24978);DateTimeField f = ISO.dayOfYear();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24979);f.toString();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24980);DateTimeComparator c = DateTimeComparator.getInstance(DateTimeFieldType.hourOfDay(), DateTimeFieldType.dayOfYear());

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24981);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24982);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24983);oos.writeObject(c);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24984);oos.close();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24985);byte[] bytes = baos.toByteArray();

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24986);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24987);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24988);DateTimeComparator result = (DateTimeComparator) ois.readObject();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24989);ois.close();

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24990);assertEquals(c, result);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization2() throws Exception {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),24991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yokapnja7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSerialization2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),24991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yokapnja7() throws Exception{try{__CLR4_4_1j3dj3dlgchorjd.R.inc(24991);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24992);DateTimeComparator c = DateTimeComparator.getInstance();

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24993);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24994);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24995);oos.writeObject(c);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24996);oos.close();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24997);byte[] bytes = baos.toByteArray();

        __CLR4_4_1j3dj3dlgchorjd.R.inc(24998);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(24999);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25000);DateTimeComparator result = (DateTimeComparator) ois.readObject();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25001);ois.close();

        __CLR4_4_1j3dj3dlgchorjd.R.inc(25002);assertSame(c, result);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test all basic comparator operation with DateTime objects.
     */
    @Test
    public void testBasicComps1() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxsdbkjaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxsdbkjaj(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25003);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25004);aDateTime = new DateTime(System.currentTimeMillis(), DateTimeZone.UTC);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25005);bDateTime = new DateTime(aDateTime.getMillis(), DateTimeZone.UTC);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25006);assertEquals("getMillis", aDateTime.getMillis(),
                bDateTime.getMillis());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25007);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25008);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25009);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25010);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25011);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25012);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25013);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25014);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25015);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25016);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25017);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25018);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25019);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testBasicComps


    /**
     * Test all basic comparator operation with ReadableInstant objects.
     */
    @Test
    public void testBasicComps2() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6sc41jb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6sc41jb0(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25020);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25021);ReadableInstant aDateTime = new DateTime(System.currentTimeMillis(), DateTimeZone.UTC);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25022);ReadableInstant bDateTime = new DateTime(aDateTime.getMillis(), DateTimeZone.UTC);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25023);assertEquals("getMillis", aDateTime.getMillis(),
                bDateTime.getMillis());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25024);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25025);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25026);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25027);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25028);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25029);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25030);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25031);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25032);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25033);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25034);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25035);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25036);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testBasicComps

    /**
     * Test all basic comparator operation with java Date objects.
     */
    @Test
    public void testBasicComps3() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfsawijbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfsawijbh(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25037);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25038);Date aDateTime
                = new Date(System.currentTimeMillis());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25039);Date bDateTime
                = new Date(aDateTime.getTime());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25040);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25041);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25042);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25043);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25044);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25045);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25046);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25047);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25048);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25049);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25050);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25051);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25052);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testBasicComps

    /**
     * Test all basic comparator operation with Long objects.
     */
    @Test
    public void testBasicComps4() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vos9ozjbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vos9ozjbx(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25053);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25054);Long aDateTime
                = new Long(System.currentTimeMillis());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25055);Long bDateTime
                = new Long(aDateTime.longValue());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25056);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25057);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25058);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25059);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25060);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25061);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25062);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25063);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25064);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25065);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25066);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25067);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25068);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testBasicComps

    /**
     * Test all basic comparator operation with Calendar objects.
     */
    @Test
    public void testBasicComps5() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxs8hgjcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testBasicComps5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxs8hgjcd(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25069);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25070);Calendar aDateTime
                = Calendar.getInstance();   // right now
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25071);Calendar bDateTime = aDateTime;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25072);assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25073);assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25074);assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25075);assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25076);assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25077);assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25078);assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25079);assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25080);assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25081);assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25082);assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25083);assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25084);assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testBasicComps


    /**
     * Test unequal comparisons with millis of second comparators.
     */
    @Test
    public void testMillis() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol9hs1jct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol9hs1jct(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25085);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25086);aDateTime = new DateTime(System.currentTimeMillis(), DateTimeZone.UTC);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25087);bDateTime = new DateTime(aDateTime.getMillis() + 1, DateTimeZone.UTC);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25088);assertEquals("MillisM1", -1, cMillis.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25089);assertEquals("MillisP1", 1, cMillis.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testMillis

    /**
     * Test unequal comparisons with second comparators.
     */
    @Test
    public void testSecond() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fss53njcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fss53njcy(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25090);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25091);aDateTime = getADate("1969-12-31T23:59:58");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25092);bDateTime = getADate("1969-12-31T23:50:59");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25093);assertEquals("SecondM1a", -1, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25094);assertEquals("SecondP1a", 1, cSecond.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25095);aDateTime = getADate("1970-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25096);bDateTime = getADate("1970-01-01T00:00:01");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25097);assertEquals("SecondM1b", -1, cSecond.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25098);assertEquals("SecondP1b", 1, cSecond.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testSecond

    /**
     * Test unequal comparisons with minute comparators.
     */
    @Test
    public void testMinute() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7jtu5jd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7jtu5jd7(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25099);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25100);aDateTime = getADate("1969-12-31T23:58:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25101);bDateTime = getADate("1969-12-31T23:59:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25102);assertEquals("MinuteM1a", -1, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25103);assertEquals("MinuteP1a", 1, cMinute.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25104);aDateTime = getADate("1970-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25105);bDateTime = getADate("1970-01-01T00:01:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25106);assertEquals("MinuteM1b", -1, cMinute.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25107);assertEquals("MinuteP1b", 1, cMinute.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testMinute

    /**
     * Test unequal comparisons with hour comparators.
     */
    @Test
    public void testHour() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mit1wjjdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mit1wjjdg(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25108);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25109);aDateTime = getADate("1969-12-31T22:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25110);bDateTime = getADate("1969-12-31T23:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25111);assertEquals("HourM1a", -1, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25112);assertEquals("HourP1a", 1, cHour.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25113);aDateTime = getADate("1970-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25114);bDateTime = getADate("1970-01-01T01:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25115);assertEquals("HourM1b", -1, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25116);assertEquals("HourP1b", 1, cHour.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25117);aDateTime = getADate("1969-12-31T23:59:59");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25118);bDateTime = getADate("1970-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25119);assertEquals("HourP1c", 1, cHour.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25120);assertEquals("HourM1c", -1, cHour.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testHour

    /**
     * Test unequal comparisons with day of week comparators.
     */
    @Test
    public void testDOW() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mmwf3jdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testDOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mmwf3jdt(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25121);
        /*
         * Dates chosen when I wrote the code, so I know what day of
         * the week it is.
         */
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25122);aDateTime = getADate("2002-04-12T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25123);bDateTime = getADate("2002-04-13T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25124);assertEquals("DOWM1a", -1, cDayOfWeek.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25125);assertEquals("DOWP1a", 1, cDayOfWeek.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testDOW

    /**
     * Test unequal comparisons with day of month comparators.
     */
    @Test
    public void testDOM() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y4mkbtjdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testDOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y4mkbtjdy(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25126);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25127);aDateTime = getADate("2002-04-12T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25128);bDateTime = getADate("2002-04-13T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25129);assertEquals("DOMM1a", -1, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25130);assertEquals("DOMP1a", 1, cDayOfMonth.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25131);aDateTime = getADate("2000-12-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25132);bDateTime = getADate("1814-04-30T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25133);assertEquals("DOMM1b", -1, cDayOfMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25134);assertEquals("DOMP1b", 1, cDayOfMonth.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testDOM

    /**
     * Test unequal comparisons with day of year comparators.
     */
    @Test
    public void testDOY() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vd15vje7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testDOY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vd15vje7(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25135);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25136);aDateTime = getADate("2002-04-12T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25137);bDateTime = getADate("2002-04-13T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25138);assertEquals("DOYM1a", -1, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25139);assertEquals("DOYP1a", 1, cDayOfYear.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25140);aDateTime = getADate("2000-02-29T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25141);bDateTime = getADate("1814-11-30T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25142);assertEquals("DOYM1b", -1, cDayOfYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25143);assertEquals("DOYP1b", 1, cDayOfYear.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testDOY

    /**
     * Test unequal comparisons with week of weekyear comparators.
     */
    @Test
    public void testWOW() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sua15gjeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testWOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sua15gjeg(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25144);
        // 1st week of year contains Jan 04.
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25145);aDateTime = getADate("2000-01-04T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25146);bDateTime = getADate("2000-01-11T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25147);assertEquals("WOWM1a", -1,
                cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25148);assertEquals("WOWP1a", 1,
                cWeekOfWeekyear.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25149);aDateTime = getADate("2000-01-04T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25150);bDateTime = getADate("1999-12-31T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25151);assertEquals("WOWM1b", -1,
                cWeekOfWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25152);assertEquals("WOWP1b", 1,
                cWeekOfWeekyear.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testMillis

    /**
     * Test unequal comparisons with year given the week comparators.
     */
    @Test
    public void testWOYY() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dg15dbjep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testWOYY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dg15dbjep(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25153);
        // How do I test the end conditions of this?
        // Don't understand ......
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25154);aDateTime = getADate("1998-12-31T23:59:59");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25155);bDateTime = getADate("1999-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25156);assertEquals("YOYYZ", 0, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25157);bDateTime = getADate("1999-01-04T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25158);assertEquals("YOYYM1", -1, cWeekyear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25159);assertEquals("YOYYP1", 1, cWeekyear.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testWOYY

    /**
     * Test unequal comparisons with month comparators.
     */
    @Test
    public void testMonth() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18kdx0rjew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18kdx0rjew(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25160);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25161);aDateTime = getADate("2002-04-30T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25162);bDateTime = getADate("2002-05-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25163);assertEquals("MONTHM1a", -1, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25164);assertEquals("MONTHP1a", 1, cMonth.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25165);aDateTime = getADate("1900-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25166);bDateTime = getADate("1899-12-31T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25167);assertEquals("MONTHM1b", -1, cMonth.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25168);assertEquals("MONTHP1b", 1, cMonth.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testMonth

    /**
     * Test unequal comparisons with year comparators.
     */
    @Test
    public void testYear() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fu0vqijf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fu0vqijf5(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25169);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25170);aDateTime = getADate("2000-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25171);bDateTime = getADate("2001-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25172);assertEquals("YEARM1a", -1, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25173);assertEquals("YEARP1a", 1, cYear.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25174);aDateTime = getADate("1968-12-31T23:59:59");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25175);bDateTime = getADate("1970-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25176);assertEquals("YEARM1b", -1, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25177);assertEquals("YEARP1b", 1, cYear.compare(bDateTime, aDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25178);aDateTime = getADate("1969-12-31T23:59:59");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25179);bDateTime = getADate("1970-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25180);assertEquals("YEARM1c", -1, cYear.compare(aDateTime, bDateTime));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25181);assertEquals("YEARP1c", 1, cYear.compare(bDateTime, aDateTime));
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}   // end of testYear

    /*
     * 'List' processing tests follow.
     */

    /**
     * Test sorting with full default comparator.
     */
    @Test
    public void testListBasic() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150qit7jfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListBasic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150qit7jfi(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25182);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25183);String[] dtStrs = {
                "1999-02-01T00:00:00",
                "1998-01-20T00:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25184);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25185);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25186);Collections.sort(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25187);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25188);assertEquals("ListBasic", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListBasic

    /**
     * Test sorting with millis of second comparator.
     */
    @Test
    public void testListMillis() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz6yppjfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz6yppjfp(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25189);
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25190);List sl = new ArrayList();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25191);long base = 12345L * 1000L;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25192);sl.add(new DateTime(base + 999L, DateTimeZone.UTC));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25193);sl.add(new DateTime(base + 222L, DateTimeZone.UTC));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25194);sl.add(new DateTime(base + 456L, DateTimeZone.UTC));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25195);sl.add(new DateTime(base + 888L, DateTimeZone.UTC));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25196);sl.add(new DateTime(base + 123L, DateTimeZone.UTC));
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25197);sl.add(new DateTime(base + 000L, DateTimeZone.UTC));
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25198);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25199);Collections.sort(sl, cMillis);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25200);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25201);assertEquals("ListLillis", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListSecond


    /**
     * Test sorting with second comparator.
     */
    @Test
    public void testListSecond() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9fql1jg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9fql1jg2(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25202);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25203);String[] dtStrs = {
                "1999-02-01T00:00:10",
                "1999-02-01T00:00:30",
                "1999-02-01T00:00:25",
                "1999-02-01T00:00:18",
                "1999-02-01T00:00:01",
                "1999-02-01T00:00:59",
                "1999-02-01T00:00:22"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25204);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25205);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25206);Collections.sort(sl, cSecond);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25207);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25208);assertEquals("ListSecond", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListSecond

    /**
     * Test sorting with minute comparator.
     */
    @Test
    public void testListMinute() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqw8crjg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqw8crjg9(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25209);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25210);String[] dtStrs = {
                "1999-02-01T00:10:00",
                "1999-02-01T00:30:00",
                "1999-02-01T00:25:00",
                "1999-02-01T00:18:00",
                "1999-02-01T00:01:00",
                "1999-02-01T00:59:00",
                "1999-02-01T00:22:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25211);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25212);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25213);Collections.sort(sl, cMinute);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25214);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25215);assertEquals("ListMinute", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListMinute

    /**
     * Test sorting with hour comparator.
     */
    @Test
    public void testListHour() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esabrvjgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esabrvjgg(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25216);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25217);String[] dtStrs = {
                "1999-02-01T10:00:00",
                "1999-02-01T23:00:00",
                "1999-02-01T01:00:00",
                "1999-02-01T15:00:00",
                "1999-02-01T05:00:00",
                "1999-02-01T20:00:00",
                "1999-02-01T17:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25218);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25219);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25220);Collections.sort(sl, cHour);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25221);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25222);assertEquals("ListHour", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListHour


    /**
     * Test sorting with day of week comparator.
     */
    @Test
    public void testListDOW() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19l9dnhjgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19l9dnhjgn(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25223);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25224);String[] dtStrs = {
                /* 2002-04-15 = Monday */
                "2002-04-21T10:00:00",
                "2002-04-16T10:00:00",
                "2002-04-15T10:00:00",
                "2002-04-17T10:00:00",
                "2002-04-19T10:00:00",
                "2002-04-18T10:00:00",
                "2002-04-20T10:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25225);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25226);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25227);Collections.sort(sl, cDayOfWeek);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25228);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25229);assertEquals("ListDOW", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListDOW

    /**
     * Test sorting with day of month comparator.
     */
    @Test
    public void testListDOM() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxv0exjgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxv0exjgu(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25230);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25231);String[] dtStrs = {
                /* 2002-04-14 = Sunday */
                "2002-04-20T10:00:00",
                "2002-04-16T10:00:00",
                "2002-04-15T10:00:00",
                "2002-04-17T10:00:00",
                "2002-04-19T10:00:00",
                "2002-04-18T10:00:00",
                "2002-04-14T10:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25232);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25233);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25234);Collections.sort(sl, cDayOfMonth);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25235);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25236);assertEquals("ListDOM", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListDOM

    /**
     * Test sorting with day of year comparator.
     */
    @Test
    public void testListDOY() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1339g2jjh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDOY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1339g2jjh1(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25237);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25238);String[] dtStrs = {
                "2002-04-20T10:00:00",
                "2002-01-16T10:00:00",
                "2002-12-31T10:00:00",
                "2002-09-14T10:00:00",
                "2002-09-19T10:00:00",
                "2002-02-14T10:00:00",
                "2002-10-30T10:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25239);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25240);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25241);Collections.sort(sl, cDayOfYear);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25242);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25243);assertEquals("ListDOY", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListDOY

    /**
     * Test sorting with week of weekyear comparator.
     */
    @Test
    public void testListWOW() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvnjx2jh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListWOW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvnjx2jh8(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25244);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25245);String[] dtStrs = {
                "2002-04-01T10:00:00",
                "2002-01-01T10:00:00",
                "2002-12-01T10:00:00",
                "2002-09-01T10:00:00",
                "2002-09-01T10:00:00",
                "2002-02-01T10:00:00",
                "2002-10-01T10:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25246);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25247);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25248);Collections.sort(sl, cWeekOfWeekyear);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25249);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25250);assertEquals("ListWOW", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListWOW

    /**
     * Test sorting with year (given week) comparator.
     */
    @Test
    public void testListYOYY() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkfiq5jhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListYOYY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkfiq5jhf(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25251);
        // ?? How to catch end conditions ??
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25252);String[] dtStrs = {
                "2010-04-01T10:00:00",
                "2002-01-01T10:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25253);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25254);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25255);Collections.sort(sl, cWeekyear);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25256);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25257);assertEquals("ListYOYY", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListYOYY


    /**
     * Test sorting with month comparator.
     */
    @Test
    public void testListMonth() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bhpzdjjhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bhpzdjjhm(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25258);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25259);String[] dtStrs = {
                "2002-04-01T10:00:00",
                "2002-01-01T10:00:00",
                "2002-12-01T10:00:00",
                "2002-09-01T10:00:00",
                "2002-09-01T10:00:00",
                "2002-02-01T10:00:00",
                "2002-10-01T10:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25260);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25261);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25262);Collections.sort(sl, cMonth);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25263);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25264);assertEquals("ListMonth", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListMonth

    /**
     * Test sorting with year comparator.
     */
    @Test
    public void testListYear() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lh2hxwjht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lh2hxwjht(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25265);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25266);String[] dtStrs = {
                "1999-02-01T00:00:00",
                "1998-02-01T00:00:00",
                "2525-02-01T00:00:00",
                "1776-02-01T00:00:00",
                "1863-02-01T00:00:00",
                "1066-02-01T00:00:00",
                "2100-02-01T00:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25267);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25268);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25269);Collections.sort(sl, cYear);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25270);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25271);assertEquals("ListYear", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListYear

    /**
     * Test sorting with date only comparator.
     */
    @Test
    public void testListDate() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1obr06dji0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1obr06dji0(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25272);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25273);String[] dtStrs = {
                "1999-02-01T00:00:00",
                "1998-10-03T00:00:00",
                "2525-05-20T00:00:00",
                "1776-12-25T00:00:00",
                "1863-01-31T00:00:00",
                "1066-09-22T00:00:00",
                "2100-07-04T00:00:00"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25274);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25275);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25276);Collections.sort(sl, cDate);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25277);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25278);assertEquals("ListDate", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListDate

    /**
     * Test sorting with time only comparator.
     */
    @Test
    public void testListTime() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ix3kroji7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testListTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ix3kroji7(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25279);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25280);String[] dtStrs = {
                "1999-02-01T01:02:05",
                "1999-02-01T22:22:22",
                "1999-02-01T05:30:45",
                "1999-02-01T09:17:59",
                "1999-02-01T09:17:58",
                "1999-02-01T15:30:00",
                "1999-02-01T17:00:44"
        };
        //
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25281);List sl = loadAList(dtStrs);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25282);boolean isSorted1 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25283);Collections.sort(sl, cTime);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25284);boolean isSorted2 = isListSorted(sl);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25285);assertEquals("ListTime", !isSorted1, isSorted2);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}} // end of testListTime


    /**
     * Test comparator operation with null object(s).
     */
    @Test
    public void testNullDT() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0skswjie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testNullDT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0skswjie(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25286);
        // null means now
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25287);aDateTime = getADate("2000-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25288);assertTrue(cYear.compare(null, aDateTime) > 0);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25289);assertTrue(cYear.compare(aDateTime, null) < 0);
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    /**
     * Test comparator operation with an invalid object type.
     */
    @Test
    public void testInvalidObj() {__CLR4_4_1j3dj3dlgchorjd.R.globalSliceStart(getClass().getName(),25290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18mlwzrjii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j3dj3dlgchorjd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j3dj3dlgchorjd.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeComparator.testInvalidObj",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18mlwzrjii(){try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25290);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25291);aDateTime = getADate("2000-01-01T00:00:00");
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25292);try {
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25293);cYear.compare("FreeBird", aDateTime);
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25294);fail("Invalid object failed");
        } catch (IllegalArgumentException cce) {
        }
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    // private convenience methods
    //-----------------------------------------------------------------------

    /**
     * Creates a date to test with.
     */
    private DateTime getADate(String s) {try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25295);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25296);DateTime retDT = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25297);try {
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25298);retDT = new DateTime(s, DateTimeZone.UTC);
        } catch (IllegalArgumentException pe) {
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25299);pe.printStackTrace();
        }
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25300);return retDT;
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    /**
     * Load a string array.
     */
    private List loadAList(String[] someStrs) {try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25301);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25302);List newList = new ArrayList();
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25303);try {
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25304);for (int i = 0; (((i < someStrs.length)&&(__CLR4_4_1j3dj3dlgchorjd.R.iget(25305)!=0|true))||(__CLR4_4_1j3dj3dlgchorjd.R.iget(25306)==0&false)); ++i) {{
                __CLR4_4_1j3dj3dlgchorjd.R.inc(25307);newList.add(new DateTime(someStrs[i], DateTimeZone.UTC));
            } // end of the for
        }} catch (IllegalArgumentException pe) {
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25308);pe.printStackTrace();
        }
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25309);return newList;
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

    /**
     * Check if the list is sorted.
     */
    private boolean isListSorted(List tl) {try{__CLR4_4_1j3dj3dlgchorjd.R.inc(25310);
        // tl must be populated with DateTime objects.
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25311);DateTime lhDT = (DateTime) tl.get(0);
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25312);DateTime rhDT = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25313);Long lhVal = new Long(lhDT.getMillis());
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25314);Long rhVal = null;
        __CLR4_4_1j3dj3dlgchorjd.R.inc(25315);for (int i = 1; (((i < tl.size())&&(__CLR4_4_1j3dj3dlgchorjd.R.iget(25316)!=0|true))||(__CLR4_4_1j3dj3dlgchorjd.R.iget(25317)==0&false)); ++i) {{
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25318);rhDT = (DateTime) tl.get(i);
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25319);rhVal = new Long(rhDT.getMillis());
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25320);if ((((lhVal.compareTo(rhVal) > 0)&&(__CLR4_4_1j3dj3dlgchorjd.R.iget(25321)!=0|true))||(__CLR4_4_1j3dj3dlgchorjd.R.iget(25322)==0&false))) {__CLR4_4_1j3dj3dlgchorjd.R.inc(25323);return false;
            //
            }__CLR4_4_1j3dj3dlgchorjd.R.inc(25324);lhVal = rhVal;  // swap for next iteration
            __CLR4_4_1j3dj3dlgchorjd.R.inc(25325);lhDT = rhDT;    // swap for next iteration
        }
        }__CLR4_4_1j3dj3dlgchorjd.R.inc(25326);return true;
    }finally{__CLR4_4_1j3dj3dlgchorjd.R.flushNeeded();}}

}
