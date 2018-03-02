package com.yun.opern.common;

import com.yun.opern.utils.LogUtil;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常捕获（未在项目中明确捕获的异常）
 *
 * @author XEX
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {

    /**
     * 当全局遇到任何未捕获的异常会被HandlerExceptionResolver捕获
     * request 当前请求
     * handler 当前处理器，可以从当前handler中取参数，断点可以看见参数名称
     * exception 当前捕获的异常
     * ModelAndView 如果返回null会打印404页面，可以自定义返回的错误页面，也可以在model中传递参数在页面上显示。
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception exception) {

        String errorStr = "访问URI：" + request.getRequestURI() + " 时发生错误，错误信息:" + exception.getMessage();
        LogUtil.printInfoLog(errorStr);
        LogUtil.printErrorLog(exception);
		
		/*ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");*/
        return null;
    }

}
