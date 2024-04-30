package study.likelionbeweekly.week3minseolk.service;

import org.springframework.ui.Model;
import study.likelionbeweekly.week3minseolk.domain.User;

public interface UserService {

    void saveUser(String id, String password);

    User login(String id, String password, Model model);
}
