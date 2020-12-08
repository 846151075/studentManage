package com.hdc.lsp.mapper;

import java.util.List;

import com.hdc.lsp.pojo.Sclass;
import com.hdc.lsp.pojo.User;

public interface SclassMapper {

//	查询班级下所有用户。
	public Sclass selectUsersBySclass(Sclass sclass);
	
}
