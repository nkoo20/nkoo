package com.nkoo.web.dao;

import java.util.List;
import com.nkoo.web.model.NPermission;

/**
 * 权限 Dao 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:59:03
 **/
public interface DPermission extends DGeneric<NPermission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<NPermission> findByRoleId(Long roleId);
}