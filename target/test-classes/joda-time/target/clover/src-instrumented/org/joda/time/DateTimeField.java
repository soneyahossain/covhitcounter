/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2015 Stephen Colebourne
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

import java.util.Locale;

/**
 * Defines the calculation engine for date and time fields.
 * The interface defines a set of methods that manipulate a millisecond datetime
 * with regards to a single field, such as monthOfYear or secondOfMinute.
 * <p>
 * This design is extensible so, if you wish, you can extract a different field from
 * the milliseconds. A number of standard implementations are provided to assist.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class DateTimeField {public static class __CLR4_4_1memelgchoq5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,808,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Get the type of the field.
     *
     * @return field type
     */
    public abstract DateTimeFieldType getType();

    /**
     * Get the name of the field.
     * <p>
     * By convention, names follow a pattern of "dddOfRrr", where "ddd" represents
     * the (singular) duration unit field name and "Rrr" represents the (singular)
     * duration range field name. If the range field is not applicable, then
     * the name of the field is simply the (singular) duration field name.
     *
     * @return field name
     */
    public abstract String getName();

    /**
     * Returns true if this field is supported.
     *
     * @return true if this field is supported
     */
    public abstract boolean isSupported();

    /**
     * Returns true if the set method is lenient. If so, it accepts values that
     * are out of bounds. For example, a lenient day of month field accepts 32
     * for January, converting it to February 1.
     *
     * @return true if this field is lenient
     */
    public abstract boolean isLenient();

    // Main access API
    //------------------------------------------------------------------------

    /**
     * Get the value of this field from the milliseconds.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the value of the field, in the units of the field
     */
    public abstract int get(long instant);

    /**
     * Get the human-readable, text value of this field from the milliseconds.
     * If the specified locale is null, the default locale is used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsText(long instant, Locale locale);

    /**
     * Get the human-readable, text value of this field from the milliseconds.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the text value of the field
     */
    public abstract String getAsText(long instant);

    /**
     * Get the human-readable, text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     *
     * @param partial    the partial instant to query
     * @param fieldValue the field value of this field, provided for performance
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsText(ReadablePartial partial, int fieldValue, Locale locale);

    /**
     * Get the human-readable, text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     *
     * @param partial the partial instant to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsText(ReadablePartial partial, Locale locale);

    /**
     * Get the human-readable, text value of this field from the field value.
     * If the specified locale is null, the default locale is used.
     *
     * @param fieldValue the numeric value to convert to text
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsText(int fieldValue, Locale locale);

    /**
     * Get the human-readable, short text value of this field from the
     * milliseconds.  If the specified locale is null, the default locale is used.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the short text value of the field
     */
    public abstract String getAsShortText(long instant, Locale locale);

    /**
     * Get the human-readable, short text value of this field from the
     * milliseconds.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the short text value of the field
     */
    public abstract String getAsShortText(long instant);

    /**
     * Get the human-readable, short text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     *
     * @param partial    the partial instant to query
     * @param fieldValue the field value of this field, provided for performance
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale);

    /**
     * Get the human-readable, short text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     *
     * @param partial the partial instant to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsShortText(ReadablePartial partial, Locale locale);

    /**
     * Get the human-readable, short text value of this field from the field value.
     * If the specified locale is null, the default locale is used.
     *
     * @param fieldValue the numeric value to convert to text
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public abstract String getAsShortText(int fieldValue, Locale locale);

    /**
     * Adds a value (which may be negative) to the millis value,
     * overflowing into larger fields if necessary.
     * <p>
     * The value will be added to this field. If the value is too large to be
     * added solely to this field, larger fields will increase as required.
     * Smaller fields should be unaffected, except where the result would be
     * an invalid value for a smaller field. In this case the smaller field is
     * adjusted to be in range.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 add six months is 2001-02-20<br>
     * 2000-08-20 add twenty months is 2002-04-20<br>
     * 2000-08-20 add minus nine months is 1999-11-20<br>
     * 2001-01-31 add one month  is 2001-02-28<br>
     * 2001-01-31 add two months is 2001-03-31<br>
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value   the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public abstract long add(long instant, int value);

    /**
     * Adds a value (which may be negative) to the millis value,
     * overflowing into larger fields if necessary.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value   the long value to add, in the units of the field
     * @return the updated milliseconds
     * @throws IllegalArgumentException if value is too large
     * @see #add(long, int)
     */
    public abstract long add(long instant, long value);

    /**
     * Adds a value (which may be negative) to the partial instant,
     * throwing an exception if the maximum size of the instant is reached.
     * <p>
     * The value will be added to this field, overflowing into larger fields
     * if necessary. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * Partial instants only contain some fields. This may result in a maximum
     * possible value, such as TimeOfDay being limited to 23:59:59:999. If this
     * limit is breached by the add an exception is thrown.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 add six months is 2000-02-20<br>
     * 2000-08-20 add twenty months is 2000-04-20<br>
     * 2000-08-20 add minus nine months is 2000-11-20<br>
     * 2001-01-31 add one month  is 2001-02-28<br>
     * 2001-01-31 add two months is 2001-03-31<br>
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values of the partial instant which should be updated
     * @param valueToAdd the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid or the maximum instant is reached
     */
    public abstract int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd);

    /**
     * Adds a value (which may be negative) to the partial instant,
     * wrapping the whole partial if the maximum size of the partial is reached.
     * <p>
     * The value will be added to this field, overflowing into larger fields
     * if necessary. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * Partial instants only contain some fields. This may result in a maximum
     * possible value, such as TimeOfDay normally being limited to 23:59:59:999.
     * If this limit is reached by the addition, this method will wrap back to
     * 00:00:00.000. In fact, you would generally only use this method for
     * classes that have a limitation such as this.
     * <p>
     * For example, in the ISO chronology:<br>
     * 10:20:30 add 20 minutes is 10:40:30<br>
     * 10:20:30 add 45 minutes is 11:05:30<br>
     * 10:20:30 add 16 hours is 02:20:30<br>
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the partial
     * @param values     the values of the partial instant which should be updated
     * @param valueToAdd the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid or the maximum instant is reached
     */
    public abstract int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd);

    /**
     * Adds a value (which may be negative) to the millis value,
     * wrapping within this field.
     * <p>
     * The value will be added to this field. If the value is too large to be
     * added solely to this field then it wraps. Larger fields are always
     * unaffected. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 addWrapField six months is 2000-02-20<br>
     * 2000-08-20 addWrapField twenty months is 2000-04-20<br>
     * 2000-08-20 addWrapField minus nine months is 2000-11-20<br>
     * 2001-01-31 addWrapField one month  is 2001-02-28<br>
     * 2001-01-31 addWrapField two months is 2001-03-31<br>
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value   the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public abstract long addWrapField(long instant, int value);

    /**
     * Adds a value (which may be negative) to the partial instant,
     * wrapping within this field.
     * <p>
     * The value will be added to this field. If the value is too large to be
     * added solely to this field then it wraps. Larger fields are always
     * unaffected. Smaller fields should be unaffected, except where the
     * result would be an invalid value for a smaller field. In this case the
     * smaller field is adjusted to be in range.
     * <p>
     * For example, in the ISO chronology:<br>
     * 2000-08-20 addWrapField six months is 2000-02-20<br>
     * 2000-08-20 addWrapField twenty months is 2000-04-20<br>
     * 2000-08-20 addWrapField minus nine months is 2000-11-20<br>
     * 2001-01-31 addWrapField one month  is 2001-02-28<br>
     * 2001-01-31 addWrapField two months is 2001-03-31<br>
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values of the partial instant which should be updated
     * @param valueToAdd the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid
     */
    public abstract int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd);

    /**
     * Computes the difference between two instants, as measured in the units
     * of this field. Any fractional units are dropped from the result. Calling
     * getDifference reverses the effect of calling add. In the following code:
     *
     * <pre>
     * long instant = ...
     * int v = ...
     * int age = getDifference(add(instant, v), instant);
     * </pre>
     * <p>
     * The value 'age' is the same as the value 'v'.
     *
     * @param minuendInstant    the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract from
     * @param subtrahendInstant the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract off the minuend
     * @return the difference in the units of this field
     */
    public abstract int getDifference(long minuendInstant, long subtrahendInstant);

    /**
     * Computes the difference between two instants, as measured in the units
     * of this field. Any fractional units are dropped from the result. Calling
     * getDifference reverses the effect of calling add. In the following code:
     *
     * <pre>
     * long instant = ...
     * long v = ...
     * long age = getDifferenceAsLong(add(instant, v), instant);
     * </pre>
     * <p>
     * The value 'age' is the same as the value 'v'.
     *
     * @param minuendInstant    the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract from
     * @param subtrahendInstant the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract off the minuend
     * @return the difference in the units of this field
     */
    public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant);

    /**
     * Sets a value in the milliseconds supplied.
     * <p>
     * The value of this field will be set.
     * If the value is invalid, an exception if thrown.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param value   the value to set, in the units of the field
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the value is invalid
     */
    public abstract long set(long instant, int value);

    /**
     * Sets a value in the milliseconds supplied, allowing a little leniency at the margins.
     * <p>
     * This is primarily an internal method used by parsing.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param value   the value to set, in the units of the field
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the value is invalid
     */
    public long setExtended(long instant, int value) {try{__CLR4_4_1memelgchoq5o.R.inc(806);
        __CLR4_4_1memelgchoq5o.R.inc(807);return set(instant, value);
    }finally{__CLR4_4_1memelgchoq5o.R.flushNeeded();}}

    /**
     * Sets a value using the specified partial instant.
     * <p>
     * The value of this field (specified by the index) will be set.
     * If the value is invalid, an exception if thrown.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values of the partial instant which should be updated
     * @param newValue   the value to set, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid
     */
    public abstract int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue);

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param text    the text value to set
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the text value is invalid
     */
    public abstract long set(long instant, String text, Locale locale);

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param text    the text value to set
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the text value is invalid
     */
    public abstract long set(long instant, String text);

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * If setting this field would make other fields invalid, then those fields
     * may be changed. For example if the current date is the 31st January, and
     * the month is set to February, the day would be invalid. Instead, the day
     * would be changed to the closest value - the 28th/29th February as appropriate.
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values of the partial instant which should be updated
     * @param text       the text value to set
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the passed in values
     * @throws IllegalArgumentException if the text value is invalid
     */
    public abstract int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale);

    // Extra information API
    //------------------------------------------------------------------------

    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "hour of day", then the duration is an hour.
     *
     * @return the duration of this field, or UnsupportedDurationField if field
     * has no duration
     */
    public abstract DurationField getDurationField();

    /**
     * Returns the range duration of this field. For example, if this field
     * represents "hour of day", then the range duration is a day.
     *
     * @return the range duration of this field, or null if field has no range
     */
    public abstract DurationField getRangeDurationField();

    /**
     * Returns whether this field is 'leap' for the specified instant.
     * <p>
     * For example, a leap year would return true, a non leap year would return
     * false.
     *
     * @param instant the instant to check for leap status
     * @return true if the field is 'leap'
     */
    public abstract boolean isLeap(long instant);

    /**
     * Gets the amount by which this field is 'leap' for the specified instant.
     * <p>
     * For example, a leap year would return one, a non leap year would return
     * zero.
     *
     * @param instant the instant to check for leap status
     * @return the amount, in units of the leap duration field, that the field is leap
     */
    public abstract int getLeapAmount(long instant);

    /**
     * If this field were to leap, then it would be in units described by the
     * returned duration. If this field doesn't ever leap, null is returned.
     *
     * @return the leap duration field if field can be leap, null if it can't
     */
    public abstract DurationField getLeapDurationField();

    /**
     * Get the minimum allowable value for this field.
     *
     * @return the minimum valid value for this field, in the units of the
     * field
     */
    public abstract int getMinimumValue();

    /**
     * Get the minimum value for this field evaluated at the specified time.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the minimum value for this field, in the units of the field
     */
    public abstract int getMinimumValue(long instant);

    /**
     * Get the minimum value for this field evaluated at the specified time.
     *
     * @param instant the partial instant to query
     * @return the minimum value for this field, in the units of the field
     */
    public abstract int getMinimumValue(ReadablePartial instant);

    /**
     * Get the minimum value for this field using the partial instant and
     * the specified values.
     *
     * @param instant the partial instant to query
     * @param values  the values to use
     * @return the minimum value for this field, in the units of the field
     */
    public abstract int getMinimumValue(ReadablePartial instant, int[] values);

    /**
     * Get the maximum allowable value for this field.
     *
     * @return the maximum valid value for this field, in the units of the
     * field
     */
    public abstract int getMaximumValue();

    /**
     * Get the maximum value for this field evaluated at the specified time.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the maximum value for this field, in the units of the field
     */
    public abstract int getMaximumValue(long instant);

    /**
     * Get the maximum value for this field evaluated at the specified time.
     *
     * @param instant the partial instant to query
     * @return the maximum value for this field, in the units of the field
     */
    public abstract int getMaximumValue(ReadablePartial instant);

    /**
     * Get the maximum value for this field using the partial instant and
     * the specified values.
     *
     * @param instant the partial instant to query
     * @param values  the values to use
     * @return the maximum value for this field, in the units of the field
     */
    public abstract int getMaximumValue(ReadablePartial instant, int[] values);

    /**
     * Get the maximum text value for this field.
     *
     * @param locale the locale to use for selecting a text symbol
     * @return the maximum text length
     */
    public abstract int getMaximumTextLength(Locale locale);

    /**
     * Get the maximum short text value for this field.
     *
     * @param locale the locale to use for selecting a text symbol
     * @return the maximum short text length
     */
    public abstract int getMaximumShortTextLength(Locale locale);

    // Calculation API
    //------------------------------------------------------------------------

    /**
     * Round to the lowest whole unit of this field. After rounding, the value
     * of this field and all fields of a higher magnitude are retained. The
     * fractional millis that cannot be expressed in whole increments of this
     * field are set to minimum.
     * <p>
     * For example, a datetime of 2002-11-02T23:34:56.789, rounded to the
     * lowest whole hour is 2002-11-02T23:00:00.000.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public abstract long roundFloor(long instant);

    /**
     * Round to the highest whole unit of this field. The value of this field
     * and all fields of a higher magnitude may be incremented in order to
     * achieve this result. The fractional millis that cannot be expressed in
     * whole increments of this field are set to minimum.
     * <p>
     * For example, a datetime of 2002-11-02T23:34:56.789, rounded to the
     * highest whole hour is 2002-11-03T00:00:00.000.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public abstract long roundCeiling(long instant);

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor or is exactly halfway, this function
     * behaves like roundFloor. If the millisecond value is closer to the
     * ceiling, this function behaves like roundCeiling.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public abstract long roundHalfFloor(long instant);

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor, this function behaves like roundFloor. If
     * the millisecond value is closer to the ceiling or is exactly halfway,
     * this function behaves like roundCeiling.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public abstract long roundHalfCeiling(long instant);

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor, this function behaves like roundFloor. If
     * the millisecond value is closer to the ceiling, this function behaves
     * like roundCeiling.
     * <p>
     * If the millisecond value is exactly halfway between the floor and
     * ceiling, the ceiling is chosen over the floor only if it makes this
     * field's value even.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public abstract long roundHalfEven(long instant);

    /**
     * Returns the fractional duration milliseconds of this field. In other
     * words, calling remainder returns the duration that roundFloor would
     * subtract.
     * <p>
     * For example, on a datetime of 2002-11-02T23:34:56.789, the remainder by
     * hour is 34 minutes and 56.789 seconds.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to get the
     *                remainder
     * @return remainder duration, in milliseconds
     */
    public abstract long remainder(long instant);

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public abstract String toString();

}
