package com.grokonez.springrest.postgresql

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class SpringKotlinRestApIsPostgreSqlApplication

fun main(args: Array<String>) {
     SpringApplication.run(SpringKotlinRestApIsPostgreSqlApplication::class.java, *args)
}