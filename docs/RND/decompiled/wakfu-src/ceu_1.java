/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEu
 */
class ceu_1
implements alx_2 {
    ceu_1() {
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!"ladderRewardsDialog".equals(string)) {
            return;
        }
        if (!aue_0.cVJ().c(cus_2.eRQ()) && !aue_0.cVJ().c(ctu_2.nJd)) {
            fyw_0.gqw().tc("wakfu.exchangeMachine");
        }
        fyw_0.gqw().b(this);
    }
}

