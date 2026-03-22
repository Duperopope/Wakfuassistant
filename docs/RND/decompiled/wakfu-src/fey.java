/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;

public class fey {
    private final EnumMap<fez_0, fff> seo = new EnumMap(fez_0.class);

    public void b(fez_0 fez_02) {
        if (this.seo.containsKey((Object)fez_02)) {
            throw new ffp("Un inventaire de type " + String.valueOf((Object)fez_02) + " est d\u00e9j\u00e0 pr\u00e9sent");
        }
        this.seo.put(fez_02, fez_02.fUz());
    }

    public <T extends fff> T a(fez_0 fez_02) {
        fff fff2 = this.seo.get((Object)fez_02);
        if (fff2 == null) {
            throw new ffp("inventaire de type " + String.valueOf((Object)fez_02) + "inconnu");
        }
        return (T)fff2;
    }

    public void a(uw_2 uw_22) {
        fec_0 fec_02 = (fec_0)this.seo.get((Object)fez_0.sep);
        fee_0 fee_02 = new fee_0(fec_02, uw_22.aey, fgD.fXh());
        fee_02.fUE();
    }

    public void b(uw_2 uw_22) {
        fec_0 fec_02 = (fec_0)this.seo.get((Object)fez_0.sep);
        fee_0 fee_02 = new fee_0(fec_02, uw_22.aey, fgD.fXh());
        fec_02.mV(true);
        fee_02.fUF();
        fec_02.mV(false);
    }

    public void clear() {
        fec_0 fec_02 = (fec_0)this.seo.get((Object)fez_0.sep);
        fec_02.clear();
        feh_0 feh_02 = (feh_0)this.seo.get((Object)fez_0.seq);
        feh_02.clear();
    }

    public String toString() {
        return "InventoryHandler{m_inventories=" + this.seo.size() + "}";
    }
}

