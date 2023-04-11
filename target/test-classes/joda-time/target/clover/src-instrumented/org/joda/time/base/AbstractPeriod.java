/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * AbstractPeriod provides the common behaviour for period classes.
 * <p>
 * This class should generally not be used directly by API users. The
 * {@link ReadablePeriod} interface should be used when different
 * kinds of periods are to be referenced.
 * <p>
 * AbstractPeriod subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class AbstractPeriod implements ReadablePeriod {public static class __CLR4_4_15zf5zflgchoqlm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,7828,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Constructor.
     */
    protected AbstractPeriod() {
        super();__CLR4_4_15zf5zflgchoqlm.R.inc(7756);try{__CLR4_4_15zf5zflgchoqlm.R.inc(7755);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of fields that this period supports.
     *
     * @return the number of fields supported
     * @since 2.0 (previously on BasePeriod)
     */
    public int size() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7757);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7758);return getPeriodType().size();
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index the index to retrieve
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     * @since 2.0 (previously on BasePeriod)
     */
    public DurationFieldType getFieldType(int index) {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7759);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7760);return getPeriodType().getFieldType(index);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Gets an array of the field types that this period supports.
     * <p>
     * The fields are returned largest to smallest, for example Hours, Minutes, Seconds.
     *
     * @return the fields supported in an array that may be altered, largest to smallest
     */
    public DurationFieldType[] getFieldTypes() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7761);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7762);DurationFieldType[] result = new DurationFieldType[size()];
        __CLR4_4_15zf5zflgchoqlm.R.inc(7763);for (int i = 0; (((i < result.length)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7764)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7765)==0&false)); i++) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7766);result[i] = getFieldType(i);
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7767);return result;
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Gets an array of the value of each of the fields that this period supports.
     * <p>
     * The fields are returned largest to smallest, for example Hours, Minutes, Seconds.
     * Each value corresponds to the same array index as <code>getFields()</code>
     *
     * @return the current values of each field in an array that may be altered, largest to smallest
     */
    public int[] getValues() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7768);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7769);int[] result = new int[size()];
        __CLR4_4_15zf5zflgchoqlm.R.inc(7770);for (int i = 0; (((i < result.length)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7771)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7772)==0&false)); i++) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7773);result[i] = getValue(i);
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7774);return result;
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the value of one of the fields.
     * <p>
     * If the field type specified is not supported by the period then zero
     * is returned.
     *
     * @param type the field type to query, null returns zero
     * @return the value of that field, zero if field not supported
     */
    public int get(DurationFieldType type) {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7775);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7776);int index = indexOf(type);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7777);if ((((index == -1)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7778)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7779)==0&false))) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7780);return 0;
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7781);return getValue(index);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Checks whether the field specified is supported by this period.
     *
     * @param type the type to check, may be null which returns false
     * @return true if the field is supported
     */
    public boolean isSupported(DurationFieldType type) {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7782);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7783);return getPeriodType().isSupported(type);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Gets the index of the field in this period.
     *
     * @param type the type to check, may be null which returns -1
     * @return the index of -1 if not supported
     */
    public int indexOf(DurationFieldType type) {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7784);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7785);return getPeriodType().indexOf(type);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get this period as an immutable <code>Period</code> object.
     *
     * @return a Period using the same field set and values
     */
    public Period toPeriod() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7786);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7787);return new Period(this);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Get this object as a <code>MutablePeriod</code>.
     * <p>
     * This will always return a new <code>MutablePeriod</code> with the same fields.
     *
     * @return a MutablePeriod using the same field set and values
     */
    public MutablePeriod toMutablePeriod() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7788);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7789);return new MutablePeriod(this);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Compares this object with the specified object for equality based
     * on the value of each field. All ReadablePeriod instances are accepted.
     * <p>
     * Note that a period of 1 day is not equal to a period of 24 hours,
     * nor is 1 hour equal to 60 minutes. Only periods with the same amount
     * in each field are equal.
     * <p>
     * This is because periods represent an abstracted definition of a time
     * period (eg. a day may not actually be 24 hours, it might be 23 or 25
     * at daylight savings boundary).
     * <p>
     * To compare the actual duration of two periods, convert both to
     * {@link org.joda.time.Duration Duration}s, an operation that emphasises
     * that the result may differ according to the date you choose.
     *
     * @param period a readable period to check against
     * @return true if all the field values are equal, false if
     * not or the period is null or of an incorrect type
     */
    public boolean equals(Object period) {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7790);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7791);if ((((this == period)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7792)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7793)==0&false))) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7794);return true;
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7795);if ((((period instanceof ReadablePeriod == false)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7796)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7797)==0&false))) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7798);return false;
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7799);ReadablePeriod other = (ReadablePeriod) period;
        __CLR4_4_15zf5zflgchoqlm.R.inc(7800);if ((((size() != other.size())&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7801)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7802)==0&false))) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7803);return false;
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7804);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7805)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7806)==0&false)); i++) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7807);if ((((getValue(i) != other.getValue(i) || getFieldType(i) != other.getFieldType(i))&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7808)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7809)==0&false))) {{
                __CLR4_4_15zf5zflgchoqlm.R.inc(7810);return false;
            }
        }}
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7811);return true;
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    /**
     * Gets a hash code for the period as defined by ReadablePeriod.
     *
     * @return a hash code
     */
    public int hashCode() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7812);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7813);int total = 17;
        __CLR4_4_15zf5zflgchoqlm.R.inc(7814);for (int i = 0, isize = size(); (((i < isize)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7815)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7816)==0&false)); i++) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7817);total = 27 * total + getValue(i);
            __CLR4_4_15zf5zflgchoqlm.R.inc(7818);total = 27 * total + getFieldType(i).hashCode();
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7819);return total;
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the value as a String in the ISO8601 duration format.
     * <p>
     * For example, "PT6H3M7S" represents 6 hours, 3 minutes, 7 seconds.
     * <p>
     * For more control over the output, see
     * {@link org.joda.time.format.PeriodFormatterBuilder PeriodFormatterBuilder}.
     *
     * @return the value as an ISO8601 string
     */
    @ToString
    public String toString() {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7820);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7821);return ISOPeriodFormat.standard().print(this);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Uses the specified formatter to convert this period to a String.
     *
     * @param formatter the formatter to use, null means use <code>toString()</code>.
     * @return the formatted string
     * @since 1.5
     */
    public String toString(PeriodFormatter formatter) {try{__CLR4_4_15zf5zflgchoqlm.R.inc(7822);
        __CLR4_4_15zf5zflgchoqlm.R.inc(7823);if ((((formatter == null)&&(__CLR4_4_15zf5zflgchoqlm.R.iget(7824)!=0|true))||(__CLR4_4_15zf5zflgchoqlm.R.iget(7825)==0&false))) {{
            __CLR4_4_15zf5zflgchoqlm.R.inc(7826);return toString();
        }
        }__CLR4_4_15zf5zflgchoqlm.R.inc(7827);return formatter.print(this);
    }finally{__CLR4_4_15zf5zflgchoqlm.R.flushNeeded();}}

}
