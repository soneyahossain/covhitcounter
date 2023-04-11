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
package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;

/**
 * Abstract Chronology that enables chronologies to be assembled from
 * a container of fields.
 * <p>
 * AssembledChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public abstract class AssembledChronology extends BaseChronology {public static class __CLR4_4_16hz6hzlgchoqn6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,8811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -6728465968995518215L;

    private final Chronology iBase;
    private final Object iParam;

    private transient DurationField iMillis;
    private transient DurationField iSeconds;
    private transient DurationField iMinutes;
    private transient DurationField iHours;
    private transient DurationField iHalfdays;

    private transient DurationField iDays;
    private transient DurationField iWeeks;
    private transient DurationField iWeekyears;
    private transient DurationField iMonths;
    private transient DurationField iYears;
    private transient DurationField iCenturies;
    private transient DurationField iEras;

    private transient DateTimeField iMillisOfSecond;
    private transient DateTimeField iMillisOfDay;
    private transient DateTimeField iSecondOfMinute;
    private transient DateTimeField iSecondOfDay;
    private transient DateTimeField iMinuteOfHour;
    private transient DateTimeField iMinuteOfDay;
    private transient DateTimeField iHourOfDay;
    private transient DateTimeField iClockhourOfDay;
    private transient DateTimeField iHourOfHalfday;
    private transient DateTimeField iClockhourOfHalfday;
    private transient DateTimeField iHalfdayOfDay;

    private transient DateTimeField iDayOfWeek;
    private transient DateTimeField iDayOfMonth;
    private transient DateTimeField iDayOfYear;
    private transient DateTimeField iWeekOfWeekyear;
    private transient DateTimeField iWeekyear;
    private transient DateTimeField iWeekyearOfCentury;
    private transient DateTimeField iMonthOfYear;
    private transient DateTimeField iYear;
    private transient DateTimeField iYearOfEra;
    private transient DateTimeField iYearOfCentury;
    private transient DateTimeField iCenturyOfEra;
    private transient DateTimeField iEra;

    // Bit set determines which base fields are used
    // bit 1 set: hourOfDay, minuteOfHour, secondOfMinute, and millisOfSecond fields
    // bit 2 set: millisOfDayField
    // bit 3 set: year, monthOfYear, and dayOfMonth fields
    private transient int iBaseFlags;

    /**
     * Constructor calls the assemble method, enabling subclasses to define its
     * supported fields. If a base chronology is supplied, the field set
     * initially contains references to each base chronology field.
     * <p>
     * Other methods in this class will delegate to the base chronology, if it
     * can be determined that the base chronology will produce the same results
     * as AbstractChronology.
     *
     * @param base  optional base chronology to copy initial fields from
     * @param param optional param object available for assemble method
     */
    protected AssembledChronology(Chronology base, Object param) {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8423);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8424);iBase = base;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8425);iParam = param;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8426);setFields();
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public DateTimeZone getZone() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8427);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8428);Chronology base;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8429);if ((base = iBase) != null) {{
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8432);return base.getZone();
        }
        }__CLR4_4_16hz6hzlgchoqn6.R.inc(8433);return null;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int millisOfDay)
            throws IllegalArgumentException {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8434);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8435);Chronology base;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8436);if ((base = iBase) != null && (iBaseFlags & 6) == 6) {{
            // Only call specialized implementation if applicable fields are the same.
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8439);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
        }
        }__CLR4_4_16hz6hzlgchoqn6.R.inc(8440);return super.getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay);
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8441);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8442);Chronology base;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8443);if ((base = iBase) != null && (iBaseFlags & 5) == 5) {{
            // Only call specialized implementation if applicable fields are the same.
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8446);return base.getDateTimeMillis(year, monthOfYear, dayOfMonth,
                    hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }
        }__CLR4_4_16hz6hzlgchoqn6.R.inc(8447);return super.getDateTimeMillis(year, monthOfYear, dayOfMonth,
                hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public long getDateTimeMillis(long instant,
                                  int hourOfDay, int minuteOfHour,
                                  int secondOfMinute, int millisOfSecond)
            throws IllegalArgumentException {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8448);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8449);Chronology base;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8450);if ((base = iBase) != null && (iBaseFlags & 1) == 1) {{
            // Only call specialized implementation if applicable fields are the same.
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8453);return base.getDateTimeMillis
                    (instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
        }
        }__CLR4_4_16hz6hzlgchoqn6.R.inc(8454);return super.getDateTimeMillis
                (instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond);
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField millis() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8455);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8456);return iMillis;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField millisOfSecond() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8457);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8458);return iMillisOfSecond;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField millisOfDay() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8459);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8460);return iMillisOfDay;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField seconds() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8461);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8462);return iSeconds;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField secondOfMinute() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8463);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8464);return iSecondOfMinute;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField secondOfDay() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8465);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8466);return iSecondOfDay;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField minutes() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8467);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8468);return iMinutes;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField minuteOfHour() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8469);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8470);return iMinuteOfHour;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField minuteOfDay() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8471);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8472);return iMinuteOfDay;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField hours() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8473);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8474);return iHours;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField hourOfDay() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8475);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8476);return iHourOfDay;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField clockhourOfDay() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8477);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8478);return iClockhourOfDay;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField halfdays() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8479);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8480);return iHalfdays;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField hourOfHalfday() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8481);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8482);return iHourOfHalfday;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField clockhourOfHalfday() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8483);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8484);return iClockhourOfHalfday;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField halfdayOfDay() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8485);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8486);return iHalfdayOfDay;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField days() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8487);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8488);return iDays;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField dayOfWeek() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8489);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8490);return iDayOfWeek;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField dayOfMonth() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8491);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8492);return iDayOfMonth;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField dayOfYear() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8493);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8494);return iDayOfYear;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField weeks() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8495);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8496);return iWeeks;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField weekOfWeekyear() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8497);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8498);return iWeekOfWeekyear;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField weekyears() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8499);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8500);return iWeekyears;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField weekyear() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8501);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8502);return iWeekyear;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField weekyearOfCentury() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8503);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8504);return iWeekyearOfCentury;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField months() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8505);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8506);return iMonths;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField monthOfYear() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8507);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8508);return iMonthOfYear;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField years() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8509);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8510);return iYears;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField year() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8511);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8512);return iYear;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField yearOfEra() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8513);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8514);return iYearOfEra;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField yearOfCentury() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8515);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8516);return iYearOfCentury;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField centuries() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8517);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8518);return iCenturies;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField centuryOfEra() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8519);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8520);return iCenturyOfEra;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DurationField eras() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8521);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8522);return iEras;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    public final DateTimeField era() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8523);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8524);return iEra;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    /**
     * Invoked by the constructor and after deserialization to allow subclasses
     * to define all of its supported fields. All unset fields default to
     * unsupported instances.
     *
     * @param fields container of fields
     */
    protected abstract void assemble(Fields fields);

    /**
     * Returns the same base chronology as passed into the constructor.
     */
    protected final Chronology getBase() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8525);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8526);return iBase;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    /**
     * Returns the same param object as passed into the constructor.
     */
    protected final Object getParam() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8527);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8528);return iParam;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    private void setFields() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8529);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8530);Fields fields = new Fields();
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8531);if ((((iBase != null)&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8532)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8533)==0&false))) {{
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8534);fields.copyFieldsFrom(iBase);
        }
        }__CLR4_4_16hz6hzlgchoqn6.R.inc(8535);assemble(fields);

        {
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8536);DurationField f;
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8537);iMillis = (f = fields.millis) != null ? f : super.millis();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8540);iSeconds = (f = fields.seconds) != null ? f : super.seconds();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8543);iMinutes = (f = fields.minutes) != null ? f : super.minutes();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8546);iHours = (f = fields.hours) != null ? f : super.hours();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8549);iHalfdays = (f = fields.halfdays) != null ? f : super.halfdays();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8552);iDays = (f = fields.days) != null ? f : super.days();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8555);iWeeks = (f = fields.weeks) != null ? f : super.weeks();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8558);iWeekyears = (f = fields.weekyears) != null ? f : super.weekyears();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8561);iMonths = (f = fields.months) != null ? f : super.months();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8564);iYears = (f = fields.years) != null ? f : super.years();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8567);iCenturies = (f = fields.centuries) != null ? f : super.centuries();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8570);iEras = (f = fields.eras) != null ? f : super.eras();
        }

        {
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8573);DateTimeField f;
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8574);iMillisOfSecond = (f = fields.millisOfSecond) != null ? f : super.millisOfSecond();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8577);iMillisOfDay = (f = fields.millisOfDay) != null ? f : super.millisOfDay();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8580);iSecondOfMinute = (f = fields.secondOfMinute) != null ? f : super.secondOfMinute();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8583);iSecondOfDay = (f = fields.secondOfDay) != null ? f : super.secondOfDay();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8586);iMinuteOfHour = (f = fields.minuteOfHour) != null ? f : super.minuteOfHour();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8589);iMinuteOfDay = (f = fields.minuteOfDay) != null ? f : super.minuteOfDay();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8592);iHourOfDay = (f = fields.hourOfDay) != null ? f : super.hourOfDay();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8595);iClockhourOfDay = (f = fields.clockhourOfDay) != null ? f : super.clockhourOfDay();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8598);iHourOfHalfday = (f = fields.hourOfHalfday) != null ? f : super.hourOfHalfday();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8601);iClockhourOfHalfday = (f = fields.clockhourOfHalfday) != null ? f : super.clockhourOfHalfday();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8604);iHalfdayOfDay = (f = fields.halfdayOfDay) != null ? f : super.halfdayOfDay();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8607);iDayOfWeek = (f = fields.dayOfWeek) != null ? f : super.dayOfWeek();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8610);iDayOfMonth = (f = fields.dayOfMonth) != null ? f : super.dayOfMonth();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8613);iDayOfYear = (f = fields.dayOfYear) != null ? f : super.dayOfYear();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8616);iWeekOfWeekyear = (f = fields.weekOfWeekyear) != null ? f : super.weekOfWeekyear();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8619);iWeekyear = (f = fields.weekyear) != null ? f : super.weekyear();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8622);iWeekyearOfCentury = (f = fields.weekyearOfCentury) != null ? f : super.weekyearOfCentury();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8625);iMonthOfYear = (f = fields.monthOfYear) != null ? f : super.monthOfYear();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8628);iYear = (f = fields.year) != null ? f : super.year();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8631);iYearOfEra = (f = fields.yearOfEra) != null ? f : super.yearOfEra();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8634);iYearOfCentury = (f = fields.yearOfCentury) != null ? f : super.yearOfCentury();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8637);iCenturyOfEra = (f = fields.centuryOfEra) != null ? f : super.centuryOfEra();
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8640);iEra = (f = fields.era) != null ? f : super.era();
        }

        __CLR4_4_16hz6hzlgchoqn6.R.inc(8643);int flags;
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8644);if ((((iBase == null)&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8645)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8646)==0&false))) {{
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8647);flags = 0;
        } }else {{
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8648);flags =
                    (((((iHourOfDay == iBase.hourOfDay() &&
                            iMinuteOfHour == iBase.minuteOfHour() &&
                            iSecondOfMinute == iBase.secondOfMinute() &&
                            iMillisOfSecond == iBase.millisOfSecond()) )&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8649)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8650)==0&false))? 1 : 0) |

                            (((((iMillisOfDay == iBase.millisOfDay()) )&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8651)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8652)==0&false))? 2 : 0) |

                            (((((iYear == iBase.year() &&
                                    iMonthOfYear == iBase.monthOfYear() &&
                                    iDayOfMonth == iBase.dayOfMonth()) )&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8653)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8654)==0&false))? 4 : 0);
        }

        }__CLR4_4_16hz6hzlgchoqn6.R.inc(8655);iBaseFlags = flags;
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8656);
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8657);in.defaultReadObject();
        __CLR4_4_16hz6hzlgchoqn6.R.inc(8658);setFields();
    }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

    /**
     * A container of fields used for assembling a chronology.
     */
    public static final class Fields {
        public DurationField millis;
        public DurationField seconds;
        public DurationField minutes;
        public DurationField hours;
        public DurationField halfdays;

        public DurationField days;
        public DurationField weeks;
        public DurationField weekyears;
        public DurationField months;
        public DurationField years;
        public DurationField centuries;
        public DurationField eras;

        public DateTimeField millisOfSecond;
        public DateTimeField millisOfDay;
        public DateTimeField secondOfMinute;
        public DateTimeField secondOfDay;
        public DateTimeField minuteOfHour;
        public DateTimeField minuteOfDay;
        public DateTimeField hourOfDay;
        public DateTimeField clockhourOfDay;
        public DateTimeField hourOfHalfday;
        public DateTimeField clockhourOfHalfday;
        public DateTimeField halfdayOfDay;

        public DateTimeField dayOfWeek;
        public DateTimeField dayOfMonth;
        public DateTimeField dayOfYear;
        public DateTimeField weekOfWeekyear;
        public DateTimeField weekyear;
        public DateTimeField weekyearOfCentury;
        public DateTimeField monthOfYear;
        public DateTimeField year;
        public DateTimeField yearOfEra;
        public DateTimeField yearOfCentury;
        public DateTimeField centuryOfEra;
        public DateTimeField era;

        Fields() {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8659);
        }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

        /**
         * Copy the supported fields from a chronology into this container.
         */
        public void copyFieldsFrom(Chronology chrono) {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8660);
            {
                __CLR4_4_16hz6hzlgchoqn6.R.inc(8661);DurationField f;
                __CLR4_4_16hz6hzlgchoqn6.R.inc(8662);if (isSupported(f = chrono.millis())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8665);millis = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8666);if (isSupported(f = chrono.seconds())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8669);seconds = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8670);if (isSupported(f = chrono.minutes())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8673);minutes = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8674);if (isSupported(f = chrono.hours())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8677);hours = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8678);if (isSupported(f = chrono.halfdays())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8681);halfdays = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8682);if (isSupported(f = chrono.days())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8685);days = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8686);if (isSupported(f = chrono.weeks())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8689);weeks = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8690);if (isSupported(f = chrono.weekyears())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8693);weekyears = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8694);if (isSupported(f = chrono.months())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8697);months = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8698);if (isSupported(f = chrono.years())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8701);years = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8702);if (isSupported(f = chrono.centuries())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8705);centuries = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8706);if (isSupported(f = chrono.eras())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8709);eras = f;
                }
            }}

            {
                __CLR4_4_16hz6hzlgchoqn6.R.inc(8710);DateTimeField f;
                __CLR4_4_16hz6hzlgchoqn6.R.inc(8711);if (isSupported(f = chrono.millisOfSecond())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8714);millisOfSecond = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8715);if (isSupported(f = chrono.millisOfDay())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8718);millisOfDay = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8719);if (isSupported(f = chrono.secondOfMinute())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8722);secondOfMinute = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8723);if (isSupported(f = chrono.secondOfDay())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8726);secondOfDay = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8727);if (isSupported(f = chrono.minuteOfHour())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8730);minuteOfHour = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8731);if (isSupported(f = chrono.minuteOfDay())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8734);minuteOfDay = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8735);if (isSupported(f = chrono.hourOfDay())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8738);hourOfDay = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8739);if (isSupported(f = chrono.clockhourOfDay())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8742);clockhourOfDay = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8743);if (isSupported(f = chrono.hourOfHalfday())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8746);hourOfHalfday = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8747);if (isSupported(f = chrono.clockhourOfHalfday())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8750);clockhourOfHalfday = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8751);if (isSupported(f = chrono.halfdayOfDay())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8754);halfdayOfDay = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8755);if (isSupported(f = chrono.dayOfWeek())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8758);dayOfWeek = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8759);if (isSupported(f = chrono.dayOfMonth())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8762);dayOfMonth = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8763);if (isSupported(f = chrono.dayOfYear())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8766);dayOfYear = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8767);if (isSupported(f = chrono.weekOfWeekyear())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8770);weekOfWeekyear = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8771);if (isSupported(f = chrono.weekyear())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8774);weekyear = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8775);if (isSupported(f = chrono.weekyearOfCentury())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8778);weekyearOfCentury = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8779);if (isSupported(f = chrono.monthOfYear())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8782);monthOfYear = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8783);if (isSupported(f = chrono.year())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8786);year = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8787);if (isSupported(f = chrono.yearOfEra())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8790);yearOfEra = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8791);if (isSupported(f = chrono.yearOfCentury())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8794);yearOfCentury = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8795);if (isSupported(f = chrono.centuryOfEra())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8798);centuryOfEra = f;
                }
                }__CLR4_4_16hz6hzlgchoqn6.R.inc(8799);if (isSupported(f = chrono.era())) {{
                    __CLR4_4_16hz6hzlgchoqn6.R.inc(8802);era = f;
                }
            }}
        }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

        private static boolean isSupported(DurationField field) {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8803);
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8804);return (((field == null )&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8805)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8806)==0&false))? false : field.isSupported();
        }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}

        private static boolean isSupported(DateTimeField field) {try{__CLR4_4_16hz6hzlgchoqn6.R.inc(8807);
            __CLR4_4_16hz6hzlgchoqn6.R.inc(8808);return (((field == null )&&(__CLR4_4_16hz6hzlgchoqn6.R.iget(8809)!=0|true))||(__CLR4_4_16hz6hzlgchoqn6.R.iget(8810)==0&false))? false : field.isSupported();
        }finally{__CLR4_4_16hz6hzlgchoqn6.R.flushNeeded();}}
    }
}
