package com.example;

import org.testng.annotations.Test;

public class UserScenarioTest {

	private SystemUnderTest sut;
	@Test
	public void verifyAllureReportIsGenerated() {
		sut = new SystemUnderTest();
		sut.openSystemUnderTest();
		sut.navigateToAdminModule();
	}

	@Test
	public void verifyThatSecondTestMethodIsIncludedInReport() {
		sut = new SystemUnderTest();
		sut.openSystemUnderTest();
		sut.navigateToAdminModule();
	}
}
