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
 * Renamed from hE
 */
class he_0
extends AbstractParser<hd_0> {
    he_0() {
    }

    public hd_0 ex(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new hd_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ex(codedInputStream, extensionRegistryLite);
    }
}

