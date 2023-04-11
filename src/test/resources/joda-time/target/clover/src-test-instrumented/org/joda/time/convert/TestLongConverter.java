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
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for LongConverter.
 *
 * @author Stephen Colebourne
 */
public class TestLongConverter {static class __CLR4_4_11ety1etylgchosqe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,65940,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11ety1etylgchosqe.R.inc(65878);
        //junit.textui.TestRunner.run(suite());


        __CLR4_4_11ety1etylgchosqe.R.inc(65879);TestLongConverter TB = new TestLongConverter();

        __CLR4_4_11ety1etylgchosqe.R.inc(65880);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65881);TB.testSingleton();
        __CLR4_4_11ety1etylgchosqe.R.inc(65882);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65883);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65884);TB.testSupportedType();
        __CLR4_4_11ety1etylgchosqe.R.inc(65885);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65886);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65887);TB.testGetInstantMillis_Object_Chronology();
        __CLR4_4_11ety1etylgchosqe.R.inc(65888);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65889);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65890);TB.testGetChronology_Object_Zone();
        __CLR4_4_11ety1etylgchosqe.R.inc(65891);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65892);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65893);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11ety1etylgchosqe.R.inc(65894);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65895);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65896);TB.testGetPartialValues();
        __CLR4_4_11ety1etylgchosqe.R.inc(65897);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65898);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65899);TB.testGetDurationMillis_Object();
        __CLR4_4_11ety1etylgchosqe.R.inc(65900);TB.tearDown();
        __CLR4_4_11ety1etylgchosqe.R.inc(65901);TB.setUp();
        __CLR4_4_11ety1etylgchosqe.R.inc(65902);TB.testToString();
        __CLR4_4_11ety1etylgchosqe.R.inc(65903);TB.tearDown();

    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}


    /*
    public static TestSuite suite() {
        return new TestSuite(TestLongConverter.class);
    }

    public TestLongConverter(String name) {
        super(name);
    }
     */


    @Before
    public void setUp() throws Exception {try{__CLR4_4_11ety1etylgchosqe.R.inc(65904);
        __CLR4_4_11ety1etylgchosqe.R.inc(65905);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11ety1etylgchosqe.R.inc(65906);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11ety1etylgchosqe.R.inc(65907);

    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1eus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1eus() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65908);
        __CLR4_4_11ety1etylgchosqe.R.inc(65909);Class cls = LongConverter.class;
        __CLR4_4_11ety1etylgchosqe.R.inc(65910);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11ety1etylgchosqe.R.inc(65911);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11ety1etylgchosqe.R.inc(65912);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11ety1etylgchosqe.R.inc(65913);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11ety1etylgchosqe.R.inc(65914);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11ety1etylgchosqe.R.inc(65915);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11ety1etylgchosqe.R.inc(65916);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11ety1etylgchosqe.R.inc(65917);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11ety1etylgchosqe.R.inc(65918);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11ety1etylgchosqe.R.inc(65919);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1ev4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1ev4() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65920);
        __CLR4_4_11ety1etylgchosqe.R.inc(65921);assertEquals(Long.class, LongConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib1ev6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib1ev6() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65922);
        __CLR4_4_11ety1etylgchosqe.R.inc(65923);assertEquals(123L, LongConverter.INSTANCE.getInstantMillis(new Long(123L), JULIAN));
        __CLR4_4_11ety1etylgchosqe.R.inc(65924);assertEquals(123L, LongConverter.INSTANCE.getInstantMillis(new Long(123L), (Chronology) null));
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1ev9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1ev9() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65925);
        __CLR4_4_11ety1etylgchosqe.R.inc(65926);assertEquals(ISO_PARIS, LongConverter.INSTANCE.getChronology(new Long(123L), PARIS));
        __CLR4_4_11ety1etylgchosqe.R.inc(65927);assertEquals(ISO, LongConverter.INSTANCE.getChronology(new Long(123L), (DateTimeZone) null));
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1evc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1evc() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65928);
        __CLR4_4_11ety1etylgchosqe.R.inc(65929);assertEquals(JULIAN, LongConverter.INSTANCE.getChronology(new Long(123L), JULIAN));
        __CLR4_4_11ety1etylgchosqe.R.inc(65930);assertEquals(ISO, LongConverter.INSTANCE.getChronology(new Long(123L), (Chronology) null));
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1evf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1evf() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65931);
        __CLR4_4_11ety1etylgchosqe.R.inc(65932);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11ety1etylgchosqe.R.inc(65933);int[] expected = ISOChronology.getInstance().get(tod, 12345678L);
        __CLR4_4_11ety1etylgchosqe.R.inc(65934);int[] actual = LongConverter.INSTANCE.getPartialValues(tod, new Long(12345678L), ISOChronology.getInstance());
        __CLR4_4_11ety1etylgchosqe.R.inc(65935);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf1evk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf1evk() throws Exception{try{__CLR4_4_11ety1etylgchosqe.R.inc(65936);
        __CLR4_4_11ety1etylgchosqe.R.inc(65937);assertEquals(123L, LongConverter.INSTANCE.getDurationMillis(new Long(123L)));
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11ety1etylgchosqe.R.globalSliceStart(getClass().getName(),65938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1evm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ety1etylgchosqe.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ety1etylgchosqe.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestLongConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1evm(){try{__CLR4_4_11ety1etylgchosqe.R.inc(65938);
        __CLR4_4_11ety1etylgchosqe.R.inc(65939);assertEquals("Converter[java.lang.Long]", LongConverter.INSTANCE.toString());
    }finally{__CLR4_4_11ety1etylgchosqe.R.flushNeeded();}}

}
