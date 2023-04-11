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
package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

/**
 * Wraps another Chronology to add support for time zones.
 * <p>
 * ZonedChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class ZonedChronology extends AssembledChronology {public static class __CLR4_4_19ge9gelgchoqus{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,12636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -1079258847191166848L;
    /**
     * Avoid calculation errors near zero.
     */
    private static final long NEAR_ZERO = 7L * 24 * 60 * 60 * 1000;

    /**
     * Create a ZonedChronology for any chronology, overriding any time zone it
     * may already have.
     *
     * @param base base chronology to wrap
     * @param zone the time zone
     * @throws IllegalArgumentException if chronology or time zone is null
     */
    public static ZonedChronology getInstance(Chronology base, DateTimeZone zone) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12254);
        __CLR4_4_19ge9gelgchoqus.R.inc(12255);if ((((base == null)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12256)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12257)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12258);throw new IllegalArgumentException("Must supply a chronology");
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12259);base = base.withUTC();
        __CLR4_4_19ge9gelgchoqus.R.inc(12260);if ((((base == null)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12261)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12262)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12263);throw new IllegalArgumentException("UTC chronology must not be null");
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12264);if ((((zone == null)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12265)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12266)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12267);throw new IllegalArgumentException("DateTimeZone must not be null");
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12268);return new ZonedChronology(base, zone);
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    static boolean useTimeArithmetic(DurationField field) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12269);
        // Use time of day arithmetic rules for unit durations less than
        // typical time zone offsets.
        __CLR4_4_19ge9gelgchoqus.R.inc(12270);return field != null && field.getUnitMillis() < DateTimeConstants.MILLIS_PER_HOUR * 12;
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    /**
     * Restricted constructor
     *
     * @param base base chronology to wrap
     * @param zone the time zone
     */
    private ZonedChronology(Chronology base, DateTimeZone zone) {
        super(base, zone);__CLR4_4_19ge9gelgchoqus.R.inc(12272);try{__CLR4_4_19ge9gelgchoqus.R.inc(12271);
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12273);
        __CLR4_4_19ge9gelgchoqus.R.inc(12274);return (DateTimeZone) getParam();
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    public Chronology withUTC() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12275);
        __CLR4_4_19ge9gelgchoqus.R.inc(12276);return getBase();
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12277);
        __CLR4_4_19ge9gelgchoqus.R.inc(12278);if ((((zone == null)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12279)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12280)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12281);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12282);if ((((zone == getParam())&&(__CLR4_4_19ge9gelgchoqus.R.iget(12283)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12284)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12285);return this;
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12286);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12287)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12288)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12289);return getBase();
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12290);return new ZonedChronology(getBase(), zone);
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_19ge9gelgchoqus.R.inc(12291);
        __CLR4_4_19ge9gelgchoqus.R.inc(12292);return localToUTC(getBase().getDateTimeMillis
                (year, monthOfYear, dayOfMonth, millisOfDay));
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_19ge9gelgchoqus.R.inc(12293);
        __CLR4_4_19ge9gelgchoqus.R.inc(12294);return localToUTC(getBase().getDateTimeMillis
                (year, monthOfYear, dayOfMonth,
                        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond));
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_19ge9gelgchoqus.R.inc(12295);
        __CLR4_4_19ge9gelgchoqus.R.inc(12296);return localToUTC(getBase().getDateTimeMillis
                (instant + getZone().getOffset(instant),
                        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond));
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    /**
     * @param localInstant the instant from 1970-01-01T00:00:00 local time
     * @return the instant from 1970-01-01T00:00:00Z
     */
    private long localToUTC(long localInstant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12297);
        __CLR4_4_19ge9gelgchoqus.R.inc(12298);if ((((localInstant == Long.MAX_VALUE)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12299)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12300)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12301);return Long.MAX_VALUE;
        } }else {__CLR4_4_19ge9gelgchoqus.R.inc(12302);if ((((localInstant == Long.MIN_VALUE)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12303)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12304)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12305);return Long.MIN_VALUE;
        }
        }}__CLR4_4_19ge9gelgchoqus.R.inc(12306);DateTimeZone zone = getZone();
        __CLR4_4_19ge9gelgchoqus.R.inc(12307);int offset = zone.getOffsetFromLocal(localInstant);
        __CLR4_4_19ge9gelgchoqus.R.inc(12308);long utcInstant = localInstant - offset;
        __CLR4_4_19ge9gelgchoqus.R.inc(12309);if ((((localInstant > NEAR_ZERO && utcInstant < 0)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12310)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12311)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12312);return Long.MAX_VALUE;
        } }else {__CLR4_4_19ge9gelgchoqus.R.inc(12313);if ((((localInstant < -NEAR_ZERO && utcInstant > 0)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12314)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12315)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12316);return Long.MIN_VALUE;
        }
        }}__CLR4_4_19ge9gelgchoqus.R.inc(12317);int offsetBasedOnUtc = zone.getOffset(utcInstant);
        __CLR4_4_19ge9gelgchoqus.R.inc(12318);if ((((offset != offsetBasedOnUtc)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12319)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12320)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12321);throw new IllegalInstantException(localInstant, zone.getID());
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12322);return utcInstant;
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12323);
        // Keep a local cache of converted fields so as not to create redundant
        // objects.
        __CLR4_4_19ge9gelgchoqus.R.inc(12324);HashMap<Object, Object> converted = new HashMap<Object, Object>();

        // Convert duration fields...

        __CLR4_4_19ge9gelgchoqus.R.inc(12325);fields.eras = convertField(fields.eras, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12326);fields.centuries = convertField(fields.centuries, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12327);fields.years = convertField(fields.years, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12328);fields.months = convertField(fields.months, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12329);fields.weekyears = convertField(fields.weekyears, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12330);fields.weeks = convertField(fields.weeks, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12331);fields.days = convertField(fields.days, converted);

        __CLR4_4_19ge9gelgchoqus.R.inc(12332);fields.halfdays = convertField(fields.halfdays, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12333);fields.hours = convertField(fields.hours, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12334);fields.minutes = convertField(fields.minutes, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12335);fields.seconds = convertField(fields.seconds, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12336);fields.millis = convertField(fields.millis, converted);

        // Convert datetime fields...

        __CLR4_4_19ge9gelgchoqus.R.inc(12337);fields.year = convertField(fields.year, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12338);fields.yearOfEra = convertField(fields.yearOfEra, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12339);fields.yearOfCentury = convertField(fields.yearOfCentury, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12340);fields.centuryOfEra = convertField(fields.centuryOfEra, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12341);fields.era = convertField(fields.era, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12342);fields.dayOfWeek = convertField(fields.dayOfWeek, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12343);fields.dayOfMonth = convertField(fields.dayOfMonth, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12344);fields.dayOfYear = convertField(fields.dayOfYear, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12345);fields.monthOfYear = convertField(fields.monthOfYear, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12346);fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12347);fields.weekyear = convertField(fields.weekyear, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12348);fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, converted);

        __CLR4_4_19ge9gelgchoqus.R.inc(12349);fields.millisOfSecond = convertField(fields.millisOfSecond, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12350);fields.millisOfDay = convertField(fields.millisOfDay, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12351);fields.secondOfMinute = convertField(fields.secondOfMinute, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12352);fields.secondOfDay = convertField(fields.secondOfDay, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12353);fields.minuteOfHour = convertField(fields.minuteOfHour, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12354);fields.minuteOfDay = convertField(fields.minuteOfDay, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12355);fields.hourOfDay = convertField(fields.hourOfDay, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12356);fields.hourOfHalfday = convertField(fields.hourOfHalfday, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12357);fields.clockhourOfDay = convertField(fields.clockhourOfDay, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12358);fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, converted);
        __CLR4_4_19ge9gelgchoqus.R.inc(12359);fields.halfdayOfDay = convertField(fields.halfdayOfDay, converted);
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    private DurationField convertField(DurationField field, HashMap<Object, Object> converted) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12360);
        __CLR4_4_19ge9gelgchoqus.R.inc(12361);if ((((field == null || !field.isSupported())&&(__CLR4_4_19ge9gelgchoqus.R.iget(12362)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12363)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12364);return field;
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12365);if ((((converted.containsKey(field))&&(__CLR4_4_19ge9gelgchoqus.R.iget(12366)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12367)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12368);return (DurationField) converted.get(field);
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12369);ZonedDurationField zonedField = new ZonedDurationField(field, getZone());
        __CLR4_4_19ge9gelgchoqus.R.inc(12370);converted.put(field, zonedField);
        __CLR4_4_19ge9gelgchoqus.R.inc(12371);return zonedField;
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    private DateTimeField convertField(DateTimeField field, HashMap<Object, Object> converted) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12372);
        __CLR4_4_19ge9gelgchoqus.R.inc(12373);if ((((field == null || !field.isSupported())&&(__CLR4_4_19ge9gelgchoqus.R.iget(12374)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12375)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12376);return field;
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12377);if ((((converted.containsKey(field))&&(__CLR4_4_19ge9gelgchoqus.R.iget(12378)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12379)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12380);return (DateTimeField) converted.get(field);
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12381);ZonedDateTimeField zonedField =
                new ZonedDateTimeField(field, getZone(),
                        convertField(field.getDurationField(), converted),
                        convertField(field.getRangeDurationField(), converted),
                        convertField(field.getLeapDurationField(), converted));
        __CLR4_4_19ge9gelgchoqus.R.inc(12382);converted.put(field, zonedField);
        __CLR4_4_19ge9gelgchoqus.R.inc(12383);return zonedField;
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * A zoned chronology is only equal to a zoned chronology with the
     * same base chronology and zone.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.4
     */
    public boolean equals(Object obj) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12384);
        __CLR4_4_19ge9gelgchoqus.R.inc(12385);if ((((this == obj)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12386)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12387)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12388);return true;
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12389);if ((((obj instanceof ZonedChronology == false)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12390)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12391)==0&false))) {{
            __CLR4_4_19ge9gelgchoqus.R.inc(12392);return false;
        }
        }__CLR4_4_19ge9gelgchoqus.R.inc(12393);ZonedChronology chrono = (ZonedChronology) obj;
        __CLR4_4_19ge9gelgchoqus.R.inc(12394);return
                getBase().equals(chrono.getBase()) &&
                        getZone().equals(chrono.getZone());
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    /**
     * A suitable hashcode for the chronology.
     *
     * @return the hashcode
     * @since 1.4
     */
    public int hashCode() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12395);
        __CLR4_4_19ge9gelgchoqus.R.inc(12396);return 326565 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    /**
     * A debugging string for the chronology.
     *
     * @return the debugging string
     */
    public String toString() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12397);
        __CLR4_4_19ge9gelgchoqus.R.inc(12398);return "ZonedChronology[" + getBase() + ", " + getZone().getID() + ']';
    }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /*
     * Because time durations are typically smaller than time zone offsets, the
     * arithmetic methods subtract the original offset. This produces a more
     * expected behavior when crossing time zone offset transitions. For dates,
     * the new offset is subtracted off. This behavior, if applied to time
     * fields, can nullify or reverse an add when crossing a transition.
     */
    static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;

        final DurationField iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        ZonedDurationField(DurationField field, DateTimeZone zone) {
            super(field.getType());__CLR4_4_19ge9gelgchoqus.R.inc(12400);try{__CLR4_4_19ge9gelgchoqus.R.inc(12399);
            __CLR4_4_19ge9gelgchoqus.R.inc(12401);if ((((!field.isSupported())&&(__CLR4_4_19ge9gelgchoqus.R.iget(12402)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12403)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12404);throw new IllegalArgumentException();
            }
            }__CLR4_4_19ge9gelgchoqus.R.inc(12405);iField = field;
            __CLR4_4_19ge9gelgchoqus.R.inc(12406);iTimeField = useTimeArithmetic(field);
            __CLR4_4_19ge9gelgchoqus.R.inc(12407);iZone = zone;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12408);
            __CLR4_4_19ge9gelgchoqus.R.inc(12409);return (((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12410)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12411)==0&false))? iField.isPrecise() : iField.isPrecise() && this.iZone.isFixed();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12412);
            __CLR4_4_19ge9gelgchoqus.R.inc(12413);return iField.getUnitMillis();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getValue(long duration, long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12414);
            __CLR4_4_19ge9gelgchoqus.R.inc(12415);return iField.getValue(duration, addOffset(instant));
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12416);
            __CLR4_4_19ge9gelgchoqus.R.inc(12417);return iField.getValueAsLong(duration, addOffset(instant));
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12418);
            __CLR4_4_19ge9gelgchoqus.R.inc(12419);return iField.getMillis(value, addOffset(instant));
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12420);
            __CLR4_4_19ge9gelgchoqus.R.inc(12421);return iField.getMillis(value, addOffset(instant));
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12422);
            __CLR4_4_19ge9gelgchoqus.R.inc(12423);int offset = getOffsetToAdd(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12424);instant = iField.add(instant + offset, value);
            __CLR4_4_19ge9gelgchoqus.R.inc(12425);return instant - ((((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12426)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12427)==0&false))? offset : getOffsetFromLocalToSubtract(instant));
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12428);
            __CLR4_4_19ge9gelgchoqus.R.inc(12429);int offset = getOffsetToAdd(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12430);instant = iField.add(instant + offset, value);
            __CLR4_4_19ge9gelgchoqus.R.inc(12431);return instant - ((((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12432)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12433)==0&false))? offset : getOffsetFromLocalToSubtract(instant));
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12434);
            __CLR4_4_19ge9gelgchoqus.R.inc(12435);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12436);return iField.getDifference
                    (minuendInstant + ((((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12437)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12438)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                            subtrahendInstant + offset);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12439);
            __CLR4_4_19ge9gelgchoqus.R.inc(12440);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12441);return iField.getDifferenceAsLong
                    (minuendInstant + ((((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12442)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12443)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                            subtrahendInstant + offset);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        private int getOffsetToAdd(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12444);
            __CLR4_4_19ge9gelgchoqus.R.inc(12445);int offset = this.iZone.getOffset(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12446);long sum = instant + offset;
            // If there is a sign change, but the two values have the same sign...
            __CLR4_4_19ge9gelgchoqus.R.inc(12447);if (((((instant ^ sum) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12448)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12449)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12450);throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            }__CLR4_4_19ge9gelgchoqus.R.inc(12451);return offset;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        private int getOffsetFromLocalToSubtract(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12452);
            __CLR4_4_19ge9gelgchoqus.R.inc(12453);int offset = this.iZone.getOffsetFromLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12454);long diff = instant - offset;
            // If there is a sign change, but the two values have different signs...
            __CLR4_4_19ge9gelgchoqus.R.inc(12455);if (((((instant ^ diff) < 0 && (instant ^ offset) < 0)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12456)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12457)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12458);throw new ArithmeticException("Subtracting time zone offset caused overflow");
            }
            }__CLR4_4_19ge9gelgchoqus.R.inc(12459);return offset;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        private long addOffset(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12460);
            __CLR4_4_19ge9gelgchoqus.R.inc(12461);return iZone.convertUTCToLocal(instant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12462);
            __CLR4_4_19ge9gelgchoqus.R.inc(12463);if ((((this == obj)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12464)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12465)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12466);return true;
            } }else {__CLR4_4_19ge9gelgchoqus.R.inc(12467);if ((((obj instanceof ZonedDurationField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12468)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12469)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12470);ZonedDurationField other = (ZonedDurationField) obj;
                __CLR4_4_19ge9gelgchoqus.R.inc(12471);return iField.equals(other.iField) &&
                        iZone.equals(other.iZone);
            }
            }}__CLR4_4_19ge9gelgchoqus.R.inc(12472);return false;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12473);
            __CLR4_4_19ge9gelgchoqus.R.inc(12474);return iField.hashCode() ^ iZone.hashCode();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}
    }

    /**
     * A DateTimeField that decorates another to add timezone behaviour.
     * <p>
     * This class converts passed in instants to local wall time, and vice
     * versa on output.
     */
    static final class ZonedDateTimeField extends BaseDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = -3968986277775529794L;

        final DateTimeField iField;
        final DateTimeZone iZone;
        final DurationField iDurationField;
        final boolean iTimeField;
        final DurationField iRangeDurationField;
        final DurationField iLeapDurationField;

        ZonedDateTimeField(DateTimeField field,
                           DateTimeZone zone,
                           DurationField durationField,
                           DurationField rangeDurationField,
                           DurationField leapDurationField) {
            super(field.getType());__CLR4_4_19ge9gelgchoqus.R.inc(12476);try{__CLR4_4_19ge9gelgchoqus.R.inc(12475);
            __CLR4_4_19ge9gelgchoqus.R.inc(12477);if ((((!field.isSupported())&&(__CLR4_4_19ge9gelgchoqus.R.iget(12478)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12479)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12480);throw new IllegalArgumentException();
            }
            }__CLR4_4_19ge9gelgchoqus.R.inc(12481);iField = field;
            __CLR4_4_19ge9gelgchoqus.R.inc(12482);iZone = zone;
            __CLR4_4_19ge9gelgchoqus.R.inc(12483);iDurationField = durationField;
            __CLR4_4_19ge9gelgchoqus.R.inc(12484);iTimeField = useTimeArithmetic(durationField);
            __CLR4_4_19ge9gelgchoqus.R.inc(12485);iRangeDurationField = rangeDurationField;
            __CLR4_4_19ge9gelgchoqus.R.inc(12486);iLeapDurationField = leapDurationField;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public boolean isLenient() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12487);
            __CLR4_4_19ge9gelgchoqus.R.inc(12488);return iField.isLenient();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12489);
            __CLR4_4_19ge9gelgchoqus.R.inc(12490);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12491);return iField.get(localInstant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public String getAsText(long instant, Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12492);
            __CLR4_4_19ge9gelgchoqus.R.inc(12493);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12494);return iField.getAsText(localInstant, locale);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12495);
            __CLR4_4_19ge9gelgchoqus.R.inc(12496);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12497);return iField.getAsShortText(localInstant, locale);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12498);
            __CLR4_4_19ge9gelgchoqus.R.inc(12499);return iField.getAsText(fieldValue, locale);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12500);
            __CLR4_4_19ge9gelgchoqus.R.inc(12501);return iField.getAsShortText(fieldValue, locale);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12502);
            __CLR4_4_19ge9gelgchoqus.R.inc(12503);if ((((iTimeField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12504)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12505)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12506);int offset = getOffsetToAdd(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12507);long localInstant = iField.add(instant + offset, value);
                __CLR4_4_19ge9gelgchoqus.R.inc(12508);return localInstant - offset;
            } }else {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12509);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12510);localInstant = iField.add(localInstant, value);
                __CLR4_4_19ge9gelgchoqus.R.inc(12511);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12512);
            __CLR4_4_19ge9gelgchoqus.R.inc(12513);if ((((iTimeField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12514)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12515)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12516);int offset = getOffsetToAdd(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12517);long localInstant = iField.add(instant + offset, value);
                __CLR4_4_19ge9gelgchoqus.R.inc(12518);return localInstant - offset;
            } }else {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12519);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12520);localInstant = iField.add(localInstant, value);
                __CLR4_4_19ge9gelgchoqus.R.inc(12521);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long addWrapField(long instant, int value) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12522);
            __CLR4_4_19ge9gelgchoqus.R.inc(12523);if ((((iTimeField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12524)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12525)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12526);int offset = getOffsetToAdd(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12527);long localInstant = iField.addWrapField(instant + offset, value);
                __CLR4_4_19ge9gelgchoqus.R.inc(12528);return localInstant - offset;
            } }else {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12529);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12530);localInstant = iField.addWrapField(localInstant, value);
                __CLR4_4_19ge9gelgchoqus.R.inc(12531);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long set(long instant, int value) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12532);
            __CLR4_4_19ge9gelgchoqus.R.inc(12533);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12534);localInstant = iField.set(localInstant, value);
            __CLR4_4_19ge9gelgchoqus.R.inc(12535);long result = iZone.convertLocalToUTC(localInstant, false, instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12536);if ((((get(result) != value)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12537)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12538)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12539);IllegalInstantException cause = new IllegalInstantException(localInstant, iZone.getID());
                __CLR4_4_19ge9gelgchoqus.R.inc(12540);IllegalFieldValueException ex = new IllegalFieldValueException(iField.getType(), Integer.valueOf(value), cause.getMessage());
                __CLR4_4_19ge9gelgchoqus.R.inc(12541);ex.initCause(cause);
                __CLR4_4_19ge9gelgchoqus.R.inc(12542);throw ex;
            }
            }__CLR4_4_19ge9gelgchoqus.R.inc(12543);return result;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long set(long instant, String text, Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12544);
            // cannot verify that new value stuck because set may be lenient
            __CLR4_4_19ge9gelgchoqus.R.inc(12545);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12546);localInstant = iField.set(localInstant, text, locale);
            __CLR4_4_19ge9gelgchoqus.R.inc(12547);return iZone.convertLocalToUTC(localInstant, false, instant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12548);
            __CLR4_4_19ge9gelgchoqus.R.inc(12549);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12550);return iField.getDifference
                    (minuendInstant + ((((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12551)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12552)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                            subtrahendInstant + offset);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12553);
            __CLR4_4_19ge9gelgchoqus.R.inc(12554);int offset = getOffsetToAdd(subtrahendInstant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12555);return iField.getDifferenceAsLong
                    (minuendInstant + ((((iTimeField )&&(__CLR4_4_19ge9gelgchoqus.R.iget(12556)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12557)==0&false))? offset : getOffsetToAdd(minuendInstant)),
                            subtrahendInstant + offset);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public final DurationField getDurationField() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12558);
            __CLR4_4_19ge9gelgchoqus.R.inc(12559);return iDurationField;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public final DurationField getRangeDurationField() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12560);
            __CLR4_4_19ge9gelgchoqus.R.inc(12561);return iRangeDurationField;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public boolean isLeap(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12562);
            __CLR4_4_19ge9gelgchoqus.R.inc(12563);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12564);return iField.isLeap(localInstant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getLeapAmount(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12565);
            __CLR4_4_19ge9gelgchoqus.R.inc(12566);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12567);return iField.getLeapAmount(localInstant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public final DurationField getLeapDurationField() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12568);
            __CLR4_4_19ge9gelgchoqus.R.inc(12569);return iLeapDurationField;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long roundFloor(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12570);
            __CLR4_4_19ge9gelgchoqus.R.inc(12571);if ((((iTimeField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12572)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12573)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12574);int offset = getOffsetToAdd(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12575);instant = iField.roundFloor(instant + offset);
                __CLR4_4_19ge9gelgchoqus.R.inc(12576);return instant - offset;
            } }else {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12577);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12578);localInstant = iField.roundFloor(localInstant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12579);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long roundCeiling(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12580);
            __CLR4_4_19ge9gelgchoqus.R.inc(12581);if ((((iTimeField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12582)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12583)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12584);int offset = getOffsetToAdd(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12585);instant = iField.roundCeiling(instant + offset);
                __CLR4_4_19ge9gelgchoqus.R.inc(12586);return instant - offset;
            } }else {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12587);long localInstant = iZone.convertUTCToLocal(instant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12588);localInstant = iField.roundCeiling(localInstant);
                __CLR4_4_19ge9gelgchoqus.R.inc(12589);return iZone.convertLocalToUTC(localInstant, false, instant);
            }
        }}finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public long remainder(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12590);
            __CLR4_4_19ge9gelgchoqus.R.inc(12591);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12592);return iField.remainder(localInstant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMinimumValue() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12593);
            __CLR4_4_19ge9gelgchoqus.R.inc(12594);return iField.getMinimumValue();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMinimumValue(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12595);
            __CLR4_4_19ge9gelgchoqus.R.inc(12596);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12597);return iField.getMinimumValue(localInstant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12598);
            __CLR4_4_19ge9gelgchoqus.R.inc(12599);return iField.getMinimumValue(instant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12600);
            __CLR4_4_19ge9gelgchoqus.R.inc(12601);return iField.getMinimumValue(instant, values);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMaximumValue() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12602);
            __CLR4_4_19ge9gelgchoqus.R.inc(12603);return iField.getMaximumValue();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12604);
            __CLR4_4_19ge9gelgchoqus.R.inc(12605);long localInstant = iZone.convertUTCToLocal(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12606);return iField.getMaximumValue(localInstant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12607);
            __CLR4_4_19ge9gelgchoqus.R.inc(12608);return iField.getMaximumValue(instant);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12609);
            __CLR4_4_19ge9gelgchoqus.R.inc(12610);return iField.getMaximumValue(instant, values);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12611);
            __CLR4_4_19ge9gelgchoqus.R.inc(12612);return iField.getMaximumTextLength(locale);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12613);
            __CLR4_4_19ge9gelgchoqus.R.inc(12614);return iField.getMaximumShortTextLength(locale);
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        private int getOffsetToAdd(long instant) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12615);
            __CLR4_4_19ge9gelgchoqus.R.inc(12616);int offset = this.iZone.getOffset(instant);
            __CLR4_4_19ge9gelgchoqus.R.inc(12617);long sum = instant + offset;
            // If there is a sign change, but the two values have the same sign...
            __CLR4_4_19ge9gelgchoqus.R.inc(12618);if (((((instant ^ sum) < 0 && (instant ^ offset) >= 0)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12619)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12620)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12621);throw new ArithmeticException("Adding time zone offset caused overflow");
            }
            }__CLR4_4_19ge9gelgchoqus.R.inc(12622);return offset;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_19ge9gelgchoqus.R.inc(12623);
            __CLR4_4_19ge9gelgchoqus.R.inc(12624);if ((((this == obj)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12625)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12626)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12627);return true;
            } }else {__CLR4_4_19ge9gelgchoqus.R.inc(12628);if ((((obj instanceof ZonedDateTimeField)&&(__CLR4_4_19ge9gelgchoqus.R.iget(12629)!=0|true))||(__CLR4_4_19ge9gelgchoqus.R.iget(12630)==0&false))) {{
                __CLR4_4_19ge9gelgchoqus.R.inc(12631);ZonedDateTimeField other = (ZonedDateTimeField) obj;
                __CLR4_4_19ge9gelgchoqus.R.inc(12632);return iField.equals(other.iField) &&
                        iZone.equals(other.iZone) &&
                        iDurationField.equals(other.iDurationField) &&
                        iRangeDurationField.equals(other.iRangeDurationField);
            }
            }}__CLR4_4_19ge9gelgchoqus.R.inc(12633);return false;
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_19ge9gelgchoqus.R.inc(12634);
            __CLR4_4_19ge9gelgchoqus.R.inc(12635);return iField.hashCode() ^ iZone.hashCode();
        }finally{__CLR4_4_19ge9gelgchoqus.R.flushNeeded();}}
    }

}
