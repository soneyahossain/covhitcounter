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
package org.joda.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.base.AbstractPartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TestAbstractPartial {static class __CLR4_4_1hdjhdjlgchore7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,22637,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Throwable {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22519);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22520);TestAbstractPartial TB = new TestAbstractPartial();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22521);TB.setUp();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22522);TB.testGetValue();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22523);TB.tearDown();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22524);TB.setUp();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22525);TB.testGetValues();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22526);TB.tearDown();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22527);TB.setUp();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22528);TB.testGetField();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22529);TB.tearDown();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22530);TB.setUp();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22531);TB.testGetFieldType();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22532);TB.tearDown();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22533);TB.setUp();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22534);TB.testGetFieldTypes();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22535);TB.tearDown();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22536);TB.setUp();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22537);TB.testGetPropertyEquals();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22538);TB.tearDown();

    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestAbstractPartial.class);
    }

    public TestAbstractPartial(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22539);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22540);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22541);zone = DateTimeZone.getDefault();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22542);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22543);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22544);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22545);DateTimeZone.setDefault(zone);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22546);zone = null;
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetValue() throws Throwable {__CLR4_4_1hdjhdjlgchore7.R.globalSliceStart(getClass().getName(),22547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmkheb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlgchore7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlgchore7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmkheb() throws Throwable{try{__CLR4_4_1hdjhdjlgchore7.R.inc(22547);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22548);MockPartial mock = new MockPartial();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22549);assertEquals(1970, mock.getValue(0));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22550);assertEquals(1, mock.getValue(1));

        __CLR4_4_1hdjhdjlgchore7.R.inc(22551);try {
            __CLR4_4_1hdjhdjlgchore7.R.inc(22552);mock.getValue(-1);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22553);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1hdjhdjlgchore7.R.inc(22554);try {
            __CLR4_4_1hdjhdjlgchore7.R.inc(22555);mock.getValue(2);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22556);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    @Test
    public void testGetValues() throws Throwable {__CLR4_4_1hdjhdjlgchore7.R.globalSliceStart(getClass().getName(),22557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduelhel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlgchore7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlgchore7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduelhel() throws Throwable{try{__CLR4_4_1hdjhdjlgchore7.R.inc(22557);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22558);MockPartial mock = new MockPartial();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22559);int[] vals = mock.getValues();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22560);assertEquals(2, vals.length);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22561);assertEquals(1970, vals[0]);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22562);assertEquals(1, vals[1]);
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    @Test
    public void testGetField() throws Throwable {__CLR4_4_1hdjhdjlgchore7.R.globalSliceStart(getClass().getName(),22563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7nher();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlgchore7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlgchore7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7nher() throws Throwable{try{__CLR4_4_1hdjhdjlgchore7.R.inc(22563);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22564);MockPartial mock = new MockPartial();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22565);assertEquals(BuddhistChronology.getInstanceUTC().year(), mock.getField(0));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22566);assertEquals(BuddhistChronology.getInstanceUTC().monthOfYear(), mock.getField(1));

        __CLR4_4_1hdjhdjlgchore7.R.inc(22567);try {
            __CLR4_4_1hdjhdjlgchore7.R.inc(22568);mock.getField(-1);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22569);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1hdjhdjlgchore7.R.inc(22570);try {
            __CLR4_4_1hdjhdjlgchore7.R.inc(22571);mock.getField(2);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22572);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    @Test
    public void testGetFieldType() throws Throwable {__CLR4_4_1hdjhdjlgchore7.R.globalSliceStart(getClass().getName(),22573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mvhf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlgchore7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlgchore7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mvhf1() throws Throwable{try{__CLR4_4_1hdjhdjlgchore7.R.inc(22573);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22574);MockPartial mock = new MockPartial();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22575);assertEquals(DateTimeFieldType.year(), mock.getFieldType(0));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22576);assertEquals(DateTimeFieldType.monthOfYear(), mock.getFieldType(1));

        __CLR4_4_1hdjhdjlgchore7.R.inc(22577);try {
            __CLR4_4_1hdjhdjlgchore7.R.inc(22578);mock.getFieldType(-1);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22579);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_1hdjhdjlgchore7.R.inc(22580);try {
            __CLR4_4_1hdjhdjlgchore7.R.inc(22581);mock.getFieldType(2);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22582);fail();
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() throws Throwable {__CLR4_4_1hdjhdjlgchore7.R.globalSliceStart(getClass().getName(),22583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvuhfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlgchore7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlgchore7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22583,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvuhfb() throws Throwable{try{__CLR4_4_1hdjhdjlgchore7.R.inc(22583);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22584);MockPartial mock = new MockPartial();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22585);DateTimeFieldType[] vals = mock.getFieldTypes();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22586);assertEquals(2, vals.length);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22587);assertEquals(DateTimeFieldType.year(), vals[0]);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22588);assertEquals(DateTimeFieldType.monthOfYear(), vals[1]);
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    @Test
    public void testGetPropertyEquals() throws Throwable {__CLR4_4_1hdjhdjlgchore7.R.globalSliceStart(getClass().getName(),22589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vxq7y7hfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1hdjhdjlgchore7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1hdjhdjlgchore7.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestAbstractPartial.testGetPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),22589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vxq7y7hfh() throws Throwable{try{__CLR4_4_1hdjhdjlgchore7.R.inc(22589);
        __CLR4_4_1hdjhdjlgchore7.R.inc(22590);MockProperty0 prop0 = new MockProperty0();
        __CLR4_4_1hdjhdjlgchore7.R.inc(22591);assertEquals(true, prop0.equals(prop0));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22592);assertEquals(true, prop0.equals(new MockProperty0()));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22593);assertEquals(false, prop0.equals(new MockProperty1()));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22594);assertEquals(false, prop0.equals(new MockProperty0Val()));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22595);assertEquals(false, prop0.equals(new MockProperty0Field()));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22596);assertEquals(false, prop0.equals(new MockProperty0Chrono()));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22597);assertEquals(false, prop0.equals(""));
        __CLR4_4_1hdjhdjlgchore7.R.inc(22598);assertEquals(false, prop0.equals(null));
    }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    static class MockPartial extends AbstractPartial {

        int[] val = new int[]{1970, 1};

        MockPartial() {
            super();__CLR4_4_1hdjhdjlgchore7.R.inc(22600);try{__CLR4_4_1hdjhdjlgchore7.R.inc(22599);
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22601);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1hdjhdjlgchore7.R.inc(22602);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1hdjhdjlgchore7.R.inc(22603);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1hdjhdjlgchore7.R.inc(22604);return chrono.year();
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1hdjhdjlgchore7.R.inc(22605);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1hdjhdjlgchore7.R.inc(22606);return chrono.monthOfYear();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_1hdjhdjlgchore7.R.inc(22607);__CLB4_4_1_bool0=true;}
                    __CLR4_4_1hdjhdjlgchore7.R.inc(22608);throw new IndexOutOfBoundsException();
            }
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public int size() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22609);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22610);return 2;
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public int getValue(int index) {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22611);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22612);return val[index];
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public void setValue(int index, int value) {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22613);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22614);val[index] = value;
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public Chronology getChronology() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22615);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22616);return BuddhistChronology.getInstanceUTC();
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
    }

    static class MockProperty0 extends AbstractPartialFieldProperty {
        MockPartial partial = new MockPartial();

        public DateTimeField getField() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22617);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22618);return partial.getField(0);
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public ReadablePartial getReadablePartial() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22619);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22620);return partial;
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public int get() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22621);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22622);return partial.getValue(0);
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
    }

    static class MockProperty1 extends AbstractPartialFieldProperty {
        MockPartial partial = new MockPartial();

        public DateTimeField getField() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22623);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22624);return partial.getField(1);
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public ReadablePartial getReadablePartial() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22625);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22626);return partial;
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}

        public int get() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22627);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22628);return partial.getValue(1);
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
    }

    static class MockProperty0Field extends MockProperty0 {
        public DateTimeField getField() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22629);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22630);return BuddhistChronology.getInstanceUTC().hourOfDay();
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
    }

    static class MockProperty0Val extends MockProperty0 {
        public int get() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22631);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22632);return 99;
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
    }

    static class MockProperty0Chrono extends MockProperty0 {
        public ReadablePartial getReadablePartial() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22633);
            __CLR4_4_1hdjhdjlgchore7.R.inc(22634);return new MockPartial() {
                public Chronology getChronology() {try{__CLR4_4_1hdjhdjlgchore7.R.inc(22635);
                    __CLR4_4_1hdjhdjlgchore7.R.inc(22636);return ISOChronology.getInstanceUTC();
                }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
            };
        }finally{__CLR4_4_1hdjhdjlgchore7.R.flushNeeded();}}
    }
}
