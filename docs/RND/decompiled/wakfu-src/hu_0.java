/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HU
 */
public class hu_0
implements id_1 {
    private final kx_0 aJK;

    public hu_0(kx_0 kx_02) {
        this.aJK = kx_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeFloat((float)this.aJK.aQX()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.aJK.aQX()[1] / 1000.0f);
        dataOutput.writeFloat((float)this.aJK.aQW()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.aJK.aQW()[1] / 1000.0f);
    }
}

