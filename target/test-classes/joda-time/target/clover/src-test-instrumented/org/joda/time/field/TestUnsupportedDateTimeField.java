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
package org.joda.time.field;

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;

/**
 * This class is a JUnit test to test only the UnsupportedDateTimeField class.
 * This set of test cases exercises everything described in the Javadoc for this
 * class.
 *
 * @author Jeremy R. Rickard
 */
public class TestUnsupportedDateTimeField {static class __CLR4_4_11hum1humlgchosu7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,70046,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DurationFieldType weeks;
    private DurationFieldType months;
    private DateTimeFieldType dateTimeFieldTypeOne;
    private ReadablePartial localTime;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11hum1humlgchosu7.R.inc(69790);

        __CLR4_4_11hum1humlgchosu7.R.inc(69791);TestUnsupportedDateTimeField TB = new TestUnsupportedDateTimeField();
        __CLR4_4_11hum1humlgchosu7.R.inc(69792);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69793);TB.testNullValuesToGetInstanceThrowsException();
        __CLR4_4_11hum1humlgchosu7.R.inc(69794);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69795);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69796);TB.testDifferentDurationReturnDifferentObjects();
        __CLR4_4_11hum1humlgchosu7.R.inc(69797);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69798);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69799);TB.testPublicGetNameMethod();
        __CLR4_4_11hum1humlgchosu7.R.inc(69800);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69801);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69802);TB.testAlwaysFalseReturnTypes();
        __CLR4_4_11hum1humlgchosu7.R.inc(69803);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69804);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69805);TB.testMethodsThatShouldAlwaysReturnNull();
        __CLR4_4_11hum1humlgchosu7.R.inc(69806);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69807);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69808);TB.testUnsupportedMethods();
        __CLR4_4_11hum1humlgchosu7.R.inc(69809);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69810);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69811);TB.testDelegatedMethods();
        __CLR4_4_11hum1humlgchosu7.R.inc(69812);TB.tearDown();
        __CLR4_4_11hum1humlgchosu7.R.inc(69813);TB.setUp();
        __CLR4_4_11hum1humlgchosu7.R.inc(69814);TB.testToString();
        __CLR4_4_11hum1humlgchosu7.R.inc(69815);TB.tearDown();
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11hum1humlgchosu7.R.inc(69816);
        __CLR4_4_11hum1humlgchosu7.R.inc(69817);weeks = DurationFieldType.weeks();
        __CLR4_4_11hum1humlgchosu7.R.inc(69818);months = DurationFieldType.months();
        __CLR4_4_11hum1humlgchosu7.R.inc(69819);dateTimeFieldTypeOne = DateTimeFieldType.centuryOfEra();
        __CLR4_4_11hum1humlgchosu7.R.inc(69820);localTime = new LocalTime();
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11hum1humlgchosu7.R.inc(69821);
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * Passing null values into UnsupportedDateTimeField.getInstance() should
     * throw an IllegalArguementsException
     */
    @Test
    public void testNullValuesToGetInstanceThrowsException() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ax1k4s1hvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testNullValuesToGetInstanceThrowsException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ax1k4s1hvi(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69822);

        __CLR4_4_11hum1humlgchosu7.R.inc(69823);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69824);UnsupportedDateTimeField.getInstance(null, null);
            __CLR4_4_11hum1humlgchosu7.R.inc(69825);assertTrue(false);
        } catch (IllegalArgumentException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69826);assertTrue(true);
        }
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * This test exercises the logic in UnsupportedDateTimeField.getInstance. If
     * getInstance() is invoked twice with: - the same DateTimeFieldType -
     * different duration fields
     * <p>
     * Then the field returned in the first invocation should not be equal to
     * the field returned by the second invocation. In other words, the generated
     * instance should be the same for a unique pairing of
     * DateTimeFieldType/DurationField
     */
    @Test
    public void testDifferentDurationReturnDifferentObjects() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p6ymdp1hvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDifferentDurationReturnDifferentObjects",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p6ymdp1hvn(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69827);

        /**
         * The fields returned by getInstance should be the same when the
         * duration is the same for both method calls.
         */
        __CLR4_4_11hum1humlgchosu7.R.inc(69828);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_11hum1humlgchosu7.R.inc(69829);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_11hum1humlgchosu7.R.inc(69830);assertSame(fieldOne, fieldTwo);

        /**
         * The fields returned by getInstance should NOT be the same when the
         * duration is the same for both method calls.
         */
        __CLR4_4_11hum1humlgchosu7.R.inc(69831);DateTimeField fieldThree = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(months));
        __CLR4_4_11hum1humlgchosu7.R.inc(69832);assertNotSame(fieldOne, fieldThree);
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * The getName() method should return the same value as the getName() method
     * of the DateTimeFieldType that was used to create the instance.
     */
    @Test
    public void testPublicGetNameMethod() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cx2rbi1hvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testPublicGetNameMethod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cx2rbi1hvt(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69833);
        __CLR4_4_11hum1humlgchosu7.R.inc(69834);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        __CLR4_4_11hum1humlgchosu7.R.inc(69835);assertSame(fieldOne.getName(), dateTimeFieldTypeOne.getName());
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * As this is an unsupported date/time field, some normal methods will
     * always return false, as they are not supported. Verify that each method
     * correctly returns null.
     */
    @Test
    public void testAlwaysFalseReturnTypes() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16oc27m1hvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testAlwaysFalseReturnTypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69836,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16oc27m1hvw(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69836);
        __CLR4_4_11hum1humlgchosu7.R.inc(69837);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_11hum1humlgchosu7.R.inc(69838);assertFalse(fieldOne.isLenient());
        __CLR4_4_11hum1humlgchosu7.R.inc(69839);assertFalse(fieldOne.isSupported());
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * According to the JavaDocs, there are two methods that should always
     * return null. * getRangeDurationField() * getLeapDurationField()
     * <p>
     * Ensure that these are in fact null.
     */

    @Test
    public void testMethodsThatShouldAlwaysReturnNull() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mixg3r1hw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testMethodsThatShouldAlwaysReturnNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mixg3r1hw0(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69840);
        __CLR4_4_11hum1humlgchosu7.R.inc(69841);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        __CLR4_4_11hum1humlgchosu7.R.inc(69842);assertNull(fieldOne.getLeapDurationField());
        __CLR4_4_11hum1humlgchosu7.R.inc(69843);assertNull(fieldOne.getRangeDurationField());
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported and throw an UnsupportedOperationException. Verify that each
     * method correctly throws this exception. * add(ReadablePartial instant,
     * int fieldIndex, int[] values, int valueToAdd) * addWrapField(long
     * instant, int value) * addWrapField(ReadablePartial instant, int
     * fieldIndex, int[] values, int valueToAdd) *
     * addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int
     * valueToAdd) * get(long instant) * getAsShortText(int fieldValue, Locale
     * locale) * getAsShortText(long instant) * getAsShortText(long instant,
     * Locale locale) * getAsShortText(ReadablePartial partial, int fieldValue,
     * Locale locale) * getAsShortText(ReadablePartial partial, Locale locale) *
     * getAsText(int fieldValue, Locale locale) * getAsText(long instant) *
     * getAsText(long instant, Locale locale) * getAsText(ReadablePartial
     * partial, int fieldValue, Locale locale) * getAsText(ReadablePartial
     * partial, Locale locale) * getLeapAmount(long instant) *
     * getMaximumShortTextLength(Locale locale) * getMaximumTextLength(Locale
     * locale) * getMaximumValue() * getMaximumValue(long instant) *
     * getMaximumValue(ReadablePartial instant) *
     * getMaximumValue(ReadablePartial instant, int[] values) *
     * getMinimumValue() * getMinimumValue(long instant) *
     * getMinimumValue(ReadablePartial instant) *
     * getMinimumValue(ReadablePartial instant, int[] values) * isLeap(long
     * instant) * remainder(long instant) * roundCeiling(long instant) *
     * roundFloor(long instant) * roundHalfCeiling(long instant) *
     * roundHalfEven(long instant) * roundHalfFloor(long instant) * set(long
     * instant, int value) * set(long instant, String text) * set(long instant,
     * String text, Locale locale) * set(ReadablePartial instant, int
     * fieldIndex, int[] values, int newValue) * set(ReadablePartial instant,
     * int fieldIndex, int[] values, String text, Locale locale)
     */
    @Test
    public void testUnsupportedMethods() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwfdcm1hw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testUnsupportedMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwfdcm1hw4(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69844);
        __CLR4_4_11hum1humlgchosu7.R.inc(69845);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        // add(ReadablePartial instant, int fieldIndex, int[] values, int
        // valueToAdd)
        __CLR4_4_11hum1humlgchosu7.R.inc(69846);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69847);fieldOne.add(localTime, 0, new int[]{0, 100}, 100);
            __CLR4_4_11hum1humlgchosu7.R.inc(69848);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69849);assertTrue(true);
        }
        // addWrapField(long instant, int value)
        __CLR4_4_11hum1humlgchosu7.R.inc(69850);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69851);fieldOne.addWrapField(100000L, 250);
            __CLR4_4_11hum1humlgchosu7.R.inc(69852);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69853);assertTrue(true);
        }
        // addWrapField(ReadablePartial instant, int fieldIndex, int[] values,
        // int valueToAdd)
        __CLR4_4_11hum1humlgchosu7.R.inc(69854);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69855);fieldOne.addWrapField(localTime, 0, new int[]{0, 100}, 100);
            __CLR4_4_11hum1humlgchosu7.R.inc(69856);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69857);assertTrue(true);
        }
        // addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values,
        // int valueToAdd)
        __CLR4_4_11hum1humlgchosu7.R.inc(69858);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69859);fieldOne.addWrapPartial(localTime, 0, new int[]{0, 100}, 100);
            __CLR4_4_11hum1humlgchosu7.R.inc(69860);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69861);assertTrue(true);
        }
        // UnsupportedDateTimeField.get(long instant)
        __CLR4_4_11hum1humlgchosu7.R.inc(69862);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69863);fieldOne.get(1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69864);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69865);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(int fieldValue,
        // Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69866);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69867);fieldOne.getAsShortText(0, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69868);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69869);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(long instant)
        __CLR4_4_11hum1humlgchosu7.R.inc(69870);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69871);fieldOne.getAsShortText(100000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69872);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69873);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(long instant, Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69874);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69875);fieldOne.getAsShortText(100000L, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69876);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69877);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(ReadablePartial partial,
        // int fieldValue,
        // Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69878);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69879);fieldOne.getAsShortText(localTime, 0, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69880);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69881);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsShortText(ReadablePartial partial,
        // Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69882);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69883);fieldOne.getAsShortText(localTime, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69884);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69885);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(int fieldValue,
        // Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69886);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69887);fieldOne.getAsText(0, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69888);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69889);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(long instant)
        __CLR4_4_11hum1humlgchosu7.R.inc(69890);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69891);fieldOne.getAsText(1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69892);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69893);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(long instant, Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69894);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69895);fieldOne.getAsText(1000L, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69896);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69897);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(ReadablePartial partial,
        // int fieldValue,
        // Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69898);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69899);fieldOne.getAsText(localTime, 0, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69900);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69901);assertTrue(true);
        }

        // UnsupportedDateTimeField.getAsText(ReadablePartial partial,
        // Locale locale)
        __CLR4_4_11hum1humlgchosu7.R.inc(69902);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69903);fieldOne.getAsText(localTime, Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69904);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69905);assertTrue(true);
        }

        // UnsupportedDateTimeField.getLeapAmount(long instant) is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69906);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69907);fieldOne.getLeapAmount(System.currentTimeMillis());
            __CLR4_4_11hum1humlgchosu7.R.inc(69908);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69909);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumShortTextLength(Locale locale)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69910);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69911);fieldOne.getMaximumShortTextLength(Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69912);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69913);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumTextLength(Locale locale)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69914);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69915);fieldOne.getMaximumTextLength(Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69916);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69917);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue() is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69918);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69919);fieldOne.getMaximumValue();
            __CLR4_4_11hum1humlgchosu7.R.inc(69920);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69921);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue(long instant)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69922);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69923);fieldOne.getMaximumValue(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69924);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69925);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue(ReadablePartial instant)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69926);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69927);fieldOne.getMaximumValue(localTime);
            __CLR4_4_11hum1humlgchosu7.R.inc(69928);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69929);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMaximumValue(ReadablePartial instant,
        // int[] values)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69930);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69931);fieldOne.getMaximumValue(localTime, new int[]{0});
            __CLR4_4_11hum1humlgchosu7.R.inc(69932);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69933);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue() is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69934);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69935);fieldOne.getMinimumValue();
            __CLR4_4_11hum1humlgchosu7.R.inc(69936);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69937);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue(long instant) is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69938);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69939);fieldOne.getMinimumValue(10000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69940);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69941);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue(ReadablePartial instant)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69942);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69943);fieldOne.getMinimumValue(localTime);
            __CLR4_4_11hum1humlgchosu7.R.inc(69944);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69945);assertTrue(true);
        }

        // UnsupportedDateTimeField.getMinumumValue(ReadablePartial instant,
        // int[] values) is unsupported
        // and should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69946);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69947);fieldOne.getMinimumValue(localTime, new int[]{0});
            __CLR4_4_11hum1humlgchosu7.R.inc(69948);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69949);assertTrue(true);
        }

        // UnsupportedDateTimeField.isLeap(long instant) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69950);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69951);fieldOne.isLeap(System.currentTimeMillis());
            __CLR4_4_11hum1humlgchosu7.R.inc(69952);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69953);assertTrue(true);
        }

        // UnsupportedDateTimeField.remainder(long instant) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69954);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69955);fieldOne.remainder(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69956);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69957);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundCeiling(long instant) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69958);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69959);fieldOne.roundCeiling(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69960);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69961);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundFloor(long instant) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69962);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69963);fieldOne.roundFloor(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69964);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69965);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundHalfCeiling(long instant) is
        // unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69966);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69967);fieldOne.roundHalfCeiling(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69968);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69969);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundHalfEven(long instant) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69970);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69971);fieldOne.roundHalfEven(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69972);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69973);assertTrue(true);
        }

        // UnsupportedDateTimeField.roundHalfFloor(long instant) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69974);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69975);fieldOne.roundHalfFloor(1000000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(69976);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69977);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(long instant, int value) is unsupported
        // and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69978);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69979);fieldOne.set(1000000L, 1000);
            __CLR4_4_11hum1humlgchosu7.R.inc(69980);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69981);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(long instant, String test) is
        // unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69982);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69983);fieldOne.set(1000000L, "Unsupported Operation");
            __CLR4_4_11hum1humlgchosu7.R.inc(69984);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69985);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(long instant, String text, Locale
        // locale)
        // is unsupported and should always thrown an
        // UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69986);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69987);fieldOne
                    .set(1000000L, "Unsupported Operation", Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69988);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69989);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(ReadablePartial instant,
        // int fieldIndex,
        // int[] values,
        // int newValue) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69990);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69991);fieldOne.set(localTime, 0, new int[]{0}, 10000);
            __CLR4_4_11hum1humlgchosu7.R.inc(69992);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69993);assertTrue(true);
        }

        // UnsupportedDateTimeField.set(ReadablePartial instant,
        // int fieldIndex,
        // int[] values,
        // String text,
        // Locale locale) is unsupported and
        // should always thrown an UnsupportedOperationException
        __CLR4_4_11hum1humlgchosu7.R.inc(69994);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(69995);fieldOne.set(localTime, 0, new int[]{0},
                    "Unsupported Operation", Locale.getDefault());
            __CLR4_4_11hum1humlgchosu7.R.inc(69996);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(69997);assertTrue(true);
        }
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * As this is an unsupported date/time field, many normal methods are
     * unsupported. Some delegate and can possibly throw an
     * UnsupportedOperationException or have a valid return. Verify that each
     * method correctly throws this exception when appropriate and delegates
     * correctly based on the Duration used to get the instance.
     */
    @Test
    public void testDelegatedMethods() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),69998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170zhqk1i0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testDelegatedMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170zhqk1i0e(){try{__CLR4_4_11hum1humlgchosu7.R.inc(69998);
        __CLR4_4_11hum1humlgchosu7.R.inc(69999);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));
        __CLR4_4_11hum1humlgchosu7.R.inc(70000);PreciseDurationField hoursDuration = new PreciseDurationField(
                DurationFieldType.hours(), 10L);
        __CLR4_4_11hum1humlgchosu7.R.inc(70001);DateTimeField fieldTwo = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, hoursDuration);

        // UnsupportedDateTimeField.add(long instant, int value) should
        // throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise it delegates to the duration.
        // First
        // try it with an UnsupportedDurationField, then a PreciseDurationField.
        __CLR4_4_11hum1humlgchosu7.R.inc(70002);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70003);fieldOne.add(System.currentTimeMillis(), 100);
            __CLR4_4_11hum1humlgchosu7.R.inc(70004);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70005);assertTrue(true);
        }
        __CLR4_4_11hum1humlgchosu7.R.inc(70006);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70007);long currentTime = System.currentTimeMillis();
            __CLR4_4_11hum1humlgchosu7.R.inc(70008);long firstComputation = hoursDuration.add(currentTime, 100);
            __CLR4_4_11hum1humlgchosu7.R.inc(70009);long secondComputation = fieldTwo.add(currentTime,
                    100);
            __CLR4_4_11hum1humlgchosu7.R.inc(70010);assertEquals(firstComputation, secondComputation);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70011);assertTrue(false);
        }

        // UnsupportedDateTimeField.add(long instant, long value) should
        // throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise it delegates to the duration.
        // First
        // try it with an UnsupportedDurationField, then a PreciseDurationField.
        __CLR4_4_11hum1humlgchosu7.R.inc(70012);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70013);fieldOne.add(System.currentTimeMillis(), 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70014);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70015);assertTrue(true);
        }

        __CLR4_4_11hum1humlgchosu7.R.inc(70016);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70017);long currentTime = System.currentTimeMillis();
            __CLR4_4_11hum1humlgchosu7.R.inc(70018);long firstComputation = hoursDuration.add(currentTime, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70019);long secondComputation = fieldTwo.add(currentTime,
                    1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70020);assertTrue(firstComputation == secondComputation);
            __CLR4_4_11hum1humlgchosu7.R.inc(70021);assertEquals(firstComputation, secondComputation);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70022);assertTrue(false);
        }

        // UnsupportedDateTimeField.getDifference(long minuendInstant,
        // long subtrahendInstant)
        // should throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise return the result from the
        // delegated call.
        __CLR4_4_11hum1humlgchosu7.R.inc(70023);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70024);fieldOne.getDifference(100000L, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70025);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70026);assertTrue(true);
        }

        __CLR4_4_11hum1humlgchosu7.R.inc(70027);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70028);int firstDifference = hoursDuration.getDifference(100000L, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70029);int secondDifference = fieldTwo.getDifference(100000L, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70030);assertEquals(firstDifference, secondDifference);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70031);assertTrue(false);
        }

        // UnsupportedDateTimeField.getDifferenceAsLong(long minuendInstant,
        // long subtrahendInstant)
        // should throw an UnsupportedOperationException when the duration does
        // not support the operation, otherwise return the result from the
        // delegated call.
        __CLR4_4_11hum1humlgchosu7.R.inc(70032);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70033);fieldOne.getDifferenceAsLong(100000L, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70034);assertTrue(false);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70035);assertTrue(true);
        }

        __CLR4_4_11hum1humlgchosu7.R.inc(70036);try {
            __CLR4_4_11hum1humlgchosu7.R.inc(70037);long firstDifference = hoursDuration.getDifference(100000L, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70038);long secondDifference = fieldTwo.getDifference(100000L, 1000L);
            __CLR4_4_11hum1humlgchosu7.R.inc(70039);assertEquals(firstDifference, secondDifference);
        } catch (UnsupportedOperationException e) {
            __CLR4_4_11hum1humlgchosu7.R.inc(70040);assertTrue(false);
        }
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}

    /**
     * The toString method should return a suitable debug message (not null).
     * Ensure that the toString method returns a string with length greater than
     * 0 (and not null)
     */
    @Test
    public void testToString() {__CLR4_4_11hum1humlgchosu7.R.globalSliceStart(getClass().getName(),70041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdid1i1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hum1humlgchosu7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hum1humlgchosu7.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestUnsupportedDateTimeField.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdid1i1l(){try{__CLR4_4_11hum1humlgchosu7.R.inc(70041);
        __CLR4_4_11hum1humlgchosu7.R.inc(70042);DateTimeField fieldOne = UnsupportedDateTimeField.getInstance(
                dateTimeFieldTypeOne, UnsupportedDurationField
                        .getInstance(weeks));

        __CLR4_4_11hum1humlgchosu7.R.inc(70043);String debugMessage = fieldOne.toString();
        __CLR4_4_11hum1humlgchosu7.R.inc(70044);assertNotNull(debugMessage);
        __CLR4_4_11hum1humlgchosu7.R.inc(70045);assertTrue(debugMessage.length() > 0);
    }finally{__CLR4_4_11hum1humlgchosu7.R.flushNeeded();}}
}
