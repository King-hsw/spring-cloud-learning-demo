package cn.teleware.springcloud.service;

import cn.teleware.springcloud.dto.ResultDTO;
import cn.teleware.springcloud.model.Payment;

/**
 * @author : hongsw
 * @date : 2020-11-11-8:55
 * @descriptions :
 */
public interface PaymentService {
    /**
     * 新增
     *
     * @param payment 实体类
     * @author hongsw
     * @date 2020/11/11 9:58
     **/
    ResultDTO<Long> save(Payment payment);

    /**
     * 通过主键查询
     *
     * @param id 主键
     * @return cn.teleware.springcloud.dto.ResultDTO<cn.teleware.springcloud.model.Payment>
     * @author hongsw
     * @date 2020/11/11 10:09
     **/
    ResultDTO<Payment> query(Long id);

    /**
     * 更新实体
     *
     * @param payment 实体类
     * @return cn.teleware.springcloud.dto.ResultDTO<cn.teleware.springcloud.model.Payment>
     * @author hongsw
     * @date 2020/11/11 13:49
     **/
    ResultDTO<Payment> update(Payment payment);

    /**
     * 删除
     *
     * @param id 主键
     * @return cn.teleware.springcloud.dto.ResultDTO<java.lang.String>
     * @author hongsw
     * @date 2020/11/11 13:52
     **/
    ResultDTO<String> delete(Long id);
}
