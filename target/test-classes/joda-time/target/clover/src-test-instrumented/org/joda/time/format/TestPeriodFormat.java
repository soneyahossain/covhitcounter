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

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Period;

/**
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormat {static class __CLR4_4_11m0b1m0blgchot1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231266208L,8589935092L,75992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE; //extends TestCase {

    private static final Locale EN = new Locale("en");
    private static final Locale FR = new Locale("fr");
    private static final Locale PT = new Locale("pt");
    private static final Locale ES = new Locale("es");
    private static final Locale DE = new Locale("de");
    private static final Locale NL = new Locale("nl");
    private static final Locale DA = new Locale("da");
    private static final Locale JA = new Locale("ja");
    private static final Locale PL = new Locale("pl");
    private static final Locale BG = new Locale("bg");
    private static final Locale CS = new Locale("cs");
    private static final Locale RU = new Locale("ru");

    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75179);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75180);TestPeriodFormat TB = new TestPeriodFormat();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75181);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75182);TB.testSubclassableConstructor();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75183);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75184);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75185);TB.test_getDefault_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75186);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75187);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75188);TB.test_getDefault_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75189);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75190);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75191);TB.test_getDefault_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75192);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75193);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75194);TB.test_getDefault_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75195);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75196);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75197);TB.test_getDefault_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75198);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75199);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75200);TB.test_getDefault_checkRedundantSeparator();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75201);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75202);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75203);TB.test_getDefault_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75204);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75205);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75206);TB.test_wordBased_default();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75207);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75208);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75209);TB.test_wordBased_fr_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75210);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75211);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75212);TB.test_wordBased_fr_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75213);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75214);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75215);TB.test_wordBased_fr_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75216);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75217);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75218);TB.test_wordBased_fr_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75219);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75220);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75221);TB.test_wordBased_fr_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75222);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75223);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75224);TB.test_wordBased_fr_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75225);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75226);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75227);TB.test_wordBased_pt_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75228);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75229);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75230);TB.test_wordBased_pt_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75231);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75232);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75233);TB.test_wordBased_pt_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75234);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75235);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75236);TB.test_wordBased_pt_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75237);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75238);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75239);TB.test_wordBased_pt_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75240);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75241);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75242);TB.test_wordBased_pt_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75243);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75244);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75245);TB.test_wordBased_es_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75246);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75247);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75248);TB.test_wordBased_es_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75249);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75250);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75251);TB.test_wordBased_es_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75252);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75253);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75254);TB.test_wordBased_es_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75255);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75256);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75257);TB.test_wordBased_es_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75258);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75259);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75260);TB.test_wordBased_es_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75261);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75262);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75263);TB.test_wordBased_de_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75264);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75265);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75266);TB.test_wordBased_de_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75267);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75268);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75269);TB.test_wordBased_de_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75270);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75271);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75272);TB.test_wordBased_de_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75273);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75274);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75275);TB.test_wordBased_de_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75276);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75277);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75278);TB.test_wordBased_de_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75279);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75280);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75281);TB.test_wordBased_nl_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75282);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75283);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75284);TB.test_wordBased_nl_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75285);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75286);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75287);TB.test_wordBased_nl_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75288);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75289);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75290);TB.test_wordBased_nl_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75291);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75292);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75293);TB.test_wordBased_nl_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75294);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75295);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75296);TB.test_wordBased_nl_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75297);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75298);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75299);TB.test_wordBased_da_formatMultiple();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75300);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75301);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75302);TB.test_wordBased_da_formatSinglular();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75303);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75304);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75305);TB.test_wordBased_da_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75306);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75307);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75308);TB.test_wordBased_ja_formatMultiple();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75309);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75310);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75311);TB.test_wordBased_ja_formatSingular();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75312);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75313);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75314);TB.test_wordBased_ja_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75315);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75316);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75317);TB.test_wordBased_ja_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75318);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75319);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75320);TB.test_wordBased_ja_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75321);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75322);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75323);TB.test_wordBased_ja_checkRedundantSeparator();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75324);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75325);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75326);TB.test_wordBased_pl_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75327);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75328);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75329);TB.test_wordBased_pl_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75330);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75331);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75332);TB.test_wordBased_pl_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75333);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75334);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75335);TB.test_wordBased_pl_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75336);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75337);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75338);TB.test_wordBased_pl_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75339);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75340);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75341);TB.test_wordBased_pl_checkRedundantSeparator();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75342);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75343);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75344);TB.test_wordBased_pl_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75345);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75346);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75347);TB.test_wordBased_pl_regEx();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75348);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75349);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75350);TB.test_wordBased_bg_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75351);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75352);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75353);TB.test_wordBased_cs_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75354);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75355);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75356);TB.test_wordBased_ru_formatStandard();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75357);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75358);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75359);TB.test_wordBased_ru_FormatOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75360);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75361);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75362);TB.test_wordBased_ru_formatTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75363);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75364);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75365);TB.test_wordBased_ru_parseOneField();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75366);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75367);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75368);TB.test_wordBased_ru_parseTwoFields();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75369);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75370);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75371);TB.test_wordBased_ru_checkRedundantSeparator();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75372);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75373);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75374);TB.test_wordBased_ru_cached();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75375);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75376);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75377);TB.test_wordBased_ru_regEx();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75378);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75379);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75380);TB.test_wordBased_fr_from_de();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75381);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75382);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75383);TB.test_wordBased_fr_from_nl();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75384);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75385);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75386);TB.test_wordBased_en_from_de();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75387);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75388);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75389);TB.test_wordBased_en_from_nl();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75390);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75391);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75392);TB.test_wordBased_en_from_pl();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75393);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75394);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75395);TB.test_wordBased_pl_from_fr();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75396);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75397);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75398);TB.test_getDefault_localeValue();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75399);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75400);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75401);TB.test_wordBased_localeValue();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75402);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75403);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75404);TB.test_wordBasedWithLocale_localeValue();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75405);TB.tearDown();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75406);TB.setUp();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75407);TB.test_wordBased_en_withLocale_pt();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75408);TB.tearDown();

    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPeriodFormat.class);
    }

    public TestPeriodFormat(String name) {
        super(name);
    }
     */

    @Before
    public void setUp() throws Exception {try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75409);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75410);originalLocale = Locale.getDefault();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75411);Locale.setDefault(DE);
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75412);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75413);Locale.setDefault(originalLocale);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75414);originalLocale = null;
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSubclassableConstructor() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pm293x1m6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.testSubclassableConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pm293x1m6v(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75415);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75416);PeriodFormat f = new PeriodFormat() {
            // test constructor is protected
        };
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75417);assertNotNull(f);
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // getDefault()
    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g3am0u1m6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g3am0u1m6y(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75418);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75419);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75420);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.getDefault().print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dqqdh51m71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dqqdh51m71(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75421);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75422);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75423);assertEquals("2 days", PeriodFormat.getDefault().print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tc77ki1m74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tc77ki1m74(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75424);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75425);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75426);assertEquals("2 days and 5 hours", PeriodFormat.getDefault().print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuu3mh1m77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuu3mh1m77(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75427);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75428);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75429);assertEquals(p, PeriodFormat.getDefault().parsePeriod("2 days"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1muizts1m7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1muizts1m7a(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75430);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75431);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75432);assertEquals(p, PeriodFormat.getDefault().parsePeriod("2 days and 5 hours"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_checkRedundantSeparator() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xoxm001m7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_checkRedundantSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xoxm001m7d(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75433);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75434);try {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75435);PeriodFormat.getDefault().parsePeriod("2 days and 5 hours ");
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75436);fail("No exception was caught");
        } catch (Exception e) {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75437);assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dytks01m7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dytks01m7i(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75438);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75439);assertSame(PeriodFormat.getDefault(), PeriodFormat.getDefault());
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased() - default locale (de)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_default() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecefq31m7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_default",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecefq31m7k(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75440);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75441);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75442);assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased().print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale.FRENCH)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dtinp1m7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dtinp1m7n(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75443);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75444);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75445);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng7gua1m7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng7gua1m7q(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75446);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75447);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75448);assertEquals("2 jours", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cixj5n1m7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cixj5n1m7t(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75449);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75450);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75451);assertEquals("2 jours et 5 heures", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wpigjm1m7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wpigjm1m7w(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75452);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75453);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75454);assertEquals(p, PeriodFormat.wordBased(FR).parsePeriod("2 jours"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d51wgn1m7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d51wgn1m7z(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75455);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75456);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75457);assertEquals(p, PeriodFormat.wordBased(FR).parsePeriod("2 jours et 5 heures"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142u3151m82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142u3151m82(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75458);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75459);assertSame(PeriodFormat.wordBased(FR), PeriodFormat.wordBased(FR));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale pt)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_pt_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du6l0t1m84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du6l0t1m84(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75460);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75461);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75462);assertEquals("1 dia, 5 horas, 6 minutos, 7 segundos e 8 milissegundos", PeriodFormat.wordBased(PT).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_pt_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzueh61m87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzueh61m87(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75463);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75464);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75465);assertEquals("2 dias", PeriodFormat.wordBased(PT).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_pt_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uiueir1m8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uiueir1m8a(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75466);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75467);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75468);assertEquals("2 dias e 5 horas", PeriodFormat.wordBased(PT).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_pt_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swzqwm1m8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swzqwm1m8d(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75469);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75470);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75471);assertEquals(p, PeriodFormat.wordBased(PT).parsePeriod("2 dias"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_pt_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kleytr1m8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kleytr1m8g(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75472);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75473);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75474);assertEquals(p, PeriodFormat.wordBased(PT).parsePeriod("2 dias e 5 horas"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_pt_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1huj2an1m8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pt_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1huj2an1m8j(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75475);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75476);assertSame(PeriodFormat.wordBased(PT), PeriodFormat.wordBased(PT));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale es)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_es_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1shd5d51m8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1shd5d51m8l(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75477);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75478);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75479);assertEquals("1 d\u00eda, 5 horas, 6 minutos, 7 segundos y 8 milisegundos", PeriodFormat.wordBased(ES).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_es_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cppx401m8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cppx401m8o(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75480);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75481);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75482);assertEquals("2 d\u00edas", PeriodFormat.wordBased(ES).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_es_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12v4bxj1m8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12v4bxj1m8r(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75483);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75484);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75485);assertEquals("2 d\u00edas y 5 horas", PeriodFormat.wordBased(ES).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_es_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_152rz6o1m8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_152rz6o1m8u(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75486);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75487);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75488);assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00edas"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_es_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lq4rk71m8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lq4rk71m8x(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75489);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75490);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75491);assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00edas y 5 horas"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_es_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysird51m90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_es_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysird51m90(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75492);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75493);assertSame(PeriodFormat.wordBased(ES), PeriodFormat.wordBased(ES));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale de)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_de_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1prixka1m92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1prixka1m92(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75494);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75495);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75496);assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased(DE).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_de_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_142i1xp1m95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_142i1xp1m95(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75497);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75498);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75499);assertEquals("2 Tage", PeriodFormat.wordBased(DE).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_de_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1py74ka1m98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1py74ka1m98(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75500);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75501);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75502);assertEquals("2 Tage und 5 Stunden", PeriodFormat.wordBased(DE).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_de_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8nlsj1m9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8nlsj1m9b(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75503);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75504);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75505);assertEquals(p, PeriodFormat.wordBased(DE).parsePeriod("2 Tage"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_de_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wirbd81m9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wirbd81m9e(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75506);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75507);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75508);assertEquals(p, PeriodFormat.wordBased(DE).parsePeriod("2 Tage und 5 Stunden"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_de_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2fyzg1m9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_de_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2fyzg1m9h(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75509);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75510);assertSame(PeriodFormat.wordBased(DE), PeriodFormat.wordBased(DE));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale nl)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_nl_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ij2xz1m9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ij2xz1m9j(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75511);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75512);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75513);assertEquals("1 dag, 5 uur, 6 minuten, 7 seconden en 8 milliseconden", PeriodFormat.wordBased(NL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_nl_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbhwk01m9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbhwk01m9m(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75514);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75515);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75516);assertEquals("2 dagen", PeriodFormat.wordBased(NL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_nl_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15dxy0n1m9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15dxy0n1m9p(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75517);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75518);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75519);assertEquals("2 dagen en 5 uur", PeriodFormat.wordBased(NL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_nl_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdioz41m9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdioz41m9s(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75520);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75521);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75522);assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_nl_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9rgqx1m9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9rgqx1m9v(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75523);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75524);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75525);assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen en 5 uur"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_nl_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1du7ml51m9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_nl_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1du7ml51m9y(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75526);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75527);assertSame(PeriodFormat.wordBased(NL), PeriodFormat.wordBased(NL));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale da)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_da_formatMultiple() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1162n3n1ma0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_da_formatMultiple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1162n3n1ma0(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75528);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75529);Period p = new Period(2, 3, 4, 2, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75530);assertEquals("2 \u00e5r, 3 m\u00e5neder, 4 uger, 2 dage, 5 timer, 6 minutter, 7 sekunder og 8 millisekunder", PeriodFormat.wordBased(DA).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_da_formatSinglular() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_116ehrq1ma3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_da_formatSinglular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_116ehrq1ma3(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75531);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75532);Period p = new Period(1, 1, 1, 1, 1, 1, 1, 1);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75533);assertEquals("1 \u00e5r, 1 m\u00e5ned, 1 uge, 1 dag, 1 time, 1 minut, 1 sekund og 1 millisekund", PeriodFormat.wordBased(DA).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_da_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13knj6g1ma6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_da_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13knj6g1ma6(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75534);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75535);assertSame(PeriodFormat.wordBased(DA), PeriodFormat.wordBased(DA));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // wordBased(Locale ja)
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_ja_formatMultiple() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148vtbh1ma8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_formatMultiple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148vtbh1ma8(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75536);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75537);Period p = new Period(2, 3, 4, 2, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75538);assertEquals("2\u5e743\u304b\u67084\u9031\u95932\u65e55\u6642\u95936\u52067\u79d28\u30df\u30ea\u79d2", PeriodFormat.wordBased(JA).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_ja_formatSingular() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzdb0a1mab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_formatSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzdb0a1mab(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75539);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75540);Period p = new Period(1, 1, 1, 1, 1, 1, 1, 1);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75541);assertEquals("1\u5e741\u304b\u67081\u9031\u95931\u65e51\u6642\u95931\u52061\u79d21\u30df\u30ea\u79d2", PeriodFormat.wordBased(JA).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_ja_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc0qjy1mae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc0qjy1mae(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75542);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75543);assertSame(PeriodFormat.wordBased(JA), PeriodFormat.wordBased(JA));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_ja_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eu1itl1mag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eu1itl1mag(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75544);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75545);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75546);assertEquals(p, PeriodFormat.wordBased(JA).parsePeriod("2\u65e5"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_ja_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy7lky1maj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy7lky1maj(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75547);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75548);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75549);assertEquals(p, PeriodFormat.wordBased(JA).parsePeriod("2\u65e55\u6642\u9593"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_ja_checkRedundantSeparator() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmzd4y1mam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ja_checkRedundantSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmzd4y1mam(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75550);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75551);try {
            // Spaces are not valid separators in Japanese
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75552);PeriodFormat.wordBased(JA).parsePeriod("2\u65e5 ");
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75553);fail("No exception was caught");
        } catch (Exception e) {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75554);assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    // wordBased(new Locale("pl")
    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jgt0l1mar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jgt0l1mar(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75555);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75556);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75557);assertEquals("1 dzie\u0144, 5 godzin, 6 minut, 7 sekund i 8 milisekund", PeriodFormat.wordBased(PL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pak6he1mau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75558,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pak6he1mau(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75558);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75559);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75560);assertEquals("2 dni", PeriodFormat.wordBased(PL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qf3i8b1max();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qf3i8b1max(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75561);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75562);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75563);assertEquals("2 dni i 5 godzin", PeriodFormat.wordBased(PL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k1u8z21mb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k1u8z21mb0(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75564);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75565);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75566);assertEquals(p, PeriodFormat.wordBased(PL).parsePeriod("2 dni"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bap6tj1mb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bap6tj1mb3(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75567);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75568);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75569);assertEquals(p, PeriodFormat.wordBased(PL).parsePeriod("2 dni i 5 godzin"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_checkRedundantSeparator() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0mzxj1mb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_checkRedundantSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0mzxj1mb6(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75570);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75571);try {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75572);PeriodFormat.wordBased(PL).parsePeriod("2 dni and 5 godzin ");
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75573);fail("No exception was caught");
        } catch (Exception e) {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75574);assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j51tbd1mbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j51tbd1mbb(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75575);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75576);assertSame(PeriodFormat.wordBased(PL), PeriodFormat.wordBased(PL));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_pl_regEx() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vr8pxq1mbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_regEx",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vr8pxq1mbd(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75577);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75578);PeriodFormatter pf = PeriodFormat.wordBased(PL);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75579);assertEquals("1 rok", pf.print(Period.years(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75580);assertEquals("2 lata", pf.print(Period.years(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75581);assertEquals("5 lat", pf.print(Period.years(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75582);assertEquals("12 lat", pf.print(Period.years(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75583);assertEquals("15 lat", pf.print(Period.years(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75584);assertEquals("1112 lat", pf.print(Period.years(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75585);assertEquals("1115 lat", pf.print(Period.years(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75586);assertEquals("2112 lat", pf.print(Period.years(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75587);assertEquals("2115 lat", pf.print(Period.years(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75588);assertEquals("2212 lat", pf.print(Period.years(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75589);assertEquals("2215 lat", pf.print(Period.years(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75590);assertEquals("22 lata", pf.print(Period.years(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75591);assertEquals("25 lat", pf.print(Period.years(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75592);assertEquals("1122 lata", pf.print(Period.years(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75593);assertEquals("1125 lat", pf.print(Period.years(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75594);assertEquals("2122 lata", pf.print(Period.years(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75595);assertEquals("2125 lat", pf.print(Period.years(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75596);assertEquals("2222 lata", pf.print(Period.years(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75597);assertEquals("2225 lat", pf.print(Period.years(2225)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75598);assertEquals("1 miesi\u0105c", pf.print(Period.months(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75599);assertEquals("2 miesi\u0105ce", pf.print(Period.months(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75600);assertEquals("5 miesi\u0119cy", pf.print(Period.months(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75601);assertEquals("12 miesi\u0119cy", pf.print(Period.months(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75602);assertEquals("15 miesi\u0119cy", pf.print(Period.months(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75603);assertEquals("1112 miesi\u0119cy", pf.print(Period.months(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75604);assertEquals("1115 miesi\u0119cy", pf.print(Period.months(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75605);assertEquals("2112 miesi\u0119cy", pf.print(Period.months(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75606);assertEquals("2115 miesi\u0119cy", pf.print(Period.months(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75607);assertEquals("2212 miesi\u0119cy", pf.print(Period.months(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75608);assertEquals("2215 miesi\u0119cy", pf.print(Period.months(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75609);assertEquals("22 miesi\u0105ce", pf.print(Period.months(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75610);assertEquals("25 miesi\u0119cy", pf.print(Period.months(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75611);assertEquals("1122 miesi\u0105ce", pf.print(Period.months(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75612);assertEquals("1125 miesi\u0119cy", pf.print(Period.months(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75613);assertEquals("2122 miesi\u0105ce", pf.print(Period.months(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75614);assertEquals("2125 miesi\u0119cy", pf.print(Period.months(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75615);assertEquals("2222 miesi\u0105ce", pf.print(Period.months(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75616);assertEquals("2225 miesi\u0119cy", pf.print(Period.months(2225)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75617);assertEquals("1 tydzie\u0144", pf.print(Period.weeks(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75618);assertEquals("2 tygodnie", pf.print(Period.weeks(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75619);assertEquals("5 tygodni", pf.print(Period.weeks(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75620);assertEquals("12 tygodni", pf.print(Period.weeks(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75621);assertEquals("15 tygodni", pf.print(Period.weeks(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75622);assertEquals("1112 tygodni", pf.print(Period.weeks(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75623);assertEquals("1115 tygodni", pf.print(Period.weeks(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75624);assertEquals("2112 tygodni", pf.print(Period.weeks(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75625);assertEquals("2115 tygodni", pf.print(Period.weeks(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75626);assertEquals("2212 tygodni", pf.print(Period.weeks(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75627);assertEquals("2215 tygodni", pf.print(Period.weeks(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75628);assertEquals("22 tygodnie", pf.print(Period.weeks(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75629);assertEquals("25 tygodni", pf.print(Period.weeks(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75630);assertEquals("1122 tygodnie", pf.print(Period.weeks(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75631);assertEquals("1125 tygodni", pf.print(Period.weeks(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75632);assertEquals("2122 tygodnie", pf.print(Period.weeks(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75633);assertEquals("2125 tygodni", pf.print(Period.weeks(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75634);assertEquals("2222 tygodnie", pf.print(Period.weeks(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75635);assertEquals("2225 tygodni", pf.print(Period.weeks(2225)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75636);assertEquals("1 dzie\u0144", pf.print(Period.days(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75637);assertEquals("2 dni", pf.print(Period.days(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75638);assertEquals("5 dni", pf.print(Period.days(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75639);assertEquals("12 dni", pf.print(Period.days(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75640);assertEquals("15 dni", pf.print(Period.days(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75641);assertEquals("22 dni", pf.print(Period.days(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75642);assertEquals("25 dni", pf.print(Period.days(25)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75643);assertEquals("1 godzina", pf.print(Period.hours(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75644);assertEquals("2 godziny", pf.print(Period.hours(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75645);assertEquals("5 godzin", pf.print(Period.hours(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75646);assertEquals("12 godzin", pf.print(Period.hours(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75647);assertEquals("15 godzin", pf.print(Period.hours(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75648);assertEquals("1112 godzin", pf.print(Period.hours(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75649);assertEquals("1115 godzin", pf.print(Period.hours(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75650);assertEquals("2112 godzin", pf.print(Period.hours(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75651);assertEquals("2115 godzin", pf.print(Period.hours(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75652);assertEquals("2212 godzin", pf.print(Period.hours(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75653);assertEquals("2215 godzin", pf.print(Period.hours(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75654);assertEquals("22 godziny", pf.print(Period.hours(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75655);assertEquals("25 godzin", pf.print(Period.hours(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75656);assertEquals("1122 godziny", pf.print(Period.hours(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75657);assertEquals("1125 godzin", pf.print(Period.hours(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75658);assertEquals("2122 godziny", pf.print(Period.hours(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75659);assertEquals("2125 godzin", pf.print(Period.hours(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75660);assertEquals("2222 godziny", pf.print(Period.hours(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75661);assertEquals("2225 godzin", pf.print(Period.hours(2225)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75662);assertEquals("1 minuta", pf.print(Period.minutes(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75663);assertEquals("2 minuty", pf.print(Period.minutes(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75664);assertEquals("5 minut", pf.print(Period.minutes(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75665);assertEquals("12 minut", pf.print(Period.minutes(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75666);assertEquals("15 minut", pf.print(Period.minutes(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75667);assertEquals("1112 minut", pf.print(Period.minutes(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75668);assertEquals("1115 minut", pf.print(Period.minutes(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75669);assertEquals("2112 minut", pf.print(Period.minutes(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75670);assertEquals("2115 minut", pf.print(Period.minutes(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75671);assertEquals("2212 minut", pf.print(Period.minutes(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75672);assertEquals("2215 minut", pf.print(Period.minutes(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75673);assertEquals("22 minuty", pf.print(Period.minutes(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75674);assertEquals("25 minut", pf.print(Period.minutes(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75675);assertEquals("1122 minuty", pf.print(Period.minutes(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75676);assertEquals("1125 minut", pf.print(Period.minutes(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75677);assertEquals("2122 minuty", pf.print(Period.minutes(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75678);assertEquals("2125 minut", pf.print(Period.minutes(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75679);assertEquals("2222 minuty", pf.print(Period.minutes(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75680);assertEquals("2225 minut", pf.print(Period.minutes(2225)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75681);assertEquals("1 sekunda", pf.print(Period.seconds(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75682);assertEquals("2 sekundy", pf.print(Period.seconds(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75683);assertEquals("5 sekund", pf.print(Period.seconds(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75684);assertEquals("12 sekund", pf.print(Period.seconds(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75685);assertEquals("15 sekund", pf.print(Period.seconds(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75686);assertEquals("1112 sekund", pf.print(Period.seconds(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75687);assertEquals("1115 sekund", pf.print(Period.seconds(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75688);assertEquals("2112 sekund", pf.print(Period.seconds(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75689);assertEquals("2115 sekund", pf.print(Period.seconds(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75690);assertEquals("2212 sekund", pf.print(Period.seconds(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75691);assertEquals("2215 sekund", pf.print(Period.seconds(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75692);assertEquals("22 sekundy", pf.print(Period.seconds(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75693);assertEquals("25 sekund", pf.print(Period.seconds(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75694);assertEquals("1122 sekundy", pf.print(Period.seconds(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75695);assertEquals("1125 sekund", pf.print(Period.seconds(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75696);assertEquals("2122 sekundy", pf.print(Period.seconds(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75697);assertEquals("2125 sekund", pf.print(Period.seconds(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75698);assertEquals("2222 sekundy", pf.print(Period.seconds(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75699);assertEquals("2225 sekund", pf.print(Period.seconds(2225)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75700);assertEquals("1 milisekunda", pf.print(Period.millis(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75701);assertEquals("2 milisekundy", pf.print(Period.millis(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75702);assertEquals("5 milisekund", pf.print(Period.millis(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75703);assertEquals("12 milisekund", pf.print(Period.millis(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75704);assertEquals("15 milisekund", pf.print(Period.millis(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75705);assertEquals("1112 milisekund", pf.print(Period.millis(1112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75706);assertEquals("1115 milisekund", pf.print(Period.millis(1115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75707);assertEquals("2112 milisekund", pf.print(Period.millis(2112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75708);assertEquals("2115 milisekund", pf.print(Period.millis(2115)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75709);assertEquals("2212 milisekund", pf.print(Period.millis(2212)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75710);assertEquals("2215 milisekund", pf.print(Period.millis(2215)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75711);assertEquals("22 milisekundy", pf.print(Period.millis(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75712);assertEquals("25 milisekund", pf.print(Period.millis(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75713);assertEquals("1122 milisekundy", pf.print(Period.millis(1122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75714);assertEquals("1125 milisekund", pf.print(Period.millis(1125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75715);assertEquals("2122 milisekundy", pf.print(Period.millis(2122)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75716);assertEquals("2125 milisekund", pf.print(Period.millis(2125)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75717);assertEquals("2222 milisekundy", pf.print(Period.millis(2222)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75718);assertEquals("2225 milisekund", pf.print(Period.millis(2225)));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    // wordBased(new Locale("bg")
    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_bg_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r29nhq1mfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_bg_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r29nhq1mfb(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75719);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75720);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75721);assertEquals("1 \u0434\u0435\u043d, 5 \u0447\u0430\u0441\u0430, 6 \u043c\u0438\u043d\u0443\u0442\u0438, 7 \u0441\u0435\u043a\u0443\u043d\u0434\u0438 \u0438 8 \u043c\u0438\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0438", PeriodFormat.wordBased(BG).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    // wordBased(new Locale("cs")
    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_cs_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tiavfr1mfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_cs_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tiavfr1mfe(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75722);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75723);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75724);assertEquals("1 den, 5 hodin, 6 minut, 7 sekund a 8 milisekund", PeriodFormat.wordBased(CS).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    // wordBased(new Locale("ru")
    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_formatStandard() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jhlhw41mfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_formatStandard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jhlhw41mfh(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75725);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75726);Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75727);assertEquals("1 \u0433\u043e\u0434, 2 \u043c\u0435\u0441\u044f\u0446\u0430, 3 \u043d\u0435\u0434\u0435\u043b\u0438, 4 \u0434\u043d\u044f, 5 \u0447\u0430\u0441\u043e\u0432, 6 \u043c\u0438\u043d\u0443\u0442, 7 \u0441\u0435\u043a\u0443\u043d\u0434 \u0438 8 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", PeriodFormat.wordBased(RU).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_FormatOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lphkl11mfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_FormatOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lphkl11mfk(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75728);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75729);Period p = Period.days(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75730);assertEquals("2 \u0434\u043d\u044f", PeriodFormat.wordBased(RU).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_formatTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186rc641mfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_formatTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186rc641mfn(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75731);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75732);Period p = Period.years(1).withMonths(2);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75733);assertEquals("1 \u0433\u043e\u0434 \u0438 2 \u043c\u0435\u0441\u044f\u0446\u0430", PeriodFormat.wordBased(RU).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_parseOneField() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rp7hn91mfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_parseOneField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rp7hn91mfq(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75734);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75735);Period p = Period.years(1);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75736);assertEquals(p, PeriodFormat.wordBased(RU).parsePeriod("1 \u0433\u043e\u0434"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_parseTwoFields() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqd4361mft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_parseTwoFields",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqd4361mft(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75737);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75738);Period p = Period.hours(1).withMillis(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75739);assertEquals(p, PeriodFormat.wordBased(RU).parsePeriod("1 \u0447\u0430\u0441 \u0438 5 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434"));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_checkRedundantSeparator() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1meeeha1mfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_checkRedundantSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1meeeha1mfw(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75740);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75741);try {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75742);PeriodFormat.wordBased(RU).parsePeriod("2 \u0434\u043d\u044f and 5 \u043c\u0438\u043d\u0443\u0442");
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75743);fail("No exception was caught");
        } catch (Exception e) {
            __CLR4_4_11m0b1m0blgchot1f.R.inc(75744);assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_cached() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178zqu61mg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_cached",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178zqu61mg1(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75745);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75746);assertSame(PeriodFormat.wordBased(RU), PeriodFormat.wordBased(RU));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test_wordBased_ru_regEx() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_181owp71mg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_ru_regEx",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_181owp71mg3(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75747);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75748);PeriodFormatter pf = PeriodFormat.wordBased(RU);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75749);assertEquals("1 \u0433\u043e\u0434", pf.print(Period.years(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75750);assertEquals("11 \u043b\u0435\u0442", pf.print(Period.years(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75751);assertEquals("21 \u0433\u043e\u0434", pf.print(Period.years(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75752);assertEquals("101 \u0433\u043e\u0434", pf.print(Period.years(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75753);assertEquals("111 \u043b\u0435\u0442", pf.print(Period.years(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75754);assertEquals("121 \u0433\u043e\u0434", pf.print(Period.years(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75755);assertEquals("2001 \u0433\u043e\u0434", pf.print(Period.years(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75756);assertEquals("2 \u0433\u043e\u0434\u0430", pf.print(Period.years(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75757);assertEquals("3 \u0433\u043e\u0434\u0430", pf.print(Period.years(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75758);assertEquals("4 \u0433\u043e\u0434\u0430", pf.print(Period.years(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75759);assertEquals("12 \u043b\u0435\u0442", pf.print(Period.years(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75760);assertEquals("13 \u043b\u0435\u0442", pf.print(Period.years(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75761);assertEquals("14 \u043b\u0435\u0442", pf.print(Period.years(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75762);assertEquals("22 \u0433\u043e\u0434\u0430", pf.print(Period.years(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75763);assertEquals("23 \u0433\u043e\u0434\u0430", pf.print(Period.years(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75764);assertEquals("24 \u0433\u043e\u0434\u0430", pf.print(Period.years(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75765);assertEquals("102 \u0433\u043e\u0434\u0430", pf.print(Period.years(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75766);assertEquals("112 \u043b\u0435\u0442", pf.print(Period.years(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75767);assertEquals("124 \u0433\u043e\u0434\u0430", pf.print(Period.years(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75768);assertEquals("5 \u043b\u0435\u0442", pf.print(Period.years(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75769);assertEquals("15 \u043b\u0435\u0442", pf.print(Period.years(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75770);assertEquals("25 \u043b\u0435\u0442", pf.print(Period.years(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75771);assertEquals("105 \u043b\u0435\u0442", pf.print(Period.years(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75772);assertEquals("1005 \u043b\u0435\u0442", pf.print(Period.years(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75773);assertEquals("1 \u043c\u0435\u0441\u044f\u0446", pf.print(Period.months(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75774);assertEquals("11 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75775);assertEquals("21 \u043c\u0435\u0441\u044f\u0446", pf.print(Period.months(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75776);assertEquals("101 \u043c\u0435\u0441\u044f\u0446", pf.print(Period.months(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75777);assertEquals("111 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75778);assertEquals("121 \u043c\u0435\u0441\u044f\u0446", pf.print(Period.months(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75779);assertEquals("2001 \u043c\u0435\u0441\u044f\u0446", pf.print(Period.months(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75780);assertEquals("2 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75781);assertEquals("3 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75782);assertEquals("4 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75783);assertEquals("12 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75784);assertEquals("13 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75785);assertEquals("14 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75786);assertEquals("22 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75787);assertEquals("23 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75788);assertEquals("24 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75789);assertEquals("102 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75790);assertEquals("112 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75791);assertEquals("124 \u043c\u0435\u0441\u044f\u0446\u0430", pf.print(Period.months(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75792);assertEquals("5 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75793);assertEquals("15 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75794);assertEquals("25 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75795);assertEquals("105 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75796);assertEquals("1005 \u043c\u0435\u0441\u044f\u0446\u0435\u0432", pf.print(Period.months(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75797);assertEquals("1 \u043d\u0435\u0434\u0435\u043b\u044f", pf.print(Period.weeks(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75798);assertEquals("11 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75799);assertEquals("21 \u043d\u0435\u0434\u0435\u043b\u044f", pf.print(Period.weeks(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75800);assertEquals("101 \u043d\u0435\u0434\u0435\u043b\u044f", pf.print(Period.weeks(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75801);assertEquals("111 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75802);assertEquals("121 \u043d\u0435\u0434\u0435\u043b\u044f", pf.print(Period.weeks(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75803);assertEquals("2001 \u043d\u0435\u0434\u0435\u043b\u044f", pf.print(Period.weeks(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75804);assertEquals("2 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75805);assertEquals("3 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75806);assertEquals("4 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75807);assertEquals("12 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75808);assertEquals("13 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75809);assertEquals("14 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75810);assertEquals("22 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75811);assertEquals("23 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75812);assertEquals("24 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75813);assertEquals("102 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75814);assertEquals("112 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75815);assertEquals("124 \u043d\u0435\u0434\u0435\u043b\u0438", pf.print(Period.weeks(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75816);assertEquals("5 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75817);assertEquals("15 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75818);assertEquals("25 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75819);assertEquals("105 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75820);assertEquals("1005 \u043d\u0435\u0434\u0435\u043b\u044c", pf.print(Period.weeks(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75821);assertEquals("1 \u0434\u0435\u043d\u044c", pf.print(Period.days(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75822);assertEquals("11 \u0434\u043d\u0435\u0439", pf.print(Period.days(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75823);assertEquals("21 \u0434\u0435\u043d\u044c", pf.print(Period.days(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75824);assertEquals("101 \u0434\u0435\u043d\u044c", pf.print(Period.days(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75825);assertEquals("111 \u0434\u043d\u0435\u0439", pf.print(Period.days(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75826);assertEquals("121 \u0434\u0435\u043d\u044c", pf.print(Period.days(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75827);assertEquals("2001 \u0434\u0435\u043d\u044c", pf.print(Period.days(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75828);assertEquals("2 \u0434\u043d\u044f", pf.print(Period.days(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75829);assertEquals("3 \u0434\u043d\u044f", pf.print(Period.days(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75830);assertEquals("4 \u0434\u043d\u044f", pf.print(Period.days(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75831);assertEquals("12 \u0434\u043d\u0435\u0439", pf.print(Period.days(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75832);assertEquals("13 \u0434\u043d\u0435\u0439", pf.print(Period.days(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75833);assertEquals("14 \u0434\u043d\u0435\u0439", pf.print(Period.days(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75834);assertEquals("22 \u0434\u043d\u044f", pf.print(Period.days(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75835);assertEquals("23 \u0434\u043d\u044f", pf.print(Period.days(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75836);assertEquals("24 \u0434\u043d\u044f", pf.print(Period.days(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75837);assertEquals("102 \u0434\u043d\u044f", pf.print(Period.days(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75838);assertEquals("112 \u0434\u043d\u0435\u0439", pf.print(Period.days(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75839);assertEquals("124 \u0434\u043d\u044f", pf.print(Period.days(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75840);assertEquals("5 \u0434\u043d\u0435\u0439", pf.print(Period.days(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75841);assertEquals("15 \u0434\u043d\u0435\u0439", pf.print(Period.days(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75842);assertEquals("25 \u0434\u043d\u0435\u0439", pf.print(Period.days(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75843);assertEquals("105 \u0434\u043d\u0435\u0439", pf.print(Period.days(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75844);assertEquals("1005 \u0434\u043d\u0435\u0439", pf.print(Period.days(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75845);assertEquals("1 \u0447\u0430\u0441", pf.print(Period.hours(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75846);assertEquals("11 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75847);assertEquals("21 \u0447\u0430\u0441", pf.print(Period.hours(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75848);assertEquals("101 \u0447\u0430\u0441", pf.print(Period.hours(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75849);assertEquals("111 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75850);assertEquals("121 \u0447\u0430\u0441", pf.print(Period.hours(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75851);assertEquals("2001 \u0447\u0430\u0441", pf.print(Period.hours(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75852);assertEquals("2 \u0447\u0430\u0441\u0430", pf.print(Period.hours(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75853);assertEquals("3 \u0447\u0430\u0441\u0430", pf.print(Period.hours(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75854);assertEquals("4 \u0447\u0430\u0441\u0430", pf.print(Period.hours(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75855);assertEquals("12 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75856);assertEquals("13 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75857);assertEquals("14 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75858);assertEquals("22 \u0447\u0430\u0441\u0430", pf.print(Period.hours(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75859);assertEquals("23 \u0447\u0430\u0441\u0430", pf.print(Period.hours(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75860);assertEquals("24 \u0447\u0430\u0441\u0430", pf.print(Period.hours(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75861);assertEquals("102 \u0447\u0430\u0441\u0430", pf.print(Period.hours(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75862);assertEquals("112 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75863);assertEquals("124 \u0447\u0430\u0441\u0430", pf.print(Period.hours(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75864);assertEquals("5 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75865);assertEquals("15 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75866);assertEquals("25 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75867);assertEquals("105 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75868);assertEquals("1005 \u0447\u0430\u0441\u043e\u0432", pf.print(Period.hours(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75869);assertEquals("1 \u043c\u0438\u043d\u0443\u0442\u0430", pf.print(Period.minutes(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75870);assertEquals("11 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75871);assertEquals("21 \u043c\u0438\u043d\u0443\u0442\u0430", pf.print(Period.minutes(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75872);assertEquals("101 \u043c\u0438\u043d\u0443\u0442\u0430", pf.print(Period.minutes(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75873);assertEquals("111 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75874);assertEquals("121 \u043c\u0438\u043d\u0443\u0442\u0430", pf.print(Period.minutes(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75875);assertEquals("2001 \u043c\u0438\u043d\u0443\u0442\u0430", pf.print(Period.minutes(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75876);assertEquals("2 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75877);assertEquals("3 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75878);assertEquals("4 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75879);assertEquals("12 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75880);assertEquals("13 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75881);assertEquals("14 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75882);assertEquals("22 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75883);assertEquals("23 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75884);assertEquals("24 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75885);assertEquals("102 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75886);assertEquals("112 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75887);assertEquals("124 \u043c\u0438\u043d\u0443\u0442\u044b", pf.print(Period.minutes(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75888);assertEquals("5 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75889);assertEquals("15 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75890);assertEquals("25 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75891);assertEquals("105 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75892);assertEquals("1005 \u043c\u0438\u043d\u0443\u0442", pf.print(Period.minutes(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75893);assertEquals("1 \u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.seconds(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75894);assertEquals("11 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75895);assertEquals("21 \u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.seconds(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75896);assertEquals("101 \u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.seconds(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75897);assertEquals("111 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75898);assertEquals("121 \u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.seconds(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75899);assertEquals("2001 \u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.seconds(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75900);assertEquals("2 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75901);assertEquals("3 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75902);assertEquals("4 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75903);assertEquals("12 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75904);assertEquals("13 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75905);assertEquals("14 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75906);assertEquals("22 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75907);assertEquals("23 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75908);assertEquals("24 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75909);assertEquals("102 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75910);assertEquals("112 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75911);assertEquals("124 \u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.seconds(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75912);assertEquals("5 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75913);assertEquals("15 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75914);assertEquals("25 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75915);assertEquals("105 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75916);assertEquals("1005 \u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.seconds(1005)));

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75917);assertEquals("1 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.millis(1)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75918);assertEquals("11 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(11)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75919);assertEquals("21 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.millis(21)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75920);assertEquals("101 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.millis(101)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75921);assertEquals("111 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(111)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75922);assertEquals("121 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.millis(121)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75923);assertEquals("2001 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0430", pf.print(Period.millis(2001)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75924);assertEquals("2 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(2)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75925);assertEquals("3 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(3)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75926);assertEquals("4 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(4)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75927);assertEquals("12 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(12)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75928);assertEquals("13 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(13)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75929);assertEquals("14 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(14)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75930);assertEquals("22 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(22)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75931);assertEquals("23 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(23)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75932);assertEquals("24 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(24)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75933);assertEquals("102 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(102)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75934);assertEquals("112 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(112)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75935);assertEquals("124 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b", pf.print(Period.millis(124)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75936);assertEquals("5 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(5)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75937);assertEquals("15 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(15)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75938);assertEquals("25 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(25)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75939);assertEquals("105 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(105)));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75940);assertEquals("1005 \u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434", pf.print(Period.millis(1005)));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Cross check languages
    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_fr_from_de() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12u3dhp1mlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_from_de",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12u3dhp1mlh(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75941);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75942);Locale.setDefault(DE);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75943);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75944);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBased_fr_from_nl() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdw3fa1mll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_fr_from_nl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdw3fa1mll(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75945);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75946);Locale.setDefault(NL);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75947);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75948);assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBased_en_from_de() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1623f061mlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_en_from_de",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1623f061mlp(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75949);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75950);Locale.setDefault(DE);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75951);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75952);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.wordBased(EN).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBased_en_from_nl() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tr161z1mlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_en_from_nl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tr161z1mlt(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75953);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75954);Locale.setDefault(NL);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75955);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75956);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.wordBased(EN).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBased_en_from_pl() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5mx5x1mlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_en_from_pl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5mx5x1mlx(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75957);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75958);Locale.setDefault(PL);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75959);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75960);assertEquals("1 day, 5 hours, 6 minutes, 7 seconds and 8 milliseconds", PeriodFormat.wordBased(EN).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBased_pl_from_fr() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136jxuw1mm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_pl_from_fr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136jxuw1mm1(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75961);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75962);Locale.setDefault(FR);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75963);Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75964);assertEquals("1 dzie\u0144, 5 godzin, 6 minut, 7 sekund i 8 milisekund", PeriodFormat.wordBased(PL).print(p));
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_getDefault_localeValue() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15t8q11mm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_getDefault_localeValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15t8q11mm5(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75965);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75966);PeriodFormatter pf = PeriodFormat.getDefault();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75967);assertEquals(Locale.ENGLISH, pf.getLocale());
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBased_localeValue() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o29taz1mm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_localeValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o29taz1mm8(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75968);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75969);PeriodFormatter pf = PeriodFormat.wordBased();
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75970);assertEquals(DE, pf.getLocale());
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    @Test
    public void test_wordBasedWithLocale_localeValue() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pzoy9n1mmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBasedWithLocale_localeValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pzoy9n1mmb(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75971);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75972);PeriodFormatter pf = PeriodFormat.wordBased(FR);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75973);assertEquals(FR, pf.getLocale());
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_wordBased_en_withLocale_pt() {__CLR4_4_11m0b1m0blgchot1f.R.globalSliceStart(getClass().getName(),75974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13y038p1mme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11m0b1m0blgchot1f.R.rethrow($CLV_t2$);}finally{__CLR4_4_11m0b1m0blgchot1f.R.globalSliceEnd(getClass().getName(),"org.joda.time.format.TestPeriodFormat.test_wordBased_en_withLocale_pt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13y038p1mme(){try{__CLR4_4_11m0b1m0blgchot1f.R.inc(75974);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75975);Period p = Period.days(2).withHours(5);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75976);PeriodFormatter format1 = PeriodFormat.wordBased(EN);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75977);assertEquals("2 days and 5 hours", format1.print(p));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75978);assertEquals(p, format1.parsePeriod("2 days and 5 hours"));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75979);assertEquals(EN, format1.getLocale());

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75980);PeriodFormatter format2 = format1.withLocale(PT);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75981);assertEquals("2 dias e 5 horas", format2.print(p));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75982);assertEquals(p, format2.parsePeriod("2 dias e 5 horas"));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75983);assertEquals(PT, format2.getLocale());

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75984);PeriodFormatter format3 = format1.withLocale(DE);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75985);assertEquals("2 Tage und 5 Stunden", format3.print(p));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75986);assertEquals(p, format3.parsePeriod("2 Tage und 5 Stunden"));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75987);assertEquals(DE, format3.getLocale());

        __CLR4_4_11m0b1m0blgchot1f.R.inc(75988);PeriodFormatter format4 = format1.withLocale(null);
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75989);assertEquals("2 days and 5 hours", format4.print(p));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75990);assertEquals(p, format4.parsePeriod("2 days and 5 hours"));
        __CLR4_4_11m0b1m0blgchot1f.R.inc(75991);assertEquals(null, format4.getLocale());
    }finally{__CLR4_4_11m0b1m0blgchot1f.R.flushNeeded();}}

}
