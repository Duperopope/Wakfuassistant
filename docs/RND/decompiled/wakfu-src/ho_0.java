/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HO
 */
public class ho_0
implements id_1 {
    private final kp_1 aJE;

    public ho_0(kp_1 kp_12) {
        this.aJE = kp_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(3);
        dataOutput.writeFloat(this.aJE.aQg()[0] * 33.0f);
        dataOutput.writeFloat(this.aJE.aQg()[1] * 33.0f);
    }
}

