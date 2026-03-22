/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

public class HK
implements id_1 {
    private final kk_1 aJz;

    public HK(kk_1 kk_12) {
        this.aJz = kk_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeFloat(this.aJz.aPt()[0] * 33.0f);
        dataOutput.writeFloat(this.aJz.aPt()[1] * 33.0f);
        dataOutput.writeFloat(this.aJz.aPu()[0]);
        dataOutput.writeFloat(this.aJz.aPu()[1]);
        dataOutput.writeFloat(this.aJz.aPv()[0]);
        dataOutput.writeFloat(this.aJz.aPv()[1]);
        dataOutput.writeFloat(this.aJz.aPw()[0]);
        dataOutput.writeFloat(this.aJz.aPw()[1]);
        byte by = (byte)this.aJz.aPx().ordinal();
        dataOutput.writeByte(by);
    }
}

