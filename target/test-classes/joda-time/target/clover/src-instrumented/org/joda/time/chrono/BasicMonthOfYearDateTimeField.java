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
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/**
 * Provides time calculations for the month of the year component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.2, refactored from GJMonthOfYearDateTimeField
 */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {public static class __CLR4_4_17eh7ehlgchoqpf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = -8258715387168736L;

    private static final int MIN = DateTimeConstants.JANUARY;

    private final BasicChronology iChronology;
    private final int iMax;
    private final int iLeapMonth;

    /**
     * Restricted constructor.
     *
     * @param leapMonth the month of year that leaps
     */
    BasicMonthOfYearDateTimeField(BasicChronology chronology, int leapMonth) {
        super(DateTimeFieldType.monthOfYear(), chronology.getAverageMillisPerMonth());__CLR4_4_17eh7ehlgchoqpf.R.inc(9594);try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9593);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9595);iChronology = chronology;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9596);iMax = iChronology.getMaxMonth();
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9597);iLeapMonth = leapMonth;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public boolean isLenient() {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9598);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9599);return false;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the Month component of the specified time instant.
     *
     * @param instant the time instant in millis to query.
     * @return the month extracted from the input.
     * @see org.joda.time.DateTimeField#get(long)
     * @see org.joda.time.ReadableDateTime#getMonthOfYear()
     */
    public int get(long instant) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9600);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9601);return iChronology.getMonthOfYear(instant);
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Add the specified month to the specified time instant.
     * The amount added may be negative.<p>
     * If the new month has less total days than the specified
     * day of the month, this value is coerced to the nearest
     * sane value. e.g.<p>
     * 07-31 - (1 month) = 06-30<p>
     * 03-31 - (1 month) = 02-28 or 02-29 depending<p>
     *
     * @param instant the time instant in millis to update.
     * @param months  the months to add (can be negative).
     * @return the updated time instant.
     * @see org.joda.time.DateTimeField#add
     * @see org.joda.time.ReadWritableDateTime#addMonths(int)
     */
    public long add(long instant, int months) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9602);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9603);if ((((months == 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9604)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9605)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9606);return instant; // the easy case
        }
        //
        // Save time part first.
        //
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9607);long timePart = iChronology.getMillisOfDay(instant);
        //
        //
        // Get this year and month.
        //
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9608);int thisYear = iChronology.getYear(instant);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9609);int thisMonth = iChronology.getMonthOfYear(instant, thisYear);
        // ----------------------------------------------------------
        //
        // Do not refactor without careful consideration.
        // Order of calculation is important.
        //
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9610);int yearToUse = thisYear;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9611);;
        // Initially, monthToUse is zero-based
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9612);int monthToUse = thisMonth - 1 + months;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9613);if ((((thisMonth > 0 && monthToUse < 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9614)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9615)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9616);if ((((Math.signum(months + iMax) == Math.signum(months))&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9617)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9618)==0&false))) {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9619);yearToUse--;
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9620);months += iMax;
            } }else {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9621);yearToUse++;
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9622);months -= iMax;
            }
            }__CLR4_4_17eh7ehlgchoqpf.R.inc(9623);monthToUse = thisMonth - 1 + months;
        }
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9624);if ((((monthToUse >= 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9625)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9626)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9627);yearToUse = yearToUse + (monthToUse / iMax);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9628);monthToUse = (monthToUse % iMax) + 1;
        } }else {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9629);yearToUse = yearToUse + (monthToUse / iMax) - 1;
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9630);monthToUse = Math.abs(monthToUse);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9631);int remMonthToUse = monthToUse % iMax;
            // Take care of the boundary condition
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9632);if ((((remMonthToUse == 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9633)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9634)==0&false))) {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9635);remMonthToUse = iMax;
            }
            }__CLR4_4_17eh7ehlgchoqpf.R.inc(9636);monthToUse = iMax - remMonthToUse + 1;
            // Take care of the boundary condition
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9637);if ((((monthToUse == 1)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9638)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9639)==0&false))) {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9640);yearToUse += 1;
            }
        }}
        // End of do not refactor.
        // ----------------------------------------------------------

        //
        // Quietly force DOM to nearest sane value.
        //
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9641);int dayToUse = iChronology.getDayOfMonth(instant, thisYear, thisMonth);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9642);int maxDay = iChronology.getDaysInYearMonth(yearToUse, monthToUse);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9643);if ((((dayToUse > maxDay)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9644)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9645)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9646);dayToUse = maxDay;
        }
        //
        // get proper date part, and return result
        //
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9647);long datePart =
                iChronology.getYearMonthDayMillis(yearToUse, monthToUse, dayToUse);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9648);return datePart + timePart;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long add(long instant, long months) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9649);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9650);int i_months = (int) months;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9651);if ((((i_months == months)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9652)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9653)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9654);return add(instant, i_months);
        }

        // Copied from add(long, int) and modified slightly:

        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9655);long timePart = iChronology.getMillisOfDay(instant);

        __CLR4_4_17eh7ehlgchoqpf.R.inc(9656);int thisYear = iChronology.getYear(instant);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9657);int thisMonth = iChronology.getMonthOfYear(instant, thisYear);

        __CLR4_4_17eh7ehlgchoqpf.R.inc(9658);long yearToUse;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9659);long monthToUse = thisMonth - 1 + months;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9660);if ((((monthToUse >= 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9661)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9662)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9663);yearToUse = thisYear + (monthToUse / iMax);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9664);monthToUse = (monthToUse % iMax) + 1;
        } }else {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9665);yearToUse = thisYear + (monthToUse / iMax) - 1;
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9666);monthToUse = Math.abs(monthToUse);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9667);int remMonthToUse = (int) (monthToUse % iMax);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9668);if ((((remMonthToUse == 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9669)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9670)==0&false))) {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9671);remMonthToUse = iMax;
            }
            }__CLR4_4_17eh7ehlgchoqpf.R.inc(9672);monthToUse = iMax - remMonthToUse + 1;
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9673);if ((((monthToUse == 1)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9674)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9675)==0&false))) {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9676);yearToUse += 1;
            }
        }}

        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9677);if ((((yearToUse < iChronology.getMinYear() ||
                yearToUse > iChronology.getMaxYear())&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9678)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9679)==0&false))) {{

            __CLR4_4_17eh7ehlgchoqpf.R.inc(9680);throw new IllegalArgumentException
                    ("Magnitude of add amount is too large: " + months);
        }

        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9681);int i_yearToUse = (int) yearToUse;
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9682);int i_monthToUse = (int) monthToUse;

        __CLR4_4_17eh7ehlgchoqpf.R.inc(9683);int dayToUse = iChronology.getDayOfMonth(instant, thisYear, thisMonth);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9684);int maxDay = iChronology.getDaysInYearMonth(i_yearToUse, i_monthToUse);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9685);if ((((dayToUse > maxDay)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9686)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9687)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9688);dayToUse = maxDay;
        }

        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9689);long datePart =
                iChronology.getYearMonthDayMillis(i_yearToUse, i_monthToUse, dayToUse);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9690);return datePart + timePart;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int[] add(ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9691);
        // overridden as superclass algorithm can't handle
        // 2004-02-29 + 48 months -> 2008-02-29 type dates
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9692);if ((((valueToAdd == 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9693)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9694)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9695);return values;
        }
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9696);if ((((partial.size() > 0 && partial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && fieldIndex == 0)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9697)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9698)==0&false))) {{
            // month is largest field and being added to, such as month-day
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9699);int curMonth0 = values[0] - 1;
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9700);int newMonth = ((curMonth0 + (valueToAdd % 12) + 12) % 12) + 1;
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9701);return set(partial, 0, values, newMonth);
        }
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9702);if ((((DateTimeUtils.isContiguous(partial))&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9703)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9704)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9705);long instant = 0L;
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9706);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9707)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9708)==0&false)); i++) {{
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9709);instant = partial.getFieldType(i).getField(iChronology).set(instant, values[i]);
            }
            }__CLR4_4_17eh7ehlgchoqpf.R.inc(9710);instant = add(instant, valueToAdd);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9711);return iChronology.get(partial, instant);
        } }else {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9712);return super.add(partial, fieldIndex, values, valueToAdd);
        }
    }}finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Add to the Month component of the specified time instant
     * wrapping around within that component if necessary.
     *
     * @param instant the time instant in millis to update.
     * @param months  the months to add (can be negative).
     * @return the updated time instant.
     * @see org.joda.time.DateTimeField#addWrapField
     */
    public long addWrapField(long instant, int months) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9713);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9714);return set(instant, FieldUtils.getWrappedValue(get(instant), months, MIN, iMax));
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9715);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9716);if ((((minuendInstant < subtrahendInstant)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9717)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9718)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9719);return -getDifference(subtrahendInstant, minuendInstant);
        }

        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9720);int minuendYear = iChronology.getYear(minuendInstant);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9721);int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9722);int subtrahendYear = iChronology.getYear(subtrahendInstant);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9723);int subtrahendMonth = iChronology.getMonthOfYear(subtrahendInstant, subtrahendYear);

        __CLR4_4_17eh7ehlgchoqpf.R.inc(9724);long difference = (minuendYear - subtrahendYear) * ((long) iMax) + minuendMonth - subtrahendMonth;

        // Before adjusting for remainder, account for special case of add
        // where the day-of-month is forced to the nearest sane value.
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9725);int minuendDom = iChronology.getDayOfMonth
                (minuendInstant, minuendYear, minuendMonth);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9726);if ((((minuendDom == iChronology.getDaysInYearMonth(minuendYear, minuendMonth))&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9727)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9728)==0&false))) {{
            // Last day of the minuend month...
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9729);int subtrahendDom = iChronology.getDayOfMonth
                    (subtrahendInstant, subtrahendYear, subtrahendMonth);
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9730);if ((((subtrahendDom > minuendDom)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9731)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9732)==0&false))) {{
                // ...and day of subtrahend month is larger.
                // Note: This works fine, but it ideally shouldn't invoke other
                // fields from within a field.
                __CLR4_4_17eh7ehlgchoqpf.R.inc(9733);subtrahendInstant = iChronology.dayOfMonth().set(subtrahendInstant, minuendDom);
            }
        }}

        // Inlined remainder method to avoid duplicate calls.
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9734);long minuendRem = minuendInstant
                - iChronology.getYearMonthMillis(minuendYear, minuendMonth);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9735);long subtrahendRem = subtrahendInstant
                - iChronology.getYearMonthMillis(subtrahendYear, subtrahendMonth);

        __CLR4_4_17eh7ehlgchoqpf.R.inc(9736);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9737)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9738)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9739);difference--;
        }

        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9740);return difference;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Set the Month component of the specified time instant.<p>
     * If the new month has less total days than the specified
     * day of the month, this value is coerced to the nearest
     * sane value. e.g.<p>
     * 07-31 to month 6 = 06-30<p>
     * 03-31 to month 2 = 02-28 or 02-29 depending<p>
     *
     * @param instant the time instant in millis to update.
     * @param month   the month (1,12) to update the time to.
     * @return the updated time instant.
     * @throws IllegalArgumentException if month is invalid
     */
    public long set(long instant, int month) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9741);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9742);FieldUtils.verifyValueBounds(this, month, MIN, iMax);
        //
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9743);int thisYear = iChronology.getYear(instant);
        //
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9744);int thisDom = iChronology.getDayOfMonth(instant, thisYear);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9745);int maxDom = iChronology.getDaysInYearMonth(thisYear, month);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9746);if ((((thisDom > maxDom)&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9747)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9748)==0&false))) {{
            // Quietly force DOM to nearest sane value.
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9749);thisDom = maxDom;
        }
        // Return newly calculated millis value
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9750);return iChronology.getYearMonthDayMillis(thisYear, month, thisDom) +
                iChronology.getMillisOfDay(instant);
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public DurationField getRangeDurationField() {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9751);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9752);return iChronology.years();
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public boolean isLeap(long instant) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9753);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9754);int thisYear = iChronology.getYear(instant);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9755);if ((((iChronology.isLeapYear(thisYear))&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9756)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9757)==0&false))) {{
            __CLR4_4_17eh7ehlgchoqpf.R.inc(9758);return (iChronology.getMonthOfYear(instant, thisYear) == iLeapMonth);
        }
        }__CLR4_4_17eh7ehlgchoqpf.R.inc(9759);return false;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int getLeapAmount(long instant) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9760);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9761);return (((isLeap(instant) )&&(__CLR4_4_17eh7ehlgchoqpf.R.iget(9762)!=0|true))||(__CLR4_4_17eh7ehlgchoqpf.R.iget(9763)==0&false))? 1 : 0;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public DurationField getLeapDurationField() {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9764);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9765);return iChronology.days();
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int getMinimumValue() {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9766);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9767);return MIN;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int getMaximumValue() {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9768);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9769);return iMax;
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long roundFloor(long instant) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9770);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9771);int year = iChronology.getYear(instant);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9772);int month = iChronology.getMonthOfYear(instant, year);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9773);return iChronology.getYearMonthMillis(year, month);
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long remainder(long instant) {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9774);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9775);return instant - roundFloor(instant);
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17eh7ehlgchoqpf.R.inc(9776);
        __CLR4_4_17eh7ehlgchoqpf.R.inc(9777);return iChronology.monthOfYear();
    }finally{__CLR4_4_17eh7ehlgchoqpf.R.flushNeeded();}}
}
