import java.io.DataInputStream;
import java.io.IOException;

public class ConcreteClassFile extends ClassFile {

    @Override
    public void parse(DataInputStream dis) throws IOException {

        this.magic = dis.readInt();

        this.minorVersion = dis.readShort();
        this.majorVersion = dis.readShort();

    }
}
