/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;
import java.io.OutputStream;

/*
 * Renamed from If
 */
public class if_0
extends OutputStream {
    private final DataOutput aJU;

    public if_0(DataOutput dataOutput) {
        this.aJU = dataOutput;
    }

    @Override
    public void write(int n) {
        this.aJU.write(n);
    }
}

