# Runbike

## Overview
* 제작 목적<br>
자전거 라이딩을 효과적으로 도와주는 웹사이트입니다.<br>또한 여러 재미요소를 통해 자전거를 더욱 재미있게 즐길 수 있도록 하였습니다.
* 배포 주소 
  * https://runbike.cf/runbike(https://runbike.cf/runbike)
  * 테스트용 아이디 : `mail94@gmail.com`, `mail95@gmail.com`, `mail96@gmail.com`
  * 테스트용 비밀번호 : `ekdo321!`
* [프로젝트 설명서](https://docs.google.com/presentation/d/1-ev-xINKcZvE2PZuUH929ff95VMC-zH2X3Hujy5CaF4/edit?usp=sharing)
* [시연 영상](https://youtu.be/l89zUgKG4cw)
  * 발표 영상 댓글에 타임스탬프가 적용된 목차가 있습니다.

## 참여자 & 개발기간

* 참여자
  * **김한솔 ( @[HANSOLKIM30](https://github.com/HANSOLKIM30) )**   
  * 김다애 ( @[magiccircle03](https://github.com/magiccircle03) ) - 팀장 
  * 김희수 ( @[soo74](https://github.com/soo74) )  
  * 주예리나 ( @[orongee22](https://github.com/orongee22) )

* 개발기간
  * 2019.09 ~ 2019.10

## 담당 기능
* 혼자 라이딩
  * 서울시 API-따릉이를 이용한 근처 따릉이 정류장 안내 및 현재 남아있는 따릉이 개수 안내 
  * T-map API를 이용한 길찾기 
  * 운동 시 시간기록을 위한 스톱워치  
  * T-map API를 이용한 실제 이동한 코스 map에 표시 
  * 나의 코스 CRUD
  
* 리워드 - 스탬프, 뱃지(일부분)
   * mapper의 쿼리문 
   * 뱃지의 view 페이지 중 jstl core tag 이용한 코드 구현
   * 스탬프의 view 페이지 중 T-map API를 이용한 기능들


## 담당 기능 기술스택

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
  * `CloudFlare`에서 제공하는 무료`SSL`을 이용한 `https protocol`

