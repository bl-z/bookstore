package com.bs.admin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.admin.dao.PrinterDao;
import com.bs.admin.mapper.PrintInfoMapper;
import com.bs.admin.mapper.PrinterMapper;
import com.bs.admin.pojo.PrintInfo;
import com.bs.admin.pojo.Printer;
import com.bs.admin.pojo.PrinterModel;

/**
 * 
* <p>Title: PrinterDaoImpl</p>  
* <p>Description: 印刷商dao包实现</p>  
* @author 胡杰  
* <p> @date 2018年12月10日</p>
 */
@Repository
public class PrinterDaoImpl implements PrinterDao {

	// 自动注入
	@Autowired
	private PrinterMapper pm;
	@Autowired
	private PrintInfoMapper pi;

	/**
	 * 查询印刷商
	 */
	@Override
	public List<Printer> retrievePrinterByPrinterInfo(String value) {
		return pm.getPrinterByPrinterInfo(value);
	}

	@Override
	public Integer createPrinter(Printer printer, PrintInfo printInfo) {
		return pm.createPrinter(printer.getPrinterName(), printInfo.getPrintId());
	}

	/**
	 * 添加印刷信息
	 */
	@Override
	public Integer createPrintInfo(PrintInfo printInfo) {
		return pi.createPrintInfo(printInfo);
	}

	/**
	 * 修改印刷信息
	 */
	@Override
	public Integer updatePrintInfo(PrintInfo printInfo) {
		return pi.updatePrintInfo(printInfo);
	}

	@Override
	public Integer updatePrinter(Printer printer, PrintInfo printInfo) {
		if (null != printer.getPrinterName() && null != printInfo.getPrintId())
			return pm.updatePrinter(printer.getPrinterName(), printInfo.getPrintId());
		return null;
	}

	/**
	 * 删除印刷信息
	 */
	@Override
	public Integer deletePrinter(Integer printId) {
		return pm.deletePrinter(printId);
	}

	@Override
	public Integer deletePrintInfo(Integer printId) {
		return pi.deletePrintInfo(printId);
	}

	/**
	 * 获取全部印刷商
	 */
	@Override
	public List<Printer> getAllPrinter() {
		return pm.getAllPrinter();
	}

	/**
	 * 通过印刷id获取印刷商
	 */
	@Override
	public Printer getPrinterByPrintId(Integer printId) {
		return pm.getPrinterByPrintId(printId);
	}
	
}
