package com.bs.admin.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.bs.admin.pojo.PrintInfo;

public class PrintProvider {

	/**
	 * 
	 * <p>Title: createPrintInfo</p>  
	 * <p>Description: 添加印刷信息</p>  
	 * @param param
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	public String createPrintInfo(Map<String, Object> param){
		PrintInfo printInfo = (PrintInfo) param.get("printInfo");
		return new SQL(){
			{
				INSERT_INTO("t_print_info");
				if (null != printInfo.getPrintId()) 			VALUES("print_id", "#{printInfo.printId}");
				if (null != printInfo.getPrintSize()) 			VALUES("print_size", "#{printInfo.printSize}");
				if (null != printInfo.getPrintDate()) 		VALUES("print_date", "#{printInfo.printDate}");
				if (null != printInfo.getPrintQuantity()) VALUES("print_quantity", "#{printInfo.printQuantity}");
				if (null != printInfo.getPrintBatch()) 		VALUES("print_Batch", "#{printInfo.printBatch}");
			}
		}.toString();
	}
	
	/**
	 * 
	 * <p>Title: updatePrintInfo</p>  
	 * <p>Description: 修改印刷信息</p>  
	 * @param param
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	public String updatePrintInfo(Map<String, Object> param){
		PrintInfo printInfo = (PrintInfo) param.get("printInfo");
		return new SQL(){
			{
				UPDATE("t_print_info");
				if (null != printInfo.getPrintId()) 			SET("print_id=#{printInfo.printId}");
				if (null != printInfo.getPrintSize()) 			SET("print_size=#{printInfo.printSize}");
				if (null != printInfo.getPrintDate()) 		SET("print_date=#{printInfo.printDate}");
				if (null != printInfo.getPrintQuantity()) SET("print_quantity=#{printInfo.printQuantity}");
				if (null != printInfo.getPrintBatch()) 		SET("print_Batch=#{printInfo.printBatch}");
				WHERE("print_id=#{printInfo.printId}");
			}
		}.toString();
	}
	
	
	
}
