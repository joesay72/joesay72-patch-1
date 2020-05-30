import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven {
    public ArrayList<String> getDat(String TestCaseName) throws IOException {
        ArrayList<String> aList = new ArrayList<String>();

        FileInputStream fileObject = new FileInputStream("C:\\Users\\ericd\\DataDrivenTest.xlsx");
        XSSFWorkbook workBook = new XSSFWorkbook(fileObject);//step1 Creat Object
        //Your workbook might have Sheets. So what do we do?
        //Specific Sheets names
        //Step 2
        int sheets = workBook.getNumberOfSheets();
        for (int i=0; i<sheets; i++)
        {
            if (workBook.getSheetName(i).equalsIgnoreCase("ExcelDrivenTest"))
            {
                XSSFSheet sheet = workBook.getSheetAt(i);
                //Step Identify the sheet name by column
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> myCell = firstRow.cellIterator();
                //Step 4
                int x = 0;
                int column = 0;

                while (myCell.hasNext()) //If the condition here is true
                {
                    Cell value = myCell.next();
                    //Expected Colunms
                    if (value.getStringCellValue().equalsIgnoreCase("University"))
                    {
                        //Expected Columns
                        column = x;
                    }
                    x++;
                }
                System.out.println(column);
                    //================================================================

                    //Part of step 3
                    //Scan enter row
                    while (rows.hasNext())
                    {
                        Row rw = rows.next();

                        if (rw.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName))
                        {
                            Iterator<Cell> cellData = rw.cellIterator();
                            while (cellData.hasNext()){
                            Cell H = cellData.next();
                            if (H.getCellTypeEnum() == CellType.STRING)
                            {
                                aList.add(H.getStringCellValue());
                            } else {
                                aList.add(NumberToTextConverter.toText(H.getNumericCellValue()));
                            }

                            /*{

                                System.out.println(cellData.next().getStringCellValue());

                            }*/
                            }
                        }

                    }
                }


            }
            return aList;
        }
        //Step 3. Identify SheetName
        //Step 3. Scan the entire row
        //Step 3 once column is gained, then scan the Mandatory row to pull data and feed it
        public static void main(String[] args) throws IOException {
        }
    }


