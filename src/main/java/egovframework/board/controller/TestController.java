package egovframework.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.board.service.TestService;
import egovframework.board.vo.TestVo;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/testList.do")
	public String testListDo(TestVo testVo, Model model) throws Exception {
		
		model.addAttribute("list", testService.selectTest(testVo));
		
		return "test/testList";
	}
}
