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
 * Renamed from AK
 */
class ak_0
extends AbstractParser<aj_0> {
    ak_0() {
    }

    public aj_0 kr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new aj_0(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.kr(codedInputStream, extensionRegistryLite);
    }
}

