package com.powernode.spring6.web;

import com.powernode.spring6.service.UseService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("UseAction")
public class UseAction {
    @Override
    public String toString() {
        return "UseAction{" +
                "useService=" + useService +
                '}';
    }

    @Resource(name = "UserServeiceImpl")
    private UseService useService;

    public void deleteRequest() {
        useService.deleteById();
    }
}