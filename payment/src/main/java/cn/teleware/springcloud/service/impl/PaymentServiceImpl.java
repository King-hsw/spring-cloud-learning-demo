package cn.teleware.springcloud.service.impl;

import cn.teleware.springcloud.dao.PaymentRepository;
import cn.teleware.springcloud.dto.ResultDTO;
import cn.teleware.springcloud.model.Payment;
import cn.teleware.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author : hongsw
 * @date : 2020-11-11-8:55
 * @descriptions :
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository repository;

    /**
     * @param payment 实体类
     * @description: 新增
     * @author hongsw
     * @date 2020/11/11 9:58
     **/
    @Override
    public ResultDTO<Long> save(Payment payment) {
        Payment result = repository.save(payment);
        return new ResultDTO<>(200, "插入成功", result.getId());
    }

    /**
     * @param id 主键
     * @return cn.teleware.springcloud.dto.ResultDTO<cn.teleware.springcloud.model.Payment>
     * @description: 通过主键查询
     * @author hongsw
     * @date 2020/11/11 10:09
     **/
    @Override
    public ResultDTO<Payment> query(Long id) {
        Optional<Payment> result = repository.findById(id);
        Payment payment = result.orElseGet(Payment::new);
        return new ResultDTO<>(200, "查询成功", payment);
    }

    /**
     * 更新实体
     *
     * @param payment 实体类
     * @return cn.teleware.springcloud.dto.ResultDTO<java.lang.Long>
     * @author hongsw
     * @date 2020/11/11 13:49
     **/
    @Override
    public ResultDTO<Payment> update(Payment payment) {
        return new ResultDTO<>(200, "更新成功", repository.saveAndFlush(payment));
    }


    /**
     * 删除
     *
     * @param id 主键
     * @return cn.teleware.springcloud.dto.ResultDTO<java.lang.String>
     * @author hongsw
     * @date 2020/11/11 13:52
     **/
    @Override
    public ResultDTO<String> delete(Long id) {
        repository.deleteById(id);
        return new ResultDTO<>(200, "删除成功");
    }
}
