/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from HN
 */
public class hn_0
implements id_1 {
    private final ko_1 aJD;

    public hn_0(ko_1 ko_12) {
        this.aJD = ko_12;
    }

    @Override
    public void b(DataOutput dataOutput) {
        dataOutput.writeByte(2);
        dataOutput.writeFloat(this.aJD.aQd()[0] * 33.0f);
        dataOutput.writeFloat(this.aJD.aQd()[1] * 33.0f);
        dataOutput.writeFloat(this.aJD.aQe()[0] * 33.0f);
        dataOutput.writeFloat(this.aJD.aQe()[1] * 33.0f);
        dataOutput.writeFloat(this.aJD.aQf()[0] * 33.0f);
        dataOutput.writeFloat(this.aJD.aQf()[1] * 33.0f);
    }
}

