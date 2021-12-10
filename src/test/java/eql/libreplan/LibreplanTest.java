package eql.libreplan;

import java.util.logging.Logger;

import org.junit.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class LibreplanTest {
	
	Logger log = Logger.getLogger(LibreplanTest.class.getName());

	// Implémentation simple
	// (https://richard-carree.developpez.com/tutoriels/junit-services-web-soapui/)
	@Test
	public void test1() throws Exception {
		SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
		testCaseRunner.setProjectFile("src/test/resources/UPDATED_LIBREPLAN-RESOURCES-TEST-soapui-project.xml");
		try {
			testCaseRunner.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() throws Exception {
		SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
		testCaseRunner.setProjectFile("src/test/resources/UPDATED_Libreplan-Projet-soapui-project.xml");
		try {
			testCaseRunner.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}