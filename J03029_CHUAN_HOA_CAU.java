import java.util.Scanner;
public class J03029_CHUAN_HOA_CAU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String sentence = in.nextLine().toLowerCase();
            String[] words = sentence.split("\\s+");
            // Viết hoa ký tự đầu câu
            words[0] = words[0].substring(0,1).toUpperCase() + words[0].substring(1).toLowerCase();
            // Thêm dấu . vào cuối câu nếu ký tự cuối cùng của câu vẫn là chữ
            int len = words.length;
            int size = words[len-1].length();
            if(Character.isAlphabetic(words[len-1].charAt(size-1))) words[len-1] += ".";
            // Kiểm tra xem từ cuối cùng của câu có là 1 dấu câu riêng biệt không
            int check = 0;
            if(words[len-1].length() == 1 && !(Character.isAlphabetic(words[len-1].charAt(size-1)))) check = 1;
            for(int i = 0; i < len-2; i++) System.out.print(words[i] + " ");
            if(check == 1) System.out.println(words[len-2] + words[len-1]);
            else System.out.println(words[len-2] + " " + words[len-1]);
        }
        in.close();
    }
}
