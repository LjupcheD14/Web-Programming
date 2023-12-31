package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.TicketOrder;
import mk.finki.ukim.mk.lab.service.TicketOrderService;
import org.springframework.stereotype.Service;

@Service
public class TicketOrderImpl implements TicketOrderService {

    @Override
    public TicketOrder placeOrder(String movieTitle, String clientName, String address, int numberOfTickets) {
        // Convert int to Long
        Long numberOfTicketsLong = Long.valueOf(numberOfTickets);
        return new TicketOrder(movieTitle, clientName, address, numberOfTicketsLong);
    }
}


