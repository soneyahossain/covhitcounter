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

import java.io.Serializable;
import java.util.Locale;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/**
 * <code>DelegatedDateTimeField</code> delegates each method call to the
 * date time field it wraps.
 * <p>
 * DelegatedDateTimeField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @see DecoratedDateTimeField
 * @since 1.0
 */
public class DelegatedDateTimeField extends DateTimeField implements Serializable {public static class __CLR4_4_1argarglgchoqxj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = -4730164440214502503L;

    /**
     * The DateTimeField being wrapped.
     */
    private final DateTimeField iField;
    /**
     * The range duration.
     */
    private final DurationField iRangeDurationField;
    /**
     * The override field type.
     */
    private final DateTimeFieldType iType;

    /**
     * Constructor.
     *
     * @param field the field being decorated
     */
    public DelegatedDateTimeField(DateTimeField field) {
        this(field, null);__CLR4_4_1argarglgchoqxj.R.inc(13949);try{__CLR4_4_1argarglgchoqxj.R.inc(13948);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param field the field being decorated
     * @param type  the field type override
     */
    public DelegatedDateTimeField(DateTimeField field, DateTimeFieldType type) {
        this(field, null, type);__CLR4_4_1argarglgchoqxj.R.inc(13951);try{__CLR4_4_1argarglgchoqxj.R.inc(13950);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param field      the field being decorated
     * @param rangeField the range field, null to derive
     * @param type       the field type override
     */
    public DelegatedDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type) {
        super();__CLR4_4_1argarglgchoqxj.R.inc(13953);try{__CLR4_4_1argarglgchoqxj.R.inc(13952);
        __CLR4_4_1argarglgchoqxj.R.inc(13954);if ((((field == null)&&(__CLR4_4_1argarglgchoqxj.R.iget(13955)!=0|true))||(__CLR4_4_1argarglgchoqxj.R.iget(13956)==0&false))) {{
            __CLR4_4_1argarglgchoqxj.R.inc(13957);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1argarglgchoqxj.R.inc(13958);iField = field;
        __CLR4_4_1argarglgchoqxj.R.inc(13959);iRangeDurationField = rangeField;
        __CLR4_4_1argarglgchoqxj.R.inc(13960);iType = ((((type == null )&&(__CLR4_4_1argarglgchoqxj.R.iget(13961)!=0|true))||(__CLR4_4_1argarglgchoqxj.R.iget(13962)==0&false))? field.getType() : type);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    /**
     * Gets the wrapped date time field.
     *
     * @return the wrapped DateTimeField
     */
    public final DateTimeField getWrappedField() {try{__CLR4_4_1argarglgchoqxj.R.inc(13963);
        __CLR4_4_1argarglgchoqxj.R.inc(13964);return iField;
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public DateTimeFieldType getType() {try{__CLR4_4_1argarglgchoqxj.R.inc(13965);
        __CLR4_4_1argarglgchoqxj.R.inc(13966);return iType;
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1argarglgchoqxj.R.inc(13967);
        __CLR4_4_1argarglgchoqxj.R.inc(13968);return iType.getName();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public boolean isSupported() {try{__CLR4_4_1argarglgchoqxj.R.inc(13969);
        __CLR4_4_1argarglgchoqxj.R.inc(13970);return iField.isSupported();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_1argarglgchoqxj.R.inc(13971);
        __CLR4_4_1argarglgchoqxj.R.inc(13972);return iField.isLenient();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int get(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(13973);
        __CLR4_4_1argarglgchoqxj.R.inc(13974);return iField.get(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsText(long instant, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13975);
        __CLR4_4_1argarglgchoqxj.R.inc(13976);return iField.getAsText(instant, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsText(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(13977);
        __CLR4_4_1argarglgchoqxj.R.inc(13978);return iField.getAsText(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13979);
        __CLR4_4_1argarglgchoqxj.R.inc(13980);return iField.getAsText(partial, fieldValue, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13981);
        __CLR4_4_1argarglgchoqxj.R.inc(13982);return iField.getAsText(partial, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13983);
        __CLR4_4_1argarglgchoqxj.R.inc(13984);return iField.getAsText(fieldValue, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsShortText(long instant, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13985);
        __CLR4_4_1argarglgchoqxj.R.inc(13986);return iField.getAsShortText(instant, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsShortText(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(13987);
        __CLR4_4_1argarglgchoqxj.R.inc(13988);return iField.getAsShortText(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13989);
        __CLR4_4_1argarglgchoqxj.R.inc(13990);return iField.getAsShortText(partial, fieldValue, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsShortText(ReadablePartial partial, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13991);
        __CLR4_4_1argarglgchoqxj.R.inc(13992);return iField.getAsShortText(partial, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String getAsShortText(int fieldValue, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(13993);
        __CLR4_4_1argarglgchoqxj.R.inc(13994);return iField.getAsShortText(fieldValue, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1argarglgchoqxj.R.inc(13995);
        __CLR4_4_1argarglgchoqxj.R.inc(13996);return iField.add(instant, value);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1argarglgchoqxj.R.inc(13997);
        __CLR4_4_1argarglgchoqxj.R.inc(13998);return iField.add(instant, value);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1argarglgchoqxj.R.inc(13999);
        __CLR4_4_1argarglgchoqxj.R.inc(14000);return iField.add(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1argarglgchoqxj.R.inc(14001);
        __CLR4_4_1argarglgchoqxj.R.inc(14002);return iField.addWrapPartial(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long addWrapField(long instant, int value) {try{__CLR4_4_1argarglgchoqxj.R.inc(14003);
        __CLR4_4_1argarglgchoqxj.R.inc(14004);return iField.addWrapField(instant, value);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_1argarglgchoqxj.R.inc(14005);
        __CLR4_4_1argarglgchoqxj.R.inc(14006);return iField.addWrapField(instant, fieldIndex, values, valueToAdd);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14007);
        __CLR4_4_1argarglgchoqxj.R.inc(14008);return iField.getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14009);
        __CLR4_4_1argarglgchoqxj.R.inc(14010);return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long set(long instant, int value) {try{__CLR4_4_1argarglgchoqxj.R.inc(14011);
        __CLR4_4_1argarglgchoqxj.R.inc(14012);return iField.set(instant, value);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long set(long instant, String text, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(14013);
        __CLR4_4_1argarglgchoqxj.R.inc(14014);return iField.set(instant, text, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long set(long instant, String text) {try{__CLR4_4_1argarglgchoqxj.R.inc(14015);
        __CLR4_4_1argarglgchoqxj.R.inc(14016);return iField.set(instant, text);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue) {try{__CLR4_4_1argarglgchoqxj.R.inc(14017);
        __CLR4_4_1argarglgchoqxj.R.inc(14018);return iField.set(instant, fieldIndex, values, newValue);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(14019);
        __CLR4_4_1argarglgchoqxj.R.inc(14020);return iField.set(instant, fieldIndex, values, text, locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public DurationField getDurationField() {try{__CLR4_4_1argarglgchoqxj.R.inc(14021);
        __CLR4_4_1argarglgchoqxj.R.inc(14022);return iField.getDurationField();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_1argarglgchoqxj.R.inc(14023);
        __CLR4_4_1argarglgchoqxj.R.inc(14024);if ((((iRangeDurationField != null)&&(__CLR4_4_1argarglgchoqxj.R.iget(14025)!=0|true))||(__CLR4_4_1argarglgchoqxj.R.iget(14026)==0&false))) {{
            __CLR4_4_1argarglgchoqxj.R.inc(14027);return iRangeDurationField;
        }
        }__CLR4_4_1argarglgchoqxj.R.inc(14028);return iField.getRangeDurationField();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14029);
        __CLR4_4_1argarglgchoqxj.R.inc(14030);return iField.isLeap(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14031);
        __CLR4_4_1argarglgchoqxj.R.inc(14032);return iField.getLeapAmount(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_1argarglgchoqxj.R.inc(14033);
        __CLR4_4_1argarglgchoqxj.R.inc(14034);return iField.getLeapDurationField();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1argarglgchoqxj.R.inc(14035);
        __CLR4_4_1argarglgchoqxj.R.inc(14036);return iField.getMinimumValue();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMinimumValue(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14037);
        __CLR4_4_1argarglgchoqxj.R.inc(14038);return iField.getMinimumValue(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMinimumValue(ReadablePartial instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14039);
        __CLR4_4_1argarglgchoqxj.R.inc(14040);return iField.getMinimumValue(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMinimumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1argarglgchoqxj.R.inc(14041);
        __CLR4_4_1argarglgchoqxj.R.inc(14042);return iField.getMinimumValue(instant, values);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_1argarglgchoqxj.R.inc(14043);
        __CLR4_4_1argarglgchoqxj.R.inc(14044);return iField.getMaximumValue();
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMaximumValue(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14045);
        __CLR4_4_1argarglgchoqxj.R.inc(14046);return iField.getMaximumValue(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14047);
        __CLR4_4_1argarglgchoqxj.R.inc(14048);return iField.getMaximumValue(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMaximumValue(ReadablePartial instant, int[] values) {try{__CLR4_4_1argarglgchoqxj.R.inc(14049);
        __CLR4_4_1argarglgchoqxj.R.inc(14050);return iField.getMaximumValue(instant, values);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(14051);
        __CLR4_4_1argarglgchoqxj.R.inc(14052);return iField.getMaximumTextLength(locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public int getMaximumShortTextLength(Locale locale) {try{__CLR4_4_1argarglgchoqxj.R.inc(14053);
        __CLR4_4_1argarglgchoqxj.R.inc(14054);return iField.getMaximumShortTextLength(locale);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14055);
        __CLR4_4_1argarglgchoqxj.R.inc(14056);return iField.roundFloor(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14057);
        __CLR4_4_1argarglgchoqxj.R.inc(14058);return iField.roundCeiling(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14059);
        __CLR4_4_1argarglgchoqxj.R.inc(14060);return iField.roundHalfFloor(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14061);
        __CLR4_4_1argarglgchoqxj.R.inc(14062);return iField.roundHalfCeiling(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14063);
        __CLR4_4_1argarglgchoqxj.R.inc(14064);return iField.roundHalfEven(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_1argarglgchoqxj.R.inc(14065);
        __CLR4_4_1argarglgchoqxj.R.inc(14066);return iField.remainder(instant);
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1argarglgchoqxj.R.inc(14067);
        __CLR4_4_1argarglgchoqxj.R.inc(14068);return ("DateTimeField[" + getName() + ']');
    }finally{__CLR4_4_1argarglgchoqxj.R.flushNeeded();}}

}
