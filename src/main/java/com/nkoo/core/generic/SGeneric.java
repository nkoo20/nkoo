package com.nkoo.core.generic;

import java.io.Serializable;
import java.util.List;

public interface SGeneric<Model, PK extends Serializable> {

	 /**
     * 插入对象
     *
     * @param model 对象
     */
    void save(Model model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    void update(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    void delete(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    Model find(PK id);
    
    
    List<Model> findAll();
    
    
    List<Model> findByIds(PK[] ids);
    
}
