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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Partial;

/**
 * This class is a Junit unit test for ISODateTimeFormat.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormat { //extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 +
            365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
            366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) throws Exception {
        TestISODateTimeFormat TB = new TestISODateTimeFormat();

        TB.setUp();
        TB.testSubclassableConstructor();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_date();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_date_partial();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_time();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_time_partial();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_timeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_timeNoMillis_partial();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_tTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_tTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_ordinalDate();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_ordinalDateTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_ordinalDateTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_weekDate();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_weekDateTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_weekDateTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicDate();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicTTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicTTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicDateTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicDateTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicOrdinalDate();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicOrdinalDateTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicOrdinalDateTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicWeekDate();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicWeekDateTime();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_basicWeekDateTimeNoMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_year();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_yearMonth();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_yearMonthDay();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_weekyear();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_weekyearWeek();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_weekyearWeekDay();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_hour();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_hourMinute();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_hourMinuteSecond();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_hourMinuteSecondMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_hourMinuteSecondFraction();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateHour();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateHourMinute();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateHourMinuteSecond();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateHourMinuteSecondMillis();
        TB.tearDown();
        TB.setUp();
        TB.testFormat_dateHourMinuteSecondFraction();
        TB.tearDown();

    }

    /*
    public static TestSuite suite() {
        return new TestSuite(TestISODateTimeFormat.class);
    }

    public TestISODateTimeFormat(String name) {
        super(name);
    }
    */

    @Before
    public void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    @After
    public void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSubclassableConstructor() {
        ISODateTimeFormat f = new ISODateTimeFormat() {
            // test constructor is protected
        };
        assertNotNull(f);
    }

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_date() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
    }

    @Test
    public void testFormat_date_partial() {
        Partial dt = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()},
                new int[]{2004, 6, 9});
        assertEquals("2004-06-09", ISODateTimeFormat.date().print(dt));
    }

    @Test
    public void testFormat_time() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10:20:30.040Z", ISODateTimeFormat.time().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11:20:30.040+01:00", ISODateTimeFormat.time().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12:20:30.040+02:00", ISODateTimeFormat.time().print(dt));
    }

    @Test
    public void testFormat_time_partial() {
        Partial dt = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[]{10, 20, 30, 40});
        assertEquals("10:20:30.040", ISODateTimeFormat.time().print(dt));
    }

    @Test
    public void testFormat_timeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10:20:30Z", ISODateTimeFormat.timeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11:20:30+01:00", ISODateTimeFormat.timeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12:20:30+02:00", ISODateTimeFormat.timeNoMillis().print(dt));
    }

    @Test
    public void testFormat_timeNoMillis_partial() {
        Partial dt = new Partial(
                new DateTimeFieldType[]{DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                        DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
                new int[]{10, 20, 30, 40});
        assertEquals("10:20:30", ISODateTimeFormat.timeNoMillis().print(dt));
    }

    @Test
    public void testFormat_tTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("T10:20:30.040Z", ISODateTimeFormat.tTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("T11:20:30.040+01:00", ISODateTimeFormat.tTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("T12:20:30.040+02:00", ISODateTimeFormat.tTime().print(dt));
    }

    @Test
    public void testFormat_tTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("T10:20:30Z", ISODateTimeFormat.tTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("T11:20:30+01:00", ISODateTimeFormat.tTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("T12:20:30+02:00", ISODateTimeFormat.tTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_dateTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10:20:30.040Z", ISODateTimeFormat.dateTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11:20:30.040+01:00", ISODateTimeFormat.dateTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12:20:30.040+02:00", ISODateTimeFormat.dateTime().print(dt));

//        dt = dt.withZone(LONDON);
//        assertEquals("2004-06-09T11:20:30.040+01:00", ISODateTimeFormat.getInstance(PARIS).dateTime().print(dt));
//        
//        dt = dt.withZone(LONDON);
//        assertEquals("2004-06-09T12:20:30.040+02:00", ISODateTimeFormat.dateTime().print(dt.getMillis(), PARIS));
//        
//        dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, CopticChronology.getInstance());
//        assertEquals("2288-02-19T10:20:30.040Z", ISODateTimeFormat.dateTime().print(dt));
//        
//        dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, CopticChronology.getInstance());
//        assertEquals("2004-06-09T10:20:30.040Z", ISODateTimeFormat.getInstance(CopticChronology.getInstance()).dateTime().print(dt));
    }

    @Test
    public void testFormat_dateTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10:20:30Z", ISODateTimeFormat.dateTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11:20:30+01:00", ISODateTimeFormat.dateTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12:20:30+02:00", ISODateTimeFormat.dateTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_ordinalDate() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-161", ISODateTimeFormat.ordinalDate().print(dt));
    }

    @Test
    public void testFormat_ordinalDateTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-161T10:20:30.040Z", ISODateTimeFormat.ordinalDateTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-161T11:20:30.040+01:00", ISODateTimeFormat.ordinalDateTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-161T12:20:30.040+02:00", ISODateTimeFormat.ordinalDateTime().print(dt));
    }

    @Test
    public void testFormat_ordinalDateTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-161T10:20:30Z", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-161T11:20:30+01:00", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-161T12:20:30+02:00", ISODateTimeFormat.ordinalDateTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_weekDate() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-W24-3", ISODateTimeFormat.weekDate().print(dt));
    }

    @Test
    public void testFormat_weekDateTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt));
    }

    @Test
    public void testFormat_weekDateTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-W24-3T10:20:30Z", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-W24-3T11:20:30+01:00", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-W24-3T12:20:30+02:00", ISODateTimeFormat.weekDateTimeNoMillis().print(dt));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_basicDate() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("20040609", ISODateTimeFormat.basicDate().print(dt));
    }

    @Test
    public void testFormat_basicTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("102030.040Z", ISODateTimeFormat.basicTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("112030.040+0100", ISODateTimeFormat.basicTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("122030.040+0200", ISODateTimeFormat.basicTime().print(dt));
    }

    @Test
    public void testFormat_basicTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("102030Z", ISODateTimeFormat.basicTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("112030+0100", ISODateTimeFormat.basicTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("122030+0200", ISODateTimeFormat.basicTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_basicTTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("T102030.040Z", ISODateTimeFormat.basicTTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("T112030.040+0100", ISODateTimeFormat.basicTTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("T122030.040+0200", ISODateTimeFormat.basicTTime().print(dt));
    }

    @Test
    public void testFormat_basicTTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("T102030Z", ISODateTimeFormat.basicTTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("T112030+0100", ISODateTimeFormat.basicTTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("T122030+0200", ISODateTimeFormat.basicTTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_basicDateTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("20040609T102030.040Z", ISODateTimeFormat.basicDateTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("20040609T112030.040+0100", ISODateTimeFormat.basicDateTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("20040609T122030.040+0200", ISODateTimeFormat.basicDateTime().print(dt));
    }

    @Test
    public void testFormat_basicDateTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("20040609T102030Z", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("20040609T112030+0100", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("20040609T122030+0200", ISODateTimeFormat.basicDateTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_basicOrdinalDate() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004161", ISODateTimeFormat.basicOrdinalDate().print(dt));
    }

    @Test
    public void testFormat_basicOrdinalDateTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004161T102030.040Z", ISODateTimeFormat.basicOrdinalDateTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004161T112030.040+0100", ISODateTimeFormat.basicOrdinalDateTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004161T122030.040+0200", ISODateTimeFormat.basicOrdinalDateTime().print(dt));
    }

    @Test
    public void testFormat_basicOrdinalDateTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004161T102030Z", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004161T112030+0100", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004161T122030+0200", ISODateTimeFormat.basicOrdinalDateTimeNoMillis().print(dt));
    }

    @Test
    public void testFormat_basicWeekDate() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004W243", ISODateTimeFormat.basicWeekDate().print(dt));
    }

    @Test
    public void testFormat_basicWeekDateTime() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004W243T102030.040Z", ISODateTimeFormat.basicWeekDateTime().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004W243T112030.040+0100", ISODateTimeFormat.basicWeekDateTime().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004W243T122030.040+0200", ISODateTimeFormat.basicWeekDateTime().print(dt));
    }

    @Test
    public void testFormat_basicWeekDateTimeNoMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004W243T102030Z", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004W243T112030+0100", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004W243T122030+0200", ISODateTimeFormat.basicWeekDateTimeNoMillis().print(dt));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_year() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004", ISODateTimeFormat.year().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004", ISODateTimeFormat.year().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004", ISODateTimeFormat.year().print(dt));
    }

    @Test
    public void testFormat_yearMonth() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06", ISODateTimeFormat.yearMonth().print(dt));
    }

    @Test
    public void testFormat_yearMonthDay() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09", ISODateTimeFormat.yearMonthDay().print(dt));
    }

    @Test
    public void testFormat_weekyear() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004", ISODateTimeFormat.weekyear().print(dt));
    }

    @Test
    public void testFormat_weekyearWeek() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-W24", ISODateTimeFormat.weekyearWeek().print(dt));
    }

    @Test
    public void testFormat_weekyearWeekDay() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-W24-3", ISODateTimeFormat.weekyearWeekDay().print(dt));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_hour() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10", ISODateTimeFormat.hour().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11", ISODateTimeFormat.hour().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12", ISODateTimeFormat.hour().print(dt));
    }

    @Test
    public void testFormat_hourMinute() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10:20", ISODateTimeFormat.hourMinute().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11:20", ISODateTimeFormat.hourMinute().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12:20", ISODateTimeFormat.hourMinute().print(dt));
    }

    @Test
    public void testFormat_hourMinuteSecond() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12:20:30", ISODateTimeFormat.hourMinuteSecond().print(dt));
    }

    @Test
    public void testFormat_hourMinuteSecondMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondMillis().print(dt));
    }

    @Test
    public void testFormat_hourMinuteSecondFraction() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("10:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("11:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("12:20:30.040", ISODateTimeFormat.hourMinuteSecondFraction().print(dt));
    }

    //-----------------------------------------------------------------------
    @Test
    public void testFormat_dateHour() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10", ISODateTimeFormat.dateHour().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11", ISODateTimeFormat.dateHour().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12", ISODateTimeFormat.dateHour().print(dt));
    }

    @Test
    public void testFormat_dateHourMinute() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10:20", ISODateTimeFormat.dateHourMinute().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11:20", ISODateTimeFormat.dateHourMinute().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12:20", ISODateTimeFormat.dateHourMinute().print(dt));
    }

    @Test
    public void testFormat_dateHourMinuteSecond() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12:20:30", ISODateTimeFormat.dateHourMinuteSecond().print(dt));
    }

    @Test
    public void testFormat_dateHourMinuteSecondMillis() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondMillis().print(dt));
    }

    @Test
    public void testFormat_dateHourMinuteSecondFraction() {
        DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
        assertEquals("2004-06-09T10:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));

        dt = dt.withZone(LONDON);
        assertEquals("2004-06-09T11:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));

        dt = dt.withZone(PARIS);
        assertEquals("2004-06-09T12:20:30.040", ISODateTimeFormat.dateHourMinuteSecondFraction().print(dt));
    }

}
