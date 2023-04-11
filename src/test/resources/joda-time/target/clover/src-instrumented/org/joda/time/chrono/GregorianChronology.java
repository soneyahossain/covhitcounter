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

import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;

/**
 * Implements a pure proleptic Gregorian calendar system, which defines every
 * fourth year as leap, unless the year is divisible by 100 and not by 400.
 * This improves upon the Julian calendar leap year rule.
 * <p>
 * Although the Gregorian calendar did not exist before 1582 CE, this
 * chronology assumes it did, thus it is proleptic. This implementation also
 * fixes the start of the year at January 1, and defines the year zero.
 * <p>
 * GregorianChronology is thread-safe and immutable.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @see <a href="https://en.wikipedia.org/wiki/Gregorian_calendar">Wikipedia</a>
 * @see JulianChronology
 * @see GJChronology
 * @since 1.0
 */
public final class GregorianChronology extends BasicGJChronology {public static class __CLR4_4_18nq8nqlgchoqsh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -861407383323710522L;

    private static final long MILLIS_PER_YEAR =
            (long) (365.2425 * DateTimeConstants.MILLIS_PER_DAY);

    private static final long MILLIS_PER_MONTH =
            (long) (365.2425 * DateTimeConstants.MILLIS_PER_DAY / 12);

    private static final int DAYS_0000_TO_1970 = 719527;

    /**
     * The lowest year that can be fully supported.
     */
    private static final int MIN_YEAR = -292275054;

    /**
     * The highest year that can be fully supported.
     */
    private static final int MAX_YEAR = 292278993;

    /**
     * Singleton instance of a UTC GregorianChronology
     */
    private static final GregorianChronology INSTANCE_UTC;

    /**
     * Cache of zone to chronology arrays
     */
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> cCache = new ConcurrentHashMap<DateTimeZone, GregorianChronology[]>();

    static {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11222);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11223);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology.
     * The time zone of the returned instance is UTC.
     *
     * @return a singleton UTC instance of the chronology
     */
    public static GregorianChronology getInstanceUTC() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11224);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11225);return INSTANCE_UTC;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology in the default time zone.
     *
     * @return a chronology in the default time zone
     */
    public static GregorianChronology getInstance() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11226);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11227);return getInstance(DateTimeZone.getDefault(), 4);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology in the given time zone.
     *
     * @param zone the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static GregorianChronology getInstance(DateTimeZone zone) {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11228);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11229);return getInstance(zone, 4);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    /**
     * Gets an instance of the GregorianChronology in the given time zone.
     *
     * @param zone               the time zone to get the chronology in, null is default
     * @param minDaysInFirstWeek minimum number of days in first week of the year; default is 4
     * @return a chronology in the specified time zone
     */
    public static GregorianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11230);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11231);if ((((zone == null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11232)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11233)==0&false))) {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11234);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18nq8nqlgchoqsh.R.inc(11235);GregorianChronology chrono;
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11236);GregorianChronology[] chronos = cCache.get(zone);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11237);if ((((chronos == null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11238)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11239)==0&false))) {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11240);chronos = new GregorianChronology[7];
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11241);GregorianChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11242);if ((((oldChronos != null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11243)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11244)==0&false))) {{
                __CLR4_4_18nq8nqlgchoqsh.R.inc(11245);chronos = oldChronos;
            }
        }}
        }__CLR4_4_18nq8nqlgchoqsh.R.inc(11246);try {
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11247);chrono = chronos[minDaysInFirstWeek - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11248);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
        }
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11249);if ((((chrono == null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11250)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11251)==0&false))) {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11252);synchronized (chronos) {
                __CLR4_4_18nq8nqlgchoqsh.R.inc(11253);chrono = chronos[minDaysInFirstWeek - 1];
                __CLR4_4_18nq8nqlgchoqsh.R.inc(11254);if ((((chrono == null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11255)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11256)==0&false))) {{
                    __CLR4_4_18nq8nqlgchoqsh.R.inc(11257);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11258)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11259)==0&false))) {{
                        __CLR4_4_18nq8nqlgchoqsh.R.inc(11260);chrono = new GregorianChronology(null, null, minDaysInFirstWeek);
                    } }else {{
                        __CLR4_4_18nq8nqlgchoqsh.R.inc(11261);chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                        __CLR4_4_18nq8nqlgchoqsh.R.inc(11262);chrono = new GregorianChronology
                                (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                    }
                    }__CLR4_4_18nq8nqlgchoqsh.R.inc(11263);chronos[minDaysInFirstWeek - 1] = chrono;
                }
            }}
        }
        }__CLR4_4_18nq8nqlgchoqsh.R.inc(11264);return chrono;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor
     */
    private GregorianChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_18nq8nqlgchoqsh.R.inc(11266);try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11265);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11267);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11268);Chronology base = getBase();
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11269);int minDays = getMinimumDaysInFirstWeek();
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11270);minDays = ((((minDays == 0 )&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11271)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11272)==0&false))? 4 : minDays);  // handle rename of BaseGJChronology
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11273);return (((base == null )&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11274)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11275)==0&false))?
                getInstance(DateTimeZone.UTC, minDays) :
                getInstance(base.getZone(), minDays);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11276);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11277);return INSTANCE_UTC;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11278);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11279);if ((((zone == null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11280)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11281)==0&false))) {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11282);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18nq8nqlgchoqsh.R.inc(11283);if ((((zone == getZone())&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11284)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11285)==0&false))) {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11286);return this;
        }
        }__CLR4_4_18nq8nqlgchoqsh.R.inc(11287);return getInstance(zone);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11288);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11289);if ((((getBase() == null)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11290)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11291)==0&false))) {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11292);super.assemble(fields);
        }
    }}finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11293);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11294);return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11295);
        // Initial value is just temporary.
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11296);int leapYears = year / 100;
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11297);if ((((year < 0)&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11298)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11299)==0&false))) {{
            // Add 3 before shifting right since /4 and >>2 behave differently
            // on negative numbers. When the expression is written as
            // (year / 4) - (year / 100) + (year / 400),
            // it works for both positive and negative values, except this optimization
            // eliminates two divisions.
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11300);leapYears = ((year + 3) >> 2) - leapYears + ((leapYears + 3) >> 2) - 1;
        } }else {{
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11301);leapYears = (year >> 2) - leapYears + (leapYears >> 2);
            __CLR4_4_18nq8nqlgchoqsh.R.inc(11302);if ((((isLeapYear(year))&&(__CLR4_4_18nq8nqlgchoqsh.R.iget(11303)!=0|true))||(__CLR4_4_18nq8nqlgchoqsh.R.iget(11304)==0&false))) {{
                __CLR4_4_18nq8nqlgchoqsh.R.inc(11305);leapYears--;
            }
        }}

        }__CLR4_4_18nq8nqlgchoqsh.R.inc(11306);return (year * 365L + (leapYears - DAYS_0000_TO_1970)) * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    int getMinYear() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11307);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11308);return MIN_YEAR;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    int getMaxYear() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11309);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11310);return MAX_YEAR;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    long getAverageMillisPerYear() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11311);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11312);return MILLIS_PER_YEAR;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    long getAverageMillisPerYearDividedByTwo() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11313);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11314);return MILLIS_PER_YEAR / 2;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    long getAverageMillisPerMonth() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11315);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11316);return MILLIS_PER_MONTH;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_18nq8nqlgchoqsh.R.inc(11317);
        __CLR4_4_18nq8nqlgchoqsh.R.inc(11318);return (1970L * MILLIS_PER_YEAR) / 2;
    }finally{__CLR4_4_18nq8nqlgchoqsh.R.flushNeeded();}}

}
