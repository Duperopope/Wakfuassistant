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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class kZ
extends GeneratedMessageV3
implements lc {
    private static final long HA = 0L;
    int an;
    public static final int HB = 1;
    int HC;
    public static final int HD = 2;
    boolean HE;
    private byte Y = (byte)-1;
    private static final kZ HF = new kZ();
    @Deprecated
    public static final Parser<kZ> HG = new la();

    kZ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kZ() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kZ();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.HC = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.HE = codedInputStream.readBool();
                        continue block12;
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

    public static final Descriptors.Descriptor aeT() {
        return kF.Gc;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gd.ensureFieldAccessorsInitialized(kZ.class, lb_0.class);
    }

    @Override
    public boolean aeU() {
        return (this.an & 1) != 0;
    }

    @Override
    public int aeV() {
        return this.HC;
    }

    @Override
    public boolean aeW() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean aeX() {
        return this.HE;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aeU()) {
            this.Y = 0;
            return false;
        }
        if (!this.aeW()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.HC);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(2, this.HE);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.HC);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.HE);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kZ)) {
            return super.equals(object);
        }
        kZ kZ2 = (kZ)object;
        if (this.aeU() != kZ2.aeU()) {
            return false;
        }
        if (this.aeU() && this.aeV() != kZ2.aeV()) {
            return false;
        }
        if (this.aeW() != kZ2.aeW()) {
            return false;
        }
        if (this.aeW() && this.aeX() != kZ2.aeX()) {
            return false;
        }
        return this.unknownFields.equals((Object)kZ2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kZ.aeT().hashCode();
        if (this.aeU()) {
            n = 37 * n + 1;
            n = 53 * n + this.aeV();
        }
        if (this.aeW()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.aeX());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kZ bK(ByteBuffer byteBuffer) {
        return (kZ)HG.parseFrom(byteBuffer);
    }

    public static kZ bG(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kZ)HG.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kZ cP(ByteString byteString) {
        return (kZ)HG.parseFrom(byteString);
    }

    public static kZ bG(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kZ)HG.parseFrom(byteString, extensionRegistryLite);
    }

    public static kZ bH(byte[] byArray) {
        return (kZ)HG.parseFrom(byArray);
    }

    public static kZ bG(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kZ)HG.parseFrom(byArray, extensionRegistryLite);
    }

    public static kZ em(InputStream inputStream) {
        return (kZ)GeneratedMessageV3.parseWithIOException(HG, (InputStream)inputStream);
    }

    public static kZ em(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kZ)GeneratedMessageV3.parseWithIOException(HG, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kZ en(InputStream inputStream) {
        return (kZ)GeneratedMessageV3.parseDelimitedWithIOException(HG, (InputStream)inputStream);
    }

    public static kZ en(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kZ)GeneratedMessageV3.parseDelimitedWithIOException(HG, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kZ bG(CodedInputStream codedInputStream) {
        return (kZ)GeneratedMessageV3.parseWithIOException(HG, (CodedInputStream)codedInputStream);
    }

    public static kZ gS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kZ)GeneratedMessageV3.parseWithIOException(HG, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lb_0 aeY() {
        return kZ.aeZ();
    }

    public static lb_0 aeZ() {
        return HF.afa();
    }

    public static lb_0 c(kZ kZ2) {
        return HF.afa().e(kZ2);
    }

    public lb_0 afa() {
        return this == HF ? new lb_0() : new lb_0().e(this);
    }

    protected lb_0 bG(GeneratedMessageV3.BuilderParent builderParent) {
        lb_0 lb_02 = new lb_0(builderParent);
        return lb_02;
    }

    public static kZ afb() {
        return HF;
    }

    public static Parser<kZ> z() {
        return HG;
    }

    public Parser<kZ> getParserForType() {
        return HG;
    }

    public kZ afc() {
        return HF;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bG(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.afa();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aeY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.afa();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aeY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.afc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.afc();
    }

    static /* synthetic */ boolean aq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(kZ kZ2) {
        return kZ2.unknownFields;
    }
}

