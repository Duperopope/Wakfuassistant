/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.io.LittleEndianDataInputStream
 */
import com.google.common.base.Charsets;
import com.google.common.io.LittleEndianDataInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * Renamed from DV
 */
public final class dv_0
implements do_0 {
    private final LittleEndianDataInputStream ayh;

    public dv_0(LittleEndianDataInputStream littleEndianDataInputStream) {
        this.ayh = littleEndianDataInputStream;
    }

    @Override
    public byte aIy() {
        return this.ayh.readByte();
    }

    @Override
    public short aIz() {
        return this.ayh.readShort();
    }

    @Override
    public int aIA() {
        return this.ayh.readInt();
    }

    @Override
    public float aIB() {
        return this.ayh.readFloat();
    }

    @Override
    public String aIC() {
        byte by;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((by = this.ayh.readByte()) != 0) {
            byteArrayOutputStream.write(by);
            if (byteArrayOutputStream.size() <= 1024) continue;
            throw new IOException("Unable to detect end String marker");
        }
        return byteArrayOutputStream.toString(Charsets.UTF_8.name());
    }

    @Override
    public byte[] mv(int n) {
        byte[] byArray = new byte[n];
        this.ayh.read(byArray);
        return byArray;
    }

    @Override
    public short[] mw(int n) {
        short[] sArray = new short[n];
        for (int i = 0; i < n; ++i) {
            sArray[i] = this.ayh.readShort();
        }
        return sArray;
    }

    @Override
    public int[] mx(int n) {
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = this.ayh.readInt();
        }
        return nArray;
    }

    @Override
    public float[] my(int n) {
        float[] fArray = new float[n];
        for (int i = 0; i < n; ++i) {
            fArray[i] = this.ayh.readFloat();
        }
        return fArray;
    }

    @Override
    public void close() {
        this.ayh.close();
    }
}

