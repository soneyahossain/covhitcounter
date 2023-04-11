/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.chrono.gj;

import java.util.Random;

import junit.framework.TestCase;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * Tests either the Julian or Gregorian chronology from org.joda.time.chrono.gj
 * against the implementations in this package. It tests all the date fields
 * against their principal methods.
 * <p>
 * Randomly generated values are fed into the DateTimeField methods and the
 * results are compared between the two chronologies. If any result doesn't
 * match, an error report is generated and the program exits. Each time this
 * test program is run, the pseudo random number generator is seeded with the
 * same value. This ensures consistent results between test runs.
 * <p>
 * The main method accepts three optional arguments: iterations, mode, seed. By
 * default, iterations is set to 1,000,000. The test will take several minutes
 * to run, depending on the computer's performance. Every 5 seconds a progress
 * message is printed.
 * <p>
 * The mode can be either 'g' for proleptic gregorian (the default) or 'j' for
 * proleptic julian. To override the default random number generator seed, pass
 * in a third argument which accepts a long signed integer.
 *
 * @author Brian S O'Neill
 */
public class MainTest extends TestCase {static class __CLR4_4_11da41da4lgchosok{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,64115,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final int GREGORIAN_MODE = 0;
    public static final int JULIAN_MODE = 1;

    private static final long MILLIS_PER_YEAR = (long) (365.2425 * 24 * 60 * 60 * 1000);
    private static final long _1000_YEARS = 1000 * MILLIS_PER_YEAR;
    private static final long _500_YEARS = 500 * MILLIS_PER_YEAR;
    private static final long MAX_MILLIS = (10000 - 1970) * MILLIS_PER_YEAR;
    private static final long MIN_MILLIS = (-10000 - 1970) * MILLIS_PER_YEAR;

    // Show progess reports every 5 seconds.
    private static final long UPDATE_INTERVAL = 5000;

    /**
     * Arguments: iterations [mode [seed]]
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_11da41da4lgchosok.R.inc(63868);
        __CLR4_4_11da41da4lgchosok.R.inc(63869);int iterations = 1000000;
        __CLR4_4_11da41da4lgchosok.R.inc(63870);int mode = GREGORIAN_MODE;
        __CLR4_4_11da41da4lgchosok.R.inc(63871);long seed = 1345435247779935L;

        __CLR4_4_11da41da4lgchosok.R.inc(63872);if ((((args.length > 0)&&(__CLR4_4_11da41da4lgchosok.R.iget(63873)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63874)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(63875);iterations = Integer.parseInt(args[0]);
            __CLR4_4_11da41da4lgchosok.R.inc(63876);if ((((args.length > 1)&&(__CLR4_4_11da41da4lgchosok.R.iget(63877)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63878)==0&false))) {{
                __CLR4_4_11da41da4lgchosok.R.inc(63879);if ((((args[1].startsWith("g"))&&(__CLR4_4_11da41da4lgchosok.R.iget(63880)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63881)==0&false))) {{
                    __CLR4_4_11da41da4lgchosok.R.inc(63882);mode = GREGORIAN_MODE;
                } }else {__CLR4_4_11da41da4lgchosok.R.inc(63883);if ((((args[1].startsWith("j"))&&(__CLR4_4_11da41da4lgchosok.R.iget(63884)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63885)==0&false))) {{
                    __CLR4_4_11da41da4lgchosok.R.inc(63886);mode = JULIAN_MODE;
                } }else {{
                    __CLR4_4_11da41da4lgchosok.R.inc(63887);throw new IllegalArgumentException
                            ("Unknown mode: " + args[1]);
                }
                }}__CLR4_4_11da41da4lgchosok.R.inc(63888);if ((((args.length > 2)&&(__CLR4_4_11da41da4lgchosok.R.iget(63889)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63890)==0&false))) {{
                    __CLR4_4_11da41da4lgchosok.R.inc(63891);seed = Long.parseLong(args[2]);
                }
            }}
        }}

        }__CLR4_4_11da41da4lgchosok.R.inc(63892);new MainTest(iterations, mode, seed).testChronology();
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private final int iIterations;
    private final int iMode;
    private final long iSeed;
    private final Chronology iTest;
    private final Chronology iActual;

    /**
     * @param iterations number of test iterations to perform
     * @param mode       GREGORIAN_MODE or JULIAN_MODE,0=Gregorian, 1=Julian
     * @param seed       seed for random number generator
     */
    public MainTest(int iterations, int mode, long seed) {
        super("testChronology");__CLR4_4_11da41da4lgchosok.R.inc(63894);try{__CLR4_4_11da41da4lgchosok.R.inc(63893);
        __CLR4_4_11da41da4lgchosok.R.inc(63895);iIterations = iterations;
        __CLR4_4_11da41da4lgchosok.R.inc(63896);iMode = mode;
        __CLR4_4_11da41da4lgchosok.R.inc(63897);iSeed = seed;
        __CLR4_4_11da41da4lgchosok.R.inc(63898);if ((((mode == GREGORIAN_MODE)&&(__CLR4_4_11da41da4lgchosok.R.iget(63899)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63900)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(63901);iTest = new TestGregorianChronology();
            __CLR4_4_11da41da4lgchosok.R.inc(63902);iActual = GregorianChronology.getInstanceUTC();
        } }else {{
            __CLR4_4_11da41da4lgchosok.R.inc(63903);iTest = new TestJulianChronology();
            __CLR4_4_11da41da4lgchosok.R.inc(63904);iActual = JulianChronology.getInstanceUTC();
        }
    }}finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Main junit test
     */
    public void testChronology() {__CLR4_4_11da41da4lgchosok.R.globalSliceStart(getClass().getName(),63905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skq86n1db5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11da41da4lgchosok.R.rethrow($CLV_t2$);}finally{__CLR4_4_11da41da4lgchosok.R.globalSliceEnd(getClass().getName(),"org.joda.time.chrono.gj.MainTest.testChronology",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skq86n1db5(){try{__CLR4_4_11da41da4lgchosok.R.inc(63905);
        __CLR4_4_11da41da4lgchosok.R.inc(63906);int iterations = iIterations;
        __CLR4_4_11da41da4lgchosok.R.inc(63907);long seed = iSeed;
        __CLR4_4_11da41da4lgchosok.R.inc(63908);String modeStr;
        __CLR4_4_11da41da4lgchosok.R.inc(63909);if ((((iMode == GREGORIAN_MODE)&&(__CLR4_4_11da41da4lgchosok.R.iget(63910)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63911)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(63912);modeStr = "Gregorian";
        } }else {{
            __CLR4_4_11da41da4lgchosok.R.inc(63913);modeStr = "Julian";
        }

        }__CLR4_4_11da41da4lgchosok.R.inc(63914);System.out.println("\nTesting " + modeStr + " chronology over " + iterations + " iterations");

        __CLR4_4_11da41da4lgchosok.R.inc(63915);Random rnd = new Random(seed);
        __CLR4_4_11da41da4lgchosok.R.inc(63916);long updateMillis = System.currentTimeMillis() + UPDATE_INTERVAL;

        __CLR4_4_11da41da4lgchosok.R.inc(63917);for (int i = 0; (((i < iterations)&&(__CLR4_4_11da41da4lgchosok.R.iget(63918)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63919)==0&false)); i++) {{
            __CLR4_4_11da41da4lgchosok.R.inc(63920);long now = System.currentTimeMillis();
            __CLR4_4_11da41da4lgchosok.R.inc(63921);if ((((now >= updateMillis)&&(__CLR4_4_11da41da4lgchosok.R.iget(63922)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63923)==0&false))) {{
                __CLR4_4_11da41da4lgchosok.R.inc(63924);updateMillis = now + UPDATE_INTERVAL;
                __CLR4_4_11da41da4lgchosok.R.inc(63925);double complete = ((int) ((double) i / iterations * 1000.0)) / 10d;
                __CLR4_4_11da41da4lgchosok.R.inc(63926);if ((((complete < 100)&&(__CLR4_4_11da41da4lgchosok.R.iget(63927)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63928)==0&false))) {{
                    __CLR4_4_11da41da4lgchosok.R.inc(63929);System.out.println("" + complete + "% complete (i=" + i + ")");
                }
            }}

            }__CLR4_4_11da41da4lgchosok.R.inc(63930);long millis = randomMillis(rnd);
            __CLR4_4_11da41da4lgchosok.R.inc(63931);int value = rnd.nextInt(200) - 100;
            // millis2 is used for difference tests.
            __CLR4_4_11da41da4lgchosok.R.inc(63932);long millis2 = millis + rnd.nextLong() % _1000_YEARS - _500_YEARS;

            __CLR4_4_11da41da4lgchosok.R.inc(63933);try {
                __CLR4_4_11da41da4lgchosok.R.inc(63934);testFields(millis, value, millis2);
            } catch (RuntimeException e) {
                __CLR4_4_11da41da4lgchosok.R.inc(63935);System.out.println("Failure index: " + i);
                __CLR4_4_11da41da4lgchosok.R.inc(63936);System.out.println("Test millis: " + millis);
                __CLR4_4_11da41da4lgchosok.R.inc(63937);System.out.println("Test value: " + value);
                __CLR4_4_11da41da4lgchosok.R.inc(63938);System.out.println("Test millis2: " + millis2);
                __CLR4_4_11da41da4lgchosok.R.inc(63939);fail(e.getMessage());
            }
        }

        }__CLR4_4_11da41da4lgchosok.R.inc(63940);System.out.println("100% complete (i=" + iterations + ")");
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {try{__CLR4_4_11da41da4lgchosok.R.inc(63941);
        __CLR4_4_11da41da4lgchosok.R.inc(63942);testField(iTest.year(), iActual.year(), millis, value, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63943);testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63944);testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63945);testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63946);testField(iTest.weekOfWeekyear(), iActual.weekOfWeekyear(), millis, value, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63947);testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63948);testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2) {try{__CLR4_4_11da41da4lgchosok.R.inc(63949);
        __CLR4_4_11da41da4lgchosok.R.inc(63950);int a, b;
        __CLR4_4_11da41da4lgchosok.R.inc(63951);long x, y;
        __CLR4_4_11da41da4lgchosok.R.inc(63952);boolean m, n;

        // get test
        __CLR4_4_11da41da4lgchosok.R.inc(63953);a = fieldA.get(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63954);b = fieldB.get(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63955);testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        __CLR4_4_11da41da4lgchosok.R.inc(63956);Class fieldClass = fieldA.getClass();
        __CLR4_4_11da41da4lgchosok.R.inc(63957);if ((((fieldClass == TestGJDayOfYearField.class ||
                fieldClass == TestGJDayOfMonthField.class ||
                fieldClass == TestGJWeekOfWeekyearField.class)&&(__CLR4_4_11da41da4lgchosok.R.iget(63958)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63959)==0&false))) {{

            __CLR4_4_11da41da4lgchosok.R.inc(63960);a = fieldA.getMaximumValue(millis);
            __CLR4_4_11da41da4lgchosok.R.inc(63961);b = fieldB.getMaximumValue(millis);
            __CLR4_4_11da41da4lgchosok.R.inc(63962);testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        }__CLR4_4_11da41da4lgchosok.R.inc(63963);a = getWrappedValue
                (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(63964);b = getWrappedValue
                (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(63965);if ((((iMode == JULIAN_MODE && a == 0
                && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear")))&&(__CLR4_4_11da41da4lgchosok.R.iget(63966)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(63967)==0&false))) {{
            // Exclude setting Julian year of zero.
        } }else {{
            __CLR4_4_11da41da4lgchosok.R.inc(63968);x = fieldA.set(millis, a);
            __CLR4_4_11da41da4lgchosok.R.inc(63969);y = fieldB.set(millis, b);
            __CLR4_4_11da41da4lgchosok.R.inc(63970);testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        }__CLR4_4_11da41da4lgchosok.R.inc(63971);x = fieldA.roundFloor(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63972);y = fieldB.roundFloor(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63973);testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        __CLR4_4_11da41da4lgchosok.R.inc(63974);x = fieldA.roundCeiling(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63975);y = fieldB.roundCeiling(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63976);testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        __CLR4_4_11da41da4lgchosok.R.inc(63977);x = fieldA.roundHalfFloor(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63978);y = fieldB.roundHalfFloor(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63979);testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        __CLR4_4_11da41da4lgchosok.R.inc(63980);x = fieldA.roundHalfEven(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63981);y = fieldB.roundHalfEven(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63982);testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        __CLR4_4_11da41da4lgchosok.R.inc(63983);x = fieldA.remainder(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63984);y = fieldB.remainder(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63985);testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        __CLR4_4_11da41da4lgchosok.R.inc(63986);x = fieldA.add(millis, value);
        __CLR4_4_11da41da4lgchosok.R.inc(63987);y = fieldB.add(millis, value);
        __CLR4_4_11da41da4lgchosok.R.inc(63988);testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        __CLR4_4_11da41da4lgchosok.R.inc(63989);x = fieldA.addWrapField(millis, value);
        __CLR4_4_11da41da4lgchosok.R.inc(63990);y = fieldB.addWrapField(millis, value);
        __CLR4_4_11da41da4lgchosok.R.inc(63991);testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        __CLR4_4_11da41da4lgchosok.R.inc(63992);x = fieldA.getDifference(millis, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63993);y = fieldB.getDifference(millis, millis2);
        __CLR4_4_11da41da4lgchosok.R.inc(63994);try {
            __CLR4_4_11da41da4lgchosok.R.inc(63995);testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            __CLR4_4_11da41da4lgchosok.R.inc(63996);System.out.println("Test datetime 2: " + makeDatetime(millis2));
            __CLR4_4_11da41da4lgchosok.R.inc(63997);throw e;
        }

        // isLeap test
        __CLR4_4_11da41da4lgchosok.R.inc(63998);m = fieldA.isLeap(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(63999);n = fieldB.isLeap(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64000);testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        __CLR4_4_11da41da4lgchosok.R.inc(64001);a = fieldA.getLeapAmount(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64002);b = fieldB.getLeapAmount(millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64003);testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private int getWrappedValue(int value, int minValue, int maxValue) {try{__CLR4_4_11da41da4lgchosok.R.inc(64004);
        __CLR4_4_11da41da4lgchosok.R.inc(64005);if ((((minValue >= maxValue)&&(__CLR4_4_11da41da4lgchosok.R.iget(64006)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64007)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64008);throw new IllegalArgumentException("MIN > MAX");
        }

        }__CLR4_4_11da41da4lgchosok.R.inc(64009);int wrapRange = maxValue - minValue + 1;
        __CLR4_4_11da41da4lgchosok.R.inc(64010);value -= minValue;

        __CLR4_4_11da41da4lgchosok.R.inc(64011);if ((((value >= 0)&&(__CLR4_4_11da41da4lgchosok.R.iget(64012)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64013)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64014);return (value % wrapRange) + minValue;
        }

        }__CLR4_4_11da41da4lgchosok.R.inc(64015);int remByRange = (-value) % wrapRange;

        __CLR4_4_11da41da4lgchosok.R.inc(64016);if ((((remByRange == 0)&&(__CLR4_4_11da41da4lgchosok.R.iget(64017)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64018)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64019);return 0 + minValue;
        }
        }__CLR4_4_11da41da4lgchosok.R.inc(64020);return (wrapRange - remByRange) + minValue;
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64021);
        __CLR4_4_11da41da4lgchosok.R.inc(64022);if ((((valueA != valueB)&&(__CLR4_4_11da41da4lgchosok.R.iget(64023)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64024)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64025);failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }}finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64026);
        __CLR4_4_11da41da4lgchosok.R.inc(64027);if ((((millisA != millisB)&&(__CLR4_4_11da41da4lgchosok.R.iget(64028)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64029)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64030);failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }}finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64031);
        __CLR4_4_11da41da4lgchosok.R.inc(64032);if ((((millisA != millisB)&&(__CLR4_4_11da41da4lgchosok.R.iget(64033)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64034)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64035);failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }}finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64036);
        __CLR4_4_11da41da4lgchosok.R.inc(64037);if ((((boolA != boolB)&&(__CLR4_4_11da41da4lgchosok.R.iget(64038)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64039)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64040);failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }}finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64041);
        __CLR4_4_11da41da4lgchosok.R.inc(64042);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_11da41da4lgchosok.R.inc(64043);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                + fieldB.getClass().getName());
        __CLR4_4_11da41da4lgchosok.R.inc(64044);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64045);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64046);System.out.println(valueA + " != " + valueB);
        __CLR4_4_11da41da4lgchosok.R.inc(64047);throw new RuntimeException();
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64048);
        __CLR4_4_11da41da4lgchosok.R.inc(64049);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_11da41da4lgchosok.R.inc(64050);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                + fieldB.getClass().getName());
        __CLR4_4_11da41da4lgchosok.R.inc(64051);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64052);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64053);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_11da41da4lgchosok.R.inc(64054);System.out.println(millisA + " != " + millisB);
        __CLR4_4_11da41da4lgchosok.R.inc(64055);System.out.println("Original value as reported by first field: " +
                fieldA.get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64056);System.out.println("Original value as reported by second field: " +
                fieldB.get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64057);System.out.println("First new value as reported by first field: " +
                fieldA.get(millisA));
        __CLR4_4_11da41da4lgchosok.R.inc(64058);System.out.println("First new value as reported by second field: " +
                fieldB.get(millisA));
        __CLR4_4_11da41da4lgchosok.R.inc(64059);System.out.println("Second new value as reported by first field: " +
                fieldA.get(millisB));
        __CLR4_4_11da41da4lgchosok.R.inc(64060);System.out.println("Second new value as reported by second field: " +
                fieldB.get(millisB));
        __CLR4_4_11da41da4lgchosok.R.inc(64061);throw new RuntimeException();
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64062);
        __CLR4_4_11da41da4lgchosok.R.inc(64063);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_11da41da4lgchosok.R.inc(64064);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                + fieldB.getClass().getName());
        __CLR4_4_11da41da4lgchosok.R.inc(64065);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64066);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64067);System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        __CLR4_4_11da41da4lgchosok.R.inc(64068);System.out.println(millisA + " != " + millisB);
        __CLR4_4_11da41da4lgchosok.R.inc(64069);System.out.println("Original value as reported by first field: " +
                fieldA.get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64070);System.out.println("Original value as reported by second field: " +
                fieldB.get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64071);System.out.println("First new value as reported by first field: " +
                fieldA.get(millisA));
        __CLR4_4_11da41da4lgchosok.R.inc(64072);System.out.println("First new value as reported by second field: " +
                fieldB.get(millisA));
        __CLR4_4_11da41da4lgchosok.R.inc(64073);System.out.println("Second new value as reported by first field: " +
                fieldA.get(millisB));
        __CLR4_4_11da41da4lgchosok.R.inc(64074);System.out.println("Second new value as reported by second field: " +
                fieldB.get(millisB));
        __CLR4_4_11da41da4lgchosok.R.inc(64075);System.out.println("Value to set for first field: " + valueA);
        __CLR4_4_11da41da4lgchosok.R.inc(64076);System.out.println("Value to set for second field: " + valueB);
        __CLR4_4_11da41da4lgchosok.R.inc(64077);throw new RuntimeException();
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64078);
        __CLR4_4_11da41da4lgchosok.R.inc(64079);System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        __CLR4_4_11da41da4lgchosok.R.inc(64080);System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                + fieldB.getClass().getName());
        __CLR4_4_11da41da4lgchosok.R.inc(64081);System.out.println("Datetime: " + makeDatetime(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64082);System.out.println("Millis from 1970: " + millis);
        __CLR4_4_11da41da4lgchosok.R.inc(64083);System.out.println(boolA + " != " + boolB);
        __CLR4_4_11da41da4lgchosok.R.inc(64084);throw new RuntimeException();
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {try{__CLR4_4_11da41da4lgchosok.R.inc(64085);
        __CLR4_4_11da41da4lgchosok.R.inc(64086);if ((((fieldA.getName().equals(fieldB.getName()))&&(__CLR4_4_11da41da4lgchosok.R.iget(64087)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64088)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64089);return fieldA.getName();
        } }else {{
            __CLR4_4_11da41da4lgchosok.R.inc(64090);return fieldA.getName() + "/" + fieldB.getName();
        }
    }}finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private String makeDatetime(long millis) {try{__CLR4_4_11da41da4lgchosok.R.inc(64091);
        __CLR4_4_11da41da4lgchosok.R.inc(64092);return makeDatetime(millis, iActual);
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private String makeDatetime(long millis, Chronology chrono) {try{__CLR4_4_11da41da4lgchosok.R.inc(64093);
        __CLR4_4_11da41da4lgchosok.R.inc(64094);return chrono.dayOfWeek().getAsShortText(millis) + " "
                + new DateTime(millis, chrono).toString() + " / " +
                chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
                "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private String makeDate(long millis) {try{__CLR4_4_11da41da4lgchosok.R.inc(64095);
        __CLR4_4_11da41da4lgchosok.R.inc(64096);return makeDate(millis, iActual);
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private String makeDate(long millis, Chronology chrono) {try{__CLR4_4_11da41da4lgchosok.R.inc(64097);
        __CLR4_4_11da41da4lgchosok.R.inc(64098);return chrono.dayOfWeek().getAsShortText(millis) + " "
                + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
                chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
                "-" + chrono.dayOfWeek().get(millis);
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {try{__CLR4_4_11da41da4lgchosok.R.inc(64099);
        __CLR4_4_11da41da4lgchosok.R.inc(64100);long millis = rnd.nextLong();
        __CLR4_4_11da41da4lgchosok.R.inc(64101);if ((((millis >= 0)&&(__CLR4_4_11da41da4lgchosok.R.iget(64102)!=0|true))||(__CLR4_4_11da41da4lgchosok.R.iget(64103)==0&false))) {{
            __CLR4_4_11da41da4lgchosok.R.inc(64104);millis = millis % MAX_MILLIS;
        } }else {{
            __CLR4_4_11da41da4lgchosok.R.inc(64105);millis = millis % -MIN_MILLIS;
        }
        }__CLR4_4_11da41da4lgchosok.R.inc(64106);return millis;
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

    private static void dump(Chronology chrono, long millis) {try{__CLR4_4_11da41da4lgchosok.R.inc(64107);
        __CLR4_4_11da41da4lgchosok.R.inc(64108);System.out.println("year:           " + chrono.year().get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64109);System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64110);System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64111);System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64112);System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64113);System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        __CLR4_4_11da41da4lgchosok.R.inc(64114);System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }finally{__CLR4_4_11da41da4lgchosok.R.flushNeeded();}}

}
