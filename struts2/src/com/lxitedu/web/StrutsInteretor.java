package com.lxitedu.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class StrutsInteretor extends MethodFilterInterceptor{
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("StrutsInteretor.doIntercept()");
		String result=null;
		if(ActionContext.getContext().getSession().get("ho")==null){
			result="error";
		 }else{
			 result=invocation.invoke();
		 }
		return "success";
	}

}
