package net.xdclass.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class HelloController {

    /**
     * 状态
     *
     * @return
     */
    @GetMapping("/status")
    public Map<String, Object> status() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 200);
        resultMap.put("status", "ok");
        log.info("==============》请求：/api/status，返回：{} =============", resultMap);
        return resultMap;
    }

}
