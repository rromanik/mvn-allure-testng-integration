package com.example;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class SystemUnderTest {

	private String field;
	public SystemUnderTest() {
		this.field = "Default Field Value";
	}

	@Step
	public void openSystemUnderTest() {

	}

	@Step("Navigate to Admin module")
	public void navigateToAdminModule() {

	}

	@Step("Set new settings: {0}")
	public void setupSettings(String settings) {

	}

	@Attachment
	public String getSettings() {
		return "{username: admin; role: superadmin; active: true}";
	}
}
