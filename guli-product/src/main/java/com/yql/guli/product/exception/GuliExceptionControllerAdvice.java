package com.yql.guli.product.exception;

import com.yql.guli.common.exception.BizCodeEnume;
import com.yql.guli.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@Slf4j
@RestControllerAdvice(basePackages = "com.yql.guli.product.controller")
public class GuliExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{},异常类型:{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            map.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VALID_EXCEPTION.getCode(),BizCodeEnume.VALID_EXCEPTION.getMsg()).put("data",map);
        // return new Result().error(400, "数据校验错误").put(map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        log.error("错误",throwable);
        return R.error(BizCodeEnume.UNKNOW_EXEPTION.getCode(),BizCodeEnume.UNKNOW_EXEPTION.getMsg());
    }

}
