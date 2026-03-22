/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

public class bma
extends cck_2 {
    public static final bma iyq = new bma();

    @Override
    protected Set<String> dve() {
        return Set.of("cosmeticPresetsDialog", "cosmeticPresetEditionDialog");
    }

    @Override
    protected String dvf() {
        return "cosmeticPresetsWindow";
    }

    @Override
    protected boolean j(KeyEvent keyEvent) {
        boolean bl = this.g(keyEvent);
        boolean bl2 = this.h(keyEvent);
        boolean bl3 = this.i(keyEvent);
        if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 90) {
            aaw_1.bUq().h(new dae_0(18720));
        } else if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 89) {
            aaw_1.bUq().h(new dae_0(17956));
        }
        return false;
    }
}

