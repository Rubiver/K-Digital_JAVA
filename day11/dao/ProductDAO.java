package day11.dao;

import day11.dto.ProductDTO;

import java.util.*;

public class ProductDAO {
    List<ProductDTO> productList = new ArrayList<>();

    public ProductDAO() {
    }

    public void addProduct(ProductDTO productDTO) {
        productList.add(productDTO);
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public List<ProductDTO> searchByName(String name) {
        List<ProductDTO> result = new ArrayList<>();
        for (ProductDTO productDTO : productList) {
            if (productDTO.getName().contains(name)) {
                result.add(productDTO);
            }
        }
        return result;
    }

    public boolean deleteById(String id) {
        for (ProductDTO productDTO : productList) {
            if (productDTO.getId().contains(id)) {
                productList.remove(productDTO);
                return true;
            }
        }
        return false;
    }

    public boolean updateById(String id) {
        //List<ProductDTO> result = new ArrayList<>();
        for (ProductDTO productDTO : productList) {
            if (productDTO.getId().equals(id)) {
                //productList.remove(productDTO);
                return true;
            }
        }
        return false;
    }

    public void updateContent(String id, String name, int price) {
        for (ProductDTO productDTO : productList) {
            if (productDTO.getId().equals(id)) {
                productDTO.setId(id);
                productDTO.setName(name);
                productDTO.setPrice(price);
                productDTO.setRegDate(System.currentTimeMillis());
            }
        }
    }
}
