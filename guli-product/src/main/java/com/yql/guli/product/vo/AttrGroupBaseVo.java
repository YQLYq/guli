package com.yql.guli.product.vo;


import com.yql.guli.product.entity.AttrEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class AttrGroupBaseVo {
        /**
         * attrGroupId
         */
        private Long attrGroupId;
        /**
         * attrGroupName
         */
        private String attrGroupName;
        /**
         * sort
         */
        private Long sort;
        /**
         * descript
         */
        private String descript;
        /**
         * icon
         */
        private String icon;
        /**
         * catelogId
         */
        private Long catelogId;
        /**
         * attrs
         */
        private List<AttrEntity> attrs;
}
