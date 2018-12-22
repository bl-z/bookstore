package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Printer;
import com.bs.admin.pojo.PrinterModel;

public interface PrinterMapper {
	
	/**
	 * 
	 * <p>Title: getPrinterByPrinterInfo</p>  
	 * <p>Description: 获取印刷信息</p>  
	 * @param value
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Printer> getPrinterByPrinterInfo(String value);
	
	/**
	 * 
	 * <p>Title: createPrinter</p>  
	 * <p>Description: 添加印刷商</p>  
	 * @param printerName
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer createPrinter(@Param("printerName")String printerName, @Param("printId")Integer printId);
	
	/**
	 * 
	 * <p>Title: updatePrinter</p>  
	 * <p>Description: 修改印刷商</p>  
	 * @param printerName
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updatePrinter(@Param("printerName")String printerName, @Param("printId") Integer printId);
	
	/**
	 * 
	 * <p>Title: deletePrinter</p>  
	 * <p>Description: 删除印刷商</p>  
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer deletePrinter(Integer printId);
	
	/**
	 * 
	 * <p>Title: getAllPrinter</p>  
	 * <p>Description: 获取全部印刷商</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Printer> getAllPrinter();
	
	/**
	 * 
	 * <p>Title: getPrinterByPrintId</p>  
	 * <p>Description: 通过印刷id获取对应的全部信息</p>  
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Printer getPrinterByPrintId(Integer printId);
	
	
}
