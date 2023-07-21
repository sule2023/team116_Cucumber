Feature: US1008  liste olarak verilen kullanicilar ile negatif login testi
  @wip
  Scenario Outline: TC14 liste olarak verilen kullanicilar ile negatif login testi  yapilabilmeli

    Given kullanici "qdUrl" anasayfaya gider
    Then anasayfada login linkine click yapar
    And email kutusuna  listeden "<kullaniciAdi>" yazar
    And password kutusuna listeden "<password>" yazar
    When login butonuna basar
    And basarili olarak giris yapilamadigini test eder
    Then sayfayi kapatir

    Examples:
    |kullaniciAdi|password|
    |selgun     |12345   |
    |aysegul    |345567  |
    |yusuf      |1235    |
    |sevda      |3458    |
    |murat      |9876    |