package dario.springframework.spring6restmvc.mappers;

import dario.springframework.spring6restmvc.entities.Customer;
import dario.springframework.spring6restmvc.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
}
