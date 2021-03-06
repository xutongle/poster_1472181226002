/**
 * Copyright &copy; 2012-2016 <a href="http://dmesoft.cn">dmesoft</a> All rights reserved.
 */
package cn.dmesoft.haibao.modules.haibao.dao;

import cn.dmesoft.haibao.common.persistence.CrudDao;
import cn.dmesoft.haibao.common.persistence.annotation.MyBatisDao;
import cn.dmesoft.haibao.modules.haibao.entity.Scenedatasys;

/**
 * 单表生成DAO接口
 * @author Dmesoft
 * @version 2016-08-18
 */
@MyBatisDao
public interface ScenedatasysDao extends CrudDao<Scenedatasys> {
	
}