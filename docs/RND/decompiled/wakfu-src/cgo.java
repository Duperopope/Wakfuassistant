/*
 * Decompiled with CFR 0.152.
 */
final class cgo
extends ceK<cqs_0, bsi_0> {
    cgo() {
    }

    public boolean a(cqs_0 cqs_02) {
        String string;
        switch (cqs_02.aVT()) {
            case 3: {
                string = "fight.invitation.cancel.anotherInvitation";
                break;
            }
            case 7: {
                string = "fight.invitation.cancel.fightCreationImpossible";
                break;
            }
            case 4: {
                string = "fight.invitation.cancel.initiatorCancelled";
                break;
            }
            case 6: {
                string = "fight.invitation.cancel.initiatorNotAvailable";
                break;
            }
            case 5: {
                string = "fight.invitation.cancel.noPendingFight";
                break;
            }
            case 2: {
                string = "fight.invitation.cancel.playerNotFound";
                break;
            }
            case 1: {
                string = "fight.invitation.cancel.playerRefused";
                break;
            }
            case 0: {
                string = "fight.invitation.cancel.unknownError";
                break;
            }
            default: {
                return false;
            }
        }
        aPd.e(string, new Object[0]);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqs_0)aam_22);
    }
}

