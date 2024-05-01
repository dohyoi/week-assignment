package study.likelionbeweekly.week3_1.repository;

import study.likelionbeweekly.week3_1.domain.User;

public interface UserRepository {

    void save(User user);

    User findById(String id);
}
