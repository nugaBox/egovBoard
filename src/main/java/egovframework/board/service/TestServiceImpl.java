package egovframework.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.board.dao.TestDao;
import egovframework.board.vo.TestVo;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public List<TestVo> selectTest(TestVo testVo) throws Exception {
		return testDao.selectTest(testVo);
	}
}
