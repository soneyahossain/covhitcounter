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

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/**
 * DateTimeZoneBuilder allows complex DateTimeZones to be constructed. Since
 * creating a new DateTimeZone this way is a relatively expensive operation,
 * built zones can be written to a file. Reading back the encoded data is a
 * quick operation.
 * <p>
 * DateTimeZoneBuilder itself is mutable and not thread-safe, but the
 * DateTimeZone objects that it builds are thread-safe and immutable.
 * <p>
 * It is intended that {@link ZoneInfoCompiler} be used to read time zone data
 * files, indirectly calling DateTimeZoneBuilder. The following complex
 * example defines the America/Los_Angeles time zone, with all historical
 * transitions:
 *
 * <pre>
 * DateTimeZone America_Los_Angeles = new DateTimeZoneBuilder()
 *     .addCutover(-2147483648, 'w', 1, 1, 0, false, 0)
 *     .setStandardOffset(-28378000)
 *     .setFixedSavings("LMT", 0)
 *     .addCutover(1883, 'w', 11, 18, 0, false, 43200000)
 *     .setStandardOffset(-28800000)
 *     .addRecurringSavings("PDT", 3600000, 1918, 1919, 'w',  3, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1918, 1919, 'w', 10, -1, 7, false, 7200000)
 *     .addRecurringSavings("PWT", 3600000, 1942, 1942, 'w',  2,  9, 0, false, 7200000)
 *     .addRecurringSavings("PPT", 3600000, 1945, 1945, 'u',  8, 14, 0, false, 82800000)
 *     .addRecurringSavings("PST",       0, 1945, 1945, 'w',  9, 30, 0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1948, 1948, 'w',  3, 14, 0, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1949, 1949, 'w',  1,  1, 0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1950, 1966, 'w',  4, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1950, 1961, 'w',  9, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1962, 1966, 'w', 10, -1, 7, false, 7200000)
 *     .addRecurringSavings("PST",       0, 1967, 2147483647, 'w', 10, -1, 7, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1967, 1973, 'w', 4, -1,  7, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1974, 1974, 'w', 1,  6,  0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1975, 1975, 'w', 2, 23,  0, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1976, 1986, 'w', 4, -1,  7, false, 7200000)
 *     .addRecurringSavings("PDT", 3600000, 1987, 2147483647, 'w', 4, 1, 7, true, 7200000)
 *     .toDateTimeZone("America/Los_Angeles", true);
 * </pre>
 *
 * @author Brian S O'Neill
 * @see ZoneInfoCompiler
 * @see ZoneInfoProvider
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DateTimeZoneBuilder {public static class __CLR4_4_1fqrfqrlgchor8g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,21472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Decodes a built DateTimeZone from the given stream, as encoded by
     * writeTo.
     *
     * @param in input stream to read encoded DateTimeZone from.
     * @param id time zone id to assign
     */
    public static DateTimeZone readFrom(InputStream in, String id) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20403);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20404);if ((((in instanceof DataInput)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20405)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20406)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20407);return readFrom((DataInput) in, id);
        } }else {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20408);return readFrom((DataInput) new DataInputStream(in), id);
        }
    }}finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Decodes a built DateTimeZone from the given stream, as encoded by
     * writeTo.
     *
     * @param in input stream to read encoded DateTimeZone from.
     * @param id time zone id to assign
     */
    public static DateTimeZone readFrom(DataInput in, String id) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20409);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1fqrfqrlgchor8g.R.inc(20410);switch (in.readUnsignedByte()) {
            case 'F':if (!__CLB4_4_1_bool0) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20411);__CLB4_4_1_bool0=true;}
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20412);DateTimeZone fixed = new FixedDateTimeZone
                        (id, in.readUTF(), (int) readMillis(in), (int) readMillis(in));
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20413);if ((((fixed.equals(DateTimeZone.UTC))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20414)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20415)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20416);fixed = DateTimeZone.UTC;
                }
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(20417);return fixed;
            case 'C':if (!__CLB4_4_1_bool0) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20418);__CLB4_4_1_bool0=true;}
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20419);return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(in, id));
            case 'P':if (!__CLB4_4_1_bool0) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20420);__CLB4_4_1_bool0=true;}
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20421);return PrecalculatedZone.readFrom(in, id);
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20422);__CLB4_4_1_bool0=true;}
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20423);throw new IOException("Invalid encoding");
        }
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Millisecond encoding formats:
     * <p>
     * upper two bits  units       field length  approximate range
     * ---------------------------------------------------------------
     * 00              30 minutes  1 byte        +/- 16 hours
     * 01              minutes     4 bytes       +/- 1020 years
     * 10              seconds     5 bytes       +/- 4355 years
     * 11              millis      9 bytes       +/- 292,000,000 years
     * <p>
     * Remaining bits in field form signed offset from 1970-01-01T00:00:00Z.
     */
    static void writeMillis(DataOutput out, long millis) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20424);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20425);if ((((millis % (30 * 60000L) == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20426)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20427)==0&false))) {{
            // Try to write in 30 minute units.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20428);long units = millis / (30 * 60000L);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20429);if ((((((units << (64 - 6)) >> (64 - 6)) == units)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20430)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20431)==0&false))) {{
                // Form 00 (6 bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20432);out.writeByte((int) (units & 0x3f));
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20433);return;
            }
        }}

        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20434);if ((((millis % 60000L == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20435)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20436)==0&false))) {{
            // Try to write minutes.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20437);long minutes = millis / 60000L;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20438);if ((((((minutes << (64 - 30)) >> (64 - 30)) == minutes)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20439)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20440)==0&false))) {{
                // Form 01 (30 bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20441);out.writeInt(0x40000000 | (int) (minutes & 0x3fffffff));
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20442);return;
            }
        }}

        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20443);if ((((millis % 1000L == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20444)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20445)==0&false))) {{
            // Try to write seconds.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20446);long seconds = millis / 1000L;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20447);if ((((((seconds << (64 - 38)) >> (64 - 38)) == seconds)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20448)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20449)==0&false))) {{
                // Form 10 (38 bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20450);out.writeByte(0x80 | (int) ((seconds >> 32) & 0x3f));
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20451);out.writeInt((int) (seconds & 0xffffffff));
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20452);return;
            }
        }}

        // Write milliseconds either because the additional precision is
        // required or the minutes didn't fit in the field.

        // Form 11 (64-bits effective precision, but write as if 70 bits)
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20453);out.writeByte((((millis < 0 )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20454)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20455)==0&false))? 0xff : 0xc0);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20456);out.writeLong(millis);
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Reads encoding generated by writeMillis.
     */
    static long readMillis(DataInput in) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20457);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20458);int v = in.readUnsignedByte();
        boolean __CLB4_4_1_bool1=false;__CLR4_4_1fqrfqrlgchor8g.R.inc(20459);switch (v >> 6) {
            case 0:if (!__CLB4_4_1_bool1) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20460);__CLB4_4_1_bool1=true;}
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20461);__CLB4_4_1_bool1=true;}
                // Form 00 (6 bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20462);v = (v << (32 - 6)) >> (32 - 6);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20463);return v * (30 * 60000L);

            case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20464);__CLB4_4_1_bool1=true;}
                // Form 01 (30 bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20465);v = (v << (32 - 6)) >> (32 - 30);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20466);v |= (in.readUnsignedByte()) << 16;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20467);v |= (in.readUnsignedByte()) << 8;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20468);v |= (in.readUnsignedByte());
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20469);return v * 60000L;

            case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20470);__CLB4_4_1_bool1=true;}
                // Form 10 (38 bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20471);long w = (((long) v) << (64 - 6)) >> (64 - 38);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20472);w |= (in.readUnsignedByte()) << 24;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20473);w |= (in.readUnsignedByte()) << 16;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20474);w |= (in.readUnsignedByte()) << 8;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20475);w |= (in.readUnsignedByte());
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20476);return w * 1000L;

            case 3:if (!__CLB4_4_1_bool1) {__CLR4_4_1fqrfqrlgchor8g.R.inc(20477);__CLB4_4_1_bool1=true;}
                // Form 11 (64-bits effective precision)
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20478);return in.readLong();
        }
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    private static DateTimeZone buildFixedZone(String id, String nameKey,
                                               int wallOffset, int standardOffset) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20479);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20480);if (((("UTC".equals(id) && id.equals(nameKey) &&
                wallOffset == 0 && standardOffset == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20481)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20482)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20483);return DateTimeZone.UTC;
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20484);return new FixedDateTimeZone(id, nameKey, wallOffset, standardOffset);
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    // List of RuleSets.
    private final ArrayList<RuleSet> iRuleSets;

    public DateTimeZoneBuilder() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20485);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20486);iRuleSets = new ArrayList<RuleSet>(10);
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Adds a cutover for added rules. The standard offset at the cutover
     * defaults to 0. Call setStandardOffset afterwards to change it.
     *
     * @param year             the year of cutover
     * @param mode             'u' - cutover is measured against UTC, 'w' - against wall
     *                         offset, 's' - against standard offset
     * @param monthOfYear      the month from 1 (January) to 12 (December)
     * @param dayOfMonth       if negative, set to ((last day of month) - ~dayOfMonth).
     *                         For example, if -1, set to last day of month
     * @param dayOfWeek        from 1 (Monday) to 7 (Sunday), if 0 then ignore
     * @param advanceDayOfWeek if dayOfMonth does not fall on dayOfWeek, advance to
     *                         dayOfWeek when true, retreat when false.
     * @param millisOfDay      additional precision for specifying time of day of cutover
     */
    public DateTimeZoneBuilder addCutover(int year,
                                          char mode,
                                          int monthOfYear,
                                          int dayOfMonth,
                                          int dayOfWeek,
                                          boolean advanceDayOfWeek,
                                          int millisOfDay) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20487);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20488);if ((((iRuleSets.size() > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20489)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20490)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20491);OfYear ofYear = new OfYear
                    (mode, monthOfYear, dayOfMonth, dayOfWeek, advanceDayOfWeek, millisOfDay);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20492);RuleSet lastRuleSet = iRuleSets.get(iRuleSets.size() - 1);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20493);lastRuleSet.setUpperLimit(year, ofYear);
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20494);iRuleSets.add(new RuleSet());
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20495);return this;
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Sets the standard offset to use for newly added rules until the next
     * cutover is added.
     *
     * @param standardOffset the standard offset in millis
     */
    public DateTimeZoneBuilder setStandardOffset(int standardOffset) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20496);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20497);getLastRuleSet().setStandardOffset(standardOffset);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20498);return this;
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Set a fixed savings rule at the cutover.
     */
    public DateTimeZoneBuilder setFixedSavings(String nameKey, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20499);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20500);getLastRuleSet().setFixedSavings(nameKey, saveMillis);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20501);return this;
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Add a recurring daylight saving time rule.
     *
     * @param nameKey          the name key of new rule
     * @param saveMillis       the milliseconds to add to standard offset
     * @param fromYear         the first year that rule is in effect, MIN_VALUE indicates
     *                         beginning of time
     * @param toYear           the last year (inclusive) that rule is in effect, MAX_VALUE
     *                         indicates end of time
     * @param mode             'u' - transitions are calculated against UTC, 'w' -
     *                         transitions are calculated against wall offset, 's' - transitions are
     *                         calculated against standard offset
     * @param monthOfYear      the month from 1 (January) to 12 (December)
     * @param dayOfMonth       if negative, set to ((last day of month) - ~dayOfMonth).
     *                         For example, if -1, set to last day of month
     * @param dayOfWeek        from 1 (Monday) to 7 (Sunday), if 0 then ignore
     * @param advanceDayOfWeek if dayOfMonth does not fall on dayOfWeek, advance to
     *                         dayOfWeek when true, retreat when false.
     * @param millisOfDay      additional precision for specifying time of day of transitions
     */
    public DateTimeZoneBuilder addRecurringSavings(String nameKey, int saveMillis,
                                                   int fromYear, int toYear,
                                                   char mode,
                                                   int monthOfYear,
                                                   int dayOfMonth,
                                                   int dayOfWeek,
                                                   boolean advanceDayOfWeek,
                                                   int millisOfDay) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20502);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20503);if ((((fromYear <= toYear)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20504)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20505)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20506);OfYear ofYear = new OfYear
                    (mode, monthOfYear, dayOfMonth, dayOfWeek, advanceDayOfWeek, millisOfDay);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20507);Recurrence recurrence = new Recurrence(ofYear, nameKey, saveMillis);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20508);Rule rule = new Rule(recurrence, fromYear, toYear);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20509);getLastRuleSet().addRule(rule);
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20510);return this;
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    private RuleSet getLastRuleSet() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20511);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20512);if ((((iRuleSets.size() == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20513)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20514)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20515);addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20516);return iRuleSets.get(iRuleSets.size() - 1);
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Processes all the rules and builds a DateTimeZone.
     *
     * @param id       time zone id to assign
     * @param outputID true if the zone id should be output
     */
    public DateTimeZone toDateTimeZone(String id, boolean outputID) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20517);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20518);if ((((id == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20519)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20520)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20521);throw new IllegalArgumentException();
        }

        // Discover where all the transitions occur and store the results in
        // these lists.
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20522);ArrayList<Transition> transitions = new ArrayList<Transition>();

        // Tail zone picks up remaining transitions in the form of an endless
        // DST cycle.
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20523);DSTZone tailZone = null;

        __CLR4_4_1fqrfqrlgchor8g.R.inc(20524);long millis = Long.MIN_VALUE;
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20525);int saveMillis = 0;

        __CLR4_4_1fqrfqrlgchor8g.R.inc(20526);int ruleSetCount = iRuleSets.size();
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20527);for (int i = 0; (((i < ruleSetCount)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20528)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20529)==0&false)); i++) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20530);RuleSet rs = iRuleSets.get(i);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20531);Transition next = rs.firstTransition(millis);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20532);if ((((next == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20533)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20534)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20535);continue;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20536);addTransition(transitions, next);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20537);millis = next.getMillis();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20538);saveMillis = next.getSaveMillis();

            // Copy it since we're going to destroy it.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20539);rs = new RuleSet(rs);

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20540);while ((next = rs.nextTransition(millis, saveMillis)) != null) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20543);if ((((addTransition(transitions, next) && tailZone != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20544)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20545)==0&false))) {{
                    // Got the extra transition before DSTZone.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20546);break;
                }
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(20547);millis = next.getMillis();
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20548);saveMillis = next.getSaveMillis();
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20549);if ((((tailZone == null && i == ruleSetCount - 1)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20550)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20551)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20552);tailZone = rs.buildTailZone(id);
                    // If tailZone is not null, don't break out of main loop until
                    // at least one more transition is calculated. This ensures a
                    // correct 'seam' to the DSTZone.
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20553);millis = rs.getUpperLimit(saveMillis);
        }

        // Check if a simpler zone implementation can be returned.
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20554);if ((((transitions.size() == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20555)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20556)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20557);if ((((tailZone != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20558)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20559)==0&false))) {{
                // This shouldn't happen, but handle just in case.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20560);return tailZone;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20561);return buildFixedZone(id, "UTC", 0, 0);
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20562);if ((((transitions.size() == 1 && tailZone == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20563)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20564)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20565);Transition tr = transitions.get(0);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20566);return buildFixedZone(id, tr.getNameKey(),
                    tr.getWallOffset(), tr.getStandardOffset());
        }

        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20567);PrecalculatedZone zone = PrecalculatedZone.create(id, outputID, transitions, tailZone);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20568);if ((((zone.isCachable())&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20569)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20570)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20571);return CachedDateTimeZone.forZone(zone);
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20572);return zone;
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    private boolean addTransition(ArrayList<Transition> transitions, Transition tr) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20573);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20574);int size = transitions.size();
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20575);if ((((size == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20576)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20577)==0&false))) {{
//            System.out.println("Adding   " + tr);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20578);transitions.add(tr);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20579);return true;
        }

        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20580);Transition last = transitions.get(size - 1);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20581);if ((((!tr.isTransitionFrom(last))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20582)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20583)==0&false))) {{
//            System.out.println("Rejected " + tr);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20584);return false;
        }

        // If local time of new transition is same as last local time, just
        // replace last transition with new one.
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20585);int offsetForLast = 0;
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20586);if ((((size >= 2)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20587)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20588)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20589);offsetForLast = transitions.get(size - 2).getWallOffset();
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20590);int offsetForNew = last.getWallOffset();

        __CLR4_4_1fqrfqrlgchor8g.R.inc(20591);long lastLocal = last.getMillis() + offsetForLast;
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20592);long newLocal = tr.getMillis() + offsetForNew;

        __CLR4_4_1fqrfqrlgchor8g.R.inc(20593);if ((((newLocal != lastLocal)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20594)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20595)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20596);transitions.add(tr);
//            System.out.println("Adding   " + tr);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20597);return true;
        }
        }__CLR4_4_1fqrfqrlgchor8g.R.inc(20598);Transition previous = transitions.remove(size - 1);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20599);Transition adjusted = tr.withMillis(previous.getMillis());
//        System.out.println("Current  " + tr);
//        System.out.println("Previous " + previous);
//        System.out.println("Adjusted " + adjusted);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20600);return addTransition(transitions, adjusted);
    }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Encodes a built DateTimeZone to the given stream. Call readFrom to
     * decode the data into a DateTimeZone object.
     *
     * @param out the output stream to receive the encoded DateTimeZone
     * @since 1.5 (parameter added)
     */
    public void writeTo(String zoneID, OutputStream out) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20601);
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20602);if ((((out instanceof DataOutput)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20603)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20604)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20605);writeTo(zoneID, (DataOutput) out);
        } }else {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20606);DataOutputStream dout = new DataOutputStream(out);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20607);writeTo(zoneID, (DataOutput) dout);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20608);dout.flush();
        }
    }}finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Encodes a built DateTimeZone to the given stream. Call readFrom to
     * decode the data into a DateTimeZone object.
     *
     * @param out the output stream to receive the encoded DateTimeZone
     * @since 1.5 (parameter added)
     */
    public void writeTo(String zoneID, DataOutput out) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20609);
        // pass false so zone id is not written out
        __CLR4_4_1fqrfqrlgchor8g.R.inc(20610);DateTimeZone zone = toDateTimeZone(zoneID, false);

        __CLR4_4_1fqrfqrlgchor8g.R.inc(20611);if ((((zone instanceof FixedDateTimeZone)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20612)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20613)==0&false))) {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20614);out.writeByte('F'); // 'F' for fixed
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20615);out.writeUTF(zone.getNameKey(0));
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20616);writeMillis(out, zone.getOffset(0));
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20617);writeMillis(out, zone.getStandardOffset(0));
        } }else {{
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20618);if ((((zone instanceof CachedDateTimeZone)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20619)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20620)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20621);out.writeByte('C'); // 'C' for cached, precalculated
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20622);zone = ((CachedDateTimeZone) zone).getUncachedZone();
            } }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20623);out.writeByte('P'); // 'P' for precalculated, uncached
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20624);((PrecalculatedZone) zone).writeTo(out);
        }
    }}finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

    /**
     * Supports setting fields of year and moving between transitions.
     */
    private static final class OfYear {
        static OfYear readFrom(DataInput in) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20625);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20626);return new OfYear((char) in.readUnsignedByte(),
                    (int) in.readUnsignedByte(),
                    (int) in.readByte(),
                    (int) in.readUnsignedByte(),
                    in.readBoolean(),
                    (int) readMillis(in));
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        // Is 'u', 'w', or 's'.
        final char iMode;

        final int iMonthOfYear;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final boolean iAdvance;
        final int iMillisOfDay;

        OfYear(char mode,
               int monthOfYear,
               int dayOfMonth,
               int dayOfWeek, boolean advanceDayOfWeek,
               int millisOfDay) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20627);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20628);if ((((mode != 'u' && mode != 'w' && mode != 's')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20629)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20630)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20631);throw new IllegalArgumentException("Unknown mode: " + mode);
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20632);iMode = mode;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20633);iMonthOfYear = monthOfYear;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20634);iDayOfMonth = dayOfMonth;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20635);iDayOfWeek = dayOfWeek;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20636);iAdvance = advanceDayOfWeek;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20637);iMillisOfDay = millisOfDay;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before instant
         */
        public long setInstant(int year, int standardOffset, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20638);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20639);int offset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20640);if ((((iMode == 'w')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20641)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20642)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20643);offset = standardOffset + saveMillis;
            } }else {__CLR4_4_1fqrfqrlgchor8g.R.inc(20644);if ((((iMode == 's')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20645)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20646)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20647);offset = standardOffset;
            } }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20648);offset = 0;
            }

            }}__CLR4_4_1fqrfqrlgchor8g.R.inc(20649);Chronology chrono = ISOChronology.getInstanceUTC();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20650);long millis = chrono.year().set(0, year);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20651);millis = chrono.monthOfYear().set(millis, iMonthOfYear);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20652);millis = chrono.millisOfDay().set(millis, iMillisOfDay);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20653);millis = setDayOfMonth(chrono, millis);

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20654);if ((((iDayOfWeek != 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20655)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20656)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20657);millis = setDayOfWeek(chrono, millis);
            }

            // Convert from local time to UTC.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20658);return millis - offset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before next recurrence
         */
        public long next(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20659);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20660);int offset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20661);if ((((iMode == 'w')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20662)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20663)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20664);offset = standardOffset + saveMillis;
            } }else {__CLR4_4_1fqrfqrlgchor8g.R.inc(20665);if ((((iMode == 's')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20666)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20667)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20668);offset = standardOffset;
            } }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20669);offset = 0;
            }

            // Convert from UTC to local time.
            }}__CLR4_4_1fqrfqrlgchor8g.R.inc(20670);instant += offset;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20671);Chronology chrono = ISOChronology.getInstanceUTC();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20672);long next = chrono.monthOfYear().set(instant, iMonthOfYear);
            // Be lenient with millisOfDay.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20673);next = chrono.millisOfDay().set(next, 0);
            // avoid going into the next day, as that can change the month and cause setDayOfMonthNext to fail
            // this is not a particularly good solution to the problem (it is vital to use iMillisOfDay
            // as otherwise the logic doesn't find the correct *next* occurrence)
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20674);next = chrono.millisOfDay().add(next, Math.min(iMillisOfDay, DateTimeConstants.MILLIS_PER_DAY - 1));
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20675);next = setDayOfMonthNext(chrono, next);

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20676);if ((((iDayOfWeek == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20677)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20678)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20679);if ((((next <= instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20680)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20681)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20682);next = chrono.year().add(next, 1);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20683);next = setDayOfMonthNext(chrono, next);
                }
            }} }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20684);next = setDayOfWeek(chrono, next);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20685);if ((((next <= instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20686)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20687)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20688);next = chrono.year().add(next, 1);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20689);next = chrono.monthOfYear().set(next, iMonthOfYear);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20690);next = setDayOfMonthNext(chrono, next);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20691);next = setDayOfWeek(chrono, next);
                }
            }}
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20692);next = chrono.millisOfDay().set(next, 0);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20693);next = chrono.millisOfDay().add(next, iMillisOfDay);

            // Convert from local time to UTC.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20694);return next - offset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before previous recurrence
         */
        public long previous(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20695);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20696);int offset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20697);if ((((iMode == 'w')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20698)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20699)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20700);offset = standardOffset + saveMillis;
            } }else {__CLR4_4_1fqrfqrlgchor8g.R.inc(20701);if ((((iMode == 's')&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20702)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20703)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20704);offset = standardOffset;
            } }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20705);offset = 0;
            }

            // Convert from UTC to local time.
            }}__CLR4_4_1fqrfqrlgchor8g.R.inc(20706);instant += offset;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20707);Chronology chrono = ISOChronology.getInstanceUTC();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20708);long prev = chrono.monthOfYear().set(instant, iMonthOfYear);
            // Be lenient with millisOfDay.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20709);prev = chrono.millisOfDay().set(prev, 0);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20710);prev = chrono.millisOfDay().add(prev, iMillisOfDay);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20711);prev = setDayOfMonthPrevious(chrono, prev);

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20712);if ((((iDayOfWeek == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20713)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20714)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20715);if ((((prev >= instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20716)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20717)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20718);prev = chrono.year().add(prev, -1);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20719);prev = setDayOfMonthPrevious(chrono, prev);
                }
            }} }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20720);prev = setDayOfWeek(chrono, prev);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20721);if ((((prev >= instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20722)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20723)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20724);prev = chrono.year().add(prev, -1);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20725);prev = chrono.monthOfYear().set(prev, iMonthOfYear);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20726);prev = setDayOfMonthPrevious(chrono, prev);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20727);prev = setDayOfWeek(chrono, prev);
                }
            }}
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20728);prev = chrono.millisOfDay().set(prev, 0);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20729);prev = chrono.millisOfDay().add(prev, iMillisOfDay);

            // Convert from local time to UTC.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20730);return prev - offset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20731);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20732);if ((((this == obj)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20733)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20734)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20735);return true;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20736);if ((((obj instanceof OfYear)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20737)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20738)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20739);OfYear other = (OfYear) obj;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20740);return
                        iMode == other.iMode &&
                                iMonthOfYear == other.iMonthOfYear &&
                                iDayOfMonth == other.iDayOfMonth &&
                                iDayOfWeek == other.iDayOfWeek &&
                                iAdvance == other.iAdvance &&
                                iMillisOfDay == other.iMillisOfDay;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20741);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20742);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20743);return
                    "[OfYear]\n" +
                            "Mode: " + iMode + '\n' +
                            "MonthOfYear: " + iMonthOfYear + '\n' +
                            "DayOfMonth: " + iDayOfMonth + '\n' +
                            "DayOfWeek: " + iDayOfWeek + '\n' +
                            "AdvanceDayOfWeek: " + iAdvance + '\n' +
                            "MillisOfDay: " + iMillisOfDay + '\n';
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20744);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20745);out.writeByte(iMode);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20746);out.writeByte(iMonthOfYear);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20747);out.writeByte(iDayOfMonth);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20748);out.writeByte(iDayOfWeek);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20749);out.writeBoolean(iAdvance);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20750);writeMillis(out, iMillisOfDay);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * If month-day is 02-29 and year isn't leap, advances to next leap year.
         */
        private long setDayOfMonthNext(Chronology chrono, long next) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20751);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20752);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20753);next = setDayOfMonth(chrono, next);
            } catch (IllegalArgumentException e) {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20754);if ((((iMonthOfYear == 2 && iDayOfMonth == 29)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20755)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20756)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20757);while ((((chrono.year().isLeap(next) == false)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20758)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20759)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(20760);next = chrono.year().add(next, 1);
                    }
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(20761);next = setDayOfMonth(chrono, next);
                } }else {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20762);throw e;
                }
            }}
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20763);return next;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * If month-day is 02-29 and year isn't leap, retreats to previous leap year.
         */
        private long setDayOfMonthPrevious(Chronology chrono, long prev) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20764);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20765);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20766);prev = setDayOfMonth(chrono, prev);
            } catch (IllegalArgumentException e) {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20767);if ((((iMonthOfYear == 2 && iDayOfMonth == 29)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20768)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20769)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20770);while ((((chrono.year().isLeap(prev) == false)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20771)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20772)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(20773);prev = chrono.year().add(prev, -1);
                    }
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(20774);prev = setDayOfMonth(chrono, prev);
                } }else {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20775);throw e;
                }
            }}
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20776);return prev;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        private long setDayOfMonth(Chronology chrono, long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20777);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20778);if ((((iDayOfMonth >= 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20779)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20780)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20781);instant = chrono.dayOfMonth().set(instant, iDayOfMonth);
            } }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20782);instant = chrono.dayOfMonth().set(instant, 1);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20783);instant = chrono.monthOfYear().add(instant, 1);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20784);instant = chrono.dayOfMonth().add(instant, iDayOfMonth);
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20785);return instant;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        private long setDayOfWeek(Chronology chrono, long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20786);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20787);int dayOfWeek = chrono.dayOfWeek().get(instant);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20788);int daysToAdd = iDayOfWeek - dayOfWeek;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20789);if ((((daysToAdd != 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20790)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20791)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20792);if ((((iAdvance)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20793)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20794)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20795);if ((((daysToAdd < 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20796)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20797)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(20798);daysToAdd += 7;
                    }
                }} }else {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20799);if ((((daysToAdd > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20800)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20801)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(20802);daysToAdd -= 7;
                    }
                }}
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(20803);instant = chrono.dayOfWeek().add(instant, daysToAdd);
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20804);return instant;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }

    /**
     * Extends OfYear with a nameKey and savings.
     */
    private static final class Recurrence {
        static Recurrence readFrom(DataInput in) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20805);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20806);return new Recurrence(OfYear.readFrom(in), in.readUTF(), (int) readMillis(in));
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        final OfYear iOfYear;
        final String iNameKey;
        final int iSaveMillis;

        Recurrence(OfYear ofYear, String nameKey, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20807);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20808);iOfYear = ofYear;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20809);iNameKey = nameKey;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20810);iSaveMillis = saveMillis;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public OfYear getOfYear() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20811);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20812);return iOfYear;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before next recurrence
         */
        public long next(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20813);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20814);return iOfYear.next(instant, standardOffset, saveMillis);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * @param standardOffset standard offset just before previous recurrence
         */
        public long previous(long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20815);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20816);return iOfYear.previous(instant, standardOffset, saveMillis);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public String getNameKey() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20817);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20818);return iNameKey;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getSaveMillis() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20819);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20820);return iSaveMillis;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20821);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20822);if ((((this == obj)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20823)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20824)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20825);return true;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20826);if ((((obj instanceof Recurrence)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20827)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20828)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20829);Recurrence other = (Recurrence) obj;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20830);return
                        iSaveMillis == other.iSaveMillis &&
                                iNameKey.equals(other.iNameKey) &&
                                iOfYear.equals(other.iOfYear);
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20831);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20832);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20833);iOfYear.writeTo(out);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20834);out.writeUTF(iNameKey);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20835);writeMillis(out, iSaveMillis);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        Recurrence rename(String nameKey) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20836);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20837);return new Recurrence(iOfYear, nameKey, iSaveMillis);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        Recurrence renameAppend(String appendNameKey) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20838);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20839);return rename((iNameKey + appendNameKey).intern());
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20840);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20841);return iOfYear + " named " + iNameKey + " at " + iSaveMillis;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }

    /**
     * Extends Recurrence with inclusive year limits.
     */
    private static final class Rule {
        final Recurrence iRecurrence;
        final int iFromYear; // inclusive
        final int iToYear;   // inclusive

        Rule(Recurrence recurrence, int fromYear, int toYear) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20842);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20843);iRecurrence = recurrence;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20844);iFromYear = fromYear;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20845);iToYear = toYear;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public int getFromYear() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20846);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20847);return iFromYear;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getToYear() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20848);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20849);return iToYear;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public OfYear getOfYear() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20850);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20851);return iRecurrence.getOfYear();
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public String getNameKey() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20852);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20853);return iRecurrence.getNameKey();
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getSaveMillis() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20854);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20855);return iRecurrence.getSaveMillis();
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public long next(final long instant, int standardOffset, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20856);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20857);Chronology chrono = ISOChronology.getInstanceUTC();

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20858);final int wallOffset = standardOffset + saveMillis;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20859);long testInstant = instant;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20860);int year;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20861);if ((((instant == Long.MIN_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20862)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20863)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20864);year = Integer.MIN_VALUE;
            } }else {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20865);year = chrono.year().get(instant + wallOffset);
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20866);if ((((year < iFromYear)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20867)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20868)==0&false))) {{
                // First advance instant to start of from year.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20869);testInstant = chrono.year().set(0, iFromYear) - wallOffset;
                // Back off one millisecond to account for next recurrence
                // being exactly at the beginning of the year.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20870);testInstant -= 1;
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20871);long next = iRecurrence.next(testInstant, standardOffset, saveMillis);

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20872);if ((((next > instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20873)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20874)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20875);year = chrono.year().get(next + wallOffset);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20876);if ((((year > iToYear)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20877)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20878)==0&false))) {{
                    // Out of range, return original value.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20879);next = instant;
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20880);return next;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20881);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20882);return iFromYear + " to " + iToYear + " using " + iRecurrence;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }

    private static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iWallOffset;
        private final int iStandardOffset;

        Transition(long millis, Transition tr) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20883);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20884);iMillis = millis;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20885);iNameKey = tr.iNameKey;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20886);iWallOffset = tr.iWallOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20887);iStandardOffset = tr.iStandardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        Transition(long millis, Rule rule, int standardOffset) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20888);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20889);iMillis = millis;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20890);iNameKey = rule.getNameKey();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20891);iWallOffset = standardOffset + rule.getSaveMillis();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20892);iStandardOffset = standardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        Transition(long millis, String nameKey,
                   int wallOffset, int standardOffset) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20893);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20894);iMillis = millis;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20895);iNameKey = nameKey;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20896);iWallOffset = wallOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20897);iStandardOffset = standardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public long getMillis() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20898);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20899);return iMillis;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public String getNameKey() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20900);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20901);return iNameKey;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getWallOffset() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20902);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20903);return iWallOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getStandardOffset() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20904);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20905);return iStandardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getSaveMillis() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20906);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20907);return iWallOffset - iStandardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public Transition withMillis(long millis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20908);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20909);return new Transition(millis, iNameKey, iWallOffset, iStandardOffset);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * There must be a change in the millis, wall offsets or name keys.
         */
        public boolean isTransitionFrom(Transition other) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20910);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20911);if ((((other == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20912)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20913)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20914);return true;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20915);return iMillis > other.iMillis &&
                    (iWallOffset != other.iWallOffset ||
                            iStandardOffset != other.iStandardOffset ||
                            !(iNameKey.equals(other.iNameKey)));
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20916);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20917);return new DateTime(iMillis, DateTimeZone.UTC) + " " + iStandardOffset + " " + iWallOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }

    private static final class RuleSet {
        private static final int YEAR_LIMIT;

        static {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20918);
            // Don't pre-calculate more than 100 years into the future. Almost
            // all zones will stop pre-calculating far sooner anyhow. Either a
            // simple DST cycle is detected or the last rule is a fixed
            // offset. If a zone has a fixed offset set more than 100 years
            // into the future, then it won't be observed.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20919);long now = DateTimeUtils.currentTimeMillis();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20920);YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(now) + 100;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        private int iStandardOffset;
        private ArrayList<Rule> iRules;

        // Optional.
        private String iInitialNameKey;
        private int iInitialSaveMillis;

        // Upper limit is exclusive.
        private int iUpperYear;
        private OfYear iUpperOfYear;

        RuleSet() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20921);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20922);iRules = new ArrayList<Rule>(10);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20923);iUpperYear = Integer.MAX_VALUE;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * Copy constructor.
         */
        RuleSet(RuleSet rs) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20924);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20925);iStandardOffset = rs.iStandardOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20926);iRules = new ArrayList<Rule>(rs.iRules);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20927);iInitialNameKey = rs.iInitialNameKey;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20928);iInitialSaveMillis = rs.iInitialSaveMillis;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20929);iUpperYear = rs.iUpperYear;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20930);iUpperOfYear = rs.iUpperOfYear;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public int getStandardOffset() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20931);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20932);return iStandardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void setStandardOffset(int standardOffset) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20933);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20934);iStandardOffset = standardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void setFixedSavings(String nameKey, int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20935);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20936);iInitialNameKey = nameKey;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20937);iInitialSaveMillis = saveMillis;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void addRule(Rule rule) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20938);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20939);if ((((!iRules.contains(rule))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20940)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20941)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20942);iRules.add(rule);
            }
        }}finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void setUpperLimit(int year, OfYear ofYear) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20943);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20944);iUpperYear = year;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20945);iUpperOfYear = ofYear;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * Returns a transition at firstMillis with the first name key and
         * offsets for this rule set. This method may return null.
         *
         * @param firstMillis millis of first transition
         */
        public Transition firstTransition(final long firstMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20946);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20947);if ((((iInitialNameKey != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20948)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20949)==0&false))) {{
                // Initial zone info explicitly set, so don't search the rules.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20950);return new Transition(firstMillis, iInitialNameKey,
                        iStandardOffset + iInitialSaveMillis, iStandardOffset);
            }

            // Make a copy before we destroy the rules.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20951);ArrayList<Rule> copy = new ArrayList<Rule>(iRules);

            // Iterate through all the transitions until firstMillis is
            // reached. Use the name key and savings for whatever rule reaches
            // the limit.

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20952);long millis = Long.MIN_VALUE;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20953);int saveMillis = 0;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20954);Transition first = null;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20955);Transition next;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20956);while ((next = nextTransition(millis, saveMillis)) != null) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20959);millis = next.getMillis();

                __CLR4_4_1fqrfqrlgchor8g.R.inc(20960);if ((((millis == firstMillis)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20961)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20962)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20963);first = new Transition(firstMillis, next);
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20964);break;
                }

                }__CLR4_4_1fqrfqrlgchor8g.R.inc(20965);if ((((millis > firstMillis)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20966)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20967)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20968);if ((((first == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20969)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20970)==0&false))) {{
                        // Find first rule without savings. This way a more
                        // accurate nameKey is found even though no rule
                        // extends to the RuleSet's lower limit.
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(20971);for (Rule rule : copy) {{
                            __CLR4_4_1fqrfqrlgchor8g.R.inc(20972);if ((((rule.getSaveMillis() == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20973)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20974)==0&false))) {{
                                __CLR4_4_1fqrfqrlgchor8g.R.inc(20975);first = new Transition(firstMillis, rule, iStandardOffset);
                                __CLR4_4_1fqrfqrlgchor8g.R.inc(20976);break;
                            }
                        }}
                    }}
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(20977);if ((((first == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20978)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20979)==0&false))) {{
                        // Found no rule without savings. Create a transition
                        // with no savings anyhow, and use the best available
                        // name key.
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(20980);first = new Transition(firstMillis, next.getNameKey(),
                                iStandardOffset, iStandardOffset);
                    }
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(20981);break;
                }

                // Set first to the best transition found so far, but next
                // iteration may find something closer to lower limit.
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(20982);first = new Transition(firstMillis, next);

                __CLR4_4_1fqrfqrlgchor8g.R.inc(20983);saveMillis = next.getSaveMillis();
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(20984);iRules = copy;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20985);return first;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * Returns null if RuleSet is exhausted or upper limit reached. Calling
         * this method will throw away rules as they each become
         * exhausted. Copy the RuleSet before using it to compute transitions.
         * <p>
         * Returned transition may be a duplicate from previous
         * transition. Caller must call isTransitionFrom to filter out
         * duplicates.
         *
         * @param saveMillis savings before next transition
         */
        public Transition nextTransition(final long instant, final int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(20986);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20987);Chronology chrono = ISOChronology.getInstanceUTC();

            // Find next matching rule.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20988);Rule nextRule = null;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20989);long nextMillis = Long.MAX_VALUE;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(20990);Iterator<Rule> it = iRules.iterator();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(20991);while ((((it.hasNext())&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20992)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20993)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20994);Rule rule = it.next();
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20995);long next = rule.next(instant, iStandardOffset, saveMillis);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(20996);if ((((next <= instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(20997)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(20998)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(20999);it.remove();
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21000);continue;
                }
                // Even if next is same as previous next, choose the rule
                // in order for more recently added rules to override.
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21001);if ((((next <= nextMillis)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21002)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21003)==0&false))) {{
                    // Found a better match.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21004);nextRule = rule;
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21005);nextMillis = next;
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21006);if ((((nextRule == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21007)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21008)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21009);return null;
            }

            // Stop precalculating if year reaches some arbitrary limit.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21010);if ((((chrono.year().get(nextMillis) >= YEAR_LIMIT)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21011)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21012)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21013);return null;
            }

            // Check if upper limit reached or passed.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21014);if ((((iUpperYear < Integer.MAX_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21015)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21016)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21017);long upperMillis =
                        iUpperOfYear.setInstant(iUpperYear, iStandardOffset, saveMillis);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21018);if ((((nextMillis >= upperMillis)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21019)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21020)==0&false))) {{
                    // At or after upper limit.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21021);return null;
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21022);return new Transition(nextMillis, nextRule, iStandardOffset);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * @param saveMillis savings before upper limit
         */
        public long getUpperLimit(int saveMillis) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21023);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21024);if ((((iUpperYear == Integer.MAX_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21025)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21026)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21027);return Long.MAX_VALUE;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21028);return iUpperOfYear.setInstant(iUpperYear, iStandardOffset, saveMillis);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * Returns null if none can be built.
         */
        public DSTZone buildTailZone(String id) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21029);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21030);if ((((iRules.size() == 2)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21031)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21032)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21033);Rule startRule = iRules.get(0);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21034);Rule endRule = iRules.get(1);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21035);if ((((startRule.getToYear() == Integer.MAX_VALUE &&
                        endRule.getToYear() == Integer.MAX_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21036)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21037)==0&false))) {{

                    // With exactly two infinitely recurring rules left, a
                    // simple DSTZone can be formed.

                    // The order of rules can come in any order, and it doesn't
                    // really matter which rule was chosen the 'start' and
                    // which is chosen the 'end'. DSTZone works properly either
                    // way.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21038);return new DSTZone(id, iStandardOffset,
                            startRule.iRecurrence, endRule.iRecurrence);
                }
            }}
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21039);return null;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21040);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21041);return iInitialNameKey + " initial: " + iInitialSaveMillis + " std: " + iStandardOffset +
                    " upper: " + iUpperYear + " " + iUpperOfYear + " " + iRules;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }

    private static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;

        static DSTZone readFrom(DataInput in, String id) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21042);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21043);return new DSTZone(id, (int) readMillis(in),
                    Recurrence.readFrom(in), Recurrence.readFrom(in));
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        final int iStandardOffset;
        final Recurrence iStartRecurrence;
        final Recurrence iEndRecurrence;

        DSTZone(String id, int standardOffset,
                Recurrence startRecurrence, Recurrence endRecurrence) {
            super(id);__CLR4_4_1fqrfqrlgchor8g.R.inc(21045);try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21044);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21046);iStandardOffset = standardOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21047);iStartRecurrence = startRecurrence;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21048);iEndRecurrence = endRecurrence;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public String getNameKey(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21049);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21050);return findMatchingRecurrence(instant).getNameKey();
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getOffset(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21051);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21052);return iStandardOffset + findMatchingRecurrence(instant).getSaveMillis();
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getStandardOffset(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21053);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21054);return iStandardOffset;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean isFixed() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21055);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21056);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public long nextTransition(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21057);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21058);int standardOffset = iStandardOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21059);Recurrence startRecurrence = iStartRecurrence;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21060);Recurrence endRecurrence = iEndRecurrence;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21061);long start, end;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21062);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21063);start = startRecurrence.next
                        (instant, standardOffset, endRecurrence.getSaveMillis());
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21064);if ((((instant > 0 && start < 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21065)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21066)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21067);start = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21068);start = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21069);start = instant;
            }

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21070);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21071);end = endRecurrence.next
                        (instant, standardOffset, startRecurrence.getSaveMillis());
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21072);if ((((instant > 0 && end < 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21073)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21074)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21075);end = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21076);end = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21077);end = instant;
            }

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21078);return ((((start > end) )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21079)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21080)==0&false))? end : start;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public long previousTransition(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21081);
            // Increment in order to handle the case where instant is exactly at
            // a transition.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21082);instant++;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21083);int standardOffset = iStandardOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21084);Recurrence startRecurrence = iStartRecurrence;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21085);Recurrence endRecurrence = iEndRecurrence;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21086);long start, end;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21087);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21088);start = startRecurrence.previous
                        (instant, standardOffset, endRecurrence.getSaveMillis());
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21089);if ((((instant < 0 && start > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21090)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21091)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21092);start = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21093);start = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21094);start = instant;
            }

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21095);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21096);end = endRecurrence.previous
                        (instant, standardOffset, startRecurrence.getSaveMillis());
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21097);if ((((instant < 0 && end > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21098)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21099)==0&false))) {{
                    // Overflowed.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21100);end = instant;
                }
            }} catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21101);end = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21102);end = instant;
            }

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21103);return (((((start > end) )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21104)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21105)==0&false))? start : end) - 1;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21106);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21107);if ((((this == obj)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21108)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21109)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21110);return true;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21111);if ((((obj instanceof DSTZone)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21112)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21113)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21114);DSTZone other = (DSTZone) obj;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21115);return
                        getID().equals(other.getID()) &&
                                iStandardOffset == other.iStandardOffset &&
                                iStartRecurrence.equals(other.iStartRecurrence) &&
                                iEndRecurrence.equals(other.iEndRecurrence);
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21116);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21117);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21118);writeMillis(out, iStandardOffset);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21119);iStartRecurrence.writeTo(out);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21120);iEndRecurrence.writeTo(out);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        private Recurrence findMatchingRecurrence(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21121);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21122);int standardOffset = iStandardOffset;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21123);Recurrence startRecurrence = iStartRecurrence;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21124);Recurrence endRecurrence = iEndRecurrence;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21125);long start, end;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21126);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21127);start = startRecurrence.next
                        (instant, standardOffset, endRecurrence.getSaveMillis());
            } catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21128);start = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21129);start = instant;
            }

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21130);try {
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21131);end = endRecurrence.next
                        (instant, standardOffset, startRecurrence.getSaveMillis());
            } catch (IllegalArgumentException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21132);end = instant;
            } catch (ArithmeticException e) {
                // Overflowed.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21133);end = instant;
            }

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21134);return ((((start > end) )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21135)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21136)==0&false))? startRecurrence : endRecurrence;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }

    private static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;

        static PrecalculatedZone readFrom(DataInput in, String id) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21137);
            // Read string pool.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21138);int poolSize = in.readUnsignedShort();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21139);String[] pool = new String[poolSize];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21140);for (int i = 0; (((i < poolSize)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21141)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21142)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21143);pool[i] = in.readUTF();
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21144);int size = in.readInt();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21145);long[] transitions = new long[size];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21146);int[] wallOffsets = new int[size];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21147);int[] standardOffsets = new int[size];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21148);String[] nameKeys = new String[size];

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21149);for (int i = 0; (((i < size)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21150)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21151)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21152);transitions[i] = readMillis(in);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21153);wallOffsets[i] = (int) readMillis(in);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21154);standardOffsets[i] = (int) readMillis(in);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21155);try {
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21156);int index;
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21157);if ((((poolSize < 256)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21158)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21159)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21160);index = in.readUnsignedByte();
                    } }else {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21161);index = in.readUnsignedShort();
                    }
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(21162);nameKeys[i] = pool[index];
                } catch (ArrayIndexOutOfBoundsException e) {
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21163);throw new IOException("Invalid encoding");
                }
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21164);DSTZone tailZone = null;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21165);if ((((in.readBoolean())&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21166)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21167)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21168);tailZone = DSTZone.readFrom(in, id);
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21169);return new PrecalculatedZone
                    (id, transitions, wallOffsets, standardOffsets, nameKeys, tailZone);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        /**
         * Factory to create instance from builder.
         *
         * @param id          the zone id
         * @param outputID    true if the zone id should be output
         * @param transitions the list of Transition objects
         * @param tailZone    optional zone for getting info beyond precalculated tables
         */
        static PrecalculatedZone create(String id, boolean outputID, ArrayList<Transition> transitions,
                                        DSTZone tailZone) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21170);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21171);int size = transitions.size();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21172);if ((((size == 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21173)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21174)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21175);throw new IllegalArgumentException();
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21176);long[] trans = new long[size];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21177);int[] wallOffsets = new int[size];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21178);int[] standardOffsets = new int[size];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21179);String[] nameKeys = new String[size];

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21180);Transition last = null;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21181);for (int i = 0; (((i < size)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21182)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21183)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21184);Transition tr = transitions.get(i);

                __CLR4_4_1fqrfqrlgchor8g.R.inc(21185);if ((((!tr.isTransitionFrom(last))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21186)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21187)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21188);throw new IllegalArgumentException(id);
                }

                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21189);trans[i] = tr.getMillis();
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21190);wallOffsets[i] = tr.getWallOffset();
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21191);standardOffsets[i] = tr.getStandardOffset();
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21192);nameKeys[i] = tr.getNameKey();

                __CLR4_4_1fqrfqrlgchor8g.R.inc(21193);last = tr;
            }

            // Some timezones (Australia) have the same name key for
            // summer and winter which messes everything up. Fix it here.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21194);String[] zoneNameData = new String[5];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21195);String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21196);for (int j = 0; (((j < zoneStrings.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21197)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21198)==0&false)); j++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21199);String[] set = zoneStrings[j];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21200);if ((((set != null && set.length == 5 && id.equals(set[0]))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21201)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21202)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21203);zoneNameData = set;
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21204);Chronology chrono = ISOChronology.getInstanceUTC();

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21205);for (int i = 0; (((i < nameKeys.length - 1)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21206)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21207)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21208);String curNameKey = nameKeys[i];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21209);String nextNameKey = nameKeys[i + 1];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21210);long curOffset = wallOffsets[i];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21211);long nextOffset = wallOffsets[i + 1];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21212);long curStdOffset = standardOffsets[i];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21213);long nextStdOffset = standardOffsets[i + 1];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21214);Period p = new Period(trans[i], trans[i + 1], PeriodType.yearMonthDay(), chrono);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21215);if ((((curOffset != nextOffset &&
                        curStdOffset == nextStdOffset &&
                        curNameKey.equals(nextNameKey) &&
                        p.getYears() == 0 && p.getMonths() > 4 && p.getMonths() < 8 &&
                        curNameKey.equals(zoneNameData[2]) &&
                        curNameKey.equals(zoneNameData[4]))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21216)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21217)==0&false))) {{

                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21218);if ((((ZoneInfoLogger.verbose())&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21219)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21220)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21221);System.out.println("Fixing duplicate name key - " + nextNameKey);
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21222);System.out.println("     - " + new DateTime(trans[i], chrono) +
                                " - " + new DateTime(trans[i + 1], chrono));
                    }
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(21223);if ((((curOffset > nextOffset)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21224)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21225)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21226);nameKeys[i] = (curNameKey + "-Summer").intern();
                    } }else {__CLR4_4_1fqrfqrlgchor8g.R.inc(21227);if ((((curOffset < nextOffset)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21228)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21229)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21230);nameKeys[i + 1] = (nextNameKey + "-Summer").intern();
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21231);i++;
                    }
                }}}
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21232);if ((((tailZone != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21233)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21234)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21235);if ((((tailZone.iStartRecurrence.getNameKey()
                        .equals(tailZone.iEndRecurrence.getNameKey()))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21236)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21237)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21238);if ((((ZoneInfoLogger.verbose())&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21239)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21240)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21241);System.out.println("Fixing duplicate recurrent name key - " +
                                tailZone.iStartRecurrence.getNameKey());
                    }
                    }__CLR4_4_1fqrfqrlgchor8g.R.inc(21242);if ((((tailZone.iStartRecurrence.getSaveMillis() > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21243)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21244)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21245);tailZone = new DSTZone(
                                tailZone.getID(),
                                tailZone.iStandardOffset,
                                tailZone.iStartRecurrence.renameAppend("-Summer"),
                                tailZone.iEndRecurrence);
                    } }else {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21246);tailZone = new DSTZone(
                                tailZone.getID(),
                                tailZone.iStandardOffset,
                                tailZone.iStartRecurrence,
                                tailZone.iEndRecurrence.renameAppend("-Summer"));
                    }
                }}
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21247);return new PrecalculatedZone
                    (((((outputID )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21248)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21249)==0&false))? id : ""), trans, wallOffsets, standardOffsets, nameKeys, tailZone);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        // All array fields have the same length.

        private final long[] iTransitions;

        private final int[] iWallOffsets;
        private final int[] iStandardOffsets;
        private final String[] iNameKeys;

        private final DSTZone iTailZone;

        /**
         * Constructor used ONLY for valid input, loaded via static methods.
         */
        private PrecalculatedZone(String id, long[] transitions, int[] wallOffsets,
                                  int[] standardOffsets, String[] nameKeys, DSTZone tailZone) {
            super(id);__CLR4_4_1fqrfqrlgchor8g.R.inc(21251);try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21250);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21252);iTransitions = transitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21253);iWallOffsets = wallOffsets;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21254);iStandardOffsets = standardOffsets;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21255);iNameKeys = nameKeys;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21256);iTailZone = tailZone;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public String getNameKey(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21257);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21258);long[] transitions = iTransitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21259);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21260);if ((((i >= 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21261)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21262)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21263);return iNameKeys[i];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21264);i = ~i;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21265);if ((((i < transitions.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21266)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21267)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21268);if ((((i > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21269)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21270)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21271);return iNameKeys[i - 1];
                }
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21272);return "UTC";
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21273);if ((((iTailZone == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21274)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21275)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21276);return iNameKeys[i - 1];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21277);return iTailZone.getNameKey(instant);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getOffset(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21278);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21279);long[] transitions = iTransitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21280);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21281);if ((((i >= 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21282)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21283)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21284);return iWallOffsets[i];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21285);i = ~i;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21286);if ((((i < transitions.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21287)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21288)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21289);if ((((i > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21290)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21291)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21292);return iWallOffsets[i - 1];
                }
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21293);return 0;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21294);if ((((iTailZone == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21295)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21296)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21297);return iWallOffsets[i - 1];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21298);return iTailZone.getOffset(instant);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public int getStandardOffset(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21299);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21300);long[] transitions = iTransitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21301);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21302);if ((((i >= 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21303)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21304)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21305);return iStandardOffsets[i];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21306);i = ~i;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21307);if ((((i < transitions.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21308)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21309)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21310);if ((((i > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21311)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21312)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21313);return iStandardOffsets[i - 1];
                }
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21314);return 0;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21315);if ((((iTailZone == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21316)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21317)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21318);return iStandardOffsets[i - 1];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21319);return iTailZone.getStandardOffset(instant);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean isFixed() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21320);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21321);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public long nextTransition(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21322);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21323);long[] transitions = iTransitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21324);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21325);i = ((((i >= 0) )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21326)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21327)==0&false))? (i + 1) : ~i;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21328);if ((((i < transitions.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21329)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21330)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21331);return transitions[i];
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21332);if ((((iTailZone == null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21333)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21334)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21335);return instant;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21336);long end = transitions[transitions.length - 1];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21337);if ((((instant < end)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21338)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21339)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21340);instant = end;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21341);return iTailZone.nextTransition(instant);
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public long previousTransition(long instant) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21342);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21343);long[] transitions = iTransitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21344);int i = Arrays.binarySearch(transitions, instant);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21345);if ((((i >= 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21346)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21347)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21348);if ((((instant > Long.MIN_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21349)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21350)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21351);return instant - 1;
                }
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21352);return instant;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21353);i = ~i;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21354);if ((((i < transitions.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21355)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21356)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21357);if ((((i > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21358)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21359)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21360);long prev = transitions[i - 1];
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21361);if ((((prev > Long.MIN_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21362)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21363)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21364);return prev - 1;
                    }
                }}
                }__CLR4_4_1fqrfqrlgchor8g.R.inc(21365);return instant;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21366);if ((((iTailZone != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21367)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21368)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21369);long prev = iTailZone.previousTransition(instant);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21370);if ((((prev < instant)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21371)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21372)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21373);return prev;
                }
            }}
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21374);long prev = transitions[i - 1];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21375);if ((((prev > Long.MIN_VALUE)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21376)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21377)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21378);return prev - 1;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21379);return instant;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean equals(Object obj) {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21380);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21381);if ((((this == obj)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21382)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21383)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21384);return true;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21385);if ((((obj instanceof PrecalculatedZone)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21386)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21387)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21388);PrecalculatedZone other = (PrecalculatedZone) obj;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21389);return
                        getID().equals(other.getID()) &&
                                Arrays.equals(iTransitions, other.iTransitions) &&
                                Arrays.equals(iNameKeys, other.iNameKeys) &&
                                Arrays.equals(iWallOffsets, other.iWallOffsets) &&
                                Arrays.equals(iStandardOffsets, other.iStandardOffsets) &&
                                (((((iTailZone == null)
                                        )&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21390)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21391)==0&false))? (null == other.iTailZone)
                                        : (iTailZone.equals(other.iTailZone)));
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21392);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public void writeTo(DataOutput out) throws IOException {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21393);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21394);int size = iTransitions.length;

            // Create unique string pool.
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21395);Set<String> poolSet = new HashSet<String>();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21396);for (int i = 0; (((i < size)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21397)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21398)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21399);poolSet.add(iNameKeys[i]);
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21400);int poolSize = poolSet.size();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21401);if ((((poolSize > 65535)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21402)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21403)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21404);throw new UnsupportedOperationException("String pool is too large");
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21405);String[] pool = new String[poolSize];
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21406);Iterator<String> it = poolSet.iterator();
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21407);for (int i = 0; (((it.hasNext())&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21408)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21409)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21410);pool[i] = it.next();
            }

            // Write out the pool.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21411);out.writeShort(poolSize);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21412);for (int i = 0; (((i < poolSize)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21413)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21414)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21415);out.writeUTF(pool[i]);
            }

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21416);out.writeInt(size);

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21417);for (int i = 0; (((i < size)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21418)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21419)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21420);writeMillis(out, iTransitions[i]);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21421);writeMillis(out, iWallOffsets[i]);
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21422);writeMillis(out, iStandardOffsets[i]);

                // Find pool index and write it out.
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21423);String nameKey = iNameKeys[i];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21424);for (int j = 0; (((j < poolSize)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21425)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21426)==0&false)); j++) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21427);if ((((pool[j].equals(nameKey))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21428)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21429)==0&false))) {{
                        __CLR4_4_1fqrfqrlgchor8g.R.inc(21430);if ((((poolSize < 256)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21431)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21432)==0&false))) {{
                            __CLR4_4_1fqrfqrlgchor8g.R.inc(21433);out.writeByte(j);
                        } }else {{
                            __CLR4_4_1fqrfqrlgchor8g.R.inc(21434);out.writeShort(j);
                        }
                        }__CLR4_4_1fqrfqrlgchor8g.R.inc(21435);break;
                    }
                }}
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21436);out.writeBoolean(iTailZone != null);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21437);if ((((iTailZone != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21438)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21439)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21440);iTailZone.writeTo(out);
            }
        }}finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}

        public boolean isCachable() {try{__CLR4_4_1fqrfqrlgchor8g.R.inc(21441);
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21442);if ((((iTailZone != null)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21443)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21444)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21445);return true;
            }
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21446);long[] transitions = iTransitions;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21447);if ((((transitions.length <= 1)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21448)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21449)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21450);return false;
            }

            // Add up all the distances between transitions that are less than
            // about two years.
            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21451);double distances = 0;
            __CLR4_4_1fqrfqrlgchor8g.R.inc(21452);int count = 0;

            __CLR4_4_1fqrfqrlgchor8g.R.inc(21453);for (int i = 1; (((i < transitions.length)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21454)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21455)==0&false)); i++) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21456);long diff = transitions[i] - transitions[i - 1];
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21457);if ((((diff < ((366L + 365) * 24 * 60 * 60 * 1000))&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21458)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21459)==0&false))) {{
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21460);distances += (double) diff;
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21461);count++;
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21462);if ((((count > 0)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21463)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21464)==0&false))) {{
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21465);double avg = distances / count;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21466);avg /= 24 * 60 * 60 * 1000;
                __CLR4_4_1fqrfqrlgchor8g.R.inc(21467);if ((((avg >= 25)&&(__CLR4_4_1fqrfqrlgchor8g.R.iget(21468)!=0|true))||(__CLR4_4_1fqrfqrlgchor8g.R.iget(21469)==0&false))) {{
                    // Only bother caching if average distance between
                    // transitions is at least 25 days. Why 25?
                    // CachedDateTimeZone is more efficient if the distance
                    // between transitions is large. With an average of 25, it
                    // will on average perform about 2 tests per cache
                    // hit. (49.7 / 25) is approximately 2.
                    __CLR4_4_1fqrfqrlgchor8g.R.inc(21470);return true;
                }
            }}

            }__CLR4_4_1fqrfqrlgchor8g.R.inc(21471);return false;
        }finally{__CLR4_4_1fqrfqrlgchor8g.R.flushNeeded();}}
    }
}
