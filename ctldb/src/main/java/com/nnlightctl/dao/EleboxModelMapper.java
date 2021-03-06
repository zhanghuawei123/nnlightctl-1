package com.nnlightctl.dao;

import com.nnlightctl.po.EleboxModel;
import com.nnlightctl.po.EleboxModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EleboxModelMapper {
    int countByExample(EleboxModelExample example);

    int deleteByExample(EleboxModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EleboxModel record);

    int insertSelective(EleboxModel record);

    List<EleboxModel> selectByExample(EleboxModelExample example);

    EleboxModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EleboxModel record, @Param("example") EleboxModelExample example);

    int updateByExample(@Param("record") EleboxModel record, @Param("example") EleboxModelExample example);

    int updateByPrimaryKeySelective(EleboxModel record);

    int updateByPrimaryKey(EleboxModel record);
}