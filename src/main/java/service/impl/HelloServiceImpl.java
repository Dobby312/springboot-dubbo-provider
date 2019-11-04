package service.impl;

import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;
import com.dobby.dubbo_interface.HelloService;

@Component
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		
		return "Hello"+name;
	}

}
