/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HS
 */
public class hs_0
implements id_1 {
    private final kt_1 aJI;

    public hs_0(kt_1 kt_12) {
        this.aJI = kt_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(1);
        dataOutput.writeBoolean(this.aJI.aQM());
        dataOutput.writeShort((short)(this.aJI.aQu()[0] & 0xFFFF));
        dataOutput.writeShort((short)(this.aJI.aQu()[1] & 0xFFFF));
        dataOutput.writeShort((short)(this.aJI.aQv()[0] & 0xFFFF));
        dataOutput.writeShort((short)(this.aJI.aQv()[1] & 0xFFFF));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.aJI.aQs()[0] / 1000.0f));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.aJI.aQs()[1] / 1000.0f));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.aJI.aQw()[0] / 1000.0f));
        dataOutput.writeFloat(Math.max(0.033f, (float)this.aJI.aQw()[1] / 1000.0f));
        dataOutput.writeFloat((float)this.aJI.aQt()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.aJI.aQt()[1] / 1000.0f);
        dataOutput.writeFloat((float)this.aJI.aQx()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.aJI.aQx()[1] / 1000.0f);
        dataOutput.writeFloat(this.aJI.aQy()[0]);
        dataOutput.writeFloat(this.aJI.aQy()[1]);
        dataOutput.writeFloat(this.aJI.aQA()[0]);
        dataOutput.writeFloat(this.aJI.aQA()[1]);
        dataOutput.writeFloat(this.aJI.aQC()[0]);
        dataOutput.writeFloat(this.aJI.aQC()[1]);
        dataOutput.writeFloat(this.aJI.aQz()[0]);
        dataOutput.writeFloat(this.aJI.aQz()[1]);
        dataOutput.writeFloat(this.aJI.aQB()[0]);
        dataOutput.writeFloat(this.aJI.aQB()[1]);
        dataOutput.writeFloat(this.aJI.aQD()[0]);
        dataOutput.writeFloat(this.aJI.aQD()[1]);
        dataOutput.writeFloat(this.aJI.aQE()[0] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQE()[1] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQG()[0] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQG()[1] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQI()[0] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQI()[1] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQF()[0] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQF()[1] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQH()[0] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQH()[1] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQJ()[0] * 33.0f);
        dataOutput.writeFloat(this.aJI.aQJ()[1] * 33.0f);
        dataOutput.writeFloat((float)this.aJI.aQK()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.aJI.aQK()[1] / 1000.0f);
        dataOutput.writeFloat((float)this.aJI.aQL()[0] / 1000.0f);
        dataOutput.writeFloat((float)this.aJI.aQL()[1] / 1000.0f);
    }
}

