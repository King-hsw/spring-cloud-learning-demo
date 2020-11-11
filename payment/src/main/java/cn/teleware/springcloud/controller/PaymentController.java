package cn.teleware.springcloud.controller;

import cn.teleware.springcloud.dto.ResultDTO;
import cn.teleware.springcloud.model.Payment;
import cn.teleware.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : hongsw
 * @date : 2020-11-11-8:52
 * @descriptions :
 */
@RestController
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping
    public ResultDTO<Long> save(Payment payment) {
        return service.save(payment);
    }

    @GetMapping("{id}")
    public ResultDTO<Payment> query(@PathVariable("id") Long id) {
        return service.query(id);
    }

    @PutMapping
    public ResultDTO<Payment> update(Payment payment) {
        return service.update(payment);
    }

    @DeleteMapping("{id}")
    public ResultDTO<String> delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
