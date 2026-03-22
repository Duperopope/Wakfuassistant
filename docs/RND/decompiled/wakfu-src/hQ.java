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

public final class hQ
extends GeneratedMessageV3
implements hT {
    private static final long vY = 0L;
    public static final int vZ = 1;
    List<kW> jj;
    private byte Y = (byte)-1;
    private static final hQ wa = new hQ();
    @Deprecated
    public static final Parser<hQ> wb = new hR();

    hQ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hQ() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hQ();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hQ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.jj = new ArrayList<kW>();
                            bl |= true;
                        }
                        this.jj.add((kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite));
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
                this.jj = Collections.unmodifiableList(this.jj);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor KF() {
        return hL.vQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vR.ensureFieldAccessorsInitialized(hQ.class, hS.class);
    }

    @Override
    public List<kW> ot() {
        return this.jj;
    }

    @Override
    public List<? extends lh> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public kW dW(int n) {
        return this.jj.get(n);
    }

    @Override
    public lh dX(int n) {
        return this.jj.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.dW(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.jj.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.jj.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.jj.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.jj.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hQ)) {
            return super.equals(object);
        }
        hQ hQ2 = (hQ)object;
        if (!this.ot().equals(hQ2.ot())) {
            return false;
        }
        return this.unknownFields.equals((Object)hQ2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hQ.KF().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hQ aX(ByteBuffer byteBuffer) {
        return (hQ)wb.parseFrom(byteBuffer);
    }

    public static hQ aT(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hQ)wb.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hQ bO(ByteString byteString) {
        return (hQ)wb.parseFrom(byteString);
    }

    public static hQ aT(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hQ)wb.parseFrom(byteString, extensionRegistryLite);
    }

    public static hQ aU(byte[] byArray) {
        return (hQ)wb.parseFrom(byArray);
    }

    public static hQ aT(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hQ)wb.parseFrom(byArray, extensionRegistryLite);
    }

    public static hQ cM(InputStream inputStream) {
        return (hQ)GeneratedMessageV3.parseWithIOException(wb, (InputStream)inputStream);
    }

    public static hQ cM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hQ)GeneratedMessageV3.parseWithIOException(wb, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hQ cN(InputStream inputStream) {
        return (hQ)GeneratedMessageV3.parseDelimitedWithIOException(wb, (InputStream)inputStream);
    }

    public static hQ cN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hQ)GeneratedMessageV3.parseDelimitedWithIOException(wb, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hQ aT(CodedInputStream codedInputStream) {
        return (hQ)GeneratedMessageV3.parseWithIOException(wb, (CodedInputStream)codedInputStream);
    }

    public static hQ eF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hQ)GeneratedMessageV3.parseWithIOException(wb, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hS KG() {
        return hQ.KH();
    }

    public static hS KH() {
        return wa.KI();
    }

    public static hS a(hQ hQ2) {
        return wa.KI().c(hQ2);
    }

    public hS KI() {
        return this == wa ? new hS() : new hS().c(this);
    }

    protected hS aT(GeneratedMessageV3.BuilderParent builderParent) {
        hS hS2 = new hS(builderParent);
        return hS2;
    }

    public static hQ KJ() {
        return wa;
    }

    public static Parser<hQ> z() {
        return wb;
    }

    public Parser<hQ> getParserForType() {
        return wb;
    }

    public hQ KK() {
        return wa;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aT(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.KI();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.KG();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.KI();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.KG();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.KK();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.KK();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hQ hQ2) {
        return hQ2.unknownFields;
    }
}

