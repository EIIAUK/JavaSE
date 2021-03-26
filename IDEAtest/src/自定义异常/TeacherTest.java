package 自定义异常;

public class TeacherTest {
    public  void checkScore(int Score ) throws ScoreException {
        if (Score < 0 || Score > 100) {
            throw new ScoreException("你给的分数不能大于100");
        }else {
            System.out.println("分数正常");
        }
    }
}
