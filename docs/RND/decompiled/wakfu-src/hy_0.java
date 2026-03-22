/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HY
 */
public class hy_0
implements id_1 {
    private final kc_1 aJO;

    public hy_0(kc_1 kc_12) {
        this.aJO = kc_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeBoolean(this.aJO.aRf());
        dataOutput.writeByte((byte)this.aJO.aRd().ordinal());
        dataOutput.writeShort((short)(this.aJO.aRe()[0] & 0xFFFF));
        dataOutput.writeShort((short)(this.aJO.aRe()[1] & 0xFFFF));
    }
}

