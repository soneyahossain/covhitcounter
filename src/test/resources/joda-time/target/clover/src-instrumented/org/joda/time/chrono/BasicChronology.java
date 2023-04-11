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

import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;

/**
 * Abstract implementation for calendar systems that use a typical
 * day/month/year/leapYear model.
 * Most of the utility methods required by subclasses are package-private,
 * reflecting the intention that they be defined in the same package.
 * <p>
 * BasicChronology is thread-safe and immutable, and all subclasses must
 * be as well.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @author Guy Allard
 * @since 1.2, renamed from BaseGJChronology
 */
abstract class BasicChronology extends AssembledChronology {public static class __CLR4_4_16xy6xylgchoqo5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9313,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = 8283225332206808863L;

    private static final DurationField cMillisField;
    private static final DurationField cSecondsField;
    private static final DurationField cMinutesField;
    private static final DurationField cHoursField;
    private static final DurationField cHalfdaysField;
    private static final DurationField cDaysField;
    private static final DurationField cWeeksField;

    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DateTimeField cHalfdayOfDayField;

    static {try{__CLR4_4_16xy6xylgchoqo5.R.inc(8998);
        __CLR4_4_16xy6xylgchoqo5.R.inc(8999);cMillisField = MillisDurationField.INSTANCE;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9000);cSecondsField = new PreciseDurationField
                (DurationFieldType.seconds(), DateTimeConstants.MILLIS_PER_SECOND);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9001);cMinutesField = new PreciseDurationField
                (DurationFieldType.minutes(), DateTimeConstants.MILLIS_PER_MINUTE);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9002);cHoursField = new PreciseDurationField
                (DurationFieldType.hours(), DateTimeConstants.MILLIS_PER_HOUR);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9003);cHalfdaysField = new PreciseDurationField
                (DurationFieldType.halfdays(), DateTimeConstants.MILLIS_PER_DAY / 2);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9004);cDaysField = new PreciseDurationField
                (DurationFieldType.days(), DateTimeConstants.MILLIS_PER_DAY);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9005);cWeeksField = new PreciseDurationField
                (DurationFieldType.weeks(), DateTimeConstants.MILLIS_PER_WEEK);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9006);cMillisOfSecondField = new PreciseDateTimeField
                (DateTimeFieldType.millisOfSecond(), cMillisField, cSecondsField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9007);cMillisOfDayField = new PreciseDateTimeField
                (DateTimeFieldType.millisOfDay(), cMillisField, cDaysField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9008);cSecondOfMinuteField = new PreciseDateTimeField
                (DateTimeFieldType.secondOfMinute(), cSecondsField, cMinutesField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9009);cSecondOfDayField = new PreciseDateTimeField
                (DateTimeFieldType.secondOfDay(), cSecondsField, cDaysField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9010);cMinuteOfHourField = new PreciseDateTimeField
                (DateTimeFieldType.minuteOfHour(), cMinutesField, cHoursField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9011);cMinuteOfDayField = new PreciseDateTimeField
                (DateTimeFieldType.minuteOfDay(), cMinutesField, cDaysField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9012);cHourOfDayField = new PreciseDateTimeField
                (DateTimeFieldType.hourOfDay(), cHoursField, cDaysField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9013);cHourOfHalfdayField = new PreciseDateTimeField
                (DateTimeFieldType.hourOfHalfday(), cHoursField, cHalfdaysField);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9014);cClockhourOfDayField = new ZeroIsMaxDateTimeField
                (cHourOfDayField, DateTimeFieldType.clockhourOfDay());

        __CLR4_4_16xy6xylgchoqo5.R.inc(9015);cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField
                (cHourOfHalfdayField, DateTimeFieldType.clockhourOfHalfday());

        __CLR4_4_16xy6xylgchoqo5.R.inc(9016);cHalfdayOfDayField = new HalfdayField();
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    private static final int CACHE_SIZE = 1 << 10;
    private static final int CACHE_MASK = CACHE_SIZE - 1;

    private transient final YearInfo[] iYearInfoCache = new YearInfo[CACHE_SIZE];

    private final int iMinDaysInFirstWeek;

    BasicChronology(Chronology base, Object param, int minDaysInFirstWeek) {
        super(base, param);__CLR4_4_16xy6xylgchoqo5.R.inc(9018);try{__CLR4_4_16xy6xylgchoqo5.R.inc(9017);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9019);if ((((minDaysInFirstWeek < 1 || minDaysInFirstWeek > 7)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9020)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9021)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9022);throw new IllegalArgumentException
                    ("Invalid min days in first week: " + minDaysInFirstWeek);
        }

        }__CLR4_4_16xy6xylgchoqo5.R.inc(9023);iMinDaysInFirstWeek = minDaysInFirstWeek;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9024);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9025);Chronology base;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9026);if ((base = getBase()) != null) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9029);return base.getZone();
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9030);return DateTimeZone.UTC;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    @Override
    public long getDateTimeMillis(
            int year, int monthOfYear, int dayOfMonth, int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9031);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9032);Chronology base;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9033);if ((base = getBase()) != null) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9036);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        }

        }__CLR4_4_16xy6xylgchoqo5.R.inc(9037);FieldUtils.verifyValueBounds
                (DateTimeFieldType.millisOfDay(), millisOfDay, 0, DateTimeConstants.MILLIS_PER_DAY - 1);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9038);return getDateTimeMillis0(year, monthOfYear, dayOfMonth, millisOfDay);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    @Override
    public long getDateTimeMillis(
            int year, int monthOfYear, int dayOfMonth,
            int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9039);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9040);Chronology base;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9041);if ((base = getBase()) != null) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9044);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth,
                    hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }

        }__CLR4_4_16xy6xylgchoqo5.R.inc(9045);FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), hourOfDay, 0, 23);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9046);FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), minuteOfHour, 0, 59);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9047);FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), secondOfMinute, 0, 59);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9048);FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), millisOfSecond, 0, 999);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9049);long millisOfDay = hourOfDay * DateTimeConstants.MILLIS_PER_HOUR
                + minuteOfHour * DateTimeConstants.MILLIS_PER_MINUTE
                + secondOfMinute * DateTimeConstants.MILLIS_PER_SECOND
                + millisOfSecond;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9050);return getDateTimeMillis0(year, monthOfYear, dayOfMonth, (int) millisOfDay);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    private long getDateTimeMillis0(int year, int monthOfYear, int dayOfMonth, int millisOfDay) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9051);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9052);long dayInstant = getDateMidnightMillis(year, monthOfYear, dayOfMonth);
        // try reversed calculation from next day for MIN
        __CLR4_4_16xy6xylgchoqo5.R.inc(9053);if ((((dayInstant == Long.MIN_VALUE)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9054)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9055)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9056);dayInstant = getDateMidnightMillis(year, monthOfYear, dayOfMonth + 1);
            __CLR4_4_16xy6xylgchoqo5.R.inc(9057);millisOfDay = millisOfDay - 86400000;
        }
        // check for limit caused by millisOfDay addition
        // even if dayInstant already MIN or MAX, this still works fine with int math
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9058);long result = dayInstant + millisOfDay;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9059);if ((((result < 0 && dayInstant > 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9060)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9061)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9062);return Long.MAX_VALUE;
        } }else {__CLR4_4_16xy6xylgchoqo5.R.inc(9063);if ((((result > 0 && dayInstant < 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9064)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9065)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9066);return Long.MIN_VALUE;
        }
        }}__CLR4_4_16xy6xylgchoqo5.R.inc(9067);return result;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    public int getMinimumDaysInFirstWeek() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9068);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9069);return iMinDaysInFirstWeek;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if this chronology instance equals another.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9070);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9071);if ((((this == obj)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9072)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9073)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9074);return true;
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9075);if ((((obj != null && getClass() == obj.getClass())&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9076)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9077)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9078);BasicChronology chrono = (BasicChronology) obj;
            __CLR4_4_16xy6xylgchoqo5.R.inc(9079);return getMinimumDaysInFirstWeek() == chrono.getMinimumDaysInFirstWeek() &&
                    getZone().equals(chrono.getZone());
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9080);return false;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     *
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9081);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9082);return getClass().getName().hashCode() * 11 + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------

    /**
     * Gets a debugging toString.
     *
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9083);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9084);StringBuilder sb = new StringBuilder(60);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9085);String name = getClass().getName();
        __CLR4_4_16xy6xylgchoqo5.R.inc(9086);int index = name.lastIndexOf('.');
        __CLR4_4_16xy6xylgchoqo5.R.inc(9087);if ((((index >= 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9088)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9089)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9090);name = name.substring(index + 1);
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9091);sb.append(name);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9092);sb.append('[');
        __CLR4_4_16xy6xylgchoqo5.R.inc(9093);DateTimeZone zone = getZone();
        __CLR4_4_16xy6xylgchoqo5.R.inc(9094);if ((((zone != null)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9095)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9096)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9097);sb.append(zone.getID());
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9098);if ((((getMinimumDaysInFirstWeek() != 4)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9099)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9100)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9101);sb.append(",mdfw=");
            __CLR4_4_16xy6xylgchoqo5.R.inc(9102);sb.append(getMinimumDaysInFirstWeek());
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9103);sb.append(']');
        __CLR4_4_16xy6xylgchoqo5.R.inc(9104);return sb.toString();
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9105);
        // First copy fields that are the same for all Gregorian and Julian
        // chronologies.

        __CLR4_4_16xy6xylgchoqo5.R.inc(9106);fields.millis = cMillisField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9107);fields.seconds = cSecondsField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9108);fields.minutes = cMinutesField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9109);fields.hours = cHoursField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9110);fields.halfdays = cHalfdaysField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9111);fields.days = cDaysField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9112);fields.weeks = cWeeksField;

        __CLR4_4_16xy6xylgchoqo5.R.inc(9113);fields.millisOfSecond = cMillisOfSecondField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9114);fields.millisOfDay = cMillisOfDayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9115);fields.secondOfMinute = cSecondOfMinuteField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9116);fields.secondOfDay = cSecondOfDayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9117);fields.minuteOfHour = cMinuteOfHourField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9118);fields.minuteOfDay = cMinuteOfDayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9119);fields.hourOfDay = cHourOfDayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9120);fields.hourOfHalfday = cHourOfHalfdayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9121);fields.clockhourOfDay = cClockhourOfDayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9122);fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9123);fields.halfdayOfDay = cHalfdayOfDayField;

        // Now create fields that have unique behavior for Gregorian and Julian
        // chronologies.

        __CLR4_4_16xy6xylgchoqo5.R.inc(9124);fields.year = new BasicYearDateTimeField(this);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9125);fields.yearOfEra = new GJYearOfEraDateTimeField(fields.year, this);

        // Define one-based centuryOfEra and yearOfCentury.
        __CLR4_4_16xy6xylgchoqo5.R.inc(9126);DateTimeField field = new OffsetDateTimeField(
                fields.yearOfEra, 99);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9127);fields.centuryOfEra = new DividedDateTimeField(
                field, DateTimeFieldType.centuryOfEra(), 100);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9128);fields.centuries = fields.centuryOfEra.getDurationField();

        __CLR4_4_16xy6xylgchoqo5.R.inc(9129);field = new RemainderDateTimeField(
                (DividedDateTimeField) fields.centuryOfEra);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9130);fields.yearOfCentury = new OffsetDateTimeField(
                field, DateTimeFieldType.yearOfCentury(), 1);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9131);fields.era = new GJEraDateTimeField(this);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9132);fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9133);fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9134);fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9135);fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9136);fields.weekyear = new BasicWeekyearDateTimeField(this);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9137);fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9138);field = new RemainderDateTimeField(
                fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9139);fields.weekyearOfCentury = new OffsetDateTimeField(
                field, DateTimeFieldType.weekyearOfCentury(), 1);

        // The remaining (imprecise) durations are available from the newly
        // created datetime fields.
        __CLR4_4_16xy6xylgchoqo5.R.inc(9140);fields.years = fields.year.getDurationField();
        __CLR4_4_16xy6xylgchoqo5.R.inc(9141);fields.months = fields.monthOfYear.getDurationField();
        __CLR4_4_16xy6xylgchoqo5.R.inc(9142);fields.weekyears = fields.weekyear.getDurationField();
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the number of days in the year.
     *
     * @return 366
     */
    int getDaysInYearMax() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9143);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9144);return 366;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Get the number of days in the year.
     *
     * @param year the year to use
     * @return 366 if a leap year, otherwise 365
     */
    int getDaysInYear(int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9145);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9146);return (((isLeapYear(year) )&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9147)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9148)==0&false))? 366 : 365;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Get the number of weeks in the year.
     *
     * @param year the year to use
     * @return number of weeks in the year
     */
    int getWeeksInYear(int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9149);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9150);long firstWeekMillis1 = getFirstWeekOfYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9151);long firstWeekMillis2 = getFirstWeekOfYearMillis(year + 1);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9152);return (int) ((firstWeekMillis2 - firstWeekMillis1) / DateTimeConstants.MILLIS_PER_WEEK);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Get the millis for the first week of a year.
     *
     * @param year the year to use
     * @return millis
     */
    long getFirstWeekOfYearMillis(int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9153);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9154);long jan1millis = getYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9155);int jan1dayOfWeek = getDayOfWeek(jan1millis);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9156);if ((((jan1dayOfWeek > (8 - iMinDaysInFirstWeek))&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9157)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9158)==0&false))) {{
            // First week is end of previous year because it doesn't have enough days.
            __CLR4_4_16xy6xylgchoqo5.R.inc(9159);return jan1millis + (8 - jan1dayOfWeek)
                    * (long) DateTimeConstants.MILLIS_PER_DAY;
        } }else {{
            // First week is start of this year because it has enough days.
            __CLR4_4_16xy6xylgchoqo5.R.inc(9160);return jan1millis - (jan1dayOfWeek - 1)
                    * (long) DateTimeConstants.MILLIS_PER_DAY;
        }
    }}finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Get the milliseconds for the start of a year.
     *
     * @param year The year to use.
     * @return millis from 1970-01-01T00:00:00Z
     */
    long getYearMillis(int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9161);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9162);return getYearInfo(year).iFirstDayMillis;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Get the milliseconds for the start of a month.
     *
     * @param year  The year to use.
     * @param month The month to use
     * @return millis from 1970-01-01T00:00:00Z
     */
    long getYearMonthMillis(int year, int month) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9163);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9164);long millis = getYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9165);millis += getTotalMillisByYearMonth(year, month);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9166);return millis;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Get the milliseconds for a particular date.
     *
     * @param year       The year to use.
     * @param month      The month to use
     * @param dayOfMonth The day of the month to use
     * @return millis from 1970-01-01T00:00:00Z
     */
    long getYearMonthDayMillis(int year, int month, int dayOfMonth) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9167);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9168);long millis = getYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9169);millis += getTotalMillisByYearMonth(year, month);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9170);return millis + (dayOfMonth - 1) * (long) DateTimeConstants.MILLIS_PER_DAY;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getYear(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9171);
        // Get an initial estimate of the year, and the millis value that
        // represents the start of that year. Then verify estimate and fix if
        // necessary.

        // Initial estimate uses values divided by two to avoid overflow.
        __CLR4_4_16xy6xylgchoqo5.R.inc(9172);long unitMillis = getAverageMillisPerYearDividedByTwo();
        __CLR4_4_16xy6xylgchoqo5.R.inc(9173);long i2 = (instant >> 1) + getApproxMillisAtEpochDividedByTwo();
        __CLR4_4_16xy6xylgchoqo5.R.inc(9174);if ((((i2 < 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9175)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9176)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9177);i2 = i2 - unitMillis + 1;
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9178);int year = (int) (i2 / unitMillis);

        __CLR4_4_16xy6xylgchoqo5.R.inc(9179);long yearStart = getYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9180);long diff = instant - yearStart;

        __CLR4_4_16xy6xylgchoqo5.R.inc(9181);if ((((diff < 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9182)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9183)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9184);year--;
        } }else {__CLR4_4_16xy6xylgchoqo5.R.inc(9185);if ((((diff >= DateTimeConstants.MILLIS_PER_DAY * 365L)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9186)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9187)==0&false))) {{
            // One year may need to be added to fix estimate.
            __CLR4_4_16xy6xylgchoqo5.R.inc(9188);long oneYear;
            __CLR4_4_16xy6xylgchoqo5.R.inc(9189);if ((((isLeapYear(year))&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9190)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9191)==0&false))) {{
                __CLR4_4_16xy6xylgchoqo5.R.inc(9192);oneYear = DateTimeConstants.MILLIS_PER_DAY * 366L;
            } }else {{
                __CLR4_4_16xy6xylgchoqo5.R.inc(9193);oneYear = DateTimeConstants.MILLIS_PER_DAY * 365L;
            }

            }__CLR4_4_16xy6xylgchoqo5.R.inc(9194);yearStart += oneYear;

            __CLR4_4_16xy6xylgchoqo5.R.inc(9195);if ((((yearStart <= instant)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9196)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9197)==0&false))) {{
                // Didn't go too far, so actually add one year.
                __CLR4_4_16xy6xylgchoqo5.R.inc(9198);year++;
            }
        }}

        }}__CLR4_4_16xy6xylgchoqo5.R.inc(9199);return year;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     */
    int getMonthOfYear(long millis) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9200);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9201);return getMonthOfYear(millis, getYear(millis));
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     * @param year   precalculated year of millis
     */
    abstract int getMonthOfYear(long millis, int year);

    /**
     * @param millis from 1970-01-01T00:00:00Z
     */
    int getDayOfMonth(long millis) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9202);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9203);int year = getYear(millis);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9204);int month = getMonthOfYear(millis, year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9205);return getDayOfMonth(millis, year, month);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     * @param year   precalculated year of millis
     */
    int getDayOfMonth(long millis, int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9206);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9207);int month = getMonthOfYear(millis, year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9208);return getDayOfMonth(millis, year, month);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param millis from 1970-01-01T00:00:00Z
     * @param year   precalculated year of millis
     * @param month  precalculated month of millis
     */
    int getDayOfMonth(long millis, int year, int month) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9209);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9210);long dateMillis = getYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9211);dateMillis += getTotalMillisByYearMonth(year, month);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9212);return (int) ((millis - dateMillis) / DateTimeConstants.MILLIS_PER_DAY) + 1;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getDayOfYear(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9213);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9214);return getDayOfYear(instant, getYear(instant));
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     * @param year    precalculated year of millis
     */
    int getDayOfYear(long instant, int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9215);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9216);long yearStart = getYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9217);return (int) ((instant - yearStart) / DateTimeConstants.MILLIS_PER_DAY) + 1;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getWeekyear(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9218);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9219);int year = getYear(instant);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9220);int week = getWeekOfWeekyear(instant, year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9221);if ((((week == 1)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9222)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9223)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9224);return getYear(instant + DateTimeConstants.MILLIS_PER_WEEK);
        } }else {__CLR4_4_16xy6xylgchoqo5.R.inc(9225);if ((((week > 51)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9226)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9227)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9228);return getYear(instant - (2 * DateTimeConstants.MILLIS_PER_WEEK));
        } }else {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9229);return year;
        }
    }}}finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getWeekOfWeekyear(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9230);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9231);return getWeekOfWeekyear(instant, getYear(instant));
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     * @param year    precalculated year of millis
     */
    int getWeekOfWeekyear(long instant, int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9232);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9233);long firstWeekMillis1 = getFirstWeekOfYearMillis(year);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9234);if ((((instant < firstWeekMillis1)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9235)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9236)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9237);return getWeeksInYear(year - 1);
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9238);long firstWeekMillis2 = getFirstWeekOfYearMillis(year + 1);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9239);if ((((instant >= firstWeekMillis2)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9240)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9241)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9242);return 1;
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9243);return (int) ((instant - firstWeekMillis1) / DateTimeConstants.MILLIS_PER_WEEK) + 1;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getDayOfWeek(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9244);
        // 1970-01-01 is day of week 4, Thursday.

        __CLR4_4_16xy6xylgchoqo5.R.inc(9245);long daysSince19700101;
        __CLR4_4_16xy6xylgchoqo5.R.inc(9246);if ((((instant >= 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9247)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9248)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9249);daysSince19700101 = instant / DateTimeConstants.MILLIS_PER_DAY;
        } }else {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9250);daysSince19700101 = (instant - (DateTimeConstants.MILLIS_PER_DAY - 1))
                    / DateTimeConstants.MILLIS_PER_DAY;
            __CLR4_4_16xy6xylgchoqo5.R.inc(9251);if ((((daysSince19700101 < -3)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9252)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9253)==0&false))) {{
                __CLR4_4_16xy6xylgchoqo5.R.inc(9254);return 7 + (int) ((daysSince19700101 + 4) % 7);
            }
        }}

        }__CLR4_4_16xy6xylgchoqo5.R.inc(9255);return 1 + (int) ((daysSince19700101 + 3) % 7);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * @param instant millis from 1970-01-01T00:00:00Z
     */
    int getMillisOfDay(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9256);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9257);if ((((instant >= 0)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9258)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9259)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9260);return (int) (instant % DateTimeConstants.MILLIS_PER_DAY);
        } }else {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9261);return (DateTimeConstants.MILLIS_PER_DAY - 1)
                    + (int) ((instant + 1) % DateTimeConstants.MILLIS_PER_DAY);
        }
    }}finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets the maximum number of days in any month.
     *
     * @return 31
     */
    int getDaysInMonthMax() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9262);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9263);return 31;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets the maximum number of days in the month specified by the instant.
     *
     * @param instant millis from 1970-01-01T00:00:00Z
     * @return the maximum number of days in the month
     */
    int getDaysInMonthMax(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9264);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9265);int thisYear = getYear(instant);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9266);int thisMonth = getMonthOfYear(instant, thisYear);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9267);return getDaysInYearMonth(thisYear, thisMonth);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets the maximum number of days in the month specified by the instant.
     * The value represents what the user is trying to set, and can be
     * used to optimise this method.
     *
     * @param instant millis from 1970-01-01T00:00:00Z
     * @param value   the value being set
     * @return the maximum number of days in the month
     */
    int getDaysInMonthMaxForSet(long instant, int value) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9268);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9269);return getDaysInMonthMax(instant);
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the milliseconds for a date at midnight.
     *
     * @param year        the year
     * @param monthOfYear the month
     * @param dayOfMonth  the day
     * @return the milliseconds
     */
    long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9270);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9271);FieldUtils.verifyValueBounds(DateTimeFieldType.year(), year, getMinYear() - 1, getMaxYear() + 1);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9272);FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), monthOfYear, 1, getMaxMonth(year));
        // avoid FieldUtils to get better error message
        __CLR4_4_16xy6xylgchoqo5.R.inc(9273);int upperBound = getDaysInYearMonth(year, monthOfYear);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9274);if (((((dayOfMonth < 1) || (dayOfMonth > upperBound))&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9275)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9276)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9277);throw new IllegalFieldValueException(
                    DateTimeFieldType.dayOfMonth(),
                    Integer.valueOf(dayOfMonth),
                    Integer.valueOf(1),
                    Integer.valueOf(upperBound),
                    "year: " + year + " month: " + monthOfYear);
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9278);long instant = getYearMonthDayMillis(year, monthOfYear, dayOfMonth);
        // check for limit caused by min/max year +1/-1
        __CLR4_4_16xy6xylgchoqo5.R.inc(9279);if ((((instant < 0 && year == getMaxYear() + 1)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9280)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9281)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9282);return Long.MAX_VALUE;
        } }else {__CLR4_4_16xy6xylgchoqo5.R.inc(9283);if ((((instant > 0 && year == getMinYear() - 1)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9284)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9285)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9286);return Long.MIN_VALUE;
        }
        }}__CLR4_4_16xy6xylgchoqo5.R.inc(9287);return instant;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets the difference between the two instants in years.
     *
     * @param minuendInstant    the first instant
     * @param subtrahendInstant the second instant
     * @return the difference
     */
    abstract long getYearDifference(long minuendInstant, long subtrahendInstant);

    /**
     * Is the specified year a leap year?
     *
     * @param year the year to test
     * @return true if leap
     */
    abstract boolean isLeapYear(int year);

    /**
     * Is the specified instant a leap day?
     *
     * @param instant the instant to test
     * @return true if leap, default is false
     */
    boolean isLeapDay(long instant) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9288);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9289);return false;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets the number of days in the specified month and year.
     *
     * @param year  the year
     * @param month the month
     * @return the number of days
     */
    abstract int getDaysInYearMonth(int year, int month);

    /**
     * Gets the maximum days in the specified month.
     *
     * @param month the month
     * @return the max days
     */
    abstract int getDaysInMonthMax(int month);

    /**
     * Gets the total number of millis elapsed in this year at the start
     * of the specified month, such as zero for month 1.
     *
     * @param year  the year
     * @param month the month
     * @return the elapsed millis at the start of the month
     */
    abstract long getTotalMillisByYearMonth(int year, int month);

    /**
     * Gets the millisecond value of the first day of the year.
     *
     * @return the milliseconds for the first of the year
     */
    abstract long calculateFirstDayOfYearMillis(int year);

    /**
     * Gets the minimum supported year.
     *
     * @return the year
     */
    abstract int getMinYear();

    /**
     * Gets the maximum supported year.
     *
     * @return the year
     */
    abstract int getMaxYear();

    /**
     * Gets the maximum month for the specified year.
     * This implementation calls getMaxMonth().
     *
     * @param year the year
     * @return the maximum month value
     */
    int getMaxMonth(int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9290);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9291);return getMaxMonth();
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets the maximum number of months.
     *
     * @return 12
     */
    int getMaxMonth() {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9292);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9293);return 12;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    /**
     * Gets an average value for the milliseconds per year.
     *
     * @return the millis per year
     */
    abstract long getAverageMillisPerYear();

    /**
     * Gets an average value for the milliseconds per year, divided by two.
     *
     * @return the millis per year divided by two
     */
    abstract long getAverageMillisPerYearDividedByTwo();

    /**
     * Gets an average value for the milliseconds per month.
     *
     * @return the millis per month
     */
    abstract long getAverageMillisPerMonth();

    /**
     * Returns a constant representing the approximate number of milliseconds
     * elapsed from year 0 of this chronology, divided by two. This constant
     * <em>must</em> be defined as:
     * <pre>
     *    (yearAtEpoch * averageMillisPerYear + millisOfYearAtEpoch) / 2
     * </pre>
     * where epoch is 1970-01-01 (Gregorian).
     */
    abstract long getApproxMillisAtEpochDividedByTwo();

    /**
     * Sets the year from an instant and year.
     *
     * @param instant millis from 1970-01-01T00:00:00Z
     * @param year    the year to set
     * @return the updated millis
     */
    abstract long setYear(long instant, int year);

    //-----------------------------------------------------------------------
    // Although accessed by multiple threads, this method doesn't need to be synchronized.
    private YearInfo getYearInfo(int year) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9294);
        __CLR4_4_16xy6xylgchoqo5.R.inc(9295);YearInfo info = iYearInfoCache[year & CACHE_MASK];
        __CLR4_4_16xy6xylgchoqo5.R.inc(9296);if ((((info == null || info.iYear != year)&&(__CLR4_4_16xy6xylgchoqo5.R.iget(9297)!=0|true))||(__CLR4_4_16xy6xylgchoqo5.R.iget(9298)==0&false))) {{
            __CLR4_4_16xy6xylgchoqo5.R.inc(9299);info = new YearInfo(year, calculateFirstDayOfYearMillis(year));
            __CLR4_4_16xy6xylgchoqo5.R.inc(9300);iYearInfoCache[year & CACHE_MASK] = info;
        }
        }__CLR4_4_16xy6xylgchoqo5.R.inc(9301);return info;
    }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

    private static class HalfdayField extends PreciseDateTimeField {
        @SuppressWarnings("unused")
        private static final long serialVersionUID = 581601443656929254L;

        HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), cHalfdaysField, cDaysField);__CLR4_4_16xy6xylgchoqo5.R.inc(9303);try{__CLR4_4_16xy6xylgchoqo5.R.inc(9302);
        }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

        public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9304);
            __CLR4_4_16xy6xylgchoqo5.R.inc(9305);return GJLocaleSymbols.forLocale(locale).halfdayValueToText(fieldValue);
        }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

        public long set(long millis, String text, Locale locale) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9306);
            __CLR4_4_16xy6xylgchoqo5.R.inc(9307);return set(millis, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(text));
        }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}

        public int getMaximumTextLength(Locale locale) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9308);
            __CLR4_4_16xy6xylgchoqo5.R.inc(9309);return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}
    }

    private static class YearInfo {
        public final int iYear;
        public final long iFirstDayMillis;

        YearInfo(int year, long firstDayMillis) {try{__CLR4_4_16xy6xylgchoqo5.R.inc(9310);
            __CLR4_4_16xy6xylgchoqo5.R.inc(9311);iYear = year;
            __CLR4_4_16xy6xylgchoqo5.R.inc(9312);iFirstDayMillis = firstDayMillis;
        }finally{__CLR4_4_16xy6xylgchoqo5.R.flushNeeded();}}
    }

}
