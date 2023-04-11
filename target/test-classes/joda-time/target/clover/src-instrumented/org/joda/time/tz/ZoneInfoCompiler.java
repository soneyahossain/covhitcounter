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
package org.joda.time.tz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Compiles IANA ZoneInfo database files into binary files for each time zone
 * in the database. {@link DateTimeZoneBuilder} is used to construct and encode
 * compiled data files. {@link ZoneInfoProvider} loads the encoded files and
 * converts them back into {@link DateTimeZone} objects.
 * <p>
 * Although this tool is similar to zic, the binary formats are not
 * compatible. The latest IANA time zone database files may be obtained
 * <a href="https://www.iana.org/time-zones">here</a>.
 * <p>
 * ZoneInfoCompiler is mutable and not thread-safe, although the main method
 * may be safely invoked by multiple threads.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ZoneInfoCompiler {public static class __CLR4_4_1goqgoqlgchor9k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,22284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static DateTimeOfYear cStartOfYear;

    static Chronology cLenientISO;

    //-----------------------------------------------------------------------

    /**
     * Launches the ZoneInfoCompiler tool.
     *
     * <pre>
     * Usage: java org.joda.time.tz.ZoneInfoCompiler &lt;options&gt; &lt;source files&gt;
     * where possible options include:
     *   -src &lt;directory&gt;    Specify where to read source files
     *   -dst &lt;directory&gt;    Specify where to write generated files
     *   -verbose            Output verbosely (default false)
     * </pre>
     */
    public static void main(String[] args) throws Exception {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21626);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21627);if ((((args.length == 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21628)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21629)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21630);printUsage();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21631);return;
        }

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21632);File inputDir = null;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21633);File outputDir = null;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21634);boolean verbose = false;

        __CLR4_4_1goqgoqlgchor9k.R.inc(21635);int i;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21636);for (i = 0; (((i < args.length)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21637)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21638)==0&false)); i++) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21639);try {
                __CLR4_4_1goqgoqlgchor9k.R.inc(21640);if (((("-src".equals(args[i]))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21641)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21642)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21643);inputDir = new File(args[++i]);
                } }else {__CLR4_4_1goqgoqlgchor9k.R.inc(21644);if (((("-dst".equals(args[i]))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21645)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21646)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21647);outputDir = new File(args[++i]);
                } }else {__CLR4_4_1goqgoqlgchor9k.R.inc(21648);if (((("-verbose".equals(args[i]))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21649)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21650)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21651);verbose = true;
                } }else {__CLR4_4_1goqgoqlgchor9k.R.inc(21652);if (((("-?".equals(args[i]))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21653)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21654)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21655);printUsage();
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21656);return;
                } }else {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21657);break;
                }
            }}}}} catch (IndexOutOfBoundsException e) {
                __CLR4_4_1goqgoqlgchor9k.R.inc(21658);printUsage();
                __CLR4_4_1goqgoqlgchor9k.R.inc(21659);return;
            }
        }

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21660);if ((((i >= args.length)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21661)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21662)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21663);printUsage();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21664);return;
        }

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21665);File[] sources = new File[args.length - i];
        __CLR4_4_1goqgoqlgchor9k.R.inc(21666);for (int j = 0; (((i < args.length)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21667)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21668)==0&false)); i++, j++) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21669);sources[j] = (((inputDir == null )&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21670)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21671)==0&false))? new File(args[i]) : new File(inputDir, args[i]);
        }

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21672);ZoneInfoLogger.set(verbose);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21673);ZoneInfoCompiler zic = new ZoneInfoCompiler();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21674);zic.compile(outputDir, sources);
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    private static void printUsage() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21675);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21676);System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        __CLR4_4_1goqgoqlgchor9k.R.inc(21677);System.out.println("where possible options include:");
        __CLR4_4_1goqgoqlgchor9k.R.inc(21678);System.out.println("  -src <directory>    Specify where to read source files");
        __CLR4_4_1goqgoqlgchor9k.R.inc(21679);System.out.println("  -dst <directory>    Specify where to write generated files");
        __CLR4_4_1goqgoqlgchor9k.R.inc(21680);System.out.println("  -verbose            Output verbosely (default false)");
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static DateTimeOfYear getStartOfYear() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21681);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21682);if ((((cStartOfYear == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21683)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21684)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21685);cStartOfYear = new DateTimeOfYear();
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21686);return cStartOfYear;
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static Chronology getLenientISOChronology() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21687);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21688);if ((((cLenientISO == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21689)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21690)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21691);cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21692);return cLenientISO;
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    /**
     * @param zimap maps string ids to DateTimeZone objects.
     */
    static void writeZoneInfoMap(DataOutputStream dout, Map<String, DateTimeZone> zimap) throws IOException {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21693);

        __CLR4_4_1goqgoqlgchor9k.R.inc(21694);if ((((dout == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21695)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21696)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21697);throw new IllegalArgumentException("DataOutputStream must not be null.");
        }

        // Build the string pool.
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21698);Map<String, Short> idToIndex = new HashMap<String, Short>(zimap.size());
        __CLR4_4_1goqgoqlgchor9k.R.inc(21699);TreeMap<Short, String> indexToId = new TreeMap<Short, String>();

        __CLR4_4_1goqgoqlgchor9k.R.inc(21700);short count = 0;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21701);for (Entry<String, DateTimeZone> entry : zimap.entrySet()) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21702);String id = (String) entry.getKey();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21703);if ((((!idToIndex.containsKey(id))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21704)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21705)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21706);Short index = Short.valueOf(count);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21707);idToIndex.put(id, index);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21708);indexToId.put(index, id);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21709);if ((((++count == 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21710)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21711)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21712);throw new InternalError("Too many time zone ids");
                }
            }}
            }__CLR4_4_1goqgoqlgchor9k.R.inc(21713);id = ((DateTimeZone) entry.getValue()).getID();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21714);if ((((!idToIndex.containsKey(id))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21715)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21716)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21717);Short index = Short.valueOf(count);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21718);idToIndex.put(id, index);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21719);indexToId.put(index, id);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21720);if ((((++count == 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21721)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21722)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21723);throw new InternalError("Too many time zone ids");
                }
            }}
        }}

        // Write the string pool, ordered by index.
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21724);dout.writeShort(indexToId.size());
        __CLR4_4_1goqgoqlgchor9k.R.inc(21725);for (String id : indexToId.values()) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21726);dout.writeUTF(id);
        }

        // Write the mappings.
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21727);dout.writeShort(zimap.size());
        __CLR4_4_1goqgoqlgchor9k.R.inc(21728);for (Entry<String, DateTimeZone> entry : zimap.entrySet()) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21729);String id = entry.getKey();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21730);dout.writeShort(idToIndex.get(id).shortValue());
            __CLR4_4_1goqgoqlgchor9k.R.inc(21731);id = entry.getValue().getID();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21732);dout.writeShort(idToIndex.get(id).shortValue());
        }
    }}finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static int parseYear(String str, int def) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21733);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21734);str = str.toLowerCase(Locale.ENGLISH);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21735);if ((((str.equals("minimum") || str.equals("min"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21736)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21737)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21738);return Integer.MIN_VALUE;
        } }else {__CLR4_4_1goqgoqlgchor9k.R.inc(21739);if ((((str.equals("maximum") || str.equals("max"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21740)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21741)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21742);return Integer.MAX_VALUE;
        } }else {__CLR4_4_1goqgoqlgchor9k.R.inc(21743);if ((((str.equals("only"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21744)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21745)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21746);return def;
        }
        }}}__CLR4_4_1goqgoqlgchor9k.R.inc(21747);return Integer.parseInt(str);
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static int parseMonth(String str) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21748);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21749);DateTimeField field = ISOChronology.getInstanceUTC().monthOfYear();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21750);return field.get(field.set(0, str, Locale.ENGLISH));
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static int parseDayOfWeek(String str) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21751);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21752);DateTimeField field = ISOChronology.getInstanceUTC().dayOfWeek();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21753);return field.get(field.set(0, str, Locale.ENGLISH));
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static String parseOptional(String str) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21754);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21755);return ((((str.equals("-")) )&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21756)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21757)==0&false))? null : str;
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static int parseTime(String str) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21758);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21759);DateTimeFormatter p = ISODateTimeFormat.hourMinuteSecondFraction();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21760);MutableDateTime mdt = new MutableDateTime(0, getLenientISOChronology());
        __CLR4_4_1goqgoqlgchor9k.R.inc(21761);int pos = 0;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21762);if ((((str.startsWith("-"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21763)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21764)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21765);pos = 1;
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21766);int newPos = p.parseInto(mdt, str, pos);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21767);if ((((newPos == ~pos)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21768)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21769)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21770);throw new IllegalArgumentException(str);
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21771);int millis = (int) mdt.getMillis();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21772);if ((((pos == 1)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21773)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21774)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21775);millis = -millis;
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21776);return millis;
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static char parseZoneChar(char c) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21777);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1goqgoqlgchor9k.R.inc(21778);switch (c) {
            case 's':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21779);__CLB4_4_1_bool0=true;}
            case 'S':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21780);__CLB4_4_1_bool0=true;}
                // Standard time
                __CLR4_4_1goqgoqlgchor9k.R.inc(21781);return 's';
            case 'u':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21782);__CLB4_4_1_bool0=true;}
            case 'U':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21783);__CLB4_4_1_bool0=true;}
            case 'g':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21784);__CLB4_4_1_bool0=true;}
            case 'G':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21785);__CLB4_4_1_bool0=true;}
            case 'z':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21786);__CLB4_4_1_bool0=true;}
            case 'Z':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21787);__CLB4_4_1_bool0=true;}
                // UTC
                __CLR4_4_1goqgoqlgchor9k.R.inc(21788);return 'u';
            case 'w':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21789);__CLB4_4_1_bool0=true;}
            case 'W':if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21790);__CLB4_4_1_bool0=true;}
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1goqgoqlgchor9k.R.inc(21791);__CLB4_4_1_bool0=true;}
                // Wall time
                __CLR4_4_1goqgoqlgchor9k.R.inc(21792);return 'w';
        }
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    /**
     * @return false if error.
     */
    static boolean test(String id, DateTimeZone tz) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21793);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21794);if ((((!id.equals(tz.getID()))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21795)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21796)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21797);return true;
        }

        // Test to ensure that reported transitions are not duplicated.

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21798);long millis = ISOChronology.getInstanceUTC().year().set(0, 1850);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21799);long end = ISOChronology.getInstanceUTC().year().set(0, 2050);

        __CLR4_4_1goqgoqlgchor9k.R.inc(21800);int offset = tz.getOffset(millis);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21801);int stdOffset = tz.getStandardOffset(millis);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21802);String key = tz.getNameKey(millis);

        __CLR4_4_1goqgoqlgchor9k.R.inc(21803);List<Long> transitions = new ArrayList<Long>();

        __CLR4_4_1goqgoqlgchor9k.R.inc(21804);while (true) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21805);long next = tz.nextTransition(millis);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21806);if ((((next == millis || next > end)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21807)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21808)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21809);break;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21810);millis = next;

            __CLR4_4_1goqgoqlgchor9k.R.inc(21811);int nextOffset = tz.getOffset(millis);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21812);int nextStdOffset = tz.getStandardOffset(millis);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21813);String nextKey = tz.getNameKey(millis);

            __CLR4_4_1goqgoqlgchor9k.R.inc(21814);if ((((offset == nextOffset && stdOffset == nextStdOffset && key.equals(nextKey))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21815)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21816)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21817);System.out.println("*d* Error in " + tz.getID() + " "
                        + new DateTime(millis,
                        ISOChronology.getInstanceUTC()));
                __CLR4_4_1goqgoqlgchor9k.R.inc(21818);return false;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21819);if ((((nextKey == null || (nextKey.length() < 3 && !"??".equals(nextKey)))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21820)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21821)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21822);System.out.println("*s* Error in " + tz.getID() + " "
                        + new DateTime(millis,
                        ISOChronology.getInstanceUTC())
                        + ", nameKey=" + nextKey);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21823);return false;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21824);transitions.add(Long.valueOf(millis));

            __CLR4_4_1goqgoqlgchor9k.R.inc(21825);offset = nextOffset;
            __CLR4_4_1goqgoqlgchor9k.R.inc(21826);key = nextKey;
        }

        // Now verify that reverse transitions match up.

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21827);millis = ISOChronology.getInstanceUTC().year().set(0, 2050);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21828);end = ISOChronology.getInstanceUTC().year().set(0, 1850);

        __CLR4_4_1goqgoqlgchor9k.R.inc(21829);for (int i = transitions.size(); (((--i >= 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21830)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21831)==0&false)); ) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21832);long prev = tz.previousTransition(millis);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21833);if ((((prev == millis || prev < end)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21834)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21835)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21836);break;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21837);millis = prev;

            __CLR4_4_1goqgoqlgchor9k.R.inc(21838);long trans = transitions.get(i).longValue();

            __CLR4_4_1goqgoqlgchor9k.R.inc(21839);if ((((trans - 1 != millis)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21840)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21841)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21842);System.out.println("*r* Error in " + tz.getID() + " "
                        + new DateTime(millis,
                        ISOChronology.getInstanceUTC()) + " != "
                        + new DateTime(trans - 1,
                        ISOChronology.getInstanceUTC()));

                __CLR4_4_1goqgoqlgchor9k.R.inc(21843);return false;
            }
        }}

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21844);return true;
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    // Maps names to RuleSets.
    private Map<String, RuleSet> iRuleSets;

    // List of Zone objects.
    private List<Zone> iZones;

    // List String pairs to link.
    private List<String> iGoodLinks;

    // List String pairs to link.
    private List<String> iBackLinks;

    public ZoneInfoCompiler() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21845);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21846);iRuleSets = new HashMap<String, RuleSet>();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21847);iZones = new ArrayList<Zone>();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21848);iGoodLinks = new ArrayList<String>();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21849);iBackLinks = new ArrayList<String>();
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    /**
     * Returns a map of ids to DateTimeZones.
     *
     * @param outputDir optional directory to write compiled data files to
     * @param sources   optional list of source files to parse
     */
    public Map<String, DateTimeZone> compile(File outputDir, File[] sources) throws IOException {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21850);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21851);if ((((sources != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21852)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21853)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21854);for (int i = 0; (((i < sources.length)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21855)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21856)==0&false)); i++) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21857);BufferedReader in = null;
                __CLR4_4_1goqgoqlgchor9k.R.inc(21858);try {
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21859);in = new BufferedReader(new FileReader(sources[i]));
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21860);parseDataFile(in, "backward".equals(sources[i].getName()));
                } finally {
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21861);if ((((in != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21862)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21863)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(21864);in.close();
                    }
                }}
            }
        }}

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21865);if ((((outputDir != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21866)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21867)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21868);if ((((!outputDir.exists() && !outputDir.mkdirs())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21869)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21870)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21871);throw new IOException("Destination directory doesn't exist and cannot be created: " + outputDir);
            }
            }__CLR4_4_1goqgoqlgchor9k.R.inc(21872);if ((((!outputDir.isDirectory())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21873)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21874)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21875);throw new IOException("Destination is not a directory: " + outputDir);
            }
        }}

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21876);Map<String, DateTimeZone> map = new TreeMap<String, DateTimeZone>();
        __CLR4_4_1goqgoqlgchor9k.R.inc(21877);Map<String, Zone> sourceMap = new TreeMap<String, Zone>();

        __CLR4_4_1goqgoqlgchor9k.R.inc(21878);System.out.println("Writing zoneinfo files");
        // write out the standard entries
        __CLR4_4_1goqgoqlgchor9k.R.inc(21879);for (int i = 0; (((i < iZones.size())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21880)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21881)==0&false)); i++) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21882);Zone zone = iZones.get(i);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21883);DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21884);zone.addToBuilder(builder, iRuleSets);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21885);DateTimeZone tz = builder.toDateTimeZone(zone.iName, true);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21886);if ((((test(tz.getID(), tz))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21887)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21888)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21889);map.put(tz.getID(), tz);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21890);sourceMap.put(tz.getID(), zone);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21891);if ((((outputDir != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21892)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21893)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21894);writeZone(outputDir, builder, tz);
                }
            }}
        }}

        // revive zones from "good" links
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21895);for (int i = 0; (((i < iGoodLinks.size())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21896)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21897)==0&false)); i += 2) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21898);String baseId = iGoodLinks.get(i);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21899);String alias = iGoodLinks.get(i + 1);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21900);Zone sourceZone = sourceMap.get(baseId);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21901);if ((((sourceZone == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21902)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21903)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21904);System.out.println("Cannot find source zone '" + baseId + "' to link alias '" + alias + "' to");
            } }else {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21905);DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
                __CLR4_4_1goqgoqlgchor9k.R.inc(21906);sourceZone.addToBuilder(builder, iRuleSets);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21907);DateTimeZone revived = builder.toDateTimeZone(alias, true);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21908);if ((((test(revived.getID(), revived))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21909)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21910)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21911);map.put(revived.getID(), revived);
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21912);if ((((outputDir != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21913)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21914)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(21915);writeZone(outputDir, builder, revived);
                    }
                }}
                }__CLR4_4_1goqgoqlgchor9k.R.inc(21916);map.put(revived.getID(), revived);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21917);if ((((ZoneInfoLogger.verbose())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21918)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21919)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21920);System.out.println("Good link: " + alias + " -> " + baseId + " revived");
                }
            }}
        }}

        // store "back" links as aliases (where name is permanently mapped
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21921);for (int pass = 0; (((pass < 2)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21922)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21923)==0&false)); pass++) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21924);for (int i = 0; (((i < iBackLinks.size())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21925)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21926)==0&false)); i += 2) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21927);String id = iBackLinks.get(i);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21928);String alias = iBackLinks.get(i + 1);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21929);DateTimeZone tz = map.get(id);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21930);if ((((tz == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21931)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21932)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21933);if ((((pass > 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21934)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21935)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(21936);System.out.println("Cannot find time zone '" + id + "' to link alias '" + alias + "' to");
                    }
                }} }else {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21937);map.put(alias, tz);
                    __CLR4_4_1goqgoqlgchor9k.R.inc(21938);if ((((ZoneInfoLogger.verbose())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21939)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21940)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(21941);System.out.println("Back link: " + alias + " -> " + tz.getID());
                    }
                }}
            }}
        }}

        // write map that unites the time-zone data, pointing aliases and real zones at files
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21942);if ((((outputDir != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21943)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21944)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21945);System.out.println("Writing ZoneInfoMap");
            __CLR4_4_1goqgoqlgchor9k.R.inc(21946);File file = new File(outputDir, "ZoneInfoMap");
            __CLR4_4_1goqgoqlgchor9k.R.inc(21947);if ((((!file.getParentFile().exists())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21948)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21949)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21950);file.getParentFile().mkdirs();
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21951);OutputStream out = new FileOutputStream(file);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21952);DataOutputStream dout = new DataOutputStream(out);
            __CLR4_4_1goqgoqlgchor9k.R.inc(21953);try {
                // Sort and filter out any duplicates that match case.
                __CLR4_4_1goqgoqlgchor9k.R.inc(21954);Map<String, DateTimeZone> zimap = new TreeMap<String, DateTimeZone>(String.CASE_INSENSITIVE_ORDER);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21955);zimap.putAll(map);
                __CLR4_4_1goqgoqlgchor9k.R.inc(21956);writeZoneInfoMap(dout, zimap);
            } finally {
                __CLR4_4_1goqgoqlgchor9k.R.inc(21957);dout.close();
            }
        }

        }__CLR4_4_1goqgoqlgchor9k.R.inc(21958);return map;
    }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    private void writeZone(File outputDir, DateTimeZoneBuilder builder, DateTimeZone tz) throws IOException {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21959);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21960);if ((((ZoneInfoLogger.verbose())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21961)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21962)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21963);System.out.println("Writing " + tz.getID());
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21964);File file = new File(outputDir, tz.getID());
        __CLR4_4_1goqgoqlgchor9k.R.inc(21965);if ((((!file.getParentFile().exists())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21966)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21967)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21968);file.getParentFile().mkdirs();
        }
        }__CLR4_4_1goqgoqlgchor9k.R.inc(21969);OutputStream out = new FileOutputStream(file);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21970);try {
            __CLR4_4_1goqgoqlgchor9k.R.inc(21971);builder.writeTo(tz.getID(), out);
        } finally {
            __CLR4_4_1goqgoqlgchor9k.R.inc(21972);out.close();
        }

        // Test if it can be read back.
        __CLR4_4_1goqgoqlgchor9k.R.inc(21973);InputStream in = new FileInputStream(file);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21974);DateTimeZone tz2 = DateTimeZoneBuilder.readFrom(in, tz.getID());
        __CLR4_4_1goqgoqlgchor9k.R.inc(21975);in.close();

        __CLR4_4_1goqgoqlgchor9k.R.inc(21976);if ((((!tz.equals(tz2))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21977)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21978)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21979);System.out.println("*e* Error in " + tz.getID() +
                    ": Didn't read properly from file");
        }
    }}finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    public void parseDataFile(BufferedReader in, boolean backward) throws IOException {try{__CLR4_4_1goqgoqlgchor9k.R.inc(21980);
        __CLR4_4_1goqgoqlgchor9k.R.inc(21981);Zone zone = null;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21982);String line;
        __CLR4_4_1goqgoqlgchor9k.R.inc(21983);while ((line = in.readLine()) != null) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(21986);String trimmed = line.trim();
            __CLR4_4_1goqgoqlgchor9k.R.inc(21987);if ((((trimmed.length() == 0 || trimmed.charAt(0) == '#')&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21988)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21989)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21990);continue;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21991);int index = line.indexOf('#');
            __CLR4_4_1goqgoqlgchor9k.R.inc(21992);if ((((index >= 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21993)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21994)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(21995);line = line.substring(0, index);
            }

            //System.out.println(line);

            }__CLR4_4_1goqgoqlgchor9k.R.inc(21996);StringTokenizer st = new StringTokenizer(line, " \t");

            __CLR4_4_1goqgoqlgchor9k.R.inc(21997);if ((((Character.isWhitespace(line.charAt(0)) && st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(21998)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(21999)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22000);if ((((zone != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22001)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22002)==0&false))) {{
                    // Zone continuation
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22003);zone.chain(st);
                }
                }__CLR4_4_1goqgoqlgchor9k.R.inc(22004);continue;
            } }else {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22005);if ((((zone != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22006)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22007)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22008);iZones.add(zone);
                }
                }__CLR4_4_1goqgoqlgchor9k.R.inc(22009);zone = null;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(22010);if ((((st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22011)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22012)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22013);String token = st.nextToken();
                __CLR4_4_1goqgoqlgchor9k.R.inc(22014);if ((((token.equalsIgnoreCase("Rule"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22015)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22016)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22017);Rule r = new Rule(st);
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22018);RuleSet rs = iRuleSets.get(r.iName);
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22019);if ((((rs == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22020)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22021)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22022);rs = new RuleSet(r);
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22023);iRuleSets.put(r.iName, rs);
                    } }else {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22024);rs.addRule(r);
                    }
                }} }else {__CLR4_4_1goqgoqlgchor9k.R.inc(22025);if ((((token.equalsIgnoreCase("Zone"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22026)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22027)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22028);if ((((st.countTokens() < 4)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22029)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22030)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22031);throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                    }
                    }__CLR4_4_1goqgoqlgchor9k.R.inc(22032);zone = new Zone(st);
                } }else {__CLR4_4_1goqgoqlgchor9k.R.inc(22033);if ((((token.equalsIgnoreCase("Link"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22034)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22035)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22036);String real = st.nextToken();
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22037);String alias = st.nextToken();
                    // links in "backward" are deprecated names
                    // links in other files should be kept
                    // special case a few to try to repair terrible damage to tzdb
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22038);if ((((backward || alias.equals("US/Pacific-New") || alias.startsWith("Etc/") || alias.equals("GMT"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22039)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22040)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22041);iBackLinks.add(real);
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22042);iBackLinks.add(alias);
                    } }else {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22043);iGoodLinks.add(real);
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22044);iGoodLinks.add(alias);
                    }
                }} }else {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22045);System.out.println("Unknown line: " + line);
                }
            }}}}
        }}

        }__CLR4_4_1goqgoqlgchor9k.R.inc(22046);if ((((zone != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22047)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22048)==0&false))) {{
            __CLR4_4_1goqgoqlgchor9k.R.inc(22049);iZones.add(zone);
        }
    }}finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

    static class DateTimeOfYear {
        public final int iMonthOfYear;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final boolean iAdvanceDayOfWeek;
        public final int iMillisOfDay;
        public final char iZoneChar;

        DateTimeOfYear() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22050);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22051);iMonthOfYear = 1;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22052);iDayOfMonth = 1;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22053);iDayOfWeek = 0;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22054);iAdvanceDayOfWeek = false;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22055);iMillisOfDay = 0;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22056);iZoneChar = 'w';
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        DateTimeOfYear(StringTokenizer st) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22057);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22058);int month = 1;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22059);int day = 1;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22060);int dayOfWeek = 0;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22061);int millis = 0;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22062);boolean advance = false;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22063);char zoneChar = 'w';

            __CLR4_4_1goqgoqlgchor9k.R.inc(22064);if ((((st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22065)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22066)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22067);month = parseMonth(st.nextToken());

                __CLR4_4_1goqgoqlgchor9k.R.inc(22068);if ((((st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22069)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22070)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22071);String str = st.nextToken();
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22072);if ((((str.startsWith("last"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22073)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22074)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22075);day = -1;
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22076);dayOfWeek = parseDayOfWeek(str.substring(4));
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22077);advance = false;
                    } }else {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22078);try {
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22079);day = Integer.parseInt(str);
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22080);dayOfWeek = 0;
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22081);advance = false;
                        } catch (NumberFormatException e) {
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22082);int index = str.indexOf(">=");
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22083);if ((((index > 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22084)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22085)==0&false))) {{
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22086);day = Integer.parseInt(str.substring(index + 2));
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22087);dayOfWeek = parseDayOfWeek(str.substring(0, index));
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22088);advance = true;
                            } }else {{
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22089);index = str.indexOf("<=");
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22090);if ((((index > 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22091)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22092)==0&false))) {{
                                    __CLR4_4_1goqgoqlgchor9k.R.inc(22093);day = Integer.parseInt(str.substring(index + 2));
                                    __CLR4_4_1goqgoqlgchor9k.R.inc(22094);dayOfWeek = parseDayOfWeek(str.substring(0, index));
                                    __CLR4_4_1goqgoqlgchor9k.R.inc(22095);advance = false;
                                } }else {{
                                    __CLR4_4_1goqgoqlgchor9k.R.inc(22096);throw new IllegalArgumentException(str);
                                }
                            }}
                        }}
                    }

                    }__CLR4_4_1goqgoqlgchor9k.R.inc(22097);if ((((st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22098)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22099)==0&false))) {{
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22100);str = st.nextToken();
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22101);zoneChar = parseZoneChar(str.charAt(str.length() - 1));
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22102);if ((((str.equals("24:00"))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22103)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22104)==0&false))) {{
                            // handle end of year
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22105);if ((((month == 12 && day == 31)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22106)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22107)==0&false))) {{
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22108);millis = parseTime("23:59:59.999");
                            } }else {{
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22109);LocalDate date = ((((day == -1 )&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22110)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22111)==0&false))?
                                        new LocalDate(2001, month, 1).plusMonths(1) :
                                        new LocalDate(2001, month, day).plusDays(1));
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22112);advance = (day != -1 && dayOfWeek != 0);
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22113);month = date.getMonthOfYear();
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22114);day = date.getDayOfMonth();
                                __CLR4_4_1goqgoqlgchor9k.R.inc(22115);if ((((dayOfWeek != 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22116)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22117)==0&false))) {{
                                    __CLR4_4_1goqgoqlgchor9k.R.inc(22118);dayOfWeek = ((dayOfWeek - 1 + 1) % 7) + 1;
                                }
                            }}
                        }} }else {{
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22119);millis = parseTime(str);
                        }
                    }}
                }}
            }}

            }__CLR4_4_1goqgoqlgchor9k.R.inc(22120);iMonthOfYear = month;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22121);iDayOfMonth = day;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22122);iDayOfWeek = dayOfWeek;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22123);iAdvanceDayOfWeek = advance;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22124);iMillisOfDay = millis;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22125);iZoneChar = zoneChar;
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        /**
         * Adds a recurring savings rule to the builder.
         */
        public void addRecurring(DateTimeZoneBuilder builder, String nameKey,
                                 int saveMillis, int fromYear, int toYear) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22126);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22127);builder.addRecurringSavings(nameKey, saveMillis,
                    fromYear, toYear,
                    iZoneChar,
                    iMonthOfYear,
                    iDayOfMonth,
                    iDayOfWeek,
                    iAdvanceDayOfWeek,
                    iMillisOfDay);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        /**
         * Adds a cutover to the builder.
         */
        public void addCutover(DateTimeZoneBuilder builder, int year) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22128);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22129);builder.addCutover(year,
                    iZoneChar,
                    iMonthOfYear,
                    iDayOfMonth,
                    iDayOfWeek,
                    iAdvanceDayOfWeek,
                    iMillisOfDay);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22130);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22131);return
                    "MonthOfYear: " + iMonthOfYear + "\n" +
                            "DayOfMonth: " + iDayOfMonth + "\n" +
                            "DayOfWeek: " + iDayOfWeek + "\n" +
                            "AdvanceDayOfWeek: " + iAdvanceDayOfWeek + "\n" +
                            "MillisOfDay: " + iMillisOfDay + "\n" +
                            "ZoneChar: " + iZoneChar + "\n";
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}
    }

    private static class Rule {
        public final String iName;
        public final int iFromYear;
        public final int iToYear;
        public final String iType;
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iSaveMillis;
        public final String iLetterS;

        Rule(StringTokenizer st) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22132);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22133);if ((((st.countTokens() < 6)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22134)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22135)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22136);throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
            }
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22137);iName = st.nextToken().intern();
            __CLR4_4_1goqgoqlgchor9k.R.inc(22138);iFromYear = parseYear(st.nextToken(), 0);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22139);iToYear = parseYear(st.nextToken(), iFromYear);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22140);if ((((iToYear < iFromYear)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22141)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22142)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22143);throw new IllegalArgumentException();
            }
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22144);iType = parseOptional(st.nextToken());
            __CLR4_4_1goqgoqlgchor9k.R.inc(22145);iDateTimeOfYear = new DateTimeOfYear(st);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22146);iSaveMillis = parseTime(st.nextToken());
            __CLR4_4_1goqgoqlgchor9k.R.inc(22147);iLetterS = parseOptional(st.nextToken());
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        // creates a rule to go before the specified rule
        Rule(Rule after) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22148);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22149);iName = after.iName;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22150);iFromYear = 1800;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22151);iToYear = after.iFromYear;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22152);iType = null;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22153);iDateTimeOfYear = after.iDateTimeOfYear;  // does not matter
            __CLR4_4_1goqgoqlgchor9k.R.inc(22154);iSaveMillis = 0;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22155);iLetterS = after.iLetterS;
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        /**
         * Adds a recurring savings rule to the builder.
         */
        public void addRecurring(DateTimeZoneBuilder builder, int negativeSave, String nameFormat) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22156);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22157);int saveMillis = iSaveMillis + -negativeSave;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22158);String nameKey = formatName(nameFormat, saveMillis, iLetterS);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22159);iDateTimeOfYear.addRecurring(builder, nameKey, saveMillis, iFromYear, iToYear);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        private static String formatName(String nameFormat, int saveMillis, String letterS) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22160);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22161);int index = nameFormat.indexOf('/');
            __CLR4_4_1goqgoqlgchor9k.R.inc(22162);if ((((index > 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22163)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22164)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22165);if ((((saveMillis == 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22166)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22167)==0&false))) {{
                    // Extract standard name.
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22168);return nameFormat.substring(0, index).intern();
                } }else {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22169);return nameFormat.substring(index + 1).intern();
                }
            }}
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22170);index = nameFormat.indexOf("%s");
            __CLR4_4_1goqgoqlgchor9k.R.inc(22171);if ((((index < 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22172)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22173)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22174);return nameFormat;
            }
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22175);String left = nameFormat.substring(0, index);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22176);String right = nameFormat.substring(index + 2);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22177);String name;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22178);if ((((letterS == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22179)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22180)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22181);name = left.concat(right);
            } }else {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22182);name = left + letterS + right;
            }
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22183);return name.intern();
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22184);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22185);return
                    "[Rule]\n" +
                            "Name: " + iName + "\n" +
                            "FromYear: " + iFromYear + "\n" +
                            "ToYear: " + iToYear + "\n" +
                            "Type: " + iType + "\n" +
                            iDateTimeOfYear +
                            "SaveMillis: " + iSaveMillis + "\n" +
                            "LetterS: " + iLetterS + "\n";
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}
    }

    private static class RuleSet {
        private List<Rule> iRules;

        RuleSet(Rule rule) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22186);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22187);iRules = new ArrayList<Rule>();
            __CLR4_4_1goqgoqlgchor9k.R.inc(22188);iRules.add(rule);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        void addRule(Rule rule) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22189);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22190);if ((((!(rule.iName.equals(iRules.get(0).iName)))&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22191)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22192)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22193);throw new IllegalArgumentException("Rule name mismatch");
            }
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22194);iRules.add(rule);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        /**
         * Adds recurring savings rules to the builder.
         */
        public void addRecurring(DateTimeZoneBuilder builder, int standardMillis, String nameFormat) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22195);
            // a hack is necessary to remove negative SAVE values from the input tzdb file
            // negative save values cause the standard offset to be set in the summer instead of the winter
            // this causes the wrong name to be chosen from the CLDR data

            // check if the ruleset has negative SAVE values
            __CLR4_4_1goqgoqlgchor9k.R.inc(22196);int negativeSave = 0;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22197);for (int i = 0; (((i < iRules.size())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22198)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22199)==0&false)); i++) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22200);Rule rule = iRules.get(i);
                __CLR4_4_1goqgoqlgchor9k.R.inc(22201);if ((((rule.iSaveMillis < 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22202)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22203)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22204);negativeSave = Math.min(negativeSave, rule.iSaveMillis);
                }
            }}

            // if negative SAVE values, then patch standard millis and name format
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22205);if ((((negativeSave < 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22206)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22207)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22208);System.out.println("Fixed negative save values for rule '" + iRules.get(0).iName + "'");
                __CLR4_4_1goqgoqlgchor9k.R.inc(22209);standardMillis += negativeSave;
                __CLR4_4_1goqgoqlgchor9k.R.inc(22210);int slashPos = nameFormat.indexOf("/");
                __CLR4_4_1goqgoqlgchor9k.R.inc(22211);if ((((slashPos > 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22212)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22213)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22214);nameFormat = nameFormat.substring(slashPos + 1) + "/" + nameFormat.substring(0, slashPos);
                }
            }}
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22215);builder.setStandardOffset(standardMillis);

            // add a fake rule that predates all other rules to ensure standard=summer (see Namibia)
            __CLR4_4_1goqgoqlgchor9k.R.inc(22216);if ((((negativeSave < 0)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22217)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22218)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22219);Rule rule = new Rule(iRules.get(0));
                __CLR4_4_1goqgoqlgchor9k.R.inc(22220);rule.addRecurring(builder, negativeSave, nameFormat);
            }

            // add each rule, passing through the negative save to alter the actual iSaveMillis value that is used
            }__CLR4_4_1goqgoqlgchor9k.R.inc(22221);for (int i = 0; (((i < iRules.size())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22222)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22223)==0&false)); i++) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22224);Rule rule = iRules.get(i);
                __CLR4_4_1goqgoqlgchor9k.R.inc(22225);rule.addRecurring(builder, negativeSave, nameFormat);
            }
        }}finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}
    }

    private static class Zone {
        public final String iName;
        public final int iOffsetMillis;
        public final String iRules;
        public final String iFormat;
        public final int iUntilYear;
        public final DateTimeOfYear iUntilDateTimeOfYear;

        private Zone iNext;

        Zone(StringTokenizer st) {
            this(st.nextToken(), st);__CLR4_4_1goqgoqlgchor9k.R.inc(22227);try{__CLR4_4_1goqgoqlgchor9k.R.inc(22226);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        private Zone(String name, StringTokenizer st) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22228);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22229);iName = name.intern();
            __CLR4_4_1goqgoqlgchor9k.R.inc(22230);iOffsetMillis = parseTime(st.nextToken());
            __CLR4_4_1goqgoqlgchor9k.R.inc(22231);iRules = parseOptional(st.nextToken());
            __CLR4_4_1goqgoqlgchor9k.R.inc(22232);iFormat = st.nextToken().intern();

            __CLR4_4_1goqgoqlgchor9k.R.inc(22233);int year = Integer.MAX_VALUE;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22234);DateTimeOfYear dtOfYear = getStartOfYear();

            __CLR4_4_1goqgoqlgchor9k.R.inc(22235);if ((((st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22236)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22237)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22238);year = Integer.parseInt(st.nextToken());
                __CLR4_4_1goqgoqlgchor9k.R.inc(22239);if ((((st.hasMoreTokens())&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22240)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22241)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22242);dtOfYear = new DateTimeOfYear(st);
                }
            }}

            }__CLR4_4_1goqgoqlgchor9k.R.inc(22243);iUntilYear = year;
            __CLR4_4_1goqgoqlgchor9k.R.inc(22244);iUntilDateTimeOfYear = dtOfYear;
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        void chain(StringTokenizer st) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22245);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22246);if ((((iNext != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22247)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22248)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22249);iNext.chain(st);
            } }else {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22250);iNext = new Zone(iName, st);
            }
        }}finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        /*
        public DateTimeZone buildDateTimeZone(Map ruleSets) {
            DateTimeZoneBuilder builder = new DateTimeZoneBuilder();
            addToBuilder(builder, ruleSets);
            return builder.toDateTimeZone(iName);
        }
        */

        /**
         * Adds zone info to the builder.
         */
        public void addToBuilder(DateTimeZoneBuilder builder, Map<String, RuleSet> ruleSets) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22251);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22252);addToBuilder(this, builder, ruleSets);
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        private static void addToBuilder(Zone zone,
                                         DateTimeZoneBuilder builder,
                                         Map<String, RuleSet> ruleSets) {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22253);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22254);for (; (((zone != null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22255)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22256)==0&false)); zone = zone.iNext) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22257);if ((((zone.iRules == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22258)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22259)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22260);builder.setStandardOffset(zone.iOffsetMillis);
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22261);builder.setFixedSavings(zone.iFormat, 0);
                } }else {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22262);try {
                        // Check if iRules actually just refers to a savings.
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22263);int saveMillis = parseTime(zone.iRules);
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22264);builder.setStandardOffset(zone.iOffsetMillis);
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22265);builder.setFixedSavings(zone.iFormat, saveMillis);
                    } catch (Exception e) {
                        // Zone is using a RuleSet for this segment of the timeline
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22266);RuleSet rs = ruleSets.get(zone.iRules);
                        __CLR4_4_1goqgoqlgchor9k.R.inc(22267);if ((((rs == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22268)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22269)==0&false))) {{
                            __CLR4_4_1goqgoqlgchor9k.R.inc(22270);throw new IllegalArgumentException
                                    ("Rules not found: " + zone.iRules);
                        }
                        }__CLR4_4_1goqgoqlgchor9k.R.inc(22271);rs.addRecurring(builder, zone.iOffsetMillis, zone.iFormat);
                    }
                }

                }__CLR4_4_1goqgoqlgchor9k.R.inc(22272);if ((((zone.iUntilYear == Integer.MAX_VALUE)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22273)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22274)==0&false))) {{
                    __CLR4_4_1goqgoqlgchor9k.R.inc(22275);break;
                }

                }__CLR4_4_1goqgoqlgchor9k.R.inc(22276);zone.iUntilDateTimeOfYear.addCutover(builder, zone.iUntilYear);
            }
        }}finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1goqgoqlgchor9k.R.inc(22277);
            __CLR4_4_1goqgoqlgchor9k.R.inc(22278);String str =
                    "[Zone]\n" +
                            "Name: " + iName + "\n" +
                            "OffsetMillis: " + iOffsetMillis + "\n" +
                            "Rules: " + iRules + "\n" +
                            "Format: " + iFormat + "\n" +
                            "UntilYear: " + iUntilYear + "\n" +
                            iUntilDateTimeOfYear;

            __CLR4_4_1goqgoqlgchor9k.R.inc(22279);if ((((iNext == null)&&(__CLR4_4_1goqgoqlgchor9k.R.iget(22280)!=0|true))||(__CLR4_4_1goqgoqlgchor9k.R.iget(22281)==0&false))) {{
                __CLR4_4_1goqgoqlgchor9k.R.inc(22282);return str;
            }

            }__CLR4_4_1goqgoqlgchor9k.R.inc(22283);return str + "...\n" + iNext.toString();
        }finally{__CLR4_4_1goqgoqlgchor9k.R.flushNeeded();}}
    }
}

