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
 * Renamed from fV
 */
class fv_1
extends AbstractParser<fu_1> {
    fv_1() {
    }

    public fu_1 dy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new fu_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dy(codedInputStream, extensionRegistryLite);
    }
}

