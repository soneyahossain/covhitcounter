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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadableInstantConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableInstantConverter {static class __CLR4_4_11f0d1f0dlgchosqo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66109);
        //junit.textui.TestRunner.run(suite());


        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66110);TestReadableInstantConverter TB = new TestReadableInstantConverter();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66111);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66112);TB.testSingleton();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66113);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66114);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66115);TB.testSupportedType();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66116);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66117);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66118);TB.testGetInstantMillis_Object_Chronology();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66119);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66120);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66121);TB.testGetChronology_Object_Zone();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66122);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66123);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66124);TB.testGetChronology_Object_nullChronology();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66125);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66126);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66127);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66128);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66129);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66130);TB.testGetPartialValues();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66131);TB.tearDown();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66132);TB.setUp();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66133);TB.testToString();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66134);TB.tearDown();
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestReadableInstantConverter.class);
    }

    public TestReadableInstantConverter(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66135);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66136);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66137);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66138);
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1f17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1f17() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66139);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66140);Class cls = ReadableInstantConverter.class;
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66141);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66142);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66143);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66144);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66145);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66146);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66147);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66148);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66149);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66150);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1f1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1f1j() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66151);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66152);assertEquals(ReadableInstant.class, ReadableInstantConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib1f1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib1f1l() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66153);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66154);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), JULIAN));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66155);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), JULIAN));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66156);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), (Chronology) null));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66157);assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), (Chronology) null));
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1f1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1f1q() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66158);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66159);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), PARIS));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66160);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), PARIS));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66161);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), DateTimeZone.getDefault()));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66162);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), DateTimeZone.getDefault()));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66163);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (DateTimeZone) null));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66164);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (DateTimeZone) null));

        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66165);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L, new MockBadChronology()), PARIS));

        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66166);MutableDateTime mdt = new MutableDateTime() {
            public Chronology getChronology() {try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66167);
                __CLR4_4_11f0d1f0dlgchosqo.R.inc(66168);return null; // bad
            }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}
        };
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66169);assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(mdt, PARIS));
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_nullChronology() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqqm9p1f22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_nullChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqqm9p1f22() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66170);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66171);assertEquals(ISO.withUTC(), ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (Chronology) null));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66172);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (Chronology) null));

        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66173);MutableDateTime mdt = new MutableDateTime() {
            public Chronology getChronology() {try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66174);
                __CLR4_4_11f0d1f0dlgchosqo.R.inc(66175);return null; // bad
            }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}
        };
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66176);assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(mdt, (Chronology) null));
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1f29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1f29() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66177);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66178);assertEquals(JULIAN, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), JULIAN));
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66179);assertEquals(JULIAN, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), JULIAN));
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1f2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1f2c() throws Exception{try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66180);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66181);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66182);int[] expected = ISOChronology.getInstance().get(tod, 12345678L);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66183);int[] actual = ReadableInstantConverter.INSTANCE.getPartialValues(tod, new Instant(12345678L), ISOChronology.getInstance());
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66184);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceStart(getClass().getName(),66185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1f2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f0d1f0dlgchosqo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f0d1f0dlgchosqo.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableInstantConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1f2h(){try{__CLR4_4_11f0d1f0dlgchosqo.R.inc(66185);
        __CLR4_4_11f0d1f0dlgchosqo.R.inc(66186);assertEquals("Converter[org.joda.time.ReadableInstant]", ReadableInstantConverter.INSTANCE.toString());
    }finally{__CLR4_4_11f0d1f0dlgchosqo.R.flushNeeded();}}

}
