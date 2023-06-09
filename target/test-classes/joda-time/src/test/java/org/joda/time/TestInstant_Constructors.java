/*
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
package org.joda.time;

import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Constructors { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    // 1970-06-09
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    // 1970-04-05
    private long TEST_TIME1 =
            (31L + 28L + 31L + 6L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 12L * DateTimeConstants.MILLIS_PER_HOUR
                    + 24L * DateTimeConstants.MILLIS_PER_MINUTE;

    // 1971-05-06
    private long TEST_TIME2 =
            (365L + 31L + 28L + 31L + 30L + 7L - 1L) * DateTimeConstants.MILLIS_PER_DAY
                    + 14L * DateTimeConstants.MILLIS_PER_HOUR
                    + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) throws Throwable {
        TestInstant_Constructors TB = new TestInstant_Constructors();
        TB.setUp();
        TB.test_epoch();
        TB.tearDown();
        TB.setUp();
        TB.test_now();
        TB.tearDown();
        TB.setUp();
        TB.test_ofEpochMilli();
        TB.tearDown();
        TB.setUp();
        TB.test_ofEpochSecond();
        TB.tearDown();
        TB.setUp();
        TB.test_ofEpochSecond_zero();
        TB.tearDown();
        TB.setUp();
        TB.test_ofEpochSecond_overflow();
        TB.tearDown();
        TB.setUp();
        TB.test_ofEpochSecond_underflow();
        TB.tearDown();
        TB.setUp();
        TB.testParse_noFormatter();
        TB.tearDown();
        TB.setUp();
        TB.testParse_formatter();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor_long1();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor_long2();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor_Object();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor_invalidObject();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor_nullObject();
        TB.tearDown();
        TB.setUp();
        TB.testConstructor_badconverterObject();
        TB.tearDown();


    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestInstant_Constructors.class);
    }

    public TestInstant_Constructors(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        java.util.TimeZone.setDefault(LONDON.toTimeZone());
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        java.util.TimeZone.setDefault(zone.toTimeZone());
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

    /**
     * Test EPOCH
     */
    @Test
    public void test_epoch() throws Throwable {
        Instant test = Instant.EPOCH;
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(0L, test.getMillis());
    }

    /**
     * Test now()
     */
    @Test
    public void test_now() throws Throwable {
        Instant test = Instant.now();
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    //-----------------------------------------------------------------------

    /**
     * Test ofEpochMilli() and ofEpochSecond()
     */
    @Test
    public void test_ofEpochMilli() throws Throwable {
        Instant test = Instant.ofEpochMilli(TEST_TIME1);
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    @Test
    public void test_ofEpochSecond() throws Throwable {
        Instant test = Instant.ofEpochSecond(TEST_TIME1 / 1000);
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    @Test
    public void test_ofEpochSecond_zero() throws Throwable {
        Instant test = Instant.ofEpochSecond(0);
        assertEquals(0, test.getMillis());
    }

    @Test
    public void test_ofEpochSecond_overflow() throws Throwable {
        try {
            Instant.ofEpochSecond(Long.MAX_VALUE);
            fail();
        } catch (ArithmeticException ex) {
        }
    }

    @Test
    public void test_ofEpochSecond_underflow() throws Throwable {
        try {
            Instant.ofEpochSecond(Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testParse_noFormatter() throws Throwable {
        assertEquals(new DateTime(2010, 6, 30, 0, 20, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-06-30T01:20+02:00"));
        assertEquals(new DateTime(2010, 1, 2, 14, 50, ISOChronology.getInstance(LONDON)).toInstant(), Instant.parse("2010-002T14:50"));
    }

    @Test
    public void testParse_formatter() throws Throwable {
        DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS));
        assertEquals(new DateTime(2010, 6, 30, 13, 0, ISOChronology.getInstance(PARIS)).toInstant(), Instant.parse("2010--30 06 13", f));
    }

    //-----------------------------------------------------------------------

    /**
     * Test constructor ()
     */
    @Test
    public void testConstructor() throws Throwable {
        Instant test = new Instant();
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    //-----------------------------------------------------------------------

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long1() throws Throwable {
        Instant test = new Instant(TEST_TIME1);
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (long)
     */
    @Test
    public void testConstructor_long2() throws Throwable {
        Instant test = new Instant(TEST_TIME2);
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME2, test.getMillis());
    }

    //-----------------------------------------------------------------------

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_Object() throws Throwable {
        Date date = new Date(TEST_TIME1);
        Instant test = new Instant(date);
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME1, test.getMillis());
    }

    /**
     * Test constructor (Object)
     */
    @Test
    public void testConstructor_invalidObject() throws Throwable {
        try {
            new Instant(new Object());
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_nullObject() throws Throwable {
        Instant test = new Instant((Object) null);
        assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
        assertEquals(TEST_TIME_NOW, test.getMillis());
    }

    /**
     * Test constructor (Object=null)
     */
    @Test
    public void testConstructor_badconverterObject() throws Throwable {
        try {
            ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
            Instant test = new Instant(new Integer(0));
            assertEquals(ISOChronology.getInstanceUTC(), test.getChronology());
            assertEquals(0L, test.getMillis());
        } finally {
            ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE);
        }
    }

}
