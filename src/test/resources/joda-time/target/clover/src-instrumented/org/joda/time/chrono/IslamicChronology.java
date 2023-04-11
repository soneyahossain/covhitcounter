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

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;

/**
 * Implements the Islamic, or Hijri, calendar system using arithmetic rules.
 * <p>
 * This calendar is a lunar calendar with a shorter year than ISO.
 * Year 1 in the Islamic calendar began on July 16, 622 CE (Julian), thus
 * Islamic years do not begin at the same time as Julian years. This chronology
 * is not proleptic, as it does not allow dates before the first Islamic year.
 * <p>
 * There are two basic forms of the Islamic calendar, the tabular and the
 * observed. The observed form cannot easily be used by computers as it
 * relies on human observation of the new moon.
 * The tabular calendar, implemented here, is an arithmetical approximation
 * of the observed form that follows relatively simple rules.
 * <p>
 * The tabular form of the calendar defines 12 months of alternately
 * 30 and 29 days. The last month is extended to 30 days in a leap year.
 * Leap years occur according to a 30 year cycle. There are four recognised
 * patterns of leap years in the 30 year cycle:
 * <pre>
 * Years 2, 5, 7, 10, 13, 15, 18, 21, 24, 26 & 29 - 15-based, used by Microsoft
 * Years 2, 5, 7, 10, 13, 16, 18, 21, 24, 26 & 29 - 16-based, most commonly used
 * Years 2, 5, 8, 10, 13, 16, 19, 21, 24, 27 & 29 - Indian
 * Years 2, 5, 8, 11, 13, 16, 19, 21, 24, 27 & 30 - Habash al-Hasib
 * </pre>
 * You can select which pattern to use via the factory methods, or use the
 * default (16-based).
 * <p>
 * This implementation defines a day as midnight to midnight exactly as per
 * the ISO chronology. This correct start of day is at sunset on the previous
 * day, however this cannot readily be modelled and has been ignored.
 * <p>
 * IslamicChronology is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @see <a href="https://en.wikipedia.org/wiki/Islamic_calendar">Wikipedia</a>
 * @since 1.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class IslamicChronology extends BasicChronology {public static class __CLR4_4_18tn8tnlgchoqt7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -3663823829888L;

    /**
     * Constant value for 'Anno Hegirae', equivalent
     * to the value returned for AD/CE.
     */
    public static final int AH = DateTimeConstants.CE;

    /**
     * A singleton era field.
     */
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");

    /**
     * Leap year 15-based pattern.
     */
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    /**
     * Leap year 16-based pattern.
     */
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    /**
     * Leap year Indian pattern.
     */
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    /**
     * Leap year Habash al-Hasib pattern.
     */
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);

    /**
     * The lowest year that can be fully supported.
     */
    private static final int MIN_YEAR = -292269337;

    /**
     * The highest year that can be fully supported.
     * Although calculateFirstDayOfYearMillis can go higher without
     * overflowing, the getYear method overflows when it adds the
     * approximate millis at the epoch.
     */
    private static final int MAX_YEAR = 292271022;

    /**
     * The days in a pair of months.
     */
    private static final int MONTH_PAIR_LENGTH = 59;

    /**
     * The length of the long month.
     */
    private static final int LONG_MONTH_LENGTH = 30;

    /**
     * The length of the short month.
     */
    private static final int SHORT_MONTH_LENGTH = 29;

    /**
     * The length of the long month in millis.
     */
    private static final long MILLIS_PER_MONTH_PAIR = 59L * DateTimeConstants.MILLIS_PER_DAY;

    /**
     * The length of the long month in millis.
     */
    private static final long MILLIS_PER_MONTH = (long) (29.53056 * DateTimeConstants.MILLIS_PER_DAY);

    /**
     * The length of the long month in millis.
     */
    private static final long MILLIS_PER_LONG_MONTH = 30L * DateTimeConstants.MILLIS_PER_DAY;

    /**
     * The typical millis per year.
     */
    private static final long MILLIS_PER_YEAR = (long) (354.36667 * DateTimeConstants.MILLIS_PER_DAY);

    /**
     * The typical millis per year.
     */
    private static final long MILLIS_PER_SHORT_YEAR = 354L * DateTimeConstants.MILLIS_PER_DAY;

    /**
     * The typical millis per year.
     */
    private static final long MILLIS_PER_LONG_YEAR = 355L * DateTimeConstants.MILLIS_PER_DAY;

    /**
     * The millis of 0001-01-01.
     */
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    //        -42520809600000L;
//    long start = 0L - 278L * DateTimeConstants.MILLIS_PER_DAY;
//    long cy = 46L * MILLIS_PER_CYCLE;  // 1381-01-01
//    long rem = 5L * MILLIS_PER_SHORT_YEAR +
//            3L * MILLIS_PER_LONG_YEAR;  // 1389-01-01

    /**
     * The length of the cycle of leap years.
     */
    private static final int CYCLE = 30;

    /**
     * The millis of a 30 year cycle.
     */
    private static final long MILLIS_PER_CYCLE = ((19L * 354L + 11L * 355L) * DateTimeConstants.MILLIS_PER_DAY);

    /**
     * Cache of zone to chronology arrays
     */
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> cCache = new ConcurrentHashMap<DateTimeZone, IslamicChronology[]>();

    /**
     * Singleton instance of a UTC IslamicChronology
     */
    private static final IslamicChronology INSTANCE_UTC;

    static {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11435);
        // init after static fields
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11436);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * The leap years to use.
     */
    private final LeapYearPatternType iLeapYears;

    //-----------------------------------------------------------------------

    /**
     * Gets an instance of the IslamicChronology.
     * The time zone of the returned instance is UTC.
     *
     * @return a singleton UTC instance of the chronology
     */
    public static IslamicChronology getInstanceUTC() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11437);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11438);return INSTANCE_UTC;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * Gets an instance of the IslamicChronology in the default time zone.
     *
     * @return a chronology in the default time zone
     */
    public static IslamicChronology getInstance() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11439);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11440);return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * Gets an instance of the IslamicChronology in the given time zone.
     *
     * @param zone the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static IslamicChronology getInstance(DateTimeZone zone) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11441);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11442);return getInstance(zone, LEAP_YEAR_16_BASED);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * Gets an instance of the IslamicChronology in the given time zone.
     *
     * @param zone      the time zone to get the chronology in, null is default
     * @param leapYears the type defining the leap year pattern
     * @return a chronology in the specified time zone
     */
    public static IslamicChronology getInstance(DateTimeZone zone, LeapYearPatternType leapYears) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11443);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11444);if ((((zone == null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11445)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11446)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11447);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11448);IslamicChronology chrono;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11449);IslamicChronology[] chronos = cCache.get(zone);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11450);if ((((chronos == null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11451)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11452)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11453);chronos = new IslamicChronology[4];
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11454);IslamicChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11455);if ((((oldChronos != null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11456)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11457)==0&false))) {{
                __CLR4_4_18tn8tnlgchoqt7.R.inc(11458);chronos = oldChronos;
            }
        }}
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11459);chrono = chronos[leapYears.index];
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11460);if ((((chrono == null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11461)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11462)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11463);synchronized (chronos) {
                __CLR4_4_18tn8tnlgchoqt7.R.inc(11464);chrono = chronos[leapYears.index];
                __CLR4_4_18tn8tnlgchoqt7.R.inc(11465);if ((((chrono == null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11466)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11467)==0&false))) {{
                    __CLR4_4_18tn8tnlgchoqt7.R.inc(11468);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11469)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11470)==0&false))) {{
                        // First create without a lower limit.
                        __CLR4_4_18tn8tnlgchoqt7.R.inc(11471);chrono = new IslamicChronology(null, null, leapYears);
                        // Impose lower limit and make another IslamicChronology.
                        __CLR4_4_18tn8tnlgchoqt7.R.inc(11472);DateTime lowerLimit = new DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
                        __CLR4_4_18tn8tnlgchoqt7.R.inc(11473);chrono = new IslamicChronology(
                                LimitChronology.getInstance(chrono, lowerLimit, null),
                                null, leapYears);
                    } }else {{
                        __CLR4_4_18tn8tnlgchoqt7.R.inc(11474);chrono = getInstance(DateTimeZone.UTC, leapYears);
                        __CLR4_4_18tn8tnlgchoqt7.R.inc(11475);chrono = new IslamicChronology
                                (ZonedChronology.getInstance(chrono, zone), null, leapYears);
                    }
                    }__CLR4_4_18tn8tnlgchoqt7.R.inc(11476);chronos[leapYears.index] = chrono;
                }
            }}
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11477);return chrono;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor.
     */
    IslamicChronology(Chronology base, Object param, LeapYearPatternType leapYears) {
        super(base, param, 4);__CLR4_4_18tn8tnlgchoqt7.R.inc(11479);try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11478);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11480);this.iLeapYears = leapYears;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * Serialization singleton.
     */
    private Object readResolve() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11481);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11482);Chronology base = getBase();
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11483);return (((base == null )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11484)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11485)==0&false))? getInstanceUTC() : getInstance(base.getZone());
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the leap year pattern type.
     *
     * @return the pattern type
     */
    public LeapYearPatternType getLeapYearPatternType() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11486);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11487);return iLeapYears;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11488);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11489);return INSTANCE_UTC;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11490);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11491);if ((((zone == null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11492)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11493)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11494);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11495);if ((((zone == getZone())&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11496)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11497)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11498);return this;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11499);return getInstance(zone);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if this chronology instance equals another.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 2.3
     */
    public boolean equals(Object obj) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11500);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11501);if ((((this == obj)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11502)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11503)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11504);return true;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11505);if ((((obj instanceof IslamicChronology)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11506)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11507)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11508);IslamicChronology chrono = (IslamicChronology) obj;
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11509);return getLeapYearPatternType().index == chrono.getLeapYearPatternType().index &&
                    super.equals(obj);
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11510);return false;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     *
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11511);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11512);return super.hashCode() * 13 + getLeapYearPatternType().hashCode();
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getYear(long instant) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11513);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11514);long millisIslamic = instant - MILLIS_YEAR_1;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11515);long cycles = millisIslamic / MILLIS_PER_CYCLE;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11516);long cycleRemainder = millisIslamic % MILLIS_PER_CYCLE;

        __CLR4_4_18tn8tnlgchoqt7.R.inc(11517);int year = (int) ((cycles * CYCLE) + 1L);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11518);long yearMillis = ((((isLeapYear(year) )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11519)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11520)==0&false))? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11521);while ((((cycleRemainder >= yearMillis)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11522)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11523)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11524);cycleRemainder -= yearMillis;
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11525);yearMillis = ((((isLeapYear(++year) )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11526)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11527)==0&false))? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR);
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11528);return year;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    long setYear(long instant, int year) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11529);
        // optimsed implementation of set, due to fixed months
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11530);int thisYear = getYear(instant);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11531);int dayOfYear = getDayOfYear(instant, thisYear);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11532);int millisOfDay = getMillisOfDay(instant);

        // Current year is leap, and day is leap.
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11533);if ((((dayOfYear > 354 && !isLeapYear(year))&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11534)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11535)==0&false))) {{
            // Moving to a non-leap year, leap day doesn't exist.
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11536);dayOfYear--;
        }

        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11537);instant = getYearMonthDayMillis(year, 1, dayOfYear);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11538);instant += millisOfDay;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11539);return instant;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getYearDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11540);
        // optimsed implementation of getDifference, due to fixed months
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11541);int minuendYear = getYear(minuendInstant);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11542);int subtrahendYear = getYear(subtrahendInstant);

        // Inlined remainder method to avoid duplicate calls to get.
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11543);long minuendRem = minuendInstant - getYearMillis(minuendYear);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11544);long subtrahendRem = subtrahendInstant - getYearMillis(subtrahendYear);

        __CLR4_4_18tn8tnlgchoqt7.R.inc(11545);int difference = minuendYear - subtrahendYear;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11546);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11547)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11548)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11549);difference--;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11550);return difference;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getTotalMillisByYearMonth(int year, int month) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11551);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11552);if ((((--month % 2 == 1)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11553)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11554)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11555);month /= 2;
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11556);return month * MILLIS_PER_MONTH_PAIR + MILLIS_PER_LONG_MONTH;
        } }else {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11557);month /= 2;
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11558);return month * MILLIS_PER_MONTH_PAIR;
        }
    }}finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDayOfMonth(long millis) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11559);
        // optimised for simple months
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11560);int doy = getDayOfYear(millis) - 1;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11561);if ((((doy == 354)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11562)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11563)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11564);return 30;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11565);return (doy % MONTH_PAIR_LENGTH) % LONG_MONTH_LENGTH + 1;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    boolean isLeapYear(int year) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11566);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11567);return iLeapYears.isLeapYear(year);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInYearMax() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11568);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11569);return 355;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInYear(int year) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11570);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11571);return (((isLeapYear(year) )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11572)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11573)==0&false))? 355 : 354;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInYearMonth(int year, int month) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11574);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11575);if ((((month == 12 && isLeapYear(year))&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11576)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11577)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11578);return LONG_MONTH_LENGTH;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11579);return ((((--month % 2 == 0 )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11580)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11581)==0&false))? LONG_MONTH_LENGTH : SHORT_MONTH_LENGTH);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMax() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11582);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11583);return LONG_MONTH_LENGTH;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getDaysInMonthMax(int month) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11584);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11585);if ((((month == 12)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11586)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11587)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11588);return LONG_MONTH_LENGTH;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11589);return ((((--month % 2 == 0 )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11590)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11591)==0&false))? LONG_MONTH_LENGTH : SHORT_MONTH_LENGTH);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMonthOfYear(long millis, int year) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11592);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11593);int doyZeroBased = (int) ((millis - getYearMillis(year)) / DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11594);if ((((doyZeroBased == 354)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11595)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11596)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11597);return 12;
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11598);return ((doyZeroBased * 2) / MONTH_PAIR_LENGTH) + 1;
//        return (int) (doyZeroBased / 29.9f) + 1;
//        
//        int monthPairZeroBased = doyZeroBased / MONTH_PAIR_LENGTH;
//        int monthPairRemainder = doyZeroBased % MONTH_PAIR_LENGTH;
//        return (monthPairZeroBased * 2) + 1 + (monthPairRemainder >= LONG_MONTH_LENGTH ? 1 : 0);
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getAverageMillisPerYear() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11599);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11600);return MILLIS_PER_YEAR;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getAverageMillisPerYearDividedByTwo() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11601);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11602);return MILLIS_PER_YEAR / 2;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getAverageMillisPerMonth() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11603);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11604);return MILLIS_PER_MONTH;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11605);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11606);if ((((year > MAX_YEAR)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11607)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11608)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11609);throw new ArithmeticException("Year is too large: " + year + " > " + MAX_YEAR);
        }
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11610);if ((((year < MIN_YEAR)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11611)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11612)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11613);throw new ArithmeticException("Year is too small: " + year + " < " + MIN_YEAR);
        }

        // Java epoch is 1970-01-01 Gregorian which is 0622-07-16 Islamic.
        // 0001-01-01 Islamic is -42520809600000L
        // would prefer to calculate against year zero, but leap year
        // can be in that year so it doesn't work
        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11614);year--;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11615);long cycle = year / CYCLE;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11616);long millis = MILLIS_YEAR_1 + cycle * MILLIS_PER_CYCLE;
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11617);int cycleRemainder = (year % CYCLE) + 1;

        __CLR4_4_18tn8tnlgchoqt7.R.inc(11618);for (int i = 1; (((i < cycleRemainder)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11619)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11620)==0&false)); i++) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11621);millis += ((((isLeapYear(i) )&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11622)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11623)==0&false))? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR);
        }

        }__CLR4_4_18tn8tnlgchoqt7.R.inc(11624);return millis;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMinYear() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11625);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11626);return 1; //MIN_YEAR;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMaxYear() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11627);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11628);return MAX_YEAR;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11629);
        // Epoch 1970-01-01 ISO = 1389-10-22 Islamic
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11630);return (-MILLIS_YEAR_1) / 2;
    }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    protected void assemble(Fields fields) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11631);
        __CLR4_4_18tn8tnlgchoqt7.R.inc(11632);if ((((getBase() == null)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11633)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11634)==0&false))) {{
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11635);super.assemble(fields);

            __CLR4_4_18tn8tnlgchoqt7.R.inc(11636);fields.era = ERA_FIELD;
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11637);fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 12);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11638);fields.months = fields.monthOfYear.getDurationField();
        }
    }}finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Opaque object describing a leap year pattern for the Islamic Chronology.
     *
     * @since 1.2
     */
    public static class LeapYearPatternType implements Serializable {
        /**
         * Serialization lock
         */
        private static final long serialVersionUID = 26581275372698L;
//        /** Leap year raw data encoded into bits. */
//        private static final int[][] LEAP_YEARS = {
//            {2, 5, 7, 10, 13, 15, 18, 21, 24, 26, 29},  // 623158436
//            {2, 5, 7, 10, 13, 16, 18, 21, 24, 26, 29},  // 623191204
//            {2, 5, 8, 10, 13, 16, 19, 21, 24, 27, 29},  // 690562340
//            {0, 2, 5, 8, 11, 13, 16, 19, 21, 24, 27},   // 153692453
//        };

        /**
         * The index.
         */
        final byte index;
        /**
         * The leap year pattern, a bit-based 1=true pattern.
         */
        final int pattern;

        /**
         * Constructor.
         * This constructor takes a bit pattern where bits 0-29 correspond
         * to years 0-29 in the 30 year Islamic cycle of years. This allows
         * a highly efficient lookup by bit-matching.
         *
         * @param index   the index
         * @param pattern the bit pattern
         */
        LeapYearPatternType(int index, int pattern) {
            super();__CLR4_4_18tn8tnlgchoqt7.R.inc(11640);try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11639);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11641);this.index = (byte) index;
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11642);this.pattern = pattern;
        }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

        /**
         * Is the year a leap year.
         *
         * @param year the year to query
         * @return true if leap
         */
        boolean isLeapYear(int year) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11643);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11644);int key = 1 << (year % 30);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11645);return ((pattern & key) > 0);
        }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

        /**
         * Ensure a singleton is returned if possible.
         *
         * @return the singleton instance
         */
        private Object readResolve() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11646);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_18tn8tnlgchoqt7.R.inc(11647);switch (index) {
                case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_18tn8tnlgchoqt7.R.inc(11648);__CLB4_4_1_bool0=true;}
                    __CLR4_4_18tn8tnlgchoqt7.R.inc(11649);return LEAP_YEAR_15_BASED;
                case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_18tn8tnlgchoqt7.R.inc(11650);__CLB4_4_1_bool0=true;}
                    __CLR4_4_18tn8tnlgchoqt7.R.inc(11651);return LEAP_YEAR_16_BASED;
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_18tn8tnlgchoqt7.R.inc(11652);__CLB4_4_1_bool0=true;}
                    __CLR4_4_18tn8tnlgchoqt7.R.inc(11653);return LEAP_YEAR_INDIAN;
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_18tn8tnlgchoqt7.R.inc(11654);__CLB4_4_1_bool0=true;}
                    __CLR4_4_18tn8tnlgchoqt7.R.inc(11655);return LEAP_YEAR_HABASH_AL_HASIB;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_18tn8tnlgchoqt7.R.inc(11656);__CLB4_4_1_bool0=true;}
                    __CLR4_4_18tn8tnlgchoqt7.R.inc(11657);return this;
            }
        }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11658);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11659);if ((((obj instanceof LeapYearPatternType)&&(__CLR4_4_18tn8tnlgchoqt7.R.iget(11660)!=0|true))||(__CLR4_4_18tn8tnlgchoqt7.R.iget(11661)==0&false))) {{
                __CLR4_4_18tn8tnlgchoqt7.R.inc(11662);return index == ((LeapYearPatternType) obj).index;
            }
            }__CLR4_4_18tn8tnlgchoqt7.R.inc(11663);return false;
        }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_18tn8tnlgchoqt7.R.inc(11664);
            __CLR4_4_18tn8tnlgchoqt7.R.inc(11665);return index;
        }finally{__CLR4_4_18tn8tnlgchoqt7.R.flushNeeded();}}
    }
}
