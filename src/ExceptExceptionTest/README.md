## jUnit - 예상 예외 테스트

#### 1. @Test excepted attribute

예상 유형만 테스트

@Test 어노테이션에 예상 혹은 일어날 수 있는 예외사항 exception을 적어준다.

```java
public class Exception1Test {

    @Test(expected = ArithmeticException.class)
    public void testDivisionWithException() {
        int i = 1 / 0;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }
}
```