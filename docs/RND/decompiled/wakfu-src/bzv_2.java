/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZV
 */
public class bzv_2
extends bzu_2 {
    @Override
    protected long HP() {
        faa_0 faa_02 = this.eqJ();
        if (faa_02 == null) {
            return 0L;
        }
        return faa_02.HP();
    }

    protected faa_0 eqJ() {
        if (!caf_2.lFq.eqR()) {
            lFg.error((Object)"Doit \u00eatre plac\u00e9 dans un havre monde!!!");
            return null;
        }
        return caf_2.lFq.eqJ();
    }
}

