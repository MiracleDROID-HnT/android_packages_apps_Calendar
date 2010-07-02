/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.calendar;

import android.content.Context;
import android.widget.ViewSwitcher;


public class WeekView extends CalendarView {
    private static final int CELL_MARGIN = 0;

    public WeekView(Context activity, CalendarController controller,
            ViewSwitcher viewSwitcher, EventLoader eventLoader) {
        super(activity, controller, viewSwitcher, eventLoader);
        init();
    }

    private void init() {
        mDrawTextInEventRect = true;
        mNumDays = 7;
        mEventGeometry.setCellMargin(CELL_MARGIN);
    }
}
