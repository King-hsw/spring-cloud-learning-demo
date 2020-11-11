package cn.teleware.springcloud.dto;

/**
 * @author : hongsw
 * @date : 2020-11-11-8:17
 * @descriptions : http请求返回对象
 */
public class ResultDTO<T> {
    private Integer code;
    private String message;
    private T data;

    @Override
    public String toString() {
        return "ResultDTO{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ResultDTO(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultDTO(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}