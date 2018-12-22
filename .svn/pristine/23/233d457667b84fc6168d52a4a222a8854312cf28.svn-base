package com.bs.admin.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

public class AdminProvider {
	public String search(Map<String,Object> param){
		final String property = (String) param.get("name");
		final Object value;
		if(property.equals("adminAccount")){
			value = "'"+(String)param.get("value")+"'";
		}else{
			value = (Long.valueOf(String.valueOf(param.get("value"))));
		}
		
		
		// 根据参数确定执行的查询语句。true：执行查询账户当前页信息。false：执行查询符合条件的总数据条数
		Boolean bl = null != param.get("start")&& null != param.get("count");
		
		//select后的语句
		final String columns;
		
		// 根据查询需求组织查询column
		if(bl) columns = "admin_id,admin_account,admin_password,emp_id";
		else   columns = "count(*)";
		
		String sql =  new SQL(){
			{
				SELECT(columns);
				FROM("t_admin");
				
				//判断property是哪个条件
				if(property.equals("empId")) WHERE("emp_id="+value);
				else if(property.equals("adminId")) WHERE("admin_id="+value);
				else if(property.equals("adminAccount")) WHERE("admin_account like concat('%',"+value+",'%')");
			}
		}.toString();
		
		// 如果是查询信息，后面要拼接limit
		if(bl){
			// 查询当前页的员工信息的sql
			final Integer start = (Integer)param.get("start");
			final Integer count = (Integer)param.get("count");
			sql += (" limit " + start + "," + count);
		}
		
		System.out.println("sql : "+sql);
		return sql;
		
	}
}
