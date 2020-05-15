package sloth.zhang.springdatajpa.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import sloth.zhang.springdatajpa.domain.Users;


/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:49 2020/5/15
 * @Modificd By;
 */
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
