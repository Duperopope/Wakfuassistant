/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HZ
 */
public class hz_0
implements id_1 {
    private final ke_0 aJP;

    public hz_0(ke_0 ke_02) {
        this.aJP = ke_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(9);
        dataOutput.writeFloat(this.aJP.aRo()[0]);
        dataOutput.writeFloat(this.aJP.aRo()[1]);
        dataOutput.writeFloat(this.aJP.aRq()[0]);
        dataOutput.writeFloat(this.aJP.aRq()[1]);
        dataOutput.writeFloat(this.aJP.aRs()[0]);
        dataOutput.writeFloat(this.aJP.aRs()[1]);
        dataOutput.writeFloat(this.aJP.aRp()[0]);
        dataOutput.writeFloat(this.aJP.aRp()[1]);
        dataOutput.writeFloat(this.aJP.aRr()[0]);
        dataOutput.writeFloat(this.aJP.aRr()[1]);
        dataOutput.writeFloat(this.aJP.aRt()[0]);
        dataOutput.writeFloat(this.aJP.aRt()[1]);
        dataOutput.writeFloat(this.aJP.aRi()[0]);
        dataOutput.writeFloat(this.aJP.aRi()[1]);
        dataOutput.writeFloat(this.aJP.aRj()[0]);
        dataOutput.writeFloat(this.aJP.aRj()[1]);
        dataOutput.writeFloat(this.aJP.aRk()[0]);
        dataOutput.writeFloat(this.aJP.aRk()[1]);
        dataOutput.writeFloat(this.aJP.aRl()[0]);
        dataOutput.writeFloat(this.aJP.aRl()[1]);
        dataOutput.writeFloat(this.aJP.aRm()[0]);
        dataOutput.writeFloat(this.aJP.aRm()[1]);
        dataOutput.writeFloat(this.aJP.aRn()[0]);
        dataOutput.writeFloat(this.aJP.aRn()[1]);
    }
}

