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
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.SkipDateTimeField;

/**
 * Implements the Ethiopic calendar system, which defines every fourth year as
 * leap, much like the Julian calendar. The year is broken down into 12 months,
 * each 30 days in length. An extra period at the end of the year is either 5
 * or 6 days in length. In this implementation, it is considered a 13th month.
 * <p>
 * Year 1 in the Ethiopic calendar began on August 29, 8 CE (Julian), thus
 * Ethiopic years do not begin at the same time as Julian years. This chronology
 * is not proleptic, as it does not allow dates before the first Ethiopic year.
 * <p>
 * This implementation defines a day as midnight to midnight exactly as per
 * the ISO chronology. Some references indicate that a coptic day starts at
 * sunset on the previous ISO day, but this has not been confirmed and is not
 * implemented.
 * <p>
 * EthiopicChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @see <a href="https://en.wikipedia.org/wiki/Ethiopian_calendar">Wikipedia</a>
 * @since 1.2
 */
public final class EthiopicChronology extends BasicFixedMonthChronology {public static class __CLR4_4_17vd7vdlgchoqqr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,10297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -5972804258688333942L;

    /**
     * Constant value for 'Ethiopean Era', equivalent
     * to the value returned for AD/CE.
     */
    public static final int EE = DateTimeConstants.CE;

    /**
     * A singleton era field.
     */
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("EE");

    /**
     * The lowest year that can be fully supported.
     */
    private static final int MIN_YEAR = -292269337;

    /**
     * The highest year that can be fully supported.
     */
    private static final int MAX_YEAR = 292272984;

    /**
     * Cache of zone to chronology arrays
     */
    private static final ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> cCache = new ConcurrentHashMap<DateTimeZone, EthiopicChronology[]>();

    /**
     * Singleton instance of a UTC EthiopicChronology
     */
    private static final EthiopicChronology INSTANCE_UTC;

    static {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10201);
        // init after static fields
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10202);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets an instance of the EthiopicChronology.
     * The time zone of the returned instance is UTC.
     *
     * @return a singleton UTC instance of the chronology
     */
    public static EthiopicChronology getInstanceUTC() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10203);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10204);return INSTANCE_UTC;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    /**
     * Gets an instance of the EthiopicChronology in the default time zone.
     *
     * @return a chronology in the default time zone
     */
    public static EthiopicChronology getInstance() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10205);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10206);return getInstance(DateTimeZone.getDefault(), 4);
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    /**
     * Gets an instance of the EthiopicChronology in the given time zone.
     *
     * @param zone the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static EthiopicChronology getInstance(DateTimeZone zone) {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10207);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10208);return getInstance(zone, 4);
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    /**
     * Gets an instance of the EthiopicChronology in the given time zone.
     *
     * @param zone               the time zone to get the chronology in, null is default
     * @param minDaysInFirstWeek minimum number of days in first week of the year; default is 4
     * @return a chronology in the specified time zone
     */
    public static EthiopicChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10209);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10210);if ((((zone == null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10211)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10212)==0&false))) {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10213);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17vd7vdlgchoqqr.R.inc(10214);EthiopicChronology chrono;
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10215);EthiopicChronology[] chronos = cCache.get(zone);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10216);if ((((chronos == null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10217)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10218)==0&false))) {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10219);chronos = new EthiopicChronology[7];
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10220);EthiopicChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10221);if ((((oldChronos != null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10222)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10223)==0&false))) {{
                __CLR4_4_17vd7vdlgchoqqr.R.inc(10224);chronos = oldChronos;
            }
        }}
        }__CLR4_4_17vd7vdlgchoqqr.R.inc(10225);try {
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10226);chrono = chronos[minDaysInFirstWeek - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10227);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
        }

        __CLR4_4_17vd7vdlgchoqqr.R.inc(10228);if ((((chrono == null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10229)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10230)==0&false))) {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10231);synchronized (chronos) {
                __CLR4_4_17vd7vdlgchoqqr.R.inc(10232);chrono = chronos[minDaysInFirstWeek - 1];
                __CLR4_4_17vd7vdlgchoqqr.R.inc(10233);if ((((chrono == null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10234)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10235)==0&false))) {{
                    __CLR4_4_17vd7vdlgchoqqr.R.inc(10236);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10237)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10238)==0&false))) {{
                        // First create without a lower limit.
                        __CLR4_4_17vd7vdlgchoqqr.R.inc(10239);chrono = new EthiopicChronology(null, null, minDaysInFirstWeek);
                        // Impose lower limit and make another EthiopicChronology.
                        __CLR4_4_17vd7vdlgchoqqr.R.inc(10240);DateTime lowerLimit = new DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
                        __CLR4_4_17vd7vdlgchoqqr.R.inc(10241);chrono = new EthiopicChronology
                                (LimitChronology.getInstance(chrono, lowerLimit, null),
                                        null, minDaysInFirstWeek);
                    } }else {{
                        __CLR4_4_17vd7vdlgchoqqr.R.inc(10242);chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                        __CLR4_4_17vd7vdlgchoqqr.R.inc(10243);chrono = new EthiopicChronology
                                (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                    }
                    }__CLR4_4_17vd7vdlgchoqqr.R.inc(10244);chronos[minDaysInFirstWeek - 1] = chrono;
                }
            }}
        }
        }__CLR4_4_17vd7vdlgchoqqr.R.inc(10245);return chrono;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor.
     */
    EthiopicChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_17vd7vdlgchoqqr.R.inc(10247);try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10246);
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    /**
     * Serialization singleton.
     */
    private Object readResolve() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10248);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10249);Chronology base = getBase();
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10250);return (((base == null )&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10251)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10252)==0&false))?
                getInstance(DateTimeZone.UTC, getMinimumDaysInFirstWeek()) :
                getInstance(base.getZone(), getMinimumDaysInFirstWeek());
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10253);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10254);return INSTANCE_UTC;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10255);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10256);if ((((zone == null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10257)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10258)==0&false))) {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10259);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17vd7vdlgchoqqr.R.inc(10260);if ((((zone == getZone())&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10261)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10262)==0&false))) {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10263);return this;
        }
        }__CLR4_4_17vd7vdlgchoqqr.R.inc(10264);return getInstance(zone);
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Override
    boolean isLeapDay(long instant) {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10265);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10266);return dayOfMonth().get(instant) == 6 && monthOfYear().isLeap(instant);
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10267);
        // Java epoch is 1970-01-01 Gregorian which is 1962-04-23 Ethiopic.
        // Calculate relative to the nearest leap year and account for the
        // difference later.

        __CLR4_4_17vd7vdlgchoqqr.R.inc(10268);int relativeYear = year - 1963;
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10269);int leapYears;
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10270);if ((((relativeYear <= 0)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10271)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10272)==0&false))) {{
            // Add 3 before shifting right since /4 and >>2 behave differently
            // on negative numbers.
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10273);leapYears = (relativeYear + 3) >> 2;
        } }else {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10274);leapYears = relativeYear >> 2;
            // For post 1963 an adjustment is needed as jan1st is before leap day
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10275);if ((((!isLeapYear(year))&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10276)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10277)==0&false))) {{
                __CLR4_4_17vd7vdlgchoqqr.R.inc(10278);leapYears++;
            }
        }}

        }__CLR4_4_17vd7vdlgchoqqr.R.inc(10279);long millis = (relativeYear * 365L + leapYears)
                * (long) DateTimeConstants.MILLIS_PER_DAY;

        // Adjust to account for difference between 1963-01-01 and 1962-04-23.

        __CLR4_4_17vd7vdlgchoqqr.R.inc(10280);return millis + (365L - 112) * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMinYear() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10281);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10282);return MIN_YEAR;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMaxYear() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10283);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10284);return MAX_YEAR;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10285);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10286);return (1962L * MILLIS_PER_YEAR + 112L * DateTimeConstants.MILLIS_PER_DAY) / 2;
    }finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    protected void assemble(Fields fields) {try{__CLR4_4_17vd7vdlgchoqqr.R.inc(10287);
        __CLR4_4_17vd7vdlgchoqqr.R.inc(10288);if ((((getBase() == null)&&(__CLR4_4_17vd7vdlgchoqqr.R.iget(10289)!=0|true))||(__CLR4_4_17vd7vdlgchoqqr.R.iget(10290)==0&false))) {{
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10291);super.assemble(fields);

            // Ethiopic, like Julian, has no year zero.
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10292);fields.year = new SkipDateTimeField(this, fields.year);
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10293);fields.weekyear = new SkipDateTimeField(this, fields.weekyear);

            __CLR4_4_17vd7vdlgchoqqr.R.inc(10294);fields.era = ERA_FIELD;
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10295);fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 13);
            __CLR4_4_17vd7vdlgchoqqr.R.inc(10296);fields.months = fields.monthOfYear.getDurationField();
        }
    }}finally{__CLR4_4_17vd7vdlgchoqqr.R.flushNeeded();}}

}
