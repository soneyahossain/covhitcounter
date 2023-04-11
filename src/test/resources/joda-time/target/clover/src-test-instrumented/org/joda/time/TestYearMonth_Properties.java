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
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Properties {static class __CLR4_4_11a401a40lgchosks{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,60040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

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

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11a401a40lgchosks.R.inc(59760);
        __CLR4_4_11a401a40lgchosks.R.inc(59761);TestYearMonth_Properties TB = new TestYearMonth_Properties();
        __CLR4_4_11a401a40lgchosks.R.inc(59762);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59763);TB.testPropertyGetYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59764);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59765);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59766);TB.testPropertyGetMaxMinValuesYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59767);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59768);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59769);TB.testPropertyAddYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59770);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59771);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59772);TB.testPropertyAddWrapFieldYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59773);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59774);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59775);TB.testPropertySetYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59776);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59777);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59778);TB.testPropertySetTextYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59779);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59780);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59781);TB.testPropertyCompareToYear();
        __CLR4_4_11a401a40lgchosks.R.inc(59782);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59783);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59784);TB.testPropertyGetMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59785);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59786);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59787);TB.testPropertyGetMaxMinValuesMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59788);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59789);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59790);TB.testPropertyAddMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59791);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59792);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59793);TB.testPropertyAddWrapFieldMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59794);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59795);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59796);TB.testPropertySetMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59797);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59798);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59799);TB.testPropertySetTextMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59800);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59801);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59802);TB.testPropertyCompareToMonth();
        __CLR4_4_11a401a40lgchosks.R.inc(59803);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59804);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59805);TB.testPropertyEquals();
        __CLR4_4_11a401a40lgchosks.R.inc(59806);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59807);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59808);TB.testPropertyHashCode();
        __CLR4_4_11a401a40lgchosks.R.inc(59809);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59810);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59811);TB.testPropertyEqualsHashCodeLenient();
        __CLR4_4_11a401a40lgchosks.R.inc(59812);TB.tearDown();
        __CLR4_4_11a401a40lgchosks.R.inc(59813);TB.setUp();
        __CLR4_4_11a401a40lgchosks.R.inc(59814);TB.testPropertyEqualsHashCodeStrict();
        __CLR4_4_11a401a40lgchosks.R.inc(59815);TB.tearDown();

    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}
/*
    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Properties.class);
    }

    public TestYearMonth_Properties(String name) {
        super(name);
    }

 */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11a401a40lgchosks.R.inc(59816);
        __CLR4_4_11a401a40lgchosks.R.inc(59817);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_11a401a40lgchosks.R.inc(59818);zone = DateTimeZone.getDefault();
        __CLR4_4_11a401a40lgchosks.R.inc(59819);DateTimeZone.setDefault(DateTimeZone.UTC);
        __CLR4_4_11a401a40lgchosks.R.inc(59820);systemDefaultLocale = Locale.getDefault();
        __CLR4_4_11a401a40lgchosks.R.inc(59821);Locale.setDefault(Locale.ENGLISH);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11a401a40lgchosks.R.inc(59822);
        __CLR4_4_11a401a40lgchosks.R.inc(59823);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_11a401a40lgchosks.R.inc(59824);DateTimeZone.setDefault(zone);
        __CLR4_4_11a401a40lgchosks.R.inc(59825);zone = null;
        __CLR4_4_11a401a40lgchosks.R.inc(59826);Locale.setDefault(systemDefaultLocale);
        __CLR4_4_11a401a40lgchosks.R.inc(59827);systemDefaultLocale = null;
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgqcqb1a5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgqcqb1a5w(){try{__CLR4_4_11a401a40lgchosks.R.inc(59828);
        __CLR4_4_11a401a40lgchosks.R.inc(59829);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59830);assertSame(test.getChronology().year(), test.year().getField());
        __CLR4_4_11a401a40lgchosks.R.inc(59831);assertEquals("year", test.year().getName());
        __CLR4_4_11a401a40lgchosks.R.inc(59832);assertEquals("Property[year]", test.year().toString());
        __CLR4_4_11a401a40lgchosks.R.inc(59833);assertSame(test, test.year().getReadablePartial());
        __CLR4_4_11a401a40lgchosks.R.inc(59834);assertSame(test, test.year().getYearMonth());
        __CLR4_4_11a401a40lgchosks.R.inc(59835);assertEquals(1972, test.year().get());
        __CLR4_4_11a401a40lgchosks.R.inc(59836);assertEquals("1972", test.year().getAsString());
        __CLR4_4_11a401a40lgchosks.R.inc(59837);assertEquals("1972", test.year().getAsText());
        __CLR4_4_11a401a40lgchosks.R.inc(59838);assertEquals("1972", test.year().getAsText(Locale.FRENCH));
        __CLR4_4_11a401a40lgchosks.R.inc(59839);assertEquals("1972", test.year().getAsShortText());
        __CLR4_4_11a401a40lgchosks.R.inc(59840);assertEquals("1972", test.year().getAsShortText(Locale.FRENCH));
        __CLR4_4_11a401a40lgchosks.R.inc(59841);assertEquals(test.getChronology().years(), test.year().getDurationField());
        __CLR4_4_11a401a40lgchosks.R.inc(59842);assertEquals(null, test.year().getRangeDurationField());
        __CLR4_4_11a401a40lgchosks.R.inc(59843);assertEquals(9, test.year().getMaximumTextLength(null));
        __CLR4_4_11a401a40lgchosks.R.inc(59844);assertEquals(9, test.year().getMaximumShortTextLength(null));
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12r9x9f1a6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMaxMinValuesYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12r9x9f1a6d(){try{__CLR4_4_11a401a40lgchosks.R.inc(59845);
        __CLR4_4_11a401a40lgchosks.R.inc(59846);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59847);assertEquals(-292275054, test.year().getMinimumValue());
        __CLR4_4_11a401a40lgchosks.R.inc(59848);assertEquals(-292275054, test.year().getMinimumValueOverall());
        __CLR4_4_11a401a40lgchosks.R.inc(59849);assertEquals(292278993, test.year().getMaximumValue());
        __CLR4_4_11a401a40lgchosks.R.inc(59850);assertEquals(292278993, test.year().getMaximumValueOverall());
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyAddYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0tefy1a6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0tefy1a6j(){try{__CLR4_4_11a401a40lgchosks.R.inc(59851);
        __CLR4_4_11a401a40lgchosks.R.inc(59852);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59853);YearMonth copy = test.year().addToCopy(9);
        __CLR4_4_11a401a40lgchosks.R.inc(59854);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59855);check(copy, 1981, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59856);copy = test.year().addToCopy(0);
        __CLR4_4_11a401a40lgchosks.R.inc(59857);check(copy, 1972, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59858);copy = test.year().addToCopy(292277023 - 1972);
        __CLR4_4_11a401a40lgchosks.R.inc(59859);check(copy, 292277023, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59860);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59861);test.year().addToCopy(292278993 - 1972 + 1);
            __CLR4_4_11a401a40lgchosks.R.inc(59862);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11a401a40lgchosks.R.inc(59863);check(test, 1972, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59864);copy = test.year().addToCopy(-1972);
        __CLR4_4_11a401a40lgchosks.R.inc(59865);check(copy, 0, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59866);copy = test.year().addToCopy(-1973);
        __CLR4_4_11a401a40lgchosks.R.inc(59867);check(copy, -1, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59868);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59869);test.year().addToCopy(-292275054 - 1972 - 1);
            __CLR4_4_11a401a40lgchosks.R.inc(59870);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11a401a40lgchosks.R.inc(59871);check(test, 1972, 6);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjgig61a74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjgig61a74(){try{__CLR4_4_11a401a40lgchosks.R.inc(59872);
        __CLR4_4_11a401a40lgchosks.R.inc(59873);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59874);YearMonth copy = test.year().addWrapFieldToCopy(9);
        __CLR4_4_11a401a40lgchosks.R.inc(59875);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59876);check(copy, 1981, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59877);copy = test.year().addWrapFieldToCopy(0);
        __CLR4_4_11a401a40lgchosks.R.inc(59878);check(copy, 1972, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59879);copy = test.year().addWrapFieldToCopy(292278993 - 1972 + 1);
        __CLR4_4_11a401a40lgchosks.R.inc(59880);check(copy, -292275054, 6);

        __CLR4_4_11a401a40lgchosks.R.inc(59881);copy = test.year().addWrapFieldToCopy(-292275054 - 1972 - 1);
        __CLR4_4_11a401a40lgchosks.R.inc(59882);check(copy, 292278993, 6);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertySetYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9ziwx1a7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9ziwx1a7f(){try{__CLR4_4_11a401a40lgchosks.R.inc(59883);
        __CLR4_4_11a401a40lgchosks.R.inc(59884);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59885);YearMonth copy = test.year().setCopy(12);
        __CLR4_4_11a401a40lgchosks.R.inc(59886);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59887);check(copy, 12, 6);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertySetTextYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qaw4s1a7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qaw4s1a7k(){try{__CLR4_4_11a401a40lgchosks.R.inc(59888);
        __CLR4_4_11a401a40lgchosks.R.inc(59889);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59890);YearMonth copy = test.year().setCopy("12");
        __CLR4_4_11a401a40lgchosks.R.inc(59891);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59892);check(copy, 12, 6);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToYear() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ft7ab1a7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToYear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ft7ab1a7p(){try{__CLR4_4_11a401a40lgchosks.R.inc(59893);
        __CLR4_4_11a401a40lgchosks.R.inc(59894);YearMonth test1 = new YearMonth(TEST_TIME1);
        __CLR4_4_11a401a40lgchosks.R.inc(59895);YearMonth test2 = new YearMonth(TEST_TIME2);
        __CLR4_4_11a401a40lgchosks.R.inc(59896);assertEquals(true, test1.year().compareTo(test2) < 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59897);assertEquals(true, test2.year().compareTo(test1) > 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59898);assertEquals(true, test1.year().compareTo(test1) == 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59899);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59900);test1.year().compareTo((ReadablePartial) null);
            __CLR4_4_11a401a40lgchosks.R.inc(59901);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11a401a40lgchosks.R.inc(59902);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_11a401a40lgchosks.R.inc(59903);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_11a401a40lgchosks.R.inc(59904);assertEquals(true, test1.year().compareTo(dt2) < 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59905);assertEquals(true, test2.year().compareTo(dt1) > 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59906);assertEquals(true, test1.year().compareTo(dt1) == 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59907);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59908);test1.year().compareTo((ReadableInstant) null);
            __CLR4_4_11a401a40lgchosks.R.inc(59909);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyGetMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ox6q201a86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59910,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ox6q201a86(){try{__CLR4_4_11a401a40lgchosks.R.inc(59910);
        __CLR4_4_11a401a40lgchosks.R.inc(59911);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59912);assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField());
        __CLR4_4_11a401a40lgchosks.R.inc(59913);assertEquals("monthOfYear", test.monthOfYear().getName());
        __CLR4_4_11a401a40lgchosks.R.inc(59914);assertEquals("Property[monthOfYear]", test.monthOfYear().toString());
        __CLR4_4_11a401a40lgchosks.R.inc(59915);assertSame(test, test.monthOfYear().getReadablePartial());
        __CLR4_4_11a401a40lgchosks.R.inc(59916);assertSame(test, test.monthOfYear().getYearMonth());
        __CLR4_4_11a401a40lgchosks.R.inc(59917);assertEquals(6, test.monthOfYear().get());
        __CLR4_4_11a401a40lgchosks.R.inc(59918);assertEquals("6", test.monthOfYear().getAsString());
        __CLR4_4_11a401a40lgchosks.R.inc(59919);assertEquals("June", test.monthOfYear().getAsText());
        __CLR4_4_11a401a40lgchosks.R.inc(59920);assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_11a401a40lgchosks.R.inc(59921);assertEquals("Jun", test.monthOfYear().getAsShortText());
        __CLR4_4_11a401a40lgchosks.R.inc(59922);assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH));
        __CLR4_4_11a401a40lgchosks.R.inc(59923);assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField());
        __CLR4_4_11a401a40lgchosks.R.inc(59924);assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField());
        __CLR4_4_11a401a40lgchosks.R.inc(59925);assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
        __CLR4_4_11a401a40lgchosks.R.inc(59926);assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
        __CLR4_4_11a401a40lgchosks.R.inc(59927);test = new YearMonth(1972, 7);
        __CLR4_4_11a401a40lgchosks.R.inc(59928);assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH));
        __CLR4_4_11a401a40lgchosks.R.inc(59929);assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH));
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyGetMaxMinValuesMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gzdw81a8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyGetMaxMinValuesMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gzdw81a8q(){try{__CLR4_4_11a401a40lgchosks.R.inc(59930);
        __CLR4_4_11a401a40lgchosks.R.inc(59931);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59932);assertEquals(1, test.monthOfYear().getMinimumValue());
        __CLR4_4_11a401a40lgchosks.R.inc(59933);assertEquals(1, test.monthOfYear().getMinimumValueOverall());
        __CLR4_4_11a401a40lgchosks.R.inc(59934);assertEquals(12, test.monthOfYear().getMaximumValue());
        __CLR4_4_11a401a40lgchosks.R.inc(59935);assertEquals(12, test.monthOfYear().getMaximumValueOverall());
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyAddMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mc6tp1a8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mc6tp1a8w(){try{__CLR4_4_11a401a40lgchosks.R.inc(59936);
        __CLR4_4_11a401a40lgchosks.R.inc(59937);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59938);YearMonth copy = test.monthOfYear().addToCopy(6);
        __CLR4_4_11a401a40lgchosks.R.inc(59939);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59940);check(copy, 1972, 12);

        __CLR4_4_11a401a40lgchosks.R.inc(59941);copy = test.monthOfYear().addToCopy(7);
        __CLR4_4_11a401a40lgchosks.R.inc(59942);check(copy, 1973, 1);

        __CLR4_4_11a401a40lgchosks.R.inc(59943);copy = test.monthOfYear().addToCopy(-5);
        __CLR4_4_11a401a40lgchosks.R.inc(59944);check(copy, 1972, 1);

        __CLR4_4_11a401a40lgchosks.R.inc(59945);copy = test.monthOfYear().addToCopy(-6);
        __CLR4_4_11a401a40lgchosks.R.inc(59946);check(copy, 1971, 12);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyAddWrapFieldMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eopsr51a97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyAddWrapFieldMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eopsr51a97(){try{__CLR4_4_11a401a40lgchosks.R.inc(59947);
        __CLR4_4_11a401a40lgchosks.R.inc(59948);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59949);YearMonth copy = test.monthOfYear().addWrapFieldToCopy(4);
        __CLR4_4_11a401a40lgchosks.R.inc(59950);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59951);check(copy, 1972, 10);

        __CLR4_4_11a401a40lgchosks.R.inc(59952);copy = test.monthOfYear().addWrapFieldToCopy(8);
        __CLR4_4_11a401a40lgchosks.R.inc(59953);check(copy, 1972, 2);

        __CLR4_4_11a401a40lgchosks.R.inc(59954);copy = test.monthOfYear().addWrapFieldToCopy(-8);
        __CLR4_4_11a401a40lgchosks.R.inc(59955);check(copy, 1972, 10);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertySetMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19dfzhw1a9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19dfzhw1a9g(){try{__CLR4_4_11a401a40lgchosks.R.inc(59956);
        __CLR4_4_11a401a40lgchosks.R.inc(59957);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59958);YearMonth copy = test.monthOfYear().setCopy(12);
        __CLR4_4_11a401a40lgchosks.R.inc(59959);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59960);check(copy, 1972, 12);

        __CLR4_4_11a401a40lgchosks.R.inc(59961);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59962);test.monthOfYear().setCopy(13);
            __CLR4_4_11a401a40lgchosks.R.inc(59963);fail();
        } catch (IllegalArgumentException ex) {
        }
        __CLR4_4_11a401a40lgchosks.R.inc(59964);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59965);test.monthOfYear().setCopy(0);
            __CLR4_4_11a401a40lgchosks.R.inc(59966);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertySetTextMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb5cw11a9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertySetTextMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb5cw11a9r(){try{__CLR4_4_11a401a40lgchosks.R.inc(59967);
        __CLR4_4_11a401a40lgchosks.R.inc(59968);YearMonth test = new YearMonth(1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59969);YearMonth copy = test.monthOfYear().setCopy("12");
        __CLR4_4_11a401a40lgchosks.R.inc(59970);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59971);check(copy, 1972, 12);

        __CLR4_4_11a401a40lgchosks.R.inc(59972);copy = test.monthOfYear().setCopy("December");
        __CLR4_4_11a401a40lgchosks.R.inc(59973);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59974);check(copy, 1972, 12);

        __CLR4_4_11a401a40lgchosks.R.inc(59975);copy = test.monthOfYear().setCopy("Dec");
        __CLR4_4_11a401a40lgchosks.R.inc(59976);check(test, 1972, 6);
        __CLR4_4_11a401a40lgchosks.R.inc(59977);check(copy, 1972, 12);
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyCompareToMonth() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjk8wi1aa2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyCompareToMonth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjk8wi1aa2(){try{__CLR4_4_11a401a40lgchosks.R.inc(59978);
        __CLR4_4_11a401a40lgchosks.R.inc(59979);YearMonth test1 = new YearMonth(TEST_TIME1);
        __CLR4_4_11a401a40lgchosks.R.inc(59980);YearMonth test2 = new YearMonth(TEST_TIME2);
        __CLR4_4_11a401a40lgchosks.R.inc(59981);assertEquals(true, test1.monthOfYear().compareTo(test2) < 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59982);assertEquals(true, test2.monthOfYear().compareTo(test1) > 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59983);assertEquals(true, test1.monthOfYear().compareTo(test1) == 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59984);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59985);test1.monthOfYear().compareTo((ReadablePartial) null);
            __CLR4_4_11a401a40lgchosks.R.inc(59986);fail();
        } catch (IllegalArgumentException ex) {
        }

        __CLR4_4_11a401a40lgchosks.R.inc(59987);DateTime dt1 = new DateTime(TEST_TIME1);
        __CLR4_4_11a401a40lgchosks.R.inc(59988);DateTime dt2 = new DateTime(TEST_TIME2);
        __CLR4_4_11a401a40lgchosks.R.inc(59989);assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59990);assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59991);assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0);
        __CLR4_4_11a401a40lgchosks.R.inc(59992);try {
            __CLR4_4_11a401a40lgchosks.R.inc(59993);test1.monthOfYear().compareTo((ReadableInstant) null);
            __CLR4_4_11a401a40lgchosks.R.inc(59994);fail();
        } catch (IllegalArgumentException ex) {
        }
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testPropertyEquals() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),59995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2ub0z1aaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),59995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2ub0z1aaj(){try{__CLR4_4_11a401a40lgchosks.R.inc(59995);
        __CLR4_4_11a401a40lgchosks.R.inc(59996);YearMonth test1 = new YearMonth(11, 11);
        __CLR4_4_11a401a40lgchosks.R.inc(59997);YearMonth test2 = new YearMonth(11, 12);
        __CLR4_4_11a401a40lgchosks.R.inc(59998);YearMonth test3 = new YearMonth(11, 11, CopticChronology.getInstanceUTC());
        __CLR4_4_11a401a40lgchosks.R.inc(59999);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60000);assertEquals(false, test1.monthOfYear().equals(test1.year()));
        __CLR4_4_11a401a40lgchosks.R.inc(60001);assertEquals(false, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60002);assertEquals(false, test1.monthOfYear().equals(test2.year()));

        __CLR4_4_11a401a40lgchosks.R.inc(60003);assertEquals(false, test1.year().equals(test1.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60004);assertEquals(true, test1.year().equals(test1.year()));
        __CLR4_4_11a401a40lgchosks.R.inc(60005);assertEquals(false, test1.year().equals(test2.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60006);assertEquals(true, test1.year().equals(test2.year()));

        __CLR4_4_11a401a40lgchosks.R.inc(60007);assertEquals(false, test1.monthOfYear().equals(null));
        __CLR4_4_11a401a40lgchosks.R.inc(60008);assertEquals(false, test1.monthOfYear().equals("any"));

        // chrono
        __CLR4_4_11a401a40lgchosks.R.inc(60009);assertEquals(false, test1.monthOfYear().equals(test3.monthOfYear()));
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyHashCode() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),60010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y278s71aay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y278s71aay(){try{__CLR4_4_11a401a40lgchosks.R.inc(60010);
        __CLR4_4_11a401a40lgchosks.R.inc(60011);YearMonth test1 = new YearMonth(2005, 11);
        __CLR4_4_11a401a40lgchosks.R.inc(60012);YearMonth test2 = new YearMonth(2005, 12);
        __CLR4_4_11a401a40lgchosks.R.inc(60013);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60014);assertEquals(false, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60015);assertEquals(true, test1.year().hashCode() == test1.year().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60016);assertEquals(true, test1.year().hashCode() == test2.year().hashCode());
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeLenient() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),60017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoanxf1ab5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeLenient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoanxf1ab5(){try{__CLR4_4_11a401a40lgchosks.R.inc(60017);
        __CLR4_4_11a401a40lgchosks.R.inc(60018);YearMonth test1 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_11a401a40lgchosks.R.inc(60019);YearMonth test2 = new YearMonth(1970, 6, LenientChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_11a401a40lgchosks.R.inc(60020);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60021);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60022);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60023);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60024);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60025);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60026);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    @Test
    public void testPropertyEqualsHashCodeStrict() {__CLR4_4_11a401a40lgchosks.R.globalSliceStart(getClass().getName(),60027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ev6icv1abf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11a401a40lgchosks.R.rethrow($CLV_t2$);}finally{__CLR4_4_11a401a40lgchosks.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestYearMonth_Properties.testPropertyEqualsHashCodeStrict",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),60027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ev6icv1abf(){try{__CLR4_4_11a401a40lgchosks.R.inc(60027);
        __CLR4_4_11a401a40lgchosks.R.inc(60028);YearMonth test1 = new YearMonth(1970, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_11a401a40lgchosks.R.inc(60029);YearMonth test2 = new YearMonth(1970, 6, StrictChronology.getInstance(COPTIC_PARIS));
        __CLR4_4_11a401a40lgchosks.R.inc(60030);assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60031);assertEquals(true, test2.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60032);assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60033);assertEquals(true, test2.monthOfYear().equals(test2.monthOfYear()));
        __CLR4_4_11a401a40lgchosks.R.inc(60034);assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60035);assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode());
        __CLR4_4_11a401a40lgchosks.R.inc(60036);assertEquals(true, test2.monthOfYear().hashCode() == test2.monthOfYear().hashCode());
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {try{__CLR4_4_11a401a40lgchosks.R.inc(60037);
        __CLR4_4_11a401a40lgchosks.R.inc(60038);assertEquals(year, test.getYear());
        __CLR4_4_11a401a40lgchosks.R.inc(60039);assertEquals(month, test.getMonthOfYear());
    }finally{__CLR4_4_11a401a40lgchosks.R.flushNeeded();}}
}
