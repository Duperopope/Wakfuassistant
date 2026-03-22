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
 * Renamed from kh
 */
class kh_0
extends AbstractParser<kg_0> {
    kh_0() {
    }

    public kg_0 gm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new kg_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gm(codedInputStream, extensionRegistryLite);
    }
}

