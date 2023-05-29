package com.yql.guli.ware.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@Data
public class DoneVo {
    /**
     * id
     */
    @NotNull
    private Long id;
    /**
     * items
     */
    private List<ItemsVo> items;

    /**
     * ItemsVo
     */
    @NoArgsConstructor
    @Data
    public static class ItemsVo {
        /**
         * itemId
         */
        private Long itemId;
        /**
         * status
         */
        private Integer status;
        /**
         * reason
         */
        private String reason;
    }
}
