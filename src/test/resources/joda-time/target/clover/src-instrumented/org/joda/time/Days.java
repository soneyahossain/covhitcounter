/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * An immutable time period representing a number of days.
 * <p>
 * <code>Days</code> is an immutable period that can only store days.
 * It does not store years, months or hours for example. As such it is a
 * type-safe way of representing a number of days in an application.
 * <p>
 * The number of days is set in the constructor, and may be queried using
 * <code>getDays()</code>. Basic mathematical operations are provided -
 * <code>plus()</code>, <code>minus()</code>, <code>multipliedBy()</code> and
 * <code>dividedBy()</code>.
 * <p>
 * <code>Days</code> is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class Days extends BaseSingleFieldPeriod {public static class __CLR4_4_11c91c9lgchoq7x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,1855,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constant representing zero days.
     */
    public static final Days ZERO = new Days(0);
    /**
     * Constant representing one day.
     */
    public static final Days ONE = new Days(1);
    /**
     * Constant representing two days.
     */
    public static final Days TWO = new Days(2);
    /**
     * Constant representing three days.
     */
    public static final Days THREE = new Days(3);
    /**
     * Constant representing four days.
     */
    public static final Days FOUR = new Days(4);
    /**
     * Constant representing five days.
     */
    public static final Days FIVE = new Days(5);
    /**
     * Constant representing six days.
     */
    public static final Days SIX = new Days(6);
    /**
     * Constant representing seven days.
     */
    public static final Days SEVEN = new Days(7);
    /**
     * Constant representing the maximum number of days that can be stored in this object.
     */
    public static final Days MAX_VALUE = new Days(Integer.MAX_VALUE);
    /**
     * Constant representing the minimum number of days that can be stored in this object.
     */
    public static final Days MIN_VALUE = new Days(Integer.MIN_VALUE);

    /**
     * The parser to use for this class.
     */
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.days());
    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 87525275727380865L;

    //-----------------------------------------------------------------------

    /**
     * Obtains an instance of <code>Days</code> that may be cached.
     * <code>Days</code> is immutable, so instances can be cached and shared.
     * This factory method provides access to shared instances.
     *
     * @param days the number of days to obtain an instance for
     * @return the instance of Days
     */
    public static Days days(int days) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1737);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11c91c9lgchoq7x.R.inc(1738);switch (days) {
            case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1739);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1740);return ZERO;
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1741);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1742);return ONE;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1743);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1744);return TWO;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1745);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1746);return THREE;
            case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1747);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1748);return FOUR;
            case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1749);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1750);return FIVE;
            case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1751);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1752);return SIX;
            case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1753);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1754);return SEVEN;
            case Integer.MAX_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1755);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1756);return MAX_VALUE;
            case Integer.MIN_VALUE:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1757);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1758);return MIN_VALUE;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_11c91c9lgchoq7x.R.inc(1759);__CLB4_4_1_bool0=true;}
                __CLR4_4_11c91c9lgchoq7x.R.inc(1760);return new Days(days);
        }
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a <code>Days</code> representing the number of whole days
     * between the two specified datetimes. This method correctly handles
     * any daylight savings time changes that may occur during the interval.
     *
     * @param start the start instant, must not be null
     * @param end   the end instant, must not be null
     * @return the period in days
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    public static Days daysBetween(ReadableInstant start, ReadableInstant end) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1761);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1762);int amount = BaseSingleFieldPeriod.between(start, end, DurationFieldType.days());
        __CLR4_4_11c91c9lgchoq7x.R.inc(1763);return Days.days(amount);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Creates a <code>Days</code> representing the number of whole days
     * between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     *
     * @param start the start partial date, must not be null
     * @param end   the end partial date, must not be null
     * @return the period in days
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Days daysBetween(ReadablePartial start, ReadablePartial end) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1764);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1765);if ((((start instanceof LocalDate && end instanceof LocalDate)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1766)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1767)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1768);Chronology chrono = DateTimeUtils.getChronology(start.getChronology());
            __CLR4_4_11c91c9lgchoq7x.R.inc(1769);int days = chrono.days().getDifference(
                    ((LocalDate) end).getLocalMillis(), ((LocalDate) start).getLocalMillis());
            __CLR4_4_11c91c9lgchoq7x.R.inc(1770);return Days.days(days);
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1771);int amount = BaseSingleFieldPeriod.between(start, end, ZERO);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1772);return Days.days(amount);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Creates a <code>Days</code> representing the number of whole days
     * in the specified interval. This method correctly handles any daylight
     * savings time changes that may occur during the interval.
     *
     * @param interval the interval to extract days from, null returns zero
     * @return the period in days
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    public static Days daysIn(ReadableInterval interval) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1773);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1774);if ((((interval == null)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1775)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1776)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1777);return Days.ZERO;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1778);int amount = BaseSingleFieldPeriod.between(interval.getStart(), interval.getEnd(), DurationFieldType.days());
        __CLR4_4_11c91c9lgchoq7x.R.inc(1779);return Days.days(amount);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Creates a new <code>Days</code> representing the number of complete
     * standard length days in the specified period.
     * <p>
     * This factory method converts all fields from the period to hours using standardised
     * durations for each field. Only those fields which have a precise duration in
     * the ISO UTC chronology can be converted.
     * <ul>
     * <li>One week consists of 7 days.
     * <li>One day consists of 24 hours.
     * <li>One hour consists of 60 minutes.
     * <li>One minute consists of 60 seconds.
     * <li>One second consists of 1000 milliseconds.
     * </ul>
     * Months and Years are imprecise and periods containing these values cannot be converted.
     *
     * @param period the period to get the number of hours from, null returns zero
     * @return the period in days
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    public static Days standardDaysIn(ReadablePeriod period) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1780);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1781);int amount = BaseSingleFieldPeriod.standardPeriodIn(period, DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1782);return Days.days(amount);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Creates a new <code>Days</code> by parsing a string in the ISO8601 format 'PnD'.
     * <p>
     * The parse will accept the full ISO syntax of PnYnMnWnDTnHnMnS however only the
     * days component may be non-zero. If any other component is non-zero, an exception
     * will be thrown.
     *
     * @param periodStr the period string, null returns zero
     * @return the period in days
     * @throws IllegalArgumentException if the string format is invalid
     */
    @FromString
    public static Days parseDays(String periodStr) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1783);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1784);if ((((periodStr == null)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1785)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1786)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1787);return Days.ZERO;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1788);Period p = PARSER.parsePeriod(periodStr);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1789);return Days.days(p.getDays());
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new instance representing a number of days.
     * You should consider using the factory method {@link #days(int)}
     * instead of the constructor.
     *
     * @param days the number of days to represent
     */
    private Days(int days) {
        super(days);__CLR4_4_11c91c9lgchoq7x.R.inc(1791);try{__CLR4_4_11c91c9lgchoq7x.R.inc(1790);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Resolves singletons.
     *
     * @return the singleton instance
     */
    private Object readResolve() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1792);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1793);return Days.days(getValue());
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the duration field type, which is <code>days</code>.
     *
     * @return the period type
     */
    public DurationFieldType getFieldType() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1794);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1795);return DurationFieldType.days();
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Gets the period type, which is <code>days</code>.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1796);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1797);return PeriodType.days();
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period in days to a period in weeks assuming a
     * 7 day week.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all weeks are
     * 7 days long.
     * This may not be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of weeks for this number of days
     */
    public Weeks toStandardWeeks() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1798);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1799);return Weeks.weeks(getValue() / DateTimeConstants.DAYS_PER_WEEK);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Converts this period in days to a period in hours assuming a
     * 24 hour day.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all days are 24 hours long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of hours for this number of days
     * @throws ArithmeticException if the number of hours is too large to be represented
     */
    public Hours toStandardHours() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1800);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1801);return Hours.hours(FieldUtils.safeMultiply(getValue(), DateTimeConstants.HOURS_PER_DAY));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Converts this period in days to a period in minutes assuming a
     * 24 hour day and 60 minute hour.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all days are 24 hours
     * long and all hours are 60 minutes long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of minutes for this number of days
     * @throws ArithmeticException if the number of minutes is too large to be represented
     */
    public Minutes toStandardMinutes() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1802);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1803);return Minutes.minutes(FieldUtils.safeMultiply(getValue(), DateTimeConstants.MINUTES_PER_DAY));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Converts this period in days to a period in seconds assuming a
     * 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert between different types of period.
     * However to achieve this it makes the assumption that all days are 24 hours
     * long, all hours are 60 minutes long and all minutes are 60 seconds long.
     * This is not true when daylight savings is considered and may also not
     * be true for some unusual chronologies. However, it is included
     * as it is a useful operation for many applications and business rules.
     *
     * @return a period representing the number of seconds for this number of days
     * @throws ArithmeticException if the number of seconds is too large to be represented
     */
    public Seconds toStandardSeconds() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1804);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1805);return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_DAY));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Converts this period in days to a duration in milliseconds assuming a
     * 24 hour day, 60 minute hour and 60 second minute.
     * <p>
     * This method allows you to convert from a period to a duration.
     * However to achieve this it makes the assumption that all days are 24 hours
     * long, all hours are 60 minutes and all minutes are 60 seconds.
     * This is not true when daylight savings time is considered, and may also
     * not be true for some unusual chronologies. However, it is included as it
     * is a useful operation for many applications and business rules.
     *
     * @return a duration equivalent to this number of days
     */
    public Duration toStandardDuration() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1806);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1807);long days = getValue();  // assign to a long
        __CLR4_4_11c91c9lgchoq7x.R.inc(1808);return new Duration(days * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of days that this period represents.
     *
     * @return the number of days in the period
     */
    public int getDays() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1809);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1810);return getValue();
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of days added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to add, may be negative
     * @return the new period plus the specified number of days
     * @throws ArithmeticException if the result overflows an int
     */
    public Days plus(int days) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1811);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1812);if ((((days == 0)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1813)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1814)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1815);return this;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1816);return Days.days(FieldUtils.safeAdd(getValue(), days));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of days added.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to add, may be negative, null means zero
     * @return the new period plus the specified number of days
     * @throws ArithmeticException if the result overflows an int
     */
    public Days plus(Days days) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1817);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1818);if ((((days == null)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1819)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1820)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1821);return this;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1822);return plus(days.getValue());
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the specified number of days taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to take away, may be negative
     * @return the new period minus the specified number of days
     * @throws ArithmeticException if the result overflows an int
     */
    public Days minus(int days) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1823);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1824);return plus(FieldUtils.safeNegate(days));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Returns a new instance with the specified number of days taken away.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param days the amount of days to take away, may be negative, null means zero
     * @return the new period minus the specified number of days
     * @throws ArithmeticException if the result overflows an int
     */
    public Days minus(Days days) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1825);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1826);if ((((days == null)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1827)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1828)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1829);return this;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1830);return minus(days.getValue());
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the days multiplied by the specified scalar.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param scalar the amount to multiply by, may be negative
     * @return the new period multiplied by the specified scalar
     * @throws ArithmeticException if the result overflows an int
     */
    public Days multipliedBy(int scalar) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1831);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1832);return Days.days(FieldUtils.safeMultiply(getValue(), scalar));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Returns a new instance with the days divided by the specified divisor.
     * The calculation uses integer division, thus 3 divided by 2 is 1.
     * <p>
     * This instance is immutable and unaffected by this method call.
     *
     * @param divisor the amount to divide by, may be negative
     * @return the new period divided by the specified divisor
     * @throws ArithmeticException if the divisor is zero
     */
    public Days dividedBy(int divisor) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1833);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1834);if ((((divisor == 1)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1835)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1836)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1837);return this;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1838);return Days.days(getValue() / divisor);
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns a new instance with the days value negated.
     *
     * @return the new period with a negated value
     * @throws ArithmeticException if the result overflows an int
     */
    public Days negated() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1839);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1840);return Days.days(FieldUtils.safeNegate(getValue()));
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this days instance greater than the specified number of days.
     *
     * @param other the other period, null means zero
     * @return true if this days instance is greater than the specified one
     */
    public boolean isGreaterThan(Days other) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1841);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1842);if ((((other == null)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1843)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1844)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1845);return getValue() > 0;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1846);return getValue() > other.getValue();
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    /**
     * Is this days instance less than the specified number of days.
     *
     * @param other the other period, null means zero
     * @return true if this days instance is less than the specified one
     */
    public boolean isLessThan(Days other) {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1847);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1848);if ((((other == null)&&(__CLR4_4_11c91c9lgchoq7x.R.iget(1849)!=0|true))||(__CLR4_4_11c91c9lgchoq7x.R.iget(1850)==0&false))) {{
            __CLR4_4_11c91c9lgchoq7x.R.inc(1851);return getValue() < 0;
        }
        }__CLR4_4_11c91c9lgchoq7x.R.inc(1852);return getValue() < other.getValue();
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets this instance as a String in the ISO8601 duration format.
     * <p>
     * For example, "P4D" represents 4 days.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_11c91c9lgchoq7x.R.inc(1853);
        __CLR4_4_11c91c9lgchoq7x.R.inc(1854);return "P" + String.valueOf(getValue()) + "D";
    }finally{__CLR4_4_11c91c9lgchoq7x.R.flushNeeded();}}

}
