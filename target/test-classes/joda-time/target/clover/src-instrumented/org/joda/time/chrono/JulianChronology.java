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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.SkipDateTimeField;

/**
 * Implements a pure proleptic Julian calendar system, which defines every
 * fourth year as leap. This implementation follows the leap year rule
 * strictly, even for dates before 8 CE, where leap years were actually
 * irregular. In the Julian calendar, year zero does not exist: 1 BCE is
 * followed by 1 CE.
 * <p>
 * Although the Julian calendar did not exist before 45 BCE, this chronology
 * assumes it did, thus it is proleptic. This implementation also fixes the
 * start of the year at January 1.
 * <p>
 * JulianChronology is thread-safe and immutable.
 *
 * @author Guy Allard
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @see <a href="https://en.wikipedia.org/wiki/Julian_calendar">Wikipedia</a>
 * @see GregorianChronology
 * @see GJChronology
 * @since 1.0
 */
public final class JulianChronology extends BasicGJChronology {public static class __CLR4_4_1902902lgchoqth{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11779,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -8731039522547897247L;

    private static final long MILLIS_PER_YEAR =
            (long) (365.25 * DateTimeConstants.MILLIS_PER_DAY);

    private static final long MILLIS_PER_MONTH =
            (long) (365.25 * DateTimeConstants.MILLIS_PER_DAY / 12);

    /**
     * The lowest year that can be fully supported.
     */
    private static final int MIN_YEAR = -292269054;

    /**
     * The highest year that can be fully supported.
     */
    private static final int MAX_YEAR = 292272992;

    /**
     * Singleton instance of a UTC JulianChronology
     */
    private static final JulianChronology INSTANCE_UTC;

    /**
     * Cache of zone to chronology arrays
     */
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> cCache = new ConcurrentHashMap<DateTimeZone, JulianChronology[]>();

    static {try{__CLR4_4_1902902lgchoqth.R.inc(11666);
        __CLR4_4_1902902lgchoqth.R.inc(11667);INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    static int adjustYearForSet(int year) {try{__CLR4_4_1902902lgchoqth.R.inc(11668);
        __CLR4_4_1902902lgchoqth.R.inc(11669);if ((((year <= 0)&&(__CLR4_4_1902902lgchoqth.R.iget(11670)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11671)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11672);if ((((year == 0)&&(__CLR4_4_1902902lgchoqth.R.iget(11673)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11674)==0&false))) {{
                __CLR4_4_1902902lgchoqth.R.inc(11675);throw new IllegalFieldValueException
                        (DateTimeFieldType.year(), Integer.valueOf(year), null, null);
            }
            }__CLR4_4_1902902lgchoqth.R.inc(11676);year++;
        }
        }__CLR4_4_1902902lgchoqth.R.inc(11677);return year;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology.
     * The time zone of the returned instance is UTC.
     *
     * @return a singleton UTC instance of the chronology
     */
    public static JulianChronology getInstanceUTC() {try{__CLR4_4_1902902lgchoqth.R.inc(11678);
        __CLR4_4_1902902lgchoqth.R.inc(11679);return INSTANCE_UTC;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology in the default time zone.
     *
     * @return a chronology in the default time zone
     */
    public static JulianChronology getInstance() {try{__CLR4_4_1902902lgchoqth.R.inc(11680);
        __CLR4_4_1902902lgchoqth.R.inc(11681);return getInstance(DateTimeZone.getDefault(), 4);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology in the given time zone.
     *
     * @param zone the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static JulianChronology getInstance(DateTimeZone zone) {try{__CLR4_4_1902902lgchoqth.R.inc(11682);
        __CLR4_4_1902902lgchoqth.R.inc(11683);return getInstance(zone, 4);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    /**
     * Gets an instance of the JulianChronology in the given time zone.
     *
     * @param zone               the time zone to get the chronology in, null is default
     * @param minDaysInFirstWeek minimum number of days in first week of the year; default is 4
     * @return a chronology in the specified time zone
     */
    public static JulianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {try{__CLR4_4_1902902lgchoqth.R.inc(11684);
        __CLR4_4_1902902lgchoqth.R.inc(11685);if ((((zone == null)&&(__CLR4_4_1902902lgchoqth.R.iget(11686)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11687)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11688);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1902902lgchoqth.R.inc(11689);JulianChronology chrono;
        __CLR4_4_1902902lgchoqth.R.inc(11690);JulianChronology[] chronos = cCache.get(zone);
        __CLR4_4_1902902lgchoqth.R.inc(11691);if ((((chronos == null)&&(__CLR4_4_1902902lgchoqth.R.iget(11692)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11693)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11694);chronos = new JulianChronology[7];
            __CLR4_4_1902902lgchoqth.R.inc(11695);JulianChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            __CLR4_4_1902902lgchoqth.R.inc(11696);if ((((oldChronos != null)&&(__CLR4_4_1902902lgchoqth.R.iget(11697)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11698)==0&false))) {{
                __CLR4_4_1902902lgchoqth.R.inc(11699);chronos = oldChronos;
            }
        }}
        }__CLR4_4_1902902lgchoqth.R.inc(11700);try {
            __CLR4_4_1902902lgchoqth.R.inc(11701);chrono = chronos[minDaysInFirstWeek - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            __CLR4_4_1902902lgchoqth.R.inc(11702);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
        }
        __CLR4_4_1902902lgchoqth.R.inc(11703);if ((((chrono == null)&&(__CLR4_4_1902902lgchoqth.R.iget(11704)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11705)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11706);synchronized (chronos) {
                __CLR4_4_1902902lgchoqth.R.inc(11707);chrono = chronos[minDaysInFirstWeek - 1];
                __CLR4_4_1902902lgchoqth.R.inc(11708);if ((((chrono == null)&&(__CLR4_4_1902902lgchoqth.R.iget(11709)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11710)==0&false))) {{
                    __CLR4_4_1902902lgchoqth.R.inc(11711);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_1902902lgchoqth.R.iget(11712)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11713)==0&false))) {{
                        __CLR4_4_1902902lgchoqth.R.inc(11714);chrono = new JulianChronology(null, null, minDaysInFirstWeek);
                    } }else {{
                        __CLR4_4_1902902lgchoqth.R.inc(11715);chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                        __CLR4_4_1902902lgchoqth.R.inc(11716);chrono = new JulianChronology
                                (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                    }
                    }__CLR4_4_1902902lgchoqth.R.inc(11717);chronos[minDaysInFirstWeek - 1] = chrono;
                }
            }}
        }
        }__CLR4_4_1902902lgchoqth.R.inc(11718);return chrono;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor
     */
    JulianChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);__CLR4_4_1902902lgchoqth.R.inc(11720);try{__CLR4_4_1902902lgchoqth.R.inc(11719);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_1902902lgchoqth.R.inc(11721);
        __CLR4_4_1902902lgchoqth.R.inc(11722);Chronology base = getBase();
        __CLR4_4_1902902lgchoqth.R.inc(11723);int minDays = getMinimumDaysInFirstWeek();
        __CLR4_4_1902902lgchoqth.R.inc(11724);minDays = ((((minDays == 0 )&&(__CLR4_4_1902902lgchoqth.R.iget(11725)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11726)==0&false))? 4 : minDays);  // handle rename of BaseGJChronology
        __CLR4_4_1902902lgchoqth.R.inc(11727);return (((base == null )&&(__CLR4_4_1902902lgchoqth.R.iget(11728)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11729)==0&false))?
                getInstance(DateTimeZone.UTC, minDays) :
                getInstance(base.getZone(), minDays);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_1902902lgchoqth.R.inc(11730);
        __CLR4_4_1902902lgchoqth.R.inc(11731);return INSTANCE_UTC;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1902902lgchoqth.R.inc(11732);
        __CLR4_4_1902902lgchoqth.R.inc(11733);if ((((zone == null)&&(__CLR4_4_1902902lgchoqth.R.iget(11734)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11735)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11736);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1902902lgchoqth.R.inc(11737);if ((((zone == getZone())&&(__CLR4_4_1902902lgchoqth.R.iget(11738)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11739)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11740);return this;
        }
        }__CLR4_4_1902902lgchoqth.R.inc(11741);return getInstance(zone);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth)
            throws IllegalArgumentException {try{__CLR4_4_1902902lgchoqth.R.inc(11742);
        __CLR4_4_1902902lgchoqth.R.inc(11743);return super.getDateMidnightMillis(adjustYearForSet(year), monthOfYear, dayOfMonth);
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    boolean isLeapYear(int year) {try{__CLR4_4_1902902lgchoqth.R.inc(11744);
        __CLR4_4_1902902lgchoqth.R.inc(11745);return (year & 3) == 0;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    long calculateFirstDayOfYearMillis(int year) {try{__CLR4_4_1902902lgchoqth.R.inc(11746);
        // Java epoch is 1970-01-01 Gregorian which is 1969-12-19 Julian.
        // Calculate relative to the nearest leap year and account for the
        // difference later.

        __CLR4_4_1902902lgchoqth.R.inc(11747);int relativeYear = year - 1968;
        __CLR4_4_1902902lgchoqth.R.inc(11748);int leapYears;
        __CLR4_4_1902902lgchoqth.R.inc(11749);if ((((relativeYear <= 0)&&(__CLR4_4_1902902lgchoqth.R.iget(11750)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11751)==0&false))) {{
            // Add 3 before shifting right since /4 and >>2 behave differently
            // on negative numbers.
            __CLR4_4_1902902lgchoqth.R.inc(11752);leapYears = (relativeYear + 3) >> 2;
        } }else {{
            __CLR4_4_1902902lgchoqth.R.inc(11753);leapYears = relativeYear >> 2;
            // For post 1968 an adjustment is needed as jan1st is before leap day
            __CLR4_4_1902902lgchoqth.R.inc(11754);if ((((!isLeapYear(year))&&(__CLR4_4_1902902lgchoqth.R.iget(11755)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11756)==0&false))) {{
                __CLR4_4_1902902lgchoqth.R.inc(11757);leapYears++;
            }
        }}

        }__CLR4_4_1902902lgchoqth.R.inc(11758);long millis = (relativeYear * 365L + leapYears) * (long) DateTimeConstants.MILLIS_PER_DAY;

        // Adjust to account for difference between 1968-01-01 and 1969-12-19.

        __CLR4_4_1902902lgchoqth.R.inc(11759);return millis - (366L + 352) * DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    int getMinYear() {try{__CLR4_4_1902902lgchoqth.R.inc(11760);
        __CLR4_4_1902902lgchoqth.R.inc(11761);return MIN_YEAR;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    int getMaxYear() {try{__CLR4_4_1902902lgchoqth.R.inc(11762);
        __CLR4_4_1902902lgchoqth.R.inc(11763);return MAX_YEAR;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    long getAverageMillisPerYear() {try{__CLR4_4_1902902lgchoqth.R.inc(11764);
        __CLR4_4_1902902lgchoqth.R.inc(11765);return MILLIS_PER_YEAR;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    long getAverageMillisPerYearDividedByTwo() {try{__CLR4_4_1902902lgchoqth.R.inc(11766);
        __CLR4_4_1902902lgchoqth.R.inc(11767);return MILLIS_PER_YEAR / 2;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    long getAverageMillisPerMonth() {try{__CLR4_4_1902902lgchoqth.R.inc(11768);
        __CLR4_4_1902902lgchoqth.R.inc(11769);return MILLIS_PER_MONTH;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    long getApproxMillisAtEpochDividedByTwo() {try{__CLR4_4_1902902lgchoqth.R.inc(11770);
        __CLR4_4_1902902lgchoqth.R.inc(11771);return (1969L * MILLIS_PER_YEAR + 352L * DateTimeConstants.MILLIS_PER_DAY) / 2;
    }finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_1902902lgchoqth.R.inc(11772);
        __CLR4_4_1902902lgchoqth.R.inc(11773);if ((((getBase() == null)&&(__CLR4_4_1902902lgchoqth.R.iget(11774)!=0|true))||(__CLR4_4_1902902lgchoqth.R.iget(11775)==0&false))) {{
            __CLR4_4_1902902lgchoqth.R.inc(11776);super.assemble(fields);
            // Julian chronology has no year zero.
            __CLR4_4_1902902lgchoqth.R.inc(11777);fields.year = new SkipDateTimeField(this, fields.year);
            __CLR4_4_1902902lgchoqth.R.inc(11778);fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
        }
    }}finally{__CLR4_4_1902902lgchoqth.R.flushNeeded();}}

}
