import java.io.IOException;
import java.util.ArrayList;

public class DataDrivenTest {
    public static void main(String[] args) throws IOException
    {
        DataDriven dTest = new DataDriven();
        ArrayList<String> excelData = dTest.getDat("Manchester University");
        ArrayList<String> excelData1 = dTest.getDat("Cambridge");
        ArrayList<String> excelData2 = dTest.getDat("Oxford");
        ArrayList<String> excelData3 = dTest.getDat("Salford");
        ArrayList<String> excelData4 = dTest.getDat("Yale");
        ArrayList<String> excelData5 = dTest.getDat("Harvard");
        //Step 3. Identify SheetName
        //Step 3. Scan the entire row
        //Step 3 once column is gained, then scan the Mandatory row to pull data and feed it

        System.out.println(excelData);
        System.out.println(excelData1);
        System.out.println(excelData2);
        System.out.println(excelData3);
        System.out.println(excelData4);
        System.out.println(excelData5);

    }


}


