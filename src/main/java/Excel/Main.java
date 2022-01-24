package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook  = new XSSFWorkbook();
        XSSFSheet spreadSheet = workbook.createSheet("Fake Data");
        XSSFRow row;

        Random random = new Random();

        for (int i=1; i<1000000; i++){
            row  = spreadSheet.createRow(i);
            Object[] objectArr = new Object[]{random.nextInt(), random.nextLong(), random.nextDouble(), random.nextBoolean(), random.nextFloat()};
            int cellID = 0;
            for (Object obj: objectArr){
                Cell cell = row.createCell(cellID++);
                cell.setCellValue(obj+"");
            }
        }

        FileOutputStream out = new FileOutputStream(
                new File("~/Desktop/fake-data.xlsx")
        );

        try {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }
}
