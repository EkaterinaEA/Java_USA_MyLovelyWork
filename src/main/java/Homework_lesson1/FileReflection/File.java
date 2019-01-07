package Homework_lesson1.FileReflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Created by Екатерина on 06.01.2019.
 */
public class File {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String line = "";
        try {
            FileReader file = new FileReader("C:\\Users\\Екатерина\\Desktop\\Java\\untitled\\src\\main\\java\\Homework_lesson1.FileReflection\\File.txt");
            BufferedReader buffer = new BufferedReader(file);
            while ((line = buffer.readLine()) != null) {
                System.out.println("Строка в файле: " + line);
                String items[] = line.split(",");

                Monitor monitor = new Monitor();
                Class userMonitor = monitor.getClass();
                Field nameField = userMonitor.getDeclaredField("name");
                nameField.setAccessible(true);
                nameField.set(monitor, items[1].toString());

                Field modelField = userMonitor.getDeclaredField("model");
                modelField.setAccessible(true);
                modelField.set(monitor, items[2].toString());

                Field priceField = userMonitor.getDeclaredField("price");
                priceField.setAccessible(true);
                priceField.set(monitor, Integer.parseInt(items[3]));

                System.out.println("Объект " + items[0].toString() + ". Его поля:" + "\nname = " + monitor.getName() +
                        " " + "\nmodel = " + monitor.getModel() + " " + "\nprice = "  + monitor.getPrice());
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка чтения");
        }
    }
}





