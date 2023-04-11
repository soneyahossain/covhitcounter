/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2015 Stephen Colebourne
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Entry point for all tests in this package.
 *
 * @author Stephen Colebourne
 * @version $Revision$ $Date$
 */
public class TestAll extends TestCase {static class __CLR4_4_1hgthgtlgchorea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,22645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TestAll(String testName) {
        super(testName);__CLR4_4_1hgthgtlgchorea.R.inc(22638);try{__CLR4_4_1hgthgtlgchorea.R.inc(22637);
    }finally{__CLR4_4_1hgthgtlgchorea.R.flushNeeded();}}

    public static Test suite() {try{__CLR4_4_1hgthgtlgchorea.R.inc(22639);
        __CLR4_4_1hgthgtlgchorea.R.inc(22640);TestSuite suite = new TestSuite();

        //suite.addTest(TestChronology.suite());
        //suite.addTest(TestDateTimeFieldType.suite());
        //suite.addTest(TestDurationFieldType.suite());

        //suite.addTest(TestInstant_Constructors.suite());
        //suite.addTest(TestInstant_Basics.suite());

        //suite.addTest(TestDateTime_Constructors.suite());
        //suite.addTest(TestDateTime_Basics.suite());
        //suite.addTest(TestDateTime_Properties.suite());

        //suite.addTest(TestMutableDateTime_Constructors.suite());
        //suite.addTest(TestMutableDateTime_Basics.suite());
        //suite.addTest(TestMutableDateTime_Sets.suite());
        //suite.addTest(TestMutableDateTime_Adds.suite());
        //suite.addTest(TestMutableDateTime_Properties.suite());

        //suite.addTest(TestDateMidnight_Constructors.suite());
        //suite.addTest(TestDateMidnight_Basics.suite());
        //suite.addTest(TestDateMidnight_Properties.suite());

        //suite.addTest(TestDuration_Constructors.suite());
        //suite.addTest(TestDuration_Basics.suite());

        //suite.addTest(TestInterval_Constructors.suite());
        //suite.addTest(TestInterval_Basics.suite());

        //suite.addTest(TestLocalDateTime_Constructors.suite());
        //suite.addTest(TestLocalDateTime_Basics.suite());
        //suite.addTest(TestLocalDateTime_Properties.suite());

        //suite.addTest(TestLocalDate_Constructors.suite());
        //suite.addTest(TestLocalDate_Basics.suite());
        //suite.addTest(TestLocalDate_Properties.suite());


        // suite.addTest(TestLocalTime_Constructors.suite());
        //suite.addTest(TestLocalTime_Basics.suite());
        //suite.addTest(TestLocalTime_Properties.suite());

        //--------------------------------------------------------------------


        //suite.addTest(TestMutableInterval_Constructors.suite());
        //suite.addTest(TestMutableInterval_Basics.suite());
        //suite.addTest(TestMutableInterval_Updates.suite());

        //suite.addTest(TestPeriod_Constructors.suite());
        //suite.addTest(TestPeriod_Basics.suite());

        //suite.addTest(TestMutablePeriod_Constructors.suite());
        //suite.addTest(TestMutablePeriod_Basics.suite());
        //suite.addTest(TestMutablePeriod_Updates.suite());

        //suite.addTest(TestBaseSingleFieldPeriod.suite());
        //suite.addTest(TestYears.suite());
        //suite.addTest(TestMonths.suite());
        //suite.addTest(TestWeeks.suite());
        //suite.addTest(TestDays.suite());
        //suite.addTest(TestHours.suite());
        //suite.addTest(TestMinutes.suite());
        //suite.addTest(TestSeconds.suite());

        //suite.addTest(TestTimeOfDay_Basics.suite());
        //suite.addTest(TestTimeOfDay_Constructors.suite());
        //suite.addTest(TestTimeOfDay_Properties.suite());

        //suite.addTest(TestYearMonthDay_Basics.suite());
        //suite.addTest(TestYearMonthDay_Constructors.suite());
        //suite.addTest(TestYearMonthDay_Properties.suite());

        //suite.addTest(TestYearMonth_Basics.suite());
        //suite.addTest(TestYearMonth_Constructors.suite());
        //suite.addTest(TestYearMonth_Properties.suite());

        //suite.addTest(TestMonthDay_Basics.suite());
        //suite.addTest(TestMonthDay_Constructors.suite());
        //suite.addTest(TestMonthDay_Properties.suite());

        //suite.addTest(TestPartial_Basics.suite());
        //suite.addTest(TestPartial_Constructors.suite());
        //suite.addTest(TestPartial_Properties.suite());
        //suite.addTest(TestPartial_Match.suite());

        //suite.addTest(TestAbstractPartial.suite());
        //suite.addTest(TestBasePartial.suite());

        //suite.addTest(TestDateTimeComparator.suite());
        //suite.addTest(TestDateTimeConstants.suite());
        //suite.addTest(TestDateTimeUtils.suite());
        //suite.addTest(TestDateTimeZone.suite());
        //suite.addTest(TestDateTimeZoneCutover.suite());
        //suite.addTest(TestPeriodType.suite());
//      suite.addTest(TestParseISO.suite());//////////////////////////////////////////////////////////
        //suite.addTest(TestDurationField.suite());

        //suite.addTest(TestStringConvert.suite());
        //suite.addTest(TestSerialization.suite());
        //suite.addTest(TestIllegalFieldValueException.suite());
        //suite.addTest(TestMinMaxLong.suite());
        __CLR4_4_1hgthgtlgchorea.R.inc(22641);return suite;
    }finally{__CLR4_4_1hgthgtlgchorea.R.flushNeeded();}}

    public static void main(String args[]) {try{__CLR4_4_1hgthgtlgchorea.R.inc(22642);
        __CLR4_4_1hgthgtlgchorea.R.inc(22643);String[] testCaseName = {
                TestAll.class.getName()
        };
        __CLR4_4_1hgthgtlgchorea.R.inc(22644);junit.textui.TestRunner.main(testCaseName);
    }finally{__CLR4_4_1hgthgtlgchorea.R.flushNeeded();}}

}
