package com.xxland.process.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxland.model.process.Process;
import com.xxland.vo.process.ProcessQueryVo;
import com.xxland.vo.process.ProcessVo;

import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 审批类型 Mapper 接口
 * </p>
 *
 * @author xxland
 * @since 2023-02-14
 */
public interface OaProcessMapper extends BaseMapper<Process> {

    //审批管理列表
    IPage<ProcessVo> selectPage(Page<ProcessVo> pageParam, @Param("vo") ProcessQueryVo processQueryVo);
}
