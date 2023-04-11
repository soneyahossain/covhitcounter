/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * BasePartial is an abstract implementation of ReadablePartial that stores
 * data in array and <code>Chronology</code> fields.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link org.joda.time.ReadablePartial} interface should be used when different
 * kinds of partial objects are to be referenced.
 * <p>
 * BasePartial subclasses may be mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class BasePartial
        extends AbstractPartial
        implements ReadablePartial, Serializable {public static class __CLR4_4_166k66klgchoqm7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,8076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 2353678632973660L;

    /**
     * The chronology in use
     */
    private final Chronology iChronology;
    /**
     * The values of each field in this partial
     */
    private final int[] iValues;

    //-----------------------------------------------------------------------

    /**
     * Constructs a partial with the current time, using ISOChronology in
     * the default zone to extract the fields.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     */
    protected BasePartial() {
        this(DateTimeUtils.currentTimeMillis(), null);__CLR4_4_166k66klgchoqm7.R.inc(8013);try{__CLR4_4_166k66klgchoqm7.R.inc(8012);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Constructs a partial with the current time, using the specified chronology
     * and zone to extract the fields.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param chronology the chronology, null means ISOChronology in the default zone
     */
    protected BasePartial(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);__CLR4_4_166k66klgchoqm7.R.inc(8015);try{__CLR4_4_166k66klgchoqm7.R.inc(8014);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Constructs a partial extracting the partial fields from the specified
     * milliseconds using the ISOChronology in the default zone.
     * <p>
     * The constructor uses the default time zone, resulting in the local time
     * being initialised. Once the constructor is complete, all further calculations
     * are performed without reference to a timezone (by switching to UTC).
     *
     * @param instant the milliseconds from 1970-01-01T00:00:00Z
     */
    protected BasePartial(long instant) {
        this(instant, null);__CLR4_4_166k66klgchoqm7.R.inc(8017);try{__CLR4_4_166k66klgchoqm7.R.inc(8016);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Constructs a partial extracting the partial fields from the specified
     * milliseconds using the chronology provided.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param instant    the milliseconds from 1970-01-01T00:00:00Z
     * @param chronology the chronology, null means ISOChronology in the default zone
     */
    protected BasePartial(long instant, Chronology chronology) {
        super();__CLR4_4_166k66klgchoqm7.R.inc(8019);try{__CLR4_4_166k66klgchoqm7.R.inc(8018);
        __CLR4_4_166k66klgchoqm7.R.inc(8020);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_166k66klgchoqm7.R.inc(8021);iChronology = chronology.withUTC();
        __CLR4_4_166k66klgchoqm7.R.inc(8022);iValues = chronology.get(this, instant);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Constructs a partial from an Object that represents a time, using the
     * specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param instant    the datetime object
     * @param chronology the chronology, null means use converter
     * @throws IllegalArgumentException if the date is invalid
     */
    protected BasePartial(Object instant, Chronology chronology) {
        super();__CLR4_4_166k66klgchoqm7.R.inc(8024);try{__CLR4_4_166k66klgchoqm7.R.inc(8023);
        __CLR4_4_166k66klgchoqm7.R.inc(8025);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_166k66klgchoqm7.R.inc(8026);chronology = converter.getChronology(instant, chronology);
        __CLR4_4_166k66klgchoqm7.R.inc(8027);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_166k66klgchoqm7.R.inc(8028);iChronology = chronology.withUTC();
        __CLR4_4_166k66klgchoqm7.R.inc(8029);iValues = converter.getPartialValues(this, instant, chronology);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Constructs a partial from an Object that represents a time, using the
     * specified chronology.
     * <p>
     * The recognised object types are defined in
     * {@link org.joda.time.convert.ConverterManager ConverterManager} and
     * include ReadableInstant, String, Calendar and Date.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     *
     * @param instant    the datetime object
     * @param chronology the chronology, null means use converter
     * @param parser     if converting from a String, the given parser is preferred
     * @throws IllegalArgumentException if the date is invalid
     * @since 1.3
     */
    protected BasePartial(Object instant, Chronology chronology, DateTimeFormatter parser) {
        super();__CLR4_4_166k66klgchoqm7.R.inc(8031);try{__CLR4_4_166k66klgchoqm7.R.inc(8030);
        __CLR4_4_166k66klgchoqm7.R.inc(8032);PartialConverter converter = ConverterManager.getInstance().getPartialConverter(instant);
        __CLR4_4_166k66klgchoqm7.R.inc(8033);chronology = converter.getChronology(instant, chronology);
        __CLR4_4_166k66klgchoqm7.R.inc(8034);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_166k66klgchoqm7.R.inc(8035);iChronology = chronology.withUTC();
        __CLR4_4_166k66klgchoqm7.R.inc(8036);iValues = converter.getPartialValues(this, instant, chronology, parser);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Constructs a partial with specified time field values and chronology.
     * <p>
     * The constructor uses the time zone of the chronology specified.
     * Once the constructor is complete, all further calculations are performed
     * without reference to a timezone (by switching to UTC).
     * <p>
     * The array of values is assigned (not cloned) to the new instance.
     *
     * @param values     the new set of values
     * @param chronology the chronology, null means ISOChronology in the default zone
     * @throws IllegalArgumentException if the values are invalid
     */
    protected BasePartial(int[] values, Chronology chronology) {
        super();__CLR4_4_166k66klgchoqm7.R.inc(8038);try{__CLR4_4_166k66klgchoqm7.R.inc(8037);
        __CLR4_4_166k66klgchoqm7.R.inc(8039);chronology = DateTimeUtils.getChronology(chronology);
        __CLR4_4_166k66klgchoqm7.R.inc(8040);iChronology = chronology.withUTC();
        __CLR4_4_166k66klgchoqm7.R.inc(8041);chronology.validate(this, values);
        __CLR4_4_166k66klgchoqm7.R.inc(8042);iValues = values;
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Private constructor to be used by subclasses only which performs no validation.
     * <p>
     * Data is assigned (not cloned) to the new instance.
     *
     * @param base   the base partial
     * @param values the new set of values, not cloned, null means use base
     */
    protected BasePartial(BasePartial base, int[] values) {
        super();__CLR4_4_166k66klgchoqm7.R.inc(8044);try{__CLR4_4_166k66klgchoqm7.R.inc(8043);
        __CLR4_4_166k66klgchoqm7.R.inc(8045);iChronology = base.iChronology;
        __CLR4_4_166k66klgchoqm7.R.inc(8046);iValues = values;
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Private constructor to be used by subclasses only which performs no validation.
     * <p>
     * Data is assigned (not cloned) to the new instance.
     * This should not be used by mutable subclasses.
     *
     * @param base   the base partial
     * @param chrono the chronology to use, null means use base
     */
    protected BasePartial(BasePartial base, Chronology chrono) {
        super();__CLR4_4_166k66klgchoqm7.R.inc(8048);try{__CLR4_4_166k66klgchoqm7.R.inc(8047);
        __CLR4_4_166k66klgchoqm7.R.inc(8049);iChronology = chrono.withUTC();
        __CLR4_4_166k66klgchoqm7.R.inc(8050);iValues = base.iValues;
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the value of the field at the specified index.
     *
     * @param index the index
     * @return the value
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_166k66klgchoqm7.R.inc(8051);
        __CLR4_4_166k66klgchoqm7.R.inc(8052);return iValues[index];
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Gets an array of the value of each of the fields that this partial supports.
     * <p>
     * The fields are returned largest to smallest, for example Hour, Minute, Second.
     * Each value corresponds to the same array index as <code>getFields()</code>
     *
     * @return the current values of each field (cloned), largest to smallest
     */
    public int[] getValues() {try{__CLR4_4_166k66klgchoqm7.R.inc(8053);
        __CLR4_4_166k66klgchoqm7.R.inc(8054);return (int[]) iValues.clone();
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Gets the chronology of the partial which is never null.
     * <p>
     * The {@link Chronology} is the calculation engine behind the partial and
     * provides conversion and validation of the fields in a particular calendar system.
     *
     * @return the chronology, never null
     */
    public Chronology getChronology() {try{__CLR4_4_166k66klgchoqm7.R.inc(8055);
        __CLR4_4_166k66klgchoqm7.R.inc(8056);return iChronology;
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the value of the field at the specified index.
     * <p>
     * In version 2.0 and later, this method copies the array into the original.
     * This is because the instance variable has been changed to be final to satisfy the Java Memory Model.
     * This only impacts subclasses that are mutable.
     *
     * @param index the index
     * @param value the value to set
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected void setValue(int index, int value) {try{__CLR4_4_166k66klgchoqm7.R.inc(8057);
        __CLR4_4_166k66klgchoqm7.R.inc(8058);DateTimeField field = getField(index);
        __CLR4_4_166k66klgchoqm7.R.inc(8059);int[] values = field.set(this, index, iValues, value);
        __CLR4_4_166k66klgchoqm7.R.inc(8060);System.arraycopy(values, 0, iValues, 0, iValues.length);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Sets the values of all fields.
     * <p>
     * In version 2.0 and later, this method copies the array into the original.
     * This is because the instance variable has been changed to be final to satisfy the Java Memory Model.
     * This only impacts subclasses that are mutable.
     *
     * @param values the array of values
     */
    protected void setValues(int[] values) {try{__CLR4_4_166k66klgchoqm7.R.inc(8061);
        __CLR4_4_166k66klgchoqm7.R.inc(8062);getChronology().validate(this, values);
        __CLR4_4_166k66klgchoqm7.R.inc(8063);System.arraycopy(values, 0, iValues, 0, iValues.length);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the date using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_166k66klgchoqm7.R.inc(8064);
        __CLR4_4_166k66klgchoqm7.R.inc(8065);if ((((pattern == null)&&(__CLR4_4_166k66klgchoqm7.R.iget(8066)!=0|true))||(__CLR4_4_166k66klgchoqm7.R.iget(8067)==0&false))) {{
            __CLR4_4_166k66klgchoqm7.R.inc(8068);return toString();
        }
        }__CLR4_4_166k66klgchoqm7.R.inc(8069);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) throws IllegalArgumentException {try{__CLR4_4_166k66klgchoqm7.R.inc(8070);
        __CLR4_4_166k66klgchoqm7.R.inc(8071);if ((((pattern == null)&&(__CLR4_4_166k66klgchoqm7.R.iget(8072)!=0|true))||(__CLR4_4_166k66klgchoqm7.R.iget(8073)==0&false))) {{
            __CLR4_4_166k66klgchoqm7.R.inc(8074);return toString();
        }
        }__CLR4_4_166k66klgchoqm7.R.inc(8075);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_166k66klgchoqm7.R.flushNeeded();}}

}
