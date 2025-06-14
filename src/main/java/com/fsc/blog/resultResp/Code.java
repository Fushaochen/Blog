package com.fsc.blog.resultResp;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:Code
 * Package:com.fsc.blog.resultResp
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/14 - 16:00
 * @Version: v1.0
 */
@Getter
@AllArgsConstructor
public enum Code {
    SUCCESS(20000, "操作成功"),
    OPERATE_FAIL(30000, "操作失败"),

    INTERNAL_FAIL(50000, "系统异常"),
    USERNAME_NOTFOUND(50001, "用户名未找到"),
    ARTICLE_NOTFOUND(50002, "文章未找到"),
    SQL_FAIL(50003, "数据库执行出错");

    private final Integer code;
    private final String message;
}
