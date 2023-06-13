package com.powernode.bank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.powernode.bank.mapper.AccountMapper;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangx
 * @description 针对表【t_act】的数据库操作Service实现
 * @createDate 2023-06-05 09:32:07
 */
@Transactional
@Service("AccountServiceImpl")
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
        implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> list() {
        return super.list();
    }

    @Override
    public boolean save(Account act) {
        return accountMapper.insertAll(act);
    }

    @Override
    public int deleteByActno(String actno) {
        return accountMapper.delByActno(actno);
    }

    @Override
    public int update(String actno, Double balance) {
        return accountMapper.updateBalanceByActno(actno, balance);
    }


    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        Account fromAct = accountMapper.selectByActno(fromActno);
        if (fromAct.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        Account toAct = accountMapper.selectByActno(toActno);
        int count = accountMapper.updateBalanceByActno(fromActno, fromAct.getBalance() - money);
        count += accountMapper.updateBalanceByActno(toActno, toAct.getBalance() + money);
        if (count != 2) {
            throw new RuntimeException("转账失败");
        }
    }
}




