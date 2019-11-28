package top.heitiantian.config.base;

import tk.mybatis.mapper.common.Mapper;

/**
 * 公共mapper
 *
 * @Author lty
 * @Date 2019/8/26 14:49
 */
public interface BaseMappers <T> extends Mapper<T>, IInsertNoGeneratedListMapper<T> {
}
