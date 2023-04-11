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
 * Implements the Coptic calendar system, which defines every fourth year as
 * leap, much like the Julian calendar. The year is broken down into 12 months,
 * each 30 days in length. An extra period at the end of the year is either 5
 * or 6 days in length. In this implementation, it is considered a 13th month.
 * <p>
 * Year 1 in the Coptic calendar began on August 29, 284 CE (Julian), thus
 * Coptic years do not begin at the same time as Julian years. This chronology
 * is not proleptic, as it does not allow dates before the first Coptic year.
 * <p>
 * This implementation defines a day as midnight to midnight exactly as per
 * the ISO chronology. Some references indicate that a coptic day starts at
 * sunset on the previous ISO day, but this has not been confirmed and is not
 * implemented.
 * <p>
 * CopticChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see <a href="https://en.wikipedia.org/wiki/Coptic_calendar">Wikipedia</a>
 * @see JulianChronology
 * @since 1.0
 */
public final class CopticChronology extends BasicFixedMonthChronology {public static class __CLR4_4_17sl7sllgchoqqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,10201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -5972804258688333942L;

    /**
     * Constant value for 'Anno Martyrum' or 'Era of the Martyrs', equivalent
     * to the value returned for AD/CE.
     */
    public static final int AM = DateTimeConstants.CE;

    /**
     * A singleton era field.
     */
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AM");

    /**
     * The lowest year that can be fully supported.
     */
    private static final int MIN_YEAR = -292269337;

    /**
     * The highest year that can be fully supported.
     */
    private static final int MAX_YEAR = 292272708;

    /**
     * Cache of zone to chronology arrays
     */
    private static final ConcurrentHashMap<DateTimeZone, CopticChronology[]> cCache = new ConcurrentHashMap<DateTimeZone, CopticChronology[]>();

    /**
     * Singleton instance of a UTC CopticChronology
     */
    private static final CopticChronology INSTANCE_UTC;

    static {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10101);
        // init after static fields
        __CLR4_4_17sl7sllgchoqqh.R.inc(10102);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets an instance of the CopticChronology.
     * The time zone of the returned instance is UTC.
     *
     * @return a singleton UTC instance of the chronology
     */
    public static CopticChronology getInstanceUTC() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10103);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10104);return INSTANCE_UTC;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    /**
     * Gets an instance of the CopticChronology in the default time zone.
     *
     * @return a chronology in the default time zone
     */
    public static CopticChronology getInstance() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10105);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10106);return getInstance(DateTimeZone.getDefault(), 4);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    /**
     * Gets an instance of the CopticChronology in the given time zone.
     *
     * @param zone the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static CopticChronology getInstance(DateTimeZone zone) {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10107);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10108);return getInstance(zone, 4);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    /**
     * Gets an instance of the CopticChronology in the given time zone.
     *
     * @param zone               the time zone to get the chronology in, null is default
     * @param minDaysInFirstWeek minimum number of days in first week of the year; default is 4
     * @return a chronology in the specified time zone
     */
    public static CopticChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10109);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10110);if ((((zone == null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10111)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10112)==0&false))) {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10113);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17sl7sllgchoqqh.R.inc(10114);CopticChronology chrono;
        __CLR4_4_17sl7sllgchoqqh.R.inc(10115);CopticChronology[] chronos = cCache.get(zone);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10116);if ((((chronos == null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10117)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10118)==0&false))) {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10119);chronos = new CopticChronology[7];
            __CLR4_4_17sl7sllgchoqqh.R.inc(10120);CopticChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            __CLR4_4_17sl7sllgchoqqh.R.inc(10121);if ((((oldChronos != null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10122)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10123)==0&false))) {{
                __CLR4_4_17sl7sllgchoqqh.R.inc(10124);chronos = oldChronos;
            }
        }}
        }__CLR4_4_17sl7sllgchoqqh.R.inc(10125);try {
            __CLR4_4_17sl7sllgchoqqh.R.inc(10126);chrono = chronos[minDaysInFirstWeek - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            __CLR4_4_17sl7sllgchoqqh.R.inc(10127);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
        }
        __CLR4_4_17sl7sllgchoqqh.R.inc(10128);if ((((chrono == null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10129)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10130)==0&false))) {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10131);synchronized (chronos) {
                __CLR4_4_17sl7sllgchoqqh.R.inc(10132);chrono = chronos[minDaysInFirstWeek - 1];
                __CLR4_4_17sl7sllgchoqqh.R.inc(10133);if ((((chrono == null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10134)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10135)==0&false))) {{
                    __CLR4_4_17sl7sllgchoqqh.R.inc(10136);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10137)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10138)==0&false))) {{
                        // First create without a lower limit.
                        __CLR4_4_17sl7sllgchoqqh.R.inc(10139);chrono = new CopticChronology(null, null, minDaysInFirstWeek);
                        // Impose lower limit and make another CopticChronology.
                        __CLR4_4_17sl7sllgchoqqh.R.inc(10140);DateTime lowerLimit = new DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
                        __CLR4_4_17sl7sllgchoqqh.R.inc(10141);chrono = new CopticChronology
                                (LimitChronology.getInstance(chrono, lowerLimit, null),
                                        null, minDaysInFirstWeek);
                    } }else {{
                        __CLR4_4_17sl7sllgchoqqh.R.inc(10142);chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                        __CLR4_4_17sl7sllgchoqqh.R.inc(10143);chrono = new CopticChronology
                                (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                    }
                    }__CLR4_4_17sl7sllgchoqqh.R.inc(10144);chronos[minDaysInFirstWeek - 1] = chrono;
                }
            }}
        }
        }__CLR4_4_17sl7sllgchoqqh.R.inc(10145);return chrono;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor.
     */
    CopticChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_17sl7sllgchoqqh.R.inc(10147);try{__CLR4_4_17sl7sllgchoqqh.R.inc(10146);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    /**
     * Serialization singleton.
     */
    private Object readResolve() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10148);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10149);Chronology base = getBase();
        __CLR4_4_17sl7sllgchoqqh.R.inc(10150);int minDays = getMinimumDaysInFirstWeek();
        __CLR4_4_17sl7sllgchoqqh.R.inc(10151);minDays = ((((minDays == 0 )&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10152)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10153)==0&false))? 4 : minDays);  // handle rename of BaseGJChronology
        __CLR4_4_17sl7sllgchoqqh.R.inc(10154);return (((base == null )&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10155)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10156)==0&false))?
                getInstance(DateTimeZone.UTC, minDays) :
                getInstance(base.getZone(), minDays);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10157);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10158);return INSTANCE_UTC;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10159);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10160);if ((((zone == null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10161)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10162)==0&false))) {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10163);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_17sl7sllgchoqqh.R.inc(10164);if ((((zone == getZone())&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10165)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10166)==0&false))) {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10167);return this;
        }
        }__CLR4_4_17sl7sllgchoqqh.R.inc(10168);return getInstance(zone);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Override
    boolean isLeapDay(long instant) {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10169);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10170);return dayOfMonth().get(instant) == 6 && monthOfYear().isLeap(instant);
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10171);
        // Java epoch is 1970-01-01 Gregorian which is 1686-04-23 Coptic.
        // Calculate relative to the nearest leap year and account for the
        // difference later.

        __CLR4_4_17sl7sllgchoqqh.R.inc(10172);int relativeYear = year - 1687;
        __CLR4_4_17sl7sllgchoqqh.R.inc(10173);int leapYears;
        __CLR4_4_17sl7sllgchoqqh.R.inc(10174);if ((((relativeYear <= 0)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10175)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10176)==0&false))) {{
            // Add 3 before shifting right since /4 and >>2 behave differently
            // on negative numbers.
            __CLR4_4_17sl7sllgchoqqh.R.inc(10177);leapYears = (relativeYear + 3) >> 2;
        } }else {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10178);leapYears = relativeYear >> 2;
            // For post 1687 an adjustment is needed as jan1st is before leap day
            __CLR4_4_17sl7sllgchoqqh.R.inc(10179);if ((((!isLeapYear(year))&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10180)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10181)==0&false))) {{
                __CLR4_4_17sl7sllgchoqqh.R.inc(10182);leapYears++;
            }
        }}

        }__CLR4_4_17sl7sllgchoqqh.R.inc(10183);long millis = (relativeYear * 365L + leapYears)
                * (long) DateTimeConstants.MILLIS_PER_DAY;

        // Adjust to account for difference between 1687-01-01 and 1686-04-23.

        __CLR4_4_17sl7sllgchoqqh.R.inc(10184);return millis + (365L - 112) * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMinYear() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10185);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10186);return MIN_YEAR;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    int getMaxYear() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10187);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10188);return MAX_YEAR;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10189);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10190);return (1686L * MILLIS_PER_YEAR + 112L * DateTimeConstants.MILLIS_PER_DAY) / 2;
    }finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    protected void assemble(Fields fields) {try{__CLR4_4_17sl7sllgchoqqh.R.inc(10191);
        __CLR4_4_17sl7sllgchoqqh.R.inc(10192);if ((((getBase() == null)&&(__CLR4_4_17sl7sllgchoqqh.R.iget(10193)!=0|true))||(__CLR4_4_17sl7sllgchoqqh.R.iget(10194)==0&false))) {{
            __CLR4_4_17sl7sllgchoqqh.R.inc(10195);super.assemble(fields);

            // Coptic, like Julian, has no year zero.
            __CLR4_4_17sl7sllgchoqqh.R.inc(10196);fields.year = new SkipDateTimeField(this, fields.year);
            __CLR4_4_17sl7sllgchoqqh.R.inc(10197);fields.weekyear = new SkipDateTimeField(this, fields.weekyear);

            __CLR4_4_17sl7sllgchoqqh.R.inc(10198);fields.era = ERA_FIELD;
            __CLR4_4_17sl7sllgchoqqh.R.inc(10199);fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 13);
            __CLR4_4_17sl7sllgchoqqh.R.inc(10200);fields.months = fields.monthOfYear.getDurationField();
        }
    }}finally{__CLR4_4_17sl7sllgchoqqh.R.flushNeeded();}}

}
