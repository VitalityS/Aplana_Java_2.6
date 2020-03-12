import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * Есть входной файл с набором слов, написанных через пробел
 * Необходимо:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.
 * Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений.
 * Вывести на консоль это слово и сколько раз оно встречается в
 * файле
 *
 * ссылка на правила сортировки:
 * https://gist.github.com/milten15/26783cd9765680b1a5532446c1ca94f0
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\vshishkalov\\a.txt"));
        Map<String, Integer> statistics = new HashMap<>();
        Map<String, Integer> sortStatistics = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        int maxCount = 0;
        String maxCountWord = null;

        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
                    Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
                        if (count > maxCount){
                maxCount = count;
                maxCountWord = word;
            }
        }

        Collections.sort();
        sortStatistics.putAll(statistics);
        System.out.println(statistics);
        System.out.println(sortStatistics);
        System.out.println("В слове \"" + maxCountWord + "\" количество повторений: "  + maxCount);
    }

    }

