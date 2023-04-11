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

import java.util.Locale;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

/**
 * Provides time calculations for the era component of time.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
final class GJEraDateTimeField extends BaseDateTimeField {public static class __CLR4_4_18gj8gjlgchoqrx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 4240986525305515528L;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    GJEraDateTimeField(BasicChronology chronology) {
        super(DateTimeFieldType.era());__CLR4_4_18gj8gjlgchoqrx.R.inc(10964);try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10963);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10965);iChronology = chronology;
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10966);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10967);return false;
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    /**
     * Get the Era component of the specified time instant.
     *
     * @param instant the time instant in millis to query.
     */
    public int get(long instant) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10968);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10969);if ((((iChronology.getYear(instant) <= 0)&&(__CLR4_4_18gj8gjlgchoqrx.R.iget(10970)!=0|true))||(__CLR4_4_18gj8gjlgchoqrx.R.iget(10971)==0&false))) {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10972);return DateTimeConstants.BCE;
        } }else {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10973);return DateTimeConstants.CE;
        }
    }}finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10974);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10975);return GJLocaleSymbols.forLocale(locale).eraValueToText(fieldValue);
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    /**
     * Set the Era component of the specified time instant.
     *
     * @param instant the time instant in millis to update.
     * @param era     the era to update the time to.
     * @return the updated time instant.
     * @throws IllegalArgumentException if era is invalid.
     */
    public long set(long instant, int era) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10976);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10977);FieldUtils.verifyValueBounds(this, era, DateTimeConstants.BCE, DateTimeConstants.CE);

        __CLR4_4_18gj8gjlgchoqrx.R.inc(10978);int oldEra = get(instant);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10979);if ((((oldEra != era)&&(__CLR4_4_18gj8gjlgchoqrx.R.iget(10980)!=0|true))||(__CLR4_4_18gj8gjlgchoqrx.R.iget(10981)==0&false))) {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10982);int year = iChronology.getYear(instant);
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10983);return iChronology.setYear(instant, -year);
        } }else {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10984);return instant;
        }
    }}finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public long set(long instant, String text, Locale locale) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10985);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10986);return set(instant, GJLocaleSymbols.forLocale(locale).eraTextToValue(text));
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10987);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10988);if ((((get(instant) == DateTimeConstants.CE)&&(__CLR4_4_18gj8gjlgchoqrx.R.iget(10989)!=0|true))||(__CLR4_4_18gj8gjlgchoqrx.R.iget(10990)==0&false))) {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10991);return iChronology.setYear(0, 1);
        } }else {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10992);return Long.MIN_VALUE;
        }
    }}finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public long roundCeiling(long instant) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10993);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(10994);if ((((get(instant) == DateTimeConstants.BCE)&&(__CLR4_4_18gj8gjlgchoqrx.R.iget(10995)!=0|true))||(__CLR4_4_18gj8gjlgchoqrx.R.iget(10996)==0&false))) {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10997);return iChronology.setYear(0, 1);
        } }else {{
            __CLR4_4_18gj8gjlgchoqrx.R.inc(10998);return Long.MAX_VALUE;
        }
    }}finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public long roundHalfFloor(long instant) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(10999);
        // In reality, the era is infinite, so there is no halfway point.
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11000);return roundFloor(instant);
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public long roundHalfCeiling(long instant) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11001);
        // In reality, the era is infinite, so there is no halfway point.
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11002);return roundFloor(instant);
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public long roundHalfEven(long instant) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11003);
        // In reality, the era is infinite, so there is no halfway point.
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11004);return roundFloor(instant);
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public DurationField getDurationField() {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11005);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11006);return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11007);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11008);return null;
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11009);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11010);return DateTimeConstants.BCE;
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11011);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11012);return DateTimeConstants.CE;
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11013);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11014);return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_18gj8gjlgchoqrx.R.inc(11015);
        __CLR4_4_18gj8gjlgchoqrx.R.inc(11016);return iChronology.era();
    }finally{__CLR4_4_18gj8gjlgchoqrx.R.flushNeeded();}}
}
