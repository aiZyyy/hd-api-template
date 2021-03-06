package com.hd.base.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hd.base.modules.system.entity.SysCategory;
import com.hd.base.modules.system.model.TreeSelectModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description: 分类字典
 * @Author: jeecg-boot
 * @Date: 2019-05-29
 * @Version: V1.0
 */
@Repository
public interface SysCategoryMapper extends BaseMapper<SysCategory> {

    /**
     * 根据父级ID查询树节点数据
     *
     * @param pid
     * @return
     */
    public List<TreeSelectModel> queryListByPid(@Param("pid") String pid, @Param("query") Map<String, String> query);

    @Select("SELECT ID FROM sys_category WHERE CODE = #{code,jdbcType=VARCHAR}")
    public String queryIdByCode(@Param("code") String code);


    @Update("update sys_category set is_leaf=#{leaf} where id = #{id}")
    public int setMenuLeaf(@Param("id") String id, @Param("leaf") int leaf);

    @Select("SELECT root_id FROM sys_category WHERE id = #{id}")
    public String queryRootIdById(@Param("id") String id);
}
