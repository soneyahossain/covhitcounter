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
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/**
 * Factory that creates instances of PeriodFormatter.
 * <p>
 * Period formatting is performed by the {@link PeriodFormatter} class.
 * Three classes provide factory methods to create formatters, and this is one.
 * The others are {@link ISOPeriodFormat} and {@link PeriodFormatterBuilder}.
 * <p>
 * PeriodFormat is thread-safe and immutable, and the formatters it returns
 * are as well.
 *
 * @author Brian S O'Neill
 * @see ISOPeriodFormat
 * @see PeriodFormatterBuilder
 * @since 1.0
 */
public class PeriodFormat {public static class __CLR4_4_1eiseislgchor59{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,18944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The resource bundle name.
     */
    private static final String BUNDLE_NAME = "org.joda.time.format.messages";
    /**
     * The created formatters.
     */
    private static final ConcurrentMap<Locale, PeriodFormatter> FORMATTERS = new ConcurrentHashMap<Locale, PeriodFormatter>();

    /**
     * Constructor.
     *
     * @since 1.1 (previously private)
     */
    protected PeriodFormat() {
        super();__CLR4_4_1eiseislgchor59.R.inc(18821);try{__CLR4_4_1eiseislgchor59.R.inc(18820);
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Gets the default formatter that outputs words in English.
     * <p>
     * This calls {@link #wordBased(Locale)} using a locale of {@code ENGLISH}.
     *
     * @return the formatter, not null
     */
    public static PeriodFormatter getDefault() {try{__CLR4_4_1eiseislgchor59.R.inc(18822);
        __CLR4_4_1eiseislgchor59.R.inc(18823);return wordBased(Locale.ENGLISH);
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    /**
     * Returns a word based formatter for the JDK default locale.
     * <p>
     * This calls {@link #wordBased(Locale)} using the {@link Locale#getDefault() default locale}.
     *
     * @return the formatter, not null
     * @since 2.0
     */
    public static PeriodFormatter wordBased() {try{__CLR4_4_1eiseislgchor59.R.inc(18824);
        __CLR4_4_1eiseislgchor59.R.inc(18825);return wordBased(Locale.getDefault());
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    /**
     * Returns a word based formatter for the specified locale.
     * <p>
     * The words are configured in a resource bundle text file -
     * {@code org.joda.time.format.messages}.
     * This can be added to via the normal classpath resource bundle mechanisms.
     * <p>
     * You can add your own translation by creating messages_<locale>.properties file
     * and adding it to the {@code org.joda.time.format.messages} path.
     * <p>
     * Simple example (1 -> singular suffix, not 1 -> plural suffix):
     *
     * <pre>
     * PeriodFormat.space=\
     * PeriodFormat.comma=,
     * PeriodFormat.commandand=,and
     * PeriodFormat.commaspaceand=, and
     * PeriodFormat.commaspace=,
     * PeriodFormat.spaceandspace=\ and
     * PeriodFormat.year=\ year
     * PeriodFormat.years=\ years
     * PeriodFormat.month=\ month
     * PeriodFormat.months=\ months
     * PeriodFormat.week=\ week
     * PeriodFormat.weeks=\ weeks
     * PeriodFormat.day=\ day
     * PeriodFormat.days=\ days
     * PeriodFormat.hour=\ hour
     * PeriodFormat.hours=\ hours
     * PeriodFormat.minute=\ minute
     * PeriodFormat.minutes=\ minutes
     * PeriodFormat.second=\ second
     * PeriodFormat.seconds=\ seconds
     * PeriodFormat.millisecond=\ millisecond
     * PeriodFormat.milliseconds=\ milliseconds
     * </pre>
     *
     * <p>
     * Some languages contain more than two suffixes. You can use regular expressions
     * for them. Here's an example using regular expression for English:
     *
     * <pre>
     * PeriodFormat.space=\
     * PeriodFormat.comma=,
     * PeriodFormat.commandand=,and
     * PeriodFormat.commaspaceand=, and
     * PeriodFormat.commaspace=,
     * PeriodFormat.spaceandspace=\ and
     * PeriodFormat.regex.separator=%
     * PeriodFormat.years.regex=1$%.*
     * PeriodFormat.years.list=\ year%\ years
     * PeriodFormat.months.regex=1$%.*
     * PeriodFormat.months.list=\ month%\ months
     * PeriodFormat.weeks.regex=1$%.*
     * PeriodFormat.weeks.list=\ week%\ weeks
     * PeriodFormat.days.regex=1$%.*
     * PeriodFormat.days.list=\ day%\ days
     * PeriodFormat.hours.regex=1$%.*
     * PeriodFormat.hours.list=\ hour%\ hours
     * PeriodFormat.minutes.regex=1$%.*
     * PeriodFormat.minutes.list=\ minute%\ minutes
     * PeriodFormat.seconds.regex=1$%.*
     * PeriodFormat.seconds.list=\ second%\ seconds
     * PeriodFormat.milliseconds.regex=1$%.*
     * PeriodFormat.milliseconds.list=\ millisecond%\ milliseconds
     * </pre>
     *
     * <p>
     * You can mix both approaches. Here's example for Polish (
     * "1 year, 2 years, 5 years, 12 years, 15 years, 21 years, 22 years, 25 years"
     * translates to
     * "1 rok, 2 lata, 5 lat, 12 lat, 15 lat, 21 lat, 22 lata, 25 lat"). Notice that
     * PeriodFormat.day and PeriodFormat.days is used for day suffixes as there is no
     * need for regular expressions:
     *
     * <pre>
     * PeriodFormat.space=\
     * PeriodFormat.comma=,
     * PeriodFormat.commandand=,i
     * PeriodFormat.commaspaceand=, i
     * PeriodFormat.commaspace=,
     * PeriodFormat.spaceandspace=\ i
     * PeriodFormat.regex.separator=%
     * PeriodFormat.years.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.years.list=\ rok%\ lata%\ lat
     * PeriodFormat.months.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.months.list=\ miesi\u0105c%\ miesi\u0105ce%\ miesi\u0119cy
     * PeriodFormat.weeks.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.weeks.list=\ tydzie\u0144%\ tygodnie%\ tygodni
     * PeriodFormat.day=\ dzie\u0144
     * PeriodFormat.days=\ dni
     * PeriodFormat.hours.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.hours.list=\ godzina%\ godziny%\ godzin
     * PeriodFormat.minutes.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.minutes.list=\ minuta%\ minuty%\ minut
     * PeriodFormat.seconds.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.seconds.list=\ sekunda%\ sekundy%\ sekund
     * PeriodFormat.milliseconds.regex=^1$%[0-9]*(?&lt;!1)[2-4]$%[0-9]*
     * PeriodFormat.milliseconds.list=\ milisekunda%\ milisekundy%\ milisekund
     * </pre>
     *
     * <p>
     * Each PeriodFormat.&lt;duration_field_type&gt;.regex property stands for an array of
     * regular expressions and is followed by a property
     * PeriodFormat.&lt;duration_field_type&gt;.list holding an array of suffixes.
     * PeriodFormat.regex.separator is used for splitting. See
     * {@link PeriodFormatterBuilder#appendSuffix(String[], String[])} for details.
     * <p>
     * Available languages are English, Danish, Dutch, French, German, Japanese,
     * Polish, Portuguese and Spanish.
     *
     * @return the formatter, not null
     * @since 2.0, regex since 2.5
     */
    public static PeriodFormatter wordBased(Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18826);
        __CLR4_4_1eiseislgchor59.R.inc(18827);PeriodFormatter pf = FORMATTERS.get(locale);
        __CLR4_4_1eiseislgchor59.R.inc(18828);if ((((pf == null)&&(__CLR4_4_1eiseislgchor59.R.iget(18829)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18830)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18831);DynamicWordBased dynamic = new DynamicWordBased(buildWordBased(locale));
            __CLR4_4_1eiseislgchor59.R.inc(18832);pf = new PeriodFormatter(dynamic, dynamic, locale, null);
            __CLR4_4_1eiseislgchor59.R.inc(18833);PeriodFormatter existing = FORMATTERS.putIfAbsent(locale, pf);
            __CLR4_4_1eiseislgchor59.R.inc(18834);if ((((existing != null)&&(__CLR4_4_1eiseislgchor59.R.iget(18835)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18836)==0&false))) {{
                __CLR4_4_1eiseislgchor59.R.inc(18837);pf = existing;
            }
        }}
        }__CLR4_4_1eiseislgchor59.R.inc(18838);return pf;
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private static PeriodFormatter buildWordBased(Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18839);
        __CLR4_4_1eiseislgchor59.R.inc(18840);ResourceBundle b = ResourceBundle.getBundle(BUNDLE_NAME, locale);
        __CLR4_4_1eiseislgchor59.R.inc(18841);if ((((containsKey(b, "PeriodFormat.regex.separator"))&&(__CLR4_4_1eiseislgchor59.R.iget(18842)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18843)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18844);return buildRegExFormatter(b, locale);
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18845);return buildNonRegExFormatter(b, locale);
        }
    }}finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    private static PeriodFormatter buildRegExFormatter(ResourceBundle b, Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18846);
        __CLR4_4_1eiseislgchor59.R.inc(18847);String[] variants = retrieveVariants(b);
        __CLR4_4_1eiseislgchor59.R.inc(18848);String regExSeparator = b.getString("PeriodFormat.regex.separator");

        __CLR4_4_1eiseislgchor59.R.inc(18849);PeriodFormatterBuilder builder = new PeriodFormatterBuilder();
        __CLR4_4_1eiseislgchor59.R.inc(18850);builder.appendYears();
        __CLR4_4_1eiseislgchor59.R.inc(18851);if ((((containsKey(b, "PeriodFormat.years.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18852)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18853)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18854);builder.appendSuffix(
                    b.getString("PeriodFormat.years.regex").split(regExSeparator),
                    b.getString("PeriodFormat.years.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18855);builder.appendSuffix(b.getString("PeriodFormat.year"), b.getString("PeriodFormat.years"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18856);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18857);builder.appendMonths();
        __CLR4_4_1eiseislgchor59.R.inc(18858);if ((((containsKey(b, "PeriodFormat.months.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18859)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18860)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18861);builder.appendSuffix(
                    b.getString("PeriodFormat.months.regex").split(regExSeparator),
                    b.getString("PeriodFormat.months.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18862);builder.appendSuffix(b.getString("PeriodFormat.month"), b.getString("PeriodFormat.months"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18863);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18864);builder.appendWeeks();
        __CLR4_4_1eiseislgchor59.R.inc(18865);if ((((containsKey(b, "PeriodFormat.weeks.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18866)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18867)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18868);builder.appendSuffix(
                    b.getString("PeriodFormat.weeks.regex").split(regExSeparator),
                    b.getString("PeriodFormat.weeks.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18869);builder.appendSuffix(b.getString("PeriodFormat.week"), b.getString("PeriodFormat.weeks"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18870);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18871);builder.appendDays();
        __CLR4_4_1eiseislgchor59.R.inc(18872);if ((((containsKey(b, "PeriodFormat.days.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18873)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18874)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18875);builder.appendSuffix(
                    b.getString("PeriodFormat.days.regex").split(regExSeparator),
                    b.getString("PeriodFormat.days.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18876);builder.appendSuffix(b.getString("PeriodFormat.day"), b.getString("PeriodFormat.days"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18877);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18878);builder.appendHours();
        __CLR4_4_1eiseislgchor59.R.inc(18879);if ((((containsKey(b, "PeriodFormat.hours.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18880)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18881)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18882);builder.appendSuffix(
                    b.getString("PeriodFormat.hours.regex").split(regExSeparator),
                    b.getString("PeriodFormat.hours.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18883);builder.appendSuffix(b.getString("PeriodFormat.hour"), b.getString("PeriodFormat.hours"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18884);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18885);builder.appendMinutes();
        __CLR4_4_1eiseislgchor59.R.inc(18886);if ((((containsKey(b, "PeriodFormat.minutes.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18887)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18888)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18889);builder.appendSuffix(
                    b.getString("PeriodFormat.minutes.regex").split(regExSeparator),
                    b.getString("PeriodFormat.minutes.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18890);builder.appendSuffix(b.getString("PeriodFormat.minute"), b.getString("PeriodFormat.minutes"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18891);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18892);builder.appendSeconds();
        __CLR4_4_1eiseislgchor59.R.inc(18893);if ((((containsKey(b, "PeriodFormat.seconds.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18894)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18895)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18896);builder.appendSuffix(
                    b.getString("PeriodFormat.seconds.regex").split(regExSeparator),
                    b.getString("PeriodFormat.seconds.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18897);builder.appendSuffix(b.getString("PeriodFormat.second"), b.getString("PeriodFormat.seconds"));
        }

        }__CLR4_4_1eiseislgchor59.R.inc(18898);builder.appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants);
        __CLR4_4_1eiseislgchor59.R.inc(18899);builder.appendMillis();
        __CLR4_4_1eiseislgchor59.R.inc(18900);if ((((containsKey(b, "PeriodFormat.milliseconds.regex"))&&(__CLR4_4_1eiseislgchor59.R.iget(18901)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18902)==0&false))) {{
            __CLR4_4_1eiseislgchor59.R.inc(18903);builder.appendSuffix(
                    b.getString("PeriodFormat.milliseconds.regex").split(regExSeparator),
                    b.getString("PeriodFormat.milliseconds.list").split(regExSeparator));
        } }else {{
            __CLR4_4_1eiseislgchor59.R.inc(18904);builder.appendSuffix(b.getString("PeriodFormat.millisecond"), b.getString("PeriodFormat.milliseconds"));
        }
        }__CLR4_4_1eiseislgchor59.R.inc(18905);return builder.toFormatter().withLocale(locale);
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    private static PeriodFormatter buildNonRegExFormatter(ResourceBundle b, Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18906);
        __CLR4_4_1eiseislgchor59.R.inc(18907);String[] variants = retrieveVariants(b);
        __CLR4_4_1eiseislgchor59.R.inc(18908);return new PeriodFormatterBuilder()
                .appendYears()
                .appendSuffix(b.getString("PeriodFormat.year"), b.getString("PeriodFormat.years"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendMonths()
                .appendSuffix(b.getString("PeriodFormat.month"), b.getString("PeriodFormat.months"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendWeeks()
                .appendSuffix(b.getString("PeriodFormat.week"), b.getString("PeriodFormat.weeks"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendDays()
                .appendSuffix(b.getString("PeriodFormat.day"), b.getString("PeriodFormat.days"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendHours()
                .appendSuffix(b.getString("PeriodFormat.hour"), b.getString("PeriodFormat.hours"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendMinutes()
                .appendSuffix(b.getString("PeriodFormat.minute"), b.getString("PeriodFormat.minutes"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendSeconds()
                .appendSuffix(b.getString("PeriodFormat.second"), b.getString("PeriodFormat.seconds"))
                .appendSeparator(b.getString("PeriodFormat.commaspace"), b.getString("PeriodFormat.spaceandspace"), variants)
                .appendMillis()
                .appendSuffix(b.getString("PeriodFormat.millisecond"), b.getString("PeriodFormat.milliseconds"))
                .toFormatter().withLocale(locale);
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    private static String[] retrieveVariants(ResourceBundle b) {try{__CLR4_4_1eiseislgchor59.R.inc(18909);
        __CLR4_4_1eiseislgchor59.R.inc(18910);return new String[]{b.getString("PeriodFormat.space"), b.getString("PeriodFormat.comma"),
                b.getString("PeriodFormat.commandand"), b.getString("PeriodFormat.commaspaceand")};
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    // simulate ResourceBundle.containsKey()
    private static boolean containsKey(ResourceBundle bundle, String key) {try{__CLR4_4_1eiseislgchor59.R.inc(18911);
        __CLR4_4_1eiseislgchor59.R.inc(18912);for (Enumeration<String> en = bundle.getKeys(); (((en.hasMoreElements())&&(__CLR4_4_1eiseislgchor59.R.iget(18913)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18914)==0&false)); ) {{
            __CLR4_4_1eiseislgchor59.R.inc(18915);if ((((en.nextElement().equals(key))&&(__CLR4_4_1eiseislgchor59.R.iget(18916)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18917)==0&false))) {{
                __CLR4_4_1eiseislgchor59.R.inc(18918);return true;
            }
        }}
        }__CLR4_4_1eiseislgchor59.R.inc(18919);return false;
    }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    /**
     * Printer/parser that reacts to the locale and changes the word-based
     * pattern if necessary.
     */
    static class DynamicWordBased
            implements PeriodPrinter, PeriodParser {

        /**
         * The formatter with the locale selected at construction time.
         */
        private final PeriodFormatter iFormatter;

        DynamicWordBased(PeriodFormatter formatter) {try{__CLR4_4_1eiseislgchor59.R.inc(18920);
            __CLR4_4_1eiseislgchor59.R.inc(18921);iFormatter = formatter;
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18922);
            __CLR4_4_1eiseislgchor59.R.inc(18923);return getPrinter(locale).countFieldsToPrint(period, stopAt, locale);
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        public int calculatePrintedLength(ReadablePeriod period, Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18924);
            __CLR4_4_1eiseislgchor59.R.inc(18925);return getPrinter(locale).calculatePrintedLength(period, locale);
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18926);
            __CLR4_4_1eiseislgchor59.R.inc(18927);getPrinter(locale).printTo(buf, period, locale);
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {try{__CLR4_4_1eiseislgchor59.R.inc(18928);
            __CLR4_4_1eiseislgchor59.R.inc(18929);getPrinter(locale).printTo(out, period, locale);
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        private PeriodPrinter getPrinter(Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18930);
            __CLR4_4_1eiseislgchor59.R.inc(18931);if ((((locale != null && !locale.equals(iFormatter.getLocale()))&&(__CLR4_4_1eiseislgchor59.R.iget(18932)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18933)==0&false))) {{
                __CLR4_4_1eiseislgchor59.R.inc(18934);return wordBased(locale).getPrinter();
            }
            }__CLR4_4_1eiseislgchor59.R.inc(18935);return iFormatter.getPrinter();
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        public int parseInto(
                ReadWritablePeriod period, String periodStr,
                int position, Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18936);
            __CLR4_4_1eiseislgchor59.R.inc(18937);return getParser(locale).parseInto(period, periodStr, position, locale);
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}

        private PeriodParser getParser(Locale locale) {try{__CLR4_4_1eiseislgchor59.R.inc(18938);
            __CLR4_4_1eiseislgchor59.R.inc(18939);if ((((locale != null && !locale.equals(iFormatter.getLocale()))&&(__CLR4_4_1eiseislgchor59.R.iget(18940)!=0|true))||(__CLR4_4_1eiseislgchor59.R.iget(18941)==0&false))) {{
                __CLR4_4_1eiseislgchor59.R.inc(18942);return wordBased(locale).getParser();
            }
            }__CLR4_4_1eiseislgchor59.R.inc(18943);return iFormatter.getParser();
        }finally{__CLR4_4_1eiseislgchor59.R.flushNeeded();}}
    }

}
