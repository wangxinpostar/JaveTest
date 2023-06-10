package com.powernode.bank.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.powernode.bank.pojo.Account;

import java.util.List;

/**
 * @author wangx
 * @description 针对表【t_act】的数据库操作Service
 * @createDate 2023-06-05 09:32:07
 */
public interface AccountService extends IService<Account> {
    boolean save(Account act);

    int deleteByActno(String actno);

    int update(String actno, Double balance);

    Account getByActno(String actno);

    List<Account> getAll();

    void transfer(String fromActno, String toActno, double money);
}
