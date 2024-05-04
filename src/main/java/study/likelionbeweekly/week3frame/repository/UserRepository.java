package study.likelionbeweekly.week3frame.repository;

import study.likelionbeweekly.week3frame.domain.User;

public interface UserRepository {

    void save(User user);

    User findById(String id);
}
