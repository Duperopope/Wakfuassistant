/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

/*
 * Renamed from bDJ
 */
public class bdj_0
extends cck_2 {
    public static final bdj_0 jLk = new bdj_0();

    @Override
    protected Set<String> dve() {
        return Set.of("chooseItemElementsDialog");
    }

    @Override
    protected String dvf() {
        return "chooseItemElementsWindow";
    }

    @Override
    protected boolean j(KeyEvent keyEvent) {
        Object object;
        if (keyEvent.getKeyCode() == 10 && (object = fse_1.gFu().vY("chooseItemElements")) instanceof bdk_0) {
            dae_0 dae_02 = new dae_0(18278);
            dae_02.D(object);
            aaw_1.bUq().h(dae_02);
            return true;
        }
        return false;
    }
}

