/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TFloatArrayList
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TFloatArrayList;
import gnu.trove.list.array.TIntArrayList;
import java.util.Arrays;

/*
 * Renamed from cHT
 */
public class cht_2
extends frs_1 {
    final /* synthetic */ chm_2 nbz;

    public cht_2(chm_2 chm_22) {
        this.nbz = chm_22;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        return this.getContentPreferedSize(faw_22);
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.nbz.eKL();
        fsm_12.setHeight(fsm_12.height + this.nbz.naU.size() * 40);
        return fsm_12;
    }

    @Override
    public void a(faw_2 faw_22) {
        if (this.nbz.nbk) {
            return;
        }
        fsm_1 fsm_12 = this.nbz.eKL();
        int n = faw_22.getAppearance().getContentHeight() - fsm_12.height;
        int n2 = faw_22.getAppearance().getContentWidth();
        if (this.nbz.nbf != null && this.nbz.nbf.length != 0) {
            int n3 = this.nbz.nbf.length;
            int[] nArray = new int[n3];
            cid_1 cid_12 = this.nbz.getDecorator().getMesh();
            int n4 = (int)Math.floor((float)n / (float)this.nbz.naU.size());
            int n5 = cid_12.eKQ().getHeight();
            for (int i = 0; i < this.nbz.nbf.length; ++i) {
                n5 += cid_12.eKT().getHeight();
                if (i != 0) {
                    n5 += this.nbz.nbi[i - 1] * n4;
                }
                nArray[i] = n5;
            }
            int[] nArray2 = this.nbz.getDecorator().getPixelSeparations();
            int[] nArray3 = new int[nArray2.length];
            TIntArrayList tIntArrayList = new TIntArrayList();
            TIntArrayList tIntArrayList2 = new TIntArrayList();
            TIntArrayList tIntArrayList3 = new TIntArrayList();
            TFloatArrayList tFloatArrayList = new TFloatArrayList();
            TFloatArrayList tFloatArrayList2 = new TFloatArrayList();
            float[] fArray = new float[nArray2.length];
            float[] fArray2 = new float[nArray2.length];
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = this.nbz.getAppearance().getContentHeight() + cid_12.eKT().getHeight();
            while (n7 < this.nbz.nbg.length || n6 < this.nbz.nbf.length) {
                int n10;
                int n11 = this.nbz.nbg.length > n7 && n7 >= 0 ? this.nbz.nbg[n7] : 0;
                int n12 = n10 = this.nbz.nbf.length > n6 && n6 >= 0 ? this.nbz.nbf[n6] : 0;
                if (n6 >= this.nbz.nbf.length || n7 < this.nbz.nbg.length && n11 < n10) {
                    if (nArray2.length <= n7) {
                        ++n7;
                        continue;
                    }
                    tIntArrayList.add(n11);
                    tIntArrayList2.add(nArray2[n7]);
                    tIntArrayList3.add(n8);
                    tFloatArrayList.add(1.0f);
                    tFloatArrayList2.add(0.0f);
                    ++n7;
                    continue;
                }
                if (n7 >= this.nbz.nbg.length || n6 < this.nbz.nbf.length && n11 > n10) {
                    if (nArray.length <= n6) {
                        ++n6;
                        continue;
                    }
                    n8 = nArray[n6];
                    tIntArrayList.add(n10);
                    tIntArrayList2.add(nArray[n6]);
                    tIntArrayList3.add(nArray[n6]);
                    tFloatArrayList.add(0.0f);
                    tFloatArrayList2.add(1.0f);
                    ++n6;
                    continue;
                }
                if (nArray2.length <= n7 || nArray.length <= n6) {
                    ++n6;
                    ++n7;
                    continue;
                }
                tIntArrayList.add(n10);
                tIntArrayList2.add(nArray2[n7]);
                tIntArrayList3.add(nArray[n6]);
                tFloatArrayList.add(1.0f);
                tFloatArrayList2.add(1.0f);
                n8 = nArray[n6];
                ++n7;
                ++n6;
            }
            nArray2 = tIntArrayList2.toArray();
            nArray3 = tIntArrayList3.toArray();
            fArray = tFloatArrayList.toArray();
            fArray2 = tFloatArrayList2.toArray();
            for (fcv_1 fcv_12 : this.nbz.naW) {
                fcv_12.setSizeToPrefSize();
            }
            for (fcv_1 fcv_13 : this.nbz.naX) {
                fcv_13.setSizeToPrefSize();
            }
            for (int i = 0; i < this.nbz.nbf.length; ++i) {
                fbv_2 fbv_22 = this.nbz.naY.get(i);
                fbv_22.setText(String.valueOf(this.nbz.nbf[i] + 1));
                fbv_22.setSizeToPrefSize();
            }
            this.nbz.naZ.setSizeToPrefSize();
            float[] fArray3 = new float[nArray.length];
            Arrays.fill(fArray3, 1.0f);
            this.nbz.x(chr_2.class);
            chr_2 chr_22 = new chr_2(this.nbz, nArray2, nArray3, nArray, fArray, fArray2, fArray3, this.nbz.nbf, tIntArrayList.toArray(), this.nbz, 0, 300, 1, abn.cdr);
            this.nbz.a(chr_22);
        }
    }
}

