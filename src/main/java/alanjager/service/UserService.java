package alanjager.service;

import alanjager.domain.User;
import alanjager.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AlanJager on 2016/10/20.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserById(long id)
    {
        return userRepository.findOne(id);
    }

    public User findUserByName(String name)
    {
        return userRepository.findByName(name);
    }

    public User saveArticle(User user)
    {
        return userRepository.save(user);
    }
}
