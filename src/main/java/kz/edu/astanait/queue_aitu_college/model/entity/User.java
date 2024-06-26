package kz.edu.astanait.queue_aitu_college.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "iin")
    private String iin;

    @Column(name = "code")
    private Integer code;

    @Column(name = "is_verified")
    private Boolean isVerified;

    @Column(name = "ticket_id")
    private Long ticketId;
}
