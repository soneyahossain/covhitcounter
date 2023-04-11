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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/**
 * Provides time calculations for the week of the weekyear component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJWeekyearDateTimeField
 */
final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField {public static class __CLR4_4_17lw7lwlgchoqpw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 6215066916806820644L;

    private static final long WEEK_53 = (53L - 1) * DateTimeConstants.MILLIS_PER_WEEK;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    BasicWeekyearDateTimeField(BasicChronology chronology) {
        super(DateTimeFieldType.weekyear(), chronology.getAverageMillisPerYear());__CLR4_4_17lw7lwlgchoqpw.R.inc(9861);try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9860);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9862);iChronology = chronology;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9863);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9864);return false;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    /**
     * Get the Year of a week based year component of the specified time instant.
     *
     * @param instant the time instant in millis to query.
     * @return the year extracted from the input.
     * @see org.joda.time.DateTimeField#get
     */
    public int get(long instant) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9865);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9866);return iChronology.getWeekyear(instant);
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    /**
     * Add the specified years to the specified time instant.
     *
     * @param instant the time instant in millis to update.
     * @param years   the years to add (can be negative).
     * @return the updated time instant.
     * @see org.joda.time.DateTimeField#add
     */
    public long add(long instant, int years) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9867);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9868);if ((((years == 0)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9869)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9870)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9871);return instant;
        }
        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9872);return set(instant, get(instant) + years);
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9873);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9874);return add(instant, FieldUtils.safeToInt(value));
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    /**
     * Add to the year component of the specified time instant
     * wrapping around within that component if necessary.
     *
     * @param instant the time instant in millis to update.
     * @param years   the years to add (can be negative).
     * @return the updated time instant.
     * @see org.joda.time.DateTimeField#addWrapField
     */
    public long addWrapField(long instant, int years) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9875);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9876);return add(instant, years);
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9877);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9878);if ((((minuendInstant < subtrahendInstant)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9879)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9880)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9881);return -getDifference(subtrahendInstant, minuendInstant);
        }

        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9882);int minuendWeekyear = get(minuendInstant);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9883);int subtrahendWeekyear = get(subtrahendInstant);

        __CLR4_4_17lw7lwlgchoqpw.R.inc(9884);long minuendRem = remainder(minuendInstant);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9885);long subtrahendRem = remainder(subtrahendInstant);

        // Balance leap weekyear differences on remainders.
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9886);if ((((subtrahendRem >= WEEK_53 && iChronology.getWeeksInYear(minuendWeekyear) <= 52)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9887)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9888)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9889);subtrahendRem -= DateTimeConstants.MILLIS_PER_WEEK;
        }

        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9890);int difference = minuendWeekyear - subtrahendWeekyear;
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9891);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9892)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9893)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9894);difference--;
        }
        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9895);return difference;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    /**
     * Set the Year of a week based year component of the specified time instant.
     *
     * @param instant the time instant in millis to update.
     * @param year    the year (-9999,9999) to set the date to.
     * @return the updated DateTime.
     * @throws IllegalArgumentException if year is invalid.
     * @see org.joda.time.DateTimeField#set
     */
    public long set(long instant, int year) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9896);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9897);FieldUtils.verifyValueBounds(this, Math.abs(year),
                iChronology.getMinYear(), iChronology.getMaxYear());
        //
        // Do nothing if no real change is requested.
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9898);int thisWeekyear = get(instant);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9899);if ((((thisWeekyear == year)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9900)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9901)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9902);return instant;
        }
        //
        // Calculate the DayOfWeek (to be preserved).
        //
        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9903);int thisDow = iChronology.getDayOfWeek(instant);
        //
        // Calculate the maximum weeks in the target year.
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9904);int weeksInFromYear = iChronology.getWeeksInYear(thisWeekyear);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9905);int weeksInToYear = iChronology.getWeeksInYear(year);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9906);int maxOutWeeks = ((((weeksInToYear < weeksInFromYear) )&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9907)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9908)==0&false))?
                weeksInToYear : weeksInFromYear;
        //
        // Get the current week of the year. This will be preserved in
        // the output unless it is greater than the maximum possible
        // for the target weekyear.  In that case it is adjusted
        // to the maximum possible.
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9909);int setToWeek = iChronology.getWeekOfWeekyear(instant);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9910);if ((((setToWeek > maxOutWeeks)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9911)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9912)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9913);setToWeek = maxOutWeeks;
        }
        //
        // Get a wroking copy of the current date-time.
        // This can be a convenience for debugging.
        //
        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9914);long workInstant = instant; // Get a copy
        //
        // Attempt to get close to the proper weekyear.
        // Note - we cannot currently call ourself, so we just call
        // set for the year.  This at least gets us close.
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9915);workInstant = iChronology.setYear(workInstant, year);
        //
        // Calculate the weekyear number for the get close to value
        // (which might not be equal to the year just set).
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9916);int workWoyYear = get(workInstant);

        //
        // At most we are off by one year, which can be "fixed" by
        // adding/subtracting a week.
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9917);if ((((workWoyYear < year)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9918)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9919)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9920);workInstant += DateTimeConstants.MILLIS_PER_WEEK;
        } }else {__CLR4_4_17lw7lwlgchoqpw.R.inc(9921);if ((((workWoyYear > year)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9922)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9923)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9924);workInstant -= DateTimeConstants.MILLIS_PER_WEEK;
        }
        //
        // Set the proper week in the current weekyear.
        //

        // BEGIN: possible set WeekOfWeekyear logic.
        }}__CLR4_4_17lw7lwlgchoqpw.R.inc(9925);int currentWoyWeek = iChronology.getWeekOfWeekyear(workInstant);
        // No range check required (we already know it is OK).
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9926);workInstant = workInstant + (setToWeek - currentWoyWeek)
                * (long) DateTimeConstants.MILLIS_PER_WEEK;
        // END: possible set WeekOfWeekyear logic.

        //
        // Reset DayOfWeek to previous value.
        //
        // Note: This works fine, but it ideally shouldn't invoke other
        // fields from within a field.
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9927);workInstant = iChronology.dayOfWeek().set(workInstant, thisDow);
        //
        // Return result.
        //
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9928);return workInstant;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9929);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9930);return null;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9931);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9932);return iChronology.getWeeksInYear(iChronology.getWeekyear(instant)) > 52;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9933);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9934);return iChronology.getWeeksInYear(iChronology.getWeekyear(instant)) - 52;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9935);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9936);return iChronology.weeks();
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9937);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9938);return iChronology.getMinYear();
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9939);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9940);return iChronology.getMaxYear();
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9941);
        // Note: This works fine, but it ideally shouldn't invoke other
        // fields from within a field.
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9942);instant = iChronology.weekOfWeekyear().roundFloor(instant);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9943);int wow = iChronology.getWeekOfWeekyear(instant);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9944);if ((((wow > 1)&&(__CLR4_4_17lw7lwlgchoqpw.R.iget(9945)!=0|true))||(__CLR4_4_17lw7lwlgchoqpw.R.iget(9946)==0&false))) {{
            __CLR4_4_17lw7lwlgchoqpw.R.inc(9947);instant -= ((long) DateTimeConstants.MILLIS_PER_WEEK) * (wow - 1);
        }
        }__CLR4_4_17lw7lwlgchoqpw.R.inc(9948);return instant;
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9949);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9950);return instant - roundFloor(instant);
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17lw7lwlgchoqpw.R.inc(9951);
        __CLR4_4_17lw7lwlgchoqpw.R.inc(9952);return iChronology.weekyear();
    }finally{__CLR4_4_17lw7lwlgchoqpw.R.flushNeeded();}}
}
