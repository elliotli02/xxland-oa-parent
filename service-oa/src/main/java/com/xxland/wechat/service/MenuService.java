package com.xxland.wechat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxland.model.wechat.Menu;
import com.xxland.vo.wechat.MenuVo;

import java.util.List;

/**
 * <p>
 * 菜单 服务类
 * </p>
 *
 * @author xxland
 * @since 2023-02-16
 */
public interface MenuService extends IService<Menu> {

    //获取全部菜单
    List<MenuVo> findMenuInfo();

    //同步菜单
    void syncMenu();

    //删除菜单
    void removeMenu();
}
