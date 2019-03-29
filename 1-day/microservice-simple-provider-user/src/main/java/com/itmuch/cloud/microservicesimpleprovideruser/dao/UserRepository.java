package com.itmuch.cloud.microservicesimpleprovideruser.dao;

import com.itmuch.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




/**
 * Created by 13619 on 2019/3/18.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
