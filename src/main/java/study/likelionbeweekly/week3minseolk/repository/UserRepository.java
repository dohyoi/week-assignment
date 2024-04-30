package study.likelionbeweekly.week3minseolk.repository;

import study.likelionbeweekly.week3minseolk.domain.User;

public interface UserRepository {

    void save(User user);

    User findById(String id);
}
