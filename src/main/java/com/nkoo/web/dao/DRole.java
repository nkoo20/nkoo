package com.nkoo.web.dao;

import java.util.List;
import com.nkoo.web.model.NRole;

/**
 * 角色Dao 接口
 * 
 * @author StarZou
 * @since 2014年7月5日 上午11:55:59
 **/
public interface DRole extends DGeneric<NRole, Long> {

    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param id
     * @return
     */
    List<NRole> findByUserId(Long userId);
}