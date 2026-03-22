/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buy
 */
public class buy_0
implements aeh_2,
buz_0 {
    @Override
    public String[] bxk() {
        return jpM;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("iconUrl")) {
            return auc_0.cVq().zz(47212409);
        }
        if (string.equals("name")) {
            return aum_0.cWf().c("fakeGiftItemName", new Object[0]) + " x1";
        }
        if (string.equals("quantity")) {
            return 1;
        }
        if (string.equals("allowControls")) {
            return false;
        }
        return null;
    }

    @Override
    public boolean gV(boolean bl) {
        return false;
    }
}

