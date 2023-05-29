package com.yql.guli.ware.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class MergeVo {
   private Long purchaseId; //整单id
   private List<Long> items;
}
