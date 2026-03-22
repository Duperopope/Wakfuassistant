/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cRc
 */
public class crc_1
extends cqf_1 {
    @Override
    public boolean isEnabled() {
        Optional optional = bbs_2.a(eva_1.owx);
        if (optional.isPresent() && ((fpQ)optional.get()).ghp() != null) {
            this.qa(aum_0.cWf().c("pvp.change.state.mru.action.already.pending", new Object[0]));
            return false;
        }
        return true;
    }

    @Override
    public String ely() {
        return "pvp.change.state.mru.action";
    }

    @Override
    protected int eLB() {
        return crc_2.nmA.nnW;
    }

    @Override
    public cpm_1 eLD() {
        return new crc_1();
    }

    @Override
    protected rw_0 eLF() {
        return rw_0.bkJ;
    }
}

