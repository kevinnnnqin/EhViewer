/*
 * Copyright (C) 2014 Hippo Seven
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

package com.hippo.ehviewer.ehclient;

import org.json.JSONException;
import org.json.JSONObject;

public class RateParser {

    public float mRatingAvg;
    public int mRatingCnt;

    boolean parser(String body) {
        if (body == null)
            return false;

        try {
            JSONObject jsonObject = new JSONObject(body);
            mRatingAvg = (float)jsonObject.getDouble("rating_avg");
            mRatingCnt = jsonObject.getInt("rating_cnt");
            return true;
        } catch (JSONException e) {
            return false;
        }
    }
}
