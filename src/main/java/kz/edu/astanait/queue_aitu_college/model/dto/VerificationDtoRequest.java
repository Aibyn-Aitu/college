package kz.edu.astanait.queue_aitu_college.model.dto;

import lombok.Data;

@Data
public class VerificationDtoRequest {
    private Long userId;
    private Integer code;
}
