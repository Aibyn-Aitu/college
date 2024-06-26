package kz.edu.astanait.queue_aitu_college.repository;

import kz.edu.astanait.queue_aitu_college.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByIin(String iin);
    Optional<User> findUserByTicketId(Long ticketId);
}
