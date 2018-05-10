import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.es2.finalprojeto.Application;

class Test {

	private static Thread t;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		t = new Thread()
		{
			public void run(){
			    try {
				Application.main(null);
			    } catch (Exception e) {
				e.printStackTrace();
			    }
			}
		};
		t.start();
		Thread.sleep(3000);
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		t.interrupt();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}

}
