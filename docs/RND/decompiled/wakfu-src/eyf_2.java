/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eYF
 */
public class eyf_2 {
    private static final Logger rKu = Logger.getLogger(eyf_2.class);
    private long aDL;
    private String p;
    private long ioh;
    private String aNf = "";
    private String aCL = "";
    private short ejt;
    private int rKv;
    private int rKw;
    private int rKx;
    private int rKy;
    private final ArrayList<ezz_1> rKz = new ArrayList();
    private final ArrayList<fab> rKA = new ArrayList();
    private final ArrayList<ezv_1> rKB = new ArrayList();

    public eyf_2 rH(long l) {
        this.aDL = l;
        return this;
    }

    public eyf_2 sy(String string) {
        this.p = string;
        return this;
    }

    public eyf_2 rI(long l) {
        this.ioh = l;
        return this;
    }

    public eyf_2 sz(String string) {
        this.aNf = string;
        return this;
    }

    public eyf_2 sA(String string) {
        this.aCL = string;
        return this;
    }

    public eyf_2 TE(int n) {
        this.rKv = n;
        return this;
    }

    public eyf_2 TF(int n) {
        this.rKw = n;
        return this;
    }

    public eyf_2 ey(short s) {
        this.ejt = s;
        return this;
    }

    public eyf_2 TG(int n) {
        this.rKx = n;
        return this;
    }

    public eyf_2 TH(int n) {
        this.rKy = n;
        return this;
    }

    public eyf_2 t(ezz_1 ezz_12) {
        this.rKz.add(ezz_12);
        return this;
    }

    public eyf_2 k(fab fab2) {
        this.rKA.add(fab2);
        return this;
    }

    public eyf_2 m(ezv_1 ezv_12) {
        this.rKB.add(ezv_12);
        return this;
    }

    public ezu_1 fQh() {
        int n;
        eye_2 eye_22 = new eye_2();
        eye_22.dC(this.aDL);
        eye_22.setName(this.p);
        eye_22.jS(this.ioh);
        eye_22.cA(this.aNf);
        eye_22.co(this.aCL);
        eye_22.Tw(this.rKv);
        eye_22.Tv(this.rKw);
        eye_22.Tx(this.rKx);
        eye_22.Ty(this.rKy);
        eye_22.bw(this.ejt);
        int n2 = this.rKA.size();
        for (n = 0; n < n2; ++n) {
            eye_22.g(this.rKA.get(n));
        }
        n2 = this.rKB.size();
        for (n = 0; n < n2; ++n) {
            eye_22.j(this.rKB.get(n));
        }
        n2 = this.rKz.size();
        for (n = 0; n < n2; ++n) {
            eye_22.f(this.a(eye_22, this.rKz.get(n)));
        }
        return eye_22;
    }

    private ezz_1 a(eye_2 eye_22, ezz_1 ezz_12) {
        if (eye_22.jR(ezz_12.Xm()) == null) {
            long l = eye_22.dKs();
            if (l > 0L) {
                rKu.error((Object)("Member " + ezz_12.getName() + " with member id " + ezz_12.Sn() + " for guild " + eye_22.Sn() + " has a rank id " + ezz_12.Xm() + " which doesn't exist for this guild ! Setting worst rank for member (ie rank id " + l + ")."));
                ((eyd_2)ezz_12).rE(l);
            } else {
                rKu.error((Object)("Member " + ezz_12.getName() + " with member id " + ezz_12.Sn() + " for guild " + eye_22.Sn() + " has a rank id " + ezz_12.Xm() + " which doesn't exist for this guild ! AND NO WORST RANK TO APPLY BY DEFAULT. FIX ME."));
            }
        }
        return ezz_12;
    }
}

