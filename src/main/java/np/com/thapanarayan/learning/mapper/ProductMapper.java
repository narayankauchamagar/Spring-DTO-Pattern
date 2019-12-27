package np.com.thapanarayan.learning.mapper;


import np.com.thapanarayan.learning.dto.ProductDto;
import np.com.thapanarayan.learning.entity.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR )
public interface ProductMapper extends EntityMapper<ProductDto, Product> {
    Product toEntity(ProductDto dto);
    ProductDto toDto(Product entity);
}
