/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

/*
 * Renamed from bEd
 */
public class bed_0
extends cck_2 {
    public static final bed_0 jMi = new bed_0();

    @Override
    protected Set<String> dve() {
        return Set.of();
    }

    @Override
    protected String dvf() {
        return "equipInventWindow";
    }

    @Override
    protected boolean dRR() {
        String string = ccg_2.eJI().gBt();
        if (string == null) {
            return false;
        }
        if (!string.equals("inventoryDialog") && !string.startsWith("inventoryOnlyDialog")) {
            return false;
        }
        return fhw_2.gAL().gAM() == null;
    }

    @Override
    protected boolean j(KeyEvent keyEvent) {
        boolean bl = this.g(keyEvent);
        boolean bl2 = this.h(keyEvent);
        boolean bl3 = this.i(keyEvent);
        if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 65) {
            fhv_1 fhv_12 = fyw_0.gqw().th(ccg_2.eJI().gBt());
            bgx_1 bgx_12 = (bgx_1)fse_1.gFu().i("inventorySelectionView", fhv_12.getElementMap());
            if (bgx_12 == null) {
                return false;
            }
            vt_0.b(bgx_12::dUA);
            return true;
        }
        return false;
    }
}

