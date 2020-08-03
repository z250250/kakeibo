package jp.co.z250.kakeibo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.z250.kakeibo.model.domain.MstUser;
import jp.co.z250.kakeibo.model.form.UserForm;
import jp.co.z250.kakeibo.model.mapper.MstUserMapper;

@Controller
@RequestMapping("/kakeibo")
public class IndexController {
	@Autowired
	MstUserMapper mstUserMapper;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/toroku")
	public String toroku(UserForm s,Model m) {
		MstUser user= new MstUser();
		
		return "toroku";
	}

}
