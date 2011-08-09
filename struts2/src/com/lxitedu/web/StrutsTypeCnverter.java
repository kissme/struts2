package com.lxitedu.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class StrutsTypeCnverter extends StrutsTypeConverter{

	@SuppressWarnings("rawtypes")
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
			SimpleDateFormat simpleDateFormat=null;
			if(arg1[0].contains("/")){
				simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
			}else if(arg1[0].contains("-")){
				simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
			}
			try {
				return new java.sql.Date(simpleDateFormat.parse(arg1[0]).getTime());
			} catch (ParseException e) {
				throw new RuntimeException();
			}
	}
	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map arg0, Object arg1) {

		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
		return simpleDateFormat.format(arg1);

	}

}
