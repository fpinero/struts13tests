package com.fpe.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.DynaActionForm;

import com.fpe.logic.UserData;

public class UserAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		DynaActionForm userForm = (DynaActionForm) form;
		ActionMessages errors = new ActionMessages();
		
		if (userForm.get("username") == null || ("".equals(userForm.get("username")))) {
			errors.add("common.name.err" , new ActionMessage("error.common.name.required"));
		}
		
		if (userForm.get("useredad") == null || ("".equals(userForm.get("useredad")))) {
			errors.add("common.edad.err" , new ActionMessage("error.common.edad.required"));
		} else if ((Integer)userForm.get("useredad") < 18 ) {
			errors.add("common.edad.err" , new ActionMessage("error.common.edad.menordeedad"));
		} 
		
			
		saveErrors(request, errors);
		
		if (errors.isEmpty() ) {
			UserData userData = new UserData();
			userData.setName((String)userForm.get("username"));
			userData.setEdad((Integer)userForm.get("useredad"));
			request.getSession().setAttribute("UserLogged", userData);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failed");
		}
		
	}
	
	
	

}
