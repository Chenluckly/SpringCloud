package com.wanghu.springcloud.entities;

import lombok.*;


/**
 * @author wanghu
 * @date 2022/2/5 19:30
 */
@Getter
@ToString
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
