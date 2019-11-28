package top.heitiantian.config.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.heitiantian.config.model.dao.TestMapper;

/**
 * @Author lty
 * @Date 2019/11/18 18:29
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/tk/mapper/test")
    public Object testTKMapper(){
        return testMapper.selectAll();
    }
}
