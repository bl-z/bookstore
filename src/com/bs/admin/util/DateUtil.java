package com.bs.admin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * 
	
	 * <p>Title: changeDateString</p>  
	
	 * <p>Description: </p>  
		用于将easyui的日期"11/14/2018"转换为"2018-11-14"
	 * @param date
	 * @return  
	 * <p> @date 2018年11月28日  </p>
	 */
	public static String changeDateString(String date){
		if(date == null || date.length() == 0) return null;
		String year = date.substring(date.lastIndexOf("/") + 1, date.length());
		String day = date.substring(date.indexOf("/") + 1, date.lastIndexOf("/"));
		String month = date.substring(0, date.indexOf("/"));
		String date1 = year + "-" + month + "-" + day;
		System.out.println("Util中的date ： " + date1);
		return date1;
		
	}
	
	/**
	 * 
	
	 * <p>Title: getCurrentTimeString</p>  
	
	 * <p>Description: </p>  
	用于获取当前日期并返回"2018-11-14"字符串
	 * @return  
	 * <p> @date 2018年11月29日  </p>
	 */
	public static String getCurrentTimeString(){
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
	/**
	 * 
	
	 * <p>Title: getNowTime</p>  
	
	 * <p>Description: </p>  
		获取当前时分秒
	 * @return  
	 * <p> @date 2018年12月11日  </p>
	 */
	public static String getNowTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(d);
	}
	
	   /**  
	
	 * <p>Title: formatDateTime</p>  
	
	 * <p>Description: 将long 转化为日时分秒</p>  
	
	 * @param timeMillis
	 * @return  
	 * <p> @date 2018年12月10日  </p> 
	 */
	public static String formatDateTime(long timeMillis){
			long day = timeMillis/(24*60*60*1000);
			long hour = (timeMillis/(60*60*1000)-day*24);
			long min = ((timeMillis/(60*1000))-day*24*60-hour*60);
			long s = (timeMillis/1000-day*24*60*60-hour*60*60-min*60);
			long sss = (timeMillis-day*24*60*60*1000-hour*60*60*1000-min*60*1000-s*1000);
			return (day>0?day+",":"")+hour+":"+min+":"+s+"."+sss;
	    }
}
