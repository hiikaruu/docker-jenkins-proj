package com.example.dockerjenkinsproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsProjApplication {

	public static void main(String[] args) {

		String envVariableValue = System.getenv("MY_ENV_VARIABLE");

		if (envVariableValue != null) {
			System.out.println("Значение переменной окружения MY_ENV_VARIABLE: " + envVariableValue);
		} else {
			System.out.println("Переменная окружения MY_ENV_VARIABLE не установлена.");
		}
	}

}
