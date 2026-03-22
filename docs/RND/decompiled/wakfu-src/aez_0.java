/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from aeZ
 */
public class aez_0<APS extends aeb_1, CPS extends aeb_1>
implements aeh_2 {
    private static final Logger cpl = Logger.getLogger(aez_0.class);
    private static final boolean cpm = false;
    public static final int cpn = 25;
    public static final int cpo = 5;
    private aeb_1 cpp;
    private APS cpq;
    private CPS cpr;
    private final Map<Long, CPS> cps = new HashMap<Long, CPS>();
    private final List<afg> cpt = new ArrayList<afg>();

    public aeb_1 b(afh afh2) {
        switch (afh2) {
            case cpT: {
                return this.cpp;
            }
            case cpU: {
                return this.cpq;
            }
            case cpV: {
                return this.cpr;
            }
            case cpW: {
                throw new IllegalArgumentException("Getting hero preferences without specifying the targeted hero is not consistent");
            }
        }
        return null;
    }

    public afe et(String string) {
        return aff.ew(string);
    }

    public void a(afe afe2, boolean bl) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)bl);
            return;
        }
        w2.d(string, bl);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void a(afe afe2, double d2) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)d2);
            return;
        }
        w2.b(string, d2);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void a(afe afe2, float f2) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, Float.valueOf(f2));
            return;
        }
        w2.b(string, f2);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void a(afe afe2, int n) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)n);
            return;
        }
        w2.k(string, n);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void a(afe afe2, long l) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)l);
            return;
        }
        w2.d(string, l);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void a(afe afe2, String string) {
        Object w2 = afe2.d(this);
        String string2 = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)string);
            return;
        }
        w2.m(string2, string);
        aeg_2.caa().a((aef_2)this, string2);
    }

    public void a(afe afe2, Set<Short> set) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)set);
            return;
        }
        w2.a(string, set);
    }

    public void b(afe afe2, boolean bl) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)bl);
            return;
        }
        w2.w(string, bl);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void b(afe afe2, double d2) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)d2);
            return;
        }
        w2.c(string, d2);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void b(afe afe2, float f2) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, Float.valueOf(f2));
            return;
        }
        w2.d(string, f2);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void b(afe afe2, int n) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)n);
            return;
        }
        w2.l(string, n);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void b(afe afe2, long l) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)l);
            return;
        }
        w2.e(string, l);
        aeg_2.caa().a((aef_2)this, string);
    }

    public void b(afe afe2, String string) {
        Object w2 = afe2.d(this);
        String string2 = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)string);
            return;
        }
        w2.I(string2, string);
        aeg_2.caa().a((aef_2)this, string2);
    }

    public void b(afe afe2, Set<Short> set) {
        Object w2 = afe2.d(this);
        String string = afe2.getKey();
        if (w2 == null) {
            this.a(afe2, (Object)set);
            return;
        }
        w2.b(string, set);
        aeg_2.caa().a((aef_2)this, string);
    }

    private void a(afe afe2, Object object) {
        cpl.error((Object)String.format("[PREFS] Unable to set preference related to following key : %s with following value : %s in this context, preferenceStore associated isn't initialized", afe2, object), (Throwable)new IllegalStateException(String.format("Unable to set following preference : %s with following value : %s", afe2, object)));
    }

    public boolean a(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return false;
        }
        return r.aK(string);
    }

    public double b(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0.0;
        }
        return r.bY(string);
    }

    public float c(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0.0f;
        }
        return r.bX(string);
    }

    public int d(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0;
        }
        return r.hF(string);
    }

    public long e(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0L;
        }
        return r.hG(string);
    }

    public String f(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return null;
        }
        return r.bS(string);
    }

    public Set<Short> g(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return null;
        }
        return r.hH(string);
    }

    public boolean h(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return false;
        }
        return r.hI(string);
    }

    public double i(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0.0;
        }
        return r.hJ(string);
    }

    public float j(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0.0f;
        }
        return r.hK(string);
    }

    public int k(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0;
        }
        return r.hL(string);
    }

    public long l(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return 0L;
        }
        return r.hM(string);
    }

    public String m(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return null;
        }
        return r.hN(string);
    }

    public Set<Short> n(afe afe2) {
        Object r = afe2.c(this);
        String string = afe2.getKey();
        if (r == null) {
            this.o(afe2);
            return null;
        }
        return r.hO(string);
    }

    private void o(afe afe2) {
    }

    protected void bxh() {
    }

    protected void bxi() {
    }

    protected void fN(long l) {
    }

    protected void bxj() {
        this.b((afe)aff.cpI, My.aUY().aUK());
        this.b((afe)afd.cpy, 1.0f);
        this.b((afe)afd.cpz, 1.0f);
        this.b((afe)afd.cpA, 1.0f);
        this.b((afe)afd.cpB, false);
        this.b((afe)afd.cpC, false);
        this.b((afe)afd.cpD, false);
        this.b((afe)afd.cpE, false);
        this.b((afe)aff.cpK, true);
        this.b((afe)aff.cpL, 0);
        this.b((afe)aff.cpN, false);
        this.b((afe)aff.cpO, false);
        this.b((afe)aff.cpP, true);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(aff.cpI.getKey())) {
            return this.f(aff.cpI);
        }
        if (string.equals(afd.cpy.getKey())) {
            return Float.valueOf(this.c(afd.cpy));
        }
        if (string.equals(afd.cpz.getKey())) {
            return Float.valueOf(this.c(afd.cpz));
        }
        if (string.equals(afd.cpA.getKey())) {
            return Float.valueOf(this.c(afd.cpA));
        }
        if (string.equals(afd.cpB.getKey())) {
            return this.a(afd.cpB);
        }
        if (string.equals(afd.cpC.getKey())) {
            return this.a(afd.cpC);
        }
        if (string.equals(afd.cpD.getKey())) {
            return this.a(afd.cpD);
        }
        if (string.equals(afd.cpE.getKey())) {
            return this.a(afd.cpE);
        }
        if (string.equals(aff.cpL.getKey())) {
            return Float.valueOf(this.c(aff.cpL) + 5.0f);
        }
        if (string.equals(aff.cpN.getKey())) {
            return this.a(aff.cpN);
        }
        if (string.equals(aff.cpO.getKey())) {
            return this.a(aff.cpO);
        }
        if (string.equals(aff.cpP.getKey())) {
            return this.a(aff.cpP);
        }
        if (string.equals(aff.cpK.getKey())) {
            return this.a(aff.cpK);
        }
        return null;
    }

    @Override
    public String[] bxk() {
        aff[] affArray = aff.values();
        afd[] afdArray = afd.values();
        String[] stringArray = new String[affArray.length + afdArray.length];
        int n = 0;
        for (aff enum_ : affArray) {
            stringArray[n] = enum_.getKey();
            ++n;
        }
        for (Enum enum_ : afdArray) {
            stringArray[n] = ((afd)enum_).getKey();
            ++n;
        }
        return stringArray;
    }

    public void ev(String string) {
        aeg_2.caa().a((aef_2)this, string);
    }

    public void bxl() {
        if (this.cpp != null) {
            this.cpp.bxl();
        }
        if (this.cpq != null) {
            ((aeb_1)this.cpq).bxl();
        }
        if (this.cpr != null) {
            ((aeb_1)this.cpr).bxl();
        }
    }

    public CPS fO(long l) {
        return (CPS)((aeb_1)this.cps.get(l));
    }

    public CPS bxm() {
        return this.cpr;
    }

    public APS bxn() {
        return this.cpq;
    }

    public aeb_1 bxo() {
        return this.cpp;
    }

    public void a(aeb_1 aeb_12) {
        aeb_1 aeb_13 = this.cpp;
        this.cpp = aeb_12;
        if (this.cpp != null) {
            this.bxj();
        }
        this.a(afh.cpT, aeb_13, aeb_12);
    }

    public void b(APS APS) {
        APS APS2 = this.cpq;
        this.cpq = APS;
        if (this.cpq != null) {
            this.bxh();
        }
        this.a(afh.cpU, (aeb_1)APS2, (aeb_1)APS);
    }

    public void c(CPS CPS) {
        CPS CPS2 = this.cpr;
        this.cpr = CPS;
        if (this.cpr != null) {
            this.bxi();
        }
        this.a(afh.cpV, (aeb_1)CPS2, (aeb_1)CPS);
    }

    public void a(long l, CPS CPS) {
        aeb_1 aeb_12 = (aeb_1)this.cps.get(l);
        this.cps.put(l, CPS);
        if (CPS != null) {
            this.fN(l);
        }
        this.a(afh.cpW, aeb_12, (aeb_1)CPS);
    }

    public void bxp() {
        for (long l : this.cps.keySet()) {
            this.a(l, null);
        }
    }

    private void a(afh afh2, aeb_1 aeb_12, aeb_1 aeb_13) {
        for (afg afg2 : this.cpt) {
            afg2.b(afh2, aeb_12, aeb_13);
        }
    }

    public void a(afg afg2) {
        this.cpt.add(afg2);
    }

    public void b(afg afg2) {
        this.cpt.remove(afg2);
    }
}

