package com.zhl.springbootseed.seed.demo.mapper;

import com.zhl.springbootseed.seed.demo.entity.DemoUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Huanlin-ZHL
 * @date 2020/3/31 17:03
 */
@Mapper
public interface DemoUserMapper {
    /**
     * 向数据库插入一条数据
     * @param user 用户信息
     * @return 插入数据的数目
     */
    int insert(DemoUser user);

    /**
     * 根据id删除数据库中的一条数据
     * @param user 用户信息
     * @return 删除数据的数目
     */
    int delete(DemoUser user);

    /**
     * 根据id修改一条数据
     * @param user 用户信息
     * @return 更新数据的数目
     */
    int updateById(DemoUser user);

    /**
     * 根据id查询一条数据
     * @param user 用户信息
     * @return 查找数据的数目
     */
    DemoUser selectById(DemoUser user);
}
