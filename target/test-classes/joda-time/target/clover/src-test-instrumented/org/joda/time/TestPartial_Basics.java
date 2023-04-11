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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics {static class __CLR4_4_112k512k5lgchoscq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,50766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;
    private long TEST_TIME2 =
            1L * DateTimeConstants.MILLIS_PER_DAY
                    + 5L * DateTimeConstants.MILLIS_PER_HOUR
                    + 6L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 7L * DateTimeConstants.MILLIS_PER_SECOND
                    + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_112k512k5lgchoscq.R.inc(49973);
        __CLR4_4_112k512k5lgchoscq.R.inc(49974);TestPartial_Basics TB = new TestPartial_Basics();
        __CLR4_4_112k512k5lgchoscq.R.inc(49975);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49976);TB.testGet();
        __CLR4_4_112k512k5lgchoscq.R.inc(49977);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49978);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49979);TB.testSize();
        __CLR4_4_112k512k5lgchoscq.R.inc(49980);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49981);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49982);TB.testGetFieldType();
        __CLR4_4_112k512k5lgchoscq.R.inc(49983);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49984);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49985);TB.testGetFieldTypes();
        __CLR4_4_112k512k5lgchoscq.R.inc(49986);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49987);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49988);TB.testGetField();
        __CLR4_4_112k512k5lgchoscq.R.inc(49989);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49990);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49991);TB.testGetFields();
        __CLR4_4_112k512k5lgchoscq.R.inc(49992);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49993);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49994);TB.testGetValue();
        __CLR4_4_112k512k5lgchoscq.R.inc(49995);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49996);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(49997);TB.testGetValues();
        __CLR4_4_112k512k5lgchoscq.R.inc(49998);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(49999);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50000);TB.testIsSupported();
        __CLR4_4_112k512k5lgchoscq.R.inc(50001);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50002);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50003);TB.testEqualsHashCode();
        __CLR4_4_112k512k5lgchoscq.R.inc(50004);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50005);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50006);TB.testCompareTo();
        __CLR4_4_112k512k5lgchoscq.R.inc(50007);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50008);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50009);TB.testIsEqual_TOD();
        __CLR4_4_112k512k5lgchoscq.R.inc(50010);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50011);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50012);TB.testIsBefore_TOD();
        __CLR4_4_112k512k5lgchoscq.R.inc(50013);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50014);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50015);TB.testIsAfter_TOD();
        __CLR4_4_112k512k5lgchoscq.R.inc(50016);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50017);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50018);TB.testWithChronologyRetainFields_Chrono();
        __CLR4_4_112k512k5lgchoscq.R.inc(50019);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50020);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50021);TB.testWithChronologyRetainFields_sameChrono();
        __CLR4_4_112k512k5lgchoscq.R.inc(50022);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50023);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50024);TB.testWithChronologyRetainFields_nullChrono();
        __CLR4_4_112k512k5lgchoscq.R.inc(50025);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50026);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50027);TB.testWith1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50028);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50029);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50030);TB.testWith2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50031);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50032);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50033);TB.testWith3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50034);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50035);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50036);TB.testWith3a();
        __CLR4_4_112k512k5lgchoscq.R.inc(50037);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50038);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50039);TB.testWith3b();
        __CLR4_4_112k512k5lgchoscq.R.inc(50040);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50041);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50042);TB.testWith3c();
        __CLR4_4_112k512k5lgchoscq.R.inc(50043);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50044);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50045);TB.testWith3d();
        __CLR4_4_112k512k5lgchoscq.R.inc(50046);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50047);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50048);TB.testWith3e();
        __CLR4_4_112k512k5lgchoscq.R.inc(50049);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50050);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50051);TB.testWith3f();
        __CLR4_4_112k512k5lgchoscq.R.inc(50052);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50053);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50054);TB.testWith4();
        __CLR4_4_112k512k5lgchoscq.R.inc(50055);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50056);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50057);TB.testWith_baseHasNoRange();
        __CLR4_4_112k512k5lgchoscq.R.inc(50058);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50059);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50060);TB.testWith_argHasNoRange();
        __CLR4_4_112k512k5lgchoscq.R.inc(50061);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50062);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50063);TB.testWith_baseAndArgHaveNoRange();
        __CLR4_4_112k512k5lgchoscq.R.inc(50064);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50065);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50066);TB.testWithout1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50067);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50068);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50069);TB.testWithout2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50070);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50071);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50072);TB.testWithout3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50073);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50074);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50075);TB.testWithout4();
        __CLR4_4_112k512k5lgchoscq.R.inc(50076);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50077);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50078);TB.testWithout5();
        __CLR4_4_112k512k5lgchoscq.R.inc(50079);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50080);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50081);TB.testWithField1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50082);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50083);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50084);TB.testWithField2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50085);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50086);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50087);TB.testWithField3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50088);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50089);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50090);TB.testWithField4();
        __CLR4_4_112k512k5lgchoscq.R.inc(50091);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50092);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50093);TB.testWithFieldAdded1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50094);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50095);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50096);TB.testWithFieldAdded2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50097);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50098);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50099);TB.testWithFieldAdded3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50100);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50101);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50102);TB.testWithFieldAdded4();
        __CLR4_4_112k512k5lgchoscq.R.inc(50103);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50104);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50105);TB.testWithFieldAdded5();
        __CLR4_4_112k512k5lgchoscq.R.inc(50106);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50107);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50108);TB.testWithFieldAdded6();
        __CLR4_4_112k512k5lgchoscq.R.inc(50109);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50110);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50111);TB.testWithFieldAdded7();
        __CLR4_4_112k512k5lgchoscq.R.inc(50112);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50113);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50114);TB.testWithFieldAdded8();
        __CLR4_4_112k512k5lgchoscq.R.inc(50115);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50116);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50117);TB.testWithFieldAddWrapped1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50118);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50119);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50120);TB.testWithFieldAddWrapped2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50121);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50122);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50123);TB.testWithFieldAddWrapped3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50124);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50125);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50126);TB.testWithFieldAddWrapped4();
        __CLR4_4_112k512k5lgchoscq.R.inc(50127);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50128);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50129);TB.testWithFieldAddWrapped5();
        __CLR4_4_112k512k5lgchoscq.R.inc(50130);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50131);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50132);TB.testWithFieldAddWrapped6();
        __CLR4_4_112k512k5lgchoscq.R.inc(50133);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50134);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50135);TB.testWithFieldAddWrapped7();
        __CLR4_4_112k512k5lgchoscq.R.inc(50136);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50137);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50138);TB.testWithFieldAddWrapped8();
        __CLR4_4_112k512k5lgchoscq.R.inc(50139);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50140);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50141);TB.testPlus_RP();
        __CLR4_4_112k512k5lgchoscq.R.inc(50142);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50143);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50144);TB.testMinus_RP();
        __CLR4_4_112k512k5lgchoscq.R.inc(50145);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50146);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50147);TB.testToDateTime_RI();
        __CLR4_4_112k512k5lgchoscq.R.inc(50148);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50149);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50150);TB.testToDateTime_nullRI();
        __CLR4_4_112k512k5lgchoscq.R.inc(50151);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50152);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50153);TB.testProperty();
        __CLR4_4_112k512k5lgchoscq.R.inc(50154);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50155);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50156);TB.testSerialization();
        __CLR4_4_112k512k5lgchoscq.R.inc(50157);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50158);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50159);TB.testGetFormatter1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50160);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50161);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50162);TB.testGetFormatter2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50163);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50164);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50165);TB.testGetFormatter3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50166);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50167);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50168);TB.testToString1();
        __CLR4_4_112k512k5lgchoscq.R.inc(50169);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50170);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50171);TB.testToString2();
        __CLR4_4_112k512k5lgchoscq.R.inc(50172);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50173);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50174);TB.testToString3();
        __CLR4_4_112k512k5lgchoscq.R.inc(50175);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50176);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50177);TB.testToString4();
        __CLR4_4_112k512k5lgchoscq.R.inc(50178);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50179);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50180);TB.testToString5();
        __CLR4_4_112k512k5lgchoscq.R.inc(50181);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50182);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50183);TB.testToString_String();
        __CLR4_4_112k512k5lgchoscq.R.inc(50184);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50185);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50186);TB.testToString_String_Locale();
        __CLR4_4_112k512k5lgchoscq.R.inc(50187);TB.tearDown();
        __CLR4_4_112k512k5lgchoscq.R.inc(50188);TB.setUp();
        __CLR4_4_112k512k5lgchoscq.R.inc(50189);TB.testToString_DTFormatter();
        __CLR4_4_112k512k5lgchoscq.R.inc(50190);TB.tearDown();

    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPartial_Basics.class);
    }

    public TestPartial_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_112k512k5lgchoscq.R.inc(50191);
        __CLR4_4_112k512k5lgchoscq.R.inc(50192);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_112k512k5lgchoscq.R.inc(50193);zone = DateTimeZone.getDefault();
        __CLR4_4_112k512k5lgchoscq.R.inc(50194);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_112k512k5lgchoscq.R.inc(50195);
        __CLR4_4_112k512k5lgchoscq.R.inc(50196);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_112k512k5lgchoscq.R.inc(50197);DateTimeZone.setDefault(zone);
        __CLR4_4_112k512k5lgchoscq.R.inc(50198);zone = null;
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGet() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3v12qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3v12qf(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50199);
        __CLR4_4_112k512k5lgchoscq.R.inc(50200);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50201);assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50202);assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50203);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50204);test.get(null);
            __CLR4_4_112k512k5lgchoscq.R.inc(50205);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50206);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50207);test.get(DateTimeFieldType.secondOfMinute());
            __CLR4_4_112k512k5lgchoscq.R.inc(50208);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testSize() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx12212qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx12212qp(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50209);
        __CLR4_4_112k512k5lgchoscq.R.inc(50210);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50211);assertEquals(2, test.size());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetFieldType() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z86mv12qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z86mv12qs(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50212);
        __CLR4_4_112k512k5lgchoscq.R.inc(50213);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50214);assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        __CLR4_4_112k512k5lgchoscq.R.inc(50215);assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50216);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50217);test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50218);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50219);test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetFieldTypes() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5ndvu12r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFieldTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5ndvu12r0(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50220);
        __CLR4_4_112k512k5lgchoscq.R.inc(50221);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50222);DateTimeFieldType[] fields = test.getFieldTypes();
        __CLR4_4_112k512k5lgchoscq.R.inc(50223);assertEquals(2, fields.length);
        __CLR4_4_112k512k5lgchoscq.R.inc(50224);assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        __CLR4_4_112k512k5lgchoscq.R.inc(50225);assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        __CLR4_4_112k512k5lgchoscq.R.inc(50226);assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n12r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n12r7(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50227);
        __CLR4_4_112k512k5lgchoscq.R.inc(50228);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50229);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0));
        __CLR4_4_112k512k5lgchoscq.R.inc(50230);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50231);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50232);test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50233);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50234);test.getField(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetFields() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmeas12rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmeas12rf(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50235);
        __CLR4_4_112k512k5lgchoscq.R.inc(50236);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50237);DateTimeField[] fields = test.getFields();
        __CLR4_4_112k512k5lgchoscq.R.inc(50238);assertEquals(2, fields.length);
        __CLR4_4_112k512k5lgchoscq.R.inc(50239);assertSame(CopticChronology.getInstanceUTC().hourOfDay(), fields[0]);
        __CLR4_4_112k512k5lgchoscq.R.inc(50240);assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), fields[1]);
        __CLR4_4_112k512k5lgchoscq.R.inc(50241);assertNotSame(test.getFields(), test.getFields());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetValue() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcksmk12rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcksmk12rm(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50242);
        __CLR4_4_112k512k5lgchoscq.R.inc(50243);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50244);assertEquals(10, test.getValue(0));
        __CLR4_4_112k512k5lgchoscq.R.inc(50245);assertEquals(20, test.getValue(1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50246);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50247);test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50248);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50249);test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel12ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel12ru(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50250);
        __CLR4_4_112k512k5lgchoscq.R.inc(50251);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50252);int[] values = test.getValues();
        __CLR4_4_112k512k5lgchoscq.R.inc(50253);assertEquals(2, values.length);
        __CLR4_4_112k512k5lgchoscq.R.inc(50254);assertEquals(10, values[0]);
        __CLR4_4_112k512k5lgchoscq.R.inc(50255);assertEquals(20, values[1]);
        __CLR4_4_112k512k5lgchoscq.R.inc(50256);assertNotSame(test.getValues(), test.getValues());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testIsSupported() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hma24n12s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsSupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hma24n12s1(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50257);
        __CLR4_4_112k512k5lgchoscq.R.inc(50258);Partial test = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50259);assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50260);assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50261);assertEquals(false, test.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50262);assertEquals(false, test.isSupported(DateTimeFieldType.millisOfSecond()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50263);assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testEqualsHashCode() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in7712s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in7712s8(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50264);
        __CLR4_4_112k512k5lgchoscq.R.inc(50265);Partial test1 = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50266);Partial test2 = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50267);assertEquals(true, test1.equals(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50268);assertEquals(true, test2.equals(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50269);assertEquals(true, test1.equals(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50270);assertEquals(true, test2.equals(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50271);assertEquals(true, test1.hashCode() == test2.hashCode());
        __CLR4_4_112k512k5lgchoscq.R.inc(50272);assertEquals(true, test1.hashCode() == test1.hashCode());
        __CLR4_4_112k512k5lgchoscq.R.inc(50273);assertEquals(true, test2.hashCode() == test2.hashCode());

        __CLR4_4_112k512k5lgchoscq.R.inc(50274);Partial test3 = createHourMinPartial2(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50275);assertEquals(false, test1.equals(test3));
        __CLR4_4_112k512k5lgchoscq.R.inc(50276);assertEquals(false, test2.equals(test3));
        __CLR4_4_112k512k5lgchoscq.R.inc(50277);assertEquals(false, test3.equals(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50278);assertEquals(false, test3.equals(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50279);assertEquals(false, test1.hashCode() == test3.hashCode());
        __CLR4_4_112k512k5lgchoscq.R.inc(50280);assertEquals(false, test2.hashCode() == test3.hashCode());

        __CLR4_4_112k512k5lgchoscq.R.inc(50281);assertEquals(false, test1.equals("Hello"));
        __CLR4_4_112k512k5lgchoscq.R.inc(50282);assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
        __CLR4_4_112k512k5lgchoscq.R.inc(50283);assertEquals(new TimeOfDay(10, 20, 30, 40), createTODPartial(ISO_UTC));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz6vfv12ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testCompareTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz6vfv12ss(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50284);
        __CLR4_4_112k512k5lgchoscq.R.inc(50285);Partial test1 = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50286);Partial test1a = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50287);assertEquals(0, test1.compareTo(test1a));
        __CLR4_4_112k512k5lgchoscq.R.inc(50288);assertEquals(0, test1a.compareTo(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50289);assertEquals(0, test1.compareTo(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50290);assertEquals(0, test1a.compareTo(test1a));

        __CLR4_4_112k512k5lgchoscq.R.inc(50291);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50292);assertEquals(-1, test1.compareTo(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50293);assertEquals(+1, test2.compareTo(test1));

        __CLR4_4_112k512k5lgchoscq.R.inc(50294);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50295);assertEquals(-1, test1.compareTo(test3));
        __CLR4_4_112k512k5lgchoscq.R.inc(50296);assertEquals(+1, test3.compareTo(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50297);assertEquals(0, test3.compareTo(test2));

        __CLR4_4_112k512k5lgchoscq.R.inc(50298);assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC)));

        __CLR4_4_112k512k5lgchoscq.R.inc(50299);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50300);test1.compareTo(null);
            __CLR4_4_112k512k5lgchoscq.R.inc(50301);fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        __CLR4_4_112k512k5lgchoscq.R.inc(50302);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50303);test1.compareTo(new YearMonthDay());
            __CLR4_4_112k512k5lgchoscq.R.inc(50304);fail();
        } catch (ClassCastException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50305);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50306);createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay());
            __CLR4_4_112k512k5lgchoscq.R.inc(50307);fail();
        } catch (ClassCastException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_TOD() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq9sq112tg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsEqual_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq9sq112tg(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50308);
        __CLR4_4_112k512k5lgchoscq.R.inc(50309);Partial test1 = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50310);Partial test1a = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50311);assertEquals(true, test1.isEqual(test1a));
        __CLR4_4_112k512k5lgchoscq.R.inc(50312);assertEquals(true, test1a.isEqual(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50313);assertEquals(true, test1.isEqual(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50314);assertEquals(true, test1a.isEqual(test1a));

        __CLR4_4_112k512k5lgchoscq.R.inc(50315);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50316);assertEquals(false, test1.isEqual(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50317);assertEquals(false, test2.isEqual(test1));

        __CLR4_4_112k512k5lgchoscq.R.inc(50318);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50319);assertEquals(false, test1.isEqual(test3));
        __CLR4_4_112k512k5lgchoscq.R.inc(50320);assertEquals(false, test3.isEqual(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50321);assertEquals(true, test3.isEqual(test2));

        __CLR4_4_112k512k5lgchoscq.R.inc(50322);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50323);createHourMinPartial().isEqual(null);
            __CLR4_4_112k512k5lgchoscq.R.inc(50324);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_TOD() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqti8c12tx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsBefore_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqti8c12tx(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50325);
        __CLR4_4_112k512k5lgchoscq.R.inc(50326);Partial test1 = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50327);Partial test1a = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50328);assertEquals(false, test1.isBefore(test1a));
        __CLR4_4_112k512k5lgchoscq.R.inc(50329);assertEquals(false, test1a.isBefore(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50330);assertEquals(false, test1.isBefore(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50331);assertEquals(false, test1a.isBefore(test1a));

        __CLR4_4_112k512k5lgchoscq.R.inc(50332);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50333);assertEquals(true, test1.isBefore(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50334);assertEquals(false, test2.isBefore(test1));

        __CLR4_4_112k512k5lgchoscq.R.inc(50335);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50336);assertEquals(true, test1.isBefore(test3));
        __CLR4_4_112k512k5lgchoscq.R.inc(50337);assertEquals(false, test3.isBefore(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50338);assertEquals(false, test3.isBefore(test2));

        __CLR4_4_112k512k5lgchoscq.R.inc(50339);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50340);createHourMinPartial().isBefore(null);
            __CLR4_4_112k512k5lgchoscq.R.inc(50341);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_TOD() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113pdbj12ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testIsAfter_TOD",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113pdbj12ue(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50342);
        __CLR4_4_112k512k5lgchoscq.R.inc(50343);Partial test1 = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50344);Partial test1a = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50345);assertEquals(false, test1.isAfter(test1a));
        __CLR4_4_112k512k5lgchoscq.R.inc(50346);assertEquals(false, test1a.isAfter(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50347);assertEquals(false, test1.isAfter(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50348);assertEquals(false, test1a.isAfter(test1a));

        __CLR4_4_112k512k5lgchoscq.R.inc(50349);Partial test2 = createHourMinPartial2(ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50350);assertEquals(false, test1.isAfter(test2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50351);assertEquals(true, test2.isAfter(test1));

        __CLR4_4_112k512k5lgchoscq.R.inc(50352);Partial test3 = createHourMinPartial2(COPTIC_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50353);assertEquals(false, test1.isAfter(test3));
        __CLR4_4_112k512k5lgchoscq.R.inc(50354);assertEquals(true, test3.isAfter(test1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50355);assertEquals(false, test3.isAfter(test2));

        __CLR4_4_112k512k5lgchoscq.R.inc(50356);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50357);createHourMinPartial().isAfter(null);
            __CLR4_4_112k512k5lgchoscq.R.inc(50358);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronologyRetainFields_Chrono() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143gerp12uv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143gerp12uv(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50359);
        __CLR4_4_112k512k5lgchoscq.R.inc(50360);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50361);Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        __CLR4_4_112k512k5lgchoscq.R.inc(50362);check(base, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50363);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_112k512k5lgchoscq.R.inc(50364);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50365);assertEquals(BUDDHIST_UTC, test.getChronology());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_sameChrono() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15b1wdb12v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_sameChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15b1wdb12v2(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50366);
        __CLR4_4_112k512k5lgchoscq.R.inc(50367);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50368);Partial test = base.withChronologyRetainFields(COPTIC_TOKYO);
        __CLR4_4_112k512k5lgchoscq.R.inc(50369);assertSame(base, test);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithChronologyRetainFields_nullChrono() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0ft9a12v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithChronologyRetainFields_nullChrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0ft9a12v6(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50370);
        __CLR4_4_112k512k5lgchoscq.R.inc(50371);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50372);Partial test = base.withChronologyRetainFields(null);
        __CLR4_4_112k512k5lgchoscq.R.inc(50373);check(base, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50374);assertEquals(COPTIC_UTC, base.getChronology());
        __CLR4_4_112k512k5lgchoscq.R.inc(50375);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50376);assertEquals(ISO_UTC, test.getChronology());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWith1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1513sbk12vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1513sbk12vd(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50377);
        __CLR4_4_112k512k5lgchoscq.R.inc(50378);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50379);Partial result = test.with(DateTimeFieldType.hourOfDay(), 15);
        __CLR4_4_112k512k5lgchoscq.R.inc(50380);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50381);check(result, 15, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11s3tj312vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11s3tj312vi(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50382);
        __CLR4_4_112k512k5lgchoscq.R.inc(50383);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50384);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50385);test.with(null, 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50386);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50387);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gw59e12vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gw59e12vo(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50388);
        __CLR4_4_112k512k5lgchoscq.R.inc(50389);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50390);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50391);test.with(DateTimeFieldType.clockhourOfDay(), 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50392);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50393);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3a() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rzr0y512vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3a",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rzr0y512vu(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50394);
        __CLR4_4_112k512k5lgchoscq.R.inc(50395);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50396);Partial result = test.with(DateTimeFieldType.secondOfMinute(), 15);
        __CLR4_4_112k512k5lgchoscq.R.inc(50397);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50398);assertEquals(3, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50399);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50400);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50401);assertEquals(true, result.isSupported(DateTimeFieldType.secondOfMinute()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50402);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        __CLR4_4_112k512k5lgchoscq.R.inc(50403);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50404);assertEquals(DateTimeFieldType.secondOfMinute(), result.getFieldType(2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50405);assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50406);assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50407);assertEquals(15, result.get(DateTimeFieldType.secondOfMinute()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3b() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8qzqm12w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3b",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8qzqm12w8(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50408);
        __CLR4_4_112k512k5lgchoscq.R.inc(50409);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50410);Partial result = test.with(DateTimeFieldType.minuteOfDay(), 15);
        __CLR4_4_112k512k5lgchoscq.R.inc(50411);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50412);assertEquals(3, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50413);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50414);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50415);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50416);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        __CLR4_4_112k512k5lgchoscq.R.inc(50417);assertEquals(DateTimeFieldType.minuteOfDay(), result.getFieldType(1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50418);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50419);assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50420);assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50421);assertEquals(15, result.get(DateTimeFieldType.minuteOfDay()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3c() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhqyj312wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3c",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhqyj312wm(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50422);
        __CLR4_4_112k512k5lgchoscq.R.inc(50423);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50424);Partial result = test.with(DateTimeFieldType.dayOfMonth(), 15);
        __CLR4_4_112k512k5lgchoscq.R.inc(50425);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50426);assertEquals(3, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50427);assertEquals(true, result.isSupported(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50428);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50429);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50430);assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(0));
        __CLR4_4_112k512k5lgchoscq.R.inc(50431);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50432);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(2));
        __CLR4_4_112k512k5lgchoscq.R.inc(50433);assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50434);assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50435);assertEquals(15, result.get(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3d() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xad4nk12x0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3d",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xad4nk12x0(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50436);
        __CLR4_4_112k512k5lgchoscq.R.inc(50437);Partial test = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_112k512k5lgchoscq.R.inc(50438);Partial result = test.with(DateTimeFieldType.monthOfYear(), 6);
        __CLR4_4_112k512k5lgchoscq.R.inc(50439);assertEquals(2, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50440);assertEquals(2005, result.get(DateTimeFieldType.year()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50441);assertEquals(6, result.get(DateTimeFieldType.monthOfYear()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3e() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1d5v312x6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3e",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1d5v312x6(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50442);
        __CLR4_4_112k512k5lgchoscq.R.inc(50443);Partial test = new Partial(DateTimeFieldType.era(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50444);Partial result = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50445);assertEquals(2, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50446);assertEquals(1, result.get(DateTimeFieldType.era()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50447);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50448);assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50449);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith3f() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qsd72m12xe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith3f",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qsd72m12xe(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50450);
        __CLR4_4_112k512k5lgchoscq.R.inc(50451);Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50452);Partial result = test.with(DateTimeFieldType.era(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50453);assertEquals(2, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50454);assertEquals(1, result.get(DateTimeFieldType.era()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50455);assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50456);assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50457);assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith4() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pw41v12xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pw41v12xm(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50458);
        __CLR4_4_112k512k5lgchoscq.R.inc(50459);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50460);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_112k512k5lgchoscq.R.inc(50461);assertSame(test, result);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith_baseHasNoRange() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ctt4tb12xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_baseHasNoRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ctt4tb12xq(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50462);
        __CLR4_4_112k512k5lgchoscq.R.inc(50463);Partial test = new Partial(DateTimeFieldType.year(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50464);Partial result = test.with(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_112k512k5lgchoscq.R.inc(50465);assertEquals(2, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50466);assertEquals(0, result.indexOf(DateTimeFieldType.year()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50467);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith_argHasNoRange() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rdvwd412xw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_argHasNoRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rdvwd412xw(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50468);
        __CLR4_4_112k512k5lgchoscq.R.inc(50469);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50470);Partial result = test.with(DateTimeFieldType.year(), 10);
        __CLR4_4_112k512k5lgchoscq.R.inc(50471);assertEquals(2, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50472);assertEquals(0, result.indexOf(DateTimeFieldType.year()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50473);assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWith_baseAndArgHaveNoRange() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ol1qh012y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWith_baseAndArgHaveNoRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ol1qh012y2(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50474);
        __CLR4_4_112k512k5lgchoscq.R.inc(50475);Partial test = new Partial(DateTimeFieldType.year(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50476);Partial result = test.with(DateTimeFieldType.era(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50477);assertEquals(2, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50478);assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50479);assertEquals(1, result.indexOf(DateTimeFieldType.year()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithout1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14z8zya12y8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14z8zya12y8(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50480);
        __CLR4_4_112k512k5lgchoscq.R.inc(50481);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50482);Partial result = test.without(DateTimeFieldType.year());
        __CLR4_4_112k512k5lgchoscq.R.inc(50483);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50484);check(result, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithout2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1888yqr12yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1888yqr12yd(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50485);
        __CLR4_4_112k512k5lgchoscq.R.inc(50486);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50487);Partial result = test.without((DateTimeFieldType) null);
        __CLR4_4_112k512k5lgchoscq.R.inc(50488);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50489);check(result, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithout3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bh8xj812yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bh8xj812yi(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50490);
        __CLR4_4_112k512k5lgchoscq.R.inc(50491);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50492);Partial result = test.without(DateTimeFieldType.hourOfDay());
        __CLR4_4_112k512k5lgchoscq.R.inc(50493);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50494);assertEquals(1, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50495);assertEquals(false, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50496);assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50497);assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(0));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithout4() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eq8wbp12yq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eq8wbp12yq(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50498);
        __CLR4_4_112k512k5lgchoscq.R.inc(50499);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50500);Partial result = test.without(DateTimeFieldType.minuteOfHour());
        __CLR4_4_112k512k5lgchoscq.R.inc(50501);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50502);assertEquals(1, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50503);assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50504);assertEquals(false, result.isSupported(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50505);assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithout5() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz8v4612yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithout5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz8v4612yy(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50506);
        __CLR4_4_112k512k5lgchoscq.R.inc(50507);Partial test = new Partial(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_112k512k5lgchoscq.R.inc(50508);Partial result = test.without(DateTimeFieldType.hourOfDay());
        __CLR4_4_112k512k5lgchoscq.R.inc(50509);assertEquals(0, result.size());
        __CLR4_4_112k512k5lgchoscq.R.inc(50510);assertEquals(false, result.isSupported(DateTimeFieldType.hourOfDay()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lke16y12z3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lke16y12z3(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50511);
        __CLR4_4_112k512k5lgchoscq.R.inc(50512);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50513);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15);
        __CLR4_4_112k512k5lgchoscq.R.inc(50514);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50515);check(result, 15, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithField2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ibe2eh12z8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ibe2eh12z8(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50516);
        __CLR4_4_112k512k5lgchoscq.R.inc(50517);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50518);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50519);test.withField(null, 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50520);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50521);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithField3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2e3m012ze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2e3m012ze(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50522);
        __CLR4_4_112k512k5lgchoscq.R.inc(50523);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50524);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50525);test.withField(DateTimeFieldType.dayOfMonth(), 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50526);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50527);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithField4() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bte4tj12zk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithField4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bte4tj12zk(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50528);
        __CLR4_4_112k512k5lgchoscq.R.inc(50529);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50530);Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        __CLR4_4_112k512k5lgchoscq.R.inc(50531);assertSame(test, result);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rgt2212zo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rgt2212zo(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50532);
        __CLR4_4_112k512k5lgchoscq.R.inc(50533);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50534);Partial result = test.withFieldAdded(DurationFieldType.hours(), 6);

        __CLR4_4_112k512k5lgchoscq.R.inc(50535);assertEquals(createHourMinPartial(), test);
        __CLR4_4_112k512k5lgchoscq.R.inc(50536);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50537);check(result, 16, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_150gruj12zu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_150gruj12zu(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50538);
        __CLR4_4_112k512k5lgchoscq.R.inc(50539);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50540);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50541);test.withFieldAdded(null, 0);
            __CLR4_4_112k512k5lgchoscq.R.inc(50542);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50543);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189gqn01300();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189gqn01300(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50544);
        __CLR4_4_112k512k5lgchoscq.R.inc(50545);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50546);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50547);test.withFieldAdded(null, 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50548);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50549);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded4() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bigpfh1306();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bigpfh1306(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50550);
        __CLR4_4_112k512k5lgchoscq.R.inc(50551);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50552);Partial result = test.withFieldAdded(DurationFieldType.hours(), 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50553);assertSame(test, result);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded5() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ergo7y130a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ergo7y130a(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50554);
        __CLR4_4_112k512k5lgchoscq.R.inc(50555);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50556);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50557);test.withFieldAdded(DurationFieldType.days(), 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50558);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50559);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded6() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0gn0f130g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0gn0f130g(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50560);
        __CLR4_4_112k512k5lgchoscq.R.inc(50561);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50562);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50563);test.withFieldAdded(DurationFieldType.hours(), 16);
            __CLR4_4_112k512k5lgchoscq.R.inc(50564);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50565);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded7() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9glsw130m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9glsw130m(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50566);
        __CLR4_4_112k512k5lgchoscq.R.inc(50567);Partial test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50568);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50569);test.withFieldAdded(DurationFieldType.minutes(), 1);
            __CLR4_4_112k512k5lgchoscq.R.inc(50570);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50571);check(test, 23, 59);

        __CLR4_4_112k512k5lgchoscq.R.inc(50572);test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50573);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50574);test.withFieldAdded(DurationFieldType.hours(), 1);
            __CLR4_4_112k512k5lgchoscq.R.inc(50575);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50576);check(test, 23, 59);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAdded8() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oigkld130x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAdded8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oigkld130x(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50577);
        __CLR4_4_112k512k5lgchoscq.R.inc(50578);Partial test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50579);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50580);test.withFieldAdded(DurationFieldType.minutes(), -1);
            __CLR4_4_112k512k5lgchoscq.R.inc(50581);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50582);check(test, 0, 0);

        __CLR4_4_112k512k5lgchoscq.R.inc(50583);test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50584);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50585);test.withFieldAdded(DurationFieldType.hours(), -1);
            __CLR4_4_112k512k5lgchoscq.R.inc(50586);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50587);check(test, 0, 0);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAddWrapped1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f812ha1318();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f812ha1318(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50588);
        __CLR4_4_112k512k5lgchoscq.R.inc(50589);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50590);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 6);

        __CLR4_4_112k512k5lgchoscq.R.inc(50591);assertEquals(createHourMinPartial(), test);
        __CLR4_4_112k512k5lgchoscq.R.inc(50592);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50593);check(result, 16, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bz13ot131e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50594,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bz13ot131e(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50594);
        __CLR4_4_112k512k5lgchoscq.R.inc(50595);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50596);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50597);test.withFieldAddWrapped(null, 0);
            __CLR4_4_112k512k5lgchoscq.R.inc(50598);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50599);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q14wc131k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q14wc131k(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50600);
        __CLR4_4_112k512k5lgchoscq.R.inc(50601);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50602);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50603);test.withFieldAddWrapped(null, 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50604);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50605);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped4() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15h163v131q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15h163v131q(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50606);
        __CLR4_4_112k512k5lgchoscq.R.inc(50607);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50608);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50609);assertSame(test, result);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped5() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12817be131u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12817be131u(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50610);
        __CLR4_4_112k512k5lgchoscq.R.inc(50611);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50612);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50613);test.withFieldAddWrapped(DurationFieldType.days(), 6);
            __CLR4_4_112k512k5lgchoscq.R.inc(50614);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50615);check(test, 10, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped6() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110yrh31320();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110yrh31320(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50616);
        __CLR4_4_112k512k5lgchoscq.R.inc(50617);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50618);Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 16);

        __CLR4_4_112k512k5lgchoscq.R.inc(50619);assertEquals(createHourMinPartial(), test);
        __CLR4_4_112k512k5lgchoscq.R.inc(50620);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50621);check(result, 2, 20);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped7() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149yq9k1326();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149yq9k1326(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50622);
        __CLR4_4_112k512k5lgchoscq.R.inc(50623);Partial test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50624);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50625);check(test, 23, 59);
        __CLR4_4_112k512k5lgchoscq.R.inc(50626);check(result, 0, 0);

        __CLR4_4_112k512k5lgchoscq.R.inc(50627);test = createHourMinPartial(23, 59, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50628);result = test.withFieldAddWrapped(DurationFieldType.hours(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50629);check(test, 23, 59);
        __CLR4_4_112k512k5lgchoscq.R.inc(50630);check(result, 0, 59);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testWithFieldAddWrapped8() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iyp21132f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testWithFieldAddWrapped8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iyp21132f(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50631);
        __CLR4_4_112k512k5lgchoscq.R.inc(50632);Partial test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50633);Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50634);check(test, 0, 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50635);check(result, 23, 59);

        __CLR4_4_112k512k5lgchoscq.R.inc(50636);test = createHourMinPartial(0, 0, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50637);result = test.withFieldAddWrapped(DurationFieldType.hours(), -1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50638);check(test, 0, 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50639);check(result, 23, 0);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tz83ig132o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testPlus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50640,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tz83ig132o(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50640);
        __CLR4_4_112k512k5lgchoscq.R.inc(50641);Partial test = createHourMinPartial(BUDDHIST_LONDON);
        __CLR4_4_112k512k5lgchoscq.R.inc(50642);Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_112k512k5lgchoscq.R.inc(50643);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50644);check(result, 15, 26);

        __CLR4_4_112k512k5lgchoscq.R.inc(50645);result = test.plus((ReadablePeriod) null);
        __CLR4_4_112k512k5lgchoscq.R.inc(50646);assertSame(test, result);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112cpdm132v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testMinus_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112cpdm132v(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50647);
        __CLR4_4_112k512k5lgchoscq.R.inc(50648);Partial test = createHourMinPartial(BUDDHIST_LONDON);
        __CLR4_4_112k512k5lgchoscq.R.inc(50649);Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        __CLR4_4_112k512k5lgchoscq.R.inc(50650);check(test, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50651);check(result, 9, 19);

        __CLR4_4_112k512k5lgchoscq.R.inc(50652);result = test.minus((ReadablePeriod) null);
        __CLR4_4_112k512k5lgchoscq.R.inc(50653);assertSame(test, result);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1584tmd1332();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToDateTime_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1584tmd1332(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50654);
        __CLR4_4_112k512k5lgchoscq.R.inc(50655);Partial base = createHourMinPartial(COPTIC_PARIS);
        __CLR4_4_112k512k5lgchoscq.R.inc(50656);DateTime dt = new DateTime(0L); // LONDON zone
        __CLR4_4_112k512k5lgchoscq.R.inc(50657);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());

        __CLR4_4_112k512k5lgchoscq.R.inc(50658);DateTime test = base.toDateTime(dt);
        __CLR4_4_112k512k5lgchoscq.R.inc(50659);check(base, 10, 20);
        __CLR4_4_112k512k5lgchoscq.R.inc(50660);assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        __CLR4_4_112k512k5lgchoscq.R.inc(50661);assertEquals("1970-01-01T10:20:00.000+01:00", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testToDateTime_nullRI() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xlns4133a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToDateTime_nullRI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xlns4133a(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50662);
        __CLR4_4_112k512k5lgchoscq.R.inc(50663);Partial base = createHourMinPartial(1, 2, ISO_UTC);
        __CLR4_4_112k512k5lgchoscq.R.inc(50664);DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);

        __CLR4_4_112k512k5lgchoscq.R.inc(50665);DateTime test = base.toDateTime((ReadableInstant) null);
        __CLR4_4_112k512k5lgchoscq.R.inc(50666);check(base, 1, 2);
        __CLR4_4_112k512k5lgchoscq.R.inc(50667);assertEquals("1970-01-02T01:02:07.008+01:00", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7neoi133g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testProperty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7neoi133g(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50668);
        __CLR4_4_112k512k5lgchoscq.R.inc(50669);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50670);assertNotNull(test.property(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50671);assertNotNull(test.property(DateTimeFieldType.minuteOfHour()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50672);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50673);test.property(DateTimeFieldType.secondOfDay());
            __CLR4_4_112k512k5lgchoscq.R.inc(50674);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_112k512k5lgchoscq.R.inc(50675);try {
            __CLR4_4_112k512k5lgchoscq.R.inc(50676);test.property(null);
            __CLR4_4_112k512k5lgchoscq.R.inc(50677);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9133q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9133q() throws Exception{try{__CLR4_4_112k512k5lgchoscq.R.inc(50678);
        __CLR4_4_112k512k5lgchoscq.R.inc(50679);Partial test = createHourMinPartial(COPTIC_PARIS);

        __CLR4_4_112k512k5lgchoscq.R.inc(50680);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_112k512k5lgchoscq.R.inc(50681);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_112k512k5lgchoscq.R.inc(50682);oos.writeObject(test);
        __CLR4_4_112k512k5lgchoscq.R.inc(50683);oos.close();
        __CLR4_4_112k512k5lgchoscq.R.inc(50684);byte[] bytes = baos.toByteArray();

        __CLR4_4_112k512k5lgchoscq.R.inc(50685);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_112k512k5lgchoscq.R.inc(50686);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_112k512k5lgchoscq.R.inc(50687);Partial result = (Partial) ois.readObject();
        __CLR4_4_112k512k5lgchoscq.R.inc(50688);ois.close();

        __CLR4_4_112k512k5lgchoscq.R.inc(50689);assertEquals(test, result);
        __CLR4_4_112k512k5lgchoscq.R.inc(50690);assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50691);assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50692);assertEquals(test.getChronology(), result.getChronology());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetFormatter1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19u4x761345();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19u4x761345(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50693);
        __CLR4_4_112k512k5lgchoscq.R.inc(50694);Partial test = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_112k512k5lgchoscq.R.inc(50695);assertEquals("2005", test.getFormatter().print(test));

        __CLR4_4_112k512k5lgchoscq.R.inc(50696);test = test.with(DateTimeFieldType.monthOfYear(), 6);
        __CLR4_4_112k512k5lgchoscq.R.inc(50697);assertEquals("2005-06", test.getFormatter().print(test));

        __CLR4_4_112k512k5lgchoscq.R.inc(50698);test = test.with(DateTimeFieldType.dayOfMonth(), 25);
        __CLR4_4_112k512k5lgchoscq.R.inc(50699);assertEquals("2005-06-25", test.getFormatter().print(test));

        __CLR4_4_112k512k5lgchoscq.R.inc(50700);test = test.without(DateTimeFieldType.monthOfYear());
        __CLR4_4_112k512k5lgchoscq.R.inc(50701);assertEquals("2005--25", test.getFormatter().print(test));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetFormatter2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d34vzn134e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d34vzn134e(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50702);
        __CLR4_4_112k512k5lgchoscq.R.inc(50703);Partial test = new Partial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50704);assertEquals(null, test.getFormatter());

        __CLR4_4_112k512k5lgchoscq.R.inc(50705);test = test.with(DateTimeFieldType.era(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50706);assertEquals(null, test.getFormatter());

        __CLR4_4_112k512k5lgchoscq.R.inc(50707);test = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50708);assertEquals(null, test.getFormatter());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testGetFormatter3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gc4us4134l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testGetFormatter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gc4us4134l(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50709);
        __CLR4_4_112k512k5lgchoscq.R.inc(50710);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_112k512k5lgchoscq.R.inc(50711);assertEquals("-W-5", test.getFormatter().print(test));

        // contrast with testToString5
        __CLR4_4_112k512k5lgchoscq.R.inc(50712);test = test.with(DateTimeFieldType.dayOfMonth(), 13);
        __CLR4_4_112k512k5lgchoscq.R.inc(50713);assertEquals("---13", test.getFormatter().print(test));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString1() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mcagu2134q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mcagu2134q(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50714);
        __CLR4_4_112k512k5lgchoscq.R.inc(50715);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50716);assertEquals("10:20", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testToString2() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plafmj134t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plafmj134t(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50717);
        __CLR4_4_112k512k5lgchoscq.R.inc(50718);Partial test = new Partial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50719);assertEquals("[]", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testToString3() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1suaef0134w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1suaef0134w(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50720);
        __CLR4_4_112k512k5lgchoscq.R.inc(50721);Partial test = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_112k512k5lgchoscq.R.inc(50722);assertEquals("2005", test.toString());

        __CLR4_4_112k512k5lgchoscq.R.inc(50723);test = test.with(DateTimeFieldType.monthOfYear(), 6);
        __CLR4_4_112k512k5lgchoscq.R.inc(50724);assertEquals("2005-06", test.toString());

        __CLR4_4_112k512k5lgchoscq.R.inc(50725);test = test.with(DateTimeFieldType.dayOfMonth(), 25);
        __CLR4_4_112k512k5lgchoscq.R.inc(50726);assertEquals("2005-06-25", test.toString());

        __CLR4_4_112k512k5lgchoscq.R.inc(50727);test = test.without(DateTimeFieldType.monthOfYear());
        __CLR4_4_112k512k5lgchoscq.R.inc(50728);assertEquals("2005--25", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testToString4() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3ad7h1355();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3ad7h1355(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50729);
        __CLR4_4_112k512k5lgchoscq.R.inc(50730);Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_112k512k5lgchoscq.R.inc(50731);assertEquals("-W-5", test.toString());

        __CLR4_4_112k512k5lgchoscq.R.inc(50732);test = test.with(DateTimeFieldType.dayOfMonth(), 13);
        __CLR4_4_112k512k5lgchoscq.R.inc(50733);assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    @Test
    public void testToString5() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zcabzy135a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zcabzy135a(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50734);
        __CLR4_4_112k512k5lgchoscq.R.inc(50735);Partial test = new Partial(DateTimeFieldType.era(), 1);
        __CLR4_4_112k512k5lgchoscq.R.inc(50736);assertEquals("[era=1]", test.toString());

        __CLR4_4_112k512k5lgchoscq.R.inc(50737);test = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        __CLR4_4_112k512k5lgchoscq.R.inc(50738);assertEquals("[era=1, halfdayOfDay=0]", test.toString());
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llkh2x135f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llkh2x135f(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50739);
        __CLR4_4_112k512k5lgchoscq.R.inc(50740);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50741);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        __CLR4_4_112k512k5lgchoscq.R.inc(50742);assertEquals("10:20", test.toString((String) null));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afd64u135j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_String_Locale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afd64u135j(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50743);
        __CLR4_4_112k512k5lgchoscq.R.inc(50744);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50745);assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        __CLR4_4_112k512k5lgchoscq.R.inc(50746);assertEquals("10:20", test.toString(null, Locale.ENGLISH));
        __CLR4_4_112k512k5lgchoscq.R.inc(50747);assertEquals("10 20", test.toString("H m", null));
        __CLR4_4_112k512k5lgchoscq.R.inc(50748);assertEquals("10:20", test.toString(null, null));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {__CLR4_4_112k512k5lgchoscq.R.globalSliceStart(getClass().getName(),50749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxbkps135p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_112k512k5lgchoscq.R.rethrow($CLV_t2$);}finally{__CLR4_4_112k512k5lgchoscq.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Basics.testToString_DTFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),50749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxbkps135p(){try{__CLR4_4_112k512k5lgchoscq.R.inc(50749);
        __CLR4_4_112k512k5lgchoscq.R.inc(50750);Partial test = createHourMinPartial();
        __CLR4_4_112k512k5lgchoscq.R.inc(50751);assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        __CLR4_4_112k512k5lgchoscq.R.inc(50752);assertEquals("10:20", test.toString((DateTimeFormatter) null));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private Partial createHourMinPartial() {try{__CLR4_4_112k512k5lgchoscq.R.inc(50753);
        __CLR4_4_112k512k5lgchoscq.R.inc(50754);return createHourMinPartial(ISO_UTC);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    private Partial createHourMinPartial(Chronology chrono) {try{__CLR4_4_112k512k5lgchoscq.R.inc(50755);
        __CLR4_4_112k512k5lgchoscq.R.inc(50756);return createHourMinPartial(10, 20, chrono);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    private Partial createHourMinPartial2(Chronology chrono) {try{__CLR4_4_112k512k5lgchoscq.R.inc(50757);
        __CLR4_4_112k512k5lgchoscq.R.inc(50758);return createHourMinPartial(15, 20, chrono);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {try{__CLR4_4_112k512k5lgchoscq.R.inc(50759);
        __CLR4_4_112k512k5lgchoscq.R.inc(50760);return new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[]{hour, min},
                chrono);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    private Partial createTODPartial(Chronology chrono) {try{__CLR4_4_112k512k5lgchoscq.R.inc(50761);
        __CLR4_4_112k512k5lgchoscq.R.inc(50762);return new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[]{10, 20, 30, 40},
                chrono);
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}

    private void check(Partial test, int hour, int min) {try{__CLR4_4_112k512k5lgchoscq.R.inc(50763);
        __CLR4_4_112k512k5lgchoscq.R.inc(50764);assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        __CLR4_4_112k512k5lgchoscq.R.inc(50765);assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }finally{__CLR4_4_112k512k5lgchoscq.R.flushNeeded();}}
}
