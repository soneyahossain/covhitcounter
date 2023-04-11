/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2014 Stephen Colebourne
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

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;

/**
 * Utility class used by a few of the GJDateTimeFields.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
class GJLocaleSymbols {public static class __CLR4_4_18i18i1lgchoqs4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11167,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static ConcurrentMap<Locale, GJLocaleSymbols> cCache = new ConcurrentHashMap<Locale, GJLocaleSymbols>();

    /**
     * Obtains the symbols for a locale.
     *
     * @param locale the locale, null returns default
     * @return the symbols, not null
     */
    static GJLocaleSymbols forLocale(Locale locale) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11017);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11018);if ((((locale == null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11019)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11020)==0&false))) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11021);locale = Locale.getDefault();
        }
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11022);GJLocaleSymbols symbols = cCache.get(locale);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11023);if ((((symbols == null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11024)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11025)==0&false))) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11026);symbols = new GJLocaleSymbols(locale);
            __CLR4_4_18i18i1lgchoqs4.R.inc(11027);GJLocaleSymbols oldSymbols = cCache.putIfAbsent(locale, symbols);
            __CLR4_4_18i18i1lgchoqs4.R.inc(11028);if ((((oldSymbols != null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11029)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11030)==0&false))) {{
                __CLR4_4_18i18i1lgchoqs4.R.inc(11031);symbols = oldSymbols;
            }
        }}
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11032);return symbols;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    private static String[] realignMonths(String[] months) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11033);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11034);String[] a = new String[13];
        __CLR4_4_18i18i1lgchoqs4.R.inc(11035);for (int i = 1; (((i < 13)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11036)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11037)==0&false)); i++) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11038);a[i] = months[i - 1];
        }
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11039);return a;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    private static String[] realignDaysOfWeek(String[] daysOfWeek) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11040);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11041);String[] a = new String[8];
        __CLR4_4_18i18i1lgchoqs4.R.inc(11042);for (int i = 1; (((i < 8)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11043)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11044)==0&false)); i++) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11045);a[i] = daysOfWeek[((((i < 7) )&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11046)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11047)==0&false))? i + 1 : 1];
        }
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11048);return a;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    private static void addSymbols(TreeMap<String, Integer> map, String[] symbols, Integer[] integers) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11049);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11050);for (int i = symbols.length; (((--i >= 0)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11051)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11052)==0&false)); ) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11053);String symbol = symbols[i];
            __CLR4_4_18i18i1lgchoqs4.R.inc(11054);if ((((symbol != null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11055)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11056)==0&false))) {{
                __CLR4_4_18i18i1lgchoqs4.R.inc(11057);map.put(symbol, integers[i]);
            }
        }}
    }}finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    private static void addNumerals(TreeMap<String, Integer> map, int start, int end, Integer[] integers) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11058);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11059);for (int i = start; (((i <= end)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11060)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11061)==0&false)); i++) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11062);map.put(String.valueOf(i).intern(), integers[i]);
        }
    }}finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    private static int maxLength(String[] a) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11063);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11064);int max = 0;
        __CLR4_4_18i18i1lgchoqs4.R.inc(11065);for (int i = a.length; (((--i >= 0)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11066)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11067)==0&false)); ) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11068);String s = a[i];
            __CLR4_4_18i18i1lgchoqs4.R.inc(11069);if ((((s != null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11070)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11071)==0&false))) {{
                __CLR4_4_18i18i1lgchoqs4.R.inc(11072);int len = s.length();
                __CLR4_4_18i18i1lgchoqs4.R.inc(11073);if ((((len > max)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11074)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11075)==0&false))) {{
                    __CLR4_4_18i18i1lgchoqs4.R.inc(11076);max = len;
                }
            }}
        }}
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11077);return max;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    private final String[] iEras;
    private final String[] iDaysOfWeek;
    private final String[] iShortDaysOfWeek;
    private final String[] iMonths;
    private final String[] iShortMonths;
    private final String[] iHalfday;

    private final TreeMap<String, Integer> iParseEras;
    private final TreeMap<String, Integer> iParseDaysOfWeek;
    private final TreeMap<String, Integer> iParseMonths;

    private final int iMaxEraLength;
    private final int iMaxDayOfWeekLength;
    private final int iMaxShortDayOfWeekLength;
    private final int iMaxMonthLength;
    private final int iMaxShortMonthLength;
    private final int iMaxHalfdayLength;

    /**
     * @param locale must not be null
     */
    private GJLocaleSymbols(Locale locale) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11078);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11079);DateFormatSymbols dfs = DateTimeUtils.getDateFormatSymbols(locale);

        __CLR4_4_18i18i1lgchoqs4.R.inc(11080);iEras = dfs.getEras();
        __CLR4_4_18i18i1lgchoqs4.R.inc(11081);iDaysOfWeek = realignDaysOfWeek(dfs.getWeekdays());
        __CLR4_4_18i18i1lgchoqs4.R.inc(11082);iShortDaysOfWeek = realignDaysOfWeek(dfs.getShortWeekdays());
        __CLR4_4_18i18i1lgchoqs4.R.inc(11083);iMonths = realignMonths(dfs.getMonths());
        __CLR4_4_18i18i1lgchoqs4.R.inc(11084);iShortMonths = realignMonths(dfs.getShortMonths());
        __CLR4_4_18i18i1lgchoqs4.R.inc(11085);iHalfday = dfs.getAmPmStrings();

        __CLR4_4_18i18i1lgchoqs4.R.inc(11086);Integer[] integers = new Integer[13];
        __CLR4_4_18i18i1lgchoqs4.R.inc(11087);for (int i = 0; (((i < 13)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11088)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11089)==0&false)); i++) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11090);integers[i] = Integer.valueOf(i);
        }

        }__CLR4_4_18i18i1lgchoqs4.R.inc(11091);iParseEras = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11092);addSymbols(iParseEras, iEras, integers);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11093);if (((("en".equals(locale.getLanguage()))&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11094)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11095)==0&false))) {{
            // Include support for parsing "BCE" and "CE" if the language is
            // English. At some point Joda-Time will need an independent set of
            // localized symbols and not depend on java.text.DateFormatSymbols.
            __CLR4_4_18i18i1lgchoqs4.R.inc(11096);iParseEras.put("BCE", integers[0]);
            __CLR4_4_18i18i1lgchoqs4.R.inc(11097);iParseEras.put("CE", integers[1]);
        }

        }__CLR4_4_18i18i1lgchoqs4.R.inc(11098);iParseDaysOfWeek = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11099);addSymbols(iParseDaysOfWeek, iDaysOfWeek, integers);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11100);addSymbols(iParseDaysOfWeek, iShortDaysOfWeek, integers);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11101);addNumerals(iParseDaysOfWeek, 1, 7, integers);

        __CLR4_4_18i18i1lgchoqs4.R.inc(11102);iParseMonths = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11103);addSymbols(iParseMonths, iMonths, integers);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11104);addSymbols(iParseMonths, iShortMonths, integers);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11105);addNumerals(iParseMonths, 1, 12, integers);

        __CLR4_4_18i18i1lgchoqs4.R.inc(11106);iMaxEraLength = maxLength(iEras);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11107);iMaxDayOfWeekLength = maxLength(iDaysOfWeek);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11108);iMaxShortDayOfWeekLength = maxLength(iShortDaysOfWeek);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11109);iMaxMonthLength = maxLength(iMonths);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11110);iMaxShortMonthLength = maxLength(iShortMonths);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11111);iMaxHalfdayLength = maxLength(iHalfday);
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public String eraValueToText(int value) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11112);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11113);return iEras[value];
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int eraTextToValue(String text) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11114);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11115);Integer era = iParseEras.get(text);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11116);if ((((era != null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11117)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11118)==0&false))) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11119);return era.intValue();
        }
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11120);throw new IllegalFieldValueException(DateTimeFieldType.era(), text);
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int getEraMaxTextLength() {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11121);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11122);return iMaxEraLength;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public String monthOfYearValueToText(int value) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11123);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11124);return iMonths[value];
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public String monthOfYearValueToShortText(int value) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11125);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11126);return iShortMonths[value];
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int monthOfYearTextToValue(String text) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11127);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11128);Integer month = iParseMonths.get(text);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11129);if ((((month != null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11130)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11131)==0&false))) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11132);return month.intValue();
        }
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11133);throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), text);
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int getMonthMaxTextLength() {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11134);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11135);return iMaxMonthLength;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int getMonthMaxShortTextLength() {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11136);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11137);return iMaxShortMonthLength;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public String dayOfWeekValueToText(int value) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11138);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11139);return iDaysOfWeek[value];
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public String dayOfWeekValueToShortText(int value) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11140);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11141);return iShortDaysOfWeek[value];
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int dayOfWeekTextToValue(String text) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11142);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11143);Integer day = iParseDaysOfWeek.get(text);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11144);if ((((day != null)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11145)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11146)==0&false))) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11147);return day.intValue();
        }
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11148);throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), text);
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int getDayOfWeekMaxTextLength() {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11149);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11150);return iMaxDayOfWeekLength;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int getDayOfWeekMaxShortTextLength() {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11151);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11152);return iMaxShortDayOfWeekLength;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public String halfdayValueToText(int value) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11153);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11154);return iHalfday[value];
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int halfdayTextToValue(String text) {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11155);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11156);String[] halfday = iHalfday;
        __CLR4_4_18i18i1lgchoqs4.R.inc(11157);for (int i = halfday.length; (((--i >= 0)&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11158)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11159)==0&false)); ) {{
            __CLR4_4_18i18i1lgchoqs4.R.inc(11160);if ((((halfday[i].equalsIgnoreCase(text))&&(__CLR4_4_18i18i1lgchoqs4.R.iget(11161)!=0|true))||(__CLR4_4_18i18i1lgchoqs4.R.iget(11162)==0&false))) {{
                __CLR4_4_18i18i1lgchoqs4.R.inc(11163);return i;
            }
        }}
        }__CLR4_4_18i18i1lgchoqs4.R.inc(11164);throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), text);
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}

    public int getHalfdayMaxTextLength() {try{__CLR4_4_18i18i1lgchoqs4.R.inc(11165);
        __CLR4_4_18i18i1lgchoqs4.R.inc(11166);return iMaxHalfdayLength;
    }finally{__CLR4_4_18i18i1lgchoqs4.R.flushNeeded();}}
}
