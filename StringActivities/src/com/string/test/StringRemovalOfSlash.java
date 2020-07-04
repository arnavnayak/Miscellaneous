package com.string.test;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class StringRemovalOfSlash {

	public static void main(String[] args) {

		//String value="{"arrangementOffers\":[{\"offerIdentifier":\"875\"}]}";
		FileUtils.readFileToString(new File("exampleJsonRequest.json"), StandardCharsets.UTF_8);
	}

}
