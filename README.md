# sunbufu-cloud
记录在使用Spring Cloud中遇到的问题和解决方案

## 1.通过Spring Security实现微服务内部的安全

在微服务的架构下，我们需要把系统的业务划分成多个单一的微服务。每个微服务都会提供出接口供其他微服务调用，在Dubbo中可以通过rmi、nio等实现，Spring Cloud中是通过http调用的。但有些时候，我们只希望用户通过我们的网关调用微服务，不允许用户直接请求微服务。这时我们就可以借助Spring Security来保障安全。

[博客连接](https://sunbufu.github.io/2018/06/13/springcloud-inner-safe/)

项目包括：

1. `sunbufu-eureka`
2. `sunbufu-hello-face`
3. `sunbufu-hello-impl`
4. `sunbufu-hello-web`



## 2.Spring Cloud Config 使用本地配置文件

[博客连接](https://sunbufu.github.io/2018/06/13/springcloud-local-config/)

项目包括：

1. `sunbufu-config-server`
2. `sunbufu-config-client`

