/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Ib
 */
public class ib_1
implements id_1 {
    private final kf_2 aJR;

    public ib_1(kf_2 kf_22) {
        this.aJR = kf_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(13);
        dataOutput.writeFloat(this.aJR.aPS()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJR.aPS()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJR.aPT()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJR.aPT()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJR.aPU()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJR.aPU()[1] * ((float)Math.PI / 180));
    }
}

