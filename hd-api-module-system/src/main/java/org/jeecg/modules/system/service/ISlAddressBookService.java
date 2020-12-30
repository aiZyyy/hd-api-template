package org.jeecg.modules.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.api.vo.Result;
import org.jeecg.modules.system.entity.SlAddressBook;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 通讯录管理
 * @Author: FishCoder
 * @Date: 2020-12-03
 * @Version: V1.0
 */
public interface ISlAddressBookService extends IService<SlAddressBook> {

    Result<?> queryPageList(IPage<SlAddressBook> pageList, HttpServletRequest req);
}
