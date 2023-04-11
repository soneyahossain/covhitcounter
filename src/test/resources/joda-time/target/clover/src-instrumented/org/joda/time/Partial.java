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
package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Partial is an immutable partial datetime supporting any set of datetime fields.
 * <p>
 * A Partial instance can be used to hold any combination of fields.
 * The instance does not contain a time zone, so any datetime is local.
 * <p>
 * A Partial can be matched against an instant using {@link #isMatch(ReadableInstant)}.
 * This method compares each field on this partial with those of the instant
 * and determines if the partial matches the instant.
 * Given this definition, an empty Partial instance represents any datetime
 * and always matches.
 * <p>
 * Calculations on Partial are performed using a {@link Chronology}.
 * This chronology is set to be in the UTC time zone for all calculations.
 * <p>
 * Each individual field can be queried in two ways:
 * <ul>
 * <li><code>get(DateTimeFieldType.monthOfYear())</code>
 * <li><code>property(DateTimeFieldType.monthOfYear()).get()</code>
 * </ul>
 * The second technique also provides access to other useful methods on the
 * field:
 * <ul>
 * <li>numeric value - <code>monthOfYear().get()</code>
 * <li>text value - <code>monthOfYear().getAsText()</code>
 * <li>short text value - <code>monthOfYear().getAsShortText()</code>
 * <li>maximum/minimum values - <code>monthOfYear().getMaximumValue()</code>
 * <li>add/subtract - <code>monthOfYear().addToCopy()</code>
 * <li>set - <code>monthOfYear().setCopy()</code>
 * </ul>
 * <p>
 * Partial is thread-safe and immutable, provided that the Chronology is as well.
 * All standard Chronology classes supplied are thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @since 1.1
 */
public final class Partial
        extends AbstractPartial
        implements ReadablePartial, Serializable {public static class __CLR4_4_13y83y8lgchoqg3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,5528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 12324121189002L;

    /**
     * The chronology in use.
     */
    private final Chronology iChronology;
    /**
     * The set of field types.
     */
    private final DateTimeFieldType[] iTypes;
    /**
     * The values of each field in this partial.
     */
    private final int[] iValues;
    /**
     * The formatter to use, [0] may miss some fields, [1] doesn't miss any fields.
     */
    private transient DateTimeFormatter[] iFormatter;

    // Constructors
    //-----------------------------------------------------------------------

    /**
     * Constructs a Partial with no fields or values, which can be considered
     * to represent any date.
     * <p>
     * This is most useful when constructing partials, for example:
     * <pre>
     * Partial p = new Partial()
     *     .with(DateTimeFieldType.dayOfWeek(), 5)
     *     .with(DateTimeFieldType.hourOfDay(), 12)
     *     .with(DateTimeFieldType.minuteOfHour(), 20);
     * </pre>
     * Note that, although this is a clean way to write code, it is fairly
     * inefficient internally.
     * <p>
     * The constructor uses the default ISO chronology.
     */
    public Partial() {
        this((Chronology) null);__CLR4_4_13y83y8lgchoqg3.R.inc(5121);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5120);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with no fields or values, which can be considered
     * to represent any date.
     * <p>
     * This is most useful when constructing partials, for example:
     * <pre>
     * Partial p = new Partial(chrono)
     *     .with(DateTimeFieldType.dayOfWeek(), 5)
     *     .with(DateTimeFieldType.hourOfDay(), 12)
     *     .with(DateTimeFieldType.minuteOfHour(), 20);
     * </pre>
     * Note that, although this is a clean way to write code, it is fairly
     * inefficient internally.
     *
     * @param chrono the chronology, null means ISO
     */
    public Partial(Chronology chrono) {
        super();__CLR4_4_13y83y8lgchoqg3.R.inc(5123);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5122);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5124);iChronology = DateTimeUtils.getChronology(chrono).withUTC();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5125);iTypes = new DateTimeFieldType[0];
        __CLR4_4_13y83y8lgchoqg3.R.inc(5126);iValues = new int[0];
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with the specified field and value.
     * <p>
     * The constructor uses the default ISO chronology.
     *
     * @param type  the single type to create the partial from, not null
     * @param value the value to store
     * @throws IllegalArgumentException if the type or value is invalid
     */
    public Partial(DateTimeFieldType type, int value) {
        this(type, value, null);__CLR4_4_13y83y8lgchoqg3.R.inc(5128);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5127);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with the specified field and value.
     * <p>
     * The constructor uses the specified chronology.
     *
     * @param type       the single type to create the partial from, not null
     * @param value      the value to store
     * @param chronology the chronology, null means ISO
     * @throws IllegalArgumentException if the type or value is invalid
     */
    public Partial(DateTimeFieldType type, int value, Chronology chronology) {
        super();__CLR4_4_13y83y8lgchoqg3.R.inc(5130);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5129);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5131);chronology = DateTimeUtils.getChronology(chronology).withUTC();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5132);iChronology = chronology;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5133);if ((((type == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5134)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5135)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5136);throw new IllegalArgumentException("The field type must not be null");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5137);iTypes = new DateTimeFieldType[]{type};
        __CLR4_4_13y83y8lgchoqg3.R.inc(5138);iValues = new int[]{value};
        __CLR4_4_13y83y8lgchoqg3.R.inc(5139);chronology.validate(this, iValues);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with the specified fields and values.
     * The fields must be specified in the order largest to smallest.
     * For year and weekyear fields with equal duration, year is defined
     * as being larger than weekyear.
     * <p>
     * The constructor uses the specified chronology.
     *
     * @param types  the types to create the partial from, not null
     * @param values the values to store, not null
     * @throws IllegalArgumentException if the types or values are invalid
     */
    public Partial(DateTimeFieldType[] types, int[] values) {
        this(types, values, null);__CLR4_4_13y83y8lgchoqg3.R.inc(5141);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5140);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with the specified fields and values.
     * The fields must be specified in the order largest to smallest.
     * For year and weekyear fields with equal duration, year is defined
     * as being larger than weekyear.
     * <p>
     * The constructor uses the specified chronology.
     *
     * @param types      the types to create the partial from, not null
     * @param values     the values to store, not null
     * @param chronology the chronology, null means ISO
     * @throws IllegalArgumentException if the types or values are invalid
     */
    public Partial(DateTimeFieldType[] types, int[] values, Chronology chronology) {
        super();__CLR4_4_13y83y8lgchoqg3.R.inc(5143);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5142);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5144);chronology = DateTimeUtils.getChronology(chronology).withUTC();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5145);iChronology = chronology;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5146);if ((((types == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5147)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5148)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5149);throw new IllegalArgumentException("Types array must not be null");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5150);if ((((values == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5151)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5152)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5153);throw new IllegalArgumentException("Values array must not be null");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5154);if ((((values.length != types.length)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5155)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5156)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5157);throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5158);if ((((types.length == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5159)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5160)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5161);iTypes = types;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5162);iValues = values;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5163);return;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5164);for (int i = 0; (((i < types.length)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5165)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5166)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5167);if ((((types[i] == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5168)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5169)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5170);throw new IllegalArgumentException("Types array must not contain null: index " + i);
            }
        }}
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5171);DurationField lastUnitField = null;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5172);for (int i = 0; (((i < types.length)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5173)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5174)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5175);DateTimeFieldType loopType = types[i];
            __CLR4_4_13y83y8lgchoqg3.R.inc(5176);DurationField loopUnitField = loopType.getDurationType().getField(iChronology);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5177);if ((((i > 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5178)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5179)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5180);if ((((loopUnitField.isSupported() == false)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5181)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5182)==0&false))) {{
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5183);if ((((lastUnitField.isSupported())&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5184)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5185)==0&false))) {{
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5186);throw new IllegalArgumentException("Types array must be in order largest-smallest: " +
                                types[i - 1].getName() + " < " + loopType.getName());
                    } }else {{
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5187);throw new IllegalArgumentException("Types array must not contain duplicate unsupported: " +
                                types[i - 1].getName() + " and " + loopType.getName());
                    }
                }}
                }__CLR4_4_13y83y8lgchoqg3.R.inc(5188);int compare = lastUnitField.compareTo(loopUnitField);
                __CLR4_4_13y83y8lgchoqg3.R.inc(5189);if ((((compare < 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5190)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5191)==0&false))) {{
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5192);throw new IllegalArgumentException("Types array must be in order largest-smallest: " +
                            types[i - 1].getName() + " < " + loopType.getName());
                } }else {__CLR4_4_13y83y8lgchoqg3.R.inc(5193);if ((((compare == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5194)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5195)==0&false))) {{
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5196);if ((((lastUnitField.equals(loopUnitField))&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5197)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5198)==0&false))) {{
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5199);DurationFieldType lastRangeType = types[i - 1].getRangeDurationType();
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5200);DurationFieldType loopRangeType = loopType.getRangeDurationType();
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5201);if ((((lastRangeType == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5202)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5203)==0&false))) {{
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5204);if ((((loopRangeType == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5205)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5206)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5207);throw new IllegalArgumentException("Types array must not contain duplicate: " +
                                        types[i - 1].getName() + " and " + loopType.getName());
                            }
                        }} }else {{
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5208);if ((((loopRangeType == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5209)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5210)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5211);throw new IllegalArgumentException("Types array must be in order largest-smallest: " +
                                        types[i - 1].getName() + " < " + loopType.getName());
                            }
                            }__CLR4_4_13y83y8lgchoqg3.R.inc(5212);DurationField lastRangeField = lastRangeType.getField(iChronology);
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5213);DurationField loopRangeField = loopRangeType.getField(iChronology);
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5214);if ((((lastRangeField.compareTo(loopRangeField) < 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5215)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5216)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5217);throw new IllegalArgumentException("Types array must be in order largest-smallest: " +
                                        types[i - 1].getName() + " < " + loopType.getName());
                            }
                            }__CLR4_4_13y83y8lgchoqg3.R.inc(5218);if ((((lastRangeField.compareTo(loopRangeField) == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5219)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5220)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5221);throw new IllegalArgumentException("Types array must not contain duplicate: " +
                                        types[i - 1].getName() + " and " + loopType.getName());
                            }
                        }}
                    }} }else {{
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5222);if ((((lastUnitField.isSupported() && lastUnitField.getType() != DurationFieldType.YEARS_TYPE)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5223)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5224)==0&false))) {{
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5225);throw new IllegalArgumentException("Types array must be in order largest-smallest," +
                                    " for year-based fields, years is defined as being largest: " +
                                    types[i - 1].getName() + " < " + loopType.getName());
                        }
                    }}
                }}
            }}}
            }__CLR4_4_13y83y8lgchoqg3.R.inc(5226);lastUnitField = loopUnitField;
        }

        }__CLR4_4_13y83y8lgchoqg3.R.inc(5227);iTypes = (DateTimeFieldType[]) types.clone();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5228);chronology.validate(this, values);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5229);iValues = (int[]) values.clone();
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial by copying all the fields and types from
     * another partial.
     * <p>
     * This is most useful when copying from a YearMonthDay or TimeOfDay.
     */
    public Partial(ReadablePartial partial) {
        super();__CLR4_4_13y83y8lgchoqg3.R.inc(5231);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5230);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5232);if ((((partial == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5233)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5234)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5235);throw new IllegalArgumentException("The partial must not be null");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5236);iChronology = DateTimeUtils.getChronology(partial.getChronology()).withUTC();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5237);iTypes = new DateTimeFieldType[partial.size()];
        __CLR4_4_13y83y8lgchoqg3.R.inc(5238);iValues = new int[partial.size()];
        __CLR4_4_13y83y8lgchoqg3.R.inc(5239);for (int i = 0; (((i < partial.size())&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5240)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5241)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5242);iTypes[i] = partial.getFieldType(i);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5243);iValues[i] = partial.getValue(i);
        }
    }}finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with the specified values.
     * This constructor assigns and performs no validation.
     *
     * @param partial the partial to copy
     * @param values  the values to store
     * @throws IllegalArgumentException if the types or values are invalid
     */
    Partial(Partial partial, int[] values) {
        super();__CLR4_4_13y83y8lgchoqg3.R.inc(5245);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5244);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5246);iChronology = partial.iChronology;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5247);iTypes = partial.iTypes;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5248);iValues = values;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Constructs a Partial with the specified chronology, fields and values.
     * This constructor assigns and performs no validation.
     *
     * @param chronology the chronology
     * @param types      the types to create the partial from
     * @param values     the values to store
     * @throws IllegalArgumentException if the types or values are invalid
     */
    Partial(Chronology chronology, DateTimeFieldType[] types, int[] values) {
        super();__CLR4_4_13y83y8lgchoqg3.R.inc(5250);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5249);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5251);iChronology = chronology;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5252);iTypes = types;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5253);iValues = values;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the number of fields in this partial.
     *
     * @return the field count
     */
    public int size() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5254);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5255);return iTypes.length;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets the chronology of the partial which is never null.
     * <p>
     * The {@link Chronology} is the calculation engine behind the partial and
     * provides conversion and validation of the fields in a particular calendar system.
     *
     * @return the chronology, never null
     */
    public Chronology getChronology() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5256);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5257);return iChronology;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets the field for a specific index in the chronology specified.
     *
     * @param index  the index to retrieve
     * @param chrono the chronology to use
     * @return the field
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected DateTimeField getField(int index, Chronology chrono) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5258);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5259);return iTypes[index].getField(chrono);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets the field type at the specified index.
     *
     * @param index the index to retrieve
     * @return the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public DateTimeFieldType getFieldType(int index) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5260);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5261);return iTypes[index];
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets an array of the field type of each of the fields that
     * this partial supports.
     * <p>
     * The fields are returned largest to smallest.
     *
     * @return the array of field types (cloned), largest to smallest
     */
    public DateTimeFieldType[] getFieldTypes() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5262);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5263);return (DateTimeFieldType[]) iTypes.clone();
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the value of the field at the specified index.
     *
     * @param index the index
     * @return the value
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5264);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5265);return iValues[index];
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets an array of the value of each of the fields that
     * this partial supports.
     * <p>
     * The fields are returned largest to smallest.
     * Each value corresponds to the same array index as <code>getFieldTypes()</code>
     *
     * @return the current values of each field (cloned), largest to smallest
     */
    public int[] getValues() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5266);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5267);return (int[]) iValues.clone();
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Creates a new Partial instance with the specified chronology.
     * This instance is immutable and unaffected by this method call.
     * <p>
     * This method retains the values of the fields, thus the result will
     * typically refer to a different instant.
     * <p>
     * The time zone of the specified chronology is ignored, as Partial
     * operates without a time zone.
     *
     * @param newChronology the new chronology, null means ISO
     * @return a copy of this datetime with a different chronology
     * @throws IllegalArgumentException if the values are invalid for the new chronology
     */
    public Partial withChronologyRetainFields(Chronology newChronology) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5268);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5269);newChronology = DateTimeUtils.getChronology(newChronology);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5270);newChronology = newChronology.withUTC();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5271);if ((((newChronology == getChronology())&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5272)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5273)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5274);return this;
        } }else {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5275);Partial newPartial = new Partial(newChronology, iTypes, iValues);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5276);newChronology.validate(newPartial, iValues);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5277);return newPartial;
        }
    }}finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of this date with the specified field set to a new value.
     * <p>
     * If this partial did not previously support the field, the new one will.
     * Contrast this behaviour with {@link #withField(DateTimeFieldType, int)}.
     * <p>
     * For example, if the field type is <code>dayOfMonth</code> then the day
     * would be changed/added in the returned instance.
     *
     * @param fieldType the field type to set, not null
     * @param value     the value to set
     * @return a copy of this instance with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public Partial with(DateTimeFieldType fieldType, int value) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5278);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5279);if ((((fieldType == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5280)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5281)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5282);throw new IllegalArgumentException("The field type must not be null");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5283);int index = indexOf(fieldType);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5284);if ((((index == -1)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5285)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5286)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5287);DateTimeFieldType[] newTypes = new DateTimeFieldType[iTypes.length + 1];
            __CLR4_4_13y83y8lgchoqg3.R.inc(5288);int[] newValues = new int[newTypes.length];

            // find correct insertion point to keep largest-smallest order
            __CLR4_4_13y83y8lgchoqg3.R.inc(5289);int i = 0;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5290);DurationField unitField = fieldType.getDurationType().getField(iChronology);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5291);if ((((unitField.isSupported())&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5292)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5293)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5294);for (; (((i < iTypes.length)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5295)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5296)==0&false)); i++) {{
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5297);DateTimeFieldType loopType = iTypes[i];
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5298);DurationField loopUnitField = loopType.getDurationType().getField(iChronology);
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5299);if ((((loopUnitField.isSupported())&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5300)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5301)==0&false))) {{
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5302);int compare = unitField.compareTo(loopUnitField);
                        __CLR4_4_13y83y8lgchoqg3.R.inc(5303);if ((((compare > 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5304)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5305)==0&false))) {{
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5306);break;
                        } }else {__CLR4_4_13y83y8lgchoqg3.R.inc(5307);if ((((compare == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5308)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5309)==0&false))) {{
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5310);if ((((fieldType.getRangeDurationType() == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5311)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5312)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5313);break;
                            }
                            }__CLR4_4_13y83y8lgchoqg3.R.inc(5314);if ((((loopType.getRangeDurationType() == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5315)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5316)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5317);continue;
                            }
                            }__CLR4_4_13y83y8lgchoqg3.R.inc(5318);DurationField rangeField = fieldType.getRangeDurationType().getField(iChronology);
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5319);DurationField loopRangeField = loopType.getRangeDurationType().getField(iChronology);
                            __CLR4_4_13y83y8lgchoqg3.R.inc(5320);if ((((rangeField.compareTo(loopRangeField) > 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5321)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5322)==0&false))) {{
                                __CLR4_4_13y83y8lgchoqg3.R.inc(5323);break;
                            }
                        }}
                    }}}
                }}
            }}
            }__CLR4_4_13y83y8lgchoqg3.R.inc(5324);System.arraycopy(iTypes, 0, newTypes, 0, i);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5325);System.arraycopy(iValues, 0, newValues, 0, i);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5326);newTypes[i] = fieldType;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5327);newValues[i] = value;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5328);System.arraycopy(iTypes, i, newTypes, i + 1, newTypes.length - i - 1);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5329);System.arraycopy(iValues, i, newValues, i + 1, newValues.length - i - 1);
            // use public constructor to ensure full validation
            // this isn't overly efficient, but is safe
            __CLR4_4_13y83y8lgchoqg3.R.inc(5330);Partial newPartial = new Partial(newTypes, newValues, iChronology);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5331);iChronology.validate(newPartial, newValues);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5332);return newPartial;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5333);if ((((value == getValue(index))&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5334)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5335)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5336);return this;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5337);int[] newValues = getValues();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5338);newValues = getField(index).set(this, index, newValues, value);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5339);return new Partial(this, newValues);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a copy of this date with the specified field removed.
     * <p>
     * If this partial did not previously support the field, no error occurs.
     *
     * @param fieldType the field type to remove, may be null
     * @return a copy of this instance with the field removed
     */
    public Partial without(DateTimeFieldType fieldType) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5340);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5341);int index = indexOf(fieldType);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5342);if ((((index != -1)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5343)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5344)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5345);DateTimeFieldType[] newTypes = new DateTimeFieldType[size() - 1];
            __CLR4_4_13y83y8lgchoqg3.R.inc(5346);int[] newValues = new int[size() - 1];
            __CLR4_4_13y83y8lgchoqg3.R.inc(5347);System.arraycopy(iTypes, 0, newTypes, 0, index);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5348);System.arraycopy(iTypes, index + 1, newTypes, index, newTypes.length - index);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5349);System.arraycopy(iValues, 0, newValues, 0, index);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5350);System.arraycopy(iValues, index + 1, newValues, index, newValues.length - index);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5351);Partial newPartial = new Partial(iChronology, newTypes, newValues);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5352);iChronology.validate(newPartial, newValues);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5353);return newPartial;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5354);return this;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of this Partial with the specified field set to a new value.
     * <p>
     * If this partial does not support the field, an exception is thrown.
     * Contrast this behaviour with {@link #with(DateTimeFieldType, int)}.
     * <p>
     * For example, if the field type is <code>dayOfMonth</code> then the day
     * would be changed in the returned instance if supported.
     *
     * @param fieldType the field type to set, not null
     * @param value     the value to set
     * @return a copy of this instance with the field set
     * @throws IllegalArgumentException if the value is null or invalid
     */
    public Partial withField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5355);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5356);int index = indexOfSupported(fieldType);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5357);if ((((value == getValue(index))&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5358)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5359)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5360);return this;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5361);int[] newValues = getValues();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5362);newValues = getField(index).set(this, index, newValues, value);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5363);return new Partial(this, newValues);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a copy of this Partial with the value of the specified field increased.
     * If this partial does not support the field, an exception is thrown.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * The addition will overflow into larger fields (eg. minute to hour).
     * However, it will not wrap around if the top maximum is reached.
     *
     * @param fieldType the field type to add to, not null
     * @param amount    the amount to add
     * @return a copy of this instance with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException      if the new datetime exceeds the capacity
     */
    public Partial withFieldAdded(DurationFieldType fieldType, int amount) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5364);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5365);int index = indexOfSupported(fieldType);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5366);if ((((amount == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5367)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5368)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5369);return this;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5370);int[] newValues = getValues();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5371);newValues = getField(index).add(this, index, newValues, amount);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5372);return new Partial(this, newValues);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a copy of this Partial with the value of the specified field increased.
     * If this partial does not support the field, an exception is thrown.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * The addition will overflow into larger fields (eg. minute to hour).
     * If the maximum is reached, the addition will wrap.
     *
     * @param fieldType the field type to add to, not null
     * @param amount    the amount to add
     * @return a copy of this instance with the field updated
     * @throws IllegalArgumentException if the value is null or invalid
     * @throws ArithmeticException      if the new datetime exceeds the capacity
     */
    public Partial withFieldAddWrapped(DurationFieldType fieldType, int amount) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5373);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5374);int index = indexOfSupported(fieldType);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5375);if ((((amount == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5376)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5377)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5378);return this;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5379);int[] newValues = getValues();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5380);newValues = getField(index).addWrapPartial(this, index, newValues, amount);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5381);return new Partial(this, newValues);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a copy of this Partial with the specified period added.
     * <p>
     * If the addition is zero, then <code>this</code> is returned.
     * Fields in the period that aren't present in the partial are ignored.
     * <p>
     * This method is typically used to add multiple copies of complex
     * period instances. Adding one field is best achieved using the method
     * {@link #withFieldAdded(DurationFieldType, int)}.
     *
     * @param period the period to add to this one, null means zero
     * @param scalar the amount of times to add, such as -1 to subtract once
     * @return a copy of this instance with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity
     */
    public Partial withPeriodAdded(ReadablePeriod period, int scalar) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5382);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5383);if ((((period == null || scalar == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5384)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5385)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5386);return this;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5387);int[] newValues = getValues();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5388);for (int i = 0; (((i < period.size())&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5389)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5390)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5391);DurationFieldType fieldType = period.getFieldType(i);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5392);int index = indexOf(fieldType);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5393);if ((((index >= 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5394)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5395)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5396);newValues = getField(index).add(this, index, newValues,
                        FieldUtils.safeMultiply(period.getValue(i), scalar));
            }
        }}
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5397);return new Partial(this, newValues);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a copy of this instance with the specified period added.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param period the duration to add to this one, null means zero
     * @return a copy of this instance with the period added
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public Partial plus(ReadablePeriod period) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5398);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5399);return withPeriodAdded(period, 1);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a copy of this instance with the specified period take away.
     * <p>
     * If the amount is zero or null, then <code>this</code> is returned.
     *
     * @param period the period to reduce this instant by
     * @return a copy of this instance with the period taken away
     * @throws ArithmeticException if the new datetime exceeds the capacity of a long
     */
    public Partial minus(ReadablePeriod period) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5400);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5401);return withPeriodAdded(period, -1);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the property object for the specified type, which contains
     * many useful methods for getting and manipulating the partial.
     * <p>
     * See also {@link ReadablePartial#get(DateTimeFieldType)}.
     *
     * @param type the field type to get the property for, not null
     * @return the property object
     * @throws IllegalArgumentException if the field is null or unsupported
     */
    public Property property(DateTimeFieldType type) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5402);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5403);return new Property(this, indexOfSupported(type));
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Does this partial match the specified instant.
     * <p>
     * A match occurs when all the fields of this partial are the same as the
     * corresponding fields on the specified instant.
     *
     * @param instant an instant to check against, null means now in default zone
     * @return true if this partial matches the specified instant
     */
    public boolean isMatch(ReadableInstant instant) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5404);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5405);long millis = DateTimeUtils.getInstantMillis(instant);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5406);Chronology chrono = DateTimeUtils.getInstantChronology(instant);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5407);for (int i = 0; (((i < iTypes.length)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5408)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5409)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5410);int value = iTypes[i].getField(chrono).get(millis);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5411);if ((((value != iValues[i])&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5412)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5413)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5414);return false;
            }
        }}
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5415);return true;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Does this partial match the specified partial.
     * <p>
     * A match occurs when all the fields of this partial are the same as the
     * corresponding fields on the specified partial.
     *
     * @param partial a partial to check against, must not be null
     * @return true if this partial matches the specified partial
     * @throws IllegalArgumentException if the partial is null
     * @throws IllegalArgumentException if the fields of the two partials do not match
     * @since 1.5
     */
    public boolean isMatch(ReadablePartial partial) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5416);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5417);if ((((partial == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5418)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5419)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5420);throw new IllegalArgumentException("The partial must not be null");
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5421);for (int i = 0; (((i < iTypes.length)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5422)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5423)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5424);int value = partial.get(iTypes[i]);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5425);if ((((value != iValues[i])&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5426)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5427)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5428);return false;
            }
        }}
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5429);return true;
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a formatter suitable for the fields in this partial.
     * <p>
     * If there is no appropriate ISO format, null is returned.
     * This method may return a formatter that does not display all the
     * fields of the partial. This might occur when you have overlapping
     * fields, such as dayOfWeek and dayOfMonth.
     *
     * @return a formatter suitable for the fields in this partial, null
     * if none is suitable
     */
    public DateTimeFormatter getFormatter() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5430);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5431);DateTimeFormatter[] f = iFormatter;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5432);if ((((f == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5433)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5434)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5435);if ((((size() == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5436)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5437)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5438);return null;
            }
            }__CLR4_4_13y83y8lgchoqg3.R.inc(5439);f = new DateTimeFormatter[2];
            __CLR4_4_13y83y8lgchoqg3.R.inc(5440);try {
                __CLR4_4_13y83y8lgchoqg3.R.inc(5441);List<DateTimeFieldType> list = new ArrayList<DateTimeFieldType>(Arrays.asList(iTypes));
                __CLR4_4_13y83y8lgchoqg3.R.inc(5442);f[0] = ISODateTimeFormat.forFields(list, true, false);
                __CLR4_4_13y83y8lgchoqg3.R.inc(5443);if ((((list.size() == 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5444)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5445)==0&false))) {{
                    __CLR4_4_13y83y8lgchoqg3.R.inc(5446);f[1] = f[0];
                }
            }} catch (IllegalArgumentException ex) {
                // ignore
            }
            __CLR4_4_13y83y8lgchoqg3.R.inc(5447);iFormatter = f;
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5448);return f[0];
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Output the date in an appropriate ISO8601 format.
     * <p>
     * This method will output the partial in one of two ways.
     * If {@link #getFormatter()}
     * <p>
     * If there is no appropriate ISO format a dump of the fields is output
     * via {@link #toStringList()}.
     *
     * @return ISO8601 formatted string
     */
    public String toString() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5449);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5450);DateTimeFormatter[] f = iFormatter;
        __CLR4_4_13y83y8lgchoqg3.R.inc(5451);if ((((f == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5452)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5453)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5454);getFormatter();
            __CLR4_4_13y83y8lgchoqg3.R.inc(5455);f = iFormatter;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5456);if ((((f == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5457)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5458)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5459);return toStringList();
            }
        }}
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5460);DateTimeFormatter f1 = f[1];
        __CLR4_4_13y83y8lgchoqg3.R.inc(5461);if ((((f1 == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5462)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5463)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5464);return toStringList();
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5465);return f1.print(this);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Gets a string version of the partial that lists all the fields.
     * <p>
     * This method exists to provide a better debugging toString than
     * the standard toString. This method lists all the fields and their
     * values in a style similar to the collections framework.
     *
     * @return a toString format that lists all the fields
     */
    public String toStringList() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5466);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5467);int size = size();
        __CLR4_4_13y83y8lgchoqg3.R.inc(5468);StringBuilder buf = new StringBuilder(20 * size);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5469);buf.append('[');
        __CLR4_4_13y83y8lgchoqg3.R.inc(5470);for (int i = 0; (((i < size)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5471)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5472)==0&false)); i++) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5473);if ((((i > 0)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5474)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5475)==0&false))) {{
                __CLR4_4_13y83y8lgchoqg3.R.inc(5476);buf.append(',').append(' ');
            }
            }__CLR4_4_13y83y8lgchoqg3.R.inc(5477);buf.append(iTypes[i].getName());
            __CLR4_4_13y83y8lgchoqg3.R.inc(5478);buf.append('=');
            __CLR4_4_13y83y8lgchoqg3.R.inc(5479);buf.append(iValues[i]);
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5480);buf.append(']');
        __CLR4_4_13y83y8lgchoqg3.R.inc(5481);return buf.toString();
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     * Unsupported fields will appear as special unicode characters.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5482);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5483);if ((((pattern == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5484)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5485)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5486);return toString();
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5487);return DateTimeFormat.forPattern(pattern).print(this);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    /**
     * Output the date using the specified format pattern.
     * Unsupported fields will appear as special unicode characters.
     *
     * @param pattern the pattern specification, null means use <code>toString</code>
     * @param locale  Locale to use, null means default
     * @see org.joda.time.format.DateTimeFormat
     */
    public String toString(String pattern, Locale locale) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5488);
        __CLR4_4_13y83y8lgchoqg3.R.inc(5489);if ((((pattern == null)&&(__CLR4_4_13y83y8lgchoqg3.R.iget(5490)!=0|true))||(__CLR4_4_13y83y8lgchoqg3.R.iget(5491)==0&false))) {{
            __CLR4_4_13y83y8lgchoqg3.R.inc(5492);return toString();
        }
        }__CLR4_4_13y83y8lgchoqg3.R.inc(5493);return DateTimeFormat.forPattern(pattern).withLocale(locale).print(this);
    }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * The property class for <code>Partial</code>.
     * <p>
     * This class binds a <code>Partial</code> to a <code>DateTimeField</code>.
     *
     * @author Stephen Colebourne
     * @since 1.1
     */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {

        /**
         * Serialization version
         */
        private static final long serialVersionUID = 53278362873888L;

        /**
         * The partial
         */
        private final Partial iPartial;
        /**
         * The field index
         */
        private final int iFieldIndex;

        /**
         * Constructs a property.
         *
         * @param partial    the partial instance
         * @param fieldIndex the index in the partial
         */
        Property(Partial partial, int fieldIndex) {
            super();__CLR4_4_13y83y8lgchoqg3.R.inc(5495);try{__CLR4_4_13y83y8lgchoqg3.R.inc(5494);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5496);iPartial = partial;
            __CLR4_4_13y83y8lgchoqg3.R.inc(5497);iFieldIndex = fieldIndex;
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Gets the field that this property uses.
         *
         * @return the field
         */
        public DateTimeField getField() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5498);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5499);return iPartial.getField(iFieldIndex);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         *
         * @return the partial
         */
        protected ReadablePartial getReadablePartial() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5500);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5501);return iPartial;
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Gets the partial that this property belongs to.
         *
         * @return the partial
         */
        public Partial getPartial() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5502);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5503);return iPartial;
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Gets the value of this field.
         *
         * @return the field value
         */
        public int get() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5504);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5505);return iPartial.getValue(iFieldIndex);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Adds to the value of this field in a copy of this Partial.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it will affect larger fields.
         * Smaller fields are unaffected.
         * <p>
         * If the result would be too large, beyond the maximum year, then an
         * IllegalArgumentException is thrown.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param valueToAdd the value to add to the field in the copy
         * @return a copy of the Partial with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public Partial addToCopy(int valueToAdd) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5506);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5507);int[] newValues = iPartial.getValues();
            __CLR4_4_13y83y8lgchoqg3.R.inc(5508);newValues = getField().add(iPartial, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5509);return new Partial(iPartial, newValues);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Adds to the value of this field in a copy of this Partial wrapping
         * within this field if the maximum value is reached.
         * <p>
         * The value will be added to this field. If the value is too large to be
         * added solely to this field then it wraps within this field.
         * Other fields are unaffected.
         * <p>
         * For example,
         * <code>2004-12-20</code> addWrapField one month returns <code>2004-01-20</code>.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param valueToAdd the value to add to the field in the copy
         * @return a copy of the Partial with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public Partial addWrapFieldToCopy(int valueToAdd) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5510);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5511);int[] newValues = iPartial.getValues();
            __CLR4_4_13y83y8lgchoqg3.R.inc(5512);newValues = getField().addWrapField(iPartial, iFieldIndex, newValues, valueToAdd);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5513);return new Partial(iPartial, newValues);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Sets this field in a copy of the Partial.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param value the value to set the field in the copy to
         * @return a copy of the Partial with the field value changed
         * @throws IllegalArgumentException if the value isn't valid
         */
        public Partial setCopy(int value) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5514);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5515);int[] newValues = iPartial.getValues();
            __CLR4_4_13y83y8lgchoqg3.R.inc(5516);newValues = getField().set(iPartial, iFieldIndex, newValues, value);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5517);return new Partial(iPartial, newValues);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the Partial to a parsed text value.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param text   the text value to set
         * @param locale optional locale to use for selecting a text symbol
         * @return a copy of the Partial with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public Partial setCopy(String text, Locale locale) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5518);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5519);int[] newValues = iPartial.getValues();
            __CLR4_4_13y83y8lgchoqg3.R.inc(5520);newValues = getField().set(iPartial, iFieldIndex, newValues, text, locale);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5521);return new Partial(iPartial, newValues);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Sets this field in a copy of the Partial to a parsed text value.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         * Instead, a new instance is returned.
         *
         * @param text the text value to set
         * @return a copy of the Partial with the field value changed
         * @throws IllegalArgumentException if the text value isn't valid
         */
        public Partial setCopy(String text) {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5522);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5523);return setCopy(text, null);
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        //-----------------------------------------------------------------------

        /**
         * Returns a new Partial with this field set to the maximum value
         * for this field.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         *
         * @return a copy of the Partial with this field set to its maximum
         * @since 1.2
         */
        public Partial withMaximumValue() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5524);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5525);return setCopy(getMaximumValue());
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}

        /**
         * Returns a new Partial with this field set to the minimum value
         * for this field.
         * <p>
         * The Partial attached to this property is unchanged by this call.
         *
         * @return a copy of the Partial with this field set to its minimum
         * @since 1.2
         */
        public Partial withMinimumValue() {try{__CLR4_4_13y83y8lgchoqg3.R.inc(5526);
            __CLR4_4_13y83y8lgchoqg3.R.inc(5527);return setCopy(getMinimumValue());
        }finally{__CLR4_4_13y83y8lgchoqg3.R.flushNeeded();}}
    }

}
