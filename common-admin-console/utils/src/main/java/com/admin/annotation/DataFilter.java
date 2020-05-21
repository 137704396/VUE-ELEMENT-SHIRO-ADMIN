/**
 * Copyright (c) 2020-2020 通用后台 All rights reserved.
 */

package com.admin.annotation;

import java.lang.annotation.*;

/**
 * 数据过滤
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataFilter {
    /**
     * 表的别名
     */
    String tableAlias() default "";

    /**
     * true：没有本部门数据权限，也能查询本人数据
     */
    boolean user() default true;

    /**
     * 用户ID
     */
    String userId() default "user_id";
}

