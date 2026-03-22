/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ezY
 */
public class ezy_0 {
    private final int pvo;
    @NotNull
    private final ewo_0 pvp;
    private final byte[] pvq;
    private boolean bmT;

    public ezy_0(int n, @NotNull ewo_0 ewo_02, byte[] byArray) {
        this.pvo = n;
        this.pvp = ewo_02;
        this.pvq = (byte[])byArray.clone();
    }

    public static ezy_0 fp(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        ewo_0 ewo_02 = new ewo_0();
        ewo_02.dS(byArray2);
        boolean bl = byteBuffer.get() != 0;
        ezy_0 ezy_02 = new ezy_0(n, ewo_02, byArray);
        ezy_02.bmT = bl;
        return ezy_02;
    }

    public byte[] fnl() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.pvo);
        azg_12.vC(this.pvq.length);
        azg_12.dH(this.pvq);
        byte[] byArray = this.pvp.feR();
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.dz(this.bmT);
        return azg_12.bTe();
    }

    public int vY() {
        return this.pvo;
    }

    public byte[] fnr() {
        return (byte[])this.pvq.clone();
    }

    @NotNull
    public ewo_0 fns() {
        return this.pvp;
    }

    public boolean bfb() {
        return this.bmT;
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    public String toString() {
        return "WorldInfo{m_serverId=" + this.pvo + ", m_config=" + String.valueOf(this.pvp) + ", m_version=" + Arrays.toString(this.pvq) + ", m_locked=" + this.bmT + "}";
    }
}

