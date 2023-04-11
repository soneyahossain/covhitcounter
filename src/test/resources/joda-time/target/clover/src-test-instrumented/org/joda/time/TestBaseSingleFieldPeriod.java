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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.BaseSingleFieldPeriod;

/**
 * This class is a Junit unit test for BaseSingleFieldPeriod.
 *
 * @author Stephen Colebourne
 */
public class TestBaseSingleFieldPeriod {static class __CLR4_4_1hiyhiylgchorep{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,22916,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) throws Exception {try{__CLR4_4_1hiyhiylgchorep.R.inc(22714);
        __CLR4_4_1hiyhiylgchorep.R.inc(22715);TestBaseSingleFieldPeriod TB = new TestBaseSingleFieldPeriod();
        __CLR4_4_1hiyhiylgchorep.R.inc(22716);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22717);TB.testFactory_between_RInstant();
        __CLR4_4_1hiyhiylgchorep.R.inc(22718);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22719);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22720);TB.testFactory_between_RPartial();
        __CLR4_4_1hiyhiylgchorep.R.inc(22721);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22722);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22723);TB.testFactory_standardPeriodIn_RPeriod();
        __CLR4_4_1hiyhiylgchorep.R.inc(22724);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22725);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22726);TB.testValueIndexMethods();
        __CLR4_4_1hiyhiylgchorep.R.inc(22727);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22728);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22729);TB.testFieldTypeIndexMethods();
        __CLR4_4_1hiyhiylgchorep.R.inc(22730);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22731);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22732);TB.testIsSupported();
        __CLR4_4_1hiyhiylgchorep.R.inc(22733);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22734);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22735);TB.testGet();
        __CLR4_4_1hiyhiylgchorep.R.inc(22736);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22737);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22738);TB.testEqualsHashCode();
        __CLR4_4_1hiyhiylgchorep.R.inc(22739);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22740);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22741);TB.testCompareTo();
        __CLR4_4_1hiyhiylgchorep.R.inc(22742);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22743);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22744);TB.testToPeriod();
        __CLR4_4_1hiyhiylgchorep.R.inc(22745);TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22746);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22747);TB.testToMutablePeriod();
        __CLR4_4_1hiyhiylgchorep.R.inc(22748);TB.tearDown();
        //TB.setUp(); TB.testToDurationFrom(); TB.tearDown();
        //TB.setUp(); TB.testToDurationTo(); TB.tearDown();
        __CLR4_4_1hiyhiylgchorep.R.inc(22749);TB.setUp();
        __CLR4_4_1hiyhiylgchorep.R.inc(22750);TB.testGetSetValue();
        __CLR4_4_1hiyhiylgchorep.R.inc(22751);TB.tearDown();

    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}
    /*
    public static TestSuite suite() {
        return new TestSuite(TestBaseSingleFieldPeriod.class);
    }

    public TestBaseSingleFieldPeriod(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1hiyhiylgchorep.R.inc(22752);
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1hiyhiylgchorep.R.inc(22753);
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFactory_between_RInstant() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vdthtghk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_between_RInstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vdthtghk2(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22754);
        // test using Days
        __CLR4_4_1hiyhiylgchorep.R.inc(22755);DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS);
        __CLR4_4_1hiyhiylgchorep.R.inc(22756);DateTime end1 = new DateTime(2006, 6, 12, 12, 0, 0, 0, PARIS);
        __CLR4_4_1hiyhiylgchorep.R.inc(22757);DateTime end2 = new DateTime(2006, 6, 15, 18, 0, 0, 0, PARIS);

        __CLR4_4_1hiyhiylgchorep.R.inc(22758);assertEquals(3, Single.between(start, end1, DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22759);assertEquals(0, Single.between(start, start, DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22760);assertEquals(0, Single.between(end1, end1, DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22761);assertEquals(-3, Single.between(end1, start, DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22762);assertEquals(6, Single.between(start, end2, DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22763);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22764);Single.between(start, (ReadableInstant) null, DurationFieldType.days());
            __CLR4_4_1hiyhiylgchorep.R.inc(22765);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22766);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22767);Single.between((ReadableInstant) null, end1, DurationFieldType.days());
            __CLR4_4_1hiyhiylgchorep.R.inc(22768);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22769);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22770);Single.between((ReadableInstant) null, (ReadableInstant) null, DurationFieldType.days());
            __CLR4_4_1hiyhiylgchorep.R.inc(22771);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testFactory_between_RPartial() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n66voshkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_between_RPartial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n66voshkk(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22772);
        __CLR4_4_1hiyhiylgchorep.R.inc(22773);LocalDate start = new LocalDate(2006, 6, 9);
        __CLR4_4_1hiyhiylgchorep.R.inc(22774);LocalDate end1 = new LocalDate(2006, 6, 12);
        __CLR4_4_1hiyhiylgchorep.R.inc(22775);YearMonthDay end2 = new YearMonthDay(2006, 6, 15);

        __CLR4_4_1hiyhiylgchorep.R.inc(22776);Single zero = new Single(0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22777);assertEquals(3, Single.between(start, end1, zero));
        __CLR4_4_1hiyhiylgchorep.R.inc(22778);assertEquals(0, Single.between(start, start, zero));
        __CLR4_4_1hiyhiylgchorep.R.inc(22779);assertEquals(0, Single.between(end1, end1, zero));
        __CLR4_4_1hiyhiylgchorep.R.inc(22780);assertEquals(-3, Single.between(end1, start, zero));
        __CLR4_4_1hiyhiylgchorep.R.inc(22781);assertEquals(6, Single.between(start, end2, zero));
        __CLR4_4_1hiyhiylgchorep.R.inc(22782);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22783);Single.between(start, (ReadablePartial) null, zero);
            __CLR4_4_1hiyhiylgchorep.R.inc(22784);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22785);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22786);Single.between((ReadablePartial) null, end1, zero);
            __CLR4_4_1hiyhiylgchorep.R.inc(22787);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22788);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22789);Single.between((ReadablePartial) null, (ReadablePartial) null, zero);
            __CLR4_4_1hiyhiylgchorep.R.inc(22790);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22791);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22792);Single.between(start, new LocalTime(), zero);
            __CLR4_4_1hiyhiylgchorep.R.inc(22793);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22794);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22795);Single.between(new Partial(DateTimeFieldType.dayOfWeek(), 2), new Partial(DateTimeFieldType.dayOfMonth(), 3), zero);
            __CLR4_4_1hiyhiylgchorep.R.inc(22796);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22797);Partial p = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.hourOfDay()},
                new int[]{1, 2});
        __CLR4_4_1hiyhiylgchorep.R.inc(22798);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22799);Single.between(p, p, zero);
            __CLR4_4_1hiyhiylgchorep.R.inc(22800);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @Test
    public void testFactory_standardPeriodIn_RPeriod() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmo2clhld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFactory_standardPeriodIn_RPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmo2clhld(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22801);
        __CLR4_4_1hiyhiylgchorep.R.inc(22802);assertEquals(0, Single.standardPeriodIn((ReadablePeriod) null, DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22803);assertEquals(0, Single.standardPeriodIn(Period.ZERO, DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22804);assertEquals(1, Single.standardPeriodIn(new Period(0, 0, 0, 1, 0, 0, 0, 0), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22805);assertEquals(123, Single.standardPeriodIn(Period.days(123), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22806);assertEquals(-987, Single.standardPeriodIn(Period.days(-987), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22807);assertEquals(1, Single.standardPeriodIn(Period.hours(47), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22808);assertEquals(2, Single.standardPeriodIn(Period.hours(48), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22809);assertEquals(2, Single.standardPeriodIn(Period.hours(49), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22810);assertEquals(14, Single.standardPeriodIn(Period.weeks(2), DateTimeConstants.MILLIS_PER_DAY));
        __CLR4_4_1hiyhiylgchorep.R.inc(22811);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22812);Single.standardPeriodIn(Period.months(1), DateTimeConstants.MILLIS_PER_DAY);
            __CLR4_4_1hiyhiylgchorep.R.inc(22813);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testValueIndexMethods() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4dda2hlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testValueIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4dda2hlq(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22814);
        __CLR4_4_1hiyhiylgchorep.R.inc(22815);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22816);assertEquals(1, test.size());
        __CLR4_4_1hiyhiylgchorep.R.inc(22817);assertEquals(20, test.getValue(0));
        __CLR4_4_1hiyhiylgchorep.R.inc(22818);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22819);test.getValue(1);
            __CLR4_4_1hiyhiylgchorep.R.inc(22820);fail();
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @Test
    public void testFieldTypeIndexMethods() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc4i9jhlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testFieldTypeIndexMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc4i9jhlx(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22821);
        __CLR4_4_1hiyhiylgchorep.R.inc(22822);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22823);assertEquals(1, test.size());
        __CLR4_4_1hiyhiylgchorep.R.inc(22824);assertEquals(DurationFieldType.days(), test.getFieldType(0));
        __CLR4_4_1hiyhiylgchorep.R.inc(22825);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22826);test.getFieldType(1);
            __CLR4_4_1hiyhiylgchorep.R.inc(22827);fail();
        } catch (IndexOutOfBoundsException ex) {
            // expected
        }
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24nhm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24nhm4(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22828);
        __CLR4_4_1hiyhiylgchorep.R.inc(22829);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22830);assertEquals(false, test.isSupported(DurationFieldType.years()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22831);assertEquals(false, test.isSupported(DurationFieldType.months()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22832);assertEquals(false, test.isSupported(DurationFieldType.weeks()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22833);assertEquals(true, test.isSupported(DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22834);assertEquals(false, test.isSupported(DurationFieldType.hours()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22835);assertEquals(false, test.isSupported(DurationFieldType.minutes()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22836);assertEquals(false, test.isSupported(DurationFieldType.seconds()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22837);assertEquals(false, test.isSupported(DurationFieldType.millis()));
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @Test
    public void testGet() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vhme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vhme(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22838);
        __CLR4_4_1hiyhiylgchorep.R.inc(22839);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22840);assertEquals(0, test.get(DurationFieldType.years()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22841);assertEquals(0, test.get(DurationFieldType.months()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22842);assertEquals(0, test.get(DurationFieldType.weeks()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22843);assertEquals(20, test.get(DurationFieldType.days()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22844);assertEquals(0, test.get(DurationFieldType.hours()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22845);assertEquals(0, test.get(DurationFieldType.minutes()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22846);assertEquals(0, test.get(DurationFieldType.seconds()));
        __CLR4_4_1hiyhiylgchorep.R.inc(22847);assertEquals(0, test.get(DurationFieldType.millis()));
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77hmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77hmo(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22848);
        __CLR4_4_1hiyhiylgchorep.R.inc(22849);Single testA = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22850);Single testB = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22851);assertEquals(true, testA.equals(testB));
        __CLR4_4_1hiyhiylgchorep.R.inc(22852);assertEquals(true, testB.equals(testA));
        __CLR4_4_1hiyhiylgchorep.R.inc(22853);assertEquals(true, testA.equals(testA));
        __CLR4_4_1hiyhiylgchorep.R.inc(22854);assertEquals(true, testB.equals(testB));
        __CLR4_4_1hiyhiylgchorep.R.inc(22855);assertEquals(true, testA.hashCode() == testB.hashCode());
        __CLR4_4_1hiyhiylgchorep.R.inc(22856);assertEquals(true, testA.hashCode() == testA.hashCode());
        __CLR4_4_1hiyhiylgchorep.R.inc(22857);assertEquals(true, testB.hashCode() == testB.hashCode());

        __CLR4_4_1hiyhiylgchorep.R.inc(22858);Single testC = new Single(30);
        __CLR4_4_1hiyhiylgchorep.R.inc(22859);assertEquals(false, testA.equals(testC));
        __CLR4_4_1hiyhiylgchorep.R.inc(22860);assertEquals(false, testB.equals(testC));
        __CLR4_4_1hiyhiylgchorep.R.inc(22861);assertEquals(false, testC.equals(testA));
        __CLR4_4_1hiyhiylgchorep.R.inc(22862);assertEquals(false, testC.equals(testB));
        __CLR4_4_1hiyhiylgchorep.R.inc(22863);assertEquals(false, testA.hashCode() == testC.hashCode());
        __CLR4_4_1hiyhiylgchorep.R.inc(22864);assertEquals(false, testB.hashCode() == testC.hashCode());

        __CLR4_4_1hiyhiylgchorep.R.inc(22865);assertEquals(true, testA.equals(Days.days(20)));
        __CLR4_4_1hiyhiylgchorep.R.inc(22866);assertEquals(true, testA.equals(new Period(0, 0, 0, 20, 0, 0, 0, 0, PeriodType.days())));
        __CLR4_4_1hiyhiylgchorep.R.inc(22867);assertEquals(false, testA.equals(Period.days(2)));
        __CLR4_4_1hiyhiylgchorep.R.inc(22868);assertEquals(false, testA.equals("Hello"));
        __CLR4_4_1hiyhiylgchorep.R.inc(22869);assertEquals(false, testA.equals(Hours.hours(2)));
        __CLR4_4_1hiyhiylgchorep.R.inc(22870);assertEquals(false, testA.equals(null));
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfvhnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfvhnb(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22871);
        __CLR4_4_1hiyhiylgchorep.R.inc(22872);Single test1 = new Single(21);
        __CLR4_4_1hiyhiylgchorep.R.inc(22873);Single test2 = new Single(22);
        __CLR4_4_1hiyhiylgchorep.R.inc(22874);Single test3 = new Single(23);
        __CLR4_4_1hiyhiylgchorep.R.inc(22875);assertEquals(true, test1.compareTo(test1) == 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22876);assertEquals(true, test1.compareTo(test2) < 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22877);assertEquals(true, test1.compareTo(test3) < 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22878);assertEquals(true, test2.compareTo(test1) > 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22879);assertEquals(true, test2.compareTo(test2) == 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22880);assertEquals(true, test2.compareTo(test3) < 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22881);assertEquals(true, test3.compareTo(test1) > 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22882);assertEquals(true, test3.compareTo(test2) > 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22883);assertEquals(true, test3.compareTo(test3) == 0);

//        try {
//            test1.compareTo("Hello");
//            fail();
//        } catch (ClassCastException ex) {
//            // expected
//        }
//        try {
//            test1.compareTo(new Period(0, 0, 0, 21, 0, 0, 0, 0, PeriodType.days()));
//            fail();
//        } catch (ClassCastException ex) {
//            // expected
//        }
        __CLR4_4_1hiyhiylgchorep.R.inc(22884);try {
            __CLR4_4_1hiyhiylgchorep.R.inc(22885);test1.compareTo(null);
            __CLR4_4_1hiyhiylgchorep.R.inc(22886);fail();
        } catch (NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToPeriod() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvhk17hnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvhk17hnr(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22887);
        __CLR4_4_1hiyhiylgchorep.R.inc(22888);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22889);Period expected = Period.days(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22890);assertEquals(expected, test.toPeriod());
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    @Test
    public void testToMutablePeriod() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13v2j33hnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testToMutablePeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13v2j33hnv(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22891);
        __CLR4_4_1hiyhiylgchorep.R.inc(22892);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22893);MutablePeriod expected = new MutablePeriod(0, 0, 0, 20, 0, 0, 0, 0);
        __CLR4_4_1hiyhiylgchorep.R.inc(22894);assertEquals(expected, test.toMutablePeriod());
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

//    @Test public void testToDurationFrom() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
//    }
//
//    @Test public void testToDurationTo() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L)));
//    }
//

    //-----------------------------------------------------------------------
    @Test
    public void testGetSetValue() {__CLR4_4_1hiyhiylgchorep.R.globalSliceStart(getClass().getName(),22895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op2p3uhnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hiyhiylgchorep.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hiyhiylgchorep.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestBaseSingleFieldPeriod.testGetSetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op2p3uhnz(){try{__CLR4_4_1hiyhiylgchorep.R.inc(22895);
        __CLR4_4_1hiyhiylgchorep.R.inc(22896);Single test = new Single(20);
        __CLR4_4_1hiyhiylgchorep.R.inc(22897);assertEquals(20, test.getValue());
        __CLR4_4_1hiyhiylgchorep.R.inc(22898);test.setValue(10);
        __CLR4_4_1hiyhiylgchorep.R.inc(22899);assertEquals(10, test.getValue());
    }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test class.
     */
    static class Single extends BaseSingleFieldPeriod {

        public Single(int period) {
            super(period);__CLR4_4_1hiyhiylgchorep.R.inc(22901);try{__CLR4_4_1hiyhiylgchorep.R.inc(22900);
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {try{__CLR4_4_1hiyhiylgchorep.R.inc(22902);
            __CLR4_4_1hiyhiylgchorep.R.inc(22903);return BaseSingleFieldPeriod.between(start, end, field);
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {try{__CLR4_4_1hiyhiylgchorep.R.inc(22904);
            __CLR4_4_1hiyhiylgchorep.R.inc(22905);return BaseSingleFieldPeriod.between(start, end, zeroInstance);
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {try{__CLR4_4_1hiyhiylgchorep.R.inc(22906);
            __CLR4_4_1hiyhiylgchorep.R.inc(22907);return BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit);
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public DurationFieldType getFieldType() {try{__CLR4_4_1hiyhiylgchorep.R.inc(22908);
            __CLR4_4_1hiyhiylgchorep.R.inc(22909);return DurationFieldType.days();
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public PeriodType getPeriodType() {try{__CLR4_4_1hiyhiylgchorep.R.inc(22910);
            __CLR4_4_1hiyhiylgchorep.R.inc(22911);return PeriodType.days();
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public int getValue() {try{__CLR4_4_1hiyhiylgchorep.R.inc(22912);
            __CLR4_4_1hiyhiylgchorep.R.inc(22913);return super.getValue();
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_4_1hiyhiylgchorep.R.inc(22914);
            __CLR4_4_1hiyhiylgchorep.R.inc(22915);super.setValue(value);
        }finally{__CLR4_4_1hiyhiylgchorep.R.flushNeeded();}}
    }

}
