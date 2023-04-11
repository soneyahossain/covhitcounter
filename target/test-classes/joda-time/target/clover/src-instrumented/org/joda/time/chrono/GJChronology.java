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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Implements the Gregorian/Julian calendar system which is the calendar system
 * used in most of the world. Wherever possible, it is recommended to use the
 * {@link ISOChronology} instead.
 * <p>
 * The Gregorian calendar replaced the Julian calendar, and the point in time
 * when this chronology switches can be controlled using the second parameter
 * of the getInstance method. By default this cutover is set to the date the
 * Gregorian calendar was first instituted, October 15, 1582.
 * <p>
 * Before this date, this chronology uses the proleptic Julian calendar
 * (proleptic means extending indefinitely). The Julian calendar has leap years
 * every four years, whereas the Gregorian has special rules for 100 and 400
 * years. A meaningful result will thus be obtained for all input values.
 * However before 8 CE, Julian leap years were irregular, and before 45 BCE
 * there was no Julian calendar.
 * <p>
 * This chronology differs from
 * {@link java.util.GregorianCalendar GregorianCalendar} in that years
 * in BCE are returned correctly. Thus year 1 BCE is returned as -1 instead of 1.
 * The yearOfEra field produces results compatible with GregorianCalendar.
 * <p>
 * The Julian calendar does not have a year zero, and so year -1 is followed by
 * year 1. If the Gregorian cutover date is specified at or before year -1
 * (Julian), year zero is defined. In other words, the proleptic Gregorian
 * chronology used by this class has a year zero.
 * <p>
 * To create a pure proleptic Julian chronology, use {@link JulianChronology},
 * and to create a pure proleptic Gregorian chronology, use
 * {@link GregorianChronology}.
 * <p>
 * GJChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class GJChronology extends AssembledChronology {public static class __CLR4_4_17zl7zllgchoqro{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,10940,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -2545574827706931671L;

    /**
     * Convert a datetime from one chronology to another.
     */
    private static long convertByYear(long instant, Chronology from, Chronology to) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10353);
        __CLR4_4_17zl7zllgchoqro.R.inc(10354);return to.getDateTimeMillis
                (from.year().get(instant),
                        from.monthOfYear().get(instant),
                        from.dayOfMonth().get(instant),
                        from.millisOfDay().get(instant));
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Convert a datetime from one chronology to another.
     */
    private static long convertByWeekyear(final long instant, Chronology from, Chronology to) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10355);
        __CLR4_4_17zl7zllgchoqro.R.inc(10356);long newInstant;
        __CLR4_4_17zl7zllgchoqro.R.inc(10357);newInstant = to.weekyear().set(0, from.weekyear().get(instant));
        __CLR4_4_17zl7zllgchoqro.R.inc(10358);newInstant = to.weekOfWeekyear().set(newInstant, from.weekOfWeekyear().get(instant));
        __CLR4_4_17zl7zllgchoqro.R.inc(10359);newInstant = to.dayOfWeek().set(newInstant, from.dayOfWeek().get(instant));
        __CLR4_4_17zl7zllgchoqro.R.inc(10360);newInstant = to.millisOfDay().set(newInstant, from.millisOfDay().get(instant));
        __CLR4_4_17zl7zllgchoqro.R.inc(10361);return newInstant;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * The default GregorianJulian cutover point.
     */
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);

    /**
     * Cache of zone to chronology list
     */
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<GJCacheKey, GJChronology>();

    /**
     * Factory method returns instances of the default GJ cutover
     * chronology. This uses a cutover date of October 15, 1582 (Gregorian)
     * 00:00:00 UTC. For this value, October 4, 1582 (Julian) is followed by
     * October 15, 1582 (Gregorian).
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * <p>The time zone of the returned instance is UTC.
     */
    public static GJChronology getInstanceUTC() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10362);
        __CLR4_4_17zl7zllgchoqro.R.inc(10363);return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Factory method returns instances of the default GJ cutover
     * chronology. This uses a cutover date of October 15, 1582 (Gregorian)
     * 00:00:00 UTC. For this value, October 4, 1582 (Julian) is followed by
     * October 15, 1582 (Gregorian).
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * <p>The returned chronology is in the default time zone.
     */
    public static GJChronology getInstance() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10364);
        __CLR4_4_17zl7zllgchoqro.R.inc(10365);return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. This uses
     * a cutover date of October 15, 1582 (Gregorian) 00:00:00 UTC. For this
     * value, October 4, 1582 (Julian) is followed by October 15, 1582
     * (Gregorian).
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * @param zone the time zone to use, null is default
     */
    public static GJChronology getInstance(DateTimeZone zone) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10366);
        __CLR4_4_17zl7zllgchoqro.R.inc(10367);return getInstance(zone, DEFAULT_CUTOVER, 4);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. Any
     * cutover date may be specified.
     *
     * <p>The first day of the week is designated to be
     * {@link org.joda.time.DateTimeConstants#MONDAY Monday},
     * and the minimum days in the first week of the year is 4.
     *
     * @param zone             the time zone to use, null is default
     * @param gregorianCutover the cutover to use, null means default
     */
    public static GJChronology getInstance(
            DateTimeZone zone,
            ReadableInstant gregorianCutover) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10368);

        __CLR4_4_17zl7zllgchoqro.R.inc(10369);return getInstance(zone, gregorianCutover, 4);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. Any
     * cutover date may be specified.
     *
     * @param zone               the time zone to use, null is default
     * @param gregorianCutover   the cutover to use, null means default
     * @param minDaysInFirstWeek minimum number of days in first week of the year; default is 4
     */
    public static GJChronology getInstance(
            DateTimeZone zone,
            ReadableInstant gregorianCutover,
            int minDaysInFirstWeek) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10370);

        __CLR4_4_17zl7zllgchoqro.R.inc(10371);zone = DateTimeUtils.getZone(zone);
        __CLR4_4_17zl7zllgchoqro.R.inc(10372);Instant cutoverInstant;
        __CLR4_4_17zl7zllgchoqro.R.inc(10373);if ((((gregorianCutover == null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10374)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10375)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10376);cutoverInstant = DEFAULT_CUTOVER;
        } }else {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10377);cutoverInstant = gregorianCutover.toInstant();
            __CLR4_4_17zl7zllgchoqro.R.inc(10378);LocalDate cutoverDate = new LocalDate(cutoverInstant.getMillis(), GregorianChronology.getInstance(zone));
            __CLR4_4_17zl7zllgchoqro.R.inc(10379);if ((((cutoverDate.getYear() <= 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10380)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10381)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10382);throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }}

        }__CLR4_4_17zl7zllgchoqro.R.inc(10383);GJCacheKey cacheKey = new GJCacheKey(zone, cutoverInstant, minDaysInFirstWeek);
        __CLR4_4_17zl7zllgchoqro.R.inc(10384);GJChronology chrono = cCache.get(cacheKey);
        __CLR4_4_17zl7zllgchoqro.R.inc(10385);if ((((chrono == null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10386)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10387)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10388);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10389)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10390)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10391);chrono = new GJChronology
                        (JulianChronology.getInstance(zone, minDaysInFirstWeek),
                                GregorianChronology.getInstance(zone, minDaysInFirstWeek),
                                cutoverInstant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10392);chrono = getInstance(DateTimeZone.UTC, cutoverInstant, minDaysInFirstWeek);
                __CLR4_4_17zl7zllgchoqro.R.inc(10393);chrono = new GJChronology
                        (ZonedChronology.getInstance(chrono, zone),
                                chrono.iJulianChronology,
                                chrono.iGregorianChronology,
                                chrono.iCutoverInstant);
            }
            }__CLR4_4_17zl7zllgchoqro.R.inc(10394);GJChronology oldChrono = cCache.putIfAbsent(cacheKey, chrono);
            __CLR4_4_17zl7zllgchoqro.R.inc(10395);if ((((oldChrono != null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10396)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10397)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10398);chrono = oldChrono;
            }
        }}
        }__CLR4_4_17zl7zllgchoqro.R.inc(10399);return chrono;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Factory method returns instances of the GJ cutover chronology. Any
     * cutover date may be specified.
     *
     * @param zone               the time zone to use, null is default
     * @param gregorianCutover   the cutover to use
     * @param minDaysInFirstWeek minimum number of days in first week of the year; default is 4
     */
    public static GJChronology getInstance(
            DateTimeZone zone,
            long gregorianCutover,
            int minDaysInFirstWeek) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10400);

        __CLR4_4_17zl7zllgchoqro.R.inc(10401);Instant cutoverInstant;
        __CLR4_4_17zl7zllgchoqro.R.inc(10402);if ((((gregorianCutover == DEFAULT_CUTOVER.getMillis())&&(__CLR4_4_17zl7zllgchoqro.R.iget(10403)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10404)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10405);cutoverInstant = null;
        } }else {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10406);cutoverInstant = new Instant(gregorianCutover);
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10407);return getInstance(zone, cutoverInstant, minDaysInFirstWeek);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private JulianChronology iJulianChronology;
    private GregorianChronology iGregorianChronology;
    private Instant iCutoverInstant;

    private long iCutoverMillis;
    private long iGapDuration;

    /**
     * @param julian         chronology used before the cutover instant
     * @param gregorian      chronology used at and after the cutover instant
     * @param cutoverInstant instant when the gregorian chronology began
     */
    private GJChronology(JulianChronology julian,
                         GregorianChronology gregorian,
                         Instant cutoverInstant) {
        super(null, new Object[]{julian, gregorian, cutoverInstant});__CLR4_4_17zl7zllgchoqro.R.inc(10409);try{__CLR4_4_17zl7zllgchoqro.R.inc(10408);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Called when applying a time zone.
     */
    private GJChronology(Chronology base,
                         JulianChronology julian,
                         GregorianChronology gregorian,
                         Instant cutoverInstant) {
        super(base, new Object[]{julian, gregorian, cutoverInstant});__CLR4_4_17zl7zllgchoqro.R.inc(10411);try{__CLR4_4_17zl7zllgchoqro.R.inc(10410);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10412);
        __CLR4_4_17zl7zllgchoqro.R.inc(10413);return getInstance(getZone(), iCutoverInstant, getMinimumDaysInFirstWeek());
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10414);
        __CLR4_4_17zl7zllgchoqro.R.inc(10415);Chronology base;
        __CLR4_4_17zl7zllgchoqro.R.inc(10416);if ((base = getBase()) != null) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10419);return base.getZone();
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10420);return DateTimeZone.UTC;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10421);
        __CLR4_4_17zl7zllgchoqro.R.inc(10422);return withZone(DateTimeZone.UTC);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10423);
        __CLR4_4_17zl7zllgchoqro.R.inc(10424);if ((((zone == null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10425)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10426)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10427);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10428);if ((((zone == getZone())&&(__CLR4_4_17zl7zllgchoqro.R.iget(10429)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10430)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10431);return this;
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10432);return getInstance(zone, iCutoverInstant, getMinimumDaysInFirstWeek());
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_17zl7zllgchoqro.R.inc(10433);
        __CLR4_4_17zl7zllgchoqro.R.inc(10434);Chronology base;
        __CLR4_4_17zl7zllgchoqro.R.inc(10435);if ((base = getBase()) != null) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10438);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        }

        // Assume date is Gregorian.
        }__CLR4_4_17zl7zllgchoqro.R.inc(10439);long instant = iGregorianChronology.getDateTimeMillis
                (year, monthOfYear, dayOfMonth, millisOfDay);
        __CLR4_4_17zl7zllgchoqro.R.inc(10440);if ((((instant < iCutoverMillis)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10441)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10442)==0&false))) {{
            // Maybe it's Julian.
            __CLR4_4_17zl7zllgchoqro.R.inc(10443);instant = iJulianChronology.getDateTimeMillis
                    (year, monthOfYear, dayOfMonth, millisOfDay);
            __CLR4_4_17zl7zllgchoqro.R.inc(10444);if ((((instant >= iCutoverMillis)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10445)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10446)==0&false))) {{
                // Okay, it's in the illegal cutover gap.
                __CLR4_4_17zl7zllgchoqro.R.inc(10447);throw new IllegalArgumentException("Specified date does not exist");
            }
        }}
        }__CLR4_4_17zl7zllgchoqro.R.inc(10448);return instant;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_17zl7zllgchoqro.R.inc(10449);
        __CLR4_4_17zl7zllgchoqro.R.inc(10450);Chronology base;
        __CLR4_4_17zl7zllgchoqro.R.inc(10451);if ((base = getBase()) != null) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10454);return base.getDateTimeMillis
                    (year, monthOfYear, dayOfMonth,
                            hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }

        // Assume date is Gregorian.
        }__CLR4_4_17zl7zllgchoqro.R.inc(10455);long instant;
        __CLR4_4_17zl7zllgchoqro.R.inc(10456);try {
            __CLR4_4_17zl7zllgchoqro.R.inc(10457);instant = iGregorianChronology.getDateTimeMillis
                    (year, monthOfYear, dayOfMonth,
                            hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        } catch (IllegalFieldValueException ex) {
            __CLR4_4_17zl7zllgchoqro.R.inc(10458);if ((((monthOfYear != 2 || dayOfMonth != 29)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10459)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10460)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10461);throw ex;
            }
            }__CLR4_4_17zl7zllgchoqro.R.inc(10462);instant = iGregorianChronology.getDateTimeMillis
                    (year, monthOfYear, 28,
                            hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
            __CLR4_4_17zl7zllgchoqro.R.inc(10463);if ((((instant >= iCutoverMillis)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10464)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10465)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10466);throw ex;
            }
        }}
        __CLR4_4_17zl7zllgchoqro.R.inc(10467);if ((((instant < iCutoverMillis)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10468)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10469)==0&false))) {{
            // Maybe it's Julian.
            __CLR4_4_17zl7zllgchoqro.R.inc(10470);instant = iJulianChronology.getDateTimeMillis
                    (year, monthOfYear, dayOfMonth,
                            hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
            __CLR4_4_17zl7zllgchoqro.R.inc(10471);if ((((instant >= iCutoverMillis)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10472)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10473)==0&false))) {{
                // Okay, it's in the illegal cutover gap.
                __CLR4_4_17zl7zllgchoqro.R.inc(10474);throw new IllegalArgumentException("Specified date does not exist");
            }
        }}
        }__CLR4_4_17zl7zllgchoqro.R.inc(10475);return instant;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Gets the cutover instant between Gregorian and Julian chronologies.
     *
     * @return the cutover instant
     */
    public Instant getGregorianCutover() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10476);
        __CLR4_4_17zl7zllgchoqro.R.inc(10477);return iCutoverInstant;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * Gets the minimum days needed for a week to be the first week in a year.
     *
     * @return the minimum days
     */
    public int getMinimumDaysInFirstWeek() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10478);
        __CLR4_4_17zl7zllgchoqro.R.inc(10479);return iGregorianChronology.getMinimumDaysInFirstWeek();
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if this chronology instance equals another.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10480);
        __CLR4_4_17zl7zllgchoqro.R.inc(10481);if ((((this == obj)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10482)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10483)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10484);return true;
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10485);if ((((obj instanceof GJChronology)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10486)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10487)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10488);GJChronology chrono = (GJChronology) obj;
            __CLR4_4_17zl7zllgchoqro.R.inc(10489);return iCutoverMillis == chrono.iCutoverMillis &&
                    getMinimumDaysInFirstWeek() == chrono.getMinimumDaysInFirstWeek() &&
                    getZone().equals(chrono.getZone());
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10490);return false;
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     *
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10491);
        __CLR4_4_17zl7zllgchoqro.R.inc(10492);return "GJ".hashCode() * 11 + getZone().hashCode() +
                getMinimumDaysInFirstWeek() + iCutoverInstant.hashCode();
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------

    /**
     * Gets a debugging toString.
     *
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10493);
        __CLR4_4_17zl7zllgchoqro.R.inc(10494);StringBuffer sb = new StringBuffer(60);
        __CLR4_4_17zl7zllgchoqro.R.inc(10495);sb.append("GJChronology");
        __CLR4_4_17zl7zllgchoqro.R.inc(10496);sb.append('[');
        __CLR4_4_17zl7zllgchoqro.R.inc(10497);sb.append(getZone().getID());

        __CLR4_4_17zl7zllgchoqro.R.inc(10498);if ((((iCutoverMillis != DEFAULT_CUTOVER.getMillis())&&(__CLR4_4_17zl7zllgchoqro.R.iget(10499)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10500)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10501);sb.append(",cutover=");
            __CLR4_4_17zl7zllgchoqro.R.inc(10502);DateTimeFormatter printer;
            __CLR4_4_17zl7zllgchoqro.R.inc(10503);if ((((withUTC().dayOfYear().remainder(iCutoverMillis) == 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10504)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10505)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10506);printer = ISODateTimeFormat.date();
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10507);printer = ISODateTimeFormat.dateTime();
            }
            }__CLR4_4_17zl7zllgchoqro.R.inc(10508);printer.withChronology(withUTC()).printTo(sb, iCutoverMillis);
        }

        }__CLR4_4_17zl7zllgchoqro.R.inc(10509);if ((((getMinimumDaysInFirstWeek() != 4)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10510)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10511)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10512);sb.append(",mdfw=");
            __CLR4_4_17zl7zllgchoqro.R.inc(10513);sb.append(getMinimumDaysInFirstWeek());
        }
        }__CLR4_4_17zl7zllgchoqro.R.inc(10514);sb.append(']');

        __CLR4_4_17zl7zllgchoqro.R.inc(10515);return sb.toString();
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10516);
        __CLR4_4_17zl7zllgchoqro.R.inc(10517);Object[] params = (Object[]) getParam();

        __CLR4_4_17zl7zllgchoqro.R.inc(10518);JulianChronology julian = (JulianChronology) params[0];
        __CLR4_4_17zl7zllgchoqro.R.inc(10519);GregorianChronology gregorian = (GregorianChronology) params[1];
        __CLR4_4_17zl7zllgchoqro.R.inc(10520);Instant cutoverInstant = (Instant) params[2];
        __CLR4_4_17zl7zllgchoqro.R.inc(10521);iCutoverMillis = cutoverInstant.getMillis();

        __CLR4_4_17zl7zllgchoqro.R.inc(10522);iJulianChronology = julian;
        __CLR4_4_17zl7zllgchoqro.R.inc(10523);iGregorianChronology = gregorian;
        __CLR4_4_17zl7zllgchoqro.R.inc(10524);iCutoverInstant = cutoverInstant;

        __CLR4_4_17zl7zllgchoqro.R.inc(10525);if ((((getBase() != null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10526)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10527)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10528);return;
        }

        }__CLR4_4_17zl7zllgchoqro.R.inc(10529);if ((((julian.getMinimumDaysInFirstWeek() != gregorian.getMinimumDaysInFirstWeek())&&(__CLR4_4_17zl7zllgchoqro.R.iget(10530)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10531)==0&false))) {{
            __CLR4_4_17zl7zllgchoqro.R.inc(10532);throw new IllegalArgumentException();
        }

        // Compute difference between the chronologies at the cutover instant
        }__CLR4_4_17zl7zllgchoqro.R.inc(10533);iGapDuration = iCutoverMillis - julianToGregorianByYear(iCutoverMillis);

        // Begin field definitions.

        // First just copy all the Gregorian fields and then override those
        // that need special attention.
        __CLR4_4_17zl7zllgchoqro.R.inc(10534);fields.copyFieldsFrom(gregorian);

        // Assuming cutover is at midnight, all time of day fields can be
        // gregorian since they are unaffected by cutover.

        // Verify assumption.
        __CLR4_4_17zl7zllgchoqro.R.inc(10535);if ((((gregorian.millisOfDay().get(iCutoverMillis) == 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10536)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10537)==0&false))) {{
            // Cutover is sometime in the day, so cutover fields are required
            // for time of day.

            __CLR4_4_17zl7zllgchoqro.R.inc(10538);fields.millisOfSecond = new CutoverField(julian.millisOfSecond(), fields.millisOfSecond, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10539);fields.millisOfDay = new CutoverField(julian.millisOfDay(), fields.millisOfDay, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10540);fields.secondOfMinute = new CutoverField(julian.secondOfMinute(), fields.secondOfMinute, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10541);fields.secondOfDay = new CutoverField(julian.secondOfDay(), fields.secondOfDay, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10542);fields.minuteOfHour = new CutoverField(julian.minuteOfHour(), fields.minuteOfHour, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10543);fields.minuteOfDay = new CutoverField(julian.minuteOfDay(), fields.minuteOfDay, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10544);fields.hourOfDay = new CutoverField(julian.hourOfDay(), fields.hourOfDay, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10545);fields.hourOfHalfday = new CutoverField(julian.hourOfHalfday(), fields.hourOfHalfday, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10546);fields.clockhourOfDay = new CutoverField(julian.clockhourOfDay(), fields.clockhourOfDay, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10547);fields.clockhourOfHalfday = new CutoverField(julian.clockhourOfHalfday(),
                    fields.clockhourOfHalfday, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10548);fields.halfdayOfDay = new CutoverField(julian.halfdayOfDay(), fields.halfdayOfDay, iCutoverMillis);
        }

        // These fields just require basic cutover support.
        }{
            __CLR4_4_17zl7zllgchoqro.R.inc(10549);fields.era = new CutoverField(julian.era(), fields.era, iCutoverMillis);
        }

        // These fields are special because they have imprecise durations. The
        // family of addition methods need special attention. Override affected
        // duration fields as well.
        {
            __CLR4_4_17zl7zllgchoqro.R.inc(10550);fields.year = new ImpreciseCutoverField(
                    julian.year(), fields.year, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10551);fields.years = fields.year.getDurationField();
            __CLR4_4_17zl7zllgchoqro.R.inc(10552);fields.yearOfEra = new ImpreciseCutoverField(
                    julian.yearOfEra(), fields.yearOfEra, fields.years, iCutoverMillis);

            __CLR4_4_17zl7zllgchoqro.R.inc(10553);fields.centuryOfEra = new ImpreciseCutoverField(
                    julian.centuryOfEra(), fields.centuryOfEra, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10554);fields.centuries = fields.centuryOfEra.getDurationField();

            __CLR4_4_17zl7zllgchoqro.R.inc(10555);fields.yearOfCentury = new ImpreciseCutoverField(
                    julian.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, iCutoverMillis);

            __CLR4_4_17zl7zllgchoqro.R.inc(10556);fields.monthOfYear = new ImpreciseCutoverField(
                    julian.monthOfYear(), fields.monthOfYear, null, fields.years, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10557);fields.months = fields.monthOfYear.getDurationField();

            __CLR4_4_17zl7zllgchoqro.R.inc(10558);fields.weekyear = new ImpreciseCutoverField(
                    julian.weekyear(), fields.weekyear, null, iCutoverMillis, true);
            __CLR4_4_17zl7zllgchoqro.R.inc(10559);fields.weekyears = fields.weekyear.getDurationField();
            __CLR4_4_17zl7zllgchoqro.R.inc(10560);fields.weekyearOfCentury = new ImpreciseCutoverField(
                    julian.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, iCutoverMillis);
        }

        // DayOfYear and weekOfWeekyear require special handling since cutover
        // year has fewer days and weeks. Extend the cutover to the start of
        // the next year or weekyear. This keeps the sequence unbroken during
        // the cutover year.

        {
            __CLR4_4_17zl7zllgchoqro.R.inc(10561);long cutover = gregorian.year().roundCeiling(iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10562);fields.dayOfYear = new CutoverField(
                    julian.dayOfYear(), fields.dayOfYear, fields.years, cutover, false);
        }

        {
            __CLR4_4_17zl7zllgchoqro.R.inc(10563);long cutover = gregorian.weekyear().roundCeiling(iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10564);fields.weekOfWeekyear = new CutoverField(
                    julian.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, cutover, true);
        }

        // These fields require basic cutover support, except they must link to
        // imprecise durations.
        {
            __CLR4_4_17zl7zllgchoqro.R.inc(10565);CutoverField cf = new CutoverField
                    (julian.dayOfMonth(), fields.dayOfMonth, iCutoverMillis);
            __CLR4_4_17zl7zllgchoqro.R.inc(10566);cf.iRangeDurationField = fields.months;
            __CLR4_4_17zl7zllgchoqro.R.inc(10567);fields.dayOfMonth = cf;
        }
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    long julianToGregorianByYear(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10568);
        __CLR4_4_17zl7zllgchoqro.R.inc(10569);return convertByYear(instant, iJulianChronology, iGregorianChronology);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    long gregorianToJulianByYear(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10570);
        __CLR4_4_17zl7zllgchoqro.R.inc(10571);return convertByYear(instant, iGregorianChronology, iJulianChronology);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    long julianToGregorianByWeekyear(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10572);
        __CLR4_4_17zl7zllgchoqro.R.inc(10573);return convertByWeekyear(instant, iJulianChronology, iGregorianChronology);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    long gregorianToJulianByWeekyear(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10574);
        __CLR4_4_17zl7zllgchoqro.R.inc(10575);return convertByWeekyear(instant, iGregorianChronology, iJulianChronology);
    }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * This basic cutover field adjusts calls to 'get' and 'set' methods, and
     * assumes that calls to add and addWrapField are unaffected by the cutover.
     */
    private class CutoverField extends BaseDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = 3528501219481026402L;

        final DateTimeField iJulianField;
        final DateTimeField iGregorianField;
        final long iCutover;
        final boolean iConvertByWeekyear;

        protected DurationField iDurationField;
        protected DurationField iRangeDurationField;

        /**
         * @param julianField    field from the chronology used before the cutover instant
         * @param gregorianField field from the chronology used at and after the cutover
         * @param cutoverMillis  the millis of the cutover
         */
        CutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis) {
            this(julianField, gregorianField, cutoverMillis, false);__CLR4_4_17zl7zllgchoqro.R.inc(10577);try{__CLR4_4_17zl7zllgchoqro.R.inc(10576);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        /**
         * @param julianField       field from the chronology used before the cutover instant
         * @param gregorianField    field from the chronology used at and after the cutover
         * @param cutoverMillis     the millis of the cutover
         * @param convertByWeekyear
         */
        CutoverField(DateTimeField julianField, DateTimeField gregorianField,
                     long cutoverMillis, boolean convertByWeekyear) {
            this(julianField, gregorianField, null, cutoverMillis, convertByWeekyear);__CLR4_4_17zl7zllgchoqro.R.inc(10579);try{__CLR4_4_17zl7zllgchoqro.R.inc(10578);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        /**
         * @param julianField       field from the chronology used before the cutover instant
         * @param gregorianField    field from the chronology used at and after the cutover
         * @param rangeField        the range field
         * @param cutoverMillis     the millis of the cutover
         * @param convertByWeekyear
         */
        CutoverField(DateTimeField julianField, DateTimeField gregorianField,
                     DurationField rangeField, long cutoverMillis, boolean convertByWeekyear) {
            super(gregorianField.getType());__CLR4_4_17zl7zllgchoqro.R.inc(10581);try{__CLR4_4_17zl7zllgchoqro.R.inc(10580);
            __CLR4_4_17zl7zllgchoqro.R.inc(10582);iJulianField = julianField;
            __CLR4_4_17zl7zllgchoqro.R.inc(10583);iGregorianField = gregorianField;
            __CLR4_4_17zl7zllgchoqro.R.inc(10584);iCutover = cutoverMillis;
            __CLR4_4_17zl7zllgchoqro.R.inc(10585);iConvertByWeekyear = convertByWeekyear;
            // Although average length of Julian and Gregorian years differ,
            // use the Gregorian duration field because it is more accurate.
            __CLR4_4_17zl7zllgchoqro.R.inc(10586);iDurationField = gregorianField.getDurationField();
            __CLR4_4_17zl7zllgchoqro.R.inc(10587);if ((((rangeField == null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10588)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10589)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10590);rangeField = gregorianField.getRangeDurationField();
                __CLR4_4_17zl7zllgchoqro.R.inc(10591);if ((((rangeField == null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10592)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10593)==0&false))) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10594);rangeField = julianField.getRangeDurationField();
                }
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10595);iRangeDurationField = rangeField;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public boolean isLenient() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10596);
            __CLR4_4_17zl7zllgchoqro.R.inc(10597);return false;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10598);
            __CLR4_4_17zl7zllgchoqro.R.inc(10599);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10600)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10601)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10602);return iGregorianField.get(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10603);return iJulianField.get(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public String getAsText(long instant, Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10604);
            __CLR4_4_17zl7zllgchoqro.R.inc(10605);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10606)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10607)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10608);return iGregorianField.getAsText(instant, locale);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10609);return iJulianField.getAsText(instant, locale);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10610);
            __CLR4_4_17zl7zllgchoqro.R.inc(10611);return iGregorianField.getAsText(fieldValue, locale);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10612);
            __CLR4_4_17zl7zllgchoqro.R.inc(10613);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10614)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10615)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10616);return iGregorianField.getAsShortText(instant, locale);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10617);return iJulianField.getAsShortText(instant, locale);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10618);
            __CLR4_4_17zl7zllgchoqro.R.inc(10619);return iGregorianField.getAsShortText(fieldValue, locale);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10620);
            __CLR4_4_17zl7zllgchoqro.R.inc(10621);return iGregorianField.add(instant, value);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10622);
            __CLR4_4_17zl7zllgchoqro.R.inc(10623);return iGregorianField.add(instant, value);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int[] add(ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10624);
            // overridden as superclass algorithm can't handle
            // 2004-02-29 + 48 months -> 2008-02-29 type dates
            __CLR4_4_17zl7zllgchoqro.R.inc(10625);if ((((valueToAdd == 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10626)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10627)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10628);return values;
            }
            }__CLR4_4_17zl7zllgchoqro.R.inc(10629);if ((((DateTimeUtils.isContiguous(partial))&&(__CLR4_4_17zl7zllgchoqro.R.iget(10630)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10631)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10632);long instant = 0L;
                __CLR4_4_17zl7zllgchoqro.R.inc(10633);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10634)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10635)==0&false)); i++) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10636);instant = partial.getFieldType(i).getField(GJChronology.this).set(instant, values[i]);
                }
                }__CLR4_4_17zl7zllgchoqro.R.inc(10637);instant = add(instant, valueToAdd);
                __CLR4_4_17zl7zllgchoqro.R.inc(10638);return GJChronology.this.get(partial, instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10639);return super.add(partial, fieldIndex, values, valueToAdd);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10640);
            __CLR4_4_17zl7zllgchoqro.R.inc(10641);return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10642);
            __CLR4_4_17zl7zllgchoqro.R.inc(10643);return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long set(long instant, int value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10644);
            __CLR4_4_17zl7zllgchoqro.R.inc(10645);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10646)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10647)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10648);instant = iGregorianField.set(instant, value);
                __CLR4_4_17zl7zllgchoqro.R.inc(10649);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10650)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10651)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10652);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10653)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10654)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10655);instant = gregorianToJulian(instant);
                    }
                    // Verify that new value stuck.
                    }__CLR4_4_17zl7zllgchoqro.R.inc(10656);if ((((get(instant) != value)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10657)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10658)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10659);throw new IllegalFieldValueException
                                (iGregorianField.getType(), Integer.valueOf(value), null, null);
                    }
                }}
            }} }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10660);instant = iJulianField.set(instant, value);
                __CLR4_4_17zl7zllgchoqro.R.inc(10661);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10662)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10663)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10664);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10665)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10666)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10667);instant = julianToGregorian(instant);
                    }
                    // Verify that new value stuck.
                    }__CLR4_4_17zl7zllgchoqro.R.inc(10668);if ((((get(instant) != value)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10669)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10670)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10671);throw new IllegalFieldValueException
                                (iJulianField.getType(), Integer.valueOf(value), null, null);
                    }
                }}
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10672);return instant;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long set(long instant, String text, Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10673);
            __CLR4_4_17zl7zllgchoqro.R.inc(10674);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10675)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10676)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10677);instant = iGregorianField.set(instant, text, locale);
                __CLR4_4_17zl7zllgchoqro.R.inc(10678);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10679)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10680)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10681);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10682)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10683)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10684);instant = gregorianToJulian(instant);
                    }
                    // Cannot verify that new value stuck because set may be lenient.
                }}
            }} }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10685);instant = iJulianField.set(instant, text, locale);
                __CLR4_4_17zl7zllgchoqro.R.inc(10686);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10687)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10688)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10689);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10690)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10691)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10692);instant = julianToGregorian(instant);
                    }
                    // Cannot verify that new value stuck because set may be lenient.
                }}
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10693);return instant;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public DurationField getDurationField() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10694);
            __CLR4_4_17zl7zllgchoqro.R.inc(10695);return iDurationField;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public DurationField getRangeDurationField() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10696);
            __CLR4_4_17zl7zllgchoqro.R.inc(10697);return iRangeDurationField;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public boolean isLeap(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10698);
            __CLR4_4_17zl7zllgchoqro.R.inc(10699);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10700)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10701)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10702);return iGregorianField.isLeap(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10703);return iJulianField.isLeap(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getLeapAmount(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10704);
            __CLR4_4_17zl7zllgchoqro.R.inc(10705);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10706)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10707)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10708);return iGregorianField.getLeapAmount(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10709);return iJulianField.getLeapAmount(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public DurationField getLeapDurationField() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10710);
            __CLR4_4_17zl7zllgchoqro.R.inc(10711);return iGregorianField.getLeapDurationField();
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}


        public int getMinimumValue() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10712);
            // For all precise fields, the Julian and Gregorian limits are
            // identical. Choose Julian to tighten up the year limits.
            __CLR4_4_17zl7zllgchoqro.R.inc(10713);return iJulianField.getMinimumValue();
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial partial) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10714);
            __CLR4_4_17zl7zllgchoqro.R.inc(10715);return iJulianField.getMinimumValue(partial);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10716);
            __CLR4_4_17zl7zllgchoqro.R.inc(10717);return iJulianField.getMinimumValue(partial, values);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMinimumValue(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10718);
            __CLR4_4_17zl7zllgchoqro.R.inc(10719);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10720)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10721)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10722);return iJulianField.getMinimumValue(instant);
            }

            }__CLR4_4_17zl7zllgchoqro.R.inc(10723);int min = iGregorianField.getMinimumValue(instant);

            // Because the cutover may reduce the length of this field, verify
            // the minimum by setting it.
            __CLR4_4_17zl7zllgchoqro.R.inc(10724);instant = iGregorianField.set(instant, min);
            __CLR4_4_17zl7zllgchoqro.R.inc(10725);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10726)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10727)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10728);min = iGregorianField.get(iCutover);
            }

            }__CLR4_4_17zl7zllgchoqro.R.inc(10729);return min;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumValue() {try{__CLR4_4_17zl7zllgchoqro.R.inc(10730);
            // For all precise fields, the Julian and Gregorian limits are
            // identical.
            __CLR4_4_17zl7zllgchoqro.R.inc(10731);return iGregorianField.getMaximumValue();
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10732);
            __CLR4_4_17zl7zllgchoqro.R.inc(10733);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10734)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10735)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10736);return iGregorianField.getMaximumValue(instant);
            }

            }__CLR4_4_17zl7zllgchoqro.R.inc(10737);int max = iJulianField.getMaximumValue(instant);

            // Because the cutover may reduce the length of this field, verify
            // the maximum by setting it.
            __CLR4_4_17zl7zllgchoqro.R.inc(10738);instant = iJulianField.set(instant, max);
            __CLR4_4_17zl7zllgchoqro.R.inc(10739);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10740)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10741)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10742);max = iJulianField.get(iJulianField.add(iCutover, -1));
            }

            }__CLR4_4_17zl7zllgchoqro.R.inc(10743);return max;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial partial) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10744);
            __CLR4_4_17zl7zllgchoqro.R.inc(10745);long instant = GJChronology.getInstanceUTC().set(partial, 0L);
            __CLR4_4_17zl7zllgchoqro.R.inc(10746);return getMaximumValue(instant);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial partial, int[] values) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10747);
            __CLR4_4_17zl7zllgchoqro.R.inc(10748);Chronology chrono = GJChronology.getInstanceUTC();
            __CLR4_4_17zl7zllgchoqro.R.inc(10749);long instant = 0L;
            __CLR4_4_17zl7zllgchoqro.R.inc(10750);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10751)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10752)==0&false)); i++) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10753);DateTimeField field = partial.getFieldType(i).getField(chrono);
                __CLR4_4_17zl7zllgchoqro.R.inc(10754);if ((((values[i] <= field.getMaximumValue(instant))&&(__CLR4_4_17zl7zllgchoqro.R.iget(10755)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10756)==0&false))) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10757);instant = field.set(instant, values[i]);
                }
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10758);return getMaximumValue(instant);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long roundFloor(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10759);
            __CLR4_4_17zl7zllgchoqro.R.inc(10760);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10761)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10762)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10763);instant = iGregorianField.roundFloor(instant);
                __CLR4_4_17zl7zllgchoqro.R.inc(10764);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10765)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10766)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10767);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10768)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10769)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10770);instant = gregorianToJulian(instant);
                    }
                }}
            }} }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10771);instant = iJulianField.roundFloor(instant);
            }
            }__CLR4_4_17zl7zllgchoqro.R.inc(10772);return instant;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long roundCeiling(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10773);
            __CLR4_4_17zl7zllgchoqro.R.inc(10774);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10775)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10776)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10777);instant = iGregorianField.roundCeiling(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10778);instant = iJulianField.roundCeiling(instant);
                __CLR4_4_17zl7zllgchoqro.R.inc(10779);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10780)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10781)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10782);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10783)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10784)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10785);instant = julianToGregorian(instant);
                    }
                }}
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10786);return instant;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10787);
            __CLR4_4_17zl7zllgchoqro.R.inc(10788);return Math.max(iJulianField.getMaximumTextLength(locale),
                    iGregorianField.getMaximumTextLength(locale));
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10789);
            __CLR4_4_17zl7zllgchoqro.R.inc(10790);return Math.max(iJulianField.getMaximumShortTextLength(locale),
                    iGregorianField.getMaximumShortTextLength(locale));
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        protected long julianToGregorian(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10791);
            __CLR4_4_17zl7zllgchoqro.R.inc(10792);if ((((iConvertByWeekyear)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10793)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10794)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10795);return julianToGregorianByWeekyear(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10796);return julianToGregorianByYear(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        protected long gregorianToJulian(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10797);
            __CLR4_4_17zl7zllgchoqro.R.inc(10798);if ((((iConvertByWeekyear)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10799)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10800)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10801);return gregorianToJulianByWeekyear(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10802);return gregorianToJulianByYear(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Cutover field for variable length fields. These fields internally call
     * set whenever add is called. As a result, the same correction applied to
     * set must be applied to add and addWrapField. Knowing when to use this
     * field requires specific knowledge of how the GJ fields are implemented.
     */
    private final class ImpreciseCutoverField extends CutoverField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = 3410248757173576441L;

        /**
         * Creates a duration field that links back to this.
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis) {
            this(julianField, gregorianField, null, cutoverMillis, false);__CLR4_4_17zl7zllgchoqro.R.inc(10804);try{__CLR4_4_17zl7zllgchoqro.R.inc(10803);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        /**
         * Uses a shared duration field rather than creating a new one.
         *
         * @param durationField shared duration field
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField,
                              DurationField durationField, long cutoverMillis) {
            this(julianField, gregorianField, durationField, cutoverMillis, false);__CLR4_4_17zl7zllgchoqro.R.inc(10806);try{__CLR4_4_17zl7zllgchoqro.R.inc(10805);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        /**
         * Uses shared duration fields rather than creating a new one.
         *
         * @param durationField shared duration field
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField,
                              DurationField durationField, DurationField rangeDurationField, long cutoverMillis) {
            this(julianField, gregorianField, durationField, cutoverMillis, false);__CLR4_4_17zl7zllgchoqro.R.inc(10808);try{__CLR4_4_17zl7zllgchoqro.R.inc(10807);
            __CLR4_4_17zl7zllgchoqro.R.inc(10809);iRangeDurationField = rangeDurationField;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        /**
         * Uses a shared duration field rather than creating a new one.
         *
         * @param durationField shared duration field
         */
        ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField,
                              DurationField durationField,
                              long cutoverMillis, boolean convertByWeekyear) {
            super(julianField, gregorianField, cutoverMillis, convertByWeekyear);__CLR4_4_17zl7zllgchoqro.R.inc(10811);try{__CLR4_4_17zl7zllgchoqro.R.inc(10810);
            __CLR4_4_17zl7zllgchoqro.R.inc(10812);if ((((durationField == null)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10813)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10814)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10815);durationField = new LinkedDurationField(iDurationField, this);
            }
            }__CLR4_4_17zl7zllgchoqro.R.inc(10816);iDurationField = durationField;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10817);
            __CLR4_4_17zl7zllgchoqro.R.inc(10818);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10819)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10820)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10821);instant = iGregorianField.add(instant, value);
                __CLR4_4_17zl7zllgchoqro.R.inc(10822);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10823)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10824)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10825);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10826)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10827)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10828);if ((((iConvertByWeekyear)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10829)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10830)==0&false))) {{
                            __CLR4_4_17zl7zllgchoqro.R.inc(10831);int wyear = iGregorianChronology.weekyear().get(instant);
                            __CLR4_4_17zl7zllgchoqro.R.inc(10832);if ((((wyear <= 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10833)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10834)==0&false))) {{
                                __CLR4_4_17zl7zllgchoqro.R.inc(10835);instant = iGregorianChronology.weekyear().add(instant, -1);
                            }
                        }} }else {{
                            __CLR4_4_17zl7zllgchoqro.R.inc(10836);int year = iGregorianChronology.year().get(instant);
                            __CLR4_4_17zl7zllgchoqro.R.inc(10837);if ((((year <= 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10838)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10839)==0&false))) {{
                                __CLR4_4_17zl7zllgchoqro.R.inc(10840);instant = iGregorianChronology.year().add(instant, -1);
                            }
                        }}
                        }__CLR4_4_17zl7zllgchoqro.R.inc(10841);instant = gregorianToJulian(instant);
                    }
                }}
            }} }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10842);instant = iJulianField.add(instant, value);
                __CLR4_4_17zl7zllgchoqro.R.inc(10843);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10844)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10845)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10846);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10847)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10848)==0&false))) {{
                        // no special handling for year zero as cutover always after year zero
                        __CLR4_4_17zl7zllgchoqro.R.inc(10849);instant = julianToGregorian(instant);
                    }
                }}
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10850);return instant;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10851);
            __CLR4_4_17zl7zllgchoqro.R.inc(10852);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10853)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10854)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10855);instant = iGregorianField.add(instant, value);
                __CLR4_4_17zl7zllgchoqro.R.inc(10856);if ((((instant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10857)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10858)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10859);if ((((instant + iGapDuration < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10860)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10861)==0&false))) {{
                        __CLR4_4_17zl7zllgchoqro.R.inc(10862);if ((((iConvertByWeekyear)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10863)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10864)==0&false))) {{
                            __CLR4_4_17zl7zllgchoqro.R.inc(10865);int wyear = iGregorianChronology.weekyear().get(instant);
                            __CLR4_4_17zl7zllgchoqro.R.inc(10866);if ((((wyear <= 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10867)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10868)==0&false))) {{
                                __CLR4_4_17zl7zllgchoqro.R.inc(10869);instant = iGregorianChronology.weekyear().add(instant, -1);
                            }
                        }} }else {{
                            __CLR4_4_17zl7zllgchoqro.R.inc(10870);int year = iGregorianChronology.year().get(instant);
                            __CLR4_4_17zl7zllgchoqro.R.inc(10871);if ((((year <= 0)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10872)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10873)==0&false))) {{
                                __CLR4_4_17zl7zllgchoqro.R.inc(10874);instant = iGregorianChronology.year().add(instant, -1);
                            }
                        }}
                        }__CLR4_4_17zl7zllgchoqro.R.inc(10875);instant = gregorianToJulian(instant);
                    }
                }}
            }} }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10876);instant = iJulianField.add(instant, value);
                __CLR4_4_17zl7zllgchoqro.R.inc(10877);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10878)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10879)==0&false))) {{
                    // Only adjust if gap fully crossed.
                    __CLR4_4_17zl7zllgchoqro.R.inc(10880);if ((((instant - iGapDuration >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10881)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10882)==0&false))) {{
                        // no special handling for year zero as cutover always after year zero
                        __CLR4_4_17zl7zllgchoqro.R.inc(10883);instant = julianToGregorian(instant);
                    }
                }}
            }}
            }__CLR4_4_17zl7zllgchoqro.R.inc(10884);return instant;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10885);
            __CLR4_4_17zl7zllgchoqro.R.inc(10886);if ((((minuendInstant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10887)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10888)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10889);if ((((subtrahendInstant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10890)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10891)==0&false))) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10892);return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Julian, convert minuend to Julian to match.
                }__CLR4_4_17zl7zllgchoqro.R.inc(10893);minuendInstant = gregorianToJulian(minuendInstant);
                __CLR4_4_17zl7zllgchoqro.R.inc(10894);return iJulianField.getDifference(minuendInstant, subtrahendInstant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10895);if ((((subtrahendInstant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10896)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10897)==0&false))) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10898);return iJulianField.getDifference(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Gregorian, convert minuend to Gregorian to match.
                }__CLR4_4_17zl7zllgchoqro.R.inc(10899);minuendInstant = julianToGregorian(minuendInstant);
                __CLR4_4_17zl7zllgchoqro.R.inc(10900);return iGregorianField.getDifference(minuendInstant, subtrahendInstant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10901);
            __CLR4_4_17zl7zllgchoqro.R.inc(10902);if ((((minuendInstant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10903)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10904)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10905);if ((((subtrahendInstant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10906)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10907)==0&false))) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10908);return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Julian, convert minuend to Julian to match.
                }__CLR4_4_17zl7zllgchoqro.R.inc(10909);minuendInstant = gregorianToJulian(minuendInstant);
                __CLR4_4_17zl7zllgchoqro.R.inc(10910);return iJulianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10911);if ((((subtrahendInstant < iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10912)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10913)==0&false))) {{
                    __CLR4_4_17zl7zllgchoqro.R.inc(10914);return iJulianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
                }
                // Remember, the add is being reversed. Since subtrahend is
                // Gregorian, convert minuend to Gregorian to match.
                }__CLR4_4_17zl7zllgchoqro.R.inc(10915);minuendInstant = julianToGregorian(minuendInstant);
                __CLR4_4_17zl7zllgchoqro.R.inc(10916);return iGregorianField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        // Since the imprecise fields have durations longer than the gap
        // duration, keep these methods simple. The inherited implementations
        // produce incorrect results.
        //
        // Degenerate case: If this field is a month, and the cutover is set
        // far into the future, then the gap duration may be so large as to
        // reduce the number of months in a year. If the missing month(s) are
        // at the beginning or end of the year, then the minimum and maximum
        // values are not 1 and 12. I don't expect this case to ever occur.

        public int getMinimumValue(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10917);
            __CLR4_4_17zl7zllgchoqro.R.inc(10918);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10919)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10920)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10921);return iGregorianField.getMinimumValue(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10922);return iJulianField.getMinimumValue(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10923);
            __CLR4_4_17zl7zllgchoqro.R.inc(10924);if ((((instant >= iCutover)&&(__CLR4_4_17zl7zllgchoqro.R.iget(10925)!=0|true))||(__CLR4_4_17zl7zllgchoqro.R.iget(10926)==0&false))) {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10927);return iGregorianField.getMaximumValue(instant);
            } }else {{
                __CLR4_4_17zl7zllgchoqro.R.inc(10928);return iJulianField.getMaximumValue(instant);
            }
        }}finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}
    }

    //-----------------------------------------------------------------------

    /**
     * Links the duration back to a ImpreciseCutoverField.
     */
    private static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;

        private final ImpreciseCutoverField iField;

        LinkedDurationField(DurationField durationField, ImpreciseCutoverField dateTimeField) {
            super(durationField, durationField.getType());__CLR4_4_17zl7zllgchoqro.R.inc(10930);try{__CLR4_4_17zl7zllgchoqro.R.inc(10929);
            __CLR4_4_17zl7zllgchoqro.R.inc(10931);iField = dateTimeField;
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10932);
            __CLR4_4_17zl7zllgchoqro.R.inc(10933);return iField.add(instant, value);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10934);
            __CLR4_4_17zl7zllgchoqro.R.inc(10935);return iField.add(instant, value);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10936);
            __CLR4_4_17zl7zllgchoqro.R.inc(10937);return iField.getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17zl7zllgchoqro.R.inc(10938);
            __CLR4_4_17zl7zllgchoqro.R.inc(10939);return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_17zl7zllgchoqro.R.flushNeeded();}}
    }

}
