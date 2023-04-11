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

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * Abstract datetime field class that defines its own DurationField, which
 * delegates back into this ImpreciseDateTimeField.
 * <p>
 * This DateTimeField is useful for defining DateTimeFields that are composed
 * of imprecise durations. If both duration fields are precise, then a
 * {@link PreciseDateTimeField} should be used instead.
 * <p>
 * When defining imprecise DateTimeFields where a matching DurationField is
 * already available, just extend BaseDateTimeField directly so as not to
 * create redundant DurationField instances.
 * <p>
 * ImpreciseDateTimeField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @see PreciseDateTimeField
 * @since 1.0
 */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {public static class __CLR4_4_1b2xb2xlgchoqy6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14415,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unused")
    private static final long serialVersionUID = 7190739608550251860L;

    final long iUnitMillis;
    private final DurationField iDurationField;

    /**
     * Constructor.
     *
     * @param type       the field type
     * @param unitMillis the average duration unit milliseconds
     */
    public ImpreciseDateTimeField(DateTimeFieldType type, long unitMillis) {
        super(type);__CLR4_4_1b2xb2xlgchoqy6.R.inc(14362);try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14361);
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14363);iUnitMillis = unitMillis;
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14364);iDurationField = new LinkedDurationField(type.getDurationType());
    }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

    public abstract int get(long instant);

    public abstract long set(long instant, int value);

    public abstract long add(long instant, int value);

    public abstract long add(long instant, long value);

    /**
     * Computes the difference between two instants, as measured in the units
     * of this field. Any fractional units are dropped from the result. Calling
     * getDifference reverses the effect of calling add. In the following code:
     *
     * <pre>
     * long instant = ...
     * int v = ...
     * int age = getDifference(add(instant, v), instant);
     * </pre>
     * <p>
     * The value 'age' is the same as the value 'v'.
     * <p>
     * The default implementation call getDifferenceAsLong and converts the
     * return value to an int.
     *
     * @param minuendInstant    the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract from
     * @param subtrahendInstant the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract off the minuend
     * @return the difference in the units of this field
     */
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14365);
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14366);return FieldUtils.safeToInt(getDifferenceAsLong(minuendInstant, subtrahendInstant));
    }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

    /**
     * Computes the difference between two instants, as measured in the units
     * of this field. Any fractional units are dropped from the result. Calling
     * getDifference reverses the effect of calling add. In the following code:
     *
     * <pre>
     * long instant = ...
     * long v = ...
     * long age = getDifferenceAsLong(add(instant, v), instant);
     * </pre>
     * <p>
     * The value 'age' is the same as the value 'v'.
     * <p>
     * The default implementation performs a guess-and-check algorithm using
     * getDurationField().getUnitMillis() and the add() method. Subclasses are
     * encouraged to provide a more efficient implementation.
     *
     * @param minuendInstant    the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract from
     * @param subtrahendInstant the milliseconds from 1970-01-01T00:00:00Z to
     *                          subtract off the minuend
     * @return the difference in the units of this field
     */
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14367);
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14368);if ((((minuendInstant < subtrahendInstant)&&(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14369)!=0|true))||(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14370)==0&false))) {{
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14371);return -getDifferenceAsLong(subtrahendInstant, minuendInstant);
        }

        }__CLR4_4_1b2xb2xlgchoqy6.R.inc(14372);long difference = (minuendInstant - subtrahendInstant) / iUnitMillis;
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14373);if ((((add(subtrahendInstant, difference) < minuendInstant)&&(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14374)!=0|true))||(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14375)==0&false))) {{
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14376);do {{
                __CLR4_4_1b2xb2xlgchoqy6.R.inc(14377);difference++;
            } }while ((((add(subtrahendInstant, difference) <= minuendInstant)&&(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14378)!=0|true))||(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14379)==0&false)));
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14380);difference--;
        } }else {__CLR4_4_1b2xb2xlgchoqy6.R.inc(14381);if ((((add(subtrahendInstant, difference) > minuendInstant)&&(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14382)!=0|true))||(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14383)==0&false))) {{
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14384);do {{
                __CLR4_4_1b2xb2xlgchoqy6.R.inc(14385);difference--;
            } }while ((((add(subtrahendInstant, difference) > minuendInstant)&&(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14386)!=0|true))||(__CLR4_4_1b2xb2xlgchoqy6.R.iget(14387)==0&false)));
        }
        }}__CLR4_4_1b2xb2xlgchoqy6.R.inc(14388);return difference;
    }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

    public final DurationField getDurationField() {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14389);
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14390);return iDurationField;
    }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

    public abstract DurationField getRangeDurationField();

    public abstract long roundFloor(long instant);

    protected final long getDurationUnitMillis() {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14391);
        __CLR4_4_1b2xb2xlgchoqy6.R.inc(14392);return iUnitMillis;
    }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

    private final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        LinkedDurationField(DurationFieldType type) {
            super(type);__CLR4_4_1b2xb2xlgchoqy6.R.inc(14394);try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14393);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public boolean isPrecise() {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14395);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14396);return false;
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long getUnitMillis() {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14397);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14398);return iUnitMillis;
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public int getValue(long duration, long instant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14399);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14400);return ImpreciseDateTimeField.this
                    .getDifference(instant + duration, instant);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14401);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14402);return ImpreciseDateTimeField.this
                    .getDifferenceAsLong(instant + duration, instant);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long getMillis(int value, long instant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14403);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14404);return ImpreciseDateTimeField.this.add(instant, value) - instant;
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long getMillis(long value, long instant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14405);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14406);return ImpreciseDateTimeField.this.add(instant, value) - instant;
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long add(long instant, int value) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14407);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14408);return ImpreciseDateTimeField.this.add(instant, value);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long add(long instant, long value) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14409);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14410);return ImpreciseDateTimeField.this.add(instant, value);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14411);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14412);return ImpreciseDateTimeField.this
                    .getDifference(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}

        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1b2xb2xlgchoqy6.R.inc(14413);
            __CLR4_4_1b2xb2xlgchoqy6.R.inc(14414);return ImpreciseDateTimeField.this
                    .getDifferenceAsLong(minuendInstant, subtrahendInstant);
        }finally{__CLR4_4_1b2xb2xlgchoqy6.R.flushNeeded();}}
    }

}
