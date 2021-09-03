package egovframework.board.service;

import java.util.List;

import egovframework.board.vo.TestVo;

public interface TestService {
	public List<TestVo> selectTest(TestVo testVo) throws Exception;
}
