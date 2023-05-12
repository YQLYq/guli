package com.yql.guli.product.service;

import com.yql.guli.common.service.CrudService;
import com.yql.guli.product.dto.SpuImagesDTO;
import com.yql.guli.product.entity.SpuImagesEntity;

import java.util.List;


/**
 * spu图片
 *
 * @author yyy yyy@gmail.com
 * @since 1.0.0 2023-04-18
 */
public interface SpuImagesService extends CrudService<SpuImagesEntity, SpuImagesDTO> {

    void saveImages(Long id, List<String> images);
}