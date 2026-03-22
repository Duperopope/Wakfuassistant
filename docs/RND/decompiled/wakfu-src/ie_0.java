/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;

/*
 * Renamed from Ie
 */
public class ie_0
extends InputStream {
    private final DataInput aJT;

    public ie_0(DataInput dataInput) {
        this.aJT = dataInput;
    }

    @Override
    public int read() {
        try {
            return this.aJT.readUnsignedByte();
        }
        catch (EOFException eOFException) {
            return -1;
        }
    }
}

