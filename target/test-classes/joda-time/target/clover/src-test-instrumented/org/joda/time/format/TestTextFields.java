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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/**
 * Makes sure that text fields are correct for English.
 *
 * @author Brian S O'Neill
 */
public class TestTextFields {static class __CLR4_4_11nl51nl5lgchot2o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone[] ZONES = {
            DateTimeZone.UTC,
            DateTimeZone.forID("Europe/Paris"),
            DateTimeZone.forID("Europe/London"),
            DateTimeZone.forID("Asia/Tokyo"),
            DateTimeZone.forID("America/Los_Angeles"),
    };

    private static final String[] MONTHS = {
            null,
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final String[] WEEKDAYS = {
            null,
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    private static final String[] HALFDAYS = {
            "AM", "PM"
    };

    private DateTimeZone originalDateTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77225);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77226);TestTextFields TB = new TestTextFields();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77227);TB.setUp();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77228);TB.testMonthNames_monthStart();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77229);TB.tearDown();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77230);TB.setUp();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77231);TB.testMonthNames_monthMiddle();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77232);TB.tearDown();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77233);TB.setUp();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77234);TB.testMonthNames_monthEnd();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77235);TB.tearDown();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77236);TB.setUp();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77237);TB.testWeekdayNames();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77238);TB.tearDown();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77239);TB.setUp();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77240);TB.testHalfdayNames();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77241);TB.tearDown();

    }finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestTextFields.class);
    }

    public TestTextFields(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77242);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77243);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77244);originalLocale = Locale.getDefault();
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77245);DateTimeZone.setDefault(ZONES[0]);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77246);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77247);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77248);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77249);Locale.setDefault(originalLocale);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77250);originalDateTimeZone = null;
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77251);originalLocale = null;
    }finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMonthNames_monthStart() {__CLR4_4_11nl51nl5lgchot2o.R.globalSliceStart(getClass().getName(),77252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1va8dym1nlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nl51nl5lgchot2o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nl51nl5lgchot2o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testMonthNames_monthStart",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1va8dym1nlw(){try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77252);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77253);DateTimeFormatter printer = DateTimeFormat.forPattern("MMMM");
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77254);for (int i = 0; (((i < ZONES.length)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77255)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77256)==0&false)); i++) {{
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77257);for (int month = 1; (((month <= 12)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77258)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77259)==0&false)); month++) {{
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77260);DateTime dt = new DateTime(2004, month, 1, 1, 20, 30, 40, ZONES[i]);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77261);String monthText = printer.print(dt);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77262);assertEquals(MONTHS[month], monthText);
            }
        }}
    }}finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    @Test
    public void testMonthNames_monthMiddle() {__CLR4_4_11nl51nl5lgchot2o.R.globalSliceStart(getClass().getName(),77263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msk4tl1nm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nl51nl5lgchot2o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nl51nl5lgchot2o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testMonthNames_monthMiddle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msk4tl1nm7(){try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77263);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77264);DateTimeFormatter printer = DateTimeFormat.forPattern("MMMM");
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77265);for (int i = 0; (((i < ZONES.length)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77266)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77267)==0&false)); i++) {{
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77268);for (int month = 1; (((month <= 12)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77269)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77270)==0&false)); month++) {{
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77271);DateTime dt = new DateTime(2004, month, 15, 12, 20, 30, 40, ZONES[i]);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77272);String monthText = printer.print(dt);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77273);assertEquals(MONTHS[month], monthText);
            }
        }}
    }}finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    @Test
    public void testMonthNames_monthEnd() {__CLR4_4_11nl51nl5lgchot2o.R.globalSliceStart(getClass().getName(),77274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kghfax1nmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nl51nl5lgchot2o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nl51nl5lgchot2o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testMonthNames_monthEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kghfax1nmi(){try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77274);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77275);DateTimeFormatter printer = DateTimeFormat.forPattern("MMMM");
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77276);for (int i = 0; (((i < ZONES.length)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77277)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77278)==0&false)); i++) {{
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77279);Chronology chrono = ISOChronology.getInstance(ZONES[i]);
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77280);for (int month = 1; (((month <= 12)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77281)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77282)==0&false)); month++) {{
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77283);DateTime dt = new DateTime(2004, month, 1, 23, 20, 30, 40, chrono);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77284);int lastDay = chrono.dayOfMonth().getMaximumValue(dt.getMillis());
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77285);dt = new DateTime(2004, month, lastDay, 23, 20, 30, 40, chrono);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77286);String monthText = printer.print(dt);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77287);assertEquals(MONTHS[month], monthText);
            }
        }}
    }}finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    @Test
    public void testWeekdayNames() {__CLR4_4_11nl51nl5lgchot2o.R.globalSliceStart(getClass().getName(),77288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6cjp51nmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nl51nl5lgchot2o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nl51nl5lgchot2o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testWeekdayNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6cjp51nmw(){try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77288);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77289);DateTimeFormatter printer = DateTimeFormat.forPattern("EEEE");
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77290);for (int i = 0; (((i < ZONES.length)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77291)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77292)==0&false)); i++) {{
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77293);MutableDateTime mdt = new MutableDateTime(2004, 1, 1, 1, 20, 30, 40, ZONES[i]);
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77294);for (int day = 1; (((day <= 366)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77295)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77296)==0&false)); day++) {{
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77297);mdt.setDayOfYear(day);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77298);int weekday = mdt.getDayOfWeek();
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77299);String weekdayText = printer.print(mdt);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77300);assertEquals(WEEKDAYS[weekday], weekdayText);
            }
        }}
    }}finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}

    @Test
    public void testHalfdayNames() {__CLR4_4_11nl51nl5lgchot2o.R.globalSliceStart(getClass().getName(),77301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f5lpew1nn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nl51nl5lgchot2o.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nl51nl5lgchot2o.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestTextFields.testHalfdayNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f5lpew1nn9(){try{__CLR4_4_11nl51nl5lgchot2o.R.inc(77301);
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77302);DateTimeFormatter printer = DateTimeFormat.forPattern("a");
        __CLR4_4_11nl51nl5lgchot2o.R.inc(77303);for (int i = 0; (((i < ZONES.length)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77304)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77305)==0&false)); i++) {{
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77306);Chronology chrono = ISOChronology.getInstance(ZONES[i]);
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77307);MutableDateTime mdt = new MutableDateTime(2004, 5, 30, 0, 20, 30, 40, chrono);
            __CLR4_4_11nl51nl5lgchot2o.R.inc(77308);for (int hour = 0; (((hour < 24)&&(__CLR4_4_11nl51nl5lgchot2o.R.iget(77309)!=0|true))||(__CLR4_4_11nl51nl5lgchot2o.R.iget(77310)==0&false)); hour++) {{
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77311);mdt.setHourOfDay(hour);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77312);int halfday = mdt.get(chrono.halfdayOfDay());
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77313);String halfdayText = printer.print(mdt);
                __CLR4_4_11nl51nl5lgchot2o.R.inc(77314);assertEquals(HALFDAYS[halfday], halfdayText);
            }
        }}
    }}finally{__CLR4_4_11nl51nl5lgchot2o.R.flushNeeded();}}
}
