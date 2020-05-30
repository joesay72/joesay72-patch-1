import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInToExcel {

    public  static  void main(String[] args) throws IOException {
        File filesSRC = new File("C:\\ExcelDrive\\DataDrivenTest.xlsx");
        FileInputStream driverObject = new FileInputStream(filesSRC);
        XSSFWorkbook workbook = new XSSFWorkbook(driverObject);
        workbook.getSheetAt(0);
        XSSFSheet sheetName = workbook.getSheetAt(0);
        sheetName.getRow(0).createCell(8).setCellValue("GPA Results");
        sheetName.getRow(1).createCell(8).setCellValue("8.9");
        sheetName.getRow(2).createCell(8).setCellValue("4.6");
        sheetName.getRow(3).createCell(8).setCellValue("6.1");
        sheetName.getRow(4).createCell(8).setCellValue("4.0");
        sheetName.getRow(5).createCell(8).setCellValue("2.2");
        sheetName.getRow(6).createCell(8).setCellValue("1.9");

        FileOutputStream destinationFile = new FileOutputStream(filesSRC);
        workbook.write(destinationFile);
        workbook.close();

    }
}
