/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Constructors {static class __CLR4_4_113661366lgchosd0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,51048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_113661366lgchosd0.R.inc(50766);
        __CLR4_4_113661366lgchosd0.R.inc(50767);TestPartial_Constructors TB = new TestPartial_Constructors();
        __CLR4_4_113661366lgchosd0.R.inc(50768);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50769);TB.testConstructor();
        __CLR4_4_113661366lgchosd0.R.inc(50770);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50771);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50772);TB.testConstructor_Chrono();
        __CLR4_4_113661366lgchosd0.R.inc(50773);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50774);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50775);TB.testConstructor_Type_int();
        __CLR4_4_113661366lgchosd0.R.inc(50776);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50777);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50778);TB.testConstructorEx1_Type_int();
        __CLR4_4_113661366lgchosd0.R.inc(50779);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50780);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50781);TB.testConstructorEx2_Type_int();
        __CLR4_4_113661366lgchosd0.R.inc(50782);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50783);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50784);TB.testConstructor_Type_int_Chrono();
        __CLR4_4_113661366lgchosd0.R.inc(50785);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50786);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50787);TB.testConstructorEx_Type_int_Chrono();
        __CLR4_4_113661366lgchosd0.R.inc(50788);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50789);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50790);TB.testConstructorEx2_Type_int_Chrono();
        __CLR4_4_113661366lgchosd0.R.inc(50791);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50792);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50793);TB.testConstructor_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50794);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50795);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50796);TB.testConstructor_TypeArray_intArray_year_weekyear();
        __CLR4_4_113661366lgchosd0.R.inc(50797);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50798);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50799);TB.testConstructor2_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50800);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50801);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50802);TB.testConstructorEx1_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50803);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50804);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50805);TB.testConstructorEx3_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50806);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50807);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50808);TB.testConstructorEx5_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50809);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50810);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50811);TB.testConstructorEx6_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50812);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50813);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50814);TB.testConstructorEx7_TypeArray_intArray_inOrder();
        __CLR4_4_113661366lgchosd0.R.inc(50815);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50816);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50817);TB.testConstructorEx8_TypeArray_intArray_duplicate();
        __CLR4_4_113661366lgchosd0.R.inc(50818);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50819);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50820);TB.testConstructorEx9_TypeArray_intArray();
        __CLR4_4_113661366lgchosd0.R.inc(50821);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50822);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50823);TB.testConstructor_TypeArray_intArray_Chrono();
        __CLR4_4_113661366lgchosd0.R.inc(50824);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50825);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50826);TB.testConstructor_Partial();
        __CLR4_4_113661366lgchosd0.R.inc(50827);TB.tearDown();
        __CLR4_4_113661366lgchosd0.R.inc(50828);TB.setUp();
        __CLR4_4_113661366lgchosd0.R.inc(50829);TB.testConstructorEx_Partial();
        __CLR4_4_113661366lgchosd0.R.inc(50830);TB.tearDown();
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPartial_Constructors.class);
    }

    public TestPartial_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_113661366lgchosd0.R.inc(50831);
        __CLR4_4_113661366lgchosd0.R.inc(50832);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_113661366lgchosd0.R.inc(50833);zone = DateTimeZone.getDefault();
        __CLR4_4_113661366lgchosd0.R.inc(50834);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_113661366lgchosd0.R.inc(50835);
        __CLR4_4_113661366lgchosd0.R.inc(50836);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_113661366lgchosd0.R.inc(50837);DateTimeZone.setDefault(zone);
        __CLR4_4_113661366lgchosd0.R.inc(50838);zone = null;
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @Test
    public void testConstructor() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h1387();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h1387() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50839);
        __CLR4_4_113661366lgchosd0.R.inc(50840);Partial test = new Partial();
        __CLR4_4_113661366lgchosd0.R.inc(50841);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50842);assertEquals(0, test.size());
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @Test
    public void testConstructor_Chrono() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhgl41138b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhgl41138b() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50843);
        __CLR4_4_113661366lgchosd0.R.inc(50844);Partial test = new Partial((Chronology) null);
        __CLR4_4_113661366lgchosd0.R.inc(50845);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50846);assertEquals(0, test.size());

        __CLR4_4_113661366lgchosd0.R.inc(50847);test = new Partial(GREGORIAN_PARIS);
        __CLR4_4_113661366lgchosd0.R.inc(50848);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50849);assertEquals(0, test.size());
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @Test
    public void testConstructor_Type_int() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y722o8138i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y722o8138i() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50850);
        __CLR4_4_113661366lgchosd0.R.inc(50851);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4);
        __CLR4_4_113661366lgchosd0.R.inc(50852);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50853);assertEquals(1, test.size());
        __CLR4_4_113661366lgchosd0.R.inc(50854);assertEquals(4, test.getValue(0));
        __CLR4_4_113661366lgchosd0.R.inc(50855);assertEquals(4, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(50856);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx1_Type_int() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1775mhy138p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_Type_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1775mhy138p() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50857);
        __CLR4_4_113661366lgchosd0.R.inc(50858);try {
            __CLR4_4_113661366lgchosd0.R.inc(50859);new Partial(null, 4);
            __CLR4_4_113661366lgchosd0.R.inc(50860);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50861);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx2_Type_int() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rmc61138u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx2_Type_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rmc61138u() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50862);
        __CLR4_4_113661366lgchosd0.R.inc(50863);try {
            __CLR4_4_113661366lgchosd0.R.inc(50864);new Partial(DateTimeFieldType.dayOfYear(), 0);
            __CLR4_4_113661366lgchosd0.R.inc(50865);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @Test
    public void testConstructor_Type_int_Chrono() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3c7wo138y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3c7wo138y() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50866);
        __CLR4_4_113661366lgchosd0.R.inc(50867);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4, GREGORIAN_PARIS);
        __CLR4_4_113661366lgchosd0.R.inc(50868);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50869);assertEquals(1, test.size());
        __CLR4_4_113661366lgchosd0.R.inc(50870);assertEquals(4, test.getValue(0));
        __CLR4_4_113661366lgchosd0.R.inc(50871);assertEquals(4, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(50872);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx_Type_int_Chrono() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdpqbp1395();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Type_int_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdpqbp1395() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50873);
        __CLR4_4_113661366lgchosd0.R.inc(50874);try {
            __CLR4_4_113661366lgchosd0.R.inc(50875);new Partial(null, 4, ISO_UTC);
            __CLR4_4_113661366lgchosd0.R.inc(50876);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50877);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx2_Type_int_Chrono() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tyfacp139a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx2_Type_int_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tyfacp139a() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50878);
        __CLR4_4_113661366lgchosd0.R.inc(50879);try {
            __CLR4_4_113661366lgchosd0.R.inc(50880);new Partial(DateTimeFieldType.dayOfYear(), 0, ISO_UTC);
            __CLR4_4_113661366lgchosd0.R.inc(50881);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @Test
    public void testConstructor_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ktke0139e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ktke0139e() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50882);
        __CLR4_4_113661366lgchosd0.R.inc(50883);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfYear()
        };
        __CLR4_4_113661366lgchosd0.R.inc(50884);int[] values = new int[]{2005, 33};
        __CLR4_4_113661366lgchosd0.R.inc(50885);Partial test = new Partial(types, values);
        __CLR4_4_113661366lgchosd0.R.inc(50886);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50887);assertEquals(2, test.size());
        __CLR4_4_113661366lgchosd0.R.inc(50888);assertEquals(2005, test.getValue(0));
        __CLR4_4_113661366lgchosd0.R.inc(50889);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(50890);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(50891);assertEquals(33, test.getValue(1));
        __CLR4_4_113661366lgchosd0.R.inc(50892);assertEquals(33, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(50893);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(50894);assertEquals(true, Arrays.equals(test.getFieldTypes(), types));
        __CLR4_4_113661366lgchosd0.R.inc(50895);assertEquals(true, Arrays.equals(test.getValues(), values));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructor_TypeArray_intArray_year_weekyear() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ueofw139s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray_year_weekyear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ueofw139s() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50896);
        __CLR4_4_113661366lgchosd0.R.inc(50897);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.weekyear()
        };
        __CLR4_4_113661366lgchosd0.R.inc(50898);int[] values = new int[]{2005, 2006};
        __CLR4_4_113661366lgchosd0.R.inc(50899);Partial test = new Partial(types, values);
        __CLR4_4_113661366lgchosd0.R.inc(50900);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50901);assertEquals(2, test.size());
        __CLR4_4_113661366lgchosd0.R.inc(50902);assertEquals(2005, test.getValue(0));
        __CLR4_4_113661366lgchosd0.R.inc(50903);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(50904);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(50905);assertEquals(2006, test.getValue(1));
        __CLR4_4_113661366lgchosd0.R.inc(50906);assertEquals(2006, test.get(DateTimeFieldType.weekyear()));
        __CLR4_4_113661366lgchosd0.R.inc(50907);assertEquals(true, test.isSupported(DateTimeFieldType.weekyear()));
        __CLR4_4_113661366lgchosd0.R.inc(50908);assertEquals(true, Arrays.equals(test.getFieldTypes(), types));
        __CLR4_4_113661366lgchosd0.R.inc(50909);assertEquals(true, Arrays.equals(test.getValues(), values));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructor2_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyu7vq13a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor2_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyu7vq13a6() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50910);
        __CLR4_4_113661366lgchosd0.R.inc(50911);DateTimeFieldType[] types = new DateTimeFieldType[0];
        __CLR4_4_113661366lgchosd0.R.inc(50912);int[] values = new int[0];
        __CLR4_4_113661366lgchosd0.R.inc(50913);Partial test = new Partial(types, values);
        __CLR4_4_113661366lgchosd0.R.inc(50914);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(50915);assertEquals(0, test.size());
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx1_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qakafu13ac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qakafu13ac() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50916);
        __CLR4_4_113661366lgchosd0.R.inc(50917);try {
            __CLR4_4_113661366lgchosd0.R.inc(50918);new Partial((DateTimeFieldType[]) null, new int[]{1});
            __CLR4_4_113661366lgchosd0.R.inc(50919);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50920);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx3_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13d952013ah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13d952013ah() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50921);
        __CLR4_4_113661366lgchosd0.R.inc(50922);try {
            __CLR4_4_113661366lgchosd0.R.inc(50923);new Partial(new DateTimeFieldType[]{DateTimeFieldType.dayOfYear()}, null);
            __CLR4_4_113661366lgchosd0.R.inc(50924);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50925);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx5_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jk20bu13am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx5_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jk20bu13am() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50926);
        __CLR4_4_113661366lgchosd0.R.inc(50927);try {
            __CLR4_4_113661366lgchosd0.R.inc(50928);new Partial(new DateTimeFieldType[]{DateTimeFieldType.dayOfYear()}, new int[2]);
            __CLR4_4_113661366lgchosd0.R.inc(50929);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50930);assertMessageContains(ex, "same length");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx6_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0pl0r13ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx6_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0pl0r13ar() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50931);
        __CLR4_4_113661366lgchosd0.R.inc(50932);try {
            __CLR4_4_113661366lgchosd0.R.inc(50933);new Partial(new DateTimeFieldType[]{null, DateTimeFieldType.dayOfYear()}, new int[2]);
            __CLR4_4_113661366lgchosd0.R.inc(50934);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50935);assertMessageContains(ex, "contain null");
        }
        __CLR4_4_113661366lgchosd0.R.inc(50936);try {
            __CLR4_4_113661366lgchosd0.R.inc(50937);new Partial(new DateTimeFieldType[]{DateTimeFieldType.dayOfYear(), null}, new int[2]);
            __CLR4_4_113661366lgchosd0.R.inc(50938);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50939);assertMessageContains(ex, "contain null");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx7_TypeArray_intArray_inOrder() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129c1oe13b0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx7_TypeArray_intArray_inOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129c1oe13b0() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50940);
        __CLR4_4_113661366lgchosd0.R.inc(50941);int[] values = new int[]{1, 1, 1};
        __CLR4_4_113661366lgchosd0.R.inc(50942);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
        __CLR4_4_113661366lgchosd0.R.inc(50943);try {
            __CLR4_4_113661366lgchosd0.R.inc(50944);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50945);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50946);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50947);types = new DateTimeFieldType[]{
                DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear()};
        __CLR4_4_113661366lgchosd0.R.inc(50948);try {
            __CLR4_4_113661366lgchosd0.R.inc(50949);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50950);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50951);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50952);types = new DateTimeFieldType[]{
                DateTimeFieldType.year(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear()};
        __CLR4_4_113661366lgchosd0.R.inc(50953);try {
            __CLR4_4_113661366lgchosd0.R.inc(50954);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50955);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50956);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50957);types = new DateTimeFieldType[]{
                DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.era()};
        __CLR4_4_113661366lgchosd0.R.inc(50958);try {
            __CLR4_4_113661366lgchosd0.R.inc(50959);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50960);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50961);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50962);types = new DateTimeFieldType[]{
                DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear()};
        __CLR4_4_113661366lgchosd0.R.inc(50963);try {
            __CLR4_4_113661366lgchosd0.R.inc(50964);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50965);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50966);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50967);types = new DateTimeFieldType[]{
                DateTimeFieldType.yearOfEra(), DateTimeFieldType.year(), DateTimeFieldType.dayOfYear()};
        __CLR4_4_113661366lgchosd0.R.inc(50968);try {
            __CLR4_4_113661366lgchosd0.R.inc(50969);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50970);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50971);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50972);types = new DateTimeFieldType[]{
                DateTimeFieldType.weekyear(), DateTimeFieldType.yearOfCentury(), DateTimeFieldType.dayOfMonth()};
        __CLR4_4_113661366lgchosd0.R.inc(50973);try {
            __CLR4_4_113661366lgchosd0.R.inc(50974);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50975);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50976);assertMessageContains(ex, "must be in order", "largest-smallest");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50977);types = new DateTimeFieldType[]{
                DateTimeFieldType.weekyear(), DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth()};
        __CLR4_4_113661366lgchosd0.R.inc(50978);try {
            __CLR4_4_113661366lgchosd0.R.inc(50979);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50980);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50981);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx8_TypeArray_intArray_duplicate() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),50982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q7n0dd13c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx8_TypeArray_intArray_duplicate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q7n0dd13c6() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(50982);
        __CLR4_4_113661366lgchosd0.R.inc(50983);int[] values = new int[]{1, 1, 1};
        __CLR4_4_113661366lgchosd0.R.inc(50984);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.era(), DateTimeFieldType.year(), DateTimeFieldType.year()};
        __CLR4_4_113661366lgchosd0.R.inc(50985);try {
            __CLR4_4_113661366lgchosd0.R.inc(50986);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50987);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50988);assertMessageContains(ex, "must not", "duplicate");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50989);types = new DateTimeFieldType[]{
                DateTimeFieldType.era(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear()};
        __CLR4_4_113661366lgchosd0.R.inc(50990);try {
            __CLR4_4_113661366lgchosd0.R.inc(50991);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50992);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50993);assertMessageContains(ex, "must not", "duplicate");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50994);types = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()};
        __CLR4_4_113661366lgchosd0.R.inc(50995);try {
            __CLR4_4_113661366lgchosd0.R.inc(50996);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(50997);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(50998);assertMessageContains(ex, "must not", "duplicate");
        }

        __CLR4_4_113661366lgchosd0.R.inc(50999);types = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfMonth(), DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.hourOfDay()};
        __CLR4_4_113661366lgchosd0.R.inc(51000);try {
            __CLR4_4_113661366lgchosd0.R.inc(51001);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(51002);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(51003);assertMessageContains(ex, "must not", "duplicate");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx9_TypeArray_intArray() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),51004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mfqvm13cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx9_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mfqvm13cs() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(51004);
        __CLR4_4_113661366lgchosd0.R.inc(51005);int[] values = new int[]{3, 0};
        __CLR4_4_113661366lgchosd0.R.inc(51006);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek()};
        __CLR4_4_113661366lgchosd0.R.inc(51007);try {
            __CLR4_4_113661366lgchosd0.R.inc(51008);new Partial(types, values);
            __CLR4_4_113661366lgchosd0.R.inc(51009);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(51010);assertMessageContains(ex, "Value 0");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @Test
    public void testConstructor_TypeArray_intArray_Chrono() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),51011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6limg13cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6limg13cz() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(51011);
        __CLR4_4_113661366lgchosd0.R.inc(51012);DateTimeFieldType[] types = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfYear()
        };
        __CLR4_4_113661366lgchosd0.R.inc(51013);int[] values = new int[]{2005, 33};
        __CLR4_4_113661366lgchosd0.R.inc(51014);Partial test = new Partial(types, values, GREGORIAN_PARIS);
        __CLR4_4_113661366lgchosd0.R.inc(51015);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(51016);assertEquals(2, test.size());
        __CLR4_4_113661366lgchosd0.R.inc(51017);assertEquals(2005, test.getValue(0));
        __CLR4_4_113661366lgchosd0.R.inc(51018);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(51019);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(51020);assertEquals(33, test.getValue(1));
        __CLR4_4_113661366lgchosd0.R.inc(51021);assertEquals(33, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(51022);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(51023);assertEquals(true, Arrays.equals(test.getFieldTypes(), types));
        __CLR4_4_113661366lgchosd0.R.inc(51024);assertEquals(true, Arrays.equals(test.getValues(), values));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Test constructor
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testConstructor_Partial() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),51025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4d1yp13dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4d1yp13dd() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(51025);
        __CLR4_4_113661366lgchosd0.R.inc(51026);YearMonthDay ymd = new YearMonthDay(2005, 6, 25, GREGORIAN_PARIS);
        __CLR4_4_113661366lgchosd0.R.inc(51027);Partial test = new Partial(ymd);
        __CLR4_4_113661366lgchosd0.R.inc(51028);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_113661366lgchosd0.R.inc(51029);assertEquals(3, test.size());
        __CLR4_4_113661366lgchosd0.R.inc(51030);assertEquals(2005, test.getValue(0));
        __CLR4_4_113661366lgchosd0.R.inc(51031);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(51032);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_113661366lgchosd0.R.inc(51033);assertEquals(6, test.getValue(1));
        __CLR4_4_113661366lgchosd0.R.inc(51034);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(51035);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_113661366lgchosd0.R.inc(51036);assertEquals(25, test.getValue(2));
        __CLR4_4_113661366lgchosd0.R.inc(51037);assertEquals(25, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_113661366lgchosd0.R.inc(51038);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Test constructor
     */
    @Test
    public void testConstructorEx_Partial() throws Throwable {__CLR4_4_113661366lgchosd0.R.globalSliceStart(getClass().getName(),51039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sx26ck13dr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_113661366lgchosd0.R.rethrow($CLV_t2$);}finally{__CLR4_4_113661366lgchosd0.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),51039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sx26ck13dr() throws Throwable{try{__CLR4_4_113661366lgchosd0.R.inc(51039);
        __CLR4_4_113661366lgchosd0.R.inc(51040);try {
            __CLR4_4_113661366lgchosd0.R.inc(51041);new Partial((ReadablePartial) null);
            __CLR4_4_113661366lgchosd0.R.inc(51042);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_113661366lgchosd0.R.inc(51043);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if the exception message is valid.
     *
     * @param ex  the exception to check
     * @param str the string to check
     */
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_113661366lgchosd0.R.inc(51044);
        __CLR4_4_113661366lgchosd0.R.inc(51045);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     *
     * @param ex   the exception to check
     * @param str1 the string to check
     * @param str2 the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_113661366lgchosd0.R.inc(51046);
        __CLR4_4_113661366lgchosd0.R.inc(51047);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
                ex.getMessage().indexOf(str1) >= 0 &&
                        ex.getMessage().indexOf(str2) >= 0 &&
                        ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_113661366lgchosd0.R.flushNeeded();}}

}
