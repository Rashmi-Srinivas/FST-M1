package Activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {
    private static String FILE_NAME = "src/main/resources/TestSheet.xlsx";

    public static void main(String[] args) throws IOException {
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Datatypes in Java");

        Object[][] datatypes = {
                {"Datatypes", "Type", "Size"},
                {"Int", "Primitive", "2"},
                {"Float", "Primitive", "2"},
                {"String", "Non Primitive", "No size"},
                {"Char", "Primitive", "1"}
        };

        int rowNum = 0;
        System.out.println("Creating excel");
        for(Object[] datatype: datatypes){
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
          for(Object field : datatype){
              Cell cell = row.createCell(colNum++);
              if(field instanceof String){
                 cell.setCellValue((String) field);
              }
              else if (field instanceof Integer){
                  cell.setCellValue((Integer) field);
              }
              else if (field instanceof Character){
                  cell.setCellValue((Character) field);
              }
              else if (field instanceof Float){
                  cell.setCellValue((Float) field);
              }
          }
        }

        FileOutputStream stream = new FileOutputStream(FILE_NAME);
        book.write(stream);

        System.out.println("Data written into excel");
        System.out.println("Done");
    }

}
