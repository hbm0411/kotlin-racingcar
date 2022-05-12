# kotlin-racingcar

## Step2. 문자열 계산기
### 기능 요구 사항
사용자가 입력한 문자열 값에 따라 사칙 연산을 수행할 수 있는 계산기를 구현해야 한다.
문자열 계산기는 사칙 연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

### 프로그래밍 요구 사항
메서드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.

### 상세 구현 사항
- [X] 사용자에게 연산식을 입력받기
- [x] 입력값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw
- [x] 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
- [x] 더하기 기능 구현
- [x] 빼기 기능 구현
- [x] 곱하기 기능 구현
- [x] 나누기 기능 구현
- [X] 각 기능에 따른 테스트 코트 작성
- [X] 계산한 결과값을 출력

## Step3. 자동차 경주
### 기능 요구 사항
초간단 자동차 경주 게임을 구현한다.
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
* 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

```text
자동차 대수는 몇 대인가요?
3
시도할 횟수는 몇 회인가요?
5

실행 결과
-
-
-

--
-
--

---
--
---

----
---
----

----
----
-----
```

### 프로그래밍 요구 사항
* 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
* 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
* UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.

### 상세 구현 사항
[x] 사용자에게 자동차 대수를 입력받기
[x] 사용자에게 시도할 횟수를 입력받기
[x] 입력받는 UI View 구현
[x] 자동차 model 구현
[x] 각각의 자동차별로 0 ~ 9까지 랜덤한 숫자를 부여받도록 구현 & 테스트 코드 작성
[x] 랜덤한 숫자가 4 이상일 경우 전진하도록 구현 & 테스트 코드 작성
[x] 결과 출력하는 UI View 구현