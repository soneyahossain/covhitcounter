/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
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

import org.joda.time.DateTimeZone;

/**
 * Improves the performance of requesting time zone offsets and name keys by
 * caching the results. Time zones that have simple rules or are fixed should
 * not be cached, as it is unlikely to improve performance.
 * <p>
 * CachedDateTimeZone is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public class CachedDateTimeZone extends DateTimeZone {public static class __CLR4_4_1fnmfnmlgchor76{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,20403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 5472298452022250685L;

    private static final int cInfoCacheMask;

    static {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20290);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20291);Integer i;
        __CLR4_4_1fnmfnmlgchor76.R.inc(20292);try {
            __CLR4_4_1fnmfnmlgchor76.R.inc(20293);i = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException e) {
            __CLR4_4_1fnmfnmlgchor76.R.inc(20294);i = null;
        }

        __CLR4_4_1fnmfnmlgchor76.R.inc(20295);int cacheSize;
        __CLR4_4_1fnmfnmlgchor76.R.inc(20296);if ((((i == null)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20297)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20298)==0&false))) {{
            // With a cache size of 512, dates that lie within any 69.7 year
            // period have no cache collisions.
            __CLR4_4_1fnmfnmlgchor76.R.inc(20299);cacheSize = 512; // (1 << 9)
        } }else {{
            __CLR4_4_1fnmfnmlgchor76.R.inc(20300);cacheSize = i.intValue();
            // Ensure cache size is even power of 2.
            __CLR4_4_1fnmfnmlgchor76.R.inc(20301);cacheSize--;
            __CLR4_4_1fnmfnmlgchor76.R.inc(20302);int shift = 0;
            __CLR4_4_1fnmfnmlgchor76.R.inc(20303);while ((((cacheSize > 0)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20304)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20305)==0&false))) {{
                __CLR4_4_1fnmfnmlgchor76.R.inc(20306);shift++;
                __CLR4_4_1fnmfnmlgchor76.R.inc(20307);cacheSize >>= 1;
            }
            }__CLR4_4_1fnmfnmlgchor76.R.inc(20308);cacheSize = 1 << shift;
        }

        }__CLR4_4_1fnmfnmlgchor76.R.inc(20309);cInfoCacheMask = cacheSize - 1;
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    /**
     * Returns a new CachedDateTimeZone unless given zone is already cached.
     */
    public static CachedDateTimeZone forZone(DateTimeZone zone) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20310);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20311);if ((((zone instanceof CachedDateTimeZone)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20312)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20313)==0&false))) {{
            __CLR4_4_1fnmfnmlgchor76.R.inc(20314);return (CachedDateTimeZone) zone;
        }
        }__CLR4_4_1fnmfnmlgchor76.R.inc(20315);return new CachedDateTimeZone(zone);
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    /*
     * Caching is performed by breaking timeline down into periods of 2^32
     * milliseconds, or about 49.7 days. A year has about 7.3 periods, usually
     * with only 2 time zone offset periods. Most of the 49.7 day periods will
     * have no transition, about one quarter have one transition, and very rare
     * cases have multiple transitions.
     */

    private final DateTimeZone iZone;

    private final transient Info[] iInfoCache = new Info[cInfoCacheMask + 1];

    private CachedDateTimeZone(DateTimeZone zone) {
        super(zone.getID());__CLR4_4_1fnmfnmlgchor76.R.inc(20317);try{__CLR4_4_1fnmfnmlgchor76.R.inc(20316);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20318);iZone = zone;
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    /**
     * Returns the DateTimeZone being wrapped.
     */
    public DateTimeZone getUncachedZone() {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20319);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20320);return iZone;
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public String getNameKey(long instant) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20321);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20322);return getInfo(instant).getNameKey(instant);
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public int getOffset(long instant) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20323);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20324);return getInfo(instant).getOffset(instant);
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public int getStandardOffset(long instant) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20325);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20326);return getInfo(instant).getStandardOffset(instant);
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public boolean isFixed() {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20327);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20328);return iZone.isFixed();
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public long nextTransition(long instant) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20329);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20330);return iZone.nextTransition(instant);
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public long previousTransition(long instant) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20331);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20332);return iZone.previousTransition(instant);
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20333);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20334);return iZone.hashCode();
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20335);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20336);if ((((this == obj)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20337)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20338)==0&false))) {{
            __CLR4_4_1fnmfnmlgchor76.R.inc(20339);return true;
        }
        }__CLR4_4_1fnmfnmlgchor76.R.inc(20340);if ((((obj instanceof CachedDateTimeZone)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20341)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20342)==0&false))) {{
            __CLR4_4_1fnmfnmlgchor76.R.inc(20343);return iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        }__CLR4_4_1fnmfnmlgchor76.R.inc(20344);return false;
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    // Although accessed by multiple threads, this method doesn't need to be
    // synchronized.

    private Info getInfo(long millis) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20345);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20346);int period = (int) (millis >> 32);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20347);Info[] cache = iInfoCache;
        __CLR4_4_1fnmfnmlgchor76.R.inc(20348);int index = period & cInfoCacheMask;
        __CLR4_4_1fnmfnmlgchor76.R.inc(20349);Info info = cache[index];
        __CLR4_4_1fnmfnmlgchor76.R.inc(20350);if ((((info == null || (int) ((info.iPeriodStart >> 32)) != period)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20351)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20352)==0&false))) {{
            __CLR4_4_1fnmfnmlgchor76.R.inc(20353);info = createInfo(millis);
            __CLR4_4_1fnmfnmlgchor76.R.inc(20354);cache[index] = info;
        }
        }__CLR4_4_1fnmfnmlgchor76.R.inc(20355);return info;
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    private Info createInfo(long millis) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20356);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20357);long periodStart = millis & (0xffffffffL << 32);
        __CLR4_4_1fnmfnmlgchor76.R.inc(20358);Info info = new Info(iZone, periodStart);

        __CLR4_4_1fnmfnmlgchor76.R.inc(20359);long end = periodStart | 0xffffffffL;
        __CLR4_4_1fnmfnmlgchor76.R.inc(20360);Info chain = info;
        __CLR4_4_1fnmfnmlgchor76.R.inc(20361);while (true) {{
            __CLR4_4_1fnmfnmlgchor76.R.inc(20362);long next = iZone.nextTransition(periodStart);
            __CLR4_4_1fnmfnmlgchor76.R.inc(20363);if ((((next == periodStart || next > end)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20364)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20365)==0&false))) {{
                __CLR4_4_1fnmfnmlgchor76.R.inc(20366);break;
            }
            }__CLR4_4_1fnmfnmlgchor76.R.inc(20367);periodStart = next;
            __CLR4_4_1fnmfnmlgchor76.R.inc(20368);chain = (chain.iNextInfo = new Info(iZone, periodStart));
        }

        }__CLR4_4_1fnmfnmlgchor76.R.inc(20369);return info;
    }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

    private final static class Info {
        // For first Info in chain, iPeriodStart's lower 32 bits are clear.
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;

        Info iNextInfo;

        private String iNameKey;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        Info(DateTimeZone zone, long periodStart) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20370);
            __CLR4_4_1fnmfnmlgchor76.R.inc(20371);iPeriodStart = periodStart;
            __CLR4_4_1fnmfnmlgchor76.R.inc(20372);iZoneRef = zone;
        }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

        public String getNameKey(long millis) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20373);
            __CLR4_4_1fnmfnmlgchor76.R.inc(20374);if ((((iNextInfo == null || millis < iNextInfo.iPeriodStart)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20375)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20376)==0&false))) {{
                __CLR4_4_1fnmfnmlgchor76.R.inc(20377);if ((((iNameKey == null)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20378)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20379)==0&false))) {{
                    __CLR4_4_1fnmfnmlgchor76.R.inc(20380);iNameKey = iZoneRef.getNameKey(iPeriodStart);
                }
                }__CLR4_4_1fnmfnmlgchor76.R.inc(20381);return iNameKey;
            }
            }__CLR4_4_1fnmfnmlgchor76.R.inc(20382);return iNextInfo.getNameKey(millis);
        }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

        public int getOffset(long millis) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20383);
            __CLR4_4_1fnmfnmlgchor76.R.inc(20384);if ((((iNextInfo == null || millis < iNextInfo.iPeriodStart)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20385)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20386)==0&false))) {{
                __CLR4_4_1fnmfnmlgchor76.R.inc(20387);if ((((iOffset == Integer.MIN_VALUE)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20388)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20389)==0&false))) {{
                    __CLR4_4_1fnmfnmlgchor76.R.inc(20390);iOffset = iZoneRef.getOffset(iPeriodStart);
                }
                }__CLR4_4_1fnmfnmlgchor76.R.inc(20391);return iOffset;
            }
            }__CLR4_4_1fnmfnmlgchor76.R.inc(20392);return iNextInfo.getOffset(millis);
        }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}

        public int getStandardOffset(long millis) {try{__CLR4_4_1fnmfnmlgchor76.R.inc(20393);
            __CLR4_4_1fnmfnmlgchor76.R.inc(20394);if ((((iNextInfo == null || millis < iNextInfo.iPeriodStart)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20395)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20396)==0&false))) {{
                __CLR4_4_1fnmfnmlgchor76.R.inc(20397);if ((((iStandardOffset == Integer.MIN_VALUE)&&(__CLR4_4_1fnmfnmlgchor76.R.iget(20398)!=0|true))||(__CLR4_4_1fnmfnmlgchor76.R.iget(20399)==0&false))) {{
                    __CLR4_4_1fnmfnmlgchor76.R.inc(20400);iStandardOffset = iZoneRef.getStandardOffset(iPeriodStart);
                }
                }__CLR4_4_1fnmfnmlgchor76.R.inc(20401);return iStandardOffset;
            }
            }__CLR4_4_1fnmfnmlgchor76.R.inc(20402);return iNextInfo.getStandardOffset(millis);
        }finally{__CLR4_4_1fnmfnmlgchor76.R.flushNeeded();}}
    }
}
