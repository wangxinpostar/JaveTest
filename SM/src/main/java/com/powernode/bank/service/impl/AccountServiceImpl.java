package com.powernode.bank.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import com.powernode.bank.mapper.AccountMapper;
import org.springframework.stereotype.Service;

/**
* @author wangx
* @description 针对表【t_act】的数据库操作Service实现
* @createDate 2023-06-05 09:32:07
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{

}




