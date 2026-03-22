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
 * Renamed from aK
 */
class ak_2
extends AbstractParser<aj_2> {
    ak_2() {
    }

    public aj_2 aa(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new aj_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aa(codedInputStream, extensionRegistryLite);
    }
}

