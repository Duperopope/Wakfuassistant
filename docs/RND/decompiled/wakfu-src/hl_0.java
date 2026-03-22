/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HL
 */
public class hl_0
implements id_1 {
    private final km_1 aJA;

    public hl_0(km_1 km_12) {
        this.aJA = km_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeBoolean(this.aJA.aPH());
        dataOutput.writeInt(this.aJA.aPA());
        dataOutput.writeFloat(this.aJA.aPB()[0]);
        dataOutput.writeFloat(this.aJA.aPB()[1]);
        dataOutput.writeFloat(this.aJA.aPC()[0]);
        dataOutput.writeFloat(this.aJA.aPC()[1]);
        dataOutput.writeFloat(this.aJA.aPD()[0]);
        dataOutput.writeFloat(this.aJA.aPD()[1]);
        dataOutput.writeFloat(this.aJA.aPF()[0]);
        dataOutput.writeFloat(this.aJA.aPF()[1]);
        dataOutput.writeFloat(this.aJA.aPE()[0]);
        dataOutput.writeFloat(this.aJA.aPE()[1]);
        dataOutput.writeFloat(this.aJA.aPG()[0]);
        dataOutput.writeFloat(this.aJA.aPG()[1]);
        dataOutput.writeFloat(this.aJA.aPI()[0]);
        dataOutput.writeFloat(this.aJA.aPI()[1]);
        dataOutput.writeFloat(this.aJA.aPJ()[0]);
        dataOutput.writeFloat(this.aJA.aPJ()[1]);
        dataOutput.writeFloat(this.aJA.aPK()[0]);
        dataOutput.writeFloat(this.aJA.aPK()[1]);
        dataOutput.writeFloat(this.aJA.aPM()[0]);
        dataOutput.writeFloat(this.aJA.aPM()[1]);
        dataOutput.writeFloat(this.aJA.aPO()[0]);
        dataOutput.writeFloat(this.aJA.aPO()[1]);
        dataOutput.writeFloat(this.aJA.aPQ()[0]);
        dataOutput.writeFloat(this.aJA.aPQ()[1]);
        dataOutput.writeFloat(this.aJA.aPL()[0]);
        dataOutput.writeFloat(this.aJA.aPL()[1]);
        dataOutput.writeFloat(this.aJA.aPN()[0]);
        dataOutput.writeFloat(this.aJA.aPN()[1]);
        dataOutput.writeFloat(this.aJA.aPP()[0]);
        dataOutput.writeFloat(this.aJA.aPP()[1]);
        dataOutput.writeFloat(this.aJA.aPR()[0]);
        dataOutput.writeFloat(this.aJA.aPR()[1]);
        dataOutput.writeFloat(this.aJA.aPV());
        dataOutput.writeFloat(this.aJA.aPV());
        dataOutput.writeFloat(this.aJA.aPW());
        dataOutput.writeFloat(this.aJA.aPW());
        dataOutput.writeFloat(this.aJA.aPX());
        dataOutput.writeFloat(this.aJA.aPX());
        dataOutput.writeFloat(this.aJA.aPY());
        dataOutput.writeFloat(this.aJA.aPY());
        dataOutput.writeFloat(this.aJA.aQa());
        dataOutput.writeFloat(this.aJA.aQa());
        dataOutput.writeFloat(this.aJA.aPZ());
        dataOutput.writeFloat(this.aJA.aPZ());
        dataOutput.writeFloat(this.aJA.aPS()[0]);
        dataOutput.writeFloat(this.aJA.aPS()[1]);
        dataOutput.writeFloat(this.aJA.aPT()[0]);
        dataOutput.writeFloat(this.aJA.aPT()[1]);
        dataOutput.writeFloat(this.aJA.aPU()[0]);
        dataOutput.writeFloat(this.aJA.aPU()[1]);
    }
}

