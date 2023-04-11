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
package org.joda.time.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat_Fields {static class __CLR4_4_11l651l65lgchot0c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,74932,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_11l651l65lgchot0c.R.inc(74093);
        __CLR4_4_11l651l65lgchot0c.R.inc(74094);TestISODateTimeFormat_Fields TB = new TestISODateTimeFormat_Fields();

        __CLR4_4_11l651l65lgchot0c.R.inc(74095);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74096);TB.testForFields_null();
        __CLR4_4_11l651l65lgchot0c.R.inc(74097);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74098);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74099);TB.testForFields_empty();
        __CLR4_4_11l651l65lgchot0c.R.inc(74100);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74101);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74102);TB.testForFields_calBased_YMD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74103);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74104);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74105);TB.testForFields_calBased_YMD_unmodifiable();
        __CLR4_4_11l651l65lgchot0c.R.inc(74106);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74107);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74108);TB.testForFields_calBased_YMD_duplicates();
        __CLR4_4_11l651l65lgchot0c.R.inc(74109);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74110);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74111);TB.testForFields_calBased_Y();
        __CLR4_4_11l651l65lgchot0c.R.inc(74112);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74113);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74114);TB.testForFields_calBased_M();
        __CLR4_4_11l651l65lgchot0c.R.inc(74115);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74116);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74117);TB.testForFields_calBased_D();
        __CLR4_4_11l651l65lgchot0c.R.inc(74118);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74119);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74120);TB.testForFields_calBased_YM();
        __CLR4_4_11l651l65lgchot0c.R.inc(74121);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74122);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74123);TB.testForFields_calBased_MD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74124);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74125);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74126);TB.testForFields_calBased_YD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74127);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74128);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74129);TB.testForFields_weekBased_YWD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74130);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74131);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74132);TB.testForFields_weekBased_Y();
        __CLR4_4_11l651l65lgchot0c.R.inc(74133);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74134);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74135);TB.testForFields_weekBased_W();
        __CLR4_4_11l651l65lgchot0c.R.inc(74136);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74137);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74138);TB.testForFields_weekBased_D();
        __CLR4_4_11l651l65lgchot0c.R.inc(74139);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74140);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74141);TB.testForFields_weekBased_YW();
        __CLR4_4_11l651l65lgchot0c.R.inc(74142);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74143);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74144);TB.testForFields_weekBased_WD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74145);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74146);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74147);TB.testForFields_weekBased_YD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74148);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74149);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74150);TB.testForFields_ordinalBased_YD();
        __CLR4_4_11l651l65lgchot0c.R.inc(74151);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74152);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74153);TB.testForFields_ordinalBased_Y();
        __CLR4_4_11l651l65lgchot0c.R.inc(74154);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74155);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74156);TB.testForFields_ordinalBased_D();
        __CLR4_4_11l651l65lgchot0c.R.inc(74157);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74158);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74159);TB.testForFields_time_HMSm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74160);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74161);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74162);TB.testForFields_time_HMS();
        __CLR4_4_11l651l65lgchot0c.R.inc(74163);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74164);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74165);TB.testForFields_time_HM();
        __CLR4_4_11l651l65lgchot0c.R.inc(74166);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74167);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74168);TB.testForFields_time_H();
        __CLR4_4_11l651l65lgchot0c.R.inc(74169);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74170);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74171);TB.testForFields_time_MSm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74172);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74173);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74174);TB.testForFields_time_MS();
        __CLR4_4_11l651l65lgchot0c.R.inc(74175);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74176);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74177);TB.testForFields_time_M();
        __CLR4_4_11l651l65lgchot0c.R.inc(74178);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74179);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74180);TB.testForFields_time_Sm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74181);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74182);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74183);TB.testForFields_time_S();
        __CLR4_4_11l651l65lgchot0c.R.inc(74184);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74185);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74186);TB.testForFields_time_m();
        __CLR4_4_11l651l65lgchot0c.R.inc(74187);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74188);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74189);TB.testForFields_time_Hm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74190);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74191);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74192);TB.testForFields_time_HS();
        __CLR4_4_11l651l65lgchot0c.R.inc(74193);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74194);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74195);TB.testForFields_time_Mm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74196);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74197);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74198);TB.testForFields_time_HSm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74199);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74200);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74201);TB.testForFields_time_HMm();
        __CLR4_4_11l651l65lgchot0c.R.inc(74202);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74203);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74204);TB.testForFields_datetime_YMDH();
        __CLR4_4_11l651l65lgchot0c.R.inc(74205);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74206);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74207);TB.testForFields_datetime_DH();
        __CLR4_4_11l651l65lgchot0c.R.inc(74208);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74209);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74210);TB.testForFields_datetime_YH();
        __CLR4_4_11l651l65lgchot0c.R.inc(74211);TB.tearDown();
        __CLR4_4_11l651l65lgchot0c.R.inc(74212);TB.setUp();
        __CLR4_4_11l651l65lgchot0c.R.inc(74213);TB.testForFields_datetime_DM();
        __CLR4_4_11l651l65lgchot0c.R.inc(74214);TB.tearDown();

    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestISODateTimeFormat_Fields.class);
    }

    public TestISODateTimeFormat_Fields(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11l651l65lgchot0c.R.inc(74215);
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11l651l65lgchot0c.R.inc(74216);
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_null() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfh6d91l9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfh6d91l9l(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74217);
        __CLR4_4_11l651l65lgchot0c.R.inc(74218);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74219);ISODateTimeFormat.forFields((Collection) null, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74220);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_empty() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lq1xh1l9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_empty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lq1xh1l9p(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74221);
        __CLR4_4_11l651l65lgchot0c.R.inc(74222);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74223);ISODateTimeFormat.forFields(new ArrayList(), true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74224);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_YMD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm3ugk1l9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm3ugk1l9t(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74225);
        __CLR4_4_11l651l65lgchot0c.R.inc(74226);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74227);int[] values = new int[]{2005, 6, 25};
        __CLR4_4_11l651l65lgchot0c.R.inc(74228);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74229);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74230);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74231);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74232);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74233);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74234);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74235);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74236);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74237);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74238);assertEquals("20050625", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74239);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74240);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74241);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74242);assertEquals("20050625", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74243);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_YMD_unmodifiable() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aqfmn21lac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_unmodifiable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aqfmn21lac(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74244);
        __CLR4_4_11l651l65lgchot0c.R.inc(74245);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74246);int[] values = new int[]{2005, 6, 25};
        __CLR4_4_11l651l65lgchot0c.R.inc(74247);List types = Collections.unmodifiableList(new ArrayList(Arrays.asList(fields)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74248);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74249);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74250);assertEquals(3, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74251);types = Arrays.asList(fields);
        __CLR4_4_11l651l65lgchot0c.R.inc(74252);f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74253);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74254);assertEquals(3, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_YMD_duplicates() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm6mtz1lan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YMD_duplicates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm6mtz1lan(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74255);
        __CLR4_4_11l651l65lgchot0c.R.inc(74256);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74257);DateTimeFieldType[] dupFields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74258);int[] values = new int[]{2005, 6, 25};
        __CLR4_4_11l651l65lgchot0c.R.inc(74259);List types = new ArrayList(Arrays.asList(dupFields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74260);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74261);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74262);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74263);types = Arrays.asList(dupFields);
        __CLR4_4_11l651l65lgchot0c.R.inc(74264);f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74265);assertEquals("2005-06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74266);assertEquals(4, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_Y() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17t2mgb1laz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_Y",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17t2mgb1laz(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74267);
        __CLR4_4_11l651l65lgchot0c.R.inc(74268);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74269);int[] values = new int[]{2005};
        __CLR4_4_11l651l65lgchot0c.R.inc(74270);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74271);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74272);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74273);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74274);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74275);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74276);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74277);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74278);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74279);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74280);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74281);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74282);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74283);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74284);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74285);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_M() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o81u151lbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_M",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o81u151lbi(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74286);
        __CLR4_4_11l651l65lgchot0c.R.inc(74287);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74288);int[] values = new int[]{6};
        __CLR4_4_11l651l65lgchot0c.R.inc(74289);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74290);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74291);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74292);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74293);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74294);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74295);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74296);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74297);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74298);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74299);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74300);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74301);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74302);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74303);assertEquals("--06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74304);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_D() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150xv341lc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150xv341lc1(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74305);
        __CLR4_4_11l651l65lgchot0c.R.inc(74306);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74307);int[] values = new int[]{25};
        __CLR4_4_11l651l65lgchot0c.R.inc(74308);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74309);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74310);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74311);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74312);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74313);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74314);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74315);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74316);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74317);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74318);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74319);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74320);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74321);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74322);assertEquals("---25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74323);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_YM() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uke3vq1lck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uke3vq1lck(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74324);
        __CLR4_4_11l651l65lgchot0c.R.inc(74325);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74326);int[] values = new int[]{2005, 6};
        __CLR4_4_11l651l65lgchot0c.R.inc(74327);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74328);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74329);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74330);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74331);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74332);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74333);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74334);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74335);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74336);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74337);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74338);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74339);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74340);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74341);assertEquals("2005-06", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74342);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_MD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15c5vb1ld3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_MD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15c5vb1ld3(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74343);
        __CLR4_4_11l651l65lgchot0c.R.inc(74344);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74345);int[] values = new int[]{6, 25};
        __CLR4_4_11l651l65lgchot0c.R.inc(74346);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74347);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74348);assertEquals("--06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74349);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74350);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74351);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74352);assertEquals("--06-25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74353);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74354);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74355);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74356);assertEquals("--0625", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74357);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74358);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74359);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74360);assertEquals("--0625", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74361);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_calBased_YD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11beerh1ldm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_calBased_YD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11beerh1ldm(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74362);
        __CLR4_4_11l651l65lgchot0c.R.inc(74363);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfMonth(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74364);int[] values = new int[]{2005, 25};
        __CLR4_4_11l651l65lgchot0c.R.inc(74365);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74366);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74367);assertEquals("2005--25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74368);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74369);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74370);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74371);assertEquals("2005--25", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74372);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74373);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74374);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74375);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74376);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74377);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74378);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74379);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74380);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_YWD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzbuse1le5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YWD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzbuse1le5(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74381);
        __CLR4_4_11l651l65lgchot0c.R.inc(74382);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.weekyear(),
                DateTimeFieldType.weekOfWeekyear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74383);int[] values = new int[]{2005, 8, 5};
        __CLR4_4_11l651l65lgchot0c.R.inc(74384);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74385);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74386);assertEquals("2005-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74387);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74388);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74389);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74390);assertEquals("2005-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74391);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74392);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74393);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74394);assertEquals("2005W085", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74395);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74396);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74397);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74398);assertEquals("2005W085", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74399);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_Y() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpbwgf1leo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_Y",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpbwgf1leo(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74400);
        __CLR4_4_11l651l65lgchot0c.R.inc(74401);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.weekyear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74402);int[] values = new int[]{2005};
        __CLR4_4_11l651l65lgchot0c.R.inc(74403);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74404);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74405);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74406);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74407);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74408);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74409);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74410);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74411);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74412);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74413);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74414);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74415);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74416);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74417);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74418);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_W() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7bu1d1lf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_W",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7bu1d1lf7(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74419);
        __CLR4_4_11l651l65lgchot0c.R.inc(74420);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.weekOfWeekyear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74421);int[] values = new int[]{8};
        __CLR4_4_11l651l65lgchot0c.R.inc(74422);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74423);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74424);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74425);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74426);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74427);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74428);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74429);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74430);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74431);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74432);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74433);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74434);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74435);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74436);assertEquals("-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74437);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_D() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18x75381lfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18x75381lfq(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74438);
        __CLR4_4_11l651l65lgchot0c.R.inc(74439);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74440);int[] values = new int[]{5};
        __CLR4_4_11l651l65lgchot0c.R.inc(74441);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74442);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74443);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74444);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74445);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74446);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74447);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74448);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74449);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74450);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74451);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74452);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74453);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74454);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74455);assertEquals("-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74456);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_YW() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbi7o41lg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbi7o41lg9(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74457);
        __CLR4_4_11l651l65lgchot0c.R.inc(74458);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.weekyear(),
                DateTimeFieldType.weekOfWeekyear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74459);int[] values = new int[]{2005, 8};
        __CLR4_4_11l651l65lgchot0c.R.inc(74460);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74461);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74462);assertEquals("2005-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74463);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74464);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74465);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74466);assertEquals("2005-W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74467);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74468);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74469);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74470);assertEquals("2005W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74471);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74472);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74473);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74474);assertEquals("2005W08", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74475);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_WD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y715ib1lgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_WD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y715ib1lgs(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74476);
        __CLR4_4_11l651l65lgchot0c.R.inc(74477);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.weekOfWeekyear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74478);int[] values = new int[]{8, 5};
        __CLR4_4_11l651l65lgchot0c.R.inc(74479);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74480);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74481);assertEquals("-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74482);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74483);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74484);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74485);assertEquals("-W08-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74486);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74487);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74488);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74489);assertEquals("-W085", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74490);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74491);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74492);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74493);assertEquals("-W085", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74494);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_weekBased_YD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlmwm91lhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_weekBased_YD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlmwm91lhb(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74495);
        __CLR4_4_11l651l65lgchot0c.R.inc(74496);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.weekyear(),
                DateTimeFieldType.dayOfWeek(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74497);int[] values = new int[]{2005, 5};
        __CLR4_4_11l651l65lgchot0c.R.inc(74498);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74499);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74500);assertEquals("2005-W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74501);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74502);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74503);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74504);assertEquals("2005W-5", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74505);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74506);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74507);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74508);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74509);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74510);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74511);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74512);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74513);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testForFields_ordinalBased_YD() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfpa801lhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_YD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfpa801lhu(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74514);
        __CLR4_4_11l651l65lgchot0c.R.inc(74515);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.dayOfYear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74516);int[] values = new int[]{2005, 177};
        __CLR4_4_11l651l65lgchot0c.R.inc(74517);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74518);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74519);assertEquals("2005-177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74520);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74521);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74522);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74523);assertEquals("2005-177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74524);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74525);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74526);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74527);assertEquals("2005177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74528);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74529);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74530);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74531);assertEquals("2005177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74532);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_ordinalBased_Y() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w5u1a1lid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_Y",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w5u1a1lid(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74533);
        __CLR4_4_11l651l65lgchot0c.R.inc(74534);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74535);int[] values = new int[]{2005};
        __CLR4_4_11l651l65lgchot0c.R.inc(74536);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74537);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74538);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74539);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74540);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74541);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74542);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74543);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74544);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74545);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74546);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74547);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74548);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74549);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74550);assertEquals("2005", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74551);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_ordinalBased_D() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vyxbx1liw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_ordinalBased_D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vyxbx1liw(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74552);
        __CLR4_4_11l651l65lgchot0c.R.inc(74553);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfYear(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74554);int[] values = new int[]{177};
        __CLR4_4_11l651l65lgchot0c.R.inc(74555);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74556);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74557);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74558);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74559);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74560);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74561);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74562);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74563);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74564);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74565);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74566);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74567);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74568);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74569);assertEquals("-177", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74570);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_HMSm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kt6suv1ljf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMSm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kt6suv1ljf(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74571);
        __CLR4_4_11l651l65lgchot0c.R.inc(74572);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74573);int[] values = new int[]{10, 20, 30, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74574);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74575);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74576);assertEquals("10:20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74577);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74578);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74579);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74580);assertEquals("10:20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74581);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74582);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74583);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74584);assertEquals("102030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74585);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74586);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74587);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74588);assertEquals("102030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74589);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_HMS() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3zwry1ljy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3zwry1ljy(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74590);
        __CLR4_4_11l651l65lgchot0c.R.inc(74591);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74592);int[] values = new int[]{10, 20, 30};
        __CLR4_4_11l651l65lgchot0c.R.inc(74593);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74594);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74595);assertEquals("10:20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74596);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74597);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74598);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74599);assertEquals("10:20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74600);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74601);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74602);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74603);assertEquals("102030", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74604);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74605);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74606);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74607);assertEquals("102030", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74608);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_HM() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18f4y0f1lkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18f4y0f1lkh(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74609);
        __CLR4_4_11l651l65lgchot0c.R.inc(74610);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74611);int[] values = new int[]{10, 20};
        __CLR4_4_11l651l65lgchot0c.R.inc(74612);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74613);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74614);assertEquals("10:20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74615);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74616);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74617);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74618);assertEquals("10:20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74619);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74620);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74621);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74622);assertEquals("1020", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74623);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74624);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74625);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74626);assertEquals("1020", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74627);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_H() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9pro41ll0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_H",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9pro41ll0(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74628);
        __CLR4_4_11l651l65lgchot0c.R.inc(74629);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74630);int[] values = new int[]{10};
        __CLR4_4_11l651l65lgchot0c.R.inc(74631);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74632);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74633);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74634);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74635);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74636);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74637);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74638);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74639);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74640);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74641);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74642);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74643);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74644);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74645);assertEquals("10", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74646);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_MSm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxj0sr1llj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MSm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxj0sr1llj(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74647);
        __CLR4_4_11l651l65lgchot0c.R.inc(74648);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74649);int[] values = new int[]{20, 30, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74650);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74651);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74652);assertEquals("-20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74653);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74654);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74655);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74656);assertEquals("-20:30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74657);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74658);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74659);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74660);assertEquals("-2030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74661);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74662);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74663);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74664);assertEquals("-2030.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74665);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_MS() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yg75io1lm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_MS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yg75io1lm2(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74666);
        __CLR4_4_11l651l65lgchot0c.R.inc(74667);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74668);int[] values = new int[]{20, 30};
        __CLR4_4_11l651l65lgchot0c.R.inc(74669);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74670);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74671);assertEquals("-20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74672);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74673);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74674);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74675);assertEquals("-20:30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74676);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74677);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74678);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74679);assertEquals("-2030", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74680);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74681);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74682);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74683);assertEquals("-2030", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74684);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_M() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160pxpr1lml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_M",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160pxpr1lml(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74685);
        __CLR4_4_11l651l65lgchot0c.R.inc(74686);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.minuteOfHour(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74687);int[] values = new int[]{20};
        __CLR4_4_11l651l65lgchot0c.R.inc(74688);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74689);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74690);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74691);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74692);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74693);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74694);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74695);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74696);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74697);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74698);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74699);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74700);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74701);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74702);assertEquals("-20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74703);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_Sm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4vhfo1ln4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Sm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4vhfo1ln4(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74704);
        __CLR4_4_11l651l65lgchot0c.R.inc(74705);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74706);int[] values = new int[]{30, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74707);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74708);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74709);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74710);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74711);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74712);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74713);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74714);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74715);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74716);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74717);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74718);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74719);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74720);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74721);assertEquals("--30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74722);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_S() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dh9v131lnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_S",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dh9v131lnn(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74723);
        __CLR4_4_11l651l65lgchot0c.R.inc(74724);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74725);int[] values = new int[]{30};
        __CLR4_4_11l651l65lgchot0c.R.inc(74726);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74727);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74728);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74729);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74730);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74731);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74732);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74733);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74734);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74735);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74736);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74737);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74738);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74739);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74740);assertEquals("--30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74741);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_m() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qy4xm91lo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_m",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qy4xm91lo6(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74742);
        __CLR4_4_11l651l65lgchot0c.R.inc(74743);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74744);int[] values = new int[]{40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74745);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74746);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74747);assertEquals("---.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74748);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74749);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74750);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74751);assertEquals("---.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74752);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74753);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74754);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74755);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74756);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74757);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74758);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74759);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74760);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_Hm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn48mp1lop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Hm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn48mp1lop(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74761);
        __CLR4_4_11l651l65lgchot0c.R.inc(74762);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74763);int[] values = new int[]{10, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74764);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74765);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74766);assertEquals("10--.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74767);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74768);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74769);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74770);assertEquals("10--.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74771);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74772);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74773);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74774);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74775);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74776);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74777);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74778);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74779);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_HS() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx4qr91lp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx4qr91lp8(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74780);
        __CLR4_4_11l651l65lgchot0c.R.inc(74781);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.secondOfMinute(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74782);int[] values = new int[]{10, 30};
        __CLR4_4_11l651l65lgchot0c.R.inc(74783);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74784);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74785);assertEquals("10-30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74786);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74787);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74788);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74789);assertEquals("10-30", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74790);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74791);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74792);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74793);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74794);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74795);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74796);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74797);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74798);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_Mm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n41tva1lpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_Mm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n41tva1lpr(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74799);
        __CLR4_4_11l651l65lgchot0c.R.inc(74800);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74801);int[] values = new int[]{20, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74802);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74803);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74804);assertEquals("-20-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74805);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74806);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74807);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74808);assertEquals("-20-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74809);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74810);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74811);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74812);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74813);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74814);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74815);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74816);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74817);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_HSm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylsh461lqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HSm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylsh461lqa(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74818);
        __CLR4_4_11l651l65lgchot0c.R.inc(74819);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.secondOfMinute(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74820);int[] values = new int[]{10, 30, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74821);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74822);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74823);assertEquals("10-30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74824);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74825);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74826);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74827);assertEquals("10-30.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74828);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74829);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74830);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74831);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74832);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74833);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74834);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74835);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74836);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_time_HMm() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n4u6s1lqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_time_HMm",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n4u6s1lqt(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74837);
        __CLR4_4_11l651l65lgchot0c.R.inc(74838);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.hourOfDay(),
                DateTimeFieldType.minuteOfHour(),
                DateTimeFieldType.millisOfSecond(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74839);int[] values = new int[]{10, 20, 40};
        __CLR4_4_11l651l65lgchot0c.R.inc(74840);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74841);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74842);assertEquals("10:20-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74843);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74844);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74845);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74846);assertEquals("1020-.040", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74847);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74848);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74849);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74850);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74851);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74852);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74853);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74854);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74855);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testForFields_datetime_YMDH() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqxte41lrc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YMDH",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqxte41lrc(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74856);
        __CLR4_4_11l651l65lgchot0c.R.inc(74857);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74858);int[] values = new int[]{2005, 6, 25, 12};
        __CLR4_4_11l651l65lgchot0c.R.inc(74859);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74860);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74861);assertEquals("2005-06-25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74862);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74863);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74864);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74865);assertEquals("2005-06-25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74866);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74867);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74868);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74869);assertEquals("20050625T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74870);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74871);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74872);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74873);assertEquals("20050625T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74874);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_datetime_DH() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e41wg1lrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DH",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e41wg1lrv(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74875);
        __CLR4_4_11l651l65lgchot0c.R.inc(74876);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74877);int[] values = new int[]{25, 12};
        __CLR4_4_11l651l65lgchot0c.R.inc(74878);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74879);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74880);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74881);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74882);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74883);f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74884);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74885);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74886);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74887);f = ISODateTimeFormat.forFields(types, false, true);
        __CLR4_4_11l651l65lgchot0c.R.inc(74888);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74889);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74890);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74891);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74892);assertEquals("---25T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74893);assertEquals(0, types.size());
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_datetime_YH() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16svghh1lse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_YH",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16svghh1lse(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74894);
        __CLR4_4_11l651l65lgchot0c.R.inc(74895);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.year(),
                DateTimeFieldType.hourOfDay(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74896);int[] values = new int[]{2005, 12};
        __CLR4_4_11l651l65lgchot0c.R.inc(74897);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74898);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74899);assertEquals("2005T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74900);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74901);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74902);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74903);assertEquals("2005T12", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74904);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74905);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74906);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74907);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74908);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74909);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74910);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74911);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74912);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForFields_datetime_DM() {__CLR4_4_11l651l65lgchot0c.R.globalSliceStart(getClass().getName(),74913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1on3vut1lsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11l651l65lgchot0c.R.rethrow($CLV_t2$);}finally{__CLR4_4_11l651l65lgchot0c.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestISODateTimeFormat_Fields.testForFields_datetime_DM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1on3vut1lsx(){try{__CLR4_4_11l651l65lgchot0c.R.inc(74913);
        __CLR4_4_11l651l65lgchot0c.R.inc(74914);DateTimeFieldType[] fields = new DateTimeFieldType[]{
                DateTimeFieldType.dayOfMonth(),
                DateTimeFieldType.minuteOfHour(),
        };
        __CLR4_4_11l651l65lgchot0c.R.inc(74915);int[] values = new int[]{25, 20};
        __CLR4_4_11l651l65lgchot0c.R.inc(74916);List types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74917);DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74918);assertEquals("---25T-20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74919);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74920);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74921);f = ISODateTimeFormat.forFields(types, false, false);
        __CLR4_4_11l651l65lgchot0c.R.inc(74922);assertEquals("---25T-20", f.print(new Partial(fields, values)));
        __CLR4_4_11l651l65lgchot0c.R.inc(74923);assertEquals(0, types.size());

        __CLR4_4_11l651l65lgchot0c.R.inc(74924);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74925);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74926);ISODateTimeFormat.forFields(types, true, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74927);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11l651l65lgchot0c.R.inc(74928);types = new ArrayList(Arrays.asList(fields));
        __CLR4_4_11l651l65lgchot0c.R.inc(74929);try {
            __CLR4_4_11l651l65lgchot0c.R.inc(74930);ISODateTimeFormat.forFields(types, false, true);
            __CLR4_4_11l651l65lgchot0c.R.inc(74931);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11l651l65lgchot0c.R.flushNeeded();}}

}
