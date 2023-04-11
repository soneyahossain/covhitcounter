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
package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/**
 * Wraps another field such that a certain value is skipped.
 * <p>
 * This is most useful for years where you want to skip zero, so the
 * sequence runs ...,2,1,-1,-2,...
 * <p>
 * SkipDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class SkipDateTimeField extends DelegatedDateTimeField {public static class __CLR4_4_1bfbbfblgchoqz2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,14845,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version.
     */
    private static final long serialVersionUID = -8869148464118507846L;

    /**
     * The chronology to wrap.
     */
    private final Chronology iChronology;
    /**
     * The value to skip.
     */
    private final int iSkip;
    /**
     * The calculated minimum value.
     */
    private transient int iMinValue;

    /**
     * Constructor that skips zero.
     *
     * @param chronology the chronology to use
     * @param field      the field to skip zero on
     */
    public SkipDateTimeField(Chronology chronology, DateTimeField field) {
        this(chronology, field, 0);__CLR4_4_1bfbbfblgchoqz2.R.inc(14808);try{__CLR4_4_1bfbbfblgchoqz2.R.inc(14807);
    }finally{__CLR4_4_1bfbbfblgchoqz2.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param chronology the chronology to use
     * @param field      the field to skip zero on
     * @param skip       the value to skip
     */
    public SkipDateTimeField(Chronology chronology, DateTimeField field, int skip) {
        super(field);__CLR4_4_1bfbbfblgchoqz2.R.inc(14810);try{__CLR4_4_1bfbbfblgchoqz2.R.inc(14809);
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14811);iChronology = chronology;
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14812);int min = super.getMinimumValue();
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14813);if ((((min < skip)&&(__CLR4_4_1bfbbfblgchoqz2.R.iget(14814)!=0|true))||(__CLR4_4_1bfbbfblgchoqz2.R.iget(14815)==0&false))) {{
            __CLR4_4_1bfbbfblgchoqz2.R.inc(14816);iMinValue = min - 1;
        } }else {__CLR4_4_1bfbbfblgchoqz2.R.inc(14817);if ((((min == skip)&&(__CLR4_4_1bfbbfblgchoqz2.R.iget(14818)!=0|true))||(__CLR4_4_1bfbbfblgchoqz2.R.iget(14819)==0&false))) {{
            __CLR4_4_1bfbbfblgchoqz2.R.inc(14820);iMinValue = skip + 1;
        } }else {{
            __CLR4_4_1bfbbfblgchoqz2.R.inc(14821);iMinValue = min;
        }
        }}__CLR4_4_1bfbbfblgchoqz2.R.inc(14822);iSkip = skip;
    }finally{__CLR4_4_1bfbbfblgchoqz2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int get(long millis) {try{__CLR4_4_1bfbbfblgchoqz2.R.inc(14823);
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14824);int value = super.get(millis);
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14825);if ((((value <= iSkip)&&(__CLR4_4_1bfbbfblgchoqz2.R.iget(14826)!=0|true))||(__CLR4_4_1bfbbfblgchoqz2.R.iget(14827)==0&false))) {{
            __CLR4_4_1bfbbfblgchoqz2.R.inc(14828);value--;
        }
        }__CLR4_4_1bfbbfblgchoqz2.R.inc(14829);return value;
    }finally{__CLR4_4_1bfbbfblgchoqz2.R.flushNeeded();}}

    public long set(long millis, int value) {try{__CLR4_4_1bfbbfblgchoqz2.R.inc(14830);
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14831);FieldUtils.verifyValueBounds(this, value, iMinValue, getMaximumValue());
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14832);if ((((value <= iSkip)&&(__CLR4_4_1bfbbfblgchoqz2.R.iget(14833)!=0|true))||(__CLR4_4_1bfbbfblgchoqz2.R.iget(14834)==0&false))) {{
            __CLR4_4_1bfbbfblgchoqz2.R.inc(14835);if ((((value == iSkip)&&(__CLR4_4_1bfbbfblgchoqz2.R.iget(14836)!=0|true))||(__CLR4_4_1bfbbfblgchoqz2.R.iget(14837)==0&false))) {{
                __CLR4_4_1bfbbfblgchoqz2.R.inc(14838);throw new IllegalFieldValueException
                        (DateTimeFieldType.year(), Integer.valueOf(value), null, null);
            }
            }__CLR4_4_1bfbbfblgchoqz2.R.inc(14839);value++;
        }
        }__CLR4_4_1bfbbfblgchoqz2.R.inc(14840);return super.set(millis, value);
    }finally{__CLR4_4_1bfbbfblgchoqz2.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1bfbbfblgchoqz2.R.inc(14841);
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14842);return iMinValue;
    }finally{__CLR4_4_1bfbbfblgchoqz2.R.flushNeeded();}}

    private Object readResolve() {try{__CLR4_4_1bfbbfblgchoqz2.R.inc(14843);
        __CLR4_4_1bfbbfblgchoqz2.R.inc(14844);return getType().getField(iChronology);
    }finally{__CLR4_4_1bfbbfblgchoqz2.R.flushNeeded();}}

}
