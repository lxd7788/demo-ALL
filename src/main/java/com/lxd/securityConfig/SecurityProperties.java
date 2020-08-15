package com.lxd.securityConfig;

/**
 * @ClassName SecurityProperties
 * @Author lxd
 * @Date 2020/6/6 15:08
 * @Description 配置类的方式配置security
 */
public class SecurityProperties{

}
//@Configuration
////@ConfigurationProperties(prefix = "spring.security")
//public class SecurityProperties extends WebSecurityConfigurerAdapter {
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        /**
//         * 配置用户名密码角色 用 and 连接多个
//         */
//        auth.inMemoryAuthentication()
//                .withUser("lxd2")
//                .password("123")
//                .roles("admin")
//                .and()
//                .withUser("lxd3")
//                .password("123")
//                .roles("admin2");
//    }
//
//    /**
//     * 去静态文件放行
//     * @param web
//     * @throws Exception
//     */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/js/**","/css/**","/images/**");
//    }
//
//    /**
//     * 自定义登录页面
//     * @param http
//     * @throws Exception
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login.html")
//                .defaultSuccessUrl("/index")
//                .successForwardUrl("/index") //配置一个即可
//                .failureForwardUrl("/f2")
//                .failureUrl("/f1") //配置一个即可 failureForwardUrl 是登录失败之后会发生服务端跳转，failureUrl 则在登录失败之后，会发生重定向。
//                .permitAll()
//                .and()
//                .logout() //注销
////                .logoutUrl("/logout")
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout","POST"))
//                .logoutSuccessUrl("/index")
//                .deleteCookies() //删除cookie
//                .clearAuthentication(true)
//                .invalidateHttpSession(true) //分别表示清除认证信息和使 HttpSession 失效，默认可以不用配置，默认就会清除。
//                .permitAll()
//                .and()
//                .csrf().disable();
//    }
//}
