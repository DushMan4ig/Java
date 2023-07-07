package L2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main_homework {

public class JSONFileProcessing {
    private static final Logger logger = Logger.getLogger(JSONFileProcessing.class.getName());

    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},"
                + "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},"
                + "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        try {
            String result = parseJSONString(json);
            writeToFile(result, "output.txt");
        } catch (JSONException e) {
            logger.log(Level.SEVERE, "Ошибка при обработке JSON строки", e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка при записи в файл", e);
        }
    }

    private static String parseJSONString(String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String surname = jsonObject.getString("фамилия");
            String grade = jsonObject.getString("оценка");
            String subject = jsonObject.getString("предмет");

            String studentInfo = "Студент " + surname + " получил " + grade + " по предмету " + subject + ".";
            result.append(studentInfo).append("\n");
        }

        return result.toString();
    }

    private static void writeToFile(String content, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }
}
}
