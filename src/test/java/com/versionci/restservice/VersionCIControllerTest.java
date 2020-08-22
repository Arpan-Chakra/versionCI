package com.versionci.restservice;

import com.versionci.model.MyApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VersionCIControllerTest {

	@Spy
	VersionCIController mockService = new VersionCIController();

	private static final String description = "pre-interview technical test";
	private static final String lastCommitSha = "0aa89dd70841fd2fba2520ed458b7e8cc6b04f45";

	@Test
	public void testApp() {
		MyApplication appResponse = mockService.fetchAppVersionDetails();
		Assert.assertEquals(description, appResponse.getDescription());
		Assert.assertEquals(lastCommitSha, appResponse.getLastcommitsha());
	}

}
