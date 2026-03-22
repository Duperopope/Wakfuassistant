/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 */
import gnu.trove.map.hash.TByteIntHashMap;

/*
 * Renamed from bhT
 */
final class bht_0
extends eyj_0 {
    private final pd_1 ijB;
    final /* synthetic */ bhJ ijC;

    bht_0(bhJ bhJ2, pd_1 pd_12) {
        this.ijC = bhJ2;
        this.ijB = pd_12;
        this.ijB.DM().a(this);
    }

    @Override
    public void zl() {
    }

    @Override
    public void zm() {
        try {
            if (this.ijC.iiN == null) {
                this.ijC.iiN = new TByteIntHashMap();
            } else {
                this.ijC.iiN.clear();
            }
            if (this.ijC.icA == null) {
                this.ijC.icA = new TByteIntHashMap();
            } else {
                this.ijC.icA.clear();
            }
            for (pg_1 pg_12 : this.ijB.Tb) {
                this.ijC.iiN.put(pg_12.Tg, pg_12.Th);
                this.ijC.icA.put(pg_12.Tg, pg_12.Ti > 0 ? pg_12.Ti : pg_12.Th);
            }
            this.ijC.dlk();
        }
        catch (Exception exception) {
            bhJ.aGj().error((Object)("Exception \u00e0 la deserialisation de l'apparence d'un personnage id=" + this.ijC.Sn()), (Throwable)exception);
        }
    }
}

