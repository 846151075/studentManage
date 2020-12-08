package com.hdc.lsp.service;

import com.hdc.lsp.pojo.Sclass;

public interface SclassService {
	/**
	 * 查询班级下所有用户
	 * @param sclass
	 * @return sclass
	 */
	public Sclass selectUsersBySclass(Sclass sclass);
}
