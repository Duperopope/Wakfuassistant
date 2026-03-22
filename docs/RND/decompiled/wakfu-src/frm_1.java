/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRM
 */
public class frm_1
extends frr_1 {
    public static final String TAG = "SpringLayoutData";
    public static final String vav = "spld";
    private boolean tVv = false;
    private frc_1 vaw;
    private frc_1 vax;
    private frc_1 vay;
    private frc_1 vaz;
    private frc_1 vaA;
    private frc_1 vaB;
    private frc_1 vaC;
    private frc_1 vaD;
    private frl_1 vaE;

    public frm_1() {
    }

    public frm_1(frc_1 frc_12, frc_1 frc_13, frc_1 frc_14, frc_1 frc_15) {
        this.vaw = frc_12;
        this.vax = frc_13;
        this.vay = frc_14;
        this.vaz = frc_15;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof frc_1 && this.isInTree()) {
            frc_1 frc_12 = (frc_1)fhv_12;
            this.a(frc_12.getEdge(), frc_12.getValue(), frc_12.getReferentId(), frc_12.getReferentEdge());
            this.tVv = true;
            this.setNeedsToPreProcess();
        }
        super.d(fhv_12);
    }

    private void gEQ() {
        if (this.vaw != null && this.vaA != null && this.vaC != null) {
            this.vaA = null;
        }
    }

    private void gER() {
        if (this.vax != null && this.vaB != null && this.vaD != null) {
            this.vaB = null;
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public frc_1 getEast() {
        if (this.vay != null) {
            return this.vay;
        }
        if (this.vaC == null) {
            if (this.vaw != null && this.vaA != null) {
                this.vaC = frc_1.a(this.vaw, this.vaA);
            } else {
                return frc_1.acc(0);
            }
        }
        return this.vaC;
    }

    public void setEast(frc_1 frc_12) {
        this.vay = frc_12;
    }

    public frc_1 getNorth() {
        if (this.vaz != null) {
            return this.vaz;
        }
        if (this.vaD == null) {
            if (this.vax != null && this.vaB != null) {
                this.vaD = frc_1.a(this.vax, this.vaB);
            } else {
                return frc_1.acc(0);
            }
        }
        return this.vaD;
    }

    public void setNorth(frc_1 frc_12) {
        this.vaz = frc_12;
    }

    public frc_1 getX() {
        if (this.vaw != null) {
            return this.vaw;
        }
        if (this.vaC == null) {
            if (this.vay != null && this.vaA != null) {
                this.vaC = frc_1.b(this.vay, this.vaA);
            } else {
                return frc_1.acc(0);
            }
        }
        return this.vaC;
    }

    public void setX(frc_1 frc_12) {
        this.vaw = frc_12;
    }

    public frc_1 getY() {
        if (this.vax != null) {
            return this.vax;
        }
        if (this.vaD == null) {
            if (this.vaz != null && this.vaB != null) {
                this.vaD = frc_1.b(this.vaz, this.vaB);
            } else {
                return frc_1.acc(0);
            }
        }
        return this.vaD;
    }

    public void setY(frc_1 frc_12) {
        this.vax = frc_12;
    }

    public frc_1 getWidth() {
        if (this.vaA != null) {
            return this.vaA;
        }
        if (this.vaC == null) {
            if (this.vay != null && this.vaw != null) {
                this.vaC = frc_1.b(this.vay, this.vaw);
            } else {
                return frc_1.acc(0);
            }
        }
        return this.vaC;
    }

    public void setWidth(frc_1 frc_12) {
        this.vaA = frc_12;
        this.gEQ();
    }

    public frc_1 getHeight() {
        if (this.vaB != null) {
            return this.vaB;
        }
        if (this.vaD == null) {
            if (this.vaz != null && this.vax != null) {
                this.vaD = frc_1.b(this.vaz, this.vax);
            } else {
                return frc_1.acc(0);
            }
        }
        return this.vaD;
    }

    public void setHeight(frc_1 frc_12) {
        this.vaB = frc_12;
        this.gER();
    }

    public frl_1 getLayout() {
        return this.vaE;
    }

    public void setLayout(frl_1 frl_12) {
        this.vaE = frl_12;
    }

    public frc_1 getConstraint(String string) {
        if (string.equalsIgnoreCase("North")) {
            return this.getNorth();
        }
        if (string.equalsIgnoreCase("East")) {
            return this.getEast();
        }
        if (string.equalsIgnoreCase("West")) {
            return this.getX();
        }
        if (string.equalsIgnoreCase("South")) {
            return this.getY();
        }
        return null;
    }

    public void a(String string, int n, String string2, String string3) {
        frc_1 frc_12 = frc_1.a(frc_1.acc(n), new frn_1(this.vaE, string2, string3));
        this.a(string, frc_12);
    }

    public void a(String string, int n, fes_2 fes_22, String string2) {
        frc_1 frc_12 = frc_1.a(frc_1.acc(n), new frn_1(this.vaE, fes_22, string2));
        this.a(string, frc_12);
    }

    public void a(String string, frc_1 frc_12) {
        if (string.equalsIgnoreCase("North")) {
            this.setNorth(frc_12);
        } else if (string.equalsIgnoreCase("East")) {
            this.setEast(frc_12);
        } else if (string.equalsIgnoreCase("West")) {
            this.setX(frc_12);
        } else if (string.equalsIgnoreCase("South")) {
            this.setY(frc_12);
        }
    }

    public static frm_1 a(frl_1 frl_12, fes_2 fes_22) {
        frm_1 frm_12 = new frm_1();
        frm_12.setLayout(frl_12);
        frm_12.setX(frc_1.B(fes_22));
        frm_12.setY(frc_1.C(fes_22));
        frm_12.setWidth(frc_1.z(fes_22));
        frm_12.setHeight(frc_1.A(fes_22));
        return frm_12;
    }

    public void gES() {
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frm_1 frm_12 = (frm_1)fhi_22;
        super.a(frm_12);
    }

    @Override
    public void gvr() {
        faw_2 faw_22;
        super.gvr();
        fry_2 fry_22 = null;
        fes_2 fes_22 = this.getParentOfType(fes_2.class);
        if (fes_22 != null && (faw_22 = fes_22.getContainer()) != null) {
            fry_22 = faw_22.getLayoutManager();
        }
        if (fry_22 instanceof frl_1) {
            this.setLayout((frl_1)fry_22);
            if (this.uxL instanceof fes_2) {
                ((frl_1)fry_22).a((fes_2)this.uxL, this);
            }
        }
        int n = this.getChildren().size();
        for (int i = 0; i < n; ++i) {
            fhv_1 fhv_12 = this.getChildren().get(i);
            if (!(fhv_12 instanceof frc_1)) continue;
            frc_1 frc_12 = (frc_1)fhv_12;
            this.a(frc_12.getEdge(), frc_12.getValue(), frc_12.getReferentId(), frc_12.getReferentEdge());
            this.tVv = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tVv) {
            faw_2 faw_22 = this.getParentOfType(faw_2.class);
            faw_22.gsm();
            this.tVv = false;
        }
        return bl;
    }

    public String toString() {
        return "[x=" + String.valueOf(this.getX()) + ", y=" + String.valueOf(this.getY()) + ", width=" + String.valueOf(this.getWidth()) + ", height=" + String.valueOf(this.getHeight()) + "]";
    }
}

