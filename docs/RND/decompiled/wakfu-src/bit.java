/*
 * Decompiled with CFR 0.152.
 */
class bit
implements evf_1 {
    private final bgt_0 ikA;

    bit(bgt_0 bgt_02) {
        this.ikA = bgt_02;
    }

    @Override
    public void a(evt_1 evt_12, evt_1 evt_13) {
        fia_0 fia_02 = this.ikA.dmD();
        if (fia_02 != null) {
            if (this.ikA.a(evv_1.oxg)) {
                fia_02.VO(-1);
            } else if (!fia_02.VP(-1)) {
                fia_02.a(new fid_0(fiz_0.ssq));
            }
        }
        this.ikA.dlG().dlH();
    }
}

