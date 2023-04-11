/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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

import org.joda.time.format.DateTimeFormat;

/**
 * Exception thrown when attempting to create an instant or date-time that cannot exist.
 * <p>
 * Classes like {@code DateTime} only store valid date-times.
 * One of the cases where validity is important is handling daylight savings time (DST).
 * In many places DST is used, where the local clock moves forward by an hour in spring and back by an hour in autumn/fall.
 * This means that in spring, there is a "gap" where a local time does not exist.
 * <p>
 * This exception refers to this gap, and it means that your application tried to create
 * a date-time inside the gap - a time that did not exist.
 * Since Joda-Time objects must be valid, this is not allowed.
 * <p>
 * Possible solutions may be as follows:<br />
 * Use <code>LocalDateTime</code>, as all local date-times are valid.<br />
 * When converting a <code>LocalDate</code> to a <code>DateTime</code>, then use <code>toDateTimeAsStartOfDay()</code>
 * as this handles and manages any gaps.<br />
 * When parsing, use <code>parseLocalDateTime()</code> if the string being parsed has no time-zone.
 *
 * @author Stephen Colebourne
 * @since 2.2
 */
public class IllegalInstantException extends IllegalArgumentException {public static class __CLR4_4_11tn1tnlgchoq92{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,2383,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock.
     */
    private static final long serialVersionUID = 2858712538216L;


    /**
     * Constructor.
     *
     * @param message the message
     */
    public IllegalInstantException(String message) {
        super(message);__CLR4_4_11tn1tnlgchoq92.R.inc(2364);try{__CLR4_4_11tn1tnlgchoq92.R.inc(2363);
    }finally{__CLR4_4_11tn1tnlgchoq92.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param instantLocal the local instant
     * @param zoneId       the time-zone ID, may be null
     */
    public IllegalInstantException(long instantLocal, String zoneId) {
        super(createMessage(instantLocal, zoneId));__CLR4_4_11tn1tnlgchoq92.R.inc(2366);try{__CLR4_4_11tn1tnlgchoq92.R.inc(2365);
    }finally{__CLR4_4_11tn1tnlgchoq92.R.flushNeeded();}}

    private static String createMessage(long instantLocal, String zoneId) {try{__CLR4_4_11tn1tnlgchoq92.R.inc(2367);
        __CLR4_4_11tn1tnlgchoq92.R.inc(2368);String localDateTime = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(instantLocal));
        __CLR4_4_11tn1tnlgchoq92.R.inc(2369);String zone = ((((zoneId != null )&&(__CLR4_4_11tn1tnlgchoq92.R.iget(2370)!=0|true))||(__CLR4_4_11tn1tnlgchoq92.R.iget(2371)==0&false))? " (" + zoneId + ")" : "");
        __CLR4_4_11tn1tnlgchoq92.R.inc(2372);return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + localDateTime + zone;
    }finally{__CLR4_4_11tn1tnlgchoq92.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Checks if the exception is, or has a cause, of {@code IllegalInstantException}.
     *
     * @param ex the exception to check
     * @return true if an {@code IllegalInstantException}
     */
    public static boolean isIllegalInstant(Throwable ex) {try{__CLR4_4_11tn1tnlgchoq92.R.inc(2373);
        __CLR4_4_11tn1tnlgchoq92.R.inc(2374);if ((((ex instanceof IllegalInstantException)&&(__CLR4_4_11tn1tnlgchoq92.R.iget(2375)!=0|true))||(__CLR4_4_11tn1tnlgchoq92.R.iget(2376)==0&false))) {{
            __CLR4_4_11tn1tnlgchoq92.R.inc(2377);return true;
        }
        }__CLR4_4_11tn1tnlgchoq92.R.inc(2378);while ((((ex.getCause() != null && ex.getCause() != ex)&&(__CLR4_4_11tn1tnlgchoq92.R.iget(2379)!=0|true))||(__CLR4_4_11tn1tnlgchoq92.R.iget(2380)==0&false))) {{
            __CLR4_4_11tn1tnlgchoq92.R.inc(2381);return isIllegalInstant(ex.getCause());
        }
        }__CLR4_4_11tn1tnlgchoq92.R.inc(2382);return false;
    }finally{__CLR4_4_11tn1tnlgchoq92.R.flushNeeded();}}

}
