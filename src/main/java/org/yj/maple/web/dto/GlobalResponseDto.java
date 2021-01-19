package org.yj.maple.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GlobalResponseDto<T> {
    private String code;
    private String status;
    private String message;
    private T data;
}
