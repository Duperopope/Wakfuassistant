/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HT
 */
public class ht_0
implements id_1 {
    private final kw_0 aJJ;

    public ht_0(kw_0 kw_02) {
        this.aJJ = kw_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeFloat(33.0f - this.aJJ.aQV()[0] * 33.0f);
        dataOutput.writeFloat(33.0f - this.aJJ.aQV()[1] * 33.0f);
    }
}

