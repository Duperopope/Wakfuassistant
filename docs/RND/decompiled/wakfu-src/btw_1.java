/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.OptionalInt;

/*
 * Renamed from bTw
 */
public class btw_1
implements abz_1 {
    public static final btw_1 loA = new btw_1();

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (ccg_2.eJI().gBt() != null) {
            return false;
        }
        if (fiq_2.gCw().gCx()) {
            return false;
        }
        if (keyEvent.getKeyCode() != 10) {
            return false;
        }
        OptionalInt optionalInt = crm_2.eMO().eMT();
        optionalInt.ifPresent(n -> {
            dae_0 dae_02 = new dae_0(17198);
            dae_02.sY(n);
            aaw_1.bUq().h(dae_02);
        });
        return optionalInt.isPresent();
    }
}

