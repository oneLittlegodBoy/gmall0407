package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("这是华为的品牌");
        brandService.save(brandEntity);
        System.out.println(brandEntity.getName()+"存储成功!!!");
    }

    @Test
    public void saveTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("这是华为的品牌");
        brandService.save(brandEntity);
        System.out.println(brandEntity.getName()+"存储成功!!!");
    }

    @Test
    public void updateBrand(){
        LambdaUpdateWrapper<BrandEntity> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(BrandEntity::getName,"华为").set(BrandEntity::getDescript,"这是修改后的华为描述信息");
        brandService.update(updateWrapper);
    }




}
