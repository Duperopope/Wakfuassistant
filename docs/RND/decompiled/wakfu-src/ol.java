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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ol
extends GeneratedMessageV3
implements os {
    private static final long QB = 0L;
    public static final int QC = 1;
    List<oo> QD;
    private byte Y = (byte)-1;
    private static final ol QE = new ol();
    @Deprecated
    public static final Parser<ol> QF = new om();

    ol(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ol() {
        this.QD = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ol();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ol(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        if (!(bl & true)) {
                            this.QD = new ArrayList<oo>();
                            bl |= true;
                        }
                        this.QD.add((oo)codedInputStream.readMessage(oo.QN, extensionRegistryLite));
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
            if (bl & true) {
                this.QD = Collections.unmodifiableList(this.QD);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor auW() {
        return ok.Qx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ok.Qy.ensureFieldAccessorsInitialized(ol.class, on.class);
    }

    @Override
    public List<oo> auXX() {
        return this.QD;
    }

    @Override
    public List<? extends or> auY() {
        return this.QD;
    }

    @Override
    public int auZ() {
        return this.QD.size();
    }

    @Override
    public oo jP(int n) {
        return this.QD.get(n);
    }

    @Override
    public or jQ(int n) {
        return this.QD.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.auZ(); ++i) {
            if (this.jP(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.QD.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.QD.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.QD.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.QD.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ol)) {
            return super.equals(object);
        }
        ol ol2 = (ol)object;
        if (!this.auXX().equals(ol2.auXX())) {
            return false;
        }
        return this.unknownFields.equals((Object)ol2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ol.auW().hashCode();
        if (this.auZ() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.auXX().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ol ct(ByteBuffer byteBuffer) {
        return (ol)QF.parseFrom(byteBuffer);
    }

    public static ol cp(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ol)QF.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ol dQ(ByteString byteString) {
        return (ol)QF.parseFrom(byteString);
    }

    public static ol cp(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ol)QF.parseFrom(byteString, extensionRegistryLite);
    }

    public static ol cr(byte[] byArray) {
        return (ol)QF.parseFrom(byArray);
    }

    public static ol cp(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ol)QF.parseFrom(byArray, extensionRegistryLite);
    }

    public static ol fE(InputStream inputStream) {
        return (ol)GeneratedMessageV3.parseWithIOException(QF, (InputStream)inputStream);
    }

    public static ol fE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ol)GeneratedMessageV3.parseWithIOException(QF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ol fF(InputStream inputStream) {
        return (ol)GeneratedMessageV3.parseDelimitedWithIOException(QF, (InputStream)inputStream);
    }

    public static ol fF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ol)GeneratedMessageV3.parseDelimitedWithIOException(QF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ol cp(CodedInputStream codedInputStream) {
        return (ol)GeneratedMessageV3.parseWithIOException(QF, (CodedInputStream)codedInputStream);
    }

    public static ol iT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ol)GeneratedMessageV3.parseWithIOException(QF, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public on ava() {
        return ol.avb();
    }

    public static on avb() {
        return QE.avc();
    }

    public static on a(ol ol2) {
        return QE.avc().c(ol2);
    }

    public on avc() {
        return this == QE ? new on() : new on().c(this);
    }

    protected on cp(GeneratedMessageV3.BuilderParent builderParent) {
        on on2 = new on(builderParent);
        return on2;
    }

    public static ol avd() {
        return QE;
    }

    public static Parser<ol> z() {
        return QF;
    }

    public Parser<ol> getParserForType() {
        return QF;
    }

    public ol ave() {
        return QE;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cp(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.avc();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ava();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.avc();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ava();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ave();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ave();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ol ol2) {
        return ol2.unknownFields;
    }
}

