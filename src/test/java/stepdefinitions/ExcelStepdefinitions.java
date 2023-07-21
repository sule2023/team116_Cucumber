package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepdefinitions {
    Workbook workbook;
    FileInputStream fis;
    Sheet sheet;
    String turkcebaskentIsmi;
    String ingiliceIsim;
    @Given("kullanici excel dosyasini kullanabilecegi ayarlari yapar")
    public void kullanici_excel_dosyasini_kullanabilecegi_ayarlari_yapar() throws IOException {
        String dosyayolu = "C:\\Users\\ysule\\Desktop\\team116_Cucumber\\src\\test\\resources\\ulkeler.xlsx";
        fis=new FileInputStream(dosyayolu);
        Workbook workbook = WorkbookFactory.create(fis);
        sheet = workbook.getSheet("Sayfa1");

    }
    @Then("indexi {int} olan satirdaki indexi {int} olan hucreyi yazdirir")
    public void indexi_olan_satirdaki_indexi_olan_hucreyi_yazdirir(Integer satirIndex, Integer sutunIndex) {
        System.out.println("Satir no :"+(satirIndex+1)+ "sutun adi:"+(char)(sutunIndex+65)+
                "olan hucredeki  bilgi:"+ sheet.getRow(satirIndex).getCell(sutunIndex));

    }
    @Then("baskenti {string} olan ulkenin ingilizce ismini yazdirir")
    public void baskenti_olan_ulkenin_ingilizce_ismini_yazdirir(String istenenBaskentIsmi) {






    }
    @Then("Ulke sayisininin {int} oldugunu test eder")
    public void ulke_sayisininin_oldugunu_test_eder(Integer int1) {

    }
    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @Then("baskenti {string} olan ulkenin tum bilgilerini yazdirir")
    public void baskenti_olan_ulkenin_tum_bilgilerini_yazdirir(String string) {

    }







}
