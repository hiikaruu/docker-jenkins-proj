package com.example.dockerjenkinsproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsProjApplication {

	public static void main(String[] args) {

		String variableName = "MY_ENV_VARIABLE";
		String variableValue = "I'm tired";
		System.setProperty(variableName, variableValue);

		String envValue = System.getProperty(variableName);
		if (envValue != null) {
			System.out.println("Значение переменной окружения " + variableName + ": " + envValue);
		} else {
			System.out.println("Переменная окружения " + variableName + " не установлена.");
		}
	}

}
