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
 * Renamed from aws
 */
class aws_1
implements TObjectProcedure<awq_2> {
    final /* synthetic */ awo_2 dlD;

    aws_1(awo_2 awo_22) {
        this.dlD = awo_22;
    }

    public boolean a(awq_2 awq_22) {
        if (!awq_22.bOK()) {
            GlyphVector glyphVector = awq_22.bOJ();
            THashMap tHashMap = (THashMap)this.dlD.dly.get((Object)glyphVector.getFont());
            if (tHashMap != null) {
                tHashMap.remove((Object)awq_22.getValue());
            }
            awq_22.aZp();
        } else {
            awq_22.dk(false);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((awq_2)object);
    }
}

