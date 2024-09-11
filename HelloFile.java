import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloFile {
    public static void main(String[] args) {
        // Đường dẫn đến file Hello.txt
        File file = new File("Hello.txt");
        try {
            // Tạo Scanner để đọc nội dung file
            Scanner scanner = new Scanner(file);
            // Đọc từng dòng và in ra màn hình
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            // Đóng Scanner để giải phóng tài nguyên
            scanner.close();
        } catch (FileNotFoundException e) {
            // Xử lý lỗi nếu file không tìm thấy
            System.err.println("File không tìm thấy: " + e.getMessage());
        }
    }
}
