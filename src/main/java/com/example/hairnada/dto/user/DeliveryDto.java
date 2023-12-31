package com.example.hairnada.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class DeliveryDto {
    private Long deliveryNumber;
    private String deliveryName;
}
