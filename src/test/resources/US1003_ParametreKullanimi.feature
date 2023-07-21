
Feature: US1003 Amazonda parametre olarak urun arama
  Scenario: TC Parametre olarak girilen urun aratabilmeli

  Scenario: TC01 Kullanici amazonda Nutella arayabilmeli
    Given kullanici "amazonUrl" ana sayfaya gider
    Then  arama kutusuna "Cokokrem" yazip, ENTER tusuna basar
    And   arama sonuclarinin "cokokrem" icerdigini test eder
    And    5 saniye bekler
    And   sayfayi kapatir
    # step yazarken sayi kullanirsak otomatik olarak parametre kabul eder otomatik