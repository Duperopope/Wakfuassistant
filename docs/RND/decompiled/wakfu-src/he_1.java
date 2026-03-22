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
 * Renamed from he
 */
class he_1
extends AbstractParser<hd_1> {
    he_1() {
    }

    public hd_1 ei(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new hd_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ei(codedInputStream, extensionRegistryLite);
    }
}

