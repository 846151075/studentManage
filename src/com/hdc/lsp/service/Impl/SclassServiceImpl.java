package com.hdc.lsp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdc.lsp.mapper.SclassMapper;
import com.hdc.lsp.pojo.Sclass;
import com.hdc.lsp.service.SclassService;

@Service
public class SclassServiceImpl implements SclassService{
	
	@Autowired
	private SclassMapper sclassMapper;
	
	@Override
	public Sclass selectUsersBySclass(Sclass sclass) {
		// TODO Auto-generated method stub
		return sclassMapper.selectUsersBySclass(sclass);
	}

}
