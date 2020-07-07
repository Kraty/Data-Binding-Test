package waq.hbwl.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 自定义日期转换器
 * */

public class DataConverter implements Converter<String, Date> {

    public Date convert(String s) {

        String dataPattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataPattern);
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException("请采用该日期格式：" + dataPattern);
        }

    }


}
