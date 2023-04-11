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
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadablePeriodConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadablePeriodConverter {static class __CLR4_4_11f7z1f7zlgchosqx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,66434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66383);
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66384);TestReadablePeriodConverter TB = new TestReadablePeriodConverter();

        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66385);TB.setUp();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66386);TB.testSingleton();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66387);TB.tearDown();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66388);TB.setUp();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66389);TB.testSupportedType();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66390);TB.tearDown();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66391);TB.setUp();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66392);TB.testGetPeriodType_Object();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66393);TB.tearDown();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66394);TB.setUp();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66395);TB.testSetInto_Object();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66396);TB.tearDown();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66397);TB.setUp();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66398);TB.testToString();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66399);TB.tearDown();

    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestReadablePeriodConverter.class);
    }

    public TestReadablePeriodConverter(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66400);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66401);JULIAN = JulianChronology.getInstance();
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66402);ISO = ISOChronology.getInstance();
    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66403);

    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceStart(getClass().getName(),66404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1f8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f7z1f7zlgchosqx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1f8k() throws Exception{try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66404);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66405);Class cls = ReadablePeriodConverter.class;
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66406);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66407);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66408);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66409);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66410);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66411);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66412);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66413);assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66414);assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66415);assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceStart(getClass().getName(),66416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fthtzx1f8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f7z1f7zlgchosqx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSupportedType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fthtzx1f8w() throws Exception{try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66416);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66417);assertEquals(ReadablePeriod.class, ReadablePeriodConverter.INSTANCE.getSupportedType());
    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_Object() throws Exception {__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceStart(getClass().getName(),66418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nzp2xm1f8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f7z1f7zlgchosqx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testGetPeriodType_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nzp2xm1f8y() throws Exception{try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66418);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66419);assertEquals(PeriodType.standard(),
                ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.standard())));
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66420);assertEquals(PeriodType.yearMonthDayTime(),
                ReadablePeriodConverter.INSTANCE.getPeriodType(new Period(123L, PeriodType.yearMonthDayTime())));
    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

    @Test
    public void testSetInto_Object() throws Exception {__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceStart(getClass().getName(),66421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pdb0ff1f91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f7z1f7zlgchosqx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testSetInto_Object",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pdb0ff1f91() throws Exception{try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66421);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66422);MutablePeriod m = new MutablePeriod(PeriodType.yearMonthDayTime());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66423);ReadablePeriodConverter.INSTANCE.setInto(m, new Period(0, 0, 0, 3, 0, 4, 0, 5), null);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66424);assertEquals(0, m.getYears());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66425);assertEquals(0, m.getMonths());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66426);assertEquals(0, m.getWeeks());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66427);assertEquals(3, m.getDays());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66428);assertEquals(0, m.getHours());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66429);assertEquals(4, m.getMinutes());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66430);assertEquals(0, m.getSeconds());
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66431);assertEquals(5, m.getMillis());
    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceStart(getClass().getName(),66432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1f9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11f7z1f7zlgchosqx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11f7z1f7zlgchosqx.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestReadablePeriodConverter.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),66432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1f9c(){try{__CLR4_4_11f7z1f7zlgchosqx.R.inc(66432);
        __CLR4_4_11f7z1f7zlgchosqx.R.inc(66433);assertEquals("Converter[org.joda.time.ReadablePeriod]", ReadablePeriodConverter.INSTANCE.toString());
    }finally{__CLR4_4_11f7z1f7zlgchosqx.R.flushNeeded();}}

}
