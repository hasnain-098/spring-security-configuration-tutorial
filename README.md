# Spring Security Demo

**Description:** A Spring Boot project demonstrating multiple security configurations using Spring Security. For learning purposes only.

## Features

- API endpoints secured with HTTP Basic (stateless)  
- H2 database console accessible without authentication  
- Web pages secured with form login

## Endpoints

- `/` → Public home page
- `/private` → Private web page (requires login)
- `/error` → Public error page
- `/api/**` → Protected API endpoints (HTTP Basic)
- `/h2-console/**` → H2 database console

## Setup

1. Clone the repository:
``` bash
git clone https://github.com/hasnain-098/spring-security-configuration-tutorial
cd <repo-folder>
```
2. Run the application:
``` bash
./mvnw spring-boot:run
```
3. Open in browser:
- Home: http://localhost:8080/
- Private: http://localhost:8080/private (requires HTTP Basic)
- H2 Console: http://localhost:8080/h2-console
- API Example: http://localhost:8080/api/posts (requires HTTP Basic)

## License
For learning purposes only. Implemented while following the Youtube tutorial: [Youtube Tutorial](https://youtu.be/PczgM2L3w60?si=EURTi0u-Hzdkm4pH)
