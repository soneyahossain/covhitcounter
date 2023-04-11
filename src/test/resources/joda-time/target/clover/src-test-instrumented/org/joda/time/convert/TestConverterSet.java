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
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.GregorianCalendar;

//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.ReadWritableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is a JUnit test for ConverterSet.
 * Mostly for coverage.
 *
 * @author Stephen Colebourne
 */
public class TestConverterSet {static class __CLR4_4_11ep81ep8lgchosq8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,65826,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//extends TestCase {

    private static final Converter c1 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65708);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65709);return Boolean.class;
        }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}
    };
    private static final Converter c2 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65710);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65711);return Character.class;
        }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}
    };
    private static final Converter c3 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65712);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65713);return Byte.class;
        }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}
    };
    private static final Converter c4 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65714);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65715);return Short.class;
        }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}
    };
    private static final Converter c4a = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65716);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65717);return Short.class;
        }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}
    };
    private static final Converter c5 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65718);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65719);return Integer.class;
        }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}
    };

    public static void main(String[] args) throws Exception {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65720);
        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11ep81ep8lgchosq8.R.inc(65721);TestConverterSet TB = new TestConverterSet();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65722);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65723);TB.testClass();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65724);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65725);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65726);TB.testBigHashtable();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65727);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65728);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65729);TB.testAddNullRemoved1();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65730);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65731);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65732);TB.testAddNullRemoved2();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65733);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65734);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65735);TB.testAddNullRemoved3();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65736);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65737);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65738);TB.testRemoveNullRemoved1();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65739);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65740);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65741);TB.testRemoveNullRemoved2();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65742);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65743);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65744);TB.testRemoveBadIndex1();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65745);TB.tearDown();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65746);TB.setUp();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65747);TB.testRemoveBadIndex2();
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65748);TB.tearDown();
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestConverterSet.class);
    }

    public TestConverterSet(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65749);
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65750);
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClass() throws Exception {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulv1eqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulv1eqf() throws Exception{try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65751);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65752);Class cls = ConverterSet.class;
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65753);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65754);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65755);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        __CLR4_4_11ep81ep8lgchosq8.R.inc(65756);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65757);Constructor con = cls.getDeclaredConstructors()[0];
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65758);assertEquals(false, Modifier.isPublic(con.getModifiers()));
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65759);assertEquals(false, Modifier.isProtected(con.getModifiers()));
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65760);assertEquals(false, Modifier.isPrivate(con.getModifiers()));
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}


    //-----------------------------------------------------------------------
    @Test
    public void testBigHashtable() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12syz2x1eqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testBigHashtable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12syz2x1eqp(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65761);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65762);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65763);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65764);set.select(Boolean.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65765);set.select(Character.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65766);set.select(Byte.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65767);set.select(Short.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65768);set.select(Integer.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65769);set.select(Long.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65770);set.select(Float.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65771);set.select(Double.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65772);set.select(null);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65773);set.select(Calendar.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65774);set.select(GregorianCalendar.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65775);set.select(DateTime.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65776);set.select(DateMidnight.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65777);set.select(ReadableInstant.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65778);set.select(ReadableDateTime.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65779);set.select(ReadWritableInstant.class);  // 16
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65780);set.select(ReadWritableDateTime.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65781);set.select(DateTime.class);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65782);assertEquals(4, set.size());
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddNullRemoved1() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178ww5u1erb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178ww5u1erb(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65783);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65784);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65785);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65786);ConverterSet result = set.add(c5, null);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65787);assertEquals(4, set.size());
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65788);assertEquals(5, result.size());
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    @Test
    public void testAddNullRemoved2() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zwxdd1erh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zwxdd1erh(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65789);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65790);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65791);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65792);ConverterSet result = set.add(c4, null);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65793);assertSame(set, result);
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    @Test
    public void testAddNullRemoved3() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwykw1erm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwykw1erm(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65794);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65795);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65796);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65797);ConverterSet result = set.add(c4a, null);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65798);assertTrue(set != result);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65799);assertEquals(4, set.size());
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65800);assertEquals(4, result.size());
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemoveNullRemoved1() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdhr1n1ert();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveNullRemoved1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdhr1n1ert(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65801);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65802);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65803);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65804);ConverterSet result = set.remove(c3, null);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65805);assertEquals(4, set.size());
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65806);assertEquals(3, result.size());
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    @Test
    public void testRemoveNullRemoved2() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4hs961erz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveNullRemoved2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4hs961erz(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65807);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65808);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65809);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65810);ConverterSet result = set.remove(c5, null);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65811);assertSame(set, result);
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemoveBadIndex1() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lb7lv91es4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveBadIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lb7lv91es4(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65812);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65813);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65814);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65815);try {
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65816);set.remove(200, null);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65817);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65818);assertEquals(4, set.size());
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

    @Test
    public void testRemoveBadIndex2() {__CLR4_4_11ep81ep8lgchosq8.R.globalSliceStart(getClass().getName(),65819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok7knq1esb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ep81ep8lgchosq8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ep81ep8lgchosq8.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveBadIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok7knq1esb(){try{__CLR4_4_11ep81ep8lgchosq8.R.inc(65819);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65820);Converter[] array = new Converter[]{
                c1, c2, c3, c4,
        };
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65821);ConverterSet set = new ConverterSet(array);
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65822);try {
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65823);set.remove(-1, null);
            __CLR4_4_11ep81ep8lgchosq8.R.inc(65824);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_11ep81ep8lgchosq8.R.inc(65825);assertEquals(4, set.size());
    }finally{__CLR4_4_11ep81ep8lgchosq8.R.flushNeeded();}}

}
