/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTimeZone;

/**
 * Test cases for FixedDateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestCachedDateTimeZone {static class __CLR4_4_11nqj1nqjlgchot2w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77448,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11nqj1nqjlgchot2w.R.inc(77419);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77420);TestCachedDateTimeZone TB = new TestCachedDateTimeZone();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77421);TB.setUp();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77422);TB.test_caching();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77423);TB.tearDown();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77424);TB.setUp();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77425);TB.testSerialization();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77426);TB.tearDown();

    }finally{__CLR4_4_11nqj1nqjlgchot2w.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestCachedDateTimeZone.class);
    }

    public TestCachedDateTimeZone(String name) {
        super(name);
    }

     */

    private DateTimeZone originalDateTimeZone = null;


    @Before
    public void setUp() throws Exception {try{__CLR4_4_11nqj1nqjlgchot2w.R.inc(77427);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77428);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77429);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11nqj1nqjlgchot2w.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11nqj1nqjlgchot2w.R.inc(77430);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77431);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11nqj1nqjlgchot2w.R.flushNeeded();}}

    @Test
    public void test_caching() throws Exception {__CLR4_4_11nqj1nqjlgchot2w.R.globalSliceStart(getClass().getName(),77432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h2su071nqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nqj1nqjlgchot2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nqj1nqjlgchot2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCachedDateTimeZone.test_caching",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h2su071nqw() throws Exception{try{__CLR4_4_11nqj1nqjlgchot2w.R.inc(77432);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77433);CachedDateTimeZone zone1 = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77434);CachedDateTimeZone zone2 = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77435);assertSame(zone1, zone2);
    }finally{__CLR4_4_11nqj1nqjlgchot2w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_11nqj1nqjlgchot2w.R.globalSliceStart(getClass().getName(),77436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91nr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nqj1nqjlgchot2w.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nqj1nqjlgchot2w.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCachedDateTimeZone.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91nr0() throws Exception{try{__CLR4_4_11nqj1nqjlgchot2w.R.inc(77436);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77437);CachedDateTimeZone test = CachedDateTimeZone.forZone(DateTimeZone.forID("Europe/Paris"));

        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77438);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77439);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77440);oos.writeObject(test);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77441);oos.close();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77442);byte[] bytes = baos.toByteArray();

        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77443);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77444);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77445);CachedDateTimeZone result = (CachedDateTimeZone) ois.readObject();
        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77446);ois.close();

        __CLR4_4_11nqj1nqjlgchot2w.R.inc(77447);assertEquals(test, result);
    }finally{__CLR4_4_11nqj1nqjlgchot2w.R.flushNeeded();}}

}
