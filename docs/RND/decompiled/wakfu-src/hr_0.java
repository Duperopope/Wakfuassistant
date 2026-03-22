/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HR
 */
public class hr_0
implements id_1 {
    private final ks_1 aJH;

    public hr_0(ks_1 ks_12) {
        this.aJH = ks_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(6);
    }
}

