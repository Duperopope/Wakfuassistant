/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

class bxK
extends fi_1 {
    final /* synthetic */ bxJ jBN;

    bxK(bxJ bxJ2) {
        this.jBN = bxJ2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("La synchronisation du contenu de l'objet est faite depuis le serveur => par de s\u00e9rialisation");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        te_2 te_22 = new te_2();
        te_22.aG(byteBuffer);
        ArrayList<tf_2> arrayList = te_22.ZW;
        this.jBN.jBK = new int[arrayList.size()];
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            this.jBN.jBK[i] = arrayList.get((int)i).ZX;
        }
        this.jBN.dNN();
    }
}

