/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRB
 */
public class crb_1 {
    public static final crb_1 nmn = new crb_1();
    private cpk_1 nmo = null;

    private crb_1() {
    }

    public boolean bhl() {
        return this.nmo != null;
    }

    public void a(aIs aIs2, int n, int n2) {
        if (this.nmo != null) {
            this.nmo.a(aIs2, n, n2);
        }
    }

    public void b(aIs aIs2, int n, int n2) {
        if (this.nmo != null) {
            this.nmo.b(aIs2, n, n2);
            this.nmo = null;
        }
    }

    public void a(fzo_0 fzo_02, fzo_0 fzo_03, cry_1 cry_12) {
        this.nmo = new cpk_1(fzo_02, fzo_03, cry_12);
        this.nmo.start();
    }

    public void bhk() {
        if (this.nmo != null) {
            this.nmo.bhk();
            this.nmo = null;
        }
    }
}

