/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNk
 */
public class bnk_0
implements feq {
    private final ArrayList<fai> kBp = new ArrayList();
    private short bmQ;

    public void a(fai fai2) {
        this.kBp.add(fai2);
        this.bmQ = (short)(this.bmQ + fai2.bfa());
    }

    public void efI() {
        this.kBp.clear();
        this.bmQ = 0;
    }

    public ArrayList<fai> efJ() {
        return this.kBp;
    }

    public boolean isEnabled() {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            fai fai2 = this.kBp.get(i);
            if (!fai2.isEnabled()) continue;
            return true;
        }
        return false;
    }

    public short bfa() {
        return this.bmQ;
    }

    @Override
    public boolean efK() {
        return true;
    }

    fai ct(byte by) {
        int n = 0;
        int n2 = this.kBp.size();
        for (int i = 0; i < n2; ++i) {
            fai fai2 = this.kBp.get(i);
            if (by >= (n += fai2.bfa())) continue;
            return fai2;
        }
        return null;
    }

    byte cu(byte by) {
        int n = 0;
        int n2 = this.kBp.size();
        for (int i = 0; i < n2; ++i) {
            fai fai2 = this.kBp.get(i);
            if (by < n + fai2.bfa()) {
                return GC.ct(by - n);
            }
            n += fai2.bfa();
        }
        return -1;
    }

    byte efL() {
        short s = 0;
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            fai fai2 = this.kBp.get(i);
            for (byte by = 0; by < fai2.bfa(); by = (byte)(by + 1)) {
                if (fai2.cv(by) != null) continue;
                return GC.ct(by + s);
            }
            s = (byte)(s + fai2.bfa());
        }
        return -1;
    }

    byte b(ffV ffV2, short s) {
        short s2 = 0;
        byte by = -1;
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            fai fai2 = this.kBp.get(i);
            for (byte by2 = 0; by2 < fai2.bfa(); by2 = (byte)(by2 + 1)) {
                ffV ffV3 = fai2.cv(by2);
                byte by3 = GC.ct(by2 + s2);
                if (ffV3 != null) {
                    if (!ffV3.n(ffV2) || ffV3.bfe() == ffV3.bfd()) continue;
                    if (ffV3.bfd() + s <= ffV3.bfe()) {
                        return by3;
                    }
                    by = by3;
                    continue;
                }
                if (by != -1) continue;
                by = by3;
            }
            s2 = (byte)(s2 + fai2.bfa());
        }
        return by;
    }

    @Override
    public boolean bp(ffV ffV2) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            if (!this.kBp.get(i).bp(ffV2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean bq(ffV ffV2) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            if (!this.kBp.get(i).bq(ffV2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(ffV ffV2, byte by) {
        fai fai2 = this.ct(by);
        byte by2 = this.cu(by);
        return fai2.a(ffV2, by2);
    }

    @Override
    public boolean b(ffV ffV2, byte by) {
        fai fai2 = this.ct(by);
        byte by2 = this.cu(by);
        return fai2.b(ffV2, by2);
    }

    @Override
    @Nullable
    public ffV lR(long l) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            ffV ffV2 = this.kBp.get(i).lR(l);
            if (ffV2 == null) continue;
            return ffV2;
        }
        return null;
    }

    @Override
    @Nullable
    public ffV cv(byte by) {
        fai fai2 = this.ct(by);
        byte by2 = this.cu(by);
        return fai2.cv(by2);
    }

    @Override
    public byte lS(long l) {
        byte by = 0;
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            fai fai2 = this.kBp.get(i);
            byte by2 = fai2.lS(l);
            if (by2 != -1) {
                return GC.ct(by + by2);
            }
            by = (byte)(by + fai2.bfa());
        }
        return -1;
    }

    @Override
    public boolean c(long l, short s) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            if (!this.kBp.get(i).c(l, s)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean br(ffV ffV2) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            if (!this.kBp.get(i).br(ffV2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean k(long l, short s) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            if (!this.kBp.get(i).k(l, s)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean bs(ffV ffV2) {
        int n = this.kBp.size();
        for (int i = 0; i < n; ++i) {
            if (!this.kBp.get(i).bs(ffV2)) continue;
            return true;
        }
        return false;
    }
}

