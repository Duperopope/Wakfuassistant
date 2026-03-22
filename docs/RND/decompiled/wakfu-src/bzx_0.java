/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzx
 */
public class bzx_0
extends ayw_2<bCA> {
    public static ayv_2 bmq = new ayv_2(new bzy_0());

    public bCA dNo() {
        bzw bzw2;
        try {
            bzw2 = (bzw)bmq.borrowObject();
            bzw.a(bzw2, bmq);
        }
        catch (Exception exception) {
            bzw.jDU.error((Object)"Erreur lors de l'extraction d'une EnchantmentMachine du pool", (Throwable)exception);
            bzw2 = new bzw();
        }
        return bzw2;
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

