/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cIa
 */
class cia_2
extends fss_2<Object> {
    private final ArrayList<fcv_1> ncz;
    private final int[] ncA;
    private final int[] ncB;
    private final int[] ncC;
    private final int[] ncD;
    final /* synthetic */ chv_2 ncE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cia_2(chv_2 chv_22, ArrayList arrayList, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, abn abn2) {
        this.ncE = chv_22;
        this.sO(250);
        this.setDuration(250);
        this.acd(1);
        this.setEasing(abn2);
        this.ncz = arrayList;
        this.ncA = nArray;
        this.ncB = nArray2;
        this.ncC = nArray3;
        this.ncD = nArray4;
        for (fcv_1 fcv_13 : this.ncz) {
            if (fcv_13.getSize() == null || fcv_13.getPosition() == null) continue;
            chv_22.nbO.compute(fcv_13, (fcv_12, n) -> n + 1);
        }
    }

    @Override
    public boolean Ma(int n) {
        block12: {
            if (!super.Ma(n)) {
                return false;
            }
            if (this.tXJ == null) break block12;
            int n2 = this.ncE.getAppearance().getContentWidth();
            int n3 = this.bMn - 100;
            if (this.bUi < n3) {
                int n4 = this.ncz.size();
                for (int i = 0; i < n4; ++i) {
                    fcv_1 fcv_12 = this.ncz.get(i);
                    if (fcv_12.getSize() == null || fcv_12.getPosition() == null) continue;
                    int n5 = (int)this.tXJ.h(this.ncA[i * 2], this.ncB[i * 2], this.bUi, n3);
                    int n6 = (int)this.tXJ.h(this.ncA[i * 2 + 1], this.ncB[i * 2 + 1], this.bUi, n3);
                    int n7 = (int)this.tXJ.h(this.ncC[i * 2], this.ncD[i * 2], this.bUi, n3);
                    int n8 = (int)this.tXJ.h(this.ncC[i * 2 + 1], this.ncD[i * 2 + 1], this.bUi, n3);
                    fcv_12.setPosition(n5 + n2, n6);
                    fcv_12.setSize(n7, n8);
                }
            } else {
                int n9 = this.bUi - n3;
                int n10 = 0;
                if (n9 < 40) {
                    n10 = (int)this.tXJ.h(0.0f, 10.0f, n9, 40.0f);
                } else if (n9 < 80) {
                    n10 = (int)this.tXJ.h(10.0f, 0.0f, n9 - 40, 40.0f);
                } else if (n9 < 90) {
                    n10 = (int)this.tXJ.h(0.0f, 4.0f, n9 - 80, 10.0f);
                } else if (n9 < 100) {
                    n10 = (int)this.tXJ.h(4.0f, 0.0f, n9 - 90, 10.0f);
                }
                int n11 = this.ncz.size();
                for (int i = 0; i < n11 && i < this.ncB.length * 2; ++i) {
                    fcv_1 fcv_13 = this.ncz.get(i);
                    if (fcv_13.getSize() == null || fcv_13.getPosition() == null) continue;
                    fcv_13.setY(this.ncB[i * 2 + 1] + n10);
                }
            }
        }
        return true;
    }

    @Override
    public void cbz() {
        int n = this.ncE.getAppearance().getContentWidth();
        int n2 = this.ncz.size();
        for (int i = 0; i < n2; ++i) {
            fcv_1 fcv_12 = this.ncz.get(i);
            if (fcv_12.getSize() == null || fcv_12.getPosition() == null) continue;
            if (i >= this.ncB.length * 2) break;
            fcv_12.setPosition(this.ncB[i * 2] + n, this.ncB[i * 2 + 1]);
            fcv_12.setSize(this.ncD[i * 2], this.ncD[i * 2 + 1]);
            int n3 = this.ncE.nbO.get(fcv_12);
            if (n3 == 1) {
                this.ncE.nbO.remove(fcv_12);
                fcv_12.gAD();
                continue;
            }
            this.ncE.nbO.put(fcv_12, n3 - 1);
        }
        if (!this.ncE.nbT.isEmpty()) {
            this.ncE.a(this.ncE.nbT.removeFirst());
        }
        if (!this.ncE.nbU.isEmpty()) {
            this.ncE.a(this.ncE.nbU.removeFirst());
        }
        super.cbz();
    }
}

