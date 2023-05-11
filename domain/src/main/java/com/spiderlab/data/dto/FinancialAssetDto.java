package com.spiderlab.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinancialAssetDto {
    private Long id;

    private String documentNumber;

    private BigDecimal buyPrice;

    private BigDecimal sellPrice;
}
