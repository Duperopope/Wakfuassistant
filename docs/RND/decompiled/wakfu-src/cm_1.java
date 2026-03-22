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
 * Renamed from cm
 */
class cm_1
extends AbstractParser<cl_2> {
    cm_1() {
    }

    public cl_2 bi(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cl_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bi(codedInputStream, extensionRegistryLite);
    }
}

