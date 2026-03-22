/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public class adD {
    public static final byte cka = 1;
    public static final byte ckb = 2;
    public static final byte ckc = 3;
    public static final byte ckd = 4;
    private short cke;
    private long aHT;
    private int ckf;
    private ArrayList<ahc_2> ckg;
    private ArrayList<ahc_2> ckh;
    private ArrayList<ahc_2> cki;
    private ArrayList<ahc_2> ckj;
    private ahc_2 ckk;
    private ahc_2 ckl;
    private boolean ckm;

    public void a(int n, long l, long l2, byte by, short s, byte by2, int n2) {
        this.a(n, new ahc_2(l, l2, by, s, by2, n2));
    }

    private void a(int n, ahc_2 ahc_22) {
        switch (ahc_22.aGu()) {
            case 0: {
                this.c(n, ahc_22);
                break;
            }
            case -1: {
                this.b(3, ahc_22);
                break;
            }
            case -2: {
                this.b(4, ahc_22);
                break;
            }
            default: {
                this.b(n, ahc_22);
            }
        }
    }

    public Optional<ahc_2> w(Long l) {
        Optional<ahc_2> optional;
        if (l == null) {
            return Optional.empty();
        }
        if (this.ckg != null && (optional = this.ckg.stream().filter(ahc_22 -> ahc_22.ccf() == l.longValue()).findFirst()).isPresent()) {
            return optional;
        }
        if (this.ckh != null && (optional = this.ckh.stream().filter(ahc_22 -> ahc_22.ccf() == l.longValue()).findFirst()).isPresent()) {
            return optional;
        }
        if (this.cki != null && (optional = this.cki.stream().filter(ahc_22 -> ahc_22.ccf() == l.longValue()).findFirst()).isPresent()) {
            return optional;
        }
        if (this.ckj == null) {
            return Optional.empty();
        }
        return this.ckj.stream().filter(ahc_22 -> ahc_22.ccf() == l.longValue()).findFirst();
    }

    private void b(int n, ahc_2 ahc_22) {
        ArrayList<ahc_2> arrayList;
        if (n == 1) {
            if (this.ckg == null) {
                this.ckg = new ArrayList();
            }
            arrayList = this.ckg;
        } else if (n == 2) {
            if (this.ckh == null) {
                this.ckh = new ArrayList();
            }
            arrayList = this.ckh;
        } else if (n == 3) {
            if (this.cki == null) {
                this.cki = new ArrayList();
            }
            arrayList = this.cki;
        } else if (n == 4) {
            if (this.ckj == null) {
                this.ckj = new ArrayList();
            }
            arrayList = this.ckj;
        } else {
            return;
        }
        arrayList.add(ahc_22);
        arrayList.sort(ade_0.ckn);
    }

    public List<ahc_2> buF() {
        ArrayList<ahc_2> arrayList = new ArrayList<ahc_2>();
        if (this.ckg != null) {
            arrayList.addAll(this.ckg);
        }
        if (this.ckh != null) {
            arrayList.addAll(this.ckh);
        }
        if (this.cki != null) {
            arrayList.addAll(this.cki);
        }
        if (this.ckj != null) {
            arrayList.addAll(this.ckj);
        }
        return arrayList;
    }

    private void c(int n, ahc_2 ahc_22) {
        if (n == 1) {
            this.ckk = ahc_22;
        } else if (n == 2) {
            this.ckl = ahc_22;
        }
    }

    public ArrayList<ahc_2> buG() {
        return this.ckg;
    }

    public ArrayList<ahc_2> buH() {
        return this.ckh;
    }

    public List<ahc_2> buI() {
        return this.cki != null ? this.cki : Collections.emptyList();
    }

    public List<ahc_2> buJ() {
        return this.ckj != null ? this.ckj : Collections.emptyList();
    }

    public ahc_2 buK() {
        return this.ckk;
    }

    public ahc_2 buL() {
        return this.ckl;
    }

    public short buM() {
        return this.cke;
    }

    public void au(short s) {
        this.cke = s;
    }

    public void fK(long l) {
        this.aHT = l;
    }

    public long aqZ() {
        return this.aHT;
    }

    public void rV(int n) {
        this.ckf = n;
    }

    public int buN() {
        return this.ckf;
    }

    public void ce(boolean bl) {
        this.ckm = bl;
    }

    public boolean buO() {
        return this.ckm;
    }

    final void k(@NotNull apl_1 apl_12) {
        ahc_2 ahc_22;
        int n;
        this.cke = apl_12.aIz();
        this.aHT = apl_12.bFQ();
        this.ckf = apl_12.aIA();
        int n2 = apl_12.aIz();
        for (n = 0; n < n2; ++n) {
            ahc_22 = new ahc_2();
            ahc_22.a(apl_12);
            this.a(1, ahc_22);
        }
        n2 = apl_12.aIz();
        for (n = 0; n < n2; ++n) {
            ahc_22 = new ahc_2();
            ahc_22.a(apl_12);
            this.a(2, ahc_22);
        }
        n2 = apl_12.aIz();
        for (n = 0; n < n2; ++n) {
            ahc_22 = new ahc_2();
            ahc_22.a(apl_12);
            this.a(3, ahc_22);
        }
        n2 = apl_12.aIz();
        for (n = 0; n < n2; ++n) {
            ahc_22 = new ahc_2();
            ahc_22.a(apl_12);
            this.a(4, ahc_22);
        }
        this.ckm = apl_12.bFS();
    }

    final void m(@NotNull fs_0 fs_02) {
        int n;
        int n2;
        fs_02.k(this.cke);
        fs_02.cq(this.aHT);
        fs_02.mz(this.ckf);
        short s = 0;
        if (this.ckg != null) {
            s = (short)(s + (short)this.ckg.size());
        }
        if (this.ckk != null) {
            s = (short)(s + 1);
        }
        fs_02.k(s);
        if (this.ckg != null) {
            n2 = this.ckg.size();
            for (n = 0; n < n2; ++n) {
                this.ckg.get(n).b(fs_02);
            }
        }
        if (this.ckk != null) {
            this.ckk.b(fs_02);
        }
        s = 0;
        if (this.ckh != null) {
            s = (short)(s + (short)this.ckh.size());
        }
        if (this.ckl != null) {
            s = (short)(s + 1);
        }
        fs_02.k(s);
        if (this.ckh != null) {
            n2 = this.ckh.size();
            for (n = 0; n < n2; ++n) {
                this.ckh.get(n).b(fs_02);
            }
        }
        if (this.ckl != null) {
            this.ckl.b(fs_02);
        }
        s = 0;
        if (this.cki != null) {
            s = (short)(s + (short)this.cki.size());
        }
        fs_02.k(s);
        if (this.cki != null) {
            n2 = this.cki.size();
            for (n = 0; n < n2; ++n) {
                this.cki.get(n).b(fs_02);
            }
        }
        s = 0;
        if (this.ckj != null) {
            s = (short)(s + (short)this.ckj.size());
        }
        fs_02.k(s);
        if (this.ckj != null) {
            n2 = this.ckj.size();
            for (n = 0; n < n2; ++n) {
                this.ckj.get(n).b(fs_02);
            }
        }
        fs_02.ay(this.ckm);
    }

    public boolean a(adD adD2) {
        int n;
        int n2;
        if (adD2 == this) {
            return true;
        }
        if (adD2.ckg == null || this.ckg == null) {
            if (adD2.ckg != null || this.ckg != null) {
                return false;
            }
        } else {
            if (adD2.ckg.size() != this.ckg.size()) {
                return false;
            }
            n2 = this.ckg.size();
            for (n = 0; n < n2; ++n) {
                if (this.ckg.get(n).equals(adD2.ckg.get(n))) continue;
                return false;
            }
        }
        if (adD2.ckh == null || this.ckh == null) {
            if (adD2.ckh != null || this.ckh != null) {
                return false;
            }
        } else {
            if (adD2.ckh.size() != this.ckh.size()) {
                return false;
            }
            n2 = this.ckh.size();
            for (n = 0; n < n2; ++n) {
                if (this.ckh.get(n).equals(adD2.ckh.get(n))) continue;
                return false;
            }
        }
        if (adD2.cki == null || this.cki == null) {
            if (adD2.cki != null || this.cki != null) {
                return false;
            }
        } else {
            if (adD2.cki.size() != this.cki.size()) {
                return false;
            }
            n2 = this.cki.size();
            for (n = 0; n < n2; ++n) {
                if (this.cki.get(n).equals(adD2.cki.get(n))) continue;
                return false;
            }
        }
        if (adD2.ckj == null || this.ckj == null) {
            if (adD2.ckj != null || this.ckj != null) {
                return false;
            }
        } else {
            if (adD2.ckj.size() != this.ckj.size()) {
                return false;
            }
            n2 = this.ckj.size();
            for (n = 0; n < n2; ++n) {
                if (this.ckj.get(n).equals(adD2.ckj.get(n))) continue;
                return false;
            }
        }
        if (this.ckk == null || adD2.ckk == null ? this.ckk != null || adD2.ckk != null : !this.ckk.equals(adD2.ckk)) {
            return false;
        }
        if (this.ckl == null || adD2.ckl == null ? this.ckl != null || adD2.ckl != null : !this.ckl.equals(adD2.ckl)) {
            return false;
        }
        return this.ckm == adD2.ckm;
    }
}

