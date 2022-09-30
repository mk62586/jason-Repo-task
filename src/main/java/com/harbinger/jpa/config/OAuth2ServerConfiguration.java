package com.harbinger.jpa.config;

import org.springframework.context.annotation.Configuration;
/*import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

//@Configuration
*/

public class OAuth2ServerConfiguration {

  /*  @Configuration
    @EnableResourceServer
    class ResourceServerConfiguration extends
            ResourceServerConfigurerAdapter {
        private static final String RESOURCE_ID = "myrestservice";

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) {
            resources
                    .resourceId(RESOURCE_ID);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .antMatchers("/fetch").hasRole("ADMIN")
                    .antMatchers("/fetchAll").authenticated();
        }*/
}
