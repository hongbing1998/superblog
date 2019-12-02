package org.edu.cdtu.bbxx.mapper.generator;

import org.edu.cdtu.bbxx.model.domain.ArticleCategory;
import org.edu.cdtu.bbxx.model.domain.ArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCategoryMapper {
	long countByExample(ArticleCategoryExample example);

	int deleteByExample(ArticleCategoryExample example);

	int insert(ArticleCategory record);

	int insertSelective(ArticleCategory record);

	List<ArticleCategory> selectByExample(ArticleCategoryExample example);

	int updateByExampleSelective(@Param("record") ArticleCategory record,
			@Param("example") ArticleCategoryExample example);

	int updateByExample(@Param("record") ArticleCategory record, @Param("example") ArticleCategoryExample example);
}