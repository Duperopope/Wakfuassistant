/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

/*
 * Renamed from cos
 */
public class cos_0
extends nr_0 {
    private byte lVL;
    private short lVM;
    private List<Short> mcU;
    private String ePU;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.lVL = byteBuffer.get();
        this.lVM = byteBuffer.getShort();
        this.mcU = new ArrayList<Short>(this.lVL);
        for (byte by = 0; by < this.lVL; by = (byte)(by + 1)) {
            this.mcU.add(byteBuffer.getShort());
        }
        this.ePU = BH.eE(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 13065;
    }

    @Generated
    public byte ewi() {
        return this.lVL;
    }

    @Generated
    public short ewj() {
        return this.lVM;
    }

    @Generated
    public List<Short> ewk() {
        return this.mcU;
    }

    @Generated
    public String aav() {
        return this.ePU;
    }
}

