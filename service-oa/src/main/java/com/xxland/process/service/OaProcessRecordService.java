package com.xxland.process.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxland.model.process.ProcessRecord;

/**
 * <p>
 * 审批记录 服务类
 * </p>
 *
 * @author xxland
 * @since 2023-02-15
 */
public interface OaProcessRecordService extends IService<ProcessRecord> {

    void record(Long processId,Integer status,String description);
}
