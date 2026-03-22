/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from bIN
 */
public class bin_2
extends biq_1 {
    private final TLongArrayList kig;
    private boolean kih = false;

    public bin_2(int n, TLongArrayList tLongArrayList) {
        super(n, null, null, null);
        this.kig = tLongArrayList;
        this.dYp();
    }

    @Override
    public short dZr() {
        if (!this.kih) {
            bzq_2 bzq_22 = bzp_2.eqt().mA((short)this.Sn());
            this.fR(bzq_22 != null ? bzq_22.lEG : (short)0);
            this.kih = true;
        }
        return super.dZr();
    }

    private static vf_0 a(bzq_2 bzq_22) {
        TLongObjectIterator<bJK> tLongObjectIterator = bzq_22.eqB();
        vf_0 vf_02 = new vf_0();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bJK bJK2 = (bJK)tLongObjectIterator.value();
            vf_02.a(bJK2.eaV());
        }
        return vf_02;
    }

    @Override
    public axb_2 dYq() {
        return awx_2.dnF;
    }

    private void dYp() {
        int n = this.kig.size();
        for (int i = 0; i < n; ++i) {
            long l = this.kig.get(i);
            bzq_2 bzq_22 = bzp_2.eqt().mA(l);
            vf_0 vf_02 = bin_2.a(bzq_22);
            this.a(new bim_2(vf_02, l));
        }
    }

    @Override
    public void a(bip_2 bip_22) {
    }

    @Override
    public boolean dYs() {
        return true;
    }

    @Override
    public boolean dXU() {
        return false;
    }

    @Override
    public void b(bip_2 bip_22) {
    }
}

