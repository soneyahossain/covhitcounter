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
package org.joda.time.chrono;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/**
 * BaseChronology provides a skeleton implementation for chronology
 * classes. Many utility methods are defined, but all fields are unsupported.
 * <p>
 * BaseChronology is thread-safe and immutable, and all subclasses must be
 * as well.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class BaseChronology
        extends Chronology
        implements Serializable {public static class __CLR4_4_16sr6srlgchoqnj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,8998,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version.
     */
    private static final long serialVersionUID = -7310865996721419676L;

    /**
     * Restricted constructor.
     */
    protected BaseChronology() {
        super();__CLR4_4_16sr6srlgchoqnj.R.inc(8812);try{__CLR4_4_16sr6srlgchoqnj.R.inc(8811);
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Returns the DateTimeZone that this Chronology operates in, or null if
     * unspecified.
     *
     * @return DateTimeZone null if unspecified
     */
    public abstract DateTimeZone getZone();

    /**
     * Returns an instance of this Chronology that operates in the UTC time
     * zone. Chronologies that do not operate in a time zone or are already
     * UTC must return themselves.
     *
     * @return a version of this chronology that ignores time zones
     */
    public abstract Chronology withUTC();

    /**
     * Returns an instance of this Chronology that operates in any time zone.
     *
     * @param zone to use, or default if null
     * @return a version of this chronology with a specific time zone
     * @see org.joda.time.chrono.ZonedChronology
     */
    public abstract Chronology withZone(DateTimeZone zone);

    /**
     * Returns a datetime millisecond instant, formed from the given year,
     * month, day, and millisecond values. The set of given values must refer
     * to a valid datetime, or else an IllegalArgumentException is thrown.
     * <p>
     * The default implementation calls upon separate DateTimeFields to
     * determine the result. Subclasses are encouraged to provide a more
     * efficient implementation.
     *
     * @param year        year to use
     * @param monthOfYear month to use
     * @param dayOfMonth  day of month to use
     * @param millisOfDay millisecond to use
     * @return millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8813);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8814);long instant = year().set(0, year);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8815);instant = monthOfYear().set(instant, monthOfYear);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8816);instant = dayOfMonth().set(instant, dayOfMonth);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8817);return millisOfDay().set(instant, millisOfDay);
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Returns a datetime millisecond instant, formed from the given year,
     * month, day, hour, minute, second, and millisecond values. The set of
     * given values must refer to a valid datetime, or else an
     * IllegalArgumentException is thrown.
     * <p>
     * The default implementation calls upon separate DateTimeFields to
     * determine the result. Subclasses are encouraged to provide a more
     * efficient implementation.
     *
     * @param year           year to use
     * @param monthOfYear    month to use
     * @param dayOfMonth     day of month to use
     * @param hourOfDay      hour to use
     * @param minuteOfHour   minute to use
     * @param secondOfMinute second to use
     * @param millisOfSecond millisecond to use
     * @return millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8818);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8819);long instant = year().set(0, year);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8820);instant = monthOfYear().set(instant, monthOfYear);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8821);instant = dayOfMonth().set(instant, dayOfMonth);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8822);instant = hourOfDay().set(instant, hourOfDay);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8823);instant = minuteOfHour().set(instant, minuteOfHour);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8824);instant = secondOfMinute().set(instant, secondOfMinute);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8825);return millisOfSecond().set(instant, millisOfSecond);
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Returns a datetime millisecond instant, from from the given instant,
     * hour, minute, second, and millisecond values. The set of given values
     * must refer to a valid datetime, or else an IllegalArgumentException is
     * thrown.
     * <p>
     * The default implementation calls upon separate DateTimeFields to
     * determine the result. Subclasses are encouraged to provide a more
     * efficient implementation.
     *
     * @param instant        instant to start from
     * @param hourOfDay      hour to use
     * @param minuteOfHour   minute to use
     * @param secondOfMinute second to use
     * @param millisOfSecond millisecond to use
     * @return millisecond instant from 1970-01-01T00:00:00Z
     */
    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8826);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8827);instant = hourOfDay().set(instant, hourOfDay);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8828);instant = minuteOfHour().set(instant, minuteOfHour);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8829);instant = secondOfMinute().set(instant, secondOfMinute);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8830);return millisOfSecond().set(instant, millisOfSecond);
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Validates whether the fields stored in a partial instant are valid.
     * <p>
     * This implementation uses {@link DateTimeField#getMinimumValue(ReadablePartial, int[])}
     * and {@link DateTimeField#getMaximumValue(ReadablePartial, int[])}.
     *
     * @param partial the partial instant to validate
     * @param values  the values to validate, not null unless the partial is empty
     * @throws IllegalArgumentException if the instant is invalid
     */
    public void validate(ReadablePartial partial, int[] values) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8831);
        // check values in standard range, catching really stupid cases like -1
        // this means that the second check will not hit trouble
        __CLR4_4_16sr6srlgchoqnj.R.inc(8832);int size = partial.size();
        __CLR4_4_16sr6srlgchoqnj.R.inc(8833);for (int i = 0; (((i < size)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8834)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8835)==0&false)); i++) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8836);int value = values[i];
            __CLR4_4_16sr6srlgchoqnj.R.inc(8837);DateTimeField field = partial.getField(i);
            __CLR4_4_16sr6srlgchoqnj.R.inc(8838);if ((((value < field.getMinimumValue())&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8839)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8840)==0&false))) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8841);throw new IllegalFieldValueException
                        (field.getType(), Integer.valueOf(value),
                                Integer.valueOf(field.getMinimumValue()), null);
            }
            }__CLR4_4_16sr6srlgchoqnj.R.inc(8842);if ((((value > field.getMaximumValue())&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8843)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8844)==0&false))) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8845);throw new IllegalFieldValueException
                        (field.getType(), Integer.valueOf(value),
                                null, Integer.valueOf(field.getMaximumValue()));
            }
        }}
        // check values in specific range, catching really odd cases like 30th Feb
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8846);for (int i = 0; (((i < size)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8847)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8848)==0&false)); i++) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8849);int value = values[i];
            __CLR4_4_16sr6srlgchoqnj.R.inc(8850);DateTimeField field = partial.getField(i);
            __CLR4_4_16sr6srlgchoqnj.R.inc(8851);if ((((value < field.getMinimumValue(partial, values))&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8852)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8853)==0&false))) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8854);throw new IllegalFieldValueException
                        (field.getType(), Integer.valueOf(value),
                                Integer.valueOf(field.getMinimumValue(partial, values)), null);
            }
            }__CLR4_4_16sr6srlgchoqnj.R.inc(8855);if ((((value > field.getMaximumValue(partial, values))&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8856)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8857)==0&false))) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8858);throw new IllegalFieldValueException
                        (field.getType(), Integer.valueOf(value),
                                null, Integer.valueOf(field.getMaximumValue(partial, values)));
            }
        }}
    }}finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Gets the values of a partial from an instant.
     *
     * @param partial the partial instant to use
     * @param instant the instant to query
     * @return the values of the partial extracted from the instant
     */
    public int[] get(ReadablePartial partial, long instant) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8859);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8860);int size = partial.size();
        __CLR4_4_16sr6srlgchoqnj.R.inc(8861);int[] values = new int[size];
        __CLR4_4_16sr6srlgchoqnj.R.inc(8862);for (int i = 0; (((i < size)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8863)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8864)==0&false)); i++) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8865);values[i] = partial.getFieldType(i).getField(this).get(instant);
        }
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8866);return values;
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Sets the partial into the instant.
     *
     * @param partial the partial instant to use
     * @param instant the instant to update
     * @return the updated instant
     */
    public long set(ReadablePartial partial, long instant) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8867);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8868);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8869)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8870)==0&false)); i++) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8871);instant = partial.getFieldType(i).getField(this).set(instant, partial.getValue(i));
        }
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8872);return instant;
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the values of a period from an interval.
     *
     * @param period       the period instant to use
     * @param startInstant the start instant of an interval to query
     * @param endInstant   the start instant of an interval to query
     * @return the values of the period extracted from the interval
     */
    public int[] get(ReadablePeriod period, long startInstant, long endInstant) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8873);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8874);int size = period.size();
        __CLR4_4_16sr6srlgchoqnj.R.inc(8875);int[] values = new int[size];
        __CLR4_4_16sr6srlgchoqnj.R.inc(8876);if ((((startInstant != endInstant)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8877)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8878)==0&false))) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8879);for (int i = 0; (((i < size)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8880)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8881)==0&false)); i++) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8882);DurationField field = period.getFieldType(i).getField(this);
                __CLR4_4_16sr6srlgchoqnj.R.inc(8883);int value = field.getDifference(endInstant, startInstant);
                __CLR4_4_16sr6srlgchoqnj.R.inc(8884);if ((((value != 0)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8885)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8886)==0&false))) {{
                    __CLR4_4_16sr6srlgchoqnj.R.inc(8887);startInstant = field.add(startInstant, value);
                }
                }__CLR4_4_16sr6srlgchoqnj.R.inc(8888);values[i] = value;
            }
        }}
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8889);return values;
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Gets the values of a period from an interval.
     *
     * @param period   the period instant to use
     * @param duration the duration to query
     * @return the values of the period extracted from the duration
     */
    public int[] get(ReadablePeriod period, long duration) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8890);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8891);int size = period.size();
        __CLR4_4_16sr6srlgchoqnj.R.inc(8892);int[] values = new int[size];
        __CLR4_4_16sr6srlgchoqnj.R.inc(8893);if ((((duration != 0)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8894)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8895)==0&false))) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8896);long current = 0;
            __CLR4_4_16sr6srlgchoqnj.R.inc(8897);for (int i = 0; (((i < size)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8898)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8899)==0&false)); i++) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8900);DurationField field = period.getFieldType(i).getField(this);
                __CLR4_4_16sr6srlgchoqnj.R.inc(8901);if ((((field.isPrecise())&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8902)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8903)==0&false))) {{
                    __CLR4_4_16sr6srlgchoqnj.R.inc(8904);int value = field.getDifference(duration, current);
                    __CLR4_4_16sr6srlgchoqnj.R.inc(8905);current = field.add(current, value);
                    __CLR4_4_16sr6srlgchoqnj.R.inc(8906);values[i] = value;
                }
            }}
        }}
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8907);return values;
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Adds the period to the instant, specifying the number of times to add.
     *
     * @param period  the period to add, null means add nothing
     * @param instant the instant to add to
     * @param scalar  the number of times to add
     * @return the updated instant
     */
    public long add(ReadablePeriod period, long instant, int scalar) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8908);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8909);if ((((scalar != 0 && period != null)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8910)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8911)==0&false))) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8912);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8913)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8914)==0&false)); i++) {{
                __CLR4_4_16sr6srlgchoqnj.R.inc(8915);long value = period.getValue(i); // use long to allow for multiplication (fits OK)
                __CLR4_4_16sr6srlgchoqnj.R.inc(8916);if ((((value != 0)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8917)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8918)==0&false))) {{
                    __CLR4_4_16sr6srlgchoqnj.R.inc(8919);instant = period.getFieldType(i).getField(this).add(instant, value * scalar);
                }
            }}
        }}
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8920);return instant;
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Adds the duration to the instant, specifying the number of times to add.
     *
     * @param instant  the instant to add to
     * @param duration the duration to add
     * @param scalar   the number of times to add
     * @return the updated instant
     */
    public long add(long instant, long duration, int scalar) {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8921);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8922);if ((((duration == 0 || scalar == 0)&&(__CLR4_4_16sr6srlgchoqnj.R.iget(8923)!=0|true))||(__CLR4_4_16sr6srlgchoqnj.R.iget(8924)==0&false))) {{
            __CLR4_4_16sr6srlgchoqnj.R.inc(8925);return instant;
        }
        }__CLR4_4_16sr6srlgchoqnj.R.inc(8926);long add = FieldUtils.safeMultiply(duration, scalar);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8927);return FieldUtils.safeAdd(instant, add);
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Millis
    //-----------------------------------------------------------------------

    /**
     * Get the millis duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField millis() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8928);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8929);return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the millis of second field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField millisOfSecond() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8930);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8931);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the millis of day field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField millisOfDay() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8932);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8933);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Second
    //-----------------------------------------------------------------------

    /**
     * Get the seconds duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField seconds() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8934);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8935);return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the second of minute field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField secondOfMinute() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8936);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8937);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the second of day field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField secondOfDay() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8938);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8939);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Minute
    //-----------------------------------------------------------------------

    /**
     * Get the minutes duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField minutes() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8940);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8941);return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the minute of hour field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField minuteOfHour() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8942);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8943);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the minute of day field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField minuteOfDay() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8944);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8945);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Hour
    //-----------------------------------------------------------------------

    /**
     * Get the hours duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField hours() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8946);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8947);return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the hour of day (0-23) field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField hourOfDay() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8948);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8949);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the hour of day (offset to 1-24) field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField clockhourOfDay() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8950);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8951);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Halfday
    //-----------------------------------------------------------------------

    /**
     * Get the halfdays duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField halfdays() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8952);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8953);return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (0-11) field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField hourOfHalfday() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8954);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8955);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the hour of am/pm (offset to 1-12) field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField clockhourOfHalfday() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8956);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8957);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the AM(0) PM(1) field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField halfdayOfDay() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8958);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8959);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Day
    //-----------------------------------------------------------------------

    /**
     * Get the days duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField days() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8960);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8961);return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the day of week field for this chronology.
     *
     * <p>DayOfWeek values are defined in
     * {@link org.joda.time.DateTimeConstants DateTimeConstants}.
     * They use the ISO definitions, where 1 is Monday and 7 is Sunday.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField dayOfWeek() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8962);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8963);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the day of month field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField dayOfMonth() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8964);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8965);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the day of year field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField dayOfYear() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8966);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8967);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Week
    //-----------------------------------------------------------------------

    /**
     * Get the weeks duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField weeks() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8968);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8969);return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the week of a week based year field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField weekOfWeekyear() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8970);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8971);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Weekyear
    //-----------------------------------------------------------------------

    /**
     * Get the weekyears duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField weekyears() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8972);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8973);return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the year of a week based year field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField weekyear() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8974);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8975);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the year of a week based year in a century field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField weekyearOfCentury() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8976);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8977);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Month
    //-----------------------------------------------------------------------

    /**
     * Get the months duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField months() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8978);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8979);return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the month of year field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField monthOfYear() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8980);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8981);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Year
    //-----------------------------------------------------------------------

    /**
     * Get the years duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField years() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8982);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8983);return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the year field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField year() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8984);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8985);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the year of era field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField yearOfEra() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8986);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8987);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the year of century field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField yearOfCentury() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8988);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8989);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Century
    //-----------------------------------------------------------------------

    /**
     * Get the centuries duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField centuries() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8990);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8991);return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the century of era field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField centuryOfEra() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8992);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8993);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    // Era
    //-----------------------------------------------------------------------

    /**
     * Get the eras duration field for this chronology.
     *
     * @return DurationField or UnsupportedDurationField if unsupported
     */
    public DurationField eras() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8994);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8995);return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    /**
     * Get the era field for this chronology.
     *
     * @return DateTimeField or UnsupportedDateTimeField if unsupported
     */
    public DateTimeField era() {try{__CLR4_4_16sr6srlgchoqnj.R.inc(8996);
        __CLR4_4_16sr6srlgchoqnj.R.inc(8997);return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }finally{__CLR4_4_16sr6srlgchoqnj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a debugging toString.
     *
     * @return a debugging string
     */
    public abstract String toString();

}
