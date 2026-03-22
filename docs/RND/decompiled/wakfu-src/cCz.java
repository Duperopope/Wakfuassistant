/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class cCz {
    public int o;
    public int mAl = -1;
    public boolean mAm;
    public boolean mAn;
    public boolean mAo;
    public String p;
    public final ArrayList<cbp_0> mAp = new ArrayList();
    public final TLongArrayList mAq = new TLongArrayList();
    public byte mAr;
    public boolean mxE;
    public cCk mxF;
    public int jBa;
    public byte mAs;
    public byte mAt;
    public int mxV;
    public int mAu;
    public int mxX;
    public int mxY;
    public int mxZ;
    public int mya;
    public boolean myb = true;
    public int myf;
    public int mye;
    public int cDx = -1;
    public int mAv = -1;
    public int mAw = -1;
    public int myr;

    public void a(@NotNull apl_1 apl_12) {
        int n;
        int n2;
        this.o = apl_12.aIA();
        this.mAl = apl_12.aIA();
        this.mAm = apl_12.bFS();
        this.mAn = apl_12.bFS();
        this.mAo = apl_12.bFS();
        this.p = apl_12.aIC();
        this.mAv = apl_12.aIA();
        this.mAw = apl_12.aIA();
        if (this.mAn) {
            this.mAr = apl_12.aIy();
            this.mxE = apl_12.bFS();
            n2 = apl_12.bFS() ? 1 : 0;
            if (n2 != 0) {
                this.mxF = cce_0.dV(apl_12.aIy()).eJq();
                this.mxF.a(apl_12);
            }
        }
        if (this.mAo) {
            this.jBa = apl_12.aIA();
        }
        n2 = apl_12.aIA();
        this.mAp.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            this.mAp.add(cbe_0.E(apl_12));
        }
        n = apl_12.aIA();
        this.mAq.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            this.mAq.add(apl_12.bFQ());
        }
        if (!this.mAm) {
            this.mAs = apl_12.aIy();
            this.mAt = apl_12.aIy();
            this.mxV = apl_12.aIA();
            this.mAu = apl_12.aIA();
            this.mxX = apl_12.aIA();
            this.mxY = apl_12.aIA();
            this.mxZ = apl_12.aIA();
            this.mya = apl_12.aIA();
            this.myb = apl_12.bFS();
            this.myf = apl_12.aIA();
            this.mye = apl_12.aIA();
            this.cDx = apl_12.aIA();
            this.myr = apl_12.aIA();
        }
    }

    public void b(@NotNull fs_0 fs_02) {
        int n;
        fs_02.mz(this.o);
        fs_02.mz(this.mAl);
        fs_02.ay(this.mAm);
        fs_02.ay(this.mAn);
        fs_02.ay(this.mAo);
        fs_02.bo(this.p);
        fs_02.mz(this.mAv);
        fs_02.mz(this.mAw);
        if (this.mAn) {
            fs_02.g(this.mAr);
            fs_02.ay(this.mxE);
            fs_02.ay(this.mxF != null);
            if (this.mxF != null) {
                fs_02.g(this.mxF.eIT());
                this.mxF.b(fs_02);
            }
        }
        if (this.mAo) {
            fs_02.mz(this.jBa);
        }
        fs_02.mz(this.mAp.size());
        int n2 = this.mAp.size();
        for (n = 0; n < n2; ++n) {
            cbe_0.a(fs_02, this.mAp.get(n));
        }
        fs_02.mz(this.mAq.size());
        n2 = this.mAq.size();
        for (n = 0; n < n2; ++n) {
            fs_02.cq(this.mAq.get(n));
        }
        if (!this.mAm) {
            fs_02.g(this.mAs);
            fs_02.g(this.mAt);
            fs_02.mz(this.mxV);
            fs_02.mz(this.mAu);
            fs_02.mz(this.mxX);
            fs_02.mz(this.mxY);
            fs_02.mz(this.mxZ);
            fs_02.mz(this.mya);
            fs_02.ay(this.myb);
            fs_02.mz(this.myf);
            fs_02.mz(this.mye);
            fs_02.mz(this.cDx);
            fs_02.mz(this.myr);
        }
    }

    private void a(fs_0 fs_02, String string, String string2) {
        fs_02.bo(string);
        fs_02.bo(string2);
    }

    private void a(apl_1 apl_12, String string, String string2) {
        if (string.equals("id")) {
            this.o = Bw.m(string2);
        } else if (string.equals("strataId")) {
            this.mAl = Bw.m(string2);
        } else if (string.equals("parentContainer")) {
            this.mAm = Bw.aK(string2);
        } else if (string.equals("eventContainer")) {
            this.mAn = Bw.aK(string2);
        } else if (string.equals("audioMarkerContainer")) {
            this.mAo = Bw.aK(string2);
        } else if (string.equals("audioMarkerType")) {
            this.jBa = Bw.m(string2);
        } else if (string.equals("eventType")) {
            this.mAr = Bw.q(string2);
        } else if (string.equals("eventIsLocalized")) {
            this.mxE = Bw.aK(string2);
        } else if (string.equals("name")) {
            this.p = string2;
        } else if (string.equals("gain")) {
            this.mAv = Bw.m(string2);
        } else if (string.equals("maxGain")) {
            this.mAw = Bw.m(string2);
        } else if (string.equals("hasEventCriterion")) {
            boolean bl = Bw.aK(string2);
            if (bl) {
                this.mxF = cce_0.dV(apl_12.aIy()).eJq();
                this.mxF.a(apl_12);
            }
        } else if (string.equals("criteriaSize")) {
            int n = Bw.m(string2);
            this.mAp.ensureCapacity(n);
            for (int i = 0; i < n; ++i) {
                this.mAp.add(cbe_0.E(apl_12));
            }
        } else if (string.equals("sourcesSize")) {
            int n = Bw.m(string2);
            this.mAq.ensureCapacity(n);
            for (int i = 0; i < n; ++i) {
                this.mAq.add(apl_12.bFQ());
            }
        } else if (string.equals("busId")) {
            this.mAs = Bw.q(string2);
        } else if (string.equals("busType")) {
            this.mAt = Bw.q(string2);
        } else if (string.equals("playType")) {
            this.mxV = Bw.m(string2);
        } else if (string.equals("transition")) {
            this.mAu = Bw.m(string2);
        } else if (string.equals("transitionMinDuration")) {
            this.mxZ = this.mxX = Bw.m(string2);
        } else if (string.equals("transitionMaxDuration")) {
            this.mya = this.mxY = Bw.m(string2);
        } else if (string.equals("transitionInMinDuration")) {
            this.mxX = Bw.m(string2);
        } else if (string.equals("transitionInMaxDuration")) {
            this.mxY = Bw.m(string2);
        } else if (string.equals("transitionOutMinDuration")) {
            this.mxZ = Bw.m(string2);
        } else if (string.equals("transitionOutMaxDuration")) {
            this.mya = Bw.m(string2);
        } else if (string.equals("transitionUseSameInOutValues")) {
            this.myb = Bw.aK(string2);
        } else if (string.equals("loopMode")) {
            this.myf = Bw.m(string2);
        } else if (string.equals("loopDuration")) {
            this.mye = Bw.m(string2);
        } else if (string.equals("rollOffId")) {
            this.cDx = Bw.m(string2);
        } else if (string.equals("initialDelay")) {
            this.myr = Bw.m(string2);
        }
    }

    public void F(apl_1 apl_12) {
        String string = apl_12.aIC();
        if (!string.equals("rsc")) {
            return;
        }
        apl_12.aIC();
        while (true) {
            String string2 = apl_12.aIC();
            String string3 = apl_12.aIC();
            if (string2.equals("/rsc")) {
                return;
            }
            this.a(apl_12, string2, string3);
        }
    }

    public void r(fs_0 fs_02) {
        int n;
        this.a(fs_02, "rsc", "");
        this.a(fs_02, "id", String.valueOf(this.o));
        this.a(fs_02, "strataId", String.valueOf(this.mAl));
        this.a(fs_02, "parentContainer", String.valueOf(this.mAm));
        this.a(fs_02, "eventContainer", String.valueOf(this.mAn));
        this.a(fs_02, "eventType", String.valueOf(this.mAr));
        this.a(fs_02, "eventIsLocalized", String.valueOf(this.mxE));
        this.a(fs_02, "audioMarkerContainer", String.valueOf(this.mAo));
        this.a(fs_02, "audioMarkerType", String.valueOf(this.jBa));
        this.a(fs_02, "name", this.p);
        this.a(fs_02, "gain", String.valueOf(this.mAv));
        this.a(fs_02, "maxGain", String.valueOf(this.mAw));
        this.a(fs_02, "hasEventCriterion", String.valueOf(this.mxF != null));
        if (this.mxF != null) {
            fs_02.g(this.mxF.eIT());
            this.mxF.b(fs_02);
        }
        this.a(fs_02, "criteriaSize", String.valueOf(this.mAp.size()));
        int n2 = this.mAp.size();
        for (n = 0; n < n2; ++n) {
            cbe_0.a(fs_02, this.mAp.get(n));
        }
        this.a(fs_02, "sourcesSize", String.valueOf(this.mAq.size()));
        n2 = this.mAq.size();
        for (n = 0; n < n2; ++n) {
            fs_02.cq(this.mAq.get(n));
        }
        if (!this.mAm) {
            this.a(fs_02, "busId", String.valueOf(this.mAs));
            this.a(fs_02, "busType", String.valueOf(this.mAt));
            this.a(fs_02, "playType", String.valueOf(this.mxV));
            this.a(fs_02, "transition", String.valueOf(this.mAu));
            this.a(fs_02, "transitionInMinDuration", String.valueOf(this.mxX));
            this.a(fs_02, "transitionInMaxDuration", String.valueOf(this.mxY));
            this.a(fs_02, "transitionOutMinDuration", String.valueOf(this.mxZ));
            this.a(fs_02, "transitionOutMaxDuration", String.valueOf(this.mya));
            this.a(fs_02, "transitionUseSameInOutValues", String.valueOf(this.myb));
            this.a(fs_02, "loopMode", String.valueOf(this.myf));
            this.a(fs_02, "loopDuration", String.valueOf(this.mye));
            this.a(fs_02, "rollOffId", String.valueOf(this.cDx));
            this.a(fs_02, "initialDelay", String.valueOf(this.myr));
        }
        this.a(fs_02, "/rsc", "");
    }

    public void d(cCz cCz2) {
        int n;
        cCz2.o = this.o;
        cCz2.mAl = this.mAl;
        cCz2.mAm = this.mAm;
        cCz2.mAn = this.mAn;
        cCz2.mAo = this.mAo;
        cCz2.jBa = this.jBa;
        cCz2.mAr = this.mAr;
        cCz2.mxE = this.mxE;
        cCz2.p = this.p;
        cCz2.mxF = this.mxF != null ? this.mxF.eJk() : null;
        int n2 = this.mAp.size();
        for (n = 0; n < n2; ++n) {
            cCz2.mAp.add(this.mAp.get(n).eIV());
        }
        n2 = this.mAq.size();
        for (n = 0; n < n2; ++n) {
            cCz2.mAq.add(this.mAq.get(n));
        }
        cCz2.mAs = this.mAs;
        cCz2.mAt = this.mAt;
        cCz2.mxV = this.mxV;
        cCz2.mAu = this.mAu;
        cCz2.mxX = this.mxX;
        cCz2.mxY = this.mxY;
        cCz2.mxZ = this.mxZ;
        cCz2.mya = this.mya;
        cCz2.myb = this.myb;
        cCz2.myf = this.myf;
        cCz2.mye = this.mye;
        cCz2.cDx = this.cDx;
        cCz2.mAv = this.mAv;
        cCz2.mAw = this.mAw;
        cCz2.myr = this.myr;
    }

    public String toString() {
        return this.p + " (id=" + this.o + ")";
    }
}

