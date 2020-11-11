package cn.teleware.springcloud.dao;

import cn.teleware.springcloud.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : hongsw
 * @date : 2020-11-11-9:36
 * @descriptions :
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
