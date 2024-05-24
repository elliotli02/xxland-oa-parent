package com.xxland.process.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxland.auth.service.SysUserService;
import com.xxland.model.process.ProcessRecord;
import com.xxland.model.system.SysUser;
import com.xxland.process.mapper.OaProcessRecordMapper;
import com.xxland.process.service.OaProcessRecordService;
import com.xxland.security.custom.LoginUserInfoHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 审批记录 服务实现类
 * </p>
 *
 * @author xxland
 * @since 2023-02-15
 */
@Service
public class OaProcessRecordServiceImpl extends ServiceImpl<OaProcessRecordMapper, ProcessRecord> implements OaProcessRecordService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public void record(Long processId, Integer status, String description) {
        Long userId = LoginUserInfoHelper.getUserId();
        SysUser sysUser = sysUserService.getById(userId);
        ProcessRecord processRecord = new ProcessRecord();
        processRecord.setProcessId(processId);
        processRecord.setStatus(status);
        processRecord.setDescription(description);
        processRecord.setOperateUser(sysUser.getName());
        processRecord.setOperateUserId(userId);
        baseMapper.insert(processRecord);
    }
}
