package alanjager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import alanjager.pojo.User;
import alanjager.repository.UserRepository;

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
