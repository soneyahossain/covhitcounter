/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.time.tz;

import java.text.DateFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.joda.time.DateTimeUtils;

/**
 * The default name provider acquires localized names from
 * {@link DateFormatSymbols java.text.DateFormatSymbols}.
 * <p>
 * DefaultNameProvider is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
@SuppressWarnings("unchecked")
public class DefaultNameProvider implements NameProvider {public static class __CLR4_4_1gkggkglgchor8r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,21577,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // locale -> (id -> (nameKey -> [shortName, name]))
    private HashMap<Locale, Map<String, Map<String, Object>>> iByLocaleCache = createCache();
    private HashMap<Locale, Map<String, Map<Boolean, Object>>> iByLocaleCache2 = createCache();

    public DefaultNameProvider() {try{__CLR4_4_1gkggkglgchor8r.R.inc(21472);
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // retained original code for name lookup, not used in normal code
    // this code could be refactored to avoid duplication, but leaving it as is ensures backward compatibility
    public String getShortName(Locale locale, String id, String nameKey) {try{__CLR4_4_1gkggkglgchor8r.R.inc(21473);
        __CLR4_4_1gkggkglgchor8r.R.inc(21474);String[] nameSet = getNameSet(locale, id, nameKey);
        __CLR4_4_1gkggkglgchor8r.R.inc(21475);return (((nameSet == null )&&(__CLR4_4_1gkggkglgchor8r.R.iget(21476)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21477)==0&false))? null : nameSet[0];
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    public String getName(Locale locale, String id, String nameKey) {try{__CLR4_4_1gkggkglgchor8r.R.inc(21478);
        __CLR4_4_1gkggkglgchor8r.R.inc(21479);String[] nameSet = getNameSet(locale, id, nameKey);
        __CLR4_4_1gkggkglgchor8r.R.inc(21480);return (((nameSet == null )&&(__CLR4_4_1gkggkglgchor8r.R.iget(21481)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21482)==0&false))? null : nameSet[1];
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    private synchronized String[] getNameSet(Locale locale, String id, String nameKey) {try{__CLR4_4_1gkggkglgchor8r.R.inc(21483);
        __CLR4_4_1gkggkglgchor8r.R.inc(21484);if ((((locale == null || id == null || nameKey == null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21485)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21486)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21487);return null;
        }

        }__CLR4_4_1gkggkglgchor8r.R.inc(21488);Map<String, Map<String, Object>> byIdCache = iByLocaleCache.get(locale);
        __CLR4_4_1gkggkglgchor8r.R.inc(21489);if ((((byIdCache == null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21490)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21491)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21492);iByLocaleCache.put(locale, byIdCache = createCache());
        }

        }__CLR4_4_1gkggkglgchor8r.R.inc(21493);Map<String, Object> byNameKeyCache = byIdCache.get(id);
        __CLR4_4_1gkggkglgchor8r.R.inc(21494);if ((((byNameKeyCache == null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21495)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21496)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21497);byIdCache.put(id, byNameKeyCache = createCache());

            __CLR4_4_1gkggkglgchor8r.R.inc(21498);String[][] zoneStringsEn = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
            __CLR4_4_1gkggkglgchor8r.R.inc(21499);String[] setEn = null;
            __CLR4_4_1gkggkglgchor8r.R.inc(21500);for (String[] strings : zoneStringsEn) {{
                __CLR4_4_1gkggkglgchor8r.R.inc(21501);if ((((strings != null && strings.length >= 5 && id.equals(strings[0]))&&(__CLR4_4_1gkggkglgchor8r.R.iget(21502)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21503)==0&false))) {{
                    __CLR4_4_1gkggkglgchor8r.R.inc(21504);setEn = strings;
                    __CLR4_4_1gkggkglgchor8r.R.inc(21505);break;
                }
            }}
            }__CLR4_4_1gkggkglgchor8r.R.inc(21506);String[][] zoneStringsLoc = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
            __CLR4_4_1gkggkglgchor8r.R.inc(21507);String[] setLoc = null;
            __CLR4_4_1gkggkglgchor8r.R.inc(21508);for (String[] strings : zoneStringsLoc) {{
                __CLR4_4_1gkggkglgchor8r.R.inc(21509);if ((((strings != null && strings.length >= 5 && id.equals(strings[0]))&&(__CLR4_4_1gkggkglgchor8r.R.iget(21510)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21511)==0&false))) {{
                    __CLR4_4_1gkggkglgchor8r.R.inc(21512);setLoc = strings;
                    __CLR4_4_1gkggkglgchor8r.R.inc(21513);break;
                }
            }}

            }__CLR4_4_1gkggkglgchor8r.R.inc(21514);if ((((setEn != null && setLoc != null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21515)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21516)==0&false))) {{
                __CLR4_4_1gkggkglgchor8r.R.inc(21517);byNameKeyCache.put(setEn[2], new String[]{setLoc[2], setLoc[1]});
                // need to handle case where summer and winter have the same
                // abbreviation, such as EST in Australia [1716305]
                // we handle this by appending "-Summer", cf ZoneInfoCompiler
                __CLR4_4_1gkggkglgchor8r.R.inc(21518);if ((((setEn[2].equals(setEn[4]))&&(__CLR4_4_1gkggkglgchor8r.R.iget(21519)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21520)==0&false))) {{
                    __CLR4_4_1gkggkglgchor8r.R.inc(21521);byNameKeyCache.put(setEn[4] + "-Summer", new String[]{setLoc[4], setLoc[3]});
                } }else {{
                    __CLR4_4_1gkggkglgchor8r.R.inc(21522);byNameKeyCache.put(setEn[4], new String[]{setLoc[4], setLoc[3]});
                }
            }}
        }}
        }__CLR4_4_1gkggkglgchor8r.R.inc(21523);return (String[]) byNameKeyCache.get(nameKey);
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // change lookup to operate on boolean standard/summer time flag
    // handles changes to the nameKey better
    public String getShortName(Locale locale, String id, String nameKey, boolean standardTime) {try{__CLR4_4_1gkggkglgchor8r.R.inc(21524);
        __CLR4_4_1gkggkglgchor8r.R.inc(21525);String[] nameSet = getNameSet(locale, id, nameKey, standardTime);
        __CLR4_4_1gkggkglgchor8r.R.inc(21526);return (((nameSet == null )&&(__CLR4_4_1gkggkglgchor8r.R.iget(21527)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21528)==0&false))? null : nameSet[0];
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    public String getName(Locale locale, String id, String nameKey, boolean standardTime) {try{__CLR4_4_1gkggkglgchor8r.R.inc(21529);
        __CLR4_4_1gkggkglgchor8r.R.inc(21530);String[] nameSet = getNameSet(locale, id, nameKey, standardTime);
        __CLR4_4_1gkggkglgchor8r.R.inc(21531);return (((nameSet == null )&&(__CLR4_4_1gkggkglgchor8r.R.iget(21532)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21533)==0&false))? null : nameSet[1];
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    private synchronized String[] getNameSet(Locale locale, String id, String nameKey, boolean standardTime) {try{__CLR4_4_1gkggkglgchor8r.R.inc(21534);
        __CLR4_4_1gkggkglgchor8r.R.inc(21535);if ((((locale == null || id == null || nameKey == null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21536)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21537)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21538);return null;
        }
        }__CLR4_4_1gkggkglgchor8r.R.inc(21539);if ((((id.startsWith("Etc/"))&&(__CLR4_4_1gkggkglgchor8r.R.iget(21540)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21541)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21542);id = id.substring(4);
        }

        }__CLR4_4_1gkggkglgchor8r.R.inc(21543);Map<String, Map<Boolean, Object>> byIdCache = iByLocaleCache2.get(locale);
        __CLR4_4_1gkggkglgchor8r.R.inc(21544);if ((((byIdCache == null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21545)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21546)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21547);iByLocaleCache2.put(locale, byIdCache = createCache());
        }

        }__CLR4_4_1gkggkglgchor8r.R.inc(21548);Map<Boolean, Object> byNameKeyCache = byIdCache.get(id);
        __CLR4_4_1gkggkglgchor8r.R.inc(21549);if ((((byNameKeyCache == null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21550)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21551)==0&false))) {{
            __CLR4_4_1gkggkglgchor8r.R.inc(21552);byIdCache.put(id, byNameKeyCache = createCache());

            __CLR4_4_1gkggkglgchor8r.R.inc(21553);String[][] zoneStringsEn = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
            __CLR4_4_1gkggkglgchor8r.R.inc(21554);String[] setEn = null;
            __CLR4_4_1gkggkglgchor8r.R.inc(21555);for (String[] strings : zoneStringsEn) {{
                __CLR4_4_1gkggkglgchor8r.R.inc(21556);if ((((strings != null && strings.length >= 5 && id.equals(strings[0]))&&(__CLR4_4_1gkggkglgchor8r.R.iget(21557)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21558)==0&false))) {{
                    __CLR4_4_1gkggkglgchor8r.R.inc(21559);setEn = strings;
                    __CLR4_4_1gkggkglgchor8r.R.inc(21560);break;
                }
            }}
            }__CLR4_4_1gkggkglgchor8r.R.inc(21561);String[][] zoneStringsLoc = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
            __CLR4_4_1gkggkglgchor8r.R.inc(21562);String[] setLoc = null;
            __CLR4_4_1gkggkglgchor8r.R.inc(21563);for (String[] strings : zoneStringsLoc) {{
                __CLR4_4_1gkggkglgchor8r.R.inc(21564);if ((((strings != null && strings.length >= 5 && id.equals(strings[0]))&&(__CLR4_4_1gkggkglgchor8r.R.iget(21565)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21566)==0&false))) {{
                    __CLR4_4_1gkggkglgchor8r.R.inc(21567);setLoc = strings;
                    __CLR4_4_1gkggkglgchor8r.R.inc(21568);break;
                }
            }}

            }__CLR4_4_1gkggkglgchor8r.R.inc(21569);if ((((setEn != null && setLoc != null)&&(__CLR4_4_1gkggkglgchor8r.R.iget(21570)!=0|true))||(__CLR4_4_1gkggkglgchor8r.R.iget(21571)==0&false))) {{
                __CLR4_4_1gkggkglgchor8r.R.inc(21572);byNameKeyCache.put(Boolean.TRUE, new String[]{setLoc[2], setLoc[1]});
                __CLR4_4_1gkggkglgchor8r.R.inc(21573);byNameKeyCache.put(Boolean.FALSE, new String[]{setLoc[4], setLoc[3]});
            }
        }}
        }__CLR4_4_1gkggkglgchor8r.R.inc(21574);return (String[]) byNameKeyCache.get(Boolean.valueOf(standardTime));
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private HashMap createCache() {try{__CLR4_4_1gkggkglgchor8r.R.inc(21575);
        __CLR4_4_1gkggkglgchor8r.R.inc(21576);return new HashMap(7);
    }finally{__CLR4_4_1gkggkglgchor8r.R.flushNeeded();}}
}
