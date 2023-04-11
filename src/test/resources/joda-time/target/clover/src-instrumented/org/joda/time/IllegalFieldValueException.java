/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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

/**
 * Exception thrown when attempting to set a field outside its supported range.
 *
 * @author Brian S O'Neill
 * @since 1.1
 */
public class IllegalFieldValueException extends IllegalArgumentException {public static class __CLR4_4_11po1polgchoq8y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,2363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serialization lock.
     */
    private static final long serialVersionUID = 6305711765985447737L;

    /**
     * Creates a message for the exception.
     *
     * @param fieldName  the field name
     * @param value      the value rejected
     * @param lowerBound the lower bound allowed
     * @param upperBound the upper bound allowed
     * @param explain    an explanation
     * @return the message
     */
    private static String createMessage(String fieldName, Number value,
                                        Number lowerBound, Number upperBound, String explain) {try{__CLR4_4_11po1polgchoq8y.R.inc(2220);
        __CLR4_4_11po1polgchoq8y.R.inc(2221);StringBuilder buf = new StringBuilder()
                .append("Value ").append(value).append(" for ").append(fieldName).append(' ');

        __CLR4_4_11po1polgchoq8y.R.inc(2222);if ((((lowerBound == null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2223)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2224)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2225);if ((((upperBound == null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2226)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2227)==0&false))) {{
                __CLR4_4_11po1polgchoq8y.R.inc(2228);buf.append("is not supported");
            } }else {{
                __CLR4_4_11po1polgchoq8y.R.inc(2229);buf.append("must not be larger than ").append(upperBound);
            }
        }} }else {__CLR4_4_11po1polgchoq8y.R.inc(2230);if ((((upperBound == null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2231)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2232)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2233);buf.append("must not be smaller than ").append(lowerBound);
        } }else {{
            __CLR4_4_11po1polgchoq8y.R.inc(2234);buf.append("must be in the range [")
                    .append(lowerBound)
                    .append(',')
                    .append(upperBound)
                    .append(']');
        }
        }}__CLR4_4_11po1polgchoq8y.R.inc(2235);if ((((explain != null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2236)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2237)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2238);buf.append(": ").append(explain);
        }

        }__CLR4_4_11po1polgchoq8y.R.inc(2239);return buf.toString();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Creates a message for the exception.
     *
     * @param fieldName the field name
     * @param value     the value rejected
     * @return the message
     */
    private static String createMessage(String fieldName, String value) {try{__CLR4_4_11po1polgchoq8y.R.inc(2240);
        __CLR4_4_11po1polgchoq8y.R.inc(2241);StringBuffer buf = new StringBuffer().append("Value ");

        __CLR4_4_11po1polgchoq8y.R.inc(2242);if ((((value == null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2243)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2244)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2245);buf.append("null");
        } }else {{
            __CLR4_4_11po1polgchoq8y.R.inc(2246);buf.append('"');
            __CLR4_4_11po1polgchoq8y.R.inc(2247);buf.append(value);
            __CLR4_4_11po1polgchoq8y.R.inc(2248);buf.append('"');
        }

        }__CLR4_4_11po1polgchoq8y.R.inc(2249);buf.append(" for ").append(fieldName).append(' ').append("is not supported");

        __CLR4_4_11po1polgchoq8y.R.inc(2250);return buf.toString();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    private final DateTimeFieldType iDateTimeFieldType;
    private final DurationFieldType iDurationFieldType;
    private final String iFieldName;
    private final Number iNumberValue;
    private final String iStringValue;
    private final Number iLowerBound;
    private final Number iUpperBound;
    private String iMessage;

    /**
     * Constructor.
     *
     * @param fieldType  type of field being set
     * @param value      illegal value being set
     * @param lowerBound lower legal field value, or null if not applicable
     * @param upperBound upper legal field value, or null if not applicable
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType,
                                      Number value, Number lowerBound, Number upperBound) {
        super(createMessage(fieldType.getName(), value, lowerBound, upperBound, null));__CLR4_4_11po1polgchoq8y.R.inc(2252);try{__CLR4_4_11po1polgchoq8y.R.inc(2251);
        __CLR4_4_11po1polgchoq8y.R.inc(2253);iDateTimeFieldType = fieldType;
        __CLR4_4_11po1polgchoq8y.R.inc(2254);iDurationFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2255);iFieldName = fieldType.getName();
        __CLR4_4_11po1polgchoq8y.R.inc(2256);iNumberValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2257);iStringValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2258);iLowerBound = lowerBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2259);iUpperBound = upperBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2260);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldType  type of field being set
     * @param value      illegal value being set
     * @param lowerBound lower legal field value, or null if not applicable
     * @param upperBound upper legal field value, or null if not applicable
     * @param explain    an explanation message
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType,
                                      Number value, Number lowerBound, Number upperBound, String explain) {
        super(createMessage(fieldType.getName(), value, lowerBound, upperBound, explain));__CLR4_4_11po1polgchoq8y.R.inc(2262);try{__CLR4_4_11po1polgchoq8y.R.inc(2261);
        __CLR4_4_11po1polgchoq8y.R.inc(2263);iDateTimeFieldType = fieldType;
        __CLR4_4_11po1polgchoq8y.R.inc(2264);iDurationFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2265);iFieldName = fieldType.getName();
        __CLR4_4_11po1polgchoq8y.R.inc(2266);iNumberValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2267);iStringValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2268);iLowerBound = lowerBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2269);iUpperBound = upperBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2270);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldType type of field being set
     * @param value     illegal value being set
     * @param explain   an explanation
     * @since 1.5
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType,
                                      Number value, String explain) {
        super(createMessage(fieldType.getName(), value, null, null, explain));__CLR4_4_11po1polgchoq8y.R.inc(2272);try{__CLR4_4_11po1polgchoq8y.R.inc(2271);
        __CLR4_4_11po1polgchoq8y.R.inc(2273);iDateTimeFieldType = fieldType;
        __CLR4_4_11po1polgchoq8y.R.inc(2274);iDurationFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2275);iFieldName = fieldType.getName();
        __CLR4_4_11po1polgchoq8y.R.inc(2276);iNumberValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2277);iStringValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2278);iLowerBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2279);iUpperBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2280);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldType  type of field being set
     * @param value      illegal value being set
     * @param lowerBound lower legal field value, or null if not applicable
     * @param upperBound upper legal field value, or null if not applicable
     */
    public IllegalFieldValueException(DurationFieldType fieldType,
                                      Number value, Number lowerBound, Number upperBound) {
        super(createMessage(fieldType.getName(), value, lowerBound, upperBound, null));__CLR4_4_11po1polgchoq8y.R.inc(2282);try{__CLR4_4_11po1polgchoq8y.R.inc(2281);
        __CLR4_4_11po1polgchoq8y.R.inc(2283);iDateTimeFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2284);iDurationFieldType = fieldType;
        __CLR4_4_11po1polgchoq8y.R.inc(2285);iFieldName = fieldType.getName();
        __CLR4_4_11po1polgchoq8y.R.inc(2286);iNumberValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2287);iStringValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2288);iLowerBound = lowerBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2289);iUpperBound = upperBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2290);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldName  name of field being set
     * @param value      illegal value being set
     * @param lowerBound lower legal field value, or null if not applicable
     * @param upperBound upper legal field value, or null if not applicable
     */
    public IllegalFieldValueException(String fieldName,
                                      Number value, Number lowerBound, Number upperBound) {
        super(createMessage(fieldName, value, lowerBound, upperBound, null));__CLR4_4_11po1polgchoq8y.R.inc(2292);try{__CLR4_4_11po1polgchoq8y.R.inc(2291);
        __CLR4_4_11po1polgchoq8y.R.inc(2293);iDateTimeFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2294);iDurationFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2295);iFieldName = fieldName;
        __CLR4_4_11po1polgchoq8y.R.inc(2296);iNumberValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2297);iStringValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2298);iLowerBound = lowerBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2299);iUpperBound = upperBound;
        __CLR4_4_11po1polgchoq8y.R.inc(2300);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldType type of field being set
     * @param value     illegal value being set
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType, String value) {
        super(createMessage(fieldType.getName(), value));__CLR4_4_11po1polgchoq8y.R.inc(2302);try{__CLR4_4_11po1polgchoq8y.R.inc(2301);
        __CLR4_4_11po1polgchoq8y.R.inc(2303);iDateTimeFieldType = fieldType;
        __CLR4_4_11po1polgchoq8y.R.inc(2304);iDurationFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2305);iFieldName = fieldType.getName();
        __CLR4_4_11po1polgchoq8y.R.inc(2306);iStringValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2307);iNumberValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2308);iLowerBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2309);iUpperBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2310);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldType type of field being set
     * @param value     illegal value being set
     */
    public IllegalFieldValueException(DurationFieldType fieldType, String value) {
        super(createMessage(fieldType.getName(), value));__CLR4_4_11po1polgchoq8y.R.inc(2312);try{__CLR4_4_11po1polgchoq8y.R.inc(2311);
        __CLR4_4_11po1polgchoq8y.R.inc(2313);iDateTimeFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2314);iDurationFieldType = fieldType;
        __CLR4_4_11po1polgchoq8y.R.inc(2315);iFieldName = fieldType.getName();
        __CLR4_4_11po1polgchoq8y.R.inc(2316);iStringValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2317);iNumberValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2318);iLowerBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2319);iUpperBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2320);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Constructor.
     *
     * @param fieldName name of field being set
     * @param value     illegal value being set
     */
    public IllegalFieldValueException(String fieldName, String value) {
        super(createMessage(fieldName, value));__CLR4_4_11po1polgchoq8y.R.inc(2322);try{__CLR4_4_11po1polgchoq8y.R.inc(2321);
        __CLR4_4_11po1polgchoq8y.R.inc(2323);iDateTimeFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2324);iDurationFieldType = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2325);iFieldName = fieldName;
        __CLR4_4_11po1polgchoq8y.R.inc(2326);iStringValue = value;
        __CLR4_4_11po1polgchoq8y.R.inc(2327);iNumberValue = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2328);iLowerBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2329);iUpperBound = null;
        __CLR4_4_11po1polgchoq8y.R.inc(2330);iMessage = super.getMessage();
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the DateTimeFieldType whose value was invalid, or null if not applicable.
     *
     * @return the datetime field type
     */
    public DateTimeFieldType getDateTimeFieldType() {try{__CLR4_4_11po1polgchoq8y.R.inc(2331);
        __CLR4_4_11po1polgchoq8y.R.inc(2332);return iDateTimeFieldType;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the DurationFieldType whose value was invalid, or null if not applicable.
     *
     * @return the duration field type
     */
    public DurationFieldType getDurationFieldType() {try{__CLR4_4_11po1polgchoq8y.R.inc(2333);
        __CLR4_4_11po1polgchoq8y.R.inc(2334);return iDurationFieldType;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the name of the field whose value was invalid.
     *
     * @return the field name
     */
    public String getFieldName() {try{__CLR4_4_11po1polgchoq8y.R.inc(2335);
        __CLR4_4_11po1polgchoq8y.R.inc(2336);return iFieldName;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the illegal integer value assigned to the field, or null if not applicable.
     *
     * @return the value
     */
    public Number getIllegalNumberValue() {try{__CLR4_4_11po1polgchoq8y.R.inc(2337);
        __CLR4_4_11po1polgchoq8y.R.inc(2338);return iNumberValue;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the illegal string value assigned to the field, or null if not applicable.
     *
     * @return the value
     */
    public String getIllegalStringValue() {try{__CLR4_4_11po1polgchoq8y.R.inc(2339);
        __CLR4_4_11po1polgchoq8y.R.inc(2340);return iStringValue;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the illegal value assigned to the field as a non-null string.
     *
     * @return the value
     */
    public String getIllegalValueAsString() {try{__CLR4_4_11po1polgchoq8y.R.inc(2341);
        __CLR4_4_11po1polgchoq8y.R.inc(2342);String value = iStringValue;
        __CLR4_4_11po1polgchoq8y.R.inc(2343);if ((((value == null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2344)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2345)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2346);value = String.valueOf(iNumberValue);
        }
        }__CLR4_4_11po1polgchoq8y.R.inc(2347);return value;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the lower bound of the legal value range, or null if not applicable.
     *
     * @return the lower bound
     */
    public Number getLowerBound() {try{__CLR4_4_11po1polgchoq8y.R.inc(2348);
        __CLR4_4_11po1polgchoq8y.R.inc(2349);return iLowerBound;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Returns the upper bound of the legal value range, or null if not applicable.
     *
     * @return the upper bound
     */
    public Number getUpperBound() {try{__CLR4_4_11po1polgchoq8y.R.inc(2350);
        __CLR4_4_11po1polgchoq8y.R.inc(2351);return iUpperBound;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    public String getMessage() {try{__CLR4_4_11po1polgchoq8y.R.inc(2352);
        __CLR4_4_11po1polgchoq8y.R.inc(2353);return iMessage;
    }finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}

    /**
     * Provide additional detail by prepending a message to the existing message.
     * A colon is separator is automatically inserted between the messages.
     *
     * @since 1.3
     */
    public void prependMessage(String message) {try{__CLR4_4_11po1polgchoq8y.R.inc(2354);
        __CLR4_4_11po1polgchoq8y.R.inc(2355);if ((((iMessage == null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2356)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2357)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2358);iMessage = message;
        } }else {__CLR4_4_11po1polgchoq8y.R.inc(2359);if ((((message != null)&&(__CLR4_4_11po1polgchoq8y.R.iget(2360)!=0|true))||(__CLR4_4_11po1polgchoq8y.R.iget(2361)==0&false))) {{
            __CLR4_4_11po1polgchoq8y.R.inc(2362);iMessage = message + ": " + iMessage;
        }
    }}}finally{__CLR4_4_11po1polgchoq8y.R.flushNeeded();}}
}
