/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutput;

/*
 * Renamed from KI
 */
public class ki_2 {
    private final JF aOL;

    public ki_2(JF jF) {
        this.aOL = jF;
    }

    public void b(DataOutput dataOutput) {
        dataOutput.write((this.aOL.aPj() ? "EPS" : "eps").getBytes());
        dataOutput.writeInt((int)this.aOL.aPk());
    }
}

