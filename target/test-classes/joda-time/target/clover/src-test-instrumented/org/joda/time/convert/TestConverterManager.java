/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.convert;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Interval;
import org.joda.time.JodaTimePermission;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.TimeOfDay;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for ConverterManager.
 *
 * @author Stephen Colebourne
 */
public class TestConverterManager {static class __CLR4_4_11e1i1e1ilgchosq1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,65708,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; // extends TestCase {
    private static final boolean OLD_JDK;

    static {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64854);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64855);String str = System.getProperty("java.version");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64856);boolean old = true;
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64857);if ((((str.length() > 3 &&
                str.charAt(0) == '1' &&
                str.charAt(1) == '.' &&
                (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(64858)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(64859)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(64860);old = false;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(64861);OLD_JDK = old;
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    private static final Policy RESTRICT;
    private static final Policy ALLOW;

    static {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64862);
        // don't call Policy.getPolicy()
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64863);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64864);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64865);Permissions p = new Permissions();
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64866);p.add(new AllPermission());  // enable everything
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64867);return p;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public void refresh() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64868);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64869);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64870);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(64871)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(64872)==0&false))) {{
                    __CLR4_4_11e1i1e1ilgchosq1.R.inc(64873);return false;
                }
                }__CLR4_4_11e1i1e1ilgchosq1.R.inc(64874);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64875);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64876);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64877);Permissions p = new Permissions();
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64878);p.add(new AllPermission());  // enable everything
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(64879);return p;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public void refresh() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64880);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(64881);

        //junit.textui.TestRunner.run(suite());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64882);TestConverterManager TB = new TestConverterManager();

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64883);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64884);TB.testSingleton();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64885);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64886);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64887);TB.testGetInstantConverter();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64888);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64889);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64890);TB.testGetInstantConverterRemovedNull();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64891);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64892);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64893);TB.testGetInstantConverterOKMultipleMatches();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64894);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64895);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64896);TB.testGetInstantConverterBadMultipleMatches();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64897);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64898);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64899);TB.testGetInstantConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64900);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64901);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64902);TB.testAddInstantConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64903);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64904);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64905);TB.testAddInstantConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64906);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64907);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64908);TB.testAddInstantConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64909);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64910);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64911);TB.testAddInstantConverter4();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64912);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64913);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64914);TB.testAddInstantConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64915);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64916);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64917);TB.testRemoveInstantConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64918);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64919);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64920);TB.testRemoveInstantConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64921);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64922);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64923);TB.testRemoveInstantConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64924);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64925);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64926);TB.testRemoveInstantConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64927);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64928);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64929);TB.testGetPartialConverter();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64930);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64931);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64932);TB.testGetPartialConverterRemovedNull();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64933);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64934);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64935);TB.testGetPartialConverterOKMultipleMatches();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64936);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64937);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64938);TB.testGetPartialConverterBadMultipleMatches();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64939);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64940);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64941);TB.testGetPartialConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64942);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64943);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64944);TB.testAddPartialConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64945);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64946);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64947);TB.testAddPartialConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64948);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64949);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64950);TB.testAddPartialConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64951);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64952);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64953);TB.testAddPartialConverter4();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64954);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64955);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64956);TB.testAddPartialConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64957);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64958);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64959);TB.testRemovePartialConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64960);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64961);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64962);TB.testRemovePartialConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64963);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64964);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64965);TB.testRemovePartialConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64966);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64967);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64968);TB.testRemovePartialConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64969);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64970);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64971);TB.testGetDurationConverter();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64972);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64973);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64974);TB.testGetDurationConverterRemovedNull();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64975);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64976);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64977);TB.testGetDurationConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64978);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64979);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64980);TB.testAddDurationConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64981);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64982);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64983);TB.testAddDurationConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64984);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64985);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64986);TB.testAddDurationConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64987);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64988);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64989);TB.testAddDurationConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64990);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64991);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64992);TB.testRemoveDurationConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64993);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64994);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64995);TB.testRemoveDurationConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64996);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64997);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64998);TB.testRemoveDurationConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(64999);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65000);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65001);TB.testRemoveDurationConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65002);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65003);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65004);TB.testGetPeriodConverter();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65005);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65006);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65007);TB.testGetPeriodConverterRemovedNull();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65008);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65009);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65010);TB.testGetPeriodConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65011);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65012);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65013);TB.testAddPeriodConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65014);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65015);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65016);TB.testAddPeriodConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65017);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65018);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65019);TB.testAddPeriodConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65020);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65021);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65022);TB.testAddPeriodConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65023);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65024);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65025);TB.testRemovePeriodConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65026);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65027);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65028);TB.testRemovePeriodConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65029);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65030);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65031);TB.testRemovePeriodConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65032);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65033);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65034);TB.testRemovePeriodConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65035);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65036);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65037);TB.testGetIntervalConverter();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65038);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65039);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65040);TB.testGetIntervalConverterRemovedNull();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65041);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65042);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65043);TB.testGetIntervalConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65044);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65045);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65046);TB.testAddIntervalConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65047);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65048);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65049);TB.testAddIntervalConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65050);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65051);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65052);TB.testAddIntervalConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65053);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65054);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65055);TB.testAddIntervalConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65056);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65057);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65058);TB.testRemoveIntervalConverter1();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65059);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65060);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65061);TB.testRemoveIntervalConverter2();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65062);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65063);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65064);TB.testRemoveIntervalConverter3();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65065);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65066);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65067);TB.testRemoveIntervalConverterSecurity();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65068);TB.tearDown();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65069);TB.setUp();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65070);TB.testToString();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65071);TB.tearDown();
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    /*
        public static TestSuite suite() {
            return new TestSuite(TestConverterManager.class);
        }

        public TestConverterManager(String name) {
            super(name);
        }

     */
    @Before
    public void setUp() throws Exception {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65072);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65073);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jmk8jk1e7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testSingleton",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jmk8jk1e7m() throws Exception{try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65074);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65075);Class cls = ConverterManager.class;
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65076);assertEquals(true, Modifier.isPublic(cls.getModifiers()));

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65077);Constructor con = cls.getDeclaredConstructor((Class[]) null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65078);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65079);assertEquals(true, Modifier.isProtected(con.getModifiers()));

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65080);Field fld = cls.getDeclaredField("INSTANCE");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65081);assertEquals(true, Modifier.isPrivate(fld.getModifiers()));
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantConverter() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ocox61e7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ocox61e7u(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65082);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65083);InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65084);assertEquals(Long.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65085);c = ConverterManager.getInstance().getInstantConverter(new DateTime());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65086);assertEquals(ReadableInstant.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65087);c = ConverterManager.getInstance().getInstantConverter("");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65088);assertEquals(String.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65089);c = ConverterManager.getInstance().getInstantConverter(new Date());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65090);assertEquals(Date.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65091);c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65092);assertEquals(Calendar.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65093);c = ConverterManager.getInstance().getInstantConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65094);assertEquals(null, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65095);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65096);ConverterManager.getInstance().getInstantConverter(Boolean.TRUE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65097);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetInstantConverterRemovedNull() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_192qws51e8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_192qws51e8a(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65098);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65099);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65100);ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65101);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65102);ConverterManager.getInstance().getInstantConverter(null);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65103);fail();
            } catch (IllegalArgumentException ex) {
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65104);ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65105);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetInstantConverterOKMultipleMatches() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113m7aj1e8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterOKMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113m7aj1e8i(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65106);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65107);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65108);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65109);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65110);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65111);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65112);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65113);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65114);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65115);return ReadableDateTime.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65116);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65117);ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65118);InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime());
            // ReadableDateTime and ReadableInstant both match, but RI discarded as less specific
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65119);assertEquals(ReadableDateTime.class, ok.getSupportedType());
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65120);ConverterManager.getInstance().removeInstantConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65121);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetInstantConverterBadMultipleMatches() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1jpiw1e8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverterBadMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1jpiw1e8y(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65122);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65123);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65124);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65125);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65126);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65127);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65128);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65129);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65130);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65131);return Serializable.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65132);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65133);ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65134);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65135);ConverterManager.getInstance().getInstantConverter(new DateTime());
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65136);fail();
            } catch (IllegalStateException ex) {
                // Serializable and ReadableInstant both match, so cannot pick
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65137);ConverterManager.getInstance().removeInstantConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65138);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantConverters() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_157gv8p1e9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetInstantConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_157gv8p1e9f(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65139);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65140);InstantConverter[] array = ConverterManager.getInstance().getInstantConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65141);assertEquals(6, array.length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddInstantConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sa2gqy1e9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sa2gqy1e9i(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65142);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65143);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65144);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65145);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65146);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65147);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65148);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65149);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65150);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65151);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65152);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65153);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65154);assertEquals(null, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65155);assertEquals(Boolean.class, ConverterManager.getInstance().getInstantConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65156);assertEquals(7, ConverterManager.getInstance().getInstantConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65157);ConverterManager.getInstance().removeInstantConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65158);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddInstantConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vj2fjf1e9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65159,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vj2fjf1e9z(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65159);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65160);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65161);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65162);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65163);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65164);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65165);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65166);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65167);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65168);return String.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65169);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65170);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65171);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65172);assertEquals(String.class, ConverterManager.getInstance().getInstantConverter("").getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65173);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65174);ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65175);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddInstantConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ys2ebw1eag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ys2ebw1eag(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65176);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65177);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65178);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65179);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddInstantConverter4() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x01our1eak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverter4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x01our1eak(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65180);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65181);InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65182);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65183);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddInstantConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hch3f1eao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddInstantConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hch3f1eao(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65184);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65185);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65186)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65187)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65188);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65189);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65190);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65191);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65192);ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65193);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65194);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65195);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65196);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemoveInstantConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyfzsz1eb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyfzsz1eb1(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65197);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65198);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65199);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65200);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65201);assertEquals(5, ConverterManager.getInstance().getInstantConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65202);ConverterManager.getInstance().addInstantConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65203);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveInstantConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7fylg1eb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7fylg1eb8(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65204);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65205);InstantConverter c = new InstantConverter() {
            public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65206);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65207);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65208);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65209);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65210);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65211);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65212);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65213);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65214);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(c);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65215);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65216);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveInstantConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xgfxdx1ebl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xgfxdx1ebl(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65217);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65218);InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65219);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65220);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveInstantConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vely1o1ebp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveInstantConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vely1o1ebp(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65221);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65222);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65223)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65224)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65225);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65226);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65227);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65228);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65229);ConverterManager.getInstance().removeInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65230);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65231);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65232);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65233);assertEquals(6, ConverterManager.getInstance().getInstantConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static final int PARTIAL_SIZE = 7;

    @Test
    public void testGetPartialConverter() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqq5qi1ec2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqq5qi1ec2(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65234);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65235);PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65236);assertEquals(Long.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65237);c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65238);assertEquals(ReadablePartial.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65239);c = ConverterManager.getInstance().getPartialConverter(new DateTime());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65240);assertEquals(ReadableInstant.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65241);c = ConverterManager.getInstance().getPartialConverter("");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65242);assertEquals(String.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65243);c = ConverterManager.getInstance().getPartialConverter(new Date());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65244);assertEquals(Date.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65245);c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar());
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65246);assertEquals(Calendar.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65247);c = ConverterManager.getInstance().getPartialConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65248);assertEquals(null, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65249);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65250);ConverterManager.getInstance().getPartialConverter(Boolean.TRUE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65251);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetPartialConverterRemovedNull() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119y8yd1eck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119y8yd1eck(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65252);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65253);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65254);ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65255);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65256);ConverterManager.getInstance().getPartialConverter(null);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65257);fail();
            } catch (IllegalArgumentException ex) {
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65258);ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65259);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetPartialConverterOKMultipleMatches() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1880bn91ecs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterOKMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1880bn91ecs(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65260);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65261);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65262);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65263);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65264);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65265);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65266);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65267);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65268);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65269);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65270);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65271);return ReadableDateTime.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65272);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65273);ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65274);PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime());
            // ReadableDateTime and ReadablePartial both match, but RI discarded as less specific
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65275);assertEquals(ReadableDateTime.class, ok.getSupportedType());
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65276);ConverterManager.getInstance().removePartialConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65277);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetPartialConverterBadMultipleMatches() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3m99k1eda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverterBadMultipleMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3m99k1eda(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65278);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65279);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65280);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65281);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65282);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65283);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65284);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65285);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65286);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65287);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65288);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65289);return Serializable.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65290);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65291);ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65292);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65293);ConverterManager.getInstance().getPartialConverter(new DateTime());
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65294);fail();
            } catch (IllegalStateException ex) {
                // Serializable and ReadablePartial both match, so cannot pick
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65295);ConverterManager.getInstance().removePartialConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65296);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPartialConverters() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hl867r1edt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPartialConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hl867r1edt(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65297);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65298);PartialConverter[] array = ConverterManager.getInstance().getPartialConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65299);assertEquals(PARTIAL_SIZE, array.length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddPartialConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jycjrq1edw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jycjrq1edw(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65300);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65301);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65302);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65303);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65304);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65305);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65306);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65307);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65308);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65309);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65310);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65311);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65312);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65313);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65314);assertEquals(null, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65315);assertEquals(Boolean.class, ConverterManager.getInstance().getPartialConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65316);assertEquals(PARTIAL_SIZE + 1, ConverterManager.getInstance().getPartialConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65317);ConverterManager.getInstance().removePartialConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65318);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPartialConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gpckz91eef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gpckz91eef(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65319);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65320);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65321);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65322);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65323);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65324);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65325);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65326);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65327);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65328);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65329);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65330);return String.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65331);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65332);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65333);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65334);assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65335);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65336);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65337);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPartialConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dgcm6s1eey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dgcm6s1eey(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65338);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65339);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65340);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65341);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPartialConverter4() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7cneb1ef2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverter4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7cneb1ef2(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65342);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65343);PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65344);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65345);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPartialConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jsy47p1ef6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPartialConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jsy47p1ef6(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65346);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65347);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65348)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65349)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65350);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65351);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65352);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65353);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65354);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65355);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65356);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65357);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65358);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemovePartialConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9z0pp1efj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9z0pp1efj(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65359);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65360);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65361);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65362);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65363);assertEquals(PARTIAL_SIZE - 1, ConverterManager.getInstance().getPartialConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65364);ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65365);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemovePartialConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i0z1x81efq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i0z1x81efq(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65366);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65367);PartialConverter c = new PartialConverter() {
            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65368);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65369);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65370);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65371);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, DateTimeZone zone) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65372);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65373);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Chronology getChronology(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65374);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65375);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65376);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65377);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65378);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(c);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65379);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65380);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemovePartialConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1erz34r1eg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1erz34r1eg5(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65381);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65382);PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65383);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65384);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemovePartialConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jc7imc1eg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePartialConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jc7imc1eg9(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65385);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65386);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65387)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65388)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65389);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65390);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65391);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65392);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65393);ConverterManager.getInstance().removeInstantConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65394);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65395);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65396);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65397);assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int DURATION_SIZE = 5;

    @Test
    public void testGetDurationConverter() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12459db1egm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12459db1egm(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65398);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65399);DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65400);assertEquals(Long.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65401);c = ConverterManager.getInstance().getDurationConverter(new Duration(123L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65402);assertEquals(ReadableDuration.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65403);c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65404);assertEquals(ReadableInterval.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65405);c = ConverterManager.getInstance().getDurationConverter("");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65406);assertEquals(String.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65407);c = ConverterManager.getInstance().getDurationConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65408);assertEquals(null, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65409);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65410);ConverterManager.getInstance().getDurationConverter(Boolean.TRUE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65411);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetDurationConverterRemovedNull() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b5ss861eh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b5ss861eh0(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65412);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65413);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65414);ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65415);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65416);ConverterManager.getInstance().getDurationConverter(null);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65417);fail();
            } catch (IllegalArgumentException ex) {
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65418);ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65419);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationConverters() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhgwky1eh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetDurationConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhgwky1eh8(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65420);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65421);DurationConverter[] array = ConverterManager.getInstance().getDurationConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65422);assertEquals(DURATION_SIZE, array.length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddDurationConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqo3511ehb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqo3511ehb(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65423);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65424);DurationConverter c = new DurationConverter() {
            public long getDurationMillis(Object object) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65425);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65426);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65427);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65428);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65429);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65430);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65431);assertEquals(null, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65432);assertEquals(Boolean.class, ConverterManager.getInstance().getDurationConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65433);assertEquals(DURATION_SIZE + 1, ConverterManager.getInstance().getDurationConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65434);ConverterManager.getInstance().removeDurationConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65435);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddDurationConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hho4ck1eho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hho4ck1eho(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65436);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65437);DurationConverter c = new DurationConverter() {
            public long getDurationMillis(Object object) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65438);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65439);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65440);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65441);return String.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65442);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65443);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65444);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65445);assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65446);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65447);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65448);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddDurationConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8o5k31ei1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8o5k31ei1(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65449);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65450);DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65451);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65452);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddDurationConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yy2dms1ei5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddDurationConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yy2dms1ei5(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65453);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65454);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65455)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65456)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65457);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65458);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65459);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65460);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65461);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65462);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65463);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65464);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65465);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemoveDurationConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19a3dky1eii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19a3dky1eii(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65466);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65467);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65468);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65469);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65470);assertEquals(DURATION_SIZE - 1, ConverterManager.getInstance().getDurationConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65471);ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65472);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveDurationConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cj3cdf1eip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cj3cdf1eip(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65473);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65474);DurationConverter c = new DurationConverter() {
            public long getDurationMillis(Object object) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65475);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65476);return 0;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65477);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65478);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65479);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(c);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65480);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65481);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveDurationConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs3b5w1eiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs3b5w1eiy(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65482);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65483);DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65484);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65485);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveDurationConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t14nct1ej2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveDurationConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t14nct1ej2(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65486);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65487);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65488)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65489)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65490);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65491);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65492);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65493);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65494);ConverterManager.getInstance().removeDurationConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65495);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65496);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65497);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65498);assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int PERIOD_SIZE = 5;

    @Test
    public void testGetPeriodConverter() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jr6ncy1ejf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jr6ncy1ejf(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65499);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65500);PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65501);assertEquals(ReadablePeriod.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65502);c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65503);assertEquals(ReadableDuration.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65504);c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65505);assertEquals(ReadableInterval.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65506);c = ConverterManager.getInstance().getPeriodConverter("");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65507);assertEquals(String.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65508);c = ConverterManager.getInstance().getPeriodConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65509);assertEquals(null, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65510);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65511);ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65512);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetPeriodConverterRemovedNull() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dotmb1ejt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dotmb1ejt(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65513);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65514);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65515);ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65516);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65517);ConverterManager.getInstance().getPeriodConverter(null);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65518);fail();
            } catch (IllegalArgumentException ex) {
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65519);ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65520);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodConverters() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2rigv1ek1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetPeriodConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2rigv1ek1(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65521);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65522);PeriodConverter[] array = ConverterManager.getInstance().getPeriodConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65523);assertEquals(PERIOD_SIZE, array.length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddPeriodConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bi731k1ek4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bi731k1ek4(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65524);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65525);PeriodConverter c = new PeriodConverter() {
            public void setInto(ReadWritablePeriod duration, Object object, Chronology c) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65526);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public PeriodType getPeriodType(Object object) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65527);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65528);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65529);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65530);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65531);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65532);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65533);assertEquals(null, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65534);assertEquals(Boolean.class, ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65535);assertEquals(PERIOD_SIZE + 1, ConverterManager.getInstance().getPeriodConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65536);ConverterManager.getInstance().removePeriodConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65537);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPeriodConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1er71u11eki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1er71u11eki(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65538);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65539);PeriodConverter c = new PeriodConverter() {
            public void setInto(ReadWritablePeriod duration, Object object, Chronology c) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65540);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public PeriodType getPeriodType(Object object) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65541);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65542);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65543);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65544);return String.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65545);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65546);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65547);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65548);assertEquals(String.class, ConverterManager.getInstance().getPeriodConverter("").getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65549);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65550);ConverterManager.getInstance().addPeriodConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65551);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPeriodConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i070mi1ekw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i070mi1ekw(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65552);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65553);PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65554);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65555);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddPeriodConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1coolav1el0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddPeriodConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1coolav1el0(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65556);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65557);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65558)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65559)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65560);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65561);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65562);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65563);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65564);ConverterManager.getInstance().addPeriodConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65565);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65566);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65567);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65568);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemovePeriodConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mx3j2n1eld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mx3j2n1eld(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65569);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65570);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65571);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65572);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65573);assertEquals(PERIOD_SIZE - 1, ConverterManager.getInstance().getPeriodConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65574);ConverterManager.getInstance().addPeriodConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65575);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemovePeriodConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q63hv41elk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q63hv41elk(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65576);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65577);PeriodConverter c = new PeriodConverter() {
            public void setInto(ReadWritablePeriod duration, Object object, Chronology c) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65578);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public PeriodType getPeriodType(Object object) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65579);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65580);return null;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65581);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65582);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65583);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(c);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65584);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65585);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemovePeriodConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tf3gnl1elu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tf3gnl1elu(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65586);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65587);PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65588);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65589);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemovePeriodConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr4jww1ely();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemovePeriodConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr4jww1ely(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65590);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65591);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65592)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65593)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65594);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65595);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65596);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65597);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65598);ConverterManager.getInstance().removePeriodConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65599);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65600);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65601);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65602);assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int INTERVAL_SIZE = 3;

    @Test
    public void testGetIntervalConverter() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1br8dku1emb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1br8dku1emb(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65603);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65604);IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L));
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65605);assertEquals(ReadableInterval.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65606);c = ConverterManager.getInstance().getIntervalConverter("");
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65607);assertEquals(String.class, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65608);c = ConverterManager.getInstance().getIntervalConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65609);assertEquals(null, c.getSupportedType());

        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65610);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65611);ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65612);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65613);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65614);ConverterManager.getInstance().getIntervalConverter(new Long(0));
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65615);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testGetIntervalConverterRemovedNull() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2tson1emo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverterRemovedNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2tson1emo(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65616);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65617);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65618);ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65619);try {
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65620);ConverterManager.getInstance().getIntervalConverter(null);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65621);fail();
            } catch (IllegalArgumentException ex) {
            }
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65622);ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65623);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetIntervalConverters() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kseqt91emw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testGetIntervalConverters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kseqt91emw(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65624);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65625);IntervalConverter[] array = ConverterManager.getInstance().getIntervalConverters();
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65626);assertEquals(INTERVAL_SIZE, array.length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddIntervalConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15zfok41emz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15zfok41emz(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65627);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65628);IntervalConverter c = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65629);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65630);return false;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65631);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65632);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65633);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65634);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65635);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65636);assertEquals(null, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65637);assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65638);assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65639);ConverterManager.getInstance().removeIntervalConverter(c);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65640);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddIntervalConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12qfprn1end();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12qfprn1end(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65641);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65642);IntervalConverter c = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65643);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65644);return false;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65645);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65646);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65647);return String.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65648);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65649);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65650);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65651);assertEquals(String.class, ConverterManager.getInstance().getIntervalConverter("").getSupportedType());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65652);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65653);ConverterManager.getInstance().addIntervalConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65654);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddIntervalConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ik90u1enr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ik90u1enr(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65655);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65656);IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65657);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65658);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testAddIntervalConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18zxsa51env();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testAddIntervalConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18zxsa51env(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65659);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65660);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65661)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65662)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65663);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65664);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65665);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65666);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65667);ConverterManager.getInstance().addIntervalConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65668);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65669);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65670);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65671);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRemoveIntervalConverter1() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1bs5v1eo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1bs5v1eo8(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65672);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65673);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65674);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65675);assertEquals(StringConverter.INSTANCE, removed);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65676);assertEquals(INTERVAL_SIZE - 1, ConverterManager.getInstance().getIntervalConverters().length);
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65677);ConverterManager.getInstance().addIntervalConverter(StringConverter.INSTANCE);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65678);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveIntervalConverter2() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rabqyc1eof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rabqyc1eof(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65679);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65680);IntervalConverter c = new IntervalConverter() {
            public boolean isReadableInterval(Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65681);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65682);return false;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65683);
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

            public Class getSupportedType() {try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65684);
                __CLR4_4_11e1i1e1ilgchosq1.R.inc(65685);return Boolean.class;
            }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}
        };
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65686);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65687);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65688);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveIntervalConverter3() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujbpqt1eop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverter3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujbpqt1eop(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65689);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65690);IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65691);assertEquals(null, removed);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65692);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    @Test
    public void testRemoveIntervalConverterSecurity() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewvik41eot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testRemoveIntervalConverterSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewvik41eot(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65693);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65694);if ((((OLD_JDK)&&(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65695)!=0|true))||(__CLR4_4_11e1i1e1ilgchosq1.R.iget(65696)==0&false))) {{
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65697);return;
        }
        }__CLR4_4_11e1i1e1ilgchosq1.R.inc(65698);try {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65699);Policy.setPolicy(RESTRICT);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65700);System.setSecurityManager(new SecurityManager());
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65701);ConverterManager.getInstance().removeIntervalConverter(StringConverter.INSTANCE);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65702);fail();
        } catch (SecurityException ex) {
            // ok
        } finally {
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65703);System.setSecurityManager(null);
            __CLR4_4_11e1i1e1ilgchosq1.R.inc(65704);Policy.setPolicy(ALLOW);
        }
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65705);assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length);
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceStart(getClass().getName(),65706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1ep6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11e1i1e1ilgchosq1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11e1i1e1ilgchosq1.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterManager.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),65706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1ep6(){try{__CLR4_4_11e1i1e1ilgchosq1.R.inc(65706);
        __CLR4_4_11e1i1e1ilgchosq1.R.inc(65707);assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString());
    }finally{__CLR4_4_11e1i1e1ilgchosq1.R.flushNeeded();}}

}
