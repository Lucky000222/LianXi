package com.security.dao;

import com.security.entity.TbTableTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (TbTableTime)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-21 15:34:29
 */
@Mapper
public interface TbTableTimeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbTableTime queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param tbTableTime 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<TbTableTime> queryAllByLimit(TbTableTime tbTableTime, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param tbTableTime 查询条件
     * @return 总行数
     */
    long count(TbTableTime tbTableTime);

    /**
     * 新增数据
     *
     * @param tbTableTime 实例对象
     * @return 影响行数
     */
    int insert(TbTableTime tbTableTime);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbTableTime> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbTableTime> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbTableTime> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TbTableTime> entities);

    /**
     * 修改数据
     *
     * @param tbTableTime 实例对象
     * @return 影响行数
     */
    int update(TbTableTime tbTableTime);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    TbTableTime selectByProjectId(String projectId);
}

