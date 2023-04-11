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
import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for NullConverter.
 *
 * @author Stephen Colebourne
 */
public class TestNullConverter {static class __CLR4_4_11evo1evolgchosqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private long TEST_TIME_NOW =
            20 * DateTimeConstants.MILLIS_PER_DAY
                    + 10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology ISO;
    private static Chronology JULIAN;

    private DateTimeZone zone = null;
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11evo1evolgchosqh.R.inc(65940);
        //junit.textui.TestRunner.run(suite());


        __CLR4_4_11evo1evolgchosqh.R.inc(65941);TestNullConverter TB = new TestNullConverter();

        __CLR4_4_11evo1evolgchosqh.R.inc(65942);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65943);TB.testSingleton();
        __CLR4_4_11evo1evolgchosqh.R.inc(65944);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65945);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65946);TB.testSupportedType();
        __CLR4_4_11evo1evolgchosqh.R.inc(65947);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65948);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65949);TB.testGetInstantMillis_Object_Chronology();
        __CLR4_4_11evo1evolgchosqh.R.inc(65950);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65951);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65952);TB.testGetChronology_Object_Zone();
        __CLR4_4_11evo1evolgchosqh.R.inc(65953);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65954);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65955);TB.testGetChronology_Object_Chronology();
        __CLR4_4_11evo1evolgchosqh.R.inc(65956);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65957);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65958);TB.testGetPartialValues();
        __CLR4_4_11evo1evolgchosqh.R.inc(65959);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65960);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65961);TB.testGetDurationMillis_Object();
        __CLR4_4_11evo1evolgchosqh.R.inc(65962);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65963);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65964);TB.testGetPeriodType_Object();
        __CLR4_4_11evo1evolgchosqh.R.inc(65965);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65966);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65967);TB.testSetInto_Object();
        __CLR4_4_11evo1evolgchosqh.R.inc(65968);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65969);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65970);TB.testIsReadableInterval_Object_Chronology();
        __CLR4_4_11evo1evolgchosqh.R.inc(65971);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65972);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65973);TB.testSetInto_Object_Chronology1();
        __CLR4_4_11evo1evolgchosqh.R.inc(65974);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65975);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65976);TB.testSetInto_Object_Chronology2();
        __CLR4_4_11evo1evolgchosqh.R.inc(65977);TB.tearDown();
        __CLR4_4_11evo1evolgchosqh.R.inc(65978);TB.setUp();
        __CLR4_4_11evo1evolgchosqh.R.inc(65979);TB.testToString();
        __CLR4_4_11evo1evolgchosqh.R.inc(65980);TB.tearDown();

    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestNullConverter.class);
    }

    public TestNullConverter(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11evo1evolgchosqh.R.inc(65981);
        __CLR4_4_11evo1evolgchosqh.R.inc(65982);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11evo1evolgchosqh.R.inc(65983);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11evo1evolgchosqh.R.inc(65984);originalTimeZone = TimeZone.getDefault();
        __CLR4_4_11evo1evolgchosqh.R.inc(65985);originalLocale = Locale.getDefault();
        __CLR4_4_11evo1evolgchosqh.R.inc(65986);DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        __CLR4_4_11evo1evolgchosqh.R.inc(65987);TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_11evo1evolgchosqh.R.inc(65988);Locale.setDefault(Locale.UK);

        __CLR4_4_11evo1evolgchosqh.R.inc(65989);ISO = ISOChronology.getInstance();
        __CLR4_4_11evo1evolgchosqh.R.inc(65990);JULIAN = JulianChronology.getInstance();
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11evo1evolgchosqh.R.inc(65991);
        __CLR4_4_11evo1evolgchosqh.R.inc(65992);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11evo1evolgchosqh.R.inc(65993);DateTimeZone.setDefault(originalDateTimeZone);
        __CLR4_4_11evo1evolgchosqh.R.inc(65994);TimeZone.setDefault(originalTimeZone);
        __CLR4_4_11evo1evolgchosqh.R.inc(65995);Locale.setDefault(originalLocale);
        __CLR4_4_11evo1evolgchosqh.R.inc(65996);originalDateTimeZone = null;
        __CLR4_4_11evo1evolgchosqh.R.inc(65997);originalTimeZone = null;
        __CLR4_4_11evo1evolgchosqh.R.inc(65998);originalLocale = null;
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),65999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1exb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1exb() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(65999);
        __CLR4_4_11evo1evolgchosqh.R.inc(66000);Class cls = NullConverter.class;
        __CLR4_4_11evo1evolgchosqh.R.inc(66001);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11evo1evolgchosqh.R.inc(66002);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11evo1evolgchosqh.R.inc(66003);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11evo1evolgchosqh.R.inc(66004);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11evo1evolgchosqh.R.inc(66005);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11evo1evolgchosqh.R.inc(66006);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11evo1evolgchosqh.R.inc(66007);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11evo1evolgchosqh.R.inc(66008);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11evo1evolgchosqh.R.inc(66009);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11evo1evolgchosqh.R.inc(66010);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1exn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1exn() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66011);
        __CLR4_4_11evo1evolgchosqh.R.inc(66012);assertEquals(null, NullConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_Object_Chronology() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12gh1ib1exp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetInstantMillis_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12gh1ib1exp() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66013);
        __CLR4_4_11evo1evolgchosqh.R.inc(66014);assertEquals(TEST_TIME_NOW, NullConverter.INSTANCE.getInstantMillis(null, JULIAN));
        __CLR4_4_11evo1evolgchosqh.R.inc(66015);assertEquals(TEST_TIME_NOW, NullConverter.INSTANCE.getInstantMillis(null, (Chronology) null));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Object_Zone() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nbwmeo1exs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetChronology_Object_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nbwmeo1exs() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66016);
        __CLR4_4_11evo1evolgchosqh.R.inc(66017);assertEquals(ISO_PARIS, NullConverter.INSTANCE.getChronology(null, PARIS));
        __CLR4_4_11evo1evolgchosqh.R.inc(66018);assertEquals(ISO, NullConverter.INSTANCE.getChronology(null, (DateTimeZone) null));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    @Test
    public void testGetChronology_Object_Chronology() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5zpek1exv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetChronology_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5zpek1exv() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66019);
        __CLR4_4_11evo1evolgchosqh.R.inc(66020);assertEquals(JULIAN, NullConverter.INSTANCE.getChronology(null, JULIAN));
        __CLR4_4_11evo1evolgchosqh.R.inc(66021);assertEquals(ISO, NullConverter.INSTANCE.getChronology(null, (Chronology) null));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialValues() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jrzqzq1exy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetPartialValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jrzqzq1exy() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66022);
        __CLR4_4_11evo1evolgchosqh.R.inc(66023);TimeOfDay tod = new TimeOfDay();
        __CLR4_4_11evo1evolgchosqh.R.inc(66024);int[] expected = new int[]{10 + 1, 20, 30, 40}; // now
        __CLR4_4_11evo1evolgchosqh.R.inc(66025);int[] actual = NullConverter.INSTANCE.getPartialValues(tod, null, ISOChronology.getInstance());
        __CLR4_4_11evo1evolgchosqh.R.inc(66026);assertEquals(true, Arrays.equals(expected, actual));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf1ey3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf1ey3() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66027);
        __CLR4_4_11evo1evolgchosqh.R.inc(66028);assertEquals(0L, NullConverter.INSTANCE.getDurationMillis(null));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm1ey5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm1ey5() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66029);
        __CLR4_4_11evo1evolgchosqh.R.inc(66030);assertEquals(PeriodType.standard(),
                NullConverter.INSTANCE.getPeriodType(null));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    @Test
    public void testSetInto_Object() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdb0ff1ey7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdb0ff1ey7() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66031);
        __CLR4_4_11evo1evolgchosqh.R.inc(66032);MutablePeriod m = new MutablePeriod(PeriodType.millis());
        __CLR4_4_11evo1evolgchosqh.R.inc(66033);NullConverter.INSTANCE.setInto(m, null, null);
        __CLR4_4_11evo1evolgchosqh.R.inc(66034);assertEquals(0L, m.getMillis());
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsReadableInterval_Object_Chronology() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8udfz1eyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testIsReadableInterval_Object_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8udfz1eyb() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66035);
        __CLR4_4_11evo1evolgchosqh.R.inc(66036);assertEquals(false, NullConverter.INSTANCE.isReadableInterval(null, null));
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    @Test
    public void testSetInto_Object_Chronology1() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1432dgx1eyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object_Chronology1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1432dgx1eyd() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66037);
        __CLR4_4_11evo1evolgchosqh.R.inc(66038);MutableInterval m = new MutableInterval(1000L, 2000L, GJChronology.getInstance());
        __CLR4_4_11evo1evolgchosqh.R.inc(66039);NullConverter.INSTANCE.setInto(m, null, null);
        __CLR4_4_11evo1evolgchosqh.R.inc(66040);assertEquals(TEST_TIME_NOW, m.getStartMillis());
        __CLR4_4_11evo1evolgchosqh.R.inc(66041);assertEquals(TEST_TIME_NOW, m.getEndMillis());
        __CLR4_4_11evo1evolgchosqh.R.inc(66042);assertEquals(ISOChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    @Test
    public void testSetInto_Object_Chronology2() throws Exception {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2eog1eyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testSetInto_Object_Chronology2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2eog1eyj() throws Exception{try{__CLR4_4_11evo1evolgchosqh.R.inc(66043);
        __CLR4_4_11evo1evolgchosqh.R.inc(66044);MutableInterval m = new MutableInterval(1000L, 2000L, GJChronology.getInstance());
        __CLR4_4_11evo1evolgchosqh.R.inc(66045);NullConverter.INSTANCE.setInto(m, null, CopticChronology.getInstance());
        __CLR4_4_11evo1evolgchosqh.R.inc(66046);assertEquals(TEST_TIME_NOW, m.getStartMillis());
        __CLR4_4_11evo1evolgchosqh.R.inc(66047);assertEquals(TEST_TIME_NOW, m.getEndMillis());
        __CLR4_4_11evo1evolgchosqh.R.inc(66048);assertEquals(CopticChronology.getInstance(), m.getChronology());
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11evo1evolgchosqh.R.globalSliceStart(getClass().getName(),66049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1eyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11evo1evolgchosqh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11evo1evolgchosqh.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestNullConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1eyp(){try{__CLR4_4_11evo1evolgchosqh.R.inc(66049);
        __CLR4_4_11evo1evolgchosqh.R.inc(66050);assertEquals("Converter[null]", NullConverter.INSTANCE.toString());
    }finally{__CLR4_4_11evo1evolgchosqh.R.flushNeeded();}}

}
