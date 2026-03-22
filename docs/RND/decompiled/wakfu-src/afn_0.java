/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from afN
 */
public abstract class afn_0
implements afZ {
    public static int[] crj;
    private boolean bmg = true;
    private boolean crk = true;
    private afV crl;
    private final aah_1<aaq_1<afQ>> crm = new aah_1();
    private afS crn;
    final ArrayList<afp_0> cro = new ArrayList();

    protected afn_0() {
    }

    public void a(afS afS2) {
        this.crn = afS2;
    }

    public void e(afV afV2) {
        this.crl = afV2;
    }

    public boolean isVisible() {
        return this.crk;
    }

    public void setVisible(boolean bl) {
        this.crk = bl;
    }

    protected void a(int n, long l, afW afW2) {
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        if (aaq_12 == null) {
            return;
        }
        afQ afQ2 = aaq_12.hd(l);
        if (afQ2 == null) {
            return;
        }
        afQ2.a(afW2);
    }

    public boolean j(int n, long l) {
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        return aaq_12 != null && aaq_12.gR(l);
    }

    public boolean sf(int n) {
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        return aaq_12 != null && aaq_12.aVo() != 0;
    }

    public void a(int n, long l, int n2, int n3, int n4, Object object, afR afR2, boolean bl) {
        this.removeAll();
        this.b(n, l, n2, n3, n4, object, afR2, bl);
    }

    private void b(int n, long l, int n2, int n3, int n4, Object object, afR afR2, boolean bl) {
        afQ afQ2;
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        if (aaq_12 == null) {
            aaq_12 = new aaq_1();
            this.crm.b(n, aaq_12);
        }
        if ((afQ2 = aaq_12.hd(l)) != null) {
            this.a(afQ2, n2, n3, n4, false);
            afQ2.setValue(object);
        } else {
            afQ2 = this.a(n, this.crn, object, crj[n], n2, n3, n4, bl);
            afQ2.byd();
            this.a(afQ2, n2, n3, n4, true);
            aaq_12.a(l, afQ2);
        }
        afQ2.a(afR2);
    }

    protected abstract afQ a(int var1, afS var2, Object var3, int var4, int var5, int var6, int var7, boolean var8);

    public void a(int n, long l, int n2, int n3, int n4) {
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        if (aaq_12 == null) {
            return;
        }
        afQ afQ2 = aaq_12.hd(l);
        if (afQ2 == null) {
            return;
        }
        this.a(afQ2, n2, n3, n4, false);
    }

    void a(afQ afQ2, int n, int n2, int n3, boolean bl) {
        if (this.crl == null) {
            this.cro.add(new afo_0(this, afQ2, n, n2, n3, bl));
            return;
        }
        float f2 = this.crl.aM(n, n2);
        float f3 = this.crl.j(n, n2, n3);
        if (bl) {
            afQ2.setPosition(n, n2, n3);
            afQ2.setScreenPosition((int)f2, (int)f3);
        } else {
            afQ2.B(n, n2, n3);
            afQ2.bA((int)f2, (int)f3);
        }
    }

    public void k(int n, long l) {
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        if (aaq_12 == null) {
            return;
        }
        afQ afQ2 = aaq_12.hc(l);
        if (afQ2 != null) {
            afQ2.clear();
        }
    }

    public void sg(int n) {
        aaq_1<afQ> aaq_12 = this.crm.vK(n);
        if (aaq_12 == null) {
            return;
        }
        for (int i = aaq_12.aVo() - 1; i >= 0; --i) {
            aaq_12.vU(i).clear();
        }
        aaq_12.clear();
    }

    public void removeAll() {
        int n = this.crm.bTR();
        for (int i = 0; i < n; ++i) {
            this.sg(this.crm.wa(i));
        }
        this.crm.clear();
    }

    public void a(afV afV2, int n) {
        afV afV3 = this.crl;
        this.crl = afV2;
        if (afV3 == null && this.crl != null) {
            this.byb();
        }
        boolean bl = false;
        if (this.crk != this.bmg) {
            this.bmg = this.crk;
            if (this.bmg) {
                bl = true;
            } else {
                int n2 = this.crm.bTR();
                for (int i = 0; i < n2; ++i) {
                    aaq_1<afQ> aaq_12 = this.crm.vU(i);
                    int n3 = aaq_12.aVo();
                    for (int j = 0; j < n3; ++j) {
                        aaq_12.vU(j).clear();
                    }
                }
            }
        }
        if (this.bmg) {
            this.a(afV2, n, bl);
        }
    }

    private void byb() {
        for (int i = this.cro.size() - 1; i >= 0; --i) {
            this.cro.get(i).byc();
        }
    }

    private void a(afV afV2, int n, boolean bl) {
        agf agf2 = afV2.brf();
        afW afW2 = agf2.byR();
        int n2 = this.crm.bTR();
        for (int i = 0; i < n2; ++i) {
            aaq_1<afQ> aaq_12 = this.crm.vU(i);
            for (int j = aaq_12.aVo() - 1; j >= 0; --j) {
                int n3;
                afQ afQ2 = aaq_12.vU(j);
                int n4 = n3 = afQ2.byg() ? Short.MIN_VALUE : (int)wa_0.y(afQ2.getX(), afQ2.getY(), (short)afQ2.NN());
                if (n3 == Short.MIN_VALUE) {
                    n3 = (short)afQ2.NN();
                }
                this.a(afQ2, afQ2.getX(), afQ2.getY(), n3, false);
                afQ2.qy(n);
                float f2 = afW2.getWorldX() - (float)afQ2.getX();
                float f3 = afW2.getWorldY() - (float)afQ2.getY();
                float f4 = aco_1.bn(f2, f3);
                if (f4 < 4.0f) {
                    this.removeAll();
                    return;
                }
                int n5 = afQ2.getScreenX();
                int n6 = afQ2.getScreenY();
                boolean bl2 = agf2.m(n6, n5, n6, n5);
                afQ2.d(bl2, bl);
            }
        }
    }

    public void a(afV afV2, float f2, float f3) {
    }
}

