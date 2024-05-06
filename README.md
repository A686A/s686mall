# s686mall

s686mall

## gateway

- id: product_route
  # uri----nacos服务名 lb---负载均衡
  uri: lb://gulimall-product predicates:
    - Path=/api/product/**
      filters:
    - RewritePath=/api/(?<segment>.*),/$\{segment}

<br>
路径重写
项目名 
    - filters:
- RewritePath=/api/(?<segment>.*),/s686mall-master/$\{segment}
跟server:  servlet:
    context-path: /s686mall-master