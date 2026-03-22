/*
 * Decompiled with CFR 0.152.
 */
public class bzX
extends ayw_2<bCA> {
    public static final ayv_2 jEE = new ayv_2(new bzY());

    public bCA dNo() {
        bzV bzV2;
        try {
            bzV2 = (bzV)jEE.borrowObject();
            bzV.a(bzV2, jEE);
        }
        catch (Exception exception) {
            bzV.jEB.error((Object)"Erreur lors de l'extraction d'une GuildMachine du pool", (Throwable)exception);
            bzV2 = new bzV();
        }
        return bzV2;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dNo();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dNo();
    }
}

