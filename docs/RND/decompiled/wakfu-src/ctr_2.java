/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTr
 */
class ctr_2
implements alx_2 {
    ctr_2(ctq_1 ctq_12) {
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("inventoryDialog") || string.equals("freeCollectMachineDialog") || string.equals("lockedCollectMachineDialog") && aue_0.cVJ().c(ctq_1.ePB())) {
            aue_0.cVJ().b(ctq_1.ePB());
        }
    }
}

