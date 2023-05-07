package com.jangbogo.admin.dao;

import com.jangbogo.admin.domain.ProdReviewDto;
import com.jangbogo.admin.domain.SearchCondition;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {

    @Autowired
    SqlSession session;

    private static String nameSpace ="com.jangbogo.admin.dao.BoardMapper.";

    @Override
    public List<ProdReviewDto> ReviewSelectedPage(SearchCondition sc) throws Exception {
        return session.selectList( nameSpace + "ReviewSelectedPage", sc);
    }

    @Override
    public Integer ReviewSearchResultCnt(SearchCondition sc) throws Exception {
        return session.selectOne( nameSpace + "ReviewSearchResultCnt", sc);
    }

    @Override
    public ProdReviewDto selectReviewDetail(Integer idx) throws Exception {
        return session.selectOne( nameSpace + "selectReviewDetail", idx);
    }

    @Override
    public Integer toDeleteState(Integer idx) throws Exception {
        return session.update( nameSpace + "toDeleteState", idx);
    }

    @Override
    public Integer toRegisterState(Integer idx) throws Exception {
        return session.update( nameSpace + "toRegisterState", idx);
    }

    @Override
    public Integer checkState(Integer idx) throws Exception {
        return session.selectOne( nameSpace + "checkState", idx);
    }


}