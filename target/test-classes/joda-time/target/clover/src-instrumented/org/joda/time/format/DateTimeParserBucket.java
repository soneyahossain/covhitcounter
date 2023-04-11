/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2015 Stephen Colebourne
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

import java.util.Arrays;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/**
 * DateTimeParserBucket is an advanced class, intended mainly for parser
 * implementations. It can also be used during normal parsing operations to
 * capture more information about the parse.
 * <p>
 * This class allows fields to be saved in any order, but be physically set in
 * a consistent order. This is useful for parsing against formats that allow
 * field values to contradict each other.
 * <p>
 * Field values are applied in an order where the "larger" fields are set
 * first, making their value less likely to stick.  A field is larger than
 * another when it's range duration is longer. If both ranges are the same,
 * then the larger field has the longer duration. If it cannot be determined
 * which field is larger, then the fields are set in the order they were saved.
 * <p>
 * For example, these fields were saved in this order: dayOfWeek, monthOfYear,
 * dayOfMonth, dayOfYear. When computeMillis is called, the fields are set in
 * this order: monthOfYear, dayOfYear, dayOfMonth, dayOfWeek.
 * <p>
 * DateTimeParserBucket is mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Fredrik Borgh
 * @since 1.0
 */
public class DateTimeParserBucket {public static class __CLR4_4_1dg8dg8lgchor2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,17681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The chronology to use for parsing.
     */
    private final Chronology iChrono;
    /**
     * The initial millis.
     */
    private final long iMillis;
    /**
     * The locale to use for parsing.
     */
    private final Locale iLocale;
    /**
     * Used for parsing month/day without year.
     */
    private final int iDefaultYear;
    /**
     * The default zone from the constructor.
     */
    private final DateTimeZone iDefaultZone;
    /**
     * The default pivot year from the constructor.
     */
    private final Integer iDefaultPivotYear;

    /**
     * The parsed zone, initialised to formatter zone.
     */
    private DateTimeZone iZone;
    /**
     * The parsed offset.
     */
    private Integer iOffset;
    /**
     * Used for parsing two-digit years.
     */
    private Integer iPivotYear;

    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;

    private Object iSavedState;

    /**
     * Constructs a bucket.
     *
     * @param instantLocal the initial millis from 1970-01-01T00:00:00, local time
     * @param chrono       the chronology to use
     * @param locale       the locale to use
     * @deprecated Use longer constructor
     */
    @Deprecated
    public DateTimeParserBucket(long instantLocal, Chronology chrono, Locale locale) {
        this(instantLocal, chrono, locale, null, 2000);__CLR4_4_1dg8dg8lgchor2y.R.inc(17433);try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17432);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Constructs a bucket, with the option of specifying the pivot year for
     * two-digit year parsing.
     *
     * @param instantLocal the initial millis from 1970-01-01T00:00:00, local time
     * @param chrono       the chronology to use
     * @param locale       the locale to use
     * @param pivotYear    the pivot year to use when parsing two-digit years
     * @since 1.1
     * @deprecated Use longer constructor
     */
    @Deprecated
    public DateTimeParserBucket(long instantLocal, Chronology chrono, Locale locale, Integer pivotYear) {
        this(instantLocal, chrono, locale, pivotYear, 2000);__CLR4_4_1dg8dg8lgchor2y.R.inc(17435);try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17434);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Constructs a bucket, with the option of specifying the pivot year for
     * two-digit year parsing.
     *
     * @param instantLocal the initial millis from 1970-01-01T00:00:00, local time
     * @param chrono       the chronology to use
     * @param locale       the locale to use
     * @param pivotYear    the pivot year to use when parsing two-digit years
     * @param defaultYear  the default year to use when parsing month-day
     * @since 2.0
     */
    public DateTimeParserBucket(long instantLocal, Chronology chrono,
                                Locale locale, Integer pivotYear, int defaultYear) {
        super();__CLR4_4_1dg8dg8lgchor2y.R.inc(17437);try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17436);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17438);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17439);iMillis = instantLocal;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17440);iDefaultZone = chrono.getZone();
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17441);iChrono = chrono.withUTC();
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17442);iLocale = ((((locale == null )&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17443)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17444)==0&false))? Locale.getDefault() : locale);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17445);iDefaultYear = defaultYear;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17446);iDefaultPivotYear = pivotYear;
        // reset
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17447);iZone = iDefaultZone;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17448);iPivotYear = iDefaultPivotYear;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17449);iSavedFields = new SavedField[8];
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Resets the state back to that when the object was constructed.
     * <p>
     * This resets the state of the bucket, allowing a single bucket to be re-used
     * for many parses. The bucket must not be shared between threads.
     *
     * @since 2.4
     */
    public void reset() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17450);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17451);iZone = iDefaultZone;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17452);iOffset = null;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17453);iPivotYear = iDefaultPivotYear;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17454);iSavedFieldsCount = 0;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17455);iSavedFieldsShared = false;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17456);iSavedState = null;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Parses a datetime from the given text, returning the number of
     * milliseconds since the epoch, 1970-01-01T00:00:00Z.
     * <p>
     * This parses the text using the parser into this bucket.
     * The bucket is reset before parsing begins, allowing the bucket to be re-used.
     * The bucket must not be shared between threads.
     *
     * @param parser the parser to use, see {@link DateTimeFormatter#getParser()}, not null
     * @param text   text to parse, not null
     * @return parsed value expressed in milliseconds since the epoch
     * @throws UnsupportedOperationException if parsing is not supported
     * @throws IllegalArgumentException      if the text to parse is invalid
     * @since 2.4
     */
    public long parseMillis(DateTimeParser parser, CharSequence text) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17457);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17458);reset();
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17459);return doParseMillis(DateTimeParserInternalParser.of(parser), text);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    long doParseMillis(InternalParser parser, CharSequence text) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17460);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17461);int newPos = parser.parseInto(this, text, 0);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17462);if ((((newPos >= 0)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17463)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17464)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17465);if ((((newPos >= text.length())&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17466)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17467)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17468);return computeMillis(true, text);
            }
        }} }else {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17469);newPos = ~newPos;
        }
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17470);throw new IllegalArgumentException(FormatUtils.createErrorMessage(text.toString(), newPos));
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the chronology of the bucket, which will be a local (UTC) chronology.
     */
    public Chronology getChronology() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17471);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17472);return iChrono;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the locale to be used during parsing.
     *
     * @return the locale to use
     */
    public Locale getLocale() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17473);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17474);return iLocale;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the time zone used by computeMillis.
     */
    public DateTimeZone getZone() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17475);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17476);return iZone;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Set a time zone to be used when computeMillis is called.
     */
    public void setZone(DateTimeZone zone) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17477);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17478);iSavedState = null;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17479);iZone = zone;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the time zone offset in milliseconds used by computeMillis.
     *
     * @deprecated use Integer version
     */
    @Deprecated
    public int getOffset() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17480);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17481);return ((((iOffset != null )&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17482)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17483)==0&false))? iOffset : 0);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Returns the time zone offset in milliseconds used by computeMillis.
     */
    public Integer getOffsetInteger() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17484);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17485);return iOffset;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Set a time zone offset to be used when computeMillis is called.
     *
     * @deprecated use Integer version
     */
    @Deprecated
    public void setOffset(int offset) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17486);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17487);iSavedState = null;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17488);iOffset = offset;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Set a time zone offset to be used when computeMillis is called.
     */
    public void setOffset(Integer offset) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17489);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17490);iSavedState = null;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17491);iOffset = offset;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Returns the default year used when information is incomplete.
     * <p>
     * This is used for two-digit years and when the largest parsed field is
     * months or days.
     * <p>
     * A null value for two-digit years means to use the value from DateTimeFormatterBuilder.
     * A null value for month/day only parsing will cause the default of 2000 to be used.
     *
     * @return Integer value of the pivot year, null if not set
     * @since 1.1
     */
    public Integer getPivotYear() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17492);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17493);return iPivotYear;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Sets the pivot year to use when parsing two digit years.
     * <p>
     * If the value is set to null, this will indicate that default
     * behaviour should be used.
     *
     * @param pivotYear the pivot year to use
     * @since 1.1
     * @deprecated this method should never have been public
     */
    @Deprecated
    public void setPivotYear(Integer pivotYear) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17494);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17495);iPivotYear = pivotYear;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Saves a datetime field value.
     *
     * @param field the field, whose chronology must match that of this bucket
     * @param value the value
     */
    public void saveField(DateTimeField field, int value) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17496);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17497);obtainSaveField().init(field, value);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Saves a datetime field value.
     *
     * @param fieldType the field type
     * @param value     the value
     */
    public void saveField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17498);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17499);obtainSaveField().init(fieldType.getField(iChrono), value);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Saves a datetime field text value.
     *
     * @param fieldType the field type
     * @param text      the text value
     * @param locale    the locale to use
     */
    public void saveField(DateTimeFieldType fieldType, String text, Locale locale) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17500);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17501);obtainSaveField().init(fieldType.getField(iChrono), text, locale);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    private SavedField obtainSaveField() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17502);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17503);SavedField[] savedFields = iSavedFields;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17504);int savedFieldsCount = iSavedFieldsCount;

        __CLR4_4_1dg8dg8lgchor2y.R.inc(17505);if ((((savedFieldsCount == savedFields.length || iSavedFieldsShared)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17506)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17507)==0&false))) {{
            // Expand capacity or merely copy if saved fields are shared.
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17508);SavedField[] newArray = new SavedField
                    [(((savedFieldsCount == savedFields.length )&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17509)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17510)==0&false))? savedFieldsCount * 2 : savedFields.length];
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17511);System.arraycopy(savedFields, 0, newArray, 0, savedFieldsCount);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17512);iSavedFields = savedFields = newArray;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17513);iSavedFieldsShared = false;
        }

        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17514);iSavedState = null;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17515);SavedField saved = savedFields[savedFieldsCount];
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17516);if ((((saved == null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17517)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17518)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17519);saved = savedFields[savedFieldsCount] = new SavedField();
        }
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17520);iSavedFieldsCount = savedFieldsCount + 1;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17521);return saved;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Saves the state of this bucket, returning it in an opaque object. Call
     * restoreState to undo any changes that were made since the state was
     * saved. Calls to saveState may be nested.
     *
     * @return opaque saved state, which may be passed to restoreState
     */
    public Object saveState() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17522);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17523);if ((((iSavedState == null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17524)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17525)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17526);iSavedState = new SavedState();
        }
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17527);return iSavedState;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Restores the state of this bucket from a previously saved state. The
     * state object passed into this method is not consumed, and it can be used
     * later to restore to that state again.
     *
     * @param savedState opaque saved state, returned from saveState
     * @return true state object is valid and state restored
     */
    public boolean restoreState(Object savedState) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17528);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17529);if ((((savedState instanceof SavedState)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17530)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17531)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17532);if ((((((SavedState) savedState).restoreState(this))&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17533)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17534)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17535);iSavedState = savedState;
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17536);return true;
            }
        }}
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17537);return false;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     */
    public long computeMillis() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17538);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17539);return computeMillis(false, (CharSequence) null);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @param resetFields false by default, but when true, unsaved field values are cleared
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     */
    public long computeMillis(boolean resetFields) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17540);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17541);return computeMillis(resetFields, (CharSequence) null);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @param resetFields false by default, but when true, unsaved field values are cleared
     * @param text        optional text being parsed, to be included in any error message
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     * @since 1.3
     */
    public long computeMillis(boolean resetFields, String text) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17542);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17543);return computeMillis(resetFields, (CharSequence) text);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @param resetFields false by default, but when true, unsaved field values are cleared
     * @param text        optional text being parsed, to be included in any error message
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     * @since 2.4
     */
    public long computeMillis(boolean resetFields, CharSequence text) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17544);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17545);SavedField[] savedFields = iSavedFields;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17546);int count = iSavedFieldsCount;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17547);if ((((iSavedFieldsShared)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17548)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17549)==0&false))) {{
            // clone so that sort does not affect saved state
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17550);iSavedFields = savedFields = (SavedField[]) iSavedFields.clone();
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17551);iSavedFieldsShared = false;
        }
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17552);sort(savedFields, count);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17553);if ((((count > 0)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17554)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17555)==0&false))) {{
            // alter base year for parsing if first field is month or day
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17556);DurationField months = DurationFieldType.months().getField(iChrono);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17557);DurationField days = DurationFieldType.days().getField(iChrono);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17558);DurationField first = savedFields[0].iField.getDurationField();
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17559);if ((((compareReverse(first, months) >= 0 && compareReverse(first, days) <= 0)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17560)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17561)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17562);saveField(DateTimeFieldType.year(), iDefaultYear);
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17563);return computeMillis(resetFields, text);
            }
        }}

        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17564);long millis = iMillis;
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17565);try {
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17566);for (int i = 0; (((i < count)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17567)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17568)==0&false)); i++) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17569);millis = savedFields[i].set(millis, resetFields);
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17570);if ((((resetFields)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17571)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17572)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17573);for (int i = 0; (((i < count)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17574)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17575)==0&false)); i++) {{
                    __CLR4_4_1dg8dg8lgchor2y.R.inc(17576);if ((((!savedFields[i].iField.isLenient())&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17577)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17578)==0&false))) {{
                        __CLR4_4_1dg8dg8lgchor2y.R.inc(17579);millis = savedFields[i].set(millis, i == (count - 1));
                    }
                }}
            }}
        }} catch (IllegalFieldValueException e) {
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17580);if ((((text != null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17581)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17582)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17583);e.prependMessage("Cannot parse \"" + text + '"');
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17584);throw e;
        }

        __CLR4_4_1dg8dg8lgchor2y.R.inc(17585);if ((((iOffset != null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17586)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17587)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17588);millis -= iOffset;
        } }else {__CLR4_4_1dg8dg8lgchor2y.R.inc(17589);if ((((iZone != null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17590)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17591)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17592);int offset = iZone.getOffsetFromLocal(millis);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17593);millis -= offset;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17594);if ((((offset != iZone.getOffset(millis))&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17595)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17596)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17597);String message = "Illegal instant due to time zone offset transition (" + iZone + ')';
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17598);if ((((text != null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17599)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17600)==0&false))) {{
                    __CLR4_4_1dg8dg8lgchor2y.R.inc(17601);message = "Cannot parse \"" + text + "\": " + message;
                }
                }__CLR4_4_1dg8dg8lgchor2y.R.inc(17602);throw new IllegalInstantException(message);
            }
        }}

        }}__CLR4_4_1dg8dg8lgchor2y.R.inc(17603);return millis;
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    /**
     * Sorts elements [0,high). Calling java.util.Arrays isn't always the right
     * choice since it always creates an internal copy of the array, even if it
     * doesn't need to. If the array slice is small enough, an insertion sort
     * is chosen instead, but it doesn't need a copy!
     * <p>
     * This method has a modified version of that insertion sort, except it
     * doesn't create an unnecessary array copy. If high is over 10, then
     * java.util.Arrays is called, which will perform a merge sort, which is
     * faster than insertion sort on large lists.
     * <p>
     * The end result is much greater performance when computeMillis is called.
     * Since the amount of saved fields is small, the insertion sort is a
     * better choice. Additional performance is gained since there is no extra
     * array allocation and copying. Also, the insertion sort here does not
     * perform any casting operations. The version in java.util.Arrays performs
     * casts within the insertion sort loop.
     */
    private static void sort(SavedField[] array, int high) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17604);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17605);if ((((high > 10)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17606)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17607)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17608);Arrays.sort(array, 0, high);
        } }else {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17609);for (int i = 0; (((i < high)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17610)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17611)==0&false)); i++) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17612);for (int j = i; (((j > 0 && (array[j - 1]).compareTo(array[j]) > 0)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17613)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17614)==0&false)); j--) {{
                    __CLR4_4_1dg8dg8lgchor2y.R.inc(17615);SavedField t = array[j];
                    __CLR4_4_1dg8dg8lgchor2y.R.inc(17616);array[j] = array[j - 1];
                    __CLR4_4_1dg8dg8lgchor2y.R.inc(17617);array[j - 1] = t;
                }
            }}
        }}
    }}finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

    class SavedState {
        final DateTimeZone iZone;
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;

        SavedState() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17618);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17619);this.iZone = DateTimeParserBucket.this.iZone;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17620);this.iOffset = DateTimeParserBucket.this.iOffset;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17621);this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17622);this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

        boolean restoreState(DateTimeParserBucket enclosing) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17623);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17624);if ((((enclosing != DateTimeParserBucket.this)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17625)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17626)==0&false))) {{
                // block SavedState from a different bucket
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17627);return false;
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17628);enclosing.iZone = this.iZone;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17629);enclosing.iOffset = this.iOffset;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17630);enclosing.iSavedFields = this.iSavedFields;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17631);if ((((this.iSavedFieldsCount < enclosing.iSavedFieldsCount)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17632)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17633)==0&false))) {{
                // Since count is being restored to a lower count, the
                // potential exists for new saved fields to destroy data being
                // shared by another state. Set this flag such that the array
                // of saved fields is cloned prior to modification.
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17634);enclosing.iSavedFieldsShared = true;
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17635);enclosing.iSavedFieldsCount = this.iSavedFieldsCount;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17636);return true;
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}
    }

    static class SavedField implements Comparable<SavedField> {
        DateTimeField iField;
        int iValue;
        String iText;
        Locale iLocale;

        SavedField() {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17637);
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

        void init(DateTimeField field, int value) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17638);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17639);iField = field;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17640);iValue = value;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17641);iText = null;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17642);iLocale = null;
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

        void init(DateTimeField field, String text, Locale locale) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17643);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17644);iField = field;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17645);iValue = 0;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17646);iText = text;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17647);iLocale = locale;
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

        long set(long millis, boolean reset) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17648);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17649);if ((((iText == null)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17650)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17651)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17652);millis = iField.setExtended(millis, iValue);
            } }else {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17653);millis = iField.set(millis, iText, iLocale);
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17654);if ((((reset)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17655)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17656)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17657);millis = iField.roundFloor(millis);
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17658);return millis;
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}

        /**
         * The field with the longer range duration is ordered first, where
         * null is considered infinite. If the ranges match, then the field
         * with the longer duration is ordered first.
         */
        public int compareTo(SavedField obj) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17659);
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17660);DateTimeField other = obj.iField;
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17661);int result = compareReverse
                    (iField.getRangeDurationField(), other.getRangeDurationField());
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17662);if ((((result != 0)&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17663)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17664)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17665);return result;
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17666);return compareReverse
                    (iField.getDurationField(), other.getDurationField());
        }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}
    }

    static int compareReverse(DurationField a, DurationField b) {try{__CLR4_4_1dg8dg8lgchor2y.R.inc(17667);
        __CLR4_4_1dg8dg8lgchor2y.R.inc(17668);if ((((a == null || !a.isSupported())&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17669)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17670)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17671);if ((((b == null || !b.isSupported())&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17672)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17673)==0&false))) {{
                __CLR4_4_1dg8dg8lgchor2y.R.inc(17674);return 0;
            }
            }__CLR4_4_1dg8dg8lgchor2y.R.inc(17675);return -1;
        }
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17676);if ((((b == null || !b.isSupported())&&(__CLR4_4_1dg8dg8lgchor2y.R.iget(17677)!=0|true))||(__CLR4_4_1dg8dg8lgchor2y.R.iget(17678)==0&false))) {{
            __CLR4_4_1dg8dg8lgchor2y.R.inc(17679);return 1;
        }
        }__CLR4_4_1dg8dg8lgchor2y.R.inc(17680);return -a.compareTo(b);
    }finally{__CLR4_4_1dg8dg8lgchor2y.R.flushNeeded();}}
}
