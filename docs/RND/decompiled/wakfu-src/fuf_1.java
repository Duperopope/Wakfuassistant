/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUf
 */
public class fuf_1 {
    float[][] vig = new float[0][];
    final fua_2 vih = new fua_2();
    int vii;
    int vij;
    int vik;
    int vil;
    int vim;
    int vin;
    long vhC;
    long vio;
    fum_1 vip;
    int viq;
    int vir;
    int vis;
    int vit;

    public fuf_1(fum_1 fum_12) {
        this.vip = fum_12;
        if (fum_12.vjc != 0) {
            this.vih.gHy();
        }
    }

    public void a(fum_1 fum_12) {
        this.vip = fum_12;
    }

    public int gHR() {
        if (this.vip != null && this.vip.vjc != 0) {
            this.vih.gHz();
        }
        return 0;
    }

    public int c(fub_2 fub_22) {
        int n;
        fua_1 fua_12 = this.vip.vjd;
        this.vih.f(fub_22.vhx, fub_22.vhy, fub_22.vhz);
        if (this.vih.acn(1) != 0) {
            return -1;
        }
        int n2 = this.vih.acn(this.vip.vje);
        if (n2 == -1) {
            return -1;
        }
        this.vim = n2;
        this.vij = fua_12.vlg[this.vim].vlu;
        if (this.vij != 0) {
            this.vii = this.vih.acn(1);
            this.vik = this.vih.acn(1);
            if (this.vik == -1) {
                return -1;
            }
        } else {
            this.vii = 0;
            this.vik = 0;
        }
        this.vhC = fub_22.vhC;
        this.vio = fub_22.vhD - 3L;
        this.vin = fub_22.vhB;
        this.vil = fua_12.vkY[this.vij];
        if (this.vig.length < fua_12.vkU) {
            this.vig = new float[fua_12.vkU][];
        }
        for (n = 0; n < fua_12.vkU; ++n) {
            if (this.vig[n] == null || this.vig[n].length < this.vil) {
                this.vig[n] = new float[this.vil];
                continue;
            }
            for (int i = 0; i < this.vil; ++i) {
                this.vig[n][i] = 0.0f;
            }
        }
        n = fua_12.vlh[fua_12.vlg[this.vim].vlx];
        return fux_1.vkJ[n].a(this, this.vip.vjt[this.vim]);
    }
}

