/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cHZ
 */
public class chz_2
extends frs_1 {
    final /* synthetic */ chv_2 ncy;

    public chz_2(chv_2 chv_22) {
        this.ncy = chv_22;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        return this.b(faw_22);
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.b(faw_22);
    }

    private fsm_1 b(faw_2 faw_22) {
        if (this.ncy.naV == null) {
            return new fsm_1();
        }
        int n = 137 + (this.ncy.naV.size() - 1) * 56;
        return new fsm_1(100.0f, n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(faw_2 faw_22) {
        if (!this.ncy.nbQ && !this.ncy.nbR) {
            return;
        }
        Object object = this.ncy.nbX;
        synchronized (object) {
            boolean bl = this.ncy.nbR;
            this.ncy.nbQ = false;
            this.ncy.nbR = false;
            if (this.ncy.naV == null) {
                return;
            }
            int n = faw_22.getAppearance().getContentWidth();
            int n2 = faw_22.getAppearance().getContentHeight();
            if (this.ncy.nbP != null) {
                this.ncy.nbP.setSizeToPrefSize();
                this.ncy.nbP.setPosition(n - this.ncy.nbP.getWidth() - 62, 0);
            }
            int[] nArray = new int[(this.ncy.naV.size() + 1) * 2];
            int[] nArray2 = new int[(this.ncy.naV.size() + 1) * 2];
            int[] nArray3 = new int[(this.ncy.naV.size() + 1) * 2];
            int[] nArray4 = new int[(this.ncy.naV.size() + 1) * 2];
            int n3 = 5;
            boolean bl2 = false;
            chy_2 chy_22 = null;
            int n4 = this.ncy.naV.size() + 1;
            for (int i = 0; i < n4; ++i) {
                fcv_1 fcv_12;
                int n5;
                int n6;
                int n7;
                int n8;
                int n9;
                boolean bl3;
                int n10 = i;
                boolean bl4 = bl3 = i == this.ncy.nbM + 1;
                if (i > this.ncy.nbM + 1) {
                    --n10;
                }
                int n11 = -17;
                int n12 = -17;
                if (i == 0) {
                    n9 = 87;
                    n8 = 400;
                    n7 = 56;
                    n6 = 416;
                    n5 = 70;
                } else {
                    n9 = 87 + i * 56;
                    n6 = 400;
                    n8 = 400;
                    n5 = 56;
                    n7 = 56;
                }
                if (i == n4 - 2 && i == this.ncy.nbM || i == n4 - 1 && !bl3) {
                    n12 = 0;
                    n9 = 0;
                    n8 = 416;
                    n7 = 70;
                }
                if (i == n4 - 1 && bl3) {
                    n12 = -17;
                    n9 = 87;
                    n8 = 400;
                    n7 = 56;
                }
                n11 -= n6;
                if (!bl3) {
                    chw_2 chw_22 = this.ncy.naV.get(n10);
                    fcv_12 = chw_22.getRenderable();
                    fes_2 fes_22 = (fes_2)fcv_12.getChildWithId("timelineContainer");
                    if (fes_22 == null) continue;
                    if (chw_22.dHC().dlN().dHw()) {
                        if (n10 == 0) {
                            fes_22.setPrefSize(this.ncy.nbL);
                            fes_22.setStyle(this.ncy.nbG);
                        } else {
                            fes_22.setPrefSize(this.ncy.nbK);
                            fes_22.setStyle(this.ncy.nbI);
                        }
                    } else if (n10 == 0) {
                        fes_22.setPrefSize(this.ncy.nbL);
                        fes_22.setStyle(this.ncy.nbH);
                    } else {
                        fes_22.setPrefSize(this.ncy.nbK);
                        fes_22.setStyle(this.ncy.nbJ);
                    }
                } else {
                    fcv_12 = this.ncy.nbN.getRenderable();
                }
                nArray3[i * 2] = n11;
                nArray3[i * 2 + 1] = n3;
                nArray4[i * 2] = n6;
                nArray4[i * 2 + 1] = n5;
                boolean bl5 = false;
                if (!bl || fcv_12.getWidth() == 0) {
                    nArray[i * 2] = nArray3[i * 2];
                    nArray[i * 2 + 1] = nArray3[i * 2 + 1];
                    nArray2[i * 2] = nArray4[i * 2];
                    nArray2[i * 2 + 1] = nArray4[i * 2 + 1];
                    fcv_12.setPosition(n + nArray[i * 2], nArray[i * 2 + 1]);
                    fcv_12.setSize(nArray2[i * 2], nArray2[i * 2 + 1]);
                } else {
                    nArray[i * 2] = n12 - n8;
                    nArray[i * 2 + 1] = n9;
                    nArray2[i * 2] = n8;
                    nArray2[i * 2 + 1] = n7;
                    bl5 = true;
                    bl2 = true;
                }
                n3 += n5;
                if (i == 0) {
                    n3 += 7;
                }
                if (!bl5 || !(i == n4 - 2 && i == this.ncy.nbM || i == n4 - 1 && !bl3) && (i != n4 - 1 || !bl3)) continue;
                int n13 = -400;
                int n14 = n9;
                int n15 = -400;
                int n16 = n14;
                int n17 = -400;
                int n18 = n2 - n5;
                int n19 = nArray3[i * 2];
                int n20 = n18;
                int n21 = nArray4[i * 2];
                int n22 = nArray4[i * 2 + 1];
                if (chy_22 == null) {
                    chy_22 = new chy_2(this.ncy, abn.cdr);
                }
                if (bl3) {
                    chy_22.b(fcv_12, -400, n14, -400, n16, -400, n18, n19, n20, n21, n22);
                } else {
                    chy_22.a(fcv_12, -400, n14, -400, n16, -400, n18, n19, n20, n21, n22);
                }
                nArray[i * 2] = -400;
                nArray[i * 2 + 1] = n18;
                nArray2[i * 2] = n21;
                nArray2[i * 2 + 1] = n22;
            }
            if (!bl2) {
                return;
            }
            if (chy_22 != null && chy_22.blc()) {
                if (this.ncy.y(chy_2.class)) {
                    this.ncy.nbT.add(chy_22);
                } else {
                    this.ncy.a(chy_22);
                }
            }
            ArrayList<fcv_1> arrayList = new ArrayList<fcv_1>(this.ncy.naV.size() + 1);
            for (n4 = 0; n4 <= this.ncy.nbM; ++n4) {
                arrayList.add(this.ncy.naV.get(n4).getRenderable());
            }
            arrayList.add(this.ncy.nbN.getRenderable());
            while (n4 < this.ncy.naV.size()) {
                arrayList.add(this.ncy.naV.get(n4).getRenderable());
                ++n4;
            }
            cia_2 cia_22 = new cia_2(this.ncy, arrayList, nArray, nArray3, nArray2, nArray4, abn.cdr);
            if (this.ncy.y(cia_2.class)) {
                this.ncy.nbU.add(cia_22);
            } else {
                this.ncy.a(cia_22);
            }
        }
    }
}

