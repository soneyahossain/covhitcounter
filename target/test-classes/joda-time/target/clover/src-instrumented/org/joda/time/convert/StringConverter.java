/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
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
package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * StringConverter converts from a String to an instant, partial,
 * duration, period or interval..
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
class StringConverter extends AbstractConverter
        implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {public static class __CLR4_4_1a7ra7rlgchoqwd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,13377,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final StringConverter INSTANCE = new StringConverter();

    /**
     * Restricted constructor.
     */
    protected StringConverter() {
        super();__CLR4_4_1a7ra7rlgchoqwd.R.inc(13240);try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13239);
    }finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the millis, which is the ISO parsed string value.
     *
     * @param object the String to convert, must not be null
     * @param chrono the chronology to use, non-null result of getChronology
     * @return the millisecond value
     * @throws IllegalArgumentException if the value if invalid
     */
    public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13241);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13242);String str = (String) object;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13243);DateTimeFormatter p = ISODateTimeFormat.dateTimeParser();
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13244);return p.withChronology(chrono).parseMillis(str);
    }finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

    /**
     * Extracts the values of the partial from an object of this converter's type.
     * This method checks if the parser has a zone, and uses it if present.
     * This is most useful for parsing local times with UTC.
     *
     * @param fieldSource a partial that provides access to the fields.
     *                    This partial may be incomplete and only getFieldType(int) should be used
     * @param object      the object to convert
     * @param chrono      the chronology to use, which is the non-null result of getChronology()
     * @param parser      the parser to use, may be null
     * @return the array of field values that match the fieldSource, must be non-null valid
     * @throws ClassCastException       if the object is invalid
     * @throws IllegalArgumentException if the value if invalid
     * @since 1.3
     */
    public int[] getPartialValues(ReadablePartial fieldSource, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13245);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13246);if ((((parser.getZone() != null)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13247)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13248)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13249);chrono = chrono.withZone(parser.getZone());
        }
        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13250);long millis = parser.withChronology(chrono).parseMillis((String) object);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13251);return chrono.get(fieldSource, millis);
    }finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the duration of the string using the standard type.
     * This matches the toString() method of ReadableDuration.
     *
     * @param object the String to convert, must not be null
     * @throws ClassCastException if the object is invalid
     */
    public long getDurationMillis(Object object) {try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13252);
        // parse here because duration could be bigger than the int supported
        // by the period parser
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13253);String original = (String) object;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13254);String str = original;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13255);int len = str.length();
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13256);if ((((len >= 4 &&
                (str.charAt(0) == 'P' || str.charAt(0) == 'p') &&
                (str.charAt(1) == 'T' || str.charAt(1) == 't') &&
                (str.charAt(len - 1) == 'S' || str.charAt(len - 1) == 's'))&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13257)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13258)==0&false))) {{
            // ok
        } }else {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13259);throw new IllegalArgumentException("Invalid format: \"" + original + '"');
        }
        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13260);str = str.substring(2, len - 1);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13261);int dot = -1;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13262);boolean negative = false;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13263);for (int i = 0; (((i < str.length())&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13264)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13265)==0&false)); i++) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13266);if ((((str.charAt(i) >= '0' && str.charAt(i) <= '9')&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13267)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13268)==0&false))) {{
                // ok
            } }else {__CLR4_4_1a7ra7rlgchoqwd.R.inc(13269);if ((((i == 0 && str.charAt(0) == '-')&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13270)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13271)==0&false))) {{
                // ok
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13272);negative = true;
            } }else {__CLR4_4_1a7ra7rlgchoqwd.R.inc(13273);if ((((i > ((((negative )&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13274)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13275)==0&false))? 1 : 0) && str.charAt(i) == '.' && dot == -1)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13276)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13277)==0&false))) {{
                // ok
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13278);dot = i;
            } }else {{
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13279);throw new IllegalArgumentException("Invalid format: \"" + original + '"');
            }
        }}}}
        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13280);long millis = 0, seconds = 0;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13281);int firstDigit = (((negative )&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13282)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13283)==0&false))? 1 : 0;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13284);if ((((dot > 0)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13285)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13286)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13287);seconds = Long.parseLong(str.substring(firstDigit, dot));
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13288);str = str.substring(dot + 1);
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13289);if ((((str.length() != 3)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13290)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13291)==0&false))) {{
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13292);str = (str + "000").substring(0, 3);
            }
            }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13293);millis = Integer.parseInt(str);
        } }else {__CLR4_4_1a7ra7rlgchoqwd.R.inc(13294);if ((((negative)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13295)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13296)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13297);seconds = Long.parseLong(str.substring(firstDigit, str.length()));
        } }else {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13298);seconds = Long.parseLong(str);
        }
        }}__CLR4_4_1a7ra7rlgchoqwd.R.inc(13299);if ((((negative)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13300)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13301)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13302);return FieldUtils.safeAdd(FieldUtils.safeMultiply(-seconds, 1000), -millis);
        } }else {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13303);return FieldUtils.safeAdd(FieldUtils.safeMultiply(seconds, 1000), millis);
        }
    }}finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Extracts duration values from an object of this converter's type, and
     * sets them into the given ReadWritableDuration.
     *
     * @param period period to get modified
     * @param object the String to convert, must not be null
     * @param chrono the chronology to use
     * @return the millisecond duration
     * @throws ClassCastException if the object is invalid
     */
    public void setInto(ReadWritablePeriod period, Object object, Chronology chrono) {try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13304);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13305);String str = (String) object;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13306);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13307);period.clear();
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13308);int pos = parser.parseInto(period, str, 0);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13309);if ((((pos < str.length())&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13310)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13311)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13312);if ((((pos < 0)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13313)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13314)==0&false))) {{
                // Parse again to get a better exception thrown.
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13315);parser.withParseType(period.getPeriodType()).parseMutablePeriod(str);
            }
            }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13316);throw new IllegalArgumentException("Invalid format: \"" + str + '"');
        }
    }}finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Sets the value of the mutable interval from the string.
     *
     * @param writableInterval the interval to set
     * @param object           the String to convert, must not be null
     * @param chrono           the chronology to use, may be null
     */
    public void setInto(ReadWritableInterval writableInterval, Object object, Chronology chrono) {try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13317);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13318);String str = (String) object;

        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13319);int separator = str.indexOf('/');
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13320);if ((((separator < 0)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13321)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13322)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13323);throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }

        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13324);String leftStr = str.substring(0, separator);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13325);if ((((leftStr.length() <= 0)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13326)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13327)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13328);throw new IllegalArgumentException("Format invalid: " + str);
        }
        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13329);String rightStr = str.substring(separator + 1);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13330);if ((((rightStr.length() <= 0)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13331)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13332)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13333);throw new IllegalArgumentException("Format invalid: " + str);
        }

        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13334);DateTimeFormatter dateTimeParser = ISODateTimeFormat.dateTimeParser();
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13335);dateTimeParser = dateTimeParser.withChronology(chrono);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13336);PeriodFormatter periodParser = ISOPeriodFormat.standard();
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13337);long startInstant = 0, endInstant = 0;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13338);Period period = null;
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13339);Chronology parsedChrono = null;

        // before slash
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13340);char c = leftStr.charAt(0);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13341);if ((((c == 'P' || c == 'p')&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13342)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13343)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13344);period = periodParser.withParseType(getPeriodType(leftStr)).parsePeriod(leftStr);
        } }else {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13345);DateTime start = dateTimeParser.parseDateTime(leftStr);
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13346);startInstant = start.getMillis();
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13347);parsedChrono = start.getChronology();
        }

        // after slash
        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13348);c = rightStr.charAt(0);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13349);if ((((c == 'P' || c == 'p')&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13350)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13351)==0&false))) {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13352);if ((((period != null)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13353)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13354)==0&false))) {{
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13355);throw new IllegalArgumentException("Interval composed of two durations: " + str);
            }
            }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13356);period = periodParser.withParseType(getPeriodType(rightStr)).parsePeriod(rightStr);
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13357);chrono = ((((chrono != null )&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13358)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13359)==0&false))? chrono : parsedChrono);
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13360);endInstant = chrono.add(period, startInstant, 1);
        } }else {{
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13361);DateTime end = dateTimeParser.parseDateTime(rightStr);
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13362);endInstant = end.getMillis();
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13363);parsedChrono = ((((parsedChrono != null )&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13364)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13365)==0&false))? parsedChrono : end.getChronology());
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13366);chrono = ((((chrono != null )&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13367)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13368)==0&false))? chrono : parsedChrono);
            __CLR4_4_1a7ra7rlgchoqwd.R.inc(13369);if ((((period != null)&&(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13370)!=0|true))||(__CLR4_4_1a7ra7rlgchoqwd.R.iget(13371)==0&false))) {{
                __CLR4_4_1a7ra7rlgchoqwd.R.inc(13372);startInstant = chrono.add(period, endInstant, -1);
            }
        }}

        }__CLR4_4_1a7ra7rlgchoqwd.R.inc(13373);writableInterval.setInterval(startInstant, endInstant);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13374);writableInterval.setChronology(chrono);
    }finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns String.class.
     *
     * @return String.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_1a7ra7rlgchoqwd.R.inc(13375);
        __CLR4_4_1a7ra7rlgchoqwd.R.inc(13376);return String.class;
    }finally{__CLR4_4_1a7ra7rlgchoqwd.R.flushNeeded();}}

}
