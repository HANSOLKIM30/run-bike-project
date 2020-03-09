# Runbike
> 실시간 커뮤니티 기능(함께 라이딩)과, 여러 재미요소(기록, 스탬프 등)를 통해 자전거를 더욱 재미있게 즐길 수 있도록 도와주는 서비스
>
> [Runbike 사이트 바로가기(https://runbike.cf/runbike)](https://runbike.cf/runbike) 
>
> * 테스트용 아이디 : `mail94@gmail.com`, `mail95@gmail.com`, `mail96@gmail.com`
> * 테스트용 비밀번호 : `ekdo321!`



## 참여자  

**김한솔 ( @[HANSOLKIM30](https://github.com/HANSOLKIM30) )**   
김다애 ( @[magiccircle03](https://github.com/magiccircle03) )  
김희수 ( @[soo74](https://github.com/soo74) )  
주예리나 ( @[orongee22](https://github.com/orongee22) )



## 프로젝트 설명 PPT 및 발표영상

* [프로젝트 설명 PPT LINK](https://docs.google.com/presentation/d/1-ev-xINKcZvE2PZuUH929ff95VMC-zH2X3Hujy5CaF4/edit?usp=sharing)
* [발표 영상 LINK](https://youtu.be/l89zUgKG4cw)
  * 발표 영상 댓글에 타임스탬프가 적용된 목차가 있습니다.
  * 발표 영상에서 프로젝트 구현에 대한 더 많은 정보를 확인할 수 있습니다.
  
  
* 프로젝트 설명 PPT 및 발표영상의 목차
 1. 프로젝트 개요
 2. 프로젝트 시연 영상
 3. 사용 기술
 4. Architecture 구성도
 5. 프로세스 흐름도


## 테이블 구조

![테이블 구조](https://user-images.githubusercontent.com/51072198/69480578-effea300-0e4b-11ea-94f4-1692a526c6d5.PNG)


## 본인 구현 기능
* 혼자 라이딩
  * 서울시 API-따릉이를 이용한 근처 따릉이 정류장 안내 및 현재 남아있는 따릉이 개수 안내 
  * T-map API를 이용한 길찾기 
  * 운동 시 시간기록을 위한 스톱워치  
  * T-map API를 이용한 실제 이동한 코스 map에 표시 
  * 나의 코스 CRUD
  
* 리워드 - 스탬프, 뱃지(일부분)
   * mapper의 쿼리문 
   * 뱃지의 view 페이지 중 jstl core tag 이용한 코드 구현
   * 스탬프의 view 페이지(T-map API를 이용한 기능들: 스팟으로부터 반경 1km이내 원표시 등)


## 함께라이딩에 사용된 기술

* 사용 언어 및 프레임워크
  * `Java`
  * `Spring Framework`
  * `jsp`, `EL`
  
* 웹 표준 및 프론트
  * `HTML5`, `CSS3`, `Javascript`
  * `jQuery`
  * `Bootstrap4`

* DB
  * DBMS - `MySQL`
  * `MyBatis`
  
* API
  * `서울시 API - 따릉이`
  * `T Map API`

* 배포
  * `AWS`의 `EC2`와 `RDS`
  * `FileZila`를 이용한 `FTP 업로드`
  * `Putty`를 이용한 `SSH 접속`
  * `CloudFlare`를 이용한 `보안접속(SSL)`

