import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    //public static String path;
    public static void main(String[] args) {

        StringBuilder messageInfo = new StringBuilder();

        createDirectory("C://Games//scr");
        messageInfo.append("Scr directory was created in Games directory. \n");
        createDirectory("C://Games//scr//main");
        messageInfo.append("Main directory was created in Scr//Games directory.\n ");
        createDirectory("C://Games//scr//test");
        messageInfo.append("Test directory was created in Test//Games directory.\n ");
        createFile("C://Games//scr//main//Main.java");
        messageInfo.append("The file Main.java was created in main//scr//Games directory. \n");
        createFile("C://Games//scr//main//Utils.java");
        messageInfo.append("The file Utils.java was created in main//scr//Games directory. \n");

        createDirectory("C://Games//res");
        messageInfo.append("Res directory was created in Games directory.\n ");
        createDirectory("C://Games//res//drawbles");
        messageInfo.append("Drawbles directory was created in Res//Games directory. \n");
        createDirectory("C://Games//res//vectors");
        messageInfo.append("Vectors directory was created in Res//Games directory.\n");
        createDirectory("C://Games//res//icons");
        messageInfo.append("Icons directory was created in Res//Games directory. \n");

        createDirectory("C://Games//saveGames");
        messageInfo.append("SaveGames directory was created in Games directory. \n");

        createDirectory("C://Games//temp");
        messageInfo.append("Temp directory was created in Games directory. \n");
        createFile("C://Games//temp//temp.txt");
        messageInfo.append("The file Temp.txt was created in temp//Games directory. \n");

        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt", false)) {
            // запись всей строки
            writer.write(String.valueOf(messageInfo));
            // запись по символам
            writer.append('\n');
            writer.append('!');
            // дозаписываем и очищаем буфер
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void createDirectory(String path) {
        File dir = new File(path);
        if (dir.mkdir())
            System.out.println("Catalog  created.");
        else
            System.out.println("Failed to create directory");
    }
    public static void createFile(String path) {
        File file1 = new File(path);
        try {
            if (file1.createNewFile())
                System.out.println("File has been created");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
