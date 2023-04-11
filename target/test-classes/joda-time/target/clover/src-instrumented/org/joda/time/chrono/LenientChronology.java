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
package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.LenientDateTimeField;

/**
 * Wraps another Chronology, ensuring all the fields are lenient.
 * <p>
 * LenientChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see LenientDateTimeField
 * @see StrictChronology
 * @since 1.0
 */
public final class LenientChronology extends AssembledChronology {public static class __CLR4_4_1937937lgchoqtl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11852,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -3148237568046877177L;

    /**
     * Create a LenientChronology for any chronology.
     *
     * @param base the chronology to wrap
     * @throws IllegalArgumentException if chronology is null
     */
    public static LenientChronology getInstance(Chronology base) {try{__CLR4_4_1937937lgchoqtl.R.inc(11779);
        __CLR4_4_1937937lgchoqtl.R.inc(11780);if ((((base == null)&&(__CLR4_4_1937937lgchoqtl.R.iget(11781)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11782)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11783);throw new IllegalArgumentException("Must supply a chronology");
        }
        }__CLR4_4_1937937lgchoqtl.R.inc(11784);return new LenientChronology(base);
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    private transient Chronology iWithUTC;

    /**
     * Create a LenientChronology for any chronology.
     *
     * @param base the chronology to wrap
     */
    private LenientChronology(Chronology base) {
        super(base, null);__CLR4_4_1937937lgchoqtl.R.inc(11786);try{__CLR4_4_1937937lgchoqtl.R.inc(11785);
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    public Chronology withUTC() {try{__CLR4_4_1937937lgchoqtl.R.inc(11787);
        __CLR4_4_1937937lgchoqtl.R.inc(11788);if ((((iWithUTC == null)&&(__CLR4_4_1937937lgchoqtl.R.iget(11789)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11790)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11791);if ((((getZone() == DateTimeZone.UTC)&&(__CLR4_4_1937937lgchoqtl.R.iget(11792)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11793)==0&false))) {{
                __CLR4_4_1937937lgchoqtl.R.inc(11794);iWithUTC = this;
            } }else {{
                __CLR4_4_1937937lgchoqtl.R.inc(11795);iWithUTC = LenientChronology.getInstance(getBase().withUTC());
            }
        }}
        }__CLR4_4_1937937lgchoqtl.R.inc(11796);return iWithUTC;
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_1937937lgchoqtl.R.inc(11797);
        __CLR4_4_1937937lgchoqtl.R.inc(11798);if ((((zone == null)&&(__CLR4_4_1937937lgchoqtl.R.iget(11799)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11800)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11801);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_1937937lgchoqtl.R.inc(11802);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_1937937lgchoqtl.R.iget(11803)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11804)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11805);return withUTC();
        }
        }__CLR4_4_1937937lgchoqtl.R.inc(11806);if ((((zone == getZone())&&(__CLR4_4_1937937lgchoqtl.R.iget(11807)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11808)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11809);return this;
        }
        }__CLR4_4_1937937lgchoqtl.R.inc(11810);return LenientChronology.getInstance(getBase().withZone(zone));
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_1937937lgchoqtl.R.inc(11811);
        __CLR4_4_1937937lgchoqtl.R.inc(11812);fields.year = convertField(fields.year);
        __CLR4_4_1937937lgchoqtl.R.inc(11813);fields.yearOfEra = convertField(fields.yearOfEra);
        __CLR4_4_1937937lgchoqtl.R.inc(11814);fields.yearOfCentury = convertField(fields.yearOfCentury);
        __CLR4_4_1937937lgchoqtl.R.inc(11815);fields.centuryOfEra = convertField(fields.centuryOfEra);
        __CLR4_4_1937937lgchoqtl.R.inc(11816);fields.era = convertField(fields.era);
        __CLR4_4_1937937lgchoqtl.R.inc(11817);fields.dayOfWeek = convertField(fields.dayOfWeek);
        __CLR4_4_1937937lgchoqtl.R.inc(11818);fields.dayOfMonth = convertField(fields.dayOfMonth);
        __CLR4_4_1937937lgchoqtl.R.inc(11819);fields.dayOfYear = convertField(fields.dayOfYear);
        __CLR4_4_1937937lgchoqtl.R.inc(11820);fields.monthOfYear = convertField(fields.monthOfYear);
        __CLR4_4_1937937lgchoqtl.R.inc(11821);fields.weekOfWeekyear = convertField(fields.weekOfWeekyear);
        __CLR4_4_1937937lgchoqtl.R.inc(11822);fields.weekyear = convertField(fields.weekyear);
        __CLR4_4_1937937lgchoqtl.R.inc(11823);fields.weekyearOfCentury = convertField(fields.weekyearOfCentury);

        __CLR4_4_1937937lgchoqtl.R.inc(11824);fields.millisOfSecond = convertField(fields.millisOfSecond);
        __CLR4_4_1937937lgchoqtl.R.inc(11825);fields.millisOfDay = convertField(fields.millisOfDay);
        __CLR4_4_1937937lgchoqtl.R.inc(11826);fields.secondOfMinute = convertField(fields.secondOfMinute);
        __CLR4_4_1937937lgchoqtl.R.inc(11827);fields.secondOfDay = convertField(fields.secondOfDay);
        __CLR4_4_1937937lgchoqtl.R.inc(11828);fields.minuteOfHour = convertField(fields.minuteOfHour);
        __CLR4_4_1937937lgchoqtl.R.inc(11829);fields.minuteOfDay = convertField(fields.minuteOfDay);
        __CLR4_4_1937937lgchoqtl.R.inc(11830);fields.hourOfDay = convertField(fields.hourOfDay);
        __CLR4_4_1937937lgchoqtl.R.inc(11831);fields.hourOfHalfday = convertField(fields.hourOfHalfday);
        __CLR4_4_1937937lgchoqtl.R.inc(11832);fields.clockhourOfDay = convertField(fields.clockhourOfDay);
        __CLR4_4_1937937lgchoqtl.R.inc(11833);fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday);
        __CLR4_4_1937937lgchoqtl.R.inc(11834);fields.halfdayOfDay = convertField(fields.halfdayOfDay);
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    private final DateTimeField convertField(DateTimeField field) {try{__CLR4_4_1937937lgchoqtl.R.inc(11835);
        __CLR4_4_1937937lgchoqtl.R.inc(11836);return LenientDateTimeField.getInstance(field, getBase());
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * A lenient chronology is only equal to a lenient chronology with the
     * same base chronology.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.4
     */
    public boolean equals(Object obj) {try{__CLR4_4_1937937lgchoqtl.R.inc(11837);
        __CLR4_4_1937937lgchoqtl.R.inc(11838);if ((((this == obj)&&(__CLR4_4_1937937lgchoqtl.R.iget(11839)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11840)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11841);return true;
        }
        }__CLR4_4_1937937lgchoqtl.R.inc(11842);if ((((obj instanceof LenientChronology == false)&&(__CLR4_4_1937937lgchoqtl.R.iget(11843)!=0|true))||(__CLR4_4_1937937lgchoqtl.R.iget(11844)==0&false))) {{
            __CLR4_4_1937937lgchoqtl.R.inc(11845);return false;
        }
        }__CLR4_4_1937937lgchoqtl.R.inc(11846);LenientChronology chrono = (LenientChronology) obj;
        __CLR4_4_1937937lgchoqtl.R.inc(11847);return getBase().equals(chrono.getBase());
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    /**
     * A suitable hashcode for the chronology.
     *
     * @return the hashcode
     * @since 1.4
     */
    public int hashCode() {try{__CLR4_4_1937937lgchoqtl.R.inc(11848);
        __CLR4_4_1937937lgchoqtl.R.inc(11849);return 236548278 + getBase().hashCode() * 7;
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

    /**
     * A debugging string for the chronology.
     *
     * @return the debugging string
     */
    public String toString() {try{__CLR4_4_1937937lgchoqtl.R.inc(11850);
        __CLR4_4_1937937lgchoqtl.R.inc(11851);return "LenientChronology[" + getBase().toString() + ']';
    }finally{__CLR4_4_1937937lgchoqtl.R.flushNeeded();}}

}
