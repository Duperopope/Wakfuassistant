/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fHC
 */
public class fhc_2 {
    private static final fhc_2 uyy = new fhc_2();
    private final ArrayList<fhe_2> uyz = new ArrayList();
    private final ArrayList<fhe_2> uyA = new ArrayList();
    private final ArrayList<fhe_2> uyB = new ArrayList();
    private final ArrayList<fcv_1> uyC = new ArrayList();
    private boolean uyD = false;
    private boolean bmT = false;
    private final ArrayList<fcv_1> uyE = new ArrayList();
    private final ArrayList<fcv_1> uyF = new ArrayList();
    private boolean uyG = false;
    private int uyH = 0;

    private fhc_2() {
    }

    public static fhc_2 gAV() {
        return uyy;
    }

    public void a(fhe_2 fhe_22) {
        if (!this.bmT) {
            this.uyz.add(fhe_22);
        } else {
            this.uyA.add(fhe_22);
            this.uyG = true;
        }
    }

    public void b(fhe_2 fhe_22) {
        if (!this.bmT) {
            this.uyz.remove(fhe_22);
        } else {
            this.uyB.add(fhe_22);
            this.uyG = true;
        }
    }

    public void u(fcv_1 fcv_12) {
        if (this.bmT) {
            this.uyE.add(fcv_12);
            this.uyG = true;
        } else {
            if (!this.uyC.contains(fcv_12)) {
                this.uyC.add(fcv_12);
            }
            this.uyD = true;
        }
    }

    public void v(fcv_1 fcv_12) {
        if (this.bmT) {
            if (this.uyE.contains(fcv_12)) {
                this.uyE.remove(fcv_12);
            } else {
                this.uyF.add(fcv_12);
            }
            this.uyG = true;
        } else {
            this.uyC.remove(fcv_12);
        }
    }

    public void bXC() {
        this.uyC.sort(fhd_2.uyI);
        this.uyD = false;
    }

    public void gAW() {
        this.uyD = true;
    }

    public boolean gAX() {
        return this.uyD;
    }

    public void gAY() {
        int n;
        this.bYy();
        int n2 = this.uyH;
        this.uyH = 0;
        int n3 = this.uyC.size();
        for (n = 0; n < n3; ++n) {
            if (!this.uyC.get(n).gtW()) continue;
            ++this.uyH;
        }
        if (this.uyH == 0 && n2 > 0) {
            n3 = this.uyz.size();
            for (n = 0; n < n3; ++n) {
                this.uyz.get(n).gAZ();
            }
        }
        this.bYz();
    }

    public void bYy() {
        this.bmT = true;
    }

    public void bYz() {
        int n;
        this.bmT = false;
        if (!this.uyG) {
            return;
        }
        int n2 = this.uyE.size();
        if (n2 > 0) {
            for (n = 0; n < n2; ++n) {
                this.u(this.uyE.get(n));
            }
            this.uyE.clear();
        }
        if ((n2 = this.uyF.size()) > 0) {
            for (n = 0; n < n2; ++n) {
                this.v(this.uyF.get(n));
            }
            this.uyF.clear();
        }
        if ((n2 = this.uyA.size()) > 0) {
            for (n = 0; n < n2; ++n) {
                this.a(this.uyA.get(n));
            }
            this.uyA.clear();
        }
        if ((n2 = this.uyB.size()) > 0) {
            for (n = 0; n < n2; ++n) {
                this.b(this.uyB.get(n));
            }
            this.uyB.clear();
        }
        this.uyG = false;
    }
}

