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
import org.joda.time.field.StrictDateTimeField;

/**
 * Wraps another Chronology, ensuring all the fields are strict.
 * <p>
 * StrictChronology is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @see StrictDateTimeField
 * @see LenientChronology
 * @since 1.0
 */
public final class StrictChronology extends AssembledChronology {public static class __CLR4_4_19ed9edlgchoqu7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,12254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = 6633006628097111960L;

    /**
     * Create a StrictChronology for any chronology.
     *
     * @param base the chronology to wrap
     * @throws IllegalArgumentException if chronology is null
     */
    public static StrictChronology getInstance(Chronology base) {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12181);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12182);if ((((base == null)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12183)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12184)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12185);throw new IllegalArgumentException("Must supply a chronology");
        }
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12186);return new StrictChronology(base);
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    private transient Chronology iWithUTC;

    /**
     * Create a StrictChronology for any chronology.
     *
     * @param base the chronology to wrap
     */
    private StrictChronology(Chronology base) {
        super(base, null);__CLR4_4_19ed9edlgchoqu7.R.inc(12188);try{__CLR4_4_19ed9edlgchoqu7.R.inc(12187);
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    public Chronology withUTC() {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12189);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12190);if ((((iWithUTC == null)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12191)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12192)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12193);if ((((getZone() == DateTimeZone.UTC)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12194)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12195)==0&false))) {{
                __CLR4_4_19ed9edlgchoqu7.R.inc(12196);iWithUTC = this;
            } }else {{
                __CLR4_4_19ed9edlgchoqu7.R.inc(12197);iWithUTC = StrictChronology.getInstance(getBase().withUTC());
            }
        }}
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12198);return iWithUTC;
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12199);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12200);if ((((zone == null)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12201)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12202)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12203);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12204);if ((((zone == DateTimeZone.UTC)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12205)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12206)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12207);return withUTC();
        }
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12208);if ((((zone == getZone())&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12209)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12210)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12211);return this;
        }
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12212);return StrictChronology.getInstance(getBase().withZone(zone));
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12213);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12214);fields.year = convertField(fields.year);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12215);fields.yearOfEra = convertField(fields.yearOfEra);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12216);fields.yearOfCentury = convertField(fields.yearOfCentury);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12217);fields.centuryOfEra = convertField(fields.centuryOfEra);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12218);fields.era = convertField(fields.era);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12219);fields.dayOfWeek = convertField(fields.dayOfWeek);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12220);fields.dayOfMonth = convertField(fields.dayOfMonth);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12221);fields.dayOfYear = convertField(fields.dayOfYear);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12222);fields.monthOfYear = convertField(fields.monthOfYear);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12223);fields.weekOfWeekyear = convertField(fields.weekOfWeekyear);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12224);fields.weekyear = convertField(fields.weekyear);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12225);fields.weekyearOfCentury = convertField(fields.weekyearOfCentury);

        __CLR4_4_19ed9edlgchoqu7.R.inc(12226);fields.millisOfSecond = convertField(fields.millisOfSecond);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12227);fields.millisOfDay = convertField(fields.millisOfDay);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12228);fields.secondOfMinute = convertField(fields.secondOfMinute);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12229);fields.secondOfDay = convertField(fields.secondOfDay);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12230);fields.minuteOfHour = convertField(fields.minuteOfHour);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12231);fields.minuteOfDay = convertField(fields.minuteOfDay);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12232);fields.hourOfDay = convertField(fields.hourOfDay);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12233);fields.hourOfHalfday = convertField(fields.hourOfHalfday);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12234);fields.clockhourOfDay = convertField(fields.clockhourOfDay);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12235);fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12236);fields.halfdayOfDay = convertField(fields.halfdayOfDay);
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    private static final DateTimeField convertField(DateTimeField field) {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12237);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12238);return StrictDateTimeField.getInstance(field);
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * A strict chronology is only equal to a strict chronology with the
     * same base chronology.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.4
     */
    public boolean equals(Object obj) {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12239);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12240);if ((((this == obj)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12241)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12242)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12243);return true;
        }
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12244);if ((((obj instanceof StrictChronology == false)&&(__CLR4_4_19ed9edlgchoqu7.R.iget(12245)!=0|true))||(__CLR4_4_19ed9edlgchoqu7.R.iget(12246)==0&false))) {{
            __CLR4_4_19ed9edlgchoqu7.R.inc(12247);return false;
        }
        }__CLR4_4_19ed9edlgchoqu7.R.inc(12248);StrictChronology chrono = (StrictChronology) obj;
        __CLR4_4_19ed9edlgchoqu7.R.inc(12249);return getBase().equals(chrono.getBase());
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    /**
     * A suitable hashcode for the chronology.
     *
     * @return the hashcode
     * @since 1.4
     */
    public int hashCode() {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12250);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12251);return 352831696 + getBase().hashCode() * 7;
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

    /**
     * A debugging string for the chronology.
     *
     * @return the debugging string
     */
    public String toString() {try{__CLR4_4_19ed9edlgchoqu7.R.inc(12252);
        __CLR4_4_19ed9edlgchoqu7.R.inc(12253);return "StrictChronology[" + getBase().toString() + ']';
    }finally{__CLR4_4_19ed9edlgchoqu7.R.flushNeeded();}}

}
