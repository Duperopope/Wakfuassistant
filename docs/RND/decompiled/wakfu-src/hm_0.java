/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HM
 */
public class hm_0
implements id_1 {
    private final kn_1 aJB;
    private final lm_2 aJC;

    public hm_0(kn_1 kn_12, lm_2 lm_22) {
        this.aJB = kn_12;
        this.aJC = lm_22;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeBoolean(this.aJB.aPH());
        dataOutput.writeInt(this.aJB.aPA());
        dataOutput.writeFloat(this.aJB.aPB()[0]);
        dataOutput.writeFloat(this.aJB.aPB()[1]);
        dataOutput.writeFloat(this.aJB.aPC()[0]);
        dataOutput.writeFloat(this.aJB.aPC()[1]);
        dataOutput.writeFloat(this.aJB.aPD()[0]);
        dataOutput.writeFloat(this.aJB.aPD()[1]);
        dataOutput.writeFloat(this.aJB.aPF()[0]);
        dataOutput.writeFloat(this.aJB.aPF()[1]);
        dataOutput.writeFloat(this.aJB.aPE()[0]);
        dataOutput.writeFloat(this.aJB.aPE()[1]);
        dataOutput.writeFloat(this.aJB.aPG()[0]);
        dataOutput.writeFloat(this.aJB.aPG()[1]);
        dataOutput.writeFloat(this.aJB.aPI()[0]);
        dataOutput.writeFloat(this.aJB.aPI()[1]);
        dataOutput.writeFloat(this.aJB.aPJ()[0]);
        dataOutput.writeFloat(this.aJB.aPJ()[1]);
        dataOutput.writeFloat(this.aJB.aPK()[0]);
        dataOutput.writeFloat(this.aJB.aPK()[1]);
        dataOutput.writeFloat(this.aJB.aPM()[0]);
        dataOutput.writeFloat(this.aJB.aPM()[1]);
        dataOutput.writeFloat(this.aJB.aPO()[0]);
        dataOutput.writeFloat(this.aJB.aPO()[1]);
        dataOutput.writeFloat(this.aJB.aPQ()[0]);
        dataOutput.writeFloat(this.aJB.aPQ()[1]);
        dataOutput.writeFloat(this.aJB.aPL()[0]);
        dataOutput.writeFloat(this.aJB.aPL()[1]);
        dataOutput.writeFloat(this.aJB.aPN()[0]);
        dataOutput.writeFloat(this.aJB.aPN()[1]);
        dataOutput.writeFloat(this.aJB.aPP()[0]);
        dataOutput.writeFloat(this.aJB.aPP()[1]);
        dataOutput.writeFloat(this.aJB.aPR()[0]);
        dataOutput.writeFloat(this.aJB.aPR()[1]);
        dataOutput.writeFloat((float)this.aJB.aQa() * 0.5f);
        dataOutput.writeFloat((float)this.aJB.aQa() * 0.5f);
        dataOutput.writeFloat((float)this.aJB.aPZ() * 0.5f);
        dataOutput.writeFloat((float)this.aJB.aPZ() * 0.5f);
        HJ hJ = new HJ(this.aJC);
        hJ.b(dataOutput);
        dataOutput.writeFloat(this.aJB.aQc()[0]);
        dataOutput.writeFloat(this.aJB.aQc()[1]);
        if (this.aJB.aQb()[0] == -1 || this.aJB.aQb()[1] == -1) {
            dataOutput.writeInt(-1);
            dataOutput.writeInt(-1);
        } else {
            dataOutput.writeInt(this.aJB.aQb()[0]);
            dataOutput.writeInt(this.aJB.aQb()[1]);
        }
        dataOutput.writeFloat(this.aJB.aPS()[0]);
        dataOutput.writeFloat(this.aJB.aPS()[1]);
        dataOutput.writeFloat(this.aJB.aPT()[0]);
        dataOutput.writeFloat(this.aJB.aPT()[1]);
        dataOutput.writeFloat(this.aJB.aPU()[0]);
        dataOutput.writeFloat(this.aJB.aPU()[1]);
    }
}

