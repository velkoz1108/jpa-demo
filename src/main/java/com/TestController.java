package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/23 14:43
 */
@Controller
public class TestController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WeiboRepository weiboRepository;

    @RequestMapping("/searchUser/{username}")
    public @ResponseBody
    List<User> searchUser(@PathVariable("username") String username) {
        List<User> result = this.userRepository.findByUsernameContaining(username);
        return result;
    }
    @RequestMapping("/username/{username}")
    public List<Weibo> getUserWeibo(@PathVariable("username") String username) {
        return this.weiboRepository.searchUserWeibo(username,new Sort(new Sort.Order(Sort.Direction.DESC,"weiboId")));
    }
}
