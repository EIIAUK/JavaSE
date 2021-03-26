package Reflect_configurationFiles;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


//通过反射读取配置文件
public class config_reflect {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Properties pop = new Properties();
        FileReader fr = new FileReader("E:\\javaSE_Test\\IDEAtest、\\src\\Reflect_configurationFiles\\Voice.txt");
        pop.load(fr);
        fr.close();

        String animalName = pop.getProperty("AnimalName");
        String methodName = pop.getProperty("MethodName");

        Class<?> c = Class.forName(animalName);
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        Method method = c.getMethod(methodName);
        method.invoke(obj);


    }
}
