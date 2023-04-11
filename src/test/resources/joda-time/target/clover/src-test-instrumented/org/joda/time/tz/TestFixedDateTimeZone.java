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

import java.util.Date;
import java.util.TimeZone;

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
public class TestFixedDateTimeZone {static class __CLR4_4_11nvn1nvnlgchot35{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77603);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77604);TestFixedDateTimeZone TB = new TestFixedDateTimeZone();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77605);TB.setUp();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77606);TB.testEquals();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77607);TB.tearDown();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77608);TB.setUp();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77609);TB.testHashCode();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77610);TB.tearDown();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77611);TB.setUp();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77612);TB.testToTimeZone1();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77613);TB.tearDown();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77614);TB.setUp();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77615);TB.testToTimeZone2();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77616);TB.tearDown();
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestFixedDateTimeZone.class);
    }
    public TestFixedDateTimeZone(String name) {
        super(name);
    }
     */
    private DateTimeZone originalDateTimeZone = null;


    @Before
    public void setUp() throws Exception {try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77617);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77618);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77619);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77620);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77621);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_4_11nvn1nvnlgchot35.R.globalSliceStart(getClass().getName(),77622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081nw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nvn1nvnlgchot35.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nvn1nvnlgchot35.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081nw6() throws Exception{try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77622);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77623);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77624);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77625);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77626);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77627);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6);

        __CLR4_4_11nvn1nvnlgchot35.R.inc(77628);assertEquals(true, zone1.equals(zone1));
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77629);assertEquals(true, zone1.equals(zone1b));
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77630);assertEquals(true, zone1.equals(zone2));  // second arg ignored
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77631);assertEquals(false, zone1.equals(zone3));
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77632);assertEquals(false, zone1.equals(zone4));
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_4_11nvn1nvnlgchot35.R.globalSliceStart(getClass().getName(),77633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv81nwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nvn1nvnlgchot35.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nvn1nvnlgchot35.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv81nwh() throws Exception{try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77633);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77634);FixedDateTimeZone zone1 = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77635);FixedDateTimeZone zone1b = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77636);FixedDateTimeZone zone2 = new FixedDateTimeZone("A", "C", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77637);FixedDateTimeZone zone3 = new FixedDateTimeZone("A", "B", 2, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77638);FixedDateTimeZone zone4 = new FixedDateTimeZone("A", "B", 1, 6);

        __CLR4_4_11nvn1nvnlgchot35.R.inc(77639);assertEquals(true, zone1.hashCode() == zone1.hashCode());
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77640);assertEquals(true, zone1.hashCode() == zone1b.hashCode());
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77641);assertEquals(true, zone1.hashCode() == zone2.hashCode());  // second arg ignored
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77642);assertEquals(false, zone1.hashCode() == zone3.hashCode());
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77643);assertEquals(false, zone1.hashCode() == zone4.hashCode());
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    @Test
    public void testToTimeZone1() throws Exception {__CLR4_4_11nvn1nvnlgchot35.R.globalSliceStart(getClass().getName(),77644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1laif4e1nws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nvn1nvnlgchot35.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nvn1nvnlgchot35.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1laif4e1nws() throws Exception{try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77644);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77645);FixedDateTimeZone zone = new FixedDateTimeZone("+00:01", "+00:01", 60000, 60000);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77646);TimeZone tz = zone.toTimeZone();

        __CLR4_4_11nvn1nvnlgchot35.R.inc(77647);assertEquals(60000, tz.getRawOffset());
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77648);assertEquals(60000, getOffset(tz, 1167638400000L));
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77649);assertEquals(60000, getOffset(tz, 1185951600000L));
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    @Test
    public void testToTimeZone2() throws Exception {__CLR4_4_11nvn1nvnlgchot35.R.globalSliceStart(getClass().getName(),77650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1igbx1nwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nvn1nvnlgchot35.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nvn1nvnlgchot35.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestFixedDateTimeZone.testToTimeZone2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1igbx1nwy() throws Exception{try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77650);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77651);FixedDateTimeZone zone = new FixedDateTimeZone("A", "B", 1, 5);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77652);TimeZone tz = zone.toTimeZone();

        __CLR4_4_11nvn1nvnlgchot35.R.inc(77653);assertEquals(1, tz.getRawOffset());
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77654);assertEquals(1, getOffset(tz, 1167638400000L));
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77655);assertEquals(1, getOffset(tz, 1185951600000L));
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

    /**
     * Make test compile on JDK 1.3.
     */
    private int getOffset(TimeZone zone, long millis) {try{__CLR4_4_11nvn1nvnlgchot35.R.inc(77656);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77657);Date date = new Date(millis);
        __CLR4_4_11nvn1nvnlgchot35.R.inc(77658);if ((((zone.inDaylightTime(date))&&(__CLR4_4_11nvn1nvnlgchot35.R.iget(77659)!=0|true))||(__CLR4_4_11nvn1nvnlgchot35.R.iget(77660)==0&false))) {{
            __CLR4_4_11nvn1nvnlgchot35.R.inc(77661);return zone.getRawOffset() + 3600000;
        }
        }__CLR4_4_11nvn1nvnlgchot35.R.inc(77662);return zone.getRawOffset();
    }finally{__CLR4_4_11nvn1nvnlgchot35.R.flushNeeded();}}

}
