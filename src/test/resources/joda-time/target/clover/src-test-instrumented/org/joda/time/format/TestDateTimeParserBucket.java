/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * Test.
 */
public class TestDateTimeParserBucket {static class __CLR4_4_11k2d1k2dlgchosy0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,72869,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final DateTimeZone ZONE_0400 = DateTimeZone.forOffsetHours(4);
    private static final Chronology ISO_0400 = ISOChronology.getInstance(ZONE_0400);
    private static final int MILLIS_PER_HOUR = 3600000;
    private static final int MILLIS_PER_MINUTE = 60000;
    private static final int OFFSET_0400 = 4 * MILLIS_PER_HOUR;
    private static final Locale LOCALE = Locale.CANADA;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72661);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72662);TestDateTimeParserBucket TB = new TestDateTimeParserBucket();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72663);TB.testConstructor_3arg();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72664);TB.testConstructor_4arg();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72665);TB.testConstructor_5arg();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72666);TB.testSetPivotYear();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72667);TB.testSetOffset();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72668);TB.testSetZone();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72669);TB.testCompute();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72670);TB.testSaveCompute();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72671);TB.testSaveRestoreState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72672);TB.testSaveRestoreState_avoidSideEffects();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72673);TB.testSaveRestoreState_offset();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72674);TB.testSaveRestoreState_zone();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72675);TB.testSaveRestoreState_text();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72676);TB.testSaveRestoreState_twoStates();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72677);TB.testSaveRestoreState_sameStates();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72678);TB.testSaveRestoreState_badType();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72679);TB.testReset();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72680);TB.testParse();
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeParserBucket.class);
    }

    public TestDateTimeParserBucket(String name) {
        super(name);
    }

     */

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_3arg() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1dhpb1k2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testConstructor_3arg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1dhpb1k2x(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72681);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72682);DateTimeParserBucket test = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72683);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72684);assertEquals(LOCALE, test.getLocale());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72685);assertEquals(null, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72686);assertEquals(null, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72687);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_4arg() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6ouhs1k34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testConstructor_4arg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6ouhs1k34(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72688);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72689);DateTimeParserBucket test = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE, 2010);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72690);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72691);assertEquals(LOCALE, test.getLocale());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72692);assertEquals((Integer) 2010, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72693);assertEquals(null, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72694);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testConstructor_5arg() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hc07a91k3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testConstructor_5arg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hc07a91k3b(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72695);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72696);DateTimeParserBucket test = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE, 2010, 2001);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72697);assertEquals(BUDDHIST_UTC, test.getChronology());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72698);assertEquals(LOCALE, test.getLocale());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72699);assertEquals((Integer) 2010, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72700);assertEquals(null, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72701);assertEquals(PARIS, test.getZone());
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testSetPivotYear() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124aqa21k3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSetPivotYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124aqa21k3i(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72702);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72703);DateTimeParserBucket test = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE, 2010, 2001);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72704);assertEquals((Integer) 2010, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72705);test.setPivotYear(null);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72706);assertEquals(null, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72707);test.setPivotYear(2030);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72708);assertEquals((Integer) 2030, test.getPivotYear());
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSetOffset() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s48i5y1k3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSetOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s48i5y1k3p(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72709);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72710);DateTimeParserBucket test = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE, 2010, 2001);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72711);assertEquals(null, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72712);test.setOffset((Integer) 1000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72713);assertEquals((Integer) 1000, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72714);test.setOffset(null);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72715);assertEquals(null, test.getOffsetInteger());
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSetZone() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzn7y51k3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSetZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzn7y51k3w(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72716);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72717);DateTimeParserBucket test = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE, 2010, 2001);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72718);assertEquals(PARIS, test.getZone());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72719);test.setZone(LONDON);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72720);assertEquals(LONDON, test.getZone());
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testCompute() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pewang1k41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testCompute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72721,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pewang1k41(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72721);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72722);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72723);assertEquals(100 - OFFSET_0400, test.computeMillis());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72724);assertEquals(100 - OFFSET_0400, test.computeMillis(false));
        // note that computeMillis(true) differs depending on whether fields are saved or not
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72725);assertEquals(100 - OFFSET_0400, test.computeMillis(true));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveCompute() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyaxcf1k46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveCompute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyaxcf1k46(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72726);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72727);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72728);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72729);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72730);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72731);test.saveField(DateTimeFieldType.hourOfDay(), 5);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72732);assertEquals(5 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72733);assertEquals(5 * MILLIS_PER_HOUR - OFFSET_0400, test.computeMillis(true));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72734);assertEquals(5 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uuzreh1k4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uuzreh1k4f(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72735);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72736);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72737);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72738);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72739);Object state = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72740);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72741);test.saveField(DateTimeFieldType.minuteOfHour(), 6);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72742);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72743);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72744);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72745);test.saveField(DateTimeFieldType.minuteOfHour(), 7);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72746);assertEquals(2 * MILLIS_PER_HOUR + 7 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72747);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72748);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_avoidSideEffects() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_156yzna1k4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_avoidSideEffects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_156yzna1k4t(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72749);
        // computeMillis() has side effects, so check works without it
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72750);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72751);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72752);Object state = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72753);test.saveField(DateTimeFieldType.minuteOfHour(), 6);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72754);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72755);test.saveField(DateTimeFieldType.minuteOfHour(), 7);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72756);assertEquals(2 * MILLIS_PER_HOUR + 7 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72757);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72758);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_offset() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wn4h1j1k53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_offset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wn4h1j1k53(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72759);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72760);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72761);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72762);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72763);Object state = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72764);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72765);test.setOffset((Integer) 0);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72766);assertEquals(2 * MILLIS_PER_HOUR + 100, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72767);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72768);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_zone() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oe49kw1k5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oe49kw1k5d(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72769);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72770);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72771);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72772);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72773);Object state = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72774);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72775);test.setZone(DateTimeZone.UTC);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72776);assertEquals(2 * MILLIS_PER_HOUR + 100, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72777);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72778);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_text() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tnf36p1k5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_text",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tnf36p1k5n(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72779);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72780);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72781);test.saveField(DateTimeFieldType.hourOfDay(), "2", Locale.ENGLISH);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72782);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72783);Object state = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72784);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72785);test.saveField(DateTimeFieldType.minuteOfHour(), "6", Locale.ENGLISH);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72786);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72787);assertEquals(true, test.restoreState(state));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72788);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_twoStates() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suge7s1k5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_twoStates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suge7s1k5x(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72789);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72790);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72791);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72792);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72793);Object state1 = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72794);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72795);test.saveField(DateTimeFieldType.minuteOfHour(), 6);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72796);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72797);Object state2 = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72798);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72799);test.saveField(DateTimeFieldType.secondOfMinute(), 8);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72800);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 8000 + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72801);assertEquals(true, test.restoreState(state2));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72802);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72803);assertEquals(true, test.restoreState(state1));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72804);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72805);assertEquals(true, test.restoreState(state2));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72806);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72807);assertEquals(true, test.restoreState(state1));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72808);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_sameStates() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1noljl01k6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_sameStates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1noljl01k6h(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72809);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72810);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72811);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72812);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72813);Object state1 = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72814);Object state2 = test.saveState();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72815);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72816);test.saveField(DateTimeFieldType.minuteOfHour(), 6);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72817);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72818);assertEquals(true, test.restoreState(state2));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72819);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72820);test.saveField(DateTimeFieldType.minuteOfHour(), 8);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72821);assertEquals(2 * MILLIS_PER_HOUR + 8 * MILLIS_PER_MINUTE + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72822);assertEquals(true, test.restoreState(state1));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72823);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72824);assertEquals(true, test.restoreState(state2));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72825);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72826);assertEquals(true, test.restoreState(state1));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72827);assertEquals(2 * MILLIS_PER_HOUR + 100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testSaveRestoreState_badType() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grl3af1k70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testSaveRestoreState_badType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grl3af1k70(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72828);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72829);DateTimeParserBucket bucket1 = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72830);DateTimeParserBucket bucket2 = new DateTimeParserBucket(100, BUDDHIST_PARIS, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72831);assertEquals(false, bucket1.restoreState(null));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72832);assertEquals(false, bucket1.restoreState(""));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72833);assertEquals(false, bucket2.restoreState(bucket1.saveState()));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testReset() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jq2kc1k76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jq2kc1k76(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72834);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72835);DateTimeParserBucket test = new DateTimeParserBucket(100, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72836);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72837);assertEquals(LOCALE, test.getLocale());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72838);assertEquals((Integer) 2000, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72839);assertEquals(null, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72840);assertEquals(ZONE_0400, test.getZone());

        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72841);test.setOffset((Integer) 200);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72842);test.setZone(LONDON);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72843);test.saveField(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72844);assertEquals(2 * MILLIS_PER_HOUR + 100 - 200, test.computeMillis(false));
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72845);assertEquals((Integer) 200, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72846);assertEquals(LONDON, test.getZone());

        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72847);test.reset();
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72848);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72849);assertEquals(LOCALE, test.getLocale());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72850);assertEquals((Integer) 2000, test.getPivotYear());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72851);assertEquals(null, test.getOffsetInteger());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72852);assertEquals(ZONE_0400, test.getZone());
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72853);assertEquals(100 - OFFSET_0400, test.computeMillis(false));
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

    @Test
    public void testParse() {__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceStart(getClass().getName(),72854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se4tqw1k7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11k2d1k2dlgchosy0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11k2d1k2dlgchosy0.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeParserBucket.testParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se4tqw1k7q(){try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72854);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72855);DateTimeParserBucket test = new DateTimeParserBucket(0, ISO_0400, LOCALE, 2000, 2000);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72856);DateTimeParser parser = new DateTimeParser() {
            public int parseInto(DateTimeParserBucket bucket, String text, int position) {try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72857);
                __CLR4_4_11k2d1k2dlgchosy0.R.inc(72858);bucket.saveField(DateTimeFieldType.hourOfDay(), 2);
                __CLR4_4_11k2d1k2dlgchosy0.R.inc(72859);bucket.saveField(DateTimeFieldType.minuteOfHour(), 6);
                __CLR4_4_11k2d1k2dlgchosy0.R.inc(72860);return position + 1;
            }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

            public int estimateParsedLength() {try{__CLR4_4_11k2d1k2dlgchosy0.R.inc(72861);
                __CLR4_4_11k2d1k2dlgchosy0.R.inc(72862);return 1;
            }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}
        };
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72863);long millis = test.parseMillis(parser, "A");
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72864);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE - OFFSET_0400, millis);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72865);millis = test.parseMillis(parser, "B");
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72866);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE - OFFSET_0400, millis);
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72867);millis = test.parseMillis(parser, "C");
        __CLR4_4_11k2d1k2dlgchosy0.R.inc(72868);assertEquals(2 * MILLIS_PER_HOUR + 6 * MILLIS_PER_MINUTE - OFFSET_0400, millis);
    }finally{__CLR4_4_11k2d1k2dlgchosy0.R.flushNeeded();}}

}
