/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

/*
 * Renamed from bou
 */
public class bou_1
extends cck_2 {
    public static final bou_1 iPC = new bou_1();

    private bou_1() {
    }

    @Override
    protected Set<String> dve() {
        return Set.of("enchantmentDialog");
    }

    @Override
    protected String dvf() {
        return "enchantmentWindow";
    }

    @Override
    protected boolean j(KeyEvent keyEvent) {
        boolean bl = this.g(keyEvent);
        boolean bl2 = this.h(keyEvent);
        boolean bl3 = this.i(keyEvent);
        if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 90) {
            aaw_1.bUq().h(new dae_0(18065));
        }
        return false;
    }
}

