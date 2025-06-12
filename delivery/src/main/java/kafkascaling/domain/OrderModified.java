package kafkascaling.domain;

import java.util.*;
import kafkascaling.domain.*;
import kafkascaling.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderModified extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;
    private Long customerId;
    private String address;
}
