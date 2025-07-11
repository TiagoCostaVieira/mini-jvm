import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ClassLoader {

    public static void main(String[] args) {
        ClassLoader loader  = new ClassLoader();
        ConcreteClassFile classFile  = loader.classLoader("HelloWorld.class");

        if (classFile != null) {
            System.out.println("Class loaded successfully!");
            System.out.println("Magic number: " + classFile.getMagic());
            System.out.println("Version: " + classFile.getMajorVersion() + "." + classFile.getMinorVersion());
        }
    }

    public ConcreteClassFile  classLoader(String classPath) {
        try {
            FileInputStream fis = new FileInputStream(classPath);
            DataInputStream dis = new DataInputStream(fis);

            ConcreteClassFile classFile = new ConcreteClassFile();
            dis.close();
            return classFile;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}