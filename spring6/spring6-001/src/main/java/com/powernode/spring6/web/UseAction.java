package com.powernode.spring6.web;

import com.powernode.spring6.service.UseService;
import com.powernode.spring6.service.impl.UserServeiceImpl;

public class UseAction {
    private UseService useService = new UserServeiceImpl();
    public void deleteRequest()
    {
        useService.deleteById();
    }
}
