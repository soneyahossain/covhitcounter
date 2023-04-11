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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePartialConverter.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestReadablePartialConverter {static class __CLR4_4_11f5y1f5ylgchosqv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    private static Chronology BUDDHIST;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66310);

        //junit.textui.TestRunner.run(suite());
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66311);TestReadablePartialConverter TB = new TestReadablePartialConverter();

        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66312);TB.setUp();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66313);TB.testSingleton();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66314);TB.tearDown();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66315);TB.setUp();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66316);TB.testSupportedType();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66317);TB.tearDown();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66318);TB.setUp();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66319);TB.testGetChronology_Object_Zone();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66320);TB.tearDown();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66321);TB.setUp();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66322);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66323);TB.tearDown();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66324);TB.setUp();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66325);TB.testGetPartialValues();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66326);TB.tearDown();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66327);TB.setUp();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66328);TB.testToString();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66329);TB.tearDown();
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestReadablePartialConverter.class);
    }

    public TestReadablePartialConverter(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66330);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66331);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66332);ISO = ISOChronology.getInstance();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66333);BUDDHIST = BuddhistChronology.getInstance();
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66334);

    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceStart(getClass().getName(),66335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1f6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f5y1f5ylgchosqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1f6n() throws Exception{try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66335);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66336);Class cls = ReadablePartialConverter.class;
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66337);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66338);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66339);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66340);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66341);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66342);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66343);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66344);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66345);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66346);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceStart(getClass().getName(),66347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1f6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f5y1f5ylgchosqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1f6z() throws Exception{try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66347);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66348);assertEquals(ReadablePartial.class, ReadablePartialConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceStart(getClass().getName(),66349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1f71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f5y1f5ylgchosqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1f71() throws Exception{try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66349);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66350);assertEquals(ISO_PARIS, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), PARIS));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66351);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), DateTimeZone.getDefault()));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66352);assertEquals(ISO, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), (DateTimeZone) null));
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceStart(getClass().getName(),66353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1f75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f5y1f5ylgchosqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1f75() throws Exception{try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66353);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66354);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), JULIAN));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66355);assertEquals(JULIAN, ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L), JULIAN));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66356);assertEquals(BUDDHIST.withUTC(), ReadablePartialConverter.INSTANCE.getChronology(new TimeOfDay(123L, BUDDHIST), (Chronology) null));
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceStart(getClass().getName(),66357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1f79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f5y1f5ylgchosqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1f79() throws Exception{try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66357);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66358);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66359);int[] expected = new int[]{1, 2, 3, 4};
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66360);int[] actual = ReadablePartialConverter.INSTANCE.getPartialValues(tod, new TimeOfDay(1, 2, 3, 4), ISOChronology.getInstance(PARIS));
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66361);assertEquals(true, Arrays.equals(expected, actual));

        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66362);try {
            __CLR4_4_11f5y1f5ylgchosqv.R.inc(66363);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new YearMonthDay(2005, 6, 9), JULIAN);
            __CLR4_4_11f5y1f5ylgchosqv.R.inc(66364);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66365);try {
            __CLR4_4_11f5y1f5ylgchosqv.R.inc(66366);ReadablePartialConverter.INSTANCE.getPartialValues(tod, new MockTOD(), JULIAN);
            __CLR4_4_11f5y1f5ylgchosqv.R.inc(66367);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

    static class MockTOD extends BasePartial {
        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66368);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_11f5y1f5ylgchosqv.R.inc(66369);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_11f5y1f5ylgchosqv.R.inc(66370);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11f5y1f5ylgchosqv.R.inc(66371);return chrono.hourOfDay();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_11f5y1f5ylgchosqv.R.inc(66372);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11f5y1f5ylgchosqv.R.inc(66373);return chrono.minuteOfHour();
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_11f5y1f5ylgchosqv.R.inc(66374);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11f5y1f5ylgchosqv.R.inc(66375);return chrono.year();
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_11f5y1f5ylgchosqv.R.inc(66376);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11f5y1f5ylgchosqv.R.inc(66377);return chrono.era();
            }
            __CLR4_4_11f5y1f5ylgchosqv.R.inc(66378);return null;
        }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

        public int size() {try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66379);
            __CLR4_4_11f5y1f5ylgchosqv.R.inc(66380);return 4;
        }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceStart(getClass().getName(),66381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1f7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f5y1f5ylgchosqv.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f5y1f5ylgchosqv.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePartialConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1f7x(){try{__CLR4_4_11f5y1f5ylgchosqv.R.inc(66381);
        __CLR4_4_11f5y1f5ylgchosqv.R.inc(66382);assertEquals("Converter[org.joda.time.ReadablePartial]", ReadablePartialConverter.INSTANCE.toString());
    }finally{__CLR4_4_11f5y1f5ylgchosqv.R.flushNeeded();}}

}
