/*
 * Decompiled with CFR 0.152.
 */
public class bzE
extends ayw_2<bCA> {
    public static final ayv_2 jEf = new ayv_2(new bzf_0());

    public bCA dNo() {
        bzD bzD2;
        try {
            bzD2 = (bzD)jEf.borrowObject();
            bzD.a(bzD2, jEf);
        }
        catch (Exception exception) {
            bzD.jEd.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bzD2 = new bzD();
        }
        return bzD2;
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

