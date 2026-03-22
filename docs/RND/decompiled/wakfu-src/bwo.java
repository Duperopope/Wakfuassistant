/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

public class bwo
extends cck_2 {
    public static final bwo jxJ = new bwo();

    @Override
    protected Set<String> dve() {
        return Set.of("heroBuildDialog");
    }

    @Override
    protected String dvf() {
        return "heroBuildWindow";
    }

    @Override
    protected boolean j(KeyEvent keyEvent) {
        boolean bl = this.g(keyEvent);
        boolean bl2 = this.h(keyEvent);
        boolean bl3 = this.i(keyEvent);
        if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 83) {
            aaw_1.bUq().h(new dae_0(17399));
        } else if (bl && bl2 && !bl3 && keyEvent.getKeyCode() == 83) {
            aaw_1.bUq().h(new dae_0(16963));
        } else if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 90) {
            aaw_1.bUq().h(new dae_0(16496));
        }
        return false;
    }
}

