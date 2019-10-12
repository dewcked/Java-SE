# 프로그램 사용 방법
----------------------------------------------
## A. 사용자용

1. jar 실행 파일을 다음 경로에서 다운로드 받습니다.

경로: [https://github.com/dewcked/Java-SE/raw/good-architecture-v4/archieve/DiceGameModule.jar]

2. java jre(버전 J2SE 1.5 이상)를 설치하고, 환경변수를 설정해줍니다.

3. cmd 창을 킨 뒤 jar 파일이 있는 경로로 이동한 후, 'java -jar DiceGameModule.jar' 을 입력합니다.

4. 프로그램이 실행됩니다.

```
프로그램이 실행된 후 게임을 시작하시겠습니까? 라는 출력이 나오고 버튼을 누르면 게임이 시작됩니다.

게임은 아니오 버튼을 누르기 전까지 예 버튼을 누를 때마다 반복됩니다.
```

## B. 개발자용

1. Eclipse에 최신 버전의 Maven + Junit 3.8.1 을 설치합니다.

2. egit 을 이용하여 https://github.com/dewcked/Java-SE/ 리포지토리를 clone 합니다.

3. Eclipse 안의 git branch 중에서 good-architecture-v4 를 체크아웃합니다.

4. Eclipse 우측 상단의 Open perspective 버튼을 눌러 Java (default)를 선택하고, 옆에 같은 모양의 버튼을 누릅니다.

5. File -> Open project from file system 메뉴를 들어갑니다.

6. Import source 옆 Directory 버튼을 눌러 뜨는 팝업 상단 경로에 %UserProfile%을 입력해줍니다

7. User -> git -> 경로를 이동한 뒤 JAVA-SE를 클릭하고 폴더 선택 버튼을 누릅니다.

8. Finish 버튼을 누르면 프로젝트를 불러옵니다.

9. 프로젝트에서 src -> main -> java -> com -> dewcked -> DiceGameModule -> Player.java 를 우클릭 한 뒤 Run As -> Java Application 항목을 클릭하여 실행합니다.

```
프로그램이 실행된 후 게임을 시작하시겠습니까? 라는 출력이 나오고 버튼을 누르면 게임이 시작됩니다.

게임은 아니오 버튼을 누르기 전까지 예 버튼을 누를 때마다 반복됩니다.
```


[https://github.com/dewcked/Java-SE/raw/good-architecture-v4/archieve/DiceGameModule.jar]: https://github.com/dewcked/Java-SE/raw/good-architecture-v4/archieve/DiceGameModule.jar
