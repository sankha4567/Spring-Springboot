package org.sankha.config;

import org.sankha.Computer;
import org.sankha.Dekstop;
import org.sankha.Dev;
import org.sankha.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
//    @Scope("prototype")
  public Dekstop desktop(){
       return new Dekstop();
  }

    @Bean

//    @Scope("prototype")
    public Laptop laptop(){
        return new Laptop();
    }
  @Bean
  //by using qualifier we mention which bean i want to use here we have to provide the bean name
  //or else we can make a bean as the primary one
    public Dev dev(@Qualifier("laptop") Computer comp){
       Dev dev = new Dev();
       dev.setAge(22);
       dev.setComputer(comp);
       return dev;
  }
}
