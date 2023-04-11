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
package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/**
 * Counterpart remainder datetime field to {@link DividedDateTimeField}. The
 * field's unit duration is unchanged, but the range duration is scaled
 * accordingly.
 * <p>
 * RemainderDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see DividedDateTimeField
 * @since 1.0
 */
public class RemainderDateTimeField extends DecoratedDateTimeField {public static class __CLR4_4_1bbobbolgchoqyv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 5708241235177666790L;

    // Shared with DividedDateTimeField.
    final int iDivisor;
    final DurationField iDurationField;
    final DurationField iRangeField;

    /**
     * Constructor.
     *
     * @param field   the field to wrap, like "year()".
     * @param type    the field type this field actually uses
     * @param divisor divisor, such as 100 years in a century
     * @throws IllegalArgumentException if divisor is less than two
     */
    public RemainderDateTimeField(DateTimeField field,
                                  DateTimeFieldType type, int divisor) {
        super(field, type);__CLR4_4_1bbobbolgchoqyv.R.inc(14677);try{__CLR4_4_1bbobbolgchoqyv.R.inc(14676);

        __CLR4_4_1bbobbolgchoqyv.R.inc(14678);if ((((divisor < 2)&&(__CLR4_4_1bbobbolgchoqyv.R.iget(14679)!=0|true))||(__CLR4_4_1bbobbolgchoqyv.R.iget(14680)==0&false))) {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14681);throw new IllegalArgumentException("The divisor must be at least 2");
        }

        }__CLR4_4_1bbobbolgchoqyv.R.inc(14682);DurationField rangeField = field.getDurationField();
        __CLR4_4_1bbobbolgchoqyv.R.inc(14683);if ((((rangeField == null)&&(__CLR4_4_1bbobbolgchoqyv.R.iget(14684)!=0|true))||(__CLR4_4_1bbobbolgchoqyv.R.iget(14685)==0&false))) {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14686);iRangeField = null;
        } }else {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14687);iRangeField = new ScaledDurationField(
                    rangeField, type.getRangeDurationType(), divisor);
        }
        }__CLR4_4_1bbobbolgchoqyv.R.inc(14688);iDurationField = field.getDurationField();
        __CLR4_4_1bbobbolgchoqyv.R.inc(14689);iDivisor = divisor;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param field      the field to wrap, like "year()".
     * @param rangeField the range field
     * @param type       the field type this field actually uses
     * @param divisor    divisor, such as 100 years in a century
     * @throws IllegalArgumentException if divisor is less than two
     */
    public RemainderDateTimeField(DateTimeField field, DurationField rangeField,
                                  DateTimeFieldType type, int divisor) {
        super(field, type);__CLR4_4_1bbobbolgchoqyv.R.inc(14691);try{__CLR4_4_1bbobbolgchoqyv.R.inc(14690);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14692);if ((((divisor < 2)&&(__CLR4_4_1bbobbolgchoqyv.R.iget(14693)!=0|true))||(__CLR4_4_1bbobbolgchoqyv.R.iget(14694)==0&false))) {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14695);throw new IllegalArgumentException("The divisor must be at least 2");
        }
        }__CLR4_4_1bbobbolgchoqyv.R.inc(14696);iRangeField = rangeField;
        __CLR4_4_1bbobbolgchoqyv.R.inc(14697);iDurationField = field.getDurationField();
        __CLR4_4_1bbobbolgchoqyv.R.inc(14698);iDivisor = divisor;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Construct a RemainderDateTimeField that compliments the given
     * DividedDateTimeField.
     *
     * @param dividedField complimentary divided field, like "century()".
     */
    public RemainderDateTimeField(DividedDateTimeField dividedField) {
        this(dividedField, dividedField.getType());__CLR4_4_1bbobbolgchoqyv.R.inc(14700);try{__CLR4_4_1bbobbolgchoqyv.R.inc(14699);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Construct a RemainderDateTimeField that compliments the given
     * DividedDateTimeField.
     *
     * @param dividedField complimentary divided field, like "century()".
     * @param type         the field type this field actually uses
     */
    public RemainderDateTimeField(DividedDateTimeField dividedField, DateTimeFieldType type) {
        this(dividedField, dividedField.getWrappedField().getDurationField(), type);__CLR4_4_1bbobbolgchoqyv.R.inc(14702);try{__CLR4_4_1bbobbolgchoqyv.R.inc(14701);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Construct a RemainderDateTimeField that compliments the given
     * DividedDateTimeField.
     * This constructor allows the duration field to be set.
     *
     * @param dividedField  complimentary divided field, like "century()".
     * @param durationField the duration field
     * @param type          the field type this field actually uses
     */
    public RemainderDateTimeField(DividedDateTimeField dividedField, DurationField durationField, DateTimeFieldType type) {
        super(dividedField.getWrappedField(), type);__CLR4_4_1bbobbolgchoqyv.R.inc(14704);try{__CLR4_4_1bbobbolgchoqyv.R.inc(14703);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14705);iDivisor = dividedField.iDivisor;
        __CLR4_4_1bbobbolgchoqyv.R.inc(14706);iDurationField = durationField;
        __CLR4_4_1bbobbolgchoqyv.R.inc(14707);iRangeField = dividedField.iDurationField;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the remainder from the specified time instant.
     *
     * @param instant the time instant in millis to query.
     * @return the remainder extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14708);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14709);int value = getWrappedField().get(instant);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14710);if ((((value >= 0)&&(__CLR4_4_1bbobbolgchoqyv.R.iget(14711)!=0|true))||(__CLR4_4_1bbobbolgchoqyv.R.iget(14712)==0&false))) {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14713);return value % iDivisor;
        } }else {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14714);return (iDivisor - 1) + ((value + 1) % iDivisor);
        }
    }}finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Add the specified amount to the specified time instant, wrapping around
     * within the remainder range if necessary. The amount added may be
     * negative.
     *
     * @param instant the time instant in millis to update.
     * @param amount  the amount to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int amount) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14715);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14716);return set(instant, FieldUtils.getWrappedValue(get(instant), amount, 0, iDivisor - 1));
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Set the specified amount of remainder units to the specified time instant.
     *
     * @param instant the time instant in millis to update.
     * @param value   value of remainder units to set.
     * @return the updated time instant.
     * @throws IllegalArgumentException if value is too large or too small.
     */
    public long set(long instant, int value) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14717);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14718);FieldUtils.verifyValueBounds(this, value, 0, iDivisor - 1);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14719);int divided = getDivided(getWrappedField().get(instant));
        __CLR4_4_1bbobbolgchoqyv.R.inc(14720);return getWrappedField().set(instant, divided * iDivisor + value);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    @Override
    public DurationField getDurationField() {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14721);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14722);return iDurationField;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Returns a scaled version of the wrapped field's unit duration field.
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14723);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14724);return iRangeField;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Get the minimum value for the field, which is always zero.
     *
     * @return the minimum value of zero.
     */
    public int getMinimumValue() {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14725);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14726);return 0;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Get the maximum value for the field, which is always one less than the
     * divisor.
     *
     * @return the maximum value
     */
    public int getMaximumValue() {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14727);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14728);return iDivisor - 1;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14729);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14730);return getWrappedField().roundFloor(instant);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14731);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14732);return getWrappedField().roundCeiling(instant);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14733);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14734);return getWrappedField().roundHalfFloor(instant);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14735);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14736);return getWrappedField().roundHalfCeiling(instant);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14737);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14738);return getWrappedField().roundHalfEven(instant);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14739);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14740);return getWrappedField().remainder(instant);
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    /**
     * Returns the divisor applied, in the field's units.
     *
     * @return the divisor
     */
    public int getDivisor() {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14741);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14742);return iDivisor;
    }finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

    private int getDivided(int value) {try{__CLR4_4_1bbobbolgchoqyv.R.inc(14743);
        __CLR4_4_1bbobbolgchoqyv.R.inc(14744);if ((((value >= 0)&&(__CLR4_4_1bbobbolgchoqyv.R.iget(14745)!=0|true))||(__CLR4_4_1bbobbolgchoqyv.R.iget(14746)==0&false))) {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14747);return value / iDivisor;
        } }else {{
            __CLR4_4_1bbobbolgchoqyv.R.inc(14748);return ((value + 1) / iDivisor) - 1;
        }
    }}finally{__CLR4_4_1bbobbolgchoqyv.R.flushNeeded();}}

}
