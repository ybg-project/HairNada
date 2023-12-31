package com.example.hairnada.vo.hairVo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class HairVo {
    private Long hairNumber;
    private String hairName;
    private Long hairLikeCnt;
    private String hairContent;
    private String hairGender;
    private Long shapeNumber;
    private Long hairShopNumber;
    private Long hairFileNumber;
    private Long lengthNumber;
    private String hairFileUploadPath;
    private String hairFileUuid;
    private Long userNumber;
    private String hairFileName;
    private String lengthName;
    private String shapeName;
    private int likeCnt;
}
