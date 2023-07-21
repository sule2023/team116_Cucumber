Feature: US1002 kullanici Background kullanarak amazonda istedigini aramalari  yapar
   Background: # seneryolardaki  ortak baslangiclar icin bu sekilde yapariz
     Given kullanici amazon ana sayfaya gider



@smoke
  Scenario: TC04 Kullanici amazonda Nutella arayabilmeli

    Then  arama kutusuna Nutella yazip, ENTER tusuna basar
    And   arama sonuclarinin Nutella icerdigini test eder
    And   sayfayi kapatir
@smoke
  Scenario: TC05 Kullanici amazonda Samsung aratabilmeli

    Then arama kutusuna Samsung yazip, ENTER tusuna basar
    And  arama sonuclarinin Samsung icerdigini test eder
    And  sayfayi kapatir


  Scenario: TC06 Kullanici amazonda Java aratabilmeli

    Then arama kutusuna Java yazip, ENTER tusuna basar
    And  arama sonuclarinin Java icerdigini test eder
    And  sayfayi kapatir