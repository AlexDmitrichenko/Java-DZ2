// Задача 1. Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.

// import java.util.Arrays;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import java.io.IOException; 
// import java.util.logging.*; 

// public class Tasks {
//     public static void main(String[] args) throws IOException {
//         Logger ll = Logger.getLogger(Tasks.class.getName());
//         String logsPath = "log.txt";
//         FileHandler fh = new FileHandler(logsPath, false);
//         ll.addHandler(fh);
//         SimpleFormatter formatter = new SimpleFormatter();
//         fh.setFormatter(formatter);
//         StringBuilder sb = new StringBuilder();
//         int[] buble = { 1, 5, 6, 8, 7, 4, 2, 3, 9 };
//         for (int i = buble.length - 1; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 if (buble[j] > buble[j + 1]) {
//                     int temp = buble[j];
//                     buble[j] = buble[j + 1];
//                     buble[j + 1] = temp;
//                 }
//                 sb.append(Arrays.toString(buble)).append("\n");
//                 try {
//                     ll.log(Level.INFO, Arrays.toString(buble));
//                 } catch (Exception e) {
//                     System.out.println("Что то пошло не так");
//                 }
//             }
//         }
//     }
// }

// Задача 2. Дана строка (получение через обычный текстовый файл!!!) "фамилия":"Иванов",
// "оценка":"5", "предмет":"Математика" "фамилия":"Петрова","оценка":"4","предмет":"Информатика" 
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// import java.io.BufferedReader;
// import java.io.FileReader;

// public class Tasks {
//     public static void main(String[] args) throws Exception {
//         String dataFile = "file.txt";
//         String[] infoBase;
//         StringBuilder sb = new StringBuilder();

//         try {
//             BufferedReader br = new BufferedReader(new FileReader(dataFile));
//             String line;
//             {
//                 while ((line = br.readLine()) != null) {
//                     infoBase = line.replace("\"", "").split(":|,");
//                     sb.append("Студент ").append(infoBase[1]).append(" получил ").append(infoBase[3])
//                             .append(" по предмету ").append(infoBase[5]).append(".\n");
//                 }
//                 System.out.println(sb);
//             }
//             br.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
