/*
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics { //extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
                    + 20L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 30L * DateTimeConstants.MILLIS_PER_SECOND
                    + 40L;
    private long TEST_TIME2 =
            1L * DateTimeConstants.MILLIS_PER_DAY
                    + 5L * DateTimeConstants.MILLIS_PER_HOUR
                    + 6L * DateTimeConstants.MILLIS_PER_MINUTE
                    + 7L * DateTimeConstants.MILLIS_PER_SECOND
                    + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {
        TestPartial_Basics TB = new TestPartial_Basics();
        TB.setUp();
        TB.testGet();
        TB.tearDown();
        TB.setUp();
        TB.testSize();
        TB.tearDown();
        TB.setUp();
        TB.testGetFieldType();
        TB.tearDown();
        TB.setUp();
        TB.testGetFieldTypes();
        TB.tearDown();
        TB.setUp();
        TB.testGetField();
        TB.tearDown();
        TB.setUp();
        TB.testGetFields();
        TB.tearDown();
        TB.setUp();
        TB.testGetValue();
        TB.tearDown();
        TB.setUp();
        TB.testGetValues();
        TB.tearDown();
        TB.setUp();
        TB.testIsSupported();
        TB.tearDown();
        TB.setUp();
        TB.testEqualsHashCode();
        TB.tearDown();
        TB.setUp();
        TB.testCompareTo();
        TB.tearDown();
        TB.setUp();
        TB.testIsEqual_TOD();
        TB.tearDown();
        TB.setUp();
        TB.testIsBefore_TOD();
        TB.tearDown();
        TB.setUp();
        TB.testIsAfter_TOD();
        TB.tearDown();
        TB.setUp();
        TB.testWithChronologyRetainFields_Chrono();
        TB.tearDown();
        TB.setUp();
        TB.testWithChronologyRetainFields_sameChrono();
        TB.tearDown();
        TB.setUp();
        TB.testWithChronologyRetainFields_nullChrono();
        TB.tearDown();
        TB.setUp();
        TB.testWith1();
        TB.tearDown();
        TB.setUp();
        TB.testWith2();
        TB.tearDown();
        TB.setUp();
        TB.testWith3();
        TB.tearDown();
        TB.setUp();
        TB.testWith3a();
        TB.tearDown();
        TB.setUp();
        TB.testWith3b();
        TB.tearDown();
        TB.setUp();
        TB.testWith3c();
        TB.tearDown();
        TB.setUp();
        TB.testWith3d();
        TB.tearDown();
        TB.setUp();
        TB.testWith3e();
        TB.tearDown();
        TB.setUp();
        TB.testWith3f();
        TB.tearDown();
        TB.setUp();
        TB.testWith4();
        TB.tearDown();
        TB.setUp();
        TB.testWith_baseHasNoRange();
        TB.tearDown();
        TB.setUp();
        TB.testWith_argHasNoRange();
        TB.tearDown();
        TB.setUp();
        TB.testWith_baseAndArgHaveNoRange();
        TB.tearDown();
        TB.setUp();
        TB.testWithout1();
        TB.tearDown();
        TB.setUp();
        TB.testWithout2();
        TB.tearDown();
        TB.setUp();
        TB.testWithout3();
        TB.tearDown();
        TB.setUp();
        TB.testWithout4();
        TB.tearDown();
        TB.setUp();
        TB.testWithout5();
        TB.tearDown();
        TB.setUp();
        TB.testWithField1();
        TB.tearDown();
        TB.setUp();
        TB.testWithField2();
        TB.tearDown();
        TB.setUp();
        TB.testWithField3();
        TB.tearDown();
        TB.setUp();
        TB.testWithField4();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded1();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded2();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded3();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded4();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded5();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded6();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded7();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAdded8();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped1();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped2();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped3();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped4();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped5();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped6();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped7();
        TB.tearDown();
        TB.setUp();
        TB.testWithFieldAddWrapped8();
        TB.tearDown();
        TB.setUp();
        TB.testPlus_RP();
        TB.tearDown();
        TB.setUp();
        TB.testMinus_RP();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_RI();
        TB.tearDown();
        TB.setUp();
        TB.testToDateTime_nullRI();
        TB.tearDown();
        TB.setUp();
        TB.testProperty();
        TB.tearDown();
        TB.setUp();
        TB.testSerialization();
        TB.tearDown();
        TB.setUp();
        TB.testGetFormatter1();
        TB.tearDown();
        TB.setUp();
        TB.testGetFormatter2();
        TB.tearDown();
        TB.setUp();
        TB.testGetFormatter3();
        TB.tearDown();
        TB.setUp();
        TB.testToString1();
        TB.tearDown();
        TB.setUp();
        TB.testToString2();
        TB.tearDown();
        TB.setUp();
        TB.testToString3();
        TB.tearDown();
        TB.setUp();
        TB.testToString4();
        TB.tearDown();
        TB.setUp();
        TB.testToString5();
        TB.tearDown();
        TB.setUp();
        TB.testToString_String();
        TB.tearDown();
        TB.setUp();
        TB.testToString_String_Locale();
        TB.tearDown();
        TB.setUp();
        TB.testToString_DTFormatter();
        TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestPartial_Basics.class);
    }

    public TestPartial_Basics(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    @After
    public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGet() {
        Partial test = createHourMinPartial();
        assertEquals(10, test.get(DateTimeFieldType.hourOfDay()));
        assertEquals(20, test.get(DateTimeFieldType.minuteOfHour()));
        try {
            test.get(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            test.get(DateTimeFieldType.secondOfMinute());
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    @Test
    public void testSize() {
        Partial test = createHourMinPartial();
        assertEquals(2, test.size());
    }

    @Test
    public void testGetFieldType() {
        Partial test = createHourMinPartial();
        assertSame(DateTimeFieldType.hourOfDay(), test.getFieldType(0));
        assertSame(DateTimeFieldType.minuteOfHour(), test.getFieldType(1));
        try {
            test.getFieldType(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        try {
            test.getFieldType(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }

    @Test
    public void testGetFieldTypes() {
        Partial test = createHourMinPartial();
        DateTimeFieldType[] fields = test.getFieldTypes();
        assertEquals(2, fields.length);
        assertSame(DateTimeFieldType.hourOfDay(), fields[0]);
        assertSame(DateTimeFieldType.minuteOfHour(), fields[1]);
        assertNotSame(test.getFieldTypes(), test.getFieldTypes());
    }

    @Test
    public void testGetField() {
        Partial test = createHourMinPartial(COPTIC_PARIS);
        assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0));
        assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1));
        try {
            test.getField(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        try {
            test.getField(5);
        } catch (IndexOutOfBoundsException ex) {
        }
    }

    @Test
    public void testGetFields() {
        Partial test = createHourMinPartial(COPTIC_PARIS);
        DateTimeField[] fields = test.getFields();
        assertEquals(2, fields.length);
        assertSame(CopticChronology.getInstanceUTC().hourOfDay(), fields[0]);
        assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), fields[1]);
        assertNotSame(test.getFields(), test.getFields());
    }

    @Test
    public void testGetValue() {
        Partial test = createHourMinPartial(COPTIC_PARIS);
        assertEquals(10, test.getValue(0));
        assertEquals(20, test.getValue(1));
        try {
            test.getValue(-1);
        } catch (IndexOutOfBoundsException ex) {
        }
        try {
            test.getValue(2);
        } catch (IndexOutOfBoundsException ex) {
        }
    }

    @Test
    public void testGetValues() {
        Partial test = createHourMinPartial(COPTIC_PARIS);
        int[] values = test.getValues();
        assertEquals(2, values.length);
        assertEquals(10, values[0]);
        assertEquals(20, values[1]);
        assertNotSame(test.getValues(), test.getValues());
    }

    @Test
    public void testIsSupported() {
        Partial test = createHourMinPartial(COPTIC_PARIS);
        assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay()));
        assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour()));
        assertEquals(false, test.isSupported(DateTimeFieldType.secondOfMinute()));
        assertEquals(false, test.isSupported(DateTimeFieldType.millisOfSecond()));
        assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testEqualsHashCode() {
        Partial test1 = createHourMinPartial(COPTIC_PARIS);
        Partial test2 = createHourMinPartial(COPTIC_PARIS);
        assertEquals(true, test1.equals(test2));
        assertEquals(true, test2.equals(test1));
        assertEquals(true, test1.equals(test1));
        assertEquals(true, test2.equals(test2));
        assertEquals(true, test1.hashCode() == test2.hashCode());
        assertEquals(true, test1.hashCode() == test1.hashCode());
        assertEquals(true, test2.hashCode() == test2.hashCode());

        Partial test3 = createHourMinPartial2(COPTIC_PARIS);
        assertEquals(false, test1.equals(test3));
        assertEquals(false, test2.equals(test3));
        assertEquals(false, test3.equals(test1));
        assertEquals(false, test3.equals(test2));
        assertEquals(false, test1.hashCode() == test3.hashCode());
        assertEquals(false, test2.hashCode() == test3.hashCode());

        assertEquals(false, test1.equals("Hello"));
        assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE));
        assertEquals(new TimeOfDay(10, 20, 30, 40), createTODPartial(ISO_UTC));
    }

    //-----------------------------------------------------------------------
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {
        Partial test1 = createHourMinPartial();
        Partial test1a = createHourMinPartial();
        assertEquals(0, test1.compareTo(test1a));
        assertEquals(0, test1a.compareTo(test1));
        assertEquals(0, test1.compareTo(test1));
        assertEquals(0, test1a.compareTo(test1a));

        Partial test2 = createHourMinPartial2(ISO_UTC);
        assertEquals(-1, test1.compareTo(test2));
        assertEquals(+1, test2.compareTo(test1));

        Partial test3 = createHourMinPartial2(COPTIC_UTC);
        assertEquals(-1, test1.compareTo(test3));
        assertEquals(+1, test3.compareTo(test1));
        assertEquals(0, test3.compareTo(test2));

        assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC)));

        try {
            test1.compareTo(null);
            fail();
        } catch (NullPointerException ex) {
        }
//        try {
//            test1.compareTo(new Date());
//            fail();
//        } catch (ClassCastException ex) {}
        try {
            test1.compareTo(new YearMonthDay());
            fail();
        } catch (ClassCastException ex) {
        }
        try {
            createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay());
            fail();
        } catch (ClassCastException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsEqual_TOD() {
        Partial test1 = createHourMinPartial();
        Partial test1a = createHourMinPartial();
        assertEquals(true, test1.isEqual(test1a));
        assertEquals(true, test1a.isEqual(test1));
        assertEquals(true, test1.isEqual(test1));
        assertEquals(true, test1a.isEqual(test1a));

        Partial test2 = createHourMinPartial2(ISO_UTC);
        assertEquals(false, test1.isEqual(test2));
        assertEquals(false, test2.isEqual(test1));

        Partial test3 = createHourMinPartial2(COPTIC_UTC);
        assertEquals(false, test1.isEqual(test3));
        assertEquals(false, test3.isEqual(test1));
        assertEquals(true, test3.isEqual(test2));

        try {
            createHourMinPartial().isEqual(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsBefore_TOD() {
        Partial test1 = createHourMinPartial();
        Partial test1a = createHourMinPartial();
        assertEquals(false, test1.isBefore(test1a));
        assertEquals(false, test1a.isBefore(test1));
        assertEquals(false, test1.isBefore(test1));
        assertEquals(false, test1a.isBefore(test1a));

        Partial test2 = createHourMinPartial2(ISO_UTC);
        assertEquals(true, test1.isBefore(test2));
        assertEquals(false, test2.isBefore(test1));

        Partial test3 = createHourMinPartial2(COPTIC_UTC);
        assertEquals(true, test1.isBefore(test3));
        assertEquals(false, test3.isBefore(test1));
        assertEquals(false, test3.isBefore(test2));

        try {
            createHourMinPartial().isBefore(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsAfter_TOD() {
        Partial test1 = createHourMinPartial();
        Partial test1a = createHourMinPartial();
        assertEquals(false, test1.isAfter(test1a));
        assertEquals(false, test1a.isAfter(test1));
        assertEquals(false, test1.isAfter(test1));
        assertEquals(false, test1a.isAfter(test1a));

        Partial test2 = createHourMinPartial2(ISO_UTC);
        assertEquals(false, test1.isAfter(test2));
        assertEquals(true, test2.isAfter(test1));

        Partial test3 = createHourMinPartial2(COPTIC_UTC);
        assertEquals(false, test1.isAfter(test3));
        assertEquals(true, test3.isAfter(test1));
        assertEquals(false, test3.isAfter(test2));

        try {
            createHourMinPartial().isAfter(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithChronologyRetainFields_Chrono() {
        Partial base = createHourMinPartial(COPTIC_PARIS);
        Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO);
        check(base, 10, 20);
        assertEquals(COPTIC_UTC, base.getChronology());
        check(test, 10, 20);
        assertEquals(BUDDHIST_UTC, test.getChronology());
    }

    @Test
    public void testWithChronologyRetainFields_sameChrono() {
        Partial base = createHourMinPartial(COPTIC_PARIS);
        Partial test = base.withChronologyRetainFields(COPTIC_TOKYO);
        assertSame(base, test);
    }

    @Test
    public void testWithChronologyRetainFields_nullChrono() {
        Partial base = createHourMinPartial(COPTIC_PARIS);
        Partial test = base.withChronologyRetainFields(null);
        check(base, 10, 20);
        assertEquals(COPTIC_UTC, base.getChronology());
        check(test, 10, 20);
        assertEquals(ISO_UTC, test.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWith1() {
        Partial test = createHourMinPartial();
        Partial result = test.with(DateTimeFieldType.hourOfDay(), 15);
        check(test, 10, 20);
        check(result, 15, 20);
    }

    @Test
    public void testWith2() {
        Partial test = createHourMinPartial();
        try {
            test.with(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWith3() {
        Partial test = createHourMinPartial();
        try {
            test.with(DateTimeFieldType.clockhourOfDay(), 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWith3a() {
        Partial test = createHourMinPartial();
        Partial result = test.with(DateTimeFieldType.secondOfMinute(), 15);
        check(test, 10, 20);
        assertEquals(3, result.size());
        assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        assertEquals(true, result.isSupported(DateTimeFieldType.secondOfMinute()));
        assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(1));
        assertEquals(DateTimeFieldType.secondOfMinute(), result.getFieldType(2));
        assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(15, result.get(DateTimeFieldType.secondOfMinute()));
    }

    @Test
    public void testWith3b() {
        Partial test = createHourMinPartial();
        Partial result = test.with(DateTimeFieldType.minuteOfDay(), 15);
        check(test, 10, 20);
        assertEquals(3, result.size());
        assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfDay()));
        assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.minuteOfDay(), result.getFieldType(1));
        assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(2));
        assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(15, result.get(DateTimeFieldType.minuteOfDay()));
    }

    @Test
    public void testWith3c() {
        Partial test = createHourMinPartial();
        Partial result = test.with(DateTimeFieldType.dayOfMonth(), 15);
        check(test, 10, 20);
        assertEquals(3, result.size());
        assertEquals(true, result.isSupported(DateTimeFieldType.dayOfMonth()));
        assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        assertEquals(DateTimeFieldType.dayOfMonth(), result.getFieldType(0));
        assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(1));
        assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(2));
        assertEquals(10, result.get(DateTimeFieldType.hourOfDay()));
        assertEquals(20, result.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(15, result.get(DateTimeFieldType.dayOfMonth()));
    }

    @Test
    public void testWith3d() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        Partial result = test.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(2, result.size());
        assertEquals(2005, result.get(DateTimeFieldType.year()));
        assertEquals(6, result.get(DateTimeFieldType.monthOfYear()));
    }

    @Test
    public void testWith3e() {
        Partial test = new Partial(DateTimeFieldType.era(), 1);
        Partial result = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        assertEquals(2, result.size());
        assertEquals(1, result.get(DateTimeFieldType.era()));
        assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay()));
        assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay()));
    }

    @Test
    public void testWith3f() {
        Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0);
        Partial result = test.with(DateTimeFieldType.era(), 1);
        assertEquals(2, result.size());
        assertEquals(1, result.get(DateTimeFieldType.era()));
        assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay()));
        assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay()));
    }

    @Test
    public void testWith4() {
        Partial test = createHourMinPartial();
        Partial result = test.with(DateTimeFieldType.hourOfDay(), 10);
        assertSame(test, result);
    }

    @Test
    public void testWith_baseHasNoRange() {
        Partial test = new Partial(DateTimeFieldType.year(), 1);
        Partial result = test.with(DateTimeFieldType.hourOfDay(), 10);
        assertEquals(2, result.size());
        assertEquals(0, result.indexOf(DateTimeFieldType.year()));
        assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testWith_argHasNoRange() {
        Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1);
        Partial result = test.with(DateTimeFieldType.year(), 10);
        assertEquals(2, result.size());
        assertEquals(0, result.indexOf(DateTimeFieldType.year()));
        assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay()));
    }

    @Test
    public void testWith_baseAndArgHaveNoRange() {
        Partial test = new Partial(DateTimeFieldType.year(), 1);
        Partial result = test.with(DateTimeFieldType.era(), 1);
        assertEquals(2, result.size());
        assertEquals(0, result.indexOf(DateTimeFieldType.era()));
        assertEquals(1, result.indexOf(DateTimeFieldType.year()));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithout1() {
        Partial test = createHourMinPartial();
        Partial result = test.without(DateTimeFieldType.year());
        check(test, 10, 20);
        check(result, 10, 20);
    }

    @Test
    public void testWithout2() {
        Partial test = createHourMinPartial();
        Partial result = test.without((DateTimeFieldType) null);
        check(test, 10, 20);
        check(result, 10, 20);
    }

    @Test
    public void testWithout3() {
        Partial test = createHourMinPartial();
        Partial result = test.without(DateTimeFieldType.hourOfDay());
        check(test, 10, 20);
        assertEquals(1, result.size());
        assertEquals(false, result.isSupported(DateTimeFieldType.hourOfDay()));
        assertEquals(true, result.isSupported(DateTimeFieldType.minuteOfHour()));
        assertEquals(DateTimeFieldType.minuteOfHour(), result.getFieldType(0));
    }

    @Test
    public void testWithout4() {
        Partial test = createHourMinPartial();
        Partial result = test.without(DateTimeFieldType.minuteOfHour());
        check(test, 10, 20);
        assertEquals(1, result.size());
        assertEquals(true, result.isSupported(DateTimeFieldType.hourOfDay()));
        assertEquals(false, result.isSupported(DateTimeFieldType.minuteOfHour()));
        assertEquals(DateTimeFieldType.hourOfDay(), result.getFieldType(0));
    }

    @Test
    public void testWithout5() {
        Partial test = new Partial(DateTimeFieldType.hourOfDay(), 12);
        Partial result = test.without(DateTimeFieldType.hourOfDay());
        assertEquals(0, result.size());
        assertEquals(false, result.isSupported(DateTimeFieldType.hourOfDay()));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithField1() {
        Partial test = createHourMinPartial();
        Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15);
        check(test, 10, 20);
        check(result, 15, 20);
    }

    @Test
    public void testWithField2() {
        Partial test = createHourMinPartial();
        try {
            test.withField(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithField3() {
        Partial test = createHourMinPartial();
        try {
            test.withField(DateTimeFieldType.dayOfMonth(), 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithField4() {
        Partial test = createHourMinPartial();
        Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAdded1() {
        Partial test = createHourMinPartial();
        Partial result = test.withFieldAdded(DurationFieldType.hours(), 6);

        assertEquals(createHourMinPartial(), test);
        check(test, 10, 20);
        check(result, 16, 20);
    }

    @Test
    public void testWithFieldAdded2() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAdded(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAdded3() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAdded(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAdded4() {
        Partial test = createHourMinPartial();
        Partial result = test.withFieldAdded(DurationFieldType.hours(), 0);
        assertSame(test, result);
    }

    @Test
    public void testWithFieldAdded5() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAdded(DurationFieldType.days(), 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAdded6() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAdded(DurationFieldType.hours(), 16);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAdded7() {
        Partial test = createHourMinPartial(23, 59, ISO_UTC);
        try {
            test.withFieldAdded(DurationFieldType.minutes(), 1);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        check(test, 23, 59);

        test = createHourMinPartial(23, 59, ISO_UTC);
        try {
            test.withFieldAdded(DurationFieldType.hours(), 1);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        check(test, 23, 59);
    }

    @Test
    public void testWithFieldAdded8() {
        Partial test = createHourMinPartial(0, 0, ISO_UTC);
        try {
            test.withFieldAdded(DurationFieldType.minutes(), -1);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        check(test, 0, 0);

        test = createHourMinPartial(0, 0, ISO_UTC);
        try {
            test.withFieldAdded(DurationFieldType.hours(), -1);
            fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
        check(test, 0, 0);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testWithFieldAddWrapped1() {
        Partial test = createHourMinPartial();
        Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 6);

        assertEquals(createHourMinPartial(), test);
        check(test, 10, 20);
        check(result, 16, 20);
    }

    @Test
    public void testWithFieldAddWrapped2() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAddWrapped(null, 0);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAddWrapped3() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAddWrapped(null, 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAddWrapped4() {
        Partial test = createHourMinPartial();
        Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0);
        assertSame(test, result);
    }

    @Test
    public void testWithFieldAddWrapped5() {
        Partial test = createHourMinPartial();
        try {
            test.withFieldAddWrapped(DurationFieldType.days(), 6);
            fail();
        } catch (IllegalArgumentException ex) {
        }
        check(test, 10, 20);
    }

    @Test
    public void testWithFieldAddWrapped6() {
        Partial test = createHourMinPartial();
        Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 16);

        assertEquals(createHourMinPartial(), test);
        check(test, 10, 20);
        check(result, 2, 20);
    }

    @Test
    public void testWithFieldAddWrapped7() {
        Partial test = createHourMinPartial(23, 59, ISO_UTC);
        Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), 1);
        check(test, 23, 59);
        check(result, 0, 0);

        test = createHourMinPartial(23, 59, ISO_UTC);
        result = test.withFieldAddWrapped(DurationFieldType.hours(), 1);
        check(test, 23, 59);
        check(result, 0, 59);
    }

    @Test
    public void testWithFieldAddWrapped8() {
        Partial test = createHourMinPartial(0, 0, ISO_UTC);
        Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1);
        check(test, 0, 0);
        check(result, 23, 59);

        test = createHourMinPartial(0, 0, ISO_UTC);
        result = test.withFieldAddWrapped(DurationFieldType.hours(), -1);
        check(test, 0, 0);
        check(result, 23, 0);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testPlus_RP() {
        Partial test = createHourMinPartial(BUDDHIST_LONDON);
        Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8));
        check(test, 10, 20);
        check(result, 15, 26);

        result = test.plus((ReadablePeriod) null);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testMinus_RP() {
        Partial test = createHourMinPartial(BUDDHIST_LONDON);
        Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1));
        check(test, 10, 20);
        check(result, 9, 19);

        result = test.minus((ReadablePeriod) null);
        assertSame(test, result);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToDateTime_RI() {
        Partial base = createHourMinPartial(COPTIC_PARIS);
        DateTime dt = new DateTime(0L); // LONDON zone
        assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());

        DateTime test = base.toDateTime(dt);
        check(base, 10, 20);
        assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString());
        assertEquals("1970-01-01T10:20:00.000+01:00", test.toString());
    }

    @Test
    public void testToDateTime_nullRI() {
        Partial base = createHourMinPartial(1, 2, ISO_UTC);
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME2);

        DateTime test = base.toDateTime((ReadableInstant) null);
        check(base, 1, 2);
        assertEquals("1970-01-02T01:02:07.008+01:00", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testProperty() {
        Partial test = createHourMinPartial();
        assertNotNull(test.property(DateTimeFieldType.hourOfDay()));
        assertNotNull(test.property(DateTimeFieldType.minuteOfHour()));
        try {
            test.property(DateTimeFieldType.secondOfDay());
            fail();
        } catch (IllegalArgumentException ex) {
        }
        try {
            test.property(null);
            fail();
        } catch (IllegalArgumentException ex) {
        }
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() throws Exception {
        Partial test = createHourMinPartial(COPTIC_PARIS);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(test);
        oos.close();
        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Partial result = (Partial) ois.readObject();
        ois.close();

        assertEquals(test, result);
        assertTrue(Arrays.equals(test.getValues(), result.getValues()));
        assertTrue(Arrays.equals(test.getFields(), result.getFields()));
        assertEquals(test.getChronology(), result.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetFormatter1() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        assertEquals("2005", test.getFormatter().print(test));

        test = test.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals("2005-06", test.getFormatter().print(test));

        test = test.with(DateTimeFieldType.dayOfMonth(), 25);
        assertEquals("2005-06-25", test.getFormatter().print(test));

        test = test.without(DateTimeFieldType.monthOfYear());
        assertEquals("2005--25", test.getFormatter().print(test));
    }

    @Test
    public void testGetFormatter2() {
        Partial test = new Partial();
        assertEquals(null, test.getFormatter());

        test = test.with(DateTimeFieldType.era(), 1);
        assertEquals(null, test.getFormatter());

        test = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        assertEquals(null, test.getFormatter());
    }

    @Test
    public void testGetFormatter3() {
        Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5);
        assertEquals("-W-5", test.getFormatter().print(test));

        // contrast with testToString5
        test = test.with(DateTimeFieldType.dayOfMonth(), 13);
        assertEquals("---13", test.getFormatter().print(test));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString1() {
        Partial test = createHourMinPartial();
        assertEquals("10:20", test.toString());
    }

    @Test
    public void testToString2() {
        Partial test = new Partial();
        assertEquals("[]", test.toString());
    }

    @Test
    public void testToString3() {
        Partial test = new Partial(DateTimeFieldType.year(), 2005);
        assertEquals("2005", test.toString());

        test = test.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals("2005-06", test.toString());

        test = test.with(DateTimeFieldType.dayOfMonth(), 25);
        assertEquals("2005-06-25", test.toString());

        test = test.without(DateTimeFieldType.monthOfYear());
        assertEquals("2005--25", test.toString());
    }

    @Test
    public void testToString4() {
        Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5);
        assertEquals("-W-5", test.toString());

        test = test.with(DateTimeFieldType.dayOfMonth(), 13);
        assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString());
    }

    @Test
    public void testToString5() {
        Partial test = new Partial(DateTimeFieldType.era(), 1);
        assertEquals("[era=1]", test.toString());

        test = test.with(DateTimeFieldType.halfdayOfDay(), 0);
        assertEquals("[era=1, halfdayOfDay=0]", test.toString());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String() {
        Partial test = createHourMinPartial();
        assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH"));
        assertEquals("10:20", test.toString((String) null));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString_String_Locale() {
        Partial test = createHourMinPartial();
        assertEquals("10 20", test.toString("H m", Locale.ENGLISH));
        assertEquals("10:20", test.toString(null, Locale.ENGLISH));
        assertEquals("10 20", test.toString("H m", null));
        assertEquals("10:20", test.toString(null, null));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString_DTFormatter() {
        Partial test = createHourMinPartial();
        assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH")));
        assertEquals("10:20", test.toString((DateTimeFormatter) null));
    }

    //-----------------------------------------------------------------------
    private Partial createHourMinPartial() {
        return createHourMinPartial(ISO_UTC);
    }

    private Partial createHourMinPartial(Chronology chrono) {
        return createHourMinPartial(10, 20, chrono);
    }

    private Partial createHourMinPartial2(Chronology chrono) {
        return createHourMinPartial(15, 20, chrono);
    }

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {
        return new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
                new int[]{hour, min},
                chrono);
    }

    private Partial createTODPartial(Chronology chrono) {
        return new Partial(
                new DateTimeFieldType[]{
                        DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[]{10, 20, 30, 40},
                chrono);
    }

    private void check(Partial test, int hour, int min) {
        assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }
}
