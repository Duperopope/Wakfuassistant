/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awV
 */
public class awv_2 {
    private final lm_2 dnz;

    public awv_2(lm_2 lm_22) {
        this.dnz = lm_22;
    }

    public void b(DataInput dataInput) {
        int n = dataInput.readByte() & 0xFF;
        if (n == 0) {
            return;
        }
        int n2 = dataInput.readInt();
        short s = dataInput.readShort();
        short s2 = dataInput.readShort();
        short s3 = dataInput.readShort();
        short s4 = dataInput.readShort();
        short[] sArray = new short[n];
        for (int i = 0; i < n; ++i) {
            sArray[i] = dataInput.readShort();
        }
        short[] sArray2 = new short[n * 2];
        for (int i = 0; i < n * 2; ++i) {
            sArray2[i] = dataInput.readShort();
        }
        this.dnz.z(s);
        this.dnz.A(s2);
        this.dnz.B(s3);
        this.dnz.C(s4);
        this.dnz.no(n2);
        this.dnz.h(sArray2);
        this.dnz.i(sArray);
    }
}

