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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.DateTimeZoneBuilder;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZoneCutover {static class __CLR4_4_1kqhkqhlgchorns{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,28095,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    public static void main(String[] args) throws Exception {try{__CLR4_4_1kqhkqhlgchorns.R.inc(26873);
        __CLR4_4_1kqhkqhlgchorns.R.inc(26874);TestDateTimeZoneCutover TB = new TestDateTimeZoneCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26875);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26876);TB.test_MockGazaIsCorrect();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26877);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26878);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26879);TB.test_getOffsetFromLocal_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26880);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26881);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26882);TB.test_DateTime_roundFloor_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26883);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26884);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26885);TB.test_DateTime_roundCeiling_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26886);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26887);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26888);TB.test_DateTime_setHourZero_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26889);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26890);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26891);TB.test_DateTime_withHourZero_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26892);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26893);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26894);TB.test_DateTime_withDay_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26895);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26896);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26897);TB.test_DateTime_minusHour_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26898);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26899);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26900);TB.test_DateTime_plusHour_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26901);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26902);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26903);TB.test_DateTime_minusDay_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26904);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26905);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26906);TB.test_DateTime_plusDay_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26907);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26908);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26909);TB.test_DateTime_plusDayMidGap_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26910);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26911);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26912);TB.test_DateTime_addWrapFieldDay_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26913);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26914);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26915);TB.test_DateTime_withZoneRetainFields_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26916);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26917);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26918);TB.test_MutableDateTime_withZoneRetainFields_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26919);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26920);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26921);TB.test_LocalDate_new_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26922);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26923);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26924);TB.test_LocalDate_toDateMidnight_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26925);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26926);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26927);TB.test_DateTime_new_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26928);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26929);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26930);TB.test_DateTime_newValid_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26931);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26932);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26933);TB.test_DateTime_parse_Gaza();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26934);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26935);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26936);TB.test_MockTurkIsCorrect();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26937);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26938);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26939);TB.test_getOffsetFromLocal_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26940);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26941);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26942);TB.test_DateTime_roundFloor_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26943);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26944);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26945);TB.test_DateTime_roundFloorNotDST_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26946);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26947);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26948);TB.test_DateTime_roundCeiling_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26949);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26950);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26951);TB.test_DateTime_setHourZero_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26952);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26953);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26954);TB.test_DateTime_withHourZero_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26955);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26956);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26957);TB.test_DateTime_withDay_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26958);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26959);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26960);TB.test_DateTime_minusHour_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26961);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26962);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26963);TB.test_DateTime_plusHour_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26964);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26965);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26966);TB.test_DateTime_minusDay_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26967);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26968);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26969);TB.test_DateTime_plusDay_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26970);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26971);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26972);TB.test_DateTime_plusDayMidGap_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26973);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26974);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26975);TB.test_DateTime_addWrapFieldDay_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26976);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26977);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26978);TB.test_DateTime_withZoneRetainFields_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26979);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26980);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26981);TB.test_MutableDateTime_setZoneRetainFields_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26982);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26983);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26984);TB.test_LocalDate_new_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26985);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26986);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26987);TB.test_LocalDate_toDateMidnight_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26988);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26989);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26990);TB.test_DateTime_new_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26991);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26992);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26993);TB.test_DateTime_newValid_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26994);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26995);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26996);TB.test_DateTime_parse_Turk();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26997);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26998);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(26999);TB.test_NewYorkIsCorrect_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27000);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27001);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27002);TB.test_getOffsetFromLocal_NewYork_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27003);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27004);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27005);TB.test_DateTime_setHourAcross_NewYork_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27006);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27007);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27008);TB.test_DateTime_setHourForward_NewYork_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27009);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27010);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27011);TB.test_DateTime_setHourBack_NewYork_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27012);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27013);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27014);TB.test_DateTime_roundFloor_day_NewYork_Spring_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27015);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27016);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27017);TB.test_DateTime_roundFloor_day_NewYork_Spring_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27018);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27019);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27020);TB.test_DateTime_roundFloor_hour_NewYork_Spring_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27021);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27022);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27023);TB.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27024);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27025);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27026);TB.test_DateTime_roundFloor_minute_NewYork_Spring_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27027);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27028);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27029);TB.test_DateTime_roundFloor_minute_NewYork_Spring_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27030);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27031);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27032);TB.test_DateTime_roundCeiling_day_NewYork_Spring_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27033);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27034);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27035);TB.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27036);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27037);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27038);TB.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27039);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27040);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27041);TB.test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27042);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27043);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27044);TB.test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27045);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27046);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27047);TB.test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27048);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27049);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27050);TB.test_NewYorkIsCorrect_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27051);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27052);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27053);TB.test_getOffsetFromLocal_NewYork_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27054);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27055);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27056);TB.test_DateTime_constructor_NewYork_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27057);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27058);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27059);TB.test_DateTime_plusHour_NewYork_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27060);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27061);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27062);TB.test_DateTime_minusHour_NewYork_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27063);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27064);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27065);TB.test_DateTime_roundFloor_day_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27066);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27067);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27068);TB.test_DateTime_roundFloor_day_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27069);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27070);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27071);TB.test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27072);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27073);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27074);TB.test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27075);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27076);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27077);TB.test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27078);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27079);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27080);TB.test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27081);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27082);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27083);TB.test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27084);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27085);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27086);TB.test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27087);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27088);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27089);TB.test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27090);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27091);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27092);TB.test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27093);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27094);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27095);TB.test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27096);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27097);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27098);TB.test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27099);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27100);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27101);TB.test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27102);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27103);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27104);TB.test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27105);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27106);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27107);TB.test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27108);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27109);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27110);TB.test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27111);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27112);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27113);TB.test_MoscowIsCorrect_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27114);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27115);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27116);TB.test_getOffsetFromLocal_Moscow_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27117);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27118);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27119);TB.test_DateTime_setHourAcross_Moscow_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27120);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27121);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27122);TB.test_DateTime_setHourForward_Moscow_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27123);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27124);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27125);TB.test_DateTime_setHourBack_Moscow_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27126);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27127);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27128);TB.test_MoscowIsCorrect_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27129);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27130);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27131);TB.test_getOffsetFromLocal_Moscow_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27132);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27133);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27134);TB.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27135);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27136);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27137);TB.test_DateTime_constructor_Moscow_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27138);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27139);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27140);TB.test_DateTime_plusHour_Moscow_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27141);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27142);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27143);TB.test_DateTime_minusHour_Moscow_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27144);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27145);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27146);TB.test_GuatemataIsCorrect_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27147);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27148);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27149);TB.test_getOffsetFromLocal_Guatemata_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27150);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27151);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27152);TB.test_DateTime_plusHour_Guatemata_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27153);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27154);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27155);TB.test_DateTime_minusHour_Guatemata_Autumn();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27156);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27157);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27158);TB.test_RioBrancoIsCorrect_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27159);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27160);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27161);TB.test_getOffsetFromLocal_RioBranco_Spring();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27162);TB.tearDown();
        //TB.setUp(); TB.test_DateTime_JustAfterLastEverOverlap(); TB.tearDown(); //Method code too large!
//      TB.setUp(); TB.test_toDateMidnight_SaoPaolo(); TB.tearDown();  // commented in original code
        __CLR4_4_1kqhkqhlgchorns.R.inc(27163);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27164);TB.testWithMinuteOfHourInDstChange_mockZone();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27165);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27166);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27167);TB.testWithHourOfDayInDstChange();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27168);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27169);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27170);TB.testWithMinuteOfHourInDstChange();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27171);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27172);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27173);TB.testWithSecondOfMinuteInDstChange();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27174);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27175);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27176);TB.testWithMillisOfSecondInDstChange_Paris_summer();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27177);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27178);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27179);TB.testWithMillisOfSecondInDstChange_Paris_winter();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27180);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27181);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27182);TB.testWithMillisOfSecondInDstChange_NewYork_summer();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27183);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27184);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27185);TB.testWithMillisOfSecondInDstChange_NewYork_winter();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27186);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27187);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27188);TB.testPlusMinutesInDstChange();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27189);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27190);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27191);TB.testPlusSecondsInDstChange();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27192);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27193);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27194);TB.testPlusMillisInDstChange();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27195);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27196);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27197);TB.testBug2182444_usCentral();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27198);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27199);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27200);TB.testBug2182444_ausNSW();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27201);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27202);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27203);TB.testPeriod();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27204);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27205);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27206);TB.testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27207);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27208);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27209);TB.testBug3192457_adjustOffset();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27210);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27211);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27212);TB.testBug3476684_adjustOffset();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27213);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27214);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27215);TB.testBug3476684_adjustOffset_springGap();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27216);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27217);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27218);TB.testDateTimeCreation_athens();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27219);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27220);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27221);TB.testDateTimeCreation_paris();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27222);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27223);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27224);TB.testDateTimeCreation_london();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27225);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27226);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27227);TB.testDateTimeCreation_newYork();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27228);TB.tearDown();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27229);TB.setUp();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27230);TB.testDateTimeCreation_losAngeles();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27231);TB.tearDown();

    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeZoneCutover.class);
    }

    public TestDateTimeZoneCutover(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1kqhkqhlgchorns.R.inc(27232);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1kqhkqhlgchorns.R.inc(27233);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    // The behaviour of getOffsetFromLocal is defined in its javadoc
    // However, this definition doesn't work for all DateTimeField operations

    /**
     * Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01
     */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    //-----------------------------------------------------------------------
    @Test
    public void test_MockGazaIsCorrect() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qu0asvl0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MockGazaIsCorrect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qu0asvl0i(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27234);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27235);DateTime pre = new DateTime(CUTOVER_GAZA - 1L, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27236);assertEquals("2007-03-31T23:59:59.999+02:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27237);DateTime at = new DateTime(CUTOVER_GAZA, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27238);assertEquals("2007-04-01T01:00:00.000+03:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27239);DateTime post = new DateTime(CUTOVER_GAZA + 1L, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27240);assertEquals("2007-04-01T01:00:00.001+03:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fug3mql0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fug3mql0p(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27241);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27242);doTest_getOffsetFromLocal_Gaza(-1, 23, 0, "2007-03-31T23:00:00.000+02:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27243);doTest_getOffsetFromLocal_Gaza(-1, 23, 30, "2007-03-31T23:30:00.000+02:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27244);doTest_getOffsetFromLocal_Gaza(0, 0, 0, "2007-04-01T01:00:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27245);doTest_getOffsetFromLocal_Gaza(0, 0, 30, "2007-04-01T01:30:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27246);doTest_getOffsetFromLocal_Gaza(0, 1, 0, "2007-04-01T01:00:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27247);doTest_getOffsetFromLocal_Gaza(0, 1, 30, "2007-04-01T01:30:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27248);doTest_getOffsetFromLocal_Gaza(0, 2, 0, "2007-04-01T02:00:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27249);doTest_getOffsetFromLocal_Gaza(0, 3, 0, "2007-04-01T03:00:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27250);doTest_getOffsetFromLocal_Gaza(0, 4, 0, "2007-04-01T04:00:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27251);doTest_getOffsetFromLocal_Gaza(0, 5, 0, "2007-04-01T05:00:00.000+03:00");
        __CLR4_4_1kqhkqhlgchorns.R.inc(27252);doTest_getOffsetFromLocal_Gaza(0, 6, 0, "2007-04-01T06:00:00.000+03:00");
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {try{__CLR4_4_1kqhkqhlgchorns.R.inc(27253);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27254);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27255);int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27256);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27257);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tiiys2l16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tiiys2l16(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27258);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27259);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27260);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27261);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27262);assertEquals("2007-04-01T01:00:00.000+03:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qg0rll1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qg0rll1b(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27263);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27264);DateTime dt = new DateTime(2007, 3, 31, 20, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27265);assertEquals("2007-03-31T20:00:00.000+02:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27266);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27267);assertEquals("2007-04-01T01:00:00.000+03:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourZero_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huptqol1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourZero_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huptqol1g(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27268);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27269);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27270);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27271);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27272);dt.hourOfDay().setCopy(0);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27273);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_withHourZero_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yn44kil1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withHourZero_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yn44kil1m(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27274);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27275);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27276);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27277);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27278);dt.withHourOfDay(0);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27279);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_withDay_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dzvy0l1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dzvy0l1s(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27280);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27281);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27282);assertEquals("2007-04-02T00:00:00.000+03:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27283);DateTime res = dt.withDayOfMonth(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27284);assertEquals("2007-04-01T01:00:00.000+03:00", res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusHour_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gu3aul1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gu3aul1x(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27285);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27286);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27287);assertEquals("2007-04-01T08:00:00.000+03:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27288);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27289);assertEquals("2007-04-01T01:00:00.000+03:00", minus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27290);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27291);assertEquals("2007-03-31T23:00:00.000+02:00", minus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27292);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27293);assertEquals("2007-03-31T22:00:00.000+02:00", minus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusHour_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rexwlul26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rexwlul26(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27294);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27295);DateTime dt = new DateTime(2007, 3, 31, 16, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27296);assertEquals("2007-03-31T16:00:00.000+02:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27297);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27298);assertEquals("2007-03-31T23:00:00.000+02:00", plus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27299);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27300);assertEquals("2007-04-01T01:00:00.000+03:00", plus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27301);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27302);assertEquals("2007-04-01T02:00:00.000+03:00", plus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusDay_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3t9jwl2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3t9jwl2f(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27303);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27304);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27305);assertEquals("2007-04-02T00:00:00.000+03:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27306);DateTime minus1 = dt.minusDays(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27307);assertEquals("2007-04-01T01:00:00.000+03:00", minus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27308);DateTime minus2 = dt.minusDays(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27309);assertEquals("2007-03-31T00:00:00.000+02:00", minus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusDay_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kmfahol2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kmfahol2m(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27310);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27311);DateTime dt = new DateTime(2007, 3, 31, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27312);assertEquals("2007-03-31T00:00:00.000+02:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27313);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27314);assertEquals("2007-04-01T01:00:00.000+03:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27315);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27316);assertEquals("2007-04-02T00:00:00.000+03:00", plus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusDayMidGap_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xlwpgyl2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xlwpgyl2t(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27317);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27318);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27319);assertEquals("2007-03-31T00:30:00.000+02:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27320);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27321);assertEquals("2007-04-01T01:30:00.000+03:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27322);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27323);assertEquals("2007-04-02T00:30:00.000+03:00", plus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_addWrapFieldDay_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gvxwpdl30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_addWrapFieldDay_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gvxwpdl30(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27324);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27325);DateTime dt = new DateTime(2007, 4, 30, 0, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27326);assertEquals("2007-04-30T00:00:00.000+03:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27327);DateTime plus1 = dt.dayOfMonth().addWrapFieldToCopy(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27328);assertEquals("2007-04-01T01:00:00.000+03:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27329);DateTime plus2 = dt.dayOfMonth().addWrapFieldToCopy(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27330);assertEquals("2007-04-02T00:00:00.000+03:00", plus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_withZoneRetainFields_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r8jqhsl37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withZoneRetainFields_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r8jqhsl37(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27331);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27332);DateTime dt = new DateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27333);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27334);DateTime res = dt.withZoneRetainFields(MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27335);assertEquals("2007-04-01T01:00:00.000+03:00", res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_MutableDateTime_withZoneRetainFields_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhs2jwl3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_withZoneRetainFields_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhs2jwl3c(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27336);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27337);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27338);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27339);dt.setZoneRetainFields(MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27340);assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_LocalDate_new_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ig4u4ml3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ig4u4ml3h(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27341);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27342);LocalDate date1 = new LocalDate(CUTOVER_GAZA, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27343);assertEquals("2007-04-01", date1.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27344);LocalDate date2 = new LocalDate(CUTOVER_GAZA - 1, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27345);assertEquals("2007-03-31", date2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_LocalDate_toDateMidnight_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sn7hidl3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sn7hidl3m(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27346);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27347);LocalDate date = new LocalDate(2007, 4, 1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27348);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27349);date.toDateMidnight(MOCK_GAZA);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27350);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27351);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition"));
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_new_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9jc4il3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_new_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9jc4il3s(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27352);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27353);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27354);new DateTime(2007, 4, 1, 0, 0, 0, 0, MOCK_GAZA);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27355);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27356);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_newValid_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z22i18l3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_newValid_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z22i18l3x(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27357);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27358);new DateTime(2007, 3, 31, 19, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27359);new DateTime(2007, 3, 31, 20, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27360);new DateTime(2007, 3, 31, 21, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27361);new DateTime(2007, 3, 31, 22, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27362);new DateTime(2007, 3, 31, 23, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27363);new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27364);new DateTime(2007, 4, 1, 2, 0, 0, 0, MOCK_GAZA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27365);new DateTime(2007, 4, 1, 3, 0, 0, 0, MOCK_GAZA);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_parse_Gaza() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3u3zpl46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Gaza",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3u3zpl46(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27366);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27367);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27368);new DateTime("2007-04-01T00:00", MOCK_GAZA);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27369);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27370);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /**
     * Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01
     */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    @Test
    public void test_MockTurkIsCorrect() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gjm8zul4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MockTurkIsCorrect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gjm8zul4b(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27371);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27372);DateTime pre = new DateTime(CUTOVER_TURK - 1L, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27373);assertEquals("2007-03-31T23:59:59.999-05:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27374);DateTime at = new DateTime(CUTOVER_TURK, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27375);assertEquals("2007-04-01T01:00:00.000-04:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27376);DateTime post = new DateTime(CUTOVER_TURK + 1L, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27377);assertEquals("2007-04-01T01:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qycsedl4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qycsedl4i(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27378);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27379);doTest_getOffsetFromLocal_Turk(-1, 23, 0, "2007-03-31T23:00:00.000-05:00", -5);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27380);doTest_getOffsetFromLocal_Turk(-1, 23, 30, "2007-03-31T23:30:00.000-05:00", -5);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27381);doTest_getOffsetFromLocal_Turk(0, 0, 0, "2007-04-01T01:00:00.000-04:00", -5);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27382);doTest_getOffsetFromLocal_Turk(0, 0, 30, "2007-04-01T01:30:00.000-04:00", -5);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27383);doTest_getOffsetFromLocal_Turk(0, 1, 0, "2007-04-01T01:00:00.000-04:00", -4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27384);doTest_getOffsetFromLocal_Turk(0, 1, 30, "2007-04-01T01:30:00.000-04:00", -4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27385);doTest_getOffsetFromLocal_Turk(0, 2, 0, "2007-04-01T02:00:00.000-04:00", -4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27386);doTest_getOffsetFromLocal_Turk(0, 3, 0, "2007-04-01T03:00:00.000-04:00", -4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27387);doTest_getOffsetFromLocal_Turk(0, 4, 0, "2007-04-01T04:00:00.000-04:00", -4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27388);doTest_getOffsetFromLocal_Turk(0, 5, 0, "2007-04-01T05:00:00.000-04:00", -4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27389);doTest_getOffsetFromLocal_Turk(0, 6, 0, "2007-04-01T06:00:00.000-04:00", -4);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected, int expOffset) {try{__CLR4_4_1kqhkqhlgchorns.R.inc(27390);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27391);DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27392);int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27393);assertEquals(expOffset * 3600000L, offset);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27394);DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27395);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1da9x91l50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1da9x91l50(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27396);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27397);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27398);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27399);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27400);assertEquals("2007-04-01T01:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloorNotDST_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140ic9ll55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloorNotDST_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140ic9ll55(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27401);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27402);DateTime dt = new DateTime(2007, 4, 2, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27403);assertEquals("2007-04-02T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27404);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27405);assertEquals("2007-04-02T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2cv9il5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2cv9il5a(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27406);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27407);DateTime dt = new DateTime(2007, 3, 31, 20, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27408);assertEquals("2007-03-31T20:00:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27409);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27410);assertEquals("2007-04-01T01:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourZero_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy32afl5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourZero_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy32afl5f(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27411);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27412);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27413);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27414);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27415);dt.hourOfDay().setCopy(0);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27416);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_withHourZero_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16esymhl5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withHourZero_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16esymhl5l(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27417);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27418);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27419);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27420);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27421);dt.withHourOfDay(0);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27422);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_withDay_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luba01l5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luba01l5r(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27423);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27424);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27425);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27426);DateTime res = dt.withDayOfMonth(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27427);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusHour_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrh2n7l5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrh2n7l5w(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27428);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27429);DateTime dt = new DateTime(2007, 4, 1, 8, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27430);assertEquals("2007-04-01T08:00:00.000-04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27431);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27432);assertEquals("2007-04-01T01:00:00.000-04:00", minus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27433);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27434);assertEquals("2007-03-31T23:00:00.000-05:00", minus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27435);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27436);assertEquals("2007-03-31T22:00:00.000-05:00", minus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusHour_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fduzf9l65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fduzf9l65(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27437);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27438);DateTime dt = new DateTime(2007, 3, 31, 16, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27439);assertEquals("2007-03-31T16:00:00.000-05:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27440);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27441);assertEquals("2007-03-31T23:00:00.000-05:00", plus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27442);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27443);assertEquals("2007-04-01T01:00:00.000-04:00", plus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27444);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27445);assertEquals("2007-04-01T02:00:00.000-04:00", plus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusDay_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vi3lvl6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vi3lvl6e(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27446);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27447);DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27448);assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27449);DateTime minus1 = dt.minusDays(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27450);assertEquals("2007-04-01T01:00:00.000-04:00", minus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27451);DateTime minus2 = dt.minusDays(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27452);assertEquals("2007-03-31T00:00:00.000-05:00", minus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusDay_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m6dljfl6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m6dljfl6l(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27453);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27454);DateTime dt = new DateTime(2007, 3, 31, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27455);assertEquals("2007-03-31T00:00:00.000-05:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27456);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27457);assertEquals("2007-04-01T01:00:00.000-04:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27458);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27459);assertEquals("2007-04-02T00:00:00.000-04:00", plus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusDayMidGap_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dljixl6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusDayMidGap_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dljixl6s(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27460);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27461);DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27462);assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27463);DateTime plus1 = dt.plusDays(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27464);assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27465);DateTime plus2 = dt.plusDays(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27466);assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_addWrapFieldDay_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pwuzbql6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_addWrapFieldDay_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pwuzbql6z(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27467);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27468);DateTime dt = new DateTime(2007, 4, 30, 0, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27469);assertEquals("2007-04-30T00:00:00.000-04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27470);DateTime plus1 = dt.dayOfMonth().addWrapFieldToCopy(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27471);assertEquals("2007-04-01T01:00:00.000-04:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27472);DateTime plus2 = dt.dayOfMonth().addWrapFieldToCopy(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27473);assertEquals("2007-04-02T00:00:00.000-04:00", plus2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_withZoneRetainFields_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zrfg9l76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_withZoneRetainFields_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zrfg9l76(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27474);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27475);DateTime dt = new DateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27476);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27477);DateTime res = dt.withZoneRetainFields(MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27478);assertEquals("2007-04-01T01:00:00.000-04:00", res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_MutableDateTime_setZoneRetainFields_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sezj5l7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MutableDateTime_setZoneRetainFields_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sezj5l7b(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27479);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27480);MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27481);assertEquals("2007-04-01T00:00:00.000Z", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27482);dt.setZoneRetainFields(MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27483);assertEquals("2007-04-01T01:00:00.000-04:00", dt.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_LocalDate_new_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19s6btfl7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_new_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19s6btfl7g(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27484);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27485);LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27486);assertEquals("2007-04-01", date1.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27487);LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27488);assertEquals("2007-03-31", date2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_LocalDate_toDateMidnight_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewbkcl7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_LocalDate_toDateMidnight_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewbkcl7l(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27489);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27490);LocalDate date = new LocalDate(2007, 4, 1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27491);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27492);date.toDateMidnight(MOCK_TURK);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27493);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27494);assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition"));
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_new_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrttjl7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_new_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrttjl7r(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27495);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27496);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27497);new DateTime(2007, 4, 1, 0, 0, 0, 0, MOCK_TURK);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27498);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27499);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_newValid_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16trc37l7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_newValid_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16trc37l7w(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27500);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27501);new DateTime(2007, 3, 31, 23, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27502);new DateTime(2007, 4, 1, 1, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27503);new DateTime(2007, 4, 1, 2, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27504);new DateTime(2007, 4, 1, 3, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27505);new DateTime(2007, 4, 1, 4, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27506);new DateTime(2007, 4, 1, 5, 0, 0, 0, MOCK_TURK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27507);new DateTime(2007, 4, 1, 6, 0, 0, 0, MOCK_TURK);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_parse_Turk() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4h1ycl84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_parse_Turk",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4h1ycl84(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27508);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27509);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27510);new DateTime("2007-04-01T00:00", MOCK_TURK);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27511);fail();
        } catch (IllegalInstantException ex) {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27512);assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /**
     * America/New_York cutover from 01:59 to 03:00 on 2007-03-11
     */
    private static long CUTOVER_NEW_YORK_SPRING = 1173596400000L;  // 2007-03-11T03:00:00.000-04:00
    private static final DateTimeZone ZONE_NEW_YORK = DateTimeZone.forID("America/New_York");
//  DateTime x = new DateTime(2007, 1, 1, 0, 0, 0, 0, ZONE_NEW_YORK);
//  System.out.println(ZONE_NEW_YORK.nextTransition(x.getMillis()));
//  DateTime y = new DateTime(ZONE_NEW_YORK.nextTransition(x.getMillis()), ZONE_NEW_YORK);
//  System.out.println(y);

    //-----------------------------------------------------------------------
    @Test
    public void test_NewYorkIsCorrect_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k96ml1l89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_NewYorkIsCorrect_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k96ml1l89(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27513);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27514);DateTime pre = new DateTime(CUTOVER_NEW_YORK_SPRING - 1L, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27515);assertEquals("2007-03-11T01:59:59.999-05:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27516);DateTime at = new DateTime(CUTOVER_NEW_YORK_SPRING, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27517);assertEquals("2007-03-11T03:00:00.000-04:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27518);DateTime post = new DateTime(CUTOVER_NEW_YORK_SPRING + 1L, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27519);assertEquals("2007-03-11T03:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_NewYork_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbtr9el8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbtr9el8g(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27520);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27521);doTest_getOffsetFromLocal(3, 11, 1, 0, "2007-03-11T01:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27522);doTest_getOffsetFromLocal(3, 11, 1, 30, "2007-03-11T01:30:00.000-05:00", -5, ZONE_NEW_YORK);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27523);doTest_getOffsetFromLocal(3, 11, 2, 0, "2007-03-11T03:00:00.000-04:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27524);doTest_getOffsetFromLocal(3, 11, 2, 30, "2007-03-11T03:30:00.000-04:00", -5, ZONE_NEW_YORK);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27525);doTest_getOffsetFromLocal(3, 11, 3, 0, "2007-03-11T03:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27526);doTest_getOffsetFromLocal(3, 11, 3, 30, "2007-03-11T03:30:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27527);doTest_getOffsetFromLocal(3, 11, 4, 0, "2007-03-11T04:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27528);doTest_getOffsetFromLocal(3, 11, 5, 0, "2007-03-11T05:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27529);doTest_getOffsetFromLocal(3, 11, 6, 0, "2007-03-11T06:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27530);doTest_getOffsetFromLocal(3, 11, 7, 0, "2007-03-11T07:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27531);doTest_getOffsetFromLocal(3, 11, 8, 0, "2007-03-11T08:00:00.000-04:00", -4, ZONE_NEW_YORK);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourAcross_NewYork_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152jlw5l8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152jlw5l8s(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27532);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27533);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27534);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27535);DateTime res = dt.hourOfDay().setCopy(4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27536);assertEquals("2007-03-11T04:00:00.000-04:00", res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourForward_NewYork_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19efg1fl8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19efg1fl8x(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27537);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27538);DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27539);assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27540);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27541);dt.hourOfDay().setCopy(2);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27542);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourBack_NewYork_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h3azxl93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourBack_NewYork_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h3azxl93(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27543);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27544);DateTime dt = new DateTime(2007, 3, 11, 8, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27545);assertEquals("2007-03-11T08:00:00.000-04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27546);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27547);dt.hourOfDay().setCopy(2);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27548);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_DateTime_roundFloor_day_NewYork_Spring_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxxt73l99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxxt73l99(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27549);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27550);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27551);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27552);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27553);assertEquals("2007-03-11T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_day_NewYork_Spring_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14qqc08l9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14qqc08l9e(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27554);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27555);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27556);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27557);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27558);assertEquals("2007-03-11T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_hour_NewYork_Spring_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0tnvvl9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0tnvvl9j(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27559);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27560);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27561);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27562);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27563);assertEquals("2007-03-11T01:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11syamsl9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hour_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11syamsl9o(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27564);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27565);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27566);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27567);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27568);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_minute_NewYork_Spring_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr92xxl9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minute_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr92xxl9t(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27569);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27570);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27571);assertEquals("2007-03-11T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27572);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27573);assertEquals("2007-03-11T01:30:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_minute_NewYork_Spring_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgegp0l9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minute_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgegp0l9y(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27574);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27575);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27576);assertEquals("2007-03-11T03:30:40.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27577);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27578);assertEquals("2007-03-11T03:30:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_DateTime_roundCeiling_day_NewYork_Spring_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sg8h9cla3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sg8h9cla3(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27579);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27580);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27581);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27582);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27583);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8wlavla8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8wlavla8(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27584);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27585);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27586);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27587);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27588);assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi44smlad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi44smlad(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27589);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27590);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27591);assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27592);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27593);assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pzhmllai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pzhmllai(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27594);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27595);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27596);assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27597);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27598);assertEquals("2007-03-11T04:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfe17ulan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfe17ulan(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27599);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27600);DateTime dt = new DateTime(2007, 3, 11, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27601);assertEquals("2007-03-11T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27602);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27603);assertEquals("2007-03-11T01:31:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ph4p9las();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ph4p9las(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27604);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27605);DateTime dt = new DateTime(2007, 3, 11, 3, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27606);assertEquals("2007-03-11T03:30:40.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27607);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27608);assertEquals("2007-03-11T03:31:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * America/New_York cutover from 01:59 to 01:00 on 2007-11-04
     */
    private static long CUTOVER_NEW_YORK_AUTUMN = 1194156000000L;  // 2007-11-04T01:00:00.000-05:00

    //-----------------------------------------------------------------------
    @Test
    public void test_NewYorkIsCorrect_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199bayqlax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_NewYorkIsCorrect_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199bayqlax(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27609);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27610);DateTime pre = new DateTime(CUTOVER_NEW_YORK_AUTUMN - 1L, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27611);assertEquals("2007-11-04T01:59:59.999-04:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27612);DateTime at = new DateTime(CUTOVER_NEW_YORK_AUTUMN, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27613);assertEquals("2007-11-04T01:00:00.000-05:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27614);DateTime post = new DateTime(CUTOVER_NEW_YORK_AUTUMN + 1L, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27615);assertEquals("2007-11-04T01:00:00.001-05:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_NewYork_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u6sd5zlb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u6sd5zlb4(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27616);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27617);doTest_getOffsetFromLocal(11, 4, 0, 0, "2007-11-04T00:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27618);doTest_getOffsetFromLocal(11, 4, 0, 30, "2007-11-04T00:30:00.000-04:00", -4, ZONE_NEW_YORK);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27619);doTest_getOffsetFromLocal(11, 4, 1, 0, "2007-11-04T01:00:00.000-04:00", -4, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27620);doTest_getOffsetFromLocal(11, 4, 1, 30, "2007-11-04T01:30:00.000-04:00", -4, ZONE_NEW_YORK);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27621);doTest_getOffsetFromLocal(11, 4, 2, 0, "2007-11-04T02:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27622);doTest_getOffsetFromLocal(11, 4, 2, 30, "2007-11-04T02:30:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27623);doTest_getOffsetFromLocal(11, 4, 3, 0, "2007-11-04T03:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27624);doTest_getOffsetFromLocal(11, 4, 3, 30, "2007-11-04T03:30:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27625);doTest_getOffsetFromLocal(11, 4, 4, 0, "2007-11-04T04:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27626);doTest_getOffsetFromLocal(11, 4, 5, 0, "2007-11-04T05:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27627);doTest_getOffsetFromLocal(11, 4, 6, 0, "2007-11-04T06:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27628);doTest_getOffsetFromLocal(11, 4, 7, 0, "2007-11-04T07:00:00.000-05:00", -5, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27629);doTest_getOffsetFromLocal(11, 4, 8, 0, "2007-11-04T08:00:00.000-05:00", -5, ZONE_NEW_YORK);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_constructor_NewYork_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ks9pzlbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_constructor_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ks9pzlbi(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27630);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27631);DateTime dt = new DateTime(2007, 11, 4, 1, 30, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27632);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusHour_NewYork_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mdorblbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mdorblbl(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27633);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27634);DateTime dt = new DateTime(2007, 11, 3, 18, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27635);assertEquals("2007-11-03T18:00:00.000-04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27636);DateTime plus6 = dt.plusHours(6);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27637);assertEquals("2007-11-04T00:00:00.000-04:00", plus6.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27638);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27639);assertEquals("2007-11-04T01:00:00.000-04:00", plus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27640);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27641);assertEquals("2007-11-04T01:00:00.000-05:00", plus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27642);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27643);assertEquals("2007-11-04T02:00:00.000-05:00", plus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusHour_NewYork_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aimrjllbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_NewYork_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aimrjllbw(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27644);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27645);DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27646);assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27647);DateTime minus6 = dt.minusHours(6);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27648);assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27649);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27650);assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27651);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27652);assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27653);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27654);assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_DateTime_roundFloor_day_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0l6yilc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0l6yilc7(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27655);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27656);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27657);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27658);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27659);assertEquals("2007-11-04T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_day_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cb5lcflcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_day_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cb5lcflcc(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27660);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27661);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27662);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27663);DateTime rounded = dt.dayOfMonth().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27664);assertEquals("2007-11-04T00:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhwhmzlch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhwhmzlch(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27665);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27666);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27667);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27668);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27669);assertEquals("2007-11-04T01:00:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yxyeeslcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yxyeeslcm(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27670);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27671);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27672);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27673);DateTime rounded = dt.hourOfDay().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27674);assertEquals("2007-11-04T01:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ce4gr7lcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ce4gr7lcr(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27675);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27676);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27677);assertEquals("2007-11-04T01:30:40.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27678);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27679);assertEquals("2007-11-04T01:30:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eukn3elcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eukn3elcw(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27680);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27681);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27682);assertEquals("2007-11-04T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27683);DateTime rounded = dt.minuteOfHour().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27684);assertEquals("2007-11-04T01:30:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z19nctld1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z19nctld1(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27685);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27686);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27687);assertEquals("2007-11-04T01:30:40.500-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27688);DateTime rounded = dt.secondOfMinute().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27689);assertEquals("2007-11-04T01:30:40.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jmyxyld6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jmyxyld6(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27690);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27691);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27692);assertEquals("2007-11-04T01:30:40.500-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27693);DateTime rounded = dt.secondOfMinute().roundFloorCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27694);assertEquals("2007-11-04T01:30:40.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18dnfftldb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18dnfftldb(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27695);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27696);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27697);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27698);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27699);assertEquals("2007-11-05T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12szc1sldg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12szc1sldg(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27700);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27701);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27702);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27703);DateTime rounded = dt.dayOfMonth().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27704);assertEquals("2007-11-05T00:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ht717oldl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ht717oldl(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27705);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27706);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27707);assertEquals("2007-11-04T01:30:00.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27708);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27709);assertEquals("2007-11-04T01:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2ev51ldq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2ev51ldq(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27710);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27711);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 0, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27712);assertEquals("2007-11-04T01:30:00.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27713);DateTime rounded = dt.hourOfDay().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27714);assertEquals("2007-11-04T02:00:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ad0ricldv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ad0ricldv(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27715);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27716);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27717);assertEquals("2007-11-04T01:30:40.000-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27718);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27719);assertEquals("2007-11-04T01:31:00.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rnbqzle0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rnbqzle0(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27720);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27721);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 0, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27722);assertEquals("2007-11-04T01:30:40.000-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27723);DateTime rounded = dt.minuteOfHour().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27724);assertEquals("2007-11-04T01:31:00.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12e2yesle5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12e2yesle5(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27725);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27726);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27727);assertEquals("2007-11-04T01:30:40.500-04:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27728);DateTime rounded = dt.secondOfMinute().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27729);assertEquals("2007-11-04T01:30:41.000-04:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ou39lea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ou39lea(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27730);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27731);DateTime dt = new DateTime(2007, 11, 4, 1, 30, 40, 500, ZONE_NEW_YORK).plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27732);assertEquals("2007-11-04T01:30:40.500-05:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27733);DateTime rounded = dt.secondOfMinute().roundCeilingCopy();
        __CLR4_4_1kqhkqhlgchorns.R.inc(27734);assertEquals("2007-11-04T01:30:41.000-05:00", rounded.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Europe/Moscow cutover from 01:59 to 03:00 on 2007-03-25
     */
    private static long CUTOVER_MOSCOW_SPRING = 1174777200000L;  // 2007-03-25T03:00:00.000+04:00
    private static final DateTimeZone ZONE_MOSCOW = DateTimeZone.forID("Europe/Moscow");

    //-----------------------------------------------------------------------
    @Test
    public void test_MoscowIsCorrect_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzsxmulef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MoscowIsCorrect_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzsxmulef(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27735);
//      DateTime x = new DateTime(2007, 7, 1, 0, 0, 0, 0, ZONE_MOSCOW);
//      System.out.println(ZONE_MOSCOW.nextTransition(x.getMillis()));
//      DateTime y = new DateTime(ZONE_MOSCOW.nextTransition(x.getMillis()), ZONE_MOSCOW);
//      System.out.println(y);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27736);DateTime pre = new DateTime(CUTOVER_MOSCOW_SPRING - 1L, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27737);assertEquals("2007-03-25T01:59:59.999+03:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27738);DateTime at = new DateTime(CUTOVER_MOSCOW_SPRING, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27739);assertEquals("2007-03-25T03:00:00.000+04:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27740);DateTime post = new DateTime(CUTOVER_MOSCOW_SPRING + 1L, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27741);assertEquals("2007-03-25T03:00:00.001+04:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_Moscow_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vshwhrlem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vshwhrlem(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27742);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27743);doTest_getOffsetFromLocal(3, 25, 1, 0, "2007-03-25T01:00:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27744);doTest_getOffsetFromLocal(3, 25, 1, 30, "2007-03-25T01:30:00.000+03:00", 3, ZONE_MOSCOW);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27745);doTest_getOffsetFromLocal(3, 25, 2, 0, "2007-03-25T03:00:00.000+04:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27746);doTest_getOffsetFromLocal(3, 25, 2, 30, "2007-03-25T03:30:00.000+04:00", 3, ZONE_MOSCOW);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27747);doTest_getOffsetFromLocal(3, 25, 3, 0, "2007-03-25T03:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27748);doTest_getOffsetFromLocal(3, 25, 3, 30, "2007-03-25T03:30:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27749);doTest_getOffsetFromLocal(3, 25, 4, 0, "2007-03-25T04:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27750);doTest_getOffsetFromLocal(3, 25, 5, 0, "2007-03-25T05:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27751);doTest_getOffsetFromLocal(3, 25, 6, 0, "2007-03-25T06:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27752);doTest_getOffsetFromLocal(3, 25, 7, 0, "2007-03-25T07:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27753);doTest_getOffsetFromLocal(3, 25, 8, 0, "2007-03-25T08:00:00.000+04:00", 4, ZONE_MOSCOW);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourAcross_Moscow_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjmcxkley();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourAcross_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjmcxkley(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27754);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27755);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27756);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27757);DateTime res = dt.hourOfDay().setCopy(4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27758);assertEquals("2007-03-25T04:00:00.000+04:00", res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourForward_Moscow_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9i25slf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourForward_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9i25slf3(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27759);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27760);DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27761);assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27762);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27763);dt.hourOfDay().setCopy(2);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27764);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_setHourBack_Moscow_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fr2cwglf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_setHourBack_Moscow_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fr2cwglf9(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27765);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27766);DateTime dt = new DateTime(2007, 3, 25, 8, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27767);assertEquals("2007-03-25T08:00:00.000+04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27768);try {
            __CLR4_4_1kqhkqhlgchorns.R.inc(27769);dt.hourOfDay().setCopy(2);
            __CLR4_4_1kqhkqhlgchorns.R.inc(27770);fail();
        } catch (IllegalFieldValueException ex) {
            // expected
        }
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * America/New_York cutover from 02:59 to 02:00 on 2007-10-28
     */
    private static long CUTOVER_MOSCOW_AUTUMN = 1193526000000L;  // 2007-10-28T02:00:00.000+03:00

    //-----------------------------------------------------------------------
    @Test
    public void test_MoscowIsCorrect_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18it6sjlff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_MoscowIsCorrect_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18it6sjlff(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27771);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27772);DateTime pre = new DateTime(CUTOVER_MOSCOW_AUTUMN - 1L, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27773);assertEquals("2007-10-28T02:59:59.999+04:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27774);DateTime at = new DateTime(CUTOVER_MOSCOW_AUTUMN, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27775);assertEquals("2007-10-28T02:00:00.000+03:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27776);DateTime post = new DateTime(CUTOVER_MOSCOW_AUTUMN + 1L, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27777);assertEquals("2007-10-28T02:00:00.001+03:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_Moscow_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129zyy0lfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129zyy0lfm(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27778);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27779);doTest_getOffsetFromLocal(10, 28, 0, 0, "2007-10-28T00:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27780);doTest_getOffsetFromLocal(10, 28, 0, 30, "2007-10-28T00:30:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27781);doTest_getOffsetFromLocal(10, 28, 1, 0, "2007-10-28T01:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27782);doTest_getOffsetFromLocal(10, 28, 1, 30, "2007-10-28T01:30:00.000+04:00", 4, ZONE_MOSCOW);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27783);doTest_getOffsetFromLocal(10, 28, 2, 0, "2007-10-28T02:00:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27784);doTest_getOffsetFromLocal(10, 28, 2, 30, "2007-10-28T02:30:00.000+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27785);doTest_getOffsetFromLocal(10, 28, 2, 30, 59, 999, "2007-10-28T02:30:59.999+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27786);doTest_getOffsetFromLocal(10, 28, 2, 59, 59, 998, "2007-10-28T02:59:59.998+04:00", 4, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27787);doTest_getOffsetFromLocal(10, 28, 2, 59, 59, 999, "2007-10-28T02:59:59.999+04:00", 4, ZONE_MOSCOW);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27788);doTest_getOffsetFromLocal(10, 28, 3, 0, "2007-10-28T03:00:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27789);doTest_getOffsetFromLocal(10, 28, 3, 30, "2007-10-28T03:30:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27790);doTest_getOffsetFromLocal(10, 28, 4, 0, "2007-10-28T04:00:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27791);doTest_getOffsetFromLocal(10, 28, 5, 0, "2007-10-28T05:00:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27792);doTest_getOffsetFromLocal(10, 28, 6, 0, "2007-10-28T06:00:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27793);doTest_getOffsetFromLocal(10, 28, 7, 0, "2007-10-28T07:00:00.000+03:00", 3, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27794);doTest_getOffsetFromLocal(10, 28, 8, 0, "2007-10-28T08:00:00.000+03:00", 3, ZONE_MOSCOW);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx93cylg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Moscow_Autumn_overlap_mins",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx93cylg3(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27795);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27796);for (int min = 0; (((min < 60)&&(__CLR4_4_1kqhkqhlgchorns.R.iget(27797)!=0|true))||(__CLR4_4_1kqhkqhlgchorns.R.iget(27798)==0&false)); min++) {{
            __CLR4_4_1kqhkqhlgchorns.R.inc(27799);if ((((min < 10)&&(__CLR4_4_1kqhkqhlgchorns.R.iget(27800)!=0|true))||(__CLR4_4_1kqhkqhlgchorns.R.iget(27801)==0&false))) {{
                __CLR4_4_1kqhkqhlgchorns.R.inc(27802);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", 4, ZONE_MOSCOW);
            } }else {{
                __CLR4_4_1kqhkqhlgchorns.R.inc(27803);doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", 4, ZONE_MOSCOW);
            }
        }}
    }}finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_constructor_Moscow_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1176mrelgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_constructor_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1176mrelgc(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27804);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27805);DateTime dt = new DateTime(2007, 10, 28, 2, 30, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27806);assertEquals("2007-10-28T02:30:00.000+04:00", dt.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusHour_Moscow_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmm8c8lgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmm8c8lgf(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27807);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27808);DateTime dt = new DateTime(2007, 10, 27, 19, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27809);assertEquals("2007-10-27T19:00:00.000+04:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27810);DateTime plus6 = dt.plusHours(6);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27811);assertEquals("2007-10-28T01:00:00.000+04:00", plus6.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27812);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27813);assertEquals("2007-10-28T02:00:00.000+04:00", plus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27814);DateTime plus8 = dt.plusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27815);assertEquals("2007-10-28T02:00:00.000+03:00", plus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27816);DateTime plus9 = dt.plusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27817);assertEquals("2007-10-28T03:00:00.000+03:00", plus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusHour_Moscow_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ur2ce8lgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Moscow_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27818,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ur2ce8lgq(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27818);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27819);DateTime dt = new DateTime(2007, 10, 28, 9, 0, 0, 0, ZONE_MOSCOW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27820);assertEquals("2007-10-28T09:00:00.000+03:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27821);DateTime minus6 = dt.minusHours(6);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27822);assertEquals("2007-10-28T03:00:00.000+03:00", minus6.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27823);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27824);assertEquals("2007-10-28T02:00:00.000+03:00", minus7.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27825);DateTime minus8 = dt.minusHours(8);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27826);assertEquals("2007-10-28T02:00:00.000+04:00", minus8.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27827);DateTime minus9 = dt.minusHours(9);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27828);assertEquals("2007-10-28T01:00:00.000+04:00", minus9.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /**
     * America/Guatemala cutover from 23:59 to 23:00 on 2006-09-30
     */
    private static long CUTOVER_GUATEMALA_AUTUMN = 1159678800000L; // 2006-09-30T23:00:00.000-06:00
    private static final DateTimeZone ZONE_GUATEMALA = DateTimeZone.forID("America/Guatemala");

    //-----------------------------------------------------------------------
    @Test
    public void test_GuatemataIsCorrect_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16srrl8lh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_GuatemataIsCorrect_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16srrl8lh1(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27829);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27830);DateTime pre = new DateTime(CUTOVER_GUATEMALA_AUTUMN - 1L, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27831);assertEquals("2006-09-30T23:59:59.999-05:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27832);DateTime at = new DateTime(CUTOVER_GUATEMALA_AUTUMN, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27833);assertEquals("2006-09-30T23:00:00.000-06:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27834);DateTime post = new DateTime(CUTOVER_GUATEMALA_AUTUMN + 1L, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27835);assertEquals("2006-09-30T23:00:00.001-06:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_Guatemata_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdmnfzlh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_Guatemata_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdmnfzlh8(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27836);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27837);doTest_getOffsetFromLocal(2006, 9, 30, 23, 0,
                "2006-09-30T23:00:00.000-05:00", -5, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27838);doTest_getOffsetFromLocal(2006, 9, 30, 23, 30,
                "2006-09-30T23:30:00.000-05:00", -5, ZONE_GUATEMALA);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27839);doTest_getOffsetFromLocal(2006, 9, 30, 23, 0,
                "2006-09-30T23:00:00.000-05:00", -5, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27840);doTest_getOffsetFromLocal(2006, 9, 30, 23, 30,
                "2006-09-30T23:30:00.000-05:00", -5, ZONE_GUATEMALA);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27841);doTest_getOffsetFromLocal(2006, 10, 1, 0, 0,
                "2006-10-01T00:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27842);doTest_getOffsetFromLocal(2006, 10, 1, 0, 30,
                "2006-10-01T00:30:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27843);doTest_getOffsetFromLocal(2006, 10, 1, 1, 0,
                "2006-10-01T01:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27844);doTest_getOffsetFromLocal(2006, 10, 1, 1, 30,
                "2006-10-01T01:30:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27845);doTest_getOffsetFromLocal(2006, 10, 1, 2, 0,
                "2006-10-01T02:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27846);doTest_getOffsetFromLocal(2006, 10, 1, 2, 30,
                "2006-10-01T02:30:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27847);doTest_getOffsetFromLocal(2006, 10, 1, 3, 0,
                "2006-10-01T03:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27848);doTest_getOffsetFromLocal(2006, 10, 1, 3, 30,
                "2006-10-01T03:30:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27849);doTest_getOffsetFromLocal(2006, 10, 1, 4, 0,
                "2006-10-01T04:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27850);doTest_getOffsetFromLocal(2006, 10, 1, 4, 30,
                "2006-10-01T04:30:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27851);doTest_getOffsetFromLocal(2006, 10, 1, 5, 0,
                "2006-10-01T05:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27852);doTest_getOffsetFromLocal(2006, 10, 1, 5, 30,
                "2006-10-01T05:30:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27853);doTest_getOffsetFromLocal(2006, 10, 1, 6, 0,
                "2006-10-01T06:00:00.000-06:00", -6, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27854);doTest_getOffsetFromLocal(2006, 10, 1, 6, 30,
                "2006-10-01T06:30:00.000-06:00", -6, ZONE_GUATEMALA);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_plusHour_Guatemata_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jb0lhdlhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_plusHour_Guatemata_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jb0lhdlhr(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27855);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27856);DateTime dt = new DateTime(2006, 9, 30, 20, 0, 0, 0, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27857);assertEquals("2006-09-30T20:00:00.000-05:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27858);DateTime plus1 = dt.plusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27859);assertEquals("2006-09-30T21:00:00.000-05:00", plus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27860);DateTime plus2 = dt.plusHours(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27861);assertEquals("2006-09-30T22:00:00.000-05:00", plus2.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27862);DateTime plus3 = dt.plusHours(3);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27863);assertEquals("2006-09-30T23:00:00.000-05:00", plus3.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27864);DateTime plus4 = dt.plusHours(4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27865);assertEquals("2006-09-30T23:00:00.000-06:00", plus4.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27866);DateTime plus5 = dt.plusHours(5);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27867);assertEquals("2006-10-01T00:00:00.000-06:00", plus5.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27868);DateTime plus6 = dt.plusHours(6);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27869);assertEquals("2006-10-01T01:00:00.000-06:00", plus6.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27870);DateTime plus7 = dt.plusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27871);assertEquals("2006-10-01T02:00:00.000-06:00", plus7.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_DateTime_minusHour_Guatemata_Autumn() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xh58nli8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_minusHour_Guatemata_Autumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xh58nli8(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27872);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27873);DateTime dt = new DateTime(2006, 10, 1, 2, 0, 0, 0, ZONE_GUATEMALA);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27874);assertEquals("2006-10-01T02:00:00.000-06:00", dt.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27875);DateTime minus1 = dt.minusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27876);assertEquals("2006-10-01T01:00:00.000-06:00", minus1.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27877);DateTime minus2 = dt.minusHours(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27878);assertEquals("2006-10-01T00:00:00.000-06:00", minus2.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27879);DateTime minus3 = dt.minusHours(3);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27880);assertEquals("2006-09-30T23:00:00.000-06:00", minus3.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27881);DateTime minus4 = dt.minusHours(4);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27882);assertEquals("2006-09-30T23:00:00.000-05:00", minus4.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27883);DateTime minus5 = dt.minusHours(5);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27884);assertEquals("2006-09-30T22:00:00.000-05:00", minus5.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27885);DateTime minus6 = dt.minusHours(6);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27886);assertEquals("2006-09-30T21:00:00.000-05:00", minus6.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27887);DateTime minus7 = dt.minusHours(7);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27888);assertEquals("2006-09-30T20:00:00.000-05:00", minus7.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /**
     * America/Rio_Branco gap cutover from 2008-06-23T23:59-05:00 to 2008-06-24T01:00-04:00
     */
    private static long CUTOVER_RIO_BRANCO_AUTUMN = 1214283600000L; // 2008-06-24T01:00:00.000-04:00
    private static final DateTimeZone ZONE_RIO_BRANCO = DateTimeZone.forID("America/Rio_Branco");

    //-----------------------------------------------------------------------
    @Test
    public void test_RioBrancoIsCorrect_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rxvc9llip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_RioBrancoIsCorrect_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rxvc9llip(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27889);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27890);DateTime pre = new DateTime(CUTOVER_RIO_BRANCO_AUTUMN - 1L, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27891);assertEquals("2008-06-23T23:59:59.999-05:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27892);DateTime at = new DateTime(CUTOVER_RIO_BRANCO_AUTUMN, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27893);assertEquals("2008-06-24T01:00:00.000-04:00", at.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27894);DateTime post = new DateTime(CUTOVER_RIO_BRANCO_AUTUMN + 1L, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27895);assertEquals("2008-06-24T01:00:00.001-04:00", post.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void test_getOffsetFromLocal_RioBranco_Spring() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1girnysliw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_getOffsetFromLocal_RioBranco_Spring",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27896,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1girnysliw(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27896);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27897);doTest_getOffsetFromLocal(2008, 6, 23, 23, 0, "2008-06-23T23:00:00.000-05:00", -5, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27898);doTest_getOffsetFromLocal(2008, 6, 23, 23, 30, "2008-06-23T23:30:00.000-05:00", -5, ZONE_RIO_BRANCO);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27899);doTest_getOffsetFromLocal(2008, 6, 24, 0, 0, "2008-06-24T01:00:00.000-04:00", -5, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27900);doTest_getOffsetFromLocal(2008, 6, 24, 0, 30, "2008-06-24T01:30:00.000-04:00", -5, ZONE_RIO_BRANCO);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27901);doTest_getOffsetFromLocal(2008, 6, 24, 1, 0, "2008-06-24T01:00:00.000-04:00", -4, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27902);doTest_getOffsetFromLocal(2008, 6, 24, 1, 30, "2008-06-24T01:30:00.000-04:00", -4, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27903);doTest_getOffsetFromLocal(2008, 6, 24, 2, 0, "2008-06-24T02:00:00.000-04:00", -4, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27904);doTest_getOffsetFromLocal(2008, 6, 24, 2, 30, "2008-06-24T02:30:00.000-04:00", -4, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27905);doTest_getOffsetFromLocal(2008, 6, 24, 5, 0, "2008-06-24T05:00:00.000-04:00", -4, ZONE_RIO_BRANCO);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27906);doTest_getOffsetFromLocal(2008, 6, 24, 5, 30, "2008-06-24T05:30:00.000-04:00", -4, ZONE_RIO_BRANCO);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    //@Test

    public void test_DateTime_JustAfterLastEverOverlap() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpgbhdlj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.test_DateTime_JustAfterLastEverOverlap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27907,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpgbhdlj7(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27907);
        // based on America/Argentina/Catamarca in file 2009s
        __CLR4_4_1kqhkqhlgchorns.R.inc(27908);DateTimeZone zone = new DateTimeZoneBuilder()
                .setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR)
                .addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008,
                        'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR)
                .addRecurringSavings("WINTER", 0, 2000, 2008,
                        'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR)
                .toDateTimeZone("Zone", false);

        __CLR4_4_1kqhkqhlgchorns.R.inc(27909);LocalDate date = new LocalDate(2008, 8, 10);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27910);assertEquals("2008-08-10", date.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27911);DateTime dt = date.toDateTimeAtStartOfDay(zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27912);assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

//    @Test public void test_toDateMidnight_SaoPaolo() {
//        // RFE: 1684259
//        DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
//        LocalDate baseDate = new LocalDate(2006, 11, 5);
//        DateMidnight dm = baseDate.toDateMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dm.toString());
//        DateTime dt = baseDate.toDateTimeAtMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dt.toString());
//    }

    //-----------------------------------------------------------------------
    private static final DateTimeZone ZONE_PARIS = DateTimeZone.forID("Europe/Paris");

    @Test
    public void testWithMinuteOfHourInDstChange_mockZone() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wo7i0dljd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange_mockZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27913,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wo7i0dljd(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27913);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27914);DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30));
        __CLR4_4_1kqhkqhlgchorns.R.inc(27915);assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27916);DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27917);DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27918);assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27919);DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27920);assertEquals("2010-10-31T01:59:00.000+00:30", post.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27921);DateTime testPre1 = pre.withMinuteOfHour(30);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27922);assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString());  // retain offset
        __CLR4_4_1kqhkqhlgchorns.R.inc(27923);DateTime testPre2 = pre.withMinuteOfHour(50);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27924);assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString());

        __CLR4_4_1kqhkqhlgchorns.R.inc(27925);DateTime testPost1 = post.withMinuteOfHour(30);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27926);assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString());  // retain offset
        __CLR4_4_1kqhkqhlgchorns.R.inc(27927);DateTime testPost2 = post.withMinuteOfHour(10);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27928);assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithHourOfDayInDstChange() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lklsiljt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithHourOfDayInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lklsiljt(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27929);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27930);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27931);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27932);DateTime test = dateTime.withHourOfDay(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27933);assertEquals("2010-10-31T02:30:10.123+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithMinuteOfHourInDstChange() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19gkl2oljy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMinuteOfHourInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19gkl2oljy(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27934);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27935);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27936);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27937);DateTime test = dateTime.withMinuteOfHour(0);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27938);assertEquals("2010-10-31T02:00:10.123+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithSecondOfMinuteInDstChange() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjv128lk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithSecondOfMinuteInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjv128lk3(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27939);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27940);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27941);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27942);DateTime test = dateTime.withSecondOfMinute(0);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27943);assertEquals("2010-10-31T02:30:00.123+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithMillisOfSecondInDstChange_Paris_summer() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtl71elk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_Paris_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtl71elk8(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27944);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27945);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27946);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27947);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27948);assertEquals("2010-10-31T02:30:10.000+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithMillisOfSecondInDstChange_Paris_winter() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrge2glkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_Paris_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrge2glkd(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27949);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27950);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+01:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27951);assertEquals("2010-10-31T02:30:10.123+01:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27952);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27953);assertEquals("2010-10-31T02:30:10.000+01:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithMillisOfSecondInDstChange_NewYork_summer() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4pnaalki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_summer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4pnaalki(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27954);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27955);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27956);assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27957);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27958);assertEquals("2007-11-04T01:30:00.000-04:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testWithMillisOfSecondInDstChange_NewYork_winter() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186ug98lkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testWithMillisOfSecondInDstChange_NewYork_winter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186ug98lkn(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27959);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27960);DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-05:00", ZONE_NEW_YORK);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27961);assertEquals("2007-11-04T01:30:00.123-05:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27962);DateTime test = dateTime.withMillisOfSecond(0);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27963);assertEquals("2007-11-04T01:30:00.000-05:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testPlusMinutesInDstChange() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l2nz8clks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMinutesInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l2nz8clks(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27964);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27965);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27966);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27967);DateTime test = dateTime.plusMinutes(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27968);assertEquals("2010-10-31T02:31:10.123+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testPlusSecondsInDstChange() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0pkxwlkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusSecondsInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0pkxwlkx(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27969);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27970);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27971);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27972);DateTime test = dateTime.plusSeconds(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27973);assertEquals("2010-10-31T02:30:11.123+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testPlusMillisInDstChange() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1duj0rpll2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPlusMillisInDstChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1duj0rpll2(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27974);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27975);DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27976);assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27977);DateTime test = dateTime.plusMillis(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27978);assertEquals("2010-10-31T02:30:10.124+02:00", test.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testBug2182444_usCentral() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdt1hkll7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_usCentral",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdt1hkll7(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27979);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27980);Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central"));
        __CLR4_4_1kqhkqhlgchorns.R.inc(27981);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27982);DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27983);DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27984);assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis()));
        __CLR4_4_1kqhkqhlgchorns.R.inc(27985);assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis()));

        __CLR4_4_1kqhkqhlgchorns.R.inc(27986);DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27987);DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27988);assertEquals(1, usCentralStandardInUSCentral.getHourOfDay());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27989);assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27990);assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27991);assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1));
        __CLR4_4_1kqhkqhlgchorns.R.inc(27992);assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(27993);assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1));
        __CLR4_4_1kqhkqhlgchorns.R.inc(27994);assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testBug2182444_ausNSW() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),27995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bhxeolln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug2182444_ausNSW",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),27995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bhxeolln(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(27995);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27996);Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW"));
        __CLR4_4_1kqhkqhlgchorns.R.inc(27997);Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27998);DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(27999);DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28000);assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis()));
        __CLR4_4_1kqhkqhlgchorns.R.inc(28001);assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis()));

        __CLR4_4_1kqhkqhlgchorns.R.inc(28002);DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28003);DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28004);assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28005);assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28006);assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28007);assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2));
        __CLR4_4_1kqhkqhlgchorns.R.inc(28008);assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28009);assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2));
        __CLR4_4_1kqhkqhlgchorns.R.inc(28010);assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testPeriod() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8wo2ilm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testPeriod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8wo2ilm3(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28011);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28012);DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28013);DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28014);Period period = new Period(a, b, PeriodType.standard());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28015);assertEquals("PT1M", period.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ycks1qlm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ycks1qlm8(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28016);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28017);final DateTimeZone fromDTZ = DateTimeZone.forID("Europe/London");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28018);final DateTimeZone toDTZ = DateTimeZone.forID("Europe/Lisbon");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28019);DateTime baseBefore = new DateTime(2007, 10, 28, 1, 15, fromDTZ).minusHours(1);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28020);DateTime baseAfter = new DateTime(2007, 10, 28, 1, 15, fromDTZ);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28021);DateTime testBefore = baseBefore.withZoneRetainFields(toDTZ);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28022);DateTime testAfter = baseAfter.withZoneRetainFields(toDTZ);
        // toString ignores time-zone but includes offset
        __CLR4_4_1kqhkqhlgchorns.R.inc(28023);assertEquals(baseBefore.toString(), testBefore.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28024);assertEquals(baseAfter.toString(), testAfter.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    @Test
    public void testBug3192457_adjustOffset() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5kf05lmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3192457_adjustOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5kf05lmh(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28025);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28026);final DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28027);DateTime base = new DateTime(2007, 10, 28, 3, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28028);DateTime baseBefore = base.minusHours(2);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28029);DateTime baseAfter = base.minusHours(1);

        __CLR4_4_1kqhkqhlgchorns.R.inc(28030);assertSame(base, base.withEarlierOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28031);assertSame(base, base.withLaterOffsetAtOverlap());

        __CLR4_4_1kqhkqhlgchorns.R.inc(28032);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28033);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap());

        __CLR4_4_1kqhkqhlgchorns.R.inc(28034);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28035);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testBug3476684_adjustOffset() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mys6jclms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mys6jclms(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28036);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28037);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28038);DateTime base = new DateTime(2012, 2, 25, 22, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28039);DateTime baseBefore = base.plusHours(1);  // 23:15 (first)
        __CLR4_4_1kqhkqhlgchorns.R.inc(28040);DateTime baseAfter = base.plusHours(2);  // 23:15 (second)

        __CLR4_4_1kqhkqhlgchorns.R.inc(28041);assertSame(base, base.withEarlierOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28042);assertSame(base, base.withLaterOffsetAtOverlap());

        __CLR4_4_1kqhkqhlgchorns.R.inc(28043);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28044);assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap());

        __CLR4_4_1kqhkqhlgchorns.R.inc(28045);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28046);assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testBug3476684_adjustOffset_springGap() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124ldwiln3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testBug3476684_adjustOffset_springGap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124ldwiln3(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28047);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28048);final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28049);DateTime base = new DateTime(2011, 10, 15, 22, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28050);DateTime baseBefore = base.plusHours(1);  // 23:15
        __CLR4_4_1kqhkqhlgchorns.R.inc(28051);DateTime baseAfter = base.plusHours(2);  // 01:15

        __CLR4_4_1kqhkqhlgchorns.R.inc(28052);assertSame(base, base.withEarlierOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28053);assertSame(base, base.withLaterOffsetAtOverlap());

        __CLR4_4_1kqhkqhlgchorns.R.inc(28054);assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28055);assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap());

        __CLR4_4_1kqhkqhlgchorns.R.inc(28056);assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28057);assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    // ensure Summer time picked
    //-----------------------------------------------------------------------
    @Test
    public void testDateTimeCreation_athens() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z9nr9rlne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_athens",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z9nr9rlne(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28058);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28059);DateTimeZone zone = DateTimeZone.forID("Europe/Athens");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28060);DateTime base = new DateTime(2011, 10, 30, 3, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28061);assertEquals("2011-10-30T03:15:00.000+03:00", base.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28062);assertEquals("2011-10-30T03:15:00.000+02:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testDateTimeCreation_paris() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zwc81lnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_paris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zwc81lnj(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28063);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28064);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28065);DateTime base = new DateTime(2011, 10, 30, 2, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28066);assertEquals("2011-10-30T02:15:00.000+02:00", base.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28067);assertEquals("2011-10-30T02:15:00.000+01:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testDateTimeCreation_london() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzakdqlno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_london",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzakdqlno(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28068);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28069);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28070);DateTime base = new DateTime(2011, 10, 30, 1, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28071);assertEquals("2011-10-30T01:15:00.000+01:00", base.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28072);assertEquals("2011-10-30T01:15:00.000Z", base.plusHours(1).toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testDateTimeCreation_newYork() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16d81wdlnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_newYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16d81wdlnt(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28073);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28074);DateTimeZone zone = DateTimeZone.forID("America/New_York");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28075);DateTime base = new DateTime(2010, 11, 7, 1, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28076);assertEquals("2010-11-07T01:15:00.000-04:00", base.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28077);assertEquals("2010-11-07T01:15:00.000-05:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    @Test
    public void testDateTimeCreation_losAngeles() {__CLR4_4_1kqhkqhlgchorns.R.globalSliceStart(getClass().getName(),28078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gyhk9llny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1kqhkqhlgchorns.R.rethrow($CLV_t2$);}finally{__CLR4_4_1kqhkqhlgchorns.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZoneCutover.testDateTimeCreation_losAngeles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),28078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gyhk9llny(){try{__CLR4_4_1kqhkqhlgchorns.R.inc(28078);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28079);DateTimeZone zone = DateTimeZone.forID("America/Los_Angeles");
        __CLR4_4_1kqhkqhlgchorns.R.inc(28080);DateTime base = new DateTime(2010, 11, 7, 1, 15, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28081);assertEquals("2010-11-07T01:15:00.000-07:00", base.toString());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28082);assertEquals("2010-11-07T01:15:00.000-08:00", base.plusHours(1).toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, int expOffset, DateTimeZone zone) {try{__CLR4_4_1kqhkqhlgchorns.R.inc(28083);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28084);doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, expOffset, zone);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, int expOffset, DateTimeZone zone) {try{__CLR4_4_1kqhkqhlgchorns.R.inc(28085);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28086);doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, expOffset, zone);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, int expOffset, DateTimeZone zone) {try{__CLR4_4_1kqhkqhlgchorns.R.inc(28087);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28088);doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, expOffset, zone);
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, int expOffset, DateTimeZone zone) {try{__CLR4_4_1kqhkqhlgchorns.R.inc(28089);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28090);DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28091);int offset = zone.getOffsetFromLocal(dt.getMillis());
        __CLR4_4_1kqhkqhlgchorns.R.inc(28092);assertEquals(expOffset * 3600000L, offset);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28093);DateTime res = new DateTime(dt.getMillis() - offset, zone);
        __CLR4_4_1kqhkqhlgchorns.R.inc(28094);assertEquals(res.toString(), expected, res.toString());
    }finally{__CLR4_4_1kqhkqhlgchorns.R.flushNeeded();}}

}
