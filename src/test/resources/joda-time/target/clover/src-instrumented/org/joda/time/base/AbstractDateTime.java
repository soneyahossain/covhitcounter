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
package org.joda.time.base;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.joda.convert.ToString;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * AbstractDateTime provides the common behaviour for datetime classes.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadableDateTime} interface should be used when different
 * kinds of date/time objects are to be referenced.
 * <p>
 * Whenever you want to implement <code>ReadableDateTime</code> you should
 * extend this class.
 * <p>
 * AbstractDateTime subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractDateTime
        extends AbstractInstant
        implements ReadableDateTime {public static class __CLR4_4_15kx5kxlgchoqkp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,7305,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractDateTime() {
        super();__CLR4_4_15kx5kxlgchoqkp.R.inc(7234);try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7233);
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * This method uses the chronology of the datetime to obtain the value.
     * It is essentially a generic way of calling one of the get methods.
     *
     * @param type a field type, usually obtained from DateTimeFieldType
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType type) {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7235);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7236);if ((((type == null)&&(__CLR4_4_15kx5kxlgchoqkp.R.iget(7237)!=0|true))||(__CLR4_4_15kx5kxlgchoqkp.R.iget(7238)==0&false))) {{
            __CLR4_4_15kx5kxlgchoqkp.R.inc(7239);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_15kx5kxlgchoqkp.R.inc(7240);return type.getField(getChronology()).get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the era field value.
     *
     * @return the era
     */
    public int getEra() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7241);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7242);return getChronology().era().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     *
     * @return the year of era
     */
    public int getCenturyOfEra() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7243);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7244);return getChronology().centuryOfEra().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the year of era field value.
     *
     * @return the year of era
     */
    public int getYearOfEra() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7245);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7246);return getChronology().yearOfEra().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the year of century field value.
     *
     * @return the year of century
     */
    public int getYearOfCentury() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7247);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7248);return getChronology().yearOfCentury().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the year field value.
     *
     * @return the year
     */
    public int getYear() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7249);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7250);return getChronology().year().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the weekyear field value.
     * <p>
     * The weekyear is the year that matches with the weekOfWeekyear field.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     * The weekyear allows you to query the effective year for that day.
     *
     * @return the year of a week based year
     */
    public int getWeekyear() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7251);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7252);return getChronology().weekyear().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the month of year field value.
     *
     * @return the month of year
     */
    public int getMonthOfYear() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7253);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7254);return getChronology().monthOfYear().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the week of weekyear field value.
     * <p>
     * This field is associated with the "weekyear" via {@link #getWeekyear()}.
     * In the standard ISO8601 week algorithm, the first week of the year
     * is that in which at least 4 days are in the year. As a result of this
     * definition, day 1 of the first week may be in the previous year.
     *
     * @return the week of a week based year
     */
    public int getWeekOfWeekyear() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7255);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7256);return getChronology().weekOfWeekyear().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the day of year field value.
     *
     * @return the day of year
     */
    public int getDayOfYear() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7257);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7258);return getChronology().dayOfYear().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the day of month field value.
     * <p>
     * The values for the day of month are defined in {@link org.joda.time.DateTimeConstants}.
     *
     * @return the day of month
     */
    public int getDayOfMonth() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7259);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7260);return getChronology().dayOfMonth().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the day of week field value.
     * <p>
     * The values for the day of week are defined in {@link org.joda.time.DateTimeConstants}.
     *
     * @return the day of week
     */
    public int getDayOfWeek() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7261);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7262);return getChronology().dayOfWeek().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the hour of day field value.
     *
     * @return the hour of day
     */
    public int getHourOfDay() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7263);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7264);return getChronology().hourOfDay().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the minute of day field value.
     *
     * @return the minute of day
     */
    public int getMinuteOfDay() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7265);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7266);return getChronology().minuteOfDay().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the minute of hour field value.
     *
     * @return the minute of hour
     */
    public int getMinuteOfHour() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7267);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7268);return getChronology().minuteOfHour().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the second of day field value.
     *
     * @return the second of day
     */
    public int getSecondOfDay() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7269);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7270);return getChronology().secondOfDay().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the second of minute field value.
     *
     * @return the second of minute
     */
    public int getSecondOfMinute() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7271);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7272);return getChronology().secondOfMinute().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the millis of day field value.
     *
     * @return the millis of day
     */
    public int getMillisOfDay() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7273);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7274);return getChronology().millisOfDay().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the millis of second field value.
     *
     * @return the millis of second
     */
    public int getMillisOfSecond() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7275);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7276);return getChronology().millisOfSecond().get(getMillis());
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the date time as a <code>java.util.Calendar</code>, assigning
     * exactly the same millisecond instant.
     * The locale is passed in, enabling Calendar to select the correct
     * localized subclass.
     * <p>
     * The JDK and Joda-Time both have time zone implementations and these
     * differ in accuracy. Joda-Time's implementation is generally more up to
     * date and thus more accurate - for example JDK1.3 has no historical data.
     * The effect of this is that the field values of the <code>Calendar</code>
     * may differ from those of this object, even though the millisecond value
     * is the same. Most of the time this just means that the JDK field values
     * are wrong, as our time zone information is more up to date.
     *
     * @param locale the locale to get the Calendar for, or default if null
     * @return a localized Calendar initialised with this datetime
     */
    public Calendar toCalendar(Locale locale) {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7277);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7278);if ((((locale == null)&&(__CLR4_4_15kx5kxlgchoqkp.R.iget(7279)!=0|true))||(__CLR4_4_15kx5kxlgchoqkp.R.iget(7280)==0&false))) {{
            __CLR4_4_15kx5kxlgchoqkp.R.inc(7281);locale = Locale.getDefault();
        }
        }__CLR4_4_15kx5kxlgchoqkp.R.inc(7282);DateTimeZone zone = getZone();
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7283);Calendar cal = Calendar.getInstance(zone.toTimeZone(), locale);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7284);cal.setTime(toDate());
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7285);return cal;
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Get the date time as a <code>java.util.GregorianCalendar</code>,
     * assigning exactly the same millisecond instant.
     * <p>
     * The JDK and Joda-Time both have time zone implementations and these
     * differ in accuracy. Joda-Time's implementation is generally more up to
     * date and thus more accurate - for example JDK1.3 has no historical data.
     * The effect of this is that the field values of the <code>Calendar</code>
     * may differ from those of this object, even though the millisecond value
     * is the same. Most of the time this just means that the JDK field values
     * are wrong, as our time zone information is more up to date.
     *
     * @return a GregorianCalendar initialised with this datetime
     */
    public GregorianCalendar toGregorianCalendar() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7286);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7287);DateTimeZone zone = getZone();
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7288);GregorianCalendar cal = new GregorianCalendar(zone.toTimeZone());
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7289);cal.setTime(toDate());
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7290);return cal;
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the date time in ISO8601 format (yyyy-MM-ddTHH:mm:ss.SSSZZ).
     * <p>
     * Note that this method does not output the chronology or time-zone.
     * This can be confusing, as the equals and hashCode methods use both
     * chronology and time-zone. If two objects are not {@code equal} but have the
     * same {@code toString} then either the chronology or time-zone differs.
     *
     * @return ISO8601 time formatted string, not null
     */
    @ToString
    public String toString() {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7291);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7292);return super.toString();
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Output the instant using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @return the formatted string, not null
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7293);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7294);if ((((pattern == null)&&(__CLR4_4_15kx5kxlgchoqkp.R.iget(7295)!=0|true))||(__CLR4_4_15kx5kxlgchoqkp.R.iget(7296)==0&false))) {{
            __CLR4_4_15kx5kxlgchoqkp.R.inc(7297);return toString();
        }
        }__CLR4_4_15kx5kxlgchoqkp.R.inc(7298);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

    /**
     * Output the instant using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @return the formatted string, not null
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_15kx5kxlgchoqkp.R.inc(7299);
        __CLR4_4_15kx5kxlgchoqkp.R.inc(7300);if ((((pattern == null)&&(__CLR4_4_15kx5kxlgchoqkp.R.iget(7301)!=0|true))||(__CLR4_4_15kx5kxlgchoqkp.R.iget(7302)==0&false))) {{
            __CLR4_4_15kx5kxlgchoqkp.R.inc(7303);return toString();
        }
        }__CLR4_4_15kx5kxlgchoqkp.R.inc(7304);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_15kx5kxlgchoqkp.R.flushNeeded();}}

}
