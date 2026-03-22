/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.awt.font.GlyphVector;

/*
 * Renamed from awb
 */
class awb_2 {
    final THashMap<String, awa_2> djC = new THashMap();
    final /* synthetic */ avu_2 djD;

    awb_2(avu_2 avu_22) {
        this.djD = avu_22;
    }

    public void gr(String string) {
        awa_2 awa_22 = (awa_2)this.djC.remove((Object)string);
        if (awa_22 != null) {
            awa_22.clear();
        }
    }

    public void bNR() {
        this.djC.forEachValue((TObjectProcedure)new awc_1(this));
        this.djC.clear();
    }

    public awa_2 gs(String string) {
        awa_2 awa_22 = (awa_2)this.djC.get((Object)string);
        if (awa_22 == null) {
            GlyphVector glyphVector = awo_2.dlu.b(string, this.djD.diM, this.djD.bNE());
            awa_22 = new awa_2(this.djD, string, glyphVector, this);
            this.djC.put((Object)awa_22.bNN(), (Object)awa_22);
        }
        return awa_22;
    }
}

