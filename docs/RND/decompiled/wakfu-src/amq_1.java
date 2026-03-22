/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amq
 */
public class amq_1 {
    private anc_1 cHX;
    private amq_1 cHY;
    private amq_1 cHZ;
    private amq_1 cIa;

    public amq_1(anc_1 anc_12, amq_1 amq_12, amq_1 amq_13) {
        this.cHX = anc_12;
        if (amq_13 != null) {
            amq_13.c(this);
        }
        this.cHZ = amq_13;
        if (amq_12 != null) {
            amq_12.c(this);
        }
        this.cHY = amq_12;
    }

    public amq_1(anc_1 anc_12) {
        this(anc_12, null, null);
    }

    public amq_1() {
        this(null, null, null);
    }

    public boolean aJG() {
        return this.cHX == null;
    }

    public boolean bDe() {
        return this.cIa == null;
    }

    public boolean bDf() {
        return !this.aJG() && this.cHY == null && this.cHZ == null && (this.cHX.bDM() == amr_2.cIh || this.cHX.bDM() == amr_2.cIi || this.cHX.bDM() == amr_2.cIj || this.cHX.bDM() == amr_2.cId);
    }

    public boolean bDg() {
        return !this.aJG() && this.cHX.bDM() == amr_2.cIc;
    }

    public void a(anc_1 anc_12) {
        this.cHX = anc_12;
    }

    public void a(amq_1 amq_12) {
        amq_12.c(this);
        this.cHY = amq_12;
    }

    public void b(amq_1 amq_12) {
        amq_12.c(this);
        this.cHZ = amq_12;
    }

    public void c(amq_1 amq_12) {
        this.cIa = amq_12;
    }

    public anc_1 bDh() {
        return this.cHX;
    }

    public amq_1 bDi() {
        return this.cHZ;
    }

    public amq_1 bDj() {
        return this.cHY;
    }

    public amq_1 bDk() {
        return this.cIa;
    }

    public boolean bDl() {
        if (this.cHY != null && this.cHZ != null) {
            return this.cHY.bDl() || this.cHZ.bDl();
        }
        if (this.cHY != null) {
            return this.cHY.bDl();
        }
        if (this.cHZ != null) {
            return this.cHZ.bDl();
        }
        if (this.cHX != null) {
            return this.cHX.bDl();
        }
        return true;
    }

    public Object c(Object object, Object object2, Object object3, Object object4) {
        if (this.cHX instanceof ans_1) {
            return ((ans_1)this.cHX).b(this.cHY.c(object, object2, object3, object4), this.cHZ.c(object, object2, object3, object4));
        }
        if (this.cHX instanceof ant_2) {
            return this.cHX.getValue();
        }
        if (this.cHX instanceof anr_1) {
            return ((anr_1)this.cHX).E(this.cHZ.c(object, object2, object3, object4));
        }
        if (this.cHX instanceof anq_1) {
            return ((anq_1)this.cHX).c(object, object2, object3, object4);
        }
        throw new aml_1("[Evaluation d'un arbre syntaxique] Evaluation impossible");
    }

    public amq_1 bDm() {
        if (this.cHX instanceof ans_1 && this.cHY != null && this.cHZ != null) {
            if (!this.bDl()) {
                return new amq_1(((ans_1)this.cHX).c(this.cHY.bDm().c(null, null, null, null), this.cHZ.bDm().c(null, null, null, null)));
            }
            return new amq_1(this.cHX, this.cHY.bDm(), this.cHZ.bDm());
        }
        if (this.cHX instanceof ant_2) {
            return this;
        }
        if (this.cHX instanceof anr_1 && this.cHZ != null) {
            if (!this.bDl()) {
                return new amq_1(((anr_1)this.cHX).F(this.cHZ.bDm().c(null, null, null, null)));
            }
            return new amq_1(this.cHX, this.cHY, this.cHZ.bDm());
        }
        if (this.cHX instanceof anq_1 && !this.cHX.bDl()) {
            return new amq_1(((anq_1)this.cHX).bDQ());
        }
        return this;
    }
}

