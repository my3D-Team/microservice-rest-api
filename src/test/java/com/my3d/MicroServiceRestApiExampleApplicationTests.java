package com.my3d;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MicroServiceRestApiExampleApplication.class)
@IntegrationTest({"spring.cloud.consul.enabled=false"})
public class MicroServiceRestApiExampleApplicationTests {

	@Test
	public void contextLoads() {
	}

}
