package com.eh.action;

import com.eh.entity.User;
import com.eh.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport{
	
	private String email;
	private String password;
	
	
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}


	private User user = new User();
	private UserService userService;
	

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login(){
		user.setEmail(email);
		user.setPassword(password);
		System.out.println("action.login"+user.getEmail()+user.getPassword());
		User existUser = userService.login(user);
		if(existUser==null){
			this.addActionError("用户不是合法用户！");
			System.out.println("action error");
			return "INPUT";
		}else{
			System.out.println("Action pass");
			ActionContext.getContext().getSession().put("existUser", existUser);
			return "SUCCESS";
		}
	}
}


