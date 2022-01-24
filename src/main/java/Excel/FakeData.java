package Excel;

import com.opencsv.CSVReader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.time.Clock;
import java.util.Iterator;
import java.util.Random;

public class FakeData {
    public static void main(String[] args) throws IOException {
        readXLSX();
//        readCSV();
    }

    public static void readCSV(){
        long start = System.currentTimeMillis();
        try {
            FileReader filereader = new FileReader("/home/caongocson/Desktop/fake-data-3.csv");
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t\t\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    public static void readXLSX() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("/home/caongocson/Desktop/fake-data-2.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> itr = sheet.iterator();
        while (itr.hasNext()){
            Row row = itr.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()){
                Cell cell = cellIterator.next();
                System.out.print(cell.getStringCellValue()+"\t\t\t");
            }
            System.out.println();
        }
        System.out.println(System.currentTimeMillis()-start);
    }

    public static void FakeData() throws IOException {
        XSSFWorkbook workbook  = new XSSFWorkbook();
        XSSFSheet spreadSheet = workbook.createSheet("Fake Data");
        XSSFRow row;

        Random random = new Random();

        for (int i=1; i<100000; i++){
            row  = spreadSheet.createRow(i);
            Object[] objectArr = new Object[]{random.nextInt(), random.nextLong(), random.nextDouble(), random.nextBoolean(), random.nextFloat()};
            int cellID = 0;
            for (Object obj: objectArr){
                Cell cell = row.createCell(cellID++);
                cell.setCellValue(obj+"");
            }
        }

        FileOutputStream out = new FileOutputStream(
                new File("/home/caongocson/Desktop/fake-data-2.xlsx")
        );

        try {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }
}
