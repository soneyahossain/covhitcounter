/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/**
 * AbstractPartialFieldProperty is a base class for binding a
 * ReadablePartial to a DateTimeField.
 * <p>
 * It allows the date and time manipulation code to be field based yet
 * still easy to use.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class AbstractPartialFieldProperty {public static class __CLR4_4_1ablabllgchoqwj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,13460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractPartialFieldProperty() {
        super();__CLR4_4_1ablabllgchoqwj.R.inc(13378);try{__CLR4_4_1ablabllgchoqwj.R.inc(13377);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the field being used.
     *
     * @return the field
     */
    public abstract DateTimeField getField();

    /**
     * Gets the field type being used.
     *
     * @return the field type
     */
    public DateTimeFieldType getFieldType() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13379);
        __CLR4_4_1ablabllgchoqwj.R.inc(13380);return getField().getType();
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the name of the field.
     *
     * @return the field name
     */
    public String getName() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13381);
        __CLR4_4_1ablabllgchoqwj.R.inc(13382);return getField().getName();
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the partial instant being used.
     *
     * @return the partial instant
     */
    protected abstract ReadablePartial getReadablePartial();

    //-----------------------------------------------------------------------

    /**
     * Gets the value of this property from the instant.
     * <p>
     * For example, the following two lines of code are equivalent:
     * <pre>
     * partial.getDayOfMonth();
     * partial.dayOfMonth().get();
     * </pre>
     *
     * @return the current value
     */
    public abstract int get();

    /**
     * Gets the value of this property from the instant as a string.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * using <code>Integer.toString</code>. This method does NOT return
     * textual descriptions such as 'Monday' or 'January'.
     * See {@link #getAsText()} and {@link #getAsShortText()} for those.
     *
     * @return the current value
     * @see DateTimeField#get
     * @since 1.1
     */
    public String getAsString() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13383);
        __CLR4_4_1ablabllgchoqwj.R.inc(13384);return Integer.toString(get());
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the textual value of this property from the instant as a
     * string in the default locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Monday' in English.
     *
     * @return the current text value
     * @see DateTimeField#getAsText
     */
    public String getAsText() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13385);
        __CLR4_4_1ablabllgchoqwj.R.inc(13386);return getAsText(null);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the textual value of this property from the instant as a
     * string in the specified locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Monday' in English.
     *
     * @param locale locale to use for selecting a text symbol, null means default
     * @return the current text value
     * @see DateTimeField#getAsText
     */
    public String getAsText(Locale locale) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13387);
        __CLR4_4_1ablabllgchoqwj.R.inc(13388);return getField().getAsText(getReadablePartial(), get(), locale);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the short textual value of this property from the instant as a
     * string in the default locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Mon' in English.
     *
     * @return the current text value
     * @see DateTimeField#getAsShortText
     */
    public String getAsShortText() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13389);
        __CLR4_4_1ablabllgchoqwj.R.inc(13390);return getAsShortText(null);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the short textual value of this property from the instant as a
     * string in the specified locale.
     * <p>
     * This method returns the value converted to a <code>String</code>
     * returning the appropriate textual description wherever possible.
     * Thus, a day of week of 1 would return 'Mon' in English.
     *
     * @param locale locale to use for selecting a text symbol, null means default
     * @return the current text value
     * @see DateTimeField#getAsShortText
     */
    public String getAsShortText(Locale locale) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13391);
        __CLR4_4_1ablabllgchoqwj.R.inc(13392);return getField().getAsShortText(getReadablePartial(), get(), locale);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the duration per unit value of this field. For example, if this
     * field represents "hour of day", then the duration is an hour.
     *
     * @return the duration of this field, or UnsupportedDurationField
     */
    public DurationField getDurationField() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13393);
        __CLR4_4_1ablabllgchoqwj.R.inc(13394);return getField().getDurationField();
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Returns the range duration of this field. For example, if this field
     * represents "hour of day", then the range duration is a day.
     *
     * @return the range duration of this field, or null if field has no range
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13395);
        __CLR4_4_1ablabllgchoqwj.R.inc(13396);return getField().getRangeDurationField();
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the minimum value for the field ignoring the current time.
     *
     * @return the minimum value
     * @see DateTimeField#getMinimumValue
     */
    public int getMinimumValueOverall() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13397);
        __CLR4_4_1ablabllgchoqwj.R.inc(13398);return getField().getMinimumValue();
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the minimum value for this field given the current field values.
     *
     * @return the minimum value
     * @see DateTimeField#getMinimumValue
     */
    public int getMinimumValue() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13399);
        __CLR4_4_1ablabllgchoqwj.R.inc(13400);return getField().getMinimumValue(getReadablePartial());
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the maximum value for the field ignoring the current time.
     *
     * @return the maximum value
     * @see DateTimeField#getMaximumValue
     */
    public int getMaximumValueOverall() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13401);
        __CLR4_4_1ablabllgchoqwj.R.inc(13402);return getField().getMaximumValue();
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the maximum value for this field given the current field values.
     *
     * @return the maximum value
     * @see DateTimeField#getMaximumValue
     */
    public int getMaximumValue() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13403);
        __CLR4_4_1ablabllgchoqwj.R.inc(13404);return getField().getMaximumValue(getReadablePartial());
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the maximum text length for the field.
     *
     * @param locale optional locale to use for selecting a text symbol
     * @return the maximum length
     * @see DateTimeField#getMaximumTextLength
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13405);
        __CLR4_4_1ablabllgchoqwj.R.inc(13406);return getField().getMaximumTextLength(locale);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Gets the maximum short text length for the field.
     *
     * @param locale optional locale to use for selecting a text symbol
     * @return the maximum length
     * @see DateTimeField#getMaximumShortTextLength
     */
    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13407);
        __CLR4_4_1ablabllgchoqwj.R.inc(13408);return getField().getMaximumShortTextLength(locale);
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compare this field to the same field on another instant.
     * <p>
     * The comparison is based on the value of the same field type, irrespective
     * of any difference in chronology. Thus, if this property represents the
     * hourOfDay field, then the hourOfDay field of the other instant will be queried
     * whether in the same chronology or not.
     *
     * @param instant the instant to compare to
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws IllegalArgumentException if the instant is null or the instant
     *                                  doesn't support the field of this property
     */
    public int compareTo(ReadableInstant instant) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13409);
        __CLR4_4_1ablabllgchoqwj.R.inc(13410);if ((((instant == null)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13411)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13412)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13413);throw new IllegalArgumentException("The instant must not be null");
        }
        }__CLR4_4_1ablabllgchoqwj.R.inc(13414);int thisValue = get();
        __CLR4_4_1ablabllgchoqwj.R.inc(13415);int otherValue = instant.get(getFieldType());
        __CLR4_4_1ablabllgchoqwj.R.inc(13416);if ((((thisValue < otherValue)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13417)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13418)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13419);return -1;
        } }else {__CLR4_4_1ablabllgchoqwj.R.inc(13420);if ((((thisValue > otherValue)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13421)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13422)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13423);return 1;
        } }else {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13424);return 0;
        }
    }}}finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    /**
     * Compare this field to the same field on another partial instant.
     * <p>
     * The comparison is based on the value of the same field type, irrespective
     * of any difference in chronology. Thus, if this property represents the
     * hourOfDay field, then the hourOfDay field of the other partial will be queried
     * whether in the same chronology or not.
     *
     * @param partial the partial to compare to
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws IllegalArgumentException if the instant is null
     * @throws IllegalArgumentException if the field of this property cannot be queried
     *                                  on the specified instant
     */
    public int compareTo(ReadablePartial partial) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13425);
        __CLR4_4_1ablabllgchoqwj.R.inc(13426);if ((((partial == null)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13427)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13428)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13429);throw new IllegalArgumentException("The instant must not be null");
        }
        }__CLR4_4_1ablabllgchoqwj.R.inc(13430);int thisValue = get();
        __CLR4_4_1ablabllgchoqwj.R.inc(13431);int otherValue = partial.get(getFieldType());
        __CLR4_4_1ablabllgchoqwj.R.inc(13432);if ((((thisValue < otherValue)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13433)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13434)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13435);return -1;
        } }else {__CLR4_4_1ablabllgchoqwj.R.inc(13436);if ((((thisValue > otherValue)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13437)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13438)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13439);return 1;
        } }else {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13440);return 0;
        }
    }}}finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this property to another.
     *
     * @param object the object to compare to
     * @return true if equal
     */
    public boolean equals(Object object) {try{__CLR4_4_1ablabllgchoqwj.R.inc(13441);
        __CLR4_4_1ablabllgchoqwj.R.inc(13442);if ((((this == object)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13443)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13444)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13445);return true;
        }
        }__CLR4_4_1ablabllgchoqwj.R.inc(13446);if ((((object instanceof AbstractPartialFieldProperty == false)&&(__CLR4_4_1ablabllgchoqwj.R.iget(13447)!=0|true))||(__CLR4_4_1ablabllgchoqwj.R.iget(13448)==0&false))) {{
            __CLR4_4_1ablabllgchoqwj.R.inc(13449);return false;
        }
        }__CLR4_4_1ablabllgchoqwj.R.inc(13450);AbstractPartialFieldProperty other = (AbstractPartialFieldProperty) object;
        __CLR4_4_1ablabllgchoqwj.R.inc(13451);return
                get() == other.get() &&
                        getFieldType() == other.getFieldType() &&
                        FieldUtils.equals(getReadablePartial().getChronology(), other.getReadablePartial().getChronology());
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a suitable hashcode for the object.
     *
     * @return the hashcode
     * @since 1.3
     */
    public int hashCode() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13452);
        __CLR4_4_1ablabllgchoqwj.R.inc(13453);int hash = 19;
        __CLR4_4_1ablabllgchoqwj.R.inc(13454);hash = 13 * hash + get();
        __CLR4_4_1ablabllgchoqwj.R.inc(13455);hash = 13 * hash + getFieldType().hashCode();
        __CLR4_4_1ablabllgchoqwj.R.inc(13456);hash = 13 * hash + getReadablePartial().getChronology().hashCode();
        __CLR4_4_1ablabllgchoqwj.R.inc(13457);return hash;
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output a debugging string.
     *
     * @return debugging string
     */
    public String toString() {try{__CLR4_4_1ablabllgchoqwj.R.inc(13458);
        __CLR4_4_1ablabllgchoqwj.R.inc(13459);return "Property[" + getName() + "]";
    }finally{__CLR4_4_1ablabllgchoqwj.R.flushNeeded();}}

}
