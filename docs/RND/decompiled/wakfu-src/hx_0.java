/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HX
 */
public class hx_0
implements id_1 {
    private final ka_0 aJN;

    public hx_0(ka_0 ka_02) {
        this.aJN = ka_02;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        dataOutput.writeBoolean(this.aJN.aRc());
        dataOutput.writeFloat(this.aJN.aQd()[0] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.aJN.aQd()[1] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.aJN.aQe()[0] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.aJN.aQe()[1] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.aJN.aQf()[0] * 33.0f * 33.0f);
        dataOutput.writeFloat(this.aJN.aQf()[1] * 33.0f * 33.0f);
    }
}

