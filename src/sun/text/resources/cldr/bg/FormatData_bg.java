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

package sun.text.resources.cldr.bg;

import java.util.ListResourceBundle;

public class FormatData_bg extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final Object[][] data = new Object[][] {
            { "MonthNames",
                new String[] {
                    "\u044f\u043d\u0443\u0430\u0440\u0438",
                    "\u0444\u0435\u0432\u0440\u0443\u0430\u0440\u0438",
                    "\u043c\u0430\u0440\u0442",
                    "\u0430\u043f\u0440\u0438\u043b",
                    "\u043c\u0430\u0439",
                    "\u044e\u043d\u0438",
                    "\u044e\u043b\u0438",
                    "\u0430\u0432\u0433\u0443\u0441\u0442",
                    "\u0441\u0435\u043f\u0442\u0435\u043c\u0432\u0440\u0438",
                    "\u043e\u043a\u0442\u043e\u043c\u0432\u0440\u0438",
                    "\u043d\u043e\u0435\u043c\u0432\u0440\u0438",
                    "\u0434\u0435\u043a\u0435\u043c\u0432\u0440\u0438",
                    "",
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "\u044f\u043d.",
                    "\u0444\u0435\u0432\u0440.",
                    "\u043c\u0430\u0440\u0442",
                    "\u0430\u043f\u0440.",
                    "\u043c\u0430\u0439",
                    "\u044e\u043d\u0438",
                    "\u044e\u043b\u0438",
                    "\u0430\u0432\u0433.",
                    "\u0441\u0435\u043f\u0442.",
                    "\u043e\u043a\u0442.",
                    "\u043d\u043e\u0435\u043c.",
                    "\u0434\u0435\u043a.",
                    "",
                }
            },
            { "MonthNarrows",
                new String[] {
                    "\u044f",
                    "\u0444",
                    "\u043c",
                    "\u0430",
                    "\u043c",
                    "\u044e",
                    "\u044e",
                    "\u0430",
                    "\u0441",
                    "\u043e",
                    "\u043d",
                    "\u0434",
                    "",
                }
            },
            { "DayNames",
                new String[] {
                    "\u043d\u0435\u0434\u0435\u043b\u044f",
                    "\u043f\u043e\u043d\u0435\u0434\u0435\u043b\u043d\u0438\u043a",
                    "\u0432\u0442\u043e\u0440\u043d\u0438\u043a",
                    "\u0441\u0440\u044f\u0434\u0430",
                    "\u0447\u0435\u0442\u0432\u044a\u0440\u0442\u044a\u043a",
                    "\u043f\u0435\u0442\u044a\u043a",
                    "\u0441\u044a\u0431\u043e\u0442\u0430",
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "\u043d\u0434",
                    "\u043f\u043d",
                    "\u0432\u0442",
                    "\u0441\u0440",
                    "\u0447\u0442",
                    "\u043f\u0442",
                    "\u0441\u0431",
                }
            },
            { "DayNarrows",
                new String[] {
                    "\u043d",
                    "\u043f",
                    "\u0432",
                    "\u0441",
                    "\u0447",
                    "\u043f",
                    "\u0441",
                }
            },
            { "QuarterNames",
                new String[] {
                    "1-\u0432\u043e \u0442\u0440\u0438\u043c\u0435\u0441\u0435\u0447\u0438\u0435",
                    "2-\u0440\u043e \u0442\u0440\u0438\u043c\u0435\u0441\u0435\u0447\u0438\u0435",
                    "3-\u0442\u043e \u0442\u0440\u0438\u043c\u0435\u0441\u0435\u0447\u0438\u0435",
                    "4-\u0442\u043e \u0442\u0440\u0438\u043c\u0435\u0441\u0435\u0447\u0438\u0435",
                }
            },
            { "QuarterAbbreviations",
                new String[] {
                    "I \u0442\u0440\u0438\u043c.",
                    "II \u0442\u0440\u0438\u043c.",
                    "III \u0442\u0440\u0438\u043c.",
                    "IV \u0442\u0440\u0438\u043c.",
                }
            },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "1 \u0442\u0440\u0438\u043c.",
                    "2 \u0442\u0440\u0438\u043c.",
                    "3 \u0442\u0440\u0438\u043c.",
                    "4 \u0442\u0440\u0438\u043c.",
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
                    "\u043f\u0440. \u043e\u0431.",
                    "\u0441\u043b. \u043e\u0431.",
                }
            },
            { "long.Eras",
                new String[] {
                    "\u043f\u0440.\u0425\u0440.",
                    "\u0441\u043b.\u0425\u0440.",
                }
            },
            { "Eras",
                new String[] {
                    "\u043f\u0440. \u043d. \u0435.",
                    "\u043e\u0442 \u043d. \u0435.",
                }
            },
            { "narrow.Eras",
                new String[] {
                    "",
                    "\u0441\u043b.\u043d.\u0435.",
                }
            },
            { "field.era", "\u0435\u0440\u0430" },
            { "field.year", "\u0433\u043e\u0434\u0438\u043d\u0430" },
            { "field.month", "\u043c\u0435\u0441\u0435\u0446" },
            { "field.week", "\u0441\u0435\u0434\u043c\u0438\u0446\u0430" },
            { "field.weekday", "\u0414\u0435\u043d \u043e\u0442 \u0441\u0435\u0434\u043c\u0438\u0446\u0430\u0442\u0430" },
            { "field.dayperiod", "\u0434\u0435\u043d" },
            { "field.hour", "\u0447\u0430\u0441" },
            { "field.minute", "\u043c\u0438\u043d\u0443\u0442\u0430" },
            { "field.second", "\u0441\u0435\u043a\u0443\u043d\u0434\u0430" },
            { "field.zone", "\u0437\u043e\u043d\u0430" },
            { "TimePatterns",
                new String[] {
                    "HH:mm:ss zzzz",
                    "HH:mm:ss z",
                    "HH:mm:ss",
                    "HH:mm",
                }
            },
            { "DatePatterns",
                new String[] {
                    "dd MMMM y, EEEE",
                    "dd MMMM y",
                    "dd.MM.yyyy",
                    "dd.MM.yy",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "\u043c\u0443\u0445\u0430\u0440\u0430\u043c",
                    "\u0441\u0430\u0444\u0430\u0440",
                    "\u0440\u0430\u0431\u0438-1",
                    "\u0440\u0430\u0431\u0438-2",
                    "\u0434\u0436\u0443\u043c\u0430\u0434\u0430-1",
                    "\u0434\u0436\u0443\u043c\u0430\u0434\u0430-2",
                    "\u0440\u0430\u0434\u0436\u0430\u0431",
                    "\u0448\u0430\u0431\u0430\u043d",
                    "\u0440\u0430\u043c\u0430\u0437\u0430\u043d",
                    "\u0428\u0430\u0432\u0430\u043b",
                    "\u0414\u0445\u0443\u043b-\u041a\u0430\u0430\u0434\u0430",
                    "\u0414\u0445\u0443\u043b-\u0445\u0438\u0434\u0436\u0430",
                    "",
                }
            },
            { "calendarname.islamic-civil", "\u0418\u0441\u043b\u044f\u043c\u0441\u043a\u0438 \u0446\u0438\u0432\u0438\u043b\u0435\u043d \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "calendarname.islamicc", "\u0418\u0441\u043b\u044f\u043c\u0441\u043a\u0438 \u0446\u0438\u0432\u0438\u043b\u0435\u043d \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "calendarname.buddhist", "\u0411\u0443\u0434\u0438\u0441\u0442\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "calendarname.islamic", "\u0418\u0441\u043b\u044f\u043c\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "calendarname.gregorian", "\u0413\u0440\u0438\u0433\u043e\u0440\u0438\u0430\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "calendarname.gregory", "\u0413\u0440\u0438\u0433\u043e\u0440\u0438\u0430\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "calendarname.roc", "\u041a\u0430\u043b\u0435\u043d\u0434\u0430\u0440 \u043d\u0430 \u0420\u0435\u043f\u0443\u0431\u043b\u0438\u043a\u0430 \u041a\u0438\u0442\u0430\u0439" },
            { "calendarname.japanese", "\u042f\u043f\u043e\u043d\u0441\u043a\u0438 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440" },
            { "DefaultNumberingSystem", "latn" },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                }
            },
        };
        return data;
    }
}
