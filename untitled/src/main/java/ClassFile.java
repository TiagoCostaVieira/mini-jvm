import java.io.DataInputStream;
import java.io.IOException;

public abstract class ClassFile {
    protected int magic;
    protected short minorVersion;
    protected short majorVersion;

    public abstract void parse(DataInputStream dis) throws IOException;

    public int getMagic() {
        return magic;
    }

    public short getMinorVersion() {
        return minorVersion;
    }

    public short getMajorVersion() {return majorVersion; }
}