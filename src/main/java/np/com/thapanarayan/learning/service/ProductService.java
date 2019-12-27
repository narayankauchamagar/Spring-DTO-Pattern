package np.com.thapanarayan.learning.service;

import np.com.thapanarayan.learning.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();

    ProductDto findById(long id);

    ProductDto save(ProductDto productDto);

    void deleteById(Long id);
}
