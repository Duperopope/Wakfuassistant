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
 * Renamed from zv
 */
class zv_2
extends AbstractParser<zu_2> {
    zv_2() {
    }

    public zu_2 jy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zu_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jy(codedInputStream, extensionRegistryLite);
    }
}

