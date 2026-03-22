/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from hD
 */
public final class hd_0
extends GeneratedMessageV3
implements hg_0 {
    private static final long vw = 0L;
    int an;
    public static final int vx = 1;
    int dL;
    private byte Y = (byte)-1;
    private static final hd_0 vy = new hd_0();
    @Deprecated
    public static final Parser<hd_0> vz = new he_0();

    hd_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hd_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hd_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hd_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.an |= 1;
                        this.dL = codedInputStream.readInt32();
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor JH() {
        return hc_0.vs;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hc_0.vt.ensureFieldAccessorsInitialized(hd_0.class, hf_0.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public int d() {
        return this.dL;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.dL);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dL);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hd_0)) {
            return super.equals(object);
        }
        hd_0 hd_02 = (hd_0)object;
        if (this.oN() != hd_02.oN()) {
            return false;
        }
        if (this.oN() && this.d() != hd_02.d()) {
            return false;
        }
        return this.unknownFields.equals((Object)hd_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hd_0.JH().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + this.d();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hd_0 aU(ByteBuffer byteBuffer) {
        return (hd_0)vz.parseFrom(byteBuffer);
    }

    public static hd_0 aQ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_0)vz.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hd_0 bL(ByteString byteString) {
        return (hd_0)vz.parseFrom(byteString);
    }

    public static hd_0 aQ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_0)vz.parseFrom(byteString, extensionRegistryLite);
    }

    public static hd_0 aR(byte[] byArray) {
        return (hd_0)vz.parseFrom(byArray);
    }

    public static hd_0 aQ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_0)vz.parseFrom(byArray, extensionRegistryLite);
    }

    public static hd_0 cG(InputStream inputStream) {
        return (hd_0)GeneratedMessageV3.parseWithIOException(vz, (InputStream)inputStream);
    }

    public static hd_0 cG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_0)GeneratedMessageV3.parseWithIOException(vz, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hd_0 cH(InputStream inputStream) {
        return (hd_0)GeneratedMessageV3.parseDelimitedWithIOException(vz, (InputStream)inputStream);
    }

    public static hd_0 cH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_0)GeneratedMessageV3.parseDelimitedWithIOException(vz, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hd_0 aQ(CodedInputStream codedInputStream) {
        return (hd_0)GeneratedMessageV3.parseWithIOException(vz, (CodedInputStream)codedInputStream);
    }

    public static hd_0 ew(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_0)GeneratedMessageV3.parseWithIOException(vz, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hf_0 JI() {
        return hd_0.JJ();
    }

    public static hf_0 JJ() {
        return vy.JK();
    }

    public static hf_0 a(hd_0 hd_02) {
        return vy.JK().c(hd_02);
    }

    public hf_0 JK() {
        return this == vy ? new hf_0() : new hf_0().c(this);
    }

    protected hf_0 aQ(GeneratedMessageV3.BuilderParent builderParent) {
        hf_0 hf_02 = new hf_0(builderParent);
        return hf_02;
    }

    public static hd_0 JL() {
        return vy;
    }

    public static Parser<hd_0> z() {
        return vz;
    }

    public Parser<hd_0> getParserForType() {
        return vz;
    }

    public hd_0 JM() {
        return vy;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aQ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.JK();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.JI();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.JK();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.JI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.JM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.JM();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hd_0 hd_02) {
        return hd_02.unknownFields;
    }
}

