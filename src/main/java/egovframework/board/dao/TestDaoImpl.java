package egovframework.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.board.service.TestMapper;
import egovframework.board.vo.TestVo;

@Service
public class TestDaoImpl implements TestDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<TestVo> selectTest(TestVo testVo) throws Exception {
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		return mapper.selectTest(testVo);
	}
}
