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

import java.util.HashMap;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Wraps another Chronology to impose limits on the range of instants that
 * the fields within a Chronology may support. The limits are applied to both
 * DateTimeFields and DurationFields.
 * <p>
 * Methods in DateTimeField and DurationField throw an IllegalArgumentException
 * whenever given an input instant that is outside the limits or when an
 * attempt is made to move an instant outside the limits.
 * <p>
 * LimitChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class LimitChronology extends AssembledChronology {public static class __CLR4_4_1958958lgchoqu1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,12181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = 7670866536893052522L;

    /**
     * Wraps another chronology, with datetime limits. When withUTC or
     * withZone is called, the returned LimitChronology instance has
     * the same limits, except they are time zone adjusted.
     *
     * @param base       base chronology to wrap
     * @param lowerLimit inclusive lower limit, or null if none
     * @param upperLimit exclusive upper limit, or null if none
     * @throws IllegalArgumentException if chronology is null or limits are invalid
     */
    public static LimitChronology getInstance(Chronology base,
                                              ReadableDateTime lowerLimit,
                                              ReadableDateTime upperLimit) {try{__CLR4_4_1958958lgchoqu1.R.inc(11852);
        __CLR4_4_1958958lgchoqu1.R.inc(11853);if ((((base == null)&&(__CLR4_4_1958958lgchoqu1.R.iget(11854)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11855)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11856);throw new IllegalArgumentException("Must supply a chronology");
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11857);lowerLimit = (((lowerLimit == null )&&(__CLR4_4_1958958lgchoqu1.R.iget(11858)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11859)==0&false))? null : lowerLimit.toDateTime();
        __CLR4_4_1958958lgchoqu1.R.inc(11860);upperLimit = (((upperLimit == null )&&(__CLR4_4_1958958lgchoqu1.R.iget(11861)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11862)==0&false))? null : upperLimit.toDateTime();

        __CLR4_4_1958958lgchoqu1.R.inc(11863);if ((((lowerLimit != null && upperLimit != null && !lowerLimit.isBefore(upperLimit))&&(__CLR4_4_1958958lgchoqu1.R.iget(11864)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11865)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11866);throw new IllegalArgumentException
                    ("The lower limit must be come before than the upper limit");
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11867);return new LimitChronology(base, (DateTime) lowerLimit, (DateTime) upperLimit);
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    final DateTime iLowerLimit;
    final DateTime iUpperLimit;

    private transient LimitChronology iWithUTC;

    /**
     * Wraps another chronology, with datetime limits. When withUTC or
     * withZone is called, the returned LimitChronology instance has
     * the same limits, except they are time zone adjusted.
     *
     * @param lowerLimit inclusive lower limit, or null if none
     * @param upperLimit exclusive upper limit, or null if none
     */
    private LimitChronology(Chronology base,
                            DateTime lowerLimit, DateTime upperLimit) {
        super(base, null);__CLR4_4_1958958lgchoqu1.R.inc(11869);try{__CLR4_4_1958958lgchoqu1.R.inc(11868);
        // These can be set after assembly.
        __CLR4_4_1958958lgchoqu1.R.inc(11870);iLowerLimit = lowerLimit;
        __CLR4_4_1958958lgchoqu1.R.inc(11871);iUpperLimit = upperLimit;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    /**
     * Returns the inclusive lower limit instant.
     *
     * @return lower limit
     */
    public DateTime getLowerLimit() {try{__CLR4_4_1958958lgchoqu1.R.inc(11872);
        __CLR4_4_1958958lgchoqu1.R.inc(11873);return iLowerLimit;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    /**
     * Returns the inclusive upper limit instant.
     *
     * @return upper limit
     */
    public DateTime getUpperLimit() {try{__CLR4_4_1958958lgchoqu1.R.inc(11874);
        __CLR4_4_1958958lgchoqu1.R.inc(11875);return iUpperLimit;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    /**
     * If this LimitChronology is already UTC, then this is
     * returned. Otherwise, a new instance is returned, with the limits
     * adjusted to the new time zone.
     */
    public Chronology withUTC() {try{__CLR4_4_1958958lgchoqu1.R.inc(11876);
        __CLR4_4_1958958lgchoqu1.R.inc(11877);return withZone(DateTimeZone.UTC);
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    /**
     * If this LimitChronology has the same time zone as the one given, then
     * this is returned. Otherwise, a new instance is returned, with the limits
     * adjusted to the new time zone.
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1958958lgchoqu1.R.inc(11878);
        __CLR4_4_1958958lgchoqu1.R.inc(11879);if ((((zone == null)&&(__CLR4_4_1958958lgchoqu1.R.iget(11880)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11881)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11882);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(11883);if ((((zone == getZone())&&(__CLR4_4_1958958lgchoqu1.R.iget(11884)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11885)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11886);return this;
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11887);if ((((zone == DateTimeZone.UTC && iWithUTC != null)&&(__CLR4_4_1958958lgchoqu1.R.iget(11888)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11889)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11890);return iWithUTC;
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11891);DateTime lowerLimit = iLowerLimit;
        __CLR4_4_1958958lgchoqu1.R.inc(11892);if ((((lowerLimit != null)&&(__CLR4_4_1958958lgchoqu1.R.iget(11893)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11894)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11895);MutableDateTime mdt = lowerLimit.toMutableDateTime();
            __CLR4_4_1958958lgchoqu1.R.inc(11896);mdt.setZoneRetainFields(zone);
            __CLR4_4_1958958lgchoqu1.R.inc(11897);lowerLimit = mdt.toDateTime();
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11898);DateTime upperLimit = iUpperLimit;
        __CLR4_4_1958958lgchoqu1.R.inc(11899);if ((((upperLimit != null)&&(__CLR4_4_1958958lgchoqu1.R.iget(11900)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11901)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11902);MutableDateTime mdt = upperLimit.toMutableDateTime();
            __CLR4_4_1958958lgchoqu1.R.inc(11903);mdt.setZoneRetainFields(zone);
            __CLR4_4_1958958lgchoqu1.R.inc(11904);upperLimit = mdt.toDateTime();
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11905);LimitChronology chrono = getInstance
                (getBase().withZone(zone), lowerLimit, upperLimit);

        __CLR4_4_1958958lgchoqu1.R.inc(11906);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_1958958lgchoqu1.R.iget(11907)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11908)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11909);iWithUTC = chrono;
        }

        }__CLR4_4_1958958lgchoqu1.R.inc(11910);return chrono;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_1958958lgchoqu1.R.inc(11911);
        __CLR4_4_1958958lgchoqu1.R.inc(11912);long instant = getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        __CLR4_4_1958958lgchoqu1.R.inc(11913);checkLimits(instant, "resulting");
        __CLR4_4_1958958lgchoqu1.R.inc(11914);return instant;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_1958958lgchoqu1.R.inc(11915);
        __CLR4_4_1958958lgchoqu1.R.inc(11916);long instant = getBase().getDateTimeMillis
                (year, monthOfYear, dayOfMonth,
                        hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_1958958lgchoqu1.R.inc(11917);checkLimits(instant, "resulting");
        __CLR4_4_1958958lgchoqu1.R.inc(11918);return instant;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_1958958lgchoqu1.R.inc(11919);
        __CLR4_4_1958958lgchoqu1.R.inc(11920);checkLimits(instant, null);
        __CLR4_4_1958958lgchoqu1.R.inc(11921);instant = getBase().getDateTimeMillis
                (instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        __CLR4_4_1958958lgchoqu1.R.inc(11922);checkLimits(instant, "resulting");
        __CLR4_4_1958958lgchoqu1.R.inc(11923);return instant;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_1958958lgchoqu1.R.inc(11924);
        // Keep a local cache of converted fields so as not to create redundant
        // objects.
        __CLR4_4_1958958lgchoqu1.R.inc(11925);HashMap<Object, Object> converted = new HashMap<Object, Object>();

        // Convert duration fields...

        __CLR4_4_1958958lgchoqu1.R.inc(11926);fields.eras = convertField(fields.eras, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11927);fields.centuries = convertField(fields.centuries, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11928);fields.years = convertField(fields.years, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11929);fields.months = convertField(fields.months, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11930);fields.weekyears = convertField(fields.weekyears, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11931);fields.weeks = convertField(fields.weeks, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11932);fields.days = convertField(fields.days, converted);

        __CLR4_4_1958958lgchoqu1.R.inc(11933);fields.halfdays = convertField(fields.halfdays, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11934);fields.hours = convertField(fields.hours, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11935);fields.minutes = convertField(fields.minutes, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11936);fields.seconds = convertField(fields.seconds, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11937);fields.millis = convertField(fields.millis, converted);

        // Convert datetime fields...

        __CLR4_4_1958958lgchoqu1.R.inc(11938);fields.year = convertField(fields.year, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11939);fields.yearOfEra = convertField(fields.yearOfEra, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11940);fields.yearOfCentury = convertField(fields.yearOfCentury, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11941);fields.centuryOfEra = convertField(fields.centuryOfEra, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11942);fields.era = convertField(fields.era, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11943);fields.dayOfWeek = convertField(fields.dayOfWeek, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11944);fields.dayOfMonth = convertField(fields.dayOfMonth, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11945);fields.dayOfYear = convertField(fields.dayOfYear, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11946);fields.monthOfYear = convertField(fields.monthOfYear, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11947);fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11948);fields.weekyear = convertField(fields.weekyear, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11949);fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, converted);

        __CLR4_4_1958958lgchoqu1.R.inc(11950);fields.millisOfSecond = convertField(fields.millisOfSecond, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11951);fields.millisOfDay = convertField(fields.millisOfDay, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11952);fields.secondOfMinute = convertField(fields.secondOfMinute, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11953);fields.secondOfDay = convertField(fields.secondOfDay, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11954);fields.minuteOfHour = convertField(fields.minuteOfHour, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11955);fields.minuteOfDay = convertField(fields.minuteOfDay, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11956);fields.hourOfDay = convertField(fields.hourOfDay, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11957);fields.hourOfHalfday = convertField(fields.hourOfHalfday, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11958);fields.clockhourOfDay = convertField(fields.clockhourOfDay, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11959);fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, converted);
        __CLR4_4_1958958lgchoqu1.R.inc(11960);fields.halfdayOfDay = convertField(fields.halfdayOfDay, converted);
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    private DurationField convertField(DurationField field, HashMap<Object, Object> converted) {try{__CLR4_4_1958958lgchoqu1.R.inc(11961);
        __CLR4_4_1958958lgchoqu1.R.inc(11962);if ((((field == null || !field.isSupported())&&(__CLR4_4_1958958lgchoqu1.R.iget(11963)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11964)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11965);return field;
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(11966);if ((((converted.containsKey(field))&&(__CLR4_4_1958958lgchoqu1.R.iget(11967)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11968)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11969);return (DurationField) converted.get(field);
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(11970);LimitDurationField limitField = new LimitDurationField(field);
        __CLR4_4_1958958lgchoqu1.R.inc(11971);converted.put(field, limitField);
        __CLR4_4_1958958lgchoqu1.R.inc(11972);return limitField;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    private DateTimeField convertField(DateTimeField field, HashMap<Object, Object> converted) {try{__CLR4_4_1958958lgchoqu1.R.inc(11973);
        __CLR4_4_1958958lgchoqu1.R.inc(11974);if ((((field == null || !field.isSupported())&&(__CLR4_4_1958958lgchoqu1.R.iget(11975)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11976)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11977);return field;
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(11978);if ((((converted.containsKey(field))&&(__CLR4_4_1958958lgchoqu1.R.iget(11979)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11980)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11981);return (DateTimeField) converted.get(field);
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(11982);LimitDateTimeField limitField =
                new LimitDateTimeField(field,
                        convertField(field.getDurationField(), converted),
                        convertField(field.getRangeDurationField(), converted),
                        convertField(field.getLeapDurationField(), converted));
        __CLR4_4_1958958lgchoqu1.R.inc(11983);converted.put(field, limitField);
        __CLR4_4_1958958lgchoqu1.R.inc(11984);return limitField;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    void checkLimits(long instant, String desc) {try{__CLR4_4_1958958lgchoqu1.R.inc(11985);
        __CLR4_4_1958958lgchoqu1.R.inc(11986);DateTime limit;
        __CLR4_4_1958958lgchoqu1.R.inc(11987);if ((limit = iLowerLimit) != null && instant < limit.getMillis()) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11990);throw new LimitException(desc, true);
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(11991);if ((limit = iUpperLimit) != null && instant >= limit.getMillis()) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11994);throw new LimitException(desc, false);
        }
    }}finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * A limit chronology is only equal to a limit chronology with the
     * same base chronology and limits.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.4
     */
    public boolean equals(Object obj) {try{__CLR4_4_1958958lgchoqu1.R.inc(11995);
        __CLR4_4_1958958lgchoqu1.R.inc(11996);if ((((this == obj)&&(__CLR4_4_1958958lgchoqu1.R.iget(11997)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(11998)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(11999);return true;
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(12000);if ((((obj instanceof LimitChronology == false)&&(__CLR4_4_1958958lgchoqu1.R.iget(12001)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12002)==0&false))) {{
            __CLR4_4_1958958lgchoqu1.R.inc(12003);return false;
        }
        }__CLR4_4_1958958lgchoqu1.R.inc(12004);LimitChronology chrono = (LimitChronology) obj;
        __CLR4_4_1958958lgchoqu1.R.inc(12005);return
                getBase().equals(chrono.getBase()) &&
                        FieldUtils.equals(getLowerLimit(), chrono.getLowerLimit()) &&
                        FieldUtils.equals(getUpperLimit(), chrono.getUpperLimit());
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    /**
     * A suitable hashcode for the chronology.
     *
     * @return the hashcode
     * @since 1.4
     */
    public int hashCode() {try{__CLR4_4_1958958lgchoqu1.R.inc(12006);
        __CLR4_4_1958958lgchoqu1.R.inc(12007);int hash = 317351877;
        __CLR4_4_1958958lgchoqu1.R.inc(12008);hash += ((((getLowerLimit() != null )&&(__CLR4_4_1958958lgchoqu1.R.iget(12009)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12010)==0&false))? getLowerLimit().hashCode() : 0);
        __CLR4_4_1958958lgchoqu1.R.inc(12011);hash += ((((getUpperLimit() != null )&&(__CLR4_4_1958958lgchoqu1.R.iget(12012)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12013)==0&false))? getUpperLimit().hashCode() : 0);
        __CLR4_4_1958958lgchoqu1.R.inc(12014);hash += getBase().hashCode() * 7;
        __CLR4_4_1958958lgchoqu1.R.inc(12015);return hash;
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    /**
     * A debugging string for the chronology.
     *
     * @return the debugging string
     */
    public String toString() {try{__CLR4_4_1958958lgchoqu1.R.inc(12016);
        __CLR4_4_1958958lgchoqu1.R.inc(12017);return "LimitChronology[" + getBase().toString() + ", " +
                ((((getLowerLimit() == null )&&(__CLR4_4_1958958lgchoqu1.R.iget(12018)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12019)==0&false))? "NoLimit" : getLowerLimit().toString()) + ", " +
                ((((getUpperLimit() == null )&&(__CLR4_4_1958958lgchoqu1.R.iget(12020)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12021)==0&false))? "NoLimit" : getUpperLimit().toString()) + ']';
    }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Extends IllegalArgumentException such that the exception message is not
     * generated unless it is actually requested.
     */
    private class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;

        private final boolean iIsLow;

        LimitException(String desc, boolean isLow) {
            super(desc);__CLR4_4_1958958lgchoqu1.R.inc(12023);try{__CLR4_4_1958958lgchoqu1.R.inc(12022);
            __CLR4_4_1958958lgchoqu1.R.inc(12024);iIsLow = isLow;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public String getMessage() {try{__CLR4_4_1958958lgchoqu1.R.inc(12025);
            __CLR4_4_1958958lgchoqu1.R.inc(12026);StringBuffer buf = new StringBuffer(85);
            __CLR4_4_1958958lgchoqu1.R.inc(12027);buf.append("The");
            __CLR4_4_1958958lgchoqu1.R.inc(12028);String desc = super.getMessage();
            __CLR4_4_1958958lgchoqu1.R.inc(12029);if ((((desc != null)&&(__CLR4_4_1958958lgchoqu1.R.iget(12030)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12031)==0&false))) {{
                __CLR4_4_1958958lgchoqu1.R.inc(12032);buf.append(' ');
                __CLR4_4_1958958lgchoqu1.R.inc(12033);buf.append(desc);
            }
            }__CLR4_4_1958958lgchoqu1.R.inc(12034);buf.append(" instant is ");

            __CLR4_4_1958958lgchoqu1.R.inc(12035);DateTimeFormatter p = ISODateTimeFormat.dateTime();
            __CLR4_4_1958958lgchoqu1.R.inc(12036);p = p.withChronology(getBase());
            __CLR4_4_1958958lgchoqu1.R.inc(12037);if ((((iIsLow)&&(__CLR4_4_1958958lgchoqu1.R.iget(12038)!=0|true))||(__CLR4_4_1958958lgchoqu1.R.iget(12039)==0&false))) {{
                __CLR4_4_1958958lgchoqu1.R.inc(12040);buf.append("below the supported minimum of ");
                __CLR4_4_1958958lgchoqu1.R.inc(12041);p.printTo(buf, getLowerLimit().getMillis());
            } }else {{
                __CLR4_4_1958958lgchoqu1.R.inc(12042);buf.append("above the supported maximum of ");
                __CLR4_4_1958958lgchoqu1.R.inc(12043);p.printTo(buf, getUpperLimit().getMillis());
            }

            }__CLR4_4_1958958lgchoqu1.R.inc(12044);buf.append(" (");
            __CLR4_4_1958958lgchoqu1.R.inc(12045);buf.append(getBase());
            __CLR4_4_1958958lgchoqu1.R.inc(12046);buf.append(')');

            __CLR4_4_1958958lgchoqu1.R.inc(12047);return buf.toString();
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public String toString() {try{__CLR4_4_1958958lgchoqu1.R.inc(12048);
            __CLR4_4_1958958lgchoqu1.R.inc(12049);return "IllegalArgumentException: " + getMessage();
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}
    }

    private class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;

        LimitDurationField(DurationField field) {
            super(field, field.getType());__CLR4_4_1958958lgchoqu1.R.inc(12051);try{__CLR4_4_1958958lgchoqu1.R.inc(12050);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getValue(long duration, long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12052);
            __CLR4_4_1958958lgchoqu1.R.inc(12053);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12054);return getWrappedField().getValue(duration, instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12055);
            __CLR4_4_1958958lgchoqu1.R.inc(12056);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12057);return getWrappedField().getValueAsLong(duration, instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12058);
            __CLR4_4_1958958lgchoqu1.R.inc(12059);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12060);return getWrappedField().getMillis(value, instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12061);
            __CLR4_4_1958958lgchoqu1.R.inc(12062);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12063);return getWrappedField().getMillis(value, instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long add(long instant, int amount) {try{__CLR4_4_1958958lgchoqu1.R.inc(12064);
            __CLR4_4_1958958lgchoqu1.R.inc(12065);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12066);long result = getWrappedField().add(instant, amount);
            __CLR4_4_1958958lgchoqu1.R.inc(12067);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12068);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long add(long instant, long amount) {try{__CLR4_4_1958958lgchoqu1.R.inc(12069);
            __CLR4_4_1958958lgchoqu1.R.inc(12070);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12071);long result = getWrappedField().add(instant, amount);
            __CLR4_4_1958958lgchoqu1.R.inc(12072);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12073);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12074);
            __CLR4_4_1958958lgchoqu1.R.inc(12075);checkLimits(minuendInstant, "minuend");
            __CLR4_4_1958958lgchoqu1.R.inc(12076);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_1958958lgchoqu1.R.inc(12077);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12078);
            __CLR4_4_1958958lgchoqu1.R.inc(12079);checkLimits(minuendInstant, "minuend");
            __CLR4_4_1958958lgchoqu1.R.inc(12080);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_1958958lgchoqu1.R.inc(12081);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    }

    private class LimitDateTimeField extends DecoratedDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = -2435306746995699312L;

        private final DurationField iDurationField;
        private final DurationField iRangeDurationField;
        private final DurationField iLeapDurationField;

        LimitDateTimeField(DateTimeField field,
                           DurationField durationField,
                           DurationField rangeDurationField,
                           DurationField leapDurationField) {
            super(field, field.getType());__CLR4_4_1958958lgchoqu1.R.inc(12083);try{__CLR4_4_1958958lgchoqu1.R.inc(12082);
            __CLR4_4_1958958lgchoqu1.R.inc(12084);iDurationField = durationField;
            __CLR4_4_1958958lgchoqu1.R.inc(12085);iRangeDurationField = rangeDurationField;
            __CLR4_4_1958958lgchoqu1.R.inc(12086);iLeapDurationField = leapDurationField;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int get(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12087);
            __CLR4_4_1958958lgchoqu1.R.inc(12088);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12089);return getWrappedField().get(instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public String getAsText(long instant, Locale locale) {try{__CLR4_4_1958958lgchoqu1.R.inc(12090);
            __CLR4_4_1958958lgchoqu1.R.inc(12091);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12092);return getWrappedField().getAsText(instant, locale);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1958958lgchoqu1.R.inc(12093);
            __CLR4_4_1958958lgchoqu1.R.inc(12094);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12095);return getWrappedField().getAsShortText(instant, locale);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long add(long instant, int amount) {try{__CLR4_4_1958958lgchoqu1.R.inc(12096);
            __CLR4_4_1958958lgchoqu1.R.inc(12097);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12098);long result = getWrappedField().add(instant, amount);
            __CLR4_4_1958958lgchoqu1.R.inc(12099);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12100);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long add(long instant, long amount) {try{__CLR4_4_1958958lgchoqu1.R.inc(12101);
            __CLR4_4_1958958lgchoqu1.R.inc(12102);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12103);long result = getWrappedField().add(instant, amount);
            __CLR4_4_1958958lgchoqu1.R.inc(12104);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12105);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long addWrapField(long instant, int amount) {try{__CLR4_4_1958958lgchoqu1.R.inc(12106);
            __CLR4_4_1958958lgchoqu1.R.inc(12107);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12108);long result = getWrappedField().addWrapField(instant, amount);
            __CLR4_4_1958958lgchoqu1.R.inc(12109);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12110);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12111);
            __CLR4_4_1958958lgchoqu1.R.inc(12112);checkLimits(minuendInstant, "minuend");
            __CLR4_4_1958958lgchoqu1.R.inc(12113);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_1958958lgchoqu1.R.inc(12114);return getWrappedField().getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12115);
            __CLR4_4_1958958lgchoqu1.R.inc(12116);checkLimits(minuendInstant, "minuend");
            __CLR4_4_1958958lgchoqu1.R.inc(12117);checkLimits(subtrahendInstant, "subtrahend");
            __CLR4_4_1958958lgchoqu1.R.inc(12118);return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long set(long instant, int value) {try{__CLR4_4_1958958lgchoqu1.R.inc(12119);
            __CLR4_4_1958958lgchoqu1.R.inc(12120);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12121);long result = getWrappedField().set(instant, value);
            __CLR4_4_1958958lgchoqu1.R.inc(12122);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12123);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long set(long instant, String text, Locale locale) {try{__CLR4_4_1958958lgchoqu1.R.inc(12124);
            __CLR4_4_1958958lgchoqu1.R.inc(12125);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12126);long result = getWrappedField().set(instant, text, locale);
            __CLR4_4_1958958lgchoqu1.R.inc(12127);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12128);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public final DurationField getDurationField() {try{__CLR4_4_1958958lgchoqu1.R.inc(12129);
            __CLR4_4_1958958lgchoqu1.R.inc(12130);return iDurationField;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public final DurationField getRangeDurationField() {try{__CLR4_4_1958958lgchoqu1.R.inc(12131);
            __CLR4_4_1958958lgchoqu1.R.inc(12132);return iRangeDurationField;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public boolean isLeap(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12133);
            __CLR4_4_1958958lgchoqu1.R.inc(12134);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12135);return getWrappedField().isLeap(instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getLeapAmount(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12136);
            __CLR4_4_1958958lgchoqu1.R.inc(12137);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12138);return getWrappedField().getLeapAmount(instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public final DurationField getLeapDurationField() {try{__CLR4_4_1958958lgchoqu1.R.inc(12139);
            __CLR4_4_1958958lgchoqu1.R.inc(12140);return iLeapDurationField;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long roundFloor(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12141);
            __CLR4_4_1958958lgchoqu1.R.inc(12142);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12143);long result = getWrappedField().roundFloor(instant);
            __CLR4_4_1958958lgchoqu1.R.inc(12144);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12145);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long roundCeiling(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12146);
            __CLR4_4_1958958lgchoqu1.R.inc(12147);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12148);long result = getWrappedField().roundCeiling(instant);
            __CLR4_4_1958958lgchoqu1.R.inc(12149);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12150);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long roundHalfFloor(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12151);
            __CLR4_4_1958958lgchoqu1.R.inc(12152);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12153);long result = getWrappedField().roundHalfFloor(instant);
            __CLR4_4_1958958lgchoqu1.R.inc(12154);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12155);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long roundHalfCeiling(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12156);
            __CLR4_4_1958958lgchoqu1.R.inc(12157);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12158);long result = getWrappedField().roundHalfCeiling(instant);
            __CLR4_4_1958958lgchoqu1.R.inc(12159);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12160);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long roundHalfEven(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12161);
            __CLR4_4_1958958lgchoqu1.R.inc(12162);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12163);long result = getWrappedField().roundHalfEven(instant);
            __CLR4_4_1958958lgchoqu1.R.inc(12164);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12165);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public long remainder(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12166);
            __CLR4_4_1958958lgchoqu1.R.inc(12167);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12168);long result = getWrappedField().remainder(instant);
            __CLR4_4_1958958lgchoqu1.R.inc(12169);checkLimits(result, "resulting");
            __CLR4_4_1958958lgchoqu1.R.inc(12170);return result;
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getMinimumValue(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12171);
            __CLR4_4_1958958lgchoqu1.R.inc(12172);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12173);return getWrappedField().getMinimumValue(instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getMaximumValue(long instant) {try{__CLR4_4_1958958lgchoqu1.R.inc(12174);
            __CLR4_4_1958958lgchoqu1.R.inc(12175);checkLimits(instant, null);
            __CLR4_4_1958958lgchoqu1.R.inc(12176);return getWrappedField().getMaximumValue(instant);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1958958lgchoqu1.R.inc(12177);
            __CLR4_4_1958958lgchoqu1.R.inc(12178);return getWrappedField().getMaximumTextLength(locale);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

        public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1958958lgchoqu1.R.inc(12179);
            __CLR4_4_1958958lgchoqu1.R.inc(12180);return getWrappedField().getMaximumShortTextLength(locale);
        }finally{__CLR4_4_1958958lgchoqu1.R.flushNeeded();}}

    }

}
