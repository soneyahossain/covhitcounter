/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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
import java.io.FilePermission;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZone {static class __CLR4_4_1k24k24lgchorm5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,26873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    private static final boolean OLD_JDK;

    static {try{__CLR4_4_1k24k24lgchorm5.R.inc(25996);
        __CLR4_4_1k24k24lgchorm5.R.inc(25997);String str = System.getProperty("java.version");
        __CLR4_4_1k24k24lgchorm5.R.inc(25998);boolean old = true;
        __CLR4_4_1k24k24lgchorm5.R.inc(25999);if ((((str.length() > 3 &&
                str.charAt(0) == '1' &&
                str.charAt(1) == '.' &&
                (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1k24k24lgchorm5.R.iget(26000)!=0|true))||(__CLR4_4_1k24k24lgchorm5.R.iget(26001)==0&false))) {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26002);old = false;
        }
        }__CLR4_4_1k24k24lgchorm5.R.inc(26003);OLD_JDK = old;
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365;

    // 2002-06-09
    private long TEST_TIME_SUMMER =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 2002-01-09
    private long TEST_TIME_WINTER =
            (y2002days + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

//    // 2002-04-05 Fri
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06 Tue
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private static final Policy RESTRICT;
    private static final Policy ALLOW;

    static {try{__CLR4_4_1k24k24lgchorm5.R.inc(26004);
        // don't call Policy.getPolicy()
        __CLR4_4_1k24k24lgchorm5.R.inc(26005);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26006);
                __CLR4_4_1k24k24lgchorm5.R.inc(26007);Permissions p = new Permissions();
                __CLR4_4_1k24k24lgchorm5.R.inc(26008);p.add(new AllPermission());  // enable everything
                __CLR4_4_1k24k24lgchorm5.R.inc(26009);return p;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            public void refresh() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26010);
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26011);
                __CLR4_4_1k24k24lgchorm5.R.inc(26012);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1k24k24lgchorm5.R.iget(26013)!=0|true))||(__CLR4_4_1k24k24lgchorm5.R.iget(26014)==0&false))) {{
                    __CLR4_4_1k24k24lgchorm5.R.inc(26015);return false;
                }
                }__CLR4_4_1k24k24lgchorm5.R.inc(26016);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
        };
        __CLR4_4_1k24k24lgchorm5.R.inc(26017);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26018);
                __CLR4_4_1k24k24lgchorm5.R.inc(26019);Permissions p = new Permissions();
                __CLR4_4_1k24k24lgchorm5.R.inc(26020);p.add(new AllPermission());  // enable everything
                __CLR4_4_1k24k24lgchorm5.R.inc(26021);return p;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            public void refresh() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26022);
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    private DateTimeZone zone;
    private Locale locale;

    public static void main(String[] args) throws Exception {try{__CLR4_4_1k24k24lgchorm5.R.inc(26023);
        __CLR4_4_1k24k24lgchorm5.R.inc(26024);TestDateTimeZone TB = new TestDateTimeZone();
        __CLR4_4_1k24k24lgchorm5.R.inc(26025);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26026);TB.testDefault();
        __CLR4_4_1k24k24lgchorm5.R.inc(26027);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26028);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26029);TB.testDefaultSecurity();
        __CLR4_4_1k24k24lgchorm5.R.inc(26030);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26031);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26032);TB.testForID_String();
        __CLR4_4_1k24k24lgchorm5.R.inc(26033);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26034);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26035);TB.testForID_String_old();
        __CLR4_4_1k24k24lgchorm5.R.inc(26036);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26037);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26038);TB.testForOffsetHours_int();
        __CLR4_4_1k24k24lgchorm5.R.inc(26039);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26040);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26041);TB.testForOffsetHoursMinutes_int_int();
        __CLR4_4_1k24k24lgchorm5.R.inc(26042);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26043);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26044);TB.testForOffsetMillis_int();
        __CLR4_4_1k24k24lgchorm5.R.inc(26045);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26046);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26047);TB.testForTimeZone_TimeZone();
        __CLR4_4_1k24k24lgchorm5.R.inc(26048);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26049);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26050);TB.testFromTimeZoneInvalid();
        __CLR4_4_1k24k24lgchorm5.R.inc(26051);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26052);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26053);TB.testTimeZoneConversion();
        __CLR4_4_1k24k24lgchorm5.R.inc(26054);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26055);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26056);TB.testGetAvailableIDs();
        __CLR4_4_1k24k24lgchorm5.R.inc(26057);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26058);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26059);TB.testProvider();
        __CLR4_4_1k24k24lgchorm5.R.inc(26060);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26061);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26062);TB.testProvider_badClassName();
        __CLR4_4_1k24k24lgchorm5.R.inc(26063);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26064);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26065);TB.testProviderSecurity();
        __CLR4_4_1k24k24lgchorm5.R.inc(26066);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26067);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26068);TB.testZoneInfoProviderResourceLoading();
        __CLR4_4_1k24k24lgchorm5.R.inc(26069);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26070);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26071);TB.testNameProvider();
        __CLR4_4_1k24k24lgchorm5.R.inc(26072);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26073);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26074);TB.testNameProvider_badClassName();
        __CLR4_4_1k24k24lgchorm5.R.inc(26075);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26076);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26077);TB.testNameProviderSecurity();
        __CLR4_4_1k24k24lgchorm5.R.inc(26078);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26079);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26080);TB.testConstructor();
        __CLR4_4_1k24k24lgchorm5.R.inc(26081);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26082);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26083);TB.testGetID();
        __CLR4_4_1k24k24lgchorm5.R.inc(26084);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26085);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26086);TB.testGetNameKey();
        __CLR4_4_1k24k24lgchorm5.R.inc(26087);TB.tearDown();
        //TB.setUp(); TB.testGetShortName(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testGetShortName_berlin(); TB.tearDown();  //Method code too large!
        __CLR4_4_1k24k24lgchorm5.R.inc(26088);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26089);TB.testGetShortNameProviderName();
        __CLR4_4_1k24k24lgchorm5.R.inc(26090);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26091);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26092);TB.testGetShortNameNullKey();
        __CLR4_4_1k24k24lgchorm5.R.inc(26093);TB.tearDown();
        //TB.setUp(); TB.testGetName(); TB.tearDown();  //Method code too large!

        __CLR4_4_1k24k24lgchorm5.R.inc(26094);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26095);TB.testGetNameProviderName();
        __CLR4_4_1k24k24lgchorm5.R.inc(26096);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26097);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26098);TB.testGetNameNullKey();
        __CLR4_4_1k24k24lgchorm5.R.inc(26099);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26100);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26101);TB.testGetOffset_long();
        __CLR4_4_1k24k24lgchorm5.R.inc(26102);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26103);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26104);TB.testGetOffset_RI();
        __CLR4_4_1k24k24lgchorm5.R.inc(26105);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26106);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26107);TB.testGetOffsetFixed();
        __CLR4_4_1k24k24lgchorm5.R.inc(26108);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26109);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26110);TB.testGetOffsetFixed_RI();
        __CLR4_4_1k24k24lgchorm5.R.inc(26111);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26112);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26113);TB.testGetMillisKeepLocal();
        __CLR4_4_1k24k24lgchorm5.R.inc(26114);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26115);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26116);TB.testIsFixed();
        __CLR4_4_1k24k24lgchorm5.R.inc(26117);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26118);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26119);TB.testTransitionFixed();
        __CLR4_4_1k24k24lgchorm5.R.inc(26120);TB.tearDown();
//    TB.setUp(); TB.testIsLocalDateTimeOverlap_Berlin(); TB.tearDown();  //commented in original code
//    TB.setUp(); TB.testIsLocalDateTimeOverlap_NewYork(); TB.tearDown(); //commented in original code
        __CLR4_4_1k24k24lgchorm5.R.inc(26121);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26122);TB.testIsLocalDateTimeGap_Berlin();
        __CLR4_4_1k24k24lgchorm5.R.inc(26123);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26124);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26125);TB.testIsLocalDateTimeGap_NewYork();
        __CLR4_4_1k24k24lgchorm5.R.inc(26126);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26127);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26128);TB.testToTimeZone();
        __CLR4_4_1k24k24lgchorm5.R.inc(26129);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26130);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26131);TB.testEqualsHashCode();
        __CLR4_4_1k24k24lgchorm5.R.inc(26132);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26133);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26134);TB.testToString();
        __CLR4_4_1k24k24lgchorm5.R.inc(26135);TB.tearDown();
        //TB.setUp(); TB.testDublin(); TB.tearDown();  //Method code too large!
        __CLR4_4_1k24k24lgchorm5.R.inc(26136);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26137);TB.testWindhoek();
        __CLR4_4_1k24k24lgchorm5.R.inc(26138);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26139);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26140);TB.testToronto();
        __CLR4_4_1k24k24lgchorm5.R.inc(26141);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26142);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26143);TB.testJerusalem();
        __CLR4_4_1k24k24lgchorm5.R.inc(26144);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26145);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26146);TB.testSerialization1();
        __CLR4_4_1k24k24lgchorm5.R.inc(26147);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26148);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26149);TB.testSerialization2();
        __CLR4_4_1k24k24lgchorm5.R.inc(26150);TB.tearDown();
        __CLR4_4_1k24k24lgchorm5.R.inc(26151);TB.setUp();
        __CLR4_4_1k24k24lgchorm5.R.inc(26152);TB.testCommentParse();
        __CLR4_4_1k24k24lgchorm5.R.inc(26153);TB.tearDown();
        //TB.setUp(); TB.testPatchedNameKeysLondon(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testPatchedNameKeysSydney(); TB.tearDown();  //Method code too large!
        //TB.setUp(); TB.testPatchedNameKeysSydneyHistoric(); TB.tearDown(); //Method code too large!
        //TB.setUp(); TB.testPatchedNameKeysGazaHistoric(); TB.tearDown(); //Method code too large!
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeZone.class);
    }

    public TestDateTimeZone(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1k24k24lgchorm5.R.inc(26154);
        __CLR4_4_1k24k24lgchorm5.R.inc(26155);locale = Locale.getDefault();
        __CLR4_4_1k24k24lgchorm5.R.inc(26156);zone = DateTimeZone.getDefault();
        __CLR4_4_1k24k24lgchorm5.R.inc(26157);Locale.setDefault(Locale.UK);
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1k24k24lgchorm5.R.inc(26158);
        __CLR4_4_1k24k24lgchorm5.R.inc(26159);Locale.setDefault(locale);
        __CLR4_4_1k24k24lgchorm5.R.inc(26160);DateTimeZone.setDefault(zone);
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDefault() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xwf06uk6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xwf06uk6p(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26161);
        __CLR4_4_1k24k24lgchorm5.R.inc(26162);assertNotNull(DateTimeZone.getDefault());

        __CLR4_4_1k24k24lgchorm5.R.inc(26163);DateTimeZone.setDefault(PARIS);
        __CLR4_4_1k24k24lgchorm5.R.inc(26164);assertSame(PARIS, DateTimeZone.getDefault());

        __CLR4_4_1k24k24lgchorm5.R.inc(26165);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26166);DateTimeZone.setDefault(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26167);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testDefaultSecurity() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ld1quk6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDefaultSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ld1quk6w(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26168);
        __CLR4_4_1k24k24lgchorm5.R.inc(26169);if ((((OLD_JDK)&&(__CLR4_4_1k24k24lgchorm5.R.iget(26170)!=0|true))||(__CLR4_4_1k24k24lgchorm5.R.iget(26171)==0&false))) {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26172);return;
        }
        }__CLR4_4_1k24k24lgchorm5.R.inc(26173);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26174);Policy.setPolicy(RESTRICT);
            __CLR4_4_1k24k24lgchorm5.R.inc(26175);System.setSecurityManager(new SecurityManager());
            __CLR4_4_1k24k24lgchorm5.R.inc(26176);DateTimeZone.setDefault(PARIS);
            __CLR4_4_1k24k24lgchorm5.R.inc(26177);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26178);System.setSecurityManager(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26179);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForID_String() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cty2zfk78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cty2zfk78(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26180);
        __CLR4_4_1k24k24lgchorm5.R.inc(26181);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID((String) null));

        __CLR4_4_1k24k24lgchorm5.R.inc(26182);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26183);assertEquals("Europe/London", zone.getID());

        __CLR4_4_1k24k24lgchorm5.R.inc(26184);zone = DateTimeZone.forID("UTC");
        __CLR4_4_1k24k24lgchorm5.R.inc(26185);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26186);zone = DateTimeZone.forID("+00:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26187);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26188);zone = DateTimeZone.forID("+00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26189);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26190);zone = DateTimeZone.forID("+01:23");
        __CLR4_4_1k24k24lgchorm5.R.inc(26191);assertEquals("+01:23", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26192);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26193);zone = DateTimeZone.forID("-02:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26194);assertEquals("-02:00", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26195);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR),
                zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26196);zone = DateTimeZone.forID("-07:05:34.0");
        __CLR4_4_1k24k24lgchorm5.R.inc(26197);assertEquals("-07:05:34", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26198);assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) +
                        (-5L * DateTimeConstants.MILLIS_PER_MINUTE) +
                        (-34L * DateTimeConstants.MILLIS_PER_SECOND),
                zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26199);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26200);DateTimeZone.forID("SST");
            __CLR4_4_1k24k24lgchorm5.R.inc(26201);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26202);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26203);DateTimeZone.forID("europe/london");
            __CLR4_4_1k24k24lgchorm5.R.inc(26204);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26205);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26206);DateTimeZone.forID("Europe/UK");
            __CLR4_4_1k24k24lgchorm5.R.inc(26207);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26208);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26209);DateTimeZone.forID("+");
            __CLR4_4_1k24k24lgchorm5.R.inc(26210);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26211);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26212);DateTimeZone.forID("+0");
            __CLR4_4_1k24k24lgchorm5.R.inc(26213);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testForID_String_old() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uw4zk86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForID_String_old",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uw4zk86(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26214);
        __CLR4_4_1k24k24lgchorm5.R.inc(26215);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_4_1k24k24lgchorm5.R.inc(26216);map.put("GMT", "UTC");
        __CLR4_4_1k24k24lgchorm5.R.inc(26217);map.put("WET", "WET");
        __CLR4_4_1k24k24lgchorm5.R.inc(26218);map.put("CET", "CET");
        __CLR4_4_1k24k24lgchorm5.R.inc(26219);map.put("MET", "CET");
        __CLR4_4_1k24k24lgchorm5.R.inc(26220);map.put("ECT", "CET");
        __CLR4_4_1k24k24lgchorm5.R.inc(26221);map.put("EET", "EET");
        __CLR4_4_1k24k24lgchorm5.R.inc(26222);map.put("MIT", "Pacific/Apia");
        __CLR4_4_1k24k24lgchorm5.R.inc(26223);map.put("HST", "Pacific/Honolulu");
        __CLR4_4_1k24k24lgchorm5.R.inc(26224);map.put("AST", "America/Anchorage");
        __CLR4_4_1k24k24lgchorm5.R.inc(26225);map.put("PST", "America/Los_Angeles");
        __CLR4_4_1k24k24lgchorm5.R.inc(26226);map.put("MST", "America/Denver");
        __CLR4_4_1k24k24lgchorm5.R.inc(26227);map.put("PNT", "America/Phoenix");
        __CLR4_4_1k24k24lgchorm5.R.inc(26228);map.put("CST", "America/Chicago");
        __CLR4_4_1k24k24lgchorm5.R.inc(26229);map.put("EST", "America/New_York");
        __CLR4_4_1k24k24lgchorm5.R.inc(26230);map.put("IET", "America/Indiana/Indianapolis");
        __CLR4_4_1k24k24lgchorm5.R.inc(26231);map.put("PRT", "America/Puerto_Rico");
        __CLR4_4_1k24k24lgchorm5.R.inc(26232);map.put("CNT", "America/St_Johns");
        __CLR4_4_1k24k24lgchorm5.R.inc(26233);map.put("AGT", "America/Argentina/Buenos_Aires");
        __CLR4_4_1k24k24lgchorm5.R.inc(26234);map.put("BET", "America/Sao_Paulo");
        __CLR4_4_1k24k24lgchorm5.R.inc(26235);map.put("ART", "Africa/Cairo");
        __CLR4_4_1k24k24lgchorm5.R.inc(26236);map.put("CAT", "Africa/Harare");
        __CLR4_4_1k24k24lgchorm5.R.inc(26237);map.put("EAT", "Africa/Addis_Ababa");
        __CLR4_4_1k24k24lgchorm5.R.inc(26238);map.put("NET", "Asia/Yerevan");
        __CLR4_4_1k24k24lgchorm5.R.inc(26239);map.put("PLT", "Asia/Karachi");
        __CLR4_4_1k24k24lgchorm5.R.inc(26240);map.put("IST", "Asia/Kolkata");
        __CLR4_4_1k24k24lgchorm5.R.inc(26241);map.put("BST", "Asia/Dhaka");
        __CLR4_4_1k24k24lgchorm5.R.inc(26242);map.put("VST", "Asia/Ho_Chi_Minh");
        __CLR4_4_1k24k24lgchorm5.R.inc(26243);map.put("CTT", "Asia/Shanghai");
        __CLR4_4_1k24k24lgchorm5.R.inc(26244);map.put("JST", "Asia/Tokyo");
        __CLR4_4_1k24k24lgchorm5.R.inc(26245);map.put("ACT", "Australia/Darwin");
        __CLR4_4_1k24k24lgchorm5.R.inc(26246);map.put("AET", "Australia/Sydney");
        __CLR4_4_1k24k24lgchorm5.R.inc(26247);map.put("SST", "Pacific/Guadalcanal");
        __CLR4_4_1k24k24lgchorm5.R.inc(26248);map.put("NST", "Pacific/Auckland");
        __CLR4_4_1k24k24lgchorm5.R.inc(26249);for (String key : map.keySet()) {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26250);String value = map.get(key);
            __CLR4_4_1k24k24lgchorm5.R.inc(26251);TimeZone juZone = TimeZone.getTimeZone(key);
            __CLR4_4_1k24k24lgchorm5.R.inc(26252);DateTimeZone zone = DateTimeZone.forTimeZone(juZone);
            __CLR4_4_1k24k24lgchorm5.R.inc(26253);assertEquals(DateTimeZone.forID(value), zone);
//            System.out.println(juZone);
//            System.out.println(juZone.getDisplayName());
//            System.out.println(zone);
//            System.out.println("------");
        }
        // gee thanks time-zone db maintainer for damaging the database
        // and breaking the long-standing  association with CAT/EAT
    }}finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForOffsetHours_int() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171l9vgk9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHours_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171l9vgk9a(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26254);
        __CLR4_4_1k24k24lgchorm5.R.inc(26255);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
        __CLR4_4_1k24k24lgchorm5.R.inc(26256);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetHours(3));
        __CLR4_4_1k24k24lgchorm5.R.inc(26257);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHours(-2));
        __CLR4_4_1k24k24lgchorm5.R.inc(26258);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26259);DateTimeZone.forOffsetHours(999999);
            __CLR4_4_1k24k24lgchorm5.R.inc(26260);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForOffsetHoursMinutes_int_int() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vbwink9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetHoursMinutes_int_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vbwink9h(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26261);
        __CLR4_4_1k24k24lgchorm5.R.inc(26262);assertEquals(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
        __CLR4_4_1k24k24lgchorm5.R.inc(26263);assertEquals(DateTimeZone.forID("+23:59"), DateTimeZone.forOffsetHoursMinutes(23, 59));

        __CLR4_4_1k24k24lgchorm5.R.inc(26264);assertEquals(DateTimeZone.forID("+02:15"), DateTimeZone.forOffsetHoursMinutes(2, 15));
        __CLR4_4_1k24k24lgchorm5.R.inc(26265);assertEquals(DateTimeZone.forID("+02:00"), DateTimeZone.forOffsetHoursMinutes(2, 0));
        __CLR4_4_1k24k24lgchorm5.R.inc(26266);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26267);DateTimeZone.forOffsetHoursMinutes(2, -15);
            __CLR4_4_1k24k24lgchorm5.R.inc(26268);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_1k24k24lgchorm5.R.inc(26269);assertEquals(DateTimeZone.forID("+00:15"), DateTimeZone.forOffsetHoursMinutes(0, 15));
        __CLR4_4_1k24k24lgchorm5.R.inc(26270);assertEquals(DateTimeZone.forID("+00:00"), DateTimeZone.forOffsetHoursMinutes(0, 0));
        __CLR4_4_1k24k24lgchorm5.R.inc(26271);assertEquals(DateTimeZone.forID("-00:15"), DateTimeZone.forOffsetHoursMinutes(0, -15));

        __CLR4_4_1k24k24lgchorm5.R.inc(26272);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetHoursMinutes(-2, 0));
        __CLR4_4_1k24k24lgchorm5.R.inc(26273);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, -15));
        __CLR4_4_1k24k24lgchorm5.R.inc(26274);assertEquals(DateTimeZone.forID("-02:15"), DateTimeZone.forOffsetHoursMinutes(-2, 15));

        __CLR4_4_1k24k24lgchorm5.R.inc(26275);assertEquals(DateTimeZone.forID("-23:59"), DateTimeZone.forOffsetHoursMinutes(-23, 59));
        __CLR4_4_1k24k24lgchorm5.R.inc(26276);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26277);DateTimeZone.forOffsetHoursMinutes(2, 60);
            __CLR4_4_1k24k24lgchorm5.R.inc(26278);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26279);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26280);DateTimeZone.forOffsetHoursMinutes(-2, 60);
            __CLR4_4_1k24k24lgchorm5.R.inc(26281);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26282);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26283);DateTimeZone.forOffsetHoursMinutes(24, 0);
            __CLR4_4_1k24k24lgchorm5.R.inc(26284);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26285);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26286);DateTimeZone.forOffsetHoursMinutes(-24, 0);
            __CLR4_4_1k24k24lgchorm5.R.inc(26287);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForOffsetMillis_int() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd46g7ka8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForOffsetMillis_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd46g7ka8(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26288);
        __CLR4_4_1k24k24lgchorm5.R.inc(26289);assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
        __CLR4_4_1k24k24lgchorm5.R.inc(26290);assertEquals(DateTimeZone.forID("+23:59:59.999"), DateTimeZone.forOffsetMillis((24 * 60 * 60 * 1000) - 1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26291);assertEquals(DateTimeZone.forID("+03:00"), DateTimeZone.forOffsetMillis(3 * 60 * 60 * 1000));
        __CLR4_4_1k24k24lgchorm5.R.inc(26292);assertEquals(DateTimeZone.forID("-02:00"), DateTimeZone.forOffsetMillis(-2 * 60 * 60 * 1000));
        __CLR4_4_1k24k24lgchorm5.R.inc(26293);assertEquals(DateTimeZone.forID("-23:59:59.999"), DateTimeZone.forOffsetMillis((-24 * 60 * 60 * 1000) + 1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26294);assertEquals(DateTimeZone.forID("+04:45:17.045"),
                DateTimeZone.forOffsetMillis(
                        4 * 60 * 60 * 1000 + 45 * 60 * 1000 + 17 * 1000 + 45));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testForTimeZone_TimeZone() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1by9ru9kaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testForTimeZone_TimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1by9ru9kaf(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26295);
        __CLR4_4_1k24k24lgchorm5.R.inc(26296);assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone((TimeZone) null));

        __CLR4_4_1k24k24lgchorm5.R.inc(26297);DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("Europe/London"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26298);assertEquals("Europe/London", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26299);assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));

        __CLR4_4_1k24k24lgchorm5.R.inc(26300);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("+00:00"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26301);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26302);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26303);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26304);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26305);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26306);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+00"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26307);assertSame(DateTimeZone.UTC, zone);

        __CLR4_4_1k24k24lgchorm5.R.inc(26308);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+01:23"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26309);assertEquals("+01:23", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26310);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26311);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+1:23"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26312);assertEquals("+01:23", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26313);assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE),
                zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26314);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-02:00"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26315);assertEquals("-02:00", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26316);assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26317);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+2"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26318);assertEquals("+02:00", zone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26319);assertEquals((2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26320);zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26321);assertEquals("America/New_York", zone.getID());

        __CLR4_4_1k24k24lgchorm5.R.inc(26322);TimeZone tz = TimeZone.getTimeZone("GMT-08:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26323);tz.setID("GMT-\u0660\u0668:\u0660\u0660");
        __CLR4_4_1k24k24lgchorm5.R.inc(26324);zone = DateTimeZone.forTimeZone(tz);
        __CLR4_4_1k24k24lgchorm5.R.inc(26325);assertEquals("-08:00", zone.getID());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testFromTimeZoneInvalid() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ncyaaxkba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testFromTimeZoneInvalid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ncyaaxkba() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26326);
        __CLR4_4_1k24k24lgchorm5.R.inc(26327);TimeZone jdkZone = new TimeZone() {
            private static final long serialVersionUID = 1L;

            @Override
            public String getID() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26328);
                __CLR4_4_1k24k24lgchorm5.R.inc(26329);return null;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26330);
                __CLR4_4_1k24k24lgchorm5.R.inc(26331);return 0;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            @Override
            public void setRawOffset(int offsetMillis) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26332);
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            @Override
            public int getRawOffset() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26333);
                __CLR4_4_1k24k24lgchorm5.R.inc(26334);return 0;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            @Override
            public boolean useDaylightTime() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26335);
                __CLR4_4_1k24k24lgchorm5.R.inc(26336);return false;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

            @Override
            public boolean inDaylightTime(Date date) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26337);
                __CLR4_4_1k24k24lgchorm5.R.inc(26338);return false;
            }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
        };
        __CLR4_4_1k24k24lgchorm5.R.inc(26339);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26340);DateTimeZone.forTimeZone(jdkZone);
            __CLR4_4_1k24k24lgchorm5.R.inc(26341);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testTimeZoneConversion() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ipqkrckbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testTimeZoneConversion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ipqkrckbq(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26342);
        __CLR4_4_1k24k24lgchorm5.R.inc(26343);TimeZone jdkTimeZone = TimeZone.getTimeZone("GMT-10");
        __CLR4_4_1k24k24lgchorm5.R.inc(26344);assertEquals("GMT-10:00", jdkTimeZone.getID());

        __CLR4_4_1k24k24lgchorm5.R.inc(26345);DateTimeZone jodaTimeZone = DateTimeZone.forTimeZone(jdkTimeZone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26346);assertEquals("-10:00", jodaTimeZone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26347);assertEquals(jdkTimeZone.getRawOffset(), jodaTimeZone.getOffset(0L));

        __CLR4_4_1k24k24lgchorm5.R.inc(26348);TimeZone convertedTimeZone = jodaTimeZone.toTimeZone();
        __CLR4_4_1k24k24lgchorm5.R.inc(26349);assertEquals("GMT-10:00", jdkTimeZone.getID());

        __CLR4_4_1k24k24lgchorm5.R.inc(26350);assertEquals(jdkTimeZone.getID(), convertedTimeZone.getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26351);assertEquals(jdkTimeZone.getRawOffset(), convertedTimeZone.getRawOffset());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetAvailableIDs() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mu0qeykc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetAvailableIDs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mu0qeykc0(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26352);
        __CLR4_4_1k24k24lgchorm5.R.inc(26353);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testProvider() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w4ayd2kc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w4ayd2kc2(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26354);
        __CLR4_4_1k24k24lgchorm5.R.inc(26355);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26356);assertNotNull(DateTimeZone.getProvider());

            __CLR4_4_1k24k24lgchorm5.R.inc(26357);Provider provider = DateTimeZone.getProvider();
            __CLR4_4_1k24k24lgchorm5.R.inc(26358);DateTimeZone.setProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26359);assertEquals(provider.getClass(), DateTimeZone.getProvider().getClass());

            __CLR4_4_1k24k24lgchorm5.R.inc(26360);try {
                __CLR4_4_1k24k24lgchorm5.R.inc(26361);DateTimeZone.setProvider(new MockNullIDSProvider());
                __CLR4_4_1k24k24lgchorm5.R.inc(26362);fail();
            } catch (IllegalArgumentException ex) {
            }
            __CLR4_4_1k24k24lgchorm5.R.inc(26363);try {
                __CLR4_4_1k24k24lgchorm5.R.inc(26364);DateTimeZone.setProvider(new MockEmptyIDSProvider());
                __CLR4_4_1k24k24lgchorm5.R.inc(26365);fail();
            } catch (IllegalArgumentException ex) {
            }
            __CLR4_4_1k24k24lgchorm5.R.inc(26366);try {
                __CLR4_4_1k24k24lgchorm5.R.inc(26367);DateTimeZone.setProvider(new MockNoUTCProvider());
                __CLR4_4_1k24k24lgchorm5.R.inc(26368);fail();
            } catch (IllegalArgumentException ex) {
            }
            __CLR4_4_1k24k24lgchorm5.R.inc(26369);try {
                __CLR4_4_1k24k24lgchorm5.R.inc(26370);DateTimeZone.setProvider(new MockBadUTCProvider());
                __CLR4_4_1k24k24lgchorm5.R.inc(26371);fail();
            } catch (IllegalArgumentException ex) {
            }

            __CLR4_4_1k24k24lgchorm5.R.inc(26372);Provider prov = new MockOKProvider();
            __CLR4_4_1k24k24lgchorm5.R.inc(26373);DateTimeZone.setProvider(prov);
            __CLR4_4_1k24k24lgchorm5.R.inc(26374);assertSame(prov, DateTimeZone.getProvider());
            __CLR4_4_1k24k24lgchorm5.R.inc(26375);assertEquals(2, DateTimeZone.getAvailableIDs().size());
            __CLR4_4_1k24k24lgchorm5.R.inc(26376);assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
            __CLR4_4_1k24k24lgchorm5.R.inc(26377);assertTrue(DateTimeZone.getAvailableIDs().contains("Europe/London"));
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26378);DateTimeZone.setProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26379);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        }

        __CLR4_4_1k24k24lgchorm5.R.inc(26380);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26381);System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.tz.UTCProvider");
            __CLR4_4_1k24k24lgchorm5.R.inc(26382);DateTimeZone.setProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26383);assertEquals(UTCProvider.class, DateTimeZone.getProvider().getClass());
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26384);System.getProperties().remove("org.joda.time.DateTimeZone.Provider");
            __CLR4_4_1k24k24lgchorm5.R.inc(26385);DateTimeZone.setProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26386);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        }

        __CLR4_4_1k24k24lgchorm5.R.inc(26387);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26388);System.setProperty("org.joda.time.DateTimeZone.Folder", "src/test/resources/tzdata");
            __CLR4_4_1k24k24lgchorm5.R.inc(26389);DateTimeZone.setProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26390);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
            __CLR4_4_1k24k24lgchorm5.R.inc(26391);assertEquals(2, DateTimeZone.getAvailableIDs().size());
            __CLR4_4_1k24k24lgchorm5.R.inc(26392);assertEquals(true, DateTimeZone.getAvailableIDs().contains("UTC"));
            __CLR4_4_1k24k24lgchorm5.R.inc(26393);assertEquals(true, DateTimeZone.getAvailableIDs().contains("CET"));

        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26394);System.getProperties().remove("org.joda.time.DateTimeZone.Folder");
            __CLR4_4_1k24k24lgchorm5.R.inc(26395);DateTimeZone.setProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26396);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
            __CLR4_4_1k24k24lgchorm5.R.inc(26397);assertEquals(true, DateTimeZone.getAvailableIDs().size() > 2);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testProvider_badClassName() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16r4ke7kda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProvider_badClassName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16r4ke7kda(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26398);
        __CLR4_4_1k24k24lgchorm5.R.inc(26399);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26400);System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx");
            __CLR4_4_1k24k24lgchorm5.R.inc(26401);DateTimeZone.setProvider(null);

        } catch (RuntimeException ex) {
            // expected
            __CLR4_4_1k24k24lgchorm5.R.inc(26402);assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass());
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26403);System.getProperties().remove("org.joda.time.DateTimeZone.Provider");
            __CLR4_4_1k24k24lgchorm5.R.inc(26404);DateTimeZone.setProvider(null);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testProviderSecurity() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttojxmkdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testProviderSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttojxmkdh(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26405);
        __CLR4_4_1k24k24lgchorm5.R.inc(26406);if ((((OLD_JDK)&&(__CLR4_4_1k24k24lgchorm5.R.iget(26407)!=0|true))||(__CLR4_4_1k24k24lgchorm5.R.iget(26408)==0&false))) {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26409);return;
        }
        }__CLR4_4_1k24k24lgchorm5.R.inc(26410);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26411);Policy.setPolicy(RESTRICT);
            __CLR4_4_1k24k24lgchorm5.R.inc(26412);System.setSecurityManager(new SecurityManager());
            __CLR4_4_1k24k24lgchorm5.R.inc(26413);DateTimeZone.setProvider(new MockOKProvider());
            __CLR4_4_1k24k24lgchorm5.R.inc(26414);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26415);System.setSecurityManager(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26416);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testZoneInfoProviderResourceLoading() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xr0fbckdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testZoneInfoProviderResourceLoading",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xr0fbckdt(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26417);
        __CLR4_4_1k24k24lgchorm5.R.inc(26418);final Set<String> ids = new HashSet<String>(DateTimeZone.getAvailableIDs());
        __CLR4_4_1k24k24lgchorm5.R.inc(26419);ids.remove(DateTimeZone.getDefault().getID());
        __CLR4_4_1k24k24lgchorm5.R.inc(26420);final String id = ids.toArray(new String[ids.size()])[new Random().nextInt(ids.size())];
        __CLR4_4_1k24k24lgchorm5.R.inc(26421);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26422);Policy.setPolicy(new Policy() {
                @Override
                public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26423);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26424);Permissions p = new Permissions();
                    __CLR4_4_1k24k24lgchorm5.R.inc(26425);p.add(new AllPermission());  // enable everything
                    __CLR4_4_1k24k24lgchorm5.R.inc(26426);return p;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                @Override
                public void refresh() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26427);
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                @Override
                public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26428);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26429);return !(permission instanceof FilePermission) && !permission.getName().contains(id);
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
            });
            __CLR4_4_1k24k24lgchorm5.R.inc(26430);System.setSecurityManager(new SecurityManager());
            // will throw IllegalArgumentException if the resource can
            // not be loaded
            __CLR4_4_1k24k24lgchorm5.R.inc(26431);final DateTimeZone zone = DateTimeZone.forID(id);
            __CLR4_4_1k24k24lgchorm5.R.inc(26432);assertNotNull(zone);
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26433);System.setSecurityManager(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26434);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    static class MockNullIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26435);
            __CLR4_4_1k24k24lgchorm5.R.inc(26436);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public DateTimeZone getZone(String id) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26437);
            __CLR4_4_1k24k24lgchorm5.R.inc(26438);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    static class MockEmptyIDSProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26439);
            __CLR4_4_1k24k24lgchorm5.R.inc(26440);return new HashSet();
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public DateTimeZone getZone(String id) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26441);
            __CLR4_4_1k24k24lgchorm5.R.inc(26442);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    static class MockNoUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26443);
            __CLR4_4_1k24k24lgchorm5.R.inc(26444);Set set = new HashSet();
            __CLR4_4_1k24k24lgchorm5.R.inc(26445);set.add("Europe/London");
            __CLR4_4_1k24k24lgchorm5.R.inc(26446);return set;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public DateTimeZone getZone(String id) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26447);
            __CLR4_4_1k24k24lgchorm5.R.inc(26448);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    static class MockBadUTCProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26449);
            __CLR4_4_1k24k24lgchorm5.R.inc(26450);Set set = new HashSet();
            __CLR4_4_1k24k24lgchorm5.R.inc(26451);set.add("UTC");
            __CLR4_4_1k24k24lgchorm5.R.inc(26452);set.add("Europe/London");
            __CLR4_4_1k24k24lgchorm5.R.inc(26453);return set;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public DateTimeZone getZone(String id) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26454);
            __CLR4_4_1k24k24lgchorm5.R.inc(26455);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    static class MockOKProvider implements Provider {
        public Set getAvailableIDs() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26456);
            __CLR4_4_1k24k24lgchorm5.R.inc(26457);Set set = new HashSet();
            __CLR4_4_1k24k24lgchorm5.R.inc(26458);set.add("UTC");
            __CLR4_4_1k24k24lgchorm5.R.inc(26459);set.add("Europe/London");
            __CLR4_4_1k24k24lgchorm5.R.inc(26460);return set;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public DateTimeZone getZone(String id) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26461);
            __CLR4_4_1k24k24lgchorm5.R.inc(26462);return DateTimeZone.UTC;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testNameProvider() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggyvxnkf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggyvxnkf3(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26463);
        __CLR4_4_1k24k24lgchorm5.R.inc(26464);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26465);assertNotNull(DateTimeZone.getNameProvider());

            __CLR4_4_1k24k24lgchorm5.R.inc(26466);NameProvider provider = DateTimeZone.getNameProvider();
            __CLR4_4_1k24k24lgchorm5.R.inc(26467);DateTimeZone.setNameProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26468);assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass());

            __CLR4_4_1k24k24lgchorm5.R.inc(26469);provider = new MockOKButNullNameProvider();
            __CLR4_4_1k24k24lgchorm5.R.inc(26470);DateTimeZone.setNameProvider(provider);
            __CLR4_4_1k24k24lgchorm5.R.inc(26471);assertSame(provider, DateTimeZone.getNameProvider());

            __CLR4_4_1k24k24lgchorm5.R.inc(26472);assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER));
            __CLR4_4_1k24k24lgchorm5.R.inc(26473);assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER));
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26474);DateTimeZone.setNameProvider(null);
        }

        __CLR4_4_1k24k24lgchorm5.R.inc(26475);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26476);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider");
            __CLR4_4_1k24k24lgchorm5.R.inc(26477);DateTimeZone.setNameProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26478);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26479);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider");
            __CLR4_4_1k24k24lgchorm5.R.inc(26480);DateTimeZone.setNameProvider(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26481);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testNameProvider_badClassName() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1meizsakfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProvider_badClassName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1meizsakfm(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26482);
        __CLR4_4_1k24k24lgchorm5.R.inc(26483);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26484);System.setProperty("org.joda.time.DateTimeZone.NameProvider", "xxx");
            __CLR4_4_1k24k24lgchorm5.R.inc(26485);DateTimeZone.setProvider(null);

        } catch (RuntimeException ex) {
            // expected
            __CLR4_4_1k24k24lgchorm5.R.inc(26486);assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass());
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26487);System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider");
            __CLR4_4_1k24k24lgchorm5.R.inc(26488);DateTimeZone.setProvider(null);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testNameProviderSecurity() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdjynpkft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testNameProviderSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdjynpkft(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26489);
        __CLR4_4_1k24k24lgchorm5.R.inc(26490);if ((((OLD_JDK)&&(__CLR4_4_1k24k24lgchorm5.R.iget(26491)!=0|true))||(__CLR4_4_1k24k24lgchorm5.R.iget(26492)==0&false))) {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26493);return;
        }
        }__CLR4_4_1k24k24lgchorm5.R.inc(26494);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26495);Policy.setPolicy(RESTRICT);
            __CLR4_4_1k24k24lgchorm5.R.inc(26496);System.setSecurityManager(new SecurityManager());
            __CLR4_4_1k24k24lgchorm5.R.inc(26497);DateTimeZone.setNameProvider(new MockOKButNullNameProvider());
            __CLR4_4_1k24k24lgchorm5.R.inc(26498);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26499);System.setSecurityManager(null);
            __CLR4_4_1k24k24lgchorm5.R.inc(26500);Policy.setPolicy(ALLOW);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    static class MockOKButNullNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26501);
            __CLR4_4_1k24k24lgchorm5.R.inc(26502);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26503);
            __CLR4_4_1k24k24lgchorm5.R.inc(26504);return null;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hkg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hkg9(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26505);
        __CLR4_4_1k24k24lgchorm5.R.inc(26506);assertEquals(1, DateTimeZone.class.getDeclaredConstructors().length);
        __CLR4_4_1k24k24lgchorm5.R.inc(26507);assertTrue(Modifier.isProtected(DateTimeZone.class.getDeclaredConstructors()[0].getModifiers()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26508);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26509);new DateTimeZone(null) {
                public String getNameKey(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26510);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26511);return null;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                public int getOffset(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26512);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26513);return 0;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                public int getStandardOffset(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26514);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26515);return 0;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                public boolean isFixed() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26516);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26517);return false;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                public long nextTransition(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26518);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26519);return 0;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                public long previousTransition(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26520);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26521);return 0;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

                public boolean equals(Object object) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26522);
                    __CLR4_4_1k24k24lgchorm5.R.inc(26523);return false;
                }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
            };
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetID() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nau9sqkgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetID",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nau9sqkgs(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26524);
        __CLR4_4_1k24k24lgchorm5.R.inc(26525);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26526);assertEquals("Europe/Paris", zone.getID());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetNameKey() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaxst3kgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaxst3kgv(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26527);
        __CLR4_4_1k24k24lgchorm5.R.inc(26528);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26529);assertEquals("BST", zone.getNameKey(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26530);assertEquals("GMT", zone.getNameKey(TEST_TIME_WINTER));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    static final boolean JDK6PLUS;

    static {try{__CLR4_4_1k24k24lgchorm5.R.inc(26531);
        __CLR4_4_1k24k24lgchorm5.R.inc(26532);boolean jdk6 = true;
        __CLR4_4_1k24k24lgchorm5.R.inc(26533);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26534);DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class});
        } catch (Exception ex) {
            __CLR4_4_1k24k24lgchorm5.R.inc(26535);jdk6 = false;
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26536);JDK6PLUS = jdk6;
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    static final boolean JDK9;

    static {try{__CLR4_4_1k24k24lgchorm5.R.inc(26537);
        __CLR4_4_1k24k24lgchorm5.R.inc(26538);boolean jdk9 = true;
        __CLR4_4_1k24k24lgchorm5.R.inc(26539);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26540);String str = System.getProperty("java.version");
            __CLR4_4_1k24k24lgchorm5.R.inc(26541);jdk9 = str.startsWith("9");
        } catch (Exception ex) {
            __CLR4_4_1k24k24lgchorm5.R.inc(26542);jdk9 = false;
        }
        __CLR4_4_1k24k24lgchorm5.R.inc(26543);JDK9 = jdk9;
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testGetShortName() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y7sb9mkhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y7sb9mkhc(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26544);
        __CLR4_4_1k24k24lgchorm5.R.inc(26545);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26546);assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26547);assertEquals("GMT", zone.getShortName(TEST_TIME_WINTER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26548);assertEquals("BST", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testGetShortName_berlin() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f64lhhkhh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortName_berlin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f64lhhkhh(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26549);
        __CLR4_4_1k24k24lgchorm5.R.inc(26550);DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
        __CLR4_4_1k24k24lgchorm5.R.inc(26551);assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.ENGLISH));
        __CLR4_4_1k24k24lgchorm5.R.inc(26552);assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
        __CLR4_4_1k24k24lgchorm5.R.inc(26553);if ((((JDK6PLUS)&&(__CLR4_4_1k24k24lgchorm5.R.iget(26554)!=0|true))||(__CLR4_4_1k24k24lgchorm5.R.iget(26555)==0&false))) {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26556);assertEquals("MEZ", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
            __CLR4_4_1k24k24lgchorm5.R.inc(26557);assertEquals("MESZ", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
        } }else {{
            __CLR4_4_1k24k24lgchorm5.R.inc(26558);assertEquals("CET", berlin.getShortName(TEST_TIME_WINTER, Locale.GERMAN));
            __CLR4_4_1k24k24lgchorm5.R.inc(26559);assertEquals("CEST", berlin.getShortName(TEST_TIME_SUMMER, Locale.GERMAN));
        }
    }}finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetShortNameProviderName() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hqz7wakhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameProviderName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hqz7wakhs(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26560);
        __CLR4_4_1k24k24lgchorm5.R.inc(26561);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, "Europe/London", "BST"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26562);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, null, "BST"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26563);assertEquals(null, DateTimeZone.getNameProvider().getShortName(Locale.ENGLISH, "Europe/London", null));
        __CLR4_4_1k24k24lgchorm5.R.inc(26564);assertEquals(null, DateTimeZone.getNameProvider().getShortName(null, null, null));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetShortNameNullKey() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3azz8khx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetShortNameNullKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3azz8khx(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26565);
        __CLR4_4_1k24k24lgchorm5.R.inc(26566);DateTimeZone zone = new MockDateTimeZone("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26567);assertEquals("Europe/London", zone.getShortName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testGetName() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yb2b9mki0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yb2b9mki0(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26568);
        __CLR4_4_1k24k24lgchorm5.R.inc(26569);DateTimeZone zone = DateTimeZone.forID("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26570);assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26571);assertEquals("Greenwich Mean Time", zone.getName(TEST_TIME_WINTER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26572);assertEquals("British Summer Time", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    /*
        @Test public void testGetName_berlin_english() {
          DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
          if (JDK9) {
              assertEquals("Central European Standard Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
          } else {
              assertEquals("Central European Time", berlin.getName(TEST_TIME_WINTER, Locale.ENGLISH));
          }
          assertEquals("Central European Summer Time", berlin.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
        }

        @Test public void testGetName_berlin_german() {
            DateTimeZone berlin = DateTimeZone.forID("Europe/Berlin");
            if (JDK9) {
                assertEquals("Mitteleurop\u00e4ische Normalzeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
                assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
            } else if (JDK6PLUS) {
                assertEquals("Mitteleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
                assertEquals("Mitteleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
            } else {
                assertEquals("Zentraleurop\u00e4ische Zeit", berlin.getName(TEST_TIME_WINTER, Locale.GERMAN));
                assertEquals("Zentraleurop\u00e4ische Sommerzeit", berlin.getName(TEST_TIME_SUMMER, Locale.GERMAN));
            }
        }
    */
    @Test
    public void testGetNameProviderName() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15si5rmki5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameProviderName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15si5rmki5(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26573);
        __CLR4_4_1k24k24lgchorm5.R.inc(26574);assertEquals(null, DateTimeZone.getNameProvider().getName(null, "Europe/London", "BST"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26575);assertEquals(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, null, "BST"));
        __CLR4_4_1k24k24lgchorm5.R.inc(26576);assertEquals(null, DateTimeZone.getNameProvider().getName(Locale.ENGLISH, "Europe/London", null));
        __CLR4_4_1k24k24lgchorm5.R.inc(26577);assertEquals(null, DateTimeZone.getNameProvider().getName(null, null, null));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetNameNullKey() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5ijxskia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetNameNullKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5ijxskia(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26578);
        __CLR4_4_1k24k24lgchorm5.R.inc(26579);DateTimeZone zone = new MockDateTimeZone("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26580);assertEquals("Europe/London", zone.getName(TEST_TIME_SUMMER, Locale.ENGLISH));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    static class MockDateTimeZone extends DateTimeZone {
        public MockDateTimeZone(String id) {
            super(id);__CLR4_4_1k24k24lgchorm5.R.inc(26582);try{__CLR4_4_1k24k24lgchorm5.R.inc(26581);
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public String getNameKey(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26583);
            __CLR4_4_1k24k24lgchorm5.R.inc(26584);return null;  // null
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public int getOffset(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26585);
            __CLR4_4_1k24k24lgchorm5.R.inc(26586);return 0;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public int getStandardOffset(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26587);
            __CLR4_4_1k24k24lgchorm5.R.inc(26588);return 0;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public boolean isFixed() {try{__CLR4_4_1k24k24lgchorm5.R.inc(26589);
            __CLR4_4_1k24k24lgchorm5.R.inc(26590);return false;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public long nextTransition(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26591);
            __CLR4_4_1k24k24lgchorm5.R.inc(26592);return 0;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public long previousTransition(long instant) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26593);
            __CLR4_4_1k24k24lgchorm5.R.inc(26594);return 0;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

        public boolean equals(Object object) {try{__CLR4_4_1k24k24lgchorm5.R.inc(26595);
            __CLR4_4_1k24k24lgchorm5.R.inc(26596);return false;
        }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetOffset_long() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfybv9kit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_long",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26597,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfybv9kit(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26597);
        __CLR4_4_1k24k24lgchorm5.R.inc(26598);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26599);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26600);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26601);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26602);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26603);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26604);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26605);assertEquals(false, zone.isStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26606);assertEquals(true, zone.isStandardOffset(TEST_TIME_WINTER));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetOffset_RI() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15clxaekj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffset_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15clxaekj3(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26607);
        __CLR4_4_1k24k24lgchorm5.R.inc(26608);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26609);assertEquals(2L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26610);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER)));

        __CLR4_4_1k24k24lgchorm5.R.inc(26611);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetOffsetFixed() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8j0zgkj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffsetFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8j0zgkj8(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26612);
        __CLR4_4_1k24k24lgchorm5.R.inc(26613);DateTimeZone zone = DateTimeZone.forID("+01:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26614);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26615);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(TEST_TIME_WINTER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26616);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26617);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getStandardOffset(TEST_TIME_WINTER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26618);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26619);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffsetFromLocal(TEST_TIME_WINTER));

        __CLR4_4_1k24k24lgchorm5.R.inc(26620);assertEquals(true, zone.isStandardOffset(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26621);assertEquals(true, zone.isStandardOffset(TEST_TIME_WINTER));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testGetOffsetFixed_RI() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1raxneokji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetOffsetFixed_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1raxneokji(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26622);
        __CLR4_4_1k24k24lgchorm5.R.inc(26623);DateTimeZone zone = DateTimeZone.forID("+01:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26624);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_SUMMER)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26625);assertEquals(1L * DateTimeConstants.MILLIS_PER_HOUR, zone.getOffset(new Instant(TEST_TIME_WINTER)));

        __CLR4_4_1k24k24lgchorm5.R.inc(26626);assertEquals(zone.getOffset(DateTimeUtils.currentTimeMillis()), zone.getOffset(null));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMillisKeepLocal() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161hj3xkjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testGetMillisKeepLocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161hj3xkjn(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26627);
        __CLR4_4_1k24k24lgchorm5.R.inc(26628);long millisLondon = TEST_TIME_SUMMER;
        __CLR4_4_1k24k24lgchorm5.R.inc(26629);long millisParis = TEST_TIME_SUMMER - 1L * DateTimeConstants.MILLIS_PER_HOUR;

        __CLR4_4_1k24k24lgchorm5.R.inc(26630);assertEquals(millisLondon, LONDON.getMillisKeepLocal(LONDON, millisLondon));
        __CLR4_4_1k24k24lgchorm5.R.inc(26631);assertEquals(millisParis, LONDON.getMillisKeepLocal(LONDON, millisParis));
        __CLR4_4_1k24k24lgchorm5.R.inc(26632);assertEquals(millisLondon, PARIS.getMillisKeepLocal(PARIS, millisLondon));
        __CLR4_4_1k24k24lgchorm5.R.inc(26633);assertEquals(millisParis, PARIS.getMillisKeepLocal(PARIS, millisParis));

        __CLR4_4_1k24k24lgchorm5.R.inc(26634);assertEquals(millisParis, LONDON.getMillisKeepLocal(PARIS, millisLondon));
        __CLR4_4_1k24k24lgchorm5.R.inc(26635);assertEquals(millisLondon, PARIS.getMillisKeepLocal(LONDON, millisParis));

        __CLR4_4_1k24k24lgchorm5.R.inc(26636);DateTimeZone zone = DateTimeZone.getDefault();
        __CLR4_4_1k24k24lgchorm5.R.inc(26637);try {
            __CLR4_4_1k24k24lgchorm5.R.inc(26638);DateTimeZone.setDefault(LONDON);
            __CLR4_4_1k24k24lgchorm5.R.inc(26639);assertEquals(millisLondon, PARIS.getMillisKeepLocal(null, millisParis));
        } finally {
            __CLR4_4_1k24k24lgchorm5.R.inc(26640);DateTimeZone.setDefault(zone);
        }
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsFixed() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8oj3zkk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8oj3zkk1(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26641);
        __CLR4_4_1k24k24lgchorm5.R.inc(26642);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26643);assertEquals(false, zone.isFixed());
        __CLR4_4_1k24k24lgchorm5.R.inc(26644);assertEquals(true, DateTimeZone.UTC.isFixed());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTransitionFixed() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdpdxwkk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testTransitionFixed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdpdxwkk5(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26645);
        __CLR4_4_1k24k24lgchorm5.R.inc(26646);DateTimeZone zone = DateTimeZone.forID("+01:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26647);assertEquals(TEST_TIME_SUMMER, zone.nextTransition(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26648);assertEquals(TEST_TIME_WINTER, zone.nextTransition(TEST_TIME_WINTER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26649);assertEquals(TEST_TIME_SUMMER, zone.previousTransition(TEST_TIME_SUMMER));
        __CLR4_4_1k24k24lgchorm5.R.inc(26650);assertEquals(TEST_TIME_WINTER, zone.previousTransition(TEST_TIME_WINTER));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

//    //-----------------------------------------------------------------------
//    @Test public void testIsLocalDateTimeOverlap_Berlin() {
//        DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 1, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 2, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 3, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 10, 28, 4, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 25, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }
//
//    //-----------------------------------------------------------------------
//    @Test public void testIsLocalDateTimeOverlap_NewYork() {
//        DateTimeZone zone = DateTimeZone.forID("America/New_York");
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 0, 59, 59, 99)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 0)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 30)));
//        assertEquals(true, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 1, 59, 59, 99)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 2, 0)));
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 11, 4, 3, 0)));
//        
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 1, 30)));  // before gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 2, 30)));  // gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 3, 11, 3, 30)));  // after gap
//        assertEquals(false, zone.isLocalDateTimeOverlap(new LocalDateTime(2007, 12, 24, 12, 34)));
//    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsLocalDateTimeGap_Berlin() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ip2ipwkkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_Berlin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ip2ipwkkb(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26651);
        __CLR4_4_1k24k24lgchorm5.R.inc(26652);DateTimeZone zone = DateTimeZone.forID("Europe/Berlin");
        __CLR4_4_1k24k24lgchorm5.R.inc(26653);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26654);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26655);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26656);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26657);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26658);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26659);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0)));

        __CLR4_4_1k24k24lgchorm5.R.inc(26660);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30)));  // before overlap
        __CLR4_4_1k24k24lgchorm5.R.inc(26661);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30)));  // overlap
        __CLR4_4_1k24k24lgchorm5.R.inc(26662);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30)));  // after overlap
        __CLR4_4_1k24k24lgchorm5.R.inc(26663);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34)));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsLocalDateTimeGap_NewYork() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ijd7b7kko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testIsLocalDateTimeGap_NewYork",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ijd7b7kko(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26664);
        __CLR4_4_1k24k24lgchorm5.R.inc(26665);DateTimeZone zone = DateTimeZone.forID("America/New_York");
        __CLR4_4_1k24k24lgchorm5.R.inc(26666);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 0)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26667);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 1, 59, 59, 99)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26668);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 0)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26669);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 30)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26670);assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 2, 59, 59, 99)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26671);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 3, 0)));
        __CLR4_4_1k24k24lgchorm5.R.inc(26672);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 11, 4, 0)));

        __CLR4_4_1k24k24lgchorm5.R.inc(26673);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 0, 30)));  // before overlap
        __CLR4_4_1k24k24lgchorm5.R.inc(26674);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 1, 30)));  // overlap
        __CLR4_4_1k24k24lgchorm5.R.inc(26675);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 11, 4, 2, 30)));  // after overlap
        __CLR4_4_1k24k24lgchorm5.R.inc(26676);assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34)));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToTimeZone() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1inqrn1kl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToTimeZone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1inqrn1kl1(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26677);
        __CLR4_4_1k24k24lgchorm5.R.inc(26678);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26679);TimeZone tz = zone.toTimeZone();
        __CLR4_4_1k24k24lgchorm5.R.inc(26680);assertEquals("Europe/Paris", tz.getID());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsHashCode() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5in77kl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testEqualsHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5in77kl5(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26681);
        __CLR4_4_1k24k24lgchorm5.R.inc(26682);DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26683);DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26684);assertEquals(true, zone1.equals(zone1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26685);assertEquals(true, zone1.equals(zone2));
        __CLR4_4_1k24k24lgchorm5.R.inc(26686);assertEquals(true, zone2.equals(zone1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26687);assertEquals(true, zone2.equals(zone2));
        __CLR4_4_1k24k24lgchorm5.R.inc(26688);assertEquals(true, zone1.hashCode() == zone2.hashCode());

        __CLR4_4_1k24k24lgchorm5.R.inc(26689);DateTimeZone zone3 = DateTimeZone.forID("Europe/London");
        __CLR4_4_1k24k24lgchorm5.R.inc(26690);assertEquals(true, zone3.equals(zone3));
        __CLR4_4_1k24k24lgchorm5.R.inc(26691);assertEquals(false, zone1.equals(zone3));
        __CLR4_4_1k24k24lgchorm5.R.inc(26692);assertEquals(false, zone2.equals(zone3));
        __CLR4_4_1k24k24lgchorm5.R.inc(26693);assertEquals(false, zone3.equals(zone1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26694);assertEquals(false, zone3.equals(zone2));
        __CLR4_4_1k24k24lgchorm5.R.inc(26695);assertEquals(false, zone1.hashCode() == zone3.hashCode());
        __CLR4_4_1k24k24lgchorm5.R.inc(26696);assertEquals(true, zone3.hashCode() == zone3.hashCode());

        __CLR4_4_1k24k24lgchorm5.R.inc(26697);DateTimeZone zone4 = DateTimeZone.forID("+01:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26698);assertEquals(true, zone4.equals(zone4));
        __CLR4_4_1k24k24lgchorm5.R.inc(26699);assertEquals(false, zone1.equals(zone4));
        __CLR4_4_1k24k24lgchorm5.R.inc(26700);assertEquals(false, zone2.equals(zone4));
        __CLR4_4_1k24k24lgchorm5.R.inc(26701);assertEquals(false, zone3.equals(zone4));
        __CLR4_4_1k24k24lgchorm5.R.inc(26702);assertEquals(false, zone4.equals(zone1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26703);assertEquals(false, zone4.equals(zone2));
        __CLR4_4_1k24k24lgchorm5.R.inc(26704);assertEquals(false, zone4.equals(zone3));
        __CLR4_4_1k24k24lgchorm5.R.inc(26705);assertEquals(false, zone1.hashCode() == zone4.hashCode());
        __CLR4_4_1k24k24lgchorm5.R.inc(26706);assertEquals(true, zone4.hashCode() == zone4.hashCode());

        __CLR4_4_1k24k24lgchorm5.R.inc(26707);DateTimeZone zone5 = DateTimeZone.forID("+02:00");
        __CLR4_4_1k24k24lgchorm5.R.inc(26708);assertEquals(true, zone5.equals(zone5));
        __CLR4_4_1k24k24lgchorm5.R.inc(26709);assertEquals(false, zone1.equals(zone5));
        __CLR4_4_1k24k24lgchorm5.R.inc(26710);assertEquals(false, zone2.equals(zone5));
        __CLR4_4_1k24k24lgchorm5.R.inc(26711);assertEquals(false, zone3.equals(zone5));
        __CLR4_4_1k24k24lgchorm5.R.inc(26712);assertEquals(false, zone4.equals(zone5));
        __CLR4_4_1k24k24lgchorm5.R.inc(26713);assertEquals(false, zone5.equals(zone1));
        __CLR4_4_1k24k24lgchorm5.R.inc(26714);assertEquals(false, zone5.equals(zone2));
        __CLR4_4_1k24k24lgchorm5.R.inc(26715);assertEquals(false, zone5.equals(zone3));
        __CLR4_4_1k24k24lgchorm5.R.inc(26716);assertEquals(false, zone5.equals(zone4));
        __CLR4_4_1k24k24lgchorm5.R.inc(26717);assertEquals(false, zone1.hashCode() == zone5.hashCode());
        __CLR4_4_1k24k24lgchorm5.R.inc(26718);assertEquals(true, zone5.hashCode() == zone5.hashCode());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidkm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidkm7(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26719);
        __CLR4_4_1k24k24lgchorm5.R.inc(26720);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        __CLR4_4_1k24k24lgchorm5.R.inc(26721);assertEquals("Europe/Paris", zone.toString());
        __CLR4_4_1k24k24lgchorm5.R.inc(26722);assertEquals("UTC", DateTimeZone.UTC.toString());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // rule with negative SAVE value
    //@Test
    public void testDublin() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9j6exkmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testDublin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9j6exkmb(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26723);
        __CLR4_4_1k24k24lgchorm5.R.inc(26724);DateTimeZone zone = DateTimeZone.forID("Europe/Dublin");
        __CLR4_4_1k24k24lgchorm5.R.inc(26725);DateTime winter = new DateTime(2018, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26726);assertEquals(0, zone.getStandardOffset(winter.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26727);assertEquals(0, zone.getOffset(winter.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26728);assertEquals(true, zone.isStandardOffset(winter.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26729);assertEquals("Greenwich Mean Time", zone.getName(winter.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26730);assertEquals("GMT", zone.getNameKey(winter.getMillis()));

        __CLR4_4_1k24k24lgchorm5.R.inc(26731);DateTime summer = winter.plusMonths(6);
        __CLR4_4_1k24k24lgchorm5.R.inc(26732);assertEquals(0, zone.getStandardOffset(summer.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26733);assertEquals(3600000, zone.getOffset(summer.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26734);assertEquals(false, zone.isStandardOffset(summer.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26735);assertEquals(true, zone.getName(summer.getMillis()).startsWith("Irish "));
        __CLR4_4_1k24k24lgchorm5.R.inc(26736);assertEquals("IST", zone.getNameKey(summer.getMillis()));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testWindhoek() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8rv8ykmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testWindhoek",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8rv8ykmp(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26737);
        __CLR4_4_1k24k24lgchorm5.R.inc(26738);DateTimeZone zone = DateTimeZone.forID("Africa/Windhoek");
        __CLR4_4_1k24k24lgchorm5.R.inc(26739);DateTime dtDec1990 = new DateTime(1990, 12, 1, 0, 0, 0, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26740);assertEquals(3600000, zone.getStandardOffset(dtDec1990.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26741);assertEquals(7200000, zone.getOffset(dtDec1990.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26742);assertEquals(false, zone.isStandardOffset(dtDec1990.getMillis()));

        __CLR4_4_1k24k24lgchorm5.R.inc(26743);DateTime dtDec1994 = new DateTime(1994, 12, 1, 0, 0, 0, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26744);assertEquals(3600000, zone.getStandardOffset(dtDec1994.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26745);assertEquals(7200000, zone.getOffset(dtDec1994.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26746);assertEquals(false, zone.isStandardOffset(dtDec1994.getMillis()));

        __CLR4_4_1k24k24lgchorm5.R.inc(26747);DateTime dtJun1995 = new DateTime(1995, 6, 1, 0, 0, 0, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26748);assertEquals(3600000, zone.getStandardOffset(dtJun1995.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26749);assertEquals(3600000, zone.getOffset(dtJun1995.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26750);assertEquals(true, zone.isStandardOffset(dtJun1995.getMillis()));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToronto() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urzv2ykn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testToronto",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urzv2ykn3(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26751);
        __CLR4_4_1k24k24lgchorm5.R.inc(26752);DateTimeZone zone = DateTimeZone.forID("America/Toronto");
        __CLR4_4_1k24k24lgchorm5.R.inc(26753);DateTime start = new DateTime(1927, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26754);assertEquals(-5 * 3600000, zone.getStandardOffset(start.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26755);assertEquals(-5 * 3600000, zone.getOffset(start.getMillis()));

        __CLR4_4_1k24k24lgchorm5.R.inc(26756);DateTime summer1927 = new DateTime(zone.nextTransition(start.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26757);assertEquals(-4 * 3600000, zone.getOffset(summer1927.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26758);assertEquals(new LocalDate(1927, 5, 1), summer1927.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26759);assertEquals(DateTimeConstants.SUNDAY, summer1927.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26760);DateTime winter1927 = new DateTime(zone.nextTransition(summer1927.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26761);assertEquals(-5 * 3600000, zone.getOffset(winter1927.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26762);assertEquals(new LocalDate(1927, 9, 25), winter1927.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26763);assertEquals(DateTimeConstants.SUNDAY, winter1927.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26764);DateTime summer1928 = new DateTime(zone.nextTransition(winter1927.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26765);assertEquals(-4 * 3600000, zone.getOffset(summer1928.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26766);assertEquals(new LocalDate(1928, 4, 29), summer1928.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26767);assertEquals(DateTimeConstants.SUNDAY, summer1928.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26768);DateTime winter1928 = new DateTime(zone.nextTransition(summer1928.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26769);assertEquals(-5 * 3600000, zone.getOffset(winter1928.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26770);assertEquals(new LocalDate(1928, 9, 30), winter1928.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26771);assertEquals(DateTimeConstants.SUNDAY, winter1928.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26772);DateTime summer1929 = new DateTime(zone.nextTransition(winter1928.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26773);assertEquals(-4 * 3600000, zone.getOffset(summer1929.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26774);assertEquals(new LocalDate(1929, 4, 28), summer1929.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26775);assertEquals(DateTimeConstants.SUNDAY, summer1929.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26776);DateTime winter1929 = new DateTime(zone.nextTransition(summer1929.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26777);assertEquals(-5 * 3600000, zone.getOffset(winter1929.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26778);assertEquals(new LocalDate(1929, 9, 29), winter1929.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26779);assertEquals(DateTimeConstants.SUNDAY, winter1929.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26780);DateTime summer1930 = new DateTime(zone.nextTransition(winter1929.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26781);assertEquals(-4 * 3600000, zone.getOffset(summer1930.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26782);assertEquals(new LocalDate(1930, 4, 27), summer1930.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26783);assertEquals(DateTimeConstants.SUNDAY, summer1930.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26784);DateTime winter1930 = new DateTime(zone.nextTransition(summer1930.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26785);assertEquals(-5 * 3600000, zone.getOffset(winter1930.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26786);assertEquals(new LocalDate(1930, 9, 28), winter1930.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26787);assertEquals(DateTimeConstants.SUNDAY, winter1930.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26788);DateTime summer1931 = new DateTime(zone.nextTransition(winter1930.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26789);assertEquals(-4 * 3600000, zone.getOffset(summer1931.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26790);assertEquals(new LocalDate(1931, 4, 26), summer1931.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26791);assertEquals(DateTimeConstants.SUNDAY, summer1931.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26792);DateTime winter1931 = new DateTime(zone.nextTransition(summer1931.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26793);assertEquals(-5 * 3600000, zone.getOffset(winter1931.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26794);assertEquals(new LocalDate(1931, 9, 27), winter1931.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26795);assertEquals(DateTimeConstants.SUNDAY, winter1931.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26796);DateTime summer1932 = new DateTime(zone.nextTransition(winter1931.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26797);assertEquals(-4 * 3600000, zone.getOffset(summer1932.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26798);assertEquals(new LocalDate(1932, 5, 1), summer1932.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26799);assertEquals(DateTimeConstants.SUNDAY, summer1932.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26800);DateTime winter1932 = new DateTime(zone.nextTransition(summer1932.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26801);assertEquals(-5 * 3600000, zone.getOffset(winter1932.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26802);assertEquals(new LocalDate(1932, 9, 25), winter1932.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26803);assertEquals(DateTimeConstants.SUNDAY, winter1932.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26804);DateTime summer1933 = new DateTime(zone.nextTransition(winter1932.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26805);assertEquals(-4 * 3600000, zone.getOffset(summer1933.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26806);assertEquals(new LocalDate(1933, 4, 30), summer1933.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26807);assertEquals(DateTimeConstants.SUNDAY, summer1933.getDayOfWeek());

        __CLR4_4_1k24k24lgchorm5.R.inc(26808);DateTime winter1933 = new DateTime(zone.nextTransition(summer1933.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26809);assertEquals(-5 * 3600000, zone.getOffset(winter1933.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26810);assertEquals(new LocalDate(1933, 10, 1), winter1933.toLocalDate());
        __CLR4_4_1k24k24lgchorm5.R.inc(26811);assertEquals(DateTimeConstants.SUNDAY, winter1933.getDayOfWeek());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // rule of style "Fri <= 1"
    @Test
    public void testJerusalem() {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1196gwtkos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testJerusalem",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1196gwtkos(){try{__CLR4_4_1k24k24lgchorm5.R.inc(26812);
        __CLR4_4_1k24k24lgchorm5.R.inc(26813);DateTimeZone zone = DateTimeZone.forID("Asia/Jerusalem");
        __CLR4_4_1k24k24lgchorm5.R.inc(26814);DateTime winter = new DateTime(2006, 1, 1, 0, 0, 0, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26815);assertEquals(true, zone.isStandardOffset(winter.getMillis()));

        __CLR4_4_1k24k24lgchorm5.R.inc(26816);DateTime cutover = new DateTime(zone.nextTransition(winter.getMillis()), zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26817);assertEquals(false, zone.isStandardOffset(cutover.getMillis()));
        __CLR4_4_1k24k24lgchorm5.R.inc(26818);assertEquals(5, cutover.getDayOfWeek());
        __CLR4_4_1k24k24lgchorm5.R.inc(26819);assertEquals(31, cutover.getDayOfMonth());
        __CLR4_4_1k24k24lgchorm5.R.inc(26820);assertEquals(3, cutover.getMonthOfYear());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization1() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vfkbx6kp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vfkbx6kp1() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26821);
        __CLR4_4_1k24k24lgchorm5.R.inc(26822);DateTimeZone zone = DateTimeZone.forID("Europe/Paris");

        __CLR4_4_1k24k24lgchorm5.R.inc(26823);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1k24k24lgchorm5.R.inc(26824);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1k24k24lgchorm5.R.inc(26825);oos.writeObject(zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26826);oos.close();
        __CLR4_4_1k24k24lgchorm5.R.inc(26827);byte[] bytes = baos.toByteArray();

        __CLR4_4_1k24k24lgchorm5.R.inc(26828);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1k24k24lgchorm5.R.inc(26829);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1k24k24lgchorm5.R.inc(26830);DateTimeZone result = (DateTimeZone) ois.readObject();
        __CLR4_4_1k24k24lgchorm5.R.inc(26831);ois.close();

        __CLR4_4_1k24k24lgchorm5.R.inc(26832);assertSame(zone, result);
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization2() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yokapnkpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testSerialization2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yokapnkpd() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26833);
        __CLR4_4_1k24k24lgchorm5.R.inc(26834);DateTimeZone zone = DateTimeZone.forID("+01:00");

        __CLR4_4_1k24k24lgchorm5.R.inc(26835);ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_4_1k24k24lgchorm5.R.inc(26836);ObjectOutputStream oos = new ObjectOutputStream(baos);
        __CLR4_4_1k24k24lgchorm5.R.inc(26837);oos.writeObject(zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26838);oos.close();
        __CLR4_4_1k24k24lgchorm5.R.inc(26839);byte[] bytes = baos.toByteArray();

        __CLR4_4_1k24k24lgchorm5.R.inc(26840);ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        __CLR4_4_1k24k24lgchorm5.R.inc(26841);ObjectInputStream ois = new ObjectInputStream(bais);
        __CLR4_4_1k24k24lgchorm5.R.inc(26842);DateTimeZone result = (DateTimeZone) ois.readObject();
        __CLR4_4_1k24k24lgchorm5.R.inc(26843);ois.close();

        __CLR4_4_1k24k24lgchorm5.R.inc(26844);assertEquals(zone, result);
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    @Test
    public void testCommentParse() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xogb7xkpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testCommentParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xogb7xkpp() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26845);
        // A bug in ZoneInfoCompiler's handling of comments broke Europe/Athens
        // after 1980. This test is included to make sure it doesn't break again.

        __CLR4_4_1k24k24lgchorm5.R.inc(26846);DateTimeZone zone = DateTimeZone.forID("Europe/Athens");
        __CLR4_4_1k24k24lgchorm5.R.inc(26847);DateTime dt = new DateTime(2005, 5, 5, 20, 10, 15, 0, zone);
        __CLR4_4_1k24k24lgchorm5.R.inc(26848);assertEquals(1115313015000L, dt.getMillis());
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testPatchedNameKeysLondon() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3084zkpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysLondon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3084zkpt() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26849);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1k24k24lgchorm5.R.inc(26850);DateTimeZone zone = DateTimeZone.forID("Europe/London");

        __CLR4_4_1k24k24lgchorm5.R.inc(26851);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1k24k24lgchorm5.R.inc(26852);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26853);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26854);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testPatchedNameKeysSydney() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wzbz29kpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydney",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wzbz29kpz() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26855);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1k24k24lgchorm5.R.inc(26856);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");

        __CLR4_4_1k24k24lgchorm5.R.inc(26857);DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1k24k24lgchorm5.R.inc(26858);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26859);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26860);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testPatchedNameKeysSydneyHistoric() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3k02mkq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysSydneyHistoric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3k02mkq5() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26861);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1k24k24lgchorm5.R.inc(26862);DateTimeZone zone = DateTimeZone.forID("Australia/Sydney");

        __CLR4_4_1k24k24lgchorm5.R.inc(26863);DateTime now = new DateTime(1996, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1k24k24lgchorm5.R.inc(26864);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26865);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26866);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

    //@Test
    public void testPatchedNameKeysGazaHistoric() throws Exception {__CLR4_4_1k24k24lgchorm5.R.globalSliceStart(getClass().getName(),26867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9o6p1kqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1k24k24lgchorm5.R.rethrow($CLV_t2$);}finally{__CLR4_4_1k24k24lgchorm5.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeZone.testPatchedNameKeysGazaHistoric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),26867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9o6p1kqb() throws Exception{try{__CLR4_4_1k24k24lgchorm5.R.inc(26867);
        // the tz database does not have unique name keys [1716305]
        __CLR4_4_1k24k24lgchorm5.R.inc(26868);DateTimeZone zone = DateTimeZone.forID("Africa/Johannesburg");

        __CLR4_4_1k24k24lgchorm5.R.inc(26869);DateTime now = new DateTime(1943, 1, 1, 0, 0, 0, 0);
        __CLR4_4_1k24k24lgchorm5.R.inc(26870);String str1 = zone.getName(now.getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26871);String str2 = zone.getName(now.plusMonths(6).getMillis());
        __CLR4_4_1k24k24lgchorm5.R.inc(26872);assertEquals(false, str1.equals(str2));
    }finally{__CLR4_4_1k24k24lgchorm5.R.flushNeeded();}}

}
