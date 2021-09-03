package egovframework.board.dao;

import java.util.List;

import egovframework.board.vo.TestVo;

public interface TestDao {

	public List<TestVo> selectTest(TestVo testVo) throws Exception;
}
