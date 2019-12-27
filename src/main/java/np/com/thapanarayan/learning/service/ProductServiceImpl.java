package np.com.thapanarayan.learning.service;

import np.com.thapanarayan.learning.dto.ProductDto;
import np.com.thapanarayan.learning.entity.Product;
import np.com.thapanarayan.learning.mapper.ProductMapper;
import np.com.thapanarayan.learning.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductDto> findAll(){
        return productMapper.toDto(productRepository.findAll());
    }

    @Override
    public ProductDto findById(long id) {
        return productMapper.toDto(productRepository.findById(id).get());
    }

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        return productMapper.toDto(productRepository.save(product));
    }

    @Override
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

}
