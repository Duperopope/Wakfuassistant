/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectFloatHashMap
 *  gnu.trove.procedure.TObjectFloatProcedure
 */
import gnu.trove.map.hash.TObjectFloatHashMap;
import gnu.trove.procedure.TObjectFloatProcedure;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from bYZ
 */
public class byz_2
implements bzs_1 {
    private float lBz = 0.0f;
    private final TObjectFloatHashMap<fsc> lBA = new TObjectFloatHashMap();
    private boolean aJj = true;
    private boolean lBB;
    private float lBC;
    private float lBD;
    private float lBE;

    @Override
    public void iK(boolean bl) {
        this.lBB = bl;
    }

    @Override
    public void eJ(float f2) {
        this.lBC = f2;
    }

    @Override
    public void eK(float f2) {
        this.lBD = f2;
    }

    @Override
    public void eL(float f2) {
        this.lBE = f2;
    }

    @Override
    public void az(boolean bl) {
        this.aJj = bl;
    }

    @Override
    public void eM(float f2) {
        this.lBz = f2;
    }

    @Override
    public void a(fsc fsc2, float f2) {
        this.lBA.put((Object)fsc2, f2);
    }

    @Override
    public void a(long l, bzb_2 bzb_22, bzb_2 bzb_23, bzo_1 bzo_12, HashMap<fsc, bzo_1> hashMap) {
        if (this.aJj) {
            bzb_22.cG(this.lBz);
            bzb_23.cG(1.0f);
            afV afV2 = aht_0.bBe().bBf();
            if (bzb_22.epJ() > 0.0f && !bzo_12.bhl()) {
                bzo_12.i(afV2);
            }
            this.lBA.forEachEntry((TObjectFloatProcedure)new bza_2(this, hashMap));
            for (bzo_1 bzo_13 : hashMap.values()) {
                if (!(bzo_13 instanceof bzg_1)) continue;
                bzg_1 bzg_12 = (bzg_1)bzo_13;
                byx_2 byx_22 = bzg_12.epP();
                if (this.lBB) {
                    if (!(byx_22 instanceof byy_2)) {
                        bzg_12.a(new byy_2());
                    }
                    byy_2 byy_22 = (byy_2)bzg_12.epP();
                    byy_22.eI(this.lBC);
                    byy_22.setScale(this.lBD);
                    byy_22.cd(this.lBE);
                    continue;
                }
                if (byx_22 instanceof bzi_1) continue;
                bzg_12.a(new bzi_1());
            }
        } else {
            float f2 = 0.0f;
            bzb_22.cG(0.0f);
            bzb_22.cG(0.0f);
            afV afV3 = aht_0.bBe().bBf();
            if (bzb_22.epJ() > 0.0f && !bzo_12.bhl()) {
                bzo_12.i(afV3);
            }
            for (Map.Entry<fsc, bzo_1> entry : hashMap.entrySet()) {
                bzo_1 bzo_14 = entry.getValue();
                if (bzo_14 == null) continue;
                bzo_14.bK(0.0f);
            }
        }
    }
}

