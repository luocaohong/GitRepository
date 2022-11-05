package com.java.test;

import com.java.mapper.BrandMapper;
import com.java.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);
        Brand brand = mapper.selectById(1);
        System.out.println(brand);
        sqlSession.close();
    }
    @Test
    public void testSelectCondition() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);
        int status = 1;
        String companyName = "%小米%";
        String brandName = "%小米%";
        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        Map map = new HashMap<>();
        //map.put("status",status);
        map.put("companyName",companyName);
        map.put("brandName",brandName);
        List<Brand> brands1 = mapper.selectByCondition(map);
        System.out.println(brands1);
        sqlSession.close();

    }
    @Test
    public void testSelectConditionSingle() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectAll();
//        System.out.println(brands);
        int status = 1;
        String companyName = "小米";
        companyName = "%" + companyName + "%";
        String brandName = "%小米%";
        brandName = "%" + brandName + "%";
        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
//        Map map = new HashMap<>();
//        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandName",brandName);
        List<Brand> brands1 = mapper.selectByConditionSingle(brand);
        System.out.println(brands1);
        sqlSession.close();

    }

    @Test
    public void testAdd() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectAll();
//        System.out.println(brands);
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        mapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);
//        Map map = new HashMap<>();
//        map.put("status",status);
//        map.put("companyName",companyName);
//        map.put("brandName",brandName);
//        List<Brand> brands1 = mapper.selectByConditionSingle(brand);
//        System.out.println(brands1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = mapper.selectAll();
//        System.out.println(brands);
        int status = 0;
        String companyName = "vivo";
        String brandName = "vivo手机";
        String description = "游戏流畅";
        int ordered = 200;
        int id = 9;
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        brand.setId(id);
        mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int[] ids = {10,11,12,13};
        mapper.deleteByIds(ids);
        sqlSession.commit();
        sqlSession.close();
    }
}
