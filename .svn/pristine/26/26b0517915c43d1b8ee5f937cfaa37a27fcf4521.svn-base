package com.bs.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.PrinterDao;
import com.bs.admin.pojo.PrintInfo;
import com.bs.admin.pojo.Printer;
import com.bs.admin.pojo.PrinterModel;
import com.bs.admin.service.PrinterService;

@Service
public class PrinterServiceImpl implements PrinterService {
	
	@Autowired
	private PrinterDao pd;

	@Override
	public List<PrinterModel> queryPrinter(String value) {
		List<PrinterModel> model = new ArrayList<PrinterModel>();
		List<Printer> print = pd.retrievePrinterByPrinterInfo(value);
		if (print.size() > 0) {
			for (Printer p : print) {
				PrinterModel pm = new PrinterModel(p.getPrinterId(), p.getPrinterName(), p.getPrintInfo().getPrintId(),
						p.getPrintInfo().getPrintSize(), p.getPrintInfo().getPrintDate(),
						p.getPrintInfo().getPrintQuantity(), p.getPrintInfo().getPrintBatch());
				model.add(pm);
			}
		}  
		return model;
	}

	@Override
	public Integer createPrinter(Printer printer, PrintInfo printInfo) {
		Integer row1 = pd.createPrinter(printer, printInfo);
		Integer row2 = pd.createPrintInfo(printInfo);
		Integer sum = row1 + row2;
		return sum;
	}

	@Override
	public Integer updatePrinter(Printer printer, PrintInfo printInfo) {
		Integer row1 = pd.updatePrinter(printer, printInfo);
		Integer row2 = pd.updatePrintInfo(printInfo);
		Integer sum = row1 + row2;
		return sum;
	}

	@Override
	public Integer deletePrinter(Integer printId) {
		Integer printer = pd.deletePrinter(printId);
		Integer printInfo = pd.deletePrintInfo(printId);
		Integer sum = printInfo + printer;
		return sum;
	}

	@Override
	public List<Printer> getAllPrinter() {
		return pd.getAllPrinter();
	}

	@Override
	public List<PrinterModel> getPrinterByPrintId(Integer printId) {
		List<PrinterModel> model = new ArrayList<>();
		Printer p = pd.getPrinterByPrintId(printId);
		if (null != p.getPrinterName()) {
			PrinterModel printerModel = new PrinterModel(p.getPrinterId(), p.getPrinterName(),
					p.getPrintInfo().getPrintId(), p.getPrintInfo().getPrintSize(), p.getPrintInfo().getPrintDate(),
					p.getPrintInfo().getPrintQuantity(), p.getPrintInfo().getPrintBatch());
			model.add(printerModel);
			return model;
		}
		return null;
	}
	


}
