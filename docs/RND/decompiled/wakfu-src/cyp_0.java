/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from cyP
 */
public final class cyp_0
extends nr_0 {
    private int dff;
    private int laF;
    private int laG;
    private int laI;
    private int laJ;
    private int laK;
    private final Map<Integer, Integer[]> mmM = new HashMap<Integer, Integer[]>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.dff = byteBuffer.getInt();
        this.laF = byteBuffer.getInt();
        this.laG = byteBuffer.getInt();
        this.laI = byteBuffer.getInt();
        this.laJ = byteBuffer.getInt();
        this.laK = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mmM.put(byteBuffer.getInt(), new Integer[]{byteBuffer.getInt(), byteBuffer.getInt()});
        }
        return true;
    }

    public int eFD() {
        return this.dff;
    }

    public int eFE() {
        return this.laF;
    }

    public int eFF() {
        return this.laG;
    }

    public Map<Integer, Integer[]> eFG() {
        return this.mmM;
    }

    public int eFH() {
        return this.laI;
    }

    public int eFI() {
        return this.laJ;
    }

    public int eFJ() {
        return this.laK;
    }

    @Override
    public int d() {
        return 22461;
    }
}

