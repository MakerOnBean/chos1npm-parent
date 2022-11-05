package cloud.makeronbean.chos1npm.common.handler;

import cloud.makeronbean.chos1npm.common.execption.BlogException;
import cloud.makeronbean.chos1npm.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }

    /**
     * 自定义异常处理方法
     * @param e
     * @return
     */
    @ExceptionHandler(BlogException.class)
    @ResponseBody
    public Result error(BlogException e){
        return Result.fail(e.getMessage());
    }
}
