### * Recursion : 순환 함수, 재귀 함수
```
ex) func(){
  func(){
  ... }
}
```
### * Recursion의 성립조건 조건
1. Base Case : Recursion이 무한 루프에 빠지지 않도록 Recursion에 빠지지 않는 경우가 존재
2. Recursive Case : Base Case로 수렴하게 만드는 경우가 존재
```
ex) Factorial
public static int factorial(int n){
  if(n == 0)
    return 1;
  else
    return n * factorial(n-1);
}
```
* Recursion의 단점 : 함수 재호출에 따른 overhead 발생 (따라서 반복문으로 대체한다)

* Recursion의 
