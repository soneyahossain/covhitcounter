/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.field;

import java.util.Locale;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;

/**
 * BaseDateTimeField provides the common behaviour for DateTimeField
 * implementations.
 * <p>
 * This class should generally not be used directly by API users. The
 * DateTimeField class should be used when different kinds of DateTimeField
 * objects are to be referenced.
 * <p>
 * BaseDateTimeField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @see DecoratedDateTimeField
 * @since 1.0
 */
public abstract class BaseDateTimeField extends DateTimeField {public static class __CLR4_4_1agxagxlgchoqx5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,13851,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The field type.
     */
    private final DateTimeFieldType iType;

    /**
     * Constructor.
     */
    protected BaseDateTimeField(DateTimeFieldType type) {
        super();__CLR4_4_1agxagxlgchoqx5.R.inc(13570);try{__CLR4_4_1agxagxlgchoqx5.R.inc(13569);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13571);if ((((type == null)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13572)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13573)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13574);throw new IllegalArgumentException("The type must not be null");
        }
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13575);iType = type;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    public final DateTimeFieldType getType() {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13576);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13577);return iType;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    public final String getName() {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13578);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13579);return iType.getName();
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * @return true always
     */
    public final boolean isSupported() {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13580);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13581);return true;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    // Main access API
    //------------------------------------------------------------------------

    /**
     * Get the value of this field from the milliseconds.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the value of the field, in the units of the field
     */
    public abstract int get(long instant);

    //-----------------------------------------------------------------------

    /**
     * Get the human-readable, text value of this field from the milliseconds.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsText(get(instant), locale).
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @param locale  the locale to use for selecting a text symbol, null means default
     * @return the text value of the field
     */
    public String getAsText(long instant, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13582);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13583);return getAsText(get(instant), locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from the milliseconds.
     * <p>
     * The default implementation calls {@link #getAsText(long, Locale)}.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the text value of the field
     */
    public final String getAsText(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13584);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13585);return getAsText(instant, null);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsText(fieldValue, locale).
     *
     * @param partial    the partial instant to query
     * @param fieldValue the field value of this field, provided for performance
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13586);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13587);return getAsText(fieldValue, locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation calls {@link ReadablePartial#get(DateTimeFieldType)}
     * and {@link #getAsText(ReadablePartial, int, Locale)}.
     *
     * @param partial the partial instant to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public final String getAsText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13588);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13589);return getAsText(partial, partial.get(getType()), locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, text value of this field from the field value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns Integer.toString(get(instant)).
     * <p>
     * Note: subclasses that override this method should also override
     * getMaximumTextLength.
     *
     * @param fieldValue the numeric value to convert to text
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13590);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13591);return Integer.toString(fieldValue);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the human-readable, short text value of this field from the milliseconds.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsShortText(get(instant), locale).
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @param locale  the locale to use for selecting a text symbol, null means default
     * @return the text value of the field
     */
    public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13592);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13593);return getAsShortText(get(instant), locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from the milliseconds.
     * <p>
     * The default implementation calls {@link #getAsShortText(long, Locale)}.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the text value of the field
     */
    public final String getAsShortText(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13594);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13595);return getAsShortText(instant, null);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsShortText(fieldValue, locale).
     *
     * @param partial    the partial instant to query
     * @param fieldValue the field value of this field, provided for performance
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13596);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13597);return getAsShortText(fieldValue, locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from a partial instant.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation calls {@link ReadablePartial#get(DateTimeFieldType)}
     * and {@link #getAsText(ReadablePartial, int, Locale)}.
     *
     * @param partial the partial instant to query
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public final String getAsShortText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13598);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13599);return getAsShortText(partial, partial.get(getType()), locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the human-readable, short text value of this field from the field value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * The default implementation returns getAsText(fieldValue, locale).
     * <p>
     * Note: subclasses that override this method should also override
     * getMaximumShortTextLength.
     *
     * @param fieldValue the numeric value to convert to text
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the text value of the field
     */
    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13600);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13601);return getAsText(fieldValue, locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Adds a value (which may be negative) to the instant value,
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
    public long add(long instant, int value) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13602);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13603);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the instant value,
     * overflowing into larger fields if necessary.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value   the long value to add, in the units of the field
     * @return the updated milliseconds
     * @throws IllegalArgumentException if value is too large
     * @see #add(long, int)
     */
    public long add(long instant, long value) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13604);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13605);return getDurationField().add(instant, value);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
     * @param fieldIndex the index of this field in the partial
     * @param values     the values of the partial instant which should be updated
     * @param valueToAdd the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid or the maximum instant is reached
     */
    public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13606);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13607);if ((((valueToAdd == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13608)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13609)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13610);return values;
        }
        // there are more efficient algorithms than this (especially for time only fields)
        // trouble is when dealing with days and months, so we use this technique of
        // adding/removing one from the larger field at a time
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13611);DateTimeField nextField = null;

        __CLR4_4_1agxagxlgchoqx5.R.inc(13612);while ((((valueToAdd > 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13613)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13614)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13615);int max = getMaximumValue(instant, values);
            __CLR4_4_1agxagxlgchoqx5.R.inc(13616);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1agxagxlgchoqx5.R.inc(13617);if ((((proposed <= max)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13618)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13619)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13620);values[fieldIndex] = (int) proposed;
                __CLR4_4_1agxagxlgchoqx5.R.inc(13621);break;
            }
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13622);if ((((nextField == null)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13623)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13624)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13625);if ((((fieldIndex == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13626)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13627)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13628);throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                }__CLR4_4_1agxagxlgchoqx5.R.inc(13629);nextField = instant.getField(fieldIndex - 1);
                // test only works if this field is UTC (ie. local)
                __CLR4_4_1agxagxlgchoqx5.R.inc(13630);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13631)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13632)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13633);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13634);valueToAdd -= (max + 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1agxagxlgchoqx5.R.inc(13635);values = nextField.add(instant, fieldIndex - 1, values, 1);  // add 1 to next bigger field
            __CLR4_4_1agxagxlgchoqx5.R.inc(13636);values[fieldIndex] = getMinimumValue(instant, values);  // reset this field to zero
        }
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13637);while ((((valueToAdd < 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13638)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13639)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13640);int min = getMinimumValue(instant, values);
            __CLR4_4_1agxagxlgchoqx5.R.inc(13641);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1agxagxlgchoqx5.R.inc(13642);if ((((proposed >= min)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13643)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13644)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13645);values[fieldIndex] = (int) proposed;
                __CLR4_4_1agxagxlgchoqx5.R.inc(13646);break;
            }
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13647);if ((((nextField == null)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13648)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13649)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13650);if ((((fieldIndex == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13651)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13652)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13653);throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                }__CLR4_4_1agxagxlgchoqx5.R.inc(13654);nextField = instant.getField(fieldIndex - 1);
                __CLR4_4_1agxagxlgchoqx5.R.inc(13655);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13656)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13657)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13658);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13659);valueToAdd -= (min - 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1agxagxlgchoqx5.R.inc(13660);values = nextField.add(instant, fieldIndex - 1, values, -1);  // subtract 1 from next bigger field
            __CLR4_4_1agxagxlgchoqx5.R.inc(13661);values[fieldIndex] = getMaximumValue(instant, values);  // reset this field to max value
        }

        }__CLR4_4_1agxagxlgchoqx5.R.inc(13662);return set(instant, fieldIndex, values, values[fieldIndex]);  // adjusts smaller fields
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
    public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13663);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13664);if ((((valueToAdd == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13665)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13666)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13667);return values;
        }
        // there are more efficient algorithms than this (especially for time only fields)
        // trouble is when dealing with days and months, so we use this technique of
        // adding/removing one from the larger field at a time
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13668);DateTimeField nextField = null;

        __CLR4_4_1agxagxlgchoqx5.R.inc(13669);while ((((valueToAdd > 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13670)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13671)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13672);int max = getMaximumValue(instant, values);
            __CLR4_4_1agxagxlgchoqx5.R.inc(13673);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1agxagxlgchoqx5.R.inc(13674);if ((((proposed <= max)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13675)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13676)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13677);values[fieldIndex] = (int) proposed;
                __CLR4_4_1agxagxlgchoqx5.R.inc(13678);break;
            }
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13679);if ((((nextField == null)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13680)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13681)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13682);if ((((fieldIndex == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13683)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13684)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13685);valueToAdd -= (max + 1) - values[fieldIndex];
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13686);values[fieldIndex] = getMinimumValue(instant, values);
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13687);continue;
                }
                }__CLR4_4_1agxagxlgchoqx5.R.inc(13688);nextField = instant.getField(fieldIndex - 1);
                // test only works if this field is UTC (ie. local)
                __CLR4_4_1agxagxlgchoqx5.R.inc(13689);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13690)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13691)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13692);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13693);valueToAdd -= (max + 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1agxagxlgchoqx5.R.inc(13694);values = nextField.addWrapPartial(instant, fieldIndex - 1, values, 1);  // add 1 to next bigger field
            __CLR4_4_1agxagxlgchoqx5.R.inc(13695);values[fieldIndex] = getMinimumValue(instant, values);  // reset this field to zero
        }
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13696);while ((((valueToAdd < 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13697)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13698)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13699);int min = getMinimumValue(instant, values);
            __CLR4_4_1agxagxlgchoqx5.R.inc(13700);long proposed = values[fieldIndex] + valueToAdd;
            __CLR4_4_1agxagxlgchoqx5.R.inc(13701);if ((((proposed >= min)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13702)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13703)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13704);values[fieldIndex] = (int) proposed;
                __CLR4_4_1agxagxlgchoqx5.R.inc(13705);break;
            }
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13706);if ((((nextField == null)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13707)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13708)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13709);if ((((fieldIndex == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13710)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13711)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13712);valueToAdd -= (min - 1) - values[fieldIndex];
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13713);values[fieldIndex] = getMaximumValue(instant, values);
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13714);continue;
                }
                }__CLR4_4_1agxagxlgchoqx5.R.inc(13715);nextField = instant.getField(fieldIndex - 1);
                __CLR4_4_1agxagxlgchoqx5.R.inc(13716);if ((((getRangeDurationField().getType() != nextField.getDurationField().getType())&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13717)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13718)==0&false))) {{
                    __CLR4_4_1agxagxlgchoqx5.R.inc(13719);throw new IllegalArgumentException("Fields invalid for add");
                }
            }}
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13720);valueToAdd -= (min - 1) - values[fieldIndex];  // reduce the amount to add
            __CLR4_4_1agxagxlgchoqx5.R.inc(13721);values = nextField.addWrapPartial(instant, fieldIndex - 1, values, -1);  // subtract 1 from next bigger field
            __CLR4_4_1agxagxlgchoqx5.R.inc(13722);values[fieldIndex] = getMaximumValue(instant, values);  // reset this field to max value
        }

        }__CLR4_4_1agxagxlgchoqx5.R.inc(13723);return set(instant, fieldIndex, values, values[fieldIndex]);  // adjusts smaller fields
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Adds a value (which may be negative) to the instant value,
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
     * <p>
     * The default implementation internally calls set. Subclasses are
     * encouraged to provide a more efficient implementation.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to add to
     * @param value   the value to add, in the units of the field
     * @return the updated milliseconds
     */
    public long addWrapField(long instant, int value) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13724);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13725);int current = get(instant);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13726);int wrapped = FieldUtils.getWrappedValue
                (current, value, getMinimumValue(instant), getMaximumValue(instant));
        __CLR4_4_1agxagxlgchoqx5.R.inc(13727);return set(instant, wrapped);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
     * <p>
     * The default implementation internally calls set. Subclasses are
     * encouraged to provide a more efficient implementation.
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values of the partial instant which should be updated
     * @param valueToAdd the value to add, in the units of the field
     * @return the passed in values
     * @throws IllegalArgumentException if the value is invalid
     */
    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13728);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13729);int current = values[fieldIndex];
        __CLR4_4_1agxagxlgchoqx5.R.inc(13730);int wrapped = FieldUtils.getWrappedValue
                (current, valueToAdd, getMinimumValue(instant), getMaximumValue(instant));
        __CLR4_4_1agxagxlgchoqx5.R.inc(13731);return set(instant, fieldIndex, values, wrapped);  // adjusts smaller fields
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

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
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13732);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13733);return getDurationField().getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13734);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13735);return getDurationField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
     * @param partial    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values to update
     * @param newValue   the value to set, in the units of the field
     * @return the updated values
     * @throws IllegalArgumentException if the value is invalid
     */
    public int[] set(ReadablePartial partial, int fieldIndex, int[] values, int newValue) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13736);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13737);FieldUtils.verifyValueBounds(this, newValue, getMinimumValue(partial, values), getMaximumValue(partial, values));
        __CLR4_4_1agxagxlgchoqx5.R.inc(13738);values[fieldIndex] = newValue;

        // may need to adjust smaller fields
        __CLR4_4_1agxagxlgchoqx5.R.inc(13739);for (int i = fieldIndex + 1; (((i < partial.size())&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13740)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13741)==0&false)); i++) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13742);DateTimeField field = partial.getField(i);
            __CLR4_4_1agxagxlgchoqx5.R.inc(13743);if ((((values[i] > field.getMaximumValue(partial, values))&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13744)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13745)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13746);values[i] = field.getMaximumValue(partial, values);
            }
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13747);if ((((values[i] < field.getMinimumValue(partial, values))&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13748)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13749)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13750);values[i] = field.getMinimumValue(partial, values);
            }
        }}
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13751);return values;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * This implementation uses <code>convertText(String, Locale)</code> and
     * {@link #set(long, int)}.
     * <p>
     * Note: subclasses that override this method should also override
     * getAsText.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param text    the text value to set
     * @param locale  the locale to use for selecting a text symbol, null for default
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the text value is invalid
     */
    public long set(long instant, String text, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13752);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13753);int value = convertText(text, locale);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13754);return set(instant, value);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * <p>
     * This implementation uses {@link #set(long, String, Locale)}.
     * <p>
     * Note: subclasses that override this method should also override getAsText.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to set in
     * @param text    the text value to set
     * @return the updated milliseconds
     * @throws IllegalArgumentException if the text value is invalid
     */
    public final long set(long instant, String text) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13755);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13756);return set(instant, text, null);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Sets a value in the milliseconds supplied from a human-readable, text value.
     * If the specified locale is null, the default locale is used.
     * <p>
     * This implementation uses <code>convertText(String, Locale)</code> and
     * {@link #set(ReadablePartial, int, int[], int)}.
     *
     * @param instant    the partial instant
     * @param fieldIndex the index of this field in the instant
     * @param values     the values of the partial instant which should be updated
     * @param text       the text value to set
     * @param locale     the locale to use for selecting a text symbol, null for default
     * @return the passed in values
     * @throws IllegalArgumentException if the text value is invalid
     */
    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13757);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13758);int value = convertText(text, locale);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13759);return set(instant, fieldIndex, values, value);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Convert the specified text and locale into a value.
     *
     * @param text   the text to convert
     * @param locale the locale to convert using
     * @return the value extracted from the text
     * @throws IllegalArgumentException if the text is invalid
     */
    protected int convertText(String text, Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13760);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13761);try {
            __CLR4_4_1agxagxlgchoqx5.R.inc(13762);return Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            __CLR4_4_1agxagxlgchoqx5.R.inc(13763);throw new IllegalFieldValueException(getType(), text);
        }
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    // Extra information API
    //------------------------------------------------------------------------

    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "hour of day", then the unit duration is an hour.
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
     * <p>
     * This implementation returns false.
     *
     * @return true if the field is 'leap'
     */
    public boolean isLeap(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13764);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13765);return false;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Gets the amount by which this field is 'leap' for the specified instant.
     * <p>
     * For example, a leap year would return one, a non leap year would return
     * zero.
     * <p>
     * This implementation returns zero.
     */
    public int getLeapAmount(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13766);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13767);return 0;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * If this field were to leap, then it would be in units described by the
     * returned duration. If this field doesn't ever leap, null is returned.
     * <p>
     * This implementation returns null.
     */
    public DurationField getLeapDurationField() {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13768);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13769);return null;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the minimum allowable value for this field.
     *
     * @return the minimum valid value for this field, in the units of the
     * field
     */
    public abstract int getMinimumValue();

    /**
     * Get the minimum value for this field evaluated at the specified time.
     * <p>
     * This implementation returns the same as {@link #getMinimumValue()}.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the minimum value for this field, in the units of the field
     */
    public int getMinimumValue(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13770);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13771);return getMinimumValue();
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the minimum value for this field evaluated at the specified instant.
     * <p>
     * This implementation returns the same as {@link #getMinimumValue()}.
     *
     * @param instant the partial instant to query
     * @return the minimum value for this field, in the units of the field
     */
    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13772);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13773);return getMinimumValue();
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the minimum value for this field using the partial instant and
     * the specified values.
     * <p>
     * This implementation returns the same as {@link #getMinimumValue(ReadablePartial)}.
     *
     * @param instant the partial instant to query
     * @param values  the values to use
     * @return the minimum value for this field, in the units of the field
     */
    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13774);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13775);return getMinimumValue(instant);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the maximum allowable value for this field.
     *
     * @return the maximum valid value for this field, in the units of the
     * field
     */
    public abstract int getMaximumValue();

    /**
     * Get the maximum value for this field evaluated at the specified time.
     * <p>
     * This implementation returns the same as {@link #getMaximumValue()}.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to query
     * @return the maximum value for this field, in the units of the field
     */
    public int getMaximumValue(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13776);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13777);return getMaximumValue();
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the maximum value for this field evaluated at the specified instant.
     * <p>
     * This implementation returns the same as {@link #getMaximumValue()}.
     *
     * @param instant the partial instant to query
     * @return the maximum value for this field, in the units of the field
     */
    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13778);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13779);return getMaximumValue();
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the maximum value for this field using the partial instant and
     * the specified values.
     * <p>
     * This implementation returns the same as {@link #getMaximumValue(ReadablePartial)}.
     *
     * @param instant the partial instant to query
     * @param values  the values to use
     * @return the maximum value for this field, in the units of the field
     */
    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13780);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13781);return getMaximumValue(instant);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the maximum text value for this field. The default implementation
     * returns the equivalent of Integer.toString(getMaximumValue()).length().
     *
     * @param locale the locale to use for selecting a text symbol
     * @return the maximum text length
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13782);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13783);int max = getMaximumValue();
        __CLR4_4_1agxagxlgchoqx5.R.inc(13784);if ((((max >= 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13785)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13786)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13787);if ((((max < 10)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13788)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13789)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13790);return 1;
            } }else {__CLR4_4_1agxagxlgchoqx5.R.inc(13791);if ((((max < 100)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13792)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13793)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13794);return 2;
            } }else {__CLR4_4_1agxagxlgchoqx5.R.inc(13795);if ((((max < 1000)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13796)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13797)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13798);return 3;
            }
        }}}}
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13799);return Integer.toString(max).length();
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get the maximum short text value for this field. The default
     * implementation returns getMaximumTextLength().
     *
     * @param locale the locale to use for selecting a text symbol
     * @return the maximum short text length
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13800);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13801);return getMaximumTextLength(locale);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
     * <p>
     * The default implementation calls roundFloor, and if the instant is
     * modified as a result, adds one field unit. Subclasses are encouraged to
     * provide a more efficient implementation.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundCeiling(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13802);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13803);long newInstant = roundFloor(instant);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13804);if ((((newInstant != instant)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13805)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13806)==0&false))) {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13807);instant = add(newInstant, 1);
        }
        }__CLR4_4_1agxagxlgchoqx5.R.inc(13808);return instant;
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor or is exactly halfway, this function
     * behaves like roundFloor. If the millisecond value is closer to the
     * ceiling, this function behaves like roundCeiling.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundHalfFloor(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13809);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13810);long floor = roundFloor(instant);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13811);long ceiling = roundCeiling(instant);

        __CLR4_4_1agxagxlgchoqx5.R.inc(13812);long diffFromFloor = instant - floor;
        __CLR4_4_1agxagxlgchoqx5.R.inc(13813);long diffToCeiling = ceiling - instant;

        __CLR4_4_1agxagxlgchoqx5.R.inc(13814);if ((((diffFromFloor <= diffToCeiling)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13815)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13816)==0&false))) {{
            // Closer to the floor, or halfway - round floor
            __CLR4_4_1agxagxlgchoqx5.R.inc(13817);return floor;
        } }else {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13818);return ceiling;
        }
    }}finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Round to the nearest whole unit of this field. If the given millisecond
     * value is closer to the floor, this function behaves like roundFloor. If
     * the millisecond value is closer to the ceiling or is exactly halfway,
     * this function behaves like roundCeiling.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to round
     * @return rounded milliseconds
     */
    public long roundHalfCeiling(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13819);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13820);long floor = roundFloor(instant);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13821);long ceiling = roundCeiling(instant);

        __CLR4_4_1agxagxlgchoqx5.R.inc(13822);long diffFromFloor = instant - floor;
        __CLR4_4_1agxagxlgchoqx5.R.inc(13823);long diffToCeiling = ceiling - instant;

        __CLR4_4_1agxagxlgchoqx5.R.inc(13824);if ((((diffToCeiling <= diffFromFloor)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13825)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13826)==0&false))) {{
            // Closer to the ceiling, or halfway - round ceiling
            __CLR4_4_1agxagxlgchoqx5.R.inc(13827);return ceiling;
        } }else {{
            __CLR4_4_1agxagxlgchoqx5.R.inc(13828);return floor;
        }
    }}finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

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
    public long roundHalfEven(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13829);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13830);long floor = roundFloor(instant);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13831);long ceiling = roundCeiling(instant);

        __CLR4_4_1agxagxlgchoqx5.R.inc(13832);long diffFromFloor = instant - floor;
        __CLR4_4_1agxagxlgchoqx5.R.inc(13833);long diffToCeiling = ceiling - instant;

        __CLR4_4_1agxagxlgchoqx5.R.inc(13834);if ((((diffFromFloor < diffToCeiling)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13835)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13836)==0&false))) {{
            // Closer to the floor - round floor
            __CLR4_4_1agxagxlgchoqx5.R.inc(13837);return floor;
        } }else {__CLR4_4_1agxagxlgchoqx5.R.inc(13838);if ((((diffToCeiling < diffFromFloor)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13839)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13840)==0&false))) {{
            // Closer to the ceiling - round ceiling
            __CLR4_4_1agxagxlgchoqx5.R.inc(13841);return ceiling;
        } }else {{
            // Round to the instant that makes this field even. If both values
            // make this field even (unlikely), favor the ceiling.
            __CLR4_4_1agxagxlgchoqx5.R.inc(13842);if (((((get(ceiling) & 1) == 0)&&(__CLR4_4_1agxagxlgchoqx5.R.iget(13843)!=0|true))||(__CLR4_4_1agxagxlgchoqx5.R.iget(13844)==0&false))) {{
                __CLR4_4_1agxagxlgchoqx5.R.inc(13845);return ceiling;
            }
            }__CLR4_4_1agxagxlgchoqx5.R.inc(13846);return floor;
        }
    }}}finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Returns the fractional duration milliseconds of this field. In other
     * words, calling remainder returns the duration that roundFloor would
     * subtract.
     * <p>
     * For example, on a datetime of 2002-11-02T23:34:56.789, the remainder by
     * hour is 34 minutes and 56.789 seconds.
     * <p>
     * The default implementation computes
     * <code>instant - roundFloor(instant)</code>. Subclasses are encouraged to
     * provide a more efficient implementation.
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z to get the
     *                remainder
     * @return remainder duration, in milliseconds
     */
    public long remainder(long instant) {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13847);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13848);return instant - roundFloor(instant);
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1agxagxlgchoqx5.R.inc(13849);
        __CLR4_4_1agxagxlgchoqx5.R.inc(13850);return "DateTimeField[" + getName() + ']';
    }finally{__CLR4_4_1agxagxlgchoqx5.R.flushNeeded();}}

}
