/*
 * Copyright (C) 2024 The Android Open Source Project
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

package com.android.systemui.volume.panel.component.mediaoutput.ui.viewmodel

import com.android.systemui.common.shared.model.Color
import com.android.systemui.common.shared.model.Icon

/** Models Media Session Volume Panel component connected device icon. */
sealed interface DeviceIconViewModel {

    val icon: Icon
    val iconColor: Color
    val backgroundColor: Color

    data class IsPlaying(
        override val icon: Icon,
        override val iconColor: Color,
        override val backgroundColor: Color,
    ) : DeviceIconViewModel

    data class IsNotPlaying(
        override val icon: Icon,
        override val iconColor: Color,
        override val backgroundColor: Color,
    ) : DeviceIconViewModel
}
