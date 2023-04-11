/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;

/**
 * DateTimeZone represents a time zone.
 * <p>
 * A time zone is a system of rules to convert time from one geographic
 * location to another. For example, Paris, France is one hour ahead of
 * London, England. Thus when it is 10:00 in London, it is 11:00 in Paris.
 * <p>
 * All time zone rules are expressed, for historical reasons, relative to
 * Greenwich, London. Local time in Greenwich is referred to as Greenwich Mean
 * Time (GMT).  This is similar, but not precisely identical, to Universal
 * Coordinated Time, or UTC. This library only uses the term UTC.
 * <p>
 * Using this system, America/Los_Angeles is expressed as UTC-08:00, or UTC-07:00
 * in the summer. The offset -08:00 indicates that America/Los_Angeles time is
 * obtained from UTC by adding -08:00, that is, by subtracting 8 hours.
 * <p>
 * The offset differs in the summer because of daylight saving time, or DST.
 * The following definitions are helpful:
 * <ul>
 * <li>UTC - The reference time.
 * <li>Offset - The amount of time a zone differs from UTC. This can vary during the year.
 * <li>Daylight Saving - The process of having two offsets each year, one in winter and one in summer.
 * <li>Raw offset - The base offset of the zone.
 * <li>Additional offset - The additional offset on top of the raw offset.
 *   This is typically zero in winter and one hour in summer in zones that apply DST.
 * <li>Actual offset - The actual offset that applies, which is the combination of the raw offset and additional offset.
 * </ul>
 * <p>
 * For example, in 2018 Greece applied daylight saving.
 * Throughout the whole year, the raw offset was +02:00.
 * In winter, the additional offset was zero, while in summer the additional offset was one hour.
 * Thus, the actual offset was +02:00 in winter and +03:00 in summer.
 * <p>
 * Note: Some governments, most notably Ireland, define daylight saving by describing
 * a "standard" time in summer and a <i>negative</i> DST offset in winter.
 * Joda-Time, like the JDK, follows a model for time-zone data where there is a
 * raw offset all year round and a <i>positive</i> additional offset.
 * As such, callers cannot assume that the raw offset is that defined by law for the zone.
 * <p>
 * Note: Some governments define a daylight saving time that applies for two separate periods.
 * For example, the year might be winter time, then summer time, then a special time equal
 * to winter time, then back to summer time before finally dropping back to winter time.
 * As such, callers cannot assume that the raw and DST offsets directly correlate to summer and winter.
 * <p>
 * Unlike the Java TimeZone class, DateTimeZone is immutable. It also only
 * supports long format time zone ids. Thus PST and ECT are not accepted.
 * However, the factory that accepts a TimeZone will attempt to convert from
 * the old short id to a suitable long id.
 * <p>
 * There are four approaches to loading time-zone data, which are tried in this order:
 * <ol>
 * <li>load the specific {@link Provider} specified by the system property
 *   {@code org.joda.time.DateTimeZone.Provider}.
 * <li>load {@link ZoneInfoProvider} using the data in the filing system folder
 *   pointed to by system property {@code org.joda.time.DateTimeZone.Folder}.
 * <li>load {@link ZoneInfoProvider} using the data in the classpath location
 *   {@code org/joda/time/tz/data}.
 * <li>load {@link UTCProvider}
 * </ol>
 * <p>
 * Unless you override the standard behaviour, the default if the third approach.
 * <p>
 * DateTimeZone is thread-safe and immutable, and all subclasses must be as
 * well.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class DateTimeZone implements Serializable {public static class __CLR4_4_1w9w9lgchoq7j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,1737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 5546345482340108586L;

    /**
     * The time zone for Universal Coordinated Time
     */
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    /**
     * Maximum offset.
     */
    private static final int MAX_MILLIS = (86400 * 1000) - 1;

    /**
     * The instance that is providing time zones.
     * This is lazily initialized to reduce risks of race conditions at startup.
     */
    private static final AtomicReference<Provider> cProvider =
            new AtomicReference<Provider>();
    /**
     * The instance that is providing time zone names.
     * This is lazily initialized to reduce risks of race conditions at startup.
     */
    private static final AtomicReference<NameProvider> cNameProvider =
            new AtomicReference<NameProvider>();
    /**
     * The default time zone.
     * This is lazily initialized to reduce risks of race conditions at startup.
     */
    private static final AtomicReference<DateTimeZone> cDefault =
            new AtomicReference<DateTimeZone>();
    /**
     * The default TZ data path
     * This is the default classpath location containing the compiled data files.
     */
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";

    //-----------------------------------------------------------------------

    /**
     * Gets the default time zone.
     * <p>
     * The default time zone is derived from the system property {@code user.timezone}.
     * If that is {@code null} or is not a valid identifier, then the value of the
     * JDK {@code TimeZone} default is converted. If that fails, {@code UTC} is used.
     * <p>
     * NOTE: If the {@code java.util.TimeZone} default is updated <i>after</i> calling this
     * method, then the change will not be picked up here.
     *
     * @return the default datetime zone object
     */
    public static DateTimeZone getDefault() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1161);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1162);DateTimeZone zone = cDefault.get();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1163);if ((((zone == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1164)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1165)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1166);try {
                __CLR4_4_1w9w9lgchoq7j.R.inc(1167);try {
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1168);String id = System.getProperty("user.timezone");
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1169);if ((((id != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1170)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1171)==0&false))) {{  // null check avoids stack overflow
                        __CLR4_4_1w9w9lgchoq7j.R.inc(1172);zone = forID(id);
                    }
                }} catch (RuntimeException ex) {
                    // ignored
                }
                __CLR4_4_1w9w9lgchoq7j.R.inc(1173);if ((((zone == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1174)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1175)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1176);zone = forTimeZone(TimeZone.getDefault());
                }
            }} catch (IllegalArgumentException ex) {
                // ignored
            }
            __CLR4_4_1w9w9lgchoq7j.R.inc(1177);if ((((zone == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1178)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1179)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1180);zone = UTC;
            }
            }__CLR4_4_1w9w9lgchoq7j.R.inc(1181);if ((((!cDefault.compareAndSet(null, zone))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1182)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1183)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1184);zone = cDefault.get();
            }
        }}
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1185);return zone;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Sets the default time zone.
     * <p>
     * NOTE: Calling this method does <i>not</i> set the {@code java.util.TimeZone} default.
     *
     * @param zone the default datetime zone object, must not be null
     * @throws IllegalArgumentException if the zone is null
     * @throws SecurityException        if the application has insufficient security rights
     */
    public static void setDefault(DateTimeZone zone) throws SecurityException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1186);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1187);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1188);if ((((sm != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1189)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1190)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1191);sm.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1192);if ((((zone == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1193)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1194)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1195);throw new IllegalArgumentException("The datetime zone must not be null");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1196);cDefault.set(zone);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a time zone instance for the specified time zone id.
     * <p>
     * The time zone id may be one of those returned by getAvailableIDs.
     * Short ids, as accepted by {@link java.util.TimeZone}, are not accepted.
     * All IDs must be specified in the long format.
     * The exception is UTC, which is an acceptable id.
     * <p>
     * Alternatively a locale independent, fixed offset, datetime zone can
     * be specified. The form <code>[+-]hh:mm</code> can be used.
     *
     * @param id the ID of the datetime zone, null means default
     * @return the DateTimeZone object for the ID
     * @throws IllegalArgumentException if the ID is not recognised
     */
    @FromString
    public static DateTimeZone forID(String id) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1197);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1198);if ((((id == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1199)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1200)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1201);return getDefault();
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1202);if ((((id.equals("UTC"))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1203)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1204)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1205);return DateTimeZone.UTC;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1206);DateTimeZone zone = getProvider().getZone(id);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1207);if ((((zone != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1208)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1209)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1210);return zone;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1211);if ((((id.startsWith("+") || id.startsWith("-"))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1212)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1213)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1214);int offset = parseOffset(id);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1215);if ((((offset == 0L)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1216)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1217)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1218);return DateTimeZone.UTC;
            } }else {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1219);id = printOffset(offset);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1220);return fixedOffsetZone(id, offset);
            }
        }}
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1221);throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets a time zone instance for the specified offset to UTC in hours.
     * This method assumes standard length hours.
     * <p>
     * This factory is a convenient way of constructing zones with a fixed offset.
     *
     * @param hoursOffset the offset in hours from UTC, from -23 to +23
     * @return the DateTimeZone object for the offset
     * @throws IllegalArgumentException if the offset is too large or too small
     */
    public static DateTimeZone forOffsetHours(int hoursOffset) throws IllegalArgumentException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1222);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1223);return forOffsetHoursMinutes(hoursOffset, 0);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets a time zone instance for the specified offset to UTC in hours and minutes.
     * This method assumes 60 minutes in an hour, and standard length minutes.
     * <p>
     * This factory is a convenient way of constructing zones with a fixed offset.
     * The hours value must be in the range -23 to +23.
     * The minutes value must be in the range -59 to +59.
     * The following combinations of sign for the hour and minute are possible:
     * <pre>
     *  Hour    Minute    Example    Result
     *
     *  +ve     +ve       (2, 15)    +02:15
     *  +ve     zero      (2, 0)     +02:00
     *  +ve     -ve       (2, -15)   IllegalArgumentException
     *
     *  zero    +ve       (0, 15)    +00:15
     *  zero    zero      (0, 0)     +00:00
     *  zero    -ve       (0, -15)   -00:15
     *
     *  -ve     +ve       (-2, 15)   -02:15
     *  -ve     zero      (-2, 0)    -02:00
     *  -ve     -ve       (-2, -15)  -02:15
     * </pre>
     * Note that in versions before 2.3, the minutes had to be zero or positive.
     *
     * @param hoursOffset   the offset in hours from UTC, from -23 to +23
     * @param minutesOffset the offset in minutes from UTC, from -59 to +59
     * @return the DateTimeZone object for the offset
     * @throws IllegalArgumentException if any value is out of range, the minutes are negative
     *                                  when the hours are positive, or the resulting offset exceeds +/- 23:59:59.000
     */
    public static DateTimeZone forOffsetHoursMinutes(int hoursOffset, int minutesOffset) throws IllegalArgumentException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1224);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1225);if ((((hoursOffset == 0 && minutesOffset == 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1226)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1227)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1228);return DateTimeZone.UTC;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1229);if ((((hoursOffset < -23 || hoursOffset > 23)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1230)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1231)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1232);throw new IllegalArgumentException("Hours out of range: " + hoursOffset);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1233);if ((((minutesOffset < -59 || minutesOffset > 59)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1234)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1235)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1236);throw new IllegalArgumentException("Minutes out of range: " + minutesOffset);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1237);if ((((hoursOffset > 0 && minutesOffset < 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1238)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1239)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1240);throw new IllegalArgumentException("Positive hours must not have negative minutes: " + minutesOffset);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1241);int offset = 0;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1242);try {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1243);int hoursInMinutes = hoursOffset * 60;
            __CLR4_4_1w9w9lgchoq7j.R.inc(1244);if ((((hoursInMinutes < 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1245)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1246)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1247);minutesOffset = hoursInMinutes - Math.abs(minutesOffset);
            } }else {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1248);minutesOffset = hoursInMinutes + minutesOffset;
            }
            }__CLR4_4_1w9w9lgchoq7j.R.inc(1249);offset = FieldUtils.safeMultiply(minutesOffset, DateTimeConstants.MILLIS_PER_MINUTE);
        } catch (ArithmeticException ex) {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1250);throw new IllegalArgumentException("Offset is too large");
        }
        __CLR4_4_1w9w9lgchoq7j.R.inc(1251);return forOffsetMillis(offset);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets a time zone instance for the specified offset to UTC in milliseconds.
     *
     * @param millisOffset the offset in millis from UTC, from -23:59:59.999 to +23:59:59.999
     * @return the DateTimeZone object for the offset
     */
    public static DateTimeZone forOffsetMillis(int millisOffset) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1252);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1253);if ((((millisOffset < -MAX_MILLIS || millisOffset > MAX_MILLIS)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1254)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1255)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1256);throw new IllegalArgumentException("Millis out of range: " + millisOffset);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1257);String id = printOffset(millisOffset);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1258);return fixedOffsetZone(id, millisOffset);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets a time zone instance for a JDK TimeZone.
     * <p>
     * DateTimeZone only accepts a subset of the IDs from TimeZone. The
     * excluded IDs are the short three letter form (except UTC). This
     * method will attempt to convert between time zones created using the
     * short IDs and the full version.
     * <p>
     * This method is not designed to parse time zones with rules created by
     * applications using <code>SimpleTimeZone</code> directly.
     *
     * @param zone the zone to convert, null means default
     * @return the DateTimeZone object for the zone
     * @throws IllegalArgumentException if the zone is not recognised
     */
    public static DateTimeZone forTimeZone(TimeZone zone) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1259);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1260);if ((((zone == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1261)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1262)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1263);return getDefault();
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1264);final String id = zone.getID();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1265);if ((((id == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1266)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1267)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1268);throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1269);if ((((id.equals("UTC"))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1270)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1271)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1272);return DateTimeZone.UTC;
        }

        // Convert from old alias before consulting provider since they may differ.
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1273);DateTimeZone dtz = null;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1274);String convId = getConvertedId(id);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1275);Provider provider = getProvider();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1276);if ((((convId != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1277)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1278)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1279);dtz = provider.getZone(convId);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1280);if ((((dtz == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1281)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1282)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1283);dtz = provider.getZone(id);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1284);if ((((dtz != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1285)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1286)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1287);return dtz;
        }

        // Support GMT+/-hh:mm formats
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1288);if ((((convId == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1289)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1290)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1291);convId = id;
            __CLR4_4_1w9w9lgchoq7j.R.inc(1292);if ((((convId.startsWith("GMT+") || convId.startsWith("GMT-"))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1293)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1294)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1295);convId = convId.substring(3);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1296);if ((((convId.length() > 2)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1297)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1298)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1299);char firstDigit = convId.charAt(1);
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1300);if ((((firstDigit > '9' && Character.isDigit(firstDigit))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1301)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1302)==0&false))) {{
                        __CLR4_4_1w9w9lgchoq7j.R.inc(1303);convId = convertToAsciiNumber(convId);
                    }
                }}
                }__CLR4_4_1w9w9lgchoq7j.R.inc(1304);int offset = parseOffset(convId);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1305);if ((((offset == 0L)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1306)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1307)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1308);return DateTimeZone.UTC;
                } }else {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1309);convId = printOffset(offset);
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1310);return fixedOffsetZone(convId, offset);
                }
            }}
        }}
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1311);throw new IllegalArgumentException("The datetime zone id '" + id + "' is not recognised");
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    private static String convertToAsciiNumber(String convId) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1312);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1313);StringBuilder buf = new StringBuilder(convId);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1314);for (int i = 0; (((i < buf.length())&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1315)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1316)==0&false)); i++) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1317);char ch = buf.charAt(i);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1318);int digit = Character.digit(ch, 10);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1319);if ((((digit >= 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1320)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1321)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1322);buf.setCharAt(i, (char) ('0' + digit));
            }
        }}
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1323);return buf.toString();
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the zone using a fixed offset amount.
     *
     * @param id     the zone id
     * @param offset the offset in millis
     * @return the zone
     */
    private static DateTimeZone fixedOffsetZone(String id, int offset) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1324);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1325);if ((((offset == 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1326)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1327)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1328);return DateTimeZone.UTC;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1329);return new FixedDateTimeZone(id, null, offset, offset);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets all the available IDs supported.
     *
     * @return an unmodifiable Set of String IDs
     */
    public static Set<String> getAvailableIDs() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1330);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1331);return getProvider().getAvailableIDs();
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the zone provider factory.
     * <p>
     * The zone provider is a pluggable instance factory that supplies the
     * actual instances of DateTimeZone.
     *
     * @return the provider
     */
    public static Provider getProvider() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1332);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1333);Provider provider = cProvider.get();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1334);if ((((provider == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1335)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1336)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1337);provider = getDefaultProvider();
            __CLR4_4_1w9w9lgchoq7j.R.inc(1338);if ((((!cProvider.compareAndSet(null, provider))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1339)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1340)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1341);provider = cProvider.get();
            }
        }}
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1342);return provider;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Sets the zone provider factory.
     * <p>
     * The zone provider is a pluggable instance factory that supplies the
     * actual instances of DateTimeZone.
     *
     * @param provider provider to use, or null for default
     * @throws SecurityException        if you do not have the permission DateTimeZone.setProvider
     * @throws IllegalArgumentException if the provider is invalid
     */
    public static void setProvider(Provider provider) throws SecurityException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1343);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1344);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1345);if ((((sm != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1346)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1347)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1348);sm.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1349);if ((((provider == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1350)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1351)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1352);provider = getDefaultProvider();
        } }else {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1353);validateProvider(provider);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1354);cProvider.set(provider);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Sets the zone provider factory without performing the security check.
     *
     * @param provider provider to use, or null for default
     * @return the provider
     * @throws IllegalArgumentException if the provider is invalid
     */
    private static Provider validateProvider(Provider provider) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1355);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1356);Set<String> ids = provider.getAvailableIDs();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1357);if ((((ids == null || ids.size() == 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1358)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1359)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1360);throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1361);if ((((!ids.contains("UTC"))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1362)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1363)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1364);throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1365);if ((((!UTC.equals(provider.getZone("UTC")))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1366)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1367)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1368);throw new IllegalArgumentException("Invalid UTC zone provided");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1369);return provider;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the default zone provider.
     * <p>
     * This tries four approaches to loading data:
     * <ol>
     * <li>loads the provider identifier by the system property
     *   <code>org.joda.time.DateTimeZone.Provider</code>.
     * <li>load <code>ZoneInfoProvider</code> using the data in the filing system folder
     *   pointed to by system property <code>org.joda.time.DateTimeZone.Folder</code>.
     * <li>loads <code>ZoneInfoProvider</code> using the data in the classpath location
     *   <code>org/joda/time/tz/data</code>.
     * <li>loads <code>UTCProvider</code>.
     * </ol>
     * <p>
     * Unless you override the standard behaviour, the default if the third approach.
     *
     * @return the default name provider
     */
    private static Provider getDefaultProvider() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1370);
        // approach 1
        __CLR4_4_1w9w9lgchoq7j.R.inc(1371);try {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1372);String providerClass = System.getProperty("org.joda.time.DateTimeZone.Provider");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1373);if ((((providerClass != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1374)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1375)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1376);try {
                    // do not initialize the class until the type has been checked
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1377);Class<?> cls = Class.forName(providerClass, false, DateTimeZone.class.getClassLoader());
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1378);if ((((!Provider.class.isAssignableFrom(cls))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1379)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1380)==0&false))) {{
                        __CLR4_4_1w9w9lgchoq7j.R.inc(1381);throw new IllegalArgumentException("System property referred to class that does not implement " + Provider.class);
                    }
                    }__CLR4_4_1w9w9lgchoq7j.R.inc(1382);Provider provider = cls.asSubclass(Provider.class).getConstructor().newInstance();
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1383);return validateProvider(provider);
                } catch (Exception ex) {
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1384);throw new RuntimeException(ex);
                }
            }
        }} catch (SecurityException ex) {
            // ignored
        }
        // approach 2
        __CLR4_4_1w9w9lgchoq7j.R.inc(1385);try {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1386);String dataFolder = System.getProperty("org.joda.time.DateTimeZone.Folder");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1387);if ((((dataFolder != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1388)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1389)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1390);try {
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1391);Provider provider = new ZoneInfoProvider(new File(dataFolder));
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1392);return validateProvider(provider);
                } catch (Exception ex) {
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1393);throw new RuntimeException(ex);
                }
            }
        }} catch (SecurityException ex) {
            // ignored
        }
        // approach 3
        __CLR4_4_1w9w9lgchoq7j.R.inc(1394);try {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1395);Provider provider = new ZoneInfoProvider(DEFAULT_TZ_DATA_PATH);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1396);return validateProvider(provider);
        } catch (Exception ex) {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1397);ex.printStackTrace();
        }
        // approach 4
        __CLR4_4_1w9w9lgchoq7j.R.inc(1398);return new UTCProvider();
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the name provider factory.
     * <p>
     * The name provider is a pluggable instance factory that supplies the
     * names of each DateTimeZone.
     *
     * @return the provider
     */
    public static NameProvider getNameProvider() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1399);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1400);NameProvider nameProvider = cNameProvider.get();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1401);if ((((nameProvider == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1402)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1403)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1404);nameProvider = getDefaultNameProvider();
            __CLR4_4_1w9w9lgchoq7j.R.inc(1405);if ((((!cNameProvider.compareAndSet(null, nameProvider))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1406)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1407)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1408);nameProvider = cNameProvider.get();
            }
        }}
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1409);return nameProvider;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Sets the name provider factory.
     * <p>
     * The name provider is a pluggable instance factory that supplies the
     * names of each DateTimeZone.
     *
     * @param nameProvider provider to use, or null for default
     * @throws SecurityException        if you do not have the permission DateTimeZone.setNameProvider
     * @throws IllegalArgumentException if the provider is invalid
     */
    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1410);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1411);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1412);if ((((sm != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1413)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1414)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1415);sm.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1416);if ((((nameProvider == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1417)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1418)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1419);nameProvider = getDefaultNameProvider();
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1420);cNameProvider.set(nameProvider);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the default name provider.
     * <p>
     * Tries the system property <code>org.joda.time.DateTimeZone.NameProvider</code>.
     * Then uses <code>DefaultNameProvider</code>.
     *
     * @return the default name provider
     */
    private static NameProvider getDefaultNameProvider() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1421);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1422);NameProvider nameProvider = null;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1423);try {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1424);String providerClass = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1425);if ((((providerClass != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1426)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1427)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1428);try {
                    // do not initialize the class until the type has been checked
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1429);Class<?> cls = Class.forName(providerClass, false, DateTimeZone.class.getClassLoader());
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1430);if ((((!NameProvider.class.isAssignableFrom(cls))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1431)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1432)==0&false))) {{
                        __CLR4_4_1w9w9lgchoq7j.R.inc(1433);throw new IllegalArgumentException("System property referred to class that does not implement " + NameProvider.class);
                    }
                    }__CLR4_4_1w9w9lgchoq7j.R.inc(1434);nameProvider = cls.asSubclass(NameProvider.class).getConstructor().newInstance();
                } catch (Exception ex) {
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1435);throw new RuntimeException(ex);
                }
            }
        }} catch (SecurityException ex) {
            // ignore
        }

        __CLR4_4_1w9w9lgchoq7j.R.inc(1436);if ((((nameProvider == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1437)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1438)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1439);nameProvider = new DefaultNameProvider();
        }

        }__CLR4_4_1w9w9lgchoq7j.R.inc(1440);return nameProvider;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts an old style id to a new style id.
     *
     * @param id the old style id
     * @return the new style id, null if not found
     */
    private static String getConvertedId(String id) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1441);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1442);return LazyInit.CONVERSION_MAP.get(id);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Parses an offset from the string.
     *
     * @param str the string
     * @return the offset millis
     */
    private static int parseOffset(String str) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1443);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1444);return -(int) LazyInit.OFFSET_FORMATTER.parseMillis(str);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Formats a timezone offset string.
     * <p>
     * This method is kept separate from the formatting classes to speed and
     * simplify startup and classloading.
     *
     * @param offset the offset in milliseconds
     * @return the time zone string
     */
    private static String printOffset(int offset) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1445);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1446);StringBuffer buf = new StringBuffer();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1447);if ((((offset >= 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1448)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1449)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1450);buf.append('+');
        } }else {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1451);buf.append('-');
            __CLR4_4_1w9w9lgchoq7j.R.inc(1452);offset = -offset;
        }

        }__CLR4_4_1w9w9lgchoq7j.R.inc(1453);int hours = offset / DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1454);FormatUtils.appendPaddedInteger(buf, hours, 2);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1455);offset -= hours * (int) DateTimeConstants.MILLIS_PER_HOUR;

        __CLR4_4_1w9w9lgchoq7j.R.inc(1456);int minutes = offset / DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1457);buf.append(':');
        __CLR4_4_1w9w9lgchoq7j.R.inc(1458);FormatUtils.appendPaddedInteger(buf, minutes, 2);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1459);offset -= minutes * DateTimeConstants.MILLIS_PER_MINUTE;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1460);if ((((offset == 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1461)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1462)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1463);return buf.toString();
        }

        }__CLR4_4_1w9w9lgchoq7j.R.inc(1464);int seconds = offset / DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1465);buf.append(':');
        __CLR4_4_1w9w9lgchoq7j.R.inc(1466);FormatUtils.appendPaddedInteger(buf, seconds, 2);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1467);offset -= seconds * DateTimeConstants.MILLIS_PER_SECOND;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1468);if ((((offset == 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1469)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1470)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1471);return buf.toString();
        }

        }__CLR4_4_1w9w9lgchoq7j.R.inc(1472);buf.append('.');
        __CLR4_4_1w9w9lgchoq7j.R.inc(1473);FormatUtils.appendPaddedInteger(buf, offset, 3);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1474);return buf.toString();
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    // Instance fields and methods
    //--------------------------------------------------------------------

    private final String iID;

    /**
     * Constructor.
     *
     * @param id the id to use
     * @throws IllegalArgumentException if the id is null
     */
    protected DateTimeZone(String id) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1475);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1476);if ((((id == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1477)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1478)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1479);throw new IllegalArgumentException("Id must not be null");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1480);iID = id;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    // Principal methods
    //--------------------------------------------------------------------

    /**
     * Gets the ID of this datetime zone.
     *
     * @return the ID of this datetime zone
     */
    @ToString
    public final String getID() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1481);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1482);return iID;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Returns a non-localized name that is unique to this time zone. It can be
     * combined with id to form a unique key for fetching localized names.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @return name key or null if id should be used for names
     */
    public abstract String getNameKey(long instant);

    /**
     * Gets the short name of this datetime zone suitable for display using
     * the default locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @return the human-readable short name in the default locale
     */
    public final String getShortName(long instant) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1483);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1484);return getShortName(instant, null);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the short name of this datetime zone suitable for display using
     * the specified locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @param locale  the locale to get the name for
     * @return the human-readable short name in the specified locale
     */
    public String getShortName(long instant, Locale locale) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1485);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1486);if ((((locale == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1487)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1488)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1489);locale = Locale.getDefault();
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1490);String nameKey = getNameKey(instant);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1491);if ((((nameKey == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1492)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1493)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1494);return iID;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1495);String name;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1496);NameProvider np = getNameProvider();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1497);if ((((np instanceof DefaultNameProvider)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1498)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1499)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1500);name = ((DefaultNameProvider) np).getShortName(locale, iID, nameKey, isStandardOffset(instant));
        } }else {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1501);name = np.getShortName(locale, iID, nameKey);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1502);if ((((name != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1503)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1504)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1505);return name;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1506);return printOffset(getOffset(instant));
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the long name of this datetime zone suitable for display using
     * the default locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @return the human-readable long name in the default locale
     */
    public final String getName(long instant) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1507);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1508);return getName(instant, null);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the long name of this datetime zone suitable for display using
     * the specified locale.
     * <p>
     * If the name is not available for the locale, then this method returns a
     * string in the format <code>[+-]hh:mm</code>.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the name for
     * @param locale  the locale to get the name for
     * @return the human-readable long name in the specified locale
     */
    public String getName(long instant, Locale locale) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1509);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1510);if ((((locale == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1511)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1512)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1513);locale = Locale.getDefault();
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1514);String nameKey = getNameKey(instant);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1515);if ((((nameKey == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1516)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1517)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1518);return iID;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1519);String name;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1520);NameProvider np = getNameProvider();
        __CLR4_4_1w9w9lgchoq7j.R.inc(1521);if ((((np instanceof DefaultNameProvider)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1522)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1523)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1524);name = ((DefaultNameProvider) np).getName(locale, iID, nameKey, isStandardOffset(instant));
        } }else {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1525);name = np.getName(locale, iID, nameKey);
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1526);if ((((name != null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1527)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1528)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1529);return name;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1530);return printOffset(getOffset(instant));
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the millisecond offset to add to UTC to get local time.
     * <p>
     * This returns the actual offset from UTC for the zone at the specified instant.
     * If the method is called with a different instant, the offset returned may be different
     * as a result of daylight saving or other government rule changes.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the offset for
     * @return the millisecond offset to add to UTC to get local time
     */
    public abstract int getOffset(long instant);

    /**
     * Gets the millisecond offset to add to UTC to get local time.
     * <p>
     * This returns the actual offset from UTC for the zone at the specified instant.
     * If the method is called with a different instant, the offset returned may be different
     * as a result of daylight saving or other government rule changes.
     *
     * @param instant instant to get the offset for, null means now
     * @return the millisecond offset to add to UTC to get local time
     */
    public final int getOffset(ReadableInstant instant) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1531);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1532);if ((((instant == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1533)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1534)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1535);return getOffset(DateTimeUtils.currentTimeMillis());
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1536);return getOffset(instant.getMillis());
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the raw millisecond offset to add to UTC.
     * <p>
     * This should be treated as an implementation detail.
     * End-users should use {@link #getOffset(long)}.
     * <p>
     * This returns the raw offset from UTC for the zone at the specified instant, effectively ignoring DST.
     * If the method is called with a different instant, the offset returned may be different
     * as a result of government rule changes.
     * <p>
     * This method should be named {@code getRawOffset()} but cannot be renamed for compatibility reasons.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the offset for
     * @return the millisecond offset to add to UTC to get local time
     */
    public abstract int getStandardOffset(long instant);

    /**
     * Checks whether, at a particular instant, the offset is raw or not.
     * <p>
     * This method can be used to estimate whether Summer Time (DST) applies at the specified instant.
     * As a general rule, if the actual offset equals the raw offset at the specified instant
     * then either winter time applies or the zone does not have DST rules.
     * If the actual offset does not equal the raw offset, then some form of Summer Time applies.
     * <p>
     * The implementation of the method is simply whether {@link #getOffset(long)}
     * equals {@link #getStandardOffset(long)} at the specified instant.
     * <p>
     * This method should be named {@code isRawOffsetInUse()} but cannot be renamed for compatibility reasons.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z to get the offset for
     * @return true if the offset at the given instant is the same as the raw offset
     * @since 1.5
     */
    public boolean isStandardOffset(long instant) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1537);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1538);return getOffset(instant) == getStandardOffset(instant);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the millisecond offset to subtract from local time to get UTC time.
     * This offset can be used to undo adding the offset obtained by getOffset.
     *
     * <pre>
     * millisLocal == millisUTC   + getOffset(millisUTC)
     * millisUTC   == millisLocal - getOffsetFromLocal(millisLocal)
     * </pre>
     * <p>
     * NOTE: After calculating millisLocal, some error may be introduced. At
     * offset transitions (due to DST or other historical changes), ranges of
     * local times may map to different UTC times.
     * <p>
     * For overlaps (where the local time is ambiguous), this method returns the
     * offset applicable before the gap. The effect of this is that any instant
     * calculated using the offset from an overlap will be in "summer" time.
     * <p>
     * For gaps, this method returns the offset applicable before the gap, ie "winter" offset.
     * However, the effect of this is that any instant calculated using the offset
     * from a gap will be after the gap, in "summer" time.
     * <p>
     * For example, consider a zone with a gap from 01:00 to 01:59:<br />
     * Input: 00:00 (before gap) Output: Offset applicable before gap  DateTime: 00:00<br />
     * Input: 00:30 (before gap) Output: Offset applicable before gap  DateTime: 00:30<br />
     * Input: 01:00 (in gap)     Output: Offset applicable before gap  DateTime: 02:00<br />
     * Input: 01:30 (in gap)     Output: Offset applicable before gap  DateTime: 02:30<br />
     * Input: 02:00 (after gap)  Output: Offset applicable after gap   DateTime: 02:00<br />
     * Input: 02:30 (after gap)  Output: Offset applicable after gap   DateTime: 02:30<br />
     * <p>
     * NOTE: Prior to v2.0, the DST overlap behaviour was not defined and varied by hemisphere.
     * Prior to v1.5, the DST gap behaviour was also not defined.
     * In v2.4, the documentation was clarified again.
     *
     * @param instantLocal the millisecond instant, relative to this time zone, to get the offset for
     * @return the millisecond offset to subtract from local time to get UTC time
     */
    public int getOffsetFromLocal(long instantLocal) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1539);
        // get the offset at instantLocal (first estimate)
        __CLR4_4_1w9w9lgchoq7j.R.inc(1540);final int offsetLocal = getOffset(instantLocal);
        // adjust instantLocal using the estimate and recalc the offset
        __CLR4_4_1w9w9lgchoq7j.R.inc(1541);final long instantAdjusted = instantLocal - offsetLocal;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1542);final int offsetAdjusted = getOffset(instantAdjusted);
        // if the offsets differ, we must be near a DST boundary
        __CLR4_4_1w9w9lgchoq7j.R.inc(1543);if ((((offsetLocal != offsetAdjusted)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1544)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1545)==0&false))) {{
            // we need to ensure that time is always after the DST gap
            // this happens naturally for positive offsets, but not for negative
            __CLR4_4_1w9w9lgchoq7j.R.inc(1546);if (((((offsetLocal - offsetAdjusted) < 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1547)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1548)==0&false))) {{
                // if we just return offsetAdjusted then the time is pushed
                // back before the transition, whereas it should be
                // on or after the transition
                __CLR4_4_1w9w9lgchoq7j.R.inc(1549);long nextLocal = nextTransition(instantAdjusted);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1550);if ((((nextLocal == (instantLocal - offsetLocal))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1551)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1552)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1553);nextLocal = Long.MAX_VALUE;
                }
                }__CLR4_4_1w9w9lgchoq7j.R.inc(1554);long nextAdjusted = nextTransition(instantLocal - offsetAdjusted);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1555);if ((((nextAdjusted == (instantLocal - offsetAdjusted))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1556)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1557)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1558);nextAdjusted = Long.MAX_VALUE;
                }
                }__CLR4_4_1w9w9lgchoq7j.R.inc(1559);if ((((nextLocal != nextAdjusted)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1560)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1561)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1562);return offsetLocal;
                }
            }}
        }} }else {__CLR4_4_1w9w9lgchoq7j.R.inc(1563);if ((((offsetLocal >= 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1564)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1565)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1566);long prev = previousTransition(instantAdjusted);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1567);if ((((prev < instantAdjusted)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1568)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1569)==0&false))) {{
                __CLR4_4_1w9w9lgchoq7j.R.inc(1570);int offsetPrev = getOffset(prev);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1571);int diff = offsetPrev - offsetLocal;
                __CLR4_4_1w9w9lgchoq7j.R.inc(1572);if ((((instantAdjusted - prev <= diff)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1573)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1574)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1575);return offsetPrev;
                }
            }}
        }}
        }}__CLR4_4_1w9w9lgchoq7j.R.inc(1576);return offsetAdjusted;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Converts an actual UTC instant to a local instant with the same
     * local time. This conversion is used before performing a calculation
     * so that the calculation can be done using a simple local zone.
     *
     * @param instantUTC the UTC instant to convert to local
     * @return the local instant with the same local time
     * @throws ArithmeticException if the result overflows a long
     * @since 1.5
     */
    public long convertUTCToLocal(long instantUTC) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1577);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1578);int offset = getOffset(instantUTC);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1579);long instantLocal = instantUTC + offset;
        // If there is a sign change, but the two values have the same sign...
        __CLR4_4_1w9w9lgchoq7j.R.inc(1580);if (((((instantUTC ^ instantLocal) < 0 && (instantUTC ^ offset) >= 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1581)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1582)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1583);throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1584);return instantLocal;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Converts a local instant to an actual UTC instant with the same
     * local time attempting to use the same offset as the original.
     * <p>
     * This conversion is used after performing a calculation
     * where the calculation was done using a simple local zone.
     * Whenever possible, the same offset as the original offset will be used.
     * This is most significant during a daylight savings overlap.
     *
     * @param instantLocal       the local instant to convert to UTC
     * @param strict             whether the conversion should reject non-existent local times
     * @param originalInstantUTC the original instant that the calculation is based on
     * @return the UTC instant with the same local time,
     * @throws ArithmeticException      if the result overflows a long
     * @throws IllegalArgumentException if the zone has no equivalent local time
     * @since 2.0
     */
    public long convertLocalToUTC(long instantLocal, boolean strict, long originalInstantUTC) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1585);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1586);int offsetOriginal = getOffset(originalInstantUTC);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1587);long instantUTC = instantLocal - offsetOriginal;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1588);int offsetLocalFromOriginal = getOffset(instantUTC);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1589);if ((((offsetLocalFromOriginal == offsetOriginal)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1590)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1591)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1592);return instantUTC;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1593);return convertLocalToUTC(instantLocal, strict);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Converts a local instant to an actual UTC instant with the same
     * local time. This conversion is used after performing a calculation
     * where the calculation was done using a simple local zone.
     *
     * @param instantLocal the local instant to convert to UTC
     * @param strict       whether the conversion should reject non-existent local times
     * @return the UTC instant with the same local time,
     * @throws ArithmeticException     if the result overflows a long
     * @throws IllegalInstantException if the zone has no equivalent local time
     * @since 1.5
     */
    public long convertLocalToUTC(long instantLocal, boolean strict) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1594);
        // get the offset at instantLocal (first estimate)
        __CLR4_4_1w9w9lgchoq7j.R.inc(1595);int offsetLocal = getOffset(instantLocal);
        // adjust instantLocal using the estimate and recalc the offset
        __CLR4_4_1w9w9lgchoq7j.R.inc(1596);int offset = getOffset(instantLocal - offsetLocal);
        // if the offsets differ, we must be near a DST boundary
        __CLR4_4_1w9w9lgchoq7j.R.inc(1597);if ((((offsetLocal != offset)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1598)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1599)==0&false))) {{
            // if strict then always check if in DST gap
            // otherwise only check if zone in Western hemisphere (as the
            // value of offset is already correct for Eastern hemisphere)
            __CLR4_4_1w9w9lgchoq7j.R.inc(1600);if ((((strict || offsetLocal < 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1601)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1602)==0&false))) {{
                // determine if we are in the DST gap
                __CLR4_4_1w9w9lgchoq7j.R.inc(1603);long nextLocal = nextTransition(instantLocal - offsetLocal);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1604);if ((((nextLocal == (instantLocal - offsetLocal))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1605)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1606)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1607);nextLocal = Long.MAX_VALUE;
                }
                }__CLR4_4_1w9w9lgchoq7j.R.inc(1608);long nextAdjusted = nextTransition(instantLocal - offset);
                __CLR4_4_1w9w9lgchoq7j.R.inc(1609);if ((((nextAdjusted == (instantLocal - offset))&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1610)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1611)==0&false))) {{
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1612);nextAdjusted = Long.MAX_VALUE;
                }
                }__CLR4_4_1w9w9lgchoq7j.R.inc(1613);if ((((nextLocal != nextAdjusted)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1614)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1615)==0&false))) {{
                    // yes we are in the DST gap
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1616);if ((((strict)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1617)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1618)==0&false))) {{
                        // DST gap is not acceptable
                        __CLR4_4_1w9w9lgchoq7j.R.inc(1619);throw new IllegalInstantException(instantLocal, getID());
                    } }else {{
                        // DST gap is acceptable, but for the Western hemisphere
                        // the offset is wrong and will result in local times
                        // before the cutover so use the offsetLocal instead
                        __CLR4_4_1w9w9lgchoq7j.R.inc(1620);offset = offsetLocal;
                    }
                }}
            }}
        }}
        // check for overflow
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1621);long instantUTC = instantLocal - offset;
        // If there is a sign change, but the two values have different signs...
        __CLR4_4_1w9w9lgchoq7j.R.inc(1622);if (((((instantLocal ^ instantUTC) < 0 && (instantLocal ^ offset) < 0)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1623)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1624)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1625);throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1626);return instantUTC;
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the millisecond instant in another zone keeping the same local time.
     * <p>
     * The conversion is performed by converting the specified UTC millis to local
     * millis in this zone, then converting back to UTC millis in the new zone.
     *
     * @param newZone    the new zone, null means default
     * @param oldInstant the UTC millisecond instant to convert
     * @return the UTC millisecond instant with the same local time in the new zone
     */
    public long getMillisKeepLocal(DateTimeZone newZone, long oldInstant) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1627);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1628);if ((((newZone == null)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1629)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1630)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1631);newZone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1632);if ((((newZone == this)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1633)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1634)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1635);return oldInstant;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1636);long instantLocal = convertUTCToLocal(oldInstant);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1637);return newZone.convertLocalToUTC(instantLocal, false, oldInstant);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Checks if the given {@link LocalDateTime} is within a gap.
     * <p>
     * When switching into Daylight Savings Time there is typically a gap where a clock hour is missing.
     * This method identifies whether the local datetime refers to such a gap.
     *
     * @param localDateTime the time to check, not null
     * @return true if the given datetime refers to a gap
     * @since 1.6
     */
    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1638);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1639);if ((((isFixed())&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1640)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1641)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1642);return false;
        }
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1643);try {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1644);localDateTime.toDateTime(this);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1645);return false;
        } catch (IllegalInstantException ex) {
            __CLR4_4_1w9w9lgchoq7j.R.inc(1646);return true;
        }
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Adjusts the offset to be the earlier or later one during an overlap.
     *
     * @param instant        the instant to adjust
     * @param earlierOrLater false for earlier, true for later
     * @return the adjusted instant millis
     */
    public long adjustOffset(long instant, boolean earlierOrLater) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1647);
        // a bit messy, but will work in all non-pathological cases

        // evaluate 3 hours before and after to work out if anything is happening
        __CLR4_4_1w9w9lgchoq7j.R.inc(1648);long instantBefore = instant - 3 * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1649);long instantAfter = instant + 3 * DateTimeConstants.MILLIS_PER_HOUR;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1650);long offsetBefore = getOffset(instantBefore);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1651);long offsetAfter = getOffset(instantAfter);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1652);if ((((offsetBefore <= offsetAfter)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1653)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1654)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1655);return instant;  // not an overlap (less than is a gap, equal is normal case)
        }

        // work out range of instants that have duplicate local times
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1656);long diff = offsetBefore - offsetAfter;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1657);long transition = nextTransition(instantBefore);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1658);long overlapStart = transition - diff;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1659);long overlapEnd = transition + diff;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1660);if ((((instant < overlapStart || instant >= overlapEnd)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1661)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1662)==0&false))) {{
            __CLR4_4_1w9w9lgchoq7j.R.inc(1663);return instant;  // not an overlap
        }

        // calculate result
        }__CLR4_4_1w9w9lgchoq7j.R.inc(1664);long afterStart = instant - overlapStart;
        __CLR4_4_1w9w9lgchoq7j.R.inc(1665);if ((((afterStart >= diff)&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1666)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1667)==0&false))) {{
            // currently in later offset
            __CLR4_4_1w9w9lgchoq7j.R.inc(1668);return (((earlierOrLater )&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1669)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1670)==0&false))? instant : instant - diff;
        } }else {{
            // currently in earlier offset
            __CLR4_4_1w9w9lgchoq7j.R.inc(1671);return (((earlierOrLater )&&(__CLR4_4_1w9w9lgchoq7j.R.iget(1672)!=0|true))||(__CLR4_4_1w9w9lgchoq7j.R.iget(1673)==0&false))? instant + diff : instant;
        }
    }}finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}
//    System.out.println(new DateTime(transitionStart, DateTimeZone.UTC) + " " + new DateTime(transitionStart, this));

    //-----------------------------------------------------------------------

    /**
     * Returns true if this time zone has no transitions.
     *
     * @return true if no transitions
     */
    public abstract boolean isFixed();

    /**
     * Advances the given instant to where the time zone offset or name changes.
     * If the instant returned is exactly the same as passed in, then
     * no changes occur after the given instant.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z
     * @return milliseconds from 1970-01-01T00:00:00Z
     */
    public abstract long nextTransition(long instant);

    /**
     * Retreats the given instant to where the time zone offset or name changes.
     * If the instant returned is exactly the same as passed in, then
     * no changes occur before the given instant.
     *
     * @param instant milliseconds from 1970-01-01T00:00:00Z
     * @return milliseconds from 1970-01-01T00:00:00Z
     */
    public abstract long previousTransition(long instant);

    // Basic methods
    //--------------------------------------------------------------------

    /**
     * Get the datetime zone as a {@link java.util.TimeZone}.
     *
     * @return the closest matching TimeZone object
     */
    public java.util.TimeZone toTimeZone() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1674);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1675);return java.util.TimeZone.getTimeZone(iID);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Compare this datetime zone with another.
     *
     * @param object the object to compare with
     * @return true if equal, based on the ID and all internal rules
     */
    public abstract boolean equals(Object object);

    /**
     * Gets a hash code compatible with equals.
     *
     * @return suitable hashcode
     */
    public int hashCode() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1676);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1677);return 57 + getID().hashCode();
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Gets the datetime zone as a string, which is simply its ID.
     *
     * @return the id of the zone
     */
    public String toString() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1678);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1679);return getID();
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * By default, when DateTimeZones are serialized, only a "stub" object
     * referring to the id is written out. When the stub is read in, it
     * replaces itself with a DateTimeZone object.
     *
     * @return a stub object to go in the stream
     */
    protected Object writeReplace() throws ObjectStreamException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1680);
        __CLR4_4_1w9w9lgchoq7j.R.inc(1681);return new Stub(iID);
    }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

    /**
     * Used to serialize DateTimeZones by id.
     */
    private static final class Stub implements Serializable {
        /**
         * Serialization lock.
         */
        private static final long serialVersionUID = -6471952376487863581L;
        /**
         * The ID of the zone.
         */
        private transient String iID;

        /**
         * Constructor.
         *
         * @param id the id of the zone
         */
        Stub(String id) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1682);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1683);iID = id;
        }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

        private void writeObject(ObjectOutputStream out) throws IOException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1684);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1685);out.writeUTF(iID);
        }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

        private void readObject(ObjectInputStream in) throws IOException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1686);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1687);iID = in.readUTF();
        }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

        private Object readResolve() throws ObjectStreamException {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1688);
            __CLR4_4_1w9w9lgchoq7j.R.inc(1689);return forID(iID);
        }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}
    }

    //-------------------------------------------------------------------------

    /**
     * Lazy initialization to avoid a synchronization lock.
     */
    static final class LazyInit {

        /**
         * Cache of old zone IDs to new zone IDs
         */
        static final Map<String, String> CONVERSION_MAP = buildMap();
        /**
         * Time zone offset formatter.
         */
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1690);
            // Can't use a real chronology if called during class
            // initialization. Offset parser doesn't need it anyhow.
            __CLR4_4_1w9w9lgchoq7j.R.inc(1691);Chronology chrono = new BaseChronology() {
                private static final long serialVersionUID = -3128740902654445468L;

                public DateTimeZone getZone() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1692);
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1693);return null;
                }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

                public Chronology withUTC() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1694);
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1695);return this;
                }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

                public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1696);
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1697);return this;
                }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

                public String toString() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1698);
                    __CLR4_4_1w9w9lgchoq7j.R.inc(1699);return getClass().getName();
                }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}
            };
            __CLR4_4_1w9w9lgchoq7j.R.inc(1700);return new DateTimeFormatterBuilder()
                    .appendTimeZoneOffset(null, true, 2, 4)
                    .toFormatter()
                    .withChronology(chrono);
        }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}

        private static Map<String, String> buildMap() {try{__CLR4_4_1w9w9lgchoq7j.R.inc(1701);
            // Backwards compatibility with TimeZone.
            __CLR4_4_1w9w9lgchoq7j.R.inc(1702);Map<String, String> map = new HashMap<String, String>();
            __CLR4_4_1w9w9lgchoq7j.R.inc(1703);map.put("GMT", "UTC");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1704);map.put("WET", "WET");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1705);map.put("CET", "CET");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1706);map.put("MET", "CET");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1707);map.put("ECT", "CET");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1708);map.put("EET", "EET");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1709);map.put("MIT", "Pacific/Apia");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1710);map.put("HST", "Pacific/Honolulu");  // JDK 1.1 compatible
            __CLR4_4_1w9w9lgchoq7j.R.inc(1711);map.put("AST", "America/Anchorage");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1712);map.put("PST", "America/Los_Angeles");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1713);map.put("MST", "America/Denver");  // JDK 1.1 compatible
            __CLR4_4_1w9w9lgchoq7j.R.inc(1714);map.put("PNT", "America/Phoenix");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1715);map.put("CST", "America/Chicago");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1716);map.put("EST", "America/New_York");  // JDK 1.1 compatible
            __CLR4_4_1w9w9lgchoq7j.R.inc(1717);map.put("IET", "America/Indiana/Indianapolis");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1718);map.put("PRT", "America/Puerto_Rico");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1719);map.put("CNT", "America/St_Johns");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1720);map.put("AGT", "America/Argentina/Buenos_Aires");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1721);map.put("BET", "America/Sao_Paulo");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1722);map.put("ART", "Africa/Cairo");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1723);map.put("CAT", "Africa/Harare");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1724);map.put("EAT", "Africa/Addis_Ababa");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1725);map.put("NET", "Asia/Yerevan");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1726);map.put("PLT", "Asia/Karachi");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1727);map.put("IST", "Asia/Kolkata");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1728);map.put("BST", "Asia/Dhaka");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1729);map.put("VST", "Asia/Ho_Chi_Minh");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1730);map.put("CTT", "Asia/Shanghai");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1731);map.put("JST", "Asia/Tokyo");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1732);map.put("ACT", "Australia/Darwin");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1733);map.put("AET", "Australia/Sydney");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1734);map.put("SST", "Pacific/Guadalcanal");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1735);map.put("NST", "Pacific/Auckland");
            __CLR4_4_1w9w9lgchoq7j.R.inc(1736);return Collections.unmodifiableMap(map);
        }finally{__CLR4_4_1w9w9lgchoq7j.R.flushNeeded();}}
    }

}
