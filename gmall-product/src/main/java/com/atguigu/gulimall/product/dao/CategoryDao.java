package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liujunlei
 * @email lei13131028391@163.com
 * @date 2023-07-18 22:34:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
