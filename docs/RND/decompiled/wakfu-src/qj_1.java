/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qJ
 */
class qj_1
extends fi_1 {
    final /* synthetic */ qi_2 Vq;

    qj_1(qi_2 qi_22) {
        this.Vq = qi_22;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        try {
            boolean bl = this.Vq.aF(byteBuffer);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la s\u00e9rialisation de CharacterSerializedNationCitizenScore");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la s\u00e9rialisation de CharacterSerializedNationCitizenScore", exception);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        try {
            boolean bl = this.Vq.b(byteBuffer, n);
            if (bl) {
                this.zq();
            } else {
                this.D("Erreur lors de la d\u00e9s\u00e9rialisation de CharacterSerializedNationCitizenScore");
            }
        }
        catch (Exception exception) {
            this.a("Exception lev\u00e9e lors de la d\u00e9s\u00e9rialisation de CharacterSerializedNationCitizenScore", exception);
        }
    }

    @Override
    public int zt() {
        return this.Vq.DN();
    }
}

