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

/**
 * A set of converters, which allows exact converters to be quickly
 * selected. This class is threadsafe because it is (essentially) immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
class ConverterSet {public static class __CLR4_4_19ym9ymlgchoqvk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,13108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Converter[] iConverters;

    // A simple immutable hashtable: closed hashing, linear probing, sized
    // power of 2, at least one null slot.
    private Entry[] iSelectEntries;

    ConverterSet(Converter[] converters) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(12910);
        // Since this is a package private constructor, we trust ourselves not
        // to alter the array outside this class.
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12911);iConverters = converters;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12912);iSelectEntries = new Entry[1 << 4]; // 16
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Returns the closest matching converter for the given type, or null if
     * none found.
     *
     * @param type type to select, which may be null
     * @throws IllegalStateException if multiple converters match the type
     *                               equally well
     */
    Converter select(Class<?> type) throws IllegalStateException {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(12913);
        // Check the hashtable first.
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12914);Entry[] entries = iSelectEntries;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12915);int length = entries.length;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12916);int index = (((type == null )&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12917)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12918)==0&false))? 0 : type.hashCode() & (length - 1);

        __CLR4_4_19ym9ymlgchoqvk.R.inc(12919);Entry e;
        // This loop depends on there being at least one null slot.
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12920);while ((e = entries[index]) != null) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12923);if ((((e.iType == type)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12924)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12925)==0&false))) {{
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12926);return e.iConverter;
            }
            }__CLR4_4_19ym9ymlgchoqvk.R.inc(12927);if ((((++index >= length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12928)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12929)==0&false))) {{
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12930);index = 0;
            }
        }}

        // Not found in the hashtable, so do actual work.

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(12931);Converter converter = selectSlow(this, type);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12932);e = new Entry(type, converter);

        // Save the entry for future selects. This class must be threadsafe,
        // but there is no synchronization. Since the hashtable is being used
        // as a cache, it is okay to destroy existing entries. This isn't
        // likely to occur unless there is a high amount of concurrency. As
        // time goes on, cache updates will occur less often, and the cache
        // will fill with all the necessary entries.

        // Do all updates on a copy: slots in iSelectEntries must not be
        // updated by multiple threads as this can allow all null slots to be
        // consumed.
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12933);entries = (Entry[]) entries.clone();

        // Add new entry.
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12934);entries[index] = e;

        // Verify that at least one null slot exists!
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12935);for (int i = 0; (((i < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12936)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12937)==0&false)); i++) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12938);if ((((entries[i] == null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12939)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12940)==0&false))) {{
                // Found a null slot, swap in new hashtable.
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12941);iSelectEntries = entries;
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12942);return converter;
            }
        }}

        // Double capacity and re-hash.

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(12943);int newLength = length << 1;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12944);Entry[] newEntries = new Entry[newLength];
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12945);for (int i = 0; (((i < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12946)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12947)==0&false)); i++) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12948);e = entries[i];
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12949);type = e.iType;
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12950);index = (((type == null )&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12951)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12952)==0&false))? 0 : type.hashCode() & (newLength - 1);
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12953);while ((((newEntries[index] != null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12954)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12955)==0&false))) {{
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12956);if ((((++index >= newLength)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12957)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12958)==0&false))) {{
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(12959);index = 0;
                }
            }}
            }__CLR4_4_19ym9ymlgchoqvk.R.inc(12960);newEntries[index] = e;
        }

        // Swap in new hashtable.
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(12961);iSelectEntries = newEntries;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12962);return converter;
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Returns the amount of converters in the set.
     */
    int size() {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(12963);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12964);return iConverters.length;
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Copies all the converters in the set to the given array.
     */
    void copyInto(Converter[] converters) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(12965);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12966);System.arraycopy(iConverters, 0, converters, 0, iConverters.length);
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Returns a copy of this set, with the given converter added. If a
     * matching converter is already in the set, the given converter replaces
     * it. If the converter is exactly the same as one already in the set, the
     * original set is returned.
     *
     * @param converter converter to add, must not be null
     * @param removed   if not null, element 0 is set to the removed converter
     * @throws NullPointerException if converter is null
     */
    ConverterSet add(Converter converter, Converter[] removed) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(12967);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12968);Converter[] converters = iConverters;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(12969);int length = converters.length;

        __CLR4_4_19ym9ymlgchoqvk.R.inc(12970);for (int i = 0; (((i < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12971)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12972)==0&false)); i++) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12973);Converter existing = converters[i];
            __CLR4_4_19ym9ymlgchoqvk.R.inc(12974);if ((((converter.equals(existing))&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12975)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12976)==0&false))) {{
                // Already in the set.
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12977);if ((((removed != null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12978)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12979)==0&false))) {{
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(12980);removed[0] = null;
                }
                }__CLR4_4_19ym9ymlgchoqvk.R.inc(12981);return this;
            }

            }__CLR4_4_19ym9ymlgchoqvk.R.inc(12982);if ((((converter.getSupportedType() == existing.getSupportedType())&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12983)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12984)==0&false))) {{
                // Replace the converter.
                __CLR4_4_19ym9ymlgchoqvk.R.inc(12985);Converter[] copy = new Converter[length];

                __CLR4_4_19ym9ymlgchoqvk.R.inc(12986);for (int j = 0; (((j < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12987)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12988)==0&false)); j++) {{
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(12989);if ((((j != i)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12990)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12991)==0&false))) {{
                        __CLR4_4_19ym9ymlgchoqvk.R.inc(12992);copy[j] = converters[j];
                    } }else {{
                        __CLR4_4_19ym9ymlgchoqvk.R.inc(12993);copy[j] = converter;
                    }
                }}

                }__CLR4_4_19ym9ymlgchoqvk.R.inc(12994);if ((((removed != null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(12995)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(12996)==0&false))) {{
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(12997);removed[0] = existing;
                }
                }__CLR4_4_19ym9ymlgchoqvk.R.inc(12998);return new ConverterSet(copy);
            }
        }}

        // Not found, so add it.
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(12999);Converter[] copy = new Converter[length + 1];
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13000);System.arraycopy(converters, 0, copy, 0, length);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13001);copy[length] = converter;

        __CLR4_4_19ym9ymlgchoqvk.R.inc(13002);if ((((removed != null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13003)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13004)==0&false))) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13005);removed[0] = null;
        }
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13006);return new ConverterSet(copy);
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Returns a copy of this set, with the given converter removed. If the
     * converter was not in the set, the original set is returned.
     *
     * @param converter converter to remove, must not be null
     * @param removed   if not null, element 0 is set to the removed converter
     * @throws NullPointerException if converter is null
     */
    ConverterSet remove(Converter converter, Converter[] removed) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(13007);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13008);Converter[] converters = iConverters;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13009);int length = converters.length;

        __CLR4_4_19ym9ymlgchoqvk.R.inc(13010);for (int i = 0; (((i < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13011)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13012)==0&false)); i++) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13013);if ((((converter.equals(converters[i]))&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13014)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13015)==0&false))) {{
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13016);return remove(i, removed);
            }
        }}

        // Not found.
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13017);if ((((removed != null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13018)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13019)==0&false))) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13020);removed[0] = null;
        }
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13021);return this;
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Returns a copy of this set, with the converter at the given index
     * removed.
     *
     * @param index   index of converter to remove
     * @param removed if not null, element 0 is set to the removed converter
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    ConverterSet remove(final int index, Converter[] removed) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(13022);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13023);Converter[] converters = iConverters;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13024);int length = converters.length;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13025);if ((((index >= length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13026)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13027)==0&false))) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13028);throw new IndexOutOfBoundsException();
        }

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13029);if ((((removed != null)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13030)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13031)==0&false))) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13032);removed[0] = converters[index];
        }

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13033);Converter[] copy = new Converter[length - 1];

        __CLR4_4_19ym9ymlgchoqvk.R.inc(13034);int j = 0;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13035);for (int i = 0; (((i < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13036)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13037)==0&false)); i++) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13038);if ((((i != index)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13039)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13040)==0&false))) {{
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13041);copy[j++] = converters[i];
            }
        }}

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13042);return new ConverterSet(copy);
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    /**
     * Returns the closest matching converter for the given type, but not very
     * efficiently.
     */
    private static Converter selectSlow(ConverterSet set, Class<?> type) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(13043);
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13044);Converter[] converters = set.iConverters;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13045);int length = converters.length;
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13046);Converter converter;

        __CLR4_4_19ym9ymlgchoqvk.R.inc(13047);for (int i = length; (((--i >= 0)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13048)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13049)==0&false)); ) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13050);converter = converters[i];
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13051);Class<?> supportedType = converter.getSupportedType();

            __CLR4_4_19ym9ymlgchoqvk.R.inc(13052);if ((((supportedType == type)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13053)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13054)==0&false))) {{
                // Exact match.
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13055);return converter;
            }

            }__CLR4_4_19ym9ymlgchoqvk.R.inc(13056);if ((((supportedType == null || (type != null && !supportedType.isAssignableFrom(type)))&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13057)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13058)==0&false))) {{
                // Eliminate the impossible.
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13059);set = set.remove(i, null);
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13060);converters = set.iConverters;
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13061);length = converters.length;
            }
        }}

        // Haven't found exact match, so check what remains in the set.

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13062);if ((((type == null || length == 0)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13063)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13064)==0&false))) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13065);return null;
        }
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13066);if ((((length == 1)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13067)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13068)==0&false))) {{
            // Found the one best match.
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13069);return converters[0];
        }

        // At this point, there exist multiple potential converters.

        // Eliminate supertypes.
        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13070);for (int i = length; (((--i >= 0)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13071)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13072)==0&false)); ) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13073);converter = converters[i];
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13074);Class<?> supportedType = converter.getSupportedType();
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13075);for (int j = length; (((--j >= 0)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13076)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13077)==0&false)); ) {{
                __CLR4_4_19ym9ymlgchoqvk.R.inc(13078);if ((((j != i && converters[j].getSupportedType().isAssignableFrom(supportedType))&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13079)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13080)==0&false))) {{
                    // Eliminate supertype.
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(13081);set = set.remove(j, null);
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(13082);converters = set.iConverters;
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(13083);length = converters.length;
                    __CLR4_4_19ym9ymlgchoqvk.R.inc(13084);i = length - 1;
                }
            }}
        }}

        // Check what remains in the set.

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13085);if ((((length == 1)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13086)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13087)==0&false))) {{
            // Found the one best match.
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13088);return converters[0];
        }

        // Class c implements a, b {}
        // Converters exist only for a and b. Which is better? Neither.

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13089);StringBuilder msg = new StringBuilder();
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13090);msg.append("Unable to find best converter for type \"");
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13091);msg.append(type.getName());
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13092);msg.append("\" from remaining set: ");
        __CLR4_4_19ym9ymlgchoqvk.R.inc(13093);for (int i = 0; (((i < length)&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13094)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13095)==0&false)); i++) {{
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13096);converter = converters[i];
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13097);Class<?> supportedType = converter.getSupportedType();

            __CLR4_4_19ym9ymlgchoqvk.R.inc(13098);msg.append(converter.getClass().getName());
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13099);msg.append('[');
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13100);msg.append((((supportedType == null )&&(__CLR4_4_19ym9ymlgchoqvk.R.iget(13101)!=0|true))||(__CLR4_4_19ym9ymlgchoqvk.R.iget(13102)==0&false))? null : supportedType.getName());
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13103);msg.append("], ");
        }

        }__CLR4_4_19ym9ymlgchoqvk.R.inc(13104);throw new IllegalStateException(msg.toString());
    }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}

    static class Entry {
        final Class<?> iType;
        final Converter iConverter;

        Entry(Class<?> type, Converter converter) {try{__CLR4_4_19ym9ymlgchoqvk.R.inc(13105);
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13106);iType = type;
            __CLR4_4_19ym9ymlgchoqvk.R.inc(13107);iConverter = converter;
        }finally{__CLR4_4_19ym9ymlgchoqvk.R.flushNeeded();}}
    }

}
