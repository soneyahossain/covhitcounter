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

import java.util.Date;

import org.joda.convert.ToString;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * AbstractInstant provides the common behaviour for instant classes.
 * <p>
 * This class has no concept of a chronology, all methods work on the
 * millisecond instant.
 * <p>
 * This class should generally not be used directly by API users. The
 * {@link ReadableInstant} interface should be used when different
 * kinds of date/time objects are to be referenced.
 * <p>
 * Whenever you want to implement <code>ReadableInstant</code> you should
 * extend this class.
 * <p>
 * AbstractInstant itself is thread-safe and immutable, but subclasses may be
 * mutable and not thread-safe.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class AbstractInstant implements ReadableInstant {public static class __CLR4_4_15ow5owlgchoql1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,7480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractInstant() {
        super();__CLR4_4_15ow5owlgchoql1.R.inc(7377);try{__CLR4_4_15ow5owlgchoql1.R.inc(7376);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the time zone of the instant from the chronology.
     *
     * @return the DateTimeZone that the instant is using, never null
     */
    public DateTimeZone getZone() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7378);
        __CLR4_4_15ow5owlgchoql1.R.inc(7379);return getChronology().getZone();
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get the value of one of the fields of a datetime using the chronology of the instant.
     * <p>
     * This method uses the chronology of the instant to obtain the value.
     * For example:
     * <pre>
     * DateTime dt = new DateTime();
     * int year = dt.get(DateTimeFieldType.year());
     * </pre>
     *
     * @param type a field type, usually obtained from DateTimeFieldType, not null
     * @return the value of that field
     * @throws IllegalArgumentException if the field type is null
     */
    public int get(DateTimeFieldType type) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7380);
        __CLR4_4_15ow5owlgchoql1.R.inc(7381);if ((((type == null)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7382)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7383)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7384);throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7385);return type.getField(getChronology()).get(getMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Checks if the field type specified is supported by this instant and chronology.
     * This can be used to avoid exceptions in {@link #get(DateTimeFieldType)}.
     *
     * @param type a field type, usually obtained from DateTimeFieldType
     * @return true if the field type is supported
     */
    public boolean isSupported(DateTimeFieldType type) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7386);
        __CLR4_4_15ow5owlgchoql1.R.inc(7387);if ((((type == null)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7388)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7389)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7390);return false;
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7391);return type.getField(getChronology()).isSupported();
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get the value of one of the fields of a datetime.
     * <p>
     * This could be used to get a field using a different Chronology.
     * For example:
     * <pre>
     * Instant dt = new Instant();
     * int gjYear = dt.get(Chronology.getCoptic().year());
     * </pre>
     *
     * @param field the DateTimeField to use, not null
     * @return the value
     * @throws IllegalArgumentException if the field is null
     */
    public int get(DateTimeField field) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7392);
        __CLR4_4_15ow5owlgchoql1.R.inc(7393);if ((((field == null)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7394)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7395)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7396);throw new IllegalArgumentException("The DateTimeField must not be null");
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7397);return field.get(getMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this object as an Instant.
     *
     * @return an Instant using the same millis
     */
    public Instant toInstant() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7398);
        __CLR4_4_15ow5owlgchoql1.R.inc(7399);return new Instant(getMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a DateTime in the same zone.
     *
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7400);
        __CLR4_4_15ow5owlgchoql1.R.inc(7401);return new DateTime(getMillis(), getZone());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using ISOChronology in the same zone.
     *
     * @return a DateTime using the same millis with ISOChronology
     */
    public DateTime toDateTimeISO() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7402);
        __CLR4_4_15ow5owlgchoql1.R.inc(7403);return new DateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using the same chronology but a different zone.
     *
     * @param zone time zone to apply, or default if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(DateTimeZone zone) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7404);
        __CLR4_4_15ow5owlgchoql1.R.inc(7405);Chronology chrono = DateTimeUtils.getChronology(getChronology());
        __CLR4_4_15ow5owlgchoql1.R.inc(7406);chrono = chrono.withZone(zone);
        __CLR4_4_15ow5owlgchoql1.R.inc(7407);return new DateTime(getMillis(), chrono);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a DateTime using the given chronology and its zone.
     *
     * @param chronology chronology to apply, or ISOChronology if null
     * @return a DateTime using the same millis
     */
    public DateTime toDateTime(Chronology chronology) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7408);
        __CLR4_4_15ow5owlgchoql1.R.inc(7409);return new DateTime(getMillis(), chronology);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    // NOTE: Although the toMutableDateTime methods could check to see if this
    // is already a MutableDateTime and return this casted, it makes it too
    // easy to mistakenly modify ReadableDateTime input parameters. Always
    // returning a copy prevents this.

    /**
     * Get this object as a MutableDateTime in the same zone.
     *
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7410);
        __CLR4_4_15ow5owlgchoql1.R.inc(7411);return new MutableDateTime(getMillis(), getZone());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using ISOChronology in the same zone.
     *
     * @return a MutableDateTime using the same millis with ISOChronology
     */
    public MutableDateTime toMutableDateTimeISO() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7412);
        __CLR4_4_15ow5owlgchoql1.R.inc(7413);return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using the same chronology but a different zone.
     *
     * @param zone time zone to apply, or default if null
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime(DateTimeZone zone) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7414);
        __CLR4_4_15ow5owlgchoql1.R.inc(7415);Chronology chrono = DateTimeUtils.getChronology(getChronology());
        __CLR4_4_15ow5owlgchoql1.R.inc(7416);chrono = chrono.withZone(zone);
        __CLR4_4_15ow5owlgchoql1.R.inc(7417);return new MutableDateTime(getMillis(), chrono);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Get this object as a MutableDateTime using the given chronology and its zone.
     *
     * @param chronology chronology to apply, or ISOChronology if null
     * @return a MutableDateTime using the same millis
     */
    public MutableDateTime toMutableDateTime(Chronology chronology) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7418);
        __CLR4_4_15ow5owlgchoql1.R.inc(7419);return new MutableDateTime(getMillis(), chronology);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the date time as a <code>java.util.Date</code>.
     * <p>
     * The <code>Date</code> object created has exactly the same millisecond
     * instant as this object.
     *
     * @return a Date initialised with this datetime
     */
    public Date toDate() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7420);
        __CLR4_4_15ow5owlgchoql1.R.inc(7421);return new Date(getMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this object with the specified object for equality based
     * on the millisecond instant, chronology and time zone.
     * <p>
     * Two objects which represent the same instant in time, but are in
     * different time zones (based on time zone id), will be considered to
     * be different. Only two objects with the same {@link DateTimeZone},
     * {@link Chronology} and instant are equal.
     * <p>
     * See {@link #isEqual(ReadableInstant)} for an equals method that
     * ignores the Chronology and time zone.
     * <p>
     * All ReadableInstant instances are accepted.
     *
     * @param readableInstant a readable instant to check against
     * @return true if millisecond and chronology are equal, false if
     * not or the instant is null or of an incorrect type
     */
    public boolean equals(Object readableInstant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7422);
        // must be to fulfil ReadableInstant contract
        __CLR4_4_15ow5owlgchoql1.R.inc(7423);if ((((this == readableInstant)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7424)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7425)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7426);return true;
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7427);if ((((readableInstant instanceof ReadableInstant == false)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7428)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7429)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7430);return false;
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7431);ReadableInstant otherInstant = (ReadableInstant) readableInstant;
        __CLR4_4_15ow5owlgchoql1.R.inc(7432);return
                getMillis() == otherInstant.getMillis() &&
                        FieldUtils.equals(getChronology(), otherInstant.getChronology());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Gets a hash code for the instant as defined in <code>ReadableInstant</code>.
     *
     * @return a suitable hash code
     */
    public int hashCode() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7433);
        // must be to fulfil ReadableInstant contract
        __CLR4_4_15ow5owlgchoql1.R.inc(7434);return
                ((int) (getMillis() ^ (getMillis() >>> 32))) +
                        (getChronology().hashCode());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Compares this object with the specified object for ascending
     * millisecond instant order. This ordering is inconsistent with
     * equals, as it ignores the Chronology.
     * <p>
     * All ReadableInstant instances are accepted.
     *
     * @param other a readable instant to check against
     * @return negative value if this is less, 0 if equal, or positive value if greater
     * @throws NullPointerException if the object is null
     * @throws ClassCastException   if the object type is not supported
     */
    public int compareTo(ReadableInstant other) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7435);
        __CLR4_4_15ow5owlgchoql1.R.inc(7436);if ((((this == other)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7437)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7438)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7439);return 0;
        }

        }__CLR4_4_15ow5owlgchoql1.R.inc(7440);long otherMillis = other.getMillis();
        __CLR4_4_15ow5owlgchoql1.R.inc(7441);long thisMillis = getMillis();

        // cannot do (thisMillis - otherMillis) as can overflow
        __CLR4_4_15ow5owlgchoql1.R.inc(7442);if ((((thisMillis == otherMillis)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7443)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7444)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7445);return 0;
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7446);if ((((thisMillis < otherMillis)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7447)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7448)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7449);return -1;
        } }else {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7450);return 1;
        }
    }}finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this instant strictly after the millisecond instant passed in
     * comparing solely by millisecond.
     *
     * @param instant a millisecond instant to check against
     * @return true if this instant is strictly after the instant passed in
     */
    public boolean isAfter(long instant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7451);
        __CLR4_4_15ow5owlgchoql1.R.inc(7452);return (getMillis() > instant);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Is this instant strictly after the current instant
     * comparing solely by millisecond.
     *
     * @return true if this instant is strictly after the current instant
     */
    public boolean isAfterNow() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7453);
        __CLR4_4_15ow5owlgchoql1.R.inc(7454);return isAfter(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Is this instant strictly after the instant passed in
     * comparing solely by millisecond.
     *
     * @param instant an instant to check against, null means now
     * @return true if the instant is strictly after the instant passed in
     */
    public boolean isAfter(ReadableInstant instant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7455);
        __CLR4_4_15ow5owlgchoql1.R.inc(7456);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_15ow5owlgchoql1.R.inc(7457);return isAfter(instantMillis);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this instant strictly before the millisecond instant passed in
     * comparing solely by millisecond.
     *
     * @param instant a millisecond instant to check against
     * @return true if this instant is strictly before the instant passed in
     */
    public boolean isBefore(long instant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7458);
        __CLR4_4_15ow5owlgchoql1.R.inc(7459);return (getMillis() < instant);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Is this instant strictly before the current instant
     * comparing solely by millisecond.
     *
     * @return true if this instant is strictly before the current instant
     */
    public boolean isBeforeNow() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7460);
        __CLR4_4_15ow5owlgchoql1.R.inc(7461);return isBefore(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Is this instant strictly before the instant passed in
     * comparing solely by millisecond.
     *
     * @param instant an instant to check against, null means now
     * @return true if the instant is strictly before the instant passed in
     */
    public boolean isBefore(ReadableInstant instant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7462);
        __CLR4_4_15ow5owlgchoql1.R.inc(7463);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_15ow5owlgchoql1.R.inc(7464);return isBefore(instantMillis);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Is this instant equal to the millisecond instant passed in
     * comparing solely by millisecond.
     *
     * @param instant a millisecond instant to check against
     * @return true if this instant is equal to the instant passed in
     */
    public boolean isEqual(long instant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7465);
        __CLR4_4_15ow5owlgchoql1.R.inc(7466);return (getMillis() == instant);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Is this instant equal to the current instant
     * comparing solely by millisecond.
     *
     * @return true if this instant is equal to the current instant
     */
    public boolean isEqualNow() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7467);
        __CLR4_4_15ow5owlgchoql1.R.inc(7468);return isEqual(DateTimeUtils.currentTimeMillis());
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    /**
     * Is this instant equal to the instant passed in
     * comparing solely by millisecond.
     *
     * @param instant an instant to check against, null means now
     * @return true if the instant is equal to the instant passed in
     */
    public boolean isEqual(ReadableInstant instant) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7469);
        __CLR4_4_15ow5owlgchoql1.R.inc(7470);long instantMillis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_15ow5owlgchoql1.R.inc(7471);return isEqual(instantMillis);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the date time in ISO8601 format (yyyy-MM-ddTHH:mm:ss.SSSZZ).
     *
     * @return ISO8601 time formatted string, not null
     */
    @ToString
    public String toString() {try{__CLR4_4_15ow5owlgchoql1.R.inc(7472);
        __CLR4_4_15ow5owlgchoql1.R.inc(7473);return ISODateTimeFormat.dateTime().print(this);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Uses the specified formatter to convert this partial to a String.
     *
     * @param formatter the formatter to use, null means use <code>toString()</code>.
     * @return the formatted string, not null
     * @since 1.1
     */
    public String toString(DateTimeFormatter formatter) {try{__CLR4_4_15ow5owlgchoql1.R.inc(7474);
        __CLR4_4_15ow5owlgchoql1.R.inc(7475);if ((((formatter == null)&&(__CLR4_4_15ow5owlgchoql1.R.iget(7476)!=0|true))||(__CLR4_4_15ow5owlgchoql1.R.iget(7477)==0&false))) {{
            __CLR4_4_15ow5owlgchoql1.R.inc(7478);return toString();
        }
        }__CLR4_4_15ow5owlgchoql1.R.inc(7479);return formatter.print(this);
    }finally{__CLR4_4_15ow5owlgchoql1.R.flushNeeded();}}

}
