package study.likelionbeweekly.week3_1.service;

import java.util.Objects;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import study.likelionbeweekly.week3_1.domain.User;
import study.likelionbeweekly.week3_1.repository.UserRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceV1 implements UserService {

    private final UserRepository userRepository;

    @Override
    public void saveUser(String id, String password) {
        User user = createUser(id, password);
        userRepository.save(user);
    }

    private User createUser(String id, String password) {
        User user = findUser(id);
        if (Objects.isNull(user)) {
            return User.builder()
                    .id(id)
                    .password(password)
                    .build();
        }
        throw new IllegalStateException("아이디 중복");
    }

    @Override
    public User login(String id, String password, Model model) {
        User user = findUser(id);
        return compare(Objects.requireNonNull(id), password, user, model);
    }

    private User findUser(String id) {
        return userRepository.findById(id);
    }

    private User compare(String id, String password, User user, Model model) {
        if (id.equals(user.getId()) && password.equals(user.getPassword())) {
            model.addAttribute("id", id);
            return user;
        }
        throw new IllegalStateException("로그인 실패");
    }
}
