# exampleXmlAOP

### **1. Description**
* **XML 기반**의 관점 지향 프로그래밍(Aspect Oriented Programming) 예제 프로그램입니다.


### **2. Environment**
* **Eclispe**
  + Maven Project(Create a single project(skip archetype selection))


### **3. Packages**
* **main**
  + 의존성 주입을 위한 예제 코드들
  + **AnimalType** : 인터페이스
  + **Cat, Dog** : AnimalType을 구현한 클래스
  + **PetOwner** : AnimalType 의존성 주입을 위한 클래스
  + **Logger** : Aspect 클래스
  + **MainApp**
* **conf**
  + Spring Container를 위한 설정 파일
  + **animal.xml** : Bean 생성 및 AOP 설정


### **4. Files**
* **pom.xml**
  + spring-context
  + spring-aspects
  + lombok
