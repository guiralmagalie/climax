package com.climax.climax;
import com.climax.climax.readFiles.CsvFileRead;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.climax.climax.readFiles.CsvFileRead;
import java.util.List;

@SpringBootApplication
public class ClimaxApplication {


	public static void main(String[] args) throws IOException {

	 SpringApplication.run(ClimaxApplication.class, args);
	 }



}
