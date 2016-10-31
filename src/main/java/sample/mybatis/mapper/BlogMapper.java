package sample.mybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import sample.mybatis.domain.blog.BlogDto;

@Mapper
public interface BlogMapper {
    BlogDto selectById(String id);
}