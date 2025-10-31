package uppick.uppickrecommend.recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uppick.uppickrecommend.recommend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
