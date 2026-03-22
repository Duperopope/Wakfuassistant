/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from Jg
 */
public class jg_0 {
    private final kj_1 aKb;

    public jg_0(kj_1 kj_12) {
        this.aKb = kj_12;
    }

    public void b(DataInput dataInput) {
        int n = dataInput.readUnsignedShort();
        int n2 = n >> 6;
        this.aKb.a(JI.nf(n2));
        int n3 = n & 0x3F;
        if (n3 == 63) {
            n3 = dataInput.readInt();
        }
        this.aKb.ng(n3);
    }
}

