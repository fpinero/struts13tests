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

public class UserActionSexo extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		DynaActionForm userForm = (DynaActionForm) form;
		ActionMessages errors = new ActionMessages();
		
		UserData userData; //= new UserData();
		userData = (UserData)request.getSession().getAttribute("UserLogged");
		if (userData == null || userData.equals("")) {
			errors.add("common.sesion.err" , new ActionMessage("error.common.userlogged.ausente"));
		}
		
		if ((userForm.get("usersex") == null) || (userForm.get("usersex").equals(""))) {
			errors.add("common.sexo.err" , new ActionMessage("error.common.sexo.noselecionado"));
			saveErrors(request, errors);
			return mapping.findForward("noselecion");
		}
		
		saveErrors(request, errors);
		
		if (errors.isEmpty()) {
			String thisUser = userData.getName();
			Integer thisEdad = userData.getEdad();
			String thisSexo = (String)userForm.get("usersex");
			userData.setName(thisUser);
			userData.setEdad(thisEdad);
			userData.setSexo(thisSexo);
			request.getSession().setAttribute("UserLogged", userData);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failed");
		}
		
	}
	
	

}
