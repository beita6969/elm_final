package com.zmd.elm.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommomUtil {

	public static String getcurrentDate(){
		// 时间格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar calendar = Calendar.getInstance();
		
		return sdf.format(calendar.getTime());
	}
	
}
