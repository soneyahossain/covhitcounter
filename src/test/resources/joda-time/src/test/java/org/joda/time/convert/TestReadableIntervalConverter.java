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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a JUnit test for ReadableIntervalConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableIntervalConverter { //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;

    private DateTimeZone zone = null;

    public static void main(String[] args) throws Exception {
        //junit.textui.TestRunner.run(suite());


        TestReadableIntervalConverter TB = new TestReadableIntervalConverter();

        TB.setUp();
        TB.testSingleton();
        TB.tearDown();
        TB.setUp();
        TB.testSupportedType();
        TB.tearDown();
        TB.setUp();
        TB.testGetDurationMillis_Object();
        TB.tearDown();
        TB.setUp();
        TB.testGetPeriodType_Object();
        TB.tearDown();
        TB.setUp();
        TB.testSetIntoPeriod_Object1();
        TB.tearDown();
        TB.setUp();
        TB.testSetIntoPeriod_Object2();
        TB.tearDown();
        TB.setUp();
        TB.testIsReadableInterval_Object_Chronology();
        TB.tearDown();
        TB.setUp();
        TB.testSetIntoInterval_Object1();
        TB.tearDown();
        TB.setUp();
        TB.testSetIntoInterval_Object2();
        TB.tearDown();
        TB.setUp();
        TB.testSetIntoInterval_Object3();
        TB.tearDown();
        TB.setUp();
        TB.testSetIntoInterval_Object4();
        TB.tearDown();
        TB.setUp();
        TB.testToString();
        TB.tearDown();
    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestReadableIntervalConverter.class);
    }

    public TestReadableIntervalConverter(String name) {
        super(name);
    }

     */

    @Before
    public void setUp() throws Exception {
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    @After
    public void tearDown() throws Exception {

    }

    //-----------------------------------------------------------------------
    @Test
    public void testSingleton() throws Exception {
        Class cls = ReadableIntervalConverter.class;
        assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        assertEquals(false, Modifier.isPrivate(cls.getModifiers()));

        Constructor con = cls.getDeclaredConstructor((Class[]) null);
        assertEquals(1, cls.getDeclaredConstructors().length);
        assertEquals(true, Modifier.isProtected(con.getModifiers()));

        Field fld = cls.getDeclaredField("INSTANCE");
        assertEquals(false, Modifier.isPublic(fld.getModifiers()));
        assertEquals(false, Modifier.isProtected(fld.getModifiers()));
        assertEquals(false, Modifier.isPrivate(fld.getModifiers()));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSupportedType() throws Exception {
        assertEquals(ReadableInterval.class, ReadableIntervalConverter.INSTANCE.getSupportedType());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetDurationMillis_Object() throws Exception {
        Interval i = new Interval(100L, 223L);
        assertEquals(123L, ReadableIntervalConverter.INSTANCE.getDurationMillis(i));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testGetPeriodType_Object() throws Exception {
        Interval i = new Interval(100L, 223L);
        assertEquals(PeriodType.standard(),
                ReadableIntervalConverter.INSTANCE.getPeriodType(i));
    }

    @Test
    public void testSetIntoPeriod_Object1() throws Exception {
        Interval i = new Interval(100L, 223L);
        MutablePeriod m = new MutablePeriod(PeriodType.millis());
        ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        assertEquals(0, m.getYears());
        assertEquals(0, m.getMonths());
        assertEquals(0, m.getWeeks());
        assertEquals(0, m.getDays());
        assertEquals(0, m.getHours());
        assertEquals(0, m.getMinutes());
        assertEquals(0, m.getSeconds());
        assertEquals(123, m.getMillis());
    }

    @Test
    public void testSetIntoPeriod_Object2() throws Exception {
        Interval i = new Interval(100L, 223L);
        MutablePeriod m = new MutablePeriod(PeriodType.millis());
        ReadableIntervalConverter.INSTANCE.setInto(m, i, CopticChronology.getInstance());
        assertEquals(0, m.getYears());
        assertEquals(0, m.getMonths());
        assertEquals(0, m.getWeeks());
        assertEquals(0, m.getDays());
        assertEquals(0, m.getHours());
        assertEquals(0, m.getMinutes());
        assertEquals(0, m.getSeconds());
        assertEquals(123, m.getMillis());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testIsReadableInterval_Object_Chronology() throws Exception {
        Interval i = new Interval(1234L, 5678L);
        assertEquals(true, ReadableIntervalConverter.INSTANCE.isReadableInterval(i, null));
    }

    @Test
    public void testSetIntoInterval_Object1() throws Exception {
        Interval i = new Interval(0L, 123L, CopticChronology.getInstance());
        MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        assertEquals(0L, m.getStartMillis());
        assertEquals(123L, m.getEndMillis());
        assertEquals(CopticChronology.getInstance(), m.getChronology());
    }

    @Test
    public void testSetIntoInterval_Object2() throws Exception {
        Interval i = new Interval(0L, 123L, CopticChronology.getInstance());
        MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance());
        assertEquals(0L, m.getStartMillis());
        assertEquals(123L, m.getEndMillis());
        assertEquals(GJChronology.getInstance(), m.getChronology());
    }

    @Test
    public void testSetIntoInterval_Object3() throws Exception {
        MutableInterval i = new MutableInterval(0L, 123L) {
            public Chronology getChronology() {
                return null; // bad
            }
        };
        MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        ReadableIntervalConverter.INSTANCE.setInto(m, i, GJChronology.getInstance());
        assertEquals(0L, m.getStartMillis());
        assertEquals(123L, m.getEndMillis());
        assertEquals(GJChronology.getInstance(), m.getChronology());
    }

    @Test
    public void testSetIntoInterval_Object4() throws Exception {
        MutableInterval i = new MutableInterval(0L, 123L) {
            public Chronology getChronology() {
                return null; // bad
            }
        };
        MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance());
        ReadableIntervalConverter.INSTANCE.setInto(m, i, null);
        assertEquals(0L, m.getStartMillis());
        assertEquals(123L, m.getEndMillis());
        assertEquals(ISOChronology.getInstance(), m.getChronology());
    }

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {
        assertEquals("Converter[org.joda.time.ReadableInterval]", ReadableIntervalConverter.INSTANCE.toString());
    }

}
