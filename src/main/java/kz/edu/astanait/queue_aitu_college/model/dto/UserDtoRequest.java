package kz.edu.astanait.queue_aitu_college.model.dto;

import lombok.Data;

@Data
public class UserDtoRequest {
    String email;
    String firstname;
    String lastname;
    String iin;
}
