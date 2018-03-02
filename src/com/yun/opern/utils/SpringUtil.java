package com.yun.opern.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.context == null) {
            SpringUtil.context = applicationContext;
        }
    }

    public static Object getBean(String name) throws BeansException {
        return context != null ? context.getBean(name) : null;
    }

    public static <T> T getBean(Class<T> requiredType) throws BeansException {
        return context != null ? context.getBean(requiredType) : null;
    }

    public static <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return context != null ? context.getBean(name, requiredType) : null;
    }
}
