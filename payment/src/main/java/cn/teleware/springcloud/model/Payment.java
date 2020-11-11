package cn.teleware.springcloud.model;

import javax.persistence.*;

/**
 * @author : hongsw
 * @date : 2020-11-11-9:45
 * @descriptions :
 */
@Entity
@Table(name = "payment")
public class Payment {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    /**
     * 支付流水号
     */
    @Column(name = "serial")
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }
}
