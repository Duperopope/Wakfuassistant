/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bFJ
 */
public class bfj_1
extends bfc_1 {
    private static final Logger jTT = Logger.getLogger(bfj_1.class);

    public bfj_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTT.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        boolean bl = false;
        List<erh_0> list = bgt_02.dmz().fHG();
        for (int i = 0; i < list.size(); ++i) {
            erh_0 erh_02 = list.get(i);
            if (erh_02.fGk() != null && !erh_02.fGk().gjI()) continue;
            bl = true;
            break;
        }
        if (!bl) {
            jTT.warn((Object)"Tentative d'utilisation d'un item de reduction de DEAD_STATE sans en avoir");
            return false;
        }
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skx;
    }
}

