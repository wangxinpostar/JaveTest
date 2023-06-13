package com.powernode.bank.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @TableName t_act
 */
@Repository
@TableName(value = "t_act")
public class Account implements Serializable {
    /**
     *
     */
    @TableId
    private String actno;

    /**
     *
     */
    private Double balance;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public String getActno() {
        return actno;
    }

    /**
     *
     */
    public void setActno(String actno) {
        this.actno = actno;
    }

    /**
     *
     */
    public Double getBalance() {
        return balance;
    }

    /**
     *
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Account other = (Account) that;
        return (this.getActno() == null ? other.getActno() == null : this.getActno().equals(other.getActno()))
                && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActno() == null) ? 0 : getActno().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actno=").append(actno);
        sb.append(", balance=").append(balance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}