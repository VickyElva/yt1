package com.yu.client1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="server")
public interface ServerClient {

    // 需要调用的方法
    @GetMapping("/getMsg")
    String getMsg();

}
