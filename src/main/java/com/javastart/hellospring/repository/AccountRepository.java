package com.javastart.hellospring.repository;

import com.javastart.hellospring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */

public interface AccountRepository extends JpaRepository<Account, Long> {

}
