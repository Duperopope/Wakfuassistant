/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ffL
 */
public class ffl_0
implements RU<ffV> {
    private static final Logger sgl = Logger.getLogger(ffl_0.class);
    public static final ffl_0 sgm = new ffl_0();

    @Override
    public int a(RS<ffV> rS, ffV ffV2) {
        if (!ffV2.apo()) {
            return -3;
        }
        if (rS.isFull()) {
            if (rS.beX()) {
                if (ffV2.fWa() > 0 && ffV2.fWj()) {
                    ArrayList<ffV> arrayList = rS.pd(ffV2.dOg().d());
                    for (int i = arrayList.size() - 1; i >= 0; --i) {
                        if (arrayList.get(i).LV() == ffV2.LV()) {
                            return -12;
                        }
                        if (!arrayList.get(i).n(ffV2) || arrayList.get(i).bfd() + ffV2.bfd() > ffV2.bfe()) continue;
                        return 1;
                    }
                }
                return -1;
            }
            return -1;
        }
        return 0;
    }

    @Override
    public int a(RS<ffV> rS, ffV ffV2, short s) {
        if (!ffV2.apo()) {
            return -3;
        }
        if (!(rS instanceof RL)) {
            sgl.warn((Object)"Utilisation du BagInventoryChecker sur un inventaire qui ne contient pas un ArrayInventory", (Throwable)new IllegalArgumentException("Utilisation du BagInventoryChecker sur un inventaire qui ne contient pas un ArrayInventory"));
            return this.a(rS, ffV2);
        }
        Object c2 = ((RL)rS).ai(s);
        if (c2 == null) {
            return 0;
        }
        if (!rS.beX()) {
            return -1;
        }
        if (!c2.n(ffV2)) {
            return -1;
        }
        return 1;
    }

    @Override
    public int a(RS rS, ffV ffV2, ffV ffV3) {
        if (!ffV3.apo()) {
            return -3;
        }
        return 0;
    }

    @Override
    public int b(RS rS, ffV ffV2) {
        return 0;
    }

    @Override
    public boolean a(ffV ffV2, qu_0 qu_02, qm_0 qm_02) {
        return true;
    }

    @Override
    public boolean a(RS<ffV> rS, qu_0 qu_02, qm_0 qm_02) {
        return true;
    }
}

