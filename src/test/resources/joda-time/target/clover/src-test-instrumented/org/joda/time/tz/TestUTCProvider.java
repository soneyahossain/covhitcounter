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
package org.joda.time.tz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;

/**
 * This class is a JUnit test for UTCProvider.
 *
 * @author Stephen Colebourne
 */
public class TestUTCProvider {static class __CLR4_4_11nxb1nxblgchot36{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11nxb1nxblgchot36.R.inc(77663);
        __CLR4_4_11nxb1nxblgchot36.R.inc(77664);TestUTCProvider TB = new TestUTCProvider();
        __CLR4_4_11nxb1nxblgchot36.R.inc(77665);TB.testClass();
        __CLR4_4_11nxb1nxblgchot36.R.inc(77666);TB.testGetAvailableIDs();
        __CLR4_4_11nxb1nxblgchot36.R.inc(77667);TB.testGetZone_String();
    }finally{__CLR4_4_11nxb1nxblgchot36.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestUTCProvider.class);
    }

    public TestUTCProvider(String name) {
        super(name);
    }



     */

    //-----------------------------------------------------------------------
    @Test
    public void testClass() throws Exception {__CLR4_4_11nxb1nxblgchot36.R.globalSliceStart(getClass().getName(),77668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulv1nxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxb1nxblgchot36.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxb1nxblgchot36.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestUTCProvider.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulv1nxg() throws Exception{try{__CLR4_4_11nxb1nxblgchot36.R.inc(77668);
        __CLR4_4_11nxb1nxblgchot36.R.inc(77669);Class cls = UTCProvider.class;
        __CLR4_4_11nxb1nxblgchot36.R.inc(77670);assertEquals(true, Modifier.isPublic(cls.getModifiers()));

        __CLR4_4_11nxb1nxblgchot36.R.inc(77671);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11nxb1nxblgchot36.R.inc(77672);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11nxb1nxblgchot36.R.inc(77673);assertEquals(true, Modifier.isPublic(con.getModifiers()));
    }finally{__CLR4_4_11nxb1nxblgchot36.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetAvailableIDs() throws Exception {__CLR4_4_11nxb1nxblgchot36.R.globalSliceStart(getClass().getName(),77674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mu0qey1nxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxb1nxblgchot36.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxb1nxblgchot36.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestUTCProvider.testGetAvailableIDs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mu0qey1nxm() throws Exception{try{__CLR4_4_11nxb1nxblgchot36.R.inc(77674);
        __CLR4_4_11nxb1nxblgchot36.R.inc(77675);Provider p = new UTCProvider();
        __CLR4_4_11nxb1nxblgchot36.R.inc(77676);Set set = p.getAvailableIDs();
        __CLR4_4_11nxb1nxblgchot36.R.inc(77677);assertEquals(1, set.size());
        __CLR4_4_11nxb1nxblgchot36.R.inc(77678);assertEquals("UTC", set.iterator().next());
    }finally{__CLR4_4_11nxb1nxblgchot36.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetZone_String() throws Exception {__CLR4_4_11nxb1nxblgchot36.R.globalSliceStart(getClass().getName(),77679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b846ft1nxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nxb1nxblgchot36.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nxb1nxblgchot36.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestUTCProvider.testGetZone_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b846ft1nxr() throws Exception{try{__CLR4_4_11nxb1nxblgchot36.R.inc(77679);
        __CLR4_4_11nxb1nxblgchot36.R.inc(77680);Provider p = new UTCProvider();
        __CLR4_4_11nxb1nxblgchot36.R.inc(77681);assertSame(DateTimeZone.UTC, p.getZone("UTC"));
        __CLR4_4_11nxb1nxblgchot36.R.inc(77682);assertEquals(null, p.getZone(null));
        __CLR4_4_11nxb1nxblgchot36.R.inc(77683);assertEquals(null, p.getZone("Europe/London"));
        __CLR4_4_11nxb1nxblgchot36.R.inc(77684);assertEquals(null, p.getZone("Blah"));
    }finally{__CLR4_4_11nxb1nxblgchot36.R.flushNeeded();}}

}
