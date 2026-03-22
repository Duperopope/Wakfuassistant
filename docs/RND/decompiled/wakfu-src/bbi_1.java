/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;

/*
 * Renamed from bBI
 */
class bbi_1 {
    private final TShortObjectHashMap<Anm> jGv = new TShortObjectHashMap(bdl_1.values().length);
    private final ZC jGw;

    bbi_1(ZC zC) {
        this.jGw = zC;
    }

    public void bg(short s) {
        bdl_1 bdl_12 = bdl_1.bi(s);
        if (bdl_12 == null) {
            return;
        }
        Anm anm = (Anm)this.jGv.remove(s);
        if (anm != null) {
            this.a(bdl_12, anm);
        }
    }

    private void a(bdl_1 bdl_12, Anm anm) {
        this.jGw.b(anm, bdl_12.hKP);
    }

    public void a(int n, short s, boolean bl) {
        bdl_1 bdl_12 = bdl_1.bi(s);
        if (bdl_12 == null) {
            return;
        }
        this.bg(s);
        if (!bl) {
            return;
        }
        try {
            String string = auc_0.cVq().bS("ANMEquipmentPath");
            Anm anm = ZC.dR(String.format(string, n));
            this.jGw.a(anm, bdl_12.hKP);
            this.jGv.put(s, (Object)anm);
        }
        catch (Exception exception) {
            bbh_1.aGj().error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    public void a(fhc_0 fhc_02, short s, byte by) {
        int n = by == 0 ? fhc_02.aVt() : fhc_02.cpf();
        this.a(n, s, fhc_02.dGh().cpY());
    }

    public void dcL() {
        TShortObjectIterator tShortObjectIterator = this.jGv.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            bdl_1 bdl_12 = bdl_1.bi(tShortObjectIterator.key());
            this.a(bdl_12, (Anm)tShortObjectIterator.value());
        }
        this.jGv.clear();
    }
}

