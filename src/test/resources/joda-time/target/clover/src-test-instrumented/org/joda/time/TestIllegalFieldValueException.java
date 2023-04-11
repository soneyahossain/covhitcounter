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

import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.SkipDateTimeField;

/**
 * Tests IllegalFieldValueException by triggering it from other methods.
 *
 * @author Brian S O'Neill
 */
public class TestIllegalFieldValueException {static class __CLR4_4_1p9dp9dlgchortx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,32974,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    public static void main(String[] args) throws Exception {try{__CLR4_4_1p9dp9dlgchortx.R.inc(32737);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32738);TestIllegalFieldValueException TB = new TestIllegalFieldValueException();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32739);TB.testVerifyValueBounds();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32740);TB.testSkipDateTimeField();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32741);TB.testSetText();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32742);TB.testZoneTransition();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32743);TB.testJulianYearZero();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32744);TB.testGJCutover();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32745);TB.testReadablePartialValidate();
        __CLR4_4_1p9dp9dlgchortx.R.inc(32746);TB.testOtherConstructors();


    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestIllegalFieldValueException.class);
    }

    public TestIllegalFieldValueException(String name) {
        super(name);
    }

     */

    @Test
    public void testVerifyValueBounds() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlroe6p9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testVerifyValueBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlroe6p9n(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32747);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32748);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32749);FieldUtils.verifyValueBounds(ISOChronology.getInstance().monthOfYear(), -5, 1, 31);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32750);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32751);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32752);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32753);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32754);assertEquals(new Integer(-5), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32755);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32756);assertEquals("-5", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32757);assertEquals(new Integer(1), e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32758);assertEquals(new Integer(31), e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32759);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32760);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), 27, 0, 23);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32761);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32762);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32763);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32764);assertEquals("hourOfDay", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32765);assertEquals(new Integer(27), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32766);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32767);assertEquals("27", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32768);assertEquals(new Integer(0), e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32769);assertEquals(new Integer(23), e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32770);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32771);FieldUtils.verifyValueBounds("foo", 1, 2, 3);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32772);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32773);assertEquals(null, e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32774);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32775);assertEquals("foo", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32776);assertEquals(new Integer(1), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32777);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32778);assertEquals("1", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32779);assertEquals(new Integer(2), e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32780);assertEquals(new Integer(3), e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    @Test
    public void testSkipDateTimeField() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbtiphpal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSkipDateTimeField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbtiphpal(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32781);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32782);DateTimeField field = new SkipDateTimeField
                (ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().year(), 1970);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32783);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32784);field.set(0, 1970);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32785);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32786);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32787);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32788);assertEquals("year", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32789);assertEquals(new Integer(1970), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32790);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32791);assertEquals("1970", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32792);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32793);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    @Test
    public void testSetText() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz7x5opay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testSetText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz7x5opay(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32794);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32795);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32796);ISOChronology.getInstanceUTC().year().set(0, null, java.util.Locale.US);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32797);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32798);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32799);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32800);assertEquals("year", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32801);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32802);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32803);assertEquals("null", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32804);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32805);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32806);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32807);ISOChronology.getInstanceUTC().year().set(0, "nineteen seventy", java.util.Locale.US);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32808);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32809);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32810);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32811);assertEquals("year", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32812);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32813);assertEquals("nineteen seventy", e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32814);assertEquals("nineteen seventy", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32815);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32816);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32817);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32818);ISOChronology.getInstanceUTC().era().set(0, "long ago", java.util.Locale.US);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32819);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32820);assertEquals(DateTimeFieldType.era(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32821);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32822);assertEquals("era", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32823);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32824);assertEquals("long ago", e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32825);assertEquals("long ago", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32826);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32827);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32828);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32829);ISOChronology.getInstanceUTC().monthOfYear().set(0, "spring", java.util.Locale.US);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32830);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32831);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32832);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32833);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32834);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32835);assertEquals("spring", e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32836);assertEquals("spring", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32837);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32838);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32839);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32840);ISOChronology.getInstanceUTC().dayOfWeek().set(0, "yesterday", java.util.Locale.US);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32841);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32842);assertEquals(DateTimeFieldType.dayOfWeek(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32843);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32844);assertEquals("dayOfWeek", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32845);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32846);assertEquals("yesterday", e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32847);assertEquals("yesterday", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32848);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32849);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32850);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32851);ISOChronology.getInstanceUTC().halfdayOfDay().set(0, "morning", java.util.Locale.US);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32852);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32853);assertEquals(DateTimeFieldType.halfdayOfDay(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32854);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32855);assertEquals("halfdayOfDay", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32856);assertEquals(null, e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32857);assertEquals("morning", e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32858);assertEquals("morning", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32859);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32860);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    @Test
    public void testZoneTransition() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv6vjupct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testZoneTransition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv6vjupct(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32861);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32862);DateTime dt = new DateTime
                (2005, 4, 3, 1, 0, 0, 0, DateTimeZone.forID("America/Los_Angeles"));
        __CLR4_4_1p9dp9dlgchortx.R.inc(32863);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32864);dt.hourOfDay().setCopy(2);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32865);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32866);assertEquals(DateTimeFieldType.hourOfDay(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32867);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32868);assertEquals("hourOfDay", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32869);assertEquals(new Integer(2), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32870);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32871);assertEquals("2", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32872);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32873);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    @Test
    public void testJulianYearZero() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zffcgjpd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testJulianYearZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zffcgjpd6(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32874);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32875);DateTime dt = new DateTime(JulianChronology.getInstanceUTC());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32876);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32877);dt.year().setCopy(0);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32878);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32879);assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32880);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32881);assertEquals("year", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32882);assertEquals(new Integer(0), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32883);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32884);assertEquals("0", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32885);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32886);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    @Test
    public void testGJCutover() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hciwegpdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testGJCutover",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hciwegpdj(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32887);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32888);DateTime dt = new DateTime("1582-10-04", GJChronology.getInstanceUTC());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32889);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32890);dt.dayOfMonth().setCopy(5);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32891);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32892);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32893);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32894);assertEquals("dayOfMonth", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32895);assertEquals(new Integer(5), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32896);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32897);assertEquals("5", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32898);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32899);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32900);dt = new DateTime("1582-10-15", GJChronology.getInstanceUTC());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32901);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32902);dt.dayOfMonth().setCopy(14);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32903);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32904);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32905);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32906);assertEquals("dayOfMonth", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32907);assertEquals(new Integer(14), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32908);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32909);assertEquals("14", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32910);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32911);assertEquals(null, e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    @SuppressWarnings("deprecation")
    @Test
    public void testReadablePartialValidate() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m8pxnope8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testReadablePartialValidate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m8pxnope8(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32912);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32913);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32914);new YearMonthDay(1970, -5, 1);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32915);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32916);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32917);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32918);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32919);assertEquals(new Integer(-5), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32920);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32921);assertEquals("-5", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32922);assertEquals(new Integer(1), e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32923);assertEquals(null, e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32924);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32925);new YearMonthDay(1970, 500, 1);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32926);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32927);assertEquals(DateTimeFieldType.monthOfYear(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32928);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32929);assertEquals("monthOfYear", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32930);assertEquals(new Integer(500), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32931);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32932);assertEquals("500", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32933);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32934);assertEquals(new Integer(12), e.getUpperBound());
        }

        __CLR4_4_1p9dp9dlgchortx.R.inc(32935);try {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32936);new YearMonthDay(1970, 2, 30);
            __CLR4_4_1p9dp9dlgchortx.R.inc(32937);fail();
        } catch (IllegalFieldValueException e) {
            __CLR4_4_1p9dp9dlgchortx.R.inc(32938);assertEquals(DateTimeFieldType.dayOfMonth(), e.getDateTimeFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32939);assertEquals(null, e.getDurationFieldType());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32940);assertEquals("dayOfMonth", e.getFieldName());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32941);assertEquals(new Integer(30), e.getIllegalNumberValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32942);assertEquals(null, e.getIllegalStringValue());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32943);assertEquals("30", e.getIllegalValueAsString());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32944);assertEquals(null, e.getLowerBound());
            __CLR4_4_1p9dp9dlgchortx.R.inc(32945);assertEquals(new Integer(28), e.getUpperBound());
        }
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}

    // Test extra constructors not currently called by anything
    @Test
    public void testOtherConstructors() {__CLR4_4_1p9dp9dlgchortx.R.globalSliceStart(getClass().getName(),32946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19s7v1apf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1p9dp9dlgchortx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1p9dp9dlgchortx.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestIllegalFieldValueException.testOtherConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),32946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19s7v1apf6(){try{__CLR4_4_1p9dp9dlgchortx.R.inc(32946);
        __CLR4_4_1p9dp9dlgchortx.R.inc(32947);IllegalFieldValueException e = new IllegalFieldValueException
                (DurationFieldType.days(), new Integer(1), new Integer(2), new Integer(3));
        __CLR4_4_1p9dp9dlgchortx.R.inc(32948);assertEquals(null, e.getDateTimeFieldType());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32949);assertEquals(DurationFieldType.days(), e.getDurationFieldType());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32950);assertEquals("days", e.getFieldName());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32951);assertEquals(new Integer(1), e.getIllegalNumberValue());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32952);assertEquals(null, e.getIllegalStringValue());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32953);assertEquals("1", e.getIllegalValueAsString());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32954);assertEquals(new Integer(2), e.getLowerBound());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32955);assertEquals(new Integer(3), e.getUpperBound());

        __CLR4_4_1p9dp9dlgchortx.R.inc(32956);e = new IllegalFieldValueException(DurationFieldType.months(), "five");
        __CLR4_4_1p9dp9dlgchortx.R.inc(32957);assertEquals(null, e.getDateTimeFieldType());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32958);assertEquals(DurationFieldType.months(), e.getDurationFieldType());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32959);assertEquals("months", e.getFieldName());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32960);assertEquals(null, e.getIllegalNumberValue());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32961);assertEquals("five", e.getIllegalStringValue());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32962);assertEquals("five", e.getIllegalValueAsString());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32963);assertEquals(null, e.getLowerBound());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32964);assertEquals(null, e.getUpperBound());

        __CLR4_4_1p9dp9dlgchortx.R.inc(32965);e = new IllegalFieldValueException("months", "five");
        __CLR4_4_1p9dp9dlgchortx.R.inc(32966);assertEquals(null, e.getDateTimeFieldType());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32967);assertEquals(null, e.getDurationFieldType());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32968);assertEquals("months", e.getFieldName());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32969);assertEquals(null, e.getIllegalNumberValue());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32970);assertEquals("five", e.getIllegalStringValue());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32971);assertEquals("five", e.getIllegalValueAsString());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32972);assertEquals(null, e.getLowerBound());
        __CLR4_4_1p9dp9dlgchortx.R.inc(32973);assertEquals(null, e.getUpperBound());
    }finally{__CLR4_4_1p9dp9dlgchortx.R.flushNeeded();}}
}
