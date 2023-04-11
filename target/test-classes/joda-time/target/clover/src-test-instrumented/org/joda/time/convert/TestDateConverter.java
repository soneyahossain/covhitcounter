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
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateConverter.
 *
 * @author Stephen Colebourne
 */
public class TestDateConverter {static class __CLR4_4_11esi1esilgchosqb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,65878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology ISO;
    private static Chronology JULIAN;
    private static Chronology COPTIC;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11esi1esilgchosqb.R.inc(65826);

        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11esi1esilgchosqb.R.inc(65827);TestDateConverter TB = new TestDateConverter();

        __CLR4_4_11esi1esilgchosqb.R.inc(65828);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65829);TB.testSingleton();
        __CLR4_4_11esi1esilgchosqb.R.inc(65830);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65831);TB.testSupportedType();
        __CLR4_4_11esi1esilgchosqb.R.inc(65832);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65833);TB.testGetInstantMillis_Object_Chronology();
        __CLR4_4_11esi1esilgchosqb.R.inc(65834);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65835);TB.testGetChronology_Object_Zone();
        __CLR4_4_11esi1esilgchosqb.R.inc(65836);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65837);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11esi1esilgchosqb.R.inc(65838);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65839);TB.testGetPartialValues();
        __CLR4_4_11esi1esilgchosqb.R.inc(65840);TB.setUp();
        __CLR4_4_11esi1esilgchosqb.R.inc(65841);TB.testToString();
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateConverter.class);
    }

    public TestDateConverter(String name) {
        super(name);
    }
 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11esi1esilgchosqb.R.inc(65842);
        __CLR4_4_11esi1esilgchosqb.R.inc(65843);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11esi1esilgchosqb.R.inc(65844);COPTIC = CopticChronology.getInstance();
        __CLR4_4_11esi1esilgchosqb.R.inc(65845);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1et2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1et2() throws Exception{try{__CLR4_4_11esi1esilgchosqb.R.inc(65846);
        __CLR4_4_11esi1esilgchosqb.R.inc(65847);Class cls = DateConverter.class;
        __CLR4_4_11esi1esilgchosqb.R.inc(65848);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11esi1esilgchosqb.R.inc(65849);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11esi1esilgchosqb.R.inc(65850);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11esi1esilgchosqb.R.inc(65851);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11esi1esilgchosqb.R.inc(65852);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11esi1esilgchosqb.R.inc(65853);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11esi1esilgchosqb.R.inc(65854);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11esi1esilgchosqb.R.inc(65855);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11esi1esilgchosqb.R.inc(65856);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11esi1esilgchosqb.R.inc(65857);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1ete();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1ete() throws Exception{try{__CLR4_4_11esi1esilgchosqb.R.inc(65858);
        __CLR4_4_11esi1esilgchosqb.R.inc(65859);assertEquals(Date.class, DateConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib1etg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib1etg() throws Exception{try{__CLR4_4_11esi1esilgchosqb.R.inc(65860);
        __CLR4_4_11esi1esilgchosqb.R.inc(65861);Date date = new Date(123L);
        __CLR4_4_11esi1esilgchosqb.R.inc(65862);long millis = DateConverter.INSTANCE.getInstantMillis(date, JULIAN);
        __CLR4_4_11esi1esilgchosqb.R.inc(65863);assertEquals(123L, millis);
        __CLR4_4_11esi1esilgchosqb.R.inc(65864);assertEquals(123L, DateConverter.INSTANCE.getInstantMillis(date, (Chronology) null));
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1etl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65865,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1etl() throws Exception{try{__CLR4_4_11esi1esilgchosqb.R.inc(65865);
        __CLR4_4_11esi1esilgchosqb.R.inc(65866);assertEquals(ISO_PARIS, DateConverter.INSTANCE.getChronology(new Date(123L), PARIS));
        __CLR4_4_11esi1esilgchosqb.R.inc(65867);assertEquals(ISO, DateConverter.INSTANCE.getChronology(new Date(123L), (DateTimeZone) null));
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1eto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1eto() throws Exception{try{__CLR4_4_11esi1esilgchosqb.R.inc(65868);
        __CLR4_4_11esi1esilgchosqb.R.inc(65869);assertEquals(JULIAN, DateConverter.INSTANCE.getChronology(new Date(123L), JULIAN));
        __CLR4_4_11esi1esilgchosqb.R.inc(65870);assertEquals(ISO, DateConverter.INSTANCE.getChronology(new Date(123L), (Chronology) null));
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1etr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1etr() throws Exception{try{__CLR4_4_11esi1esilgchosqb.R.inc(65871);
        __CLR4_4_11esi1esilgchosqb.R.inc(65872);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11esi1esilgchosqb.R.inc(65873);int[] expected = COPTIC.get(tod, 12345678L);
        __CLR4_4_11esi1esilgchosqb.R.inc(65874);int[] actual = DateConverter.INSTANCE.getPartialValues(tod, new Date(12345678L), COPTIC);
        __CLR4_4_11esi1esilgchosqb.R.inc(65875);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11esi1esilgchosqb.R.globalSliceStart(getClass().getName(),65876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1etw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11esi1esilgchosqb.R.rethrow($CLV_t2$);}finally{__CLR4_4_11esi1esilgchosqb.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestDateConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1etw(){try{__CLR4_4_11esi1esilgchosqb.R.inc(65876);
        __CLR4_4_11esi1esilgchosqb.R.inc(65877);assertEquals("Converter[java.util.Date]", DateConverter.INSTANCE.toString());
    }finally{__CLR4_4_11esi1esilgchosqb.R.flushNeeded();}}

}
