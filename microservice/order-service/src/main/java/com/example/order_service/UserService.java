package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Đánh dấu đây là một Service Bean
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Lấy tất cả user
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Logic tạo user mới: Phải kiểm tra trùng email
    public User createUser(User user) {
        // 1. Kiểm tra logic: Email có hợp lệ không? (Ví dụ cơ bản)
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email không hợp lệ!");
        }

        // 2. Kiểm tra logic: Email đã tồn tại trong DB chưa?
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email này đã được sử dụng!");
        }

        // 3. Nếu qua hết các bài kiểm tra, tiến hành lưu vào DB
        return userRepository.save(user);
    }
}