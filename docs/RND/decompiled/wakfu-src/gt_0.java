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

/*
 * Renamed from gT
 */
public final class gt_0
extends GeneratedMessageV3
implements gw_0 {
    private static final long tu = 0L;
    int an;
    public static final int tv = 1;
    long tw;
    public static final int tx = 2;
    gm_0 ty;
    private byte Y = (byte)-1;
    private static final gt_0 tz = new gt_0();
    @Deprecated
    public static final Parser<gt_0> tA = new gu_0();

    gt_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gt_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gt_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gt_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.tw = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        go_1 go_12 = null;
                        if ((this.an & 2) != 0) {
                            go_12 = this.ty.FF();
                        }
                        this.ty = (gm_0)codedInputStream.readMessage(gm_0.tn, extensionRegistryLite);
                        if (go_12 != null) {
                            go_12.c(this.ty);
                            this.ty = go_12.FO();
                        }
                        this.an |= 2;
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

    public static final Descriptors.Descriptor Gs() {
        return gl_0.sU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gl_0.sV.ensureFieldAccessorsInitialized(gt_0.class, gv_0.class);
    }

    @Override
    public boolean wo() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Gt() {
        return this.tw;
    }

    @Override
    public boolean Gu() {
        return (this.an & 2) != 0;
    }

    @Override
    public gm_0 Gv() {
        return this.ty == null ? gm_0.FG() : this.ty;
    }

    @Override
    public gp_1 Gw() {
        return this.ty == null ? gm_0.FG() : this.ty;
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
        if (!this.Gu()) {
            this.Y = 0;
            return false;
        }
        if (!this.Gv().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.tw);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.Gv());
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.tw);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.Gv());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gt_0)) {
            return super.equals(object);
        }
        gt_0 gt_02 = (gt_0)object;
        if (this.wo() != gt_02.wo()) {
            return false;
        }
        if (this.wo() && this.Gt() != gt_02.Gt()) {
            return false;
        }
        if (this.Gu() != gt_02.Gu()) {
            return false;
        }
        if (this.Gu() && !this.Gv().equals(gt_02.Gv())) {
            return false;
        }
        return this.unknownFields.equals((Object)gt_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gt_0.Gs().hashCode();
        if (this.wo()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Gt());
        }
        if (this.Gu()) {
            n = 37 * n + 2;
            n = 53 * n + this.Gv().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gt_0 aN(ByteBuffer byteBuffer) {
        return (gt_0)tA.parseFrom(byteBuffer);
    }

    public static gt_0 aJ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gt_0)tA.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gt_0 bC(ByteString byteString) {
        return (gt_0)tA.parseFrom(byteString);
    }

    public static gt_0 aJ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gt_0)tA.parseFrom(byteString, extensionRegistryLite);
    }

    public static gt_0 aK(byte[] byArray) {
        return (gt_0)tA.parseFrom(byArray);
    }

    public static gt_0 aJ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gt_0)tA.parseFrom(byArray, extensionRegistryLite);
    }

    public static gt_0 cs(InputStream inputStream) {
        return (gt_0)GeneratedMessageV3.parseWithIOException(tA, (InputStream)inputStream);
    }

    public static gt_0 cs(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gt_0)GeneratedMessageV3.parseWithIOException(tA, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gt_0 ct(InputStream inputStream) {
        return (gt_0)GeneratedMessageV3.parseDelimitedWithIOException(tA, (InputStream)inputStream);
    }

    public static gt_0 ct(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gt_0)GeneratedMessageV3.parseDelimitedWithIOException(tA, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gt_0 aJ(CodedInputStream codedInputStream) {
        return (gt_0)GeneratedMessageV3.parseWithIOException(tA, (CodedInputStream)codedInputStream);
    }

    public static gt_0 eb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gt_0)GeneratedMessageV3.parseWithIOException(tA, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gv_0 Gx() {
        return gt_0.Gy();
    }

    public static gv_0 Gy() {
        return tz.Gz();
    }

    public static gv_0 b(gt_0 gt_02) {
        return tz.Gz().d(gt_02);
    }

    public gv_0 Gz() {
        return this == tz ? new gv_0() : new gv_0().d(this);
    }

    protected gv_0 aJ(GeneratedMessageV3.BuilderParent builderParent) {
        gv_0 gv_02 = new gv_0(builderParent);
        return gv_02;
    }

    public static gt_0 GA() {
        return tz;
    }

    public static Parser<gt_0> z() {
        return tA;
    }

    public Parser<gt_0> getParserForType() {
        return tA;
    }

    public gt_0 GB() {
        return tz;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aJ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Gz();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Gx();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Gz();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Gx();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.GB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.GB();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(gt_0 gt_02) {
        return gt_02.unknownFields;
    }
}

