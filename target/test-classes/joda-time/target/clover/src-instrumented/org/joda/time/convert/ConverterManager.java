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
package org.joda.time.convert;

import org.joda.time.JodaTimePermission;

/**
 * ConverterManager controls the date and time converters.
 * <p>
 * This class enables additional conversion classes to be added via
 * {@link #addInstantConverter(InstantConverter)}, which may replace an
 * existing converter. Similar methods exist for duration, time period and
 * interval converters.
 * <p>
 * This class is threadsafe, so adding/removing converters can be done at any
 * time. Updating the set of converters is relatively expensive, and so should
 * not be performed often.
 * <p>
 * The default instant converters are:
 * <ul>
 * <li>ReadableInstant
 * <li>String
 * <li>Calendar
 * <li>Date (includes sql package subclasses)
 * <li>Long (milliseconds)
 * <li>null (now)
 * </ul>
 * <p>
 * The default partial converters are:
 * <ul>
 * <li>ReadablePartial
 * <li>ReadableInstant
 * <li>String
 * <li>Calendar
 * <li>Date (includes sql package subclasses)
 * <li>Long (milliseconds)
 * <li>null (now)
 * </ul>
 * <p>
 * The default duration converters are:
 * <ul>
 * <li>ReadableDuration
 * <li>ReadableInterval
 * <li>String
 * <li>Long (milliseconds)
 * <li>null (zero ms)
 * </ul>
 * <p>
 * The default time period converters are:
 * <ul>
 * <li>ReadablePeriod
 * <li>ReadableInterval
 * <li>String
 * <li>null (zero)
 * </ul>
 * <p>
 * The default interval converters are:
 * <ul>
 * <li>ReadableInterval
 * <li>String
 * <li>null (zero-length from now to now)
 * </ul>
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class ConverterManager {public static class __CLR4_4_19sn9snlgchoqvc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,12910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance, lazily loaded to avoid class loading.
     */
    private static ConverterManager INSTANCE;

    public static ConverterManager getInstance() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12695);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12696);if ((((INSTANCE == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12697)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12698)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12699);INSTANCE = new ConverterManager();
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12700);return INSTANCE;
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    private ConverterSet iInstantConverters;
    private ConverterSet iPartialConverters;
    private ConverterSet iDurationConverters;
    private ConverterSet iPeriodConverters;
    private ConverterSet iIntervalConverters;

    /**
     * Restricted constructor.
     */
    protected ConverterManager() {
        super();__CLR4_4_19sn9snlgchoqvc.R.inc(12702);try{__CLR4_4_19sn9snlgchoqvc.R.inc(12701);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12703);iInstantConverters = new ConverterSet(new Converter[]{
                ReadableInstantConverter.INSTANCE,
                StringConverter.INSTANCE,
                CalendarConverter.INSTANCE,
                DateConverter.INSTANCE,
                LongConverter.INSTANCE,
                NullConverter.INSTANCE,
        });

        __CLR4_4_19sn9snlgchoqvc.R.inc(12704);iPartialConverters = new ConverterSet(new Converter[]{
                ReadablePartialConverter.INSTANCE,
                ReadableInstantConverter.INSTANCE,
                StringConverter.INSTANCE,
                CalendarConverter.INSTANCE,
                DateConverter.INSTANCE,
                LongConverter.INSTANCE,
                NullConverter.INSTANCE,
        });

        __CLR4_4_19sn9snlgchoqvc.R.inc(12705);iDurationConverters = new ConverterSet(new Converter[]{
                ReadableDurationConverter.INSTANCE,
                ReadableIntervalConverter.INSTANCE,
                StringConverter.INSTANCE,
                LongConverter.INSTANCE,
                NullConverter.INSTANCE,
        });

        __CLR4_4_19sn9snlgchoqvc.R.inc(12706);iPeriodConverters = new ConverterSet(new Converter[]{
                ReadableDurationConverter.INSTANCE,
                ReadablePeriodConverter.INSTANCE,
                ReadableIntervalConverter.INSTANCE,
                StringConverter.INSTANCE,
                NullConverter.INSTANCE,
        });

        __CLR4_4_19sn9snlgchoqvc.R.inc(12707);iIntervalConverters = new ConverterSet(new Converter[]{
                ReadableIntervalConverter.INSTANCE,
                StringConverter.INSTANCE,
                NullConverter.INSTANCE,
        });
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the best converter for the object specified.
     *
     * @param object the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException    if multiple converters match the type
     *                                  equally well
     */
    public InstantConverter getInstantConverter(Object object) {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12708);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12709);InstantConverter converter =
                (InstantConverter) iInstantConverters.select((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12710)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12711)==0&false))? null : object.getClass());
        __CLR4_4_19sn9snlgchoqvc.R.inc(12712);if ((((converter != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12713)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12714)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12715);return converter;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12716);throw new IllegalArgumentException("No instant converter found for type: " +
                ((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12717)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12718)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of the set of converters.
     *
     * @return the converters, a copy of the real data, never null
     */
    public InstantConverter[] getInstantConverters() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12719);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12720);ConverterSet set = iInstantConverters;
        __CLR4_4_19sn9snlgchoqvc.R.inc(12721);InstantConverter[] converters = new InstantConverter[set.size()];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12722);set.copyInto(converters);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12723);return converters;
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevant. The best
     * converter is selected by examining the object hierarchy.
     *
     * @param converter the converter to add, null ignored
     * @return replaced converter, or null
     */
    public InstantConverter addInstantConverter(InstantConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12724);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12725);checkAlterInstantConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12726);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12727)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12728)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12729);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12730);InstantConverter[] removed = new InstantConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12731);iInstantConverters = iInstantConverters.add(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12732);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     *
     * @param converter the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public InstantConverter removeInstantConverter(InstantConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12733);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12734);checkAlterInstantConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12735);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12736)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12737)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12738);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12739);InstantConverter[] removed = new InstantConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12740);iInstantConverters = iInstantConverters.remove(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12741);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Checks whether the user has permission 'ConverterManager.alterInstantConverters'.
     *
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterInstantConverters() throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12742);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12743);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12744);if ((((sm != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12745)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12746)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12747);sm.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }}finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the best converter for the object specified.
     *
     * @param object the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException    if multiple converters match the type
     *                                  equally well
     */
    public PartialConverter getPartialConverter(Object object) {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12748);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12749);PartialConverter converter =
                (PartialConverter) iPartialConverters.select((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12750)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12751)==0&false))? null : object.getClass());
        __CLR4_4_19sn9snlgchoqvc.R.inc(12752);if ((((converter != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12753)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12754)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12755);return converter;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12756);throw new IllegalArgumentException("No partial converter found for type: " +
                ((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12757)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12758)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of the set of converters.
     *
     * @return the converters, a copy of the real data, never null
     */
    public PartialConverter[] getPartialConverters() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12759);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12760);ConverterSet set = iPartialConverters;
        __CLR4_4_19sn9snlgchoqvc.R.inc(12761);PartialConverter[] converters = new PartialConverter[set.size()];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12762);set.copyInto(converters);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12763);return converters;
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevant. The best
     * converter is selected by examining the object hierarchy.
     *
     * @param converter the converter to add, null ignored
     * @return replaced converter, or null
     */
    public PartialConverter addPartialConverter(PartialConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12764);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12765);checkAlterPartialConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12766);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12767)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12768)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12769);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12770);PartialConverter[] removed = new PartialConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12771);iPartialConverters = iPartialConverters.add(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12772);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     *
     * @param converter the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public PartialConverter removePartialConverter(PartialConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12773);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12774);checkAlterPartialConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12775);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12776)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12777)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12778);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12779);PartialConverter[] removed = new PartialConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12780);iPartialConverters = iPartialConverters.remove(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12781);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Checks whether the user has permission 'ConverterManager.alterPartialConverters'.
     *
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterPartialConverters() throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12782);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12783);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12784);if ((((sm != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12785)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12786)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12787);sm.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }}finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the best converter for the object specified.
     *
     * @param object the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException    if multiple converters match the type
     *                                  equally well
     */
    public DurationConverter getDurationConverter(Object object) {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12788);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12789);DurationConverter converter =
                (DurationConverter) iDurationConverters.select((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12790)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12791)==0&false))? null : object.getClass());
        __CLR4_4_19sn9snlgchoqvc.R.inc(12792);if ((((converter != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12793)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12794)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12795);return converter;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12796);throw new IllegalArgumentException("No duration converter found for type: " +
                ((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12797)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12798)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of the list of converters.
     *
     * @return the converters, a copy of the real data, never null
     */
    public DurationConverter[] getDurationConverters() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12799);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12800);ConverterSet set = iDurationConverters;
        __CLR4_4_19sn9snlgchoqvc.R.inc(12801);DurationConverter[] converters = new DurationConverter[set.size()];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12802);set.copyInto(converters);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12803);return converters;
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevant. The best
     * converter is selected by examining the object hierarchy.
     *
     * @param converter the converter to add, null ignored
     * @return replaced converter, or null
     */
    public DurationConverter addDurationConverter(DurationConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12804);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12805);checkAlterDurationConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12806);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12807)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12808)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12809);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12810);DurationConverter[] removed = new DurationConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12811);iDurationConverters = iDurationConverters.add(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12812);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     *
     * @param converter the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public DurationConverter removeDurationConverter(DurationConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12813);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12814);checkAlterDurationConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12815);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12816)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12817)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12818);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12819);DurationConverter[] removed = new DurationConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12820);iDurationConverters = iDurationConverters.remove(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12821);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Checks whether the user has permission 'ConverterManager.alterDurationConverters'.
     *
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterDurationConverters() throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12822);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12823);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12824);if ((((sm != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12825)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12826)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12827);sm.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }}finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the best converter for the object specified.
     *
     * @param object the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException    if multiple converters match the type
     *                                  equally well
     */
    public PeriodConverter getPeriodConverter(Object object) {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12828);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12829);PeriodConverter converter =
                (PeriodConverter) iPeriodConverters.select((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12830)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12831)==0&false))? null : object.getClass());
        __CLR4_4_19sn9snlgchoqvc.R.inc(12832);if ((((converter != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12833)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12834)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12835);return converter;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12836);throw new IllegalArgumentException("No period converter found for type: " +
                ((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12837)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12838)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of the list of converters.
     *
     * @return the converters, a copy of the real data, never null
     */
    public PeriodConverter[] getPeriodConverters() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12839);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12840);ConverterSet set = iPeriodConverters;
        __CLR4_4_19sn9snlgchoqvc.R.inc(12841);PeriodConverter[] converters = new PeriodConverter[set.size()];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12842);set.copyInto(converters);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12843);return converters;
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevant. The best
     * converter is selected by examining the object hierarchy.
     *
     * @param converter the converter to add, null ignored
     * @return replaced converter, or null
     */
    public PeriodConverter addPeriodConverter(PeriodConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12844);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12845);checkAlterPeriodConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12846);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12847)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12848)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12849);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12850);PeriodConverter[] removed = new PeriodConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12851);iPeriodConverters = iPeriodConverters.add(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12852);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     *
     * @param converter the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public PeriodConverter removePeriodConverter(PeriodConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12853);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12854);checkAlterPeriodConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12855);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12856)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12857)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12858);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12859);PeriodConverter[] removed = new PeriodConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12860);iPeriodConverters = iPeriodConverters.remove(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12861);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Checks whether the user has permission 'ConverterManager.alterPeriodConverters'.
     *
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterPeriodConverters() throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12862);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12863);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12864);if ((((sm != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12865)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12866)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12867);sm.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }}finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the best converter for the object specified.
     *
     * @param object the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException    if multiple converters match the type
     *                                  equally well
     */
    public IntervalConverter getIntervalConverter(Object object) {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12868);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12869);IntervalConverter converter =
                (IntervalConverter) iIntervalConverters.select((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12870)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12871)==0&false))? null : object.getClass());
        __CLR4_4_19sn9snlgchoqvc.R.inc(12872);if ((((converter != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12873)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12874)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12875);return converter;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12876);throw new IllegalArgumentException("No interval converter found for type: " +
                ((((object == null )&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12877)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12878)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a copy of the list of converters.
     *
     * @return the converters, a copy of the real data, never null
     */
    public IntervalConverter[] getIntervalConverters() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12879);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12880);ConverterSet set = iIntervalConverters;
        __CLR4_4_19sn9snlgchoqvc.R.inc(12881);IntervalConverter[] converters = new IntervalConverter[set.size()];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12882);set.copyInto(converters);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12883);return converters;
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevant. The best
     * converter is selected by examining the object hierarchy.
     *
     * @param converter the converter to add, null ignored
     * @return replaced converter, or null
     */
    public IntervalConverter addIntervalConverter(IntervalConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12884);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12885);checkAlterIntervalConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12886);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12887)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12888)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12889);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12890);IntervalConverter[] removed = new IntervalConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12891);iIntervalConverters = iIntervalConverters.add(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12892);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     *
     * @param converter the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public IntervalConverter removeIntervalConverter(IntervalConverter converter)
            throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12893);

        __CLR4_4_19sn9snlgchoqvc.R.inc(12894);checkAlterIntervalConverters();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12895);if ((((converter == null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12896)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12897)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12898);return null;
        }
        }__CLR4_4_19sn9snlgchoqvc.R.inc(12899);IntervalConverter[] removed = new IntervalConverter[1];
        __CLR4_4_19sn9snlgchoqvc.R.inc(12900);iIntervalConverters = iIntervalConverters.remove(converter, removed);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12901);return removed[0];
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    /**
     * Checks whether the user has permission 'ConverterManager.alterIntervalConverters'.
     *
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterIntervalConverters() throws SecurityException {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12902);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12903);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19sn9snlgchoqvc.R.inc(12904);if ((((sm != null)&&(__CLR4_4_19sn9snlgchoqvc.R.iget(12905)!=0|true))||(__CLR4_4_19sn9snlgchoqvc.R.iget(12906)==0&false))) {{
            __CLR4_4_19sn9snlgchoqvc.R.inc(12907);sm.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }}finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets a debug representation of the object.
     */
    public String toString() {try{__CLR4_4_19sn9snlgchoqvc.R.inc(12908);
        __CLR4_4_19sn9snlgchoqvc.R.inc(12909);return "ConverterManager[" +
                iInstantConverters.size() + " instant," +
                iPartialConverters.size() + " partial," +
                iDurationConverters.size() + " duration," +
                iPeriodConverters.size() + " period," +
                iIntervalConverters.size() + " interval]";
    }finally{__CLR4_4_19sn9snlgchoqvc.R.flushNeeded();}}

}
