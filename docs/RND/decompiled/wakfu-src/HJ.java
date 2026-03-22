/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

public class HJ {
    private final lm_2 aJy;

    public HJ(lm_2 lm_22) {
        this.aJy = lm_22;
    }

    public void b(DataOutput dataOutput) {
        short[] sArray;
        short[] sArray2 = this.aJy.aRA();
        if (sArray2 == null || sArray2.length <= 1) {
            dataOutput.writeByte(0);
            return;
        }
        int n = sArray2.length;
        dataOutput.writeByte(n);
        dataOutput.writeInt(this.aJy.aRz());
        dataOutput.writeShort(this.aJy.aRu());
        dataOutput.writeShort(this.aJy.aRv());
        dataOutput.writeShort(this.aJy.aRw());
        dataOutput.writeShort(this.aJy.aRx());
        for (int i = 0; i < n; ++i) {
            dataOutput.writeShort(sArray2[i]);
        }
        for (short s : sArray = this.aJy.aRy()) {
            dataOutput.writeShort(s);
        }
    }
}

