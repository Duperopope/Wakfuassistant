/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from KM
 */
public class km_2 {
    private final kj_1 aOO;

    public km_2(kj_1 kj_12) {
        this.aOO = kj_12;
    }

    public void b(DataOutput dataOutput) {
        int n = this.aOO.aPr().aPm() << 6;
        int n2 = this.aOO.aPs();
        if (n2 >= 63) {
            dataOutput.writeShort(n |= 0x3F);
            dataOutput.writeInt(n2);
        } else {
            dataOutput.writeShort(n |= n2);
        }
    }
}

