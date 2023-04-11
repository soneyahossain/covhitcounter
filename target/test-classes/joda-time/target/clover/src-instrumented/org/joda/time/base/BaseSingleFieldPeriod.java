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
package org.joda.time.base;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

/**
 * BaseSingleFieldPeriod is an abstract implementation of ReadablePeriod that
 * manages a single duration field, such as days or minutes.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadablePeriod} interface should be used when different
 * kinds of period objects are to be referenced.
 * <p>
 * BaseSingleFieldPeriod subclasses may be mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @since 1.4
 */
public abstract class BaseSingleFieldPeriod
        implements ReadablePeriod, Comparable<BaseSingleFieldPeriod>, Serializable {public static class __CLR4_4_16eo6eolgchoqms{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,8423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version.
     */
    private static final long serialVersionUID = 9386874258972L;
    /**
     * The start of 1972.
     */
    private static final long START_1972 = 2L * 365L * 86400L * 1000L;

    /**
     * The period in the units of this period.
     */
    private volatile int iPeriod;

    //-----------------------------------------------------------------------

    /**
     * Calculates the number of whole units between the two specified datetimes.
     *
     * @param start the start instant, validated to not be null
     * @param end   the end instant, validated to not be null
     * @param field the field type to use, must not be null
     * @return the period
     * @throws IllegalArgumentException if the instants are null or invalid
     */
    protected static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8304);
        __CLR4_4_16eo6eolgchoqms.R.inc(8305);if ((((start == null || end == null)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8306)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8307)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8308);throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8309);Chronology chrono = DateTimeUtils.getInstantChronology(start);
        __CLR4_4_16eo6eolgchoqms.R.inc(8310);int amount = field.getField(chrono).getDifference(end.getMillis(), start.getMillis());
        __CLR4_4_16eo6eolgchoqms.R.inc(8311);return amount;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Calculates the number of whole units between the two specified partial datetimes.
     * <p>
     * The two partials must contain the same fields, for example you can specify
     * two <code>LocalDate</code> objects.
     *
     * @param start        the start partial date, validated to not be null
     * @param end          the end partial date, validated to not be null
     * @param zeroInstance the zero instance constant, must not be null
     * @return the period
     * @throws IllegalArgumentException if the partials are null or invalid
     */
    protected static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8312);
        __CLR4_4_16eo6eolgchoqms.R.inc(8313);if ((((start == null || end == null)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8314)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8315)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8316);throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8317);if ((((start.size() != end.size())&&(__CLR4_4_16eo6eolgchoqms.R.iget(8318)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8319)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8320);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8321);for (int i = 0, isize = start.size(); (((i < isize)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8322)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8323)==0&false)); i++) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8324);if ((((start.getFieldType(i) != end.getFieldType(i))&&(__CLR4_4_16eo6eolgchoqms.R.iget(8325)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8326)==0&false))) {{
                __CLR4_4_16eo6eolgchoqms.R.inc(8327);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }}
        }__CLR4_4_16eo6eolgchoqms.R.inc(8328);if ((((DateTimeUtils.isContiguous(start) == false)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8329)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8330)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8331);throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8332);Chronology chrono = DateTimeUtils.getChronology(start.getChronology()).withUTC();
        __CLR4_4_16eo6eolgchoqms.R.inc(8333);int[] values = chrono.get(zeroInstance, chrono.set(start, START_1972), chrono.set(end, START_1972));
        __CLR4_4_16eo6eolgchoqms.R.inc(8334);return values[0];
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Creates a new instance representing the number of complete standard length units
     * in the specified period.
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
     * @param period        the period to get the number of hours from, must not be null
     * @param millisPerUnit the number of milliseconds in one standard unit of this period
     * @throws IllegalArgumentException if the period contains imprecise duration values
     */
    protected static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8335);
        __CLR4_4_16eo6eolgchoqms.R.inc(8336);if ((((period == null)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8337)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8338)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8339);return 0;
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8340);Chronology iso = ISOChronology.getInstanceUTC();
        __CLR4_4_16eo6eolgchoqms.R.inc(8341);long duration = 0L;
        __CLR4_4_16eo6eolgchoqms.R.inc(8342);for (int i = 0; (((i < period.size())&&(__CLR4_4_16eo6eolgchoqms.R.iget(8343)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8344)==0&false)); i++) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8345);int value = period.getValue(i);
            __CLR4_4_16eo6eolgchoqms.R.inc(8346);if ((((value != 0)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8347)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8348)==0&false))) {{
                __CLR4_4_16eo6eolgchoqms.R.inc(8349);DurationField field = period.getFieldType(i).getField(iso);
                __CLR4_4_16eo6eolgchoqms.R.inc(8350);if ((((field.isPrecise() == false)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8351)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8352)==0&false))) {{
                    __CLR4_4_16eo6eolgchoqms.R.inc(8353);throw new IllegalArgumentException(
                            "Cannot convert period to duration as " + field.getName() +
                                    " is not precise in the period " + period);
                }
                }__CLR4_4_16eo6eolgchoqms.R.inc(8354);duration = FieldUtils.safeAdd(duration, FieldUtils.safeMultiply(field.getUnitMillis(), value));
            }
        }}
        }__CLR4_4_16eo6eolgchoqms.R.inc(8355);return FieldUtils.safeToInt(duration / millisPerUnit);
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new instance representing the specified period.
     *
     * @param period the period to represent
     */
    protected BaseSingleFieldPeriod(int period) {
        super();__CLR4_4_16eo6eolgchoqms.R.inc(8357);try{__CLR4_4_16eo6eolgchoqms.R.inc(8356);
        __CLR4_4_16eo6eolgchoqms.R.inc(8358);iPeriod = period;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the amount of this period.
     *
     * @return the period value
     */
    protected int getValue() {try{__CLR4_4_16eo6eolgchoqms.R.inc(8359);
        __CLR4_4_16eo6eolgchoqms.R.inc(8360);return iPeriod;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Sets the amount of this period.
     * To make a subclass immutable you must declare it final, or block this method.
     *
     * @param value the period value
     */
    protected void setValue(int value) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8361);
        __CLR4_4_16eo6eolgchoqms.R.inc(8362);iPeriod = value;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the single duration field type.
     *
     * @return the duration field type, not null
     */
    public abstract DurationFieldType getFieldType();

    /**
     * Gets the period type which matches the duration field type.
     *
     * @return the period type, not null
     */
    public abstract PeriodType getPeriodType();

    //-----------------------------------------------------------------------

    /**
     * Gets the number of fields that this period supports, which is one.
     *
     * @return the number of fields supported, which is one
     */
    public int size() {try{__CLR4_4_16eo6eolgchoqms.R.inc(8363);
        __CLR4_4_16eo6eolgchoqms.R.inc(8364);return 1;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     * <p>
     * The only index supported by this period is zero which returns the
     * field type of this class.
     *
     * @param index the index to retrieve, which must be zero
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DurationFieldType getFieldType(int index) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8365);
        __CLR4_4_16eo6eolgchoqms.R.inc(8366);if ((((index != 0)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8367)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8368)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8369);throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8370);return getFieldType();
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Gets the value at the specified index.
     * <p>
     * The only index supported by this period is zero.
     *
     * @param index the index to retrieve, which must be zero
     * @return the value of the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8371);
        __CLR4_4_16eo6eolgchoqms.R.inc(8372);if ((((index != 0)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8373)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8374)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8375);throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8376);return getValue();
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Gets the value of a duration field represented by this period.
     * <p>
     * If the field type specified does not match the type used by this class
     * then zero is returned.
     *
     * @param type the field type to query, null returns zero
     * @return the value of that field, zero if field not supported
     */
    public int get(DurationFieldType type) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8377);
        __CLR4_4_16eo6eolgchoqms.R.inc(8378);if ((((type == getFieldType())&&(__CLR4_4_16eo6eolgchoqms.R.iget(8379)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8380)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8381);return getValue();
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8382);return 0;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Checks whether the duration field specified is supported by this period.
     *
     * @param type the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8383);
        __CLR4_4_16eo6eolgchoqms.R.inc(8384);return (type == getFieldType());
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this period as an immutable <code>Period</code> object.
     * The period will use <code>PeriodType.standard()</code>.
     *
     * @return a <code>Period</code> representing the same number of days
     */
    public Period toPeriod() {try{__CLR4_4_16eo6eolgchoqms.R.inc(8385);
        __CLR4_4_16eo6eolgchoqms.R.inc(8386);return Period.ZERO.withFields(this);
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Get this object as a <code>MutablePeriod</code>.
     * <p>
     * This will always return a new <code>MutablePeriod</code> with the same fields.
     * The period will use <code>PeriodType.standard()</code>.
     *
     * @return a MutablePeriod using the same field set and values
     */
    public MutablePeriod toMutablePeriod() {try{__CLR4_4_16eo6eolgchoqms.R.inc(8387);
        __CLR4_4_16eo6eolgchoqms.R.inc(8388);MutablePeriod period = new MutablePeriod();
        __CLR4_4_16eo6eolgchoqms.R.inc(8389);period.add(this);
        __CLR4_4_16eo6eolgchoqms.R.inc(8390);return period;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this object with the specified object for equality based on the
     * value of each field. All ReadablePeriod instances are accepted, but only
     * those with a matching <code>PeriodType</code> can return true.
     *
     * @param period a readable period to check against
     * @return true if all the field values are equal, false if
     * not or the period is null or of an incorrect type
     */
    public boolean equals(Object period) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8391);
        __CLR4_4_16eo6eolgchoqms.R.inc(8392);if ((((this == period)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8393)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8394)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8395);return true;
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8396);if ((((period instanceof ReadablePeriod == false)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8397)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8398)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8399);return false;
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8400);ReadablePeriod other = (ReadablePeriod) period;
        __CLR4_4_16eo6eolgchoqms.R.inc(8401);return (other.getPeriodType() == getPeriodType() && other.getValue(0) == getValue());
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Gets a hash code for the period as defined by ReadablePeriod.
     *
     * @return a hash code
     */
    public int hashCode() {try{__CLR4_4_16eo6eolgchoqms.R.inc(8402);
        __CLR4_4_16eo6eolgchoqms.R.inc(8403);int total = 17;
        __CLR4_4_16eo6eolgchoqms.R.inc(8404);total = 27 * total + getValue();
        __CLR4_4_16eo6eolgchoqms.R.inc(8405);total = 27 * total + getFieldType().hashCode();
        __CLR4_4_16eo6eolgchoqms.R.inc(8406);return total;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

    /**
     * Compares this period to another object of the same class.
     *
     * @param other the other period, must not be null
     * @return zero if equal, positive if greater, negative if less
     * @throws NullPointerException if the other period is null
     * @throws ClassCastException   if the other period is of a different type
     */
    public int compareTo(BaseSingleFieldPeriod other) {try{__CLR4_4_16eo6eolgchoqms.R.inc(8407);
        __CLR4_4_16eo6eolgchoqms.R.inc(8408);if ((((other.getClass() != getClass())&&(__CLR4_4_16eo6eolgchoqms.R.iget(8409)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8410)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8411);throw new ClassCastException(getClass() + " cannot be compared to " + other.getClass());
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8412);int otherValue = other.getValue();
        __CLR4_4_16eo6eolgchoqms.R.inc(8413);int thisValue = getValue();
        __CLR4_4_16eo6eolgchoqms.R.inc(8414);if ((((thisValue > otherValue)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8415)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8416)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8417);return 1;
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8418);if ((((thisValue < otherValue)&&(__CLR4_4_16eo6eolgchoqms.R.iget(8419)!=0|true))||(__CLR4_4_16eo6eolgchoqms.R.iget(8420)==0&false))) {{
            __CLR4_4_16eo6eolgchoqms.R.inc(8421);return -1;
        }
        }__CLR4_4_16eo6eolgchoqms.R.inc(8422);return 0;
    }finally{__CLR4_4_16eo6eolgchoqms.R.flushNeeded();}}

}
