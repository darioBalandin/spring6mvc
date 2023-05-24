package dario.springframework.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class Beer {

        private UUID id;
        private Integer version;
        private String beerName;
        private String beerStyle;
        private String upc;
        private Integer quantityOnHand;
        private Double price;
        private LocalDateTime createdDate;
        private LocalDateTime updateDate;


}
