/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fAg
 */
public class fag_2
extends frs_1
implements fai_1 {
    final /* synthetic */ fab_1 tNz;

    public fag_2(fab_1 fab_12) {
        this.tNz = fab_12;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        if (this.tNz.tMm) {
            fsm_12 = this.tNz.getContentIdealSize(this.tNz.tMn, this.tNz.tMo, this.tNz.tMp, this.tNz.tMq);
        } else {
            int n = 30;
            int n2 = 30;
            int n3 = this.tNz.tMi ? this.tNz.tMg : 1;
            int n4 = this.tNz.tMi ? 1 : this.tNz.tMg;
            boolean bl = this.tNz.tMl;
            if (this.tNz.tMc != null) {
                n = this.tNz.tMc.width * n3;
                n2 = this.tNz.tMc.height * n4;
                boolean bl2 = bl = this.tNz.tMu != fzi_0.tHc && this.tNz.gH(n, this.tNz.tMc.width) * this.tNz.gG(n2, this.tNz.tMc.height) < (float)this.tNz.aVo();
            }
            if (this.tNz.tMu == fzi_0.tHb || bl) {
                if (this.tNz.tMi) {
                    n2 += this.tNz.tLZ.getMinSize().height;
                } else {
                    n += this.tNz.tLZ.getMinSize().width;
                }
            }
            fsm_12 = new fsm_1(n, n2);
        }
        return fsm_12;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12;
        if (this.tNz.tMm) {
            fsm_12 = this.tNz.getContentIdealSize(this.tNz.tMn, this.tNz.tMo, this.tNz.tMp, this.tNz.tMq);
        } else {
            int n = 30;
            int n2 = 30;
            int n3 = this.tNz.tMi ? this.tNz.tMg : 1;
            int n4 = this.tNz.tMi ? 1 : this.tNz.tMg;
            boolean bl = this.tNz.tMl;
            if (this.tNz.tMc != null) {
                n = this.tNz.tMc.width * n3;
                n2 = this.tNz.tMc.height * n4;
                boolean bl2 = bl = this.tNz.tMu != fzi_0.tHc && this.tNz.gH(n, this.tNz.tMc.width) * this.tNz.gG(n2, this.tNz.tMc.height) < (float)this.tNz.aVo();
            }
            if (this.tNz.tMu == fzi_0.tHb || bl) {
                if (this.tNz.tMi) {
                    n2 += this.tNz.tLZ.getPrefSize().height;
                } else {
                    n += this.tNz.tLZ.getPrefSize().width;
                }
            }
            fsm_12 = new fsm_1(n, n2);
        }
        return fsm_12;
    }

    @Override
    public void ox(boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        if (this.tNz.tMx == null) {
            return;
        }
        this.tNz.tMh = true;
        int n7 = this.tNz.uki.getContentWidth();
        int n8 = this.tNz.uki.getContentHeight();
        ArrayList<Object> arrayList = this.tNz.getItems();
        int n9 = arrayList == null ? 0 : arrayList.size();
        int n10 = 0;
        int n11 = 0;
        if (this.tNz.tMd) {
            if (n9 > 0) {
                if (this.tNz.tMi) {
                    n6 = n7 / n9;
                    n5 = n8;
                } else {
                    n5 = n8 / n9;
                    n6 = n7;
                }
            } else {
                n5 = n8;
                n6 = n7;
            }
        } else {
            n6 = this.tNz.tMc.gGd() != -1.0f ? GC.B((float)n7 * this.tNz.tMc.gGd() / 100.0f) : this.tNz.tMc.width;
            int n12 = n5 = this.tNz.tMc.gGe() != -1.0f ? GC.B((float)n8 * this.tNz.tMc.gGe() / 100.0f) : this.tNz.tMc.height;
        }
        if (n5 == 0 || n6 == 0) {
            return;
        }
        float f2 = this.tNz.gG(n8, n5);
        float f3 = this.tNz.gH(n7, n6);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = this.tNz.tMl;
        switch (this.tNz.tMu) {
            case tHc: {
                this.tNz.tMl = false;
                break;
            }
            case tHb: {
                this.tNz.tMl = true;
                break;
            }
            case tHa: {
                if (this.tNz.tMi && (float)(this.tNz.getPotentialColumnCount(f2) + this.tNz.tMk) > f3 || !this.tNz.tMi && (float)(this.tNz.getPotentialRowCount(f3) + this.tNz.tMk) > f2) {
                    this.tNz.tMl = true;
                    break;
                }
                this.tNz.tMl = false;
                break;
            }
        }
        if (bl4 != this.tNz.tMl) {
            this.tNz.gsm();
            this.tNz.bFM();
            this.tNz.setNeedsToPreProcess();
            this.tNz.setNeedsToMiddleProcess();
            this.tNz.setNeedsToPostProcess();
        }
        if (this.tNz.tMl) {
            this.tNz.tLZ.setVisible(true);
            if (this.tNz.tMi) {
                n4 = this.tNz.tLZ.getPrefSize().height;
                if (bl) {
                    this.tNz.tLZ.setSize(n7, n4);
                }
                n8 -= n4;
                if (!this.tNz.tMj) {
                    if (bl) {
                        this.tNz.tLZ.setY(n11);
                    }
                    n11 += n4;
                } else if (bl) {
                    this.tNz.tLZ.setY(n11 + n8);
                }
                if (bl) {
                    this.tNz.tLZ.setX(n10);
                }
                n5 = this.tNz.tMc.gGe() != -1.0f ? GC.A((float)n8 * this.tNz.tMc.gGe() / 100.0f) : this.tNz.tMc.height;
                f2 = this.tNz.gG(n8, n5);
            } else {
                n4 = this.tNz.tLZ.getPrefSize().width;
                if (bl) {
                    this.tNz.tLZ.setSize(n4, n8);
                }
                n7 -= n4;
                if (!this.tNz.tMj) {
                    if (bl) {
                        this.tNz.tLZ.setX(n10 + n7);
                    }
                } else {
                    if (bl) {
                        this.tNz.tLZ.setX(n10);
                    }
                    n10 += n4;
                }
                if (bl) {
                    this.tNz.tLZ.setY(n11);
                }
                n6 = this.tNz.tMc.gGd() != -1.0f ? GC.A((float)n7 * this.tNz.tMc.gGd() / 100.0f) : this.tNz.tMc.width;
                f3 = this.tNz.gH(n7, n6);
            }
        } else if (bl) {
            this.tNz.tLZ.setVisible(false);
        }
        int n13 = n4 = this.tNz.getItems() == null || this.tNz.getItems().isEmpty() ? 1 : 0;
        if (n4 == 0 && this.tNz.tMi && f2 == 0.0f) {
            f2 = 1.0f;
        } else if (n4 == 0 && !this.tNz.tMi && f3 == 0.0f) {
            f3 = 1.0f;
        }
        float f4 = this.tNz.tMf - (float)GC.B(this.tNz.tMf);
        int n14 = this.tNz.tMi ? (int)((float)n6 * f4) : 0;
        int n15 = !this.tNz.tMi ? (int)((float)n5 * f4) : 0;
        int n16 = n10;
        n11 = this.tNz.tMA == faa_2.tLR ? (int)((float)n11 + (float)n5 * (f2 - 1.0f)) : (this.tNz.tMA == faa_2.tLO && this.tNz.tMi ? (int)((float)n11 + ((float)(n8 - n5) - ((float)n8 - (float)n5 * f2) / 2.0f)) : (n11 += n8 - n5 + n15));
        int n17 = GC.C(f2) + (this.tNz.tMi ? 0 : 1);
        int n18 = GC.C(f3) + (this.tNz.tMi ? 1 : 0);
        int n19 = GC.B(f2);
        int n20 = GC.B(f3);
        int n21 = n3 = this.tNz.tMi ? n17 - 1 + (n18 - 1) * n19 + 1 : (n17 - 1) * n20 + n18 - 1 + 1;
        if (n3 > this.tNz.ncz.size()) {
            this.tNz.ncz.ensureCapacity(n3);
            this.tNz.tMv.ensureCapacity(n3);
            for (n2 = this.tNz.ncz.size(); n2 < n3; ++n2) {
                fcv_1 fcv_12 = this.tNz.gsk();
                this.tNz.k(fcv_12);
            }
        }
        n2 = GC.C(this.tNz.tMb) + (this.tNz.tMi ? 0 : 1);
        int n22 = GC.C(this.tNz.tMa) + (this.tNz.tMi ? 1 : 0);
        if (n22 > n18 || n2 > n17) {
            for (n = this.tNz.ncz.size() - 1; n >= 0 && n >= n18 * n17; --n) {
                fcv_1 fcv_13 = this.tNz.ncz.remove(n);
                if (fcv_13 == this.tNz.tMw) {
                    this.tNz.tMw = null;
                }
                this.tNz.m((fhv_1)fcv_13);
            }
        }
        for (n = 0; n < n17; ++n) {
            n10 = this.tNz.tMA == faa_2.tLP ? n16 + n7 - (int)((float)n6 * f3) : (this.tNz.tMA == faa_2.tLO ? n16 + (n7 - (int)((float)n6 * f3)) / 2 : n16 - n14);
            for (int i = 0; i < n18; ++i) {
                int n23 = this.tNz.tMi ? n + i * n19 : n * n20 + i;
                fcv_1 fcv_14 = this.tNz.ncz.get(n23);
                if (fcv_14 != null) {
                    fcv_14.setSize(n6, n5);
                    this.tNz.tMv.get(n23).setLocation(n10, n11);
                    fcv_14.setPosition(n10, n11, !this.tNz.ukT);
                }
                n10 += n6 + 0;
            }
            n11 -= n5 + 0;
        }
        this.tNz.tMa = f3;
        this.tNz.tMb = f2;
        if (bl && this.tNz.tMl) {
            this.tNz.gsi();
        }
        this.tNz.tMh = false;
        float f5 = this.tNz.tMf;
        this.tNz.gsl();
        if ((double)Math.abs(f5 - this.tNz.tMf) > 1.0E-4) {
            this.tNz.setOffset(this.tNz.tMf);
        }
        this.tNz.tME |= bl;
        this.setNeedsToPostProcess();
    }

    @Override
    public void a(faw_2 faw_22) {
        this.ox(true);
    }
}

