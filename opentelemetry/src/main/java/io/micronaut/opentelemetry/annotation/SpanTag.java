/*
 * Copyright 2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.opentelemetry.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Applied to parameters of a method to indicate which parameters should be included in span tags.</p>
 *
 * <p>Annotation Inspired by Spring Sleuth but using Open Telemetry and Micronaut AOP</p>
 *
 * @author Alexey Zhokhov
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(value = {ElementType.PARAMETER})
public @interface SpanTag {

    /**
     * @return The key to use for the tag
     */
    String value() default "";

}