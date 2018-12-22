package com.bs.admin.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
* <p>Title: UploadController</p>  
* <p>Description: 文件上传</p>  
* @author 胡杰
* @date 2018年11月21日
 */

@Controller
public class UploadController {

//	@PostMapping("upload")
//	public String doUpload(@RequestParam("filename") MultipartFile[] files) throws IllegalStateException, IOException {
//		System.out.println("123");
//		for (MultipartFile file : files) {
//			System.out.println("文件名：" + file.getOriginalFilename());
//			file.transferTo(new File("D://测试IO文件/".concat(file.getOriginalFilename())));
//		}
//		return "index";
//	}

}
