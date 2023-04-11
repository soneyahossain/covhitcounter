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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;

/**
 * Implements a chronology that follows the rules of the ISO8601 standard,
 * which is compatible with Gregorian for all modern dates.
 * When ISO does not define a field, but it can be determined (such as AM/PM)
 * it is included.
 * <p>
 * With the exception of century related fields, ISOChronology is exactly the
 * same as {@link GregorianChronology}. In this chronology, centuries and year
 * of century are zero based. For all years, the century is determined by
 * dropping the last two digits of the year, ignoring sign. The year of century
 * is the value of the last two year digits.
 * <p>
 * ISOChronology is thread-safe and immutable.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class ISOChronology extends AssembledChronology {public static class __CLR4_4_18qf8qflgchoqsm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,11395,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock
     */
    private static final long serialVersionUID = -6212696554273812441L;

    /**
     * Singleton instance of a UTC ISOChronology
     */
    private static final ISOChronology INSTANCE_UTC;

    /**
     * Cache of zone to chronology
     */
    private static final ConcurrentHashMap<DateTimeZone, ISOChronology> cCache = new ConcurrentHashMap<DateTimeZone, ISOChronology>();

    static {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11319);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11320);INSTANCE_UTC = new ISOChronology(GregorianChronology.getInstanceUTC());
        __CLR4_4_18qf8qflgchoqsm.R.inc(11321);cCache.put(DateTimeZone.UTC, INSTANCE_UTC);
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    /**
     * Gets an instance of the ISOChronology.
     * The time zone of the returned instance is UTC.
     *
     * @return a singleton UTC instance of the chronology
     */
    public static ISOChronology getInstanceUTC() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11322);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11323);return INSTANCE_UTC;
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    /**
     * Gets an instance of the ISOChronology in the default time zone.
     *
     * @return a chronology in the default time zone
     */
    public static ISOChronology getInstance() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11324);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11325);return getInstance(DateTimeZone.getDefault());
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    /**
     * Gets an instance of the ISOChronology in the given time zone.
     *
     * @param zone the time zone to get the chronology in, null is default
     * @return a chronology in the specified time zone
     */
    public static ISOChronology getInstance(DateTimeZone zone) {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11326);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11327);if ((((zone == null)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11328)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11329)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11330);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11331);ISOChronology chrono = cCache.get(zone);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11332);if ((((chrono == null)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11333)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11334)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11335);chrono = new ISOChronology(ZonedChronology.getInstance(INSTANCE_UTC, zone));
            __CLR4_4_18qf8qflgchoqsm.R.inc(11336);ISOChronology oldChrono = cCache.putIfAbsent(zone, chrono);
            __CLR4_4_18qf8qflgchoqsm.R.inc(11337);if ((((oldChrono != null)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11338)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11339)==0&false))) {{
                __CLR4_4_18qf8qflgchoqsm.R.inc(11340);chrono = oldChrono;
            }
        }}
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11341);return chrono;
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    // Constructors and instance variables
    //-----------------------------------------------------------------------

    /**
     * Restricted constructor
     */
    private ISOChronology(Chronology base) {
        super(base, null);__CLR4_4_18qf8qflgchoqsm.R.inc(11343);try{__CLR4_4_18qf8qflgchoqsm.R.inc(11342);
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    /**
     * Gets the Chronology in the UTC time zone.
     *
     * @return the chronology in UTC
     */
    public Chronology withUTC() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11344);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11345);return INSTANCE_UTC;
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    /**
     * Gets the Chronology in a specific time zone.
     *
     * @param zone the zone to get the chronology in, null is default
     * @return the chronology
     */
    public Chronology withZone(DateTimeZone zone) {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11346);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11347);if ((((zone == null)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11348)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11349)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11350);zone = DateTimeZone.getDefault();
        }
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11351);if ((((zone == getZone())&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11352)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11353)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11354);return this;
        }
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11355);return getInstance(zone);
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    // Output
    //-----------------------------------------------------------------------

    /**
     * Gets a debugging toString.
     *
     * @return a debugging string
     */
    public String toString() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11356);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11357);String str = "ISOChronology";
        __CLR4_4_18qf8qflgchoqsm.R.inc(11358);DateTimeZone zone = getZone();
        __CLR4_4_18qf8qflgchoqsm.R.inc(11359);if ((((zone != null)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11360)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11361)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11362);str = str + '[' + zone.getID() + ']';
        }
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11363);return str;
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    protected void assemble(Fields fields) {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11364);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11365);if ((((getBase().getZone() == DateTimeZone.UTC)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11366)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11367)==0&false))) {{
            // Use zero based century and year of century.
            __CLR4_4_18qf8qflgchoqsm.R.inc(11368);fields.centuryOfEra = new DividedDateTimeField(
                    ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra(), 100);
            __CLR4_4_18qf8qflgchoqsm.R.inc(11369);fields.centuries = fields.centuryOfEra.getDurationField();

            __CLR4_4_18qf8qflgchoqsm.R.inc(11370);fields.yearOfCentury = new RemainderDateTimeField(
                    (DividedDateTimeField) fields.centuryOfEra, DateTimeFieldType.yearOfCentury());
            __CLR4_4_18qf8qflgchoqsm.R.inc(11371);fields.weekyearOfCentury = new RemainderDateTimeField(
                    (DividedDateTimeField) fields.centuryOfEra, fields.weekyears, DateTimeFieldType.weekyearOfCentury());
        }
    }}finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if this chronology instance equals another.
     *
     * @param obj the object to compare to
     * @return true if equal
     * @since 1.6
     */
    public boolean equals(Object obj) {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11372);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11373);if ((((this == obj)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11374)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11375)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11376);return true;
        }
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11377);if ((((obj instanceof ISOChronology)&&(__CLR4_4_18qf8qflgchoqsm.R.iget(11378)!=0|true))||(__CLR4_4_18qf8qflgchoqsm.R.iget(11379)==0&false))) {{
            __CLR4_4_18qf8qflgchoqsm.R.inc(11380);ISOChronology chrono = (ISOChronology) obj;
            __CLR4_4_18qf8qflgchoqsm.R.inc(11381);return getZone().equals(chrono.getZone());
        }
        }__CLR4_4_18qf8qflgchoqsm.R.inc(11382);return false;
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    /**
     * A suitable hash code for the chronology.
     *
     * @return the hash code
     * @since 1.6
     */
    public int hashCode() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11383);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11384);return "ISO".hashCode() * 11 + getZone().hashCode();
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Serialize ISOChronology instances using a small stub. This reduces the
     * serialized size, and deserialized instances come from the cache.
     */
    private Object writeReplace() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11385);
        __CLR4_4_18qf8qflgchoqsm.R.inc(11386);return new Stub(getZone());
    }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        private transient DateTimeZone iZone;

        Stub(DateTimeZone zone) {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11387);
            __CLR4_4_18qf8qflgchoqsm.R.inc(11388);iZone = zone;
        }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

        private Object readResolve() {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11389);
            __CLR4_4_18qf8qflgchoqsm.R.inc(11390);return ISOChronology.getInstance(iZone);
        }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

        private void writeObject(ObjectOutputStream out) throws IOException {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11391);
            __CLR4_4_18qf8qflgchoqsm.R.inc(11392);out.writeObject(iZone);
        }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}

        private void readObject(ObjectInputStream in)
                throws IOException, ClassNotFoundException {try{__CLR4_4_18qf8qflgchoqsm.R.inc(11393);
            __CLR4_4_18qf8qflgchoqsm.R.inc(11394);iZone = (DateTimeZone) in.readObject();
        }finally{__CLR4_4_18qf8qflgchoqsm.R.flushNeeded();}}
    }

}
