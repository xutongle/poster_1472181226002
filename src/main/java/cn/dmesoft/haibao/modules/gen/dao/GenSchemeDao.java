/**
 * Copyright &copy; 2012-2016 <a href="http://dmesoft.cn">dmesoft</a> All rights reserved.
 */
package cn.dmesoft.haibao.modules.gen.dao;

import cn.dmesoft.haibao.common.persistence.CrudDao;
import cn.dmesoft.haibao.common.persistence.annotation.MyBatisDao;
import cn.dmesoft.haibao.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 * @author dmesoft
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
