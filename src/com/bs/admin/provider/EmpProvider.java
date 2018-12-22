package com.bs.admin.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

public class EmpProvider {
	/**
	 * 
	
	 * <p>Title: search</p>  
	
	 * <p>Description: </p>  
		动态查询员工信息
		当传入页码和页码容量时查询员工
		否则查询符合条件的员工数量
	 * @param param
	 * @return  
	 * <p> @date 2018年11月27日  </p>
	 */
	public String search(Map<String,Object> param){
		final String property = (String) param.get("property");
		final Object value;
		if(property.equals("empId")&&param.get("value")!=""){
			value = (Long.valueOf(String.valueOf(param.get("value"))));
		}else{
			value = "'"+(String)param.get("value")+"'";
		}
		
		final String date1 = (String)param.get("date1");
		final String date2 = (String)param.get("date2");
		final Integer empStatus = param.get("empStatus")==null?null:(Integer)param.get("empStatus");
		
		// 根据参数确定执行的查询语句。true：执行查询员工当前页信息。false：执行查询复合体哦见的总数据条数
		Boolean bl = null != param.get("start")&& null != param.get("count");
		
		//select后的语句
		final String columns;
		
		// 根据查询需求组织查询column
		if(bl) columns = "emp_id,emp_name,emp_dept,emp_hire_date,emp_quit_date,emp_status,job_id,bank_account";
		else   columns = "count(*)";
		
		String sql =  new SQL(){
			{
				SELECT(columns);
				FROM("t_employee");
				
				//判断property是哪个条件
				if(property.equals("empId")) WHERE("emp_id="+value);
				else if(property.equals("empDept")) WHERE("emp_dept like concat('%',"+value+",'%')");
				else if(property.equals("empName")) WHERE("emp_name like concat('%',"+value+",'%')");
				
				if(date1 != "''" && date2 != "''") WHERE("emp_hire_date between '"+date1+"' and '"+date2+"'");
				if(empStatus != null)WHERE("emp_status="+empStatus);
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

	
	public EmpProvider() {
		super();
	}
	
	
}
