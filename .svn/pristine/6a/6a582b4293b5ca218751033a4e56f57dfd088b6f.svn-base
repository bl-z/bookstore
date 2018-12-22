package com.bs.admin.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.UpdateProvider;

import com.bs.admin.pojo.PrintInfo;
import com.bs.admin.provider.PrintProvider;

public interface PrintInfoMapper {

	/**
	 * 
	 * <p>Title: getPrintInfoByPrintId</p>  
	 * <p>Description: 获取印刷信息</p>  
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	PrintInfo getPrintInfoByPrintId(Integer printId);
	
	/**
	 * 
	 * <p>Title: createPrintInfo</p>  
	 * <p>Description: 动态添加印刷信息</p>  
	 * @param printInfo
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@InsertProvider(method="createPrintInfo", type=PrintProvider.class)
	Integer createPrintInfo(@Param("printInfo")PrintInfo printInfo);
	
	/**
	 * 
	 * <p>Title: updatePrintInfo</p>  
	 * <p>Description: 修改印刷信息</p>  
	 * @param printInfo
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	@UpdateProvider(method="updatePrintInfo", type=PrintProvider.class)
	Integer updatePrintInfo(@Param("printInfo")PrintInfo printInfo);
	
	/**
	 * 
	 * <p>Title: deletePrintInfo</p>  
	 * <p>Description: 删除印刷信息</p>  
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer deletePrintInfo(Integer printId);
}
