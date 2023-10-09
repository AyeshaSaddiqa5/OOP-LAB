import java.text.SimpleDateFormat;
import java.util.Date;

class QuizDateTime {
    public String getCurrentDateTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss EEEE");
        return sdf.format(new Date());

    }
}
