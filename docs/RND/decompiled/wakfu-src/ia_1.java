/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from Ia
 */
public class ia_1
implements id_1 {
    private final kg_2 aJQ;

    public ia_1(kg_2 kg_22) {
        this.aJQ = kg_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(14);
        dataOutput.writeFloat(this.aJQ.aPS()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJQ.aPS()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJQ.aPT()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJQ.aPT()[1] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJQ.aPU()[0] * ((float)Math.PI / 180));
        dataOutput.writeFloat(this.aJQ.aPU()[1] * ((float)Math.PI / 180));
    }
}

