package cn.teleware.springcloud.dto;

import java.io.Serializable;

/**
 * @author : hongsw
 * @date : 2020-11-11-8:46
 * @descriptions :
 */
public class PaymentDTO implements Serializable {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 支付流水号
     */
    private String serial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
