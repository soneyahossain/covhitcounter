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

/**
 * Adapter between old and new parser interface.
 *
 * @author Stephen Colebourne
 * @since 2.4
 */
class DateTimeParserInternalParser implements InternalParser {public static class __CLR4_4_1dn5dn5lgchor32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,17699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final DateTimeParser underlying;

    static InternalParser of(DateTimeParser underlying) {try{__CLR4_4_1dn5dn5lgchor32.R.inc(17681);
        __CLR4_4_1dn5dn5lgchor32.R.inc(17682);if ((((underlying instanceof InternalParserDateTimeParser)&&(__CLR4_4_1dn5dn5lgchor32.R.iget(17683)!=0|true))||(__CLR4_4_1dn5dn5lgchor32.R.iget(17684)==0&false))) {{
            __CLR4_4_1dn5dn5lgchor32.R.inc(17685);return (InternalParser) underlying;
        }
        }__CLR4_4_1dn5dn5lgchor32.R.inc(17686);if ((((underlying == null)&&(__CLR4_4_1dn5dn5lgchor32.R.iget(17687)!=0|true))||(__CLR4_4_1dn5dn5lgchor32.R.iget(17688)==0&false))) {{
            __CLR4_4_1dn5dn5lgchor32.R.inc(17689);return null;
        }
        }__CLR4_4_1dn5dn5lgchor32.R.inc(17690);return new DateTimeParserInternalParser(underlying);
    }finally{__CLR4_4_1dn5dn5lgchor32.R.flushNeeded();}}

    private DateTimeParserInternalParser(DateTimeParser underlying) {try{__CLR4_4_1dn5dn5lgchor32.R.inc(17691);
        __CLR4_4_1dn5dn5lgchor32.R.inc(17692);this.underlying = underlying;
    }finally{__CLR4_4_1dn5dn5lgchor32.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    DateTimeParser getUnderlying() {try{__CLR4_4_1dn5dn5lgchor32.R.inc(17693);
        __CLR4_4_1dn5dn5lgchor32.R.inc(17694);return underlying;
    }finally{__CLR4_4_1dn5dn5lgchor32.R.flushNeeded();}}

    public int estimateParsedLength() {try{__CLR4_4_1dn5dn5lgchor32.R.inc(17695);
        __CLR4_4_1dn5dn5lgchor32.R.inc(17696);return underlying.estimateParsedLength();
    }finally{__CLR4_4_1dn5dn5lgchor32.R.flushNeeded();}}

    public int parseInto(DateTimeParserBucket bucket, CharSequence text, int position) {try{__CLR4_4_1dn5dn5lgchor32.R.inc(17697);
        __CLR4_4_1dn5dn5lgchor32.R.inc(17698);return underlying.parseInto(bucket, text.toString(), position);
    }finally{__CLR4_4_1dn5dn5lgchor32.R.flushNeeded();}}

}
