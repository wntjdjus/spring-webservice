# spring-webservice

### 스프링 웹서비스 학습

#### 참고사이트 : https://jojoldu.tistory.com

### 2019-05-28
#### 1. IntelliJ 사용 및 Gitbhub 연동

#### 2. JPA 사용하여 Entity, Controller, DTO 생성 (Lombok 어노테이션 사용)

Entity 클래스는 가장 기본적인 클래스이다. Entity 클래스에서 Setter는 사용하지 않는다. 왜냐하면 해당 클래스의 인스턴스 값들이 언제 어디서 변해야하는지 코드상으로 명확히 구분할 수가 없게 된다.
DTO는 Entity 클래스와 유사한 형태이지만 만들어서 Requst/Response 클래스로 사용해야 한다. Entity 클래스가 변경되면 여러 클래스에 영향을 미치지만, DTO는 View를 위한 클래스라서 자주 변경이 필요하다.
DTO는 Setter를 사용한다. Controller에서 외부에서 데이터를 받는 경우에 기본생성자 + set메소드를 통해서 값이 할당되기 때문이다.
