package com.example.sellland.repositories;

import com.example.sellland.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //Long - тип id`шника, JpaRepository - чтобы не прописывать логику взимодействия с БД, таким образом получаем доступ к методам get save delete
    List<Product> findByTitle(String title);
}
