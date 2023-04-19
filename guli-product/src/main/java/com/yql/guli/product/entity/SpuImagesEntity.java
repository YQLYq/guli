package com.yql.guli.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu图片
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity {

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * spu_id
     */
	private Long spuId;
    /**
     * 图片名
     */
	private String imgName;
    /**
     * 图片地址
     */
	private String imgUrl;
    /**
     * 顺序
     */
	private Integer imgSort;
    /**
     * 是否默认图
     */
	private Integer defaultImg;
}