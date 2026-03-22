/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

class cAV {
    private final ArrayList<aix_2> mpR = new ArrayList();
    private int mpS;
    private final ArrayList<aix_2> mpT = new ArrayList();
    private int mpU;

    cAV() {
    }

    public void a(aix_2 aix_22, byte by) {
        switch (by) {
            case 0: {
                this.mpR.add(aix_22);
                this.mpS = this.mpR.size();
                break;
            }
            case 1: {
                this.mpT.add(aix_22);
                this.mpU = this.mpT.size();
            }
        }
    }

    public aix_2 dS(byte by) {
        switch (by) {
            case 0: {
                if (this.mpR.size() == 0) {
                    return null;
                }
                if (this.mpS == this.mpR.size()) {
                    this.R(this.mpR);
                    this.mpS = 0;
                }
                aix_2 aix_22 = this.mpR.get(this.mpS);
                ++this.mpS;
                return aix_22;
            }
            case 1: {
                if (this.mpT.size() == 0) {
                    return null;
                }
                if (this.mpU == this.mpT.size()) {
                    this.R(this.mpT);
                    this.mpU = 0;
                }
                aix_2 aix_23 = this.mpT.get(this.mpU);
                ++this.mpU;
                return aix_23;
            }
        }
        return null;
    }

    private void R(ArrayList<aix_2> arrayList) {
        Collections.shuffle(arrayList, GC.aNL());
    }
}

