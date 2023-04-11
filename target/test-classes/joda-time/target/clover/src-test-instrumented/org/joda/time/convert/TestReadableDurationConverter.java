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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadableDurationConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableDurationConverter {static class __CLR4_4_11eyr1eyrlgchosqk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66051);
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66052);TestReadableDurationConverter TB = new TestReadableDurationConverter();

        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66053);TB.setUp();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66054);TB.testSingleton();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66055);TB.tearDown();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66056);TB.setUp();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66057);TB.testSupportedType();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66058);TB.tearDown();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66059);TB.setUp();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66060);TB.testGetDurationMillis_Object();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66061);TB.tearDown();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66062);TB.setUp();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66063);TB.testGetPeriodType_Object();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66064);TB.tearDown();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66065);TB.setUp();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66066);TB.testSetInto_Object();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66067);TB.tearDown();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66068);TB.setUp();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66069);TB.testToString();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66070);TB.tearDown();
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestReadableDurationConverter.class);
    }

    public TestReadableDurationConverter(String name) {
        super(name);
    }
 */


    @Before
    public void setUp() throws Exception {try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66071);

        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66072);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66073);ISO = ISOChronology.getInstance();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66074);zone = DateTimeZone.getDefault();
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66075);DateTimeZone.setDefault(PARIS);
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66076);

        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66077);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceStart(getClass().getName(),66078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1ezi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyr1eyrlgchosqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1ezi() throws Exception{try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66078);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66079);Class cls = ReadableDurationConverter.class;
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66080);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66081);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66082);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66083);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66084);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66085);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66086);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66087);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66088);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66089);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceStart(getClass().getName(),66090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1ezu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyr1eyrlgchosqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1ezu() throws Exception{try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66090);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66091);assertEquals(ReadableDuration.class, ReadableDurationConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_Object() throws Exception {__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceStart(getClass().getName(),66092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0aumf1ezw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyr1eyrlgchosqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testGetDurationMillis_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66092,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0aumf1ezw() throws Exception{try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66092);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66093);assertEquals(123L, ReadableDurationConverter.INSTANCE.getDurationMillis(new Duration(123L)));
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceStart(getClass().getName(),66094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm1ezy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyr1eyrlgchosqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm1ezy() throws Exception{try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66094);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66095);assertEquals(PeriodType.standard(),
                ReadableDurationConverter.INSTANCE.getPeriodType(new Duration(123L)));
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    @Test
    public void testSetInto_Object() throws Exception {__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceStart(getClass().getName(),66096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdb0ff1f00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyr1eyrlgchosqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testSetInto_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdb0ff1f00() throws Exception{try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66096);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66097);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66098);ReadableDurationConverter.INSTANCE.setInto(m, new Duration(
                3L * DateTimeConstants.MILLIS_PER_DAY +
                        4L * DateTimeConstants.MILLIS_PER_MINUTE + 5L
        ), null);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66099);assertEquals(0, m.getYears());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66100);assertEquals(0, m.getMonths());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66101);assertEquals(0, m.getWeeks());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66102);assertEquals(0, m.getDays());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66103);assertEquals(3 * 24, m.getHours());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66104);assertEquals(4, m.getMinutes());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66105);assertEquals(0, m.getSeconds());
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66106);assertEquals(5, m.getMillis());
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceStart(getClass().getName(),66107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1f0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11eyr1eyrlgchosqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11eyr1eyrlgchosqk.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadableDurationConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1f0b(){try{__CLR4_4_11eyr1eyrlgchosqk.R.inc(66107);
        __CLR4_4_11eyr1eyrlgchosqk.R.inc(66108);assertEquals("Converter[org.joda.time.ReadableDuration]", ReadableDurationConverter.INSTANCE.toString());
    }finally{__CLR4_4_11eyr1eyrlgchosqk.R.flushNeeded();}}

}
