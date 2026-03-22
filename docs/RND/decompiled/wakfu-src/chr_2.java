/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHR
 */
public class chr_2
extends fsr_2<int[]> {
    private final float[] nbq;
    private final float[] nbr;
    private final float[] nbs;
    private final int[] nbt;
    private final int[] nbu;
    private final int[] nbv;
    private final cpu_2 nbw;
    final /* synthetic */ chm_2 nbx;

    public chr_2(chm_2 chm_22, int[] nArray, int[] nArray2, int[] nArray3, float[] fArray, float[] fArray2, float[] fArray3, int[] nArray4, int[] nArray5, chm_2 chm_23, int n, int n2, int n3, abn abn2) {
        this.nbx = chm_22;
        this.bl(nArray);
        this.bm(nArray2);
        this.a(chm_23);
        this.sO(n);
        this.setDuration(n2);
        this.acd(n3);
        this.setEasing(abn2);
        this.nbq = fArray;
        this.nbr = fArray2;
        this.nbs = fArray3;
        this.nbu = nArray4;
        this.nbt = nArray5;
        this.nbv = nArray3;
        this.nbw = chm_22.naP.dII();
        chm_22.nbk = true;
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null) {
            int n2;
            int n3;
            Object object;
            int n4;
            int n5 = this.nbx.getDecorator().getMesh().eKT().getHeight();
            int[] nArray = (int[])this.veb;
            int[] nArray2 = (int[])this.vec;
            int n6 = this.nbx.getDecorator().getMesh().eKT().getWidth();
            int n7 = this.nbx.getAppearance().getContentWidth() - n6;
            float[] fArray = new float[this.nbq.length];
            int[] nArray3 = new int[nArray.length];
            for (n4 = 0; n4 < nArray.length; ++n4) {
                nArray3[n4] = (int)this.tXJ.h(nArray[n4], nArray2[n4], this.bUi, this.bMn);
                fArray[n4] = this.tXJ.h(this.nbq[n4], this.nbr[n4], this.bUi, this.bMn);
            }
            for (n4 = 0; n4 < nArray3.length && n4 < this.nbx.naY.size(); ++n4) {
                fbv_2 fbv_22 = this.nbx.naY.get(n4);
                int n8 = faa_2.tLO.cg(fbv_22.getHeight(), n5) - n5;
                fbv_22.setPosition(faa_2.tLO.cf(fbv_22.getWidth(), n6) + 6 + n7, nArray3[n4] + n8);
            }
            n4 = this.nbx.getDecorator().getMesh().eKT().getHeight();
            for (fcv_1 fcv_12 : this.nbx.naW) {
                object = ((cpu_2)fcv_12.getItemValue()).dlN();
                int n9 = object != null ? object.dHA() : 1;
                n3 = object != null ? object.dHz() : 0;
                n2 = 0;
                for (int n10 : this.nbt) {
                    if (n10 == n9) break;
                    ++n2;
                }
                int n11 = faa_2.tLO.cg(fcv_12.getHeight(), n4);
                int n12 = nArray3.length == 0 ? 0 : (n2 == nArray3.length ? nArray3[nArray3.length - 1] - n4 + n11 : nArray3[n2] - n4 + n11);
                int n13 = 0;
                if (n2 + 1 < nArray3.length) {
                    int n10;
                    n10 = nArray3[n2 + 1] - nArray3[n2] - (int)((float)n4 * 0.5f);
                    n13 = (int)((float)n3 / (float)this.nbx.nbj * (float)n10);
                }
                fcv_12.setPosition(12 + n7, n12 + n13);
            }
            int n14 = this.nbx.naW.size();
            for (int i = 0; i < n14; ++i) {
                object = this.nbx.naW.get(i);
                fcv_1 fcv_13 = this.nbx.naX.get(i);
                n3 = ((fes_2)object).getX() - ((fes_2)object).getWidth();
                n2 = ((fes_2)object).getY();
                n3 = chm_2.getAdjustedX(fcv_13, n3, n2, i, this.nbx.naX, this.nbw);
                fcv_13.setPosition(n3, n2);
                if (fcv_13.getItemValue() != this.nbw) continue;
                this.nbx.naZ.setPosition(n3 - this.nbx.naZ.getWidth(), n2);
            }
            this.nbx.getDecorator().setPixelSeparations(nArray3, this.nbt, fArray);
        }
        return true;
    }

    @Override
    public void cbz() {
        int n;
        int n2;
        Object object;
        int n3;
        int[] nArray = this.nbv;
        int n4 = this.nbx.getDecorator().getMesh().eKT().getHeight();
        int n5 = this.nbx.getDecorator().getMesh().eKT().getWidth();
        int n6 = this.nbx.getAppearance().getContentWidth() - n5;
        this.nbx.getDecorator().setPixelSeparations(nArray, this.nbu, this.nbs);
        for (n3 = 0; n3 < nArray.length && n3 < this.nbx.naY.size(); ++n3) {
            fbv_2 fbv_22 = this.nbx.naY.get(n3);
            int n7 = faa_2.tLO.cg(fbv_22.getHeight(), n4) - n4;
            fbv_22.setPosition(faa_2.tLO.cf(fbv_22.getWidth(), n5) + 6 + n6, nArray[n3] + n7);
        }
        n3 = this.nbx.getDecorator().getMesh().eKT().getHeight();
        for (fcv_1 fcv_12 : this.nbx.naW) {
            object = ((cpu_2)fcv_12.getItemValue()).dlN();
            int n8 = object != null ? object.dHA() : 1;
            n2 = object != null ? object.dHz() : 0;
            n = faa_2.tLO.cg(fcv_12.getHeight(), n3);
            int n9 = 0;
            for (int n10 : this.nbu) {
                if (n10 == n8) break;
                ++n9;
            }
            int n11 = -n3 + n;
            if (n9 < nArray.length) {
                n11 += nArray[n9];
            }
            int n12 = 0;
            if (n9 + 1 < nArray.length) {
                int n13 = nArray[n9 + 1] - nArray[n9] - (int)((float)n3 * 0.5f);
                n12 = (int)((float)n2 / (float)this.nbx.nbj * (float)n13);
            }
            fcv_12.setPosition(12 + n6, n11 + n12);
        }
        int n14 = this.nbx.naW.size();
        for (int i = 0; i < n14; ++i) {
            object = this.nbx.naW.get(i);
            fcv_1 fcv_13 = this.nbx.naX.get(i);
            n2 = ((fes_2)object).getX() - ((fes_2)object).getWidth();
            n = ((fes_2)object).getY();
            n2 = chm_2.getAdjustedX(fcv_13, n2, n, i, this.nbx.naX, this.nbw);
            fcv_13.setPosition(n2, n);
            if (fcv_13.getItemValue() != this.nbw) continue;
            this.nbx.naZ.setPosition(n2 - this.nbx.naZ.getWidth(), n);
        }
        this.nbx.eKK();
        this.nbx.nbk = false;
        super.cbz();
    }
}

