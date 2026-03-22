/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRv
 */
public class brv_2
extends fkV {
    public brv_2(fjo_0 fjo_02) {
        super(fjo_02);
        this.c(bsu_2.lgP);
    }

    @Override
    protected void e(int n, int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            this.WS(n);
        }
        azm_1 azm_12 = this.WT(n);
        azm_12.clear();
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            azm_12.vL(nArray[i]);
        }
    }

    @Override
    public void f(int n, int[] nArray) {
        throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
    }

    @Override
    public void g(int n, int[] nArray) {
        throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
    }

    @Override
    public void Jk(int n) {
        throw new UnsupportedOperationException("Le client ne doit pas demander directement des modifs sur les buffs de nation. Il doit passer par le protecteur");
    }

    @Override
    public void h(int n, int[] nArray) {
        this.e(n, nArray);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            bgt_02.li(true);
        }
    }
}

