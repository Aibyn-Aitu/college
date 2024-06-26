package kz.edu.astanait.queue_aitu_college.model.dto;

import kz.edu.astanait.queue_aitu_college.model.entity.Ticket;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatedTicketDTO {
    private Ticket ticketBasic;
    private Ticket ticketBenefit;
}
