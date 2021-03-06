package com.hd.kbswarn.modules.rain.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Description: 日降雨量统计
 * @Author: FishCoder
 * @Date:   2020-11-24
 * @Version: V1.0
 */
@Data
@TableName("sl_rain_day")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="sl_rain_day对象", description="日降雨量统计")
public class SlRainDay {
    
	/**测站编码*/
	@Excel(name = "测站编码", width = 15)
    @ApiModelProperty(value = "测站编码")
	private java.lang.String stcd;
	/**测报时间*/
	@Excel(name = "测报时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "测报时间")
	private java.util.Date tm;
	/**日累计降雨量*/
	@Excel(name = "日累计降雨量", width = 15)
    @ApiModelProperty(value = "日累计降雨量")
	private java.math.BigDecimal val;
}
