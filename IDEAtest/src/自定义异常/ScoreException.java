package 自定义异常;
//异常类 继承Exception
public class ScoreException extends Exception{
    public ScoreException(){}
    public ScoreException(String message){
        super(message);
    }
}
