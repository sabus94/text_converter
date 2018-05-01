/*
 * Copyright (c) 2018 by Tran Le Duy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duy.text.converter.core.hashfunction;

import android.support.annotation.NonNull;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by Duy on 2/8/2018.
 */

public class Sha384Hash implements IHash {
    @NonNull
    @Override
    public String getName() {
        return "SHA-384";
    }

    @Override
    public String encode(String text) {
        try {
            return DigestUtils.sha384Hex(text.getBytes());
        } catch (Exception e) {
            return "";
        }
    }
}