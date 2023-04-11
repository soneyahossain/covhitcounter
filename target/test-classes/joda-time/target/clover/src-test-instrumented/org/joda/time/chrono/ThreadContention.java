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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

import junit.framework.Assert;
import org.joda.time.DateTimeZone;

/**
 * This class is a testing class for threading.
 */
public class ThreadContention {public static class __CLR4_4_11d761d76lgchosob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,63868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) {try{__CLR4_4_11d761d76lgchosob.R.inc(63762);
        __CLR4_4_11d761d76lgchosob.R.inc(63763);multiThreadGJLocale();
        __CLR4_4_11d761d76lgchosob.R.inc(63764);singleThreadGJLocale2();
        __CLR4_4_11d761d76lgchosob.R.inc(63765);singleThreadGJLocale();
        __CLR4_4_11d761d76lgchosob.R.inc(63766);multiThreadZones();
        __CLR4_4_11d761d76lgchosob.R.inc(63767);singleThreadZones();
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    private static void multiThreadGJLocale() {try{__CLR4_4_11d761d76lgchosob.R.inc(63768);
        __CLR4_4_11d761d76lgchosob.R.inc(63769);final CountDownLatch latch = new CountDownLatch(1);
        __CLR4_4_11d761d76lgchosob.R.inc(63770);final List<Locale> locales = createLocales();
        __CLR4_4_11d761d76lgchosob.R.inc(63771);List<Runnable> runnables = new ArrayList<Runnable>();
        __CLR4_4_11d761d76lgchosob.R.inc(63772);for (int i = 0; (((i < 100)&&(__CLR4_4_11d761d76lgchosob.R.iget(63773)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63774)==0&false)); i++) {{
            __CLR4_4_11d761d76lgchosob.R.inc(63775);Runnable r = new Runnable() {
                public void run() {try{__CLR4_4_11d761d76lgchosob.R.inc(63776);
                    __CLR4_4_11d761d76lgchosob.R.inc(63777);try {
                        __CLR4_4_11d761d76lgchosob.R.inc(63778);latch.await();
                        __CLR4_4_11d761d76lgchosob.R.inc(63779);List<Locale> shuffled = new ArrayList<Locale>(locales);
                        __CLR4_4_11d761d76lgchosob.R.inc(63780);Collections.shuffle(shuffled);
                        __CLR4_4_11d761d76lgchosob.R.inc(63781);String name = Thread.currentThread().getName();
                        __CLR4_4_11d761d76lgchosob.R.inc(63782);for (int j = 0; (((j < 100)&&(__CLR4_4_11d761d76lgchosob.R.iget(63783)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63784)==0&false)); j++) {{
                            __CLR4_4_11d761d76lgchosob.R.inc(63785);for (Locale locale : shuffled) {{
                                __CLR4_4_11d761d76lgchosob.R.inc(63786);GJLocaleSymbols symbols = GJLocaleSymbols.forLocale(locale);
                                __CLR4_4_11d761d76lgchosob.R.inc(63787);Assert.assertEquals(GJLocaleSymbols.class, symbols.getClass());
                            }
                        }}
                        }__CLR4_4_11d761d76lgchosob.R.inc(63788);System.out.println("Finished: " + name);

                    } catch (Exception ex) {
                        __CLR4_4_11d761d76lgchosob.R.inc(63789);ex.printStackTrace();
                        __CLR4_4_11d761d76lgchosob.R.inc(63790);System.exit(1);
                    }
                }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}
            };
            __CLR4_4_11d761d76lgchosob.R.inc(63791);new Thread(r).start();
            __CLR4_4_11d761d76lgchosob.R.inc(63792);runnables.add(r);
        }
        }__CLR4_4_11d761d76lgchosob.R.inc(63793);latch.countDown();
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    private static void singleThreadGJLocale() {try{__CLR4_4_11d761d76lgchosob.R.inc(63794);
        __CLR4_4_11d761d76lgchosob.R.inc(63795);List<Locale> locales = createLocales();
        __CLR4_4_11d761d76lgchosob.R.inc(63796);List<Locale> shuffled = new ArrayList<Locale>(locales);
        __CLR4_4_11d761d76lgchosob.R.inc(63797);Collections.shuffle(shuffled);
        __CLR4_4_11d761d76lgchosob.R.inc(63798);long start = System.nanoTime();
        __CLR4_4_11d761d76lgchosob.R.inc(63799);int count = 0;
        __CLR4_4_11d761d76lgchosob.R.inc(63800);for (int j = 0; (((j < 10000)&&(__CLR4_4_11d761d76lgchosob.R.iget(63801)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63802)==0&false)); j++) {{
            __CLR4_4_11d761d76lgchosob.R.inc(63803);for (Locale locale : shuffled) {{
                __CLR4_4_11d761d76lgchosob.R.inc(63804);GJLocaleSymbols symbols = GJLocaleSymbols.forLocale(locale);
                __CLR4_4_11d761d76lgchosob.R.inc(63805);count = count + symbols.getDayOfWeekMaxShortTextLength();
            }
        }}
        }__CLR4_4_11d761d76lgchosob.R.inc(63806);long end = System.nanoTime();
        __CLR4_4_11d761d76lgchosob.R.inc(63807);System.out.println("Finished " + count + " " + (end - start) / 1000000);
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    private static void singleThreadGJLocale2() {try{__CLR4_4_11d761d76lgchosob.R.inc(63808);
        __CLR4_4_11d761d76lgchosob.R.inc(63809);List<Locale> locales = createLocales();
        __CLR4_4_11d761d76lgchosob.R.inc(63810);List<Locale> shuffled = new ArrayList<Locale>(locales);
        __CLR4_4_11d761d76lgchosob.R.inc(63811);Collections.shuffle(shuffled);
        __CLR4_4_11d761d76lgchosob.R.inc(63812);long start = System.nanoTime();
        __CLR4_4_11d761d76lgchosob.R.inc(63813);int count = 0;
        __CLR4_4_11d761d76lgchosob.R.inc(63814);for (int j = 0; (((j < 1000000)&&(__CLR4_4_11d761d76lgchosob.R.iget(63815)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63816)==0&false)); j++) {{
            __CLR4_4_11d761d76lgchosob.R.inc(63817);GJLocaleSymbols symbols = GJLocaleSymbols.forLocale(Locale.US);
            __CLR4_4_11d761d76lgchosob.R.inc(63818);count = count + symbols.getDayOfWeekMaxShortTextLength() + symbols.hashCode();
        }
        }__CLR4_4_11d761d76lgchosob.R.inc(63819);long end = System.nanoTime();
        __CLR4_4_11d761d76lgchosob.R.inc(63820);System.out.println("Finished " + count + " " + (end - start) / 1000000);
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    private static List<Locale> createLocales() {try{__CLR4_4_11d761d76lgchosob.R.inc(63821);
        __CLR4_4_11d761d76lgchosob.R.inc(63822);return Arrays.asList(Locale.getAvailableLocales());
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    private static void multiThreadZones() {try{__CLR4_4_11d761d76lgchosob.R.inc(63823);
        __CLR4_4_11d761d76lgchosob.R.inc(63824);final CountDownLatch latch = new CountDownLatch(1);
        __CLR4_4_11d761d76lgchosob.R.inc(63825);final List<DateTimeZone> zones = createZones();
        __CLR4_4_11d761d76lgchosob.R.inc(63826);List<Runnable> runnables = new ArrayList<Runnable>();
        __CLR4_4_11d761d76lgchosob.R.inc(63827);for (int i = 0; (((i < 100)&&(__CLR4_4_11d761d76lgchosob.R.iget(63828)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63829)==0&false)); i++) {{
            __CLR4_4_11d761d76lgchosob.R.inc(63830);Runnable r = new Runnable() {
                public void run() {try{__CLR4_4_11d761d76lgchosob.R.inc(63831);
                    __CLR4_4_11d761d76lgchosob.R.inc(63832);try {
                        __CLR4_4_11d761d76lgchosob.R.inc(63833);latch.await();
                        __CLR4_4_11d761d76lgchosob.R.inc(63834);List<DateTimeZone> shuffled = new ArrayList<DateTimeZone>(zones);
                        __CLR4_4_11d761d76lgchosob.R.inc(63835);Collections.shuffle(shuffled);
                        __CLR4_4_11d761d76lgchosob.R.inc(63836);String name = Thread.currentThread().getName();
                        __CLR4_4_11d761d76lgchosob.R.inc(63837);for (int j = 0; (((j < 100)&&(__CLR4_4_11d761d76lgchosob.R.iget(63838)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63839)==0&false)); j++) {{
                            __CLR4_4_11d761d76lgchosob.R.inc(63840);for (DateTimeZone zn : shuffled) {{
                                __CLR4_4_11d761d76lgchosob.R.inc(63841);ISOChronology chrono = ISOChronology.getInstance(zn);
                                __CLR4_4_11d761d76lgchosob.R.inc(63842);Assert.assertEquals(zn, chrono.getZone());
                            }
                        }}
                        }__CLR4_4_11d761d76lgchosob.R.inc(63843);System.out.println("Finished: " + name);

                    } catch (Exception ex) {
                        __CLR4_4_11d761d76lgchosob.R.inc(63844);ex.printStackTrace();
                        __CLR4_4_11d761d76lgchosob.R.inc(63845);System.exit(1);
                    }
                }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}
            };
            __CLR4_4_11d761d76lgchosob.R.inc(63846);new Thread(r).start();
            __CLR4_4_11d761d76lgchosob.R.inc(63847);runnables.add(r);
        }
        }__CLR4_4_11d761d76lgchosob.R.inc(63848);latch.countDown();
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    private static void singleThreadZones() {try{__CLR4_4_11d761d76lgchosob.R.inc(63849);
        __CLR4_4_11d761d76lgchosob.R.inc(63850);List<DateTimeZone> zones = createZones();
        __CLR4_4_11d761d76lgchosob.R.inc(63851);List<DateTimeZone> shuffled = new ArrayList<DateTimeZone>(zones);
        __CLR4_4_11d761d76lgchosob.R.inc(63852);Collections.shuffle(shuffled);
        __CLR4_4_11d761d76lgchosob.R.inc(63853);long start = System.nanoTime();
        __CLR4_4_11d761d76lgchosob.R.inc(63854);int count = 0;
        __CLR4_4_11d761d76lgchosob.R.inc(63855);for (int j = 0; (((j < 10000)&&(__CLR4_4_11d761d76lgchosob.R.iget(63856)!=0|true))||(__CLR4_4_11d761d76lgchosob.R.iget(63857)==0&false)); j++) {{
            __CLR4_4_11d761d76lgchosob.R.inc(63858);for (DateTimeZone zn : shuffled) {{
                __CLR4_4_11d761d76lgchosob.R.inc(63859);ISOChronology chrono = ISOChronology.getInstance(zn);
                __CLR4_4_11d761d76lgchosob.R.inc(63860);count = count + chrono.getZone().getID().length();
            }
        }}
        }__CLR4_4_11d761d76lgchosob.R.inc(63861);long end = System.nanoTime();
        __CLR4_4_11d761d76lgchosob.R.inc(63862);System.out.println("Finished " + count + " " + (end - start) / 1000000);
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

    private static List<DateTimeZone> createZones() {try{__CLR4_4_11d761d76lgchosob.R.inc(63863);
        __CLR4_4_11d761d76lgchosob.R.inc(63864);final List<DateTimeZone> zones = new ArrayList<DateTimeZone>();
        __CLR4_4_11d761d76lgchosob.R.inc(63865);for (final String zone : DateTimeZone.getAvailableIDs()) {{
            __CLR4_4_11d761d76lgchosob.R.inc(63866);zones.add(DateTimeZone.forID(zone));
        }
        }__CLR4_4_11d761d76lgchosob.R.inc(63867);return zones;
    }finally{__CLR4_4_11d761d76lgchosob.R.flushNeeded();}}

}
