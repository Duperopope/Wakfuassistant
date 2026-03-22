/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from cXn
 */
class cxn_2
implements abz_1 {
    private final aUl nVb;
    private boolean nVc = false;
    final /* synthetic */ cxh_2 nVd;

    public cxn_2(cxh_2 cxh_22, aUl aUl2) {
        this.nVd = cxh_22;
        this.nVb = aUl2;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        int n2 = keyEvent.getKeyCode();
        if (this.nVc) {
            return true;
        }
        if (this.nVb.cUA() == n2 && this.nVb.cUE() == keyEvent.getModifiersEx() || keyEvent.getKeyCode() == 27) {
            this.nVd.eWI();
            return true;
        }
        if (n2 != 18 && n2 != 16 && n2 != 17) {
            amc_1 amc_12;
            this.nVc = true;
            long l = amb_1.f(keyEvent);
            if (aUn.cUM().it(l)) {
                fiq_2.gCw().d(fik_2.gBZ().l("notification.reservedKey", new Object[0]).abQ(1));
                this.nVd.eWI();
                return true;
            }
            aUl aUl2 = aUn.cUM().iv(l);
            amc_1 amc_13 = amc_12 = aUl2 == null ? null : aUl2.cUD();
            if (amc_12 != null) {
                fiq_2.gCw().d(fik_2.gBY().l("question.swapShortcutsKey", new Object[0]).abQ(1).a((int n, String string) -> {
                    if (n == 400) {
                        this.nVd.f(amc_12);
                        this.nVd.f(this.nVb.cUD());
                        this.nVd.a(amc_12.getId(), this.nVb.cUA(), this.nVb.cUB(), this.nVb.cUC(), this.nVb.cUE());
                        this.nVd.a(this.nVb.getId(), keyEvent.getKeyCode(), keyEvent.getExtendedKeyCode(), String.valueOf(keyEvent.getKeyChar()), keyEvent.getModifiersEx());
                        aUn.cUM().cUN();
                        this.nVd.eWI();
                    } else {
                        this.nVc = false;
                    }
                }));
            } else {
                this.nVd.f(this.nVb.cUD());
                this.nVd.a(this.nVb.getId(), keyEvent.getKeyCode(), keyEvent.getExtendedKeyCode(), String.valueOf(keyEvent.getKeyChar()), keyEvent.getModifiersEx());
                aUn.cUM().cUN();
                this.nVd.eWI();
            }
        }
        return true;
    }
}

