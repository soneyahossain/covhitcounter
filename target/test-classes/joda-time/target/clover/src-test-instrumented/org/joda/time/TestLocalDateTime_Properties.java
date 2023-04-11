/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties {static class __CLR4_4_1sjksjklgchos01{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,37921,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
            (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L);
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + MILLIS_OF_DAY;
    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 1L * DateTimeConstants.MILLIS_PER_HOUR
                    + 2L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 3L * DateTimeConstants.MILLIS_PER_SECOND
                    + 4L;
    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 4L * DateTimeConstants.MILLIS_PER_HOUR
                    + 5L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 6L * DateTimeConstants.MILLIS_PER_SECOND
                    + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1sjksjklgchos01.R.inc(36992);
        __CLR4_4_1sjksjklgchos01.R.inc(36993);TestLocalDateTime_Properties TB = new TestLocalDateTime_Properties();
        __CLR4_4_1sjksjklgchos01.R.inc(36994);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(36995);TB.testPropertyGetYear();
        __CLR4_4_1sjksjklgchos01.R.inc(36996);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(36997);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(36998);TB.testPropertyGetMaxMinValuesYear();
        __CLR4_4_1sjksjklgchos01.R.inc(36999);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37000);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37001);TB.testPropertyAddToCopyYear();
        __CLR4_4_1sjksjklgchos01.R.inc(37002);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37003);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37004);TB.testPropertyAddWrapFieldToCopyYear();
        __CLR4_4_1sjksjklgchos01.R.inc(37005);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37006);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37007);TB.testPropertySetCopyYear();
        __CLR4_4_1sjksjklgchos01.R.inc(37008);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37009);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37010);TB.testPropertySetCopyTextYear();
        __CLR4_4_1sjksjklgchos01.R.inc(37011);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37012);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37013);TB.testPropertyCompareToYear();
        __CLR4_4_1sjksjklgchos01.R.inc(37014);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37015);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37016);TB.testPropertyGetMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37017);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37018);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37019);TB.testPropertyGetMaxMinValuesMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37020);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37021);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37022);TB.testPropertyAddToCopyMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37023);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37024);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37025);TB.testPropertyAddWrapFieldToCopyMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37026);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37027);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37028);TB.testPropertySetCopyMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37029);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37030);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37031);TB.testPropertySetCopyTextMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37032);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37033);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37034);TB.testPropertyCompareToMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37035);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37036);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37037);TB.testPropertyGetDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37038);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37039);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37040);TB.testPropertyGetMaxMinValuesDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37041);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37042);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37043);TB.testPropertyAddToCopyDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37044);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37045);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37046);TB.testPropertyAddWrapFieldToCopyDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37047);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37048);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37049);TB.testPropertySetCopyDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37050);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37051);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37052);TB.testPropertySetCopyTextDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37053);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37054);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37055);TB.testPropertyWithMaximumValueDayOfMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37056);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37057);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37058);TB.testPropertyWithMinimumValueDayOfMonth();
        __CLR4_4_1sjksjklgchos01.R.inc(37059);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37060);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37061);TB.testPropertyCompareToDay();
        __CLR4_4_1sjksjklgchos01.R.inc(37062);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37063);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37064);TB.testPropertyEquals();
        __CLR4_4_1sjksjklgchos01.R.inc(37065);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37066);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37067);TB.testPropertyHashCode();
        __CLR4_4_1sjksjklgchos01.R.inc(37068);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37069);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37070);TB.testPropertyGetHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37071);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37072);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37073);TB.testPropertyRoundHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37074);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37075);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37076);TB.testPropertyGetMaxMinValuesHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37077);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37078);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37079);TB.testPropertyWithMaxMinValueHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37080);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37081);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37082);TB.testPropertyAddToCopyHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37083);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37084);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37085);TB.testPropertyAddWrapFieldToCopyHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37086);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37087);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37088);TB.testPropertySetHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37089);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37090);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37091);TB.testPropertySetTextHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37092);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37093);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37094);TB.testPropertyWithMaximumValueHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37095);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37096);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37097);TB.testPropertyWithMinimumValueHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37098);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37099);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37100);TB.testPropertyCompareToHour();
        __CLR4_4_1sjksjklgchos01.R.inc(37101);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37102);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37103);TB.testPropertyGetMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37104);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37105);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37106);TB.testPropertyGetMaxMinValuesMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37107);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37108);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37109);TB.testPropertyWithMaxMinValueMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37110);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37111);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37112);TB.testPropertyAddToCopyMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37113);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37114);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37115);TB.testPropertyAddWrapFieldToCopyMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37116);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37117);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37118);TB.testPropertySetMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37119);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37120);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37121);TB.testPropertySetTextMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37122);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37123);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37124);TB.testPropertyCompareToMinute();
        __CLR4_4_1sjksjklgchos01.R.inc(37125);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37126);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37127);TB.testPropertyGetSecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37128);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37129);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37130);TB.testPropertyGetMaxMinValuesSecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37131);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37132);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37133);TB.testPropertyWithMaxMinValueSecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37134);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37135);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37136);TB.testPropertyAddToCopySecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37137);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37138);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37139);TB.testPropertyAddWrapFieldToCopySecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37140);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37141);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37142);TB.testPropertySetSecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37143);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37144);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37145);TB.testPropertySetTextSecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37146);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37147);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37148);TB.testPropertyCompareToSecond();
        __CLR4_4_1sjksjklgchos01.R.inc(37149);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37150);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37151);TB.testPropertyGetMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37152);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37153);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37154);TB.testPropertyGetMaxMinValuesMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37155);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37156);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37157);TB.testPropertyWithMaxMinValueMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37158);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37159);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37160);TB.testPropertyAddToCopyMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37161);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37162);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37163);TB.testPropertyAddWrapFieldToCopyMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37164);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37165);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37166);TB.testPropertySetMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37167);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37168);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37169);TB.testPropertySetTextMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37170);TB.tearDown();
        __CLR4_4_1sjksjklgchos01.R.inc(37171);TB.setUp();
        __CLR4_4_1sjksjklgchos01.R.inc(37172);TB.testPropertyCompareToMilli();
        __CLR4_4_1sjksjklgchos01.R.inc(37173);TB.tearDown();

    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Properties.class);
    }

    public TestLocalDateTime_Properties(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1sjksjklgchos01.R.inc(37174);
        __CLR4_4_1sjksjklgchos01.R.inc(37175);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1sjksjklgchos01.R.inc(37176);zone = DateTimeZone.getDefault();
        __CLR4_4_1sjksjklgchos01.R.inc(37177);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_1sjksjklgchos01.R.inc(37178);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_1sjksjklgchos01.R.inc(37179);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1sjksjklgchos01.R.inc(37180);
        __CLR4_4_1sjksjklgchos01.R.inc(37181);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1sjksjklgchos01.R.inc(37182);DateTimeZone.setDefault(zone);
        __CLR4_4_1sjksjklgchos01.R.inc(37183);zone = null;
        __CLR4_4_1sjksjklgchos01.R.inc(37184);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_1sjksjklgchos01.R.inc(37185);systemDefaultLocale = null;
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqbsoy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqbsoy(){try{__CLR4_4_1sjksjklgchos01.R.inc(37186);
        __CLR4_4_1sjksjklgchos01.R.inc(37187);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37188);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37189);assertEquals("year", test.year().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37190);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37191);assertSame(test, test.year().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37192);assertEquals(1972, test.year().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37193);assertEquals("1972", test.year().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37194);assertEquals("1972", test.year().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37195);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37196);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37197);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37198);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37199);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37200);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37201);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9fspe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9fspe(){try{__CLR4_4_1sjksjklgchos01.R.inc(37202);
        __CLR4_4_1sjksjklgchos01.R.inc(37203);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37204);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37205);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37206);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37207);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpejcispk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpejcispk(){try{__CLR4_4_1sjksjklgchos01.R.inc(37208);
        __CLR4_4_1sjksjklgchos01.R.inc(37209);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37210);LocalDateTime copy = test.year().addToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37211);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37212);check(copy, 1981, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37213);copy = test.year().addToCopy(0);
        __CLR4_4_1sjksjklgchos01.R.inc(37214);check(copy, 1972, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37215);copy = test.year().addToCopy(292278993 - 1972);
        __CLR4_4_1sjksjklgchos01.R.inc(37216);check(copy, 292278993, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37217);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37218);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_1sjksjklgchos01.R.inc(37219);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37220);check(test, 1972, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37221);copy = test.year().addToCopy(-1972);
        __CLR4_4_1sjksjklgchos01.R.inc(37222);check(copy, 0, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37223);copy = test.year().addToCopy(-1973);
        __CLR4_4_1sjksjklgchos01.R.inc(37224);check(copy, -1, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37225);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37226);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_1sjksjklgchos01.R.inc(37227);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37228);check(test, 1972, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osemkqsq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osemkqsq5(){try{__CLR4_4_1sjksjklgchos01.R.inc(37229);
        __CLR4_4_1sjksjklgchos01.R.inc(37230);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37231);LocalDateTime copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37232);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37233);check(copy, 1981, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37234);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_1sjksjklgchos01.R.inc(37235);check(copy, 1972, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37236);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_1sjksjklgchos01.R.inc(37237);check(copy, -292275054, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37238);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_1sjksjklgchos01.R.inc(37239);check(copy, 292278993, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12egg3wsqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12egg3wsqg(){try{__CLR4_4_1sjksjklgchos01.R.inc(37240);
        __CLR4_4_1sjksjklgchos01.R.inc(37241);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37242);LocalDateTime copy = test.year().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37243);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37244);check(copy, 12, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyTextYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwaee7sql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwaee7sql(){try{__CLR4_4_1sjksjklgchos01.R.inc(37245);
        __CLR4_4_1sjksjklgchos01.R.inc(37246);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37247);LocalDateTime copy = test.year().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37248);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37249);check(copy, 12, 6, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToYear() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7absqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7absqq(){try{__CLR4_4_1sjksjklgchos01.R.inc(37250);
        __CLR4_4_1sjksjklgchos01.R.inc(37251);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37252);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37253);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37254);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37255);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37256);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37257);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37258);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37259);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37260);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37261);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37262);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37263);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37264);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37265);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37266);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q20sr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q20sr7(){try{__CLR4_4_1sjksjklgchos01.R.inc(37267);
        __CLR4_4_1sjksjklgchos01.R.inc(37268);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37269);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37270);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37271);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37272);assertSame(test, test.monthOfYear().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37273);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37274);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37275);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37276);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37277);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37278);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37279);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37280);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37281);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37282);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37283);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37284);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37285);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw8srq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw8srq(){try{__CLR4_4_1sjksjklgchos01.R.inc(37286);
        __CLR4_4_1sjksjklgchos01.R.inc(37287);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37288);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37289);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37290);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37291);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdqp25srw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdqp25srw(){try{__CLR4_4_1sjksjklgchos01.R.inc(37292);
        __CLR4_4_1sjksjklgchos01.R.inc(37293);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37294);LocalDateTime copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_1sjksjklgchos01.R.inc(37295);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37296);check(copy, 1972, 12, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37297);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_1sjksjklgchos01.R.inc(37298);check(copy, 1973, 1, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37299);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_1sjksjklgchos01.R.inc(37300);check(copy, 1972, 1, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37301);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_1sjksjklgchos01.R.inc(37302);check(copy, 1971, 12, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37303);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37304);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1sjksjklgchos01.R.inc(37305);check(copy, 1972, 2, 29, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37306);copy = test.monthOfYear().addToCopy(2);
        __CLR4_4_1sjksjklgchos01.R.inc(37307);check(copy, 1972, 3, 31, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37308);copy = test.monthOfYear().addToCopy(3);
        __CLR4_4_1sjksjklgchos01.R.inc(37309);check(copy, 1972, 4, 30, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37310);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37311);copy = test.monthOfYear().addToCopy(1);
        __CLR4_4_1sjksjklgchos01.R.inc(37312);check(copy, 1971, 2, 28, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rt24wvssh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rt24wvssh(){try{__CLR4_4_1sjksjklgchos01.R.inc(37313);
        __CLR4_4_1sjksjklgchos01.R.inc(37314);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37315);LocalDateTime copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_1sjksjklgchos01.R.inc(37316);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37317);check(copy, 1972, 10, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37318);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_1sjksjklgchos01.R.inc(37319);check(copy, 1972, 2, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37320);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_1sjksjklgchos01.R.inc(37321);check(copy, 1972, 10, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37322);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37323);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1sjksjklgchos01.R.inc(37324);check(copy, 1972, 2, 29, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37325);copy = test.monthOfYear().addWrapFieldToCopy(2);
        __CLR4_4_1sjksjklgchos01.R.inc(37326);check(copy, 1972, 3, 31, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37327);copy = test.monthOfYear().addWrapFieldToCopy(3);
        __CLR4_4_1sjksjklgchos01.R.inc(37328);check(copy, 1972, 4, 30, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37329);test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37330);copy = test.monthOfYear().addWrapFieldToCopy(1);
        __CLR4_4_1sjksjklgchos01.R.inc(37331);check(copy, 1971, 2, 28, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1icgsehst0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1icgsehst0(){try{__CLR4_4_1sjksjklgchos01.R.inc(37332);
        __CLR4_4_1sjksjklgchos01.R.inc(37333);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37334);LocalDateTime copy = test.monthOfYear().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37335);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37336);check(copy, 1972, 12, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37337);test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37338);copy = test.monthOfYear().setCopy(2);
        __CLR4_4_1sjksjklgchos01.R.inc(37339);check(copy, 1972, 2, 29, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37340);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37341);test.monthOfYear().setCopy(13);
            __CLR4_4_1sjksjklgchos01.R.inc(37342);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37343);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37344);test.monthOfYear().setCopy(0);
            __CLR4_4_1sjksjklgchos01.R.inc(37345);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyTextMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whgxg6ste();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whgxg6ste(){try{__CLR4_4_1sjksjklgchos01.R.inc(37346);
        __CLR4_4_1sjksjklgchos01.R.inc(37347);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37348);LocalDateTime copy = test.monthOfYear().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37349);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37350);check(copy, 1972, 12, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37351);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_1sjksjklgchos01.R.inc(37352);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37353);check(copy, 1972, 12, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37354);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_1sjksjklgchos01.R.inc(37355);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37356);check(copy, 1972, 12, 9, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wistp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wistp(){try{__CLR4_4_1sjksjklgchos01.R.inc(37357);
        __CLR4_4_1sjksjklgchos01.R.inc(37358);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37359);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37360);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37361);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37362);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37363);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37364);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37365);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37366);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37367);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37368);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37369);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37370);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37371);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37372);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37373);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1akcm7osu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37374,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1akcm7osu6(){try{__CLR4_4_1sjksjklgchos01.R.inc(37374);
        __CLR4_4_1sjksjklgchos01.R.inc(37375);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37376);assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37377);assertEquals("dayOfMonth", test.dayOfMonth().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37378);assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37379);assertSame(test, test.dayOfMonth().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37380);assertEquals(9, test.dayOfMonth().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37381);assertEquals("9", test.dayOfMonth().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37382);assertEquals("9", test.dayOfMonth().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37383);assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37384);assertEquals("9", test.dayOfMonth().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37385);assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37386);assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37387);assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37388);assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37389);assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141l7p8sum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141l7p8sum(){try{__CLR4_4_1sjksjklgchos01.R.inc(37390);
        __CLR4_4_1sjksjklgchos01.R.inc(37391);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37392);assertEquals(1, test.dayOfMonth().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37393);assertEquals(1, test.dayOfMonth().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37394);assertEquals(30, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37395);assertEquals(31, test.dayOfMonth().getMaximumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37396);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37397);assertEquals(31, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37398);test = new LocalDateTime(1972, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37399);assertEquals(29, test.dayOfMonth().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37400);test = new LocalDateTime(1971, 2, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37401);assertEquals(28, test.dayOfMonth().getMaximumValue());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rja0s9suy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rja0s9suy(){try{__CLR4_4_1sjksjklgchos01.R.inc(37402);
        __CLR4_4_1sjksjklgchos01.R.inc(37403);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37404);LocalDateTime copy = test.dayOfMonth().addToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37405);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37406);check(copy, 1972, 6, 18, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37407);copy = test.dayOfMonth().addToCopy(21);
        __CLR4_4_1sjksjklgchos01.R.inc(37408);check(copy, 1972, 6, 30, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37409);copy = test.dayOfMonth().addToCopy(22);
        __CLR4_4_1sjksjklgchos01.R.inc(37410);check(copy, 1972, 7, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37411);copy = test.dayOfMonth().addToCopy(22 + 30);
        __CLR4_4_1sjksjklgchos01.R.inc(37412);check(copy, 1972, 7, 31, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37413);copy = test.dayOfMonth().addToCopy(22 + 31);
        __CLR4_4_1sjksjklgchos01.R.inc(37414);check(copy, 1972, 8, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37415);copy = test.dayOfMonth().addToCopy(21 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1sjksjklgchos01.R.inc(37416);check(copy, 1972, 12, 31, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37417);copy = test.dayOfMonth().addToCopy(22 + 31 + 31 + 30 + 31 + 30 + 31);
        __CLR4_4_1sjksjklgchos01.R.inc(37418);check(copy, 1973, 1, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37419);copy = test.dayOfMonth().addToCopy(-8);
        __CLR4_4_1sjksjklgchos01.R.inc(37420);check(copy, 1972, 6, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37421);copy = test.dayOfMonth().addToCopy(-9);
        __CLR4_4_1sjksjklgchos01.R.inc(37422);check(copy, 1972, 5, 31, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37423);copy = test.dayOfMonth().addToCopy(-8 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1sjksjklgchos01.R.inc(37424);check(copy, 1972, 1, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37425);copy = test.dayOfMonth().addToCopy(-9 - 31 - 30 - 31 - 29 - 31);
        __CLR4_4_1sjksjklgchos01.R.inc(37426);check(copy, 1971, 12, 31, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgbzr1svn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgbzr1svn(){try{__CLR4_4_1sjksjklgchos01.R.inc(37427);
        __CLR4_4_1sjksjklgchos01.R.inc(37428);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37429);LocalDateTime copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1sjksjklgchos01.R.inc(37430);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37431);check(copy, 1972, 6, 30, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37432);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1sjksjklgchos01.R.inc(37433);check(copy, 1972, 6, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37434);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1sjksjklgchos01.R.inc(37435);check(copy, 1972, 6, 27, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37436);test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37437);copy = test.dayOfMonth().addWrapFieldToCopy(21);
        __CLR4_4_1sjksjklgchos01.R.inc(37438);check(copy, 1972, 7, 30, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37439);copy = test.dayOfMonth().addWrapFieldToCopy(22);
        __CLR4_4_1sjksjklgchos01.R.inc(37440);check(copy, 1972, 7, 31, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37441);copy = test.dayOfMonth().addWrapFieldToCopy(23);
        __CLR4_4_1sjksjklgchos01.R.inc(37442);check(copy, 1972, 7, 1, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37443);copy = test.dayOfMonth().addWrapFieldToCopy(-12);
        __CLR4_4_1sjksjklgchos01.R.inc(37444);check(copy, 1972, 7, 28, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b31jxpsw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b31jxpsw5(){try{__CLR4_4_1sjksjklgchos01.R.inc(37445);
        __CLR4_4_1sjksjklgchos01.R.inc(37446);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37447);LocalDateTime copy = test.dayOfMonth().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37448);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37449);check(copy, 1972, 6, 12, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37450);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37451);test.dayOfMonth().setCopy(31);
            __CLR4_4_1sjksjklgchos01.R.inc(37452);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37453);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37454);test.dayOfMonth().setCopy(0);
            __CLR4_4_1sjksjklgchos01.R.inc(37455);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetCopyTextDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty3ke2swg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetCopyTextDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty3ke2swg(){try{__CLR4_4_1sjksjklgchos01.R.inc(37456);
        __CLR4_4_1sjksjklgchos01.R.inc(37457);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37458);LocalDateTime copy = test.dayOfMonth().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37459);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37460);check(copy, 1972, 6, 12, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueDayOfMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2wa9eswl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaximumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2wa9eswl(){try{__CLR4_4_1sjksjklgchos01.R.inc(37461);
        __CLR4_4_1sjksjklgchos01.R.inc(37462);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37463);LocalDateTime copy = test.dayOfMonth().withMaximumValue();
        __CLR4_4_1sjksjklgchos01.R.inc(37464);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37465);check(copy, 1972, 6, 30, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueDayOfMonth() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duofekswq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMinimumValueDayOfMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duofekswq(){try{__CLR4_4_1sjksjklgchos01.R.inc(37466);
        __CLR4_4_1sjksjklgchos01.R.inc(37467);LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37468);LocalDateTime copy = test.dayOfMonth().withMinimumValue();
        __CLR4_4_1sjksjklgchos01.R.inc(37469);check(test, 1972, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37470);check(copy, 1972, 6, 1, 10, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToDay() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lmfreswv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lmfreswv(){try{__CLR4_4_1sjksjklgchos01.R.inc(37471);
        __CLR4_4_1sjksjklgchos01.R.inc(37472);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37473);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37474);assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37475);assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37476);assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37477);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37478);test1.dayOfMonth().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37479);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37480);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37481);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37482);assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37483);assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37484);assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37485);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37486);test1.dayOfMonth().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37487);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyEquals() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0zsxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0zsxc(){try{__CLR4_4_1sjksjklgchos01.R.inc(37488);
        __CLR4_4_1sjksjklgchos01.R.inc(37489);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37490);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37491);LocalDateTime test3 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40, COPTIC_UTC);
        __CLR4_4_1sjksjklgchos01.R.inc(37492);assertEquals(false, test1.dayOfMonth().equals(test1.year()));
        __CLR4_4_1sjksjklgchos01.R.inc(37493);assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear()));
        __CLR4_4_1sjksjklgchos01.R.inc(37494);assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth()));
        __CLR4_4_1sjksjklgchos01.R.inc(37495);assertEquals(false, test1.dayOfMonth().equals(test2.year()));
        __CLR4_4_1sjksjklgchos01.R.inc(37496);assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear()));
        __CLR4_4_1sjksjklgchos01.R.inc(37497);assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth()));

        __CLR4_4_1sjksjklgchos01.R.inc(37498);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_1sjksjklgchos01.R.inc(37499);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_1sjksjklgchos01.R.inc(37500);assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth()));
        __CLR4_4_1sjksjklgchos01.R.inc(37501);assertEquals(false, test1.monthOfYear().equals(test2.year()));
        __CLR4_4_1sjksjklgchos01.R.inc(37502);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_1sjksjklgchos01.R.inc(37503);assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth()));

        __CLR4_4_1sjksjklgchos01.R.inc(37504);assertEquals(false, test1.dayOfMonth().equals(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37505);assertEquals(false, test1.dayOfMonth().equals("any"));

        // chrono
        __CLR4_4_1sjksjklgchos01.R.inc(37506);assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth()));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyHashCode() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s7sxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s7sxv(){try{__CLR4_4_1sjksjklgchos01.R.inc(37507);
        __CLR4_4_1sjksjklgchos01.R.inc(37508);LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37509);LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37510);assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode());
        __CLR4_4_1sjksjklgchos01.R.inc(37511);assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode());
        __CLR4_4_1sjksjklgchos01.R.inc(37512);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_1sjksjklgchos01.R.inc(37513);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mry6kasy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mry6kasy2(){try{__CLR4_4_1sjksjklgchos01.R.inc(37514);
        __CLR4_4_1sjksjklgchos01.R.inc(37515);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37516);assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37517);assertEquals("hourOfDay", test.hourOfDay().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37518);assertEquals("Property[hourOfDay]", test.hourOfDay().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37519);assertSame(test, test.hourOfDay().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37520);assertEquals(10, test.hourOfDay().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37521);assertEquals("10", test.hourOfDay().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37522);assertEquals("10", test.hourOfDay().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37523);assertEquals("10", test.hourOfDay().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37524);assertEquals("10", test.hourOfDay().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37525);assertEquals("10", test.hourOfDay().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37526);assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37527);assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37528);assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37529);assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyRoundHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kobpgysyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyRoundHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kobpgysyi(){try{__CLR4_4_1sjksjklgchos01.R.inc(37530);
        __CLR4_4_1sjksjklgchos01.R.inc(37531);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20);
        __CLR4_4_1sjksjklgchos01.R.inc(37532);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37533);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37534);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37535);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37536);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37537);test = new LocalDateTime(2005, 6, 9, 10, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37538);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37539);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37540);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37541);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37542);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37543);test = new LocalDateTime(2005, 6, 9, 10, 30);
        __CLR4_4_1sjksjklgchos01.R.inc(37544);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37545);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37546);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37547);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37548);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37549);test = new LocalDateTime(2005, 6, 9, 11, 30);
        __CLR4_4_1sjksjklgchos01.R.inc(37550);check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37551);check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37552);check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37553);check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37554);check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xi8wmsz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xi8wmsz7(){try{__CLR4_4_1sjksjklgchos01.R.inc(37555);
        __CLR4_4_1sjksjklgchos01.R.inc(37556);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37557);assertEquals(0, test.hourOfDay().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37558);assertEquals(0, test.hourOfDay().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37559);assertEquals(23, test.hourOfDay().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37560);assertEquals(23, test.hourOfDay().getMaximumValueOverall());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhdwhszd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhdwhszd(){try{__CLR4_4_1sjksjklgchos01.R.inc(37561);
        __CLR4_4_1sjksjklgchos01.R.inc(37562);LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37563);check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37564);check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1je6pijszh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1je6pijszh(){try{__CLR4_4_1sjksjklgchos01.R.inc(37565);
        __CLR4_4_1sjksjklgchos01.R.inc(37566);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37567);LocalDateTime copy = test.hourOfDay().addToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37568);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37569);check(copy, 2005, 6, 9, 19, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37570);copy = test.hourOfDay().addToCopy(0);
        __CLR4_4_1sjksjklgchos01.R.inc(37571);check(copy, 2005, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37572);copy = test.hourOfDay().addToCopy(13);
        __CLR4_4_1sjksjklgchos01.R.inc(37573);check(copy, 2005, 6, 9, 23, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37574);copy = test.hourOfDay().addToCopy(14);
        __CLR4_4_1sjksjklgchos01.R.inc(37575);check(copy, 2005, 6, 10, 0, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37576);copy = test.hourOfDay().addToCopy(-10);
        __CLR4_4_1sjksjklgchos01.R.inc(37577);check(copy, 2005, 6, 9, 0, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37578);copy = test.hourOfDay().addToCopy(-11);
        __CLR4_4_1sjksjklgchos01.R.inc(37579);check(copy, 2005, 6, 8, 23, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i3mgepszw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i3mgepszw(){try{__CLR4_4_1sjksjklgchos01.R.inc(37580);
        __CLR4_4_1sjksjklgchos01.R.inc(37581);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37582);LocalDateTime copy = test.hourOfDay().addWrapFieldToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37583);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37584);check(copy, 2005, 6, 9, 19, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37585);copy = test.hourOfDay().addWrapFieldToCopy(0);
        __CLR4_4_1sjksjklgchos01.R.inc(37586);check(copy, 2005, 6, 9, 10, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37587);copy = test.hourOfDay().addWrapFieldToCopy(18);
        __CLR4_4_1sjksjklgchos01.R.inc(37588);check(copy, 2005, 6, 9, 4, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37589);copy = test.hourOfDay().addWrapFieldToCopy(-15);
        __CLR4_4_1sjksjklgchos01.R.inc(37590);check(copy, 2005, 6, 9, 19, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hyrp2yt07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hyrp2yt07(){try{__CLR4_4_1sjksjklgchos01.R.inc(37591);
        __CLR4_4_1sjksjklgchos01.R.inc(37592);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37593);LocalDateTime copy = test.hourOfDay().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37594);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37595);check(copy, 2005, 6, 9, 12, 20, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37596);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37597);test.hourOfDay().setCopy(24);
            __CLR4_4_1sjksjklgchos01.R.inc(37598);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37599);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37600);test.hourOfDay().setCopy(-1);
            __CLR4_4_1sjksjklgchos01.R.inc(37601);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetTextHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yha19t0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yha19t0i(){try{__CLR4_4_1sjksjklgchos01.R.inc(37602);
        __CLR4_4_1sjksjklgchos01.R.inc(37603);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37604);LocalDateTime copy = test.hourOfDay().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37605);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37606);check(copy, 2005, 6, 9, 12, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaximumValueHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1otnz93t0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaximumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1otnz93t0n(){try{__CLR4_4_1sjksjklgchos01.R.inc(37607);
        __CLR4_4_1sjksjklgchos01.R.inc(37608);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37609);LocalDateTime copy = test.hourOfDay().withMaximumValue();
        __CLR4_4_1sjksjklgchos01.R.inc(37610);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37611);check(copy, 2005, 6, 9, 23, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMinimumValueHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n6uf1ht0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMinimumValueHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n6uf1ht0s(){try{__CLR4_4_1sjksjklgchos01.R.inc(37612);
        __CLR4_4_1sjksjklgchos01.R.inc(37613);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37614);LocalDateTime copy = test.hourOfDay().withMinimumValue();
        __CLR4_4_1sjksjklgchos01.R.inc(37615);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37616);check(copy, 2005, 6, 9, 0, 20, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToHour() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_174ldgct0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToHour",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_174ldgct0x(){try{__CLR4_4_1sjksjklgchos01.R.inc(37617);
        __CLR4_4_1sjksjklgchos01.R.inc(37618);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37619);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37620);assertEquals(true, test1.hourOfDay().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37621);assertEquals(true, test2.hourOfDay().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37622);assertEquals(true, test1.hourOfDay().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37623);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37624);test1.hourOfDay().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37625);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37626);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37627);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37628);assertEquals(true, test1.hourOfDay().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37629);assertEquals(true, test2.hourOfDay().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37630);assertEquals(true, test1.hourOfDay().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37631);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37632);test1.hourOfDay().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37633);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oej7l6t1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oej7l6t1e(){try{__CLR4_4_1sjksjklgchos01.R.inc(37634);
        __CLR4_4_1sjksjklgchos01.R.inc(37635);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37636);assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37637);assertEquals("minuteOfHour", test.minuteOfHour().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37638);assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37639);assertSame(test, test.minuteOfHour().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37640);assertEquals(20, test.minuteOfHour().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37641);assertEquals("20", test.minuteOfHour().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37642);assertEquals("20", test.minuteOfHour().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37643);assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37644);assertEquals("20", test.minuteOfHour().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37645);assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37646);assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37647);assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37648);assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37649);assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110m2u2t1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110m2u2t1u(){try{__CLR4_4_1sjksjklgchos01.R.inc(37650);
        __CLR4_4_1sjksjklgchos01.R.inc(37651);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37652);assertEquals(0, test.minuteOfHour().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37653);assertEquals(0, test.minuteOfHour().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37654);assertEquals(59, test.minuteOfHour().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37655);assertEquals(59, test.minuteOfHour().getMaximumValueOverall());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xepr5bt20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xepr5bt20(){try{__CLR4_4_1sjksjklgchos01.R.inc(37656);
        __CLR4_4_1sjksjklgchos01.R.inc(37657);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37658);check(test.minuteOfHour().withMaximumValue(), 2005, 6, 9, 10, 59, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37659);check(test.minuteOfHour().withMinimumValue(), 2005, 6, 9, 10, 0, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1drttdnt24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1drttdnt24(){try{__CLR4_4_1sjksjklgchos01.R.inc(37660);
        __CLR4_4_1sjksjklgchos01.R.inc(37661);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37662);LocalDateTime copy = test.minuteOfHour().addToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37663);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37664);check(copy, 2005, 6, 9, 10, 29, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37665);copy = test.minuteOfHour().addToCopy(39);
        __CLR4_4_1sjksjklgchos01.R.inc(37666);check(copy, 2005, 6, 9, 10, 59, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37667);copy = test.minuteOfHour().addToCopy(40);
        __CLR4_4_1sjksjklgchos01.R.inc(37668);check(copy, 2005, 6, 9, 11, 0, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37669);copy = test.minuteOfHour().addToCopy(1 * 60 + 45);
        __CLR4_4_1sjksjklgchos01.R.inc(37670);check(copy, 2005, 6, 9, 12, 5, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37671);copy = test.minuteOfHour().addToCopy(13 * 60 + 39);
        __CLR4_4_1sjksjklgchos01.R.inc(37672);check(copy, 2005, 6, 9, 23, 59, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37673);copy = test.minuteOfHour().addToCopy(13 * 60 + 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37674);check(copy, 2005, 6, 10, 0, 0, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37675);copy = test.minuteOfHour().addToCopy(-9);
        __CLR4_4_1sjksjklgchos01.R.inc(37676);check(copy, 2005, 6, 9, 10, 11, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37677);copy = test.minuteOfHour().addToCopy(-19);
        __CLR4_4_1sjksjklgchos01.R.inc(37678);check(copy, 2005, 6, 9, 10, 1, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37679);copy = test.minuteOfHour().addToCopy(-20);
        __CLR4_4_1sjksjklgchos01.R.inc(37680);check(copy, 2005, 6, 9, 10, 0, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37681);copy = test.minuteOfHour().addToCopy(-21);
        __CLR4_4_1sjksjklgchos01.R.inc(37682);check(copy, 2005, 6, 9, 9, 59, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37683);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 20));
        __CLR4_4_1sjksjklgchos01.R.inc(37684);check(copy, 2005, 6, 9, 0, 0, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37685);copy = test.minuteOfHour().addToCopy(-(10 * 60 + 21));
        __CLR4_4_1sjksjklgchos01.R.inc(37686);check(copy, 2005, 6, 8, 23, 59, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zlgzlt2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zlgzlt2v(){try{__CLR4_4_1sjksjklgchos01.R.inc(37687);
        __CLR4_4_1sjksjklgchos01.R.inc(37688);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37689);LocalDateTime copy = test.minuteOfHour().addWrapFieldToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37690);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37691);check(copy, 2005, 6, 9, 10, 29, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37692);copy = test.minuteOfHour().addWrapFieldToCopy(49);
        __CLR4_4_1sjksjklgchos01.R.inc(37693);check(copy, 2005, 6, 9, 10, 9, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37694);copy = test.minuteOfHour().addWrapFieldToCopy(-47);
        __CLR4_4_1sjksjklgchos01.R.inc(37695);check(copy, 2005, 6, 9, 10, 33, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196rp2ut34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196rp2ut34(){try{__CLR4_4_1sjksjklgchos01.R.inc(37696);
        __CLR4_4_1sjksjklgchos01.R.inc(37697);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37698);LocalDateTime copy = test.minuteOfHour().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37699);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37700);check(copy, 2005, 6, 9, 10, 12, 30, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37701);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37702);test.minuteOfHour().setCopy(60);
            __CLR4_4_1sjksjklgchos01.R.inc(37703);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37704);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37705);test.minuteOfHour().setCopy(-1);
            __CLR4_4_1sjksjklgchos01.R.inc(37706);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18h1pnnt3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18h1pnnt3f(){try{__CLR4_4_1sjksjklgchos01.R.inc(37707);
        __CLR4_4_1sjksjklgchos01.R.inc(37708);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37709);LocalDateTime copy = test.minuteOfHour().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37710);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37711);check(copy, 2005, 6, 9, 10, 12, 30, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMinute() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtzyp8t3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToMinute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtzyp8t3k(){try{__CLR4_4_1sjksjklgchos01.R.inc(37712);
        __CLR4_4_1sjksjklgchos01.R.inc(37713);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37714);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37715);assertEquals(true, test1.minuteOfHour().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37716);assertEquals(true, test2.minuteOfHour().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37717);assertEquals(true, test1.minuteOfHour().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37718);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37719);test1.minuteOfHour().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37720);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37721);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37722);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37723);assertEquals(true, test1.minuteOfHour().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37724);assertEquals(true, test2.minuteOfHour().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37725);assertEquals(true, test1.minuteOfHour().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37726);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37727);test1.minuteOfHour().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37728);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetSecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plsrcmt41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plsrcmt41(){try{__CLR4_4_1sjksjklgchos01.R.inc(37729);
        __CLR4_4_1sjksjklgchos01.R.inc(37730);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37731);assertSame(test.getChronology().secondOfMinute(), test.secondOfMinute().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37732);assertEquals("secondOfMinute", test.secondOfMinute().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37733);assertEquals("Property[secondOfMinute]", test.secondOfMinute().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37734);assertSame(test, test.secondOfMinute().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37735);assertEquals(30, test.secondOfMinute().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37736);assertEquals("30", test.secondOfMinute().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37737);assertEquals("30", test.secondOfMinute().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37738);assertEquals("30", test.secondOfMinute().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37739);assertEquals("30", test.secondOfMinute().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37740);assertEquals("30", test.secondOfMinute().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37741);assertEquals(test.getChronology().seconds(), test.secondOfMinute().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37742);assertEquals(test.getChronology().minutes(), test.secondOfMinute().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37743);assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37744);assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesSecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1e5vet4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1e5vet4h(){try{__CLR4_4_1sjksjklgchos01.R.inc(37745);
        __CLR4_4_1sjksjklgchos01.R.inc(37746);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37747);assertEquals(0, test.secondOfMinute().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37748);assertEquals(0, test.secondOfMinute().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37749);assertEquals(59, test.secondOfMinute().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37750);assertEquals(59, test.secondOfMinute().getMaximumValueOverall());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueSecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdxo3zt4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdxo3zt4n(){try{__CLR4_4_1sjksjklgchos01.R.inc(37751);
        __CLR4_4_1sjksjklgchos01.R.inc(37752);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37753);check(test.secondOfMinute().withMaximumValue(), 2005, 6, 9, 10, 20, 59, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37754);check(test.secondOfMinute().withMinimumValue(), 2005, 6, 9, 10, 20, 0, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopySecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178y9npt4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopySecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178y9npt4r(){try{__CLR4_4_1sjksjklgchos01.R.inc(37755);
        __CLR4_4_1sjksjklgchos01.R.inc(37756);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37757);LocalDateTime copy = test.secondOfMinute().addToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37758);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37759);check(copy, 2005, 6, 9, 10, 20, 39, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37760);copy = test.secondOfMinute().addToCopy(29);
        __CLR4_4_1sjksjklgchos01.R.inc(37761);check(copy, 2005, 6, 9, 10, 20, 59, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37762);copy = test.secondOfMinute().addToCopy(30);
        __CLR4_4_1sjksjklgchos01.R.inc(37763);check(copy, 2005, 6, 9, 10, 21, 0, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37764);copy = test.secondOfMinute().addToCopy(39 * 60 + 29);
        __CLR4_4_1sjksjklgchos01.R.inc(37765);check(copy, 2005, 6, 9, 10, 59, 59, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37766);copy = test.secondOfMinute().addToCopy(39 * 60 + 30);
        __CLR4_4_1sjksjklgchos01.R.inc(37767);check(copy, 2005, 6, 9, 11, 0, 0, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37768);copy = test.secondOfMinute().addToCopy(13 * 60 * 60 + 39 * 60 + 30);
        __CLR4_4_1sjksjklgchos01.R.inc(37769);check(copy, 2005, 6, 10, 0, 0, 0, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37770);copy = test.secondOfMinute().addToCopy(-9);
        __CLR4_4_1sjksjklgchos01.R.inc(37771);check(copy, 2005, 6, 9, 10, 20, 21, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37772);copy = test.secondOfMinute().addToCopy(-30);
        __CLR4_4_1sjksjklgchos01.R.inc(37773);check(copy, 2005, 6, 9, 10, 20, 0, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37774);copy = test.secondOfMinute().addToCopy(-31);
        __CLR4_4_1sjksjklgchos01.R.inc(37775);check(copy, 2005, 6, 9, 10, 19, 59, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37776);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 30));
        __CLR4_4_1sjksjklgchos01.R.inc(37777);check(copy, 2005, 6, 9, 0, 0, 0, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37778);copy = test.secondOfMinute().addToCopy(-(10 * 60 * 60 + 20 * 60 + 31));
        __CLR4_4_1sjksjklgchos01.R.inc(37779);check(copy, 2005, 6, 8, 23, 59, 59, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopySecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0dk0xt5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopySecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0dk0xt5g(){try{__CLR4_4_1sjksjklgchos01.R.inc(37780);
        __CLR4_4_1sjksjklgchos01.R.inc(37781);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37782);LocalDateTime copy = test.secondOfMinute().addWrapFieldToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37783);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37784);check(copy, 2005, 6, 9, 10, 20, 39, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37785);copy = test.secondOfMinute().addWrapFieldToCopy(49);
        __CLR4_4_1sjksjklgchos01.R.inc(37786);check(copy, 2005, 6, 9, 10, 20, 19, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37787);copy = test.secondOfMinute().addWrapFieldToCopy(-47);
        __CLR4_4_1sjksjklgchos01.R.inc(37788);check(copy, 2005, 6, 9, 10, 20, 43, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetSecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7js46t5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7js46t5p(){try{__CLR4_4_1sjksjklgchos01.R.inc(37789);
        __CLR4_4_1sjksjklgchos01.R.inc(37790);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37791);LocalDateTime copy = test.secondOfMinute().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37792);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37793);check(copy, 2005, 6, 9, 10, 20, 12, 40);

        __CLR4_4_1sjksjklgchos01.R.inc(37794);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37795);test.secondOfMinute().setCopy(60);
            __CLR4_4_1sjksjklgchos01.R.inc(37796);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37797);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37798);test.secondOfMinute().setCopy(-1);
            __CLR4_4_1sjksjklgchos01.R.inc(37799);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetTextSecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1thtsozt60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1thtsozt60(){try{__CLR4_4_1sjksjklgchos01.R.inc(37800);
        __CLR4_4_1sjksjklgchos01.R.inc(37801);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37802);LocalDateTime copy = test.secondOfMinute().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37803);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37804);check(copy, 2005, 6, 9, 10, 20, 12, 40);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToSecond() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146s4c4t65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToSecond",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146s4c4t65(){try{__CLR4_4_1sjksjklgchos01.R.inc(37805);
        __CLR4_4_1sjksjklgchos01.R.inc(37806);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37807);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37808);assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37809);assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37810);assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37811);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37812);test1.secondOfMinute().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37813);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37814);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37815);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37816);assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37817);assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37818);assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37819);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37820);test1.secondOfMinute().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37821);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15098bt6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15098bt6m(){try{__CLR4_4_1sjksjklgchos01.R.inc(37822);
        __CLR4_4_1sjksjklgchos01.R.inc(37823);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37824);assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField());
        __CLR4_4_1sjksjklgchos01.R.inc(37825);assertEquals("millisOfSecond", test.millisOfSecond().getName());
        __CLR4_4_1sjksjklgchos01.R.inc(37826);assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString());
        __CLR4_4_1sjksjklgchos01.R.inc(37827);assertSame(test, test.millisOfSecond().getLocalDateTime());
        __CLR4_4_1sjksjklgchos01.R.inc(37828);assertEquals(40, test.millisOfSecond().get());
        __CLR4_4_1sjksjklgchos01.R.inc(37829);assertEquals("40", test.millisOfSecond().getAsString());
        __CLR4_4_1sjksjklgchos01.R.inc(37830);assertEquals("40", test.millisOfSecond().getAsText());
        __CLR4_4_1sjksjklgchos01.R.inc(37831);assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37832);assertEquals("40", test.millisOfSecond().getAsShortText());
        __CLR4_4_1sjksjklgchos01.R.inc(37833);assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH));
        __CLR4_4_1sjksjklgchos01.R.inc(37834);assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37835);assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField());
        __CLR4_4_1sjksjklgchos01.R.inc(37836);assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
        __CLR4_4_1sjksjklgchos01.R.inc(37837);assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ob72xht72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyGetMaxMinValuesMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ob72xht72(){try{__CLR4_4_1sjksjklgchos01.R.inc(37838);
        __CLR4_4_1sjksjklgchos01.R.inc(37839);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37840);assertEquals(0, test.millisOfSecond().getMinimumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37841);assertEquals(0, test.millisOfSecond().getMinimumValueOverall());
        __CLR4_4_1sjksjklgchos01.R.inc(37842);assertEquals(999, test.millisOfSecond().getMaximumValue());
        __CLR4_4_1sjksjklgchos01.R.inc(37843);assertEquals(999, test.millisOfSecond().getMaximumValueOverall());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyWithMaxMinValueMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynnm0ut78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyWithMaxMinValueMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynnm0ut78(){try{__CLR4_4_1sjksjklgchos01.R.inc(37844);
        __CLR4_4_1sjksjklgchos01.R.inc(37845);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37846);check(test.millisOfSecond().withMaximumValue(), 2005, 6, 9, 10, 20, 30, 999);
        __CLR4_4_1sjksjklgchos01.R.inc(37847);check(test.millisOfSecond().withMinimumValue(), 2005, 6, 9, 10, 20, 30, 0);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddToCopyMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sv6w3at7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddToCopyMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sv6w3at7c(){try{__CLR4_4_1sjksjklgchos01.R.inc(37848);
        __CLR4_4_1sjksjklgchos01.R.inc(37849);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37850);LocalDateTime copy = test.millisOfSecond().addToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37851);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37852);check(copy, 2005, 6, 9, 10, 20, 30, 49);

        __CLR4_4_1sjksjklgchos01.R.inc(37853);copy = test.millisOfSecond().addToCopy(959);
        __CLR4_4_1sjksjklgchos01.R.inc(37854);check(copy, 2005, 6, 9, 10, 20, 30, 999);

        __CLR4_4_1sjksjklgchos01.R.inc(37855);copy = test.millisOfSecond().addToCopy(960);
        __CLR4_4_1sjksjklgchos01.R.inc(37856);check(copy, 2005, 6, 9, 10, 20, 31, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37857);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959);
        __CLR4_4_1sjksjklgchos01.R.inc(37858);check(copy, 2005, 6, 9, 23, 59, 59, 999);

        __CLR4_4_1sjksjklgchos01.R.inc(37859);copy = test.millisOfSecond().addToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960);
        __CLR4_4_1sjksjklgchos01.R.inc(37860);check(copy, 2005, 6, 10, 0, 0, 0, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37861);copy = test.millisOfSecond().addToCopy(-9);
        __CLR4_4_1sjksjklgchos01.R.inc(37862);check(copy, 2005, 6, 9, 10, 20, 30, 31);

        __CLR4_4_1sjksjklgchos01.R.inc(37863);copy = test.millisOfSecond().addToCopy(-40);
        __CLR4_4_1sjksjklgchos01.R.inc(37864);check(copy, 2005, 6, 9, 10, 20, 30, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37865);copy = test.millisOfSecond().addToCopy(-41);
        __CLR4_4_1sjksjklgchos01.R.inc(37866);check(copy, 2005, 6, 9, 10, 20, 29, 999);

        __CLR4_4_1sjksjklgchos01.R.inc(37867);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40));
        __CLR4_4_1sjksjklgchos01.R.inc(37868);check(copy, 2005, 6, 9, 0, 0, 0, 0);

        __CLR4_4_1sjksjklgchos01.R.inc(37869);copy = test.millisOfSecond().addToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41));
        __CLR4_4_1sjksjklgchos01.R.inc(37870);check(copy, 2005, 6, 8, 23, 59, 59, 999);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldToCopyMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130vo36t7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyAddWrapFieldToCopyMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37871,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130vo36t7z(){try{__CLR4_4_1sjksjklgchos01.R.inc(37871);
        __CLR4_4_1sjksjklgchos01.R.inc(37872);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37873);LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9);
        __CLR4_4_1sjksjklgchos01.R.inc(37874);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37875);check(copy, 2005, 6, 9, 10, 20, 30, 49);

        __CLR4_4_1sjksjklgchos01.R.inc(37876);copy = test.millisOfSecond().addWrapFieldToCopy(995);
        __CLR4_4_1sjksjklgchos01.R.inc(37877);check(copy, 2005, 6, 9, 10, 20, 30, 35);

        __CLR4_4_1sjksjklgchos01.R.inc(37878);copy = test.millisOfSecond().addWrapFieldToCopy(-47);
        __CLR4_4_1sjksjklgchos01.R.inc(37879);check(copy, 2005, 6, 9, 10, 20, 30, 993);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1feqhbtt88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1feqhbtt88(){try{__CLR4_4_1sjksjklgchos01.R.inc(37880);
        __CLR4_4_1sjksjklgchos01.R.inc(37881);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37882);LocalDateTime copy = test.millisOfSecond().setCopy(12);
        __CLR4_4_1sjksjklgchos01.R.inc(37883);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37884);check(copy, 2005, 6, 9, 10, 20, 30, 12);

        __CLR4_4_1sjksjklgchos01.R.inc(37885);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37886);test.millisOfSecond().setCopy(1000);
            __CLR4_4_1sjksjklgchos01.R.inc(37887);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1sjksjklgchos01.R.inc(37888);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37889);test.millisOfSecond().setCopy(-1);
            __CLR4_4_1sjksjklgchos01.R.inc(37890);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyw2ct8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertySetTextMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyw2ct8j(){try{__CLR4_4_1sjksjklgchos01.R.inc(37891);
        __CLR4_4_1sjksjklgchos01.R.inc(37892);LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37893);LocalDateTime copy = test.millisOfSecond().setCopy("12");
        __CLR4_4_1sjksjklgchos01.R.inc(37894);check(test, 2005, 6, 9, 10, 20, 30, 40);
        __CLR4_4_1sjksjklgchos01.R.inc(37895);check(copy, 2005, 6, 9, 10, 20, 30, 12);
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMilli() {__CLR4_4_1sjksjklgchos01.R.globalSliceStart(getClass().getName(),37896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13rds2tt8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1sjksjklgchos01.R.rethrow($CLV_t2$);}finally{__CLR4_4_1sjksjklgchos01.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestLocalDateTime_Properties.testPropertyCompareToMilli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13rds2tt8o(){try{__CLR4_4_1sjksjklgchos01.R.inc(37896);
        __CLR4_4_1sjksjklgchos01.R.inc(37897);LocalDateTime test1 = new LocalDateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37898);LocalDateTime test2 = new LocalDateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37899);assertEquals(true, test1.millisOfSecond().compareTo(test2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37900);assertEquals(true, test2.millisOfSecond().compareTo(test1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37901);assertEquals(true, test1.millisOfSecond().compareTo(test1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37902);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37903);test1.millisOfSecond().compareTo((ReadablePartial) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37904);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1sjksjklgchos01.R.inc(37905);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_1sjksjklgchos01.R.inc(37906);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_1sjksjklgchos01.R.inc(37907);assertEquals(true, test1.millisOfSecond().compareTo(dt2) < 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37908);assertEquals(true, test2.millisOfSecond().compareTo(dt1) > 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37909);assertEquals(true, test1.millisOfSecond().compareTo(dt1) == 0);
        __CLR4_4_1sjksjklgchos01.R.inc(37910);try {
            __CLR4_4_1sjksjklgchos01.R.inc(37911);test1.millisOfSecond().compareTo((ReadableInstant) null);
            __CLR4_4_1sjksjklgchos01.R.inc(37912);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {try{__CLR4_4_1sjksjklgchos01.R.inc(37913);
        __CLR4_4_1sjksjklgchos01.R.inc(37914);assertEquals(year, test.getYear());
        __CLR4_4_1sjksjklgchos01.R.inc(37915);assertEquals(month, test.getMonthOfYear());
        __CLR4_4_1sjksjklgchos01.R.inc(37916);assertEquals(day, test.getDayOfMonth());
        __CLR4_4_1sjksjklgchos01.R.inc(37917);assertEquals(hour, test.getHourOfDay());
        __CLR4_4_1sjksjklgchos01.R.inc(37918);assertEquals(min, test.getMinuteOfHour());
        __CLR4_4_1sjksjklgchos01.R.inc(37919);assertEquals(sec, test.getSecondOfMinute());
        __CLR4_4_1sjksjklgchos01.R.inc(37920);assertEquals(mil, test.getMillisOfSecond());
    }finally{__CLR4_4_1sjksjklgchos01.R.flushNeeded();}}
}
