package com.juaracoding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "V2030");
        dc.setCapability("udid", "a4d9a362");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        System.out.println("Appium Start");
        delay(3);

        // Pemasukan
        MobileElement btnAddRec = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
        btnAddRec.click();
        System.out.println("Tambah Catatan");
        delay(3);
        MobileElement btnPemasukan = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btnIncome");
        btnPemasukan.click();
        System.out.println("--PEMASUKAN--");
        delay(3);
//        MobileElement btnJumlah = (MobileElement) driver.findElementById("com.chad.financialrecord:id/ibCalc");
//        btnJumlah.click();
        MobileElement btnJumlahPemasukan = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etAmount");
        btnJumlahPemasukan.click();
        btnJumlahPemasukan.sendKeys("150,000");
        System.out.println("Input Jumlah Pemasukan : "+btnJumlahPemasukan.getText());
        delay(3);
        MobileElement btnKeterangan = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etNote");
        btnKeterangan.click();
        btnKeterangan.sendKeys("Upah Harian");
        System.out.println("Keterangan : "+btnKeterangan.getText());
        MobileElement btnSave = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btSave");
        btnSave.click();
        delay(5);

        // Validasi Pemasukan
        MobileElement scrappingPemasukan = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[4]");
        String scrapPemasukan = scrappingPemasukan.getText();
        System.out.println(scrapPemasukan);
        if (scrapPemasukan.equals("150.000")){
            System.out.println("Hasil Test Pass");
        }else {
            System.out.println("Hasil Test Failed");
        }

        // Pengeluaran
        btnAddRec.click();
        System.out.println("Tambah Catatan");
        delay(3);
        MobileElement btnPengeluaran = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btnExpense");
        btnPengeluaran.click();
        System.out.println("--PENGELUARAN--");
        delay(3);
//        MobileElement btnTanggal = (MobileElement) driver.findElementById("com.chad.financialrecord:id/tvDate");
//        btnTanggal.click();
//        System.out.println("Pilih Tanggal");
//        MobileElement btnPickTanggal = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='13 Agu 2023']");
//        btnPickTanggal.click();
//        System.out.println("Tanggal : "+btnPickTanggal.getText());
//        delay(3);
//        MobileElement btnJumlah = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etAmount");
//        btnJumlah.click();
//        System.out.println("Input Jumlah");
        MobileElement btnJumlah = (MobileElement) driver.findElementById("com.chad.financialrecord:id/ibCalc");
        btnJumlah.click();
        delay(2);
        MobileElement btnLima = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_22");
        btnLima.click();
        MobileElement btnNol = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_24");
        btnNol.click();
        btnNol.click();
        btnNol.click();
        MobileElement btnOk = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_ok");
        btnOk.click();
        delay(2);
        MobileElement btnJumlahPengeluaran = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etAmount");
        System.out.println("Input Jumlah Pengeluaran : "+btnJumlahPengeluaran.getText());
        delay(2);
        MobileElement btnKeteranganPengeluaran = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etNote");
        btnKeteranganPengeluaran.click();
        btnKeteranganPengeluaran.sendKeys("Basreng");
        System.out.println("Keterangan : "+btnKeteranganPengeluaran.getText());
        MobileElement btnSimpan = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btSave");
        btnSimpan.click();
        delay(3);

        MobileElement scrappingPengeluaran = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[4]");
        String scrapPengeluaran = scrappingPengeluaran.getText();
        System.out.println(scrapPengeluaran);
        if (scrapPengeluaran.equals("5.000")){
            System.out.println("Hasil Test Pass");
        }else {
            System.out.println("Hasil Test Failed");
        }
    }
    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 5 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}