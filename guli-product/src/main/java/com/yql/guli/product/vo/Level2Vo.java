package com.yql.guli.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Level2Vo {
    private String catalog1Id;
    private List<CateLevel3> catalog3List;
    private String id;
    private String name;

    public Level2Vo(String catalog1Id, String id, String name) {
        this.catalog1Id = catalog1Id;
        this.id = id;
        this.name = name;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CateLevel3{
        private String catalog2Id;
        private String id;
        private String name;
    }
}
