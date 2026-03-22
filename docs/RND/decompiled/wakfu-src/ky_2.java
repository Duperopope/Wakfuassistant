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
 * Renamed from ky
 */
class ky_2
extends AbstractParser<kx_2> {
    ky_2() {
    }

    public kx_2 gy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new kx_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gy(codedInputStream, extensionRegistryLite);
    }
}

