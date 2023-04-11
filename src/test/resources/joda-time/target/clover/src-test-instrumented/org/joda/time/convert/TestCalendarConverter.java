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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.After;
import org.junit.Before;

/**
 * This class is a Junit unit test for CalendarConverter.
 *
 * @author Stephen Colebourne
 */
public class TestCalendarConverter {static class __CLR4_4_11dyp1dyplgchospg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,64854,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//} extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static Chronology JULIAN;
    private static Chronology ISO;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11dyp1dyplgchospg.R.inc(64753);

        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11dyp1dyplgchospg.R.inc(64754);TestCalendarConverter TB = new TestCalendarConverter();


        __CLR4_4_11dyp1dyplgchospg.R.inc(64755);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64756);TB.testSingleton();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64757);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64758);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64759);TB.testSupportedType();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64760);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64761);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64762);TB.testGetInstantMillis_Object_Chronology();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64763);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64764);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64765);TB.testGetChronology_Object_Zone();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64766);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64767);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64768);TB.testGetChronology_Object_nullChronology();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64769);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64770);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64771);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64772);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64773);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64774);TB.testGetPartialValues();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64775);TB.tearDown();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64776);TB.setUp();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64777);TB.testToString();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64778);TB.tearDown();

    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}


    /*
    public static TestSuite suite() {
        return new TestSuite(TestCalendarConverter.class);
    }

    public TestCalendarConverter(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11dyp1dyplgchospg.R.inc(64779);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64780);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64781);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11dyp1dyplgchospg.R.inc(64782);

    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1dzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1dzj() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64783);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64784);Class cls = CalendarConverter.class;
        __CLR4_4_11dyp1dyplgchospg.R.inc(64785);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64786);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64787);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64788);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64789);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64790);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64791);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11dyp1dyplgchospg.R.inc(64792);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64793);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64794);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1dzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1dzv() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64795);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64796);assertEquals(Calendar.class, CalendarConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib1dzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib1dzx() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64797);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64798);GregorianCalendar cal = new GregorianCalendar();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64799);cal.setTime(new Date(123L));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64800);assertEquals(123L, CalendarConverter.INSTANCE.getInstantMillis(cal, JULIAN));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64801);assertEquals(123L, cal.getTime().getTime());
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1e02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1e02() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64802);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64803);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64804);assertEquals(GJChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, MOSCOW));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64805);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64806);assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (DateTimeZone) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64807);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64808);cal.setGregorianChange(new Date(0L));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64809);assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, MOSCOW));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64810);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64811);cal.setGregorianChange(new Date(Long.MAX_VALUE));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64812);assertEquals(JulianChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, PARIS));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64813);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64814);cal.setGregorianChange(new Date(Long.MIN_VALUE));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64815);assertEquals(GregorianChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, PARIS));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64816);Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64817);assertEquals(ISOChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(uc, PARIS));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64818);try {
            __CLR4_4_11dyp1dyplgchospg.R.inc(64819);Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance();
            __CLR4_4_11dyp1dyplgchospg.R.inc(64820);bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
            __CLR4_4_11dyp1dyplgchospg.R.inc(64821);assertEquals(BuddhistChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(bc, PARIS));
        } catch (ClassNotFoundException ex) {
            // ignore not Sun JDK
        } catch (IllegalAccessException ex) {
            // ignore JDK 9 modules
        }
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_nullChronology() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqqm9p1e0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqqm9p1e0m() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64822);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64823);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64824);assertEquals(GJChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64825);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64826);cal.setGregorianChange(new Date(0L));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64827);assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64828);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64829);cal.setGregorianChange(new Date(Long.MAX_VALUE));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64830);assertEquals(JulianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64831);cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64832);cal.setGregorianChange(new Date(Long.MIN_VALUE));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64833);assertEquals(GregorianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64834);cal = new GregorianCalendar(new MockUnknownTimeZone());
        __CLR4_4_11dyp1dyplgchospg.R.inc(64835);assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64836);Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64837);assertEquals(ISOChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(uc, (Chronology) null));

        __CLR4_4_11dyp1dyplgchospg.R.inc(64838);try {
            __CLR4_4_11dyp1dyplgchospg.R.inc(64839);Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance();
            __CLR4_4_11dyp1dyplgchospg.R.inc(64840);bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow"));
            __CLR4_4_11dyp1dyplgchospg.R.inc(64841);assertEquals(BuddhistChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(bc, (Chronology) null));
        } catch (ClassNotFoundException ex) {
            // ignore not Sun JDK
        } catch (IllegalAccessException ex) {
            // ignore JDK 9 modules
        }
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1e16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1e16() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64842);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64843);GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64844);assertEquals(JULIAN, CalendarConverter.INSTANCE.getChronology(cal, JULIAN));
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1e19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1e19() throws Exception{try{__CLR4_4_11dyp1dyplgchospg.R.inc(64845);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64846);GregorianCalendar cal = new GregorianCalendar();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64847);cal.setTime(new Date(12345678L));
        __CLR4_4_11dyp1dyplgchospg.R.inc(64848);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11dyp1dyplgchospg.R.inc(64849);int[] expected = ISO.get(tod, 12345678L);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64850);int[] actual = CalendarConverter.INSTANCE.getPartialValues(tod, cal, ISO);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64851);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11dyp1dyplgchospg.R.globalSliceStart(getClass().getName(),64852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1e1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyp1dyplgchospg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyp1dyplgchospg.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestCalendarConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1e1g(){try{__CLR4_4_11dyp1dyplgchospg.R.inc(64852);
        __CLR4_4_11dyp1dyplgchospg.R.inc(64853);assertEquals("Converter[java.util.Calendar]", CalendarConverter.INSTANCE.toString());
    }finally{__CLR4_4_11dyp1dyplgchospg.R.flushNeeded();}}

}
