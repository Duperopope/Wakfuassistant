/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cPT
 */
public class cpt_2
extends cpm_1 {
    @Override
    public cps_1 eLz() {
        return cps_1.njd;
    }

    @Override
    public void run() {
        bhJ bhJ2 = (bhJ)this.cqO;
        apa_0.jl(bhJ2.getName());
    }

    @Override
    public boolean isEnabled() {
        if (!super.isEnabled()) {
            return false;
        }
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null;
    }

    @Override
    public boolean bxO() {
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        return apd_0.cAO().cAQ().ii(bhJ2.Xi()) == null;
    }

    @Override
    public String ely() {
        return "addToFriendList";
    }

    @Override
    public String getLabel() {
        if (!(this.cqO instanceof bhJ)) {
            return null;
        }
        return aum_0.cWf().c("desc.mru." + this.ely(), ((bhJ)this.cqO).getName());
    }

    @Override
    public cpm_1 eLD() {
        return new cpt_2();
    }

    @Override
    protected int eLB() {
        return crc_2.nmF.nnW;
    }
}

