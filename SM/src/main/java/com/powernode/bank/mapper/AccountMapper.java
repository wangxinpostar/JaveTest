package com.powernode.bank.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.powernode.bank.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangx
 * @description 针对表【t_act】的数据库操作Mapper
 * @createDate 2023-06-05 09:32:07
 * @Entity com.powernode.bank.pojo.Account
 */
@Component
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

    List<Account> selectAll();

    Account selectByActno(@Param("actno") String actno);

    Boolean insertAll(Account account);

    int delByActno(@Param("actno") String actno);

    int updateBalanceByActno(@Param("actno") String actno, @Param("balance") Double balance);
}




