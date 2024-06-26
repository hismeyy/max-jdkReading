/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2012 Unicode, Inc. All rights reserved. Distributed under
 * the Terms of Use in http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of the Unicode data files and any associated documentation (the "Data
 * Files") or Unicode software and any associated documentation (the
 * "Software") to deal in the Data Files or Software without restriction,
 * including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, and/or sell copies of the Data Files or Software, and
 * to permit persons to whom the Data Files or Software are furnished to do so,
 * provided that (a) the above copyright notice(s) and this permission notice
 * appear with all copies of the Data Files or Software, (b) both the above
 * copyright notice(s) and this permission notice appear in associated
 * documentation, and (c) there is clear notice in each modified Data File or
 * in the Software as well as in the documentation associated with the Data
 * File(s) or Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
 * KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT OF
 * THIRD PARTY RIGHTS. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS
 * INCLUDED IN THIS NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR
 * CONSEQUENTIAL DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE
 * OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder shall not
 * be used in advertising or otherwise to promote the sale, use or other
 * dealings in these Data Files or Software without prior written authorization
 * of the copyright holder.
 */

package sun.text.resources.cldr.ms;

import java.util.ListResourceBundle;

public class FormatData_ms extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "Januari",
                    "Februari",
                    "Mac",
                    "April",
                    "Mei",
                    "Jun",
                    "Julai",
                    "Ogos",
                    "September",
                    "Oktober",
                    "November",
                    "Disember",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Jan",
                    "Feb",
                    "Mac",
                    "Apr",
                    "Mei",
                    "Jun",
                    "Jul",
                    "Ogos",
                    "Sep",
                    "Okt",
                    "Nov",
                    "Dis",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "J",
                    "F",
                    "M",
                    "A",
                    "M",
                    "J",
                    "J",
                    "O",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "standalone.MonthNarrows",
                new String[] {
                    "J",
                    "F",
                    "M",
                    "A",
                    "M",
                    "J",
                    "J",
                    "O",
                    "S",
                    "O",
                    "N",
                    "D",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "Ahad",
                    "Isnin",
                    "Selasa",
                    "Rabu",
                    "Khamis",
                    "Jumaat",
                    "Sabtu",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "Ahd",
                    "Isn",
                    "Sel",
                    "Rab",
                    "Kha",
                    "Jum",
                    "Sab",
                }
            },
            { "DayNarrows",
                new String[] {
                    "A",
                    "I",
                    "S",
                    "R",
                    "K",
                    "J",
                    "S",
                }
            },
            { "standalone.DayNarrows",
                new String[] {
                    "A",
                    "I",
                    "S",
                    "R",
                    "K",
                    "J",
                    "S",
                }
            },
            { "QuarterNames",
                new String[] {
                    "Suku pertama",
                    "Suku Ke-2",
                    "Suku Ke-3",
                    "Suku Ke-4",
                }
            },
            { "standalone.QuarterNames",
                new String[] {
                    "Suku pertama",
                    "Suku Ke-2",
                    "Suku Ke-3",
                    "Suku Ke-4",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "Suku 1",
                    "Suku Ke-2",
                    "Suku Ke-3",
                    "Suku Ke-4",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "Suku 1",
                    "Suku Ke-2",
                    "Suku Ke-3",
                    "Suku Ke-4",
                }
            },
            { "QuarterNarrows",
                new String[] {
                    "1",
                    "2",
                    "3",
                    "4",
                }
            },
            { "AmPmMarkers",
                new String[] {
                    "PG",
                    "PTG",
                }
            },
            { "Eras",
                new String[] {
                    "S.M.",
                    "TM",
                }
            },
            { "field.year", "Tahun" },
            { "field.month", "Bulan" },
            { "field.week", "Minggu" },
            { "field.weekday", "Hari dalam Minggu" },
            { "field.dayperiod", "PG/PTG" },
            { "field.hour", "Jam" },
            { "field.minute", "Minit" },
            { "field.second", "Kedua" },
            { "field.zone", "Zon Waktu" },
            { "TimePatterns",
                new String[] {
                    "h:mm:ss a zzzz",
                    "h:mm:ss a z",
                    "h:mm:ss a",
                    "h:mm a",
                }
            },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y",
                    "d MMMM y",
                    "dd/MM/yyyy",
                    "d/MM/yy",
                }
            },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y G",
                    "d MMMM y G",
                    "dd/MM/y G",
                    "d/MM/y G",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "dd/MM/y GGGG",
                    "d/MM/y GGGG",
                }
            },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y G",
                    "d MMMM y G",
                    "dd/MM/y G",
                    "d/MM/y G",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "dd/MM/y GGGG",
                    "d/MM/y GGGG",
                }
            },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y G",
                    "d MMMM y G",
                    "dd/MM/y G",
                    "d/MM/y G",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "dd/MM/y GGGG",
                    "d/MM/y GGGG",
                }
            },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y G",
                    "d MMMM y G",
                    "dd/MM/y G",
                    "d/MM/y G",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE, d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "dd/MM/y GGGG",
                    "d/MM/y GGGG",
                }
            },
            { "calendarname.islamic-civil", "Kalendar Sivil Islam" },
            { "calendarname.islamicc", "Kalendar Sivil Islam" },
            { "calendarname.gregorian", "Kalendar Gregory" },
            { "calendarname.gregory", "Kalendar Gregory" },
            { "calendarname.japanese", "Kalendar Jepun" },
            { "calendarname.buddhist", "Kalendar Buddha" },
            { "calendarname.islamic", "Kalendar Islam" },
            { "calendarname.roc", "Kalendar Minguo" },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
