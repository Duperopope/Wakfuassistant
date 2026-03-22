/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HP
 */
public class hp_0
implements id_1 {
    private final kq_1 aJF;

    public hp_0(kq_1 kq_12) {
        this.aJF = kq_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(4);
        dataOutput.writeFloat(this.aJF.aQh()[0]);
        dataOutput.writeFloat(this.aJF.aQh()[1]);
        dataOutput.writeFloat(this.aJF.aQi()[0]);
        dataOutput.writeFloat(this.aJF.aQi()[1]);
        dataOutput.writeFloat(this.aJF.aQj()[0]);
        dataOutput.writeFloat(this.aJF.aQj()[1]);
        dataOutput.writeFloat(this.aJF.aQk()[0]);
        dataOutput.writeFloat(this.aJF.aQk()[1]);
        dataOutput.writeFloat(this.aJF.aQc()[0] * 33.0f);
        dataOutput.writeFloat(this.aJF.aQc()[1] * 33.0f);
    }
}

