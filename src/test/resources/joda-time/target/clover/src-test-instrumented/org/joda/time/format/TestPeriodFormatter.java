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

import java.io.CharArrayWriter;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Period Formating.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatter {static class __CLR4_4_11mot1motlgchot1p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,76200,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);

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
    private PeriodFormatter f = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11mot1motlgchot1p.R.inc(76061);
        __CLR4_4_11mot1motlgchot1p.R.inc(76062);TestPeriodFormatter TB = new TestPeriodFormatter();
        __CLR4_4_11mot1motlgchot1p.R.inc(76063);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76064);TB.testPrint_simple();
        __CLR4_4_11mot1motlgchot1p.R.inc(76065);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76066);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76067);TB.testPrint_bufferMethods();
        __CLR4_4_11mot1motlgchot1p.R.inc(76068);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76069);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76070);TB.testPrint_writerMethods();
        __CLR4_4_11mot1motlgchot1p.R.inc(76071);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76072);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76073);TB.testWithGetLocaleMethods();
        __CLR4_4_11mot1motlgchot1p.R.inc(76074);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76075);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76076);TB.testWithGetParseTypeMethods();
        __CLR4_4_11mot1motlgchot1p.R.inc(76077);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76078);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76079);TB.testPrinterParserMethods();
        __CLR4_4_11mot1motlgchot1p.R.inc(76080);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76081);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76082);TB.testParsePeriod_simple();
        __CLR4_4_11mot1motlgchot1p.R.inc(76083);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76084);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76085);TB.testParsePeriod_parseType();
        __CLR4_4_11mot1motlgchot1p.R.inc(76086);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76087);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76088);TB.testParseMutablePeriod_simple();
        __CLR4_4_11mot1motlgchot1p.R.inc(76089);TB.tearDown();
        __CLR4_4_11mot1motlgchot1p.R.inc(76090);TB.setUp();
        __CLR4_4_11mot1motlgchot1p.R.inc(76091);TB.testParseInto_simple();
        __CLR4_4_11mot1motlgchot1p.R.inc(76092);TB.tearDown();
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriodFormatter.class);
    }

    public TestPeriodFormatter(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11mot1motlgchot1p.R.inc(76093);
        __CLR4_4_11mot1motlgchot1p.R.inc(76094);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11mot1motlgchot1p.R.inc(76095);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11mot1motlgchot1p.R.inc(76096);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11mot1motlgchot1p.R.inc(76097);originalLocale = Locale.getDefault();
        __CLR4_4_11mot1motlgchot1p.R.inc(76098);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11mot1motlgchot1p.R.inc(76099);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11mot1motlgchot1p.R.inc(76100);Locale.setDefault(Locale.UK);
        __CLR4_4_11mot1motlgchot1p.R.inc(76101);f = ISOPeriodFormat.standard();
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11mot1motlgchot1p.R.inc(76102);
        __CLR4_4_11mot1motlgchot1p.R.inc(76103);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11mot1motlgchot1p.R.inc(76104);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11mot1motlgchot1p.R.inc(76105);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11mot1motlgchot1p.R.inc(76106);Locale.setDefault(originalLocale);
        __CLR4_4_11mot1motlgchot1p.R.inc(76107);originalDateTimeZone = null;
        __CLR4_4_11mot1motlgchot1p.R.inc(76108);originalTimeZone = null;
        __CLR4_4_11mot1motlgchot1p.R.inc(76109);originalLocale = null;
        __CLR4_4_11mot1motlgchot1p.R.inc(76110);f = null;
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_simple() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1le5eil1mq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1le5eil1mq7(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76111);
        __CLR4_4_11mot1motlgchot1p.R.inc(76112);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76113);assertEquals("P1Y2M3W4DT5H6M7.008S", f.print(p));
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_bufferMethods() throws Exception {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz4zx11mqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_bufferMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz4zx11mqa() throws Exception{try{__CLR4_4_11mot1motlgchot1p.R.inc(76114);
        __CLR4_4_11mot1motlgchot1p.R.inc(76115);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76116);StringBuffer buf = new StringBuffer();
        __CLR4_4_11mot1motlgchot1p.R.inc(76117);f.printTo(buf, p);
        __CLR4_4_11mot1motlgchot1p.R.inc(76118);assertEquals("P1Y2M3W4DT5H6M7.008S", buf.toString());

        __CLR4_4_11mot1motlgchot1p.R.inc(76119);buf = new StringBuffer();
        __CLR4_4_11mot1motlgchot1p.R.inc(76120);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76121);f.printTo(buf, null);
            __CLR4_4_11mot1motlgchot1p.R.inc(76122);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPrint_writerMethods() throws Exception {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcbrku1mqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrint_writerMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcbrku1mqj() throws Exception{try{__CLR4_4_11mot1motlgchot1p.R.inc(76123);
        __CLR4_4_11mot1motlgchot1p.R.inc(76124);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76125);CharArrayWriter out = new CharArrayWriter();
        __CLR4_4_11mot1motlgchot1p.R.inc(76126);f.printTo(out, p);
        __CLR4_4_11mot1motlgchot1p.R.inc(76127);assertEquals("P1Y2M3W4DT5H6M7.008S", out.toString());

        __CLR4_4_11mot1motlgchot1p.R.inc(76128);out = new CharArrayWriter();
        __CLR4_4_11mot1motlgchot1p.R.inc(76129);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76130);f.printTo(out, null);
            __CLR4_4_11mot1motlgchot1p.R.inc(76131);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithGetLocaleMethods() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14siwo11mqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetLocaleMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14siwo11mqs(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76132);
        __CLR4_4_11mot1motlgchot1p.R.inc(76133);PeriodFormatter f2 = f.withLocale(Locale.FRENCH);
        __CLR4_4_11mot1motlgchot1p.R.inc(76134);assertEquals(Locale.FRENCH, f2.getLocale());
        __CLR4_4_11mot1motlgchot1p.R.inc(76135);assertSame(f2, f2.withLocale(Locale.FRENCH));

        __CLR4_4_11mot1motlgchot1p.R.inc(76136);f2 = f.withLocale(null);
        __CLR4_4_11mot1motlgchot1p.R.inc(76137);assertEquals(null, f2.getLocale());
        __CLR4_4_11mot1motlgchot1p.R.inc(76138);assertSame(f2, f2.withLocale(null));
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    @Test
    public void testWithGetParseTypeMethods() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fuqf561mqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testWithGetParseTypeMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fuqf561mqz(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76139);
        __CLR4_4_11mot1motlgchot1p.R.inc(76140);PeriodFormatter f2 = f.withParseType(PeriodType.dayTime());
        __CLR4_4_11mot1motlgchot1p.R.inc(76141);assertEquals(PeriodType.dayTime(), f2.getParseType());
        __CLR4_4_11mot1motlgchot1p.R.inc(76142);assertSame(f2, f2.withParseType(PeriodType.dayTime()));

        __CLR4_4_11mot1motlgchot1p.R.inc(76143);f2 = f.withParseType(null);
        __CLR4_4_11mot1motlgchot1p.R.inc(76144);assertEquals(null, f2.getParseType());
        __CLR4_4_11mot1motlgchot1p.R.inc(76145);assertSame(f2, f2.withParseType(null));
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    @Test
    public void testPrinterParserMethods() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6rfoy1mr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testPrinterParserMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6rfoy1mr6(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76146);
        __CLR4_4_11mot1motlgchot1p.R.inc(76147);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76148);PeriodFormatter f2 = new PeriodFormatter(f.getPrinter(), f.getParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76149);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_11mot1motlgchot1p.R.inc(76150);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76151);assertEquals(true, f2.isPrinter());
        __CLR4_4_11mot1motlgchot1p.R.inc(76152);assertEquals(true, f2.isParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76153);assertNotNull(f2.print(p));
        __CLR4_4_11mot1motlgchot1p.R.inc(76154);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S"));

        __CLR4_4_11mot1motlgchot1p.R.inc(76155);f2 = new PeriodFormatter(f.getPrinter(), null);
        __CLR4_4_11mot1motlgchot1p.R.inc(76156);assertEquals(f.getPrinter(), f2.getPrinter());
        __CLR4_4_11mot1motlgchot1p.R.inc(76157);assertEquals(null, f2.getParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76158);assertEquals(true, f2.isPrinter());
        __CLR4_4_11mot1motlgchot1p.R.inc(76159);assertEquals(false, f2.isParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76160);assertNotNull(f2.print(p));
        __CLR4_4_11mot1motlgchot1p.R.inc(76161);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76162);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S"));
            __CLR4_4_11mot1motlgchot1p.R.inc(76163);fail();
        } catch (UnsupportedOperationException ex) {
        }

        __CLR4_4_11mot1motlgchot1p.R.inc(76164);f2 = new PeriodFormatter(null, f.getParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76165);assertEquals(null, f2.getPrinter());
        __CLR4_4_11mot1motlgchot1p.R.inc(76166);assertEquals(f.getParser(), f2.getParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76167);assertEquals(false, f2.isPrinter());
        __CLR4_4_11mot1motlgchot1p.R.inc(76168);assertEquals(true, f2.isParser());
        __CLR4_4_11mot1motlgchot1p.R.inc(76169);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76170);f2.print(p);
            __CLR4_4_11mot1motlgchot1p.R.inc(76171);fail();
        } catch (UnsupportedOperationException ex) {
        }
        __CLR4_4_11mot1motlgchot1p.R.inc(76172);assertNotNull(f2.parsePeriod("P1Y2M3W4DT5H6M7.008S"));
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParsePeriod_simple() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipzvqi1mrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipzvqi1mrx(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76173);
        __CLR4_4_11mot1motlgchot1p.R.inc(76174);Period expect = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76175);assertEquals(expect, f.parsePeriod("P1Y2M3W4DT5H6M7.008S"));

        __CLR4_4_11mot1motlgchot1p.R.inc(76176);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76177);f.parsePeriod("ABC");
            __CLR4_4_11mot1motlgchot1p.R.inc(76178);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    @Test
    public void testParsePeriod_parseType() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw999z1ms3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParsePeriod_parseType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw999z1ms3(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76179);
        __CLR4_4_11mot1motlgchot1p.R.inc(76180);Period expect = new Period(0, 0, 0, 4, 5, 6, 7, 8, PeriodType.dayTime());
        __CLR4_4_11mot1motlgchot1p.R.inc(76181);assertEquals(expect, f.withParseType(PeriodType.dayTime()).parsePeriod("P4DT5H6M7.008S"));
        __CLR4_4_11mot1motlgchot1p.R.inc(76182);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76183);f.withParseType(PeriodType.dayTime()).parsePeriod("P3W4DT5H6M7.008S");
            __CLR4_4_11mot1motlgchot1p.R.inc(76184);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseMutablePeriod_simple() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1crtn21ms9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseMutablePeriod_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1crtn21ms9(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76185);
        __CLR4_4_11mot1motlgchot1p.R.inc(76186);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76187);assertEquals(expect, f.parseMutablePeriod("P1Y2M3W4DT5H6M7.008S"));

        __CLR4_4_11mot1motlgchot1p.R.inc(76188);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76189);f.parseMutablePeriod("ABC");
            __CLR4_4_11mot1motlgchot1p.R.inc(76190);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testParseInto_simple() {__CLR4_4_11mot1motlgchot1p.R.globalSliceStart(getClass().getName(),76191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1of64s71msf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11mot1motlgchot1p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11mot1motlgchot1p.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormatter.testParseInto_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),76191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1of64s71msf(){try{__CLR4_4_11mot1motlgchot1p.R.inc(76191);
        __CLR4_4_11mot1motlgchot1p.R.inc(76192);MutablePeriod expect = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11mot1motlgchot1p.R.inc(76193);MutablePeriod result = new MutablePeriod();
        __CLR4_4_11mot1motlgchot1p.R.inc(76194);assertEquals(20, f.parseInto(result, "P1Y2M3W4DT5H6M7.008S", 0));
        __CLR4_4_11mot1motlgchot1p.R.inc(76195);assertEquals(expect, result);

        __CLR4_4_11mot1motlgchot1p.R.inc(76196);try {
            __CLR4_4_11mot1motlgchot1p.R.inc(76197);f.parseInto(null, "P1Y2M3W4DT5H6M7.008S", 0);
            __CLR4_4_11mot1motlgchot1p.R.inc(76198);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11mot1motlgchot1p.R.inc(76199);assertEquals(~0, f.parseInto(result, "ABC", 0));
    }finally{__CLR4_4_11mot1motlgchot1p.R.flushNeeded();}}

}
