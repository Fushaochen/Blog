package com.fsc.blog.errorResp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ClassName:ErrorResponse
 * Package:com.fsc.blog.errorResp
 * Description:
 *
 * @Author: fsc
 * @Create: 2025/6/8 - 15:06
 * @Version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    private int status;

    private String msg;

    private LocalDateTime timestamp;


}
