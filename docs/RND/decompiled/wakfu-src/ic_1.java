/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Ic
 */
public class ic_1
implements id_1 {
    private final kh_2 aJS;

    public ic_1(kh_2 kh_22) {
        this.aJS = kh_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(10);
        dataOutput.writeFloat(this.aJS.aPt()[0] * 33.0f);
        dataOutput.writeFloat(this.aJS.aPt()[1] * 33.0f);
    }
}

