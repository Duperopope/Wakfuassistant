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

public final class ot
extends GeneratedMessageV3
implements ow {
    private static final long QO = 0L;
    int an;
    public static final int QP = 1;
    long nW;
    public static final int QQ = 2;
    ol QR;
    private byte Y = (byte)-1;
    private static final ot QS = new ot();
    @Deprecated
    public static final Parser<ot> QT = new ou();

    ot(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ot() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ot();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ot(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.nW = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        on on2 = null;
                        if ((this.an & 2) != 0) {
                            on2 = this.QR.avc();
                        }
                        this.QR = (ol)codedInputStream.readMessage(ol.QF, extensionRegistryLite);
                        if (on2 != null) {
                            on2.c(this.QR);
                            this.QR = on2.avi();
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

    public static final Descriptors.Descriptor avF() {
        return ok.Qv;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ok.Qw.ensureFieldAccessorsInitialized(ot.class, ov.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean ajw() {
        return (this.an & 2) != 0;
    }

    @Override
    public ol avG() {
        return this.QR == null ? ol.avd() : this.QR;
    }

    @Override
    public os avH() {
        return this.QR == null ? ol.avd() : this.QR;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (this.ajw() && !this.avG().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.nW);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.avG());
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.nW);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.avG());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ot)) {
            return super.equals(object);
        }
        ot ot2 = (ot)object;
        if (this.xk() != ot2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != ot2.xl()) {
            return false;
        }
        if (this.ajw() != ot2.ajw()) {
            return false;
        }
        if (this.ajw() && !this.avG().equals(ot2.avG())) {
            return false;
        }
        return this.unknownFields.equals((Object)ot2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ot.avF().hashCode();
        if (this.xk()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.ajw()) {
            n = 37 * n + 2;
            n = 53 * n + this.avG().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ot cv(ByteBuffer byteBuffer) {
        return (ot)QT.parseFrom(byteBuffer);
    }

    public static ot cr(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ot)QT.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ot dS(ByteString byteString) {
        return (ot)QT.parseFrom(byteString);
    }

    public static ot cr(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ot)QT.parseFrom(byteString, extensionRegistryLite);
    }

    public static ot ct(byte[] byArray) {
        return (ot)QT.parseFrom(byArray);
    }

    public static ot cr(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ot)QT.parseFrom(byArray, extensionRegistryLite);
    }

    public static ot fI(InputStream inputStream) {
        return (ot)GeneratedMessageV3.parseWithIOException(QT, (InputStream)inputStream);
    }

    public static ot fI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ot)GeneratedMessageV3.parseWithIOException(QT, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ot fJ(InputStream inputStream) {
        return (ot)GeneratedMessageV3.parseDelimitedWithIOException(QT, (InputStream)inputStream);
    }

    public static ot fJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ot)GeneratedMessageV3.parseDelimitedWithIOException(QT, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ot cr(CodedInputStream codedInputStream) {
        return (ot)GeneratedMessageV3.parseWithIOException(QT, (CodedInputStream)codedInputStream);
    }

    public static ot iZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ot)GeneratedMessageV3.parseWithIOException(QT, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ov avI() {
        return ot.avJ();
    }

    public static ov avJ() {
        return QS.avK();
    }

    public static ov a(ot ot2) {
        return QS.avK().c(ot2);
    }

    public ov avK() {
        return this == QS ? new ov() : new ov().c(this);
    }

    protected ov cr(GeneratedMessageV3.BuilderParent builderParent) {
        ov ov2 = new ov(builderParent);
        return ov2;
    }

    public static ot avL() {
        return QS;
    }

    public static Parser<ot> z() {
        return QT;
    }

    public Parser<ot> getParserForType() {
        return QT;
    }

    public ot avM() {
        return QS;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cr(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.avK();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.avI();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.avK();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.avI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.avM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.avM();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ot ot2) {
        return ot2.unknownFields;
    }
}

