package com.frankxulei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.frankxulei.models.User;
import com.frankxulei.repository.UsersRepository;
/**
 * @Package: com.frankxulei 
 * @ClassName: Application  
 * @Description: Java Spring Data实战阿里云Mongodb参考代码
 * 《阿里巴巴MongoDB高级实战课程》由徐雷 与阿里巴巴资深专家P9叶翔主讲！http://a.aliyun.com/f1.1BAOs
 * @author: Frank Xu Lei 
 * @Date : 2018-8-18
*/
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private UsersRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("---------------delete all----------------");
		//repository.deleteAll();
//		System.out.println("---------------add new----------------");
//		for (int i = 0; i < 10; i++) {
//			User user = new User();
//			user.setName("阿里云Mongodb"+i);
//			user.setPassword(String.valueOf(i));
//			user.setEmail("frankxulei@aliyun.com");
//			repository.save(user);
//		}
		System.out.println("---------------get all----------------");
		for (User user : repository.findAll()) {
			System.out.println(user.getName());
		}
	}
}