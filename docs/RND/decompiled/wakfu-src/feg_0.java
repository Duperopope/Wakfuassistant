/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from feG
 */
final class feg_0
implements ffm {
    private final List<ffn> seC = new ArrayList<ffn>();
    private final ffj seD;
    private short bol;

    feg_0(ffj ffj2) {
        this.seD = ffj2;
        this.bol = 1;
    }

    @Override
    public int acs() {
        return this.seD.d();
    }

    @Override
    public short bfd() {
        return this.bol;
    }

    @Override
    public short bfe() {
        return this.seD.bfe();
    }

    void ak(short s) {
        int n = s - this.bol;
        this.bol = s;
        this.UD(n);
    }

    private void UD(int n) {
        int n2 = this.seC.size();
        for (int i = 0; i < n2; ++i) {
            this.seC.get(i).b(this, n);
        }
    }

    @Override
    public boolean a(ffn ffn2) {
        return !this.seC.contains(ffn2) && this.seC.add(ffn2);
    }

    @Override
    public boolean b(ffn ffn2) {
        return this.seC.remove(ffn2);
    }

    public String toString() {
        return "QuestItem{m_refId=" + String.valueOf(this.seD) + ", m_quantity=" + this.bol + "}";
    }
}

