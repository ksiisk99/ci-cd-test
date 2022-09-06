package test.cicd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CicdApplicationTests {

	@Test
	void test() {
		List<Integer>list=new ArrayList<>();

		assertThat(list.isEmpty()).isTrue();
	}

}
