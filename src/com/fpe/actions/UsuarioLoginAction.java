package com.fpe.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.fpe.forms.UsuarioLoginForm;

public class UsuarioLoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		UsuarioLoginForm usuarioLoginForm = (UsuarioLoginForm) form;
		ActionMessages errors = new ActionMessages();
		
		if (usuarioLoginForm.getUserName() == null || usuarioLoginForm.getUserName().equals("")) {
			errors.add("common.usuario.err" , new ActionMessage("error.common.username.required"));
		} else if (usuarioLoginForm.getUserName().length() < 5) {
			errors.add("common.usuariolong.err" , new ActionMessage("error.common.username.toosmall"));
		}
		if (usuarioLoginForm.getPassword() == null || usuarioLoginForm.getPassword().equals("")) {
			errors.add("common.passwd.err" , new ActionMessage("error.common.passwd.required"));
		} else if (usuarioLoginForm.getPassword().length() < 5) {
			errors.add("common.passwdlong.err" , new ActionMessage("error.common.passwd.toosmall"));
		}
		
		saveErrors(request, errors);
		
		if (errors.isEmpty()) {
			//en un futuro llamara a la query
			request.getSession().setAttribute("UsuarioValidado", usuarioLoginForm);
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failed");
		}
		
		
			
	}
	
	

}
