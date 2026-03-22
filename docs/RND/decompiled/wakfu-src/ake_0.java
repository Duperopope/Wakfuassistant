/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aKE
 */
public abstract class ake_0
implements fhb_2 {
    protected final aad_0 eeY;
    protected final aad_0 eeZ;
    protected final aad_0 efa;
    protected final aKv efb;
    protected final Map<aad_0, axb_2> efc = new HashMap<aad_0, axb_2>();
    final acd_1 efd = new acd_1();

    public ake_0(String string, axb_2 axb_22, String string2, axb_2 axb_23, String string3, axb_2 axb_24, String string4, axb_2 axb_25, String string5, axb_2 axb_26, String string6, axb_2 axb_27) {
        aad_0 aad_02;
        aad_0 aad_03;
        aad_0 aad_04;
        if (string != null && axb_22 != null) {
            this.eeY = new aad_0(string, axb_22);
            this.eeY.qV(1);
            if (axb_22 instanceof fhl_2) {
                this.efc.put(this.eeY, axb_22);
            }
        } else {
            this.eeY = null;
        }
        if (string4 != null && axb_25 != null) {
            this.efa = new aad_0(string4, axb_25);
            this.efa.qV(2);
            if (axb_25 instanceof fhl_2) {
                this.efc.put(this.efa, axb_25);
            }
        } else {
            this.efa = null;
        }
        if (string5 != null && axb_26 != null) {
            this.eeZ = new aad_0(string5, axb_26);
            this.eeZ.qV(3);
            if (axb_26 instanceof fhl_2) {
                this.efc.put(this.eeZ, axb_26);
            }
        } else {
            this.eeZ = null;
        }
        if (string2 != null && axb_23 != null) {
            aad_04 = new aad_0(string2, axb_23);
            aad_04.qV(4);
            if (axb_23 instanceof fhl_2) {
                this.efc.put(aad_04, axb_23);
            }
        } else {
            aad_04 = null;
        }
        if (string3 != null && axb_24 != null) {
            aad_03 = new aad_0(string3, axb_24);
            aad_03.qV(4);
            if (axb_23 instanceof fhl_2) {
                this.efc.put(aad_03, axb_24);
            }
        } else {
            aad_03 = null;
        }
        if (string6 != null && axb_27 != null) {
            aad_02 = new aad_0(string6, axb_27);
            aad_02.qV(5);
            if (axb_27 instanceof fhl_2) {
                this.efc.put(aad_02, axb_27);
            }
        } else {
            aad_02 = null;
        }
        this.efb = new aKv(aad_04, aad_03, aad_02);
        if (!this.efc.isEmpty()) {
            fyw_0.gqw().gqB().a(this);
        }
    }

    public ake_0(String string, float[] fArray, String string2, float[] fArray2, String string3, float[] fArray3, String string4, float[] fArray4, String string5, float[] fArray5, String string6, float[] fArray6) {
        this(string, fArray != null ? new awx_2(fArray) : null, string2, fArray2 != null ? new awx_2(fArray2) : null, string3, fArray3 != null ? new awx_2(fArray3) : null, string4, fArray4 != null ? new awx_2(fArray4) : null, string5, fArray5 != null ? new awx_2(fArray5) : null, string6, fArray6 != null ? new awx_2(fArray6) : null);
    }

    protected void k(bgy bgy2) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 == null) {
            return;
        }
        rh_0 rh_02 = bsj_02.bag();
        boolean bl = this.b(bsj_02);
        this.ciS();
        int n = rh_02.bgm();
        int n2 = rh_02.bgn();
        int n3 = rh_02.getWidth();
        int n4 = n + n3;
        int n5 = n2 + rh_02.getHeight();
        for (int i = n; i < n4; ++i) {
            block6: for (int j = n2; j < n5; ++j) {
                short s;
                if (bl && !rh_02.S(i, j) || !rh_02.T(i, j) || (s = rh_02.Z(i, j)) == Short.MIN_VALUE) continue;
                this.efd.Q(i, j, s);
                switch (this.a(this.efd, bgy2).ordinal()) {
                    case 0: {
                        if (this.eeY == null) continue block6;
                        this.eeY.E(i, j, s);
                        continue block6;
                    }
                    case 3: {
                        if (this.efa == null) continue block6;
                        this.efa.E(i, j, s);
                        continue block6;
                    }
                    case 2: {
                        if (this.eeZ == null) continue block6;
                        this.eeZ.E(i, j, s);
                    }
                }
            }
        }
    }

    private boolean b(bsj_0 bsj_02) {
        eSM eSM2 = bsj_02.fhK();
        if (eSM2 == null) {
            return false;
        }
        return eSM2.cyi() && eSM2.bcS();
    }

    public void b(List<eNl> list, bgy bgy2, acd_1 acd_12) {
        this.efb.a(list, bgy2, acd_12);
    }

    public void L(acd_1 acd_12) {
        this.efb.L(acd_12);
    }

    protected void a(String string, agb_0 agb_02) {
        this.efb.a(string, agb_02);
    }

    public void ciS() {
        this.ciT();
        if (this.eeY != null) {
            this.eeY.bqC();
        }
        if (this.efa != null) {
            this.efa.bqC();
        }
        if (this.eeZ != null) {
            this.eeZ.bqC();
        }
    }

    public void ciT() {
        this.efb.clear();
    }

    public boolean M(acd_1 acd_12) {
        return this.eeY != null && this.eeY.p(acd_12);
    }

    protected abstract akf_0 a(acd_1 var1, bgy var2);

    @Override
    public void ciU() {
        for (Map.Entry<aad_0, axb_2> entry : this.efc.entrySet()) {
            entry.getKey().setColor(entry.getValue());
        }
    }
}

