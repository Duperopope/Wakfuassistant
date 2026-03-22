/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from se
 */
class se_2
extends fi_1 {
    final /* synthetic */ sd_1 XW;

    se_2(sd_1 sd_12) {
        this.XW = sd_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.XW.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedShortcutInventories");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedShortcutInventories", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.XW.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedShortcutInventories");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedShortcutInventories", exception);
        }
    }

    @Override
    public int zt() {
        return this.XW.DN();
    }
}

