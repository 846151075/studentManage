package com.hdc.lsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hdc.lsp.pojo.Sclass;
import com.hdc.lsp.service.SclassService;

@Controller
public class SclassController {
	
	@Autowired
	private SclassService sclassService;
	
	/**
	 * 查询班级下所有用户
	 * @param sclass
	 * @return sclass
	 */
	public Sclass selectUsersBySclass(Sclass sclass) {
		// TODO Auto-generated method stub
		return sclassService.selectUsersBySclass(sclass);
	}
}
