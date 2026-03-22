/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from bZR
 */
public class bzr_2 {
    final int lEM;
    final boolean lEN;
    final wo_0 lEO;
    final wn_0 lEP;
    final ArrayList<bzs_2> lEQ = new ArrayList();
    final boolean lER;

    public bzr_2(ByteBuffer byteBuffer) {
        this.lEM = byteBuffer.getInt();
        this.lEN = byteBuffer.get() != 0;
        this.lER = byteBuffer.get() != 0;
        this.lEO = new wo_0(byteBuffer);
        this.lEP = new wn_0(byteBuffer);
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.lEQ.add(new bzs_2(byteBuffer));
        }
    }

    public bzr_2(int n, boolean bl, wo_0 wo_02, wn_0 wn_02, boolean bl2) {
        this.lEM = n;
        this.lEN = bl;
        this.lEO = wo_02;
        this.lEP = wn_02;
        this.lER = bl2;
    }

    public void a(fs_0 fs_02) {
        fs_02.mz(this.lEM);
        fs_02.g((byte)(this.lEN ? 1 : 0));
        fs_02.g((byte)(this.lER ? 1 : 0));
        this.lEO.a(fs_02);
        this.lEP.a(fs_02);
        fs_02.mz(this.lEQ.size());
        for (bzs_2 bzs_22 : this.lEQ) {
            bzs_22.a(fs_02);
        }
    }

    public int eqD() {
        return this.lEM;
    }

    public wo_0 eqE() {
        return this.lEO;
    }

    public wn_0 eqF() {
        return this.lEP;
    }

    public boolean eqz() {
        return this.lER;
    }

    public boolean b(bzs_2 bzs_22) {
        return this.lEQ.add(bzs_22);
    }

    public ArrayList<bzs_2> eqG() {
        return this.lEQ;
    }
}

