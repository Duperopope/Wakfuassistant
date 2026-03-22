/*
 * Decompiled with CFR 0.152.
 */
public class bal
implements afl {
    public void a(WL wL) {
        eKQ.qEb.q(eKW2 -> eKW2.dxi().forEach(eKR2 -> {
            if (eKQ.qEb.QV(eKR2.cms()).cmx()) {
                return;
            }
            if (!eKR2.c(eKS.qEv)) {
                return;
            }
            eKK.fyJ().i((eKR)eKR2);
        }));
        wL.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.secureCraftRecipe", new Object[0]);
    }
}

