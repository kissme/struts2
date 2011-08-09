package com.lxitedu.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import ognl.DefaultTypeConverter;

public class TypeConverter extends DefaultTypeConverter {

	@SuppressWarnings("rawtypes")
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		// TODO Auto-generated method stub
		System.out.println("TypeConverter.convertValue()");
		if(toType==java.sql.Date.class){
			String []time=(String[])value;
			System.out.println("time:"+time[0]);
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd");
			try {
				 return simpleDateFormat.parse(time[0]);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}


	
}
