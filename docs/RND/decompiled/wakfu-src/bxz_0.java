/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bxZ
 */
public class bxz_0
extends bcs_0 {
    private bdj_2 jCf;

    @Override
    public void aVH() {
        super.aVH();
        if (this.jCf != null) {
            adn_0.bvh().j(this.jCf);
            this.jCf = null;
        }
    }

    private void dNX() {
        bDo bDo2 = (bDo)((Object)this.crg);
        eIz eIz2 = bDo2.dNV();
        if (this.jCf != null) {
            adn_0.bvh().j(this.jCf);
            this.jCf = null;
        }
        if (eIz2 == null) {
            return;
        }
        byd byd2 = new byd(eIz2);
        byd2.dNZ();
        byd2.a(this.crg.bcB());
        bdj_2 bdj_22 = byd2.ddI();
        bdj_22.a(this.crg.bcB());
        bdj_22.e(((bCA)this.crg).getWorldX(), ((bCA)this.crg).getWorldY(), ((bCA)this.crg).getAltitude());
        bDp bDp2 = bDo2.dNU();
        String string = bDp2.getAnimName();
        TByteIntHashMap tByteIntHashMap = bDp2.dQN();
        bdj_22.dT(string);
        bdj_22.dV(string);
        TByteIntIterator tByteIntIterator = tByteIntHashMap.iterator();
        while (tByteIntIterator.hasNext()) {
            tByteIntIterator.advance();
            bdj_22.a(tByteIntIterator.value(), (short)tByteIntIterator.key(), true);
        }
        bdj_22.bpq().cWQ |= 2;
        this.jCf = bdj_22;
        adn_0.bvh().g(this.jCf);
    }

    @Override
    public void aPc() {
        this.dNX();
    }

    @Override
    public void nU(int n) {
        if (this.crg == null) {
            return;
        }
        bDo bDo2 = (bDo)((Object)this.crg);
        eIz eIz2 = bDo2.dNV();
        if (eIz2 == null) {
            super.nU(n);
            return;
        }
        this.dNX();
    }

    static /* synthetic */ void a(bxz_0 bxz_02, ayv_2 ayv_22) {
        bxz_02.a(ayv_22);
    }

    static /* synthetic */ Logger aGi() {
        return bWl;
    }
}

