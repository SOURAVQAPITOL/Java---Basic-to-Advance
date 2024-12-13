package com.qapitol.fileoperations;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcellFileHandling {

    public static void main(String[] args) throws IOException {

        String excelPath = System.getProperty("user.dir") + "//src//main//resources//Files//example.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("NEW");

        String[] headers = {"Name", "Age", "Address", "DateOfBirth"};
        XSSFRow row = sheet.createRow(0);

        for (int i = 0; i <= headers.length; i++) {
            row.createCell(i).setCellValue(headers[i]);
        }

        String[] data = {"Rosan", "25", "BTMLayout", "02/01/1999"};
        XSSFRow row1 = sheet.createRow(1);
        for (int j = 0; j <= data.length; j++) {
            row1.createCell(j).setCellValue(data[j]);
        }

//        XSSFRow row1 =  sheet.createRow(1);
//        row1.createCell(0).setCellValue("Sourav");
//        row1.createCell(1).setCellValue("25");
//        row1.createCell(2).setCellValue("BTM Layout");
//        row1.createCell(3).setCellValue("02/01/1999");

        FileOutputStream fos = new FileOutputStream(excelPath);
        workbook.write(fos);
        fos.close();
        workbook.close();
    }
}
