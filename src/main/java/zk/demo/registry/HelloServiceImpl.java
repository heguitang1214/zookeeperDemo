package zk.demo.registry;

public class HelloServiceImpl implements HelloService {
	public String hello(String name) {
		return "hello " + name;
	}
}
