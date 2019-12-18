package com.baobao.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author baobao
 * @create 2019-11-25 23:56
 * @description 自定义转换器，将请求参数的自定义日期格式字符串转化为Date类型
 */
public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source== null){
            throw new RuntimeException("请发送正确的参数");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
