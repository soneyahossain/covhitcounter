/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import junit.framework.AssertionFailedError;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/**
 * This class is a Junit unit test for DateTimeFormatterBuilder.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 */
public class TestDateTimeFormatterBuilder {static class __CLR4_4_11jkl1jkllgchosxp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,72661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LOS_ANGELES = DateTimeZone.forID("America/Los_Angeles");
    private static final DateTimeZone OFFSET_0200 = DateTimeZone.forID("+02:00");
    private static final DateTimeZone OFFSET_023012 = DateTimeZone.forID("+02:30:12");

    public static void main(String[] args) throws Exception {try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72021);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72022);TestDateTimeFormatterBuilder TB = new TestDateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72023);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72024);TB.test_toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72025);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72026);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72027);TB.test_toPrinter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72028);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72029);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72030);TB.test_toParser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72031);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72032);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72033);TB.test_canBuildFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72034);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72035);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72036);TB.test_canBuildPrinter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72037);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72038);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72039);TB.test_canBuildParser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72040);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72041);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72042);TB.test_append_Formatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72043);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72044);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72045);TB.test_append_Printer();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72046);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72047);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72048);TB.test_append_nullPrinter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72049);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72050);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72051);TB.test_append_Parser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72052);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72053);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72054);TB.test_append_nullParser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72055);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72056);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72057);TB.test_append_Printer_nullParser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72058);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72059);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72060);TB.test_append_nullPrinter_Parser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72061);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72062);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72063);TB.test_appendOptional_Parser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72064);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72065);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72066);TB.test_appendOptional_nullParser();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72067);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72068);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72069);TB.test_appendFixedDecimal();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72070);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72071);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72072);TB.test_appendFixedSignedDecimal();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72073);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72074);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72075);TB.test_appendTimeZoneOffset_parse();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72076);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72077);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72078);TB.test_appendTimeZoneOffset_print_min1max1();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72079);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72080);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72081);TB.test_appendTimeZoneOffset_print_min1max2();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72082);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72083);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72084);TB.test_appendTimeZoneOffset_print_min1max3();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72085);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72086);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72087);TB.test_appendTimeZoneOffset_print_min2max2();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72088);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72089);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72090);TB.test_appendTimeZoneOffset_print_min2max3();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72091);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72092);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72093);TB.test_appendTimeZoneOffset_print_min3max3();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72094);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72095);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72096);TB.test_appendTimeZoneOffset_invalidText();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72097);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72098);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72099);TB.test_appendTimeZoneOffset_zeroMinInvalid();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72100);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72101);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72102);TB.test_appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72103);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72104);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72105);TB.test_printParseZoneTokyo();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72106);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72107);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72108);TB.test_printParseZoneParis();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72109);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72110);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72111);TB.test_printParseZoneDawson();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72112);TB.tearDown();  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72113);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72114);TB.test_printParseZoneDawson_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72115);TB.tearDown();  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72116);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72117);TB.test_printParseZoneDawsonCreek();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72118);TB.tearDown();  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72119);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72120);TB.test_printParseZoneDawsonCreek_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72121);TB.tearDown();  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72122);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72123);TB.test_printParseZoneEtcGMT();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72124);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72125);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72126);TB.test_printParseZoneEtcGMT_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72127);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72128);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72129);TB.test_printParseZoneGMT();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72130);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72131);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72132);TB.test_printParseZoneGMT_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72133);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72134);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72135);TB.test_printParseZoneEtcGMT1();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72136);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72137);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72138);TB.test_printParseZoneEtcGMT1_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72139);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72140);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72141);TB.test_printParseZoneEtcGMT10();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72142);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72143);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72144);TB.test_printParseZoneEtcGMT10_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72145);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72146);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72147);TB.test_printParseZoneMET();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72148);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72149);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72150);TB.test_printParseZoneMET_suffix();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72151);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72152);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72153);TB.test_printParseZoneBahiaBanderas();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72154);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72155);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72156);TB.test_printParseOffset();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72157);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72158);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72159);TB.test_printParseOffsetAndZone();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72160);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72161);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72162);TB.test_parseWrongOffset();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72163);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72164);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72165);TB.test_parseWrongOffsetAndZone();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72166);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72167);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72168);TB.test_localPrintParseZoneTokyo();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72169);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72170);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72171);TB.test_localPrintParseOffset();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72172);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72173);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72174);TB.test_localPrintParseOffsetAndZone();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72175);TB.tearDown();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72176);TB.setUp();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72177);TB.test_localParseWrongOffsetAndZone();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72178);TB.tearDown();
        //TB.setUp(); TB.test_printParseShortName(); TB.tearDown();   //due to long method error
        //TB.setUp(); TB.test_printParseShortNameWithLookup(); TB.tearDown();  //due to long method error
        //TB.setUp(); TB.test_printParseShortNameWithAutoLookup(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.test_printParseLongName(); TB.tearDown();  //Method code too large!
        //TB.setUp(); TB.test_printParseLongNameWithLookup(); TB.tearDown(); //Method code too large!


    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeFormatterBuilder.class);
    }

    public TestDateTimeFormatterBuilder(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72179);
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72180);
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toFormatter() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngz82f1jp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngz82f1jp1(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72181);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72182);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72183);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72184);bld.toFormatter();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72185);fail();
        } catch (UnsupportedOperationException ex) {
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72186);bld.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72187);assertNotNull(bld.toFormatter());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_toPrinter() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19czpl31jp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toPrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19czpl31jp8(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72188);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72189);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72190);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72191);bld.toPrinter();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72192);fail();
        } catch (UnsupportedOperationException ex) {
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72193);bld.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72194);assertNotNull(bld.toPrinter());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_toParser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3bs421jpf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_toParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3bs421jpf(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72195);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72196);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72197);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72198);bld.toParser();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72199);fail();
        } catch (UnsupportedOperationException ex) {
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72200);bld.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72201);assertNotNull(bld.toParser());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_canBuildFormatter() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xudxwm1jpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildFormatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xudxwm1jpm(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72202);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72203);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72204);assertEquals(false, bld.canBuildFormatter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72205);bld.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72206);assertEquals(true, bld.canBuildFormatter());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_canBuildPrinter() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xp2mi1jpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildPrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xp2mi1jpr(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72207);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72208);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72209);assertEquals(false, bld.canBuildPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72210);bld.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72211);assertEquals(true, bld.canBuildPrinter());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_canBuildParser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elhi7j1jpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_canBuildParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elhi7j1jpw(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72212);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72213);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72214);assertEquals(false, bld.canBuildParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72215);bld.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72216);assertEquals(true, bld.canBuildParser());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_append_Formatter() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlpcfb1jq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Formatter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlpcfb1jq1(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72217);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72218);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72219);bld.appendLiteral('Y');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72220);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72221);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72222);bld2.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72223);bld2.append(f);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72224);bld2.appendLiteral('Z');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72225);assertEquals("XYZ", bld2.toFormatter().print(0L));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_append_Printer() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmjaaf1jqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmjaaf1jqa(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72226);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72227);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72228);bld.appendLiteral('Y');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72229);DateTimePrinter p = bld.toPrinter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72230);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72231);bld2.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72232);bld2.append(p);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72233);bld2.appendLiteral('Z');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72234);DateTimeFormatter f = bld2.toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72235);assertEquals(true, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72236);assertEquals(false, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72237);assertEquals("XYZ", f.print(0L));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_append_nullPrinter() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c7ck7y1jqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c7ck7y1jqm(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72238);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72239);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72240);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72241);bld2.append((DateTimePrinter) null);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72242);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_append_Parser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e1tvm1jqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e1tvm1jqr(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72243);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72244);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72245);bld.appendLiteral('Y');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72246);DateTimeParser p = bld.toParser();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72247);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72248);bld2.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72249);bld2.append(p);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72250);bld2.appendLiteral('Z');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72251);DateTimeFormatter f = bld2.toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72252);assertEquals(false, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72253);assertEquals(true, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72254);assertEquals(0, f.withZoneUTC().parseMillis("XYZ"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_append_nullParser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdzp5n1jr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdzp5n1jr3(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72255);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72256);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72257);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72258);bld2.append((DateTimeParser) null);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72259);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_append_Printer_nullParser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlr99m1jr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_Printer_nullParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlr99m1jr8(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72260);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72261);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72262);bld.appendLiteral('Y');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72263);DateTimePrinter p = bld.toPrinter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72264);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72265);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72266);bld2.append(p, (DateTimeParser) null);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72267);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_append_nullPrinter_Parser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdll921jrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_append_nullPrinter_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdll921jrg(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72268);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72269);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72270);bld.appendLiteral('Y');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72271);DateTimeParser p = bld.toParser();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72272);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72273);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72274);bld2.append((DateTimePrinter) null, p);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72275);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_appendOptional_Parser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yzm6821jro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_Parser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yzm6821jro(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72276);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72277);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72278);bld.appendLiteral('Y');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72279);DateTimeParser p = bld.toParser();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72280);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72281);bld2.appendLiteral('X');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72282);bld2.appendOptional(p);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72283);bld2.appendLiteral('Z');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72284);DateTimeFormatter f = bld2.toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72285);assertEquals(false, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72286);assertEquals(true, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72287);assertEquals(0, f.withZoneUTC().parseMillis("XYZ"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendOptional_nullParser() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xabvxh1js0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendOptional_nullParser",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xabvxh1js0(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72288);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72289);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72290);DateTimeFormatterBuilder bld2 = new DateTimeFormatterBuilder();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72291);bld2.appendOptional((DateTimeParser) null);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72292);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_appendFixedDecimal() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trtq171js5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trtq171js5(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72293);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72294);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72295);bld.appendFixedDecimal(DateTimeFieldType.year(), 4);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72296);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72297);assertEquals("2007", f.print(new DateTime("2007-01-01")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72298);assertEquals("0123", f.print(new DateTime("123-01-01")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72299);assertEquals("0001", f.print(new DateTime("1-2-3")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72300);assertEquals("99999", f.print(new DateTime("99999-2-3")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72301);assertEquals("-0099", f.print(new DateTime("-99-2-3")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72302);assertEquals("0000", f.print(new DateTime("0-2-3")));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72303);assertEquals(2001, f.parseDateTime("2001").getYear());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72304);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72305);f.parseDateTime("-2001");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72306);fail();
        } catch (IllegalArgumentException e) {
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72307);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72308);f.parseDateTime("200");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72309);fail();
        } catch (IllegalArgumentException e) {
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72310);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72311);f.parseDateTime("20016");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72312);fail();
        } catch (IllegalArgumentException e) {
        }

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72313);bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72314);bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72315);bld.appendLiteral(':');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72316);bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72317);bld.appendLiteral(':');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72318);bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72319);f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72320);assertEquals("01:02:34", f.print(new DateTime("T1:2:34")));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72321);DateTime dt = f.parseDateTime("01:02:34");
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72322);assertEquals(1, dt.getHourOfDay());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72323);assertEquals(2, dt.getMinuteOfHour());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72324);assertEquals(34, dt.getSecondOfMinute());

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72325);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72326);f.parseDateTime("0145:02:34");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72327);fail();
        } catch (IllegalArgumentException e) {
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72328);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72329);f.parseDateTime("01:0:34");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72330);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_appendFixedSignedDecimal() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceg5f51jt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendFixedSignedDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceg5f51jt7(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72331);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72332);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72333);bld.appendFixedSignedDecimal(DateTimeFieldType.year(), 4);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72334);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72335);assertEquals("2007", f.print(new DateTime("2007-01-01")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72336);assertEquals("0123", f.print(new DateTime("123-01-01")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72337);assertEquals("0001", f.print(new DateTime("1-2-3")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72338);assertEquals("99999", f.print(new DateTime("99999-2-3")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72339);assertEquals("-0099", f.print(new DateTime("-99-2-3")));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72340);assertEquals("0000", f.print(new DateTime("0-2-3")));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72341);assertEquals(2001, f.parseDateTime("2001").getYear());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72342);assertEquals(-2001, f.parseDateTime("-2001").getYear());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72343);assertEquals(2001, f.parseDateTime("+2001").getYear());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72344);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72345);f.parseDateTime("20016");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72346);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_appendTimeZoneOffset_parse() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_145egby1jtn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_parse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_145egby1jtn(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72347);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72348);for (int i = 1; (((i <= 4)&&(__CLR4_4_11jkl1jkllgchosxp.R.iget(72349)!=0|true))||(__CLR4_4_11jkl1jkllgchosxp.R.iget(72350)==0&false)); i++) {{
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72351);for (int j = i; (((j <= 4)&&(__CLR4_4_11jkl1jkllgchosxp.R.iget(72352)!=0|true))||(__CLR4_4_11jkl1jkllgchosxp.R.iget(72353)==0&false)); j++) {{
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72354);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72355);bld.appendTimeZoneOffset("Z", true, i, j);
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72356);DateTimeFormatter f = bld.toFormatter();
                // parse
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72357);assertEquals(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02").getZone());
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72358);assertEquals(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02:00").getZone());
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72359);assertEquals(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02:00:00").getZone());
                __CLR4_4_11jkl1jkllgchosxp.R.inc(72360);assertEquals(OFFSET_0200, f.withOffsetParsed().parseDateTime("+02:00:00.000").getZone());
            }
        }}
    }}finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_print_min1max1() throws IOException {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hzd0vl1ju1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_print_min1max1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hzd0vl1ju1() throws IOException{try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72361);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72362);DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 1, 1).toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72363);assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72364);assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_print_min1max2() throws IOException {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l8czo21ju5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_print_min1max2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l8czo21ju5() throws IOException{try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72365);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72366);DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 1, 2).toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72367);assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72368);assertPrint("+02:30", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_print_min1max3() throws IOException {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohcygj1ju9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_print_min1max3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohcygj1ju9() throws IOException{try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72369);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72370);DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 1, 3).toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72371);assertPrint("+02", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72372);assertPrint("+02:30:12", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_print_min2max2() throws IOException {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlcv771jud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_print_min2max2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlcv771jud() throws IOException{try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72373);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72374);DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 2).toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72375);assertPrint("+02:00", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72376);assertPrint("+02:30", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_print_min2max3() throws IOException {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wuctzo1juh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_print_min2max3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72377,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wuctzo1juh() throws IOException{try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72377);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72378);DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 3).toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72379);assertPrint("+02:00", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72380);assertPrint("+02:30:12", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_print_min3max3() throws IOException {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttrcgb1jul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_print_min3max3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttrcgb1jul() throws IOException{try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72381);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72382);DateTimeFormatter f = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 3, 3).toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72383);assertPrint("+02:00:00", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_0200));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72384);assertPrint("+02:30:12", f, new DateTime(2007, 3, 4, 0, 0, 0, OFFSET_023012));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_invalidText() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13vcwf31jup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_invalidText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13vcwf31jup(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72385);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72386);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72387);bld.appendTimeZoneOffset("Z", true, 1, 1);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72388);DateTimeFormatter f = bld.toFormatter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72389);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72390);f.parseDateTime("Nonsense");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72391);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_appendTimeZoneOffset_zeroMinInvalid() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skn1cw1juw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneOffset_zeroMinInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skn1cw1juw(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72392);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72393);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72394);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72395);bld.appendTimeZoneOffset("Z", true, 0, 2);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72396);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_appendTimeZoneId() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s232ny1jv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_appendTimeZoneId",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s232ny1jv1(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72397);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72398);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72399);bld.appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72400);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72401);assertEquals("Asia/Tokyo", f.print(new DateTime(2007, 3, 4, 0, 0, 0, TOKYO)));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72402);assertEquals(TOKYO, f.parseDateTime("Asia/Tokyo").getZone());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72403);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72404);f.parseDateTime("Nonsense");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72405);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneTokyo() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mglxpq1jva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneTokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mglxpq1jva(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72406);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72407);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72408);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72409);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72410);assertEquals("2007-03-04 12:30 Asia/Tokyo", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72411);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Asia/Tokyo"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneParis() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bw8ewj1jvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneParis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bw8ewj1jvg(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72412);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72413);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72414);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72415);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72416);assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72417);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72418);assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneDawson() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18fjyn21jvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneDawson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18fjyn21jvn(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72419);  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72420);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72421);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72422);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72423);assertEquals("2007-03-04 12:30 America/Dawson", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72424);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneDawson_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pkxz41jvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneDawson_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pkxz41jvt(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72425);  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72426);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId().appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72427);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72428);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72429);assertEquals("2007-03-04 12:30 America/Dawson]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72430);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneDawsonCreek() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fp5d7w1jvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneDawsonCreek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fp5d7w1jvz(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72431);  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72432);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72433);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72434);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson_Creek"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72435);assertEquals("2007-03-04 12:30 America/Dawson_Creek", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72436);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson_Creek"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneDawsonCreek_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16sdjgu1jw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneDawsonCreek_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72437,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16sdjgu1jw5(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72437);  // clashes with shorter Dawson
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72438);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId().appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72439);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72440);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Dawson_Creek"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72441);assertEquals("2007-03-04 12:30 America/Dawson_Creek]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72442);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Dawson_Creek]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneEtcGMT() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9y4741jwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneEtcGMT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9y4741jwb(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72443);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72444);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72445);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72446);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72447);assertEquals("2007-03-04 12:30 Etc/GMT", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72448);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneEtcGMT_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgehem1jwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneEtcGMT_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgehem1jwh(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72449);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72450);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72451);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72452);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72453);assertEquals("2007-03-04 12:30 Etc/GMT]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72454);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneGMT() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jpfysq1jwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneGMT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jpfysq1jwn(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72455);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72456);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72457);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72458);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("GMT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72459);assertEquals("2007-03-04 12:30 Etc/GMT", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72460);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 GMT"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneGMT_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18g7rig1jwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneGMT_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18g7rig1jwt(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72461);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72462);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72463);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72464);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("GMT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72465);assertEquals("2007-03-04 12:30 Etc/GMT]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72466);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 GMT]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneEtcGMT1() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xenfcv1jwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneEtcGMT1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xenfcv1jwz(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72467);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72468);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72469);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72470);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+1"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72471);assertEquals("2007-03-04 12:30 Etc/GMT+1", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72472);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+1"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneEtcGMT1_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cmg51d1jx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneEtcGMT1_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cmg51d1jx5(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72473);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72474);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72475);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72476);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+1"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72477);assertEquals("2007-03-04 12:30 Etc/GMT+1]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72478);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+1]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneEtcGMT10() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fxphb1jxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneEtcGMT10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fxphb1jxb(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72479);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72480);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72481);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72482);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+10"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72483);assertEquals("2007-03-04 12:30 Etc/GMT+10", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72484);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+10"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneEtcGMT10_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pddbz1jxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneEtcGMT10_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pddbz1jxh(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72485);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72486);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72487);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72488);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("Etc/GMT+10"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72489);assertEquals("2007-03-04 12:30 Etc/GMT+10]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72490);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Etc/GMT+10]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneMET() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dv0vl01jxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneMET",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dv0vl01jxn(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72491);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72492);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ");
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72493);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72494);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("MET"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72495);assertEquals("2007-03-04 12:30 MET", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72496);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 MET"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneMET_suffix() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vcxtve1jxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneMET_suffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vcxtve1jxt(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72497);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72498);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ZZZ").appendLiteral(']');
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72499);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72500);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("MET"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72501);assertEquals("2007-03-04 12:30 MET]", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72502);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 MET]"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseZoneBahiaBanderas() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fln2t91jxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseZoneBahiaBanderas",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fln2t91jxz(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72503);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72504);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72505);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72506);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forID("America/Bahia_Banderas"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72507);assertEquals("2007-03-04 12:30 America/Bahia_Banderas", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72508);assertEquals(dt, f.parseDateTime("2007-03-04 12:30 America/Bahia_Banderas"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseOffset() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xsi4t1jy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xsi4t1jy5(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72509);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72510);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72511);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72512);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72513);assertEquals("2007-03-04 12:30 +09:00", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72514);assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72515);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72516);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_printParseOffsetAndZone() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adw95o1jyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adw95o1jyd(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72517);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72518);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72519);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72520);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72521);assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72522);assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72523);assertEquals(dt.withZone(PARIS), f.withZone(PARIS).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72524);assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_parseWrongOffset() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpbt351jyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpbt351jyl(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72525);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72526);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72527);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72528);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7));
        // parses offset time then adjusts to requested zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72529);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00"));
        // parses offset time returning offset zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72530);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00"));
        // parses offset time then converts to default zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72531);assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_parseWrongOffsetAndZone() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn5u6o1jys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_parseWrongOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn5u6o1jys(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72532);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72533);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72534);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72535);DateTime expected = new DateTime(2007, 3, 4, 12, 30, 0, DateTimeZone.forOffsetHours(7));
        // parses offset time then adjusts to parsed zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72536);assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time then adjusts to requested zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72537);assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time returning offset zone (ignores zone)
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72538);assertEquals(expected, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_localPrintParseZoneTokyo() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xu0bn1jyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localPrintParseZoneTokyo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xu0bn1jyz(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72539);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72540);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72541);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72542);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72543);assertEquals("2007-03-04 12:30 Asia/Tokyo", f.print(dt));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72544);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72545);assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 Asia/Tokyo"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_localPrintParseOffset() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w12zpa1jz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localPrintParseOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w12zpa1jz6(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72546);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72547);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72548);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72549);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72550);assertEquals("2007-03-04 12:30 +09:00", f.print(dt));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72551);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72552);assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72553);assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72554);assertEquals(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +09:00"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_localPrintParseOffsetAndZone() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pq8j6b1jzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localPrintParseOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pq8j6b1jzf(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72555);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72556);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72557);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72558);DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72559);assertEquals("2007-03-04 12:30 +09:00 Asia/Tokyo", f.print(dt));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72560);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72561);assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72562);assertEquals(expected, f.withZone(PARIS).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    @Test
    public void test_localParseWrongOffsetAndZone() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggyy5b1jzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_localParseWrongOffsetAndZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggyy5b1jzn(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72563);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72564);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2).appendLiteral(' ').appendTimeZoneId();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72565);DateTimeFormatter f = bld.toFormatter();

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72566);LocalDateTime expected = new LocalDateTime(2007, 3, 4, 12, 30);
        // parses offset time then adjusts to parsed zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72567);assertEquals(expected, f.parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time then adjusts to requested zone
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72568);assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
        // parses offset time returning offset zone (ignores zone)
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72569);assertEquals(expected, f.withOffsetParsed().parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void test_printParseShortName() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f3p2g51jzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseShortName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f3p2g51jzu(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72570);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72571);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72572);DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72573);assertEquals(true, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72574);assertEquals(false, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72575);DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72576);assertEquals("2011-01-04 12:30 GMT", f.print(dt1));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72577);DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72578);assertEquals("2011-07-04 12:30 BST", f.print(dt2));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72579);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72580);f.parseDateTime("2007-03-04 12:30 GMT");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72581);fail();
        } catch (UnsupportedOperationException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //@Test
    public void test_printParseShortNameWithLookup() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q62791k06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseShortNameWithLookup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q62791k06(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72582);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72583);Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72584);lookup.put("GMT", LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72585);lookup.put("BST", LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72586);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(lookup);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72587);DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72588);assertEquals(true, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72589);assertEquals(true, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72590);DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72591);assertEquals("2011-01-04 12:30 GMT", f.print(dt1));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72592);DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72593);assertEquals("2011-07-04 12:30 BST", f.print(dt2));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72594);assertEquals(dt1, f.parseDateTime("2011-01-04 12:30 GMT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72595);assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 BST"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72596);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72597);f.parseDateTime("2007-03-04 12:30 EST");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72598);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //@Test
    public void test_printParseShortNameWithAutoLookup() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o6ya5y1k0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseShortNameWithAutoLookup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o6ya5y1k0n(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72599);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72600);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneShortName(null);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72601);DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72602);assertEquals(true, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72603);assertEquals(true, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72604);DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, NEW_YORK);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72605);assertEquals("2011-01-04 12:30 EST", f.print(dt1));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72606);DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, NEW_YORK);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72607);assertEquals("2011-07-04 12:30 EDT", f.print(dt2));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72608);DateTime dt3 = new DateTime(2011, 1, 4, 12, 30, 0, LOS_ANGELES);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72609);assertEquals("2011-01-04 12:30 PST", f.print(dt3));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72610);DateTime dt4 = new DateTime(2011, 7, 4, 12, 30, 0, LOS_ANGELES);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72611);assertEquals("2011-07-04 12:30 PDT", f.print(dt4));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72612);DateTime dt5 = new DateTime(2011, 7, 4, 12, 30, 0, DateTimeZone.UTC);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72613);assertEquals("2011-07-04 12:30 UTC", f.print(dt5));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72614);assertEquals(dt1.getZone() + " " + f.parseDateTime("2011-01-04 12:30 EST").getZone(), dt1, f.parseDateTime("2011-01-04 12:30 EST"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72615);assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 EDT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72616);assertEquals(dt3, f.parseDateTime("2011-01-04 12:30 PST"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72617);assertEquals(dt4, f.parseDateTime("2011-07-04 12:30 PDT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72618);assertEquals(dt5, f.parseDateTime("2011-07-04 12:30 UT"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72619);assertEquals(dt5, f.parseDateTime("2011-07-04 12:30 UTC"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72620);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72621);f.parseDateTime("2007-03-04 12:30 PPP");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72622);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void test_printParseLongName() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmzuht1k1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseLongName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmzuht1k1b(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72623);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72624);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72625);DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72626);assertEquals(true, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72627);assertEquals(false, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72628);DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72629);assertEquals("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72630);DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72631);assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72632);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72633);f.parseDateTime("2007-03-04 12:30 GMT");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72634);fail();
        } catch (UnsupportedOperationException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    //@Test
    public void test_printParseLongNameWithLookup() {__CLR4_4_11jkl1jkllgchosxp.R.globalSliceStart(getClass().getName(),72635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qc43mn1k1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11jkl1jkllgchosxp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11jkl1jkllgchosxp.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestDateTimeFormatterBuilder.test_printParseLongNameWithLookup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),72635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qc43mn1k1n(){try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72635);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72636);Map<String, DateTimeZone> lookup = new LinkedHashMap<String, DateTimeZone>();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72637);lookup.put("Greenwich Mean Time", LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72638);lookup.put("British Summer Time", LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72639);DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneName(lookup);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72640);DateTimeFormatter f = bld.toFormatter().withLocale(Locale.ENGLISH);

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72641);assertEquals(true, f.isPrinter());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72642);assertEquals(true, f.isParser());
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72643);DateTime dt1 = new DateTime(2011, 1, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72644);assertEquals("2011-01-04 12:30 Greenwich Mean Time", f.print(dt1));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72645);DateTime dt2 = new DateTime(2011, 7, 4, 12, 30, 0, LONDON);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72646);assertEquals("2011-07-04 12:30 British Summer Time", f.print(dt2));

        __CLR4_4_11jkl1jkllgchosxp.R.inc(72647);assertEquals(dt1, f.parseDateTime("2011-01-04 12:30 Greenwich Mean Time"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72648);assertEquals(dt2, f.parseDateTime("2011-07-04 12:30 British Summer Time"));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72649);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72650);f.parseDateTime("2007-03-04 12:30 EST");
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72651);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

    private static void assertPrint(String expected, DateTimeFormatter f, DateTime dt) {try{__CLR4_4_11jkl1jkllgchosxp.R.inc(72652);
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72653);assertEquals(expected, f.print(dt));
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72654);StringWriter out = new StringWriter();
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72655);try {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72656);f.printTo(out, dt);
        } catch (IOException ex) {
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72657);AssertionFailedError failure = new AssertionFailedError();
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72658);failure.initCause(ex);
            __CLR4_4_11jkl1jkllgchosxp.R.inc(72659);throw failure;
        }
        __CLR4_4_11jkl1jkllgchosxp.R.inc(72660);assertEquals(expected, out.toString());
    }finally{__CLR4_4_11jkl1jkllgchosxp.R.flushNeeded();}}

}
