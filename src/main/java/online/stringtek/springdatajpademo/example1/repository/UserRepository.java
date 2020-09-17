package online.stringtek.springdatajpademo.example1.repository;

import online.stringtek.springdatajpademo.example1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author StringTek
 * @date 2020/9/17 13:21
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
