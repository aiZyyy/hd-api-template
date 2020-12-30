package com.hd.kbswarn.modules.rain.service;

import com.hd.kbswarn.modules.rain.domain.entity.SlRainCur;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hd.common.api.vo.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 降雨实时
 * @Author: FishCoder
 * @Date:   2020-11-20
 * @Version: V1.0
 */
public interface ISlRainCurService extends IService<SlRainCur> {

    Result<?> homeList(HttpServletRequest req);
}
