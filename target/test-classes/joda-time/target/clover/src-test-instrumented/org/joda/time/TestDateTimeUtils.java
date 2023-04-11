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

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Modifier;
import java.security.*;

import static org.junit.Assert.*;

/**
 * This class is a Junit unit test for DateTimeUtils.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeUtils {static class __CLR4_4_1jsmjsmlgchorkp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,25996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;

    static {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25654);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25655);String str = System.getProperty("java.version");
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25656);boolean old = true;
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25657);if ((((str.length() > 3 &&
                str.charAt(0) == '1' &&
                str.charAt(1) == '.' &&
                (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6'))&&(__CLR4_4_1jsmjsmlgchorkp.R.iget(25658)!=0|true))||(__CLR4_4_1jsmjsmlgchorkp.R.iget(25659)==0&false))) {{
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25660);old = false;
        }
        }__CLR4_4_1jsmjsmlgchorkp.R.inc(25661);OLD_JDK = old;
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365;

    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private static final Policy RESTRICT;
    private static final Policy ALLOW;

    static {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25662);
        // don't call Policy.getPolicy()
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25663);RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25664);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25665);Permissions p = new Permissions();
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25666);p.add(new AllPermission());  // enable everything
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25667);return p;
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

            public void refresh() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25668);
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

            public boolean implies(ProtectionDomain domain, Permission permission) {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25669);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25670);if ((((permission instanceof JodaTimePermission)&&(__CLR4_4_1jsmjsmlgchorkp.R.iget(25671)!=0|true))||(__CLR4_4_1jsmjsmlgchorkp.R.iget(25672)==0&false))) {{
                    __CLR4_4_1jsmjsmlgchorkp.R.inc(25673);return false;
                }
                }__CLR4_4_1jsmjsmlgchorkp.R.inc(25674);return true;
//                return super.implies(domain, permission);
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
        };
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25675);ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25676);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25677);Permissions p = new Permissions();
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25678);p.add(new AllPermission());  // enable everything
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25679);return p;
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

            public void refresh() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25680);
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    public static void main(String[] args) throws Exception {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25681);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25682);TestDateTimeUtils TB = new TestDateTimeUtils();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25683);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25684);TB.testTest();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25685);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25686);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25687);TB.testClass();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25688);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25689);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25690);TB.testSystemMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25691);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25692);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25693);TB.testSystemMillisSecurity();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25694);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25695);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25696);TB.testFixedMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25697);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25698);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25699);TB.testFixedMillisSecurity();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25700);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25701);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25702);TB.testOffsetMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25703);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25704);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25705);TB.testOffsetMillisToZero();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25706);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25707);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25708);TB.testOffsetMillisSecurity();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25709);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25710);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25711);TB.testMillisProvider();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25712);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25713);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25714);TB.testMillisProvider_null();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25715);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25716);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25717);TB.testMillisProviderSecurity();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25718);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25719);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25720);TB.testGetInstantMillis_RI();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25721);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25722);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25723);TB.testGetInstantChronology_RI();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25724);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25725);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25726);TB.testGetIntervalChronology_RInterval();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25727);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25728);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25729);TB.testGetIntervalChronology_RI_RI();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25730);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25731);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25732);TB.testGetReadableInterval_ReadableInterval();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25733);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25734);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25735);TB.testGetChronology_Chronology();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25736);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25737);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25738);TB.testGetZone_Zone();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25739);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25740);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25741);TB.testGetPeriodType_PeriodType();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25742);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25743);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25744);TB.testGetDurationMillis_RI();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25745);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25746);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25747);TB.testIsContiguous_RP();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25748);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25749);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25750);TB.testIsContiguous_RP_GJChronology();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25751);TB.tearDown();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25752);TB.setUp();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25753);TB.test_julianDay();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25754);TB.tearDown();

    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestDateTimeUtils.class);
    }

    public TestDateTimeUtils(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25755);
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25756);
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTest() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1447pqjjvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1447pqjjvh(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25757);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25758);assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25759);assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25760);assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString());
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClass() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulvjvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulvjvl(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25761);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25762);Class<?> cls = DateTimeUtils.class;
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25763);assertEquals(true, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25764);assertEquals(false, Modifier.isFinal(cls.getModifiers()));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25765);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25766);assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers()));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25767);new DateTimeUtils() {
        };
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSystemMillis() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oi2esujvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testSystemMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oi2esujvs(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25768);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25769);long nowSystem = System.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25770);long now = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25771);assertTrue((now >= nowSystem));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25772);assertTrue((now - nowSystem) < 10000L);
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSystemMillisSecurity() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tft4ijvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testSystemMillisSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25773,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tft4ijvx(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25773);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25774);if ((((OLD_JDK)&&(__CLR4_4_1jsmjsmlgchorkp.R.iget(25775)!=0|true))||(__CLR4_4_1jsmjsmlgchorkp.R.iget(25776)==0&false))) {{
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25777);return;
        }
        }__CLR4_4_1jsmjsmlgchorkp.R.inc(25778);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25779);try {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25780);Policy.setPolicy(RESTRICT);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25781);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25782);DateTimeUtils.setCurrentMillisSystem();
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25783);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25784);System.setSecurityManager(null);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25785);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25786);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFixedMillis() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xo9rn3jwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testFixedMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xo9rn3jwb(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25787);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25788);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25789);DateTimeUtils.setCurrentMillisFixed(0L);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25790);assertEquals(0L, DateTimeUtils.currentTimeMillis());
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25791);assertEquals(0L, DateTimeUtils.currentTimeMillis());
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25792);assertEquals(0L, DateTimeUtils.currentTimeMillis());
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25793);DateTimeUtils.setCurrentMillisSystem();
        }
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25794);long nowSystem = System.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25795);long now = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25796);assertTrue((now >= nowSystem));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25797);assertTrue((now - nowSystem) < 10000L);
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testFixedMillisSecurity() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc5mcxjwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testFixedMillisSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25798,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc5mcxjwm(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25798);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25799);if ((((OLD_JDK)&&(__CLR4_4_1jsmjsmlgchorkp.R.iget(25800)!=0|true))||(__CLR4_4_1jsmjsmlgchorkp.R.iget(25801)==0&false))) {{
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25802);return;
        }
        }__CLR4_4_1jsmjsmlgchorkp.R.inc(25803);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25804);try {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25805);Policy.setPolicy(RESTRICT);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25806);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25807);DateTimeUtils.setCurrentMillisFixed(0L);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25808);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25809);System.setSecurityManager(null);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25810);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25811);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testOffsetMillis() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fty0fijx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fty0fijx0(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25812);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25813);try {
            // set time to one day ago
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25814);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25815);long nowSystem = System.currentTimeMillis();
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25816);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25817);long nowAdjustDay = now + (24 * 60 * 60 * 1000);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25818);assertTrue((now < nowSystem));
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25819);assertTrue((nowAdjustDay >= nowSystem));
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25820);assertTrue((nowAdjustDay - nowSystem) < 10000L);
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25821);DateTimeUtils.setCurrentMillisSystem();
        }
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25822);long nowSystem = System.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25823);long now = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25824);assertTrue((now >= nowSystem));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25825);assertTrue((now - nowSystem) < 10000L);
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testOffsetMillisToZero() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dfm2y3jxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillisToZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dfm2y3jxe(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25826);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25827);long now1 = 0L;
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25828);try {
            // set time to one day ago
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25829);DateTimeUtils.setCurrentMillisOffset(0);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25830);now1 = DateTimeUtils.currentTimeMillis();
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25831);DateTimeUtils.setCurrentMillisSystem();
        }
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25832);long now2 = DateTimeUtils.currentTimeMillis();
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25833);assertEquals(Math.abs(now1 - now2) < 100, true);
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testOffsetMillisSecurity() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1txu3zmjxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testOffsetMillisSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1txu3zmjxm(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25834);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25835);if ((((OLD_JDK)&&(__CLR4_4_1jsmjsmlgchorkp.R.iget(25836)!=0|true))||(__CLR4_4_1jsmjsmlgchorkp.R.iget(25837)==0&false))) {{
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25838);return;
        }
        }__CLR4_4_1jsmjsmlgchorkp.R.inc(25839);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25840);try {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25841);Policy.setPolicy(RESTRICT);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25842);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25843);DateTimeUtils.setCurrentMillisOffset(-24 * 60 * 60 * 1000);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25844);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25845);System.setSecurityManager(null);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25846);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25847);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMillisProvider() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p78riojy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p78riojy0(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25848);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25849);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25850);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() {
                public long getMillis() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25851);
                    __CLR4_4_1jsmjsmlgchorkp.R.inc(25852);return 1L;
                }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
            });
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25853);assertEquals(1L, DateTimeUtils.currentTimeMillis());
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25854);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    @Test
    public void testMillisProvider_null() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3cbvojy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProvider_null",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3cbvojy7(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25855);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25856);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25857);DateTimeUtils.setCurrentMillisProvider(null);
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMillisProviderSecurity() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1auay9cjya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testMillisProviderSecurity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1auay9cjya(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25858);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25859);if ((((OLD_JDK)&&(__CLR4_4_1jsmjsmlgchorkp.R.iget(25860)!=0|true))||(__CLR4_4_1jsmjsmlgchorkp.R.iget(25861)==0&false))) {{
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25862);return;
        }
        }__CLR4_4_1jsmjsmlgchorkp.R.inc(25863);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25864);try {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25865);Policy.setPolicy(RESTRICT);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25866);System.setSecurityManager(new SecurityManager());
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25867);DateTimeUtils.setCurrentMillisProvider(new MillisProvider() {
                    public long getMillis() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25868);
                        __CLR4_4_1jsmjsmlgchorkp.R.inc(25869);return 0L;
                    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
                });
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25870);fail();
            } catch (SecurityException ex) {
                // ok
            } finally {
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25871);System.setSecurityManager(null);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25872);Policy.setPolicy(ALLOW);
            }
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25873);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantMillis_RI() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14fwtd2jyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantMillis_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14fwtd2jyq(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25874);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25875);Instant i = new Instant(123L);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25876);assertEquals(123L, DateTimeUtils.getInstantMillis(i));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25877);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25878);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25879);assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null));
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25880);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstantChronology_RI() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1japirsjyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetInstantChronology_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1japirsjyx(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25881);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25882);DateTime dt = new DateTime(123L, BuddhistChronology.getInstance());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25883);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25884);Instant i = new Instant(123L);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25885);assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25886);AbstractInstant ai = new AbstractInstant() {
            public long getMillis() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25887);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25888);return 0L;
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

            public Chronology getChronology() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25889);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25890);return null; // testing for this
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
        };
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25891);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25892);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetIntervalChronology_RInterval() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wuvtsjz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wuvtsjz9(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25893);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25894);Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25895);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25896);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25897);MutableInterval ai = new MutableInterval() {
            private static final long serialVersionUID = 1L;

            public Chronology getChronology() {try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25898);
                __CLR4_4_1jsmjsmlgchorkp.R.inc(25899);return null; // testing for this
            }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}
        };
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25900);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetIntervalChronology_RI_RI() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hk4vcjzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetIntervalChronology_RI_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25901,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hk4vcjzh(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25901);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25902);DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25903);DateTime dt2 = new DateTime(123L, CopticChronology.getInstance());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25904);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25905);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25906);assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25907);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetReadableInterval_ReadableInterval() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qmvs3ijzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetReadableInterval_ReadableInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qmvs3ijzo(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25908);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25909);ReadableInterval input = new Interval(0, 100L);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25910);assertEquals(input, DateTimeUtils.getReadableInterval(input));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25911);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25912);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25913);assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null));
        } finally {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25914);DateTimeUtils.setCurrentMillisSystem();
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetChronology_Chronology() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w3ckv6jzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetChronology_Chronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w3ckv6jzv(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25915);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25916);assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getChronology(BuddhistChronology.getInstance()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25917);assertEquals(ISOChronology.getInstance(), DateTimeUtils.getChronology(null));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetZone_Zone() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lypqjijzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetZone_Zone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lypqjijzy(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25918);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25919);assertEquals(PARIS, DateTimeUtils.getZone(PARIS));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25920);assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_PeriodType() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m36ev6k01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetPeriodType_PeriodType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m36ev6k01(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25921);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25922);assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25923);assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_RI() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a048wxk04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testGetDurationMillis_RI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a048wxk04(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25924);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25925);Duration dur = new Duration(123L);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25926);assertEquals(123L, DateTimeUtils.getDurationMillis(dur));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25927);assertEquals(0L, DateTimeUtils.getDurationMillis(null));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testIsContiguous_RP() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hfi9a8k08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25928,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hfi9a8k08(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25928);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25929);YearMonthDay ymd = new YearMonthDay(2005, 6, 9);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25930);assertEquals(true, DateTimeUtils.isContiguous(ymd));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25931);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25932);assertEquals(true, DateTimeUtils.isContiguous(tod));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25933);Partial year = new Partial(DateTimeFieldType.year(), 2005);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25934);assertEquals(true, DateTimeUtils.isContiguous(year));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25935);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25936);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25937);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25938);assertEquals(false, DateTimeUtils.isContiguous(yearHour));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25939);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25940);assertEquals(false, DateTimeUtils.isContiguous(ymdd));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25941);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25942);assertEquals(false, DateTimeUtils.isContiguous(dd));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25943);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25944);DateTimeUtils.isContiguous((ReadablePartial) null);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25945);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testIsContiguous_RP_GJChronology() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ps2agk0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.testIsContiguous_RP_GJChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ps2agk0q(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25946);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25947);YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25948);assertEquals(true, DateTimeUtils.isContiguous(ymd));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25949);TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25950);assertEquals(true, DateTimeUtils.isContiguous(tod));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25951);Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25952);assertEquals(true, DateTimeUtils.isContiguous(year));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25953);Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25954);assertEquals(true, DateTimeUtils.isContiguous(hourOfDay));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25955);Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25956);assertEquals(false, DateTimeUtils.isContiguous(yearHour));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25957);Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25958);assertEquals(false, DateTimeUtils.isContiguous(ymdd));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25959);Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25960);assertEquals(false, DateTimeUtils.isContiguous(dd));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25961);try {
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25962);DateTimeUtils.isContiguous((ReadablePartial) null);
            __CLR4_4_1jsmjsmlgchorkp.R.inc(25963);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_julianDay() {__CLR4_4_1jsmjsmlgchorkp.R.globalSliceStart(getClass().getName(),25964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kolpz5k18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jsmjsmlgchorkp.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jsmjsmlgchorkp.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestDateTimeUtils.test_julianDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),25964,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kolpz5k18(){try{__CLR4_4_1jsmjsmlgchorkp.R.inc(25964);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25965);DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC);

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25966);assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25967);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25968);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25969);base = base.plusHours(6);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25970);assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25971);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25972);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25973);base = base.plusHours(6);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25974);assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25975);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25976);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25977);base = base.plusHours(6);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25978);assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25979);assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25980);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25981);base = base.plusHours(6);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25982);assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25983);assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25984);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25985);base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25986);assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25987);assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis()));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25988);base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25989);assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25990);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25991);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d));

        __CLR4_4_1jsmjsmlgchorkp.R.inc(25992);base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC());
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25993);assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d);
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25994);assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis()));
        __CLR4_4_1jsmjsmlgchorkp.R.inc(25995);assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d));
    }finally{__CLR4_4_1jsmjsmlgchorkp.R.flushNeeded();}}

}
