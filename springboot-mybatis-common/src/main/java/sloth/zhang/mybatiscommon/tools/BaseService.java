package sloth.zhang.mybatiscommon.tools;

import java.util.List;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 15:16 2019/8/5
 * @Modificd By;
 */
public interface BaseService<T> {
    List<T> list(T entity);

    T get(T entity);

    int update(T entity);

    int save(T entity);

    int delete(T entity);

}
