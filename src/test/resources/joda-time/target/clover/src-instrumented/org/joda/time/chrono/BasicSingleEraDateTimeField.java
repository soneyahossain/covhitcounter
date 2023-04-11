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

import java.util.Locale;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

/**
 * Provides time calculations for the coptic era component of time.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.2, refactored from CopticEraDateTimeField
 */
final class BasicSingleEraDateTimeField extends BaseDateTimeField {public static class __CLR4_4_17jm7jmlgchoqpn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,9816,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Value of the era, which will be the same as DateTimeConstants.CE.
     */
    private static final int ERA_VALUE = DateTimeConstants.CE;
    /**
     * Text value of the era.
     */
    private final String iEraText;

    /**
     * Restricted constructor.
     */
    BasicSingleEraDateTimeField(String text) {
        super(DateTimeFieldType.era());__CLR4_4_17jm7jmlgchoqpn.R.inc(9779);try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9778);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9780);iEraText = text;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public boolean isLenient() {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9781);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9782);return false;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public int get(long instant) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9783);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9784);return ERA_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long set(long instant, int era) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9785);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9786);FieldUtils.verifyValueBounds(this, era, ERA_VALUE, ERA_VALUE);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9787);return instant;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long set(long instant, String text, Locale locale) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9788);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9789);if ((((iEraText.equals(text) == false && "1".equals(text) == false)&&(__CLR4_4_17jm7jmlgchoqpn.R.iget(9790)!=0|true))||(__CLR4_4_17jm7jmlgchoqpn.R.iget(9791)==0&false))) {{
            __CLR4_4_17jm7jmlgchoqpn.R.inc(9792);throw new IllegalFieldValueException(DateTimeFieldType.era(), text);
        }
        }__CLR4_4_17jm7jmlgchoqpn.R.inc(9793);return instant;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long roundFloor(long instant) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9794);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9795);return Long.MIN_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long roundCeiling(long instant) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9796);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9797);return Long.MAX_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long roundHalfFloor(long instant) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9798);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9799);return Long.MIN_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long roundHalfCeiling(long instant) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9800);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9801);return Long.MIN_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public long roundHalfEven(long instant) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9802);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9803);return Long.MIN_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public DurationField getDurationField() {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9804);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9805);return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public DurationField getRangeDurationField() {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9806);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9807);return null;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public int getMinimumValue() {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9808);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9809);return ERA_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public int getMaximumValue() {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9810);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9811);return ERA_VALUE;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9812);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9813);return iEraText;
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

    /**
     * @inheritDoc
     */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_17jm7jmlgchoqpn.R.inc(9814);
        __CLR4_4_17jm7jmlgchoqpn.R.inc(9815);return iEraText.length();
    }finally{__CLR4_4_17jm7jmlgchoqpn.R.flushNeeded();}}

}
