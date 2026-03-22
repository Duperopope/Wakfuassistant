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
 * Renamed from gZ
 */
public final class gz_0
extends GeneratedMessageV3
implements hc_1 {
    private static final long tG = 0L;
    int an;
    public static final int tH = 1;
    int nt;
    public static final int tI = 2;
    int tJ;
    private byte Y = (byte)-1;
    private static final gz_0 tK = new gz_0();
    @Deprecated
    public static final Parser<gz_0> tL = new ha_0();

    gz_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gz_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gz_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gz_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.nt = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.tJ = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor GL() {
        return gy_0.tE;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gy_0.tF.ensureFieldAccessorsInitialized(gz_0.class, hb_0.class);
    }

    @Override
    public boolean wo() {
        return (this.an & 1) != 0;
    }

    @Override
    public int wp() {
        return this.nt;
    }

    @Override
    public boolean GM() {
        return (this.an & 2) != 0;
    }

    @Override
    public int GN() {
        return this.tJ;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.wo()) {
            this.Y = 0;
            return false;
        }
        if (!this.GM()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.nt);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.tJ);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.nt);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.tJ);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gz_0)) {
            return super.equals(object);
        }
        gz_0 gz_02 = (gz_0)object;
        if (this.wo() != gz_02.wo()) {
            return false;
        }
        if (this.wo() && this.wp() != gz_02.wp()) {
            return false;
        }
        if (this.GM() != gz_02.GM()) {
            return false;
        }
        if (this.GM() && this.GN() != gz_02.GN()) {
            return false;
        }
        return this.unknownFields.equals((Object)gz_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gz_0.GL().hashCode();
        if (this.wo()) {
            n = 37 * n + 1;
            n = 53 * n + this.wp();
        }
        if (this.GM()) {
            n = 37 * n + 2;
            n = 53 * n + this.GN();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gz_0 aO(ByteBuffer byteBuffer) {
        return (gz_0)tL.parseFrom(byteBuffer);
    }

    public static gz_0 aK(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_0)tL.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gz_0 bD(ByteString byteString) {
        return (gz_0)tL.parseFrom(byteString);
    }

    public static gz_0 aK(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_0)tL.parseFrom(byteString, extensionRegistryLite);
    }

    public static gz_0 aL(byte[] byArray) {
        return (gz_0)tL.parseFrom(byArray);
    }

    public static gz_0 aK(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_0)tL.parseFrom(byArray, extensionRegistryLite);
    }

    public static gz_0 cu(InputStream inputStream) {
        return (gz_0)GeneratedMessageV3.parseWithIOException(tL, (InputStream)inputStream);
    }

    public static gz_0 cu(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_0)GeneratedMessageV3.parseWithIOException(tL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gz_0 cv(InputStream inputStream) {
        return (gz_0)GeneratedMessageV3.parseDelimitedWithIOException(tL, (InputStream)inputStream);
    }

    public static gz_0 cv(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_0)GeneratedMessageV3.parseDelimitedWithIOException(tL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gz_0 aK(CodedInputStream codedInputStream) {
        return (gz_0)GeneratedMessageV3.parseWithIOException(tL, (CodedInputStream)codedInputStream);
    }

    public static gz_0 ee(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_0)GeneratedMessageV3.parseWithIOException(tL, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hb_0 GO() {
        return gz_0.GP();
    }

    public static hb_0 GP() {
        return tK.GQ();
    }

    public static hb_0 a(gz_0 gz_02) {
        return tK.GQ().c(gz_02);
    }

    public hb_0 GQ() {
        return this == tK ? new hb_0() : new hb_0().c(this);
    }

    protected hb_0 aK(GeneratedMessageV3.BuilderParent builderParent) {
        hb_0 hb_02 = new hb_0(builderParent);
        return hb_02;
    }

    public static gz_0 GR() {
        return tK;
    }

    public static Parser<gz_0> z() {
        return tL;
    }

    public Parser<gz_0> getParserForType() {
        return tL;
    }

    public gz_0 GS() {
        return tK;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aK(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.GQ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.GO();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.GQ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.GO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.GS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.GS();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gz_0 gz_02) {
        return gz_02.unknownFields;
    }
}

