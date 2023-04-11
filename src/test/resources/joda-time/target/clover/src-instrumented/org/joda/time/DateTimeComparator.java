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
package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;

import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/**
 * DateTimeComparator provides comparators to compare one date with another.
 * <p>
 * Dates may be specified using any object recognised by the
 * {@link org.joda.time.convert.ConverterManager ConverterManager} class.
 * <p>
 * The default objects recognised by the comparator are:
 * <ul>
 * <li>ReadableInstant
 * <li>String
 * <li>Calendar
 * <li>Date
 * <li>Long (milliseconds)
 * <li>null (now)
 * </ul>
 *
 * <p>
 * DateTimeComparator is thread-safe and immutable.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public class DateTimeComparator implements Comparator<Object>, Serializable {public static class __CLR4_4_1jyjylgchoq53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -6097339773320178364L;

    /**
     * Singleton instance
     */
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    /**
     * Singleton instance
     */
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    /**
     * Singleton instance
     */
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());

    /**
     * The lower limit of fields to compare, null if no limit
     */
    private final DateTimeFieldType iLowerLimit;
    /**
     * The upper limit of fields to compare, null if no limit
     */
    private final DateTimeFieldType iUpperLimit;

    //-----------------------------------------------------------------------

    /**
     * Returns a DateTimeComparator the compares the entire date time value.
     *
     * @return a comparator over all fields
     */
    public static DateTimeComparator getInstance() {try{__CLR4_4_1jyjylgchoq53.R.inc(718);
        __CLR4_4_1jyjylgchoq53.R.inc(719);return ALL_INSTANCE;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Returns a DateTimeComparator with a lower limit only. Fields of a
     * magnitude less than the lower limit are excluded from comparisons.
     * <p>
     * The time-zone is considered when using this comparator.
     * The input millis are truncated using the time-zone of that input value.
     * Thus, two inputs with different time-zones will typically not be equal
     *
     * @param lowerLimit inclusive lower limit for fields to be compared, null means no limit
     * @return a comparator over all fields above the lower limit
     */
    public static DateTimeComparator getInstance(DateTimeFieldType lowerLimit) {try{__CLR4_4_1jyjylgchoq53.R.inc(720);
        __CLR4_4_1jyjylgchoq53.R.inc(721);return getInstance(lowerLimit, null);
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Returns a DateTimeComparator with a lower and upper limit. Fields of a
     * magnitude less than the lower limit are excluded from comparisons.
     * Fields of a magnitude greater than or equal to the upper limit are also
     * excluded from comparisons. Either limit may be specified as null, which
     * indicates an unbounded limit.
     * <p>
     * The time-zone is considered when using this comparator unless both limits are null.
     * The input millis are rounded/truncated using the time-zone of that input value.
     * Thus, two inputs with different time-zones will typically not be equal
     *
     * @param lowerLimit inclusive lower limit for fields to be compared, null means no limit
     * @param upperLimit exclusive upper limit for fields to be compared, null means no limit
     * @return a comparator over all fields between the limits
     */
    public static DateTimeComparator getInstance(DateTimeFieldType lowerLimit, DateTimeFieldType upperLimit) {try{__CLR4_4_1jyjylgchoq53.R.inc(722);
        __CLR4_4_1jyjylgchoq53.R.inc(723);if ((((lowerLimit == null && upperLimit == null)&&(__CLR4_4_1jyjylgchoq53.R.iget(724)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(725)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(726);return ALL_INSTANCE;
        }
        }__CLR4_4_1jyjylgchoq53.R.inc(727);if ((((lowerLimit == DateTimeFieldType.dayOfYear() && upperLimit == null)&&(__CLR4_4_1jyjylgchoq53.R.iget(728)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(729)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(730);return DATE_INSTANCE;
        }
        }__CLR4_4_1jyjylgchoq53.R.inc(731);if ((((lowerLimit == null && upperLimit == DateTimeFieldType.dayOfYear())&&(__CLR4_4_1jyjylgchoq53.R.iget(732)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(733)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(734);return TIME_INSTANCE;
        }
        }__CLR4_4_1jyjylgchoq53.R.inc(735);return new DateTimeComparator(lowerLimit, upperLimit);
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Returns a comparator that only considers date fields.
     * Time of day is ignored.
     * <p>
     * The time-zone is considered when using this comparator.
     * The input millis are rounded down to the start of the day
     * in the time-zone of that input value. Thus, two inputs with
     * different time-zones will typically not be equal
     *
     * @return a comparator over all date fields
     */
    public static DateTimeComparator getDateOnlyInstance() {try{__CLR4_4_1jyjylgchoq53.R.inc(736);
        __CLR4_4_1jyjylgchoq53.R.inc(737);return DATE_INSTANCE;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Returns a comparator that only considers time fields.
     * Date is ignored.
     * <p>
     * The time-zone is considered when using this comparator.
     * The input millis are truncated to be within the day
     * in the time-zone of that input value. Thus, two inputs with
     * different time-zones will typically not be equal
     *
     * @return a comparator over all time fields
     */
    public static DateTimeComparator getTimeOnlyInstance() {try{__CLR4_4_1jyjylgchoq53.R.inc(738);
        __CLR4_4_1jyjylgchoq53.R.inc(739);return TIME_INSTANCE;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Restricted constructor.
     *
     * @param lowerLimit the lower field limit, null means no limit
     * @param upperLimit the upper field limit, null means no limit
     */
    protected DateTimeComparator(DateTimeFieldType lowerLimit, DateTimeFieldType upperLimit) {
        super();__CLR4_4_1jyjylgchoq53.R.inc(741);try{__CLR4_4_1jyjylgchoq53.R.inc(740);
        __CLR4_4_1jyjylgchoq53.R.inc(742);iLowerLimit = lowerLimit;
        __CLR4_4_1jyjylgchoq53.R.inc(743);iUpperLimit = upperLimit;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the field type that represents the lower limit of comparison.
     *
     * @return the field type, null if no upper limit
     */
    public DateTimeFieldType getLowerLimit() {try{__CLR4_4_1jyjylgchoq53.R.inc(744);
        __CLR4_4_1jyjylgchoq53.R.inc(745);return iLowerLimit;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Gets the field type that represents the upper limit of comparison.
     *
     * @return the field type, null if no upper limit
     */
    public DateTimeFieldType getUpperLimit() {try{__CLR4_4_1jyjylgchoq53.R.inc(746);
        __CLR4_4_1jyjylgchoq53.R.inc(747);return iUpperLimit;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Compare two objects against only the range of date time fields as
     * specified in the constructor.
     *
     * @param lhsObj the first object,
     *               logically on the left of a &lt; comparison, null means now
     * @param rhsObj the second object,
     *               logically on the right of a &lt; comparison, null means now
     * @return zero if order does not matter,
     * negative value if lhsObj &lt; rhsObj, positive value otherwise.
     * @throws IllegalArgumentException if either argument is not supported
     */
    public int compare(Object lhsObj, Object rhsObj) {try{__CLR4_4_1jyjylgchoq53.R.inc(748);
        __CLR4_4_1jyjylgchoq53.R.inc(749);InstantConverter conv = ConverterManager.getInstance().getInstantConverter(lhsObj);
        __CLR4_4_1jyjylgchoq53.R.inc(750);Chronology lhsChrono = conv.getChronology(lhsObj, (Chronology) null);
        __CLR4_4_1jyjylgchoq53.R.inc(751);long lhsMillis = conv.getInstantMillis(lhsObj, lhsChrono);

        // handle null==null and other cases where objects are the same
        // but only do this after checking the input is valid
        __CLR4_4_1jyjylgchoq53.R.inc(752);if ((((lhsObj == rhsObj)&&(__CLR4_4_1jyjylgchoq53.R.iget(753)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(754)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(755);return 0;
        }

        }__CLR4_4_1jyjylgchoq53.R.inc(756);conv = ConverterManager.getInstance().getInstantConverter(rhsObj);
        __CLR4_4_1jyjylgchoq53.R.inc(757);Chronology rhsChrono = conv.getChronology(rhsObj, (Chronology) null);
        __CLR4_4_1jyjylgchoq53.R.inc(758);long rhsMillis = conv.getInstantMillis(rhsObj, rhsChrono);

        __CLR4_4_1jyjylgchoq53.R.inc(759);if ((((iLowerLimit != null)&&(__CLR4_4_1jyjylgchoq53.R.iget(760)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(761)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(762);lhsMillis = iLowerLimit.getField(lhsChrono).roundFloor(lhsMillis);
            __CLR4_4_1jyjylgchoq53.R.inc(763);rhsMillis = iLowerLimit.getField(rhsChrono).roundFloor(rhsMillis);
        }

        }__CLR4_4_1jyjylgchoq53.R.inc(764);if ((((iUpperLimit != null)&&(__CLR4_4_1jyjylgchoq53.R.iget(765)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(766)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(767);lhsMillis = iUpperLimit.getField(lhsChrono).remainder(lhsMillis);
            __CLR4_4_1jyjylgchoq53.R.inc(768);rhsMillis = iUpperLimit.getField(rhsChrono).remainder(rhsMillis);
        }

        }__CLR4_4_1jyjylgchoq53.R.inc(769);if ((((lhsMillis < rhsMillis)&&(__CLR4_4_1jyjylgchoq53.R.iget(770)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(771)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(772);return -1;
        } }else {__CLR4_4_1jyjylgchoq53.R.inc(773);if ((((lhsMillis > rhsMillis)&&(__CLR4_4_1jyjylgchoq53.R.iget(774)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(775)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(776);return 1;
        } }else {{
            __CLR4_4_1jyjylgchoq53.R.inc(777);return 0;
        }
    }}}finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Support serialization singletons.
     *
     * @return the resolved singleton instance
     */
    private Object readResolve() {try{__CLR4_4_1jyjylgchoq53.R.inc(778);
        __CLR4_4_1jyjylgchoq53.R.inc(779);return getInstance(iLowerLimit, iUpperLimit);
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Compares this comparator to another.
     *
     * @param object the object to compare to
     * @return true if equal
     */
    public boolean equals(Object object) {try{__CLR4_4_1jyjylgchoq53.R.inc(780);
        __CLR4_4_1jyjylgchoq53.R.inc(781);if ((((object instanceof DateTimeComparator)&&(__CLR4_4_1jyjylgchoq53.R.iget(782)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(783)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(784);DateTimeComparator other = (DateTimeComparator) object;
            __CLR4_4_1jyjylgchoq53.R.inc(785);return (iLowerLimit == other.getLowerLimit() ||
                    (iLowerLimit != null && iLowerLimit.equals(other.getLowerLimit()))) &&
                    (iUpperLimit == other.getUpperLimit() ||
                            (iUpperLimit != null && iUpperLimit.equals(other.getUpperLimit())));
        }
        }__CLR4_4_1jyjylgchoq53.R.inc(786);return false;
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Gets a suitable hashcode.
     *
     * @return the hashcode
     */
    public int hashCode() {try{__CLR4_4_1jyjylgchoq53.R.inc(787);
        __CLR4_4_1jyjylgchoq53.R.inc(788);return ((((iLowerLimit == null )&&(__CLR4_4_1jyjylgchoq53.R.iget(789)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(790)==0&false))? 0 : iLowerLimit.hashCode()) +
                (123 * ((((iUpperLimit == null )&&(__CLR4_4_1jyjylgchoq53.R.iget(791)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(792)==0&false))? 0 : iUpperLimit.hashCode()));
    }finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

    /**
     * Gets a debugging string.
     *
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_1jyjylgchoq53.R.inc(793);
        __CLR4_4_1jyjylgchoq53.R.inc(794);if ((((iLowerLimit == iUpperLimit)&&(__CLR4_4_1jyjylgchoq53.R.iget(795)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(796)==0&false))) {{
            __CLR4_4_1jyjylgchoq53.R.inc(797);return "DateTimeComparator["
                    + ((((iLowerLimit == null )&&(__CLR4_4_1jyjylgchoq53.R.iget(798)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(799)==0&false))? "" : iLowerLimit.getName())
                    + "]";
        } }else {{
            __CLR4_4_1jyjylgchoq53.R.inc(800);return "DateTimeComparator["
                    + ((((iLowerLimit == null )&&(__CLR4_4_1jyjylgchoq53.R.iget(801)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(802)==0&false))? "" : iLowerLimit.getName())
                    + "-"
                    + ((((iUpperLimit == null )&&(__CLR4_4_1jyjylgchoq53.R.iget(803)!=0|true))||(__CLR4_4_1jyjylgchoq53.R.iget(804)==0&false))? "" : iUpperLimit.getName())
                    + "]";
        }
    }}finally{__CLR4_4_1jyjylgchoq53.R.flushNeeded();}}

}
