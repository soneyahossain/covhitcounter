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
package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear;

/**
 * Test cases for ZoneInfoCompiler.
 *
 * @author Brian S O'Neill
 */
public class TestCompiler {static class __CLR4_4_11nrc1nrclgchot32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,77603,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {
    public static void main(String[] args) throws Exception {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77448);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77449);TestCompiler TB = new TestCompiler();
        //TB.setUp(); TB.testDateTimeZoneBuilder(); TB.tearDown();  //Method code too large!
        //TB.setUp(); TB.testCompile(); TB.tearDown();   //Method code too large!
        __CLR4_4_11nrc1nrclgchot32.R.inc(77450);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77451);TB.testCompileOnBrokenTimeZoneFile();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77452);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77453);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77454);TB.testCompileOnBrokenTimeZoneFile_2();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77455);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77456);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77457);TB.test_2400_fromDay();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77458);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77459);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77460);TB.test_2400_last();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77461);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77462);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77463);TB.test_2400_specific_day();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77464);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77465);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77466);TB.test_Amman_2003();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77467);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77468);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77469);TB.test_Amman_2004();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77470);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77471);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77472);TB.test_Amman_2005();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77473);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77474);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77475);TB.test_Amman_2006();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77476);TB.tearDown();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77477);TB.setUp();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77478);TB.test_Tokyo_1949();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77479);TB.tearDown();

    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestCompiler.class);
    }

     */

    static final String AMERICA_LOS_ANGELES_FILE =
            "# Rules for building just America/Los_Angeles time zone.\n" +
                    "\n" +
                    "Rule    US  1918    1919    -   Mar lastSun 2:00    1:00    D\n" +
                    "Rule    US  1918    1919    -   Oct lastSun 2:00    0   S\n" +
                    "Rule    US  1942    only    -   Feb 9   2:00    1:00    W # War\n" +
                    "Rule    US  1945    only    -   Aug 14  23:00u  1:00    P # Peace\n" +
                    "Rule    US  1945    only    -   Sep 30  2:00    0   S\n" +
                    "Rule    US  1967    max -   Oct lastSun 2:00    0   S\n" +
                    "Rule    US  1967    1973    -   Apr lastSun 2:00    1:00    D\n" +
                    "Rule    US  1974    only    -   Jan 6   2:00    1:00    D\n" +
                    "Rule    US  1975    only    -   Feb 23  2:00    1:00    D\n" +
                    "Rule    US  1976    1986    -   Apr lastSun 2:00    1:00    D\n" +
                    "Rule    US  1987    max -   Apr Sun>=1  2:00    1:00    D\n" +
                    "\n" +
                    "Rule    CA  1948    only    -   Mar 14  2:00    1:00    D\n" +
                    "Rule    CA  1949    only    -   Jan  1  2:00    0   S\n" +
                    "Rule    CA  1950    1966    -   Apr lastSun 2:00    1:00    D\n" +
                    "Rule    CA  1950    1961    -   Sep lastSun 2:00    0   S\n" +
                    "Rule    CA  1962    1966    -   Oct lastSun 2:00    0   S\n" +
                    "\n" +
                    "Zone America/Los_Angeles -7:52:58 - LMT 1883 Nov 18 12:00\n" +
                    "            -8:00   US  P%sT    1946\n" +
                    "            -8:00   CA  P%sT    1967\n" +
                    "            -8:00   US  P%sT";

    static final String BROKEN_TIMEZONE_FILE =
            "# Incomplete Rules for building America/Los_Angeles time zone.\n" +
                    "\n" +
                    "Rule    US  1918    1919    -   Mar lastSun 2:00    1:00    D\n" +
                    "Rule    \n"; // this line is intentionally incomplete

    static final String BROKEN_TIMEZONE_FILE_2 =
            "# Incomplete Zone for building America/Los_Angeles time zone.\n" +
                    "\n" +
                    "Rule    CA  1948    only    -   Mar 14  2:00    1:00    D\n" +
                    "Rule    CA  1949    only    -   Jan  1  2:00    0   S\n" +
                    "\n" +
                    "Zone "; // this line is intentionally left incomplete

    private DateTimeZone originalDateTimeZone = null;

   /*
    public TestCompiler(String name) {
        super(name);
    }

    */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77480);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77481);originalDateTimeZone = DateTimeZone.getDefault();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77482);DateTimeZone.setDefault(DateTimeZone.UTC);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77483);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77484);DateTimeZone.setDefault(originalDateTimeZone);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testDateTimeZoneBuilder() throws Exception {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1htaeo91nsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testDateTimeZoneBuilder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1htaeo91nsd() throws Exception{try{__CLR4_4_11nrc1nrclgchot32.R.inc(77485);
        // test multithreading, issue #18
        __CLR4_4_11nrc1nrclgchot32.R.inc(77486);getTestDataTimeZoneBuilder().toDateTimeZone("TestDTZ1", true);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77487);final DateTimeZone[] zone = new DateTimeZone[1];
        __CLR4_4_11nrc1nrclgchot32.R.inc(77488);Thread t = new Thread(new Runnable() {
            public void run() {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77489);
                __CLR4_4_11nrc1nrclgchot32.R.inc(77490);zone[0] = getTestDataTimeZoneBuilder().toDateTimeZone("TestDTZ2", true);
            }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}
        });
        __CLR4_4_11nrc1nrclgchot32.R.inc(77491);t.start();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77492);t.join();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77493);assertNotNull(zone[0]);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    private DateTimeZoneBuilder getTestDataTimeZoneBuilder() {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77494);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77495);return new DateTimeZoneBuilder()
                .addCutover(1601, 'w', 1, 1, 1, false, 7200000)
                .setStandardOffset(3600000)
                .addRecurringSavings("", 3600000, 1601, Integer.MAX_VALUE, 'w', 3, -1, 1, false, 7200000)
                .addRecurringSavings("", 0, 1601, Integer.MAX_VALUE, 'w', 10, -1, 1, false, 10800000);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //@Test
    public void testCompile() throws Exception {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdlilk1nso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testCompile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77496,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdlilk1nso() throws Exception{try{__CLR4_4_11nrc1nrclgchot32.R.inc(77496);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77497);Provider provider = compileAndLoad(AMERICA_LOS_ANGELES_FILE);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77498);DateTimeZone tz = provider.getZone("America/Los_Angeles");

        __CLR4_4_11nrc1nrclgchot32.R.inc(77499);assertEquals("America/Los_Angeles", tz.getID());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77500);assertEquals(false, tz.isFixed());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77501);TestBuilder.testForwardTransitions(tz, TestBuilder.AMERICA_LOS_ANGELES_DATA);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77502);TestBuilder.testReverseTransitions(tz, TestBuilder.AMERICA_LOS_ANGELES_DATA);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void testCompileOnBrokenTimeZoneFile() throws Exception {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9sbtd1nsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testCompileOnBrokenTimeZoneFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9sbtd1nsv() throws Exception{try{__CLR4_4_11nrc1nrclgchot32.R.inc(77503);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77504);try {
            __CLR4_4_11nrc1nrclgchot32.R.inc(77505);Provider provider = compileAndLoad(BROKEN_TIMEZONE_FILE);
            __CLR4_4_11nrc1nrclgchot32.R.inc(77506);fail();
        } catch (NoSuchElementException nsee) {
            // This used to be thrown in the Rule constructor
            __CLR4_4_11nrc1nrclgchot32.R.inc(77507);fail("NoSuchElementException was thrown; broken timezone file?");
        } catch (IllegalArgumentException iae) {
            __CLR4_4_11nrc1nrclgchot32.R.inc(77508);assertEquals("Attempting to create a Rule from an incomplete tokenizer", iae.getMessage());
        }
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void testCompileOnBrokenTimeZoneFile_2() throws Exception {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fn9snw1nt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.testCompileOnBrokenTimeZoneFile_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fn9snw1nt1() throws Exception{try{__CLR4_4_11nrc1nrclgchot32.R.inc(77509);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77510);try {
            __CLR4_4_11nrc1nrclgchot32.R.inc(77511);Provider provider = compileAndLoad(BROKEN_TIMEZONE_FILE_2);
            __CLR4_4_11nrc1nrclgchot32.R.inc(77512);fail();
        } catch (NoSuchElementException nsee) {
            // This thrown from the Zone constructor
            __CLR4_4_11nrc1nrclgchot32.R.inc(77513);fail("NoSuchElementException was thrown; broken timezone file?");
        } catch (IllegalArgumentException iae) {
            __CLR4_4_11nrc1nrclgchot32.R.inc(77514);assertEquals("Attempting to create a Zone from an incomplete tokenizer", iae.getMessage());
        }
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    private Provider compileAndLoad(String data) throws Exception {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77515);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77516);File tempDir = createDataFile(data);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77517);File destDir = makeTempDir();

        __CLR4_4_11nrc1nrclgchot32.R.inc(77518);ZoneInfoCompiler.main(new String[]{
                "-src", tempDir.getAbsolutePath(),
                "-dst", destDir.getAbsolutePath(),
                "tzdata"
        });

        // Mark all files to be deleted on exit.
        __CLR4_4_11nrc1nrclgchot32.R.inc(77519);deleteOnExit(destDir);

        __CLR4_4_11nrc1nrclgchot32.R.inc(77520);return new ZoneInfoProvider(destDir);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    private File createDataFile(String data) throws IOException {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77521);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77522);File tempDir = makeTempDir();

        __CLR4_4_11nrc1nrclgchot32.R.inc(77523);File tempFile = new File(tempDir, "tzdata");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77524);tempFile.deleteOnExit();

        __CLR4_4_11nrc1nrclgchot32.R.inc(77525);InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));

        __CLR4_4_11nrc1nrclgchot32.R.inc(77526);FileOutputStream out = new FileOutputStream(tempFile);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77527);byte[] buf = new byte[1000];
        __CLR4_4_11nrc1nrclgchot32.R.inc(77528);int amt;
        __CLR4_4_11nrc1nrclgchot32.R.inc(77529);while ((amt = in.read(buf)) > 0) {{
            __CLR4_4_11nrc1nrclgchot32.R.inc(77532);out.write(buf, 0, amt);
        }
        }__CLR4_4_11nrc1nrclgchot32.R.inc(77533);out.close();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77534);in.close();

        __CLR4_4_11nrc1nrclgchot32.R.inc(77535);return tempDir;
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    private File makeTempDir() {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77536);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77537);File tempDir = new File(System.getProperty("java.io.tmpdir"));
        __CLR4_4_11nrc1nrclgchot32.R.inc(77538);tempDir = new File(tempDir, "joda-test-" + (new java.util.Random().nextInt() & 0xffffff));
        __CLR4_4_11nrc1nrclgchot32.R.inc(77539);tempDir.mkdirs();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77540);tempDir.deleteOnExit();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77541);return tempDir;
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    private void deleteOnExit(File tempFile) {try{__CLR4_4_11nrc1nrclgchot32.R.inc(77542);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77543);tempFile.deleteOnExit();
        __CLR4_4_11nrc1nrclgchot32.R.inc(77544);if ((((tempFile.isDirectory())&&(__CLR4_4_11nrc1nrclgchot32.R.iget(77545)!=0|true))||(__CLR4_4_11nrc1nrclgchot32.R.iget(77546)==0&false))) {{
            __CLR4_4_11nrc1nrclgchot32.R.inc(77547);File[] files = tempFile.listFiles();
            __CLR4_4_11nrc1nrclgchot32.R.inc(77548);for (int i = 0; (((i < files.length)&&(__CLR4_4_11nrc1nrclgchot32.R.iget(77549)!=0|true))||(__CLR4_4_11nrc1nrclgchot32.R.iget(77550)==0&false)); i++) {{
                __CLR4_4_11nrc1nrclgchot32.R.inc(77551);deleteOnExit(files[i]);
            }
        }}
    }}finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_2400_fromDay() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kgsi3t1nu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_2400_fromDay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kgsi3t1nu8(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77552);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77553);StringTokenizer st = new StringTokenizer("Apr Sun>=1  24:00");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77554);DateTimeOfYear test = new DateTimeOfYear(st);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77555);assertEquals(4, test.iMonthOfYear);  // Apr
        __CLR4_4_11nrc1nrclgchot32.R.inc(77556);assertEquals(2, test.iDayOfMonth);   // 2nd
        __CLR4_4_11nrc1nrclgchot32.R.inc(77557);assertEquals(1, test.iDayOfWeek);    // Mon
        __CLR4_4_11nrc1nrclgchot32.R.inc(77558);assertEquals(0, test.iMillisOfDay);  // 00:00
        __CLR4_4_11nrc1nrclgchot32.R.inc(77559);assertEquals(true, test.iAdvanceDayOfWeek);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_2400_last() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kx01yr1nug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_2400_last",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kx01yr1nug(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77560);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77561);StringTokenizer st = new StringTokenizer("Mar lastSun 24:00");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77562);DateTimeOfYear test = new DateTimeOfYear(st);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77563);assertEquals(4, test.iMonthOfYear);  // Apr
        __CLR4_4_11nrc1nrclgchot32.R.inc(77564);assertEquals(1, test.iDayOfMonth);   // 1st
        __CLR4_4_11nrc1nrclgchot32.R.inc(77565);assertEquals(1, test.iDayOfWeek);    // Mon
        __CLR4_4_11nrc1nrclgchot32.R.inc(77566);assertEquals(0, test.iMillisOfDay);  // 00:00
        __CLR4_4_11nrc1nrclgchot32.R.inc(77567);assertEquals(false, test.iAdvanceDayOfWeek);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_2400_specific_day() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yv5e1y1nuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_2400_specific_day",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77568,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yv5e1y1nuo(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77568);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77569);StringTokenizer st = new StringTokenizer("Sep 21 24:00");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77570);DateTimeOfYear test = new DateTimeOfYear(st);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77571);assertEquals(9, test.iMonthOfYear);  // Sep
        __CLR4_4_11nrc1nrclgchot32.R.inc(77572);assertEquals(22, test.iDayOfMonth);   // 22st
        __CLR4_4_11nrc1nrclgchot32.R.inc(77573);assertEquals(0, test.iDayOfWeek);    // Ignored
        __CLR4_4_11nrc1nrclgchot32.R.inc(77574);assertEquals(0, test.iMillisOfDay);  // 00:00
        __CLR4_4_11nrc1nrclgchot32.R.inc(77575);assertEquals(false, test.iAdvanceDayOfWeek);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_Amman_2003() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19r9mnu1nuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77576,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19r9mnu1nuw(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77576);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77577);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77578);DateTime dt = new DateTime(2003, 3, 1, 0, 0, zone);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77579);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77580);assertEquals(next, new DateTime(2003, 3, 28, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_Amman_2004() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16i9nvd1nv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2004",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16i9nvd1nv1(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77581);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77582);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77583);DateTime dt = new DateTime(2004, 3, 1, 0, 0, zone);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77584);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77585);assertEquals(next, new DateTime(2004, 3, 26, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_Amman_2005() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1399p2w1nv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2005",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1399p2w1nv6(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77586);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77587);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77588);DateTime dt = new DateTime(2005, 3, 1, 0, 0, zone);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77589);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77590);assertEquals(next, new DateTime(2005, 4, 1, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_Amman_2006() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qaf1nvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Amman_2006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qaf1nvb(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77591);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77592);DateTimeZone zone = DateTimeZone.forID("Asia/Amman");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77593);DateTime dt = new DateTime(2006, 3, 1, 0, 0, zone);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77594);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77595);assertEquals(next, new DateTime(2006, 3, 31, 0, 0, DateTimeZone.forOffsetHours(2)).getMillis());
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

    @Test
    public void test_Tokyo_1949() {__CLR4_4_11nrc1nrclgchot32.R.globalSliceStart(getClass().getName(),77596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxa6va1nvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11nrc1nrclgchot32.R.rethrow($CLV_t2$);}finally{__CLR4_4_11nrc1nrclgchot32.R.globalSliceEnd(getClass().getName(),"org.joda.time.tz.TestCompiler.test_Tokyo_1949",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),77596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxa6va1nvg(){try{__CLR4_4_11nrc1nrclgchot32.R.inc(77596);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77597);DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        __CLR4_4_11nrc1nrclgchot32.R.inc(77598);DateTime dt = new DateTime(1949, 9, 7, 0, 0, zone);
        __CLR4_4_11nrc1nrclgchot32.R.inc(77599);long next = zone.nextTransition(dt.getMillis());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77600);DateTime expected = new DateTime(1949, 9, 11, 0, 0, DateTimeZone.forOffsetHours(9));
        __CLR4_4_11nrc1nrclgchot32.R.inc(77601);assertEquals(DateTimeConstants.SUNDAY, expected.getDayOfWeek());
        __CLR4_4_11nrc1nrclgchot32.R.inc(77602);assertEquals(expected.getMillis(), next);
    }finally{__CLR4_4_11nrc1nrclgchot32.R.flushNeeded();}}

}
