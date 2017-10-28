## jUnit 테스트

기본적인 jUnit 사용에 관한 어노테이션 이해하기

<pre>
1. @BeforeClass - 클래스의 테스트 메소드를 실행하기 전에 한번 실행된다. public static void
2. @AfterClass - 클래스 모든 테스트가 실행 된 후에 한 번 실행된다. public static void
3. @Before - @Test 메소드 이전에 실행, public void
4. @After - @Test 후 실행, public void
5. @Test - 테스트 메소드 실행 어노테이션, public void
</pre>

```java
public class BasicAnnotationTest {

    //예) 데이터 베이스 커넥션 연결
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    //예) 데이터 베이스 커넥션 close 시
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }
}
```

결과
<pre>
@Before - runBeforeTestMethod
@Test - test_method_1
@After - runAfterTestMethod
@Before - runBeforeTestMethod
@Test - test_method_2
@After - runAfterTestMethod
@BeforeClass - runOnceBeforeClass
@AfterClass - runOnceAfterClass
</pre>