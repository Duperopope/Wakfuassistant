/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZj
 */
class bzj_1
extends bzo_1 {
    private static final int lCu = 2800;
    private int lCv;
    private int lBL;

    bzj_1() {
    }

    @Override
    void i(afV afV2) {
        super.i(afV2);
        if (this.lCv > 0) {
            return;
        }
        int n = 2800;
        agf agf2 = afV2.brf();
        abg_1 abg_12 = new abg_1(-15.0f, 15.0f, -15.0f, 15.0f, 0.0f, 36.0f);
        abU abU2 = new abU();
        abU2.rw(2800);
        abU2.a(abg_12);
        abU2.b(agf2);
        float f2 = 2.0f;
        float f3 = 60000.0f;
        float f4 = 100.0f;
        float f5 = 128.0f;
        abU2.i(128.0f, 100.0f, 60000.0f, 2.0f);
        ast_1.bJG().a(abU2);
        this.lCv = abU2.d();
        this.hNy = true;
    }

    private void epL() {
        if (this.lBL != 0) {
            return;
        }
        abW abW2 = new abW(aIz.cgO() + "freeze.cgfx", "freeze");
        aIz.a(abW2, new bzk_1(this, 0.0f));
        this.lBL = abW2.d();
    }

    private void epM() {
        if (this.lBL == 0) {
            return;
        }
        aIz.yD(this.lBL);
        this.lBL = 0;
    }

    @Override
    void bhk() {
        super.bhk();
        if (this.lCv != 0) {
            ass_1 ass_12 = ast_1.bJG().uo(this.lCv);
            if (ass_12 != null) {
                ass_12.bX(false);
                ast_1.bJG().b(ass_12);
                ass_12.clear();
            }
            this.lCv = 0;
        }
        this.epM();
        this.hNy = false;
    }

    @Override
    public void setVisible(boolean bl) {
        abU abU2;
        super.setVisible(bl);
        if (!bl && (abU2 = (abU)ast_1.bJG().uo(this.lCv)) != null) {
            abU2.rB(400);
        }
    }

    @Override
    void b(afV afV2, float f2, float f3) {
        if (!this.hNy) {
            return;
        }
        float f4 = this.lCH.epJ();
        if (f4 == 0.0f) {
            this.bhk();
            return;
        }
        this.epL();
        abU abU2 = (abU)ast_1.bJG().uo(this.lCv);
        if (abU2 != null) {
            int n = (int)(this.bmg && f4 > 0.33f ? 2800.0f * f4 : 0.0f);
            abU2.rA(n);
            float f5 = 0.5235988f * Math.min(1.0f, 0.4f + f3);
            float f6 = 1.5707964f - f5;
            float f7 = 1.5707964f + f5;
            abU2.cf(0.05f * (float)Math.cos(GC.b(f6, f7)));
        }
    }
}

