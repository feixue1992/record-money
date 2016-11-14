package com.lzh.record.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/9.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    private Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        Map<String, Object> model = new HashMap<>();
        model.put("e", e);
        logger.error("e", e);
        if (e instanceof BusinessException) {
            return new ModelAndView("error-business", model);
        } else if (e instanceof ParameterException) {
            return new ModelAndView("error-parameter", model);
        } else {
            return new ModelAndView("/common/error", model);
        }
    }
}
