/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from bwb
 */
public class bwb_0
implements fcM<bhJ> {
    public static final bwb_0 jwj = new bwb_0();

    private bwb_0() {
    }

    public void ak(bhJ bhJ2) {
    }

    public void al(bhJ bhJ2) {
        if (!fcI.fSM()) {
            return;
        }
        bwb_0.dLo();
        cyv_2.eXZ().eYa();
        cts_1.m(bwa_0.jwi.aj(bhJ2));
        bey_0.dTc().Q(bhJ2);
    }

    public void am(bhJ bhJ2) {
        if (!fcI.fSM()) {
            return;
        }
        if (bhJ2 instanceof bgt_0) {
            bgt_0 bgt_02 = (bgt_0)bhJ2;
            bgt_02.dlG().edw();
            cus_2.eRQ().ai(bgt_02);
        }
        bwb_0.dLo();
        long l = bhJ2.Sn();
        cts_1.ol(l);
        cvo_2.eUK().oB(l);
        cyv_2.eXZ().oB(l);
        bey_0.dTc().R(bhJ2);
    }

    public void an(bhJ bhJ2) {
    }

    public static void dLo() {
        bgt_0 bgt_03 = bvz_0.dLl();
        if (bgt_03 == null) {
            fse_1.gFu().f("heroesParty", Collections.emptyList());
            fse_1.gFu().f("heroesPartyIsFull", false);
            fse_1.gFu().f("companionPartyListFull", false);
            return;
        }
        long l = bgt_03.Xi();
        ArrayList<bhJ> arrayList = new ArrayList<bhJ>();
        TLongHashSet tLongHashSet = fcL.rUh.sx(l);
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            bgt_0 bgt_04 = (bgt_0)fcL.rUh.sw(tLongIterator.next());
            arrayList.add(bgt_04);
        }
        arrayList.sort(new bwc_0());
        ctu_2.nJd.ePN();
        fse_1.gFu().f("heroesParty", arrayList);
        fse_1.gFu().f("heroesPartyIsFull", !bvz_0.bS((byte)0));
        fse_1.gFu().f("companionPartyListFull", !bvz_0.bS((byte)5));
        arrayList.forEach(bgt_02 -> fse_1.gFu().a((aef_2)bgt_02.dno(), "transferableCharacters"));
    }

    @Override
    public /* synthetic */ void L(exP exP2) {
        this.an((bhJ)exP2);
    }

    @Override
    public /* synthetic */ void M(exP exP2) {
        this.am((bhJ)exP2);
    }

    @Override
    public /* synthetic */ void N(exP exP2) {
        this.al((bhJ)exP2);
    }

    @Override
    public /* synthetic */ void O(exP exP2) {
        this.ak((bhJ)exP2);
    }
}

