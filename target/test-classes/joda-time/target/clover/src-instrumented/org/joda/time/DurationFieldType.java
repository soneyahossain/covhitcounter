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
package org.joda.time;

import java.io.Serializable;

/**
 * Identifies a duration field, such as years or minutes, in a chronology-neutral way.
 * <p>
 * A duration field type defines the type of the field, such as hours.
 * If does not directly enable any calculations, however it does provide a
 * {@link #getField(Chronology)} method that returns the actual calculation engine
 * for a particular chronology.
 * <p>
 * Instances of <code>DurationFieldType</code> are singletons.
 * They can be compared using <code>==</code>.
 * <p>
 * If required, you can create your own field, for example a quarters.
 * You must create a subclass of <code>DurationFieldType</code> that defines the field type.
 * This class returns the actual calculation engine from {@link #getField(Chronology)}.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class DurationFieldType implements Serializable {public static class __CLR4_4_11jf1jflgchoq8i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,2100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization version
     */
    private static final long serialVersionUID = 8765135187319L;

    // Ordinals for standard field types.
    static final byte
            ERAS = 1,
            CENTURIES = 2,
            WEEKYEARS = 3,
            YEARS = 4,
            MONTHS = 5,
            WEEKS = 6,
            DAYS = 7,
            HALFDAYS = 8,
            HOURS = 9,
            MINUTES = 10,
            SECONDS = 11,
            MILLIS = 12;

    /**
     * The eras field type.
     */
    static final DurationFieldType ERAS_TYPE = new StandardDurationFieldType("eras", ERAS);
    /**
     * The centuries field type.
     */
    static final DurationFieldType CENTURIES_TYPE = new StandardDurationFieldType("centuries", CENTURIES);
    /**
     * The weekyears field type.
     */
    static final DurationFieldType WEEKYEARS_TYPE = new StandardDurationFieldType("weekyears", WEEKYEARS);
    /**
     * The years field type.
     */
    static final DurationFieldType YEARS_TYPE = new StandardDurationFieldType("years", YEARS);
    /**
     * The months field type.
     */
    static final DurationFieldType MONTHS_TYPE = new StandardDurationFieldType("months", MONTHS);
    /**
     * The weeks field type.
     */
    static final DurationFieldType WEEKS_TYPE = new StandardDurationFieldType("weeks", WEEKS);
    /**
     * The days field type.
     */
    static final DurationFieldType DAYS_TYPE = new StandardDurationFieldType("days", DAYS);
    /**
     * The halfdays field type.
     */
    static final DurationFieldType HALFDAYS_TYPE = new StandardDurationFieldType("halfdays", HALFDAYS);
    /**
     * The hours field type.
     */
    static final DurationFieldType HOURS_TYPE = new StandardDurationFieldType("hours", HOURS);
    /**
     * The minutes field type.
     */
    static final DurationFieldType MINUTES_TYPE = new StandardDurationFieldType("minutes", MINUTES);
    /**
     * The seconds field type.
     */
    static final DurationFieldType SECONDS_TYPE = new StandardDurationFieldType("seconds", SECONDS);
    /**
     * The millis field type.
     */
    static final DurationFieldType MILLIS_TYPE = new StandardDurationFieldType("millis", MILLIS);

    /**
     * The name of the field type.
     */
    private final String iName;

    //-----------------------------------------------------------------------

    /**
     * Constructor.
     *
     * @param name the name to use, which by convention, are plural.
     */
    protected DurationFieldType(String name) {
        super();__CLR4_4_11jf1jflgchoq8i.R.inc(1996);try{__CLR4_4_11jf1jflgchoq8i.R.inc(1995);
        __CLR4_4_11jf1jflgchoq8i.R.inc(1997);iName = name;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the millis field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType millis() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(1998);
        __CLR4_4_11jf1jflgchoq8i.R.inc(1999);return MILLIS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the seconds field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType seconds() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2000);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2001);return SECONDS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the minutes field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType minutes() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2002);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2003);return MINUTES_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the hours field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType hours() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2004);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2005);return HOURS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the halfdays field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType halfdays() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2006);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2007);return HALFDAYS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the days field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType days() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2008);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2009);return DAYS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the weeks field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType weeks() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2010);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2011);return WEEKS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the weekyears field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType weekyears() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2012);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2013);return WEEKYEARS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the months field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType months() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2014);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2015);return MONTHS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the years field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType years() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2016);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2017);return YEARS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the centuries field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType centuries() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2018);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2019);return CENTURIES_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get the eras field type.
     *
     * @return the DurationFieldType constant
     */
    public static DurationFieldType eras() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2020);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2021);return ERAS_TYPE;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Get the name of the field.
     * By convention, names are plural.
     *
     * @return field name
     */
    public String getName() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2022);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2023);return iName;
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Gets a suitable field for this type from the given Chronology.
     *
     * @param chronology the chronology to use, null means ISOChronology in default zone
     * @return a suitable field
     */
    public abstract DurationField getField(Chronology chronology);

    /**
     * Checks whether this field supported in the given Chronology.
     *
     * @param chronology the chronology to use, null means ISOChronology in default zone
     * @return true if supported
     */
    public boolean isSupported(Chronology chronology) {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2024);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2025);return getField(chronology).isSupported();
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     *
     * @return debug string
     */
    public String toString() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2026);
        __CLR4_4_11jf1jflgchoq8i.R.inc(2027);return getName();
    }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

    private static class StandardDurationFieldType extends DurationFieldType {
        /**
         * Serialization version
         */
        private static final long serialVersionUID = 31156755687123L;

        /**
         * The ordinal of the standard field type, for switch statements
         */
        private final byte iOrdinal;

        /**
         * Constructor.
         *
         * @param name the name to use
         */
        StandardDurationFieldType(String name, byte ordinal) {
            super(name);__CLR4_4_11jf1jflgchoq8i.R.inc(2029);try{__CLR4_4_11jf1jflgchoq8i.R.inc(2028);
            __CLR4_4_11jf1jflgchoq8i.R.inc(2030);iOrdinal = ordinal;
        }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2031);
            __CLR4_4_11jf1jflgchoq8i.R.inc(2032);if ((((this == obj)&&(__CLR4_4_11jf1jflgchoq8i.R.iget(2033)!=0|true))||(__CLR4_4_11jf1jflgchoq8i.R.iget(2034)==0&false))) {{
                __CLR4_4_11jf1jflgchoq8i.R.inc(2035);return true;
            }
            }__CLR4_4_11jf1jflgchoq8i.R.inc(2036);if ((((obj instanceof StandardDurationFieldType)&&(__CLR4_4_11jf1jflgchoq8i.R.iget(2037)!=0|true))||(__CLR4_4_11jf1jflgchoq8i.R.iget(2038)==0&false))) {{
                __CLR4_4_11jf1jflgchoq8i.R.inc(2039);return iOrdinal == ((StandardDurationFieldType) obj).iOrdinal;
            }
            }__CLR4_4_11jf1jflgchoq8i.R.inc(2040);return false;
        }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

        /**
         * @inheritdoc
         */
        @Override
        public int hashCode() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2041);
            __CLR4_4_11jf1jflgchoq8i.R.inc(2042);return (1 << iOrdinal);
        }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

        public DurationField getField(Chronology chronology) {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2043);
            __CLR4_4_11jf1jflgchoq8i.R.inc(2044);chronology = DateTimeUtils.getChronology(chronology);

            boolean __CLB4_4_1_bool0=false;__CLR4_4_11jf1jflgchoq8i.R.inc(2045);switch (iOrdinal) {
                case ERAS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2046);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2047);return chronology.eras();
                case CENTURIES:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2048);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2049);return chronology.centuries();
                case WEEKYEARS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2050);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2051);return chronology.weekyears();
                case YEARS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2052);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2053);return chronology.years();
                case MONTHS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2054);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2055);return chronology.months();
                case WEEKS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2056);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2057);return chronology.weeks();
                case DAYS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2058);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2059);return chronology.days();
                case HALFDAYS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2060);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2061);return chronology.halfdays();
                case HOURS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2062);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2063);return chronology.hours();
                case MINUTES:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2064);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2065);return chronology.minutes();
                case SECONDS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2066);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2067);return chronology.seconds();
                case MILLIS:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2068);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2069);return chronology.millis();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_11jf1jflgchoq8i.R.inc(2070);__CLB4_4_1_bool0=true;}
                    // Shouldn't happen.
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2071);throw new InternalError();
            }
        }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}

        /**
         * Ensure a singleton is returned.
         *
         * @return the singleton type
         */
        private Object readResolve() {try{__CLR4_4_11jf1jflgchoq8i.R.inc(2072);
            boolean __CLB4_4_1_bool1=false;__CLR4_4_11jf1jflgchoq8i.R.inc(2073);switch (iOrdinal) {
                case ERAS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2074);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2075);return ERAS_TYPE;
                case CENTURIES:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2076);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2077);return CENTURIES_TYPE;
                case WEEKYEARS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2078);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2079);return WEEKYEARS_TYPE;
                case YEARS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2080);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2081);return YEARS_TYPE;
                case MONTHS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2082);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2083);return MONTHS_TYPE;
                case WEEKS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2084);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2085);return WEEKS_TYPE;
                case DAYS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2086);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2087);return DAYS_TYPE;
                case HALFDAYS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2088);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2089);return HALFDAYS_TYPE;
                case HOURS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2090);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2091);return HOURS_TYPE;
                case MINUTES:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2092);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2093);return MINUTES_TYPE;
                case SECONDS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2094);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2095);return SECONDS_TYPE;
                case MILLIS:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2096);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2097);return MILLIS_TYPE;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_11jf1jflgchoq8i.R.inc(2098);__CLB4_4_1_bool1=true;}
                    // Shouldn't happen.
                    __CLR4_4_11jf1jflgchoq8i.R.inc(2099);return this;
            }
        }finally{__CLR4_4_11jf1jflgchoq8i.R.flushNeeded();}}
    }
}
