/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgN
 */
class cgn_0
implements aaq_2<cyb> {
    cgn_0() {
    }

    @Override
    public boolean a(cyb cyb2) {
        ezp_1 ezp_12 = cyb2.eFk();
        if (ezp_12 == null) {
            cgv_0.lTR.error((Object)"Message d'erreur de guilde inconnu !!!");
            return false;
        }
        String string = null;
        switch (ezp_12) {
            case rMP: {
                string = aum_0.cWf().c("error.guild.creation", new Object[0]);
                break;
            }
            case rMQ: {
                string = aum_0.cWf().c("error.guild.alreadyInGuild", new Object[0]);
                aue_0.cVJ().b(cva_1.eTu());
                break;
            }
            case rMT: {
                string = aum_0.cWf().c("group.error.unknown_user", new Object[0]);
                break;
            }
            case rMS: {
                string = aum_0.cWf().c("error.guild.creation.existingBlazon", new Object[0]);
                break;
            }
            case rMV: {
                string = aum_0.cWf().c("group.error.invitationPending", new Object[0]);
                break;
            }
            case rMU: {
                string = aum_0.cWf().c("guild.error.user.already.in.guild", new Object[0]);
                break;
            }
            case rMR: {
                string = aum_0.cWf().c("error.guild.creation.existingName", new Object[0]);
                break;
            }
            case rMO: {
                string = aum_0.cWf().c("error.guild.creation.invalidName", new Object[0]);
                break;
            }
            case rMY: {
                string = aum_0.cWf().c("guild.error.user.is.soul.avatar", new Object[0]);
                break;
            }
            case rMZ: {
                string = aum_0.cWf().c("guild.error.user.is.hero", new Object[0]);
            }
        }
        if (string == null) {
            cgv_0.lTR.error((Object)("Message d'erreur de guilde non trait\u00e9 : " + ezp_12.name()));
            return false;
        }
        aPh.czg().iY(string);
        if (cyb2.eFl()) {
            fiq_2.gCw().d(fik_2.gBZ().vE(string).vG(ccp_2.mRF.byf()).abQ(3));
        }
        return false;
    }

    @Override
    public int bkq() {
        return 15760;
    }
}

