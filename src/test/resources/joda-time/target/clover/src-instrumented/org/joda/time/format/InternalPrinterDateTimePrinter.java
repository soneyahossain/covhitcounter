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
package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/**
 * Adapter between old and new printer interface.
 *
 * @author Stephen Colebourne
 * @since 2.4
 */
class InternalPrinterDateTimePrinter implements DateTimePrinter, InternalPrinter {public static class __CLR4_4_1ehlehllgchor4z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,18820,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final InternalPrinter underlying;

    static DateTimePrinter of(InternalPrinter underlying) {try{__CLR4_4_1ehlehllgchor4z.R.inc(18777);
        __CLR4_4_1ehlehllgchor4z.R.inc(18778);if ((((underlying instanceof DateTimePrinterInternalPrinter)&&(__CLR4_4_1ehlehllgchor4z.R.iget(18779)!=0|true))||(__CLR4_4_1ehlehllgchor4z.R.iget(18780)==0&false))) {{
            __CLR4_4_1ehlehllgchor4z.R.inc(18781);return ((DateTimePrinterInternalPrinter) underlying).getUnderlying();
        }
        }__CLR4_4_1ehlehllgchor4z.R.inc(18782);if ((((underlying instanceof DateTimePrinter)&&(__CLR4_4_1ehlehllgchor4z.R.iget(18783)!=0|true))||(__CLR4_4_1ehlehllgchor4z.R.iget(18784)==0&false))) {{
            __CLR4_4_1ehlehllgchor4z.R.inc(18785);return (DateTimePrinter) underlying;
        }
        }__CLR4_4_1ehlehllgchor4z.R.inc(18786);if ((((underlying == null)&&(__CLR4_4_1ehlehllgchor4z.R.iget(18787)!=0|true))||(__CLR4_4_1ehlehllgchor4z.R.iget(18788)==0&false))) {{
            __CLR4_4_1ehlehllgchor4z.R.inc(18789);return null;
        }
        }__CLR4_4_1ehlehllgchor4z.R.inc(18790);return new InternalPrinterDateTimePrinter(underlying);
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    private InternalPrinterDateTimePrinter(InternalPrinter underlying) {try{__CLR4_4_1ehlehllgchor4z.R.inc(18791);
        __CLR4_4_1ehlehllgchor4z.R.inc(18792);this.underlying = underlying;
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int estimatePrintedLength() {try{__CLR4_4_1ehlehllgchor4z.R.inc(18793);
        __CLR4_4_1ehlehllgchor4z.R.inc(18794);return underlying.estimatePrintedLength();
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    public void printTo(StringBuffer buf, long instant, Chronology chrono,
                        int displayOffset, DateTimeZone displayZone, Locale locale) {try{__CLR4_4_1ehlehllgchor4z.R.inc(18795);
        __CLR4_4_1ehlehllgchor4z.R.inc(18796);try {
            __CLR4_4_1ehlehllgchor4z.R.inc(18797);underlying.printTo(buf, instant, chrono, displayOffset, displayZone, locale);
        } catch (IOException ex) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    public void printTo(Writer out, long instant, Chronology chrono,
                        int displayOffset, DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1ehlehllgchor4z.R.inc(18798);
        __CLR4_4_1ehlehllgchor4z.R.inc(18799);underlying.printTo(out, instant, chrono, displayOffset, displayZone, locale);
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    public void printTo(Appendable appendable, long instant, Chronology chrono, int displayOffset,
                        DateTimeZone displayZone, Locale locale) throws IOException {try{__CLR4_4_1ehlehllgchor4z.R.inc(18800);
        __CLR4_4_1ehlehllgchor4z.R.inc(18801);underlying.printTo(appendable, instant, chrono, displayOffset, displayZone, locale);
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    public void printTo(StringBuffer buf, ReadablePartial partial, Locale locale) {try{__CLR4_4_1ehlehllgchor4z.R.inc(18802);
        __CLR4_4_1ehlehllgchor4z.R.inc(18803);try {
            __CLR4_4_1ehlehllgchor4z.R.inc(18804);underlying.printTo(buf, partial, locale);
        } catch (IOException ex) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    public void printTo(Writer out, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1ehlehllgchor4z.R.inc(18805);
        __CLR4_4_1ehlehllgchor4z.R.inc(18806);underlying.printTo(out, partial, locale);
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    public void printTo(Appendable appendable, ReadablePartial partial, Locale locale) throws IOException {try{__CLR4_4_1ehlehllgchor4z.R.inc(18807);
        __CLR4_4_1ehlehllgchor4z.R.inc(18808);underlying.printTo(appendable, partial, locale);
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1ehlehllgchor4z.R.inc(18809);
        __CLR4_4_1ehlehllgchor4z.R.inc(18810);if ((((obj == this)&&(__CLR4_4_1ehlehllgchor4z.R.iget(18811)!=0|true))||(__CLR4_4_1ehlehllgchor4z.R.iget(18812)==0&false))) {{
            __CLR4_4_1ehlehllgchor4z.R.inc(18813);return true;
        }
        }__CLR4_4_1ehlehllgchor4z.R.inc(18814);if ((((obj instanceof InternalPrinterDateTimePrinter)&&(__CLR4_4_1ehlehllgchor4z.R.iget(18815)!=0|true))||(__CLR4_4_1ehlehllgchor4z.R.iget(18816)==0&false))) {{
            __CLR4_4_1ehlehllgchor4z.R.inc(18817);InternalPrinterDateTimePrinter other = (InternalPrinterDateTimePrinter) obj;
            __CLR4_4_1ehlehllgchor4z.R.inc(18818);return underlying.equals(other.underlying);
        }
        }__CLR4_4_1ehlehllgchor4z.R.inc(18819);return false;
    }finally{__CLR4_4_1ehlehllgchor4z.R.flushNeeded();}}

}
