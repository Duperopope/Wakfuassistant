/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from kk
 */
class kk_0
extends AbstractParser<kj_0> {
    kk_0() {
    }

    public kj_0 gp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new kj_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gp(codedInputStream, extensionRegistryLite);
    }
}

