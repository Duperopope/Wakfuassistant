/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bZI
 */
class bzi_2
implements TObjectProcedure<ni_1> {
    final /* synthetic */ acd_1 lDO;
    final /* synthetic */ int lDP;
    final /* synthetic */ int lDQ;
    final /* synthetic */ short lDR;
    final /* synthetic */ bgt_0 lDS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bzi_2(bze_2 bze_22, acd_1 acd_12, int n, int n2, short s, bgt_0 bgt_02) {
        this.lDO = acd_12;
        this.lDP = n;
        this.lDQ = n2;
        this.lDR = s;
        this.lDS = bgt_02;
    }

    public boolean b(ni_1 ni_12) {
        this.lDO.Q(this.lDP, this.lDQ, this.lDR);
        if ((ni_12 instanceof bbe_2 || ni_12 instanceof byr_1) && ni_12.bcC() == this.lDP && ni_12.bcD() == this.lDQ && ni_12.bcE() <= this.lDR && ni_12.bcE() + 6 > this.lDR) {
            ni_12.a(rw_0.bkO, this.lDS);
        } else if (ni_12 instanceof bCF) {
            bCF bCF2 = (bCF)ni_12;
            boolean bl = bCF2.h(this.lDO);
            boolean bl2 = bCF2.dQC();
            if (bl && !bl2) {
                ni_12.a(rw_0.bkS, this.lDS);
            } else if (!bl && bl2) {
                ni_12.a(rw_0.bkT, this.lDS);
            } else if (bl && bl2) {
                ni_12.a(rw_0.bkO, this.lDS);
            }
        } else if (ni_12.h(this.lDO)) {
            ni_12.a(ni_12.bdZ(), this.lDS);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ni_1)object);
    }
}

