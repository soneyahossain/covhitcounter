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

/**
 * Utility methods used by formatters.
 * <p>
 * FormatUtils is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public class FormatUtils {public static class __CLR4_4_1dovdovlgchor3q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u006d\u0065\u0064\u0069\u0061\u002f\u0073\u006f\u006e\u0065\u0079\u0061\u002f\u0065\u0078\u0074\u0072\u0061\u0064\u0072\u0069\u0076\u0065\u0031\u002f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u0068\u0069\u0074\u0063\u006f\u0075\u006e\u0074\u0065\u0072\u002f\u0073\u0072\u0063\u002f\u0074\u0065\u0073\u0074\u002f\u0072\u0065\u0073\u006f\u0075\u0072\u0063\u0065\u0073\u002f\u006a\u006f\u0064\u0061\u002d\u0074\u0069\u006d\u0065\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1681231264416L,8589935092L,18008,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final double LOG_10 = Math.log(10);

    /**
     * Restricted constructor.
     */
    private FormatUtils() {try{__CLR4_4_1dovdovlgchor3q.R.inc(17743);
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf   receives integer converted to a string
     * @param value value to convert to a string
     * @param size  minimum amount of digits to append
     */
    public static void appendPaddedInteger(StringBuffer buf, int value, int size) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17744);
        __CLR4_4_1dovdovlgchor3q.R.inc(17745);try {
            __CLR4_4_1dovdovlgchor3q.R.inc(17746);appendPaddedInteger((Appendable) buf, value, size);
        } catch (IOException e) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and appends it to the given appendable.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param appenadble receives integer converted to a string
     * @param value      value to convert to a string
     * @param size       minimum amount of digits to append
     * @since 2.4
     */
    public static void appendPaddedInteger(Appendable appenadble, int value, int size) throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17747);
        __CLR4_4_1dovdovlgchor3q.R.inc(17748);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17749)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17750)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17751);appenadble.append('-');
            __CLR4_4_1dovdovlgchor3q.R.inc(17752);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17753)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17754)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17755);value = -value;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17756);for (; (((size > 10)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17757)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17758)==0&false)); size--) {{
                    __CLR4_4_1dovdovlgchor3q.R.inc(17759);appenadble.append('0');
                }
                }__CLR4_4_1dovdovlgchor3q.R.inc(17760);appenadble.append("" + -(long) Integer.MIN_VALUE);
                __CLR4_4_1dovdovlgchor3q.R.inc(17761);return;
            }
        }}
        }__CLR4_4_1dovdovlgchor3q.R.inc(17762);if ((((value < 10)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17763)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17764)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17765);for (; (((size > 1)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17766)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17767)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17768);appenadble.append('0');
            }
            }__CLR4_4_1dovdovlgchor3q.R.inc(17769);appenadble.append((char) (value + '0'));
        } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17770);if ((((value < 100)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17771)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17772)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17773);for (; (((size > 2)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17774)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17775)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17776);appenadble.append('0');
            }
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            }__CLR4_4_1dovdovlgchor3q.R.inc(17777);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dovdovlgchor3q.R.inc(17778);appenadble.append((char) (d + '0'));
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dovdovlgchor3q.R.inc(17779);appenadble.append((char) (value - (d << 3) - (d << 1) + '0'));
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17780);int digits;
            __CLR4_4_1dovdovlgchor3q.R.inc(17781);if ((((value < 1000)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17782)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17783)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17784);digits = 3;
            } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17785);if ((((value < 10000)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17786)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17787)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17788);digits = 4;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17789);digits = (int) (Math.log(value) / LOG_10) + 1;
            }
            }}__CLR4_4_1dovdovlgchor3q.R.inc(17790);for (; (((size > digits)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17791)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17792)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17793);appenadble.append('0');
            }
            }__CLR4_4_1dovdovlgchor3q.R.inc(17794);appenadble.append(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf   receives integer converted to a string
     * @param value value to convert to a string
     * @param size  minimum amount of digits to append
     */
    public static void appendPaddedInteger(StringBuffer buf, long value, int size) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17795);
        __CLR4_4_1dovdovlgchor3q.R.inc(17796);try {
            __CLR4_4_1dovdovlgchor3q.R.inc(17797);appendPaddedInteger((Appendable) buf, value, size);
        } catch (IOException e) {
            // StringBuffer does not throw IOException
        }
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param appendable receives integer converted to a string
     * @param value      value to convert to a string
     * @param size       minimum amount of digits to append
     * @since 2.4
     */
    public static void appendPaddedInteger(Appendable appendable, long value, int size) throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17798);
        __CLR4_4_1dovdovlgchor3q.R.inc(17799);int intValue = (int) value;
        __CLR4_4_1dovdovlgchor3q.R.inc(17800);if ((((intValue == value)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17801)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17802)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17803);appendPaddedInteger(appendable, intValue, size);
        } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17804);if ((((size <= 19)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17805)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17806)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17807);appendable.append(Long.toString(value));
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17808);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17809)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17810)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17811);appendable.append('-');
                __CLR4_4_1dovdovlgchor3q.R.inc(17812);if ((((value != Long.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17813)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17814)==0&false))) {{
                    __CLR4_4_1dovdovlgchor3q.R.inc(17815);value = -value;
                } }else {{
                    __CLR4_4_1dovdovlgchor3q.R.inc(17816);for (; (((size > 19)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17817)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17818)==0&false)); size--) {{
                        __CLR4_4_1dovdovlgchor3q.R.inc(17819);appendable.append('0');
                    }
                    }__CLR4_4_1dovdovlgchor3q.R.inc(17820);appendable.append("9223372036854775808");
                    __CLR4_4_1dovdovlgchor3q.R.inc(17821);return;
                }
            }}
            }__CLR4_4_1dovdovlgchor3q.R.inc(17822);int digits = (int) (Math.log(value) / LOG_10) + 1;
            __CLR4_4_1dovdovlgchor3q.R.inc(17823);for (; (((size > digits)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17824)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17825)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17826);appendable.append('0');
            }
            }__CLR4_4_1dovdovlgchor3q.R.inc(17827);appendable.append(Long.toString(value));
        }
    }}}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out   receives integer converted to a string
     * @param value value to convert to a string
     * @param size  minimum amount of digits to append
     */
    public static void writePaddedInteger(Writer out, int value, int size)
            throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17828);
        __CLR4_4_1dovdovlgchor3q.R.inc(17829);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17830)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17831)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17832);out.write('-');
            __CLR4_4_1dovdovlgchor3q.R.inc(17833);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17834)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17835)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17836);value = -value;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17837);for (; (((size > 10)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17838)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17839)==0&false)); size--) {{
                    __CLR4_4_1dovdovlgchor3q.R.inc(17840);out.write('0');
                }
                }__CLR4_4_1dovdovlgchor3q.R.inc(17841);out.write("" + -(long) Integer.MIN_VALUE);
                __CLR4_4_1dovdovlgchor3q.R.inc(17842);return;
            }
        }}
        }__CLR4_4_1dovdovlgchor3q.R.inc(17843);if ((((value < 10)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17844)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17845)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17846);for (; (((size > 1)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17847)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17848)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17849);out.write('0');
            }
            }__CLR4_4_1dovdovlgchor3q.R.inc(17850);out.write(value + '0');
        } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17851);if ((((value < 100)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17852)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17853)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17854);for (; (((size > 2)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17855)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17856)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17857);out.write('0');
            }
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            }__CLR4_4_1dovdovlgchor3q.R.inc(17858);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dovdovlgchor3q.R.inc(17859);out.write(d + '0');
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dovdovlgchor3q.R.inc(17860);out.write(value - (d << 3) - (d << 1) + '0');
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17861);int digits;
            __CLR4_4_1dovdovlgchor3q.R.inc(17862);if ((((value < 1000)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17863)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17864)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17865);digits = 3;
            } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17866);if ((((value < 10000)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17867)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17868)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17869);digits = 4;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17870);digits = (int) (Math.log(value) / LOG_10) + 1;
            }
            }}__CLR4_4_1dovdovlgchor3q.R.inc(17871);for (; (((size > digits)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17872)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17873)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17874);out.write('0');
            }
            }__CLR4_4_1dovdovlgchor3q.R.inc(17875);out.write(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out   receives integer converted to a string
     * @param value value to convert to a string
     * @param size  minimum amount of digits to append
     */
    public static void writePaddedInteger(Writer out, long value, int size)
            throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17876);
        __CLR4_4_1dovdovlgchor3q.R.inc(17877);int intValue = (int) value;
        __CLR4_4_1dovdovlgchor3q.R.inc(17878);if ((((intValue == value)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17879)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17880)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17881);writePaddedInteger(out, intValue, size);
        } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17882);if ((((size <= 19)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17883)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17884)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17885);out.write(Long.toString(value));
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17886);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17887)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17888)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17889);out.write('-');
                __CLR4_4_1dovdovlgchor3q.R.inc(17890);if ((((value != Long.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17891)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17892)==0&false))) {{
                    __CLR4_4_1dovdovlgchor3q.R.inc(17893);value = -value;
                } }else {{
                    __CLR4_4_1dovdovlgchor3q.R.inc(17894);for (; (((size > 19)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17895)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17896)==0&false)); size--) {{
                        __CLR4_4_1dovdovlgchor3q.R.inc(17897);out.write('0');
                    }
                    }__CLR4_4_1dovdovlgchor3q.R.inc(17898);out.write("9223372036854775808");
                    __CLR4_4_1dovdovlgchor3q.R.inc(17899);return;
                }
            }}
            }__CLR4_4_1dovdovlgchor3q.R.inc(17900);int digits = (int) (Math.log(value) / LOG_10) + 1;
            __CLR4_4_1dovdovlgchor3q.R.inc(17901);for (; (((size > digits)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17902)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17903)==0&false)); size--) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17904);out.write('0');
            }
            }__CLR4_4_1dovdovlgchor3q.R.inc(17905);out.write(Long.toString(value));
        }
    }}}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf   receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void appendUnpaddedInteger(StringBuffer buf, int value) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17906);
        __CLR4_4_1dovdovlgchor3q.R.inc(17907);try {
            __CLR4_4_1dovdovlgchor3q.R.inc(17908);appendUnpaddedInteger((Appendable) buf, value);
        } catch (IOException e) {
            // StringBuffer do not throw IOException
        }
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and appends it to the given appendable.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param appendable receives integer converted to a string
     * @param value      value to convert to a string
     * @since 2.4
     */
    public static void appendUnpaddedInteger(Appendable appendable, int value) throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17909);
        __CLR4_4_1dovdovlgchor3q.R.inc(17910);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17911)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17912)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17913);appendable.append('-');
            __CLR4_4_1dovdovlgchor3q.R.inc(17914);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17915)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17916)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17917);value = -value;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17918);appendable.append("" + -(long) Integer.MIN_VALUE);
                __CLR4_4_1dovdovlgchor3q.R.inc(17919);return;
            }
        }}
        }__CLR4_4_1dovdovlgchor3q.R.inc(17920);if ((((value < 10)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17921)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17922)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17923);appendable.append((char) (value + '0'));
        } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17924);if ((((value < 100)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17925)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17926)==0&false))) {{
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            __CLR4_4_1dovdovlgchor3q.R.inc(17927);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dovdovlgchor3q.R.inc(17928);appendable.append((char) (d + '0'));
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dovdovlgchor3q.R.inc(17929);appendable.append((char) (value - (d << 3) - (d << 1) + '0'));
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17930);appendable.append(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf   receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void appendUnpaddedInteger(StringBuffer buf, long value) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17931);
        __CLR4_4_1dovdovlgchor3q.R.inc(17932);try {
            __CLR4_4_1dovdovlgchor3q.R.inc(17933);appendUnpaddedInteger((Appendable) buf, value);
        } catch (IOException e) {
            // StringBuffer do not throw IOException
        }
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and appends it to the given appendable.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param appendable receives integer converted to a string
     * @param value      value to convert to a string
     */
    public static void appendUnpaddedInteger(Appendable appendable, long value) throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17934);
        __CLR4_4_1dovdovlgchor3q.R.inc(17935);int intValue = (int) value;
        __CLR4_4_1dovdovlgchor3q.R.inc(17936);if ((((intValue == value)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17937)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17938)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17939);appendUnpaddedInteger(appendable, intValue);
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17940);appendable.append(Long.toString(value));
        }
    }}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out   receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void writeUnpaddedInteger(Writer out, int value)
            throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17941);
        __CLR4_4_1dovdovlgchor3q.R.inc(17942);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17943)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17944)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17945);out.write('-');
            __CLR4_4_1dovdovlgchor3q.R.inc(17946);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17947)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17948)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17949);value = -value;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17950);out.write("" + -(long) Integer.MIN_VALUE);
                __CLR4_4_1dovdovlgchor3q.R.inc(17951);return;
            }
        }}
        }__CLR4_4_1dovdovlgchor3q.R.inc(17952);if ((((value < 10)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17953)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17954)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17955);out.write(value + '0');
        } }else {__CLR4_4_1dovdovlgchor3q.R.inc(17956);if ((((value < 100)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17957)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17958)==0&false))) {{
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            __CLR4_4_1dovdovlgchor3q.R.inc(17959);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dovdovlgchor3q.R.inc(17960);out.write(d + '0');
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dovdovlgchor3q.R.inc(17961);out.write(value - (d << 3) - (d << 1) + '0');
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17962);out.write(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out   receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void writeUnpaddedInteger(Writer out, long value)
            throws IOException {try{__CLR4_4_1dovdovlgchor3q.R.inc(17963);
        __CLR4_4_1dovdovlgchor3q.R.inc(17964);int intValue = (int) value;
        __CLR4_4_1dovdovlgchor3q.R.inc(17965);if ((((intValue == value)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17966)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17967)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17968);writeUnpaddedInteger(out, intValue);
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17969);out.write(Long.toString(value));
        }
    }}finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    /**
     * Calculates the number of decimal digits for the given value,
     * including the sign.
     */
    public static int calculateDigitCount(long value) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17970);
        __CLR4_4_1dovdovlgchor3q.R.inc(17971);if ((((value < 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17972)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17973)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17974);if ((((value != Long.MIN_VALUE)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17975)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17976)==0&false))) {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17977);return calculateDigitCount(-value) + 1;
            } }else {{
                __CLR4_4_1dovdovlgchor3q.R.inc(17978);return 20;
            }
        }}
        }__CLR4_4_1dovdovlgchor3q.R.inc(17979);return
                ((((value < 10 )&&(__CLR4_4_1dovdovlgchor3q.R.iget(17980)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17981)==0&false))? 1 :
                        ((((value < 100 )&&(__CLR4_4_1dovdovlgchor3q.R.iget(17982)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17983)==0&false))? 2 :
                                ((((value < 1000 )&&(__CLR4_4_1dovdovlgchor3q.R.iget(17984)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17985)==0&false))? 3 :
                                        ((((value < 10000 )&&(__CLR4_4_1dovdovlgchor3q.R.iget(17986)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17987)==0&false))? 4 :
                                                ((int) (Math.log(value) / LOG_10) + 1)))));
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    static int parseTwoDigits(CharSequence text, int position) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17988);
        __CLR4_4_1dovdovlgchor3q.R.inc(17989);int value = text.charAt(position) - '0';
        __CLR4_4_1dovdovlgchor3q.R.inc(17990);return ((value << 3) + (value << 1)) + text.charAt(position + 1) - '0';
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

    static String createErrorMessage(final String text, final int errorPos) {try{__CLR4_4_1dovdovlgchor3q.R.inc(17991);
        __CLR4_4_1dovdovlgchor3q.R.inc(17992);int sampleLen = errorPos + 32;
        __CLR4_4_1dovdovlgchor3q.R.inc(17993);String sampleText;
        __CLR4_4_1dovdovlgchor3q.R.inc(17994);if ((((text.length() <= sampleLen + 3)&&(__CLR4_4_1dovdovlgchor3q.R.iget(17995)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(17996)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17997);sampleText = text;
        } }else {{
            __CLR4_4_1dovdovlgchor3q.R.inc(17998);sampleText = text.substring(0, sampleLen).concat("...");
        }

        }__CLR4_4_1dovdovlgchor3q.R.inc(17999);if ((((errorPos <= 0)&&(__CLR4_4_1dovdovlgchor3q.R.iget(18000)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(18001)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(18002);return "Invalid format: \"" + sampleText + '"';
        }

        }__CLR4_4_1dovdovlgchor3q.R.inc(18003);if ((((errorPos >= text.length())&&(__CLR4_4_1dovdovlgchor3q.R.iget(18004)!=0|true))||(__CLR4_4_1dovdovlgchor3q.R.iget(18005)==0&false))) {{
            __CLR4_4_1dovdovlgchor3q.R.inc(18006);return "Invalid format: \"" + sampleText + "\" is too short";
        }

        }__CLR4_4_1dovdovlgchor3q.R.inc(18007);return "Invalid format: \"" + sampleText + "\" is malformed at \"" +
                sampleText.substring(errorPos) + '"';
    }finally{__CLR4_4_1dovdovlgchor3q.R.flushNeeded();}}

}
