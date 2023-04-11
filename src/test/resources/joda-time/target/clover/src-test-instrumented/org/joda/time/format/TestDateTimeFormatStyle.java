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

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle {static class __CLR4_4_11ipk1ipklgchosvl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,71151,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

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

    public static void main(String[] args) throws Exception {try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70904);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70905);TestDateTimeFormatStyle TB = new TestDateTimeFormatStyle();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70906);TB.setUp();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70907);TB.testForStyle_stringLengths();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70908);TB.tearDown();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70909);TB.setUp();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70910);TB.testForStyle_invalidStrings();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70911);TB.tearDown();


        //TB.setUp(); TB.testForStyle_shortDate(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_shortTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_shortDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_mediumDate(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_mediumTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_mediumDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_longDate(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_longTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_longDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_fullDate(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_fullTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_fullDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_shortMediumDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_shortLongDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_shortFullDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_mediumShortDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_mediumLongDateTime(); TB.tearDown();
        //TB.setUp(); TB.testForStyle_mediumFullDateTime(); TB.tearDown();
        //TB.setUp(); TB.test_patternForStyle(); TB.tearDown();

    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFormatStyle.class);
    }

    public TestDateTimeFormatStyle(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70912);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70913);System.out.println("setting up...............");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70914);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70915);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70916);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70917);originalLocale = Locale.getDefault();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70918);DateTimeZone.setDefault(LONDON);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70919);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70920);Locale.setDefault(UK);
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70921);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70922);System.out.println("cleaning up...............");

        __CLR4_4_11ipk1ipklgchosvl.R.inc(70923);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70924);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70925);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70926);Locale.setDefault(originalLocale);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70927);originalDateTimeZone = null;
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70928);originalTimeZone = null;
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70929);originalLocale = null;
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForStyle_stringLengths() {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),70930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xgww721iqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_stringLengths",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xgww721iqa(){try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70930);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70931);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70932);DateTimeFormat.forStyle(null);
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70933);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70934);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70935);DateTimeFormat.forStyle("");
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70936);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70937);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70938);DateTimeFormat.forStyle("S");
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70939);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70940);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70941);DateTimeFormat.forStyle("SSS");
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70942);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    @Test
    public void testForStyle_invalidStrings() {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),70943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18doind1iqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_invalidStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18doind1iqn(){try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70943);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70944);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70945);DateTimeFormat.forStyle("AA");
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70946);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70947);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70948);DateTimeFormat.forStyle("--");
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70949);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70950);try {
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70951);DateTimeFormat.forStyle("ss");
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70952);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testForStyle_shortDate() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),70953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aihouk1iqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aihouk1iqx() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70953);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70954);DateTimeFormatter f = DateTimeFormat.shortDate();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70955);DateTimeFormatter g = DateTimeFormat.forStyle("S-");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70956);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70957);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);


        __CLR4_4_11ipk1ipklgchosvl.R.inc(70958);String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70959);assertEquals(expect, f.print(dt));

        __CLR4_4_11ipk1ipklgchosvl.R.inc(70960);expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70961);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70962);expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70963);assertEquals(expect, f.withLocale(FRANCE).print(dt));

        __CLR4_4_11ipk1ipklgchosvl.R.inc(70964);DateTime date = new DateTime(
                DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).parse(expect));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70965);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect));

    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_shortTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),70966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_153u9fv1ira();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_153u9fv1ira() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70966);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70967);DateTimeFormatter f = DateTimeFormat.shortTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70968);DateTimeFormatter g = DateTimeFormat.forStyle("-S");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70969);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70970);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70971);String expect = DateFormat.getTimeInstance(DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70972);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70973);expect = DateFormat.getTimeInstance(DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70974);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70975);expect = DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70976);assertEquals(expect, f.withLocale(FRANCE).print(dt));

        __CLR4_4_11ipk1ipklgchosvl.R.inc(70977);if ((((TimeZone.getDefault() instanceof SimpleTimeZone)&&(__CLR4_4_11ipk1ipklgchosvl.R.iget(70978)!=0|true))||(__CLR4_4_11ipk1ipklgchosvl.R.iget(70979)==0&false))) {{
            // skip test, as it needs historical time zone info
        } }else {{
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70980);DateTime date = new DateTime(
                    DateFormat.getTimeInstance(DateFormat.SHORT, FRANCE).parse(expect));
            __CLR4_4_11ipk1ipklgchosvl.R.inc(70981);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect));
        }
    }}finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_shortDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),70982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qszv3b1irq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qszv3b1irq() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70982);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70983);DateTimeFormatter f = DateTimeFormat.shortDateTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70984);DateTimeFormatter g = DateTimeFormat.forStyle("SS");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70985);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70986);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70987);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70988);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70989);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70990);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70991);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70992);assertEquals(expect, f.withLocale(FRANCE).print(dt));

        __CLR4_4_11ipk1ipklgchosvl.R.inc(70993);DateTime date = new DateTime(
                DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, FRANCE).parse(expect));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70994);assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testForStyle_mediumDate() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),70995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rd1kcv1is3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rd1kcv1is3() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(70995);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70996);DateTimeFormatter f = DateTimeFormat.mediumDate();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70997);DateTimeFormatter g = DateTimeFormat.forStyle("M-");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70998);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(70999);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71000);String expect = DateFormat.getDateInstance(DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71001);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71002);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71003);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71004);expect = DateFormat.getDateInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71005);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_mediumTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lye4y61ise();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lye4y61ise() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71006);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71007);DateTimeFormatter f = DateTimeFormat.mediumTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71008);DateTimeFormatter g = DateTimeFormat.forStyle("-M");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71009);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71010);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71011);String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71012);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71013);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71014);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71015);expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71016);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_mediumDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfe25g1isp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfe25g1isp() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71017);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71018);DateTimeFormatter f = DateTimeFormat.mediumDateTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71019);DateTimeFormatter g = DateTimeFormat.forStyle("MM");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71020);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71021);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71022);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71023);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71024);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71025);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71026);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71027);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testForStyle_longDate() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cukq461it0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cukq461it0() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71028);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71029);DateTimeFormatter f = DateTimeFormat.longDate();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71030);DateTimeFormatter g = DateTimeFormat.forStyle("L-");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71031);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71032);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71033);String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71034);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71035);expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71036);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71037);expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71038);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_longTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17fxaph1itb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17fxaph1itb() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71039);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71040);DateTimeFormatter f = DateTimeFormat.longTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71041);DateTimeFormatter g = DateTimeFormat.forStyle("-L");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71042);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71043);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71044);String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71045);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71046);expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71047);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71048);expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71049);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_longDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1muj30j1itm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_longDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1muj30j1itm() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71050);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71051);DateTimeFormatter f = DateTimeFormat.longDateTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71052);DateTimeFormatter g = DateTimeFormat.forStyle("LL");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71053);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71054);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71055);String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71056);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71057);expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71058);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71059);expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71060);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testForStyle_fullDate() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cbvjd1itx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cbvjd1itx() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71061);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71062);DateTimeFormatter f = DateTimeFormat.fullDate();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71063);DateTimeFormatter g = DateTimeFormat.forStyle("F-");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71064);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71065);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71066);String expect = DateFormat.getDateInstance(DateFormat.FULL, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71067);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71068);expect = DateFormat.getDateInstance(DateFormat.FULL, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71069);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71070);expect = DateFormat.getDateInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71071);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_fullTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12bjvc1iu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12bjvc1iu8() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71072);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71073);DateTimeFormatter f = DateTimeFormat.fullTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71074);DateTimeFormatter g = DateTimeFormat.forStyle("-F");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71075);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71076);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71077);String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71078);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71079);expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71080);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71081);expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71082);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_fullDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135obbe1iuj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_fullDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135obbe1iuj() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71083);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71084);DateTimeFormatter f = DateTimeFormat.fullDateTime();
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71085);DateTimeFormatter g = DateTimeFormat.forStyle("FF");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71086);assertSame(g, f);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71087);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71088);String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71089);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71090);expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71091);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71092);expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71093);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testForStyle_shortMediumDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1d0ni1iuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortMediumDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1d0ni1iuu() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71094);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71095);DateTimeFormatter f = DateTimeFormat.forStyle("SM");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71096);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71097);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71098);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71099);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71100);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71101);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71102);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_shortLongDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wje7ij1iv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortLongDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wje7ij1iv3() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71103);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71104);DateTimeFormatter f = DateTimeFormat.forStyle("SL");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71105);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71106);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71107);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71108);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71109);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71110);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71111);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_shortFullDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chig4o1ivc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_shortFullDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chig4o1ivc() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71112);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71113);DateTimeFormatter f = DateTimeFormat.forStyle("SF");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71114);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71115);String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71116);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71117);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71118);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71119);expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71120);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testForStyle_mediumShortDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16okc3g1ivl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumShortDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16okc3g1ivl() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71121);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71122);DateTimeFormatter f = DateTimeFormat.forStyle("MS");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71123);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71124);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71125);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71126);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71127);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71128);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71129);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_mediumLongDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11pgoy01ivu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumLongDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11pgoy01ivu() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71130);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71131);DateTimeFormatter f = DateTimeFormat.forStyle("ML");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71132);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71133);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71134);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71135);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71136);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71137);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71138);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void testForStyle_mediumFullDateTime() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpo39x1iw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.testForStyle_mediumFullDateTime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpo39x1iw3() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71139);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71140);DateTimeFormatter f = DateTimeFormat.forStyle("MF");
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71141);DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71142);String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71143);assertEquals(expect, f.print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71144);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71145);assertEquals(expect, f.withLocale(US).print(dt));
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71146);expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71147);assertEquals(expect, f.withLocale(FRANCE).print(dt));
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

    //@Test
    public void test_patternForStyle() throws Exception {__CLR4_4_11ipk1ipklgchosvl.R.globalSliceStart(getClass().getName(),71148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogdljm1iwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ipk1ipklgchosvl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ipk1ipklgchosvl.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatStyle.test_patternForStyle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogdljm1iwc() throws Exception{try{__CLR4_4_11ipk1ipklgchosvl.R.inc(71148);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71149);String format = DateTimeFormat.patternForStyle("MF", UK);
        __CLR4_4_11ipk1ipklgchosvl.R.inc(71150);assertNotNull(format);
    }finally{__CLR4_4_11ipk1ipklgchosvl.R.flushNeeded();}}

}
