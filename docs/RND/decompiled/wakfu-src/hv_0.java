/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HV
 */
public class hv_0
implements id_1 {
    private final kz_0 aJL;

    public hv_0(kz_0 kz_02) {
        this.aJL = kz_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(11);
        dataOutput.writeFloat(this.aJL.aQl()[0] * 33.0f);
        dataOutput.writeFloat(this.aJL.aQl()[1] * 33.0f);
    }
}

