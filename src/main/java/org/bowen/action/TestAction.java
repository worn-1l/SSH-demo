package org.bowen.action;

import com.opensymphony.xwork2.ActionSupport;
import org.bowen.model.UserEntity;
import org.bowen.service.UserService;

/**
 * @author bowencoder
 * @date 2021/12/19 21:52
 */
public class TestAction extends ActionSupport {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test(){
        UserEntity userEntity = userService.getUser(1);
        System.out.println(userEntity);
        return "test";
    }

}
