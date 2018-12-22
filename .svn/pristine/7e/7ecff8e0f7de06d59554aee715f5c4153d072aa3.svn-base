package com.bs.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.admin.pojo.PrintInfo;
import com.bs.admin.pojo.Printer;
import com.bs.admin.pojo.PrinterModel;

@Service
public interface PrinterService {

	/**
	 * 
	 * <p>Title: queryPrinter</p>  
	 * <p>Description: 查询印刷商</p>  
	 * @param value
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<PrinterModel> queryPrinter(String value);

	/**
	 * 
	 * <p>Title: createPrinter</p>  
	 * <p>Description: 添加印刷商</p>  
	 * @param printer
	 * @param printInfo
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer createPrinter(Printer printer, PrintInfo printInfo);
	
	/**
	 * 
	 * <p>Title: updatePrinter</p>  
	 * <p>Description: 修改印刷商</p>  
	 * @param printer
	 * @param printInfo
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updatePrinter(Printer printer, PrintInfo printInfo);
	
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
	 * <p>Description: 获取全部类型</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Printer> getAllPrinter();
	
	/**
	 * 
	 * <p>Title: getPrinterByPrintId</p>  
	 * <p>Description: 通过印刷id获取印刷商信息</p>  
	 * @param printId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<PrinterModel> getPrinterByPrintId(Integer printId);
}
