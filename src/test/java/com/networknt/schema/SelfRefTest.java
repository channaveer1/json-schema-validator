/*
 * Copyright (c) 2016 Network New Technologies Inc.
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

package com.networknt.schema;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by stevehu on 2016-12-20.
 */
public class SelfRefTest extends BaseJsonSchemaValidatorTest {
    @Ignore("This test currently is failing because of a StackOverflow caused by a recursive $ref.")
    @Test()
    public void testSelfRef() throws Exception {
        JsonSchema node = getJsonSchemaFromClasspath("selfRef.json");
        System.out.println("node = " + node);
    }
}