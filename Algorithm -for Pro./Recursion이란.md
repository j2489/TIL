### 1. Recursion : 순환 함수, 재귀 함수
```
ex) func(){
  func(){
  ... }
}
```
### 2. Recursion의 성립조건 조건
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
### 3. Recursion의 단점 : 함수 재호출에 따른 overhead 발생 (따라서 실제 코딩에서는 반복문으로 대체한다)

### 4. Recursion의 설계
#### - 암시적 매개변수를 명시적으로 작성해야 함
```
<암시적 매개변수 예시 - 순차 탐색>
int search(int [] data, int n, int target){
  for(int i = 0; i<n; i++){
    if(data[i] == target)
      return i;
  }
}
```
#### 검색구간의 시작 data[0]에 대한 정보는 생략됨 (일반적으로 0에서 시작하므로)

```
<명시적 매개변수 예시 - 순차 탐색>
int search(int [] data, int begin, int end, int target){
  if(begin > end)
    return -1; // 시작 index가 끝 index 보다 크면 찾을 data가 없으므로 -1 return
  else if(data[begin] == target)
    return begin;
  else
    search(data, begin+1, end, target)
}
```
#### 검색구간의 시작과 끝을 begin, end로 명시적으로 

